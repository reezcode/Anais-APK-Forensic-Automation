package marmojkfnf.dphnidckqxhm;

import android.os.Handler;
import android.os.HandlerThread;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes21.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static volatile g f4327b;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4328a;

    static {
        xjhbp.classescxclcy(42);
    }

    public g() {
        HandlerThread handlerThread = new HandlerThread(String.valueOf(Math.random()));
        handlerThread.start();
        this.f4328a = new Handler(handlerThread.getLooper());
    }

    public static native g a();
}
