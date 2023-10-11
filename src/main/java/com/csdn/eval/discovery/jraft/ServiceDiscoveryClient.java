package com.csdn.eval.discovery.jraft;

import com.alipay.sofa.jraft.RouteTable;
import com.alipay.sofa.jraft.conf.Configuration;
import com.alipay.sofa.jraft.entity.PeerId;
import com.alipay.sofa.jraft.option.CliOptions;
import com.alipay.sofa.jraft.rpc.CliClientService;
import com.alipay.sofa.jraft.rpc.RpcClient;
import com.alipay.sofa.jraft.rpc.impl.cli.CliClientServiceImpl;
import java.util.concurrent.TimeUnit;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/19 17:39
 * @Description: 服务发现客户端
 * @Version: 1.0
 */
public class ServiceDiscoveryClient {

  private String groupId = "service-discovery";

  /**
   * 127.0.0.1:8083
   */
  private String registerAddress;

  private CliClientService cliClientService;

  private RpcClient rpcClient;

  public ServiceDiscoveryClient(String groupId, String registerAddress) {
    this.groupId = groupId;
    this.registerAddress = registerAddress;
  }

  public void init() {
    ServiceDiscoveryGrpcHelper.initGRpc();

    final Configuration conf = new Configuration();
    if (!conf.parse(registerAddress)) {
      throw new IllegalArgumentException("Fail to parse conf:" + registerAddress);
    }
    RouteTable.getInstance().updateConfiguration(groupId, conf);

    final CliClientServiceImpl cliClientService = new CliClientServiceImpl();
    cliClientService.init(new CliOptions());
    this.cliClientService = cliClientService;
    this.rpcClient = cliClientService.getRpcClient();
  }

  public <R> R invoke(Object request) throws Throwable {
    if (!RouteTable.getInstance().refreshLeader(cliClientService, groupId, 1000).isOk()) {
      throw new IllegalStateException("Refresh leader failed");
    }

    PeerId leader = RouteTable.getInstance().selectLeader(groupId);
    return (R) rpcClient.invokeSync(leader.getEndpoint(), request, TimeUnit.SECONDS.toMillis(5));
  }


}
