// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chainML_service.proto

package com.chainML.pb;

public final class ChainMLService {
  private ChainMLService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_UploadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_UploadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_UploadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_UploadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_DataChunk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_DataChunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_ImageInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_ImageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_Model_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_TypeFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_TypeFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_replyOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_replyOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_OrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_OrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainML_OrderReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainML_OrderReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025chainML_service.proto\022\007chainML\"{\n\021Uplo" +
      "adFileRequest\022\"\n\004info\030\001 \001(\0132\022.chainML.Im" +
      "ageInfoH\000\022\024\n\nchunk_data\030\002 \001(\014H\000\022$\n\ttype_" +
      "file\030\003 \001(\0132\021.chainML.TypeFileB\006\n\004data\".\n" +
      "\022UploadFileResponse\022\n\n\002id\030\001 \001(\t\022\014\n\004size\030" +
      "\002 \001(\r\"\'\n\tDataChunk\022\014\n\004data\030\001 \001(\014\022\014\n\004size" +
      "\030\002 \001(\005\"\037\n\tImageInfo\022\022\n\nimage_type\030\002 \001(\t\"" +
      "\032\n\005Model\022\021\n\tmodelName\030\001 \001(\t\"\034\n\010TypeFile\022" +
      "\020\n\010typefile\030\001 \001(\t\"\033\n\005Order\022\022\n\nnextDevice" +
      "\030\002 \001(\t\"\033\n\nreplyOrder\022\r\n\005reply\030\001 \001(\t\"\034\n\014O" +
      "rderRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nOrderReply\022" +
      "\017\n\007message\030\001 \001(\t2\230\001\n\016chainMLService\022;\n\013D" +
      "efineOrder\022\025.chainML.OrderRequest\032\023.chai" +
      "nML.OrderReply\"\000\022I\n\nUploadFile\022\032.chainML" +
      ".UploadFileRequest\032\033.chainML.UploadFileR" +
      "esponse\"\000(\001B\022\n\016com.chainML.pbP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chainML_UploadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chainML_UploadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_UploadFileRequest_descriptor,
        new java.lang.String[] { "Info", "ChunkData", "TypeFile", "Data", });
    internal_static_chainML_UploadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chainML_UploadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_UploadFileResponse_descriptor,
        new java.lang.String[] { "Id", "Size", });
    internal_static_chainML_DataChunk_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chainML_DataChunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_DataChunk_descriptor,
        new java.lang.String[] { "Data", "Size", });
    internal_static_chainML_ImageInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chainML_ImageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_ImageInfo_descriptor,
        new java.lang.String[] { "ImageType", });
    internal_static_chainML_Model_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chainML_Model_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_Model_descriptor,
        new java.lang.String[] { "ModelName", });
    internal_static_chainML_TypeFile_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chainML_TypeFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_TypeFile_descriptor,
        new java.lang.String[] { "Typefile", });
    internal_static_chainML_Order_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_chainML_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_Order_descriptor,
        new java.lang.String[] { "NextDevice", });
    internal_static_chainML_replyOrder_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_chainML_replyOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_replyOrder_descriptor,
        new java.lang.String[] { "Reply", });
    internal_static_chainML_OrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_chainML_OrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_OrderRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_chainML_OrderReply_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_chainML_OrderReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainML_OrderReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
