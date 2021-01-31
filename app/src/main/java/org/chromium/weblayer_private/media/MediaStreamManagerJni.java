package org.chromium.weblayer_private.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MediaStreamManagerJni implements MediaStreamManager.Natives {
  private static MediaStreamManager.Natives testInstance;

  public static final JniStaticTestMocker<MediaStreamManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.media.MediaStreamManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.media.MediaStreamManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long create(MediaStreamManager caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_media_MediaStreamManager_create(caller, webContents);
  }

  @Override
  public void destroy(long manager) {
    GEN_JNI.org_chromium_weblayer_1private_media_MediaStreamManager_destroy(manager);
  }

  @Override
  public void onClientReadyToStream(long nativeMediaStreamManager, int requestId, boolean allow) {
    GEN_JNI.org_chromium_weblayer_1private_media_MediaStreamManager_onClientReadyToStream(nativeMediaStreamManager, requestId, allow);
  }

  @Override
  public void stopStreaming(long nativeMediaStreamManager) {
    GEN_JNI.org_chromium_weblayer_1private_media_MediaStreamManager_stopStreaming(nativeMediaStreamManager);
  }

  public static MediaStreamManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.media.MediaStreamManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaStreamManagerJni();
  }
}
