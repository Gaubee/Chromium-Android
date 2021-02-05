// NetworkContextParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;


public final class NetworkContextParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 264;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(264, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String contextName;
    public String userAgent;
    public String acceptLanguage;
    public boolean enableBrotli;
    public String quicUserAgentId;
    public boolean enableReferrers;
    public boolean validateReferrerPolicyOnInitialRequest;
    public org.chromium.proxy_resolver.mojom.ProxyResolverFactory proxyResolverFactory;
    public org.chromium.mojo_base.mojom.FilePath cookiePath;
    public org.chromium.mojo_base.mojom.FilePath trustTokenPath;
    public boolean enableEncryptedCookies;
    public boolean restoreOldSessionCookies;
    public boolean persistSessionCookies;
    public boolean httpCacheEnabled;
    public int httpCacheMaxSize;
    public org.chromium.mojo_base.mojom.FilePath httpCachePath;
    public org.chromium.mojo_base.mojom.FilePath httpServerPropertiesPath;
    public org.chromium.mojo_base.mojom.FilePath transportSecurityPersisterPath;
    public boolean enableFtpUrlSupport;
    public boolean checkClearTextPermitted;
    public boolean disableIdleSocketsCloseOnMemoryPressure;
    public SslConfig initialSslConfig;
    public org.chromium.mojo.bindings.InterfaceRequest<SslConfigClient> sslConfigClientReceiver;
    public ProxyConfigWithAnnotation initialProxyConfig;
    public org.chromium.mojo.bindings.InterfaceRequest<ProxyConfigClient> proxyConfigClientReceiver;
    public CustomProxyConfig initialCustomProxyConfig;
    public org.chromium.mojo.bindings.InterfaceRequest<CustomProxyConfigClient> customProxyConfigClientReceiver;
    public CustomProxyConnectionObserver customProxyConnectionObserverRemote;
    public ProxyConfigPollerClient proxyConfigPollerClient;
    public ProxyErrorClient proxyErrorClient;
    public boolean pacQuickCheckEnabled;
    public boolean enableCertificateReporting;
    public boolean enforceChromeCtPolicy;
    public boolean enableExpectCtReporting;
    public boolean enableSctAuditing;
    public CtLogInfo[] ctLogs;
    public CtPolicy ctPolicy;
    public org.chromium.mojo_base.mojom.Time ctLogUpdateTime;
    public CertVerifierParams certVerifierParams;
    public CookieManagerParams cookieManagerParams;
    public org.chromium.mojo.bindings.InterfaceRequest<CookieManager> cookieManager;
    public boolean enableDomainReliability;
    public String domainReliabilityUploadReporter;
    public boolean discardDomainReliablityUploads;
    public org.chromium.mojo_base.mojom.TimeDelta reportingDeliveryInterval;
    public boolean skipReportingSendPermissionCheck;
    public CorsOriginAccessPatterns[] corsOriginAccessList;
    public String[] corsExemptHeaderList;
    public boolean allowAnyCorsExemptHeaderForBrowser;
    public String[] hstsPolicyBypassList;
    public org.chromium.mojo_base.mojom.FilePath reportingAndNelStorePath;
    public HttpAuthStaticNetworkContextParams httpAuthStaticNetworkContextParams;
    public boolean resetHttpCacheBackend;
    public boolean splitAuthCacheByNetworkIsolationKey;
    public boolean requireNetworkIsolationKey;

    private NetworkContextParams(int version) {
        super(STRUCT_SIZE, version);
        this.enableBrotli = (boolean) true;
        this.enableReferrers = (boolean) true;
        this.validateReferrerPolicyOnInitialRequest = (boolean) true;
        this.enableEncryptedCookies = (boolean) true;
        this.restoreOldSessionCookies = (boolean) false;
        this.persistSessionCookies = (boolean) false;
        this.httpCacheEnabled = (boolean) true;
        this.httpCacheMaxSize = (int) 0;
        this.enableFtpUrlSupport = (boolean) false;
        this.checkClearTextPermitted = (boolean) false;
        this.disableIdleSocketsCloseOnMemoryPressure = (boolean) false;
        this.pacQuickCheckEnabled = (boolean) true;
        this.enableCertificateReporting = (boolean) false;
        this.enforceChromeCtPolicy = (boolean) false;
        this.enableExpectCtReporting = (boolean) false;
        this.enableSctAuditing = (boolean) false;
        this.enableDomainReliability = (boolean) false;
        this.discardDomainReliablityUploads = (boolean) false;
        this.skipReportingSendPermissionCheck = (boolean) false;
        this.allowAnyCorsExemptHeaderForBrowser = (boolean) false;
        this.resetHttpCacheBackend = (boolean) false;
        this.splitAuthCacheByNetworkIsolationKey = (boolean) false;
        this.requireNetworkIsolationKey = (boolean) false;
    }

    public NetworkContextParams() {
        this(0);
    }

    public static NetworkContextParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static NetworkContextParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static NetworkContextParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        NetworkContextParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new NetworkContextParams(elementsOrVersion);
                {
                    
                result.contextName = decoder0.readString(8, true);
                }
                {
                    
                result.userAgent = decoder0.readString(16, false);
                }
                {
                    
                result.acceptLanguage = decoder0.readString(24, false);
                }
                {
                    
                result.enableBrotli = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.enableReferrers = decoder0.readBoolean(32, 1);
                }
                {
                    
                result.validateReferrerPolicyOnInitialRequest = decoder0.readBoolean(32, 2);
                }
                {
                    
                result.enableEncryptedCookies = decoder0.readBoolean(32, 3);
                }
                {
                    
                result.restoreOldSessionCookies = decoder0.readBoolean(32, 4);
                }
                {
                    
                result.persistSessionCookies = decoder0.readBoolean(32, 5);
                }
                {
                    
                result.httpCacheEnabled = decoder0.readBoolean(32, 6);
                }
                {
                    
                result.enableFtpUrlSupport = decoder0.readBoolean(32, 7);
                }
                {
                    
                result.checkClearTextPermitted = decoder0.readBoolean(33, 0);
                }
                {
                    
                result.disableIdleSocketsCloseOnMemoryPressure = decoder0.readBoolean(33, 1);
                }
                {
                    
                result.pacQuickCheckEnabled = decoder0.readBoolean(33, 2);
                }
                {
                    
                result.enableCertificateReporting = decoder0.readBoolean(33, 3);
                }
                {
                    
                result.enforceChromeCtPolicy = decoder0.readBoolean(33, 4);
                }
                {
                    
                result.enableExpectCtReporting = decoder0.readBoolean(33, 5);
                }
                {
                    
                result.enableSctAuditing = decoder0.readBoolean(33, 6);
                }
                {
                    
                result.enableDomainReliability = decoder0.readBoolean(33, 7);
                }
                {
                    
                result.discardDomainReliablityUploads = decoder0.readBoolean(34, 0);
                }
                {
                    
                result.skipReportingSendPermissionCheck = decoder0.readBoolean(34, 1);
                }
                {
                    
                result.allowAnyCorsExemptHeaderForBrowser = decoder0.readBoolean(34, 2);
                }
                {
                    
                result.resetHttpCacheBackend = decoder0.readBoolean(34, 3);
                }
                {
                    
                result.splitAuthCacheByNetworkIsolationKey = decoder0.readBoolean(34, 4);
                }
                {
                    
                result.requireNetworkIsolationKey = decoder0.readBoolean(34, 5);
                }
                {
                    
                result.httpCacheMaxSize = decoder0.readInt(36);
                }
                {
                    
                result.quicUserAgentId = decoder0.readString(40, false);
                }
                {
                    
                result.proxyResolverFactory = decoder0.readServiceInterface(48, true, org.chromium.proxy_resolver.mojom.ProxyResolverFactory.MANAGER);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.cookiePath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                result.trustTokenPath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, true);
                result.httpCachePath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, true);
                result.httpServerPropertiesPath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, true);
                result.transportSecurityPersisterPath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, true);
                result.initialSslConfig = SslConfig.decode(decoder1);
                }
                {
                    
                result.sslConfigClientReceiver = decoder0.readInterfaceRequest(104, true);
                }
                {
                    
                result.proxyConfigClientReceiver = decoder0.readInterfaceRequest(108, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(112, true);
                result.initialProxyConfig = ProxyConfigWithAnnotation.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(120, true);
                result.initialCustomProxyConfig = CustomProxyConfig.decode(decoder1);
                }
                {
                    
                result.customProxyConfigClientReceiver = decoder0.readInterfaceRequest(128, true);
                }
                {
                    
                result.customProxyConnectionObserverRemote = decoder0.readServiceInterface(132, true, CustomProxyConnectionObserver.MANAGER);
                }
                {
                    
                result.proxyConfigPollerClient = decoder0.readServiceInterface(140, true, ProxyConfigPollerClient.MANAGER);
                }
                {
                    
                result.proxyErrorClient = decoder0.readServiceInterface(148, true, ProxyErrorClient.MANAGER);
                }
                {
                    
                result.cookieManager = decoder0.readInterfaceRequest(156, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(160, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.ctLogs = new CtLogInfo[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.ctLogs[i1] = CtLogInfo.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(168, true);
                result.ctPolicy = CtPolicy.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(176, false);
                result.ctLogUpdateTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                result.certVerifierParams = CertVerifierParams.decode(decoder0, 184);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(200, true);
                result.cookieManagerParams = CookieManagerParams.decode(decoder1);
                }
                {
                    
                result.domainReliabilityUploadReporter = decoder0.readString(208, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(216, true);
                result.reportingDeliveryInterval = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(224, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.corsOriginAccessList = new CorsOriginAccessPatterns[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.corsOriginAccessList[i1] = CorsOriginAccessPatterns.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(232, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.corsExemptHeaderList = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.corsExemptHeaderList[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(240, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.hstsPolicyBypassList = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.hstsPolicyBypassList[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(248, true);
                result.reportingAndNelStorePath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(256, true);
                result.httpAuthStaticNetworkContextParams = HttpAuthStaticNetworkContextParams.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.contextName, 8, true);
        
        encoder0.encode(this.userAgent, 16, false);
        
        encoder0.encode(this.acceptLanguage, 24, false);
        
        encoder0.encode(this.enableBrotli, 32, 0);
        
        encoder0.encode(this.enableReferrers, 32, 1);
        
        encoder0.encode(this.validateReferrerPolicyOnInitialRequest, 32, 2);
        
        encoder0.encode(this.enableEncryptedCookies, 32, 3);
        
        encoder0.encode(this.restoreOldSessionCookies, 32, 4);
        
        encoder0.encode(this.persistSessionCookies, 32, 5);
        
        encoder0.encode(this.httpCacheEnabled, 32, 6);
        
        encoder0.encode(this.enableFtpUrlSupport, 32, 7);
        
        encoder0.encode(this.checkClearTextPermitted, 33, 0);
        
        encoder0.encode(this.disableIdleSocketsCloseOnMemoryPressure, 33, 1);
        
        encoder0.encode(this.pacQuickCheckEnabled, 33, 2);
        
        encoder0.encode(this.enableCertificateReporting, 33, 3);
        
        encoder0.encode(this.enforceChromeCtPolicy, 33, 4);
        
        encoder0.encode(this.enableExpectCtReporting, 33, 5);
        
        encoder0.encode(this.enableSctAuditing, 33, 6);
        
        encoder0.encode(this.enableDomainReliability, 33, 7);
        
        encoder0.encode(this.discardDomainReliablityUploads, 34, 0);
        
        encoder0.encode(this.skipReportingSendPermissionCheck, 34, 1);
        
        encoder0.encode(this.allowAnyCorsExemptHeaderForBrowser, 34, 2);
        
        encoder0.encode(this.resetHttpCacheBackend, 34, 3);
        
        encoder0.encode(this.splitAuthCacheByNetworkIsolationKey, 34, 4);
        
        encoder0.encode(this.requireNetworkIsolationKey, 34, 5);
        
        encoder0.encode(this.httpCacheMaxSize, 36);
        
        encoder0.encode(this.quicUserAgentId, 40, false);
        
        encoder0.encode(this.proxyResolverFactory, 48, true, org.chromium.proxy_resolver.mojom.ProxyResolverFactory.MANAGER);
        
        encoder0.encode(this.cookiePath, 56, true);
        
        encoder0.encode(this.trustTokenPath, 64, true);
        
        encoder0.encode(this.httpCachePath, 72, true);
        
        encoder0.encode(this.httpServerPropertiesPath, 80, true);
        
        encoder0.encode(this.transportSecurityPersisterPath, 88, true);
        
        encoder0.encode(this.initialSslConfig, 96, true);
        
        encoder0.encode(this.sslConfigClientReceiver, 104, true);
        
        encoder0.encode(this.proxyConfigClientReceiver, 108, true);
        
        encoder0.encode(this.initialProxyConfig, 112, true);
        
        encoder0.encode(this.initialCustomProxyConfig, 120, true);
        
        encoder0.encode(this.customProxyConfigClientReceiver, 128, true);
        
        encoder0.encode(this.customProxyConnectionObserverRemote, 132, true, CustomProxyConnectionObserver.MANAGER);
        
        encoder0.encode(this.proxyConfigPollerClient, 140, true, ProxyConfigPollerClient.MANAGER);
        
        encoder0.encode(this.proxyErrorClient, 148, true, ProxyErrorClient.MANAGER);
        
        encoder0.encode(this.cookieManager, 156, true);
        
        if (this.ctLogs == null) {
            encoder0.encodeNullPointer(160, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.ctLogs.length, 160, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.ctLogs.length; ++i0) {
                
                encoder1.encode(this.ctLogs[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.ctPolicy, 168, true);
        
        encoder0.encode(this.ctLogUpdateTime, 176, false);
        
        encoder0.encode(this.certVerifierParams, 184, true);
        
        encoder0.encode(this.cookieManagerParams, 200, true);
        
        encoder0.encode(this.domainReliabilityUploadReporter, 208, false);
        
        encoder0.encode(this.reportingDeliveryInterval, 216, true);
        
        if (this.corsOriginAccessList == null) {
            encoder0.encodeNullPointer(224, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.corsOriginAccessList.length, 224, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.corsOriginAccessList.length; ++i0) {
                
                encoder1.encode(this.corsOriginAccessList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.corsExemptHeaderList == null) {
            encoder0.encodeNullPointer(232, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.corsExemptHeaderList.length, 232, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.corsExemptHeaderList.length; ++i0) {
                
                encoder1.encode(this.corsExemptHeaderList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.hstsPolicyBypassList == null) {
            encoder0.encodeNullPointer(240, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.hstsPolicyBypassList.length, 240, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.hstsPolicyBypassList.length; ++i0) {
                
                encoder1.encode(this.hstsPolicyBypassList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.reportingAndNelStorePath, 248, true);
        
        encoder0.encode(this.httpAuthStaticNetworkContextParams, 256, true);
    }
}