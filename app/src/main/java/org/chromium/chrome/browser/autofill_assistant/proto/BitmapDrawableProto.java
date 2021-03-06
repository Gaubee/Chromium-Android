// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.BitmapDrawableProto}
 */
public  final class BitmapDrawableProto extends
    com.google.protobuf.GeneratedMessageLite<
        BitmapDrawableProto, BitmapDrawableProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.BitmapDrawableProto)
    BitmapDrawableProtoOrBuilder {
  private BitmapDrawableProto() {
    url_ = "";
  }
  private int bitField0_;
  public static final int URL_FIELD_NUMBER = 1;
  private java.lang.String url_;
  /**
   * <code>optional string url = 1;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string url = 1;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    return url_;
  }
  /**
   * <code>optional string url = 1;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(url_);
  }
  /**
   * <code>optional string url = 1;</code>
   * @param value The url to set.
   */
  private void setUrl(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    url_ = value;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void clearUrl() {
    bitField0_ = (bitField0_ & ~0x00000001);
    url_ = getDefaultInstance().getUrl();
  }
  /**
   * <code>optional string url = 1;</code>
   * @param value The bytes for url to set.
   */
  private void setUrlBytes(
      com.google.protobuf.ByteString value) {
    url_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto width_;
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  @java.lang.Override
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getWidth() {
    return width_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance() : width_;
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  private void setWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
    value.getClass();
  width_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
    value.getClass();
  if (width_ != null &&
        width_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance()) {
      width_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.newBuilder(width_).mergeFrom(value).buildPartial();
    } else {
      width_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
   */
  private void clearWidth() {  width_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto height_;
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  @java.lang.Override
  public boolean hasHeight() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getHeight() {
    return height_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance() : height_;
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  private void setHeight(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
    value.getClass();
  height_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeHeight(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
    value.getClass();
  if (height_ != null &&
        height_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.getDefaultInstance()) {
      height_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.newBuilder(height_).mergeFrom(value).buildPartial();
    } else {
      height_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
   */
  private void clearHeight() {  height_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.BitmapDrawableProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.BitmapDrawableProto)
      org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string url = 1;</code>
     * @return Whether the url field is set.
     */
    @java.lang.Override
    public boolean hasUrl() {
      return instance.hasUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     * @return The url.
     */
    @java.lang.Override
    public java.lang.String getUrl() {
      return instance.getUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     * @return The bytes for url.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUrlBytes() {
      return instance.getUrlBytes();
    }
    /**
     * <code>optional string url = 1;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrl(value);
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      copyOnWrite();
      instance.clearUrl();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlBytes(value);
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
     */
    @java.lang.Override
    public boolean hasWidth() {
      return instance.hasWidth();
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getWidth() {
      return instance.getWidth();
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
     */
    public Builder setWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      copyOnWrite();
      instance.setWidth(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
     */
    public Builder setWidth(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setWidth(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
     */
    public Builder mergeWidth(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      copyOnWrite();
      instance.mergeWidth(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto width = 2;</code>
     */
    public Builder clearWidth() {  copyOnWrite();
      instance.clearWidth();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
     */
    @java.lang.Override
    public boolean hasHeight() {
      return instance.hasHeight();
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getHeight() {
      return instance.getHeight();
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
     */
    public Builder setHeight(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      copyOnWrite();
      instance.setHeight(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
     */
    public Builder setHeight(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setHeight(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
     */
    public Builder mergeHeight(org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto value) {
      copyOnWrite();
      instance.mergeHeight(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientDimensionProto height = 3;</code>
     */
    public Builder clearHeight() {  copyOnWrite();
      instance.clearHeight();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.BitmapDrawableProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "url_",
            "width_",
            "height_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002" +
              "\u1009\u0001\u0003\u1009\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.BitmapDrawableProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto DEFAULT_INSTANCE;
  static {
    BitmapDrawableProto defaultInstance = new BitmapDrawableProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      BitmapDrawableProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.BitmapDrawableProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BitmapDrawableProto> PARSER;

  public static com.google.protobuf.Parser<BitmapDrawableProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

