package org.chromium.weblayer_private;

import android.graphics.Bitmap;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileImplJni implements ProfileImpl.Natives {
  private static ProfileImpl.Natives testInstance;

  public static final JniStaticTestMocker<ProfileImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.ProfileImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.weblayer_private.ProfileImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void enumerateAllProfileNames(Callback<String[]> callback) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_enumerateAllProfileNames(callback);
  }

  @Override
  public long createProfile(String name, ProfileImpl caller, boolean isIncognito) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_createProfile(name, caller, isIncognito);
  }

  @Override
  public void deleteProfile(long profile) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_deleteProfile(profile);
  }

  @Override
  public long getBrowserContext(long nativeProfileImpl) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getBrowserContext(nativeProfileImpl);
  }

  @Override
  public int getNumBrowserImpl(long nativeProfileImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getNumBrowserImpl(nativeProfileImpl);
  }

  @Override
  public void destroyAndDeleteDataFromDisk(long nativeProfileImpl, Runnable completionCallback) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_destroyAndDeleteDataFromDisk(nativeProfileImpl, completionCallback);
  }

  @Override
  public void clearBrowsingData(long nativeProfileImpl, int[] dataTypes, long fromMillis,
      long toMillis, Runnable callback) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_clearBrowsingData(nativeProfileImpl, dataTypes, fromMillis, toMillis, callback);
  }

  @Override
  public void setDownloadDirectory(long nativeProfileImpl, String directory) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_setDownloadDirectory(nativeProfileImpl, directory);
  }

  @Override
  public long getCookieManager(long nativeProfileImpl) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getCookieManager(nativeProfileImpl);
  }

  @Override
  public long getPrerenderController(long nativeProfileImpl) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getPrerenderController(nativeProfileImpl);
  }

  @Override
  public void ensureBrowserContextInitialized(long nativeProfileImpl) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_ensureBrowserContextInitialized(nativeProfileImpl);
  }

  @Override
  public void setBooleanSetting(long nativeProfileImpl, int type, boolean value) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_setBooleanSetting(nativeProfileImpl, type, value);
  }

  @Override
  public boolean getBooleanSetting(long nativeProfileImpl, int type) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getBooleanSetting(nativeProfileImpl, type);
  }

  @Override
  public void getBrowserPersistenceIds(long nativeProfileImpl, Callback<String[]> callback) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getBrowserPersistenceIds(nativeProfileImpl, callback);
  }

  @Override
  public void removeBrowserPersistenceStorage(long nativeProfileImpl, String[] ids,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_removeBrowserPersistenceStorage(nativeProfileImpl, ids, callback);
  }

  @Override
  public void prepareForPossibleCrossOriginNavigation(long nativeProfileImpl) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_prepareForPossibleCrossOriginNavigation(nativeProfileImpl);
  }

  @Override
  public void getCachedFaviconForPageUrl(long nativeProfileImpl, String url,
      Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_getCachedFaviconForPageUrl(nativeProfileImpl, url, callback);
  }

  @Override
  public void markAsDeleted(long nativeProfileImpl) {
    GEN_JNI.org_chromium_weblayer_1private_ProfileImpl_markAsDeleted(nativeProfileImpl);
  }

  public static ProfileImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.ProfileImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileImplJni();
  }
}
