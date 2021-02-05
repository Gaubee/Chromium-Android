package org.chromium.chrome.browser.browserservices.verification;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OriginVerifier_Factory_Factory implements Factory<OriginVerifier.Factory> {
  @Override
  public OriginVerifier.Factory get() {
    return newInstance();
  }

  public static OriginVerifier_Factory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OriginVerifier.Factory newInstance() {
    return new OriginVerifier.Factory();
  }

  private static final class InstanceHolder {
    private static final OriginVerifier_Factory_Factory INSTANCE = new OriginVerifier_Factory_Factory();
  }
}
