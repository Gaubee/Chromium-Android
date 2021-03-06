// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface WaitForElementToBecomeStableProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.WaitForElementToBecomeStableProto)
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
   * <code>optional int32 stable_check_max_rounds = 2 [default = 50];</code>
   * @return Whether the stableCheckMaxRounds field is set.
   */
  boolean hasStableCheckMaxRounds();
  /**
   * <code>optional int32 stable_check_max_rounds = 2 [default = 50];</code>
   * @return The stableCheckMaxRounds.
   */
  int getStableCheckMaxRounds();

  /**
   * <code>optional int32 stable_check_interval_ms = 3 [default = 200];</code>
   * @return Whether the stableCheckIntervalMs field is set.
   */
  boolean hasStableCheckIntervalMs();
  /**
   * <code>optional int32 stable_check_interval_ms = 3 [default = 200];</code>
   * @return The stableCheckIntervalMs.
   */
  int getStableCheckIntervalMs();
}
