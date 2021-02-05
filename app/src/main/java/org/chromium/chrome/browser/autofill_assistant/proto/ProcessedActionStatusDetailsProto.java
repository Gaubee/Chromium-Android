// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Extended information about the action status, which provides more details
 * about what happened than a simple ProcessedActionStatusProto can.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ProcessedActionStatusDetailsProto}
 */
public  final class ProcessedActionStatusDetailsProto extends
    com.google.protobuf.GeneratedMessageLite<
        ProcessedActionStatusDetailsProto, ProcessedActionStatusDetailsProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ProcessedActionStatusDetailsProto)
    ProcessedActionStatusDetailsProtoOrBuilder {
  private ProcessedActionStatusDetailsProto() {
  }
  private int bitField0_;
  public static final int UNEXPECTED_ERROR_INFO_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto unexpectedErrorInfo_;
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  @java.lang.Override
  public boolean hasUnexpectedErrorInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto getUnexpectedErrorInfo() {
    return unexpectedErrorInfo_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.getDefaultInstance() : unexpectedErrorInfo_;
  }
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  private void setUnexpectedErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto value) {
    value.getClass();
  unexpectedErrorInfo_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeUnexpectedErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto value) {
    value.getClass();
  if (unexpectedErrorInfo_ != null &&
        unexpectedErrorInfo_ != org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.getDefaultInstance()) {
      unexpectedErrorInfo_ =
        org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.newBuilder(unexpectedErrorInfo_).mergeFrom(value).buildPartial();
    } else {
      unexpectedErrorInfo_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * More information included for unexpected errors.
   * Only set for action whose status are OTHER_ACTION_STATUS or
   * UNEXPECTED_JS_ERROR.
   * </pre>
   *
   * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
   */
  private void clearUnexpectedErrorInfo() {  unexpectedErrorInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int ORIGINAL_STATUS_FIELD_NUMBER = 2;
  private int originalStatus_;
  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   * @return Whether the originalStatus field is set.
   */
  @java.lang.Override
  public boolean hasOriginalStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   * @return The originalStatus.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getOriginalStatus() {
    org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto result = org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto.forNumber(originalStatus_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto.UNKNOWN_ACTION_STATUS : result;
  }
  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   * @param value The originalStatus to set.
   */
  private void setOriginalStatus(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto value) {
    originalStatus_ = value.getNumber();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
   * reported by the action is overridden after the action failed, to report a
   * more appropriate error. When that happens, this field contains the original
   * status, to help debugging.
   * </pre>
   *
   * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
   */
  private void clearOriginalStatus() {
    bitField0_ = (bitField0_ & ~0x00000002);
    originalStatus_ = 0;
  }

  public static final int AUTOFILL_ERROR_INFO_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto autofillErrorInfo_;
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  @java.lang.Override
  public boolean hasAutofillErrorInfo() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto getAutofillErrorInfo() {
    return autofillErrorInfo_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto.getDefaultInstance() : autofillErrorInfo_;
  }
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  private void setAutofillErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto value) {
    value.getClass();
  autofillErrorInfo_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAutofillErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto value) {
    value.getClass();
  if (autofillErrorInfo_ != null &&
        autofillErrorInfo_ != org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto.getDefaultInstance()) {
      autofillErrorInfo_ =
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto.newBuilder(autofillErrorInfo_).mergeFrom(value).buildPartial();
    } else {
      autofillErrorInfo_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * More information included for autofill related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
   */
  private void clearAutofillErrorInfo() {  autofillErrorInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int FORM_FIELD_ERROR_INFO_FIELD_NUMBER = 4;
  private org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto formFieldErrorInfo_;
  /**
   * <pre>
   * More information included for |SetFormFieldValueProto| related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
   */
  @java.lang.Override
  public boolean hasFormFieldErrorInfo() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * More information included for |SetFormFieldValueProto| related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto getFormFieldErrorInfo() {
    return formFieldErrorInfo_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto.getDefaultInstance() : formFieldErrorInfo_;
  }
  /**
   * <pre>
   * More information included for |SetFormFieldValueProto| related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
   */
  private void setFormFieldErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto value) {
    value.getClass();
  formFieldErrorInfo_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <pre>
   * More information included for |SetFormFieldValueProto| related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeFormFieldErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto value) {
    value.getClass();
  if (formFieldErrorInfo_ != null &&
        formFieldErrorInfo_ != org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto.getDefaultInstance()) {
      formFieldErrorInfo_ =
        org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto.newBuilder(formFieldErrorInfo_).mergeFrom(value).buildPartial();
    } else {
      formFieldErrorInfo_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * More information included for |SetFormFieldValueProto| related errors.
   * </pre>
   *
   * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
   */
  private void clearFormFieldErrorInfo() {  formFieldErrorInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static final int WEB_CONTROLLER_ERROR_INFO_FIELD_NUMBER = 5;
  private org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto webControllerErrorInfo_;
  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   */
  @java.lang.Override
  public boolean hasWebControllerErrorInfo() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto getWebControllerErrorInfo() {
    return webControllerErrorInfo_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.getDefaultInstance() : webControllerErrorInfo_;
  }
  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   */
  private void setWebControllerErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto value) {
    value.getClass();
  webControllerErrorInfo_ = value;
    bitField0_ |= 0x00000010;
    }
  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeWebControllerErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto value) {
    value.getClass();
  if (webControllerErrorInfo_ != null &&
        webControllerErrorInfo_ != org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.getDefaultInstance()) {
      webControllerErrorInfo_ =
        org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.newBuilder(webControllerErrorInfo_).mergeFrom(value).buildPartial();
    } else {
      webControllerErrorInfo_ = value;
    }
    bitField0_ |= 0x00000010;
  }
  /**
   * <pre>
   * Additional information from the |WebController|.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
   */
  private void clearWebControllerErrorInfo() {  webControllerErrorInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000010);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Extended information about the action status, which provides more details
   * about what happened than a simple ProcessedActionStatusProto can.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ProcessedActionStatusDetailsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ProcessedActionStatusDetailsProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * More information included for unexpected errors.
     * Only set for action whose status are OTHER_ACTION_STATUS or
     * UNEXPECTED_JS_ERROR.
     * </pre>
     *
     * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
     */
    @java.lang.Override
    public boolean hasUnexpectedErrorInfo() {
      return instance.hasUnexpectedErrorInfo();
    }
    /**
     * <pre>
     * More information included for unexpected errors.
     * Only set for action whose status are OTHER_ACTION_STATUS or
     * UNEXPECTED_JS_ERROR.
     * </pre>
     *
     * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto getUnexpectedErrorInfo() {
      return instance.getUnexpectedErrorInfo();
    }
    /**
     * <pre>
     * More information included for unexpected errors.
     * Only set for action whose status are OTHER_ACTION_STATUS or
     * UNEXPECTED_JS_ERROR.
     * </pre>
     *
     * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
     */
    public Builder setUnexpectedErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto value) {
      copyOnWrite();
      instance.setUnexpectedErrorInfo(value);
      return this;
      }
    /**
     * <pre>
     * More information included for unexpected errors.
     * Only set for action whose status are OTHER_ACTION_STATUS or
     * UNEXPECTED_JS_ERROR.
     * </pre>
     *
     * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
     */
    public Builder setUnexpectedErrorInfo(
        org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.Builder builderForValue) {
      copyOnWrite();
      instance.setUnexpectedErrorInfo(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * More information included for unexpected errors.
     * Only set for action whose status are OTHER_ACTION_STATUS or
     * UNEXPECTED_JS_ERROR.
     * </pre>
     *
     * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
     */
    public Builder mergeUnexpectedErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto value) {
      copyOnWrite();
      instance.mergeUnexpectedErrorInfo(value);
      return this;
    }
    /**
     * <pre>
     * More information included for unexpected errors.
     * Only set for action whose status are OTHER_ACTION_STATUS or
     * UNEXPECTED_JS_ERROR.
     * </pre>
     *
     * <code>optional .autofill_assistant.UnexpectedErrorInfoProto unexpected_error_info = 1;</code>
     */
    public Builder clearUnexpectedErrorInfo() {  copyOnWrite();
      instance.clearUnexpectedErrorInfo();
      return this;
    }

    /**
     * <pre>
     * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
     * reported by the action is overridden after the action failed, to report a
     * more appropriate error. When that happens, this field contains the original
     * status, to help debugging.
     * </pre>
     *
     * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
     * @return Whether the originalStatus field is set.
     */
    @java.lang.Override
    public boolean hasOriginalStatus() {
      return instance.hasOriginalStatus();
    }
    /**
     * <pre>
     * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
     * reported by the action is overridden after the action failed, to report a
     * more appropriate error. When that happens, this field contains the original
     * status, to help debugging.
     * </pre>
     *
     * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
     * @return The originalStatus.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto getOriginalStatus() {
      return instance.getOriginalStatus();
    }
    /**
     * <pre>
     * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
     * reported by the action is overridden after the action failed, to report a
     * more appropriate error. When that happens, this field contains the original
     * status, to help debugging.
     * </pre>
     *
     * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
     * @param value The enum numeric value on the wire for originalStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalStatus(org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto value) {
      copyOnWrite();
      instance.setOriginalStatus(value);
      return this;
    }
    /**
     * <pre>
     * In some case, such as USER_ABORTED_ACTION and NAVIGATION_ERROR, the status
     * reported by the action is overridden after the action failed, to report a
     * more appropriate error. When that happens, this field contains the original
     * status, to help debugging.
     * </pre>
     *
     * <code>optional .autofill_assistant.ProcessedActionStatusProto original_status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginalStatus() {
      copyOnWrite();
      instance.clearOriginalStatus();
      return this;
    }

    /**
     * <pre>
     * More information included for autofill related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
     */
    @java.lang.Override
    public boolean hasAutofillErrorInfo() {
      return instance.hasAutofillErrorInfo();
    }
    /**
     * <pre>
     * More information included for autofill related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto getAutofillErrorInfo() {
      return instance.getAutofillErrorInfo();
    }
    /**
     * <pre>
     * More information included for autofill related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
     */
    public Builder setAutofillErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto value) {
      copyOnWrite();
      instance.setAutofillErrorInfo(value);
      return this;
      }
    /**
     * <pre>
     * More information included for autofill related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
     */
    public Builder setAutofillErrorInfo(
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto.Builder builderForValue) {
      copyOnWrite();
      instance.setAutofillErrorInfo(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * More information included for autofill related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
     */
    public Builder mergeAutofillErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.AutofillErrorInfoProto value) {
      copyOnWrite();
      instance.mergeAutofillErrorInfo(value);
      return this;
    }
    /**
     * <pre>
     * More information included for autofill related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillErrorInfoProto autofill_error_info = 3;</code>
     */
    public Builder clearAutofillErrorInfo() {  copyOnWrite();
      instance.clearAutofillErrorInfo();
      return this;
    }

    /**
     * <pre>
     * More information included for |SetFormFieldValueProto| related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
     */
    @java.lang.Override
    public boolean hasFormFieldErrorInfo() {
      return instance.hasFormFieldErrorInfo();
    }
    /**
     * <pre>
     * More information included for |SetFormFieldValueProto| related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto getFormFieldErrorInfo() {
      return instance.getFormFieldErrorInfo();
    }
    /**
     * <pre>
     * More information included for |SetFormFieldValueProto| related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
     */
    public Builder setFormFieldErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto value) {
      copyOnWrite();
      instance.setFormFieldErrorInfo(value);
      return this;
      }
    /**
     * <pre>
     * More information included for |SetFormFieldValueProto| related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
     */
    public Builder setFormFieldErrorInfo(
        org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto.Builder builderForValue) {
      copyOnWrite();
      instance.setFormFieldErrorInfo(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * More information included for |SetFormFieldValueProto| related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
     */
    public Builder mergeFormFieldErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.SetFormFieldErrorInfoProto value) {
      copyOnWrite();
      instance.mergeFormFieldErrorInfo(value);
      return this;
    }
    /**
     * <pre>
     * More information included for |SetFormFieldValueProto| related errors.
     * </pre>
     *
     * <code>optional .autofill_assistant.SetFormFieldErrorInfoProto form_field_error_info = 4;</code>
     */
    public Builder clearFormFieldErrorInfo() {  copyOnWrite();
      instance.clearFormFieldErrorInfo();
      return this;
    }

    /**
     * <pre>
     * Additional information from the |WebController|.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
     */
    @java.lang.Override
    public boolean hasWebControllerErrorInfo() {
      return instance.hasWebControllerErrorInfo();
    }
    /**
     * <pre>
     * Additional information from the |WebController|.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto getWebControllerErrorInfo() {
      return instance.getWebControllerErrorInfo();
    }
    /**
     * <pre>
     * Additional information from the |WebController|.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
     */
    public Builder setWebControllerErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto value) {
      copyOnWrite();
      instance.setWebControllerErrorInfo(value);
      return this;
      }
    /**
     * <pre>
     * Additional information from the |WebController|.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
     */
    public Builder setWebControllerErrorInfo(
        org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.Builder builderForValue) {
      copyOnWrite();
      instance.setWebControllerErrorInfo(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Additional information from the |WebController|.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
     */
    public Builder mergeWebControllerErrorInfo(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto value) {
      copyOnWrite();
      instance.mergeWebControllerErrorInfo(value);
      return this;
    }
    /**
     * <pre>
     * Additional information from the |WebController|.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto web_controller_error_info = 5;</code>
     */
    public Builder clearWebControllerErrorInfo() {  copyOnWrite();
      instance.clearWebControllerErrorInfo();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ProcessedActionStatusDetailsProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "unexpectedErrorInfo_",
            "originalStatus_",
            org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusProto.internalGetVerifier(),
            "autofillErrorInfo_",
            "formFieldErrorInfo_",
            "webControllerErrorInfo_",
          };
          java.lang.String info =
              "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u100c\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ProcessedActionStatusDetailsProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto DEFAULT_INSTANCE;
  static {
    ProcessedActionStatusDetailsProto defaultInstance = new ProcessedActionStatusDetailsProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ProcessedActionStatusDetailsProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ProcessedActionStatusDetailsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ProcessedActionStatusDetailsProto> PARSER;

  public static com.google.protobuf.Parser<ProcessedActionStatusDetailsProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

