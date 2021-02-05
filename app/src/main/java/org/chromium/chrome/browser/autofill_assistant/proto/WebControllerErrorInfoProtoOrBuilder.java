// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface WebControllerErrorInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.WebControllerErrorInfoProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The web-action that failed. This is usually a step in an execution chain
   * for an action.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
   * @return Whether the failedWebAction field is set.
   */
  boolean hasFailedWebAction();
  /**
   * <pre>
   * The web-action that failed. This is usually a step in an execution chain
   * for an action.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
   * @return The failedWebAction.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction getFailedWebAction();
}
