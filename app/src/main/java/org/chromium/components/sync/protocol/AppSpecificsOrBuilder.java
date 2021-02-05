// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/app_specifics.proto

package org.chromium.components.sync.protocol;

public interface AppSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.AppSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Extension data.
   * </pre>
   *
   * <code>optional .sync_pb.ExtensionSpecifics extension = 1;</code>
   * @return Whether the extension field is set.
   */
  boolean hasExtension();
  /**
   * <pre>
   * Extension data.
   * </pre>
   *
   * <code>optional .sync_pb.ExtensionSpecifics extension = 1;</code>
   * @return The extension.
   */
  org.chromium.components.sync.protocol.ExtensionSpecifics getExtension();

  /**
   * <pre>
   * Notification settings.
   * </pre>
   *
   * <code>optional .sync_pb.AppNotificationSettings notification_settings = 2;</code>
   * @return Whether the notificationSettings field is set.
   */
  boolean hasNotificationSettings();
  /**
   * <pre>
   * Notification settings.
   * </pre>
   *
   * <code>optional .sync_pb.AppNotificationSettings notification_settings = 2;</code>
   * @return The notificationSettings.
   */
  org.chromium.components.sync.protocol.AppNotificationSettings getNotificationSettings();

  /**
   * <pre>
   * This controls where on a page this application icon will appear.
   * </pre>
   *
   * <code>optional string app_launch_ordinal = 3;</code>
   * @return Whether the appLaunchOrdinal field is set.
   */
  boolean hasAppLaunchOrdinal();
  /**
   * <pre>
   * This controls where on a page this application icon will appear.
   * </pre>
   *
   * <code>optional string app_launch_ordinal = 3;</code>
   * @return The appLaunchOrdinal.
   */
  java.lang.String getAppLaunchOrdinal();
  /**
   * <pre>
   * This controls where on a page this application icon will appear.
   * </pre>
   *
   * <code>optional string app_launch_ordinal = 3;</code>
   * @return The bytes for appLaunchOrdinal.
   */
  com.google.protobuf.ByteString
      getAppLaunchOrdinalBytes();

  /**
   * <pre>
   * This specifics which page the application icon will appear on in the NTP.
   * This values only provide the order within the application pages, not within
   * all of the panels in the NTP.
   * </pre>
   *
   * <code>optional string page_ordinal = 4;</code>
   * @return Whether the pageOrdinal field is set.
   */
  boolean hasPageOrdinal();
  /**
   * <pre>
   * This specifics which page the application icon will appear on in the NTP.
   * This values only provide the order within the application pages, not within
   * all of the panels in the NTP.
   * </pre>
   *
   * <code>optional string page_ordinal = 4;</code>
   * @return The pageOrdinal.
   */
  java.lang.String getPageOrdinal();
  /**
   * <pre>
   * This specifics which page the application icon will appear on in the NTP.
   * This values only provide the order within the application pages, not within
   * all of the panels in the NTP.
   * </pre>
   *
   * <code>optional string page_ordinal = 4;</code>
   * @return The bytes for pageOrdinal.
   */
  com.google.protobuf.ByteString
      getPageOrdinalBytes();

  /**
   * <pre>
   * This describes how the extension should be launched.
   * </pre>
   *
   * <code>optional .sync_pb.AppSpecifics.LaunchType launch_type = 5;</code>
   * @return Whether the launchType field is set.
   */
  boolean hasLaunchType();
  /**
   * <pre>
   * This describes how the extension should be launched.
   * </pre>
   *
   * <code>optional .sync_pb.AppSpecifics.LaunchType launch_type = 5;</code>
   * @return The launchType.
   */
  org.chromium.components.sync.protocol.AppSpecifics.LaunchType getLaunchType();

  /**
   * <pre>
   * This is the url of a bookmark app. If this exists, the app is a bookmark
   * app.
   * </pre>
   *
   * <code>optional string bookmark_app_url = 6;</code>
   * @return Whether the bookmarkAppUrl field is set.
   */
  boolean hasBookmarkAppUrl();
  /**
   * <pre>
   * This is the url of a bookmark app. If this exists, the app is a bookmark
   * app.
   * </pre>
   *
   * <code>optional string bookmark_app_url = 6;</code>
   * @return The bookmarkAppUrl.
   */
  java.lang.String getBookmarkAppUrl();
  /**
   * <pre>
   * This is the url of a bookmark app. If this exists, the app is a bookmark
   * app.
   * </pre>
   *
   * <code>optional string bookmark_app_url = 6;</code>
   * @return The bytes for bookmarkAppUrl.
   */
  com.google.protobuf.ByteString
      getBookmarkAppUrlBytes();

  /**
   * <pre>
   * This is the description of a bookmark app.
   * </pre>
   *
   * <code>optional string bookmark_app_description = 7;</code>
   * @return Whether the bookmarkAppDescription field is set.
   */
  boolean hasBookmarkAppDescription();
  /**
   * <pre>
   * This is the description of a bookmark app.
   * </pre>
   *
   * <code>optional string bookmark_app_description = 7;</code>
   * @return The bookmarkAppDescription.
   */
  java.lang.String getBookmarkAppDescription();
  /**
   * <pre>
   * This is the description of a bookmark app.
   * </pre>
   *
   * <code>optional string bookmark_app_description = 7;</code>
   * @return The bytes for bookmarkAppDescription.
   */
  com.google.protobuf.ByteString
      getBookmarkAppDescriptionBytes();

  /**
   * <pre>
   * This is the color to use when generating bookmark app icons. The string is
   * in #rrggbb or #rgb syntax, e.g. #d8d8d8.
   * </pre>
   *
   * <code>optional string bookmark_app_icon_color = 8;</code>
   * @return Whether the bookmarkAppIconColor field is set.
   */
  boolean hasBookmarkAppIconColor();
  /**
   * <pre>
   * This is the color to use when generating bookmark app icons. The string is
   * in #rrggbb or #rgb syntax, e.g. #d8d8d8.
   * </pre>
   *
   * <code>optional string bookmark_app_icon_color = 8;</code>
   * @return The bookmarkAppIconColor.
   */
  java.lang.String getBookmarkAppIconColor();
  /**
   * <pre>
   * This is the color to use when generating bookmark app icons. The string is
   * in #rrggbb or #rgb syntax, e.g. #d8d8d8.
   * </pre>
   *
   * <code>optional string bookmark_app_icon_color = 8;</code>
   * @return The bytes for bookmarkAppIconColor.
   */
  com.google.protobuf.ByteString
      getBookmarkAppIconColorBytes();

  /**
   * <pre>
   * This is information about linked icons (that is, icons that are downloaded
   * from outside the app's bundle of files.
   * </pre>
   *
   * <code>repeated .sync_pb.LinkedAppIconInfo linked_app_icons = 9;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.LinkedAppIconInfo> 
      getLinkedAppIconsList();
  /**
   * <pre>
   * This is information about linked icons (that is, icons that are downloaded
   * from outside the app's bundle of files.
   * </pre>
   *
   * <code>repeated .sync_pb.LinkedAppIconInfo linked_app_icons = 9;</code>
   */
  org.chromium.components.sync.protocol.LinkedAppIconInfo getLinkedAppIcons(int index);
  /**
   * <pre>
   * This is information about linked icons (that is, icons that are downloaded
   * from outside the app's bundle of files.
   * </pre>
   *
   * <code>repeated .sync_pb.LinkedAppIconInfo linked_app_icons = 9;</code>
   */
  int getLinkedAppIconsCount();

  /**
   * <pre>
   * This is the scope of the bookmark app.
   * </pre>
   *
   * <code>optional string bookmark_app_scope = 10;</code>
   * @return Whether the bookmarkAppScope field is set.
   */
  boolean hasBookmarkAppScope();
  /**
   * <pre>
   * This is the scope of the bookmark app.
   * </pre>
   *
   * <code>optional string bookmark_app_scope = 10;</code>
   * @return The bookmarkAppScope.
   */
  java.lang.String getBookmarkAppScope();
  /**
   * <pre>
   * This is the scope of the bookmark app.
   * </pre>
   *
   * <code>optional string bookmark_app_scope = 10;</code>
   * @return The bytes for bookmarkAppScope.
   */
  com.google.protobuf.ByteString
      getBookmarkAppScopeBytes();

  /**
   * <pre>
   * This is the SkColor used for the browser frame for this bookmark app.
   * </pre>
   *
   * <code>optional uint32 bookmark_app_theme_color = 11;</code>
   * @return Whether the bookmarkAppThemeColor field is set.
   */
  boolean hasBookmarkAppThemeColor();
  /**
   * <pre>
   * This is the SkColor used for the browser frame for this bookmark app.
   * </pre>
   *
   * <code>optional uint32 bookmark_app_theme_color = 11;</code>
   * @return The bookmarkAppThemeColor.
   */
  int getBookmarkAppThemeColor();
}
