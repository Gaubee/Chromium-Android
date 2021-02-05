package org.chromium.chrome.browser.autofill_assistant.generic_ui;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AssistantGenericUiDelegateJni implements AssistantGenericUiDelegate.Natives {
  private static AssistantGenericUiDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AssistantGenericUiDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.generic_ui.AssistantGenericUiDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.generic_ui.AssistantGenericUiDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onViewClicked(long nativeAssistantGenericUiDelegate,
      AssistantGenericUiDelegate caller, String identifier) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_generic_1ui_AssistantGenericUiDelegate_onViewClicked(nativeAssistantGenericUiDelegate, caller, identifier);
  }

  @Override
  public void onValueChanged(long nativeAssistantGenericUiDelegate,
      AssistantGenericUiDelegate caller, String modelIdentifier, AssistantValue value) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_generic_1ui_AssistantGenericUiDelegate_onValueChanged(nativeAssistantGenericUiDelegate, caller, modelIdentifier, value);
  }

  @Override
  public void onTextLinkClicked(long nativeAssistantGenericUiDelegate,
      AssistantGenericUiDelegate caller, int link) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_generic_1ui_AssistantGenericUiDelegate_onTextLinkClicked(nativeAssistantGenericUiDelegate, caller, link);
  }

  @Override
  public void onGenericPopupDismissed(long nativeAssistantGenericUiDelegate,
      AssistantGenericUiDelegate caller, String popupIdentifier) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_generic_1ui_AssistantGenericUiDelegate_onGenericPopupDismissed(nativeAssistantGenericUiDelegate, caller, popupIdentifier);
  }

  @Override
  public void onViewContainerCleared(long nativeAssistantGenericUiDelegate,
      AssistantGenericUiDelegate caller, String viewIdentifier) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_generic_1ui_AssistantGenericUiDelegate_onViewContainerCleared(nativeAssistantGenericUiDelegate, caller, viewIdentifier);
  }

  public static AssistantGenericUiDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.generic_ui.AssistantGenericUiDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AssistantGenericUiDelegateJni();
  }
}
