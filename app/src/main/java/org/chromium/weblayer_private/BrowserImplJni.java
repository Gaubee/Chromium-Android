package org.chromium.weblayer_private;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowserImplJni implements BrowserImpl.Natives {
  private static BrowserImpl.Natives testInstance;

  public static final JniStaticTestMocker<BrowserImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.BrowserImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.weblayer_private.BrowserImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createBrowser(long profile, BrowserImpl caller) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_createBrowser(profile, caller);
  }

  @Override
  public void deleteBrowser(long browser) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_deleteBrowser(browser);
  }

  @Override
  public void addTab(long nativeBrowserImpl, long nativeTab) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_addTab(nativeBrowserImpl, nativeTab);
  }

  @Override
  public TabImpl[] getTabs(long nativeBrowserImpl) {
    return (TabImpl[])GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_getTabs(nativeBrowserImpl);
  }

  @Override
  public void setActiveTab(long nativeBrowserImpl, long nativeTab) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_setActiveTab(nativeBrowserImpl, nativeTab);
  }

  @Override
  public TabImpl getActiveTab(long nativeBrowserImpl) {
    return (TabImpl)GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_getActiveTab(nativeBrowserImpl);
  }

  @Override
  public void prepareForShutdown(long nativeBrowserImpl) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_prepareForShutdown(nativeBrowserImpl);
  }

  @Override
  public String getPersistenceId(long nativeBrowserImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_getPersistenceId(nativeBrowserImpl);
  }

  @Override
  public void saveBrowserPersisterIfNecessary(long nativeBrowserImpl) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_saveBrowserPersisterIfNecessary(nativeBrowserImpl);
  }

  @Override
  public byte[] getBrowserPersisterCryptoKey(long nativeBrowserImpl) {
    return (byte[])GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_getBrowserPersisterCryptoKey(nativeBrowserImpl);
  }

  @Override
  public byte[] getMinimalPersistenceState(long nativeBrowserImpl) {
    return (byte[])GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_getMinimalPersistenceState(nativeBrowserImpl);
  }

  @Override
  public void restoreStateIfNecessary(long nativeBrowserImpl, String persistenceId,
      byte[] persistenceCryptoKey, byte[] minimalPersistenceState) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_restoreStateIfNecessary(nativeBrowserImpl, persistenceId, persistenceCryptoKey, minimalPersistenceState);
  }

  @Override
  public void webPreferencesChanged(long nativeBrowserImpl) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_webPreferencesChanged(nativeBrowserImpl);
  }

  @Override
  public void onFragmentStart(long nativeBrowserImpl) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_onFragmentStart(nativeBrowserImpl);
  }

  @Override
  public void onFragmentResume(long nativeBrowserImpl) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_onFragmentResume(nativeBrowserImpl);
  }

  @Override
  public void onFragmentPause(long nativeBrowserImpl) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_onFragmentPause(nativeBrowserImpl);
  }

  @Override
  public boolean isRestoringPreviousState(long nativeBrowserImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_BrowserImpl_isRestoringPreviousState(nativeBrowserImpl);
  }

  public static BrowserImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.BrowserImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowserImplJni();
  }
}
