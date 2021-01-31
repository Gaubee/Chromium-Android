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
final class DownloadImplJni implements DownloadImpl.Natives {
  private static DownloadImpl.Natives testInstance;

  public static final JniStaticTestMocker<DownloadImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.DownloadImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.weblayer_private.DownloadImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setJavaDownload(long nativeDownloadImpl, DownloadImpl caller) {
    GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_setJavaDownload(nativeDownloadImpl, caller);
  }

  @Override
  public int getState(long nativeDownloadImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getState(nativeDownloadImpl);
  }

  @Override
  public long getTotalBytes(long nativeDownloadImpl) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getTotalBytes(nativeDownloadImpl);
  }

  @Override
  public long getReceivedBytes(long nativeDownloadImpl) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getReceivedBytes(nativeDownloadImpl);
  }

  @Override
  public void pause(long nativeDownloadImpl) {
    GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_pause(nativeDownloadImpl);
  }

  @Override
  public void resume(long nativeDownloadImpl) {
    GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_resume(nativeDownloadImpl);
  }

  @Override
  public void cancel(long nativeDownloadImpl) {
    GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_cancel(nativeDownloadImpl);
  }

  @Override
  public String getLocation(long nativeDownloadImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getLocation(nativeDownloadImpl);
  }

  @Override
  public String getFileNameToReportToUser(long nativeDownloadImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getFileNameToReportToUser(nativeDownloadImpl);
  }

  @Override
  public String getMimeTypeImpl(long nativeDownloadImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getMimeTypeImpl(nativeDownloadImpl);
  }

  @Override
  public int getError(long nativeDownloadImpl) {
    return (int)GEN_JNI.org_chromium_weblayer_1private_DownloadImpl_getError(nativeDownloadImpl);
  }

  public static DownloadImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.DownloadImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadImplJni();
  }
}
