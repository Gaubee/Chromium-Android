// Copyright 2013 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.infobars;

/**
 * Functions needed to display an InfoBar UI.
 */
public interface InfoBarInteractionHandler {
    /**
     * Handles click on the infobar. It is invoked before one of the following functions.
     */
    void onClick();

    /**
     * Takes some action related to the link being clicked.
     */
    void onLinkClicked();

    /**
     * Takes some action related to the close button being clicked.
     */
    void onCloseButtonClicked();

    /**
     * Performs some action related to either the primary or secondary button being pressed.
     * @param isPrimaryButton True if the primary button was clicked, false otherwise.
     */
    void onButtonClicked(boolean isPrimaryButton);
}
