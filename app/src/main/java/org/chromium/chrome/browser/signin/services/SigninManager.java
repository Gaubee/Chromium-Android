// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.signin.services;

import android.accounts.Account;

import androidx.annotation.MainThread;
import android.annotation.Nullable;

import org.chromium.base.Callback;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;
import org.chromium.components.signin.metrics.SigninAccessPoint;
import org.chromium.components.signin.metrics.SignoutReason;

/**
 * Android wrapper of the SigninManager which provides access from the Java layer.
 * <p/>
 * This class handles common paths during the sign-in and sign-out flows.
 * <p/>
 * Only usable from the UI thread as the native SigninManager requires its access to be in the
 * UI thread.
 * <p/>
 * See chrome/browser/android/signin/signin_manager_android.h for more details.
 */
public interface SigninManager {
    /**
     * A SignInStateObserver is notified when the user signs in to or out of Chrome.
     */
    interface SignInStateObserver {
        /**
         * Invoked when the user has signed in to Chrome.
         */
        void onSignedIn();

        /**
         * Invoked when the user has signed out of Chrome.
         */
        void onSignedOut();
    }

    /**
     * SignInAllowedObservers will be notified once signing-in becomes allowed or disallowed.
     */
    interface SignInAllowedObserver {
        /**
         * Invoked once all startup checks are done and signing-in becomes allowed, or disallowed.
         */
        void onSignInAllowedChanged();
    }

    /**
     * Callbacks for the sign-in flow.
     */
    interface SignInCallback {
        /**
         * Invoked after sign-in is completed successfully.
         */
        void onSignInComplete();

        /**
         * Invoked if the sign-in processes does not complete for any reason.
         */
        void onSignInAborted();
    }

    /**
     * Callbacks for the sign-out flow.
     */
    interface SignOutCallback {
        /**
         * Called before the data wiping is started.
         */
        default void preWipeData() {}

        /**
         * Called after the data is wiped.
         */
        void signOutComplete();
    }

    /**
     * Extracts the domain name of a given account's email.
     */
    String extractDomainName(String accountEmail);

    /**
     * @return IdentityManager used by SigninManager.
     */
    IdentityManager getIdentityManager();

    /**
     * Notifies the SigninManager that the First Run check has completed.
     *
     * The user will be allowed to sign-in once this is signaled.
     */
    void onFirstRunCheckDone();

    /**
     * Returns true if signin can be started now.
     */
    boolean isSignInAllowed();

    /**
     * Returns true if signin is disabled by policy.
     */
    boolean isSigninDisabledByPolicy();

    /**
     * @return Whether true if the current user is not demo user and the user has a reasonable
     *         Google Play Services installed.
     */
    boolean isSigninSupported();

    /**
     * @return Whether force sign-in is enabled by policy.
     */
    boolean isForceSigninEnabled();

    /**
     * Adds a {@link SignInStateObserver} to be notified when the user signs in or out of Chrome.
     */
    void addSignInStateObserver(SignInStateObserver observer);

    /**
     * Removes a {@link SignInStateObserver} to be notified when the user signs in or out of Chrome.
     */
    void removeSignInStateObserver(SignInStateObserver observer);

    /**
     * Adds a {@link SignInAllowedObserver}.
     */
    void addSignInAllowedObserver(SignInAllowedObserver observer);

    /**
     * Removes a {@link SignInAllowedObserver}.
     */
    void removeSignInAllowedObserver(SignInAllowedObserver observer);

    /**
     * Starts the sign-in flow, and executes the callback when finished.
     *
     * The sign-in flow goes through the following steps:
     *
     *   - Wait for AccountTrackerService to be seeded.
     *   - Complete sign-in with the native IdentityManager.
     *   - Call the callback if provided.
     *
     * @param accountInfo The account to sign in to.
     * @param callback Optional callback for when the sign-in process is finished.
     */
    void signin(CoreAccountInfo accountInfo, @Nullable SignInCallback callback);

    /**
     * Starts the sign-in flow, enables sync and executes the callback when finished.
     *
     * The sign-in flow goes through the following steps:
     *
     *   - Wait for AccountTrackerService to be seeded.
     *   - Wait for policy to be checked for the account.
     *   - If managed, wait for the policy to be fetched.
     *   - Complete sign-in with the native IdentityManager.
     *   - Enable sync.
     *   - Call the callback if provided.
     *
     * @param accessPoint {@link SigninAccessPoint} that initiated the sign-in flow.
     * @param accountInfo The account to sign in to.
     * @param callback Optional callback for when the sign-in process is finished.
     */
    void signinAndEnableSync(@SigninAccessPoint int accessPoint, CoreAccountInfo accountInfo,
            @Nullable SignInCallback callback);

    /**
     * @deprecated use {@link #signinAndEnableSync(int, CoreAccountInfo, SignInCallback)} instead.
     * TODO(crbug.com/1002056): Remove this version after migrating all callers to CoreAccountInfo.
     *
     * Starts the sign-in flow, and executes the callback when finished.
     *
     * The sign-in flow goes through the following steps:
     *
     *   - Wait for AccountTrackerService to be seeded.
     *   - Wait for policy to be checked for the account.
     *   - If managed, wait for the policy to be fetched.
     *   - Complete sign-in with the native IdentityManager.
     *   - Call the callback if provided.
     *
     * @param accessPoint {@link SigninAccessPoint} that initiated the sign-in flow.
     * @param account The account to sign in to.
     * @param callback Optional callback for when the sign-in process is finished.
     */
    @Deprecated
    void signinAndEnableSync(
            @SigninAccessPoint int accessPoint, Account account, @Nullable SignInCallback callback);

    /**
     * Returns true if a sign-in or sign-out operation is in progress. See also
     * {@link SigninManager#runAfterOperationInProgress}.
     */
    @MainThread
    boolean isOperationInProgress();

    /**
     * Schedules the runnable to be invoked after currently ongoing a sign-in or sign-out operation
     * is finished. If there's no operation is progress, posts the callback to the UI thread right
     * away. See also {@link SigninManager#isOperationInProgress}.
     */
    @MainThread
    void runAfterOperationInProgress(Runnable runnable);

    /**
     * Invokes signOut with no callback.
     */
    default void signOut(@SignoutReason int signoutSource) {
        signOut(signoutSource, null, false);
    }

    /**
     * Signs out of Chrome. This method clears the signed-in username, stops sync and sends out a
     * sign-out notification on the native side.
     *
     * @param signoutSource describes the event driving the signout (e.g.
     *         {@link SignoutReason#USER_CLICKED_SIGNOUT_SETTINGS}).
     * @param signOutCallback Callback to notify about the sign-out progress.
     * @param forceWipeUserData Whether user selected to wipe all device data.
     */
    void signOut(@SignoutReason int signoutSource, SignOutCallback signOutCallback,
            boolean forceWipeUserData);

    /**
     * Returns the management domain if the signed in account is managed, otherwise returns null.
     */
    String getManagementDomain();

    /**
     * Reloads accounts from system within IdentityManager.
     * TODO(crbug.com/1152460): Move the caller of this method to SigninManager and remove this
     * method.
     */
    void reloadAllAccountsFromSystem();

    /**
     * Verifies if the account is managed. Callback may be called either
     * synchronously or asynchronously depending on the availability of the
     * result.
     * TODO(crbug.com/1002408) Update API to use CoreAccountInfo instead of email
     *
     * @param email An email of the account.
     * @param callback The callback that will receive true if the account is managed, false
     *                 otherwise.
     */
    void isAccountManaged(String email, Callback<Boolean> callback);
}
