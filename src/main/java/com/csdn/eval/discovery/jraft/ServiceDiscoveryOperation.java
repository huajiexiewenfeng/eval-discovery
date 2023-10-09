package com.csdn.eval.discovery.jraft;

import static com.alipay.remoting.serialization.SerializerManager.Hessian2;

import com.alipay.remoting.exception.CodecException;
import com.alipay.remoting.serialization.Serializer;
import com.alipay.remoting.serialization.SerializerManager;
import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * @Author: xiewenfeng
 * @CreateTime: 2023/9/20 15:35
 * @Description: 服务发现操作
 * @Version: 1.0
 */
public class ServiceDiscoveryOperation<V> implements Serializable {

  private static final Serializer serializer = SerializerManager.getSerializer(Hessian2);


  private final Kind kind;

  private final V data;

  public ServiceDiscoveryOperation(Kind kind, V value) {
    this.kind = kind;
    this.data = value;
  }

  public Kind getKind() {
    return kind;
  }


  public V getData() {
    return data;
  }

  public ByteBuffer serialize() {
    byte[] data = null;
    try {
      data = serializer.serialize(this);
    } catch (CodecException e) {
      throw new RuntimeException(e);
    }
    return ByteBuffer.wrap(data);
  }

  public static ServiceDiscoveryOperation deserialize(ByteBuffer data) {
    byte[] bytes = data.array();
    ServiceDiscoveryOperation operation = null;
    try {
      operation = serializer.deserialize(bytes, ServiceDiscoveryOperation.class.getName());
    } catch (CodecException e) {
      throw new RuntimeException(e);
    }
    return operation;
  }

}
