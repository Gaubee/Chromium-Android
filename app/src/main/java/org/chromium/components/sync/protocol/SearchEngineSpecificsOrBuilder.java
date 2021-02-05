// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/search_engine_specifics.proto

package org.chromium.components.sync.protocol;

public interface SearchEngineSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.SearchEngineSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The description of the search engine.
   * </pre>
   *
   * <code>optional string short_name = 1;</code>
   * @return Whether the shortName field is set.
   */
  boolean hasShortName();
  /**
   * <pre>
   * The description of the search engine.
   * </pre>
   *
   * <code>optional string short_name = 1;</code>
   * @return The shortName.
   */
  java.lang.String getShortName();
  /**
   * <pre>
   * The description of the search engine.
   * </pre>
   *
   * <code>optional string short_name = 1;</code>
   * @return The bytes for shortName.
   */
  com.google.protobuf.ByteString
      getShortNameBytes();

  /**
   * <pre>
   * The search engine keyword for omnibox access.
   * </pre>
   *
   * <code>optional string keyword = 2;</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * The search engine keyword for omnibox access.
   * </pre>
   *
   * <code>optional string keyword = 2;</code>
   * @return The keyword.
   */
  java.lang.String getKeyword();
  /**
   * <pre>
   * The search engine keyword for omnibox access.
   * </pre>
   *
   * <code>optional string keyword = 2;</code>
   * @return The bytes for keyword.
   */
  com.google.protobuf.ByteString
      getKeywordBytes();

  /**
   * <pre>
   * A URL to the favicon to show in the search engines options page.
   * </pre>
   *
   * <code>optional string favicon_url = 3;</code>
   * @return Whether the faviconUrl field is set.
   */
  boolean hasFaviconUrl();
  /**
   * <pre>
   * A URL to the favicon to show in the search engines options page.
   * </pre>
   *
   * <code>optional string favicon_url = 3;</code>
   * @return The faviconUrl.
   */
  java.lang.String getFaviconUrl();
  /**
   * <pre>
   * A URL to the favicon to show in the search engines options page.
   * </pre>
   *
   * <code>optional string favicon_url = 3;</code>
   * @return The bytes for faviconUrl.
   */
  com.google.protobuf.ByteString
      getFaviconUrlBytes();

  /**
   * <pre>
   * The actual parameterized search engine query URL.
   * </pre>
   *
   * <code>optional string url = 4;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * The actual parameterized search engine query URL.
   * </pre>
   *
   * <code>optional string url = 4;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The actual parameterized search engine query URL.
   * </pre>
   *
   * <code>optional string url = 4;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * A flag signifying whether it is safe to automatically modify this search
   * engine entry or not.
   * </pre>
   *
   * <code>optional bool safe_for_autoreplace = 5;</code>
   * @return Whether the safeForAutoreplace field is set.
   */
  boolean hasSafeForAutoreplace();
  /**
   * <pre>
   * A flag signifying whether it is safe to automatically modify this search
   * engine entry or not.
   * </pre>
   *
   * <code>optional bool safe_for_autoreplace = 5;</code>
   * @return The safeForAutoreplace.
   */
  boolean getSafeForAutoreplace();

  /**
   * <pre>
   * The URL to the OSD file this search engine entry came from.
   * </pre>
   *
   * <code>optional string originating_url = 6;</code>
   * @return Whether the originatingUrl field is set.
   */
  boolean hasOriginatingUrl();
  /**
   * <pre>
   * The URL to the OSD file this search engine entry came from.
   * </pre>
   *
   * <code>optional string originating_url = 6;</code>
   * @return The originatingUrl.
   */
  java.lang.String getOriginatingUrl();
  /**
   * <pre>
   * The URL to the OSD file this search engine entry came from.
   * </pre>
   *
   * <code>optional string originating_url = 6;</code>
   * @return The bytes for originatingUrl.
   */
  com.google.protobuf.ByteString
      getOriginatingUrlBytes();

  /**
   * <pre>
   * The date this search engine entry was created. A UTC timestamp with units
   * in microseconds.
   * </pre>
   *
   * <code>optional int64 date_created = 7;</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * The date this search engine entry was created. A UTC timestamp with units
   * in microseconds.
   * </pre>
   *
   * <code>optional int64 date_created = 7;</code>
   * @return The dateCreated.
   */
  long getDateCreated();

  /**
   * <pre>
   * A list of supported input encodings.
   * </pre>
   *
   * <code>optional string input_encodings = 8;</code>
   * @return Whether the inputEncodings field is set.
   */
  boolean hasInputEncodings();
  /**
   * <pre>
   * A list of supported input encodings.
   * </pre>
   *
   * <code>optional string input_encodings = 8;</code>
   * @return The inputEncodings.
   */
  java.lang.String getInputEncodings();
  /**
   * <pre>
   * A list of supported input encodings.
   * </pre>
   *
   * <code>optional string input_encodings = 8;</code>
   * @return The bytes for inputEncodings.
   */
  com.google.protobuf.ByteString
      getInputEncodingsBytes();

  /**
   * <pre>
   * Obsolete field. This used to represent whether or not this entry is shown
   * in the list of default search engines.
   * </pre>
   *
   * <code>optional bool deprecated_show_in_default_list = 9 [deprecated = true];</code>
   * @return Whether the deprecatedShowInDefaultList field is set.
   */
  @java.lang.Deprecated boolean hasDeprecatedShowInDefaultList();
  /**
   * <pre>
   * Obsolete field. This used to represent whether or not this entry is shown
   * in the list of default search engines.
   * </pre>
   *
   * <code>optional bool deprecated_show_in_default_list = 9 [deprecated = true];</code>
   * @return The deprecatedShowInDefaultList.
   */
  @java.lang.Deprecated boolean getDeprecatedShowInDefaultList();

  /**
   * <pre>
   * The parameterized URL that provides suggestions as the user types.
   * </pre>
   *
   * <code>optional string suggestions_url = 10;</code>
   * @return Whether the suggestionsUrl field is set.
   */
  boolean hasSuggestionsUrl();
  /**
   * <pre>
   * The parameterized URL that provides suggestions as the user types.
   * </pre>
   *
   * <code>optional string suggestions_url = 10;</code>
   * @return The suggestionsUrl.
   */
  java.lang.String getSuggestionsUrl();
  /**
   * <pre>
   * The parameterized URL that provides suggestions as the user types.
   * </pre>
   *
   * <code>optional string suggestions_url = 10;</code>
   * @return The bytes for suggestionsUrl.
   */
  com.google.protobuf.ByteString
      getSuggestionsUrlBytes();

  /**
   * <pre>
   * The ID associated with the prepopulate data this search engine comes from.
   * Set to zero if it was not prepopulated.
   * </pre>
   *
   * <code>optional int32 prepopulate_id = 11;</code>
   * @return Whether the prepopulateId field is set.
   */
  boolean hasPrepopulateId();
  /**
   * <pre>
   * The ID associated with the prepopulate data this search engine comes from.
   * Set to zero if it was not prepopulated.
   * </pre>
   *
   * <code>optional int32 prepopulate_id = 11;</code>
   * @return The prepopulateId.
   */
  int getPrepopulateId();

  /**
   * <pre>
   * DEPRECATED: Whether to autogenerate a keyword for the search engine or not.
   * Do not write to this field in the future.  We preserve this for now so we
   * can read the field in order to migrate existing data that sets this bit.
   * </pre>
   *
   * <code>optional bool autogenerate_keyword = 12 [deprecated = true];</code>
   * @return Whether the autogenerateKeyword field is set.
   */
  @java.lang.Deprecated boolean hasAutogenerateKeyword();
  /**
   * <pre>
   * DEPRECATED: Whether to autogenerate a keyword for the search engine or not.
   * Do not write to this field in the future.  We preserve this for now so we
   * can read the field in order to migrate existing data that sets this bit.
   * </pre>
   *
   * <code>optional bool autogenerate_keyword = 12 [deprecated = true];</code>
   * @return The autogenerateKeyword.
   */
  @java.lang.Deprecated boolean getAutogenerateKeyword();

  /**
   * <pre>
   * ID 13 reserved - previously used by |logo_id|, now deprecated.
   * Obsolete field. This used to represent whether or not this search engine
   * entry was created automatically by an administrator via group policy. This
   * notion no longer exists amongst synced search engines as we do not want to
   * sync managed search engines.
   * optional bool deprecated_created_by_policy = 14;
   * </pre>
   *
   * <code>optional string instant_url = 15 [deprecated = true];</code>
   * @return Whether the instantUrl field is set.
   */
  @java.lang.Deprecated boolean hasInstantUrl();
  /**
   * <pre>
   * ID 13 reserved - previously used by |logo_id|, now deprecated.
   * Obsolete field. This used to represent whether or not this search engine
   * entry was created automatically by an administrator via group policy. This
   * notion no longer exists amongst synced search engines as we do not want to
   * sync managed search engines.
   * optional bool deprecated_created_by_policy = 14;
   * </pre>
   *
   * <code>optional string instant_url = 15 [deprecated = true];</code>
   * @return The instantUrl.
   */
  @java.lang.Deprecated java.lang.String getInstantUrl();
  /**
   * <pre>
   * ID 13 reserved - previously used by |logo_id|, now deprecated.
   * Obsolete field. This used to represent whether or not this search engine
   * entry was created automatically by an administrator via group policy. This
   * notion no longer exists amongst synced search engines as we do not want to
   * sync managed search engines.
   * optional bool deprecated_created_by_policy = 14;
   * </pre>
   *
   * <code>optional string instant_url = 15 [deprecated = true];</code>
   * @return The bytes for instantUrl.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getInstantUrlBytes();

  /**
   * <pre>
   * ID 16 reserved - previously used by |id|, now deprecated.
   * The last time this entry was modified by a user. A UTC timestamp with units
   * in microseconds.
   * </pre>
   *
   * <code>optional int64 last_modified = 17;</code>
   * @return Whether the lastModified field is set.
   */
  boolean hasLastModified();
  /**
   * <pre>
   * ID 16 reserved - previously used by |id|, now deprecated.
   * The last time this entry was modified by a user. A UTC timestamp with units
   * in microseconds.
   * </pre>
   *
   * <code>optional int64 last_modified = 17;</code>
   * @return The lastModified.
   */
  long getLastModified();

  /**
   * <pre>
   * The primary identifier of this search engine entry for Sync.
   * </pre>
   *
   * <code>optional string sync_guid = 18;</code>
   * @return Whether the syncGuid field is set.
   */
  boolean hasSyncGuid();
  /**
   * <pre>
   * The primary identifier of this search engine entry for Sync.
   * </pre>
   *
   * <code>optional string sync_guid = 18;</code>
   * @return The syncGuid.
   */
  java.lang.String getSyncGuid();
  /**
   * <pre>
   * The primary identifier of this search engine entry for Sync.
   * </pre>
   *
   * <code>optional string sync_guid = 18;</code>
   * @return The bytes for syncGuid.
   */
  com.google.protobuf.ByteString
      getSyncGuidBytes();

  /**
   * <pre>
   * A list of URL patterns that can be used, in addition to |url|, to extract
   * search terms from a URL.
   * </pre>
   *
   * <code>repeated string alternate_urls = 19;</code>
   * @return A list containing the alternateUrls.
   */
  java.util.List<java.lang.String>
      getAlternateUrlsList();
  /**
   * <pre>
   * A list of URL patterns that can be used, in addition to |url|, to extract
   * search terms from a URL.
   * </pre>
   *
   * <code>repeated string alternate_urls = 19;</code>
   * @return The count of alternateUrls.
   */
  int getAlternateUrlsCount();
  /**
   * <pre>
   * A list of URL patterns that can be used, in addition to |url|, to extract
   * search terms from a URL.
   * </pre>
   *
   * <code>repeated string alternate_urls = 19;</code>
   * @param index The index of the element to return.
   * @return The alternateUrls at the given index.
   */
  java.lang.String getAlternateUrls(int index);
  /**
   * <pre>
   * A list of URL patterns that can be used, in addition to |url|, to extract
   * search terms from a URL.
   * </pre>
   *
   * <code>repeated string alternate_urls = 19;</code>
   * @param index The index of the element to return.
   * @return The alternateUrls at the given index.
   */
  com.google.protobuf.ByteString
      getAlternateUrlsBytes(int index);

  /**
   * <code>optional string search_terms_replacement_key = 20 [deprecated = true];</code>
   * @return Whether the searchTermsReplacementKey field is set.
   */
  @java.lang.Deprecated boolean hasSearchTermsReplacementKey();
  /**
   * <code>optional string search_terms_replacement_key = 20 [deprecated = true];</code>
   * @return The searchTermsReplacementKey.
   */
  @java.lang.Deprecated java.lang.String getSearchTermsReplacementKey();
  /**
   * <code>optional string search_terms_replacement_key = 20 [deprecated = true];</code>
   * @return The bytes for searchTermsReplacementKey.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSearchTermsReplacementKeyBytes();

  /**
   * <pre>
   * The parameterized URL that provides image results according to the image
   * content or image URL provided by user.
   * </pre>
   *
   * <code>optional string image_url = 21;</code>
   * @return Whether the imageUrl field is set.
   */
  boolean hasImageUrl();
  /**
   * <pre>
   * The parameterized URL that provides image results according to the image
   * content or image URL provided by user.
   * </pre>
   *
   * <code>optional string image_url = 21;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * The parameterized URL that provides image results according to the image
   * content or image URL provided by user.
   * </pre>
   *
   * <code>optional string image_url = 21;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * The following post_params are comma-separated lists used to specify the
   * post parameters for the corresponding search URL.
   * </pre>
   *
   * <code>optional string search_url_post_params = 22;</code>
   * @return Whether the searchUrlPostParams field is set.
   */
  boolean hasSearchUrlPostParams();
  /**
   * <pre>
   * The following post_params are comma-separated lists used to specify the
   * post parameters for the corresponding search URL.
   * </pre>
   *
   * <code>optional string search_url_post_params = 22;</code>
   * @return The searchUrlPostParams.
   */
  java.lang.String getSearchUrlPostParams();
  /**
   * <pre>
   * The following post_params are comma-separated lists used to specify the
   * post parameters for the corresponding search URL.
   * </pre>
   *
   * <code>optional string search_url_post_params = 22;</code>
   * @return The bytes for searchUrlPostParams.
   */
  com.google.protobuf.ByteString
      getSearchUrlPostParamsBytes();

  /**
   * <code>optional string suggestions_url_post_params = 23;</code>
   * @return Whether the suggestionsUrlPostParams field is set.
   */
  boolean hasSuggestionsUrlPostParams();
  /**
   * <code>optional string suggestions_url_post_params = 23;</code>
   * @return The suggestionsUrlPostParams.
   */
  java.lang.String getSuggestionsUrlPostParams();
  /**
   * <code>optional string suggestions_url_post_params = 23;</code>
   * @return The bytes for suggestionsUrlPostParams.
   */
  com.google.protobuf.ByteString
      getSuggestionsUrlPostParamsBytes();

  /**
   * <code>optional string instant_url_post_params = 24 [deprecated = true];</code>
   * @return Whether the instantUrlPostParams field is set.
   */
  @java.lang.Deprecated boolean hasInstantUrlPostParams();
  /**
   * <code>optional string instant_url_post_params = 24 [deprecated = true];</code>
   * @return The instantUrlPostParams.
   */
  @java.lang.Deprecated java.lang.String getInstantUrlPostParams();
  /**
   * <code>optional string instant_url_post_params = 24 [deprecated = true];</code>
   * @return The bytes for instantUrlPostParams.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getInstantUrlPostParamsBytes();

  /**
   * <code>optional string image_url_post_params = 25;</code>
   * @return Whether the imageUrlPostParams field is set.
   */
  boolean hasImageUrlPostParams();
  /**
   * <code>optional string image_url_post_params = 25;</code>
   * @return The imageUrlPostParams.
   */
  java.lang.String getImageUrlPostParams();
  /**
   * <code>optional string image_url_post_params = 25;</code>
   * @return The bytes for imageUrlPostParams.
   */
  com.google.protobuf.ByteString
      getImageUrlPostParamsBytes();

  /**
   * <pre>
   * The parameterized URL for a search provider specified new tab page.
   * </pre>
   *
   * <code>optional string new_tab_url = 26;</code>
   * @return Whether the newTabUrl field is set.
   */
  boolean hasNewTabUrl();
  /**
   * <pre>
   * The parameterized URL for a search provider specified new tab page.
   * </pre>
   *
   * <code>optional string new_tab_url = 26;</code>
   * @return The newTabUrl.
   */
  java.lang.String getNewTabUrl();
  /**
   * <pre>
   * The parameterized URL for a search provider specified new tab page.
   * </pre>
   *
   * <code>optional string new_tab_url = 26;</code>
   * @return The bytes for newTabUrl.
   */
  com.google.protobuf.ByteString
      getNewTabUrlBytes();
}
