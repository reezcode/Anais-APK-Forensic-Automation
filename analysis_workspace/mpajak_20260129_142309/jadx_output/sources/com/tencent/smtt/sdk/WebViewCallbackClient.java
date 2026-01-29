package com.tencent.smtt.sdk;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes18.dex */
public interface WebViewCallbackClient {
    void computeScroll(View view);

    boolean dispatchTouchEvent(MotionEvent motionEvent, View view);

    void invalidate();

    boolean onInterceptTouchEvent(MotionEvent motionEvent, View view);

    void onOverScrolled(int i5, int i6, boolean z4, boolean z5, View view);

    void onScrollChanged(int i5, int i6, int i7, int i8, View view);

    boolean onTouchEvent(MotionEvent motionEvent, View view);

    boolean overScrollBy(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z4, View view);
}
