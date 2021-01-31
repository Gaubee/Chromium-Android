package org.chromium.chrome.browser.browserservices.ui.view;

import android.content.res.Resources;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DisclosureSnackbar_Factory implements Factory<DisclosureSnackbar> {
  private final Provider<Resources> resourcesProvider;

  private final Provider<SnackbarManager> snackbarManagerProvider;

  private final Provider<TrustedWebActivityModel> modelProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public DisclosureSnackbar_Factory(Provider<Resources> resourcesProvider,
      Provider<SnackbarManager> snackbarManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.resourcesProvider = resourcesProvider;
    this.snackbarManagerProvider = snackbarManagerProvider;
    this.modelProvider = modelProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public DisclosureSnackbar get() {
    return newInstance(resourcesProvider.get(), DoubleCheck.lazy(snackbarManagerProvider), modelProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static DisclosureSnackbar_Factory create(Provider<Resources> resourcesProvider,
      Provider<SnackbarManager> snackbarManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new DisclosureSnackbar_Factory(resourcesProvider, snackbarManagerProvider, modelProvider, lifecycleDispatcherProvider);
  }

  public static DisclosureSnackbar newInstance(Resources resources,
      Lazy<SnackbarManager> snackbarManager, TrustedWebActivityModel model,
      ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new DisclosureSnackbar(resources, snackbarManager, model, lifecycleDispatcher);
  }
}
