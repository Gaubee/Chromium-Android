// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Message specifying how to retrieve the scripts. If bundle_path is set, it
 * will read that bundle with the associated version.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ScriptStoreConfig}
 */
public  final class ScriptStoreConfig extends
    com.google.protobuf.GeneratedMessageLite<
        ScriptStoreConfig, ScriptStoreConfig.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ScriptStoreConfig)
    ScriptStoreConfigOrBuilder {
  private ScriptStoreConfig() {
    bundlePath_ = "";
  }
  private int bitField0_;
  public static final int BUNDLE_PATH_FIELD_NUMBER = 2;
  private java.lang.String bundlePath_;
  /**
   * <code>optional string bundle_path = 2;</code>
   * @return Whether the bundlePath field is set.
   */
  @java.lang.Override
  public boolean hasBundlePath() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string bundle_path = 2;</code>
   * @return The bundlePath.
   */
  @java.lang.Override
  public java.lang.String getBundlePath() {
    return bundlePath_;
  }
  /**
   * <code>optional string bundle_path = 2;</code>
   * @return The bytes for bundlePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBundlePathBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bundlePath_);
  }
  /**
   * <code>optional string bundle_path = 2;</code>
   * @param value The bundlePath to set.
   */
  private void setBundlePath(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    bundlePath_ = value;
  }
  /**
   * <code>optional string bundle_path = 2;</code>
   */
  private void clearBundlePath() {
    bitField0_ = (bitField0_ & ~0x00000001);
    bundlePath_ = getDefaultInstance().getBundlePath();
  }
  /**
   * <code>optional string bundle_path = 2;</code>
   * @param value The bytes for bundlePath to set.
   */
  private void setBundlePathBytes(
      com.google.protobuf.ByteString value) {
    bundlePath_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int BUNDLE_VERSION_FIELD_NUMBER = 3;
  private long bundleVersion_;
  /**
   * <code>optional int64 bundle_version = 3;</code>
   * @return Whether the bundleVersion field is set.
   */
  @java.lang.Override
  public boolean hasBundleVersion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 bundle_version = 3;</code>
   * @return The bundleVersion.
   */
  @java.lang.Override
  public long getBundleVersion() {
    return bundleVersion_;
  }
  /**
   * <code>optional int64 bundle_version = 3;</code>
   * @param value The bundleVersion to set.
   */
  private void setBundleVersion(long value) {
    bitField0_ |= 0x00000002;
    bundleVersion_ = value;
  }
  /**
   * <code>optional int64 bundle_version = 3;</code>
   */
  private void clearBundleVersion() {
    bitField0_ = (bitField0_ & ~0x00000002);
    bundleVersion_ = 0L;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Message specifying how to retrieve the scripts. If bundle_path is set, it
   * will read that bundle with the associated version.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ScriptStoreConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ScriptStoreConfig)
      org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfigOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string bundle_path = 2;</code>
     * @return Whether the bundlePath field is set.
     */
    @java.lang.Override
    public boolean hasBundlePath() {
      return instance.hasBundlePath();
    }
    /**
     * <code>optional string bundle_path = 2;</code>
     * @return The bundlePath.
     */
    @java.lang.Override
    public java.lang.String getBundlePath() {
      return instance.getBundlePath();
    }
    /**
     * <code>optional string bundle_path = 2;</code>
     * @return The bytes for bundlePath.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBundlePathBytes() {
      return instance.getBundlePathBytes();
    }
    /**
     * <code>optional string bundle_path = 2;</code>
     * @param value The bundlePath to set.
     * @return This builder for chaining.
     */
    public Builder setBundlePath(
        java.lang.String value) {
      copyOnWrite();
      instance.setBundlePath(value);
      return this;
    }
    /**
     * <code>optional string bundle_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBundlePath() {
      copyOnWrite();
      instance.clearBundlePath();
      return this;
    }
    /**
     * <code>optional string bundle_path = 2;</code>
     * @param value The bytes for bundlePath to set.
     * @return This builder for chaining.
     */
    public Builder setBundlePathBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBundlePathBytes(value);
      return this;
    }

    /**
     * <code>optional int64 bundle_version = 3;</code>
     * @return Whether the bundleVersion field is set.
     */
    @java.lang.Override
    public boolean hasBundleVersion() {
      return instance.hasBundleVersion();
    }
    /**
     * <code>optional int64 bundle_version = 3;</code>
     * @return The bundleVersion.
     */
    @java.lang.Override
    public long getBundleVersion() {
      return instance.getBundleVersion();
    }
    /**
     * <code>optional int64 bundle_version = 3;</code>
     * @param value The bundleVersion to set.
     * @return This builder for chaining.
     */
    public Builder setBundleVersion(long value) {
      copyOnWrite();
      instance.setBundleVersion(value);
      return this;
    }
    /**
     * <code>optional int64 bundle_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBundleVersion() {
      copyOnWrite();
      instance.clearBundleVersion();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ScriptStoreConfig)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "bundlePath_",
            "bundleVersion_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0000\u0003" +
              "\u1002\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ScriptStoreConfig)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig DEFAULT_INSTANCE;
  static {
    ScriptStoreConfig defaultInstance = new ScriptStoreConfig();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ScriptStoreConfig.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptStoreConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ScriptStoreConfig> PARSER;

  public static com.google.protobuf.Parser<ScriptStoreConfig> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

