package com.csdn.eval.discovery.jraft.handler;

import com.csdn.eval.discovery.jraft.Kind;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import com.csdn.eval.discovery.jraft.processor.GetServiceInstancesRequestRpcProcessor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
   * 服务名称与服务实例列表（List）映射 serverName:<serverId:instance>,使用 serverId 来做去重
   */
  private final Map<String, Map<String, ServiceInstance>> serviceNameToInstancesStorage = new ConcurrentHashMap<>();

  private final Map<Kind, ServiceDiscoveryRequestHandler> handlers = new HashMap<>();

  private static ServiceDiscoveryRequestHandlerFactory instance = new ServiceDiscoveryRequestHandlerFactory();

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

}
