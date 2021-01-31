package org.chromium.chrome.browser.autofill_assistant.form;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AssistantFormDelegateJni implements AssistantFormDelegate.Natives {
  private static AssistantFormDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AssistantFormDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.form.AssistantFormDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.form.AssistantFormDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCounterChanged(long nativeAssistantFormDelegate, AssistantFormDelegate caller,
      int inputIndex, int counterIndex, long nativeAssistantOverlayDelegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_form_AssistantFormDelegate_onCounterChanged(nativeAssistantFormDelegate, caller, inputIndex, counterIndex, nativeAssistantOverlayDelegate);
  }

  @Override
  public void onChoiceSelectionChanged(long nativeAssistantFormDelegate,
      AssistantFormDelegate caller, int inputIndex, int choiceIndex, boolean selected) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_form_AssistantFormDelegate_onChoiceSelectionChanged(nativeAssistantFormDelegate, caller, inputIndex, choiceIndex, selected);
  }

  @Override
  public void onLinkClicked(long nativeAssistantFormDelegate, AssistantFormDelegate caller,
      int link) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_form_AssistantFormDelegate_onLinkClicked(nativeAssistantFormDelegate, caller, link);
  }

  public static AssistantFormDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.form.AssistantFormDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AssistantFormDelegateJni();
  }
}
