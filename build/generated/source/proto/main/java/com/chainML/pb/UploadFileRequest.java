// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chainML_service.proto

package com.chainML.pb;

/**
 * Protobuf type {@code chainML.UploadFileRequest}
 */
public final class UploadFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chainML.UploadFileRequest)
    UploadFileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadFileRequest.newBuilder() to construct.
  private UploadFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadFileRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UploadFileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UploadFileRequest(
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
          case 10: {
            com.chainML.pb.FileInfo.Builder subBuilder = null;
            if (dataCase_ == 1) {
              subBuilder = ((com.chainML.pb.FileInfo) data_).toBuilder();
            }
            data_ =
                input.readMessage(com.chainML.pb.FileInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.chainML.pb.FileInfo) data_);
              data_ = subBuilder.buildPartial();
            }
            dataCase_ = 1;
            break;
          }
          case 18: {
            dataCase_ = 2;
            data_ = input.readBytes();
            break;
          }
          case 26: {
            com.chainML.pb.TypeFile.Builder subBuilder = null;
            if (typeFile_ != null) {
              subBuilder = typeFile_.toBuilder();
            }
            typeFile_ = input.readMessage(com.chainML.pb.TypeFile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(typeFile_);
              typeFile_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            com.chainML.pb.FileName.Builder subBuilder = null;
            if (fileName_ != null) {
              subBuilder = fileName_.toBuilder();
            }
            fileName_ = input.readMessage(com.chainML.pb.FileName.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fileName_);
              fileName_ = subBuilder.buildPartial();
            }

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
    return com.chainML.pb.ChainMLService.internal_static_chainML_UploadFileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.chainML.pb.ChainMLService.internal_static_chainML_UploadFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.chainML.pb.UploadFileRequest.class, com.chainML.pb.UploadFileRequest.Builder.class);
  }

  private int dataCase_ = 0;
  private java.lang.Object data_;
  public enum DataCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INFO(1),
    CHUNK_DATA(2),
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 1: return INFO;
        case 2: return CHUNK_DATA;
        case 0: return DATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataCase
  getDataCase() {
    return DataCase.forNumber(
        dataCase_);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  /**
   * <code>.chainML.FileInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return dataCase_ == 1;
  }
  /**
   * <code>.chainML.FileInfo info = 1;</code>
   * @return The info.
   */
  @java.lang.Override
  public com.chainML.pb.FileInfo getInfo() {
    if (dataCase_ == 1) {
       return (com.chainML.pb.FileInfo) data_;
    }
    return com.chainML.pb.FileInfo.getDefaultInstance();
  }
  /**
   * <code>.chainML.FileInfo info = 1;</code>
   */
  @java.lang.Override
  public com.chainML.pb.FileInfoOrBuilder getInfoOrBuilder() {
    if (dataCase_ == 1) {
       return (com.chainML.pb.FileInfo) data_;
    }
    return com.chainML.pb.FileInfo.getDefaultInstance();
  }

  public static final int CHUNK_DATA_FIELD_NUMBER = 2;
  /**
   * <code>bytes chunk_data = 2;</code>
   * @return The chunkData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getChunkData() {
    if (dataCase_ == 2) {
      return (com.google.protobuf.ByteString) data_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int TYPE_FILE_FIELD_NUMBER = 3;
  private com.chainML.pb.TypeFile typeFile_;
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   * @return Whether the typeFile field is set.
   */
  @java.lang.Override
  public boolean hasTypeFile() {
    return typeFile_ != null;
  }
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   * @return The typeFile.
   */
  @java.lang.Override
  public com.chainML.pb.TypeFile getTypeFile() {
    return typeFile_ == null ? com.chainML.pb.TypeFile.getDefaultInstance() : typeFile_;
  }
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   */
  @java.lang.Override
  public com.chainML.pb.TypeFileOrBuilder getTypeFileOrBuilder() {
    return getTypeFile();
  }

  public static final int FILE_NAME_FIELD_NUMBER = 4;
  private com.chainML.pb.FileName fileName_;
  /**
   * <code>.chainML.FileName file_name = 4;</code>
   * @return Whether the fileName field is set.
   */
  @java.lang.Override
  public boolean hasFileName() {
    return fileName_ != null;
  }
  /**
   * <code>.chainML.FileName file_name = 4;</code>
   * @return The fileName.
   */
  @java.lang.Override
  public com.chainML.pb.FileName getFileName() {
    return fileName_ == null ? com.chainML.pb.FileName.getDefaultInstance() : fileName_;
  }
  /**
   * <code>.chainML.FileName file_name = 4;</code>
   */
  @java.lang.Override
  public com.chainML.pb.FileNameOrBuilder getFileNameOrBuilder() {
    return getFileName();
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
    if (dataCase_ == 1) {
      output.writeMessage(1, (com.chainML.pb.FileInfo) data_);
    }
    if (dataCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) data_);
    }
    if (typeFile_ != null) {
      output.writeMessage(3, getTypeFile());
    }
    if (fileName_ != null) {
      output.writeMessage(4, getFileName());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.chainML.pb.FileInfo) data_);
    }
    if (dataCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) data_);
    }
    if (typeFile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTypeFile());
    }
    if (fileName_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFileName());
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
    if (!(obj instanceof com.chainML.pb.UploadFileRequest)) {
      return super.equals(obj);
    }
    com.chainML.pb.UploadFileRequest other = (com.chainML.pb.UploadFileRequest) obj;

    if (hasTypeFile() != other.hasTypeFile()) return false;
    if (hasTypeFile()) {
      if (!getTypeFile()
          .equals(other.getTypeFile())) return false;
    }
    if (hasFileName() != other.hasFileName()) return false;
    if (hasFileName()) {
      if (!getFileName()
          .equals(other.getFileName())) return false;
    }
    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 1:
        if (!getInfo()
            .equals(other.getInfo())) return false;
        break;
      case 2:
        if (!getChunkData()
            .equals(other.getChunkData())) return false;
        break;
      case 0:
      default:
    }
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
    if (hasTypeFile()) {
      hash = (37 * hash) + TYPE_FILE_FIELD_NUMBER;
      hash = (53 * hash) + getTypeFile().hashCode();
    }
    if (hasFileName()) {
      hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFileName().hashCode();
    }
    switch (dataCase_) {
      case 1:
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CHUNK_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getChunkData().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.chainML.pb.UploadFileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainML.pb.UploadFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.chainML.pb.UploadFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainML.pb.UploadFileRequest parseFrom(
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
  public static Builder newBuilder(com.chainML.pb.UploadFileRequest prototype) {
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
   * Protobuf type {@code chainML.UploadFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chainML.UploadFileRequest)
      com.chainML.pb.UploadFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chainML.pb.ChainMLService.internal_static_chainML_UploadFileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chainML.pb.ChainMLService.internal_static_chainML_UploadFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chainML.pb.UploadFileRequest.class, com.chainML.pb.UploadFileRequest.Builder.class);
    }

    // Construct using com.chainML.pb.UploadFileRequest.newBuilder()
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
      if (typeFileBuilder_ == null) {
        typeFile_ = null;
      } else {
        typeFile_ = null;
        typeFileBuilder_ = null;
      }
      if (fileNameBuilder_ == null) {
        fileName_ = null;
      } else {
        fileName_ = null;
        fileNameBuilder_ = null;
      }
      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.chainML.pb.ChainMLService.internal_static_chainML_UploadFileRequest_descriptor;
    }

    @java.lang.Override
    public com.chainML.pb.UploadFileRequest getDefaultInstanceForType() {
      return com.chainML.pb.UploadFileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.chainML.pb.UploadFileRequest build() {
      com.chainML.pb.UploadFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.chainML.pb.UploadFileRequest buildPartial() {
      com.chainML.pb.UploadFileRequest result = new com.chainML.pb.UploadFileRequest(this);
      if (dataCase_ == 1) {
        if (infoBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = infoBuilder_.build();
        }
      }
      if (dataCase_ == 2) {
        result.data_ = data_;
      }
      if (typeFileBuilder_ == null) {
        result.typeFile_ = typeFile_;
      } else {
        result.typeFile_ = typeFileBuilder_.build();
      }
      if (fileNameBuilder_ == null) {
        result.fileName_ = fileName_;
      } else {
        result.fileName_ = fileNameBuilder_.build();
      }
      result.dataCase_ = dataCase_;
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
      if (other instanceof com.chainML.pb.UploadFileRequest) {
        return mergeFrom((com.chainML.pb.UploadFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.chainML.pb.UploadFileRequest other) {
      if (other == com.chainML.pb.UploadFileRequest.getDefaultInstance()) return this;
      if (other.hasTypeFile()) {
        mergeTypeFile(other.getTypeFile());
      }
      if (other.hasFileName()) {
        mergeFileName(other.getFileName());
      }
      switch (other.getDataCase()) {
        case INFO: {
          mergeInfo(other.getInfo());
          break;
        }
        case CHUNK_DATA: {
          setChunkData(other.getChunkData());
          break;
        }
        case DATA_NOT_SET: {
          break;
        }
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
      com.chainML.pb.UploadFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.chainML.pb.UploadFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public DataCase
        getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainML.pb.FileInfo, com.chainML.pb.FileInfo.Builder, com.chainML.pb.FileInfoOrBuilder> infoBuilder_;
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return dataCase_ == 1;
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     * @return The info.
     */
    @java.lang.Override
    public com.chainML.pb.FileInfo getInfo() {
      if (infoBuilder_ == null) {
        if (dataCase_ == 1) {
          return (com.chainML.pb.FileInfo) data_;
        }
        return com.chainML.pb.FileInfo.getDefaultInstance();
      } else {
        if (dataCase_ == 1) {
          return infoBuilder_.getMessage();
        }
        return com.chainML.pb.FileInfo.getDefaultInstance();
      }
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    public Builder setInfo(com.chainML.pb.FileInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    public Builder setInfo(
        com.chainML.pb.FileInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    public Builder mergeInfo(com.chainML.pb.FileInfo value) {
      if (infoBuilder_ == null) {
        if (dataCase_ == 1 &&
            data_ != com.chainML.pb.FileInfo.getDefaultInstance()) {
          data_ = com.chainML.pb.FileInfo.newBuilder((com.chainML.pb.FileInfo) data_)
              .mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        if (dataCase_ == 1) {
          infoBuilder_.mergeFrom(value);
        }
        infoBuilder_.setMessage(value);
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        if (dataCase_ == 1) {
          dataCase_ = 0;
          data_ = null;
          onChanged();
        }
      } else {
        if (dataCase_ == 1) {
          dataCase_ = 0;
          data_ = null;
        }
        infoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    public com.chainML.pb.FileInfo.Builder getInfoBuilder() {
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    @java.lang.Override
    public com.chainML.pb.FileInfoOrBuilder getInfoOrBuilder() {
      if ((dataCase_ == 1) && (infoBuilder_ != null)) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        if (dataCase_ == 1) {
          return (com.chainML.pb.FileInfo) data_;
        }
        return com.chainML.pb.FileInfo.getDefaultInstance();
      }
    }
    /**
     * <code>.chainML.FileInfo info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainML.pb.FileInfo, com.chainML.pb.FileInfo.Builder, com.chainML.pb.FileInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        if (!(dataCase_ == 1)) {
          data_ = com.chainML.pb.FileInfo.getDefaultInstance();
        }
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.chainML.pb.FileInfo, com.chainML.pb.FileInfo.Builder, com.chainML.pb.FileInfoOrBuilder>(
                (com.chainML.pb.FileInfo) data_,
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      dataCase_ = 1;
      onChanged();;
      return infoBuilder_;
    }

    /**
     * <code>bytes chunk_data = 2;</code>
     * @return The chunkData.
     */
    public com.google.protobuf.ByteString getChunkData() {
      if (dataCase_ == 2) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes chunk_data = 2;</code>
     * @param value The chunkData to set.
     * @return This builder for chaining.
     */
    public Builder setChunkData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataCase_ = 2;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes chunk_data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearChunkData() {
      if (dataCase_ == 2) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }

    private com.chainML.pb.TypeFile typeFile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainML.pb.TypeFile, com.chainML.pb.TypeFile.Builder, com.chainML.pb.TypeFileOrBuilder> typeFileBuilder_;
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     * @return Whether the typeFile field is set.
     */
    public boolean hasTypeFile() {
      return typeFileBuilder_ != null || typeFile_ != null;
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     * @return The typeFile.
     */
    public com.chainML.pb.TypeFile getTypeFile() {
      if (typeFileBuilder_ == null) {
        return typeFile_ == null ? com.chainML.pb.TypeFile.getDefaultInstance() : typeFile_;
      } else {
        return typeFileBuilder_.getMessage();
      }
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    public Builder setTypeFile(com.chainML.pb.TypeFile value) {
      if (typeFileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeFile_ = value;
        onChanged();
      } else {
        typeFileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    public Builder setTypeFile(
        com.chainML.pb.TypeFile.Builder builderForValue) {
      if (typeFileBuilder_ == null) {
        typeFile_ = builderForValue.build();
        onChanged();
      } else {
        typeFileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    public Builder mergeTypeFile(com.chainML.pb.TypeFile value) {
      if (typeFileBuilder_ == null) {
        if (typeFile_ != null) {
          typeFile_ =
            com.chainML.pb.TypeFile.newBuilder(typeFile_).mergeFrom(value).buildPartial();
        } else {
          typeFile_ = value;
        }
        onChanged();
      } else {
        typeFileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    public Builder clearTypeFile() {
      if (typeFileBuilder_ == null) {
        typeFile_ = null;
        onChanged();
      } else {
        typeFile_ = null;
        typeFileBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    public com.chainML.pb.TypeFile.Builder getTypeFileBuilder() {
      
      onChanged();
      return getTypeFileFieldBuilder().getBuilder();
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    public com.chainML.pb.TypeFileOrBuilder getTypeFileOrBuilder() {
      if (typeFileBuilder_ != null) {
        return typeFileBuilder_.getMessageOrBuilder();
      } else {
        return typeFile_ == null ?
            com.chainML.pb.TypeFile.getDefaultInstance() : typeFile_;
      }
    }
    /**
     * <code>.chainML.TypeFile type_file = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainML.pb.TypeFile, com.chainML.pb.TypeFile.Builder, com.chainML.pb.TypeFileOrBuilder> 
        getTypeFileFieldBuilder() {
      if (typeFileBuilder_ == null) {
        typeFileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.chainML.pb.TypeFile, com.chainML.pb.TypeFile.Builder, com.chainML.pb.TypeFileOrBuilder>(
                getTypeFile(),
                getParentForChildren(),
                isClean());
        typeFile_ = null;
      }
      return typeFileBuilder_;
    }

    private com.chainML.pb.FileName fileName_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainML.pb.FileName, com.chainML.pb.FileName.Builder, com.chainML.pb.FileNameOrBuilder> fileNameBuilder_;
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     * @return Whether the fileName field is set.
     */
    public boolean hasFileName() {
      return fileNameBuilder_ != null || fileName_ != null;
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     * @return The fileName.
     */
    public com.chainML.pb.FileName getFileName() {
      if (fileNameBuilder_ == null) {
        return fileName_ == null ? com.chainML.pb.FileName.getDefaultInstance() : fileName_;
      } else {
        return fileNameBuilder_.getMessage();
      }
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    public Builder setFileName(com.chainML.pb.FileName value) {
      if (fileNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fileName_ = value;
        onChanged();
      } else {
        fileNameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    public Builder setFileName(
        com.chainML.pb.FileName.Builder builderForValue) {
      if (fileNameBuilder_ == null) {
        fileName_ = builderForValue.build();
        onChanged();
      } else {
        fileNameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    public Builder mergeFileName(com.chainML.pb.FileName value) {
      if (fileNameBuilder_ == null) {
        if (fileName_ != null) {
          fileName_ =
            com.chainML.pb.FileName.newBuilder(fileName_).mergeFrom(value).buildPartial();
        } else {
          fileName_ = value;
        }
        onChanged();
      } else {
        fileNameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    public Builder clearFileName() {
      if (fileNameBuilder_ == null) {
        fileName_ = null;
        onChanged();
      } else {
        fileName_ = null;
        fileNameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    public com.chainML.pb.FileName.Builder getFileNameBuilder() {
      
      onChanged();
      return getFileNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    public com.chainML.pb.FileNameOrBuilder getFileNameOrBuilder() {
      if (fileNameBuilder_ != null) {
        return fileNameBuilder_.getMessageOrBuilder();
      } else {
        return fileName_ == null ?
            com.chainML.pb.FileName.getDefaultInstance() : fileName_;
      }
    }
    /**
     * <code>.chainML.FileName file_name = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainML.pb.FileName, com.chainML.pb.FileName.Builder, com.chainML.pb.FileNameOrBuilder> 
        getFileNameFieldBuilder() {
      if (fileNameBuilder_ == null) {
        fileNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.chainML.pb.FileName, com.chainML.pb.FileName.Builder, com.chainML.pb.FileNameOrBuilder>(
                getFileName(),
                getParentForChildren(),
                isClean());
        fileName_ = null;
      }
      return fileNameBuilder_;
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


    // @@protoc_insertion_point(builder_scope:chainML.UploadFileRequest)
  }

  // @@protoc_insertion_point(class_scope:chainML.UploadFileRequest)
  private static final com.chainML.pb.UploadFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.chainML.pb.UploadFileRequest();
  }

  public static com.chainML.pb.UploadFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<UploadFileRequest>() {
    @java.lang.Override
    public UploadFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UploadFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UploadFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadFileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.chainML.pb.UploadFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

