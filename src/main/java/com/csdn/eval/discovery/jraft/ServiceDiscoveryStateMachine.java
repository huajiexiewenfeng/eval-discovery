package com.csdn.eval.discovery.jraft;

import com.alipay.sofa.jraft.Iterator;
import com.alipay.sofa.jraft.Node;
import com.alipay.sofa.jraft.Status;
import com.alipay.sofa.jraft.core.StateMachineAdapter;
import com.alipay.sofa.jraft.error.RaftException;
import com.csdn.eval.discovery.jraft.handler.ServiceDiscoveryRequestHandlerFactory;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 14:58
 * @Description: 服务发现状态机 FSM
 * @Version: 1.0
 */
public class ServiceDiscoveryStateMachine extends StateMachineAdapter {

  private static final Logger logger = LoggerFactory.getLogger(ServiceDiscoveryStateMachine.class);

  private Node node;

  /**
   * Leader term
   */
  private final AtomicLong leaderTerm = new AtomicLong(-1);

  public boolean isLeader() {
    return this.leaderTerm.get() > 0;
  }

  @Override
  public void onApply(Iterator iter) {
    while (iter.hasNext()) {
      ServiceDiscoveryOperation operation = null;
      ServiceDiscoveryClosure closure = null;
      if (iter.done() != null) {
        // 从当前 Leader 节点获取 Closure
        closure = (ServiceDiscoveryClosure) iter.done();
        // 从 Closure 获取服务操作的类型
        operation = closure.getServiceDiscoveryOperation();
        logger.info("The closure with operation[{}] at the Leader node[{}]", operation, node);
      } else {
        // 在 Follower 节点通过 日志反序列化得到 ServiceDiscoveryOperation
        final ByteBuffer data = iter.getData();
        operation = ServiceDiscoveryOperation.deserialize(data);
        logger.info("The closure with operation[{}] at the Follower node[{}]", operation, node);
      }
      // 根据服务操作类型的不同来进行不同的业务操作
      if (operation != null) {
        Kind kind = operation.getKind();
        ServiceDiscoveryRequestHandlerFactory instanceFactory = ServiceDiscoveryRequestHandlerFactory
            .getInstance();
        instanceFactory.init();
        instanceFactory.getHandler(kind)
            .doHandle(closure, (ServiceInstance) operation.getData());
        if (closure != null) {
          closure.run(Status.OK());
        }
      }
      iter.next();
    }
  }

  @Override
  public void onError(final RaftException e) {
    logger.error("Raft error: {}", e, e);
  }


  @Override
  public void onLeaderStart(final long term) {
    this.leaderTerm.set(term);
    super.onLeaderStart(term);

  }

  @Override
  public void onLeaderStop(final Status status) {
    this.leaderTerm.set(-1);
    super.onLeaderStop(status);
  }

  public void setNode(Node node) {
    this.node = node;
  }

}
