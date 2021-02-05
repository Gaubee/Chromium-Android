// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action_value.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface TextValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.TextValue)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   * @return Whether the autofillValue field is set.
   */
  boolean hasAutofillValue();
  /**
   * <code>.autofill_assistant.AutofillValue autofill_value = 2;</code>
   * @return The autofillValue.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.AutofillValue getAutofillValue();

  public org.chromium.chrome.browser.autofill_assistant.proto.TextValue.ValueCase getValueCase();
}
