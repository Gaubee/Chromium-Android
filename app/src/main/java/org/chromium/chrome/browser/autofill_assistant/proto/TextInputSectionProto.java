// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * A section containing one or multiple text inputs.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.TextInputSectionProto}
 */
public  final class TextInputSectionProto extends
    com.google.protobuf.GeneratedMessageLite<
        TextInputSectionProto, TextInputSectionProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.TextInputSectionProto)
    TextInputSectionProtoOrBuilder {
  private TextInputSectionProto() {
    inputFields_ = emptyProtobufList();
  }
  public static final int INPUT_FIELDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto> inputFields_;
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto> getInputFieldsList() {
    return inputFields_;
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.TextInputProtoOrBuilder> 
      getInputFieldsOrBuilderList() {
    return inputFields_;
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  @java.lang.Override
  public int getInputFieldsCount() {
    return inputFields_.size();
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto getInputFields(int index) {
    return inputFields_.get(index);
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.TextInputProtoOrBuilder getInputFieldsOrBuilder(
      int index) {
    return inputFields_.get(index);
  }
  private void ensureInputFieldsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto> tmp = inputFields_;
    if (!tmp.isModifiable()) {
      inputFields_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  private void setInputFields(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto value) {
    value.getClass();
  ensureInputFieldsIsMutable();
    inputFields_.set(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  private void addInputFields(org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto value) {
    value.getClass();
  ensureInputFieldsIsMutable();
    inputFields_.add(value);
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  private void addInputFields(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto value) {
    value.getClass();
  ensureInputFieldsIsMutable();
    inputFields_.add(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  private void addAllInputFields(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto> values) {
    ensureInputFieldsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, inputFields_);
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  private void clearInputFields() {
    inputFields_ = emptyProtobufList();
  }
  /**
   * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
   */
  private void removeInputFields(int index) {
    ensureInputFieldsIsMutable();
    inputFields_.remove(index);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A section containing one or multiple text inputs.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.TextInputSectionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.TextInputSectionProto)
      org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto> getInputFieldsList() {
      return java.util.Collections.unmodifiableList(
          instance.getInputFieldsList());
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    @java.lang.Override
    public int getInputFieldsCount() {
      return instance.getInputFieldsCount();
    }/**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto getInputFields(int index) {
      return instance.getInputFields(index);
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder setInputFields(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto value) {
      copyOnWrite();
      instance.setInputFields(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder setInputFields(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto.Builder builderForValue) {
      copyOnWrite();
      instance.setInputFields(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder addInputFields(org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto value) {
      copyOnWrite();
      instance.addInputFields(value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder addInputFields(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto value) {
      copyOnWrite();
      instance.addInputFields(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder addInputFields(
        org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto.Builder builderForValue) {
      copyOnWrite();
      instance.addInputFields(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder addInputFields(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto.Builder builderForValue) {
      copyOnWrite();
      instance.addInputFields(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder addAllInputFields(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto> values) {
      copyOnWrite();
      instance.addAllInputFields(values);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder clearInputFields() {
      copyOnWrite();
      instance.clearInputFields();
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TextInputProto input_fields = 1;</code>
     */
    public Builder removeInputFields(int index) {
      copyOnWrite();
      instance.removeInputFields(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.TextInputSectionProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "inputFields_",
            org.chromium.chrome.browser.autofill_assistant.proto.TextInputProto.class,
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.TextInputSectionProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto DEFAULT_INSTANCE;
  static {
    TextInputSectionProto defaultInstance = new TextInputSectionProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TextInputSectionProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TextInputSectionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TextInputSectionProto> PARSER;

  public static com.google.protobuf.Parser<TextInputSectionProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

