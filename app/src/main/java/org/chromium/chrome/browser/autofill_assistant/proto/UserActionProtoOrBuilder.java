// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface UserActionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.UserActionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.ChipProto chip = 1;</code>
   * @return Whether the chip field is set.
   */
  boolean hasChip();
  /**
   * <code>optional .autofill_assistant.ChipProto chip = 1;</code>
   * @return The chip.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ChipProto getChip();

  /**
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 2;</code>
   * @return Whether the directAction field is set.
   */
  boolean hasDirectAction();
  /**
   * <code>optional .autofill_assistant.DirectActionProto direct_action = 2;</code>
   * @return The directAction.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DirectActionProto getDirectAction();

  /**
   * <pre>
   * A unique identifier for this user action.
   * </pre>
   *
   * <code>optional string identifier = 3;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * A unique identifier for this user action.
   * </pre>
   *
   * <code>optional string identifier = 3;</code>
   * @return The identifier.
   */
  java.lang.String getIdentifier();
  /**
   * <pre>
   * A unique identifier for this user action.
   * </pre>
   *
   * <code>optional string identifier = 3;</code>
   * @return The bytes for identifier.
   */
  com.google.protobuf.ByteString
      getIdentifierBytes();

  /**
   * <pre>
   * Whether this action is enabled or not.
   * </pre>
   *
   * <code>optional bool enabled = 4 [default = true];</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * Whether this action is enabled or not.
   * </pre>
   *
   * <code>optional bool enabled = 4 [default = true];</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
