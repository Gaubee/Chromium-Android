package org.chromium.weblayer_private;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ErrorPageCallbackProxyJni implements ErrorPageCallbackProxy.Natives {
  private static ErrorPageCallbackProxy.Natives testInstance;

  public static final JniStaticTestMocker<ErrorPageCallbackProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.ErrorPageCallbackProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.ErrorPageCallbackProxy.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createErrorPageCallbackProxy(ErrorPageCallbackProxy proxy, long tab) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_ErrorPageCallbackProxy_createErrorPageCallbackProxy(proxy, tab);
  }

  @Override
  public void deleteErrorPageCallbackProxy(long proxy) {
    GEN_JNI.org_chromium_weblayer_1private_ErrorPageCallbackProxy_deleteErrorPageCallbackProxy(proxy);
  }

  public static ErrorPageCallbackProxy.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.ErrorPageCallbackProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ErrorPageCallbackProxyJni();
  }
}
