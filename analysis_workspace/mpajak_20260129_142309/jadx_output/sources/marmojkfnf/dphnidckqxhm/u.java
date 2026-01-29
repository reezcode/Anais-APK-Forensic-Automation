package marmojkfnf.dphnidckqxhm;

import android.os.IBinder;
import android.os.Parcel;
import fmfjq.twyvy.xjhbp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f4402a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f4403b;

    /* renamed from: c, reason: collision with root package name */
    public IBinder f4404c;

    /* renamed from: d, reason: collision with root package name */
    public int f4405d;

    static {
        xjhbp.classescxclcy(58);
    }

    public u(String str) {
        Intrinsics.checkNotNullParameter(str, i0.a("cGFja2FnZU5hbWU="));
        this.f4402a = str;
        this.f4403b = c();
        a();
        this.f4404c = b();
        this.f4405d = 15;
    }

    public final native void a();

    public final native IBinder b();

    public final native Parcel c();

    @Override // java.lang.Runnable
    public final native void run();
}
