// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.contextualsearch;

import android.text.TextUtils;

import android.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates the response from the server to a Resolve request (as a single immutable object).
 */
public class ResolvedSearchTerm {
    @IntDef({CardTag.CT_NONE, CardTag.CT_OTHER, CardTag.CT_HAS_ENTITY, CardTag.CT_BUSINESS,
            CardTag.CT_PRODUCT, CardTag.CT_CONTACT, CardTag.CT_EMAIL, CardTag.CT_LOCATION,
            CardTag.CT_URL, CardTag.CT_DEFINITION, CardTag.CT_TRANSLATE,
            CardTag.CT_CONTEXTUAL_DEFINITION})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CardTag {
        int CT_NONE = 0;
        int CT_OTHER = 1;
        int CT_HAS_ENTITY = 2;
        int CT_BUSINESS = 3;
        int CT_PRODUCT = 4;
        int CT_CONTACT = 5;
        int CT_EMAIL = 6;
        int CT_LOCATION = 7;
        int CT_URL = 8;
        int CT_DEFINITION = 9;
        int CT_TRANSLATE = 10;
        int CT_CONTEXTUAL_DEFINITION = 11;
        int NUM_ENTRIES = 12;
    }

    private final boolean mIsNetworkUnavailable;
    private final int mResponseCode;
    private final String mSearchTerm;
    private final String mDisplayText;
    private final String mAlternateTerm;
    private final String mMid;
    private final boolean mDoPreventPreload;
    private final int mSelectionStartAdjust;
    private final int mSelectionEndAdjust;
    private final String mContextLanguage;
    private final String mThumbnailUrl;
    private final String mCaption;
    private final String mQuickActionUri;
    @QuickActionCategory
    private final int mQuickActionCategory;
    private final long mLoggedEventId;
    private final String mSearchUrlFull;
    private final String mSearchUrlPreload;
    @CardTag
    private final int mCardTagEnum;

    /**
     * Called in response to the
     * {@link ContextualSearchManager#nativeStartSearchTermResolutionRequest} method.
     * @param isNetworkUnavailable Indicates if the network is unavailable, in which case all other
     *        parameters should be ignored.
     * @param responseCode The HTTP response code. If the code is not OK, the query should be
     *        ignored.
     * @param searchTerm The term to use in our subsequent search.
     * @param displayText The text to display in our UX.
     * @param alternateTerm The alternate term to display on the results page.
     * @param mid the MID for an entity to use to trigger a Knowledge Panel, or an empty string.
     *        A MID is a unique identifier for an entity in the Search Knowledge Graph.
     * @param doPreventPreload Whether we should prevent preloading on this search.
     * @param selectionStartAdjust A positive number of characters that the start of the existing
     *        selection should be expanded by.
     * @param selectionEndAdjust A positive number of characters that the end of the existing
     *        selection should be expanded by.
     * @param contextLanguage The language of the original search term, or an empty string.
     * @param thumbnailUrl The URL of the thumbnail to display in our UX.
     * @param caption The caption to display.
     * @param quickActionUri The URI for the intent associated with the quick action.
     * @param quickActionCategory The {@link QuickActionCategory} for the quick action.
     * @param loggedEventId The EventID logged by the server, which should be recorded and sent back
     *        to the server along with user action results in a subsequent request.
     * @param searchUrlFull The URL for the full search to present in the overlay, or empty.
     * @param searchUrlPreload The URL for the search to preload into the overlay, or empty.
     * @param cardTagEnum A {@link CardTag} enumeration indicating what kind of card was returned,
     *        or {@code 0} if no card was returned.
     */
    private ResolvedSearchTerm(boolean isNetworkUnavailable, int responseCode,
            final String searchTerm, final String displayText, final String alternateTerm,
            final String mid, boolean doPreventPreload, int selectionStartAdjust,
            int selectionEndAdjust, final String contextLanguage, final String thumbnailUrl,
            final String caption, final String quickActionUri,
            @QuickActionCategory final int quickActionCategory, final long loggedEventId,
            final String searchUrlFull, final String searchUrlPreload,
            @CardTag final int cardTagEnum) {
        mIsNetworkUnavailable = isNetworkUnavailable;
        mResponseCode = responseCode;
        mSearchTerm = searchTerm;
        mDisplayText = displayText;
        mAlternateTerm = alternateTerm;
        mMid = mid;
        mDoPreventPreload = doPreventPreload;
        mSelectionStartAdjust = selectionStartAdjust;
        mSelectionEndAdjust = selectionEndAdjust;
        mContextLanguage = contextLanguage;
        mThumbnailUrl = thumbnailUrl;
        mCaption = caption;
        mQuickActionUri = quickActionUri;
        mQuickActionCategory = quickActionCategory;
        mLoggedEventId = loggedEventId;
        mSearchUrlFull = searchUrlFull;
        mSearchUrlPreload = searchUrlPreload;
        mCardTagEnum = cardTagEnum;
    }

