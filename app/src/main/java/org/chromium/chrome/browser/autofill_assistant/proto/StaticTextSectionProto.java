// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * A section showing a simple text message.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.StaticTextSectionProto}
 */
public  final class StaticTextSectionProto extends
    com.google.protobuf.GeneratedMessageLite<
        StaticTextSectionProto, StaticTextSectionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.StaticTextSectionProto)
    StaticTextSectionProtoOrBuilder {
  private StaticTextSectionProto() {
    text_ = "";
  }
  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 1;
  private java.lang.String text_;
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    return text_;
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(text_);
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @param value The text to set.
   */
  private void setText(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    text_ = value;
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   */
  private void clearText() {
    bitField0_ = (bitField0_ & ~0x00000001);
    text_ = getDefaultInstance().getText();
  }
  /**
   * <pre>
   * The text to display. Can contain markup tags like &lt;b&gt;.
   * </pre>
   *
   * <code>optional string text = 1;</code>
   * @param value The bytes for text to set.
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    text_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A section showing a simple text message.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.StaticTextSectionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.StaticTextSectionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return instance.hasText();
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <pre>
     * The text to display. Can contain markup tags like &lt;b&gt;.
     * </pre>
     *
     * <code>optional string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.StaticTextSectionProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "text_",
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.StaticTextSectionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto DEFAULT_INSTANCE;
  static {
    StaticTextSectionProto defaultInstance = new StaticTextSectionProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      StaticTextSectionProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.StaticTextSectionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StaticTextSectionProto> PARSER;

  public static com.google.protobuf.Parser<StaticTextSectionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

