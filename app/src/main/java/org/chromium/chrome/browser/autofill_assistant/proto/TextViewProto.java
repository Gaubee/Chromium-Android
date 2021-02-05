// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.TextViewProto}
 */
public  final class TextViewProto extends
    com.google.protobuf.GeneratedMessageLite<
        TextViewProto, TextViewProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.TextViewProto)
    TextViewProtoOrBuilder {
  private TextViewProto() {
    textAppearance_ = "";
    textAlignment_ = 8388659;
  }
  private int bitField0_;
  private int kindCase_ = 0;
  private java.lang.Object kind_;
  public enum KindCase {
    TEXT(1),
    MODEL_IDENTIFIER(3),
    KIND_NOT_SET(0);
    private final int value;
    private KindCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KindCase valueOf(int value) {
      return forNumber(value);
    }

    public static KindCase forNumber(int value) {
      switch (value) {
        case 1: return TEXT;
        case 3: return MODEL_IDENTIFIER;
        case 0: return KIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public KindCase
  getKindCase() {
    return KindCase.forNumber(
        kindCase_);
  }

  private void clearKind() {
    kindCase_ = 0;
    kind_ = null;
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return kindCase_ == 1;
  }
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.String ref = "";
    if (kindCase_ == 1) {
      ref = (java.lang.String) kind_;
    }
    return ref;
  }
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.String ref = "";
    if (kindCase_ == 1) {
      ref = (java.lang.String) kind_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @param value The text to set.
   */
  private void setText(
      java.lang.String value) {
    value.getClass();
  kindCase_ = 1;
    kind_ = value;
  }
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  private void clearText() {
    if (kindCase_ == 1) {
      kindCase_ = 0;
      kind_ = null;
    }
  }
  /**
   * <pre>
   * Static text.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @param value The bytes for text to set.
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    kind_ = value.toStringUtf8();
    kindCase_ = 1;
  }

  public static final int MODEL_IDENTIFIER_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @return Whether the modelIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasModelIdentifier() {
    return kindCase_ == 3;
  }
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @return The modelIdentifier.
   */
  @java.lang.Override
  public java.lang.String getModelIdentifier() {
    java.lang.String ref = "";
    if (kindCase_ == 3) {
      ref = (java.lang.String) kind_;
    }
    return ref;
  }
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @return The bytes for modelIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelIdentifierBytes() {
    java.lang.String ref = "";
    if (kindCase_ == 3) {
      ref = (java.lang.String) kind_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @param value The modelIdentifier to set.
   */
  private void setModelIdentifier(
      java.lang.String value) {
    value.getClass();
  kindCase_ = 3;
    kind_ = value;
  }
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   */
  private void clearModelIdentifier() {
    if (kindCase_ == 3) {
      kindCase_ = 0;
      kind_ = null;
    }
  }
  /**
   * <pre>
   * Dynamic text. Will update automatically to track the value. Should point
   * to a single string value. If specified, view identifier is mandatory!
   * </pre>
   *
   * <code>string model_identifier = 3;</code>
   * @param value The bytes for modelIdentifier to set.
   */
  private void setModelIdentifierBytes(
      com.google.protobuf.ByteString value) {
    kind_ = value.toStringUtf8();
    kindCase_ = 3;
  }

  public static final int TEXT_APPEARANCE_FIELD_NUMBER = 2;
  private java.lang.String textAppearance_;
  /**
   * <code>optional string text_appearance = 2;</code>
   * @return Whether the textAppearance field is set.
   */
  @java.lang.Override
  public boolean hasTextAppearance() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string text_appearance = 2;</code>
   * @return The textAppearance.
   */
  @java.lang.Override
  public java.lang.String getTextAppearance() {
    return textAppearance_;
  }
  /**
   * <code>optional string text_appearance = 2;</code>
   * @return The bytes for textAppearance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextAppearanceBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(textAppearance_);
  }
  /**
   * <code>optional string text_appearance = 2;</code>
   * @param value The textAppearance to set.
   */
  private void setTextAppearance(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000004;
    textAppearance_ = value;
  }
  /**
   * <code>optional string text_appearance = 2;</code>
   */
  private void clearTextAppearance() {
    bitField0_ = (bitField0_ & ~0x00000004);
    textAppearance_ = getDefaultInstance().getTextAppearance();
  }
  /**
   * <code>optional string text_appearance = 2;</code>
   * @param value The bytes for textAppearance to set.
   */
  private void setTextAppearanceBytes(
      com.google.protobuf.ByteString value) {
    textAppearance_ = value.toStringUtf8();
    bitField0_ |= 0x00000004;
  }

  public static final int TEXT_ALIGNMENT_FIELD_NUMBER = 4;
  private int textAlignment_;
  /**
   * <pre>
   * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
   * values. The default is START|TOP (i.e., top-left-aligned for western
   * locales).
   * </pre>
   *
   * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
   * @return Whether the textAlignment field is set.
   */
  @java.lang.Override
  public boolean hasTextAlignment() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
   * values. The default is START|TOP (i.e., top-left-aligned for western
   * locales).
   * </pre>
   *
   * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
   * @return The textAlignment.
   */
  @java.lang.Override
  public int getTextAlignment() {
    return textAlignment_;
  }
  /**
   * <pre>
   * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
   * values. The default is START|TOP (i.e., top-left-aligned for western
   * locales).
   * </pre>
   *
   * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
   * @param value The textAlignment to set.
   */
  private void setTextAlignment(int value) {
    bitField0_ |= 0x00000008;
    textAlignment_ = value;
  }
  /**
   * <pre>
   * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
   * values. The default is START|TOP (i.e., top-left-aligned for western
   * locales).
   * </pre>
   *
   * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
   */
  private void clearTextAlignment() {
    bitField0_ = (bitField0_ & ~0x00000008);
    textAlignment_ = 8388659;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.TextViewProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.TextViewProto)
      org.chromium.chrome.browser.autofill_assistant.proto.TextViewProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public KindCase
        getKindCase() {
      return instance.getKindCase();
    }

    public Builder clearKind() {
      copyOnWrite();
      instance.clearKind();
      return this;
    }


    /**
     * <pre>
     * Static text.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return instance.hasText();
    }
    /**
     * <pre>
     * Static text.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <pre>
     * Static text.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <pre>
     * Static text.
     * </pre>
     *
     * <code>string text = 1;</code>
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
     * Static text.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <pre>
     * Static text.
     * </pre>
     *
     * <code>string text = 1;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    /**
     * <pre>
     * Dynamic text. Will update automatically to track the value. Should point
     * to a single string value. If specified, view identifier is mandatory!
     * </pre>
     *
     * <code>string model_identifier = 3;</code>
     * @return Whether the modelIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasModelIdentifier() {
      return instance.hasModelIdentifier();
    }
    /**
     * <pre>
     * Dynamic text. Will update automatically to track the value. Should point
     * to a single string value. If specified, view identifier is mandatory!
     * </pre>
     *
     * <code>string model_identifier = 3;</code>
     * @return The modelIdentifier.
     */
    @java.lang.Override
    public java.lang.String getModelIdentifier() {
      return instance.getModelIdentifier();
    }
    /**
     * <pre>
     * Dynamic text. Will update automatically to track the value. Should point
     * to a single string value. If specified, view identifier is mandatory!
     * </pre>
     *
     * <code>string model_identifier = 3;</code>
     * @return The bytes for modelIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModelIdentifierBytes() {
      return instance.getModelIdentifierBytes();
    }
    /**
     * <pre>
     * Dynamic text. Will update automatically to track the value. Should point
     * to a single string value. If specified, view identifier is mandatory!
     * </pre>
     *
     * <code>string model_identifier = 3;</code>
     * @param value The modelIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setModelIdentifier(value);
      return this;
    }
    /**
     * <pre>
     * Dynamic text. Will update automatically to track the value. Should point
     * to a single string value. If specified, view identifier is mandatory!
     * </pre>
     *
     * <code>string model_identifier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearModelIdentifier() {
      copyOnWrite();
      instance.clearModelIdentifier();
      return this;
    }
    /**
     * <pre>
     * Dynamic text. Will update automatically to track the value. Should point
     * to a single string value. If specified, view identifier is mandatory!
     * </pre>
     *
     * <code>string model_identifier = 3;</code>
     * @param value The bytes for modelIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setModelIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelIdentifierBytes(value);
      return this;
    }

    /**
     * <code>optional string text_appearance = 2;</code>
     * @return Whether the textAppearance field is set.
     */
    @java.lang.Override
    public boolean hasTextAppearance() {
      return instance.hasTextAppearance();
    }
    /**
     * <code>optional string text_appearance = 2;</code>
     * @return The textAppearance.
     */
    @java.lang.Override
    public java.lang.String getTextAppearance() {
      return instance.getTextAppearance();
    }
    /**
     * <code>optional string text_appearance = 2;</code>
     * @return The bytes for textAppearance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextAppearanceBytes() {
      return instance.getTextAppearanceBytes();
    }
    /**
     * <code>optional string text_appearance = 2;</code>
     * @param value The textAppearance to set.
     * @return This builder for chaining.
     */
    public Builder setTextAppearance(
        java.lang.String value) {
      copyOnWrite();
      instance.setTextAppearance(value);
      return this;
    }
    /**
     * <code>optional string text_appearance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextAppearance() {
      copyOnWrite();
      instance.clearTextAppearance();
      return this;
    }
    /**
     * <code>optional string text_appearance = 2;</code>
     * @param value The bytes for textAppearance to set.
     * @return This builder for chaining.
     */
    public Builder setTextAppearanceBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextAppearanceBytes(value);
      return this;
    }

    /**
     * <pre>
     * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
     * values. The default is START|TOP (i.e., top-left-aligned for western
     * locales).
     * </pre>
     *
     * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
     * @return Whether the textAlignment field is set.
     */
    @java.lang.Override
    public boolean hasTextAlignment() {
      return instance.hasTextAlignment();
    }
    /**
     * <pre>
     * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
     * values. The default is START|TOP (i.e., top-left-aligned for western
     * locales).
     * </pre>
     *
     * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
     * @return The textAlignment.
     */
    @java.lang.Override
    public int getTextAlignment() {
      return instance.getTextAlignment();
    }
    /**
     * <pre>
     * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
     * values. The default is START|TOP (i.e., top-left-aligned for western
     * locales).
     * </pre>
     *
     * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
     * @param value The textAlignment to set.
     * @return This builder for chaining.
     */
    public Builder setTextAlignment(int value) {
      copyOnWrite();
      instance.setTextAlignment(value);
      return this;
    }
    /**
     * <pre>
     * The text alignment as a bit-wise OR of ViewLayoutParamsProto.Gravity
     * values. The default is START|TOP (i.e., top-left-aligned for western
     * locales).
     * </pre>
     *
     * <code>optional int32 text_alignment = 4 [default = 8388659];</code>
     * @return This builder for chaining.
     */
    public Builder clearTextAlignment() {
      copyOnWrite();
      instance.clearTextAlignment();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.TextViewProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "kind_",
            "kindCase_",
            "bitField0_",
            "textAppearance_",
            "textAlignment_",
          };
          java.lang.String info =
              "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103b\u0000\u0002" +
              "\u1008\u0002\u0003\u103b\u0000\u0004\u1004\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.TextViewProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto DEFAULT_INSTANCE;
  static {
    TextViewProto defaultInstance = new TextViewProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TextViewProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TextViewProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TextViewProto> PARSER;

  public static com.google.protobuf.Parser<TextViewProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

