// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Modifies a view's visibiliy.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SetViewVisibilityProto}
 */
public  final class SetViewVisibilityProto extends
    com.google.protobuf.GeneratedMessageLite<
        SetViewVisibilityProto, SetViewVisibilityProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SetViewVisibilityProto)
    SetViewVisibilityProtoOrBuilder {
  private SetViewVisibilityProto() {
    viewIdentifier_ = "";
  }
  private int bitField0_;
  public static final int VIEW_IDENTIFIER_FIELD_NUMBER = 1;
  private java.lang.String viewIdentifier_;
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @return Whether the viewIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasViewIdentifier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @return The viewIdentifier.
   */
  @java.lang.Override
  public java.lang.String getViewIdentifier() {
    return viewIdentifier_;
  }
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @return The bytes for viewIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getViewIdentifierBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(viewIdentifier_);
  }
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @param value The viewIdentifier to set.
   */
  private void setViewIdentifier(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    viewIdentifier_ = value;
  }
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   */
  private void clearViewIdentifier() {
    bitField0_ = (bitField0_ & ~0x00000001);
    viewIdentifier_ = getDefaultInstance().getViewIdentifier();
  }
  /**
   * <pre>
   * The view to modify.
   * </pre>
   *
   * <code>optional string view_identifier = 1;</code>
   * @param value The bytes for viewIdentifier to set.
   */
  private void setViewIdentifierBytes(
      com.google.protobuf.ByteString value) {
    viewIdentifier_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int VISIBLE_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto visible_;
  /**
   * <pre>
   * The visibility flag. Must be a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
   */
  @java.lang.Override
  public boolean hasVisible() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The visibility flag. Must be a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getVisible() {
    return visible_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.getDefaultInstance() : visible_;
  }
  /**
   * <pre>
   * The visibility flag. Must be a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
   */
  private void setVisible(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  visible_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * The visibility flag. Must be a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeVisible(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  if (visible_ != null &&
        visible_ != org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.getDefaultInstance()) {
      visible_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.newBuilder(visible_).mergeFrom(value).buildPartial();
    } else {
      visible_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The visibility flag. Must be a single boolean.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
   */
  private void clearVisible() {  visible_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Modifies a view's visibiliy.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SetViewVisibilityProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SetViewVisibilityProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The view to modify.
     * </pre>
     *
     * <code>optional string view_identifier = 1;</code>
     * @return Whether the viewIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasViewIdentifier() {
      return instance.hasViewIdentifier();
    }
    /**
     * <pre>
     * The view to modify.
     * </pre>
     *
     * <code>optional string view_identifier = 1;</code>
     * @return The viewIdentifier.
     */
    @java.lang.Override
    public java.lang.String getViewIdentifier() {
      return instance.getViewIdentifier();
    }
    /**
     * <pre>
     * The view to modify.
     * </pre>
     *
     * <code>optional string view_identifier = 1;</code>
     * @return The bytes for viewIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getViewIdentifierBytes() {
      return instance.getViewIdentifierBytes();
    }
    /**
     * <pre>
     * The view to modify.
     * </pre>
     *
     * <code>optional string view_identifier = 1;</code>
     * @param value The viewIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setViewIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setViewIdentifier(value);
      return this;
    }
    /**
     * <pre>
     * The view to modify.
     * </pre>
     *
     * <code>optional string view_identifier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewIdentifier() {
      copyOnWrite();
      instance.clearViewIdentifier();
      return this;
    }
    /**
     * <pre>
     * The view to modify.
     * </pre>
     *
     * <code>optional string view_identifier = 1;</code>
     * @param value The bytes for viewIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setViewIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setViewIdentifierBytes(value);
      return this;
    }

    /**
     * <pre>
     * The visibility flag. Must be a single boolean.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
     */
    @java.lang.Override
    public boolean hasVisible() {
      return instance.hasVisible();
    }
    /**
     * <pre>
     * The visibility flag. Must be a single boolean.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getVisible() {
      return instance.getVisible();
    }
    /**
     * <pre>
     * The visibility flag. Must be a single boolean.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
     */
    public Builder setVisible(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.setVisible(value);
      return this;
      }
    /**
     * <pre>
     * The visibility flag. Must be a single boolean.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
     */
    public Builder setVisible(
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setVisible(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The visibility flag. Must be a single boolean.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
     */
    public Builder mergeVisible(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.mergeVisible(value);
      return this;
    }
    /**
     * <pre>
     * The visibility flag. Must be a single boolean.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto visible = 3;</code>
     */
    public Builder clearVisible() {  copyOnWrite();
      instance.clearVisible();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SetViewVisibilityProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "viewIdentifier_",
            "visible_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003" +
              "\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.SetViewVisibilityProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto DEFAULT_INSTANCE;
  static {
    SetViewVisibilityProto defaultInstance = new SetViewVisibilityProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SetViewVisibilityProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SetViewVisibilityProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SetViewVisibilityProto> PARSER;

  public static com.google.protobuf.Parser<SetViewVisibilityProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

