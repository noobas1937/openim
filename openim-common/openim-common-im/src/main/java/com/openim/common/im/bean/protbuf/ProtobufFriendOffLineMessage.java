// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendOffLineMessage.proto

package com.openim.common.im.bean.protbuf;

public final class ProtobufFriendOffLineMessage {
  private ProtobufFriendOffLineMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FriendOffLineMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string loginId = 1;
    boolean hasLoginId();
    String getLoginId();
    
    // optional string friendLoginId = 2;
    boolean hasFriendLoginId();
    String getFriendLoginId();
  }
  public static final class FriendOffLineMessage extends
      com.google.protobuf.GeneratedMessage
      implements FriendOffLineMessageOrBuilder {
    // Use FriendOffLineMessage.newBuilder() to construct.
    private FriendOffLineMessage(Builder builder) {
      super(builder);
    }
    private FriendOffLineMessage(boolean noInit) {}
    
    private static final FriendOffLineMessage defaultInstance;
    public static FriendOffLineMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public FriendOffLineMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string loginId = 1;
    public static final int LOGINID_FIELD_NUMBER = 1;
    private java.lang.Object loginId_;
    public boolean hasLoginId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getLoginId() {
      java.lang.Object ref = loginId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          loginId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLoginIdBytes() {
      java.lang.Object ref = loginId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        loginId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string friendLoginId = 2;
    public static final int FRIENDLOGINID_FIELD_NUMBER = 2;
    private java.lang.Object friendLoginId_;
    public boolean hasFriendLoginId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getFriendLoginId() {
      java.lang.Object ref = friendLoginId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          friendLoginId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFriendLoginIdBytes() {
      java.lang.Object ref = friendLoginId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        friendLoginId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      loginId_ = "";
      friendLoginId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getLoginIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getFriendLoginIdBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getLoginIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFriendLoginIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_fieldAccessorTable;
      }
      
      // Construct using com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        loginId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        friendLoginId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage.getDescriptor();
      }
      
      public com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage getDefaultInstanceForType() {
        return com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage.getDefaultInstance();
      }
      
      public com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage build() {
        com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage buildPartial() {
        com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage result = new com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.loginId_ = loginId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.friendLoginId_ = friendLoginId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage) {
          return mergeFrom((com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage other) {
        if (other == com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage.getDefaultInstance()) return this;
        if (other.hasLoginId()) {
          setLoginId(other.getLoginId());
        }
        if (other.hasFriendLoginId()) {
          setFriendLoginId(other.getFriendLoginId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              loginId_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              friendLoginId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string loginId = 1;
      private java.lang.Object loginId_ = "";
      public boolean hasLoginId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getLoginId() {
        java.lang.Object ref = loginId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          loginId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLoginId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        loginId_ = value;
        onChanged();
        return this;
      }
      public Builder clearLoginId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        loginId_ = getDefaultInstance().getLoginId();
        onChanged();
        return this;
      }
      void setLoginId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        loginId_ = value;
        onChanged();
      }
      
      // optional string friendLoginId = 2;
      private java.lang.Object friendLoginId_ = "";
      public boolean hasFriendLoginId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getFriendLoginId() {
        java.lang.Object ref = friendLoginId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          friendLoginId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFriendLoginId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        friendLoginId_ = value;
        onChanged();
        return this;
      }
      public Builder clearFriendLoginId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        friendLoginId_ = getDefaultInstance().getFriendLoginId();
        onChanged();
        return this;
      }
      void setFriendLoginId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        friendLoginId_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.openim.common.im.bean.protbuf.FriendOffLineMessage)
    }
    
    static {
      defaultInstance = new FriendOffLineMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.openim.common.im.bean.protbuf.FriendOffLineMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032FriendOffLineMessage.proto\022!com.openim" +
      ".common.im.bean.protbuf\">\n\024FriendOffLine" +
      "Message\022\017\n\007loginId\030\001 \001(\t\022\025\n\rfriendLoginI" +
      "d\030\002 \001(\tB\036B\034ProtobufFriendOffLineMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_openim_common_im_bean_protbuf_FriendOffLineMessage_descriptor,
              new java.lang.String[] { "LoginId", "FriendLoginId", },
              com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage.class,
              com.openim.common.im.bean.protbuf.ProtobufFriendOffLineMessage.FriendOffLineMessage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
