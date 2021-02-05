package org.chromium.chrome.browser.webauth.authenticator;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CableAuthenticatorJni implements CableAuthenticator.Natives {
  private static CableAuthenticator.Natives testInstance;

  public static final JniStaticTestMocker<CableAuthenticator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webauth.authenticator.CableAuthenticator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webauth.authenticator.CableAuthenticator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public byte[] setup(long registration, String activityClassName, long networkContext,
      byte[] stateBytes) {
    return (byte[])GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_setup(registration, activityClassName, networkContext, stateBytes);
  }

  @Override
  public void startUSB(CableAuthenticator cableAuthenticator, USBHandler usbDevice) {
    GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_startUSB(cableAuthenticator, usbDevice);
  }

  @Override
  public boolean startQR(CableAuthenticator cableAuthenticator, String authenticatorName,
      String qrUrl, boolean link) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_startQR(cableAuthenticator, authenticatorName, qrUrl, link);
  }

  @Override
  public boolean startServerLink(CableAuthenticator cableAuthenticator, byte[] serverLinkData) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_startServerLink(cableAuthenticator, serverLinkData);
  }

  @Override
  public byte[] unlink() {
    return (byte[])GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_unlink();
  }

  @Override
  public void onInteractionReady(CableAuthenticator cableAuthenticator) {
    GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_onInteractionReady(cableAuthenticator);
  }

  @Override
  public void stop() {
    GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_stop();
  }

  @Override
  public void onCloudMessage(long event, boolean needToDisableBluetooth) {
    GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_onCloudMessage(event, needToDisableBluetooth);
  }

  @Override
  public void onAuthenticatorAttestationResponse(int ctapStatus, byte[] clientDataJSON,
      byte[] attestationObject) {
    GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_onAuthenticatorAttestationResponse(ctapStatus, clientDataJSON, attestationObject);
  }

  @Override
  public void onAuthenticatorAssertionResponse(int ctapStatus, byte[] clientDataJSON,
      byte[] credentialID, byte[] authenticatorData, byte[] signature) {
    GEN_JNI.org_chromium_chrome_browser_webauth_authenticator_CableAuthenticator_onAuthenticatorAssertionResponse(ctapStatus, clientDataJSON, credentialID, authenticatorData, signature);
  }

  public static CableAuthenticator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webauth.authenticator.CableAuthenticator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CableAuthenticatorJni();
  }
}
