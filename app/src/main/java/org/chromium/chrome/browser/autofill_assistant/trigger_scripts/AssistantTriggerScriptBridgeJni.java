package org.chromium.chrome.browser.autofill_assistant.trigger_scripts;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AssistantTriggerScriptBridgeJni implements AssistantTriggerScriptBridge.Natives {
  private static AssistantTriggerScriptBridge.Natives testInstance;

  public static final JniStaticTestMocker<AssistantTriggerScriptBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.trigger_scripts.AssistantTriggerScriptBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.trigger_scripts.AssistantTriggerScriptBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onTriggerScriptAction(long nativeTriggerScriptBridgeAndroid,
      AssistantTriggerScriptBridge caller, int action) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_trigger_1scripts_AssistantTriggerScriptBridge_onTriggerScriptAction(nativeTriggerScriptBridgeAndroid, caller, action);
  }

  @Override
  public void onBottomSheetClosedWithSwipe(long nativeTriggerScriptBridgeAndroid,
      AssistantTriggerScriptBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_trigger_1scripts_AssistantTriggerScriptBridge_onBottomSheetClosedWithSwipe(nativeTriggerScriptBridgeAndroid, caller);
  }

  @Override
  public boolean onBackButtonPressed(long nativeTriggerScriptBridgeAndroid,
      AssistantTriggerScriptBridge caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_trigger_1scripts_AssistantTriggerScriptBridge_onBackButtonPressed(nativeTriggerScriptBridgeAndroid, caller);
  }

  @Override
  public void onKeyboardVisibilityChanged(long nativeTriggerScriptBridgeAndroid,
      AssistantTriggerScriptBridge caller, boolean visible) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_trigger_1scripts_AssistantTriggerScriptBridge_onKeyboardVisibilityChanged(nativeTriggerScriptBridgeAndroid, caller, visible);
  }

  @Override
  public void onTabInteractabilityChanged(long nativeTriggerScriptBridgeAndroid,
      AssistantTriggerScriptBridge caller, boolean interactable) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_trigger_1scripts_AssistantTriggerScriptBridge_onTabInteractabilityChanged(nativeTriggerScriptBridgeAndroid, caller, interactable);
  }

  public static AssistantTriggerScriptBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.trigger_scripts.AssistantTriggerScriptBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AssistantTriggerScriptBridgeJni();
  }
}
