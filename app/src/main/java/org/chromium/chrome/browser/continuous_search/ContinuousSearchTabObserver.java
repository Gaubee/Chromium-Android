// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.continuous_search;

import org.chromium.chrome.browser.tab.EmptyTabObserver;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/**
 * A tab observer for watching for SRPs to read data from.
 */
public class ContinuousSearchTabObserver extends EmptyTabObserver implements SearchResultListener {
    private final Tab mTab;
    private SearchResultProducer mProducer;

    public ContinuousSearchTabObserver(Tab tab) {
        mTab = tab;
        mTab.addObserver(this);
    }

    @Override
    public void onPageLoadFinished(Tab tab, GURL url) {
        SearchResultUserData searchResultUserData = SearchResultUserData.getForTab(tab);
        searchResultUserData.updateCurrentUrl(url);

        // Cancel any existing requests.
        resetProducer();

        String query = SearchUrlHelper.getQueryIfSrpUrl(url);
        if (query == null) return;

        mProducer = SearchResultProducerFactory.create(tab, this);

        // TODO: Remove this once mProducer is always created.
        if (mProducer == null) return;

        mProducer.fetchResults(url, query);
    }

    @Override
    public void onCloseContents(Tab tab) {
        resetProducer();
        SearchResultUserData.getForTab(tab).invalidateData();
    }

    @Override
    public void onDestroyed(Tab tab) {
        tab.removeObserver(this);
    }

    // SearchResultListener

    @Override
    public void onResult(SearchResultMetadata metadata) {
        assert metadata != null;
        mProducer = null;

        SearchResultUserData.getForTab(mTab).updateData(metadata, mTab.getUrl());
    }

    @Override
    public void onError(int errorCode) {
        // TODO: Handle errors.
        mProducer = null;
    }

    private void resetProducer() {
        if (mProducer != null) {
            mProducer.cancel();
            mProducer = null;
        }
    }
}
