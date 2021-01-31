// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
package org.chromium.android_webview.devui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.annotation.IntDef;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.metrics.RecordHistogram;

import java.util.HashMap;
import java.util.Map;

/**
 * Dev UI main activity.
 * It shows persistent errors and helps to navigate to WebView developer tools.
 */
public class MainActivity extends FragmentActivity {
    private PersistentErrorView mErrorView;
    private WebViewPackageError mDifferentPackageError;
    private boolean mDifferentPackageErrorVisible;
    private boolean mSwitchFragmentOnResume;
    final Map<Integer, Integer> mFragmentIdMap = new HashMap<>();

    // Keep in sync with DeveloperUiService.java
    public static final String FRAGMENT_ID_INTENT_EXTRA = "fragment-id";
    public static final int FRAGMENT_ID_HOME = 0;
    public static final int FRAGMENT_ID_CRASHES = 1;
    public static final int FRAGMENT_ID_FLAGS = 2;

    // These values are persisted to logs. Entries should not be renumbered and
    // numeric values should never be reused.
    @IntDef({MenuChoice.SWITCH_PROVIDER, MenuChoice.REPORT_BUG, MenuChoice.CHECK_UPDATES,
            MenuChoice.CRASHES_REFRESH, MenuChoice.ABOUT_DEVTOOLS})
    public @interface MenuChoice {
        int SWITCH_PROVIDER = 0;
        int REPORT_BUG = 1;
        int CHECK_UPDATES = 2;
        int CRASHES_REFRESH = 3;
        int ABOUT_DEVTOOLS = 4;
        int COUNT = 5;
    }

    public static void logMenuSelection(@MenuChoice int selectedMenuItem) {
        RecordHistogram.recordEnumeratedHistogram(
                "Android.WebView.DevUi.MenuSelection", selectedMenuItem, MenuChoice.COUNT);
    }

    // These values are persisted to logs. Entries should not be renumbered and
    // numeric values should never be reused.
    @IntDef({FragmentNavigation.HOME_FRAGMENT, FragmentNavigation.CRASHES_LIST_FRAGMENT,
            FragmentNavigation.FLAGS_FRAGMENT})
    private @interface FragmentNavigation {
        int HOME_FRAGMENT = 0;
        int CRASHES_LIST_FRAGMENT = 1;
        int FLAGS_FRAGMENT = 2;
        int COUNT = 3;
    }

    /**
     * Logs a navigation to a fragment. Requires a suffix from histograms.xml ("AnyMethod",
     * "FromIntent", or "NavBar") to determine which histogram to log.
     *
     * @param histogramSuffix one of the suffixes listed in histograms.xml
     * @param selectedFragmentId one of FRAGMENT_ID_HOME, FRAGMENT_ID_CRASHES, or FRAGMENT_ID_FLAGS
     */
    private static void logFragmentNavigation(String histogramSuffix, int selectedFragmentId) {
        // Map FRAGMENT_ID_* to FragmentNavigation value (so FRAGMENT_ID_* values are permitted to
        // change in the future without messing up logs).
        @FragmentNavigation
        int sample;
        switch (selectedFragmentId) {
            default:
                // Fall through.
            case FRAGMENT_ID_HOME:
                sample = FragmentNavigation.HOME_FRAGMENT;
                break;
            case FRAGMENT_ID_CRASHES:
                sample = FragmentNavigation.CRASHES_LIST_FRAGMENT;
                break;
            case FRAGMENT_ID_FLAGS:
                sample = FragmentNavigation.FLAGS_FRAGMENT;
                break;
        }
        RecordHistogram.recordEnumeratedHistogram(
                "Android.WebView.DevUi.FragmentNavigation." + histogramSuffix, sample,
                FragmentNavigation.COUNT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Let onResume handle showing the initial Fragment.
        mSwitchFragmentOnResume = true;

        mErrorView = new PersistentErrorView(this, R.id.main_error_view);
        mDifferentPackageError = new WebViewPackageError(this, mErrorView);

        // Set up bottom navigation bar:
        mFragmentIdMap.put(R.id.navigation_home, FRAGMENT_ID_HOME);
        mFragmentIdMap.put(R.id.navigation_crash_ui, FRAGMENT_ID_CRASHES);
        mFragmentIdMap.put(R.id.navigation_flags_ui, FRAGMENT_ID_FLAGS);
        LinearLayout bottomNavBar = findViewById(R.id.nav_view);
        View.OnClickListener listener = (View view) -> {
            assert mFragmentIdMap.containsKey(view.getId()) : "Unexpected view ID: " + view.getId();
            int fragmentId = mFragmentIdMap.get(view.getId());
            switchFragment(fragmentId);
            logFragmentNavigation("NavBar", fragmentId);
        };
        final int childCount = bottomNavBar.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            View v = bottomNavBar.getChildAt(i);
            v.setOnClickListener(listener);
        }

        FragmentManager fm = getSupportFragmentManager();
        fm.registerFragmentLifecycleCallbacks(
                new FragmentManager.FragmentLifecycleCallbacks() {
                    @Override
                    public void onFragmentResumed(FragmentManager fm, Fragment f) {
                        if (!mDifferentPackageErrorVisible) {
                            if (f instanceof DevUiBaseFragment) {
                                ((DevUiBaseFragment) f).maybeShowErrorView(mErrorView);
                            }
                        }
                    }
                },
                /* recursive */ false);

        // The boolean value doesn't matter, we only care about the total count.
        RecordHistogram.recordBooleanHistogram("Android.WebView.DevUi.AppLaunch", true);
    }

