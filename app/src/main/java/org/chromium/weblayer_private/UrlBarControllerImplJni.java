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
final class UrlBarControllerImplJni implements UrlBarControllerImpl.Natives {
  private static UrlBarControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<UrlBarControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.UrlBarControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.UrlBarControllerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createUrlBarController(long browserPtr) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_UrlBarControllerImpl_createUrlBarController(browserPtr);
  }

  @Override
  public void deleteUrlBarController(long urlBarControllerImplPtr) {
    GEN_JNI.org_chromium_weblayer_1private_UrlBarControllerImpl_deleteUrlBarController(urlBarControllerImplPtr);
  }

  @Override
  public String getUrlForDisplay(long nativeUrlBarControllerImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_UrlBarControllerImpl_getUrlForDisplay(nativeUrlBarControllerImpl);
  }

  @Override
  public String getPublisherUrl(long nativeUrlBarControllerImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_UrlBarControllerImpl_getPublisherUrl(nativeUrlBarControllerImpl);
  }

  @Override
  public int getConnectionSecurityLevel(long nativeUrlBarControllerImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_UrlBarControllerImpl_getConnectionSecurityLevel(nativeUrlBarControllerImpl);
  }

  public static UrlBarControllerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.UrlBarControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UrlBarControllerImplJni();
  }
}
