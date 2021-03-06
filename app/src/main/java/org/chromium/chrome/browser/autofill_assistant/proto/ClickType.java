// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action_strategy.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * This type disambiguates the term "clicking" on a node in the DOM by defining
 * what strategy should be used to execute the "click".
 * </pre>
 *
 * Protobuf enum {@code autofill_assistant.ClickType}
 */
public enum ClickType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>NOT_SET = 0;</code>
   */
  NOT_SET(0),
  /**
   * <pre>
   * Send a tap event to the node.
   * </pre>
   *
   * <code>TAP = 1;</code>
   */
  TAP(1),
  /**
   * <pre>
   * Use JavaScript's `node.click()` to click the element.
   * </pre>
   *
   * <code>JAVASCRIPT = 2;</code>
   */
  JAVASCRIPT(2),
  /**
   * <pre>
   * Send a click event to the node.
   * </pre>
   *
   * <code>CLICK = 3;</code>
   */
  CLICK(3),
  ;

  /**
   * <code>NOT_SET = 0;</code>
   */
  public static final int NOT_SET_VALUE = 0;
  /**
   * <pre>
   * Send a tap event to the node.
   * </pre>
   *
   * <code>TAP = 1;</code>
   */
  public static final int TAP_VALUE = 1;
  /**
   * <pre>
   * Use JavaScript's `node.click()` to click the element.
   * </pre>
   *
   * <code>JAVASCRIPT = 2;</code>
   */
  public static final int JAVASCRIPT_VALUE = 2;
  /**
   * <pre>
   * Send a click event to the node.
   * </pre>
   *
   * <code>CLICK = 3;</code>
   */
  public static final int CLICK_VALUE = 3;


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
  public static ClickType valueOf(int value) {
    return forNumber(value);
  }

  public static ClickType forNumber(int value) {
    switch (value) {
      case 0: return NOT_SET;
      case 1: return TAP;
      case 2: return JAVASCRIPT;
      case 3: return CLICK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClickType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClickType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClickType>() {
          @java.lang.Override
          public ClickType findValueByNumber(int number) {
            return ClickType.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return ClickTypeVerifier.INSTANCE;
  }

  private static final class ClickTypeVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ClickTypeVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return ClickType.forNumber(number) != null;
          }
        };

  private final int value;

  private ClickType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:autofill_assistant.ClickType)
}

