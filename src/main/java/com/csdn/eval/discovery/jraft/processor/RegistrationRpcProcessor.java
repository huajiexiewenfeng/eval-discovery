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
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.Registration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 15:22
 * @Description: 服务实例注册请求处理器
 * @Version: 1.0
 */
public class RegistrationRpcProcessor implements RpcProcessor<ServiceDiscoveryOuter.Registration> {

  private static final Logger logger = LoggerFactory
      .getLogger(RegistrationRpcProcessor.class);

  private final RpcProcessorService rpcProcessorService;

  public RegistrationRpcProcessor(RpcProcessorService rpcProcessorService) {
    this.rpcProcessorService = rpcProcessorService;
  }

  @Override
  public void handleRequest(RpcContext rpcContext, Registration registration) {
    ServiceInstance serviceInstance = convertServiceInstance(registration);

    String serviceName = registration.getServiceName();

    final Kind kind = Kind.REGISTRATION;

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

  private ServiceDiscoveryOuter.Response response(Status status) {
    return ServiceDiscoveryOuter.Response.newBuilder()
        .setCode(status.getCode())
        .setMessage(status.getErrorMsg() == null ? "" : status.getErrorMsg())
        .build();
  }

  private ServiceInstance convertServiceInstance(Registration registration) {
    DefaultServiceInstance instance = new DefaultServiceInstance();
    instance.setHost(registration.getHost());
    instance.setId(registration.getId());
    instance.setMetadata(registration.getMetadataMap());
    instance.setPort(registration.getPort());
    instance.setServiceName(registration.getServiceName());
    return instance;
  }

  @Override
  public String interest() {
    return ServiceDiscoveryOuter.Registration.class.getName();
  }
}
