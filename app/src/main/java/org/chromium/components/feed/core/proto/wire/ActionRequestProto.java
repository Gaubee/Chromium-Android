// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/action_request.proto

package org.chromium.components.feed.core.proto.wire;

public final class ActionRequestProto {
  private ActionRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ActionRequestOrBuilder extends 
      // @@protoc_insertion_point(interface_extends:feedwire1.ActionRequest)
       com.google.protobuf.GeneratedMessageLite.
            ExtendableMessageOrBuilder<
                ActionRequest, ActionRequest.Builder> {

    /**
     * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
     * @return Whether the requestVersion field is set.
     */
    boolean hasRequestVersion();
    /**
     * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
     * @return The requestVersion.
     */
    org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion getRequestVersion();
  }
  /**
   * <pre>
   * Top level request message.
   * </pre>
   *
   * Protobuf type {@code feedwire1.ActionRequest}
   */
  public  static final class ActionRequest extends
      com.google.protobuf.GeneratedMessageLite.ExtendableMessage<
        ActionRequest, ActionRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:feedwire1.ActionRequest)
      ActionRequestOrBuilder {
    private ActionRequest() {
    }
    /**
     * <pre>
     * Supported versions of request messages are specified as extensions to
     * the top-level request message.  An enum is used to denote the expected
     * extensions for this request.
     * </pre>
     *
     * Protobuf enum {@code feedwire1.ActionRequest.RequestVersion}
     */
    public enum RequestVersion
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_ACTION_REQUEST_VERSION = 0;</code>
       */
      UNKNOWN_ACTION_REQUEST_VERSION(0),
      /**
       * <code>FEED_UPLOAD_ACTION = 1;</code>
       */
      FEED_UPLOAD_ACTION(1),
      ;

      /**
       * <code>UNKNOWN_ACTION_REQUEST_VERSION = 0;</code>
       */
      public static final int UNKNOWN_ACTION_REQUEST_VERSION_VALUE = 0;
      /**
       * <code>FEED_UPLOAD_ACTION = 1;</code>
       */
      public static final int FEED_UPLOAD_ACTION_VALUE = 1;


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
      public static RequestVersion valueOf(int value) {
        return forNumber(value);
      }

      public static RequestVersion forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_ACTION_REQUEST_VERSION;
          case 1: return FEED_UPLOAD_ACTION;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RequestVersion>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RequestVersion> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RequestVersion>() {
              @java.lang.Override
              public RequestVersion findValueByNumber(int number) {
                return RequestVersion.forNumber(number);
              }
            };

      public static com.google.protobuf.Internal.EnumVerifier 
          internalGetVerifier() {
        return RequestVersionVerifier.INSTANCE;
      }

      private static final class RequestVersionVerifier implements 
           com.google.protobuf.Internal.EnumVerifier { 
              static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new RequestVersionVerifier();
              @java.lang.Override
              public boolean isInRange(int number) {
                return RequestVersion.forNumber(number) != null;
              }
            }

        private final int value;

      RequestVersion(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:feedwire1.ActionRequest.RequestVersion)
    }

    private int bitField0_;
    public static final int REQUEST_VERSION_FIELD_NUMBER = 1;
    private int requestVersion_;
    /**
     * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
     * @return Whether the requestVersion field is set.
     */
    @java.lang.Override
    public boolean hasRequestVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
     * @return The requestVersion.
     */
    @java.lang.Override
    public org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion getRequestVersion() {
      org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion result = org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion.forNumber(requestVersion_);
      return result == null ? org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion.UNKNOWN_ACTION_REQUEST_VERSION : result;
    }
    /**
     * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
     * @param value The requestVersion to set.
     */
    private void setRequestVersion(org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion value) {
      requestVersion_ = value.getNumber();
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
     */
    private void clearRequestVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestVersion_ = 0;
    }

    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Top level request message.
     * </pre>
     *
     * Protobuf type {@code feedwire1.ActionRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<
          org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:feedwire1.ActionRequest)
        org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequestOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
       * @return Whether the requestVersion field is set.
       */
      @java.lang.Override
      public boolean hasRequestVersion() {
        return instance.hasRequestVersion();
      }
      /**
       * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
       * @return The requestVersion.
       */
      @java.lang.Override
      public org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion getRequestVersion() {
        return instance.getRequestVersion();
      }
      /**
       * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
       * @param value The enum numeric value on the wire for requestVersion to set.
       * @return This builder for chaining.
       */
      public Builder setRequestVersion(org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion value) {
        copyOnWrite();
        instance.setRequestVersion(value);
        return this;
      }
      /**
       * <code>optional .feedwire1.ActionRequest.RequestVersion request_version = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestVersion() {
        copyOnWrite();
        instance.clearRequestVersion();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:feedwire1.ActionRequest)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "requestVersion_",
              org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.RequestVersion.internalGetVerifier(),
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
          com.google.protobuf.Parser<org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return memoizedIsInitialized;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:feedwire1.ActionRequest)
    private static final org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest DEFAULT_INSTANCE;
    static {
      ActionRequest defaultInstance = new ActionRequest();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        ActionRequest.class, defaultInstance);
    }

    public static org.chromium.components.feed.core.proto.wire.ActionRequestProto.ActionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ActionRequest> PARSER;

    public static com.google.protobuf.Parser<ActionRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
