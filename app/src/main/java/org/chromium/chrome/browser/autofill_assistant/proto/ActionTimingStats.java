// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ActionTimingStats}
 */
public  final class ActionTimingStats extends
    com.google.protobuf.GeneratedMessageLite<
        ActionTimingStats, ActionTimingStats.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ActionTimingStats)
    ActionTimingStatsOrBuilder {
  private ActionTimingStats() {
  }
  private int bitField0_;
  public static final int DELAY_MS_FIELD_NUMBER = 1;
  private long delayMs_;
  /**
   * <pre>
   * Requested delay before executing the action.
   * </pre>
   *
   * <code>optional int64 delay_ms = 1;</code>
   * @return Whether the delayMs field is set.
   */
  @java.lang.Override
  public boolean hasDelayMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Requested delay before executing the action.
   * </pre>
   *
   * <code>optional int64 delay_ms = 1;</code>
   * @return The delayMs.
   */
  @java.lang.Override
  public long getDelayMs() {
    return delayMs_;
  }
  /**
   * <pre>
   * Requested delay before executing the action.
   * </pre>
   *
   * <code>optional int64 delay_ms = 1;</code>
   * @param value The delayMs to set.
   */
  private void setDelayMs(long value) {
    bitField0_ |= 0x00000001;
    delayMs_ = value;
  }
  /**
   * <pre>
   * Requested delay before executing the action.
   * </pre>
   *
   * <code>optional int64 delay_ms = 1;</code>
   */
  private void clearDelayMs() {
    bitField0_ = (bitField0_ & ~0x00000001);
    delayMs_ = 0L;
  }

  public static final int ACTIVE_TIME_MS_FIELD_NUMBER = 2;
  private long activeTimeMs_;
  /**
   * <pre>
   * Time actively spent by the client to execute the action.
   * </pre>
   *
   * <code>optional int64 active_time_ms = 2;</code>
   * @return Whether the activeTimeMs field is set.
   */
  @java.lang.Override
  public boolean hasActiveTimeMs() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Time actively spent by the client to execute the action.
   * </pre>
   *
   * <code>optional int64 active_time_ms = 2;</code>
   * @return The activeTimeMs.
   */
  @java.lang.Override
  public long getActiveTimeMs() {
    return activeTimeMs_;
  }
  /**
   * <pre>
   * Time actively spent by the client to execute the action.
   * </pre>
   *
   * <code>optional int64 active_time_ms = 2;</code>
   * @param value The activeTimeMs to set.
   */
  private void setActiveTimeMs(long value) {
    bitField0_ |= 0x00000002;
    activeTimeMs_ = value;
  }
  /**
   * <pre>
   * Time actively spent by the client to execute the action.
   * </pre>
   *
   * <code>optional int64 active_time_ms = 2;</code>
   */
  private void clearActiveTimeMs() {
    bitField0_ = (bitField0_ & ~0x00000002);
    activeTimeMs_ = 0L;
  }

  public static final int WAIT_TIME_MS_FIELD_NUMBER = 3;
  private long waitTimeMs_;
  /**
   * <pre>
   * Time spent waiting for users to complete a task and/or for website
   * loading/navigation.
   * </pre>
   *
   * <code>optional int64 wait_time_ms = 3;</code>
   * @return Whether the waitTimeMs field is set.
   */
  @java.lang.Override
  public boolean hasWaitTimeMs() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Time spent waiting for users to complete a task and/or for website
   * loading/navigation.
   * </pre>
   *
   * <code>optional int64 wait_time_ms = 3;</code>
   * @return The waitTimeMs.
   */
  @java.lang.Override
  public long getWaitTimeMs() {
    return waitTimeMs_;
  }
  /**
   * <pre>
   * Time spent waiting for users to complete a task and/or for website
   * loading/navigation.
   * </pre>
   *
   * <code>optional int64 wait_time_ms = 3;</code>
   * @param value The waitTimeMs to set.
   */
  private void setWaitTimeMs(long value) {
    bitField0_ |= 0x00000004;
    waitTimeMs_ = value;
  }
  /**
   * <pre>
   * Time spent waiting for users to complete a task and/or for website
   * loading/navigation.
   * </pre>
   *
   * <code>optional int64 wait_time_ms = 3;</code>
   */
  private void clearWaitTimeMs() {
    bitField0_ = (bitField0_ & ~0x00000004);
    waitTimeMs_ = 0L;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ActionTimingStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ActionTimingStats)
      org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStatsOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Requested delay before executing the action.
     * </pre>
     *
     * <code>optional int64 delay_ms = 1;</code>
     * @return Whether the delayMs field is set.
     */
    @java.lang.Override
    public boolean hasDelayMs() {
      return instance.hasDelayMs();
    }
    /**
     * <pre>
     * Requested delay before executing the action.
     * </pre>
     *
     * <code>optional int64 delay_ms = 1;</code>
     * @return The delayMs.
     */
    @java.lang.Override
    public long getDelayMs() {
      return instance.getDelayMs();
    }
    /**
     * <pre>
     * Requested delay before executing the action.
     * </pre>
     *
     * <code>optional int64 delay_ms = 1;</code>
     * @param value The delayMs to set.
     * @return This builder for chaining.
     */
    public Builder setDelayMs(long value) {
      copyOnWrite();
      instance.setDelayMs(value);
      return this;
    }
    /**
     * <pre>
     * Requested delay before executing the action.
     * </pre>
     *
     * <code>optional int64 delay_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDelayMs() {
      copyOnWrite();
      instance.clearDelayMs();
      return this;
    }

    /**
     * <pre>
     * Time actively spent by the client to execute the action.
     * </pre>
     *
     * <code>optional int64 active_time_ms = 2;</code>
     * @return Whether the activeTimeMs field is set.
     */
    @java.lang.Override
    public boolean hasActiveTimeMs() {
      return instance.hasActiveTimeMs();
    }
    /**
     * <pre>
     * Time actively spent by the client to execute the action.
     * </pre>
     *
     * <code>optional int64 active_time_ms = 2;</code>
     * @return The activeTimeMs.
     */
    @java.lang.Override
    public long getActiveTimeMs() {
      return instance.getActiveTimeMs();
    }
    /**
     * <pre>
     * Time actively spent by the client to execute the action.
     * </pre>
     *
     * <code>optional int64 active_time_ms = 2;</code>
     * @param value The activeTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setActiveTimeMs(long value) {
      copyOnWrite();
      instance.setActiveTimeMs(value);
      return this;
    }
    /**
     * <pre>
     * Time actively spent by the client to execute the action.
     * </pre>
     *
     * <code>optional int64 active_time_ms = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveTimeMs() {
      copyOnWrite();
      instance.clearActiveTimeMs();
      return this;
    }

    /**
     * <pre>
     * Time spent waiting for users to complete a task and/or for website
     * loading/navigation.
     * </pre>
     *
     * <code>optional int64 wait_time_ms = 3;</code>
     * @return Whether the waitTimeMs field is set.
     */
    @java.lang.Override
    public boolean hasWaitTimeMs() {
      return instance.hasWaitTimeMs();
    }
    /**
     * <pre>
     * Time spent waiting for users to complete a task and/or for website
     * loading/navigation.
     * </pre>
     *
     * <code>optional int64 wait_time_ms = 3;</code>
     * @return The waitTimeMs.
     */
    @java.lang.Override
    public long getWaitTimeMs() {
      return instance.getWaitTimeMs();
    }
    /**
     * <pre>
     * Time spent waiting for users to complete a task and/or for website
     * loading/navigation.
     * </pre>
     *
     * <code>optional int64 wait_time_ms = 3;</code>
     * @param value The waitTimeMs to set.
     * @return This builder for chaining.
     */
    public Builder setWaitTimeMs(long value) {
      copyOnWrite();
      instance.setWaitTimeMs(value);
      return this;
    }
    /**
     * <pre>
     * Time spent waiting for users to complete a task and/or for website
     * loading/navigation.
     * </pre>
     *
     * <code>optional int64 wait_time_ms = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWaitTimeMs() {
      copyOnWrite();
      instance.clearWaitTimeMs();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ActionTimingStats)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "delayMs_",
            "activeTimeMs_",
            "waitTimeMs_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002" +
              "\u1002\u0001\u0003\u1002\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ActionTimingStats)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats DEFAULT_INSTANCE;
  static {
    ActionTimingStats defaultInstance = new ActionTimingStats();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ActionTimingStats.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ActionTimingStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ActionTimingStats> PARSER;

  public static com.google.protobuf.Parser<ActionTimingStats> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

