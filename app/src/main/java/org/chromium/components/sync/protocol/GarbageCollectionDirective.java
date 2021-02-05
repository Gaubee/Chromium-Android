// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.GarbageCollectionDirective}
 */
public  final class GarbageCollectionDirective extends
    com.google.protobuf.GeneratedMessageLite<
        GarbageCollectionDirective, GarbageCollectionDirective.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.GarbageCollectionDirective)
    GarbageCollectionDirectiveOrBuilder {
  private GarbageCollectionDirective() {
  }
  /**
   * Protobuf enum {@code sync_pb.GarbageCollectionDirective.Type}
   */
  public enum Type
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>VERSION_WATERMARK = 1;</code>
     */
    VERSION_WATERMARK(1),
    /**
     * <code>AGE_WATERMARK = 2;</code>
     */
    AGE_WATERMARK(2),
    /**
     * <code>DEPRECATED_MAX_ITEM_COUNT = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    DEPRECATED_MAX_ITEM_COUNT(3),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>VERSION_WATERMARK = 1;</code>
     */
    public static final int VERSION_WATERMARK_VALUE = 1;
    /**
     * <code>AGE_WATERMARK = 2;</code>
     */
    public static final int AGE_WATERMARK_VALUE = 2;
    /**
     * <code>DEPRECATED_MAX_ITEM_COUNT = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated public static final int DEPRECATED_MAX_ITEM_COUNT_VALUE = 3;


    @java.lang.Override
    public final int getNumber() {
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return VERSION_WATERMARK;
        case 2: return AGE_WATERMARK;
        case 3: return DEPRECATED_MAX_ITEM_COUNT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            @java.lang.Override
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return TypeVerifier.INSTANCE;
    }

    private static final class TypeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new TypeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return Type.forNumber(number) != null;
            }
          };

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sync_pb.GarbageCollectionDirective.Type)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   * @return The type.
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.GarbageCollectionDirective.Type getType() {
    org.chromium.components.sync.protocol.GarbageCollectionDirective.Type result = org.chromium.components.sync.protocol.GarbageCollectionDirective.Type.forNumber(type_);
    return result == null ? org.chromium.components.sync.protocol.GarbageCollectionDirective.Type.UNKNOWN : result;
  }
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   * @param value The type to set.
   */
  private void setType(org.chromium.components.sync.protocol.GarbageCollectionDirective.Type value) {
    type_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   */
  private void clearType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    type_ = 0;
  }

  public static final int VERSION_WATERMARK_FIELD_NUMBER = 2;
  private long versionWatermark_;
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   * @return Whether the versionWatermark field is set.
   */
  @java.lang.Override
  public boolean hasVersionWatermark() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   * @return The versionWatermark.
   */
  @java.lang.Override
  public long getVersionWatermark() {
    return versionWatermark_;
  }
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   * @param value The versionWatermark to set.
   */
  private void setVersionWatermark(long value) {
    bitField0_ |= 0x00000002;
    versionWatermark_ = value;
  }
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   */
  private void clearVersionWatermark() {
    bitField0_ = (bitField0_ & ~0x00000002);
    versionWatermark_ = 0L;
  }

  public static final int AGE_WATERMARK_IN_DAYS_FIELD_NUMBER = 3;
  private int ageWatermarkInDays_;
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   * @return Whether the ageWatermarkInDays field is set.
   */
  @java.lang.Override
  public boolean hasAgeWatermarkInDays() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   * @return The ageWatermarkInDays.
   */
  @java.lang.Override
  public int getAgeWatermarkInDays() {
    return ageWatermarkInDays_;
  }
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   * @param value The ageWatermarkInDays to set.
   */
  private void setAgeWatermarkInDays(int value) {
    bitField0_ |= 0x00000004;
    ageWatermarkInDays_ = value;
  }
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   */
  private void clearAgeWatermarkInDays() {
    bitField0_ = (bitField0_ & ~0x00000004);
    ageWatermarkInDays_ = 0;
  }

  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.GarbageCollectionDirective prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.GarbageCollectionDirective}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.GarbageCollectionDirective, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.GarbageCollectionDirective)
      org.chromium.components.sync.protocol.GarbageCollectionDirectiveOrBuilder {
    // Construct using org.chromium.components.sync.protocol.GarbageCollectionDirective.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return instance.hasType();
    }
    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     * @return The type.
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.GarbageCollectionDirective.Type getType() {
      return instance.getType();
    }
    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.chromium.components.sync.protocol.GarbageCollectionDirective.Type value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     * @return Whether the versionWatermark field is set.
     */
    @java.lang.Override
    public boolean hasVersionWatermark() {
      return instance.hasVersionWatermark();
    }
    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     * @return The versionWatermark.
     */
    @java.lang.Override
    public long getVersionWatermark() {
      return instance.getVersionWatermark();
    }
    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     * @param value The versionWatermark to set.
     * @return This builder for chaining.
     */
    public Builder setVersionWatermark(long value) {
      copyOnWrite();
      instance.setVersionWatermark(value);
      return this;
    }
    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersionWatermark() {
      copyOnWrite();
      instance.clearVersionWatermark();
      return this;
    }

    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     * @return Whether the ageWatermarkInDays field is set.
     */
    @java.lang.Override
    public boolean hasAgeWatermarkInDays() {
      return instance.hasAgeWatermarkInDays();
    }
    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     * @return The ageWatermarkInDays.
     */
    @java.lang.Override
    public int getAgeWatermarkInDays() {
      return instance.getAgeWatermarkInDays();
    }
    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     * @param value The ageWatermarkInDays to set.
     * @return This builder for chaining.
     */
    public Builder setAgeWatermarkInDays(int value) {
      copyOnWrite();
      instance.setAgeWatermarkInDays(value);
      return this;
    }
    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgeWatermarkInDays() {
      copyOnWrite();
      instance.clearAgeWatermarkInDays();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.GarbageCollectionDirective)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.GarbageCollectionDirective();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "type_",
            org.chromium.components.sync.protocol.GarbageCollectionDirective.Type.internalGetVerifier(),
            "versionWatermark_",
            "ageWatermarkInDays_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002" +
              "\u1002\u0001\u0003\u1004\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.GarbageCollectionDirective> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.GarbageCollectionDirective.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.GarbageCollectionDirective>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.GarbageCollectionDirective)
  private static final org.chromium.components.sync.protocol.GarbageCollectionDirective DEFAULT_INSTANCE;
  static {
    GarbageCollectionDirective defaultInstance = new GarbageCollectionDirective();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GarbageCollectionDirective.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.GarbageCollectionDirective getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GarbageCollectionDirective> PARSER;

  public static com.google.protobuf.Parser<GarbageCollectionDirective> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