    public boolean isNetworkUnavailable() {
        return mIsNetworkUnavailable;
    }

    public int responseCode() {
        return mResponseCode;
    }

    public String searchTerm() {
        return mSearchTerm;
    }

    public String displayText() {
        return mDisplayText;
    }

    public String alternateTerm() {
        return mAlternateTerm;
    }

    public String mid() {
        return mMid;
    }

    public boolean doPreventPreload() {
        return mDoPreventPreload;
    }

    public int selectionStartAdjust() {
        return mSelectionStartAdjust;
    }

    public int selectionEndAdjust() {
        return mSelectionEndAdjust;
    }

    public String contextLanguage() {
        return mContextLanguage;
    }

    public String thumbnailUrl() {
        return mThumbnailUrl;
    }

    public String caption() {
        return mCaption;
    }

    public String quickActionUri() {
        return mQuickActionUri;
    }

    public @QuickActionCategory int quickActionCategory() {
        return mQuickActionCategory;
    }

    public long loggedEventId() {
        return mLoggedEventId;
    }

    public String searchUrlFull() {
        return mSearchUrlFull;
    }

    public String searchUrlPreload() {
        return mSearchUrlPreload;
    }

    public @CardTag int cardTagEnum() {
        return mCardTagEnum;
    }

    public static @CardTag int fromCocaCardTag(int internalCocaCardTag) {
        switch (internalCocaCardTag) {
            case 0:
                return CardTag.CT_NONE;
            case 43:
                return CardTag.CT_HAS_ENTITY;
            case 5:
                return CardTag.CT_BUSINESS;
            case 26:
                return CardTag.CT_PRODUCT;
            case 8:
                return CardTag.CT_CONTACT;
            case 13:
                return CardTag.CT_EMAIL;
            case 21:
                return CardTag.CT_LOCATION;
            case 40:
                return CardTag.CT_URL;
            case 11:
                return CardTag.CT_DEFINITION;
            case 39:
                return CardTag.CT_TRANSLATE;
            case 47:
                return CardTag.CT_CONTEXTUAL_DEFINITION;
            default:
                return CardTag.CT_OTHER;
        }
    }

    @Override
    public String toString() {
        List<String> sections = buildTextSections();
        return TextUtils.join(", ", sections);
    }

    private List<String> buildTextSections() {
        List<String> sections = new ArrayList<String>();
        if (mIsNetworkUnavailable) {
            sections.add("Network unavailable!");
        } else if (mResponseCode != HttpURLConnection.HTTP_OK) {
            sections.add("ResponseCode:" + mResponseCode);
        } else {
            if (mDoPreventPreload) sections.add("Preventing preload!");
            if (!TextUtils.isEmpty(mSearchTerm)) sections.add("Search for '" + mSearchTerm + "'");
            if (!TextUtils.isEmpty(mDisplayText)) {
                sections.add("displayed as '" + mDisplayText + "'");
            }
            if (!TextUtils.isEmpty(mMid)) sections.add("MID:'" + mMid + "'");
            if (mSelectionStartAdjust != 0 || mSelectionEndAdjust != 0) {
                sections.add(
                        "selection adjust:" + mSelectionStartAdjust + "," + mSelectionEndAdjust);
            }
            if (!TextUtils.isEmpty(mContextLanguage) && mContextLanguage.equals("en")) {
                sections.add("mContextLanguage:'" + mContextLanguage + "'");
            }
            if (!TextUtils.isEmpty(mThumbnailUrl)) sections.add("has thumbnail URL");
            if (!TextUtils.isEmpty(mCaption)) sections.add("caption:'" + mCaption + "'");
            if (!TextUtils.isEmpty(mQuickActionUri)) sections.add("has Quick Action URI");
            if (!TextUtils.isEmpty(mQuickActionUri)) {
                sections.add("quick Action Category:" + mQuickActionCategory);
            }
            if (mLoggedEventId != 0L) sections.add("has loggedEventId");
            if (!TextUtils.isEmpty(mSearchUrlFull)) {
                sections.add("search Url full:'" + mSearchUrlFull + "'");
            }
            if (!TextUtils.isEmpty(mSearchUrlPreload)) {
                sections.add("search Url preload:'" + mSearchUrlPreload + "'");
            }
            if (mCardTagEnum != CardTag.CT_NONE) sections.add("Card-Tag:" + mCardTagEnum);
        }
        return sections;
    }

