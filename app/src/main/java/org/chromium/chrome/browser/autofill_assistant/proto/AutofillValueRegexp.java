// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action_value.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.AutofillValueRegexp}
 */
public  final class AutofillValueRegexp extends
    com.google.protobuf.GeneratedMessageLite<
        AutofillValueRegexp, AutofillValueRegexp.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.AutofillValueRegexp)
    AutofillValueRegexpOrBuilder {
  private AutofillValueRegexp() {
  }
  public interface ProfileOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.AutofillValueRegexp.Profile)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string identifier = 1;</code>
     * @return Whether the identifier field is set.
     */
    boolean hasIdentifier();
    /**
     * <code>optional string identifier = 1;</code>
     * @return The identifier.
     */
    java.lang.String getIdentifier();
    /**
     * <code>optional string identifier = 1;</code>
     * @return The bytes for identifier.
     */
    com.google.protobuf.ByteString
        getIdentifierBytes();
  }
  /**
   * Protobuf type {@code autofill_assistant.AutofillValueRegexp.Profile}
   */
  public  static final class Profile extends
      com.google.protobuf.GeneratedMessageLite<
          Profile, Profile.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.AutofillValueRegexp.Profile)
      ProfileOrBuilder {
    private Profile() {
      identifier_ = "";
    }
    private int bitField0_;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private java.lang.String identifier_;
    /**
     * <code>optional string identifier = 1;</code>
     * @return Whether the identifier field is set.
     */
    @java.lang.Override
    public boolean hasIdentifier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string identifier = 1;</code>
     * @return The identifier.
     */
    @java.lang.Override
    public java.lang.String getIdentifier() {
      return identifier_;
    }
    /**
     * <code>optional string identifier = 1;</code>
     * @return The bytes for identifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdentifierBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(identifier_);
    }
    /**
     * <code>optional string identifier = 1;</code>
     * @param value The identifier to set.
     */
    private void setIdentifier(
        java.lang.String value) {
      value.getClass();
  bitField0_ |= 0x00000001;
      identifier_ = value;
    }
    /**
     * <code>optional string identifier = 1;</code>
     */
    private void clearIdentifier() {
      bitField0_ = (bitField0_ & ~0x00000001);
      identifier_ = getDefaultInstance().getIdentifier();
    }
    /**
     * <code>optional string identifier = 1;</code>
     * @param value The bytes for identifier to set.
     */
    private void setIdentifierBytes(
        com.google.protobuf.ByteString value) {
      identifier_ = value.toStringUtf8();
      bitField0_ |= 0x00000001;
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code autofill_assistant.AutofillValueRegexp.Profile}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.AutofillValueRegexp.Profile)
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.ProfileOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string identifier = 1;</code>
       * @return Whether the identifier field is set.
       */
      @java.lang.Override
      public boolean hasIdentifier() {
        return instance.hasIdentifier();
      }
      /**
       * <code>optional string identifier = 1;</code>
       * @return The identifier.
       */
      @java.lang.Override
      public java.lang.String getIdentifier() {
        return instance.getIdentifier();
      }
      /**
       * <code>optional string identifier = 1;</code>
       * @return The bytes for identifier.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getIdentifierBytes() {
        return instance.getIdentifierBytes();
      }
      /**
       * <code>optional string identifier = 1;</code>
       * @param value The identifier to set.
       * @return This builder for chaining.
       */
      public Builder setIdentifier(
          java.lang.String value) {
        copyOnWrite();
        instance.setIdentifier(value);
        return this;
      }
      /**
       * <code>optional string identifier = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIdentifier() {
        copyOnWrite();
        instance.clearIdentifier();
        return this;
      }
      /**
       * <code>optional string identifier = 1;</code>
       * @param value The bytes for identifier to set.
       * @return This builder for chaining.
       */
      public Builder setIdentifierBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setIdentifierBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.AutofillValueRegexp.Profile)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "identifier_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile>(
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


    // @@protoc_insertion_point(class_scope:autofill_assistant.AutofillValueRegexp.Profile)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile DEFAULT_INSTANCE;
    static {
      Profile defaultInstance = new Profile();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Profile.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Profile> PARSER;

    public static com.google.protobuf.Parser<Profile> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  public static final int PROFILE_FIELD_NUMBER = 1;
  private org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile profile_;
  /**
   * <pre>
   * The profile to be used. This has to be requested with a
   * |CollectUserDataAction| first.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
   */
  @java.lang.Override
  public boolean hasProfile() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The profile to be used. This has to be requested with a
   * |CollectUserDataAction| first.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile getProfile() {
    return profile_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile.getDefaultInstance() : profile_;
  }
  /**
   * <pre>
   * The profile to be used. This has to be requested with a
   * |CollectUserDataAction| first.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
   */
  private void setProfile(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile value) {
    value.getClass();
  profile_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The profile to be used. This has to be requested with a
   * |CollectUserDataAction| first.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeProfile(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile value) {
    value.getClass();
  if (profile_ != null &&
        profile_ != org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile.getDefaultInstance()) {
      profile_ =
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile.newBuilder(profile_).mergeFrom(value).buildPartial();
    } else {
      profile_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The profile to be used. This has to be requested with a
   * |CollectUserDataAction| first.
   * </pre>
   *
   * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
   */
  private void clearProfile() {  profile_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int VALUE_EXPRESSION_FIELD_NUMBER = 2;
  private org.chromium.chrome.browser.autofill_assistant.proto.TextFilter valueExpression_;
  /**
   * <pre>
   * A string containing any number of "${key}" placeholders, where the key is
   * an integer corresponding to entries from field_types.h or
   * |AutofillFormatProto::AutofillAssistantCustomField|.
   * Note that the set of actually available fields are outside of our
   * control and are retrieved automatically from the provided profile.
   * The |value_expression| needs to escape all text outside of placeholders,
   * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
   * ("${12}") should not be escaped, this will be handled during replacement.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
   */
  @java.lang.Override
  public boolean hasValueExpression() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A string containing any number of "${key}" placeholders, where the key is
   * an integer corresponding to entries from field_types.h or
   * |AutofillFormatProto::AutofillAssistantCustomField|.
   * Note that the set of actually available fields are outside of our
   * control and are retrieved automatically from the provided profile.
   * The |value_expression| needs to escape all text outside of placeholders,
   * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
   * ("${12}") should not be escaped, this will be handled during replacement.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.TextFilter getValueExpression() {
    return valueExpression_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.TextFilter.getDefaultInstance() : valueExpression_;
  }
  /**
   * <pre>
   * A string containing any number of "${key}" placeholders, where the key is
   * an integer corresponding to entries from field_types.h or
   * |AutofillFormatProto::AutofillAssistantCustomField|.
   * Note that the set of actually available fields are outside of our
   * control and are retrieved automatically from the provided profile.
   * The |value_expression| needs to escape all text outside of placeholders,
   * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
   * ("${12}") should not be escaped, this will be handled during replacement.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
   */
  private void setValueExpression(org.chromium.chrome.browser.autofill_assistant.proto.TextFilter value) {
    value.getClass();
  valueExpression_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * A string containing any number of "${key}" placeholders, where the key is
   * an integer corresponding to entries from field_types.h or
   * |AutofillFormatProto::AutofillAssistantCustomField|.
   * Note that the set of actually available fields are outside of our
   * control and are retrieved automatically from the provided profile.
   * The |value_expression| needs to escape all text outside of placeholders,
   * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
   * ("${12}") should not be escaped, this will be handled during replacement.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeValueExpression(org.chromium.chrome.browser.autofill_assistant.proto.TextFilter value) {
    value.getClass();
  if (valueExpression_ != null &&
        valueExpression_ != org.chromium.chrome.browser.autofill_assistant.proto.TextFilter.getDefaultInstance()) {
      valueExpression_ =
        org.chromium.chrome.browser.autofill_assistant.proto.TextFilter.newBuilder(valueExpression_).mergeFrom(value).buildPartial();
    } else {
      valueExpression_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * A string containing any number of "${key}" placeholders, where the key is
   * an integer corresponding to entries from field_types.h or
   * |AutofillFormatProto::AutofillAssistantCustomField|.
   * Note that the set of actually available fields are outside of our
   * control and are retrieved automatically from the provided profile.
   * The |value_expression| needs to escape all text outside of placeholders,
   * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
   * ("${12}") should not be escaped, this will be handled during replacement.
   * </pre>
   *
   * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
   */
  private void clearValueExpression() {  valueExpression_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.AutofillValueRegexp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.AutofillValueRegexp)
      org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexpOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The profile to be used. This has to be requested with a
     * |CollectUserDataAction| first.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
     */
    @java.lang.Override
    public boolean hasProfile() {
      return instance.hasProfile();
    }
    /**
     * <pre>
     * The profile to be used. This has to be requested with a
     * |CollectUserDataAction| first.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile getProfile() {
      return instance.getProfile();
    }
    /**
     * <pre>
     * The profile to be used. This has to be requested with a
     * |CollectUserDataAction| first.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
     */
    public Builder setProfile(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile value) {
      copyOnWrite();
      instance.setProfile(value);
      return this;
      }
    /**
     * <pre>
     * The profile to be used. This has to be requested with a
     * |CollectUserDataAction| first.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
     */
    public Builder setProfile(
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile.Builder builderForValue) {
      copyOnWrite();
      instance.setProfile(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The profile to be used. This has to be requested with a
     * |CollectUserDataAction| first.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
     */
    public Builder mergeProfile(org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.Profile value) {
      copyOnWrite();
      instance.mergeProfile(value);
      return this;
    }
    /**
     * <pre>
     * The profile to be used. This has to be requested with a
     * |CollectUserDataAction| first.
     * </pre>
     *
     * <code>optional .autofill_assistant.AutofillValueRegexp.Profile profile = 1;</code>
     */
    public Builder clearProfile() {  copyOnWrite();
      instance.clearProfile();
      return this;
    }

    /**
     * <pre>
     * A string containing any number of "${key}" placeholders, where the key is
     * an integer corresponding to entries from field_types.h or
     * |AutofillFormatProto::AutofillAssistantCustomField|.
     * Note that the set of actually available fields are outside of our
     * control and are retrieved automatically from the provided profile.
     * The |value_expression| needs to escape all text outside of placeholders,
     * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
     * ("${12}") should not be escaped, this will be handled during replacement.
     * </pre>
     *
     * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
     */
    @java.lang.Override
    public boolean hasValueExpression() {
      return instance.hasValueExpression();
    }
    /**
     * <pre>
     * A string containing any number of "${key}" placeholders, where the key is
     * an integer corresponding to entries from field_types.h or
     * |AutofillFormatProto::AutofillAssistantCustomField|.
     * Note that the set of actually available fields are outside of our
     * control and are retrieved automatically from the provided profile.
     * The |value_expression| needs to escape all text outside of placeholders,
     * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
     * ("${12}") should not be escaped, this will be handled during replacement.
     * </pre>
     *
     * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.TextFilter getValueExpression() {
      return instance.getValueExpression();
    }
    /**
     * <pre>
     * A string containing any number of "${key}" placeholders, where the key is
     * an integer corresponding to entries from field_types.h or
     * |AutofillFormatProto::AutofillAssistantCustomField|.
     * Note that the set of actually available fields are outside of our
     * control and are retrieved automatically from the provided profile.
     * The |value_expression| needs to escape all text outside of placeholders,
     * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
     * ("${12}") should not be escaped, this will be handled during replacement.
     * </pre>
     *
     * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
     */
    public Builder setValueExpression(org.chromium.chrome.browser.autofill_assistant.proto.TextFilter value) {
      copyOnWrite();
      instance.setValueExpression(value);
      return this;
      }
    /**
     * <pre>
     * A string containing any number of "${key}" placeholders, where the key is
     * an integer corresponding to entries from field_types.h or
     * |AutofillFormatProto::AutofillAssistantCustomField|.
     * Note that the set of actually available fields are outside of our
     * control and are retrieved automatically from the provided profile.
     * The |value_expression| needs to escape all text outside of placeholders,
     * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
     * ("${12}") should not be escaped, this will be handled during replacement.
     * </pre>
     *
     * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
     */
    public Builder setValueExpression(
        org.chromium.chrome.browser.autofill_assistant.proto.TextFilter.Builder builderForValue) {
      copyOnWrite();
      instance.setValueExpression(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A string containing any number of "${key}" placeholders, where the key is
     * an integer corresponding to entries from field_types.h or
     * |AutofillFormatProto::AutofillAssistantCustomField|.
     * Note that the set of actually available fields are outside of our
     * control and are retrieved automatically from the provided profile.
     * The |value_expression| needs to escape all text outside of placeholders,
     * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
     * ("${12}") should not be escaped, this will be handled during replacement.
     * </pre>
     *
     * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
     */
    public Builder mergeValueExpression(org.chromium.chrome.browser.autofill_assistant.proto.TextFilter value) {
      copyOnWrite();
      instance.mergeValueExpression(value);
      return this;
    }
    /**
     * <pre>
     * A string containing any number of "${key}" placeholders, where the key is
     * an integer corresponding to entries from field_types.h or
     * |AutofillFormatProto::AutofillAssistantCustomField|.
     * Note that the set of actually available fields are outside of our
     * control and are retrieved automatically from the provided profile.
     * The |value_expression| needs to escape all text outside of placeholders,
     * e.g. a pattern like "+${12}" needs to escape the "+". The pattern keys
     * ("${12}") should not be escaped, this will be handled during replacement.
     * </pre>
     *
     * <code>optional .autofill_assistant.TextFilter value_expression = 2;</code>
     */
    public Builder clearValueExpression() {  copyOnWrite();
      instance.clearValueExpression();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.AutofillValueRegexp)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "profile_",
            "valueExpression_",
          };
          java.lang.String info =
              "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.AutofillValueRegexp)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp DEFAULT_INSTANCE;
  static {
    AutofillValueRegexp defaultInstance = new AutofillValueRegexp();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AutofillValueRegexp.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.AutofillValueRegexp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AutofillValueRegexp> PARSER;

  public static com.google.protobuf.Parser<AutofillValueRegexp> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
