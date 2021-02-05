// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/managed_user_whitelist_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * TODO(crbug.com/1149788): Deprecate.
 * Properties of supervised user whitelist sync objects.
 * The fields here are a subset of the fields in an ExtensionSpecifics.
 * </pre>
 *
 * Protobuf type {@code sync_pb.ManagedUserWhitelistSpecifics}
 */
public  final class ManagedUserWhitelistSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        ManagedUserWhitelistSpecifics, ManagedUserWhitelistSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.ManagedUserWhitelistSpecifics)
    ManagedUserWhitelistSpecificsOrBuilder {
  private ManagedUserWhitelistSpecifics() {
    id_ = "";
    name_ = "";
  }
  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * Globally unique id for this whitelist that identifies it in the Web Store.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Globally unique id for this whitelist that identifies it in the Web Store.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * Globally unique id for this whitelist that identifies it in the Web Store.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * Globally unique id for this whitelist that identifies it in the Web Store.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000001;
    id_ = value;
  }
  /**
   * <pre>
   * Globally unique id for this whitelist that identifies it in the Web Store.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void clearId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * Globally unique id for this whitelist that identifies it in the Web Store.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    id_ = value.toStringUtf8();
    bitField0_ |= 0x00000001;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.String name_;
  /**
   * <pre>
   * The name of the whitelist.
   * </pre>
   *
   * <code>optional string name = 2;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The name of the whitelist.
   * </pre>
   *
   * <code>optional string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name of the whitelist.
   * </pre>
   *
   * <code>optional string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name of the whitelist.
   * </pre>
   *
   * <code>optional string name = 2;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000002;
    name_ = value;
  }
  /**
   * <pre>
   * The name of the whitelist.
   * </pre>
   *
   * <code>optional string name = 2;</code>
   */
  private void clearName() {
    bitField0_ = (bitField0_ & ~0x00000002);
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name of the whitelist.
   * </pre>
   *
   * <code>optional string name = 2;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    name_ = value.toStringUtf8();
    bitField0_ |= 0x00000002;
  }

  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * TODO(crbug.com/1149788): Deprecate.
   * Properties of supervised user whitelist sync objects.
   * The fields here are a subset of the fields in an ExtensionSpecifics.
   * </pre>
   *
   * Protobuf type {@code sync_pb.ManagedUserWhitelistSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.ManagedUserWhitelistSpecifics)
      org.chromium.components.sync.protocol.ManagedUserWhitelistSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Globally unique id for this whitelist that identifies it in the Web Store.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return instance.hasId();
    }
    /**
     * <pre>
     * Globally unique id for this whitelist that identifies it in the Web Store.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * Globally unique id for this whitelist that identifies it in the Web Store.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * Globally unique id for this whitelist that identifies it in the Web Store.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * Globally unique id for this whitelist that identifies it in the Web Store.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * Globally unique id for this whitelist that identifies it in the Web Store.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name of the whitelist.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return instance.hasName();
    }
    /**
     * <pre>
     * The name of the whitelist.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name of the whitelist.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name of the whitelist.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the whitelist.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name of the whitelist.
     * </pre>
     *
     * <code>optional string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.ManagedUserWhitelistSpecifics)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "id_",
            "name_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002" +
              "\u1008\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.ManagedUserWhitelistSpecifics)
  private static final org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics DEFAULT_INSTANCE;
  static {
    ManagedUserWhitelistSpecifics defaultInstance = new ManagedUserWhitelistSpecifics();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ManagedUserWhitelistSpecifics.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.ManagedUserWhitelistSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ManagedUserWhitelistSpecifics> PARSER;

  public static com.google.protobuf.Parser<ManagedUserWhitelistSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

