// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.payments;

import org.chromium.payments.mojom.PayerDetail;
import org.chromium.payments.mojom.PaymentOptions;
import org.chromium.payments.mojom.PaymentResponse;

/**
 * The helper class that generates a {@link PaymentResponse} with the input of payment details.
 * Compared to ChromePaymentResponseHelper, this helper does not handle the Autofill data, and so
 * can be used for WebLayerPaymentRequestService.
 */
public class PaymentResponseHelper implements PaymentResponseHelperInterface {
    private final PaymentResponse mPaymentResponse;
    private final PaymentOptions mPaymentOptions;
    private final boolean mPaymentAppHandlesShippingAddress;

    /**
     * Creates an instance of the helper.
     * @param paymentAppHandlesShippingAddress Whether the selected payment app handles shipping
     *        address.
     * @param paymentOptions The payment options specified in the payment request.
     */
    public PaymentResponseHelper(
            boolean paymentAppHandlesShippingAddress, PaymentOptions paymentOptions) {
        mPaymentAppHandlesShippingAddress = paymentAppHandlesShippingAddress;
        mPaymentOptions = paymentOptions;
        mPaymentResponse = new PaymentResponse();
        mPaymentResponse.payer = new PayerDetail();
    }

    @Override
    public void generatePaymentResponse(String methodName, String stringifiedDetails,
            PayerData payerData, PaymentResponseResultCallback resultCallback) {
        mPaymentResponse.methodName = methodName;
        mPaymentResponse.stringifiedDetails = stringifiedDetails;
        // Set up the shipping section of the response when it comes from payment app.
        if (mPaymentOptions.requestShipping && mPaymentAppHandlesShippingAddress) {
            mPaymentResponse.shippingAddress =
                    PaymentAddressTypeConverter.convertAddressToMojoPaymentAddress(
                            payerData.shippingAddress);
            mPaymentResponse.shippingOption = payerData.selectedShippingOptionId;
        }

        mPaymentResponse.payer.name = payerData.payerName;
        mPaymentResponse.payer.phone = payerData.payerPhone;
        mPaymentResponse.payer.email = payerData.payerEmail;

        resultCallback.onPaymentResponseReady(mPaymentResponse);
    }
}
