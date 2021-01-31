package org.chromium.chrome.browser.autofill_assistant;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillAssistantUiControllerJni implements AutofillAssistantUiController.Natives {
  private static AutofillAssistantUiController.Natives testInstance;

  public static final JniStaticTestMocker<AutofillAssistantUiController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.AutofillAssistantUiController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.AutofillAssistantUiController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void snackbarResult(long nativeUiControllerAndroid, AutofillAssistantUiController caller,
      boolean undo) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_snackbarResult(nativeUiControllerAndroid, caller, undo);
  }

  @Override
  public void stop(long nativeUiControllerAndroid, AutofillAssistantUiController caller,
      int reason) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_stop(nativeUiControllerAndroid, caller, reason);
  }

  @Override
  public void onFatalError(long nativeUiControllerAndroid, AutofillAssistantUiController caller,
      String message, int reason) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onFatalError(nativeUiControllerAndroid, caller, message, reason);
  }

  @Override
  public void onUserActionSelected(long nativeUiControllerAndroid,
      AutofillAssistantUiController caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onUserActionSelected(nativeUiControllerAndroid, caller, index);
  }

  @Override
  public void onCancelButtonClicked(long nativeUiControllerAndroid,
      AutofillAssistantUiController caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onCancelButtonClicked(nativeUiControllerAndroid, caller, index);
  }

  @Override
  public void onCloseButtonClicked(long nativeUiControllerAndroid,
      AutofillAssistantUiController caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onCloseButtonClicked(nativeUiControllerAndroid, caller);
  }

  @Override
  public void onFeedbackButtonClicked(long nativeUiControllerAndroid,
      AutofillAssistantUiController caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onFeedbackButtonClicked(nativeUiControllerAndroid, caller, index);
  }

  @Override
  public void onKeyboardVisibilityChanged(long nativeUiControllerAndroid,
      AutofillAssistantUiController caller, boolean visible) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onKeyboardVisibilityChanged(nativeUiControllerAndroid, caller, visible);
  }

  @Override
  public void setVisible(long nativeUiControllerAndroid, AutofillAssistantUiController caller,
      boolean visible) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_setVisible(nativeUiControllerAndroid, caller, visible);
  }

  @Override
  public void onTabSwitched(long nativeUiControllerAndroid, AutofillAssistantUiController caller,
      int state, boolean activityChanged) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onTabSwitched(nativeUiControllerAndroid, caller, state, activityChanged);
  }

  @Override
  public void onTabSelected(long nativeUiControllerAndroid, AutofillAssistantUiController caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_AutofillAssistantUiController_onTabSelected(nativeUiControllerAndroid, caller);
  }

  public static AutofillAssistantUiController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.AutofillAssistantUiController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillAssistantUiControllerJni();
  }
}
