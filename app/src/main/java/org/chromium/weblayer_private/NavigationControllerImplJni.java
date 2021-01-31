package org.chromium.weblayer_private;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.util.WebResourceResponseInfo;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NavigationControllerImplJni implements NavigationControllerImpl.Natives {
  private static NavigationControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<NavigationControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.NavigationControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.NavigationControllerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setNavigationControllerImpl(long nativeNavigationControllerImpl,
      NavigationControllerImpl caller) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_setNavigationControllerImpl(nativeNavigationControllerImpl, caller);
  }

  @Override
  public long getNavigationController(long tab) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_getNavigationController(tab);
  }

  @Override
  public void navigate(long nativeNavigationControllerImpl, String uri,
      boolean shouldReplaceCurrentEntry, boolean disableIntentProcessing,
      boolean disableNetworkErrorAutoReload, boolean enableAutoPlay,
      WebResourceResponseInfo response) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_navigate(nativeNavigationControllerImpl, uri, shouldReplaceCurrentEntry, disableIntentProcessing, disableNetworkErrorAutoReload, enableAutoPlay, response);
  }

  @Override
  public void goBack(long nativeNavigationControllerImpl) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_goBack(nativeNavigationControllerImpl);
  }

  @Override
  public void goForward(long nativeNavigationControllerImpl) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_goForward(nativeNavigationControllerImpl);
  }

  @Override
  public boolean canGoBack(long nativeNavigationControllerImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_canGoBack(nativeNavigationControllerImpl);
  }

  @Override
  public boolean canGoForward(long nativeNavigationControllerImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_canGoForward(nativeNavigationControllerImpl);
  }

  @Override
  public void goToIndex(long nativeNavigationControllerImpl, int index) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_goToIndex(nativeNavigationControllerImpl, index);
  }

  @Override
  public void reload(long nativeNavigationControllerImpl) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_reload(nativeNavigationControllerImpl);
  }

  @Override
  public void stop(long nativeNavigationControllerImpl) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_stop(nativeNavigationControllerImpl);
  }

  @Override
  public int getNavigationListSize(long nativeNavigationControllerImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_getNavigationListSize(nativeNavigationControllerImpl);
  }

  @Override
  public int getNavigationListCurrentIndex(long nativeNavigationControllerImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_getNavigationListCurrentIndex(nativeNavigationControllerImpl);
  }

  @Override
  public String getNavigationEntryDisplayUri(long nativeNavigationControllerImpl, int index) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_getNavigationEntryDisplayUri(nativeNavigationControllerImpl, index);
  }

  @Override
  public String getNavigationEntryTitle(long nativeNavigationControllerImpl, int index) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_getNavigationEntryTitle(nativeNavigationControllerImpl, index);
  }

  @Override
  public boolean isNavigationEntrySkippable(long nativeNavigationControllerImpl, int index) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_isNavigationEntrySkippable(nativeNavigationControllerImpl, index);
  }

  @Override
  public NavigationImpl getNavigationImplFromId(long nativeNavigationControllerImpl, long id) {
    return (NavigationImpl)GEN_JNI.org_chromium_weblayer_1private_NavigationControllerImpl_getNavigationImplFromId(nativeNavigationControllerImpl, id);
  }

  public static NavigationControllerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.NavigationControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationControllerImplJni();
  }
}
