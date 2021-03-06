package org.chromium.chrome.browser.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.SplashController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkActivityLifecycleUmaTracker_Factory implements Factory<WebApkActivityLifecycleUmaTracker> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<SplashController> splashControllerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  public WebApkActivityLifecycleUmaTracker_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<SplashController> splashControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.splashControllerProvider = splashControllerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
  }

  @Override
  public WebApkActivityLifecycleUmaTracker get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), splashControllerProvider.get(), lifecycleDispatcherProvider.get(), deferredStartupWithStorageHandlerProvider.get());
  }

  public static WebApkActivityLifecycleUmaTracker_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<SplashController> splashControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider) {
    return new WebApkActivityLifecycleUmaTracker_Factory(activityProvider, intentDataProvider, splashControllerProvider, lifecycleDispatcherProvider, deferredStartupWithStorageHandlerProvider);
  }

  public static WebApkActivityLifecycleUmaTracker newInstance(ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider, SplashController splashController,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler) {
    return new WebApkActivityLifecycleUmaTracker(activity, intentDataProvider, splashController, lifecycleDispatcher, deferredStartupWithStorageHandler);
  }
}
