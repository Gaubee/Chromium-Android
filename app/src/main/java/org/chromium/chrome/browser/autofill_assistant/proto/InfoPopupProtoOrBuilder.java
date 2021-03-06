// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface InfoPopupProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.InfoPopupProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The title of the popup window.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <pre>
   * The title of the popup window.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the popup window.
   * </pre>
   *
   * <code>optional string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The text of the popup window.
   * </pre>
   *
   * <code>optional string text = 2;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The text of the popup window.
   * </pre>
   *
   * <code>optional string text = 2;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text of the popup window.
   * </pre>
   *
   * <code>optional string text = 2;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Optional: adds a positive button.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto.DialogButton positive_button = 3;</code>
   * @return Whether the positiveButton field is set.
   */
  boolean hasPositiveButton();
  /**
   * <pre>
   * Optional: adds a positive button.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto.DialogButton positive_button = 3;</code>
   * @return The positiveButton.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.DialogButton getPositiveButton();

  /**
   * <pre>
   * Optional: adds a negative button.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto.DialogButton negative_button = 4;</code>
   * @return Whether the negativeButton field is set.
   */
  boolean hasNegativeButton();
  /**
   * <pre>
   * Optional: adds a negative button.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto.DialogButton negative_button = 4;</code>
   * @return The negativeButton.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.DialogButton getNegativeButton();

  /**
   * <pre>
   * Optional: adds a neutral button.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto.DialogButton neutral_button = 5;</code>
   * @return Whether the neutralButton field is set.
   */
  boolean hasNeutralButton();
  /**
   * <pre>
   * Optional: adds a neutral button.
   * </pre>
   *
   * <code>optional .autofill_assistant.InfoPopupProto.DialogButton neutral_button = 5;</code>
   * @return The neutralButton.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.InfoPopupProto.DialogButton getNeutralButton();
}
