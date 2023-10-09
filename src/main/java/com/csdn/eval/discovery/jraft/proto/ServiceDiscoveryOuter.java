//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.csdn.eval.discovery.jraft.proto;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ServiceDiscoveryOuter {
  private static final Descriptor internal_static_service_discovery_Registration_descriptor;
  private static final FieldAccessorTable internal_static_service_discovery_Registration_fieldAccessorTable;
  private static final Descriptor internal_static_service_discovery_Registration_MetadataEntry_descriptor;
  private static final FieldAccessorTable internal_static_service_discovery_Registration_MetadataEntry_fieldAccessorTable;
  private static final Descriptor internal_static_service_discovery_HeartBeat_descriptor;
  private static final FieldAccessorTable internal_static_service_discovery_HeartBeat_fieldAccessorTable;
  private static final Descriptor internal_static_service_discovery_Response_descriptor;
  private static final FieldAccessorTable internal_static_service_discovery_Response_fieldAccessorTable;
  private static final Descriptor internal_static_service_discovery_GetServiceInstancesRequest_descriptor;
  private static final FieldAccessorTable internal_static_service_discovery_GetServiceInstancesRequest_fieldAccessorTable;
  private static final Descriptor internal_static_service_discovery_GetServiceInstancesResponse_descriptor;
  private static final FieldAccessorTable internal_static_service_discovery_GetServiceInstancesResponse_fieldAccessorTable;
  private static FileDescriptor descriptor;

  private ServiceDiscoveryOuter() {
  }

  public static void registerAllExtensions(ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(ExtensionRegistry registry) {
    registerAllExtensions((ExtensionRegistryLite)registry);
  }

  public static FileDescriptor getDescriptor() {
    return descriptor;
  }

  static {
    String[] descriptorData = new String[]{"\n\u0017service-discovery.proto\u0012\u0011service.discovery\"½\u0001\n\fRegistration\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bserviceName\u0018\u0002 \u0001(\t\u0012\f\n\u0004host\u0018\u0003 \u0001(\t\u0012\f\n\u0004port\u0018\u0004 \u0001(\u0005\u0012?\n\bmetadata\u0018\u0005 \u0003(\u000b2-.service.discovery.Registration.MetadataEntry\u001a/\n\rMetadataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"H\n\tHeartBeat\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bserviceName\u0018\u0002 \u0001(\t\u0012\f\n\u0004host\u0018\u0003 \u0001(\t\u0012\f\n\u0004port\u0018\u0004 \u0001(\u0005\")\n\bResponse\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007message\u0018\u0002 \u0001(\t\"1\n\u001aGetServiceInstancesRequest\u0012\u0013\n\u000bserviceName\u0018\u0001 \u0001(\t\"M\n\u001bGetServiceInstancesResponse\u0012.\n\u0005value\u0018\u0001 \u0003(\u000b2\u001f.service.discovery.RegistrationB<\n#com.csdn.eval.discovery.jraft.protoB\u0015ServiceDiscoveryOuterb\u0006proto3"};
    descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[0]);
    internal_static_service_discovery_Registration_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
    internal_static_service_discovery_Registration_fieldAccessorTable = new FieldAccessorTable(internal_static_service_discovery_Registration_descriptor, new String[]{"Id", "ServiceName", "Host", "Port", "Metadata"});
    internal_static_service_discovery_Registration_MetadataEntry_descriptor = (Descriptor)internal_static_service_discovery_Registration_descriptor.getNestedTypes().get(0);
    internal_static_service_discovery_Registration_MetadataEntry_fieldAccessorTable = new FieldAccessorTable(internal_static_service_discovery_Registration_MetadataEntry_descriptor, new String[]{"Key", "Value"});
    internal_static_service_discovery_HeartBeat_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
    internal_static_service_discovery_HeartBeat_fieldAccessorTable = new FieldAccessorTable(internal_static_service_discovery_HeartBeat_descriptor, new String[]{"Id", "ServiceName", "Host", "Port"});
    internal_static_service_discovery_Response_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
    internal_static_service_discovery_Response_fieldAccessorTable = new FieldAccessorTable(internal_static_service_discovery_Response_descriptor, new String[]{"Code", "Message"});
    internal_static_service_discovery_GetServiceInstancesRequest_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
    internal_static_service_discovery_GetServiceInstancesRequest_fieldAccessorTable = new FieldAccessorTable(internal_static_service_discovery_GetServiceInstancesRequest_descriptor, new String[]{"ServiceName"});
    internal_static_service_discovery_GetServiceInstancesResponse_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
    internal_static_service_discovery_GetServiceInstancesResponse_fieldAccessorTable = new FieldAccessorTable(internal_static_service_discovery_GetServiceInstancesResponse_descriptor, new String[]{"Value"});
  }

  public static final class GetServiceInstancesResponse extends GeneratedMessageV3 implements ServiceDiscoveryOuter.GetServiceInstancesResponseOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int VALUE_FIELD_NUMBER = 1;
    private List<ServiceDiscoveryOuter.Registration> value_;
    private byte memoizedIsInitialized;
    private static final ServiceDiscoveryOuter.GetServiceInstancesResponse DEFAULT_INSTANCE = new ServiceDiscoveryOuter.GetServiceInstancesResponse();
    private static final Parser<ServiceDiscoveryOuter.GetServiceInstancesResponse> PARSER = new AbstractParser<ServiceDiscoveryOuter.GetServiceInstancesResponse>() {
      public ServiceDiscoveryOuter.GetServiceInstancesResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder builder = ServiceDiscoveryOuter.GetServiceInstancesResponse.newBuilder();

        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (InvalidProtocolBufferException var5) {
          throw var5.setUnfinishedMessage(builder.buildPartial());
        } catch (UninitializedMessageException var6) {
          throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (IOException var7) {
          throw (new InvalidProtocolBufferException(var7)).setUnfinishedMessage(builder.buildPartial());
        }

        return builder.buildPartial();
      }
    };

    private GetServiceInstancesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
      this.memoizedIsInitialized = -1;
    }

    private GetServiceInstancesResponse() {
      this.memoizedIsInitialized = -1;
      this.value_ = Collections.emptyList();
    }

    protected Object newInstance(UnusedPrivateParameter unused) {
      return new ServiceDiscoveryOuter.GetServiceInstancesResponse();
    }

    public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    public static final Descriptor getDescriptor() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesResponse_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.GetServiceInstancesResponse.class, ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder.class);
    }

    public List<ServiceDiscoveryOuter.Registration> getValueList() {
      return this.value_;
    }

    public List<? extends ServiceDiscoveryOuter.RegistrationOrBuilder> getValueOrBuilderList() {
      return this.value_;
    }

    public int getValueCount() {
      return this.value_.size();
    }

    public ServiceDiscoveryOuter.Registration getValue(int index) {
      return (ServiceDiscoveryOuter.Registration)this.value_.get(index);
    }

    public ServiceDiscoveryOuter.RegistrationOrBuilder getValueOrBuilder(int index) {
      return (ServiceDiscoveryOuter.RegistrationOrBuilder)this.value_.get(index);
    }

    public final boolean isInitialized() {
      byte isInitialized = this.memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
      } else if (isInitialized == 0) {
        return false;
      } else {
        this.memoizedIsInitialized = 1;
        return true;
      }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
      for(int i = 0; i < this.value_.size(); ++i) {
        output.writeMessage(1, (MessageLite)this.value_.get(i));
      }

      this.getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = this.memoizedSize;
      if (size != -1) {
        return size;
      } else {
        size = 0;

        for(int i = 0; i < this.value_.size(); ++i) {
          size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.value_.get(i));
        }

        size += this.getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
      }
    }

    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      } else if (!(obj instanceof ServiceDiscoveryOuter.GetServiceInstancesResponse)) {
        return super.equals(obj);
      } else {
        ServiceDiscoveryOuter.GetServiceInstancesResponse other = (ServiceDiscoveryOuter.GetServiceInstancesResponse)obj;
        if (!this.getValueList().equals(other.getValueList())) {
          return false;
        } else {
          return this.getUnknownFields().equals(other.getUnknownFields());
        }
      }
    }

    public int hashCode() {
      if (this.memoizedHashCode != 0) {
        return this.memoizedHashCode;
      } else {
        int hash = 41;
        int hash = 19 * hash + getDescriptor().hashCode();
        if (this.getValueCount() > 0) {
          hash = 37 * hash + 1;
          hash = 53 * hash + this.getValueList().hashCode();
        }

        hash = 29 * hash + this.getUnknownFields().hashCode();
        this.memoizedHashCode = hash;
        return hash;
      }
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseDelimitedFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(CodedInputStream input) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesResponse)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder newBuilderForType() {
      return newBuilder();
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder newBuilder(ServiceDiscoveryOuter.GetServiceInstancesResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder() : (new ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder()).mergeFrom(this);
    }

    protected ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder newBuilderForType(BuilderParent parent) {
      ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder builder = new ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder(parent);
      return builder;
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static Parser<ServiceDiscoveryOuter.GetServiceInstancesResponse> parser() {
      return PARSER;
    }

    public Parser<ServiceDiscoveryOuter.GetServiceInstancesResponse> getParserForType() {
      return PARSER;
    }

    public ServiceDiscoveryOuter.GetServiceInstancesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder> implements ServiceDiscoveryOuter.GetServiceInstancesResponseOrBuilder {
      private int bitField0_;
      private List<ServiceDiscoveryOuter.Registration> value_;
      private RepeatedFieldBuilderV3<ServiceDiscoveryOuter.Registration, ServiceDiscoveryOuter.Registration.Builder, ServiceDiscoveryOuter.RegistrationOrBuilder> valueBuilder_;

      public static final Descriptor getDescriptor() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesResponse_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.GetServiceInstancesResponse.class, ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder.class);
      }

      private Builder() {
        this.value_ = Collections.emptyList();
      }

      private Builder(BuilderParent parent) {
        super(parent);
        this.value_ = Collections.emptyList();
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder clear() {
        super.clear();
        if (this.valueBuilder_ == null) {
          this.value_ = Collections.emptyList();
        } else {
          this.value_ = null;
          this.valueBuilder_.clear();
        }

        this.bitField0_ &= -2;
        return this;
      }

      public Descriptor getDescriptorForType() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesResponse_descriptor;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse getDefaultInstanceForType() {
        return ServiceDiscoveryOuter.GetServiceInstancesResponse.getDefaultInstance();
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse build() {
        ServiceDiscoveryOuter.GetServiceInstancesResponse result = this.buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        } else {
          return result;
        }
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse buildPartial() {
        ServiceDiscoveryOuter.GetServiceInstancesResponse result = new ServiceDiscoveryOuter.GetServiceInstancesResponse(this);
        int from_bitField0_ = this.bitField0_;
        if (this.valueBuilder_ == null) {
          if ((this.bitField0_ & 1) != 0) {
            this.value_ = Collections.unmodifiableList(this.value_);
            this.bitField0_ &= -2;
          }

          result.value_ = this.value_;
        } else {
          result.value_ = this.valueBuilder_.build();
        }

        this.onBuilt();
        return result;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder clone() {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.clone();
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder setField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.setField(field, value);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder clearField(FieldDescriptor field) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.clearField(field);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder clearOneof(OneofDescriptor oneof) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.clearOneof(oneof);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.setRepeatedField(field, index, value);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder addRepeatedField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.addRepeatedField(field, value);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder mergeFrom(Message other) {
        if (other instanceof ServiceDiscoveryOuter.GetServiceInstancesResponse) {
          return this.mergeFrom((ServiceDiscoveryOuter.GetServiceInstancesResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder mergeFrom(ServiceDiscoveryOuter.GetServiceInstancesResponse other) {
        if (other == ServiceDiscoveryOuter.GetServiceInstancesResponse.getDefaultInstance()) {
          return this;
        } else {
          if (this.valueBuilder_ == null) {
            if (!other.value_.isEmpty()) {
              if (this.value_.isEmpty()) {
                this.value_ = other.value_;
                this.bitField0_ &= -2;
              } else {
                this.ensureValueIsMutable();
                this.value_.addAll(other.value_);
              }

              this.onChanged();
            }
          } else if (!other.value_.isEmpty()) {
            if (this.valueBuilder_.isEmpty()) {
              this.valueBuilder_.dispose();
              this.valueBuilder_ = null;
              this.value_ = other.value_;
              this.bitField0_ &= -2;
              this.valueBuilder_ = ServiceDiscoveryOuter.GetServiceInstancesResponse.alwaysUseFieldBuilders ? this.getValueFieldBuilder() : null;
            } else {
              this.valueBuilder_.addAllMessages(other.value_);
            }
          }

          this.mergeUnknownFields(other.getUnknownFields());
          this.onChanged();
          return this;
        }
      }

      public final boolean isInitialized() {
        return true;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        } else {
          try {
            boolean done = false;

            while(!done) {
              int tag = input.readTag();
              switch(tag) {
              case 0:
                done = true;
                break;
              case 10:
                ServiceDiscoveryOuter.Registration m = (ServiceDiscoveryOuter.Registration)input.readMessage(ServiceDiscoveryOuter.Registration.parser(), extensionRegistry);
                if (this.valueBuilder_ == null) {
                  this.ensureValueIsMutable();
                  this.value_.add(m);
                } else {
                  this.valueBuilder_.addMessage(m);
                }
                break;
              default:
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true;
                }
              }
            }
          } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
          } finally {
            this.onChanged();
          }

          return this;
        }
      }

      private void ensureValueIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
          this.value_ = new ArrayList(this.value_);
          this.bitField0_ |= 1;
        }

      }

      public List<ServiceDiscoveryOuter.Registration> getValueList() {
        return this.valueBuilder_ == null ? Collections.unmodifiableList(this.value_) : this.valueBuilder_.getMessageList();
      }

      public int getValueCount() {
        return this.valueBuilder_ == null ? this.value_.size() : this.valueBuilder_.getCount();
      }

      public ServiceDiscoveryOuter.Registration getValue(int index) {
        return this.valueBuilder_ == null ? (ServiceDiscoveryOuter.Registration)this.value_.get(index) : (ServiceDiscoveryOuter.Registration)this.valueBuilder_.getMessage(index);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder setValue(int index, ServiceDiscoveryOuter.Registration value) {
        if (this.valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }

          this.ensureValueIsMutable();
          this.value_.set(index, value);
          this.onChanged();
        } else {
          this.valueBuilder_.setMessage(index, value);
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder setValue(int index, ServiceDiscoveryOuter.Registration.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
          this.ensureValueIsMutable();
          this.value_.set(index, builderForValue.build());
          this.onChanged();
        } else {
          this.valueBuilder_.setMessage(index, builderForValue.build());
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder addValue(ServiceDiscoveryOuter.Registration value) {
        if (this.valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }

          this.ensureValueIsMutable();
          this.value_.add(value);
          this.onChanged();
        } else {
          this.valueBuilder_.addMessage(value);
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder addValue(int index, ServiceDiscoveryOuter.Registration value) {
        if (this.valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }

          this.ensureValueIsMutable();
          this.value_.add(index, value);
          this.onChanged();
        } else {
          this.valueBuilder_.addMessage(index, value);
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder addValue(ServiceDiscoveryOuter.Registration.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
          this.ensureValueIsMutable();
          this.value_.add(builderForValue.build());
          this.onChanged();
        } else {
          this.valueBuilder_.addMessage(builderForValue.build());
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder addValue(int index, ServiceDiscoveryOuter.Registration.Builder builderForValue) {
        if (this.valueBuilder_ == null) {
          this.ensureValueIsMutable();
          this.value_.add(index, builderForValue.build());
          this.onChanged();
        } else {
          this.valueBuilder_.addMessage(index, builderForValue.build());
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder addAllValue(Iterable<? extends ServiceDiscoveryOuter.Registration> values) {
        if (this.valueBuilder_ == null) {
          this.ensureValueIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.value_);
          this.onChanged();
        } else {
          this.valueBuilder_.addAllMessages(values);
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder clearValue() {
        if (this.valueBuilder_ == null) {
          this.value_ = Collections.emptyList();
          this.bitField0_ &= -2;
          this.onChanged();
        } else {
          this.valueBuilder_.clear();
        }

        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder removeValue(int index) {
        if (this.valueBuilder_ == null) {
          this.ensureValueIsMutable();
          this.value_.remove(index);
          this.onChanged();
        } else {
          this.valueBuilder_.remove(index);
        }

        return this;
      }

      public ServiceDiscoveryOuter.Registration.Builder getValueBuilder(int index) {
        return (ServiceDiscoveryOuter.Registration.Builder)this.getValueFieldBuilder().getBuilder(index);
      }

      public ServiceDiscoveryOuter.RegistrationOrBuilder getValueOrBuilder(int index) {
        return this.valueBuilder_ == null ? (ServiceDiscoveryOuter.RegistrationOrBuilder)this.value_.get(index) : (ServiceDiscoveryOuter.RegistrationOrBuilder)this.valueBuilder_.getMessageOrBuilder(index);
      }

      public List<? extends ServiceDiscoveryOuter.RegistrationOrBuilder> getValueOrBuilderList() {
        return this.valueBuilder_ != null ? this.valueBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.value_);
      }

      public ServiceDiscoveryOuter.Registration.Builder addValueBuilder() {
        return (ServiceDiscoveryOuter.Registration.Builder)this.getValueFieldBuilder().addBuilder(ServiceDiscoveryOuter.Registration.getDefaultInstance());
      }

      public ServiceDiscoveryOuter.Registration.Builder addValueBuilder(int index) {
        return (ServiceDiscoveryOuter.Registration.Builder)this.getValueFieldBuilder().addBuilder(index, ServiceDiscoveryOuter.Registration.getDefaultInstance());
      }

      public List<ServiceDiscoveryOuter.Registration.Builder> getValueBuilderList() {
        return this.getValueFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServiceDiscoveryOuter.Registration, ServiceDiscoveryOuter.Registration.Builder, ServiceDiscoveryOuter.RegistrationOrBuilder> getValueFieldBuilder() {
        if (this.valueBuilder_ == null) {
          this.valueBuilder_ = new RepeatedFieldBuilderV3(this.value_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
          this.value_ = null;
        }

        return this.valueBuilder_;
      }

      public final ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.setUnknownFields(unknownFields);
      }

      public final ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.GetServiceInstancesResponse.Builder)super.mergeUnknownFields(unknownFields);
      }
    }
  }

  public interface GetServiceInstancesResponseOrBuilder extends MessageOrBuilder {
    List<ServiceDiscoveryOuter.Registration> getValueList();

    ServiceDiscoveryOuter.Registration getValue(int var1);

    int getValueCount();

    List<? extends ServiceDiscoveryOuter.RegistrationOrBuilder> getValueOrBuilderList();

    ServiceDiscoveryOuter.RegistrationOrBuilder getValueOrBuilder(int var1);
  }

  public static final class GetServiceInstancesRequest extends GeneratedMessageV3 implements ServiceDiscoveryOuter.GetServiceInstancesRequestOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int SERVICENAME_FIELD_NUMBER = 1;
    private volatile Object serviceName_;
    private byte memoizedIsInitialized;
    private static final ServiceDiscoveryOuter.GetServiceInstancesRequest DEFAULT_INSTANCE = new ServiceDiscoveryOuter.GetServiceInstancesRequest();
    private static final Parser<ServiceDiscoveryOuter.GetServiceInstancesRequest> PARSER = new AbstractParser<ServiceDiscoveryOuter.GetServiceInstancesRequest>() {
      public ServiceDiscoveryOuter.GetServiceInstancesRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder builder = ServiceDiscoveryOuter.GetServiceInstancesRequest.newBuilder();

        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (InvalidProtocolBufferException var5) {
          throw var5.setUnfinishedMessage(builder.buildPartial());
        } catch (UninitializedMessageException var6) {
          throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (IOException var7) {
          throw (new InvalidProtocolBufferException(var7)).setUnfinishedMessage(builder.buildPartial());
        }

        return builder.buildPartial();
      }
    };

    private GetServiceInstancesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
      this.memoizedIsInitialized = -1;
    }

    private GetServiceInstancesRequest() {
      this.memoizedIsInitialized = -1;
      this.serviceName_ = "";
    }

    protected Object newInstance(UnusedPrivateParameter unused) {
      return new ServiceDiscoveryOuter.GetServiceInstancesRequest();
    }

    public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    public static final Descriptor getDescriptor() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesRequest_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.GetServiceInstancesRequest.class, ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder.class);
    }

    public String getServiceName() {
      Object ref = this.serviceName_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.serviceName_ = s;
        return s;
      }
    }

    public ByteString getServiceNameBytes() {
      Object ref = this.serviceName_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.serviceName_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public final boolean isInitialized() {
      byte isInitialized = this.memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
      } else if (isInitialized == 0) {
        return false;
      } else {
        this.memoizedIsInitialized = 1;
        return true;
      }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
      if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
        GeneratedMessageV3.writeString(output, 1, this.serviceName_);
      }

      this.getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = this.memoizedSize;
      if (size != -1) {
        return size;
      } else {
        size = 0;
        if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
          size += GeneratedMessageV3.computeStringSize(1, this.serviceName_);
        }

        size += this.getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
      }
    }

    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      } else if (!(obj instanceof ServiceDiscoveryOuter.GetServiceInstancesRequest)) {
        return super.equals(obj);
      } else {
        ServiceDiscoveryOuter.GetServiceInstancesRequest other = (ServiceDiscoveryOuter.GetServiceInstancesRequest)obj;
        if (!this.getServiceName().equals(other.getServiceName())) {
          return false;
        } else {
          return this.getUnknownFields().equals(other.getUnknownFields());
        }
      }
    }

    public int hashCode() {
      if (this.memoizedHashCode != 0) {
        return this.memoizedHashCode;
      } else {
        int hash = 41;
        int hash = 19 * hash + getDescriptor().hashCode();
        hash = 37 * hash + 1;
        hash = 53 * hash + this.getServiceName().hashCode();
        hash = 29 * hash + this.getUnknownFields().hashCode();
        this.memoizedHashCode = hash;
        return hash;
      }
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseDelimitedFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(CodedInputStream input) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.GetServiceInstancesRequest)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder newBuilderForType() {
      return newBuilder();
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder newBuilder(ServiceDiscoveryOuter.GetServiceInstancesRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder() : (new ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder()).mergeFrom(this);
    }

    protected ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder newBuilderForType(BuilderParent parent) {
      ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder builder = new ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder(parent);
      return builder;
    }

    public static ServiceDiscoveryOuter.GetServiceInstancesRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static Parser<ServiceDiscoveryOuter.GetServiceInstancesRequest> parser() {
      return PARSER;
    }

    public Parser<ServiceDiscoveryOuter.GetServiceInstancesRequest> getParserForType() {
      return PARSER;
    }

    public ServiceDiscoveryOuter.GetServiceInstancesRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder> implements ServiceDiscoveryOuter.GetServiceInstancesRequestOrBuilder {
      private Object serviceName_;

      public static final Descriptor getDescriptor() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesRequest_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.GetServiceInstancesRequest.class, ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder.class);
      }

      private Builder() {
        this.serviceName_ = "";
      }

      private Builder(BuilderParent parent) {
        super(parent);
        this.serviceName_ = "";
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder clear() {
        super.clear();
        this.serviceName_ = "";
        return this;
      }

      public Descriptor getDescriptorForType() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_GetServiceInstancesRequest_descriptor;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest getDefaultInstanceForType() {
        return ServiceDiscoveryOuter.GetServiceInstancesRequest.getDefaultInstance();
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest build() {
        ServiceDiscoveryOuter.GetServiceInstancesRequest result = this.buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        } else {
          return result;
        }
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest buildPartial() {
        ServiceDiscoveryOuter.GetServiceInstancesRequest result = new ServiceDiscoveryOuter.GetServiceInstancesRequest(this);
        result.serviceName_ = this.serviceName_;
        this.onBuilt();
        return result;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder clone() {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.clone();
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder setField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.setField(field, value);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder clearField(FieldDescriptor field) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.clearField(field);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder clearOneof(OneofDescriptor oneof) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.clearOneof(oneof);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.setRepeatedField(field, index, value);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder addRepeatedField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.addRepeatedField(field, value);
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder mergeFrom(Message other) {
        if (other instanceof ServiceDiscoveryOuter.GetServiceInstancesRequest) {
          return this.mergeFrom((ServiceDiscoveryOuter.GetServiceInstancesRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder mergeFrom(ServiceDiscoveryOuter.GetServiceInstancesRequest other) {
        if (other == ServiceDiscoveryOuter.GetServiceInstancesRequest.getDefaultInstance()) {
          return this;
        } else {
          if (!other.getServiceName().isEmpty()) {
            this.serviceName_ = other.serviceName_;
            this.onChanged();
          }

          this.mergeUnknownFields(other.getUnknownFields());
          this.onChanged();
          return this;
        }
      }

      public final boolean isInitialized() {
        return true;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        } else {
          try {
            boolean done = false;

            while(!done) {
              int tag = input.readTag();
              switch(tag) {
              case 0:
                done = true;
                break;
              case 10:
                this.serviceName_ = input.readStringRequireUtf8();
                break;
              default:
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true;
                }
              }
            }
          } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
          } finally {
            this.onChanged();
          }

          return this;
        }
      }

      public String getServiceName() {
        Object ref = this.serviceName_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.serviceName_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getServiceNameBytes() {
        Object ref = this.serviceName_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.serviceName_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder setServiceName(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.serviceName_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder clearServiceName() {
        this.serviceName_ = ServiceDiscoveryOuter.GetServiceInstancesRequest.getDefaultInstance().getServiceName();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder setServiceNameBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.GetServiceInstancesRequest.checkByteStringIsUtf8(value);
          this.serviceName_ = value;
          this.onChanged();
          return this;
        }
      }

      public final ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.setUnknownFields(unknownFields);
      }

      public final ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.GetServiceInstancesRequest.Builder)super.mergeUnknownFields(unknownFields);
      }
    }
  }

  public interface GetServiceInstancesRequestOrBuilder extends MessageOrBuilder {
    String getServiceName();

    ByteString getServiceNameBytes();
  }

  public static final class Response extends GeneratedMessageV3 implements ServiceDiscoveryOuter.ResponseOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile Object message_;
    private byte memoizedIsInitialized;
    private static final ServiceDiscoveryOuter.Response DEFAULT_INSTANCE = new ServiceDiscoveryOuter.Response();
    private static final Parser<ServiceDiscoveryOuter.Response> PARSER = new AbstractParser<ServiceDiscoveryOuter.Response>() {
      public ServiceDiscoveryOuter.Response parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        ServiceDiscoveryOuter.Response.Builder builder = ServiceDiscoveryOuter.Response.newBuilder();

        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (InvalidProtocolBufferException var5) {
          throw var5.setUnfinishedMessage(builder.buildPartial());
        } catch (UninitializedMessageException var6) {
          throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (IOException var7) {
          throw (new InvalidProtocolBufferException(var7)).setUnfinishedMessage(builder.buildPartial());
        }

        return builder.buildPartial();
      }
    };

    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
      this.memoizedIsInitialized = -1;
    }

    private Response() {
      this.memoizedIsInitialized = -1;
      this.message_ = "";
    }

    protected Object newInstance(UnusedPrivateParameter unused) {
      return new ServiceDiscoveryOuter.Response();
    }

    public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    public static final Descriptor getDescriptor() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_Response_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.Response.class, ServiceDiscoveryOuter.Response.Builder.class);
    }

    public int getCode() {
      return this.code_;
    }

    public String getMessage() {
      Object ref = this.message_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.message_ = s;
        return s;
      }
    }

    public ByteString getMessageBytes() {
      Object ref = this.message_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.message_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public final boolean isInitialized() {
      byte isInitialized = this.memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
      } else if (isInitialized == 0) {
        return false;
      } else {
        this.memoizedIsInitialized = 1;
        return true;
      }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
      if (this.code_ != 0) {
        output.writeInt32(1, this.code_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.message_)) {
        GeneratedMessageV3.writeString(output, 2, this.message_);
      }

      this.getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = this.memoizedSize;
      if (size != -1) {
        return size;
      } else {
        size = 0;
        if (this.code_ != 0) {
          size += CodedOutputStream.computeInt32Size(1, this.code_);
        }

        if (!GeneratedMessageV3.isStringEmpty(this.message_)) {
          size += GeneratedMessageV3.computeStringSize(2, this.message_);
        }

        size += this.getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
      }
    }

    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      } else if (!(obj instanceof ServiceDiscoveryOuter.Response)) {
        return super.equals(obj);
      } else {
        ServiceDiscoveryOuter.Response other = (ServiceDiscoveryOuter.Response)obj;
        if (this.getCode() != other.getCode()) {
          return false;
        } else if (!this.getMessage().equals(other.getMessage())) {
          return false;
        } else {
          return this.getUnknownFields().equals(other.getUnknownFields());
        }
      }
    }

    public int hashCode() {
      if (this.memoizedHashCode != 0) {
        return this.memoizedHashCode;
      } else {
        int hash = 41;
        int hash = 19 * hash + getDescriptor().hashCode();
        hash = 37 * hash + 1;
        hash = 53 * hash + this.getCode();
        hash = 37 * hash + 2;
        hash = 53 * hash + this.getMessage().hashCode();
        hash = 29 * hash + this.getUnknownFields().hashCode();
        this.memoizedHashCode = hash;
        return hash;
      }
    }

    public static ServiceDiscoveryOuter.Response parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Response)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Response)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(ByteString data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Response)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Response)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(byte[] data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Response)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Response)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.Response)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.Response)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Response parseDelimitedFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.Response)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.Response parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.Response)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(CodedInputStream input) throws IOException {
      return (ServiceDiscoveryOuter.Response)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.Response parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.Response)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public ServiceDiscoveryOuter.Response.Builder newBuilderForType() {
      return newBuilder();
    }

    public static ServiceDiscoveryOuter.Response.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static ServiceDiscoveryOuter.Response.Builder newBuilder(ServiceDiscoveryOuter.Response prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public ServiceDiscoveryOuter.Response.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServiceDiscoveryOuter.Response.Builder() : (new ServiceDiscoveryOuter.Response.Builder()).mergeFrom(this);
    }

    protected ServiceDiscoveryOuter.Response.Builder newBuilderForType(BuilderParent parent) {
      ServiceDiscoveryOuter.Response.Builder builder = new ServiceDiscoveryOuter.Response.Builder(parent);
      return builder;
    }

    public static ServiceDiscoveryOuter.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static Parser<ServiceDiscoveryOuter.Response> parser() {
      return PARSER;
    }

    public Parser<ServiceDiscoveryOuter.Response> getParserForType() {
      return PARSER;
    }

    public ServiceDiscoveryOuter.Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<ServiceDiscoveryOuter.Response.Builder> implements ServiceDiscoveryOuter.ResponseOrBuilder {
      private int code_;
      private Object message_;

      public static final Descriptor getDescriptor() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_Response_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.Response.class, ServiceDiscoveryOuter.Response.Builder.class);
      }

      private Builder() {
        this.message_ = "";
      }

      private Builder(BuilderParent parent) {
        super(parent);
        this.message_ = "";
      }

      public ServiceDiscoveryOuter.Response.Builder clear() {
        super.clear();
        this.code_ = 0;
        this.message_ = "";
        return this;
      }

      public Descriptor getDescriptorForType() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_Response_descriptor;
      }

      public ServiceDiscoveryOuter.Response getDefaultInstanceForType() {
        return ServiceDiscoveryOuter.Response.getDefaultInstance();
      }

      public ServiceDiscoveryOuter.Response build() {
        ServiceDiscoveryOuter.Response result = this.buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        } else {
          return result;
        }
      }

      public ServiceDiscoveryOuter.Response buildPartial() {
        ServiceDiscoveryOuter.Response result = new ServiceDiscoveryOuter.Response(this);
        result.code_ = this.code_;
        result.message_ = this.message_;
        this.onBuilt();
        return result;
      }

      public ServiceDiscoveryOuter.Response.Builder clone() {
        return (ServiceDiscoveryOuter.Response.Builder)super.clone();
      }

      public ServiceDiscoveryOuter.Response.Builder setField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.Response.Builder)super.setField(field, value);
      }

      public ServiceDiscoveryOuter.Response.Builder clearField(FieldDescriptor field) {
        return (ServiceDiscoveryOuter.Response.Builder)super.clearField(field);
      }

      public ServiceDiscoveryOuter.Response.Builder clearOneof(OneofDescriptor oneof) {
        return (ServiceDiscoveryOuter.Response.Builder)super.clearOneof(oneof);
      }

      public ServiceDiscoveryOuter.Response.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
        return (ServiceDiscoveryOuter.Response.Builder)super.setRepeatedField(field, index, value);
      }

      public ServiceDiscoveryOuter.Response.Builder addRepeatedField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.Response.Builder)super.addRepeatedField(field, value);
      }

      public ServiceDiscoveryOuter.Response.Builder mergeFrom(Message other) {
        if (other instanceof ServiceDiscoveryOuter.Response) {
          return this.mergeFrom((ServiceDiscoveryOuter.Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public ServiceDiscoveryOuter.Response.Builder mergeFrom(ServiceDiscoveryOuter.Response other) {
        if (other == ServiceDiscoveryOuter.Response.getDefaultInstance()) {
          return this;
        } else {
          if (other.getCode() != 0) {
            this.setCode(other.getCode());
          }

          if (!other.getMessage().isEmpty()) {
            this.message_ = other.message_;
            this.onChanged();
          }

          this.mergeUnknownFields(other.getUnknownFields());
          this.onChanged();
          return this;
        }
      }

      public final boolean isInitialized() {
        return true;
      }

      public ServiceDiscoveryOuter.Response.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        } else {
          try {
            boolean done = false;

            while(!done) {
              int tag = input.readTag();
              switch(tag) {
              case 0:
                done = true;
                break;
              case 8:
                this.code_ = input.readInt32();
                break;
              case 18:
                this.message_ = input.readStringRequireUtf8();
                break;
              default:
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true;
                }
              }
            }
          } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
          } finally {
            this.onChanged();
          }

          return this;
        }
      }

      public int getCode() {
        return this.code_;
      }

      public ServiceDiscoveryOuter.Response.Builder setCode(int value) {
        this.code_ = value;
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.Response.Builder clearCode() {
        this.code_ = 0;
        this.onChanged();
        return this;
      }

      public String getMessage() {
        Object ref = this.message_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.message_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getMessageBytes() {
        Object ref = this.message_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.message_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.Response.Builder setMessage(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.message_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.Response.Builder clearMessage() {
        this.message_ = ServiceDiscoveryOuter.Response.getDefaultInstance().getMessage();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.Response.Builder setMessageBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.Response.checkByteStringIsUtf8(value);
          this.message_ = value;
          this.onChanged();
          return this;
        }
      }

      public final ServiceDiscoveryOuter.Response.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.Response.Builder)super.setUnknownFields(unknownFields);
      }

      public final ServiceDiscoveryOuter.Response.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.Response.Builder)super.mergeUnknownFields(unknownFields);
      }
    }
  }

  public interface ResponseOrBuilder extends MessageOrBuilder {
    int getCode();

    String getMessage();

    ByteString getMessageBytes();
  }

  public static final class HeartBeat extends GeneratedMessageV3 implements ServiceDiscoveryOuter.HeartBeatOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int ID_FIELD_NUMBER = 1;
    private volatile Object id_;
    public static final int SERVICENAME_FIELD_NUMBER = 2;
    private volatile Object serviceName_;
    public static final int HOST_FIELD_NUMBER = 3;
    private volatile Object host_;
    public static final int PORT_FIELD_NUMBER = 4;
    private int port_;
    private byte memoizedIsInitialized;
    private static final ServiceDiscoveryOuter.HeartBeat DEFAULT_INSTANCE = new ServiceDiscoveryOuter.HeartBeat();
    private static final Parser<ServiceDiscoveryOuter.HeartBeat> PARSER = new AbstractParser<ServiceDiscoveryOuter.HeartBeat>() {
      public ServiceDiscoveryOuter.HeartBeat parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        ServiceDiscoveryOuter.HeartBeat.Builder builder = ServiceDiscoveryOuter.HeartBeat.newBuilder();

        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (InvalidProtocolBufferException var5) {
          throw var5.setUnfinishedMessage(builder.buildPartial());
        } catch (UninitializedMessageException var6) {
          throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (IOException var7) {
          throw (new InvalidProtocolBufferException(var7)).setUnfinishedMessage(builder.buildPartial());
        }

        return builder.buildPartial();
      }
    };

    private HeartBeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
      this.memoizedIsInitialized = -1;
    }

    private HeartBeat() {
      this.memoizedIsInitialized = -1;
      this.id_ = "";
      this.serviceName_ = "";
      this.host_ = "";
    }

    protected Object newInstance(UnusedPrivateParameter unused) {
      return new ServiceDiscoveryOuter.HeartBeat();
    }

    public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    public static final Descriptor getDescriptor() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_HeartBeat_descriptor;
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_HeartBeat_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.HeartBeat.class, ServiceDiscoveryOuter.HeartBeat.Builder.class);
    }

    public String getId() {
      Object ref = this.id_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.id_ = s;
        return s;
      }
    }

    public ByteString getIdBytes() {
      Object ref = this.id_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.id_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public String getServiceName() {
      Object ref = this.serviceName_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.serviceName_ = s;
        return s;
      }
    }

    public ByteString getServiceNameBytes() {
      Object ref = this.serviceName_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.serviceName_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public String getHost() {
      Object ref = this.host_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.host_ = s;
        return s;
      }
    }

    public ByteString getHostBytes() {
      Object ref = this.host_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.host_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public int getPort() {
      return this.port_;
    }

    public final boolean isInitialized() {
      byte isInitialized = this.memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
      } else if (isInitialized == 0) {
        return false;
      } else {
        this.memoizedIsInitialized = 1;
        return true;
      }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
        GeneratedMessageV3.writeString(output, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
        GeneratedMessageV3.writeString(output, 2, this.serviceName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.host_)) {
        GeneratedMessageV3.writeString(output, 3, this.host_);
      }

      if (this.port_ != 0) {
        output.writeInt32(4, this.port_);
      }

      this.getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = this.memoizedSize;
      if (size != -1) {
        return size;
      } else {
        size = 0;
        if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
          size += GeneratedMessageV3.computeStringSize(1, this.id_);
        }

        if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
          size += GeneratedMessageV3.computeStringSize(2, this.serviceName_);
        }

        if (!GeneratedMessageV3.isStringEmpty(this.host_)) {
          size += GeneratedMessageV3.computeStringSize(3, this.host_);
        }

        if (this.port_ != 0) {
          size += CodedOutputStream.computeInt32Size(4, this.port_);
        }

        size += this.getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
      }
    }

    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      } else if (!(obj instanceof ServiceDiscoveryOuter.HeartBeat)) {
        return super.equals(obj);
      } else {
        ServiceDiscoveryOuter.HeartBeat other = (ServiceDiscoveryOuter.HeartBeat)obj;
        if (!this.getId().equals(other.getId())) {
          return false;
        } else if (!this.getServiceName().equals(other.getServiceName())) {
          return false;
        } else if (!this.getHost().equals(other.getHost())) {
          return false;
        } else if (this.getPort() != other.getPort()) {
          return false;
        } else {
          return this.getUnknownFields().equals(other.getUnknownFields());
        }
      }
    }

    public int hashCode() {
      if (this.memoizedHashCode != 0) {
        return this.memoizedHashCode;
      } else {
        int hash = 41;
        int hash = 19 * hash + getDescriptor().hashCode();
        hash = 37 * hash + 1;
        hash = 53 * hash + this.getId().hashCode();
        hash = 37 * hash + 2;
        hash = 53 * hash + this.getServiceName().hashCode();
        hash = 37 * hash + 3;
        hash = 53 * hash + this.getHost().hashCode();
        hash = 37 * hash + 4;
        hash = 53 * hash + this.getPort();
        hash = 29 * hash + this.getUnknownFields().hashCode();
        this.memoizedHashCode = hash;
        return hash;
      }
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.HeartBeat)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.HeartBeat)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(ByteString data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.HeartBeat)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.HeartBeat)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(byte[] data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.HeartBeat)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.HeartBeat)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.HeartBeat)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.HeartBeat)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseDelimitedFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.HeartBeat)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.HeartBeat)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(CodedInputStream input) throws IOException {
      return (ServiceDiscoveryOuter.HeartBeat)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.HeartBeat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.HeartBeat)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public ServiceDiscoveryOuter.HeartBeat.Builder newBuilderForType() {
      return newBuilder();
    }

    public static ServiceDiscoveryOuter.HeartBeat.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static ServiceDiscoveryOuter.HeartBeat.Builder newBuilder(ServiceDiscoveryOuter.HeartBeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public ServiceDiscoveryOuter.HeartBeat.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServiceDiscoveryOuter.HeartBeat.Builder() : (new ServiceDiscoveryOuter.HeartBeat.Builder()).mergeFrom(this);
    }

    protected ServiceDiscoveryOuter.HeartBeat.Builder newBuilderForType(BuilderParent parent) {
      ServiceDiscoveryOuter.HeartBeat.Builder builder = new ServiceDiscoveryOuter.HeartBeat.Builder(parent);
      return builder;
    }

    public static ServiceDiscoveryOuter.HeartBeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static Parser<ServiceDiscoveryOuter.HeartBeat> parser() {
      return PARSER;
    }

    public Parser<ServiceDiscoveryOuter.HeartBeat> getParserForType() {
      return PARSER;
    }

    public ServiceDiscoveryOuter.HeartBeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<ServiceDiscoveryOuter.HeartBeat.Builder> implements ServiceDiscoveryOuter.HeartBeatOrBuilder {
      private Object id_;
      private Object serviceName_;
      private Object host_;
      private int port_;

      public static final Descriptor getDescriptor() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_HeartBeat_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_HeartBeat_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.HeartBeat.class, ServiceDiscoveryOuter.HeartBeat.Builder.class);
      }

      private Builder() {
        this.id_ = "";
        this.serviceName_ = "";
        this.host_ = "";
      }

      private Builder(BuilderParent parent) {
        super(parent);
        this.id_ = "";
        this.serviceName_ = "";
        this.host_ = "";
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clear() {
        super.clear();
        this.id_ = "";
        this.serviceName_ = "";
        this.host_ = "";
        this.port_ = 0;
        return this;
      }

      public Descriptor getDescriptorForType() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_HeartBeat_descriptor;
      }

      public ServiceDiscoveryOuter.HeartBeat getDefaultInstanceForType() {
        return ServiceDiscoveryOuter.HeartBeat.getDefaultInstance();
      }

      public ServiceDiscoveryOuter.HeartBeat build() {
        ServiceDiscoveryOuter.HeartBeat result = this.buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        } else {
          return result;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat buildPartial() {
        ServiceDiscoveryOuter.HeartBeat result = new ServiceDiscoveryOuter.HeartBeat(this);
        result.id_ = this.id_;
        result.serviceName_ = this.serviceName_;
        result.host_ = this.host_;
        result.port_ = this.port_;
        this.onBuilt();
        return result;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clone() {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.clone();
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.setField(field, value);
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clearField(FieldDescriptor field) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.clearField(field);
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clearOneof(OneofDescriptor oneof) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.clearOneof(oneof);
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.setRepeatedField(field, index, value);
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder addRepeatedField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.addRepeatedField(field, value);
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder mergeFrom(Message other) {
        if (other instanceof ServiceDiscoveryOuter.HeartBeat) {
          return this.mergeFrom((ServiceDiscoveryOuter.HeartBeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder mergeFrom(ServiceDiscoveryOuter.HeartBeat other) {
        if (other == ServiceDiscoveryOuter.HeartBeat.getDefaultInstance()) {
          return this;
        } else {
          if (!other.getId().isEmpty()) {
            this.id_ = other.id_;
            this.onChanged();
          }

          if (!other.getServiceName().isEmpty()) {
            this.serviceName_ = other.serviceName_;
            this.onChanged();
          }

          if (!other.getHost().isEmpty()) {
            this.host_ = other.host_;
            this.onChanged();
          }

          if (other.getPort() != 0) {
            this.setPort(other.getPort());
          }

          this.mergeUnknownFields(other.getUnknownFields());
          this.onChanged();
          return this;
        }
      }

      public final boolean isInitialized() {
        return true;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        } else {
          try {
            boolean done = false;

            while(!done) {
              int tag = input.readTag();
              switch(tag) {
              case 0:
                done = true;
                break;
              case 10:
                this.id_ = input.readStringRequireUtf8();
                break;
              case 18:
                this.serviceName_ = input.readStringRequireUtf8();
                break;
              case 26:
                this.host_ = input.readStringRequireUtf8();
                break;
              case 32:
                this.port_ = input.readInt32();
                break;
              default:
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true;
                }
              }
            }
          } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
          } finally {
            this.onChanged();
          }

          return this;
        }
      }

      public String getId() {
        Object ref = this.id_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.id_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getIdBytes() {
        Object ref = this.id_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.id_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setId(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.id_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clearId() {
        this.id_ = ServiceDiscoveryOuter.HeartBeat.getDefaultInstance().getId();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setIdBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.HeartBeat.checkByteStringIsUtf8(value);
          this.id_ = value;
          this.onChanged();
          return this;
        }
      }

      public String getServiceName() {
        Object ref = this.serviceName_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.serviceName_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getServiceNameBytes() {
        Object ref = this.serviceName_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.serviceName_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setServiceName(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.serviceName_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clearServiceName() {
        this.serviceName_ = ServiceDiscoveryOuter.HeartBeat.getDefaultInstance().getServiceName();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setServiceNameBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.HeartBeat.checkByteStringIsUtf8(value);
          this.serviceName_ = value;
          this.onChanged();
          return this;
        }
      }

      public String getHost() {
        Object ref = this.host_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.host_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getHostBytes() {
        Object ref = this.host_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.host_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setHost(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.host_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clearHost() {
        this.host_ = ServiceDiscoveryOuter.HeartBeat.getDefaultInstance().getHost();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setHostBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.HeartBeat.checkByteStringIsUtf8(value);
          this.host_ = value;
          this.onChanged();
          return this;
        }
      }

      public int getPort() {
        return this.port_;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder setPort(int value) {
        this.port_ = value;
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.HeartBeat.Builder clearPort() {
        this.port_ = 0;
        this.onChanged();
        return this;
      }

      public final ServiceDiscoveryOuter.HeartBeat.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.setUnknownFields(unknownFields);
      }

      public final ServiceDiscoveryOuter.HeartBeat.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.HeartBeat.Builder)super.mergeUnknownFields(unknownFields);
      }
    }
  }

  public interface HeartBeatOrBuilder extends MessageOrBuilder {
    String getId();

    ByteString getIdBytes();

    String getServiceName();

    ByteString getServiceNameBytes();

    String getHost();

    ByteString getHostBytes();

    int getPort();
  }

  public static final class Registration extends GeneratedMessageV3 implements ServiceDiscoveryOuter.RegistrationOrBuilder {
    private static final long serialVersionUID = 0L;
    public static final int ID_FIELD_NUMBER = 1;
    private volatile Object id_;
    public static final int SERVICENAME_FIELD_NUMBER = 2;
    private volatile Object serviceName_;
    public static final int HOST_FIELD_NUMBER = 3;
    private volatile Object host_;
    public static final int PORT_FIELD_NUMBER = 4;
    private int port_;
    public static final int METADATA_FIELD_NUMBER = 5;
    private MapField<String, String> metadata_;
    private byte memoizedIsInitialized;
    private static final ServiceDiscoveryOuter.Registration DEFAULT_INSTANCE = new ServiceDiscoveryOuter.Registration();
    private static final Parser<ServiceDiscoveryOuter.Registration> PARSER = new AbstractParser<ServiceDiscoveryOuter.Registration>() {
      public ServiceDiscoveryOuter.Registration parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        ServiceDiscoveryOuter.Registration.Builder builder = ServiceDiscoveryOuter.Registration.newBuilder();

        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (InvalidProtocolBufferException var5) {
          throw var5.setUnfinishedMessage(builder.buildPartial());
        } catch (UninitializedMessageException var6) {
          throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (IOException var7) {
          throw (new InvalidProtocolBufferException(var7)).setUnfinishedMessage(builder.buildPartial());
        }

        return builder.buildPartial();
      }
    };

    private Registration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
      this.memoizedIsInitialized = -1;
    }

    private Registration() {
      this.memoizedIsInitialized = -1;
      this.id_ = "";
      this.serviceName_ = "";
      this.host_ = "";
    }

    protected Object newInstance(UnusedPrivateParameter unused) {
      return new ServiceDiscoveryOuter.Registration();
    }

    public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    public static final Descriptor getDescriptor() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_Registration_descriptor;
    }

    protected MapField internalGetMapField(int number) {
      switch(number) {
      case 5:
        return this.internalGetMetadata();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceDiscoveryOuter.internal_static_service_discovery_Registration_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.Registration.class, ServiceDiscoveryOuter.Registration.Builder.class);
    }

    public String getId() {
      Object ref = this.id_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.id_ = s;
        return s;
      }
    }

    public ByteString getIdBytes() {
      Object ref = this.id_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.id_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public String getServiceName() {
      Object ref = this.serviceName_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.serviceName_ = s;
        return s;
      }
    }

    public ByteString getServiceNameBytes() {
      Object ref = this.serviceName_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.serviceName_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public String getHost() {
      Object ref = this.host_;
      if (ref instanceof String) {
        return (String)ref;
      } else {
        ByteString bs = (ByteString)ref;
        String s = bs.toStringUtf8();
        this.host_ = s;
        return s;
      }
    }

    public ByteString getHostBytes() {
      Object ref = this.host_;
      if (ref instanceof String) {
        ByteString b = ByteString.copyFromUtf8((String)ref);
        this.host_ = b;
        return b;
      } else {
        return (ByteString)ref;
      }
    }

    public int getPort() {
      return this.port_;
    }

    private MapField<String, String> internalGetMetadata() {
      return this.metadata_ == null ? MapField.emptyMapField(ServiceDiscoveryOuter.Registration.MetadataDefaultEntryHolder.defaultEntry) : this.metadata_;
    }

    public int getMetadataCount() {
      return this.internalGetMetadata().getMap().size();
    }

    public boolean containsMetadata(String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      } else {
        return this.internalGetMetadata().getMap().containsKey(key);
      }
    }

    /** @deprecated */
    @Deprecated
    public Map<String, String> getMetadata() {
      return this.getMetadataMap();
    }

    public Map<String, String> getMetadataMap() {
      return this.internalGetMetadata().getMap();
    }

    public String getMetadataOrDefault(String key, String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      } else {
        Map<String, String> map = this.internalGetMetadata().getMap();
        return map.containsKey(key) ? (String)map.get(key) : defaultValue;
      }
    }

    public String getMetadataOrThrow(String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      } else {
        Map<String, String> map = this.internalGetMetadata().getMap();
        if (!map.containsKey(key)) {
          throw new IllegalArgumentException();
        } else {
          return (String)map.get(key);
        }
      }
    }

    public final boolean isInitialized() {
      byte isInitialized = this.memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
      } else if (isInitialized == 0) {
        return false;
      } else {
        this.memoizedIsInitialized = 1;
        return true;
      }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
        GeneratedMessageV3.writeString(output, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
        GeneratedMessageV3.writeString(output, 2, this.serviceName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.host_)) {
        GeneratedMessageV3.writeString(output, 3, this.host_);
      }

      if (this.port_ != 0) {
        output.writeInt32(4, this.port_);
      }

      GeneratedMessageV3.serializeStringMapTo(output, this.internalGetMetadata(), ServiceDiscoveryOuter.Registration.MetadataDefaultEntryHolder.defaultEntry, 5);
      this.getUnknownFields().writeTo(output);
    }

    public int getSerializedSize() {
      int size = this.memoizedSize;
      if (size != -1) {
        return size;
      } else {
        size = 0;
        if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
          size += GeneratedMessageV3.computeStringSize(1, this.id_);
        }

        if (!GeneratedMessageV3.isStringEmpty(this.serviceName_)) {
          size += GeneratedMessageV3.computeStringSize(2, this.serviceName_);
        }

        if (!GeneratedMessageV3.isStringEmpty(this.host_)) {
          size += GeneratedMessageV3.computeStringSize(3, this.host_);
        }

        if (this.port_ != 0) {
          size += CodedOutputStream.computeInt32Size(4, this.port_);
        }

        MapEntry metadata__;
        for(Iterator var2 = this.internalGetMetadata().getMap().entrySet().iterator(); var2.hasNext(); size += CodedOutputStream.computeMessageSize(5, metadata__)) {
          Entry<String, String> entry = (Entry)var2.next();
          metadata__ = ServiceDiscoveryOuter.Registration.MetadataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
        }

        size += this.getUnknownFields().getSerializedSize();
        this.memoizedSize = size;
        return size;
      }
    }

    public boolean equals(Object obj) {
      if (obj == this) {
        return true;
      } else if (!(obj instanceof ServiceDiscoveryOuter.Registration)) {
        return super.equals(obj);
      } else {
        ServiceDiscoveryOuter.Registration other = (ServiceDiscoveryOuter.Registration)obj;
        if (!this.getId().equals(other.getId())) {
          return false;
        } else if (!this.getServiceName().equals(other.getServiceName())) {
          return false;
        } else if (!this.getHost().equals(other.getHost())) {
          return false;
        } else if (this.getPort() != other.getPort()) {
          return false;
        } else if (!this.internalGetMetadata().equals(other.internalGetMetadata())) {
          return false;
        } else {
          return this.getUnknownFields().equals(other.getUnknownFields());
        }
      }
    }

    public int hashCode() {
      if (this.memoizedHashCode != 0) {
        return this.memoizedHashCode;
      } else {
        int hash = 41;
        int hash = 19 * hash + getDescriptor().hashCode();
        hash = 37 * hash + 1;
        hash = 53 * hash + this.getId().hashCode();
        hash = 37 * hash + 2;
        hash = 53 * hash + this.getServiceName().hashCode();
        hash = 37 * hash + 3;
        hash = 53 * hash + this.getHost().hashCode();
        hash = 37 * hash + 4;
        hash = 53 * hash + this.getPort();
        if (!this.internalGetMetadata().getMap().isEmpty()) {
          hash = 37 * hash + 5;
          hash = 53 * hash + this.internalGetMetadata().hashCode();
        }

        hash = 29 * hash + this.getUnknownFields().hashCode();
        this.memoizedHashCode = hash;
        return hash;
      }
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Registration)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Registration)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(ByteString data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Registration)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Registration)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(byte[] data) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Registration)PARSER.parseFrom(data);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
      return (ServiceDiscoveryOuter.Registration)PARSER.parseFrom(data, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.Registration)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.Registration)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Registration parseDelimitedFrom(InputStream input) throws IOException {
      return (ServiceDiscoveryOuter.Registration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.Registration parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.Registration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(CodedInputStream input) throws IOException {
      return (ServiceDiscoveryOuter.Registration)GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static ServiceDiscoveryOuter.Registration parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
      return (ServiceDiscoveryOuter.Registration)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public ServiceDiscoveryOuter.Registration.Builder newBuilderForType() {
      return newBuilder();
    }

    public static ServiceDiscoveryOuter.Registration.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static ServiceDiscoveryOuter.Registration.Builder newBuilder(ServiceDiscoveryOuter.Registration prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public ServiceDiscoveryOuter.Registration.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServiceDiscoveryOuter.Registration.Builder() : (new ServiceDiscoveryOuter.Registration.Builder()).mergeFrom(this);
    }

    protected ServiceDiscoveryOuter.Registration.Builder newBuilderForType(BuilderParent parent) {
      ServiceDiscoveryOuter.Registration.Builder builder = new ServiceDiscoveryOuter.Registration.Builder(parent);
      return builder;
    }

    public static ServiceDiscoveryOuter.Registration getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static Parser<ServiceDiscoveryOuter.Registration> parser() {
      return PARSER;
    }

    public Parser<ServiceDiscoveryOuter.Registration> getParserForType() {
      return PARSER;
    }

    public ServiceDiscoveryOuter.Registration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<ServiceDiscoveryOuter.Registration.Builder> implements ServiceDiscoveryOuter.RegistrationOrBuilder {
      private int bitField0_;
      private Object id_;
      private Object serviceName_;
      private Object host_;
      private int port_;
      private MapField<String, String> metadata_;

      public static final Descriptor getDescriptor() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_Registration_descriptor;
      }

      protected MapField internalGetMapField(int number) {
        switch(number) {
        case 5:
          return this.internalGetMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      protected MapField internalGetMutableMapField(int number) {
        switch(number) {
        case 5:
          return this.internalGetMutableMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_Registration_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceDiscoveryOuter.Registration.class, ServiceDiscoveryOuter.Registration.Builder.class);
      }

      private Builder() {
        this.id_ = "";
        this.serviceName_ = "";
        this.host_ = "";
      }

      private Builder(BuilderParent parent) {
        super(parent);
        this.id_ = "";
        this.serviceName_ = "";
        this.host_ = "";
      }

      public ServiceDiscoveryOuter.Registration.Builder clear() {
        super.clear();
        this.id_ = "";
        this.serviceName_ = "";
        this.host_ = "";
        this.port_ = 0;
        this.internalGetMutableMetadata().clear();
        return this;
      }

      public Descriptor getDescriptorForType() {
        return ServiceDiscoveryOuter.internal_static_service_discovery_Registration_descriptor;
      }

      public ServiceDiscoveryOuter.Registration getDefaultInstanceForType() {
        return ServiceDiscoveryOuter.Registration.getDefaultInstance();
      }

      public ServiceDiscoveryOuter.Registration build() {
        ServiceDiscoveryOuter.Registration result = this.buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        } else {
          return result;
        }
      }

      public ServiceDiscoveryOuter.Registration buildPartial() {
        ServiceDiscoveryOuter.Registration result = new ServiceDiscoveryOuter.Registration(this);
        int from_bitField0_ = this.bitField0_;
        result.id_ = this.id_;
        result.serviceName_ = this.serviceName_;
        result.host_ = this.host_;
        result.port_ = this.port_;
        result.metadata_ = this.internalGetMetadata();
        result.metadata_.makeImmutable();
        this.onBuilt();
        return result;
      }

      public ServiceDiscoveryOuter.Registration.Builder clone() {
        return (ServiceDiscoveryOuter.Registration.Builder)super.clone();
      }

      public ServiceDiscoveryOuter.Registration.Builder setField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.setField(field, value);
      }

      public ServiceDiscoveryOuter.Registration.Builder clearField(FieldDescriptor field) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.clearField(field);
      }

      public ServiceDiscoveryOuter.Registration.Builder clearOneof(OneofDescriptor oneof) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.clearOneof(oneof);
      }

      public ServiceDiscoveryOuter.Registration.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.setRepeatedField(field, index, value);
      }

      public ServiceDiscoveryOuter.Registration.Builder addRepeatedField(FieldDescriptor field, Object value) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.addRepeatedField(field, value);
      }

      public ServiceDiscoveryOuter.Registration.Builder mergeFrom(Message other) {
        if (other instanceof ServiceDiscoveryOuter.Registration) {
          return this.mergeFrom((ServiceDiscoveryOuter.Registration)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder mergeFrom(ServiceDiscoveryOuter.Registration other) {
        if (other == ServiceDiscoveryOuter.Registration.getDefaultInstance()) {
          return this;
        } else {
          if (!other.getId().isEmpty()) {
            this.id_ = other.id_;
            this.onChanged();
          }

          if (!other.getServiceName().isEmpty()) {
            this.serviceName_ = other.serviceName_;
            this.onChanged();
          }

          if (!other.getHost().isEmpty()) {
            this.host_ = other.host_;
            this.onChanged();
          }

          if (other.getPort() != 0) {
            this.setPort(other.getPort());
          }

          this.internalGetMutableMetadata().mergeFrom(other.internalGetMetadata());
          this.mergeUnknownFields(other.getUnknownFields());
          this.onChanged();
          return this;
        }
      }

      public final boolean isInitialized() {
        return true;
      }

      public ServiceDiscoveryOuter.Registration.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        } else {
          try {
            boolean done = false;

            while(!done) {
              int tag = input.readTag();
              switch(tag) {
              case 0:
                done = true;
                break;
              case 10:
                this.id_ = input.readStringRequireUtf8();
                break;
              case 18:
                this.serviceName_ = input.readStringRequireUtf8();
                break;
              case 26:
                this.host_ = input.readStringRequireUtf8();
                break;
              case 32:
                this.port_ = input.readInt32();
                break;
              case 42:
                MapEntry<String, String> metadata__ = (MapEntry)input.readMessage(ServiceDiscoveryOuter.Registration.MetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                this.internalGetMutableMetadata().getMutableMap().put(metadata__.getKey(), metadata__.getValue());
                break;
              default:
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true;
                }
              }
            }
          } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
          } finally {
            this.onChanged();
          }

          return this;
        }
      }

      public String getId() {
        Object ref = this.id_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.id_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getIdBytes() {
        Object ref = this.id_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.id_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder setId(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.id_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder clearId() {
        this.id_ = ServiceDiscoveryOuter.Registration.getDefaultInstance().getId();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.Registration.Builder setIdBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.Registration.checkByteStringIsUtf8(value);
          this.id_ = value;
          this.onChanged();
          return this;
        }
      }

      public String getServiceName() {
        Object ref = this.serviceName_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.serviceName_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getServiceNameBytes() {
        Object ref = this.serviceName_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.serviceName_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder setServiceName(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.serviceName_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder clearServiceName() {
        this.serviceName_ = ServiceDiscoveryOuter.Registration.getDefaultInstance().getServiceName();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.Registration.Builder setServiceNameBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.Registration.checkByteStringIsUtf8(value);
          this.serviceName_ = value;
          this.onChanged();
          return this;
        }
      }

      public String getHost() {
        Object ref = this.host_;
        if (!(ref instanceof String)) {
          ByteString bs = (ByteString)ref;
          String s = bs.toStringUtf8();
          this.host_ = s;
          return s;
        } else {
          return (String)ref;
        }
      }

      public ByteString getHostBytes() {
        Object ref = this.host_;
        if (ref instanceof String) {
          ByteString b = ByteString.copyFromUtf8((String)ref);
          this.host_ = b;
          return b;
        } else {
          return (ByteString)ref;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder setHost(String value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          this.host_ = value;
          this.onChanged();
          return this;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder clearHost() {
        this.host_ = ServiceDiscoveryOuter.Registration.getDefaultInstance().getHost();
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.Registration.Builder setHostBytes(ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        } else {
          ServiceDiscoveryOuter.Registration.checkByteStringIsUtf8(value);
          this.host_ = value;
          this.onChanged();
          return this;
        }
      }

      public int getPort() {
        return this.port_;
      }

      public ServiceDiscoveryOuter.Registration.Builder setPort(int value) {
        this.port_ = value;
        this.onChanged();
        return this;
      }

      public ServiceDiscoveryOuter.Registration.Builder clearPort() {
        this.port_ = 0;
        this.onChanged();
        return this;
      }

      private MapField<String, String> internalGetMetadata() {
        return this.metadata_ == null ? MapField.emptyMapField(ServiceDiscoveryOuter.Registration.MetadataDefaultEntryHolder.defaultEntry) : this.metadata_;
      }

      private MapField<String, String> internalGetMutableMetadata() {
        this.onChanged();
        if (this.metadata_ == null) {
          this.metadata_ = MapField.newMapField(ServiceDiscoveryOuter.Registration.MetadataDefaultEntryHolder.defaultEntry);
        }

        if (!this.metadata_.isMutable()) {
          this.metadata_ = this.metadata_.copy();
        }

        return this.metadata_;
      }

      public int getMetadataCount() {
        return this.internalGetMetadata().getMap().size();
      }

      public boolean containsMetadata(String key) {
        if (key == null) {
          throw new NullPointerException("map key");
        } else {
          return this.internalGetMetadata().getMap().containsKey(key);
        }
      }

      /** @deprecated */
      @Deprecated
      public Map<String, String> getMetadata() {
        return this.getMetadataMap();
      }

      public Map<String, String> getMetadataMap() {
        return this.internalGetMetadata().getMap();
      }

      public String getMetadataOrDefault(String key, String defaultValue) {
        if (key == null) {
          throw new NullPointerException("map key");
        } else {
          Map<String, String> map = this.internalGetMetadata().getMap();
          return map.containsKey(key) ? (String)map.get(key) : defaultValue;
        }
      }

      public String getMetadataOrThrow(String key) {
        if (key == null) {
          throw new NullPointerException("map key");
        } else {
          Map<String, String> map = this.internalGetMetadata().getMap();
          if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
          } else {
            return (String)map.get(key);
          }
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder clearMetadata() {
        this.internalGetMutableMetadata().getMutableMap().clear();
        return this;
      }

      public ServiceDiscoveryOuter.Registration.Builder removeMetadata(String key) {
        if (key == null) {
          throw new NullPointerException("map key");
        } else {
          this.internalGetMutableMetadata().getMutableMap().remove(key);
          return this;
        }
      }

      /** @deprecated */
      @Deprecated
      public Map<String, String> getMutableMetadata() {
        return this.internalGetMutableMetadata().getMutableMap();
      }

      public ServiceDiscoveryOuter.Registration.Builder putMetadata(String key, String value) {
        if (key == null) {
          throw new NullPointerException("map key");
        } else if (value == null) {
          throw new NullPointerException("map value");
        } else {
          this.internalGetMutableMetadata().getMutableMap().put(key, value);
          return this;
        }
      }

      public ServiceDiscoveryOuter.Registration.Builder putAllMetadata(Map<String, String> values) {
        this.internalGetMutableMetadata().getMutableMap().putAll(values);
        return this;
      }

      public final ServiceDiscoveryOuter.Registration.Builder setUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.setUnknownFields(unknownFields);
      }

      public final ServiceDiscoveryOuter.Registration.Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
        return (ServiceDiscoveryOuter.Registration.Builder)super.mergeUnknownFields(unknownFields);
      }
    }

    private static final class MetadataDefaultEntryHolder {
      static final MapEntry<String, String> defaultEntry;

      private MetadataDefaultEntryHolder() {
      }

      static {
        defaultEntry = MapEntry.newDefaultInstance(ServiceDiscoveryOuter.internal_static_service_discovery_Registration_MetadataEntry_descriptor, FieldType.STRING, "", FieldType.STRING, "");
      }
    }
  }

  public interface RegistrationOrBuilder extends MessageOrBuilder {
    String getId();

    ByteString getIdBytes();

    String getServiceName();

    ByteString getServiceNameBytes();

    String getHost();

    ByteString getHostBytes();

    int getPort();

    int getMetadataCount();

    boolean containsMetadata(String var1);

    /** @deprecated */
    @Deprecated
    Map<String, String> getMetadata();

    Map<String, String> getMetadataMap();

    String getMetadataOrDefault(String var1, String var2);

    String getMetadataOrThrow(String var1);
  }
}
