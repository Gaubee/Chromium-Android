// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface WaitForDocumentProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.WaitForDocumentProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Maximum amount of time to wait for the state to change. Set it to 0 to
   * check once and report the result immediately, without waiting.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
   * @return Whether the timeoutMs field is set.
   */
  boolean hasTimeoutMs();
  /**
   * <pre>
   * Maximum amount of time to wait for the state to change. Set it to 0 to
   * check once and report the result immediately, without waiting.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
   * @return The timeoutMs.
   */
  int getTimeoutMs();

  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   * @return Whether the frame field is set.
   */
  boolean hasFrame();
  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   * @return The frame.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getFrame();

  /**
   * <pre>
   * The minimum ready state needed to satisfy the requirement.
   * </pre>
   *
   * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
   * @return Whether the minReadyState field is set.
   */
  boolean hasMinReadyState();
  /**
   * <pre>
   * The minimum ready state needed to satisfy the requirement.
   * </pre>
   *
   * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
   * @return The minReadyState.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getMinReadyState();
}
