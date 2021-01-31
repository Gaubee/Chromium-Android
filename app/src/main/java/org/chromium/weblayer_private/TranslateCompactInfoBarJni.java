package org.chromium.weblayer_private;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TranslateCompactInfoBarJni implements TranslateCompactInfoBar.Natives {
  private static TranslateCompactInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<TranslateCompactInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.TranslateCompactInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.TranslateCompactInfoBar.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void applyStringTranslateOption(long nativeTranslateCompactInfoBar,
      TranslateCompactInfoBar caller, int option, String value) {
    GEN_JNI.org_chromium_weblayer_1private_TranslateCompactInfoBar_applyStringTranslateOption(nativeTranslateCompactInfoBar, caller, option, value);
  }

  @Override
  public void applyBoolTranslateOption(long nativeTranslateCompactInfoBar,
      TranslateCompactInfoBar caller, int option, boolean value) {
    GEN_JNI.org_chromium_weblayer_1private_TranslateCompactInfoBar_applyBoolTranslateOption(nativeTranslateCompactInfoBar, caller, option, value);
  }

  @Override
  public boolean shouldAutoNeverTranslate(long nativeTranslateCompactInfoBar,
      TranslateCompactInfoBar caller, boolean menuExpanded) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_TranslateCompactInfoBar_shouldAutoNeverTranslate(nativeTranslateCompactInfoBar, caller, menuExpanded);
  }

  @Override
  public boolean isIncognito(long nativeTranslateCompactInfoBar, TranslateCompactInfoBar caller) {
    return (boolean)GEN_JNI.org_chromium_weblayer_1private_TranslateCompactInfoBar_isIncognito(nativeTranslateCompactInfoBar, caller);
  }

  public static TranslateCompactInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.TranslateCompactInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TranslateCompactInfoBarJni();
  }
}
