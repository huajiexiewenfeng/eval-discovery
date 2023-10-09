package com.csdn.eval.discovery.jraft;

import com.alipay.sofa.jraft.Node;
import com.alipay.sofa.jraft.RaftGroupService;
import com.alipay.sofa.jraft.conf.Configuration;
import com.alipay.sofa.jraft.entity.PeerId;
import com.alipay.sofa.jraft.option.NodeOptions;
import com.alipay.sofa.jraft.rpc.RaftRpcServerFactory;
import com.alipay.sofa.jraft.rpc.RpcServer;
import com.csdn.eval.discovery.jraft.handler.ServiceDiscoveryRequestHandlerFactory;
import com.csdn.eval.discovery.jraft.processor.GetServiceInstancesRequestRpcProcessor;
import com.csdn.eval.discovery.jraft.processor.HeartBeatRpcProcessor;
import com.csdn.eval.discovery.jraft.processor.RegistrationRpcProcessor;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/19 17:40
 * @Description: 服务发现服务端
 * @Version: 1.0
 */
public class ServiceDiscoveryServer {

  private RaftGroupService raftGroupService;
  private Node node;
  private ServiceDiscoveryStateMachine fsm;

  public ServiceDiscoveryServer(final String dataPath, final String groupId, final PeerId serverId,
      final NodeOptions nodeOptions) throws IOException {
    // init raft data path, it contains log,meta,snapshot
    FileUtils.forceMkdir(new File(dataPath));

    // here use same RPC server for raft and business. It also can be seperated generally
    final RpcServer rpcServer = RaftRpcServerFactory.createRaftRpcServer(serverId.getEndpoint());
    // GrpcServer need init marshaller
    ServiceDiscoveryGrpcHelper.initGRpc();
    ServiceDiscoveryGrpcHelper.setRpcServer(rpcServer);

    // register business processor
    rpcServer.registerProcessor(new RegistrationRpcProcessor(this));
    rpcServer.registerProcessor(new GetServiceInstancesRequestRpcProcessor(this));
    rpcServer.registerProcessor(new HeartBeatRpcProcessor(this));
    // init state machine
    this.fsm = new ServiceDiscoveryStateMachine();
    // set fsm to nodeOptions
    nodeOptions.setFsm(this.fsm);
    // set storage path (log,meta,snapshot)
    // log, must
    nodeOptions.setLogUri(dataPath + File.separator + "log");
    // meta, must
    nodeOptions.setRaftMetaUri(dataPath + File.separator + "raft_meta");
    // snapshot, optional, generally recommended
    nodeOptions.setSnapshotUri(dataPath + File.separator + "snapshot");
    // init raft group service framework
    this.raftGroupService = new RaftGroupService(groupId, serverId, nodeOptions, rpcServer);
    // start raft node
    this.node = this.raftGroupService.start();
  }

  public ServiceDiscoveryStateMachine getFsm() {
    return this.fsm;
  }

  public Node getNode() {
    return this.node;
  }

  public RaftGroupService RaftGroupService() {
    return this.raftGroupService;
  }

  /**
   * Redirect request to new leader
   */
//  public ValueResponse redirect() {
//    final ValueResponse.Builder builder = ValueResponse.newBuilder().setSuccess(false);
//    if (this.node != null) {
//      final PeerId leader = this.node.getLeaderId();
//      if (leader != null) {
//        builder.setRedirect(leader.toString());
//      }
//    }
//    return builder.build();
//  }

  public static void main(final String[] args) throws IOException {
    if (args.length != 4) {
      System.out
          .println(
              "Usage : java com.alipay.sofa.jraft.example.counter.CounterServer {dataPath} {groupId} {serverId} {initConf}");
      System.out
          .println(
              "Example: java com.alipay.sofa.jraft.example.counter.CounterServer /tmp/server1 counter 127.0.0.1:8081 127.0.0.1:8081,127.0.0.1:8082,127.0.0.1:8083");
      System.exit(1);
    }
    final String dataPath = args[0];
    final String groupId = args[1];
    final String serverIdStr = args[2];
    final String initConfStr = args[3];

    final NodeOptions nodeOptions = new NodeOptions();
    // for test, modify some params
    // set election timeout to 1s
    nodeOptions.setElectionTimeoutMs(1000);
    // disable CLI service。
    nodeOptions.setDisableCli(false);
    // do snapshot every 30s
    nodeOptions.setSnapshotIntervalSecs(30);
    // parse server address
    final PeerId serverId = new PeerId();
    if (!serverId.parse(serverIdStr)) {
      throw new IllegalArgumentException("Fail to parse serverId:" + serverIdStr);
    }
    final Configuration initConf = new Configuration();
    if (!initConf.parse(initConfStr)) {
      throw new IllegalArgumentException("Fail to parse initConf:" + initConfStr);
    }
    // set cluster configuration
    nodeOptions.setInitialConf(initConf);

    // start raft server
    final ServiceDiscoveryServer counterServer = new ServiceDiscoveryServer(dataPath, groupId,
        serverId, nodeOptions);
    System.out.println("Started counter server at port:"
        + counterServer.getNode().getNodeId().getPeerId().getPort());
    // GrpcServer need block to prevent process exit
    ServiceDiscoveryGrpcHelper.blockUntilShutdown();
  }
}
