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
final class NavigationImplJni implements NavigationImpl.Natives {
  private static NavigationImpl.Natives testInstance;

  public static final JniStaticTestMocker<NavigationImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.NavigationImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.weblayer_private.NavigationImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setJavaNavigation(long nativeNavigationImpl, NavigationImpl caller) {
    GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_setJavaNavigation(nativeNavigationImpl, caller);
  }

  @Override
  public int getState(long nativeNavigationImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_getState(nativeNavigationImpl);
  }

  @Override
  public String getUri(long nativeNavigationImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_getUri(nativeNavigationImpl);
  }

  @Override
  public String[] getRedirectChain(long nativeNavigationImpl) {
    return (String[])GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_getRedirectChain(nativeNavigationImpl);
  }

  @Override
  public int getHttpStatusCode(long nativeNavigationImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_getHttpStatusCode(nativeNavigationImpl);
  }

  @Override
  public boolean isSameDocument(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isSameDocument(nativeNavigationImpl);
  }

  @Override
  public boolean isErrorPage(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isErrorPage(nativeNavigationImpl);
  }

  @Override
  public boolean isDownload(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isDownload(nativeNavigationImpl);
  }

  @Override
  public boolean isKnownProtocol(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isKnownProtocol(nativeNavigationImpl);
  }

  @Override
  public boolean wasStopCalled(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_wasStopCalled(nativeNavigationImpl);
  }

  @Override
  public int getLoadError(long nativeNavigationImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_getLoadError(nativeNavigationImpl);
  }

  @Override
  public boolean setRequestHeader(long nativeNavigationImpl, String name, String value) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_setRequestHeader(nativeNavigationImpl, name, value);
  }

  @Override
  public boolean isValidRequestHeaderName(String name) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isValidRequestHeaderName(name);
  }

  @Override
  public boolean isValidRequestHeaderValue(String value) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isValidRequestHeaderValue(value);
  }

  @Override
  public boolean setUserAgentString(long nativeNavigationImpl, String value) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_setUserAgentString(nativeNavigationImpl, value);
  }

  @Override
  public boolean isPageInitiated(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isPageInitiated(nativeNavigationImpl);
  }

  @Override
  public boolean isReload(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isReload(nativeNavigationImpl);
  }

  @Override
  public boolean isServedFromBackForwardCache(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_isServedFromBackForwardCache(nativeNavigationImpl);
  }

  @Override
  public boolean disableNetworkErrorAutoReload(long nativeNavigationImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_NavigationImpl_disableNetworkErrorAutoReload(nativeNavigationImpl);
  }

  public static NavigationImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.NavigationImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationImplJni();
  }
}
