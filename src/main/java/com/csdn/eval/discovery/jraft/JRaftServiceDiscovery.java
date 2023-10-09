package com.csdn.eval.discovery.jraft;

import com.csdn.eval.discovery.ServiceDiscovery;
import java.util.List;
import java.util.Map;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/10/9 10:52
 * @Description: 基于 JRaft 实现 ServiceDiscovery
 * @Version: 1.0
 */
public class JRaftServiceDiscovery implements ServiceDiscovery {

  @Override
  public void initialize(Map<String, Object> config) {

  }

  @Override
  public void register(ServiceInstance serviceInstance) {

  }

  @Override
  public void deregister(ServiceInstance serviceInstance) {

  }

  @Override
  public List<ServiceInstance> getServiceInstances(String serviceName) {
    return null;
  }

  @Override
  public void close() {

  }
}
