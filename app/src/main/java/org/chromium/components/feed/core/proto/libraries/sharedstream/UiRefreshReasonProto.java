// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/libraries/sharedstream/ui_refresh_reason.proto

package org.chromium.components.feed.core.proto.libraries.sharedstream;

public final class UiRefreshReasonProto {
  private UiRefreshReasonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.uiRefreshReasonExtension);
  }
  public interface UiRefreshReasonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:components.feed.core.proto.libraries.sharedstream.UiRefreshReason)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
     * @return Whether the reason field is set.
     */
    boolean hasReason();
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
     * @return The reason.
     */
    org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason getReason();
  }
  /**
   * <pre>
   * UI only reason that a refresh occurred.
   * </pre>
   *
   * Protobuf type {@code components.feed.core.proto.libraries.sharedstream.UiRefreshReason}
   */
  public  static final class UiRefreshReason extends
      com.google.protobuf.GeneratedMessageLite<
          UiRefreshReason, UiRefreshReason.Builder> implements
      // @@protoc_insertion_point(message_implements:components.feed.core.proto.libraries.sharedstream.UiRefreshReason)
      UiRefreshReasonOrBuilder {
    private UiRefreshReason() {
    }
    /**
     * Protobuf enum {@code components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason}
     */
    public enum Reason
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>ZERO_STATE = 1;</code>
       */
      ZERO_STATE(1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>ZERO_STATE = 1;</code>
       */
      public static final int ZERO_STATE_VALUE = 1;


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
      public static Reason valueOf(int value) {
        return forNumber(value);
      }

      public static Reason forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return ZERO_STATE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Reason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Reason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
              @java.lang.Override
              public Reason findValueByNumber(int number) {
                return Reason.forNumber(number);
              }
            };

      public static com.google.protobuf.Internal.EnumVerifier 
          internalGetVerifier() {
        return ReasonVerifier.INSTANCE;
      }

      private static final class ReasonVerifier implements 
           com.google.protobuf.Internal.EnumVerifier { 
              static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ReasonVerifier();
              @java.lang.Override
              public boolean isInRange(int number) {
                return Reason.forNumber(number) != null;
              }
            }

        private final int value;

      Reason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason)
    }

    private int bitField0_;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
     * @return Whether the reason field is set.
     */
    @java.lang.Override
    public boolean hasReason() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override
    public org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason getReason() {
      org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason result = org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason.forNumber(reason_);
      return result == null ? org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason.UNKNOWN : result;
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
     * @param value The reason to set.
     */
    private void setReason(org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason value) {
      reason_ = value.getNumber();
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
     */
    private void clearReason() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reason_ = 0;
    }

    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * UI only reason that a refresh occurred.
     * </pre>
     *
     * Protobuf type {@code components.feed.core.proto.libraries.sharedstream.UiRefreshReason}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason, Builder> implements
        // @@protoc_insertion_point(builder_implements:components.feed.core.proto.libraries.sharedstream.UiRefreshReason)
        org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReasonOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
       * @return Whether the reason field is set.
       */
      @java.lang.Override
      public boolean hasReason() {
        return instance.hasReason();
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
       * @return The reason.
       */
      @java.lang.Override
      public org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason getReason() {
        return instance.getReason();
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason value) {
        copyOnWrite();
        instance.setReason(value);
        return this;
      }
      /**
       * <code>optional .components.feed.core.proto.libraries.sharedstream.UiRefreshReason.Reason reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        copyOnWrite();
        instance.clearReason();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:components.feed.core.proto.libraries.sharedstream.UiRefreshReason)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "reason_",
              org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.Reason.internalGetVerifier(),
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason>(
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


    // @@protoc_insertion_point(class_scope:components.feed.core.proto.libraries.sharedstream.UiRefreshReason)
    private static final org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason DEFAULT_INSTANCE;
    static {
      UiRefreshReason defaultInstance = new UiRefreshReason();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        UiRefreshReason.class, defaultInstance);
    }

    public static org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UiRefreshReason> PARSER;

    public static com.google.protobuf.Parser<UiRefreshReason> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
    public static final int UI_REFRESH_REASON_EXTENSION_FIELD_NUMBER = 237804819;
    /**
     * <code>extend .components.feed.core.proto.libraries.api.internal.UiContext { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
        org.chromium.components.feed.core.proto.libraries.api.internal.StreamDataProto.UiContext,
        org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason> uiRefreshReasonExtension = com.google.protobuf.GeneratedMessageLite
            .newSingularGeneratedExtension(
          org.chromium.components.feed.core.proto.libraries.api.internal.StreamDataProto.UiContext.getDefaultInstance(),
          org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.getDefaultInstance(),
          org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.getDefaultInstance(),
          null,
          237804819,
          com.google.protobuf.WireFormat.FieldType.MESSAGE,
          org.chromium.components.feed.core.proto.libraries.sharedstream.UiRefreshReasonProto.UiRefreshReason.class);
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
