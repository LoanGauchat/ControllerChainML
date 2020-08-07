// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chainML_service.proto

package com.chainML.pb;

/**
 * Protobuf type {@code chainML.TimeRequest}
 */
public final class TimeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chainML.TimeRequest)
    TimeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeRequest.newBuilder() to construct.
  private TimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeRequest() {
    device_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TimeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            time_ = input.readDouble();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            device_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.chainML.pb.ChainMLService.internal_static_chainML_TimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.chainML.pb.ChainMLService.internal_static_chainML_TimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.chainML.pb.TimeRequest.class, com.chainML.pb.TimeRequest.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private double time_;
  /**
   * <code>double time = 1;</code>
   * @return The time.
   */
  @java.lang.Override
  public double getTime() {
    return time_;
  }

  public static final int DEVICE_FIELD_NUMBER = 2;
  private volatile java.lang.Object device_;
  /**
   * <code>string device = 2;</code>
   * @return The device.
   */
  @java.lang.Override
  public java.lang.String getDevice() {
    java.lang.Object ref = device_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      device_ = s;
      return s;
    }
  }
  /**
   * <code>string device = 2;</code>
   * @return The bytes for device.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceBytes() {
    java.lang.Object ref = device_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      device_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (time_ != 0D) {
      output.writeDouble(1, time_);
    }
    if (!getDeviceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, device_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (time_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, time_);
    }
    if (!getDeviceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, device_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.chainML.pb.TimeRequest)) {
      return super.equals(obj);
    }
    com.chainML.pb.TimeRequest other = (com.chainML.pb.TimeRequest) obj;

    if (java.lang.Double.doubleToLongBits(getTime())
        != java.lang.Double.doubleToLongBits(
            other.getTime())) return false;
    if (!getDevice()
        .equals(other.getDevice())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTime()));
    hash = (37 * hash) + DEVICE_FIELD_NUMBER;
    hash = (53 * hash) + getDevice().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.chainML.pb.TimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainML.pb.TimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainML.pb.TimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainML.pb.TimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.chainML.pb.TimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainML.pb.TimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.chainML.pb.TimeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chainML.TimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chainML.TimeRequest)
      com.chainML.pb.TimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chainML.pb.ChainMLService.internal_static_chainML_TimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chainML.pb.ChainMLService.internal_static_chainML_TimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chainML.pb.TimeRequest.class, com.chainML.pb.TimeRequest.Builder.class);
    }

    // Construct using com.chainML.pb.TimeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      time_ = 0D;

      device_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.chainML.pb.ChainMLService.internal_static_chainML_TimeRequest_descriptor;
    }

    @java.lang.Override
    public com.chainML.pb.TimeRequest getDefaultInstanceForType() {
      return com.chainML.pb.TimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.chainML.pb.TimeRequest build() {
      com.chainML.pb.TimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.chainML.pb.TimeRequest buildPartial() {
      com.chainML.pb.TimeRequest result = new com.chainML.pb.TimeRequest(this);
      result.time_ = time_;
      result.device_ = device_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.chainML.pb.TimeRequest) {
        return mergeFrom((com.chainML.pb.TimeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.chainML.pb.TimeRequest other) {
      if (other == com.chainML.pb.TimeRequest.getDefaultInstance()) return this;
      if (other.getTime() != 0D) {
        setTime(other.getTime());
      }
      if (!other.getDevice().isEmpty()) {
        device_ = other.device_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.chainML.pb.TimeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.chainML.pb.TimeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double time_ ;
    /**
     * <code>double time = 1;</code>
     * @return The time.
     */
    @java.lang.Override
    public double getTime() {
      return time_;
    }
    /**
     * <code>double time = 1;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(double value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object device_ = "";
    /**
     * <code>string device = 2;</code>
     * @return The device.
     */
    public java.lang.String getDevice() {
      java.lang.Object ref = device_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        device_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string device = 2;</code>
     * @return The bytes for device.
     */
    public com.google.protobuf.ByteString
        getDeviceBytes() {
      java.lang.Object ref = device_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        device_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string device = 2;</code>
     * @param value The device to set.
     * @return This builder for chaining.
     */
    public Builder setDevice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      device_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string device = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevice() {
      
      device_ = getDefaultInstance().getDevice();
      onChanged();
      return this;
    }
    /**
     * <code>string device = 2;</code>
     * @param value The bytes for device to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      device_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:chainML.TimeRequest)
  }

  // @@protoc_insertion_point(class_scope:chainML.TimeRequest)
  private static final com.chainML.pb.TimeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.chainML.pb.TimeRequest();
  }

  public static com.chainML.pb.TimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeRequest>
      PARSER = new com.google.protobuf.AbstractParser<TimeRequest>() {
    @java.lang.Override
    public TimeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TimeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.chainML.pb.TimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

