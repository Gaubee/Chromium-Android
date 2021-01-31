package org.chromium.chrome.browser.share.long_screenshots;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LongScreenshotsTabServiceJni implements LongScreenshotsTabService.Natives {
  private static LongScreenshotsTabService.Natives testInstance;

  public static final JniStaticTestMocker<LongScreenshotsTabService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.long_screenshots.LongScreenshotsTabService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.long_screenshots.LongScreenshotsTabService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void captureTabAndroid(long nativeLongScreenshotsTabService, int tabId,
      WebContents webContents, int clipX, int clipY, int clipWidth, int clipHeight) {
    GEN_JNI.org_chromium_chrome_browser_share_long_1screenshots_LongScreenshotsTabService_captureTabAndroid(nativeLongScreenshotsTabService, tabId, webContents, clipX, clipY, clipWidth, clipHeight);
  }

  @Override
  public void longScreenshotsClosedAndroid(long nativeLongScreenshotsTabService) {
    GEN_JNI.org_chromium_chrome_browser_share_long_1screenshots_LongScreenshotsTabService_longScreenshotsClosedAndroid(nativeLongScreenshotsTabService);
  }

  public static LongScreenshotsTabService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.long_screenshots.LongScreenshotsTabService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LongScreenshotsTabServiceJni();
  }
}
