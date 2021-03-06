// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Wait for the document to be ready before proceeding.
 * Client errors:
 *   TIMED_OUT if timed out waiting for an acceptable state.
 *   ELEMENT_RESOLUTION_FAILED if the specified frame selector could not be
 *   found.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.WaitForDocumentProto}
 */
public  final class WaitForDocumentProto extends
    com.google.protobuf.GeneratedMessageLite<
        WaitForDocumentProto, WaitForDocumentProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.WaitForDocumentProto)
    WaitForDocumentProtoOrBuilder {
  private WaitForDocumentProto() {
    timeoutMs_ = 5000;
    minReadyState_ = 4;
  }
  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.WaitForDocumentProto.Result)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The ready state found when the action started.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
     * @return Whether the startReadyState field is set.
     */
    boolean hasStartReadyState();
    /**
     * <pre>
     * The ready state found when the action started.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
     * @return The startReadyState.
     */
    org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getStartReadyState();

    /**
     * <pre>
     * The ready state found when the action ended.
     * This is filled even when the action fails, so it is not guaranteed to
     * match min_ready_state.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
     * @return Whether the endReadyState field is set.
     */
    boolean hasEndReadyState();
    /**
     * <pre>
     * The ready state found when the action ended.
     * This is filled even when the action fails, so it is not guaranteed to
     * match min_ready_state.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
     * @return The endReadyState.
     */
    org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getEndReadyState();
  }
  /**
   * Protobuf type {@code autofill_assistant.WaitForDocumentProto.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageLite<
          Result, Result.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.WaitForDocumentProto.Result)
      ResultOrBuilder {
    private Result() {
    }
    private int bitField0_;
    public static final int START_READY_STATE_FIELD_NUMBER = 1;
    private int startReadyState_;
    /**
     * <pre>
     * The ready state found when the action started.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
     * @return Whether the startReadyState field is set.
     */
    @java.lang.Override
    public boolean hasStartReadyState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The ready state found when the action started.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
     * @return The startReadyState.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getStartReadyState() {
      org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState result = org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.forNumber(startReadyState_);
      return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.DOCUMENT_UNKNOWN_READY_STATE : result;
    }
    /**
     * <pre>
     * The ready state found when the action started.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
     * @param value The startReadyState to set.
     */
    private void setStartReadyState(org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState value) {
      startReadyState_ = value.getNumber();
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The ready state found when the action started.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
     */
    private void clearStartReadyState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startReadyState_ = 0;
    }

    public static final int END_READY_STATE_FIELD_NUMBER = 2;
    private int endReadyState_;
    /**
     * <pre>
     * The ready state found when the action ended.
     * This is filled even when the action fails, so it is not guaranteed to
     * match min_ready_state.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
     * @return Whether the endReadyState field is set.
     */
    @java.lang.Override
    public boolean hasEndReadyState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The ready state found when the action ended.
     * This is filled even when the action fails, so it is not guaranteed to
     * match min_ready_state.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
     * @return The endReadyState.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getEndReadyState() {
      org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState result = org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.forNumber(endReadyState_);
      return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.DOCUMENT_UNKNOWN_READY_STATE : result;
    }
    /**
     * <pre>
     * The ready state found when the action ended.
     * This is filled even when the action fails, so it is not guaranteed to
     * match min_ready_state.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
     * @param value The endReadyState to set.
     */
    private void setEndReadyState(org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState value) {
      endReadyState_ = value.getNumber();
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The ready state found when the action ended.
     * This is filled even when the action fails, so it is not guaranteed to
     * match min_ready_state.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
     */
    private void clearEndReadyState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endReadyState_ = 0;
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code autofill_assistant.WaitForDocumentProto.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.WaitForDocumentProto.Result)
        org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.ResultOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The ready state found when the action started.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
       * @return Whether the startReadyState field is set.
       */
      @java.lang.Override
      public boolean hasStartReadyState() {
        return instance.hasStartReadyState();
      }
      /**
       * <pre>
       * The ready state found when the action started.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
       * @return The startReadyState.
       */
      @java.lang.Override
      public org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getStartReadyState() {
        return instance.getStartReadyState();
      }
      /**
       * <pre>
       * The ready state found when the action started.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
       * @param value The enum numeric value on the wire for startReadyState to set.
       * @return This builder for chaining.
       */
      public Builder setStartReadyState(org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState value) {
        copyOnWrite();
        instance.setStartReadyState(value);
        return this;
      }
      /**
       * <pre>
       * The ready state found when the action started.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState start_ready_state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartReadyState() {
        copyOnWrite();
        instance.clearStartReadyState();
        return this;
      }

      /**
       * <pre>
       * The ready state found when the action ended.
       * This is filled even when the action fails, so it is not guaranteed to
       * match min_ready_state.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
       * @return Whether the endReadyState field is set.
       */
      @java.lang.Override
      public boolean hasEndReadyState() {
        return instance.hasEndReadyState();
      }
      /**
       * <pre>
       * The ready state found when the action ended.
       * This is filled even when the action fails, so it is not guaranteed to
       * match min_ready_state.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
       * @return The endReadyState.
       */
      @java.lang.Override
      public org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getEndReadyState() {
        return instance.getEndReadyState();
      }
      /**
       * <pre>
       * The ready state found when the action ended.
       * This is filled even when the action fails, so it is not guaranteed to
       * match min_ready_state.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
       * @param value The enum numeric value on the wire for endReadyState to set.
       * @return This builder for chaining.
       */
      public Builder setEndReadyState(org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState value) {
        copyOnWrite();
        instance.setEndReadyState(value);
        return this;
      }
      /**
       * <pre>
       * The ready state found when the action ended.
       * This is filled even when the action fails, so it is not guaranteed to
       * match min_ready_state.
       * </pre>
       *
       * <code>optional .autofill_assistant.DocumentReadyState end_ready_state = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndReadyState() {
        copyOnWrite();
        instance.clearEndReadyState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.WaitForDocumentProto.Result)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "startReadyState_",
              org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.internalGetVerifier(),
              "endReadyState_",
              org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.internalGetVerifier(),
            };
            java.lang.String info =
                "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002" +
                "\u100c\u0001";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result>(
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


    // @@protoc_insertion_point(class_scope:autofill_assistant.WaitForDocumentProto.Result)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result DEFAULT_INSTANCE;
    static {
      Result defaultInstance = new Result();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Result.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Result> PARSER;

    public static com.google.protobuf.Parser<Result> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  public static final int TIMEOUT_MS_FIELD_NUMBER = 1;
  private int timeoutMs_;
  /**
   * <pre>
   * Maximum amount of time to wait for the state to change. Set it to 0 to
   * check once and report the result immediately, without waiting.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
   * @return Whether the timeoutMs field is set.
   */
  @java.lang.Override
  public boolean hasTimeoutMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Maximum amount of time to wait for the state to change. Set it to 0 to
   * check once and report the result immediately, without waiting.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
   * @return The timeoutMs.
   */
  @java.lang.Override
  public int getTimeoutMs() {
    return timeoutMs_;
  }
  /**
   * <pre>
   * Maximum amount of time to wait for the state to change. Set it to 0 to
   * check once and report the result immediately, without waiting.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
   * @param value The timeoutMs to set.
   */
  private void setTimeoutMs(int value) {
    bitField0_ |= 0x00000001;
    timeoutMs_ = value;
  }
  /**
   * <pre>
   * Maximum amount of time to wait for the state to change. Set it to 0 to
   * check once and report the result immediately, without waiting.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
   */
  private void clearTimeoutMs() {
    bitField0_ = (bitField0_ & ~0x00000001);
    timeoutMs_ = 5000;
  }

  public static final int FRAME_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto frame_;
  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   */
  @java.lang.Override
  public boolean hasFrame() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getFrame() {
    return frame_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.getDefaultInstance() : frame_;
  }
  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   */
  private void setFrame(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
    value.getClass();
  frame_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeFrame(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
    value.getClass();
  if (frame_ != null &&
        frame_ != org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.getDefaultInstance()) {
      frame_ =
        org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.newBuilder(frame_).mergeFrom(value).buildPartial();
    } else {
      frame_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * If specified, check the document in the given frame, instead
   * of the main document.
   * </pre>
   *
   * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
   */
  private void clearFrame() {  frame_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int MIN_READY_STATE_FIELD_NUMBER = 3;
  private int minReadyState_;
  /**
   * <pre>
   * The minimum ready state needed to satisfy the requirement.
   * </pre>
   *
   * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
   * @return Whether the minReadyState field is set.
   */
  @java.lang.Override
  public boolean hasMinReadyState() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The minimum ready state needed to satisfy the requirement.
   * </pre>
   *
   * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
   * @return The minReadyState.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getMinReadyState() {
    org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState result = org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.forNumber(minReadyState_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.DOCUMENT_INTERACTIVE : result;
  }
  /**
   * <pre>
   * The minimum ready state needed to satisfy the requirement.
   * </pre>
   *
   * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
   * @param value The minReadyState to set.
   */
  private void setMinReadyState(org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState value) {
    minReadyState_ = value.getNumber();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * The minimum ready state needed to satisfy the requirement.
   * </pre>
   *
   * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
   */
  private void clearMinReadyState() {
    bitField0_ = (bitField0_ & ~0x00000004);
    minReadyState_ = 4;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Wait for the document to be ready before proceeding.
   * Client errors:
   *   TIMED_OUT if timed out waiting for an acceptable state.
   *   ELEMENT_RESOLUTION_FAILED if the specified frame selector could not be
   *   found.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.WaitForDocumentProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.WaitForDocumentProto)
      org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Maximum amount of time to wait for the state to change. Set it to 0 to
     * check once and report the result immediately, without waiting.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
     * @return Whether the timeoutMs field is set.
     */
    @java.lang.Override
    public boolean hasTimeoutMs() {
      return instance.hasTimeoutMs();
    }
    /**
     * <pre>
     * Maximum amount of time to wait for the state to change. Set it to 0 to
     * check once and report the result immediately, without waiting.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
     * @return The timeoutMs.
     */
    @java.lang.Override
    public int getTimeoutMs() {
      return instance.getTimeoutMs();
    }
    /**
     * <pre>
     * Maximum amount of time to wait for the state to change. Set it to 0 to
     * check once and report the result immediately, without waiting.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
     * @param value The timeoutMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutMs(int value) {
      copyOnWrite();
      instance.setTimeoutMs(value);
      return this;
    }
    /**
     * <pre>
     * Maximum amount of time to wait for the state to change. Set it to 0 to
     * check once and report the result immediately, without waiting.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1 [default = 5000];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeoutMs() {
      copyOnWrite();
      instance.clearTimeoutMs();
      return this;
    }

    /**
     * <pre>
     * If specified, check the document in the given frame, instead
     * of the main document.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
     */
    @java.lang.Override
    public boolean hasFrame() {
      return instance.hasFrame();
    }
    /**
     * <pre>
     * If specified, check the document in the given frame, instead
     * of the main document.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto getFrame() {
      return instance.getFrame();
    }
    /**
     * <pre>
     * If specified, check the document in the given frame, instead
     * of the main document.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
     */
    public Builder setFrame(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
      copyOnWrite();
      instance.setFrame(value);
      return this;
      }
    /**
     * <pre>
     * If specified, check the document in the given frame, instead
     * of the main document.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
     */
    public Builder setFrame(
        org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto.Builder builderForValue) {
      copyOnWrite();
      instance.setFrame(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * If specified, check the document in the given frame, instead
     * of the main document.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
     */
    public Builder mergeFrame(org.chromium.chrome.browser.autofill_assistant.proto.SelectorProto value) {
      copyOnWrite();
      instance.mergeFrame(value);
      return this;
    }
    /**
     * <pre>
     * If specified, check the document in the given frame, instead
     * of the main document.
     * </pre>
     *
     * <code>optional .autofill_assistant.SelectorProto frame = 2;</code>
     */
    public Builder clearFrame() {  copyOnWrite();
      instance.clearFrame();
      return this;
    }

    /**
     * <pre>
     * The minimum ready state needed to satisfy the requirement.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
     * @return Whether the minReadyState field is set.
     */
    @java.lang.Override
    public boolean hasMinReadyState() {
      return instance.hasMinReadyState();
    }
    /**
     * <pre>
     * The minimum ready state needed to satisfy the requirement.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
     * @return The minReadyState.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState getMinReadyState() {
      return instance.getMinReadyState();
    }
    /**
     * <pre>
     * The minimum ready state needed to satisfy the requirement.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
     * @param value The enum numeric value on the wire for minReadyState to set.
     * @return This builder for chaining.
     */
    public Builder setMinReadyState(org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState value) {
      copyOnWrite();
      instance.setMinReadyState(value);
      return this;
    }
    /**
     * <pre>
     * The minimum ready state needed to satisfy the requirement.
     * </pre>
     *
     * <code>optional .autofill_assistant.DocumentReadyState min_ready_state = 3 [default = DOCUMENT_INTERACTIVE];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinReadyState() {
      copyOnWrite();
      instance.clearMinReadyState();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.WaitForDocumentProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "timeoutMs_",
            "frame_",
            "minReadyState_",
            org.chromium.chrome.browser.autofill_assistant.proto.DocumentReadyState.internalGetVerifier(),
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002" +
              "\u1009\u0001\u0003\u100c\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.WaitForDocumentProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto DEFAULT_INSTANCE;
  static {
    WaitForDocumentProto defaultInstance = new WaitForDocumentProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      WaitForDocumentProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDocumentProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WaitForDocumentProto> PARSER;

  public static com.google.protobuf.Parser<WaitForDocumentProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

