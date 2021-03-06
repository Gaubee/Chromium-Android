// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface PromptProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.PromptProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Display this message to the user.
   * </pre>
   *
   * <code>optional string message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * Display this message to the user.
   * </pre>
   *
   * <code>optional string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Display this message to the user.
   * </pre>
   *
   * <code>optional string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .autofill_assistant.PromptProto.Choice choices = 4;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice> 
      getChoicesList();
  /**
   * <code>repeated .autofill_assistant.PromptProto.Choice choices = 4;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.PromptProto.Choice getChoices(int index);
  /**
   * <code>repeated .autofill_assistant.PromptProto.Choice choices = 4;</code>
   */
  int getChoicesCount();

  /**
   * <pre>
   * If true, run scripts flagged with 'interrupt=true' as soon as their
   * preconditions match, then go back to the prompt.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 5;</code>
   * @return Whether the allowInterrupt field is set.
   */
  boolean hasAllowInterrupt();
  /**
   * <pre>
   * If true, run scripts flagged with 'interrupt=true' as soon as their
   * preconditions match, then go back to the prompt.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 5;</code>
   * @return The allowInterrupt.
   */
  boolean getAllowInterrupt();

  /**
   * <pre>
   * If this is true, then we do not force expand the sheet when entering the
   * prompt state. When false or not set, this keeps the default behavior.
   * </pre>
   *
   * <code>optional bool disable_force_expand_sheet = 6;</code>
   * @return Whether the disableForceExpandSheet field is set.
   */
  boolean hasDisableForceExpandSheet();
  /**
   * <pre>
   * If this is true, then we do not force expand the sheet when entering the
   * prompt state. When false or not set, this keeps the default behavior.
   * </pre>
   *
   * <code>optional bool disable_force_expand_sheet = 6;</code>
   * @return The disableForceExpandSheet.
   */
  boolean getDisableForceExpandSheet();

  /**
   * <pre>
   * If this is true, go into browse mode where navigation and user gestures
   * like go_back do not shut down autofill assistant.
   * TODO(marianfe): Consider introducing a BrowseAction instead.
   * </pre>
   *
   * <code>optional bool browse_mode = 7;</code>
   * @return Whether the browseMode field is set.
   */
  boolean hasBrowseMode();
  /**
   * <pre>
   * If this is true, go into browse mode where navigation and user gestures
   * like go_back do not shut down autofill assistant.
   * TODO(marianfe): Consider introducing a BrowseAction instead.
   * </pre>
   *
   * <code>optional bool browse_mode = 7;</code>
   * @return The browseMode.
   */
  boolean getBrowseMode();

  /**
   * <pre>
   * EXPERIMENTAL.
   * Only relevant if |browse_mode| is true. If set, the bottom sheet will
   * completely disappear when the action starts, and re-appear when the action
   * ends.
   * Note: invisible prompts can't show chips to the user. This flag is intended
   * to be used with prompts that exclusively use choices which are
   * auto-selected based on DOM state, i.e., |auto_select_when|.
   * </pre>
   *
   * <code>optional bool browse_mode_invisible = 10;</code>
   * @return Whether the browseModeInvisible field is set.
   */
  boolean hasBrowseModeInvisible();
  /**
   * <pre>
   * EXPERIMENTAL.
   * Only relevant if |browse_mode| is true. If set, the bottom sheet will
   * completely disappear when the action starts, and re-appear when the action
   * ends.
   * Note: invisible prompts can't show chips to the user. This flag is intended
   * to be used with prompts that exclusively use choices which are
   * auto-selected based on DOM state, i.e., |auto_select_when|.
   * </pre>
   *
   * <code>optional bool browse_mode_invisible = 10;</code>
   * @return The browseModeInvisible.
   */
  boolean getBrowseModeInvisible();

  /**
   * <pre>
   * When set to true, end prompt on navigation events happening during a prompt
   * action. The result sent back to the server in
   * ProcessedActionProto.prompt_choice will have |navigation_ended| set to
   * true.
   * </pre>
   *
   * <code>optional bool end_on_navigation = 8;</code>
   * @return Whether the endOnNavigation field is set.
   */
  boolean hasEndOnNavigation();
  /**
   * <pre>
   * When set to true, end prompt on navigation events happening during a prompt
   * action. The result sent back to the server in
   * ProcessedActionProto.prompt_choice will have |navigation_ended| set to
   * true.
   * </pre>
   *
   * <code>optional bool end_on_navigation = 8;</code>
   * @return The endOnNavigation.
   */
  boolean getEndOnNavigation();

  /**
   * <pre>
   * A list of domains and subdomains to allow users to navigate to when in
   * browse mode.
   * </pre>
   *
   * <code>repeated string browse_domains_allowlist = 9;</code>
   * @return A list containing the browseDomainsAllowlist.
   */
  java.util.List<java.lang.String>
      getBrowseDomainsAllowlistList();
  /**
   * <pre>
   * A list of domains and subdomains to allow users to navigate to when in
   * browse mode.
   * </pre>
   *
   * <code>repeated string browse_domains_allowlist = 9;</code>
   * @return The count of browseDomainsAllowlist.
   */
  int getBrowseDomainsAllowlistCount();
  /**
   * <pre>
   * A list of domains and subdomains to allow users to navigate to when in
   * browse mode.
   * </pre>
   *
   * <code>repeated string browse_domains_allowlist = 9;</code>
   * @param index The index of the element to return.
   * @return The browseDomainsAllowlist at the given index.
   */
  java.lang.String getBrowseDomainsAllowlist(int index);
  /**
   * <pre>
   * A list of domains and subdomains to allow users to navigate to when in
   * browse mode.
   * </pre>
   *
   * <code>repeated string browse_domains_allowlist = 9;</code>
   * @param index The index of the element to return.
   * @return The browseDomainsAllowlist at the given index.
   */
  com.google.protobuf.ByteString
      getBrowseDomainsAllowlistBytes(int index);
}
