// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface LoginOptionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.LoginOptionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string label = 1;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <code>optional string label = 1;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>optional string label = 1;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>optional string sublabel = 2;</code>
   * @return Whether the sublabel field is set.
   */
  boolean hasSublabel();
  /**
   * <code>optional string sublabel = 2;</code>
   * @return The sublabel.
   */
  java.lang.String getSublabel();
  /**
   * <code>optional string sublabel = 2;</code>
   * @return The bytes for sublabel.
   */
  com.google.protobuf.ByteString
      getSublabelBytes();

  /**
   * <code>optional bytes payload = 3;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <code>optional bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}