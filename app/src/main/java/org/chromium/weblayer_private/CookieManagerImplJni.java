package org.chromium.weblayer_private;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.weblayer_private.interfaces.ICookieChangedCallbackClient;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CookieManagerImplJni implements CookieManagerImpl.Natives {
  private static CookieManagerImpl.Natives testInstance;

  public static final JniStaticTestMocker<CookieManagerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.CookieManagerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.CookieManagerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean setCookie(long nativeCookieManagerImpl, String url, String value,
      Callback<Boolean> callback) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_CookieManagerImpl_setCookie(nativeCookieManagerImpl, url, value, callback);
  }

  @Override
  public void getCookie(long nativeCookieManagerImpl, String url, Callback<String> callback) {
    GEN_JNI.org_chromium_weblayer_1private_CookieManagerImpl_getCookie(nativeCookieManagerImpl, url, callback);
  }

  @Override
  public int addCookieChangedCallback(long nativeCookieManagerImpl, String url, String name,
      ICookieChangedCallbackClient callback) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_CookieManagerImpl_addCookieChangedCallback(nativeCookieManagerImpl, url, name, callback);
  }

  @Override
  public void removeCookieChangedCallback(long nativeCookieManagerImpl, int id) {
    GEN_JNI.org_chromium_weblayer_1private_CookieManagerImpl_removeCookieChangedCallback(nativeCookieManagerImpl, id);
  }

  public static CookieManagerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.CookieManagerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CookieManagerImplJni();
  }
}
