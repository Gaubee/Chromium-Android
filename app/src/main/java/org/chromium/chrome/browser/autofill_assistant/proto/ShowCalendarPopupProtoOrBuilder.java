// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface ShowCalendarPopupProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.ShowCalendarPopupProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The date model identifier (both input and output). Must point to a single
   * Date. If not set, the calendar will default to the current date.
   * </pre>
   *
   * <code>optional string date_model_identifier = 1;</code>
   * @return Whether the dateModelIdentifier field is set.
   */
  boolean hasDateModelIdentifier();
  /**
   * <pre>
   * The date model identifier (both input and output). Must point to a single
   * Date. If not set, the calendar will default to the current date.
   * </pre>
   *
   * <code>optional string date_model_identifier = 1;</code>
   * @return The dateModelIdentifier.
   */
  java.lang.String getDateModelIdentifier();
  /**
   * <pre>
   * The date model identifier (both input and output). Must point to a single
   * Date. If not set, the calendar will default to the current date.
   * </pre>
   *
   * <code>optional string date_model_identifier = 1;</code>
   * @return The bytes for dateModelIdentifier.
   */
  com.google.protobuf.ByteString
      getDateModelIdentifierBytes();

  /**
   * <pre>
   * The minimum allowed date. Must point to a single Date.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto min_date = 4;</code>
   * @return Whether the minDate field is set.
   */
  boolean hasMinDate();
  /**
   * <pre>
   * The minimum allowed date. Must point to a single Date.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto min_date = 4;</code>
   * @return The minDate.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getMinDate();

  /**
   * <pre>
   * The maximum allowed date. Must point to a single Date.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto max_date = 5;</code>
   * @return Whether the maxDate field is set.
   */
  boolean hasMaxDate();
  /**
   * <pre>
   * The maximum allowed date. Must point to a single Date.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto max_date = 5;</code>
   * @return The maxDate.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getMaxDate();
}
