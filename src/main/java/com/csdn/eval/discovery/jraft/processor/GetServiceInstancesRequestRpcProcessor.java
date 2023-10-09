package com.csdn.eval.discovery.jraft.processor;

import com.alipay.sofa.jraft.Closure;
import com.alipay.sofa.jraft.Node;
import com.alipay.sofa.jraft.Status;
import com.alipay.sofa.jraft.entity.Task;
import com.alipay.sofa.jraft.error.RaftError;
import com.alipay.sofa.jraft.rpc.RpcContext;
import com.alipay.sofa.jraft.rpc.RpcProcessor;
import com.csdn.eval.discovery.jraft.Kind;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryOperation;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryServer;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryStateMachine;
import com.csdn.eval.discovery.jraft.ServiceInstance;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.GetServiceInstancesRequest;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.GetServiceInstancesResponse;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.Registration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 15:22
 * @Description: {@link ServiceDiscoveryOuter.GetServiceInstancesRequest}获取服务实例请求处理器
 * @Version: 1.0
 */
public class GetServiceInstancesRequestRpcProcessor implements
    RpcProcessor<ServiceDiscoveryOuter.GetServiceInstancesRequest> {

  private static final Logger logger = LoggerFactory
      .getLogger(GetServiceInstancesRequestRpcProcessor.class);

  private final ServiceDiscoveryServer serviceDiscoveryServer;

  public GetServiceInstancesRequestRpcProcessor(ServiceDiscoveryServer serviceDiscoveryServer) {
    super();
    this.serviceDiscoveryServer = serviceDiscoveryServer;
  }

  @Override
  public void handleRequest(RpcContext rpcContext, GetServiceInstancesRequest request) {
    String serviceName = request.getServiceName();

    final Kind kind = Kind.GET_SERVICE_INSTANCES;

    ServiceDiscoveryOperation op = new ServiceDiscoveryOperation(kind, serviceName);

    final ServiceDiscoveryClosure closure = new ServiceDiscoveryClosure(op) {
      @Override
      public void run(Status status) {
        if (!status.isOk()) {
          logger.warn("Closure status is : {} at the {}", status, serviceDiscoveryServer.getNode());
          return;
        }
        // 类似于 ValueResponse 的封装 返回 ServiceDiscoveryOuter.GetServiceInstancesResponse 对象
        rpcContext.sendResponse(response(getResult()));
        logger.info("'{}' has been handled ,serviceName : '{}' , result : {} , status : {}",
            kind, serviceName, getResult(), status);
      }
    };

    if (!isLeader()) {
      handlerNotLeaderError(closure);
      return;
    }

    final Task task = new Task();
    task.setData(op.serialize());
    task.setDone(closure);
    this.serviceDiscoveryServer.getNode().apply(task);

  }

  private ServiceDiscoveryStateMachine getFsm() {
    return this.serviceDiscoveryServer.getFsm();
  }

  private boolean isLeader() {
    return getFsm().isLeader();
  }

  @Override
  public String interest() {
    return ServiceDiscoveryOuter.GetServiceInstancesRequest.class.getName();
  }

  private void handlerNotLeaderError(final Closure closure) {
    logger.error("No Leader node : {}", getNode().getNodeId());
    closure.run(new Status(RaftError.EPERM, "Not leader"));
  }

  private Node getNode() {
    return this.serviceDiscoveryServer.getNode();
  }


  private ServiceDiscoveryOuter.GetServiceInstancesResponse response(Object result) {
    Collection<ServiceInstance> serviceInstances = (Collection<ServiceInstance>) result;
    GetServiceInstancesResponse response = GetServiceInstancesResponse.newBuilder()
        .addAllValue(convertRegistrations(serviceInstances)).build();
    return response;
  }

  private List<Registration> convertRegistrations(
      Collection<ServiceInstance> serviceInstances) {
    List<Registration> registrations = new ArrayList<>(serviceInstances.size());
    for (ServiceInstance instance : serviceInstances) {
      registrations.add(convertRegistration(instance));
    }
    return registrations;
  }

  private Registration convertRegistration(ServiceInstance instance) {
    return Registration.newBuilder()
        .setId(instance.getId())
        .setHost(instance.getHost())
        .setPort(instance.getPort())
        .setServiceName(instance.getServiceName())
        .putAllMetadata(instance.getMetadata())
        .build();
  }

}