    /** The builder for {@link ResolvedSearchTerm} objects. */
    public static class Builder {
        private boolean mIsNetworkUnavailable;
        private int mResponseCode;
        private String mSearchTerm;
        private String mDisplayText;
        private String mAlternateTerm;
        private String mMid;
        private boolean mDoPreventPreload;
        private int mSelectionStartAdjust;
        private int mSelectionEndAdjust;
        private String mContextLanguage;
        private String mThumbnailUrl;
        private String mCaption;
        private String mQuickActionUri;
        @QuickActionCategory
        private int mQuickActionCategory;
        private long mLoggedEventId;
        private String mSearchUrlFull;
        private String mSearchUrlPreload;
        @CardTag
        private int mCardTagEnum;

        public Builder(ResolvedSearchTerm resolvedSearchTerm) {
            mIsNetworkUnavailable = resolvedSearchTerm.mIsNetworkUnavailable;
            mResponseCode = resolvedSearchTerm.mResponseCode;
            mSearchTerm = resolvedSearchTerm.mSearchTerm;
            mDisplayText = resolvedSearchTerm.mDisplayText;
            mAlternateTerm = resolvedSearchTerm.mAlternateTerm;
            mMid = resolvedSearchTerm.mMid;
            mDoPreventPreload = resolvedSearchTerm.mDoPreventPreload;
            mSelectionStartAdjust = resolvedSearchTerm.mSelectionStartAdjust;
            mSelectionEndAdjust = resolvedSearchTerm.mSelectionEndAdjust;
            mContextLanguage = resolvedSearchTerm.mContextLanguage;
            mThumbnailUrl = resolvedSearchTerm.mThumbnailUrl;
            mCaption = resolvedSearchTerm.mCaption;
            mQuickActionUri = resolvedSearchTerm.mQuickActionUri;
            mQuickActionCategory = resolvedSearchTerm.mQuickActionCategory;
            mLoggedEventId = resolvedSearchTerm.mLoggedEventId;
            mSearchUrlFull = resolvedSearchTerm.mSearchUrlFull;
            mSearchUrlPreload = resolvedSearchTerm.mSearchUrlPreload;
            mCardTagEnum = resolvedSearchTerm.mCardTagEnum;
        }

        /**
         * Builds a response to the
         * {@link ContextualSearchManager#nativeStartSearchTermResolutionRequest} method.
         * @param isNetworkUnavailable Indicates if the network is unavailable, in which case all
         *        other parameters should be ignored.
         * @param responseCode The HTTP response code. If the code is not OK, the query should be
         *        ignored.
         * @param searchTerm The term to use in our subsequent search.
         * @param displayText The text to display in our UX.
         */
        public Builder(boolean isNetworkUnavailable, int responseCode, final String searchTerm,
                final String displayText) {
            this(isNetworkUnavailable, responseCode, searchTerm, displayText, "", false);
        }

