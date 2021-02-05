// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/favicon_image_specifics.proto

package org.chromium.components.sync.protocol;

public interface FaviconDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.FaviconData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   * @return Whether the favicon field is set.
   */
  boolean hasFavicon();
  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   * @return The favicon.
   */
  com.google.protobuf.ByteString getFavicon();

  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   * @return Whether the width field is set.
   */
  boolean hasWidth();
  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>optional int32 height = 3;</code>
   * @return Whether the height field is set.
   */
  boolean hasHeight();
  /**
   * <code>optional int32 height = 3;</code>
   * @return The height.
   */
  int getHeight();
}
