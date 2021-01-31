package org.chromium.weblayer_private;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowserControlsContainerViewJni implements BrowserControlsContainerView.Natives {
  private static BrowserControlsContainerView.Natives testInstance;

  public static final JniStaticTestMocker<BrowserControlsContainerView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.BrowserControlsContainerView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.BrowserControlsContainerView.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createBrowserControlsContainerView(BrowserControlsContainerView view,
      long nativeContentViewRenderView, boolean isTop) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_createBrowserControlsContainerView(view, nativeContentViewRenderView, isTop);
  }

  @Override
  public void deleteBrowserControlsContainerView(long nativeBrowserControlsContainerView) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_deleteBrowserControlsContainerView(nativeBrowserControlsContainerView);
  }

  @Override
  public void createControlsLayer(long nativeBrowserControlsContainerView, int id) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_createControlsLayer(nativeBrowserControlsContainerView, id);
  }

  @Override
  public void deleteControlsLayer(long nativeBrowserControlsContainerView) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_deleteControlsLayer(nativeBrowserControlsContainerView);
  }

  @Override
  public void setTopControlsOffset(long nativeBrowserControlsContainerView, int contentOffsetY) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_setTopControlsOffset(nativeBrowserControlsContainerView, contentOffsetY);
  }

  @Override
  public void setBottomControlsOffset(long nativeBrowserControlsContainerView) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_setBottomControlsOffset(nativeBrowserControlsContainerView);
  }

  @Override
  public void setControlsSize(long nativeBrowserControlsContainerView, int width, int height) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_setControlsSize(nativeBrowserControlsContainerView, width, height);
  }

  @Override
  public void updateControlsResource(long nativeBrowserControlsContainerView) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_updateControlsResource(nativeBrowserControlsContainerView);
  }

  @Override
  public void setWebContents(long nativeBrowserControlsContainerView, WebContents webContents) {
    GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_setWebContents(nativeBrowserControlsContainerView, webContents);
  }

  @Override
  public boolean shouldDelayVisibilityChange() {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_BrowserControlsContainerView_shouldDelayVisibilityChange();
  }

  public static BrowserControlsContainerView.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.BrowserControlsContainerView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowserControlsContainerViewJni();
  }
}