    private void switchFragment(int chosenFragmentId) {
        DevUiBaseFragment fragment = null;
        switch (chosenFragmentId) {
            default:
                chosenFragmentId = FRAGMENT_ID_HOME;
                // Fall through.
            case FRAGMENT_ID_HOME:
                fragment = new HomeFragment();
                break;
            case FRAGMENT_ID_CRASHES:
                fragment = new CrashesListFragment();
                break;
            case FRAGMENT_ID_FLAGS:
                fragment = new FlagsFragment();
                break;
        }
        assert fragment != null;
        logFragmentNavigation("AnyMethod", chosenFragmentId);

        // Switch fragments
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content_fragment, fragment);
        transaction.commit();

        // Update the bottom toolbar
        LinearLayout bottomNavBar = findViewById(R.id.nav_view);
        final int childCount = bottomNavBar.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            View view = bottomNavBar.getChildAt(i);
            assert mFragmentIdMap.containsKey(view.getId()) : "Unexpected view ID: " + view.getId();
            int fragmentId = mFragmentIdMap.get(view.getId());
            assert view instanceof TextView : "Bottom bar must have TextViews as direct children";
            TextView textView = (TextView) view;

            boolean isSelectedFragment = chosenFragmentId == fragmentId;
            ApiCompatibilityUtils.setTextAppearance(textView,
                    isSelectedFragment ? R.style.SelectedNavigationButton
                                       : R.style.UnselectedNavigationButton);
            int color = isSelectedFragment ? getResources().getColor(R.color.navigation_selected)
                                           : getResources().getColor(R.color.navigation_unselected);
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.mutate();
                    drawable.setColorFilter(
                            new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                }
            }
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        // Store the Intent so we can switch Fragments in onResume (which is called next). Only need
        // to switch Fragment if the Intent specifies to do so.
        setIntent(intent);
        mSwitchFragmentOnResume = intent.hasExtra(FRAGMENT_ID_INTENT_EXTRA);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Check package status in onResume() to hide/show the error message if the user
        // changes WebView implementation from system settings and then returns back to the
        // activity.
        mDifferentPackageErrorVisible = mDifferentPackageError.showMessageIfDifferent();

        // Don't change Fragment unless we have a new Intent, since the user might just be coming
        // back to this through the task switcher.
        if (!mSwitchFragmentOnResume) return;

        // Ensure we only switch the first time we see a new Intent.
        mSwitchFragmentOnResume = false;

        // Default to HomeFragment if not specified.
        int fragmentId = FRAGMENT_ID_HOME;
        // FRAGMENT_ID_INTENT_EXTRA is an optional extra to specify which fragment to open. At the
        // moment, it's specified only by DeveloperUiService (so make sure these constants stay in
        // sync).
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            fragmentId = extras.getInt(FRAGMENT_ID_INTENT_EXTRA, fragmentId);
        }
        switchFragment(fragmentId);
        logFragmentNavigation("FromIntent", fragmentId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            // Switching WebView providers is only possible for API >= 24.
            MenuItem item = menu.findItem(R.id.options_menu_switch_provider);
            item.setVisible(false);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.options_menu_switch_provider
                && Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            logMenuSelection(MenuChoice.SWITCH_PROVIDER);
            startActivity(new Intent(Settings.ACTION_WEBVIEW_SETTINGS));
            return true;
        } else if (item.getItemId() == R.id.options_menu_report_bug) {
            logMenuSelection(MenuChoice.REPORT_BUG);
            Uri reportUri = new Uri.Builder()
                                    .scheme("https")
                                    .authority("bugs.chromium.org")
                                    .path("/p/chromium/issues/entry")
                                    .appendQueryParameter("template", "Webview+Bugs")
                                    .appendQueryParameter("labels",
                                            "Via-WebView-DevTools,Pri-3,Type-Bug,OS-Android")
                                    .build();
            startActivity(new Intent(Intent.ACTION_VIEW, reportUri));
            return true;
        } else if (item.getItemId() == R.id.options_menu_check_updates) {
            logMenuSelection(MenuChoice.CHECK_UPDATES);
            try {
                Uri marketUri = new Uri.Builder()
                                        .scheme("market")
                                        .authority("details")
                                        .appendQueryParameter("id", this.getPackageName())
                                        .build();
                startActivity(new Intent(Intent.ACTION_VIEW, marketUri));
            } catch (Exception e) {
                Uri marketUri = new Uri.Builder()
                                        .scheme("https")
                                        .authority("play.google.com")
                                        .path("/store/apps/details")
                                        .appendQueryParameter("id", this.getPackageName())
                                        .build();
                startActivity(new Intent(Intent.ACTION_VIEW, marketUri));
            }
            return true;
        } else if (item.getItemId() == R.id.options_menu_about_devui) {
            logMenuSelection(MenuChoice.ABOUT_DEVTOOLS);
            Uri uri = Uri.parse(
                    "https://chromium.googlesource.com/chromium/src/+/HEAD/android_webview/docs/developer-ui.md");
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
