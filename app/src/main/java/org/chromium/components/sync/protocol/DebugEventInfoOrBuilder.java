// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/client_debug_info.proto

package org.chromium.components.sync.protocol;

public interface DebugEventInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.DebugEventInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Each of the following fields correspond to different kinds of events. as
   * a result, only one is set during any single DebugEventInfo.
   * A singleton event. See enum definition.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
   * @return Whether the singletonEvent field is set.
   */
  boolean hasSingletonEvent();
  /**
   * <pre>
   * Each of the following fields correspond to different kinds of events. as
   * a result, only one is set during any single DebugEventInfo.
   * A singleton event. See enum definition.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
   * @return The singletonEvent.
   */
  org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType getSingletonEvent();

  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   * @return Whether the syncCycleCompletedEventInfo field is set.
   */
  boolean hasSyncCycleCompletedEventInfo();
  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   * @return The syncCycleCompletedEventInfo.
   */
  org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo getSyncCycleCompletedEventInfo();

  /**
   * <pre>
   * A datatype triggered a nudge.
   * </pre>
   *
   * <code>optional int32 nudging_datatype = 3;</code>
   * @return Whether the nudgingDatatype field is set.
   */
  boolean hasNudgingDatatype();
  /**
   * <pre>
   * A datatype triggered a nudge.
   * </pre>
   *
   * <code>optional int32 nudging_datatype = 3;</code>
   * @return The nudgingDatatype.
   */
  int getNudgingDatatype();

  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @return A list containing the datatypesNotifiedFromServer.
   */
  java.util.List<java.lang.Integer> getDatatypesNotifiedFromServerList();
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @return The count of datatypesNotifiedFromServer.
   */
  int getDatatypesNotifiedFromServerCount();
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @param index The index of the element to return.
   * @return The datatypesNotifiedFromServer at the given index.
   */
  int getDatatypesNotifiedFromServer(int index);

  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   * @return Whether the datatypeAssociationStats field is set.
   */
  boolean hasDatatypeAssociationStats();
  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   * @return The datatypeAssociationStats.
   */
  org.chromium.components.sync.protocol.DatatypeAssociationStats getDatatypeAssociationStats();
}
