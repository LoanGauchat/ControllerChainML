// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chainML_service.proto

package com.chainML.pb;

public interface UploadFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainML.UploadFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chainML.FileInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.chainML.FileInfo info = 1;</code>
   * @return The info.
   */
  com.chainML.pb.FileInfo getInfo();
  /**
   * <code>.chainML.FileInfo info = 1;</code>
   */
  com.chainML.pb.FileInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>bytes chunk_data = 2;</code>
   * @return The chunkData.
   */
  com.google.protobuf.ByteString getChunkData();

  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   * @return Whether the typeFile field is set.
   */
  boolean hasTypeFile();
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   * @return The typeFile.
   */
  com.chainML.pb.TypeFile getTypeFile();
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   */
  com.chainML.pb.TypeFileOrBuilder getTypeFileOrBuilder();

  /**
   * <code>.chainML.FileName file_name = 4;</code>
   * @return Whether the fileName field is set.
   */
  boolean hasFileName();
  /**
   * <code>.chainML.FileName file_name = 4;</code>
   * @return The fileName.
   */
  com.chainML.pb.FileName getFileName();
  /**
   * <code>.chainML.FileName file_name = 4;</code>
   */
  com.chainML.pb.FileNameOrBuilder getFileNameOrBuilder();

  public com.chainML.pb.UploadFileRequest.DataCase getDataCase();
}