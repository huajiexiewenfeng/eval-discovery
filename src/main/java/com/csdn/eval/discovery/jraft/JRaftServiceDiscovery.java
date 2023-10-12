package com.csdn.eval.discovery.jraft;

import com.csdn.eval.discovery.ServiceDiscovery;
import com.csdn.eval.discovery.jraft.beat.ServiceDiscoveryHeartBeatThread;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.GetServiceInstancesRequest;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.Registration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/10/11 14:07
 * @Description: 基于 JRaft 实现服务注册发现
 * @Version: 1.0
 */
public class JRaftServiceDiscovery implements ServiceDiscovery {

  public static final String GROUP_ID_PROPERTY_NAME = "service.discovery.jraft.registry.group-id";

  public static final String DEFAULT_GROUP_ID_PROPERTY_VALUE = "service-discovery";

  public static final String REGISTRY_ADDRESS_PROPERTY_NAME = "service.discovery.jraft.registry.address";

  private static final Logger logger = LoggerFactory
      .getLogger(JRaftServiceDiscovery.class);

  private ServiceDiscoveryClient serviceDiscoveryClient;

  @Override
  public void initialize(Map<String, Object> config) {
    String groupId = (String) config
        .getOrDefault(GROUP_ID_PROPERTY_NAME, DEFAULT_GROUP_ID_PROPERTY_VALUE);
    String registryAddress = (String) config.get(REGISTRY_ADDRESS_PROPERTY_NAME);
    ServiceDiscoveryClient client = new ServiceDiscoveryClient(groupId, registryAddress);
    client.init();
    this.serviceDiscoveryClient = client;
  }

  @Override
  public void register(ServiceInstance serviceInstance) {
    logger.info(" register serviceInstance,{}", serviceInstance);
    // 调用 RPC
    ServiceDiscoveryOuter.Registration registration = buildRegistration(serviceInstance, false);
    try {
      serviceDiscoveryClient.invoke(registration);
    } catch (Throwable e) {
      e.printStackTrace();
    }
    // 注册成功后，启动心跳线程服务
    ServiceDiscoveryHeartBeatThread beatThread = new ServiceDiscoveryHeartBeatThread(
        serviceDiscoveryClient, serviceInstance);
    beatThread.setDaemon(true);
    beatThread.start();
  }

  @Override
  public void deregister(ServiceInstance serviceInstance) {
    // 调用 RPC
    ServiceDiscoveryOuter.Registration registration = buildRegistration(serviceInstance, true);
    try {
      serviceDiscoveryClient.invoke(registration);
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }

  @Override
  public List<ServiceInstance> getServiceInstances(String serviceName) {
    // 调用 RPC
    ServiceDiscoveryOuter.GetServiceInstancesRequest request = buildGetServiceInstancesRequest(
        serviceName);
    try {
      ServiceDiscoveryOuter.GetServiceInstancesResponse response = serviceDiscoveryClient
          .invoke(request);
      List<Registration> registrations = response.getValueList();
      return convertServiceInstances(registrations);
    } catch (Throwable e) {
      e.printStackTrace();
    }
    return null;
  }

  private List<ServiceInstance> convertServiceInstances(List<Registration> registrations) {
    List<ServiceInstance> serviceInstances = new ArrayList<>(registrations.size());
    for (Registration registration : registrations) {
      serviceInstances.add(convertServiceInstance(registration));
    }
    return serviceInstances;
  }

  private ServiceInstance convertServiceInstance(Registration registration) {
    DefaultServiceInstance serviceInstance = new DefaultServiceInstance();
    serviceInstance.setServiceName(registration.getServiceName());
    serviceInstance.setPort(registration.getPort());
    serviceInstance.setMetadata(registration.getMetadataMap());
    serviceInstance.setId(registration.getId());
    serviceInstance.setHost(registration.getHost());
    return serviceInstance;
  }

  private GetServiceInstancesRequest buildGetServiceInstancesRequest(String serviceName) {
    return ServiceDiscoveryOuter.GetServiceInstancesRequest.newBuilder()
        .setServiceName(serviceName)
        .build();
  }

  @Override
  public void close() {
    logger.info(" JRaftServiceDiscovery closed...");
  }


  private Registration buildRegistration(ServiceInstance serviceInstance, boolean registered) {
    return ServiceDiscoveryOuter.Registration.newBuilder()
        .setServiceName(serviceInstance.getServiceName())
        .setPort(serviceInstance.getPort())
        .setId(serviceInstance.getId())
        .setHost(serviceInstance.getHost())
        .putAllMetadata(serviceInstance.getMetadata())
        .setReversed(registered)
        .build();
  }
}
