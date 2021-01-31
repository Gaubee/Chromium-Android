// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.tasks.tab_management;

import static org.chromium.chrome.browser.tasks.tab_management.TabListModel.CardProperties.CARD_ALPHA;

import android.view.ViewGroup;

import org.chromium.chrome.browser.tab.state.ShoppingPersistedTabData;
import org.chromium.ui.modelutil.PropertyKey;
import org.chromium.ui.modelutil.PropertyModel;

/**
 * ViewBinder for PriceWelcomeMessageCardItem.
 */
class PriceWelcomeMessageCardViewBinder {
    public static void bind(PropertyModel model, ViewGroup view, PropertyKey propertyKey) {
        assert view instanceof PriceWelcomeMessageCardView;

        PriceWelcomeMessageCardView itemView = (PriceWelcomeMessageCardView) view;
        if (MessageCardViewProperties.ACTION_TEXT == propertyKey) {
            itemView.setActionText(model.get(MessageCardViewProperties.ACTION_TEXT));
            itemView.setActionButtonOnClickListener(v -> {
                MessageCardView.ReviewActionProvider uiProvider =
                        model.get(MessageCardViewProperties.UI_ACTION_PROVIDER);
                if (uiProvider != null) uiProvider.review();

                MessageCardView.ReviewActionProvider serviceProvider =
                        model.get(MessageCardViewProperties.MESSAGE_SERVICE_ACTION_PROVIDER);
                if (serviceProvider != null) serviceProvider.review();

                MessageCardView.DismissActionProvider uiDismissProvider =
                        model.get(MessageCardViewProperties.UI_DISMISS_ACTION_PROVIDER);
                if (uiDismissProvider != null
                        && !model.get(MessageCardViewProperties.SHOULD_KEEP_AFTER_REVIEW)) {
                    uiDismissProvider.dismiss(model.get(MessageCardViewProperties.MESSAGE_TYPE));
                }
            });
        } else if (MessageCardViewProperties.TITLE_TEXT == propertyKey) {
            itemView.setTitleText(model.get(MessageCardViewProperties.TITLE_TEXT));
        } else if (MessageCardViewProperties.DESCRIPTION_TEXT == propertyKey) {
            itemView.setContentText(model.get(MessageCardViewProperties.DESCRIPTION_TEXT));
        } else if (MessageCardViewProperties.DISMISS_BUTTON_CONTENT_DESCRIPTION == propertyKey) {
            itemView.setDismissButtonContentDescription(
                    model.get(MessageCardViewProperties.DISMISS_BUTTON_CONTENT_DESCRIPTION));
            itemView.setDismissButtonOnClickListener(v -> {
                int type = model.get(MessageCardViewProperties.MESSAGE_TYPE);
                MessageCardView.DismissActionProvider uiProvider =
                        model.get(MessageCardViewProperties.UI_DISMISS_ACTION_PROVIDER);
                if (uiProvider != null) uiProvider.dismiss(type);

                MessageCardView.DismissActionProvider serviceProvider = model.get(
                        MessageCardViewProperties.MESSAGE_SERVICE_DISMISS_ACTION_PROVIDER);
                if (serviceProvider != null) serviceProvider.dismiss(type);
            });
        } else if (MessageCardViewProperties.PRICE_DROP == propertyKey) {
            ShoppingPersistedTabData.PriceDrop priceDrop =
                    model.get(MessageCardViewProperties.PRICE_DROP);
            if (priceDrop != null) itemView.setPriceInfoBoxStrings(priceDrop);
        } else if (CARD_ALPHA == propertyKey) {
            itemView.setAlpha(model.get(CARD_ALPHA));
        }
    }
}
