package com.csdn.eval.discovery.jraft.processor;

import com.alipay.sofa.jraft.Closure;
import com.alipay.sofa.jraft.Node;
import com.alipay.sofa.jraft.Status;
import com.alipay.sofa.jraft.entity.Task;
import com.alipay.sofa.jraft.error.RaftError;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryClosure;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryServer;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryStateMachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/10/9 10:52
 * @Description: RpcProcessorService 实现类，用于重构
 * @Version: 1.0
 */
public class RpcProcessorImpl implements RpcProcessorService {

  private static final Logger logger = LoggerFactory.getLogger(RpcProcessorImpl.class);

  private final ServiceDiscoveryServer serviceDiscoveryServer;

  public RpcProcessorImpl(ServiceDiscoveryServer serviceDiscoveryServer) {
    this.serviceDiscoveryServer = serviceDiscoveryServer;
  }

  @Override
  public Node getNode() {
    return this.serviceDiscoveryServer.getNode();
  }

  @Override
  public void applyOperation(ServiceDiscoveryClosure closure) {
    if (!isLeader()) {
      handlerNotLeaderError(closure);
      return;
    }
    final Task task = new Task();
    // 写入本地日志，将作为 AppendEntries RPC 请求的来源 -> Followers
    task.setData(closure.getServiceDiscoveryOperation().serialize());
    // 触发 Leader 节点上的状态机 onApply 方法
    task.setDone(closure);
    this.serviceDiscoveryServer.getNode().apply(task);
  }

  private ServiceDiscoveryStateMachine getFsm() {
    return this.serviceDiscoveryServer.getFsm();
  }

  private boolean isLeader() {
    return getFsm().isLeader();
  }

  private void handlerNotLeaderError(final Closure closure) {
    logger.error("No Leader node : {}", getNode().getNodeId());
    closure.run(new Status(RaftError.EPERM, "Not leader"));
  }

}
