package org.chromium.chrome.browser.autofill_assistant.header;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AssistantHeaderDelegateJni implements AssistantHeaderDelegate.Natives {
  private static AssistantHeaderDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AssistantHeaderDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.header.AssistantHeaderDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.header.AssistantHeaderDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onFeedbackButtonClicked(long nativeAssistantHeaderDelegate,
      AssistantHeaderDelegate caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_header_AssistantHeaderDelegate_onFeedbackButtonClicked(nativeAssistantHeaderDelegate, caller);
  }

  public static AssistantHeaderDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.header.AssistantHeaderDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AssistantHeaderDelegateJni();
  }
}
