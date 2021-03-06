package org.chromium.chrome.browser.customtabs;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.compositor.bottombar.ephemeraltab.EphemeralTabCoordinator;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabBrowserControlsVisibilityDelegate;
import org.chromium.chrome.browser.multiwindow.MultiWindowUtils;
import org.chromium.components.externalauth.ExternalAuthUtils;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabDelegateFactory_Factory implements Factory<CustomTabDelegateFactory> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider;

  private final Provider<ExternalAuthUtils> authUtilsProvider;

  private final Provider<MultiWindowUtils> multiWindowUtilsProvider;

  private final Provider<Verifier> verifierProvider;

  private final Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider;

  public CustomTabDelegateFactory_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider, Provider<Verifier> verifierProvider,
      Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.visibilityDelegateProvider = visibilityDelegateProvider;
    this.authUtilsProvider = authUtilsProvider;
    this.multiWindowUtilsProvider = multiWindowUtilsProvider;
    this.verifierProvider = verifierProvider;
    this.ephemeralTabCoordinatorProvider = ephemeralTabCoordinatorProvider;
  }

  @Override
  public CustomTabDelegateFactory get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), visibilityDelegateProvider.get(), authUtilsProvider.get(), multiWindowUtilsProvider.get(), verifierProvider.get(), DoubleCheck.lazy(ephemeralTabCoordinatorProvider));
  }

  public static CustomTabDelegateFactory_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<ExternalAuthUtils> authUtilsProvider,
      Provider<MultiWindowUtils> multiWindowUtilsProvider, Provider<Verifier> verifierProvider,
      Provider<EphemeralTabCoordinator> ephemeralTabCoordinatorProvider) {
    return new CustomTabDelegateFactory_Factory(activityProvider, intentDataProvider, visibilityDelegateProvider, authUtilsProvider, multiWindowUtilsProvider, verifierProvider, ephemeralTabCoordinatorProvider);
  }

  public static CustomTabDelegateFactory newInstance(ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabBrowserControlsVisibilityDelegate visibilityDelegate, ExternalAuthUtils authUtils,
      MultiWindowUtils multiWindowUtils, Verifier verifier,
      Lazy<EphemeralTabCoordinator> ephemeralTabCoordinator) {
    return new CustomTabDelegateFactory(activity, intentDataProvider, visibilityDelegate, authUtils, multiWindowUtils, verifier, ephemeralTabCoordinator);
  }
}
