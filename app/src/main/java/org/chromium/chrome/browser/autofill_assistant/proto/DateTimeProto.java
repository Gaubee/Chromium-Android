// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.DateTimeProto}
 */
public  final class DateTimeProto extends
    com.google.protobuf.GeneratedMessageLite<
        DateTimeProto, DateTimeProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.DateTimeProto)
    DateTimeProtoOrBuilder {
  private DateTimeProto() {
  }
  private int bitField0_;
  public static final int DATE_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.DateProto date_;
  /**
   * <code>optional .autofill_assistant.DateProto date = 1;</code>
   */
  @java.lang.Override
  public boolean hasDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.DateProto date = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.DateProto getDate() {
    return date_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.DateProto.getDefaultInstance() : date_;
  }
  /**
   * <code>optional .autofill_assistant.DateProto date = 1;</code>
   */
  private void setDate(org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
    value.getClass();
  date_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.DateProto date = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDate(org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
    value.getClass();
  if (date_ != null &&
        date_ != org.chromium.chrome.browser.autofill_assistant.proto.DateProto.getDefaultInstance()) {
      date_ =
        org.chromium.chrome.browser.autofill_assistant.proto.DateProto.newBuilder(date_).mergeFrom(value).buildPartial();
    } else {
      date_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.DateProto date = 1;</code>
   */
  private void clearDate() {  date_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.TimeProto time_;
  /**
   * <code>optional .autofill_assistant.TimeProto time = 2;</code>
   */
  @java.lang.Override
  public boolean hasTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.TimeProto time = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.TimeProto getTime() {
    return time_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.TimeProto.getDefaultInstance() : time_;
  }
  /**
   * <code>optional .autofill_assistant.TimeProto time = 2;</code>
   */
  private void setTime(org.chromium.chrome.browser.autofill_assistant.proto.TimeProto value) {
    value.getClass();
  time_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.TimeProto time = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTime(org.chromium.chrome.browser.autofill_assistant.proto.TimeProto value) {
    value.getClass();
  if (time_ != null &&
        time_ != org.chromium.chrome.browser.autofill_assistant.proto.TimeProto.getDefaultInstance()) {
      time_ =
        org.chromium.chrome.browser.autofill_assistant.proto.TimeProto.newBuilder(time_).mergeFrom(value).buildPartial();
    } else {
      time_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.TimeProto time = 2;</code>
   */
  private void clearTime() {  time_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.DateTimeProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.DateTimeProto)
      org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.DateProto date = 1;</code>
     */
    @java.lang.Override
    public boolean hasDate() {
      return instance.hasDate();
    }
    /**
     * <code>optional .autofill_assistant.DateProto date = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DateProto getDate() {
      return instance.getDate();
    }
    /**
     * <code>optional .autofill_assistant.DateProto date = 1;</code>
     */
    public Builder setDate(org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
      copyOnWrite();
      instance.setDate(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.DateProto date = 1;</code>
     */
    public Builder setDate(
        org.chromium.chrome.browser.autofill_assistant.proto.DateProto.Builder builderForValue) {
      copyOnWrite();
      instance.setDate(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.DateProto date = 1;</code>
     */
    public Builder mergeDate(org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
      copyOnWrite();
      instance.mergeDate(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.DateProto date = 1;</code>
     */
    public Builder clearDate() {  copyOnWrite();
      instance.clearDate();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.TimeProto time = 2;</code>
     */
    @java.lang.Override
    public boolean hasTime() {
      return instance.hasTime();
    }
    /**
     * <code>optional .autofill_assistant.TimeProto time = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.TimeProto getTime() {
      return instance.getTime();
    }
    /**
     * <code>optional .autofill_assistant.TimeProto time = 2;</code>
     */
    public Builder setTime(org.chromium.chrome.browser.autofill_assistant.proto.TimeProto value) {
      copyOnWrite();
      instance.setTime(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.TimeProto time = 2;</code>
     */
    public Builder setTime(
        org.chromium.chrome.browser.autofill_assistant.proto.TimeProto.Builder builderForValue) {
      copyOnWrite();
      instance.setTime(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.TimeProto time = 2;</code>
     */
    public Builder mergeTime(org.chromium.chrome.browser.autofill_assistant.proto.TimeProto value) {
      copyOnWrite();
      instance.mergeTime(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.TimeProto time = 2;</code>
     */
    public Builder clearTime() {  copyOnWrite();
      instance.clearTime();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.DateTimeProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "date_",
            "time_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.DateTimeProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto DEFAULT_INSTANCE;
  static {
    DateTimeProto defaultInstance = new DateTimeProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DateTimeProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateTimeProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DateTimeProto> PARSER;

  public static com.google.protobuf.Parser<DateTimeProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

