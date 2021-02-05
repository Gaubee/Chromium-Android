// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface FaviconDrawableProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.FaviconDrawableProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .autofill_assistant.ClientDimensionProto diameter_size = 1;</code>
   * @return Whether the diameterSize field is set.
   */
  boolean hasDiameterSize();
  /**
   * <code>optional .autofill_assistant.ClientDimensionProto diameter_size = 1;</code>
   * @return The diameterSize.
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ClientDimensionProto getDiameterSize();

  /**
   * <pre>
   * If true, we always use the monogram, even if the favicon is available.
   * </pre>
   *
   * <code>optional bool force_monogram = 2;</code>
   * @return Whether the forceMonogram field is set.
   */
  boolean hasForceMonogram();
  /**
   * <pre>
   * If true, we always use the monogram, even if the favicon is available.
   * </pre>
   *
   * <code>optional bool force_monogram = 2;</code>
   * @return The forceMonogram.
   */
  boolean getForceMonogram();

  /**
   * <pre>
   * If set, this url is used to fetch favicon, otherwise current url is used to
   * fetch favicon.
   * </pre>
   *
   * <code>optional string website_url = 3;</code>
   * @return Whether the websiteUrl field is set.
   */
  boolean hasWebsiteUrl();
  /**
   * <pre>
   * If set, this url is used to fetch favicon, otherwise current url is used to
   * fetch favicon.
   * </pre>
   *
   * <code>optional string website_url = 3;</code>
   * @return The websiteUrl.
   */
  java.lang.String getWebsiteUrl();
  /**
   * <pre>
   * If set, this url is used to fetch favicon, otherwise current url is used to
   * fetch favicon.
   * </pre>
   *
   * <code>optional string website_url = 3;</code>
   * @return The bytes for websiteUrl.
   */
  com.google.protobuf.ByteString
      getWebsiteUrlBytes();
}