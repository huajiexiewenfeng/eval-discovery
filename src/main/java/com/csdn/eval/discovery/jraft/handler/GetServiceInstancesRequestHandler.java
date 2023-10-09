package com.csdn.eval.discovery.jraft.handler;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 17:21
 * @Description: 获取服务实例请求处理者
 * @Version: 1.0
 */
public class GetServiceInstancesRequestHandler implements ServiceDiscoveryRequestHandler {

  private static final Logger logger = LoggerFactory.getLogger(DeRegistrationRequestHandler.class);

  private ServiceDiscoveryRequestHandlerFactory factory;

  public GetServiceInstancesRequestHandler(
      ServiceDiscoveryRequestHandlerFactory factory) {
    this.factory = factory;
  }

  @Override
  public void doHandle(ServiceDiscoveryClosure closure, ServiceInstance serviceInstance) {
    String serviceName = serviceInstance.getServiceName();

    Map<String, ServiceInstance> serviceInstancesMap = factory.getServiceInstancesMap(serviceName);

    closure.setResult(serviceInstancesMap.values());
  }
}
