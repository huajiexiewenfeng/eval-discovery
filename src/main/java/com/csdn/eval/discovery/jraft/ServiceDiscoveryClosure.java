package com.csdn.eval.discovery.jraft;

import com.alipay.sofa.jraft.Closure;
import com.alipay.sofa.jraft.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 15:36
 * @Description: 服务操作回调
 * @Version: 1.0
 */
public class ServiceDiscoveryClosure implements Closure {

  private static final Logger logger = LoggerFactory.getLogger(ServiceDiscoveryClosure.class);

  private final ServiceDiscoveryOperation serviceDiscoveryOperation;

  private Object result;

  public ServiceDiscoveryClosure(
      ServiceDiscoveryOperation serviceDiscoveryOperation) {
    this.serviceDiscoveryOperation = serviceDiscoveryOperation;
  }

  @Override
  public void run(Status status) {

  }

  public ServiceDiscoveryOperation getServiceDiscoveryOperation() {
    return serviceDiscoveryOperation;
  }
  
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

}
