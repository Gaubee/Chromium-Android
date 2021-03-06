// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface TextViewProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.TextViewProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @return Whether the modelIdentifier field is set.
   */
  boolean hasModelIdentifier();
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @return The modelIdentifier.
   */
  java.lang.String getModelIdentifier();
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @return The bytes for modelIdentifier.
   */
  com.google.protobuf.ByteString
      getModelIdentifierBytes();

  /**
   * <code>optional string text_appearance = 2;</code>
   * @return Whether the textAppearance field is set.
   */
  boolean hasTextAppearance();
  /**
   * <code>optional string text_appearance = 2;</code>
   * @return The textAppearance.
   */
  java.lang.String getTextAppearance();
  /**
   * <code>optional string text_appearance = 2;</code>
   * @return The bytes for textAppearance.
   */
  com.google.protobuf.ByteString
      getTextAppearanceBytes();

  /**
   * <pre>
   * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
   * values. The default is START|TOP (i.e., top-left-aligned for western
   * locales).
   * </pre>
   *
   * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
   * @return Whether the textAlignment field is set.
   */
  boolean hasTextAlignment();
  /**
   * <pre>
   * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
   * values. The default is START|TOP (i.e., top-left-aligned for western
   * locales).
   * </pre>
   *
   * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
   * @return The textAlignment.
   */
  int getTextAlignment();

  public org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto.KindCase getKindCase();
}
