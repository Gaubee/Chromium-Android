// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.FormInputProto}
 */
public  final class FormInputProto extends
    com.google.protobuf.GeneratedMessageLite<
        FormInputProto, FormInputProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.FormInputProto)
    FormInputProtoOrBuilder {
  private FormInputProto() {
  }
  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.FormInputProto.Result)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     * @return Whether the counter field is set.
     */
    boolean hasCounter();
    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     * @return The counter.
     */
    org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result getCounter();

    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     * @return Whether the selection field is set.
     */
    boolean hasSelection();
    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     * @return The selection.
     */
    org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result getSelection();

    public org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result.InputTypeCase getInputTypeCase();
  }
  /**
   * Protobuf type {@code autofill_assistant.FormInputProto.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageLite<
          Result, Result.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.FormInputProto.Result)
      ResultOrBuilder {
    private Result() {
    }
    private int bitField0_;
    private int inputTypeCase_ = 0;
    private java.lang.Object inputType_;
    public enum InputTypeCase {
      COUNTER(1),
      SELECTION(2),
      INPUTTYPE_NOT_SET(0);
      private final int value;
      private InputTypeCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static InputTypeCase valueOf(int value) {
        return forNumber(value);
      }

      public static InputTypeCase forNumber(int value) {
        switch (value) {
          case 1: return COUNTER;
          case 2: return SELECTION;
          case 0: return INPUTTYPE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    @java.lang.Override
    public InputTypeCase
    getInputTypeCase() {
      return InputTypeCase.forNumber(
          inputTypeCase_);
    }

    private void clearInputType() {
      inputTypeCase_ = 0;
      inputType_ = null;
    }

    public static final int COUNTER_FIELD_NUMBER = 1;
    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     */
    @java.lang.Override
    public boolean hasCounter() {
      return inputTypeCase_ == 1;
    }
    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result getCounter() {
      if (inputTypeCase_ == 1) {
         return (org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result) inputType_;
      }
      return org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result.getDefaultInstance();
    }
    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     */
    private void setCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result value) {
      value.getClass();
  inputType_ = value;
      inputTypeCase_ = 1;
    }
    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     */
    private void mergeCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result value) {
      value.getClass();
  if (inputTypeCase_ == 1 &&
          inputType_ != org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result.getDefaultInstance()) {
        inputType_ = org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result) inputType_)
            .mergeFrom(value).buildPartial();
      } else {
        inputType_ = value;
      }
      inputTypeCase_ = 1;
    }
    /**
     * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
     */
    private void clearCounter() {
      if (inputTypeCase_ == 1) {
        inputTypeCase_ = 0;
        inputType_ = null;
      }
    }

    public static final int SELECTION_FIELD_NUMBER = 2;
    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     */
    @java.lang.Override
    public boolean hasSelection() {
      return inputTypeCase_ == 2;
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result getSelection() {
      if (inputTypeCase_ == 2) {
         return (org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result) inputType_;
      }
      return org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result.getDefaultInstance();
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     */
    private void setSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result value) {
      value.getClass();
  inputType_ = value;
      inputTypeCase_ = 2;
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     */
    private void mergeSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result value) {
      value.getClass();
  if (inputTypeCase_ == 2 &&
          inputType_ != org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result.getDefaultInstance()) {
        inputType_ = org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result) inputType_)
            .mergeFrom(value).buildPartial();
      } else {
        inputType_ = value;
      }
      inputTypeCase_ = 2;
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
     */
    private void clearSelection() {
      if (inputTypeCase_ == 2) {
        inputTypeCase_ = 0;
        inputType_ = null;
      }
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code autofill_assistant.FormInputProto.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.FormInputProto.Result)
        org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.ResultOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }

      @java.lang.Override
      public InputTypeCase
          getInputTypeCase() {
        return instance.getInputTypeCase();
      }

      public Builder clearInputType() {
        copyOnWrite();
        instance.clearInputType();
        return this;
      }


      /**
       * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
       */
      @java.lang.Override
      public boolean hasCounter() {
        return instance.hasCounter();
      }
      /**
       * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
       */
      @java.lang.Override
      public org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result getCounter() {
        return instance.getCounter();
      }
      /**
       * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
       */
      public Builder setCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result value) {
        copyOnWrite();
        instance.setCounter(value);
        return this;
      }
      /**
       * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
       */
      public Builder setCounter(
          org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result.Builder builderForValue) {
        copyOnWrite();
        instance.setCounter(builderForValue.build());
        return this;
      }
      /**
       * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
       */
      public Builder mergeCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result value) {
        copyOnWrite();
        instance.mergeCounter(value);
        return this;
      }
      /**
       * <code>.autofill_assistant.CounterInputProto.Result counter = 1;</code>
       */
      public Builder clearCounter() {
        copyOnWrite();
        instance.clearCounter();
        return this;
      }

      /**
       * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
       */
      @java.lang.Override
      public boolean hasSelection() {
        return instance.hasSelection();
      }
      /**
       * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
       */
      @java.lang.Override
      public org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result getSelection() {
        return instance.getSelection();
      }
      /**
       * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
       */
      public Builder setSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result value) {
        copyOnWrite();
        instance.setSelection(value);
        return this;
      }
      /**
       * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
       */
      public Builder setSelection(
          org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result.Builder builderForValue) {
        copyOnWrite();
        instance.setSelection(builderForValue.build());
        return this;
      }
      /**
       * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
       */
      public Builder mergeSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result value) {
        copyOnWrite();
        instance.mergeSelection(value);
        return this;
      }
      /**
       * <code>.autofill_assistant.SelectionInputProto.Result selection = 2;</code>
       */
      public Builder clearSelection() {
        copyOnWrite();
        instance.clearSelection();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.FormInputProto.Result)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "inputType_",
              "inputTypeCase_",
              "bitField0_",
              org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Result.class,
              org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Result.class,
            };
            java.lang.String info =
                "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002" +
                "\u103c\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result>(
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


    // @@protoc_insertion_point(class_scope:autofill_assistant.FormInputProto.Result)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result DEFAULT_INSTANCE;
    static {
      Result defaultInstance = new Result();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Result.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Result> PARSER;

    public static com.google.protobuf.Parser<Result> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  private int inputTypeCase_ = 0;
  private java.lang.Object inputType_;
  public enum InputTypeCase {
    COUNTER(1),
    SELECTION(2),
    INPUTTYPE_NOT_SET(0);
    private final int value;
    private InputTypeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InputTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static InputTypeCase forNumber(int value) {
      switch (value) {
        case 1: return COUNTER;
        case 2: return SELECTION;
        case 0: return INPUTTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public InputTypeCase
  getInputTypeCase() {
    return InputTypeCase.forNumber(
        inputTypeCase_);
  }

  private void clearInputType() {
    inputTypeCase_ = 0;
    inputType_ = null;
  }

  public static final int COUNTER_FIELD_NUMBER = 1;
  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   */
  @java.lang.Override
  public boolean hasCounter() {
    return inputTypeCase_ == 1;
  }
  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto getCounter() {
    if (inputTypeCase_ == 1) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto) inputType_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.getDefaultInstance();
  }
  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   */
  private void setCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto value) {
    value.getClass();
  inputType_ = value;
    inputTypeCase_ = 1;
  }
  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   */
  private void mergeCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto value) {
    value.getClass();
  if (inputTypeCase_ == 1 &&
        inputType_ != org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.getDefaultInstance()) {
      inputType_ = org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto) inputType_)
          .mergeFrom(value).buildPartial();
    } else {
      inputType_ = value;
    }
    inputTypeCase_ = 1;
  }
  /**
   * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
   */
  private void clearCounter() {
    if (inputTypeCase_ == 1) {
      inputTypeCase_ = 0;
      inputType_ = null;
    }
  }

  public static final int SELECTION_FIELD_NUMBER = 2;
  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  @java.lang.Override
  public boolean hasSelection() {
    return inputTypeCase_ == 2;
  }
  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto getSelection() {
    if (inputTypeCase_ == 2) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto) inputType_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.getDefaultInstance();
  }
  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  private void setSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto value) {
    value.getClass();
  inputType_ = value;
    inputTypeCase_ = 2;
  }
  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  private void mergeSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto value) {
    value.getClass();
  if (inputTypeCase_ == 2 &&
        inputType_ != org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.getDefaultInstance()) {
      inputType_ = org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto) inputType_)
          .mergeFrom(value).buildPartial();
    } else {
      inputType_ = value;
    }
    inputTypeCase_ = 2;
  }
  /**
   * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
   */
  private void clearSelection() {
    if (inputTypeCase_ == 2) {
      inputTypeCase_ = 0;
      inputType_ = null;
    }
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.FormInputProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.FormInputProto)
      org.chromium.chrome.browser.autofill_assistant.proto.FormInputProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public InputTypeCase
        getInputTypeCase() {
      return instance.getInputTypeCase();
    }

    public Builder clearInputType() {
      copyOnWrite();
      instance.clearInputType();
      return this;
    }


    /**
     * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
     */
    @java.lang.Override
    public boolean hasCounter() {
      return instance.hasCounter();
    }
    /**
     * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto getCounter() {
      return instance.getCounter();
    }
    /**
     * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
     */
    public Builder setCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto value) {
      copyOnWrite();
      instance.setCounter(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
     */
    public Builder setCounter(
        org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.Builder builderForValue) {
      copyOnWrite();
      instance.setCounter(builderForValue.build());
      return this;
    }
    /**
     * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
     */
    public Builder mergeCounter(org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto value) {
      copyOnWrite();
      instance.mergeCounter(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.CounterInputProto counter = 1;</code>
     */
    public Builder clearCounter() {
      copyOnWrite();
      instance.clearCounter();
      return this;
    }

    /**
     * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
     */
    @java.lang.Override
    public boolean hasSelection() {
      return instance.hasSelection();
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto getSelection() {
      return instance.getSelection();
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
     */
    public Builder setSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto value) {
      copyOnWrite();
      instance.setSelection(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
     */
    public Builder setSelection(
        org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.Builder builderForValue) {
      copyOnWrite();
      instance.setSelection(builderForValue.build());
      return this;
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
     */
    public Builder mergeSelection(org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto value) {
      copyOnWrite();
      instance.mergeSelection(value);
      return this;
    }
    /**
     * <code>.autofill_assistant.SelectionInputProto selection = 2;</code>
     */
    public Builder clearSelection() {
      copyOnWrite();
      instance.clearSelection();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.FormInputProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "inputType_",
            "inputTypeCase_",
            "bitField0_",
            org.chromium.chrome.browser.autofill_assistant.proto.CounterInputProto.class,
            org.chromium.chrome.browser.autofill_assistant.proto.SelectionInputProto.class,
          };
          java.lang.String info =
              "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002" +
              "\u103c\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.FormInputProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto DEFAULT_INSTANCE;
  static {
    FormInputProto defaultInstance = new FormInputProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      FormInputProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.FormInputProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FormInputProto> PARSER;

  public static com.google.protobuf.Parser<FormInputProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

