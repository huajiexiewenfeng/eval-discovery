package com.csdn.eval.discovery.jraft.handler;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceInstance;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 16:23
 * @Description: 服务消息处理者
 * @Version: 1.0
 */
public interface ServiceDiscoveryRequestHandler {

  void doHandle(ServiceDiscoveryClosure closure, ServiceInstance data);
}
