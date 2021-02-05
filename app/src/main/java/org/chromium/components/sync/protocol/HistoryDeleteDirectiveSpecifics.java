// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/history_delete_directive_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Properties of history delete directive sync objects.
 * </pre>
 *
 * Protobuf type {@code sync_pb.HistoryDeleteDirectiveSpecifics}
 */
public  final class HistoryDeleteDirectiveSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        HistoryDeleteDirectiveSpecifics, HistoryDeleteDirectiveSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.HistoryDeleteDirectiveSpecifics)
    HistoryDeleteDirectiveSpecificsOrBuilder {
  private HistoryDeleteDirectiveSpecifics() {
  }
  private int bitField0_;
  public static final int GLOBAL_ID_DIRECTIVE_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.GlobalIdDirective globalIdDirective_;
  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  @java.lang.Override
  public boolean hasGlobalIdDirective() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.GlobalIdDirective getGlobalIdDirective() {
    return globalIdDirective_ == null ? org.chromium.components.sync.protocol.GlobalIdDirective.getDefaultInstance() : globalIdDirective_;
  }
  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  private void setGlobalIdDirective(org.chromium.components.sync.protocol.GlobalIdDirective value) {
    value.getClass();
  globalIdDirective_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeGlobalIdDirective(org.chromium.components.sync.protocol.GlobalIdDirective value) {
    value.getClass();
  if (globalIdDirective_ != null &&
        globalIdDirective_ != org.chromium.components.sync.protocol.GlobalIdDirective.getDefaultInstance()) {
      globalIdDirective_ =
        org.chromium.components.sync.protocol.GlobalIdDirective.newBuilder(globalIdDirective_).mergeFrom(value).buildPartial();
    } else {
      globalIdDirective_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Exactly one of the fields below must be filled in.  Otherwise, this
   * delete directive must be ignored.
   * </pre>
   *
   * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
   */
  private void clearGlobalIdDirective() {  globalIdDirective_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int TIME_RANGE_DIRECTIVE_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.TimeRangeDirective timeRangeDirective_;
  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  @java.lang.Override
  public boolean hasTimeRangeDirective() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.TimeRangeDirective getTimeRangeDirective() {
    return timeRangeDirective_ == null ? org.chromium.components.sync.protocol.TimeRangeDirective.getDefaultInstance() : timeRangeDirective_;
  }
  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  private void setTimeRangeDirective(org.chromium.components.sync.protocol.TimeRangeDirective value) {
    value.getClass();
  timeRangeDirective_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeRangeDirective(org.chromium.components.sync.protocol.TimeRangeDirective value) {
    value.getClass();
  if (timeRangeDirective_ != null &&
        timeRangeDirective_ != org.chromium.components.sync.protocol.TimeRangeDirective.getDefaultInstance()) {
      timeRangeDirective_ =
        org.chromium.components.sync.protocol.TimeRangeDirective.newBuilder(timeRangeDirective_).mergeFrom(value).buildPartial();
    } else {
      timeRangeDirective_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
   */
  private void clearTimeRangeDirective() {  timeRangeDirective_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int URL_DIRECTIVE_FIELD_NUMBER = 3;
  private org.chromium.components.sync.protocol.UrlDirective urlDirective_;
  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  @java.lang.Override
  public boolean hasUrlDirective() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.UrlDirective getUrlDirective() {
    return urlDirective_ == null ? org.chromium.components.sync.protocol.UrlDirective.getDefaultInstance() : urlDirective_;
  }
  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  private void setUrlDirective(org.chromium.components.sync.protocol.UrlDirective value) {
    value.getClass();
  urlDirective_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeUrlDirective(org.chromium.components.sync.protocol.UrlDirective value) {
    value.getClass();
  if (urlDirective_ != null &&
        urlDirective_ != org.chromium.components.sync.protocol.UrlDirective.getDefaultInstance()) {
      urlDirective_ =
        org.chromium.components.sync.protocol.UrlDirective.newBuilder(urlDirective_).mergeFrom(value).buildPartial();
    } else {
      urlDirective_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
   */
  private void clearUrlDirective() {  urlDirective_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Properties of history delete directive sync objects.
   * </pre>
   *
   * Protobuf type {@code sync_pb.HistoryDeleteDirectiveSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.HistoryDeleteDirectiveSpecifics)
      org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Exactly one of the fields below must be filled in.  Otherwise, this
     * delete directive must be ignored.
     * </pre>
     *
     * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
     */
    @java.lang.Override
    public boolean hasGlobalIdDirective() {
      return instance.hasGlobalIdDirective();
    }
    /**
     * <pre>
     * Exactly one of the fields below must be filled in.  Otherwise, this
     * delete directive must be ignored.
     * </pre>
     *
     * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.GlobalIdDirective getGlobalIdDirective() {
      return instance.getGlobalIdDirective();
    }
    /**
     * <pre>
     * Exactly one of the fields below must be filled in.  Otherwise, this
     * delete directive must be ignored.
     * </pre>
     *
     * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
     */
    public Builder setGlobalIdDirective(org.chromium.components.sync.protocol.GlobalIdDirective value) {
      copyOnWrite();
      instance.setGlobalIdDirective(value);
      return this;
      }
    /**
     * <pre>
     * Exactly one of the fields below must be filled in.  Otherwise, this
     * delete directive must be ignored.
     * </pre>
     *
     * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
     */
    public Builder setGlobalIdDirective(
        org.chromium.components.sync.protocol.GlobalIdDirective.Builder builderForValue) {
      copyOnWrite();
      instance.setGlobalIdDirective(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Exactly one of the fields below must be filled in.  Otherwise, this
     * delete directive must be ignored.
     * </pre>
     *
     * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
     */
    public Builder mergeGlobalIdDirective(org.chromium.components.sync.protocol.GlobalIdDirective value) {
      copyOnWrite();
      instance.mergeGlobalIdDirective(value);
      return this;
    }
    /**
     * <pre>
     * Exactly one of the fields below must be filled in.  Otherwise, this
     * delete directive must be ignored.
     * </pre>
     *
     * <code>optional .sync_pb.GlobalIdDirective global_id_directive = 1;</code>
     */
    public Builder clearGlobalIdDirective() {  copyOnWrite();
      instance.clearGlobalIdDirective();
      return this;
    }

    /**
     * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
     */
    @java.lang.Override
    public boolean hasTimeRangeDirective() {
      return instance.hasTimeRangeDirective();
    }
    /**
     * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.TimeRangeDirective getTimeRangeDirective() {
      return instance.getTimeRangeDirective();
    }
    /**
     * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
     */
    public Builder setTimeRangeDirective(org.chromium.components.sync.protocol.TimeRangeDirective value) {
      copyOnWrite();
      instance.setTimeRangeDirective(value);
      return this;
      }
    /**
     * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
     */
    public Builder setTimeRangeDirective(
        org.chromium.components.sync.protocol.TimeRangeDirective.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeRangeDirective(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
     */
    public Builder mergeTimeRangeDirective(org.chromium.components.sync.protocol.TimeRangeDirective value) {
      copyOnWrite();
      instance.mergeTimeRangeDirective(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.TimeRangeDirective time_range_directive = 2;</code>
     */
    public Builder clearTimeRangeDirective() {  copyOnWrite();
      instance.clearTimeRangeDirective();
      return this;
    }

    /**
     * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
     */
    @java.lang.Override
    public boolean hasUrlDirective() {
      return instance.hasUrlDirective();
    }
    /**
     * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.UrlDirective getUrlDirective() {
      return instance.getUrlDirective();
    }
    /**
     * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
     */
    public Builder setUrlDirective(org.chromium.components.sync.protocol.UrlDirective value) {
      copyOnWrite();
      instance.setUrlDirective(value);
      return this;
      }
    /**
     * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
     */
    public Builder setUrlDirective(
        org.chromium.components.sync.protocol.UrlDirective.Builder builderForValue) {
      copyOnWrite();
      instance.setUrlDirective(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
     */
    public Builder mergeUrlDirective(org.chromium.components.sync.protocol.UrlDirective value) {
      copyOnWrite();
      instance.mergeUrlDirective(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.UrlDirective url_directive = 3;</code>
     */
    public Builder clearUrlDirective() {  copyOnWrite();
      instance.clearUrlDirective();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.HistoryDeleteDirectiveSpecifics)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "globalIdDirective_",
            "timeRangeDirective_",
            "urlDirective_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1009\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.HistoryDeleteDirectiveSpecifics)
  private static final org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics DEFAULT_INSTANCE;
  static {
    HistoryDeleteDirectiveSpecifics defaultInstance = new HistoryDeleteDirectiveSpecifics();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      HistoryDeleteDirectiveSpecifics.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.HistoryDeleteDirectiveSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<HistoryDeleteDirectiveSpecifics> PARSER;

  public static com.google.protobuf.Parser<HistoryDeleteDirectiveSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

