// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: action_strategy.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf enum {@code autofill_assistant.KeyboardValueFillStrategy}
 */
public enum KeyboardValueFillStrategy
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UNSPECIFIED_KEYBAORD_STRATEGY = 0;</code>
   */
  UNSPECIFIED_KEYBAORD_STRATEGY(0),
  /**
   * <pre>
   * Send a `node.value = "&lt;value&gt;"` JS command.
   * </pre>
   *
   * <code>SET_VALUE = 1;</code>
   */
  SET_VALUE(1),
  /**
   * <pre>
   * Send a `node.value = ""` JS command to clear the field, then click the
   * field to focus it and send single key strokes.
   * </pre>
   *
   * <code>SIMULATE_KEY_PRESSES = 2;</code>
   */
  SIMULATE_KEY_PRESSES(2),
  /**
   * <pre>
   * Send a `node.select()` JS command to select the current field value, then
   * send single key strokes overwriting the current value.
   * </pre>
   *
   * <code>SIMULATE_KEY_PRESSES_SELECT_VALUE = 3;</code>
   */
  SIMULATE_KEY_PRESSES_SELECT_VALUE(3),
  /**
   * <pre>
   * Send a `node.value = ""` JS command to clear the field, then send a
   * `node.focus()` JS command to focus the field and send single key strokes.
   * </pre>
   *
   * <code>SIMULATE_KEY_PRESSES_FOCUS = 4;</code>
   */
  SIMULATE_KEY_PRESSES_FOCUS(4),
  ;

  /**
   * <code>UNSPECIFIED_KEYBAORD_STRATEGY = 0;</code>
   */
  public static final int UNSPECIFIED_KEYBAORD_STRATEGY_VALUE = 0;
  /**
   * <pre>
   * Send a `node.value = "&lt;value&gt;"` JS command.
   * </pre>
   *
   * <code>SET_VALUE = 1;</code>
   */
  public static final int SET_VALUE_VALUE = 1;
  /**
   * <pre>
   * Send a `node.value = ""` JS command to clear the field, then click the
   * field to focus it and send single key strokes.
   * </pre>
   *
   * <code>SIMULATE_KEY_PRESSES = 2;</code>
   */
  public static final int SIMULATE_KEY_PRESSES_VALUE = 2;
  /**
   * <pre>
   * Send a `node.select()` JS command to select the current field value, then
   * send single key strokes overwriting the current value.
   * </pre>
   *
   * <code>SIMULATE_KEY_PRESSES_SELECT_VALUE = 3;</code>
   */
  public static final int SIMULATE_KEY_PRESSES_SELECT_VALUE_VALUE = 3;
  /**
   * <pre>
   * Send a `node.value = ""` JS command to clear the field, then send a
   * `node.focus()` JS command to focus the field and send single key strokes.
   * </pre>
   *
   * <code>SIMULATE_KEY_PRESSES_FOCUS = 4;</code>
   */
  public static final int SIMULATE_KEY_PRESSES_FOCUS_VALUE = 4;


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
  public static KeyboardValueFillStrategy valueOf(int value) {
    return forNumber(value);
  }

  public static KeyboardValueFillStrategy forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_KEYBAORD_STRATEGY;
      case 1: return SET_VALUE;
      case 2: return SIMULATE_KEY_PRESSES;
      case 3: return SIMULATE_KEY_PRESSES_SELECT_VALUE;
      case 4: return SIMULATE_KEY_PRESSES_FOCUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KeyboardValueFillStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KeyboardValueFillStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KeyboardValueFillStrategy>() {
          @java.lang.Override
          public KeyboardValueFillStrategy findValueByNumber(int number) {
            return KeyboardValueFillStrategy.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return KeyboardValueFillStrategyVerifier.INSTANCE;
  }

  private static final class KeyboardValueFillStrategyVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new KeyboardValueFillStrategyVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return KeyboardValueFillStrategy.forNumber(number) != null;
          }
        };

  private final int value;

  private KeyboardValueFillStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:autofill_assistant.KeyboardValueFillStrategy)
}

