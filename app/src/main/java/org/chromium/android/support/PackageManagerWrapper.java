// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.android.support;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.InstantAppInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.IntentFilterVerificationInfo;
import android.content.pm.KeySet;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VerifierDeviceIdentity;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.UserHandle;
import android.os.storage.VolumeInfo;

import androidx.annotation.RequiresApi;

import java.util.List;

// TODO(jbudorick): Remove this once a newer version of the multidex support
// library is released.
public class PackageManagerWrapper extends PackageManager {
    private final PackageManager mWrapped;

    public PackageManagerWrapper(PackageManager wrapped) {
        super();
        mWrapped = wrapped;
    }

    @Override
    @Deprecated
    public void addPackageToPreferred(String packageName) {
        mWrapped.addPackageToPreferred(packageName);
    }

    @Override
    public boolean addPermission(PermissionInfo info) {
        return mWrapped.addPermission(info);
    }

    @Override
    public boolean addPermissionAsync(PermissionInfo info) {
        return mWrapped.addPermissionAsync(info);
    }

    @Override
    @Deprecated
    public void addPreferredActivity(
            IntentFilter filter, int match, ComponentName[] set, ComponentName activity) {
        mWrapped.addPreferredActivity(filter, match, set, activity);
    }

    @Override
    public void replacePreferredActivity(IntentFilter filter, int match, ComponentName[] set, ComponentName activity) {

    }

    @Override
    public String[] canonicalToCurrentPackageNames(String[] names) {
        return mWrapped.canonicalToCurrentPackageNames(names);
    }

    @Override
    public int checkPermission(String permName, String pkgName) {
        return mWrapped.checkPermission(permName, pkgName);
    }

    @Override
    public int checkSignatures(String pkg1, String pkg2) {
        return mWrapped.checkSignatures(pkg1, pkg2);
    }

