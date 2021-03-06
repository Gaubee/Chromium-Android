// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface DrawableProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.DrawableProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The resource identifier of a drawable.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return Whether the resourceIdentifier field is set.
   */
  boolean hasResourceIdentifier();
  /**
   * <pre>
   * The resource identifier of a drawable.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return The resourceIdentifier.
   */
  java.lang.String getResourceIdentifier();
  /**
   * <pre>
   * The resource identifier of a drawable.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return The bytes for resourceIdentifier.
   */
  com.google.protobuf.ByteString
      getResourceIdentifierBytes();

  /**
   * <pre>
   * A bitmap retrieved from a URL.
   * </pre>
   *
   * <code>.autofill_assistant.BitmapDrawableProto bitmap = 2;</code>
   * @return Whether the bitmap field is set.
   */
  boolean hasBitmap();
  /**
   * <pre>
   * A bitmap retrieved from a URL.
   * </pre>
   *
   * <code>.autofill_assistant.BitmapDrawableProto bitmap = 2;</code>
   * @return The bitmap.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto getBitmap();

  /**
   * <pre>
   * A shape, e.g., a rounded rectangle.
   * </pre>
   *
   * <code>.autofill_assistant.ShapeDrawableProto shape = 3;</code>
   * @return Whether the shape field is set.
   */
  boolean hasShape();
  /**
   * <pre>
   * A shape, e.g., a rounded rectangle.
   * </pre>
   *
   * <code>.autofill_assistant.ShapeDrawableProto shape = 3;</code>
   * @return The shape.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ShapeDrawableProto getShape();

  /**
   * <pre>
   * An icon from a predefined set of known icons.
   * </pre>
   *
   * <code>.autofill_assistant.DrawableProto.Icon icon = 4;</code>
   * @return Whether the icon field is set.
   */
  boolean hasIcon();
  /**
   * <pre>
   * An icon from a predefined set of known icons.
   * </pre>
   *
   * <code>.autofill_assistant.DrawableProto.Icon icon = 4;</code>
   * @return The icon.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DrawableProto.Icon getIcon();

  /**
   * <pre>
   * A Base64 encoded image string.
   * </pre>
   *
   * <code>bytes base64 = 5;</code>
   * @return Whether the base64 field is set.
   */
  boolean hasBase64();
  /**
   * <pre>
   * A Base64 encoded image string.
   * </pre>
   *
   * <code>bytes base64 = 5;</code>
   * @return The base64.
   */
  com.google.protobuf.ByteString getBase64();

  /**
   * <pre>
   * The favicon for a given URL.
   * </pre>
   *
   * <code>.autofill_assistant.FaviconDrawableProto favicon = 6;</code>
   * @return Whether the favicon field is set.
   */
  boolean hasFavicon();
  /**
   * <pre>
   * The favicon for a given URL.
   * </pre>
   *
   * <code>.autofill_assistant.FaviconDrawableProto favicon = 6;</code>
   * @return The favicon.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.FaviconDrawableProto getFavicon();

  public org.chromium.chrome.browser.autofill_assistant.proto.DrawableProto.DrawableCase getDrawableCase();
}
