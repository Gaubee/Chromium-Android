// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.feed.library.sharedstream.contextmenumanager;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.annotation.Nullable;

import org.chromium.chrome.R;

import java.util.List;

/**
 * {@link ContextMenuManager} implementation to show a floating context menu that is positioned
 * without regard to the anchor view.
 */
public class FloatingContextMenuManager implements ContextMenuManager {
    private final Context mContext;
    @Nullable
    private AlertDialog mAlertDialog;

    public FloatingContextMenuManager(Context context) {
        this.mContext = context;
    }

    @Override
    public boolean openContextMenu(
            View anchorView, List<String> items, ContextMenuClickHandler handler) {
        if (menuShowing()) {
            return false;
        }

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(mContext, R.layout.feed_simple_list_item, items);

        ListView listView = createListView(adapter, mContext);
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(mContext);

        dialogBuilder.setView(listView);
        AlertDialog alertDialog = dialogBuilder.create();
        listView.setOnItemClickListener((parent, view, position, id) -> {
            handler.handleClick(position);
            dismissPopup();
        });

        ViewParent parent = anchorView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        alertDialog.show();

        this.mAlertDialog = alertDialog;
        return true;
    }

    private ListView createListView(ArrayAdapter<String> adapter, Context context) {
        ListView listView = new ListView(context);
        listView.setAdapter(adapter);
        listView.setDivider(null);
        listView.setDividerHeight(0);

        return listView;
    }

    @Override
    public void dismissPopup() {
        if (mAlertDialog != null) {
            mAlertDialog.dismiss();
            mAlertDialog = null;
        }
    }

    @Override
    public void setView(View view) {
        // No-op.
    }

    private boolean menuShowing() {
        return mAlertDialog != null && mAlertDialog.isShowing();
    }
}
