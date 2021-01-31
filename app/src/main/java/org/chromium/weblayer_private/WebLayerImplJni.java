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
final class WebLayerImplJni implements WebLayerImpl.Natives {
  private static WebLayerImpl.Natives testInstance;

  public static final JniStaticTestMocker<WebLayerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.WebLayerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.weblayer_private.WebLayerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setRemoteDebuggingEnabled(boolean enabled) {
    GEN_JNI.org_chromium_weblayer_1private_WebLayerImpl_setRemoteDebuggingEnabled(enabled);
  }

  @Override
  public boolean isRemoteDebuggingEnabled() {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_WebLayerImpl_isRemoteDebuggingEnabled();
  }

  @Override
  public void setIsWebViewCompatMode(boolean value) {
    GEN_JNI.org_chromium_weblayer_1private_WebLayerImpl_setIsWebViewCompatMode(value);
  }

  @Override
  public String getUserAgentString() {
    return (String)GEN_JNI.org_chromium_weblayer_1private_WebLayerImpl_getUserAgentString();
  }

  @Override
  public void registerExternalExperimentIDs(int[] experimentIDs) {
    GEN_JNI.org_chromium_weblayer_1private_WebLayerImpl_registerExternalExperimentIDs(experimentIDs);
  }

  @Override
  public boolean isLocationPermissionManaged(String origin) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_WebLayerImpl_isLocationPermissionManaged(origin);
  }

  public static WebLayerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.WebLayerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebLayerImplJni();
  }
}
