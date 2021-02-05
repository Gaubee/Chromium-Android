// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Message to report errors related to WebController execution.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.WebControllerErrorInfoProto}
 */
public  final class WebControllerErrorInfoProto extends
    com.google.protobuf.GeneratedMessageLite<
        WebControllerErrorInfoProto, WebControllerErrorInfoProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.WebControllerErrorInfoProto)
    WebControllerErrorInfoProtoOrBuilder {
  private WebControllerErrorInfoProto() {
  }
  /**
   * Protobuf enum {@code autofill_assistant.WebControllerErrorInfoProto.WebAction}
   */
  public enum WebAction
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNSPECIFIED_WEB_ACTION = 0;</code>
     */
    UNSPECIFIED_WEB_ACTION(0),
    /**
     * <pre>
     * Scroll an element into view by centering it on the page. This uses
     * native JS functionality.
     * </pre>
     *
     * <code>SCROLL_INTO_VIEW = 1;</code>
     */
    SCROLL_INTO_VIEW(1),
    /**
     * <pre>
     * Waiting for the document ready state to be interactive.
     * </pre>
     *
     * <code>WAIT_FOR_DOCUMENT_TO_BECOME_INTERACTIVE = 2;</code>
     */
    WAIT_FOR_DOCUMENT_TO_BECOME_INTERACTIVE(2),
    /**
     * <pre>
     * Send a click or tap event to an element.
     * </pre>
     *
     * <code>CLICK_OR_TAP_ELEMENT = 3;</code>
     */
    CLICK_OR_TAP_ELEMENT(3),
    /**
     * <pre>
     * Select an option from an HTML dropdown.
     * </pre>
     *
     * <code>SELECT_OPTION = 4;</code>
     */
    SELECT_OPTION(4),
    /**
     * <pre>
     * Set the element's style to be highlighted by adding a BoxShadow to the
     * element.
     * </pre>
     *
     * <code>HIGHLIGHT_ELEMENT = 5;</code>
     */
    HIGHLIGHT_ELEMENT(5),
    /**
     * <pre>
     * Scroll the element into view with padding. This does not use native JS
     * functionality but calculates the scrolling manually.
     * </pre>
     *
     * <code>SCROLL_INTO_VIEW_WITH_PADDING = 6;</code>
     */
    SCROLL_INTO_VIEW_WITH_PADDING(6),
    /**
     * <pre>
     * Get the |value| attribute of an element.
     * </pre>
     *
     * <code>GET_FIELD_VALUE = 7;</code>
     */
    GET_FIELD_VALUE(7),
    /**
     * <pre>
     * Get any attribute of an element.
     * </pre>
     *
     * <code>GET_STRING_ATTRIBUTE = 8;</code>
     */
    GET_STRING_ATTRIBUTE(8),
    /**
     * <pre>
     * Select an element's value. This does only work for text elements.
     * </pre>
     *
     * <code>SELECT_FIELD_VALUE = 9;</code>
     */
    SELECT_FIELD_VALUE(9),
    /**
     * <pre>
     * Set the |value| attribute of an element.
     * </pre>
     *
     * <code>SET_VALUE_ATTRIBUTE = 10;</code>
     */
    SET_VALUE_ATTRIBUTE(10),
    /**
     * <pre>
     * Set any attribute of an element.
     * </pre>
     *
     * <code>SET_ATTRIBUTE = 11;</code>
     */
    SET_ATTRIBUTE(11),
    /**
     * <pre>
     * Send a series of keystroke inputs. This requires an element to have
     * focus to receive them.
     * </pre>
     *
     * <code>SEND_KEYBOARD_INPUT = 12;</code>
     */
    SEND_KEYBOARD_INPUT(12),
    /**
     * <pre>
     * Get the outer HTML of an element.
     * </pre>
     *
     * <code>GET_OUTER_HTML = 13;</code>
     */
    GET_OUTER_HTML(13),
    /**
     * <pre>
     * Get the tag of an element.
     * </pre>
     *
     * <code>GET_ELEMENT_TAG = 14;</code>
     */
    GET_ELEMENT_TAG(14),
    /**
     * <pre>
     * Set active focus on a field.
     * </pre>
     *
     * <code>FOCUS_FIELD = 15;</code>
     */
    FOCUS_FIELD(15),
    /**
     * <pre>
     * Wait for an element position to stabilize before clicking or a tapping.
     * Fails with ELEMENT_UNSTABLE.
     * </pre>
     *
     * <code>WAIT_UNTIL_ELEMENT_IS_STABLE = 16;</code>
     */
    WAIT_UNTIL_ELEMENT_IS_STABLE(16),
    /**
     * <pre>
     * Check that the element is on top, usually as part of clicking.
     * Fails with ELEMENT_NOT_ON_TOP.
     * </pre>
     *
     * <code>ON_TOP = 17;</code>
     */
    ON_TOP(17),
    /**
     * <pre>
     * Waiting for a certain document ready state failed.
     * </pre>
     *
     * <code>WAIT_FOR_DOCUMENT_READY_STATE = 18;</code>
     */
    WAIT_FOR_DOCUMENT_READY_STATE(18),
    /**
     * <pre>
     * Trigger a change event.
     * </pre>
     *
     * <code>SEND_CHANGE_EVENT = 19;</code>
     */
    SEND_CHANGE_EVENT(19),
    ;

    /**
     * <code>UNSPECIFIED_WEB_ACTION = 0;</code>
     */
    public static final int UNSPECIFIED_WEB_ACTION_VALUE = 0;
    /**
     * <pre>
     * Scroll an element into view by centering it on the page. This uses
     * native JS functionality.
     * </pre>
     *
     * <code>SCROLL_INTO_VIEW = 1;</code>
     */
    public static final int SCROLL_INTO_VIEW_VALUE = 1;
    /**
     * <pre>
     * Waiting for the document ready state to be interactive.
     * </pre>
     *
     * <code>WAIT_FOR_DOCUMENT_TO_BECOME_INTERACTIVE = 2;</code>
     */
    public static final int WAIT_FOR_DOCUMENT_TO_BECOME_INTERACTIVE_VALUE = 2;
    /**
     * <pre>
     * Send a click or tap event to an element.
     * </pre>
     *
     * <code>CLICK_OR_TAP_ELEMENT = 3;</code>
     */
    public static final int CLICK_OR_TAP_ELEMENT_VALUE = 3;
    /**
     * <pre>
     * Select an option from an HTML dropdown.
     * </pre>
     *
     * <code>SELECT_OPTION = 4;</code>
     */
    public static final int SELECT_OPTION_VALUE = 4;
    /**
     * <pre>
     * Set the element's style to be highlighted by adding a BoxShadow to the
     * element.
     * </pre>
     *
     * <code>HIGHLIGHT_ELEMENT = 5;</code>
     */
    public static final int HIGHLIGHT_ELEMENT_VALUE = 5;
    /**
     * <pre>
     * Scroll the element into view with padding. This does not use native JS
     * functionality but calculates the scrolling manually.
     * </pre>
     *
     * <code>SCROLL_INTO_VIEW_WITH_PADDING = 6;</code>
     */
    public static final int SCROLL_INTO_VIEW_WITH_PADDING_VALUE = 6;
    /**
     * <pre>
     * Get the |value| attribute of an element.
     * </pre>
     *
     * <code>GET_FIELD_VALUE = 7;</code>
     */
    public static final int GET_FIELD_VALUE_VALUE = 7;
    /**
     * <pre>
     * Get any attribute of an element.
     * </pre>
     *
     * <code>GET_STRING_ATTRIBUTE = 8;</code>
     */
    public static final int GET_STRING_ATTRIBUTE_VALUE = 8;
    /**
     * <pre>
     * Select an element's value. This does only work for text elements.
     * </pre>
     *
     * <code>SELECT_FIELD_VALUE = 9;</code>
     */
    public static final int SELECT_FIELD_VALUE_VALUE = 9;
    /**
     * <pre>
     * Set the |value| attribute of an element.
     * </pre>
     *
     * <code>SET_VALUE_ATTRIBUTE = 10;</code>
     */
    public static final int SET_VALUE_ATTRIBUTE_VALUE = 10;
    /**
     * <pre>
     * Set any attribute of an element.
     * </pre>
     *
     * <code>SET_ATTRIBUTE = 11;</code>
     */
    public static final int SET_ATTRIBUTE_VALUE = 11;
    /**
     * <pre>
     * Send a series of keystroke inputs. This requires an element to have
     * focus to receive them.
     * </pre>
     *
     * <code>SEND_KEYBOARD_INPUT = 12;</code>
     */
    public static final int SEND_KEYBOARD_INPUT_VALUE = 12;
    /**
     * <pre>
     * Get the outer HTML of an element.
     * </pre>
     *
     * <code>GET_OUTER_HTML = 13;</code>
     */
    public static final int GET_OUTER_HTML_VALUE = 13;
    /**
     * <pre>
     * Get the tag of an element.
     * </pre>
     *
     * <code>GET_ELEMENT_TAG = 14;</code>
     */
    public static final int GET_ELEMENT_TAG_VALUE = 14;
    /**
     * <pre>
     * Set active focus on a field.
     * </pre>
     *
     * <code>FOCUS_FIELD = 15;</code>
     */
    public static final int FOCUS_FIELD_VALUE = 15;
    /**
     * <pre>
     * Wait for an element position to stabilize before clicking or a tapping.
     * Fails with ELEMENT_UNSTABLE.
     * </pre>
     *
     * <code>WAIT_UNTIL_ELEMENT_IS_STABLE = 16;</code>
     */
    public static final int WAIT_UNTIL_ELEMENT_IS_STABLE_VALUE = 16;
    /**
     * <pre>
     * Check that the element is on top, usually as part of clicking.
     * Fails with ELEMENT_NOT_ON_TOP.
     * </pre>
     *
     * <code>ON_TOP = 17;</code>
     */
    public static final int ON_TOP_VALUE = 17;
    /**
     * <pre>
     * Waiting for a certain document ready state failed.
     * </pre>
     *
     * <code>WAIT_FOR_DOCUMENT_READY_STATE = 18;</code>
     */
    public static final int WAIT_FOR_DOCUMENT_READY_STATE_VALUE = 18;
    /**
     * <pre>
     * Trigger a change event.
     * </pre>
     *
     * <code>SEND_CHANGE_EVENT = 19;</code>
     */
    public static final int SEND_CHANGE_EVENT_VALUE = 19;


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
    public static WebAction valueOf(int value) {
      return forNumber(value);
    }

    public static WebAction forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED_WEB_ACTION;
        case 1: return SCROLL_INTO_VIEW;
        case 2: return WAIT_FOR_DOCUMENT_TO_BECOME_INTERACTIVE;
        case 3: return CLICK_OR_TAP_ELEMENT;
        case 4: return SELECT_OPTION;
        case 5: return HIGHLIGHT_ELEMENT;
        case 6: return SCROLL_INTO_VIEW_WITH_PADDING;
        case 7: return GET_FIELD_VALUE;
        case 8: return GET_STRING_ATTRIBUTE;
        case 9: return SELECT_FIELD_VALUE;
        case 10: return SET_VALUE_ATTRIBUTE;
        case 11: return SET_ATTRIBUTE;
        case 12: return SEND_KEYBOARD_INPUT;
        case 13: return GET_OUTER_HTML;
        case 14: return GET_ELEMENT_TAG;
        case 15: return FOCUS_FIELD;
        case 16: return WAIT_UNTIL_ELEMENT_IS_STABLE;
        case 17: return ON_TOP;
        case 18: return WAIT_FOR_DOCUMENT_READY_STATE;
        case 19: return SEND_CHANGE_EVENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WebAction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WebAction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WebAction>() {
            @java.lang.Override
            public WebAction findValueByNumber(int number) {
              return WebAction.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return WebActionVerifier.INSTANCE;
    }

    private static final class WebActionVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new WebActionVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return WebAction.forNumber(number) != null;
            }
          };

    private final int value;

    private WebAction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:autofill_assistant.WebControllerErrorInfoProto.WebAction)
  }

  private int bitField0_;
  public static final int FAILED_WEB_ACTION_FIELD_NUMBER = 1;
  private int failedWebAction_;
  /**
   * <pre>
   * The web-action that failed. This is usually a step in an execution chain
   * for an action.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
   * @return Whether the failedWebAction field is set.
   */
  @java.lang.Override
  public boolean hasFailedWebAction() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The web-action that failed. This is usually a step in an execution chain
   * for an action.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
   * @return The failedWebAction.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction getFailedWebAction() {
    org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction result = org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction.forNumber(failedWebAction_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction.UNSPECIFIED_WEB_ACTION : result;
  }
  /**
   * <pre>
   * The web-action that failed. This is usually a step in an execution chain
   * for an action.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
   * @param value The failedWebAction to set.
   */
  private void setFailedWebAction(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction value) {
    failedWebAction_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The web-action that failed. This is usually a step in an execution chain
   * for an action.
   * </pre>
   *
   * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
   */
  private void clearFailedWebAction() {
    bitField0_ = (bitField0_ & ~0x00000001);
    failedWebAction_ = 0;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Message to report errors related to WebController execution.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.WebControllerErrorInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.WebControllerErrorInfoProto)
      org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The web-action that failed. This is usually a step in an execution chain
     * for an action.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
     * @return Whether the failedWebAction field is set.
     */
    @java.lang.Override
    public boolean hasFailedWebAction() {
      return instance.hasFailedWebAction();
    }
    /**
     * <pre>
     * The web-action that failed. This is usually a step in an execution chain
     * for an action.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
     * @return The failedWebAction.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction getFailedWebAction() {
      return instance.getFailedWebAction();
    }
    /**
     * <pre>
     * The web-action that failed. This is usually a step in an execution chain
     * for an action.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
     * @param value The enum numeric value on the wire for failedWebAction to set.
     * @return This builder for chaining.
     */
    public Builder setFailedWebAction(org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction value) {
      copyOnWrite();
      instance.setFailedWebAction(value);
      return this;
    }
    /**
     * <pre>
     * The web-action that failed. This is usually a step in an execution chain
     * for an action.
     * </pre>
     *
     * <code>optional .autofill_assistant.WebControllerErrorInfoProto.WebAction failed_web_action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedWebAction() {
      copyOnWrite();
      instance.clearFailedWebAction();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.WebControllerErrorInfoProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "failedWebAction_",
            org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.WebAction.internalGetVerifier(),
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
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.WebControllerErrorInfoProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto DEFAULT_INSTANCE;
  static {
    WebControllerErrorInfoProto defaultInstance = new WebControllerErrorInfoProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      WebControllerErrorInfoProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.WebControllerErrorInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WebControllerErrorInfoProto> PARSER;

  public static com.google.protobuf.Parser<WebControllerErrorInfoProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
