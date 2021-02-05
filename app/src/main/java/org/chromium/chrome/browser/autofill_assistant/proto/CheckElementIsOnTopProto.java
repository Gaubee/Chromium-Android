// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dom_action.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Check that the element is on top and not currently covered by any other
 * element.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.CheckElementIsOnTopProto}
 */
public  final class CheckElementIsOnTopProto extends
    com.google.protobuf.GeneratedMessageLite<
        CheckElementIsOnTopProto, CheckElementIsOnTopProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.CheckElementIsOnTopProto)
    CheckElementIsOnTopProtoOrBuilder {
  private CheckElementIsOnTopProto() {
  }
  private int bitField0_;
  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto clientId_;
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  @java.lang.Override
  public boolean hasClientId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getClientId() {
    return clientId_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance() : clientId_;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  private void setClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  clientId_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
    value.getClass();
  if (clientId_ != null &&
        clientId_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.getDefaultInstance()) {
      clientId_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.newBuilder(clientId_).mergeFrom(value).buildPartial();
    } else {
      clientId_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
   */
  private void clearClientId() {  clientId_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Check that the element is on top and not currently covered by any other
   * element.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.CheckElementIsOnTopProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.CheckElementIsOnTopProto)
      org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    @java.lang.Override
    public boolean hasClientId() {
      return instance.hasClientId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto getClientId() {
      return instance.getClientId();
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder setClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.setClientId(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder setClientId(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto.Builder builderForValue) {
      copyOnWrite();
      instance.setClientId(builderForValue.build());
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder mergeClientId(org.chromium.chrome.browser.autofill_assistant.proto.ClientIdProto value) {
      copyOnWrite();
      instance.mergeClientId(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientIdProto client_id = 1;</code>
     */
    public Builder clearClientId() {  copyOnWrite();
      instance.clearClientId();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.CheckElementIsOnTopProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "clientId_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.CheckElementIsOnTopProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto DEFAULT_INSTANCE;
  static {
    CheckElementIsOnTopProto defaultInstance = new CheckElementIsOnTopProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CheckElementIsOnTopProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.CheckElementIsOnTopProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CheckElementIsOnTopProto> PARSER;

  public static com.google.protobuf.Parser<CheckElementIsOnTopProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

