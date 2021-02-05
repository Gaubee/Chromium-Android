// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface GetElementStatusProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.GetElementStatusProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   * @return Whether the element field is set.
   */
  boolean hasElement();
  /**
   * <code>optional .autofill_assistant.SelectorProto element = 1;</code>
   * @return The element.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getElement();

  /**
   * <code>optional .autofill_assistant.GetElementStatusProto.ValueMatch expected_value_match = 2;</code>
   * @return Whether the expectedValueMatch field is set.
   */
  boolean hasExpectedValueMatch();
  /**
   * <code>optional .autofill_assistant.GetElementStatusProto.ValueMatch expected_value_match = 2;</code>
   * @return The expectedValueMatch.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GetElementStatusProto.ValueMatch getExpectedValueMatch();

  /**
   * <code>optional .autofill_assistant.GetElementStatusProto.ValueSource value_source = 4;</code>
   * @return Whether the valueSource field is set.
   */
  boolean hasValueSource();
  /**
   * <code>optional .autofill_assistant.GetElementStatusProto.ValueSource value_source = 4;</code>
   * @return The valueSource.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GetElementStatusProto.ValueSource getValueSource();

  /**
   * <pre>
   * If set and a mismatch happens, the action will report an failure status
   * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
   * fail and simply report the result.
   * </pre>
   *
   * <code>optional bool mismatch_should_fail = 3;</code>
   * @return Whether the mismatchShouldFail field is set.
   */
  boolean hasMismatchShouldFail();
  /**
   * <pre>
   * If set and a mismatch happens, the action will report an failure status
   * with |ELEMENT_MISMATCH|. If this flag is set to false, the action will not
   * fail and simply report the result.
   * </pre>
   *
   * <code>optional bool mismatch_should_fail = 3;</code>
   * @return The mismatchShouldFail.
   */
  boolean getMismatchShouldFail();
}