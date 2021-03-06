// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface GeneratePasswordForFormFieldProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.GeneratePasswordForFormFieldProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   * @return Whether the element field is set.
   */
  boolean hasElement();
  /**
   * <pre>
   * A reference to the form element for which to generate a password.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   * @return The element.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getElement();

  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @return Whether the memoryKey field is set.
   */
  boolean hasMemoryKey();
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @return The memoryKey.
   */
  java.lang.String getMemoryKey();
  /**
   * <pre>
   * The client memory key to store the generated password.
   * </pre>
   *
   * <code>optional string memory_key = 2;</code>
   * @return The bytes for memoryKey.
   */
  com.google.protobuf.ByteString
      getMemoryKeyBytes();
}
