// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.paintpreview.player;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

import android.annotation.NonNull;

import org.chromium.third_party.android.swiperefresh.SwipeRefreshLayout;

/**
 * A class for handling overscroll to refresh behavior for the Paint Preview player. This is based
 * on the modified version of the Android compat library's SwipeRefreshLayout due to the Player's
 * FrameLayout not behaving like a normal scrolling view.
 */
public class PlayerSwipeRefreshHandler implements OverscrollHandler {
    // The duration of the refresh animation after a refresh signal.
    private static final int STOP_REFRESH_ANIMATION_DELAY_MS = 500;

    // The modified AppCompat version of the refresh effect.
    private final SwipeRefreshLayout mSwipeRefreshLayout;

    // A handler to delegate refreshes event to.
    private final Runnable mRefreshCallback;

    /*
     * Constructs a new instance of the handler.
     *
     * @param context The Context to create tha handler for.
     * @param refreshCallback The handler that refresh events are delegated to.
     */
    public PlayerSwipeRefreshHandler(Context context, @NonNull Runnable refreshCallback) {
        mRefreshCallback = refreshCallback;
        mSwipeRefreshLayout = new SwipeRefreshLayout(context);
        mSwipeRefreshLayout.setLayoutParams(
                new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        // Use the same colors as {@link org.chromium.chrome.browser.SwipeRefreshHandler}.
        mSwipeRefreshLayout.setProgressBackgroundColorSchemeResource(
                org.bnqkl.bfchromiun.R.color.default_bg_color_elev_2);
        mSwipeRefreshLayout.setColorSchemeResources(
                org.bnqkl.bfchromiun.R.color.default_control_color_active);
        mSwipeRefreshLayout.setEnabled(true);

        mSwipeRefreshLayout.setOnRefreshListener(() -> {
            mSwipeRefreshLayout.postDelayed(() -> {
                mSwipeRefreshLayout.setRefreshing(false);
            }, STOP_REFRESH_ANIMATION_DELAY_MS);
            mRefreshCallback.run();
        });
    }

    /*
     * Gets the view that contains the swipe to refresh animations.
     */
    public View getView() {
        return mSwipeRefreshLayout;
    }

    @Override
    public boolean start() {
        return mSwipeRefreshLayout.start();
    }

    @Override
    public void pull(float yDelta) {
        mSwipeRefreshLayout.pull(yDelta);
    }

    @Override
    public void release() {
        mSwipeRefreshLayout.release(true);
    }

    @Override
    public void reset() {
        mSwipeRefreshLayout.reset();
    }
}
