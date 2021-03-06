// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic_ui.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Creates a safe-to-transmit CreditCardResponseProto for the input |value|.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.CreateCreditCardResponseProto}
 */
public  final class CreateCreditCardResponseProto extends
    com.google.protobuf.GeneratedMessageLite<
        CreateCreditCardResponseProto, CreateCreditCardResponseProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.CreateCreditCardResponseProto)
    CreateCreditCardResponseProtoOrBuilder {
  private CreateCreditCardResponseProto() {
  }
  private int bitField0_;
  public static final int VALUE_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value_;
  /**
   * <pre>
   * The input CreditCardProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The input CreditCardProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValue() {
    return value_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The input CreditCardProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
   */
  private void setValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  value_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The input CreditCardProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
    value.getClass();
  if (value_ != null &&
        value_ != org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.getDefaultInstance()) {
      value_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.newBuilder(value_).mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The input CreditCardProto.
   * </pre>
   *
   * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
   */
  private void clearValue() {  value_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Creates a safe-to-transmit CreditCardResponseProto for the input |value|.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.CreateCreditCardResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.CreateCreditCardResponseProto)
      org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The input CreditCardProto.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
     */
    @java.lang.Override
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <pre>
     * The input CreditCardProto.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The input CreditCardProto.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
     */
    public Builder setValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
      }
    /**
     * <pre>
     * The input CreditCardProto.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
     */
    public Builder setValue(
        org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setValue(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The input CreditCardProto.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
     */
    public Builder mergeValue(org.chromium.chrome.browser.autofill_assistant.proto.ValueReferenceProto value) {
      copyOnWrite();
      instance.mergeValue(value);
      return this;
    }
    /**
     * <pre>
     * The input CreditCardProto.
     * </pre>
     *
     * <code>optional .autofill_assistant.ValueReferenceProto value = 1;</code>
     */
    public Builder clearValue() {  copyOnWrite();
      instance.clearValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.CreateCreditCardResponseProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "value_",
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.CreateCreditCardResponseProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto DEFAULT_INSTANCE;
  static {
    CreateCreditCardResponseProto defaultInstance = new CreateCreditCardResponseProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateCreditCardResponseProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.CreateCreditCardResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateCreditCardResponseProto> PARSER;

  public static com.google.protobuf.Parser<CreateCreditCardResponseProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

