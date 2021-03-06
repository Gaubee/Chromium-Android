// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ShowGenericUiPopupProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ShowGenericUiPopupProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   * @return Whether the genericUi field is set.
   */
  boolean hasGenericUi();
  /**
   * <pre>
   * The user interface to show. Note that nested user models are merged into
   * the global one, so take care to avoid accidental identifier overlap.
   * </pre>
   *
   * <code>optional .autofill_assistant.GenericUserInterfaceProto generic_ui = 1;</code>
   * @return The genericUi.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.GenericUserInterfaceProto getGenericUi();

  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @return Whether the popupIdentifier field is set.
   */
  boolean hasPopupIdentifier();
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @return The popupIdentifier.
   */
  java.lang.String getPopupIdentifier();
  /**
   * <pre>
   * Mandatory identifier for this popup, used in the corresponding trigger
   * events.
   * </pre>
   *
   * <code>optional string popup_identifier = 2;</code>
   * @return The bytes for popupIdentifier.
   */
  com.google.protobuf.ByteString
      getPopupIdentifierBytes();
}
