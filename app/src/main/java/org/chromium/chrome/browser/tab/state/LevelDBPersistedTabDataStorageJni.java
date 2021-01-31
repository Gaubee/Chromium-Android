package org.chromium.chrome.browser.tab.state;

import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.browser_context.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class LevelDBPersistedTabDataStorageJni implements LevelDBPersistedTabDataStorage.Natives {
  private static LevelDBPersistedTabDataStorage.Natives testInstance;

  public static final JniStaticTestMocker<LevelDBPersistedTabDataStorage.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.state.LevelDBPersistedTabDataStorage.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.state.LevelDBPersistedTabDataStorage.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void init(LevelDBPersistedTabDataStorage caller, BrowserContextHandle handle) {
    GEN_JNI.org_chromium_chrome_browser_tab_state_LevelDBPersistedTabDataStorage_init(caller, handle);
  }

  @Override
  public void destroy(long nativePersistedStateDB) {
    GEN_JNI.org_chromium_chrome_browser_tab_state_LevelDBPersistedTabDataStorage_destroy(nativePersistedStateDB);
  }

  @Override
  public void save(long nativePersistedStateDB, String key, byte[] data, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_tab_state_LevelDBPersistedTabDataStorage_save(nativePersistedStateDB, key, data, onComplete);
  }

  @Override
  public void load(long nativePersistedStateDB, String key, Callback<byte[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_tab_state_LevelDBPersistedTabDataStorage_load(nativePersistedStateDB, key, callback);
  }

  @Override
  public void delete(long nativePersistedStateDB, String key, Runnable onComplete) {
    GEN_JNI.org_chromium_chrome_browser_tab_state_LevelDBPersistedTabDataStorage_delete(nativePersistedStateDB, key, onComplete);
  }

  public static LevelDBPersistedTabDataStorage.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.state.LevelDBPersistedTabDataStorage.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LevelDBPersistedTabDataStorageJni();
  }
}
