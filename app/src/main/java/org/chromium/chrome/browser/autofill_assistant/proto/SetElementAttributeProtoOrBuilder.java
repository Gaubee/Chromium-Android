// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SetElementAttributeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SetElementAttributeProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   * @return Whether the clientId field is set.
   */
  boolean hasClientId();
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   * @return The clientId.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getClientId();

  /**
   * <code>repeated string attribute = 2;</code>
   * @return A list containing the attribute.
   */
  java.util.List<java.lang.String>
      getAttributeList();
  /**
   * <code>repeated string attribute = 2;</code>
   * @return The count of attribute.
   */
  int getAttributeCount();
  /**
   * <code>repeated string attribute = 2;</code>
   * @param index The index of the element to return.
   * @return The attribute at the given index.
   */
  java.lang.String getAttribute(int index);
  /**
   * <code>repeated string attribute = 2;</code>
   * @param index The index of the element to return.
   * @return The attribute at the given index.
   */
  com.google.protobuf.ByteString
      getAttributeBytes(int index);

  /**
   * <code>optional .autofill_assistant.TextValue value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>optional .autofill_assistant.TextValue value = 3;</code>
   * @return The value.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.TextValue getValue();
}
