// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.webapps;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * The view portion of the PWA Install bottom sheet.
 */
public class PwaInstallBottomSheetView {
    /** The context to use. */
    private final Context mContext;
    /** The upper part of the bottom sheet. */
    private final View mToolbarView;
    /** The lower part of the bottom sheet. */
    private final View mContentView;

    public PwaInstallBottomSheetView(
            Context context, PwaBottomSheetController.ScreenshotsAdapter adapter) {
        mContext = context;

        mContentView = LayoutInflater.from(context).inflate(
                R.layout.pwa_install_bottom_sheet_content, /* root= */ null);
        mToolbarView = LayoutInflater.from(context).inflate(
                R.layout.pwa_install_bottom_sheet_toolbar, /* root= */ null);

        RecyclerView recyclerView = mContentView.findViewById(R.id.screenshots_container);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {
                super.getItemOffsets(outRect, itemPosition, parent);

                // Add a fixed margin between images.
                RecyclerView.Adapter adapter = parent.getAdapter();
                int margin = mContext.getResources().getDimensionPixelSize(
                        R.dimen.webapk_screenshot_margin);
                outRect.left = margin;
                if (itemPosition == adapter.getItemCount() - 1) {
                    outRect.right = margin;
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }

    public View getContentView() {
        return mContentView;
    }

    public View getToolbarView() {
        return mToolbarView;
    }

    // Called through the {@link AddToHomescreenBottomSheetViewBinder} bindings
    // when the property model updates:

    void setTitle(String title) {
        TextView nameView = mToolbarView.findViewById(R.id.app_name);
        nameView.setText(title);
    }

    void setUrl(String url) {
        TextView originView = mToolbarView.findViewById(R.id.app_origin);
        originView.setText(url);
    }

    void setDescription(String description) {
        TextView descriptionView = mContentView.findViewById(R.id.description);
        descriptionView.setText(description);
        descriptionView.setVisibility(description.isEmpty() ? View.GONE : View.VISIBLE);
    }

    void setCategories(String categories) {
        TextView categoriesView = mContentView.findViewById(R.id.categories);
        categoriesView.setText(
                mContext.getString(R.string.pwa_install_bottom_sheet_categories, categories));

        categoriesView.setVisibility(categories.isEmpty() ? View.GONE : View.VISIBLE);
    }

    void setIcon(Bitmap icon, boolean isAdaptive) {
        ImageView imageView = mToolbarView.findViewById(R.id.app_icon);
        if (isAdaptive && Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setAdaptiveIcon(imageView, icon);
        } else {
            assert !isAdaptive : "Adaptive icons should not be provided pre-Android O.";
            imageView.setImageBitmap(icon);
        }
        imageView.setVisibility(View.VISIBLE);
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void setAdaptiveIcon(ImageView imageView, Bitmap icon) {
        imageView.setImageIcon(Icon.createWithAdaptiveBitmap(icon));
    }

    void setCanSubmit(boolean canSubmit) {
        mToolbarView.findViewById(R.id.button_install).setEnabled(canSubmit);
    }

    void setOnClickListener(View.OnClickListener listener) {
        mToolbarView.findViewById(R.id.button_install).setOnClickListener(listener);
        mToolbarView.findViewById(R.id.drag_handlebar).setOnClickListener(listener);
    }

    // Testing functions:

    public static int getAppNameViewIdForTesting() {
        return R.id.app_name;
    }
    public static int getAppOriginViewIdForTesting() {
        return R.id.app_origin;
    }
    public static int getDescViewIdForTesting() {
        return R.id.description;
    }
    public static int getCategoriesViewIdForTesting() {
        return R.id.categories;
    }
}
