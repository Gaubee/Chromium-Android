// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/sync.proto

package org.chromium.components.sync.protocol;

public interface DataTypeProgressMarkerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.DataTypeProgressMarker)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * An integer identifying the data type whose progress is tracked by this
   * marker.  The legitimate values of this field correspond to the protobuf
   * field numbers of all EntitySpecifics fields supported by the server.
   * These values are externally declared in per-datatype .proto files.
   * </pre>
   *
   * <code>optional int32 data_type_id = 1;</code>
   * @return Whether the dataTypeId field is set.
   */
  boolean hasDataTypeId();
  /**
   * <pre>
   * An integer identifying the data type whose progress is tracked by this
   * marker.  The legitimate values of this field correspond to the protobuf
   * field numbers of all EntitySpecifics fields supported by the server.
   * These values are externally declared in per-datatype .proto files.
   * </pre>
   *
   * <code>optional int32 data_type_id = 1;</code>
   * @return The dataTypeId.
   */
  int getDataTypeId();

  /**
   * <pre>
   * An opaque-to-the-client sequence of bytes that the server may interpret
   * as an indicator of the client's knowledge state.  If this is empty or
   * omitted by the client, it indicates that the client is initiating a
   * a first-time sync of this datatype.  Otherwise, clients must supply a
   * value previously returned by the server in an earlier GetUpdatesResponse.
   * These values are not comparable or generable on the client.
   * The opaque semantics of this field are to afford server implementations
   * some flexibility in implementing progress tracking.  For instance,
   * a server implementation built on top of a distributed storage service --
   * or multiple heterogenous such services -- might need to supply a vector
   * of totally ordered monotonic update timestamps, rather than a single
   * monotonically increasing value.  Other optimizations may also be
   * possible if the server is allowed to embed arbitrary information in
   * the progress token.
   * Server implementations should keep the size of these tokens relatively
   * small, on the order of tens of bytes, and they should remain small
   * regardless of the number of items synchronized.  (A possible bad server
   * implementation would be for progress_token to contain a list of all the
   * items ever sent to the client.  Servers shouldn't do this.)
   * </pre>
   *
   * <code>optional bytes token = 2;</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <pre>
   * An opaque-to-the-client sequence of bytes that the server may interpret
   * as an indicator of the client's knowledge state.  If this is empty or
   * omitted by the client, it indicates that the client is initiating a
   * a first-time sync of this datatype.  Otherwise, clients must supply a
   * value previously returned by the server in an earlier GetUpdatesResponse.
   * These values are not comparable or generable on the client.
   * The opaque semantics of this field are to afford server implementations
   * some flexibility in implementing progress tracking.  For instance,
   * a server implementation built on top of a distributed storage service --
   * or multiple heterogenous such services -- might need to supply a vector
   * of totally ordered monotonic update timestamps, rather than a single
   * monotonically increasing value.  Other optimizations may also be
   * possible if the server is allowed to embed arbitrary information in
   * the progress token.
   * Server implementations should keep the size of these tokens relatively
   * small, on the order of tens of bytes, and they should remain small
   * regardless of the number of items synchronized.  (A possible bad server
   * implementation would be for progress_token to contain a list of all the
   * items ever sent to the client.  Servers shouldn't do this.)
   * </pre>
   *
   * <code>optional bytes token = 2;</code>
   * @return The token.
   */
  com.google.protobuf.ByteString getToken();

  /**
   * <pre>
   * Clients that previously downloaded updates synced using the timestamp based
   * progress tracking mechanism, but which wish to switch over to the opaque
   * token mechanism can set this field in a GetUpdatesMessage.  The server
   * will perform a get updates operation as normal from the indicated
   * timestamp, and return only an opaque progress token.
   * </pre>
   *
   * <code>optional int64 timestamp_token_for_migration = 3 [deprecated = true];</code>
   * @return Whether the timestampTokenForMigration field is set.
   */
  @java.lang.Deprecated boolean hasTimestampTokenForMigration();
  /**
   * <pre>
   * Clients that previously downloaded updates synced using the timestamp based
   * progress tracking mechanism, but which wish to switch over to the opaque
   * token mechanism can set this field in a GetUpdatesMessage.  The server
   * will perform a get updates operation as normal from the indicated
   * timestamp, and return only an opaque progress token.
   * </pre>
   *
   * <code>optional int64 timestamp_token_for_migration = 3 [deprecated = true];</code>
   * @return The timestampTokenForMigration.
   */
  @java.lang.Deprecated long getTimestampTokenForMigration();

  /**
   * <pre>
   * An opaque-to-the-client string of bytes, received through a notification,
   * that the server may interpret as a hint about the location of the latest
   * version of the data for this type.
   * Deprecated in M29.  We should use the repeated field version in the
   * PerClientTypeState instead.
   * </pre>
   *
   * <code>optional string notification_hint = 4 [deprecated = true];</code>
   * @return Whether the notificationHint field is set.
   */
  @java.lang.Deprecated boolean hasNotificationHint();
  /**
   * <pre>
   * An opaque-to-the-client string of bytes, received through a notification,
   * that the server may interpret as a hint about the location of the latest
   * version of the data for this type.
   * Deprecated in M29.  We should use the repeated field version in the
   * PerClientTypeState instead.
   * </pre>
   *
   * <code>optional string notification_hint = 4 [deprecated = true];</code>
   * @return The notificationHint.
   */
  @java.lang.Deprecated java.lang.String getNotificationHint();
  /**
   * <pre>
   * An opaque-to-the-client string of bytes, received through a notification,
   * that the server may interpret as a hint about the location of the latest
   * version of the data for this type.
   * Deprecated in M29.  We should use the repeated field version in the
   * PerClientTypeState instead.
   * </pre>
   *
   * <code>optional string notification_hint = 4 [deprecated = true];</code>
   * @return The bytes for notificationHint.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNotificationHintBytes();

  /**
   * <pre>
   * This field will be included only in GetUpdates with origin GU_TRIGGER.
   * </pre>
   *
   * <code>optional .sync_pb.GetUpdateTriggers get_update_triggers = 5;</code>
   * @return Whether the getUpdateTriggers field is set.
   */
  boolean hasGetUpdateTriggers();
  /**
   * <pre>
   * This field will be included only in GetUpdates with origin GU_TRIGGER.
   * </pre>
   *
   * <code>optional .sync_pb.GetUpdateTriggers get_update_triggers = 5;</code>
   * @return The getUpdateTriggers.
   */
  org.chromium.components.sync.protocol.GetUpdateTriggers getGetUpdateTriggers();

  /**
   * <pre>
   * The garbage collection directive for this data type.  The client should
   * purge items locally based on this directive.  Since this directive is
   * designed to be sent from server only, the client should persist it locally
   * as needed and avoid sending it to the server.
   * </pre>
   *
   * <code>optional .sync_pb.GarbageCollectionDirective gc_directive = 6;</code>
   * @return Whether the gcDirective field is set.
   */
  boolean hasGcDirective();
  /**
   * <pre>
   * The garbage collection directive for this data type.  The client should
   * purge items locally based on this directive.  Since this directive is
   * designed to be sent from server only, the client should persist it locally
   * as needed and avoid sending it to the server.
   * </pre>
   *
   * <code>optional .sync_pb.GarbageCollectionDirective gc_directive = 6;</code>
   * @return The gcDirective.
   */
  org.chromium.components.sync.protocol.GarbageCollectionDirective getGcDirective();
}