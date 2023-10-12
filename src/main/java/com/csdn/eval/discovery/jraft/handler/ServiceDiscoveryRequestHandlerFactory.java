package com.csdn.eval.discovery.jraft.handler;

import com.alipay.sofa.jraft.Status;
import com.csdn.eval.discovery.jraft.Kind;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryOperation;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import com.csdn.eval.discovery.jraft.processor.GetServiceInstancesRequestRpcProcessor;
import com.csdn.eval.discovery.jraft.processor.RpcProcessorService;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 16:18
 * @Description: 服务消息处理者工厂(todo : 包含服务实例存储功能 ， 后面可以拆分成两个类)
 * @Version: 1.0
 */
public class ServiceDiscoveryRequestHandlerFactory {

  private static final Logger logger = LoggerFactory
      .getLogger(ServiceDiscoveryRequestHandlerFactory.class);

  /**
   * 服务超过30s没有心跳，视为自动下线
   */
  private final int expired = 30;

  private final Object monitor = new Object();

  /**
   * 服务名称与服务实例列表（List）映射 serverName:<serverId:instance>,使用 serverId 来做去重
   */
  private final Map<String, Map<String, ServiceInstance>> serviceNameToInstancesStorage = new ConcurrentHashMap<>();

  /**
   * 服务名称与服务实例列表（List+心跳时间）映射 serverName:<serverId:now>
   */
  private final Map<String, Map<String, Instant>> serviceNameToInstantsMap = new ConcurrentHashMap<>();

  private final Map<Kind, ServiceDiscoveryRequestHandler> handlers = new HashMap<>();

  private static ServiceDiscoveryRequestHandlerFactory instance = new ServiceDiscoveryRequestHandlerFactory();

  private RpcProcessorService rpcProcessorService;

  public void init() {
    handlers.put(Kind.REGISTRATION, new RegistrationRequestHandler(instance));
    handlers.put(Kind.DEREGISTRATION, new DeRegistrationRequestHandler(instance));
    handlers.put(Kind.GET_SERVICE_INSTANCES, new GetServiceInstancesRequestHandler(instance));
    handlers.put(Kind.BEAT, new HeartBeatRequestHandler(instance));
  }

  public static ServiceDiscoveryRequestHandlerFactory getInstance() {
    return instance;
  }

  public ServiceDiscoveryRequestHandler getHandler(Kind kind) {
    return handlers.get(kind);
  }

  public synchronized void storage(String id, String serviceName, ServiceInstance serviceInstance) {
    Map<String, ServiceInstance> serviceInstancesMap = serviceNameToInstancesStorage
        .computeIfAbsent(serviceName, n -> new LinkedHashMap<>());
    serviceInstancesMap.put(id, serviceInstance);
    print();
  }

  public synchronized void delete(String id, String serviceName) {
    Map<String, ServiceInstance> instanceMap = getServiceInstancesMap(serviceName);
    instanceMap.remove(id);
  }

  public Map<String, ServiceInstance> getServiceInstancesMap(String serviceName) {
    return serviceNameToInstancesStorage.computeIfAbsent(serviceName, n -> new LinkedHashMap<>());
  }

  private void print() {
    serviceNameToInstancesStorage.forEach((k, v) -> {
      logger.info(" key :{}", k);
      v.forEach((nk, nv) -> {
        logger.info(" n_key :{} + n_value:{}", nk, nv);
      });
    });
  }

  public void onBeat(ServiceInstance serviceInstance) {
    String serviceName = serviceInstance.getServiceName();
    String id = serviceInstance.getId();
    synchronized (monitor) {
      Map<String, ServiceInstance> serviceInstancesMap = serviceNameToInstancesStorage
          .computeIfAbsent(serviceName, n -> new LinkedHashMap<>());
      if (!serviceInstancesMap.containsKey(id)) {
        //无效心跳请求
        logger.info("{} beat is invalid", serviceInstance);
        return;
      }
      Map<String, Instant> instantMap = serviceNameToInstantsMap
          .computeIfAbsent(serviceName, n -> new LinkedHashMap<>());
      // 续约
      instantMap.put(id, Instant.now());
    }
  }

  public void checkBeat() {
    final Instant now = Instant.now();
    synchronized (monitor) {
      // 遍历所有服务实例集合
      for (Map.Entry<String, Map<String, ServiceInstance>> serviceInstanceMap : this.serviceNameToInstancesStorage
          .entrySet()) {
        String serviceName = serviceInstanceMap.getKey();
        // 获取当前服务实例对应的服务续约时间集合
        Map<String, Instant> instantMap = this.serviceNameToInstantsMap.get(serviceName);
        if (CollectionUtils.isEmpty(instantMap)) {
          // 移除当前服务的所有实例
          serviceInstanceMap.getValue().clear();
          continue;
        }
        for (Map.Entry<String, Instant> instantService : instantMap.entrySet()) {
          if (instantService.getValue().plus(expired, ChronoUnit.SECONDS).isBefore(now)) {
            //超过30s没有收到心跳
            logger.info(
                "The current instance [{}] has not received a heartbeat request for more than 30 seconds",
                instantService);
            removeInstance(serviceName, instantService.getKey());
          }
        }
      }
    }
  }

  private void removeInstance(String serviceName, String id) {
    Map<String, ServiceInstance> serviceInstancesMap = getServiceInstancesMap(serviceName);
    ServiceInstance serviceInstance = serviceInstancesMap.get(id);
    if (null != serviceInstance) {
      // 发送注销消息同步到followers
      logger.info("send DeRegistration {}", serviceInstance);
      sendDeRegistrationRpc(serviceInstance);
    }
  }

  private void sendDeRegistrationRpc(ServiceInstance serviceInstance) {
    String serviceName = serviceInstance.getServiceName();

    final Kind kind = Kind.DEREGISTRATION;

    ServiceDiscoveryOperation op = new ServiceDiscoveryOperation(kind, serviceInstance);

    final ServiceDiscoveryClosure closure = new ServiceDiscoveryClosure(op) {
      @Override
      public void run(Status status) {
        if (!status.isOk()) {
          logger.warn("Closure status is : {} at the {}", status, rpcProcessorService.getNode());
          return;
        }
        logger.info("'{}' has been handled ,serviceName : '{}' , result : {} , status : {}",
            kind, serviceName, getResult(), status);
      }
    };

    this.rpcProcessorService.applyOperation(closure);
  }

  public void setRpcProcessorService(RpcProcessorService rpcProcessorService) {
    this.rpcProcessorService = rpcProcessorService;
  }
}
