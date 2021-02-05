package org.chromium.chrome.modules.stack_unwinder;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class StackUnwinderModuleContentsImplJni implements StackUnwinderModuleContentsImpl.Natives {
  private static StackUnwinderModuleContentsImpl.Natives testInstance;

  public static final JniStaticTestMocker<StackUnwinderModuleContentsImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.modules.stack_unwinder.StackUnwinderModuleContentsImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.modules.stack_unwinder.StackUnwinderModuleContentsImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getCreateMemoryRegionsMapFunction() {
    return (long)GEN_JNI.org_chromium_chrome_modules_stack_1unwinder_StackUnwinderModuleContentsImpl_getCreateMemoryRegionsMapFunction();
  }

  @Override
  public long getCreateNativeUnwinderFunction() {
    return (long)GEN_JNI.org_chromium_chrome_modules_stack_1unwinder_StackUnwinderModuleContentsImpl_getCreateNativeUnwinderFunction();
  }

  public static StackUnwinderModuleContentsImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.modules.stack_unwinder.StackUnwinderModuleContentsImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new StackUnwinderModuleContentsImplJni();
  }
}
