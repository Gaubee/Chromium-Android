// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface RoundtripTimingStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.RoundtripTimingStats)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Reports how long it took for the previous roundtrip to the backend to
   * complete.
   * </pre>
   *
   * <code>optional int64 roundtrip_time_ms = 1;</code>
   * @return Whether the roundtripTimeMs field is set.
   */
  boolean hasRoundtripTimeMs();
  /**
   * <pre>
   * Reports how long it took for the previous roundtrip to the backend to
   * complete.
   * </pre>
   *
   * <code>optional int64 roundtrip_time_ms = 1;</code>
   * @return The roundtripTimeMs.
   */
  long getRoundtripTimeMs();

  /**
   * <pre>
   * Reports the total client processing time for the executed batch of actions.
   * </pre>
   *
   * <code>optional int64 client_time_ms = 2;</code>
   * @return Whether the clientTimeMs field is set.
   */
  boolean hasClientTimeMs();
  /**
   * <pre>
   * Reports the total client processing time for the executed batch of actions.
   * </pre>
   *
   * <code>optional int64 client_time_ms = 2;</code>
   * @return The clientTimeMs.
   */
  long getClientTimeMs();
}
