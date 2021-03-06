// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Extra debugging information included in case of unexpected errors.
 * Presence of this element is usually the sign of a bug in the client code and
 * is always the sign that the client code needs to be updated: such issues
 * should be either fixed or reported as proper, expected error with a useful
 * status code.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.UnexpectedErrorInfoProto}
 */
public  final class UnexpectedErrorInfoProto extends
    com.google.protobuf.GeneratedMessageLite<
        UnexpectedErrorInfoProto, UnexpectedErrorInfoProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.UnexpectedErrorInfoProto)
    UnexpectedErrorInfoProtoOrBuilder {
  private UnexpectedErrorInfoProto() {
    sourceFile_ = "";
    jsExceptionClassname_ = "";
    devtoolsErrorMessage_ = "";
  }
  private int bitField0_;
  public static final int SOURCE_FILE_FIELD_NUMBER = 1;
  private java.lang.String sourceFile_;
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   * @return Whether the sourceFile field is set.
   */
  @java.lang.Override
  public boolean hasSourceFile() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   * @return The sourceFile.
   */
  @java.lang.Override
  public java.lang.String getSourceFile() {
    return sourceFile_;
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   * @return The bytes for sourceFile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceFileBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(sourceFile_);
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   * @param value The sourceFile to set.
   */
  private void setSourceFile(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    sourceFile_ = value;
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   */
  private void clearSourceFile() {
    bitField0_ = (bitField0_ & ~0x00000001);
    sourceFile_ = getDefaultInstance().getSourceFile();
  }
  /**
   * <pre>
   * Source file, within the client code, where an unexpected error was detected
   * and reported.
   * Only filled for unexpected errors OTHER_ACTION_STATUS and
   * UNEXPECTED_JS_ERROR.
   * This and source_line are only meaningful for the exact version reported in
   * the client context.
   * </pre>
   *
   * <code>optional string source_file = 1;</code>
   * @param value The bytes for sourceFile to set.
   */
  private void setSourceFileBytes(
      com.google.protobuf.ByteString value) {
    sourceFile_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int SOURCE_LINE_NUMBER_FIELD_NUMBER = 2;
  private int sourceLineNumber_;
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   * @return Whether the sourceLineNumber field is set.
   */
  @java.lang.Override
  public boolean hasSourceLineNumber() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   * @return The sourceLineNumber.
   */
  @java.lang.Override
  public int getSourceLineNumber() {
    return sourceLineNumber_;
  }
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   * @param value The sourceLineNumber to set.
   */
  private void setSourceLineNumber(int value) {
    bitField0_ |= 0x00000002;
    sourceLineNumber_ = value;
  }
  /**
   * <pre>
   * Line number, within the client's source file, where the error was detected.
   * </pre>
   *
   * <code>optional int32 source_line_number = 2;</code>
   */
  private void clearSourceLineNumber() {
    bitField0_ = (bitField0_ & ~0x00000002);
    sourceLineNumber_ = 0;
  }

  public static final int JS_EXCEPTION_CLASSNAME_FIELD_NUMBER = 3;
  private java.lang.String jsExceptionClassname_;
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   * @return Whether the jsExceptionClassname field is set.
   */
  @java.lang.Override
  public boolean hasJsExceptionClassname() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   * @return The jsExceptionClassname.
   */
  @java.lang.Override
  public java.lang.String getJsExceptionClassname() {
    return jsExceptionClassname_;
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   * @return The bytes for jsExceptionClassname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJsExceptionClassnameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(jsExceptionClassname_);
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   * @param value The jsExceptionClassname to set.
   */
  private void setJsExceptionClassname(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000004;
    jsExceptionClassname_ = value;
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   */
  private void clearJsExceptionClassname() {
    bitField0_ = (bitField0_ & ~0x00000004);
    jsExceptionClassname_ = getDefaultInstance().getJsExceptionClassname();
  }
  /**
   * <pre>
   * JavaScript exception class name, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional string js_exception_classname = 3;</code>
   * @param value The bytes for jsExceptionClassname to set.
   */
  private void setJsExceptionClassnameBytes(
      com.google.protobuf.ByteString value) {
    jsExceptionClassname_ = value.toStringUtf8();
    bitField0_ |= 0x00000004;
  }

  public static final int JS_EXCEPTION_LINE_NUMBER_FIELD_NUMBER = 4;
  private int jsExceptionLineNumber_;
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   * @return Whether the jsExceptionLineNumber field is set.
   */
  @java.lang.Override
  public boolean hasJsExceptionLineNumber() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   * @return The jsExceptionLineNumber.
   */
  @java.lang.Override
  public int getJsExceptionLineNumber() {
    return jsExceptionLineNumber_;
  }
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   * @param value The jsExceptionLineNumber to set.
   */
  private void setJsExceptionLineNumber(int value) {
    bitField0_ |= 0x00000008;
    jsExceptionLineNumber_ = value;
  }
  /**
   * <pre>
   * JavaScript exception line number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_line_number = 4;</code>
   */
  private void clearJsExceptionLineNumber() {
    bitField0_ = (bitField0_ & ~0x00000008);
    jsExceptionLineNumber_ = 0;
  }

  public static final int JS_EXCEPTION_COLUMN_NUMBER_FIELD_NUMBER = 5;
  private int jsExceptionColumnNumber_;
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   * @return Whether the jsExceptionColumnNumber field is set.
   */
  @java.lang.Override
  public boolean hasJsExceptionColumnNumber() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   * @return The jsExceptionColumnNumber.
   */
  @java.lang.Override
  public int getJsExceptionColumnNumber() {
    return jsExceptionColumnNumber_;
  }
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   * @param value The jsExceptionColumnNumber to set.
   */
  private void setJsExceptionColumnNumber(int value) {
    bitField0_ |= 0x00000010;
    jsExceptionColumnNumber_ = value;
  }
  /**
   * <pre>
   * JavaScript exception column number, within the js snippet that was sent to
   * devtools runtime by the client, if reporting a JavaScript error.
   * </pre>
   *
   * <code>optional int32 js_exception_column_number = 5;</code>
   */
  private void clearJsExceptionColumnNumber() {
    bitField0_ = (bitField0_ & ~0x00000010);
    jsExceptionColumnNumber_ = 0;
  }

  public static final int DEVTOOLS_ERROR_CODE_FIELD_NUMBER = 6;
  private int devtoolsErrorCode_;
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   * @return Whether the devtoolsErrorCode field is set.
   */
  @java.lang.Override
  public boolean hasDevtoolsErrorCode() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   * @return The devtoolsErrorCode.
   */
  @java.lang.Override
  public int getDevtoolsErrorCode() {
    return devtoolsErrorCode_;
  }
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   * @param value The devtoolsErrorCode to set.
   */
  private void setDevtoolsErrorCode(int value) {
    bitField0_ |= 0x00000020;
    devtoolsErrorCode_ = value;
  }
  /**
   * <pre>
   * Error code returned by devtools, if any. 0 is considered a success.
   * </pre>
   *
   * <code>optional int32 devtools_error_code = 6;</code>
   */
  private void clearDevtoolsErrorCode() {
    bitField0_ = (bitField0_ & ~0x00000020);
    devtoolsErrorCode_ = 0;
  }

  public static final int DEVTOOLS_ERROR_MESSAGE_FIELD_NUMBER = 7;
  private java.lang.String devtoolsErrorMessage_;
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   * @return Whether the devtoolsErrorMessage field is set.
   */
  @java.lang.Override
  public boolean hasDevtoolsErrorMessage() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   * @return The devtoolsErrorMessage.
   */
  @java.lang.Override
  public java.lang.String getDevtoolsErrorMessage() {
    return devtoolsErrorMessage_;
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   * @return The bytes for devtoolsErrorMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDevtoolsErrorMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(devtoolsErrorMessage_);
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   * @param value The devtoolsErrorMessage to set.
   */
  private void setDevtoolsErrorMessage(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000040;
    devtoolsErrorMessage_ = value;
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   */
  private void clearDevtoolsErrorMessage() {
    bitField0_ = (bitField0_ & ~0x00000040);
    devtoolsErrorMessage_ = getDefaultInstance().getDevtoolsErrorMessage();
  }
  /**
   * <pre>
   * Error message returned by devtools, if any.
   * </pre>
   *
   * <code>optional string devtools_error_message = 7;</code>
   * @param value The bytes for devtoolsErrorMessage to set.
   */
  private void setDevtoolsErrorMessageBytes(
      com.google.protobuf.ByteString value) {
    devtoolsErrorMessage_ = value.toStringUtf8();
    bitField0_ |= 0x00000040;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Extra debugging information included in case of unexpected errors.
   * Presence of this element is usually the sign of a bug in the client code and
   * is always the sign that the client code needs to be updated: such issues
   * should be either fixed or reported as proper, expected error with a useful
   * status code.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.UnexpectedErrorInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.UnexpectedErrorInfoProto)
      org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     * @return Whether the sourceFile field is set.
     */
    @java.lang.Override
    public boolean hasSourceFile() {
      return instance.hasSourceFile();
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     * @return The sourceFile.
     */
    @java.lang.Override
    public java.lang.String getSourceFile() {
      return instance.getSourceFile();
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     * @return The bytes for sourceFile.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSourceFileBytes() {
      return instance.getSourceFileBytes();
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     * @param value The sourceFile to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFile(
        java.lang.String value) {
      copyOnWrite();
      instance.setSourceFile(value);
      return this;
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceFile() {
      copyOnWrite();
      instance.clearSourceFile();
      return this;
    }
    /**
     * <pre>
     * Source file, within the client code, where an unexpected error was detected
     * and reported.
     * Only filled for unexpected errors OTHER_ACTION_STATUS and
     * UNEXPECTED_JS_ERROR.
     * This and source_line are only meaningful for the exact version reported in
     * the client context.
     * </pre>
     *
     * <code>optional string source_file = 1;</code>
     * @param value The bytes for sourceFile to set.
     * @return This builder for chaining.
     */
    public Builder setSourceFileBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSourceFileBytes(value);
      return this;
    }

    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     * @return Whether the sourceLineNumber field is set.
     */
    @java.lang.Override
    public boolean hasSourceLineNumber() {
      return instance.hasSourceLineNumber();
    }
    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     * @return The sourceLineNumber.
     */
    @java.lang.Override
    public int getSourceLineNumber() {
      return instance.getSourceLineNumber();
    }
    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     * @param value The sourceLineNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSourceLineNumber(int value) {
      copyOnWrite();
      instance.setSourceLineNumber(value);
      return this;
    }
    /**
     * <pre>
     * Line number, within the client's source file, where the error was detected.
     * </pre>
     *
     * <code>optional int32 source_line_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceLineNumber() {
      copyOnWrite();
      instance.clearSourceLineNumber();
      return this;
    }

    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     * @return Whether the jsExceptionClassname field is set.
     */
    @java.lang.Override
    public boolean hasJsExceptionClassname() {
      return instance.hasJsExceptionClassname();
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     * @return The jsExceptionClassname.
     */
    @java.lang.Override
    public java.lang.String getJsExceptionClassname() {
      return instance.getJsExceptionClassname();
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     * @return The bytes for jsExceptionClassname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJsExceptionClassnameBytes() {
      return instance.getJsExceptionClassnameBytes();
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     * @param value The jsExceptionClassname to set.
     * @return This builder for chaining.
     */
    public Builder setJsExceptionClassname(
        java.lang.String value) {
      copyOnWrite();
      instance.setJsExceptionClassname(value);
      return this;
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsExceptionClassname() {
      copyOnWrite();
      instance.clearJsExceptionClassname();
      return this;
    }
    /**
     * <pre>
     * JavaScript exception class name, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional string js_exception_classname = 3;</code>
     * @param value The bytes for jsExceptionClassname to set.
     * @return This builder for chaining.
     */
    public Builder setJsExceptionClassnameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setJsExceptionClassnameBytes(value);
      return this;
    }

    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     * @return Whether the jsExceptionLineNumber field is set.
     */
    @java.lang.Override
    public boolean hasJsExceptionLineNumber() {
      return instance.hasJsExceptionLineNumber();
    }
    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     * @return The jsExceptionLineNumber.
     */
    @java.lang.Override
    public int getJsExceptionLineNumber() {
      return instance.getJsExceptionLineNumber();
    }
    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     * @param value The jsExceptionLineNumber to set.
     * @return This builder for chaining.
     */
    public Builder setJsExceptionLineNumber(int value) {
      copyOnWrite();
      instance.setJsExceptionLineNumber(value);
      return this;
    }
    /**
     * <pre>
     * JavaScript exception line number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_line_number = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsExceptionLineNumber() {
      copyOnWrite();
      instance.clearJsExceptionLineNumber();
      return this;
    }

    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     * @return Whether the jsExceptionColumnNumber field is set.
     */
    @java.lang.Override
    public boolean hasJsExceptionColumnNumber() {
      return instance.hasJsExceptionColumnNumber();
    }
    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     * @return The jsExceptionColumnNumber.
     */
    @java.lang.Override
    public int getJsExceptionColumnNumber() {
      return instance.getJsExceptionColumnNumber();
    }
    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     * @param value The jsExceptionColumnNumber to set.
     * @return This builder for chaining.
     */
    public Builder setJsExceptionColumnNumber(int value) {
      copyOnWrite();
      instance.setJsExceptionColumnNumber(value);
      return this;
    }
    /**
     * <pre>
     * JavaScript exception column number, within the js snippet that was sent to
     * devtools runtime by the client, if reporting a JavaScript error.
     * </pre>
     *
     * <code>optional int32 js_exception_column_number = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsExceptionColumnNumber() {
      copyOnWrite();
      instance.clearJsExceptionColumnNumber();
      return this;
    }

    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     * @return Whether the devtoolsErrorCode field is set.
     */
    @java.lang.Override
    public boolean hasDevtoolsErrorCode() {
      return instance.hasDevtoolsErrorCode();
    }
    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     * @return The devtoolsErrorCode.
     */
    @java.lang.Override
    public int getDevtoolsErrorCode() {
      return instance.getDevtoolsErrorCode();
    }
    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     * @param value The devtoolsErrorCode to set.
     * @return This builder for chaining.
     */
    public Builder setDevtoolsErrorCode(int value) {
      copyOnWrite();
      instance.setDevtoolsErrorCode(value);
      return this;
    }
    /**
     * <pre>
     * Error code returned by devtools, if any. 0 is considered a success.
     * </pre>
     *
     * <code>optional int32 devtools_error_code = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevtoolsErrorCode() {
      copyOnWrite();
      instance.clearDevtoolsErrorCode();
      return this;
    }

    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     * @return Whether the devtoolsErrorMessage field is set.
     */
    @java.lang.Override
    public boolean hasDevtoolsErrorMessage() {
      return instance.hasDevtoolsErrorMessage();
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     * @return The devtoolsErrorMessage.
     */
    @java.lang.Override
    public java.lang.String getDevtoolsErrorMessage() {
      return instance.getDevtoolsErrorMessage();
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     * @return The bytes for devtoolsErrorMessage.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDevtoolsErrorMessageBytes() {
      return instance.getDevtoolsErrorMessageBytes();
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     * @param value The devtoolsErrorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setDevtoolsErrorMessage(
        java.lang.String value) {
      copyOnWrite();
      instance.setDevtoolsErrorMessage(value);
      return this;
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevtoolsErrorMessage() {
      copyOnWrite();
      instance.clearDevtoolsErrorMessage();
      return this;
    }
    /**
     * <pre>
     * Error message returned by devtools, if any.
     * </pre>
     *
     * <code>optional string devtools_error_message = 7;</code>
     * @param value The bytes for devtoolsErrorMessage to set.
     * @return This builder for chaining.
     */
    public Builder setDevtoolsErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDevtoolsErrorMessageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.UnexpectedErrorInfoProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "sourceFile_",
            "sourceLineNumber_",
            "jsExceptionClassname_",
            "jsExceptionLineNumber_",
            "jsExceptionColumnNumber_",
            "devtoolsErrorCode_",
            "devtoolsErrorMessage_",
          };
          java.lang.String info =
              "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002" +
              "\u1004\u0001\u0003\u1008\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005" +
              "\u0007\u1008\u0006";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.UnexpectedErrorInfoProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto DEFAULT_INSTANCE;
  static {
    UnexpectedErrorInfoProto defaultInstance = new UnexpectedErrorInfoProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UnexpectedErrorInfoProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.UnexpectedErrorInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UnexpectedErrorInfoProto> PARSER;

  public static com.google.protobuf.Parser<UnexpectedErrorInfoProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

