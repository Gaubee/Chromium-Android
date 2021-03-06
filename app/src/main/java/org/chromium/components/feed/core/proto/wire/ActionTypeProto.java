// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/action_type.proto

package org.chromium.components.feed.core.proto.wire;

public final class ActionTypeProto {
  private ActionTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * <pre>
   * The specific action that was performed on an feature described by a ContentId
   * and SemanticProperties.
   * </pre>
   *
   * Protobuf enum {@code feedwire1.ActionType}
   */
  public enum ActionType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNKNOWN_ACTION_TYPE = 0;</code>
     */
    UNKNOWN_ACTION_TYPE(0),
    /**
     * <code>DISMISS = 1;</code>
     */
    DISMISS(1),
    ;

    /**
     * <code>UNKNOWN_ACTION_TYPE = 0;</code>
     */
    public static final int UNKNOWN_ACTION_TYPE_VALUE = 0;
    /**
     * <code>DISMISS = 1;</code>
     */
    public static final int DISMISS_VALUE = 1;


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
    public static ActionType valueOf(int value) {
      return forNumber(value);
    }

    public static ActionType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_ACTION_TYPE;
        case 1: return DISMISS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ActionType>() {
            @java.lang.Override
            public ActionType findValueByNumber(int number) {
              return ActionType.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return ActionTypeVerifier.INSTANCE;
    }

    private static final class ActionTypeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ActionTypeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return ActionType.forNumber(number) != null;
            }
          }

      private final int value;

    ActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:feedwire1.ActionType)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