        /**
         * Builds a response to the
         * {@link ContextualSearchManager#nativeStartSearchTermResolutionRequest} method.
         * @param isNetworkUnavailable Indicates if the network is unavailable, in which case all
         *        other parameters should be ignored.
         * @param responseCode The HTTP response code. If the code is not OK, the query should be
         *        ignored.
         * @param searchTerm The term to use in our subsequent search.
         * @param displayText The text to display in our UX.
         * @param alternateTerm The alternate term to display on the results page.
         * @param doPreventPreload Whether we should prevent preloading on this search.
         */
        public Builder(boolean isNetworkUnavailable, int responseCode, final String searchTerm,
                final String displayText, final String alternateTerm, boolean doPreventPreload) {
            this(isNetworkUnavailable, responseCode, searchTerm, displayText, alternateTerm, "",
                    doPreventPreload, 0, 0, "", "", "", "", QuickActionCategory.NONE, 0L, "", "",
                    0);
        }

        /**
         * Builds a response to the
         * {@link ContextualSearchManager#nativeStartSearchTermResolutionRequest} method.
         * @param isNetworkUnavailable Indicates if the network is unavailable, in which case all
         *        other parameters should be ignored.
         * @param responseCode The HTTP response code. If the code is not OK, the query should be
         *        ignored.
         * @param searchTerm The term to use in our subsequent search.
         * @param displayText The text to display in our UX.
         * @param alternateTerm The alternate term to display on the results page.
         * @param mid the MID for an entity to use to trigger a Knowledge Panel, or an empty string.
         *        A MID is a unique identifier for an entity in the Search Knowledge Graph.
         * @param doPreventPreload Whether we should prevent preloading on this search.
         * @param selectionStartAdjust A positive number of characters that the start of the
         *        existing selection should be expanded by.
         * @param selectionEndAdjust A positive number of characters that the end of the existing
         *        selection should be expanded by.
         * @param contextLanguage The language of the original search term, or an empty string.
         * @param thumbnailUrl The URL of the thumbnail to display in our UX.
         * @param caption The caption to display.
         * @param quickActionUri The URI for the intent associated with the quick action.
         * @param quickActionCategory The {@link QuickActionCategory} for the quick action.
         * @param loggedEventId The EventID logged by the server, which should be recorded and sent
         *        back to the server along with user action results in a subsequent request.
         * @param searchUrlFull The URL for the full search to present in the overlay, or empty.
         * @param searchUrlPreload The URL for the search to preload into the overlay, or empty.
         * @param cardTag The primary internal Coca card tag for the resolution, or {@code 0} if
         *         none.
         */
        public Builder(boolean isNetworkUnavailable, int responseCode, final String searchTerm,
                final String displayText, final String alternateTerm, final String mid,
                boolean doPreventPreload, int selectionStartAdjust, int selectionEndAdjust,
                final String contextLanguage, final String thumbnailUrl, final String caption,
                final String quickActionUri, @QuickActionCategory final int quickActionCategory,
                final long loggedEventId, final String searchUrlFull, final String searchUrlPreload,
                final int cardTag) {
            mIsNetworkUnavailable = isNetworkUnavailable;
            mResponseCode = responseCode;
            mSearchTerm = searchTerm;
            mDisplayText = displayText;
            mAlternateTerm = alternateTerm;
            mMid = mid;
            mDoPreventPreload = doPreventPreload;
            mSelectionStartAdjust = selectionStartAdjust;
            mSelectionEndAdjust = selectionEndAdjust;
            mContextLanguage = contextLanguage;
            mThumbnailUrl = thumbnailUrl;
            mCaption = caption;
            mQuickActionUri = quickActionUri;
            mQuickActionCategory = quickActionCategory;
            mLoggedEventId = loggedEventId;
            mSearchUrlFull = searchUrlFull;
            mSearchUrlPreload = searchUrlPreload;
            mCardTagEnum = fromCocaCardTag(cardTag);
        }

        /**
         * @param isNetworkUnavailable Indicates if the network is unavailable, in which case all
         *        other parameters should be ignored.
         */
        public Builder setIsNetworkUnavailable(boolean isNetworkUnavailable) {
            mIsNetworkUnavailable = isNetworkUnavailable;
            return this;
        }

        /**
         * @param responseCode The HTTP response code. If the code is not OK, the query should be
         *        ignored.
         */
        public Builder setResponseCode(int responseCode) {
            mResponseCode = responseCode;
            return this;
        }

