// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ShapeDrawableProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ShapeDrawableProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   * @return Whether the rectangle field is set.
   */
  boolean hasRectangle();
  /**
   * <code>.autofill_assistant.ShapeDrawableProto.Rectangle rectangle = 1;</code>
   * @return The rectangle.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.Rectangle getRectangle();

  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   * @return Whether the backgroundColor field is set.
   */
  boolean hasBackgroundColor();
  /**
   * <code>optional .autofill_assistant.ColorProto background_color = 2;</code>
   * @return The backgroundColor.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getBackgroundColor();

  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   * @return Whether the strokeWidth field is set.
   */
  boolean hasStrokeWidth();
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto stroke_width = 3;</code>
   * @return The strokeWidth.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getStrokeWidth();

  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   * @return Whether the strokeColor field is set.
   */
  boolean hasStrokeColor();
  /**
   * <code>optional .autofill_assistant.ColorProto stroke_color = 4;</code>
   * @return The strokeColor.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getStrokeColor();

  public org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto.ShapeCase getShapeCase();
}