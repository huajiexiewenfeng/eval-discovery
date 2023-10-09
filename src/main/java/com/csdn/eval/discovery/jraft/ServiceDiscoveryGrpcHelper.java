/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.csdn.eval.discovery.jraft;

import com.alipay.sofa.jraft.rpc.RpcServer;
import com.alipay.sofa.jraft.util.RpcFactoryHelper;
import com.csdn.eval.discovery.jraft.proto.ServiceDiscoveryOuter;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceDiscoveryGrpcHelper {

    private static final Logger LOG = LoggerFactory.getLogger(ServiceDiscoveryGrpcHelper.class);

    public static RpcServer rpcServer;

    public static void initGRpc() {
        if ("com.alipay.sofa.jraft.rpc.impl.GrpcRaftRpcFactory".equals(RpcFactoryHelper.rpcFactory().getClass().getName())) {
            RpcFactoryHelper.rpcFactory().registerProtobufSerializer(ServiceDiscoveryOuter.Registration.class.getName(),
                    ServiceDiscoveryOuter.Registration.getDefaultInstance());

            RpcFactoryHelper.rpcFactory().registerProtobufSerializer(ServiceDiscoveryOuter.Response.class.getName(),
                    ServiceDiscoveryOuter.Response.getDefaultInstance());
// 老代码，目前已经没有这个类
//            try {
//                Class<?> clazz = Class.forName("com.alipay.sofa.jraft.rpc.impl.MarshallerHelper");
//                Method registerRespInstance = clazz.getMethod("registerRespInstance", String.class, Message.class);
//                registerRespInstance.invoke(null, ServiceDiscoveryOutter.ServiceInstanceRegistrationRequest.class.getName(),
//                        ServiceDiscoveryOutter.ServiceInstanceRegistrationResponse.getDefaultInstance());
//
//            } catch (Exception e) {
//                LOG.error("Failed to init grpc server", e);
//            }
        }
    }

    public static void setRpcServer(RpcServer rpcServer) {
        ServiceDiscoveryGrpcHelper.rpcServer = rpcServer;
    }

    public static void blockUntilShutdown() {
        if (rpcServer == null) {
            return;
        }
        if ("com.alipay.sofa.jraft.rpc.impl.GrpcRaftRpcFactory".equals(RpcFactoryHelper.rpcFactory().getClass()
                .getName())) {
            try {
                Method getServer = rpcServer.getClass().getMethod("getServer");
                Object grpcServer = getServer.invoke(rpcServer);

                Method shutdown = grpcServer.getClass().getMethod("shutdown");
                Method awaitTerminationLimit = grpcServer.getClass().getMethod("awaitTermination", long.class,
                        TimeUnit.class);

                Runtime.getRuntime().addShutdownHook(new Thread() {
                    @Override
                    public void run() {
                        try {
                            shutdown.invoke(grpcServer);
                            awaitTerminationLimit.invoke(grpcServer, 30, TimeUnit.SECONDS);
                        } catch (Exception e) {
                            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                            e.printStackTrace(System.err);
                        }
                    }
                });
                Method awaitTermination = grpcServer.getClass().getMethod("awaitTermination");
                awaitTermination.invoke(grpcServer);
            } catch (Exception e) {
                LOG.error("Failed to block grpc server", e);
            }
        }
    }

}
