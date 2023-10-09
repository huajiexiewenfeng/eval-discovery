package com.csdn.eval.discovery.jraft.handler;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 16:25
 * @Description: 服务注册请求处理者
 * @Version: 1.0
 */
public class RegistrationRequestHandler implements ServiceDiscoveryRequestHandler {

  private static final Logger logger = LoggerFactory.getLogger(RegistrationRequestHandler.class);

  private ServiceDiscoveryRequestHandlerFactory factory;

  public RegistrationRequestHandler(
      ServiceDiscoveryRequestHandlerFactory factory) {
    this.factory = factory;
  }

  @Override
  public void doHandle(ServiceDiscoveryClosure closure, ServiceInstance serviceInstance) {
    if (null == serviceInstance) {
      return;
    }
    String serviceName = serviceInstance.getServiceName();
    String id = serviceInstance.getId();

    factory.storage(id, serviceName, serviceInstance);

    logger.info("{} has been registered at the node", serviceInstance);
  }
}