    @Override
    public int checkSignatures(int uid1, int uid2) {
        return mWrapped.checkSignatures(uid1, uid2);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void clearInstantAppCookie() {
        mWrapped.clearInstantAppCookie();
    }

    @Override
    public String[] currentToCanonicalPackageNames(String[] names) {
        return mWrapped.currentToCanonicalPackageNames(names);
    }

    @Override
    public ActivityInfo getActivityInfo(ComponentName component, int flags)
            throws NameNotFoundException {
        return mWrapped.getActivityInfo(component, flags);
    }

    @Override
    public List<PermissionGroupInfo> getAllPermissionGroups(int flags) {
        return mWrapped.getAllPermissionGroups(flags);
    }

    @Override
    public ApplicationInfo getApplicationInfo(String packageName, int flags)
            throws NameNotFoundException {
        return mWrapped.getApplicationInfo(packageName, flags);
    }

    @Override
    public ApplicationInfo getApplicationInfoAsUser(String packageName, int flags, int userId) throws NameNotFoundException {
        return null;
    }

    @Override
    public List<PackageInfo> getInstalledPackages(int flags) {
        return mWrapped.getInstalledPackages(flags);
    }

    @Override
    public Intent getLaunchIntentForPackage(String packageName) {
        return mWrapped.getLaunchIntentForPackage(packageName);
    }

    @Override
    public Intent getLeanbackLaunchIntentForPackage(String packageName) {
        return mWrapped.getLeanbackLaunchIntentForPackage(packageName);
    }

    @Override
    public Intent getCarLaunchIntentForPackage(String packageName) {
        return null;
    }

    @Override
    public int[] getPackageGids(String packageName) throws NameNotFoundException {
        return mWrapped.getPackageGids(packageName);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public int[] getPackageGids(String packageName, int flags) throws NameNotFoundException {
        return mWrapped.getPackageGids(packageName, flags);
    }

    @Override
    public PackageInfo getPackageInfo(String packageName, int flags) throws NameNotFoundException {
        return mWrapped.getPackageInfo(packageName, flags);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public int getPackageUid(String packageName, int flags) throws NameNotFoundException {
        return mWrapped.getPackageUid(packageName, flags);
    }

    @Override
    public int getPackageUidAsUser(String packageName, int userId) throws NameNotFoundException {
        return 0;
    }

    @Override
    public int getPackageUidAsUser(String packageName, int flags, int userId) throws NameNotFoundException {
        return 0;
    }

    @Override
    public List<PackageInfo> getPackagesHoldingPermissions(String[] permissions, int flags) {
        return mWrapped.getPackagesHoldingPermissions(permissions, flags);
    }

    @Override
    public List<PackageInfo> getInstalledPackagesAsUser(int flags, int userId) {
        return null;
    }

    @Override
    public PermissionGroupInfo getPermissionGroupInfo(String name, int flags)
            throws NameNotFoundException {
        return mWrapped.getPermissionGroupInfo(name, flags);
    }

    @Override
    public PermissionInfo getPermissionInfo(String name, int flags) throws NameNotFoundException {
        return mWrapped.getPermissionInfo(name, flags);
    }

    @Override
    public ProviderInfo getProviderInfo(ComponentName component, int flags)
            throws NameNotFoundException {
        return mWrapped.getProviderInfo(component, flags);
    }

    @Override
    public ActivityInfo getReceiverInfo(ComponentName component, int flags)
            throws NameNotFoundException {
        return mWrapped.getReceiverInfo(component, flags);
    }

    @Override
    public ServiceInfo getServiceInfo(ComponentName component, int flags)
            throws NameNotFoundException {
        return mWrapped.getServiceInfo(component, flags);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean isPermissionRevokedByPolicy(String permName, String pkgName) {
        return mWrapped.isPermissionRevokedByPolicy(permName, pkgName);
    }

    @Override
    public String getPermissionControllerPackageName() {
        return null;
    }

    @Override
    public List<PermissionInfo> queryPermissionsByGroup(String group, int flags)
            throws NameNotFoundException {
        return mWrapped.queryPermissionsByGroup(group, flags);
    }

    @Override
    public boolean arePermissionsIndividuallyControlled() {
        return false;
    }

    @Override
    public boolean isWirelessConsentModeEnabled() {
        return false;
    }

    @Override
    public void removePermission(String name) {
        mWrapped.removePermission(name);
    }

    @Override
    public void grantRuntimePermission(String packageName, String permName, UserHandle user) {

    }

    @Override
    public void revokeRuntimePermission(String packageName, String permName, UserHandle user) {

    }

    @Override
    public int getPermissionFlags(String permName, String packageName, UserHandle user) {
        return 0;
    }

    @Override
    public void updatePermissionFlags(String permName, String packageName, int flagMask, int flagValues, UserHandle user) {

    }

    @Override
    public boolean shouldShowRequestPermissionRationale(String permName) {
        return false;
    }

    @Override
    public String[] getPackagesForUid(int uid) {
        return mWrapped.getPackagesForUid(uid);
    }

    @Override
    public String getNameForUid(int uid) {
        return mWrapped.getNameForUid(uid);
    }

    @Override
    public String[] getNamesForUids(int[] uids) {
        return new String[0];
    }

    @Override
    public int getUidForSharedUser(String sharedUserName) throws NameNotFoundException {
        return 0;
    }

    @Override
    public List<ApplicationInfo> getInstalledApplications(int flags) {
        return mWrapped.getInstalledApplications(flags);
    }

    @Override
    public List<ApplicationInfo> getInstalledApplicationsAsUser(int flags, int userId) {
        return null;
    }

    @Override
    public List<InstantAppInfo> getInstantApps() {
        return null;
    }

    @Override
    public Drawable getInstantAppIcon(String packageName) {
        return null;
    }

    @Override
    public String[] getSystemSharedLibraryNames() {
        return mWrapped.getSystemSharedLibraryNames();
    }

    @Override
    public FeatureInfo[] getSystemAvailableFeatures() {
        return mWrapped.getSystemAvailableFeatures();
    }

    @Override
    public boolean hasSystemFeature(String name) {
        return mWrapped.hasSystemFeature(name);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public boolean hasSystemFeature(String name, int version) {
        return mWrapped.hasSystemFeature(name, version);
    }

    @Override
    public ResolveInfo resolveActivity(Intent intent, int flags) {
        return mWrapped.resolveActivity(intent, flags);
    }

    @Override
    public ResolveInfo resolveActivityAsUser(Intent intent, int flags, int userId) {
        return null;
    }

    @Override
    public List<ResolveInfo> queryIntentActivities(Intent intent, int flags) {
        return mWrapped.queryIntentActivities(intent, flags);
    }

    @Override
    public List<ResolveInfo> queryIntentActivitiesAsUser(Intent intent, int flags, int userId) {
        return null;
    }

    @Override
    public List<ResolveInfo> queryIntentActivityOptions(
            ComponentName caller, Intent[] specifics, Intent intent, int flags) {
        return mWrapped.queryIntentActivityOptions(caller, specifics, intent, flags);
    }

    @Override
    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int flags) {
        return mWrapped.queryBroadcastReceivers(intent, flags);
    }

    @Override
    public List<ResolveInfo> queryBroadcastReceiversAsUser(Intent intent, int flags, int userId) {
        return null;
    }

    @Override
    public ResolveInfo resolveService(Intent intent, int flags) {
        return mWrapped.resolveService(intent, flags);
    }

    @Override
    public ResolveInfo resolveServiceAsUser(Intent intent, int flags, int userId) {
        return null;
    }

    @Override
    public List<ResolveInfo> queryIntentServices(Intent intent, int flags) {
        return mWrapped.queryIntentServices(intent, flags);
    }

    @Override
    public List<ResolveInfo> queryIntentServicesAsUser(Intent intent, int flags, int userId) {
        return null;
    }

    @Override
    public List<ResolveInfo> queryIntentContentProvidersAsUser(Intent intent, int flags, int userId) {
        return null;
    }

    @Override
    public List<ResolveInfo> queryIntentContentProviders(Intent intent, int flags) {
        return mWrapped.queryIntentContentProviders(intent, flags);
    }

    @Override
    public ProviderInfo resolveContentProvider(String name, int flags) {
        return mWrapped.resolveContentProvider(name, flags);
    }

    @Override
    public ProviderInfo resolveContentProviderAsUser(String providerName, int flags, int userId) {
        return null;
    }

    @Override
    public List<ProviderInfo> queryContentProviders(String processName, int uid, int flags) {
        return mWrapped.queryContentProviders(processName, uid, flags);
    }

    @Override
    public InstrumentationInfo getInstrumentationInfo(ComponentName className, int flags)
            throws NameNotFoundException {
        return mWrapped.getInstrumentationInfo(className, flags);
    }

    @Override
    public List<InstrumentationInfo> queryInstrumentation(String targetPackage, int flags) {
        return mWrapped.queryInstrumentation(targetPackage, flags);
    }

    @Override
    public Drawable getDrawable(String packageName, int resid, ApplicationInfo appInfo) {
        return mWrapped.getDrawable(packageName, resid, appInfo);
    }

    @Override
    public Drawable getActivityIcon(ComponentName activityName) throws NameNotFoundException {
        return mWrapped.getActivityIcon(activityName);
    }

    @Override
    public Drawable getActivityIcon(Intent intent) throws NameNotFoundException {
        return mWrapped.getActivityIcon(intent);
    }

    @Override
    public Drawable getActivityBanner(ComponentName activityName) throws NameNotFoundException {
        return mWrapped.getActivityBanner(activityName);
    }

    @Override
    public Drawable getActivityBanner(Intent intent) throws NameNotFoundException {
        return mWrapped.getActivityBanner(intent);
    }

    @Override
    public Drawable getDefaultActivityIcon() {
        return mWrapped.getDefaultActivityIcon();
    }

    @Override
    public Drawable getApplicationIcon(ApplicationInfo info) {
        return mWrapped.getApplicationIcon(info);
    }

    @Override
    public Drawable getApplicationIcon(String packageName) throws NameNotFoundException {
        return mWrapped.getApplicationIcon(packageName);
    }

    @Override
    public Drawable getApplicationBanner(ApplicationInfo info) {
        return mWrapped.getApplicationBanner(info);
    }

    @Override
    public Drawable getApplicationBanner(String packageName) throws NameNotFoundException {
        return mWrapped.getApplicationBanner(packageName);
    }

    @Override
    public Drawable getActivityLogo(ComponentName activityName) throws NameNotFoundException {
        return mWrapped.getActivityLogo(activityName);
    }

    @Override
    public Drawable getActivityLogo(Intent intent) throws NameNotFoundException {
        return mWrapped.getActivityLogo(intent);
    }

    @Override
    public Drawable getApplicationLogo(ApplicationInfo info) {
        return mWrapped.getApplicationLogo(info);
    }

    @Override
    public Drawable getApplicationLogo(String packageName) throws NameNotFoundException {
        return mWrapped.getApplicationLogo(packageName);
    }

    @Override
    public Drawable getUserBadgedIcon(Drawable icon, UserHandle user) {
        return mWrapped.getUserBadgedIcon(icon, user);
    }

    @Override
    public Drawable getUserBadgedDrawableForDensity(
            Drawable drawable, UserHandle user, Rect badgeLocation, int badgeDensity) {
        return mWrapped.getUserBadgedDrawableForDensity(
                drawable, user, badgeLocation, badgeDensity);
    }

    @Override
    public Drawable getUserBadgeForDensity(UserHandle user, int density) {
        return null;
    }

    @Override
    public Drawable getUserBadgeForDensityNoBackground(UserHandle user, int density) {
        return null;
    }

    @Override
    public CharSequence getUserBadgedLabel(CharSequence label, UserHandle user) {
        return mWrapped.getUserBadgedLabel(label, user);
    }

    @Override
    public CharSequence getText(String packageName, int resid, ApplicationInfo appInfo) {
        return mWrapped.getText(packageName, resid, appInfo);
    }

    @Override
    public XmlResourceParser getXml(String packageName, int resid, ApplicationInfo appInfo) {
        return mWrapped.getXml(packageName, resid, appInfo);
    }

    @Override
    public CharSequence getApplicationLabel(ApplicationInfo info) {
        return mWrapped.getApplicationLabel(info);
    }

    @Override
    public Resources getResourcesForActivity(ComponentName activityName)
            throws NameNotFoundException {
        return mWrapped.getResourcesForActivity(activityName);
    }

    @Override
    public Resources getResourcesForApplication(ApplicationInfo app) throws NameNotFoundException {
        return mWrapped.getResourcesForApplication(app);
    }

    @Override
    public Resources getResourcesForApplication(String appPackageName)
            throws NameNotFoundException {
        return mWrapped.getResourcesForApplication(appPackageName);
    }

    @Override
    public Resources getResourcesForApplicationAsUser(String packageName, int userId) throws NameNotFoundException {
        return null;
    }

    @Override
    public int installExistingPackage(String packageName) throws NameNotFoundException {
        return 0;
    }

    @Override
    public int installExistingPackage(String packageName, int installReason) throws NameNotFoundException {
        return 0;
    }

    @Override
    public int installExistingPackageAsUser(String packageName, int userId) throws NameNotFoundException {
        return 0;
    }

    @Override
    public void verifyPendingInstall(int id, int verificationCode) {
        mWrapped.verifyPendingInstall(id, verificationCode);
    }

    @Override
    public void extendVerificationTimeout(
            int id, int verificationCodeAtTimeout, long millisecondsToDelay) {
        mWrapped.extendVerificationTimeout(id, verificationCodeAtTimeout, millisecondsToDelay);
    }

    @Override
    public void verifyIntentFilter(int verificationId, int verificationCode, List<String> failedDomains) {

    }

    @Override
    public int getIntentVerificationStatusAsUser(String packageName, int userId) {
        return 0;
    }

    @Override
    public boolean updateIntentVerificationStatusAsUser(String packageName, int status, int userId) {
        return false;
    }

    @Override
    public List<IntentFilterVerificationInfo> getIntentFilterVerifications(String packageName) {
        return null;
    }

    @Override
    public List<IntentFilter> getAllIntentFilters(String packageName) {
        return null;
    }

    @Override
    public String getDefaultBrowserPackageNameAsUser(int userId) {
        return null;
    }

    @Override
    public boolean setDefaultBrowserPackageNameAsUser(String packageName, int userId) {
        return false;
    }

    @Override
    public void setInstallerPackageName(String targetPackage, String installerPackageName) {
        mWrapped.setInstallerPackageName(targetPackage, installerPackageName);
    }

    @Override
    public void setUpdateAvailable(String packageName, boolean updateAvaialble) {

    }

    @Override
    public void deletePackage(String packageName, IPackageDeleteObserver observer, int flags) {

    }

    @Override
    public void deletePackageAsUser(String packageName, IPackageDeleteObserver observer, int flags, int userId) {

    }

    @Override
    public String getInstallerPackageName(String packageName) {
        return mWrapped.getInstallerPackageName(packageName);
    }

    @Override
    public void clearApplicationUserData(String packageName, IPackageDataObserver observer) {

    }

    @Override
    public void deleteApplicationCacheFiles(String packageName, IPackageDataObserver observer) {

    }

    @Override
    public void deleteApplicationCacheFilesAsUser(String packageName, int userId, IPackageDataObserver observer) {

    }

    @Override
    public void freeStorageAndNotify(String volumeUuid, long freeStorageSize, IPackageDataObserver observer) {

    }

    @Override
    public void freeStorage(String volumeUuid, long freeStorageSize, IntentSender pi) {

    }

    @Override
    public void getPackageSizeInfoAsUser(String packageName, int userId, IPackageStatsObserver observer) {

    }

    @Deprecated
    @Override
    public void removePackageFromPreferred(String packageName) {
        mWrapped.removePackageFromPreferred(packageName);
    }

    @Override
    public List<PackageInfo> getPreferredPackages(int flags) {
        return mWrapped.getPreferredPackages(flags);
    }

    @Override
    public void clearPackagePreferredActivities(String packageName) {
        mWrapped.clearPackagePreferredActivities(packageName);
    }

    @Override
    public int getPreferredActivities(
            List<IntentFilter> outFilters, List<ComponentName> outActivities, String packageName) {
        return mWrapped.getPreferredActivities(outFilters, outActivities, packageName);
    }

    @Override
    public ComponentName getHomeActivities(List<ResolveInfo> outActivities) {
        return null;
    }

    @Override
    public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags) {
        mWrapped.setComponentEnabledSetting(componentName, newState, flags);
    }

    @Override
    public int getComponentEnabledSetting(ComponentName componentName) {
        return mWrapped.getComponentEnabledSetting(componentName);
    }

    @Override
    public void setApplicationEnabledSetting(String packageName, int newState, int flags) {
        mWrapped.setApplicationEnabledSetting(packageName, newState, flags);
    }

    @Override
    public int getApplicationEnabledSetting(String packageName) {
        return mWrapped.getApplicationEnabledSetting(packageName);
    }

    @Override
    public void flushPackageRestrictionsAsUser(int userId) {

    }

    @Override
    public boolean setApplicationHiddenSettingAsUser(String packageName, boolean hidden, UserHandle userHandle) {
        return false;
    }

    @Override
    public boolean getApplicationHiddenSettingAsUser(String packageName, UserHandle userHandle) {
        return false;
    }

    @Override
    public boolean isSafeMode() {
        return mWrapped.isSafeMode();
    }

    @Override
    public void addOnPermissionsChangeListener(OnPermissionsChangedListener listener) {

    }

    @Override
    public void removeOnPermissionsChangeListener(OnPermissionsChangedListener listener) {

    }

    @Override
    public KeySet getKeySetByAlias(String packageName, String alias) {
        return null;
    }

    @Override
    public KeySet getSigningKeySet(String packageName) {
        return null;
    }

    @Override
    public boolean isSignedBy(String packageName, KeySet ks) {
        return false;
    }

    @Override
    public boolean isSignedByExactly(String packageName, KeySet ks) {
        return false;
    }

    @Override
    public boolean isPackageSuspendedForUser(String packageName, int userId) {
        return false;
    }

    @Override
    public PackageInstaller getPackageInstaller() {
        return mWrapped.getPackageInstaller();
    }

    @Override
    public void addCrossProfileIntentFilter(IntentFilter filter, int sourceUserId, int targetUserId, int flags) {

    }

    @Override
    public void clearCrossProfileIntentFilters(int sourceUserId) {

    }

    @Override
    public Drawable loadItemIcon(PackageItemInfo itemInfo, ApplicationInfo appInfo) {
        return null;
    }

    @Override
    public Drawable loadUnbadgedItemIcon(PackageItemInfo itemInfo, ApplicationInfo appInfo) {
        return null;
    }

    @Override
    public boolean isPackageAvailable(String packageName) {
        return false;
    }

    @Override
    public int getInstallReason(String packageName, UserHandle user) {
        return 0;
    }

    // O Developer Preview

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean canRequestPackageInstalls() {
        return mWrapped.canRequestPackageInstalls();
    }

    @Override
    public ComponentName getInstantAppResolverSettingsComponent() {
        return null;
    }

    @Override
    public ComponentName getInstantAppInstallerComponent() {
        return null;
    }

    @Override
    public String getInstantAppAndroidId(String packageName, UserHandle user) {
        return null;
    }

    @Override
    public void registerDexModule(String dexModulePath, DexModuleRegisterCallback callback) {

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public ChangedPackages getChangedPackages(int sequenceNumber) {
        return mWrapped.getChangedPackages(sequenceNumber);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public byte[] getInstantAppCookie() {
        return mWrapped.getInstantAppCookie();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int getInstantAppCookieMaxBytes() {
        return mWrapped.getInstantAppCookieMaxBytes();
    }

    @Override
    public int getInstantAppCookieMaxSize() {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public PackageInfo getPackageInfo(VersionedPackage versionedPackage, int flags)
            throws PackageManager.NameNotFoundException {
        return mWrapped.getPackageInfo(versionedPackage, flags);
    }

    @Override
    public PackageInfo getPackageInfoAsUser(String packageName, int flags, int userId) throws NameNotFoundException {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public List<SharedLibraryInfo> getSharedLibraries(int flags) {
        return mWrapped.getSharedLibraries(flags);
    }

    @Override
    public List<SharedLibraryInfo> getSharedLibrariesAsUser(int flags, int userId) {
        return null;
    }

    @Override
    public String getServicesSystemSharedLibraryPackageName() {
        return null;
    }

    @Override
    public String getSharedSystemSharedLibraryPackageName() {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean isInstantApp() {
        return mWrapped.isInstantApp();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean isInstantApp(String packageName) {
        return mWrapped.isInstantApp(packageName);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void setApplicationCategoryHint(String packageName, int categoryHint) {
        mWrapped.setApplicationCategoryHint(packageName, categoryHint);
    }

    @Override
    public int getMoveStatus(int moveId) {
        return 0;
    }

    @Override
    public void registerMoveCallback(MoveCallback callback, Handler handler) {

    }

    @Override
    public void unregisterMoveCallback(MoveCallback callback) {

    }

    @Override
    public int movePackage(String packageName, VolumeInfo vol) {
        return 0;
    }

    @Override
    public VolumeInfo getPackageCurrentVolume(ApplicationInfo app) {
        return null;
    }

    @Override
    public List<VolumeInfo> getPackageCandidateVolumes(ApplicationInfo app) {
        return null;
    }

    @Override
    public int movePrimaryStorage(VolumeInfo vol) {
        return 0;
    }

    @Override
    public VolumeInfo getPrimaryStorageCurrentVolume() {
        return null;
    }

    @Override
    public List<VolumeInfo> getPrimaryStorageCandidateVolumes() {
        return null;
    }

    @Override
    public VerifierDeviceIdentity getVerifierDeviceIdentity() {
        return null;
    }

    @Override
    public boolean isUpgrade() {
        return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void updateInstantAppCookie(byte[] cookie) {
        mWrapped.updateInstantAppCookie(cookie);
    }

    @Override
    public boolean setInstantAppCookie(byte[] cookie) {
        return false;
    }
}
