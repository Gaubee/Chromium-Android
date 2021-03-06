// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/session_specifics.proto

package org.chromium.components.sync.protocol;

public interface SessionSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SessionSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique id for the client. M89 and higher use sync's cache GUID (client ID)
   * to populate this tag for *new* sessions.
   * </pre>
   *
   * <code>optional string session_tag = 1;</code>
   * @return Whether the sessionTag field is set.
   */
  boolean hasSessionTag();
  /**
   * <pre>
   * Unique id for the client. M89 and higher use sync's cache GUID (client ID)
   * to populate this tag for *new* sessions.
   * </pre>
   *
   * <code>optional string session_tag = 1;</code>
   * @return The sessionTag.
   */
  java.lang.String getSessionTag();
  /**
   * <pre>
   * Unique id for the client. M89 and higher use sync's cache GUID (client ID)
   * to populate this tag for *new* sessions.
   * </pre>
   *
   * <code>optional string session_tag = 1;</code>
   * @return The bytes for sessionTag.
   */
  com.google.protobuf.ByteString
      getSessionTagBytes();

  /**
   * <code>optional .sync_pb.SessionHeader header = 2;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>optional .sync_pb.SessionHeader header = 2;</code>
   * @return The header.
   */
  org.chromium.components.sync.protocol.SessionHeader getHeader();

  /**
   * <code>optional .sync_pb.SessionTab tab = 3;</code>
   * @return Whether the tab field is set.
   */
  boolean hasTab();
  /**
   * <code>optional .sync_pb.SessionTab tab = 3;</code>
   * @return The tab.
   */
  org.chromium.components.sync.protocol.SessionTab getTab();

  /**
   * <pre>
   * The local tab id used by sync. Unique across all nodes for that client.
   * </pre>
   *
   * <code>optional int32 tab_node_id = 4 [default = -1];</code>
   * @return Whether the tabNodeId field is set.
   */
  boolean hasTabNodeId();
  /**
   * <pre>
   * The local tab id used by sync. Unique across all nodes for that client.
   * </pre>
   *
   * <code>optional int32 tab_node_id = 4 [default = -1];</code>
   * @return The tabNodeId.
   */
  int getTabNodeId();
}
