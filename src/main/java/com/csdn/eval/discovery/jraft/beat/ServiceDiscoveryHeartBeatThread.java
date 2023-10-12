package com.csdn.eval.discovery.jraft.beat;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryClient;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.HeartBeat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/10/12 10:22
 * @Description: 心跳线程
 * @Version: 1.0
 */
public class ServiceDiscoveryHeartBeatThread extends Thread {

  private final ServiceDiscoveryClient serviceDiscoveryClient;
  private final ServiceInstance serviceInstance;

  private static final Logger logger = LoggerFactory
      .getLogger(ServiceDiscoveryHeartBeatThread.class);

  public ServiceDiscoveryHeartBeatThread(ServiceDiscoveryClient serviceDiscoveryClient,
      ServiceInstance serviceInstance) {
    super("client-service-instance-beat");
    this.serviceDiscoveryClient = serviceDiscoveryClient;
    this.serviceInstance = serviceInstance;
  }

  @Override
  public void run() {
    while (true) {
      // 调用 RPC
      ServiceDiscoveryOuter.HeartBeat heartBeat = buildHeartBeat(serviceInstance);
      try {
        serviceDiscoveryClient.invoke(heartBeat);
        Thread.sleep(5000);
      } catch (Throwable e) {
        logger.error("Fail to send heartbeat for a service instance : " + serviceInstance, e);
      }
    }
  }

  private HeartBeat buildHeartBeat(ServiceInstance serviceInstance) {
    return HeartBeat.newBuilder()
        .setHost(serviceInstance.getHost())
        .setId(serviceInstance.getId())
        .setPort(serviceInstance.getPort())
        .setServiceName(serviceInstance.getServiceName())
        .build();
  }
}
