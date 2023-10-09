package com.csdn.eval.discovery.jraft.handler;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 16:25
 * @Description: 心跳请求处理者
 * @Version: 1.0
 */
public class HeartBeatRequestHandler implements ServiceDiscoveryRequestHandler {

  /**
   * 服务超过30s没有心跳，视为自动下线
   */
  private final int expired = 30;

  private static final Logger logger = LoggerFactory.getLogger(HeartBeatRequestHandler.class);

  private ServiceDiscoveryRequestHandlerFactory factory;

  public HeartBeatRequestHandler(
      ServiceDiscoveryRequestHandlerFactory factory) {
    this.factory = factory;
  }

  @Override
  public void doHandle(ServiceDiscoveryClosure closure, ServiceInstance serviceInstance) {
    if (null == serviceInstance) {
      return;
    }
    // todo

    logger.info("{} has been deregistered at the node", serviceInstance);
  }
}
