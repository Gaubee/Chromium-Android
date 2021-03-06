package org.chromium.chrome.browser.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebappDeferredStartupWithStorageHandler_Factory implements Factory<WebappDeferredStartupWithStorageHandler> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public WebappDeferredStartupWithStorageHandler_Factory(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public WebappDeferredStartupWithStorageHandler get() {
    return newInstance(activityProvider.get(), intentDataProvider.get());
  }

  public static WebappDeferredStartupWithStorageHandler_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new WebappDeferredStartupWithStorageHandler_Factory(activityProvider, intentDataProvider);
  }

  public static WebappDeferredStartupWithStorageHandler newInstance(ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new WebappDeferredStartupWithStorageHandler(activity, intentDataProvider);
  }
}