        /** @param searchTerm The term to use in our subsequent search. */
        public Builder setSearchTerm(String searchTerm) {
            mSearchTerm = searchTerm;
            return this;
        }

        /** @param displayText The text to display in our UX. */
        public Builder setDisplayText(String displayText) {
            mDisplayText = displayText;
            return this;
        }

        /** @param alternateTerm The alternate term to display on the results page. */
        public Builder setAlternateTerm(String alternateTerm) {
            mAlternateTerm = alternateTerm;
            return this;
        }

        /**
         * @param mid the MID for an entity to use to trigger a Knowledge Panel, or an empty string.
         *        A MID is a unique identifier for an entity in the Search Knowledge Graph.
         */
        public Builder setMid(String mid) {
            mMid = mid;
            return this;
        }

        /** @param doPreventPreload Whether we should prevent preloading on this search. */
        public Builder setDoPreventPreload(boolean doPreventPreload) {
            mDoPreventPreload = doPreventPreload;
            return this;
        }

        /**
         * @param selectionStartAdjust A positive number of characters that the start of the
         *         existing selection should be expanded by.
         */
        public Builder setSelectionStartAdjust(int selectionStartAdjust) {
            mSelectionStartAdjust = selectionStartAdjust;
            return this;
        }

        /**
         * @param selectionEndAdjust A positive number of characters that the end of the existing
         *        selection should be expanded by.
         */
        public Builder setSelectionEndAdjust(int selectionEndAdjust) {
            mSelectionEndAdjust = selectionEndAdjust;
            return this;
        }

        /** @param contextLanguage The language of the original search term, or an empty string. */
        public Builder setContextLanguage(String contextLanguage) {
            mContextLanguage = contextLanguage;
            return this;
        }

        /** @param thumbnailUrl The URL of the thumbnail to display in our UX. */
        public Builder setThumbnailUrl(String thumbnailUrl) {
            mThumbnailUrl = thumbnailUrl;
            return this;
        }

        /** @param caption The caption to display. */
        public Builder setCaption(String caption) {
            mCaption = caption;
            return this;
        }

        /** @param quickActionUri The URI for the intent associated with the quick action. */
        public Builder setQuickActionUri(String quickActionUri) {
            mQuickActionUri = quickActionUri;
            return this;
        }

        /** @param quickActionCategory The {@link QuickActionCategory} for the quick action. */
        public Builder setQuickActionCategory(@QuickActionCategory int quickActionCategory) {
            mQuickActionCategory = quickActionCategory;
            return this;
        }

        public Builder setLoggedEventId(long loggedEventId) {
            mLoggedEventId = loggedEventId;
            return this;
        }

        /** @param searchUrlFull The URL for the full search to present in the overlay, or empty. */
        public Builder setSearchUrlFull(String searchUrlFull) {
            mSearchUrlFull = searchUrlFull;
            return this;
        }

        /** @param searchUrlPreload The URL for the search to preload into the overlay, or empty. */
        public Builder setSearchUrlPreload(String searchUrlPreload) {
            mSearchUrlPreload = searchUrlPreload;
            return this;
        }

        /**
         * @param cardTagEnum The primary internal Coca card tag for the resolution, or {@code 0} if
         *         none.
         */
        public Builder setCardTagEnum(@CardTag int cardTagEnum) {
            mCardTagEnum = cardTagEnum;
            return this;
        }

        /**
         * Builds the {@link ResolvedSearchTerm} based on the params passed into the constructor
         * of this builder, plus whatever settings have been established.
         * @return The {@link ResolvedSearchTerm}, which represents all the results sent back by
         *         the server for the Resolve request.
         */
        public ResolvedSearchTerm build() {
            return new ResolvedSearchTerm(mIsNetworkUnavailable, mResponseCode, mSearchTerm,
                    mDisplayText, mAlternateTerm, mMid, mDoPreventPreload, mSelectionStartAdjust,
                    mSelectionEndAdjust, mContextLanguage, mThumbnailUrl, mCaption, mQuickActionUri,
                    mQuickActionCategory, mLoggedEventId, mSearchUrlFull, mSearchUrlPreload,
                    mCardTagEnum);
        }
    }
}