// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/bookmark_specifics.proto

package org.chromium.components.sync.protocol;

public interface MetaInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.MetaInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string key = 1;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <code>optional string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>optional string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>optional string value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>optional string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>optional string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}