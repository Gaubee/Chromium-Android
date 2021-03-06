package org.chromium.chrome.browser.webapps;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.WebappDisclosureController;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureInfobar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkActivityCoordinator_Factory implements Factory<WebApkActivityCoordinator> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  private final Provider<WebappDisclosureController> disclosureControllerProvider;

  private final Provider<DisclosureInfobar> disclosureInfobarProvider;

  private final Provider<WebApkActivityLifecycleUmaTracker> webApkActivityLifecycleUmaTrackerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<WebApkUpdateManager> webApkUpdateManagerProvider;

  public WebApkActivityCoordinator_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<WebappDisclosureController> disclosureControllerProvider,
      Provider<DisclosureInfobar> disclosureInfobarProvider,
      Provider<WebApkActivityLifecycleUmaTracker> webApkActivityLifecycleUmaTrackerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebApkUpdateManager> webApkUpdateManagerProvider) {
    this.activityProvider = activityProvider;
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
    this.disclosureControllerProvider = disclosureControllerProvider;
    this.disclosureInfobarProvider = disclosureInfobarProvider;
    this.webApkActivityLifecycleUmaTrackerProvider = webApkActivityLifecycleUmaTrackerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.webApkUpdateManagerProvider = webApkUpdateManagerProvider;
  }

  @Override
  public WebApkActivityCoordinator get() {
    return newInstance(activityProvider.get(), deferredStartupWithStorageHandlerProvider.get(), disclosureControllerProvider.get(), disclosureInfobarProvider.get(), webApkActivityLifecycleUmaTrackerProvider.get(), lifecycleDispatcherProvider.get(), DoubleCheck.lazy(webApkUpdateManagerProvider));
  }

  public static WebApkActivityCoordinator_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<WebappDisclosureController> disclosureControllerProvider,
      Provider<DisclosureInfobar> disclosureInfobarProvider,
      Provider<WebApkActivityLifecycleUmaTracker> webApkActivityLifecycleUmaTrackerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebApkUpdateManager> webApkUpdateManagerProvider) {
    return new WebApkActivityCoordinator_Factory(activityProvider, deferredStartupWithStorageHandlerProvider, disclosureControllerProvider, disclosureInfobarProvider, webApkActivityLifecycleUmaTrackerProvider, lifecycleDispatcherProvider, webApkUpdateManagerProvider);
  }

  public static WebApkActivityCoordinator newInstance(ChromeActivity<?> activity,
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler,
      WebappDisclosureController disclosureController, DisclosureInfobar disclosureInfobar,
      WebApkActivityLifecycleUmaTracker webApkActivityLifecycleUmaTracker,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      Lazy<WebApkUpdateManager> webApkUpdateManager) {
    return new WebApkActivityCoordinator(activity, deferredStartupWithStorageHandler, disclosureController, disclosureInfobar, webApkActivityLifecycleUmaTracker, lifecycleDispatcher, webApkUpdateManager);
  }
}
