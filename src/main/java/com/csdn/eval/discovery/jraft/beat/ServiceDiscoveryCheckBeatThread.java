package com.csdn.eval.discovery.jraft.beat;

import com.csdn.eval.discovery.jraft.ServiceDiscoveryStateMachine;
import com.csdn.eval.discovery.jraft.handler.ServiceDiscoveryRequestHandlerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/10/12 10:22
 * @Description: 心跳检测线程
 * @Version: 1.0
 */
public class ServiceDiscoveryCheckBeatThread extends Thread {

  private final ServiceDiscoveryRequestHandlerFactory factory;
  private final ServiceDiscoveryStateMachine stateMachine;

  private static final Logger logger = LoggerFactory
      .getLogger(ServiceDiscoveryCheckBeatThread.class);

  public ServiceDiscoveryCheckBeatThread(ServiceDiscoveryRequestHandlerFactory factory,
      ServiceDiscoveryStateMachine stateMachine) {
    super("service-instance-beat-check");
    this.factory = factory;
    this.stateMachine = stateMachine;
  }

  @Override
  public void run() {
    while (true) {
      try {
        if (stateMachine.isLeader()) {
          factory.checkBeat();
        }
        Thread.sleep(5000);
      } catch (Throwable e) {
        logger.error("error on check beat", e);
      }
    }
  }

}
