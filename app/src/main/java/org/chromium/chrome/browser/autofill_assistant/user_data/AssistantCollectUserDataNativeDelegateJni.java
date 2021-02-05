package org.chromium.chrome.browser.autofill_assistant.user_data;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill_assistant.generic_ui.AssistantValue;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AssistantCollectUserDataNativeDelegateJni implements AssistantCollectUserDataNativeDelegate.Natives {
  private static AssistantCollectUserDataNativeDelegate.Natives testInstance;

  public static final JniStaticTestMocker<AssistantCollectUserDataNativeDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill_assistant.user_data.AssistantCollectUserDataNativeDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill_assistant.user_data.AssistantCollectUserDataNativeDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onContactInfoChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller,
      PersonalDataManager.AutofillProfile contactProfile) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onContactInfoChanged(nativeAssistantCollectUserDataDelegate, caller, contactProfile);
  }

  @Override
  public void onShippingAddressChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, PersonalDataManager.AutofillProfile address) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onShippingAddressChanged(nativeAssistantCollectUserDataDelegate, caller, address);
  }

  @Override
  public void onCreditCardChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, PersonalDataManager.CreditCard card,
      PersonalDataManager.AutofillProfile billingProfile) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onCreditCardChanged(nativeAssistantCollectUserDataDelegate, caller, card, billingProfile);
  }

  @Override
  public void onTermsAndConditionsChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, int state) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onTermsAndConditionsChanged(nativeAssistantCollectUserDataDelegate, caller, state);
  }

  @Override
  public void onTextLinkClicked(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, int link) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onTextLinkClicked(nativeAssistantCollectUserDataDelegate, caller, link);
  }

  @Override
  public void onLoginChoiceChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, String choice) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onLoginChoiceChanged(nativeAssistantCollectUserDataDelegate, caller, choice);
  }

  @Override
  public void onDateTimeRangeStartDateChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, int year, int month, int day) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeStartDateChanged(nativeAssistantCollectUserDataDelegate, caller, year, month, day);
  }

  @Override
  public void onDateTimeRangeStartTimeSlotChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeStartTimeSlotChanged(nativeAssistantCollectUserDataDelegate, caller, index);
  }

  @Override
  public void onDateTimeRangeEndDateChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, int year, int month, int day) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeEndDateChanged(nativeAssistantCollectUserDataDelegate, caller, year, month, day);
  }

  @Override
  public void onDateTimeRangeEndTimeSlotChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeEndTimeSlotChanged(nativeAssistantCollectUserDataDelegate, caller, index);
  }

  @Override
  public void onDateTimeRangeStartDateCleared(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeStartDateCleared(nativeAssistantCollectUserDataDelegate, caller);
  }

  @Override
  public void onDateTimeRangeStartTimeSlotCleared(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeStartTimeSlotCleared(nativeAssistantCollectUserDataDelegate, caller);
  }

  @Override
  public void onDateTimeRangeEndDateCleared(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeEndDateCleared(nativeAssistantCollectUserDataDelegate, caller);
  }

  @Override
  public void onDateTimeRangeEndTimeSlotCleared(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onDateTimeRangeEndTimeSlotCleared(nativeAssistantCollectUserDataDelegate, caller);
  }

  @Override
  public void onKeyValueChanged(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, String key, AssistantValue value) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onKeyValueChanged(nativeAssistantCollectUserDataDelegate, caller, key, value);
  }

  @Override
  public void onTextFocusLost(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_onTextFocusLost(nativeAssistantCollectUserDataDelegate, caller);
  }

  @Override
  public boolean isContactComplete(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, PersonalDataManager.AutofillProfile address) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_isContactComplete(nativeAssistantCollectUserDataDelegate, caller, address);
  }

  @Override
  public boolean isShippingAddressComplete(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, PersonalDataManager.AutofillProfile address) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_isShippingAddressComplete(nativeAssistantCollectUserDataDelegate, caller, address);
  }

  @Override
  public boolean isPaymentInstrumentComplete(long nativeAssistantCollectUserDataDelegate,
      AssistantCollectUserDataNativeDelegate caller, PersonalDataManager.CreditCard card,
      PersonalDataManager.AutofillProfile address) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_1assistant_user_1data_AssistantCollectUserDataNativeDelegate_isPaymentInstrumentComplete(nativeAssistantCollectUserDataDelegate, caller, card, address);
  }

  public static AssistantCollectUserDataNativeDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill_assistant.user_data.AssistantCollectUserDataNativeDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AssistantCollectUserDataNativeDelegateJni();
  }
}
