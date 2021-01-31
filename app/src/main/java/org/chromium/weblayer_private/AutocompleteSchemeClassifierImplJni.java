package org.chromium.weblayer_private;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutocompleteSchemeClassifierImplJni implements AutocompleteSchemeClassifierImpl.Natives {
  private static AutocompleteSchemeClassifierImpl.Natives testInstance;

  public static final JniStaticTestMocker<AutocompleteSchemeClassifierImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.AutocompleteSchemeClassifierImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.AutocompleteSchemeClassifierImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createAutocompleteClassifier() {
    return (long)GEN_JNI.org_chromium_weblayer_1private_AutocompleteSchemeClassifierImpl_createAutocompleteClassifier();
  }

  @Override
  public void deleteAutocompleteClassifier(long weblayerAutocompleteSchemeClassifier) {
    GEN_JNI.org_chromium_weblayer_1private_AutocompleteSchemeClassifierImpl_deleteAutocompleteClassifier(weblayerAutocompleteSchemeClassifier);
  }

  public static AutocompleteSchemeClassifierImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.AutocompleteSchemeClassifierImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutocompleteSchemeClassifierImplJni();
  }
}
