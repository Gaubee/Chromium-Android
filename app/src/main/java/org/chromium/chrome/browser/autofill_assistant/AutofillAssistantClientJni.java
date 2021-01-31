package org.chromium.chrome.browser.autofill_assistant;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.autofill_assistant.trigger_scripts.AssistantTriggerScriptBridge;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillAssistantClientJni implements AutofillAssistantClient.Natives {
  private static AutofillAssistantClient.Natives testInstance;

  public static final JniStaticTestMocker<AutofillAssistantClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.AutofillAssistantClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.AutofillAssistantClient.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AutofillAssistantClient fromWebContents(WebContents webContents) {
    return (AutofillAssistantClient)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_fromWebContents(webContents);
  }

  @Override
  public boolean start(long nativeClientAndroid, AutofillAssistantClient caller, String initialUrl,
      String experimentIds, String callerAccount, String[] parameterNames, String[] parameterValues,
      boolean isChromeCustomTab, BaseOnboardingCoordinator onboardingCoordinator,
      boolean onboardingShown, long nativeService) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_start(nativeClientAndroid, caller, initialUrl, experimentIds, callerAccount, parameterNames, parameterValues, isChromeCustomTab, onboardingCoordinator, onboardingShown, nativeService);
  }

  @Override
  public void startTriggerScript(long nativeClientAndroid, AutofillAssistantClient caller,
      AssistantTriggerScriptBridge delegate, String initialUrl, String experimentIds,
      String[] parameterNames, String[] parameterValues, long nativeServiceRequestSender) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_startTriggerScript(nativeClientAndroid, caller, delegate, initialUrl, experimentIds, parameterNames, parameterValues, nativeServiceRequestSender);
  }

  @Override
  public void onAccessToken(long nativeClientAndroid, AutofillAssistantClient caller,
      boolean success, String accessToken) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_onAccessToken(nativeClientAndroid, caller, success, accessToken);
  }

  @Override
  public String getPrimaryAccountName(long nativeClientAndroid, AutofillAssistantClient caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_getPrimaryAccountName(nativeClientAndroid, caller);
  }

  @Override
  public void onJavaDestroyUI(long nativeClientAndroid, AutofillAssistantClient caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_onJavaDestroyUI(nativeClientAndroid, caller);
  }

  @Override
  public void transferUITo(long nativeClientAndroid, AutofillAssistantClient caller,
      Object otherWebContents) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_transferUITo(nativeClientAndroid, caller, otherWebContents);
  }

  @Override
  public void fetchWebsiteActions(long nativeClientAndroid, AutofillAssistantClient caller,
      String experimentIds, String[] argumentNames, String[] argumentValues, Object callback) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_fetchWebsiteActions(nativeClientAndroid, caller, experimentIds, argumentNames, argumentValues, callback);
  }

  @Override
  public boolean hasRunFirstCheck(long nativeClientAndroid, AutofillAssistantClient caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_hasRunFirstCheck(nativeClientAndroid, caller);
  }

  @Override
  public AutofillAssistantDirectAction[] getDirectActions(long nativeClientAndroid,
      AutofillAssistantClient caller) {
    return (AutofillAssistantDirectAction[])GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_getDirectActions(nativeClientAndroid, caller);
  }

  @Override
  public boolean performDirectAction(long nativeClientAndroid, AutofillAssistantClient caller,
      String actionId, String experimentId, String[] argumentNames, String[] argumentValues,
      BaseOnboardingCoordinator onboardingCoordinator) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantClient_performDirectAction(nativeClientAndroid, caller, actionId, experimentId, argumentNames, argumentValues, onboardingCoordinator);
  }

  public static AutofillAssistantClient.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.AutofillAssistantClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillAssistantClientJni();
  }
}
