package com.csdn.eval.discovery.jraft.processor;

import com.alipay.sofa.jraft.Status;
import com.alipay.sofa.jraft.rpc.RpcContext;
import com.alipay.sofa.jraft.rpc.RpcProcessor;
import com.csdn.eval.discovery.jraft.DefaultServiceInstance;
import com.csdn.eval.discovery.jraft.Kind;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryOperation;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.HeartBeat;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.Registration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 15:22
 * @Description: 心跳请求处理器
 * @Version: 1.0
 */
public class HeartBeatRpcProcessor implements RpcProcessor<ServiceDiscoveryOuter.HeartBeat> {

  private static final Logger logger = LoggerFactory
      .getLogger(HeartBeatRpcProcessor.class);

  private final RpcProcessorService rpcProcessorService;

  public HeartBeatRpcProcessor(RpcProcessorService rpcProcessorService) {
    this.rpcProcessorService = rpcProcessorService;
  }

  @Override
  public void handleRequest(RpcContext rpcContext, HeartBeat heartBeat) {
    ServiceInstance serviceInstance = convertServiceInstance(heartBeat);

    String serviceName = heartBeat.getServiceName();

    final Kind kind = Kind.BEAT;

    ServiceDiscoveryOperation op = new ServiceDiscoveryOperation(kind, serviceInstance);

    final ServiceDiscoveryClosure closure = new ServiceDiscoveryClosure(op) {
      @Override
      public void run(Status status) {
        if (!status.isOk()) {
          logger.warn("Closure status is : {} at the {}", status, rpcProcessorService.getNode());
          return;
        }
        rpcContext.sendResponse(response(status));
        logger.info("'{}' has been handled ,serviceName : '{}' , result : {} , status : {}",
            kind, serviceName, getResult(), status);
      }
    };

    this.rpcProcessorService.applyOperation(closure);
  }

  private ServiceInstance convertServiceInstance(HeartBeat heartBeat) {
    DefaultServiceInstance instance = new DefaultServiceInstance();
    instance.setHost(heartBeat.getHost());
    instance.setId(heartBeat.getId());
    instance.setPort(heartBeat.getPort());
    instance.setServiceName(heartBeat.getServiceName());
    return instance;
  }

  private ServiceDiscoveryOuter.Response response(Status status) {
    return ServiceDiscoveryOuter.Response.newBuilder()
        .setCode(status.getCode())
        .setMessage(status.getErrorMsg() == null ? "" : status.getErrorMsg())
        .build();
  }

  @Override
  public String interest() {
    return ServiceDiscoveryOuter.HeartBeat.class.getName();
  }
}
