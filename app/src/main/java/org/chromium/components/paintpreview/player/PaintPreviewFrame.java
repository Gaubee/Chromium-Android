// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.paintpreview.player;

import android.graphics.Rect;

import androidx.annotation.VisibleForTesting;

import org.chromium.base.UnguessableToken;

import java.util.Arrays;

/**
 * This class represents an individual frame in the context of Paint Preview. A frame can be either
 * an embedded iframe, or the root frame of the web page.
 * Each frame has a GUID, content width and height.
 * Optionally, a frame can have other frames (iframes) as its children. or sub-frames.
 */
class PaintPreviewFrame {
    private final UnguessableToken mGuid;
    // The content size of this frame. In native, this is represented as 'scroll extent'.
    private final int mContentWidth;
    private final int mContentHeight;
    // Other frames that this frame embeds, its sub-frames.
    private PaintPreviewFrame[] mSubFrames;
    // The coordinates of the sub-frames relative to this frame.
    private Rect[] mSubFrameClips;
    // The initial scroll position of this frame.
    private final int mInitialScrollX;
    private final int mInitialScrollY;

    PaintPreviewFrame(UnguessableToken guid, int contentWidth, int contentHeight,
            int initialScrollX, int initialScrollY) {
        mGuid = guid;
        mContentWidth = contentWidth;
        mContentHeight = contentHeight;
        mInitialScrollX = initialScrollX;
        mInitialScrollY = initialScrollY;
    }

    private PaintPreviewFrame(UnguessableToken guid, int contentWidth, int contentHeight,
            int initialScrollX, int initialScrollY, PaintPreviewFrame[] subFrames,
            Rect[] subFrameClips) {
        mGuid = guid;
        mContentWidth = contentWidth;
        mContentHeight = contentHeight;
        mInitialScrollX = initialScrollX;
        mInitialScrollY = initialScrollY;
        mSubFrames = subFrames;
        mSubFrameClips = subFrameClips;
    }

    void setSubFrames(PaintPreviewFrame[] subFrames) {
        mSubFrames = subFrames;
    }

    void setSubFrameClips(Rect[] subFrameClips) {
        mSubFrameClips = subFrameClips;
    }

    UnguessableToken getGuid() {
        return mGuid;
    }

    int getContentWidth() {
        return mContentWidth;
    }

    int getContentHeight() {
        return mContentHeight;
    }

    int getInitialScrollX() {
        return mInitialScrollX;
    }

    int getInitialScrollY() {
        return mInitialScrollY;
    }

    PaintPreviewFrame[] getSubFrames() {
        return mSubFrames;
    }

    Rect[] getSubFrameClips() {
        return mSubFrameClips;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        PaintPreviewFrame other = (PaintPreviewFrame) obj;
        if (!this.mGuid.equals(other.mGuid)) return false;

        if (this.mContentHeight != other.mContentHeight) return false;

        if (this.mContentWidth != other.mContentWidth) return false;

        if (!Arrays.equals(this.mSubFrames, other.mSubFrames)) return false;

        return Arrays.equals(this.mSubFrameClips, other.mSubFrameClips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guid : ");
        sb.append(mGuid);
        sb.append(", ContentWidth : ");
        sb.append(mContentWidth);
        sb.append(", ContentHeight: ");
        sb.append(mContentHeight);
        sb.append(", SubFrames: ");
        sb.append(Arrays.deepToString(mSubFrames));
        sb.append(", SubFrameClips: ");
        sb.append(Arrays.deepToString(mSubFrameClips));
        return sb.toString();
    }

    @VisibleForTesting
    static PaintPreviewFrame createInstanceForTest(UnguessableToken guid, int contentWidth,
            int contentHeight, int initialScrollX, int initialScrollY,
            PaintPreviewFrame[] subFrames, Rect[] subFrameClips) {
        return new PaintPreviewFrame(guid, contentWidth, contentHeight, initialScrollX,
                initialScrollY, subFrames, subFrameClips);
    }
}
