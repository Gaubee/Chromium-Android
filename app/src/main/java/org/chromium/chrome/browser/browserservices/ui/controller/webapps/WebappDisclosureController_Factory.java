package org.chromium.chrome.browser.browserservices.ui.controller.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.webapps.WebappDeferredStartupWithStorageHandler;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebappDisclosureController_Factory implements Factory<WebappDisclosureController> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  private final Provider<TrustedWebActivityModel> modelProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  public WebappDisclosureController_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
    this.modelProvider = modelProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
  }

  @Override
  public WebappDisclosureController get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), deferredStartupWithStorageHandlerProvider.get(), modelProvider.get(), lifecycleDispatcherProvider.get(), currentPageVerifierProvider.get());
  }

  public static WebappDisclosureController_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider) {
    return new WebappDisclosureController_Factory(activityProvider, intentDataProvider, deferredStartupWithStorageHandlerProvider, modelProvider, lifecycleDispatcherProvider, currentPageVerifierProvider);
  }

  public static WebappDisclosureController newInstance(ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider,
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler,
      TrustedWebActivityModel model, ActivityLifecycleDispatcher lifecycleDispatcher,
      CurrentPageVerifier currentPageVerifier) {
    return new WebappDisclosureController(activity, intentDataProvider, deferredStartupWithStorageHandler, model, lifecycleDispatcher, currentPageVerifier);
  }
}
