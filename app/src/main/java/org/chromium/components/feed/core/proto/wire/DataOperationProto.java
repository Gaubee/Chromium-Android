// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/data_operation.proto

package org.chromium.components.feed.core.proto.wire;

public final class DataOperationProto {
  private DataOperationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface DataOperationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:feedwire1.DataOperation)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The operation to perform on the data.
     * </pre>
     *
     * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
     * @return Whether the operation field is set.
     */
    boolean hasOperation();
    /**
     * <pre>
     * The operation to perform on the data.
     * </pre>
     *
     * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
     * @return The operation.
     */
    org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation getOperation();

    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     * @return Whether the metadata field is set.
     */
    boolean hasMetadata();
    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     * @return The metadata.
     */
    org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata getMetadata();

    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     * @return Whether the feature field is set.
     */
    boolean hasFeature();
    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     * @return The feature.
     */
    org.chromium.components.feed.core.proto.wire.FeatureProto.Feature getFeature();

    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     * @return Whether the pietSharedState field is set.
     */
    boolean hasPietSharedState();
    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     * @return The pietSharedState.
     */
    org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState getPietSharedState();

    org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.PayloadCase getPayloadCase();
  }
  /**
   * <pre>
   * An extensible operation to change the state of data on the client.
   * </pre>
   *
   * Protobuf type {@code feedwire1.DataOperation}
   */
  public  static final class DataOperation extends
      com.google.protobuf.GeneratedMessageLite<
          DataOperation, DataOperation.Builder> implements
      // @@protoc_insertion_point(message_implements:feedwire1.DataOperation)
      DataOperationOrBuilder {
    private DataOperation() {
    }
    /**
     * Protobuf enum {@code feedwire1.DataOperation.Operation}
     */
    public enum Operation
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_OPERATION = 0;</code>
       */
      UNKNOWN_OPERATION(0),
      /**
       * <pre>
       * Remove all stored content of all types
       * </pre>
       *
       * <code>CLEAR_ALL = 1;</code>
       */
      CLEAR_ALL(1),
      /**
       * <pre>
       * Update content if it exists, else append to the bottom of the feed
       * </pre>
       *
       * <code>UPDATE_OR_APPEND = 2;</code>
       */
      UPDATE_OR_APPEND(2),
      /**
       * <pre>
       * Remove the item from the stream
       * </pre>
       *
       * <code>REMOVE = 3;</code>
       */
      REMOVE(3),
      ;

      /**
       * <code>UNKNOWN_OPERATION = 0;</code>
       */
      public static final int UNKNOWN_OPERATION_VALUE = 0;
      /**
       * <pre>
       * Remove all stored content of all types
       * </pre>
       *
       * <code>CLEAR_ALL = 1;</code>
       */
      public static final int CLEAR_ALL_VALUE = 1;
      /**
       * <pre>
       * Update content if it exists, else append to the bottom of the feed
       * </pre>
       *
       * <code>UPDATE_OR_APPEND = 2;</code>
       */
      public static final int UPDATE_OR_APPEND_VALUE = 2;
      /**
       * <pre>
       * Remove the item from the stream
       * </pre>
       *
       * <code>REMOVE = 3;</code>
       */
      public static final int REMOVE_VALUE = 3;


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
      public static Operation valueOf(int value) {
        return forNumber(value);
      }

      public static Operation forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_OPERATION;
          case 1: return CLEAR_ALL;
          case 2: return UPDATE_OR_APPEND;
          case 3: return REMOVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Operation>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Operation> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
              @java.lang.Override
              public Operation findValueByNumber(int number) {
                return Operation.forNumber(number);
              }
            };

      public static com.google.protobuf.Internal.EnumVerifier 
          internalGetVerifier() {
        return OperationVerifier.INSTANCE;
      }

      private static final class OperationVerifier implements 
           com.google.protobuf.Internal.EnumVerifier { 
              static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new OperationVerifier();
              @java.lang.Override
              public boolean isInRange(int number) {
                return Operation.forNumber(number) != null;
              }
            }

        private final int value;

      Operation(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:feedwire1.DataOperation.Operation)
    }

    private int bitField0_;
    private int payloadCase_ = 0;
    private java.lang.Object payload_;
    public enum PayloadCase {
      FEATURE(3),
      PIET_SHARED_STATE(4),
      PAYLOAD_NOT_SET(0);
      private final int value;
      PayloadCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static PayloadCase valueOf(int value) {
        return forNumber(value);
      }

      public static PayloadCase forNumber(int value) {
        switch (value) {
          case 3: return FEATURE;
          case 4: return PIET_SHARED_STATE;
          case 0: return PAYLOAD_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    }

      @java.lang.Override
    public PayloadCase
    getPayloadCase() {
      return PayloadCase.forNumber(
          payloadCase_);
    }

    private void clearPayload() {
      payloadCase_ = 0;
      payload_ = null;
    }

    public static final int OPERATION_FIELD_NUMBER = 1;
    private int operation_;
    /**
     * <pre>
     * The operation to perform on the data.
     * </pre>
     *
     * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
     * @return Whether the operation field is set.
     */
    @java.lang.Override
    public boolean hasOperation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The operation to perform on the data.
     * </pre>
     *
     * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
     * @return The operation.
     */
    @java.lang.Override
    public org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation getOperation() {
      org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation result = org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation.forNumber(operation_);
      return result == null ? org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation.UNKNOWN_OPERATION : result;
    }
    /**
     * <pre>
     * The operation to perform on the data.
     * </pre>
     *
     * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
     * @param value The operation to set.
     */
    private void setOperation(org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation value) {
      operation_ = value.getNumber();
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The operation to perform on the data.
     * </pre>
     *
     * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
     */
    private void clearOperation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operation_ = 0;
    }

    public static final int METADATA_FIELD_NUMBER = 2;
    private org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata metadata_;
    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     */
    @java.lang.Override
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata getMetadata() {
      return metadata_ == null ? org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata.getDefaultInstance() : metadata_;
    }
    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     */
    private void setMetadata(org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata value) {
      value.getClass();
  metadata_ = value;
      bitField0_ |= 0x00000002;
      }
    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeMetadata(org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata value) {
      value.getClass();
  if (metadata_ != null &&
          metadata_ != org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata.getDefaultInstance()) {
        metadata_ =
          org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
      } else {
        metadata_ = value;
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Data common to all payload types.
     * </pre>
     *
     * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
     */
    private void clearMetadata() {  metadata_ = null;
      bitField0_ = (bitField0_ & ~0x00000002);
    }

    public static final int FEATURE_FIELD_NUMBER = 3;
    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     */
    @java.lang.Override
    public boolean hasFeature() {
      return payloadCase_ == 3;
    }
    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     */
    @java.lang.Override
    public org.chromium.components.feed.core.proto.wire.FeatureProto.Feature getFeature() {
      if (payloadCase_ == 3) {
         return (org.chromium.components.feed.core.proto.wire.FeatureProto.Feature) payload_;
      }
      return org.chromium.components.feed.core.proto.wire.FeatureProto.Feature.getDefaultInstance();
    }
    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     */
    private void setFeature(org.chromium.components.feed.core.proto.wire.FeatureProto.Feature value) {
      value.getClass();
  payload_ = value;
      payloadCase_ = 3;
    }
    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     */
    private void mergeFeature(org.chromium.components.feed.core.proto.wire.FeatureProto.Feature value) {
      value.getClass();
  if (payloadCase_ == 3 &&
          payload_ != org.chromium.components.feed.core.proto.wire.FeatureProto.Feature.getDefaultInstance()) {
        payload_ = org.chromium.components.feed.core.proto.wire.FeatureProto.Feature.newBuilder((org.chromium.components.feed.core.proto.wire.FeatureProto.Feature) payload_)
            .mergeFrom(value).buildPartial();
      } else {
        payload_ = value;
      }
      payloadCase_ = 3;
    }
    /**
     * <pre>
     * A stream UI level feature such as a cluster or card.
     * </pre>
     *
     * <code>.feedwire1.Feature feature = 3;</code>
     */
    private void clearFeature() {
      if (payloadCase_ == 3) {
        payloadCase_ = 0;
        payload_ = null;
      }
    }

    public static final int PIET_SHARED_STATE_FIELD_NUMBER = 4;
    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     */
    @java.lang.Override
    public boolean hasPietSharedState() {
      return payloadCase_ == 4;
    }
    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     */
    @java.lang.Override
    public org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState getPietSharedState() {
      if (payloadCase_ == 4) {
         return (org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState) payload_;
      }
      return org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.getDefaultInstance();
    }
    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     */
    private void setPietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
      value.getClass();
  payload_ = value;
      payloadCase_ = 4;
    }
    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     */
    private void mergePietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
      value.getClass();
  if (payloadCase_ == 4 &&
          payload_ != org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.getDefaultInstance()) {
        payload_ = org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.newBuilder((org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState) payload_)
            .mergeFrom(value).buildPartial();
      } else {
        payload_ = value;
      }
      payloadCase_ = 4;
    }
    /**
     * <pre>
     * Shared state for all Piet cards
     * </pre>
     *
     * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
     */
    private void clearPietSharedState() {
      if (payloadCase_ == 4) {
        payloadCase_ = 0;
        payload_ = null;
      }
    }

    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * An extensible operation to change the state of data on the client.
     * </pre>
     *
     * Protobuf type {@code feedwire1.DataOperation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation, Builder> implements
        // @@protoc_insertion_point(builder_implements:feedwire1.DataOperation)
        org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperationOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }

      @java.lang.Override
      public PayloadCase
          getPayloadCase() {
        return instance.getPayloadCase();
      }

      public Builder clearPayload() {
        copyOnWrite();
        instance.clearPayload();
        return this;
      }


      /**
       * <pre>
       * The operation to perform on the data.
       * </pre>
       *
       * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
       * @return Whether the operation field is set.
       */
      @java.lang.Override
      public boolean hasOperation() {
        return instance.hasOperation();
      }
      /**
       * <pre>
       * The operation to perform on the data.
       * </pre>
       *
       * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
       * @return The operation.
       */
      @java.lang.Override
      public org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation getOperation() {
        return instance.getOperation();
      }
      /**
       * <pre>
       * The operation to perform on the data.
       * </pre>
       *
       * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
       * @param value The enum numeric value on the wire for operation to set.
       * @return This builder for chaining.
       */
      public Builder setOperation(org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation value) {
        copyOnWrite();
        instance.setOperation(value);
        return this;
      }
      /**
       * <pre>
       * The operation to perform on the data.
       * </pre>
       *
       * <code>optional .feedwire1.DataOperation.Operation operation = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOperation() {
        copyOnWrite();
        instance.clearOperation();
        return this;
      }

      /**
       * <pre>
       * Data common to all payload types.
       * </pre>
       *
       * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
       */
      @java.lang.Override
      public boolean hasMetadata() {
        return instance.hasMetadata();
      }
      /**
       * <pre>
       * Data common to all payload types.
       * </pre>
       *
       * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
       */
      @java.lang.Override
      public org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata getMetadata() {
        return instance.getMetadata();
      }
      /**
       * <pre>
       * Data common to all payload types.
       * </pre>
       *
       * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
       */
      public Builder setMetadata(org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata value) {
        copyOnWrite();
        instance.setMetadata(value);
        return this;
        }
      /**
       * <pre>
       * Data common to all payload types.
       * </pre>
       *
       * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
       */
      public Builder setMetadata(
          org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata.Builder builderForValue) {
        copyOnWrite();
        instance.setMetadata(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * Data common to all payload types.
       * </pre>
       *
       * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
       */
      public Builder mergeMetadata(org.chromium.components.feed.core.proto.wire.PayloadMetadataProto.PayloadMetadata value) {
        copyOnWrite();
        instance.mergeMetadata(value);
        return this;
      }
      /**
       * <pre>
       * Data common to all payload types.
       * </pre>
       *
       * <code>optional .feedwire1.PayloadMetadata metadata = 2;</code>
       */
      public Builder clearMetadata() {  copyOnWrite();
        instance.clearMetadata();
        return this;
      }

      /**
       * <pre>
       * A stream UI level feature such as a cluster or card.
       * </pre>
       *
       * <code>.feedwire1.Feature feature = 3;</code>
       */
      @java.lang.Override
      public boolean hasFeature() {
        return instance.hasFeature();
      }
      /**
       * <pre>
       * A stream UI level feature such as a cluster or card.
       * </pre>
       *
       * <code>.feedwire1.Feature feature = 3;</code>
       */
      @java.lang.Override
      public org.chromium.components.feed.core.proto.wire.FeatureProto.Feature getFeature() {
        return instance.getFeature();
      }
      /**
       * <pre>
       * A stream UI level feature such as a cluster or card.
       * </pre>
       *
       * <code>.feedwire1.Feature feature = 3;</code>
       */
      public Builder setFeature(org.chromium.components.feed.core.proto.wire.FeatureProto.Feature value) {
        copyOnWrite();
        instance.setFeature(value);
        return this;
      }
      /**
       * <pre>
       * A stream UI level feature such as a cluster or card.
       * </pre>
       *
       * <code>.feedwire1.Feature feature = 3;</code>
       */
      public Builder setFeature(
          org.chromium.components.feed.core.proto.wire.FeatureProto.Feature.Builder builderForValue) {
        copyOnWrite();
        instance.setFeature(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * A stream UI level feature such as a cluster or card.
       * </pre>
       *
       * <code>.feedwire1.Feature feature = 3;</code>
       */
      public Builder mergeFeature(org.chromium.components.feed.core.proto.wire.FeatureProto.Feature value) {
        copyOnWrite();
        instance.mergeFeature(value);
        return this;
      }
      /**
       * <pre>
       * A stream UI level feature such as a cluster or card.
       * </pre>
       *
       * <code>.feedwire1.Feature feature = 3;</code>
       */
      public Builder clearFeature() {
        copyOnWrite();
        instance.clearFeature();
        return this;
      }

      /**
       * <pre>
       * Shared state for all Piet cards
       * </pre>
       *
       * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
       */
      @java.lang.Override
      public boolean hasPietSharedState() {
        return instance.hasPietSharedState();
      }
      /**
       * <pre>
       * Shared state for all Piet cards
       * </pre>
       *
       * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
       */
      @java.lang.Override
      public org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState getPietSharedState() {
        return instance.getPietSharedState();
      }
      /**
       * <pre>
       * Shared state for all Piet cards
       * </pre>
       *
       * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
       */
      public Builder setPietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
        copyOnWrite();
        instance.setPietSharedState(value);
        return this;
      }
      /**
       * <pre>
       * Shared state for all Piet cards
       * </pre>
       *
       * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
       */
      public Builder setPietSharedState(
          org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.Builder builderForValue) {
        copyOnWrite();
        instance.setPietSharedState(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * Shared state for all Piet cards
       * </pre>
       *
       * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
       */
      public Builder mergePietSharedState(org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState value) {
        copyOnWrite();
        instance.mergePietSharedState(value);
        return this;
      }
      /**
       * <pre>
       * Shared state for all Piet cards
       * </pre>
       *
       * <code>.components.feed.core.proto.ui.piet.PietSharedState piet_shared_state = 4;</code>
       */
      public Builder clearPietSharedState() {
        copyOnWrite();
        instance.clearPietSharedState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:feedwire1.DataOperation)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "payload_",
              "payloadCase_",
              "bitField0_",
              "operation_",
              org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.Operation.internalGetVerifier(),
              "metadata_",
              org.chromium.components.feed.core.proto.wire.FeatureProto.Feature.class,
              org.chromium.components.feed.core.proto.ui.piet.PietProto.PietSharedState.class,
            };
            java.lang.String info =
                "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u100c\u0000\u0002" +
                "\u1009\u0001\u0003\u143c\u0000\u0004\u143c\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return memoizedIsInitialized;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:feedwire1.DataOperation)
    private static final org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation DEFAULT_INSTANCE;
    static {
      DataOperation defaultInstance = new DataOperation();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        DataOperation.class, defaultInstance);
    }

    public static org.chromium.components.feed.core.proto.wire.DataOperationProto.DataOperation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DataOperation> PARSER;

    public static com.google.protobuf.Parser<DataOperation> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
