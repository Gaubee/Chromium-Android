package org.chromium.weblayer_private;

import android.graphics.Bitmap;
import android.util.Pair;
import android.webkit.ValueCallback;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.autofill.AutofillProvider;
import org.chromium.content_public.browser.WebContents;
import org.chromium.weblayer_private.interfaces.IWebMessageCallbackClient;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabImplJni implements TabImpl.Natives {
  private static TabImpl.Natives testInstance;

  public static final JniStaticTestMocker<TabImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.TabImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.weblayer_private.TabImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public TabImpl fromWebContents(WebContents webContents) {
    return (TabImpl)GEN_JNI.org_chromium_weblayer_1private_TabImpl_fromWebContents(webContents);
  }

  @Override
  public long createTab(long tab, TabImpl caller) {
    return (long)GEN_JNI.org_chromium_weblayer_1private_TabImpl_createTab(tab, caller);
  }

  @Override
  public void removeTabFromBrowserBeforeDestroying(long nativeTabImpl) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_removeTabFromBrowserBeforeDestroying(nativeTabImpl);
  }

  @Override
  public void deleteTab(long tab) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_deleteTab(tab);
  }

  @Override
  public void setJavaImpl(long nativeTabImpl, TabImpl impl) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_setJavaImpl(nativeTabImpl, impl);
  }

  @Override
  public void onAutofillProviderChanged(long nativeTabImpl, AutofillProvider autofillProvider) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_onAutofillProviderChanged(nativeTabImpl, autofillProvider);
  }

  @Override
  public void setBrowserControlsContainerViews(long nativeTabImpl,
      long nativeTopBrowserControlsContainerView, long nativeBottomBrowserControlsContainerView) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_setBrowserControlsContainerViews(nativeTabImpl, nativeTopBrowserControlsContainerView, nativeBottomBrowserControlsContainerView);
  }

  @Override
  public WebContents getWebContents(long nativeTabImpl) {
    return (WebContents)GEN_JNI.org_chromium_weblayer_1private_TabImpl_getWebContents(nativeTabImpl);
  }

  @Override
  public void executeScript(long nativeTabImpl, String script, boolean useSeparateIsolate,
      Callback<String> callback) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_executeScript(nativeTabImpl, script, useSeparateIsolate, callback);
  }

  @Override
  public void updateBrowserControlsConstraint(long nativeTabImpl, int newConstraint,
      boolean animate) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_updateBrowserControlsConstraint(nativeTabImpl, newConstraint, animate);
  }

  @Override
  public String getGuid(long nativeTabImpl) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_TabImpl_getGuid(nativeTabImpl);
  }

  @Override
  public void captureScreenShot(long nativeTabImpl, float scale,
      ValueCallback<Pair<Bitmap, Integer>> valueCallback) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_captureScreenShot(nativeTabImpl, scale, valueCallback);
  }

  @Override
  public boolean setData(long nativeTabImpl, String[] data) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_TabImpl_setData(nativeTabImpl, data);
  }

  @Override
  public String[] getData(long nativeTabImpl) {
    return (String[])GEN_JNI.org_chromium_weblayer_1private_TabImpl_getData(nativeTabImpl);
  }

  @Override
  public boolean isRendererControllingBrowserControlsOffsets(long nativeTabImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_TabImpl_isRendererControllingBrowserControlsOffsets(nativeTabImpl);
  }

  @Override
  public String registerWebMessageCallback(long nativeTabImpl, String jsObjectName,
      String[] allowedOrigins, IWebMessageCallbackClient client) {
    return (String)GEN_JNI.org_chromium_weblayer_1private_TabImpl_registerWebMessageCallback(nativeTabImpl, jsObjectName, allowedOrigins, client);
  }

  @Override
  public void unregisterWebMessageCallback(long nativeTabImpl, String jsObjectName) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_unregisterWebMessageCallback(nativeTabImpl, jsObjectName);
  }

  @Override
  public boolean canTranslate(long nativeTabImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_TabImpl_canTranslate(nativeTabImpl);
  }

  @Override
  public void showTranslateUi(long nativeTabImpl) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_showTranslateUi(nativeTabImpl);
  }

  @Override
  public void setTranslateTargetLanguage(long nativeTabImpl, String targetLanguage) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_setTranslateTargetLanguage(nativeTabImpl, targetLanguage);
  }

  @Override
  public void setDesktopUserAgentEnabled(long nativeTabImpl, boolean enable) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_setDesktopUserAgentEnabled(nativeTabImpl, enable);
  }

  @Override
  public boolean isDesktopUserAgentEnabled(long nativeTabImpl) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_TabImpl_isDesktopUserAgentEnabled(nativeTabImpl);
  }

  @Override
  public void download(long nativeTabImpl, long nativeContextMenuParams) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_download(nativeTabImpl, nativeContextMenuParams);
  }

  @Override
  public void destroyContextMenuParams(long contextMenuParams) {
    GEN_JNI.org_chromium_weblayer_1private_TabImpl_destroyContextMenuParams(contextMenuParams);
  }

  public static TabImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.TabImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabImplJni();
  }
}
