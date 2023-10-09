package com.csdn.eval.discovery.jraft.handler;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 16:25
 * @Description: 服务注销请求处理者
 * @Version: 1.0
 */
public class DeRegistrationRequestHandler implements ServiceDiscoveryRequestHandler {

  private static final Logger logger = LoggerFactory.getLogger(DeRegistrationRequestHandler.class);

  private ServiceDiscoveryRequestHandlerFactory factory;

  public DeRegistrationRequestHandler(
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

    factory.delete(id, serviceName);

    logger.info("{} has been deregistered at the node", serviceInstance);
  }
}
