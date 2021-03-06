// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface PopupListSectionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.PopupListSectionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The key used to store the selection in CollectUserDataResultProto
   * </pre>
   *
   * <code>optional string additional_value_key = 1;</code>
   * @return Whether the additionalValueKey field is set.
   */
  boolean hasAdditionalValueKey();
  /**
   * <pre>
   * The key used to store the selection in CollectUserDataResultProto
   * </pre>
   *
   * <code>optional string additional_value_key = 1;</code>
   * @return The additionalValueKey.
   */
  java.lang.String getAdditionalValueKey();
  /**
   * <pre>
   * The key used to store the selection in CollectUserDataResultProto
   * </pre>
   *
   * <code>optional string additional_value_key = 1;</code>
   * @return The bytes for additionalValueKey.
   */
  com.google.protobuf.ByteString
      getAdditionalValueKeyBytes();

  /**
   * <pre>
   * The name of the items to be displayed
   * </pre>
   *
   * <code>repeated string item_names = 2;</code>
   * @return A list containing the itemNames.
   */
  java.util.List<java.lang.String>
      getItemNamesList();
  /**
   * <pre>
   * The name of the items to be displayed
   * </pre>
   *
   * <code>repeated string item_names = 2;</code>
   * @return The count of itemNames.
   */
  int getItemNamesCount();
  /**
   * <pre>
   * The name of the items to be displayed
   * </pre>
   *
   * <code>repeated string item_names = 2;</code>
   * @param index The index of the element to return.
   * @return The itemNames at the given index.
   */
  java.lang.String getItemNames(int index);
  /**
   * <pre>
   * The name of the items to be displayed
   * </pre>
   *
   * <code>repeated string item_names = 2;</code>
   * @param index The index of the element to return.
   * @return The itemNames at the given index.
   */
  com.google.protobuf.ByteString
      getItemNamesBytes(int index);

  /**
   * <pre>
   * The list of the indexes of the items to be initially selected.
   * </pre>
   *
   * <code>repeated int32 initial_selection = 3;</code>
   * @return A list containing the initialSelection.
   */
  java.util.List<java.lang.Integer> getInitialSelectionList();
  /**
   * <pre>
   * The list of the indexes of the items to be initially selected.
   * </pre>
   *
   * <code>repeated int32 initial_selection = 3;</code>
   * @return The count of initialSelection.
   */
  int getInitialSelectionCount();
  /**
   * <pre>
   * The list of the indexes of the items to be initially selected.
   * </pre>
   *
   * <code>repeated int32 initial_selection = 3;</code>
   * @param index The index of the element to return.
   * @return The initialSelection at the given index.
   */
  int getInitialSelection(int index);

  /**
   * <pre>
   * Whether to allow the selection of multiple items or just one.
   * </pre>
   *
   * <code>optional bool allow_multiselect = 4;</code>
   * @return Whether the allowMultiselect field is set.
   */
  boolean hasAllowMultiselect();
  /**
   * <pre>
   * Whether to allow the selection of multiple items or just one.
   * </pre>
   *
   * <code>optional bool allow_multiselect = 4;</code>
   * @return The allowMultiselect.
   */
  boolean getAllowMultiselect();

  /**
   * <pre>
   * Whether the selection of this section is required to proceed.
   * </pre>
   *
   * <code>optional bool selection_mandatory = 5 [default = true];</code>
   * @return Whether the selectionMandatory field is set.
   */
  boolean hasSelectionMandatory();
  /**
   * <pre>
   * Whether the selection of this section is required to proceed.
   * </pre>
   *
   * <code>optional bool selection_mandatory = 5 [default = true];</code>
   * @return The selectionMandatory.
   */
  boolean getSelectionMandatory();

  /**
   * <pre>
   * The error message displayed when the selection is mandatory and missing.
   * Ignored if |selection_mandatory| is false.
   * </pre>
   *
   * <code>optional string no_selection_error_message = 6;</code>
   * @return Whether the noSelectionErrorMessage field is set.
   */
  boolean hasNoSelectionErrorMessage();
  /**
   * <pre>
   * The error message displayed when the selection is mandatory and missing.
   * Ignored if |selection_mandatory| is false.
   * </pre>
   *
   * <code>optional string no_selection_error_message = 6;</code>
   * @return The noSelectionErrorMessage.
   */
  java.lang.String getNoSelectionErrorMessage();
  /**
   * <pre>
   * The error message displayed when the selection is mandatory and missing.
   * Ignored if |selection_mandatory| is false.
   * </pre>
   *
   * <code>optional string no_selection_error_message = 6;</code>
   * @return The bytes for noSelectionErrorMessage.
   */
  com.google.protobuf.ByteString
      getNoSelectionErrorMessageBytes();
}
