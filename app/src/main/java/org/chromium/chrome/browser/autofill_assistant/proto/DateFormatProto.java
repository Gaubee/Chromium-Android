// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * A format string for a date, such as "EEE, MMM d". See
 * http://userguide.icu-project.org/formatparse/datetime for full specification.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.DateFormatProto}
 */
public  final class DateFormatProto extends
    com.google.protobuf.GeneratedMessageLite<
        DateFormatProto, DateFormatProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.DateFormatProto)
    DateFormatProtoOrBuilder {
  private DateFormatProto() {
    dateFormat_ = "";
  }
  private int bitField0_;
  public static final int DATE_FORMAT_FIELD_NUMBER = 1;
  private java.lang.String dateFormat_;
  /**
   * <code>optional string date_format = 1;</code>
   * @return Whether the dateFormat field is set.
   */
  @java.lang.Override
  public boolean hasDateFormat() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string date_format = 1;</code>
   * @return The dateFormat.
   */
  @java.lang.Override
  public java.lang.String getDateFormat() {
    return dateFormat_;
  }
  /**
   * <code>optional string date_format = 1;</code>
   * @return The bytes for dateFormat.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateFormatBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(dateFormat_);
  }
  /**
   * <code>optional string date_format = 1;</code>
   * @param value The dateFormat to set.
   */
  private void setDateFormat(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    dateFormat_ = value;
  }
  /**
   * <code>optional string date_format = 1;</code>
   */
  private void clearDateFormat() {
    bitField0_ = (bitField0_ & ~0x00000001);
    dateFormat_ = getDefaultInstance().getDateFormat();
  }
  /**
   * <code>optional string date_format = 1;</code>
   * @param value The bytes for dateFormat to set.
   */
  private void setDateFormatBytes(
      com.google.protobuf.ByteString value) {
    dateFormat_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A format string for a date, such as "EEE, MMM d". See
   * http://userguide.icu-project.org/formatparse/datetime for full specification.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.DateFormatProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.DateFormatProto)
      org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string date_format = 1;</code>
     * @return Whether the dateFormat field is set.
     */
    @java.lang.Override
    public boolean hasDateFormat() {
      return instance.hasDateFormat();
    }
    /**
     * <code>optional string date_format = 1;</code>
     * @return The dateFormat.
     */
    @java.lang.Override
    public java.lang.String getDateFormat() {
      return instance.getDateFormat();
    }
    /**
     * <code>optional string date_format = 1;</code>
     * @return The bytes for dateFormat.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDateFormatBytes() {
      return instance.getDateFormatBytes();
    }
    /**
     * <code>optional string date_format = 1;</code>
     * @param value The dateFormat to set.
     * @return This builder for chaining.
     */
    public Builder setDateFormat(
        java.lang.String value) {
      copyOnWrite();
      instance.setDateFormat(value);
      return this;
    }
    /**
     * <code>optional string date_format = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateFormat() {
      copyOnWrite();
      instance.clearDateFormat();
      return this;
    }
    /**
     * <code>optional string date_format = 1;</code>
     * @param value The bytes for dateFormat to set.
     * @return This builder for chaining.
     */
    public Builder setDateFormatBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDateFormatBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.DateFormatProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "dateFormat_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.DateFormatProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto DEFAULT_INSTANCE;
  static {
    DateFormatProto defaultInstance = new DateFormatProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DateFormatProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateFormatProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DateFormatProto> PARSER;

  public static com.google.protobuf.Parser<DateFormatProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

