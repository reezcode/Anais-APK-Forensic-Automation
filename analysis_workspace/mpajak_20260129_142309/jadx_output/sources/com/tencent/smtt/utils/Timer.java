package com.tencent.smtt.utils;

/* loaded from: classes25.dex */
public class Timer {
    public final int timeOut;

    public Timer(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("time out can not < 0, current is ", i5));
        }
        this.timeOut = i5;
    }

    public void onTimeOut() {
    }
}
