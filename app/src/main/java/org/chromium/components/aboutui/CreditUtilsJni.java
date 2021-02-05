package org.chromium.components.aboutui;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class CreditUtilsJni implements CreditUtils.Natives {
  private static CreditUtils.Natives testInstance;

  public static final JniStaticTestMocker<CreditUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.aboutui.CreditUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.aboutui.CreditUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void writeCreditsHtml(int fd) {
    GEN_JNI.org_chromium_components_aboutui_CreditUtils_writeCreditsHtml(fd);
  }

  public static CreditUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.aboutui.CreditUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CreditUtilsJni();
  }
}
