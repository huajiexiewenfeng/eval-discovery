package com.csdn.eval.discovery.jraft.processor;

import com.alipay.sofa.jraft.rpc.RpcContext;
import com.alipay.sofa.jraft.rpc.RpcProcessor;
import com.csdn.eval.discovery.jraft.ServiceDiscoveryServer;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter.HeartBeat;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 15:22
 * @Description: TODO
 * @Version: 1.0
 */
public class HeartBeatRpcProcessor implements RpcProcessor<ServiceDiscoveryOuter.HeartBeat> {

  public HeartBeatRpcProcessor(ServiceDiscoveryServer serviceDiscoveryServer) {
  }

  @Override
  public void handleRequest(RpcContext rpcContext, HeartBeat heartBeat) {

  }

  @Override
  public String interest() {
    return null;
  }
}
