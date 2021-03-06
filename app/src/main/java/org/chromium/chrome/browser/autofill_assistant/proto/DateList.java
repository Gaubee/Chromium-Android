// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.DateList}
 */
public  final class DateList extends
    com.google.protobuf.GeneratedMessageLite<
        DateList, DateList.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.DateList)
    DateListOrBuilder {
  private DateList() {
    values_ = emptyProtobufList();
  }
  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.DateProto> values_;
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.DateProto> getValuesList() {
    return values_;
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.DateProtoOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.DateProto getValues(int index) {
    return values_.get(index);
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.DateProtoOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
  }
  private void ensureValuesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.DateProto> tmp = values_;
    if (!tmp.isModifiable()) {
      values_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  private void setValues(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
    value.getClass();
  ensureValuesIsMutable();
    values_.set(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  private void addValues(org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
    value.getClass();
  ensureValuesIsMutable();
    values_.add(value);
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  private void addValues(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
    value.getClass();
  ensureValuesIsMutable();
    values_.add(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  private void addAllValues(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.DateProto> values) {
    ensureValuesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, values_);
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  private void clearValues() {
    values_ = emptyProtobufList();
  }
  /**
   * <code>repeated .autofill_assistant.DateProto values = 1;</code>
   */
  private void removeValues(int index) {
    ensureValuesIsMutable();
    values_.remove(index);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.DateList prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.DateList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.DateList, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.DateList)
      org.chromium.chrome.browser.autofill_assistant.proto.DateListOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.DateList.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.DateProto> getValuesList() {
      return java.util.Collections.unmodifiableList(
          instance.getValuesList());
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    @java.lang.Override
    public int getValuesCount() {
      return instance.getValuesCount();
    }/**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.DateProto getValues(int index) {
      return instance.getValues(index);
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder setValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
      copyOnWrite();
      instance.setValues(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder setValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.DateProto.Builder builderForValue) {
      copyOnWrite();
      instance.setValues(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder addValues(org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
      copyOnWrite();
      instance.addValues(value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder addValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.DateProto value) {
      copyOnWrite();
      instance.addValues(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder addValues(
        org.chromium.chrome.browser.autofill_assistant.proto.DateProto.Builder builderForValue) {
      copyOnWrite();
      instance.addValues(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder addValues(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.DateProto.Builder builderForValue) {
      copyOnWrite();
      instance.addValues(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.DateProto> values) {
      copyOnWrite();
      instance.addAllValues(values);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder clearValues() {
      copyOnWrite();
      instance.clearValues();
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.DateProto values = 1;</code>
     */
    public Builder removeValues(int index) {
      copyOnWrite();
      instance.removeValues(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.DateList)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.DateList();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "values_",
            org.chromium.chrome.browser.autofill_assistant.proto.DateProto.class,
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.DateList> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.DateList.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.DateList>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.DateList)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.DateList DEFAULT_INSTANCE;
  static {
    DateList defaultInstance = new DateList();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DateList.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.DateList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DateList> PARSER;

  public static com.google.protobuf.Parser<DateList> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

