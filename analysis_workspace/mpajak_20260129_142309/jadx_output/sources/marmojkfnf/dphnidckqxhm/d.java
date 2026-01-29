package marmojkfnf.dphnidckqxhm;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import fmfjq.twyvy.xjhbp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4294a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f4295b;

    /* renamed from: c, reason: collision with root package name */
    public IBinder f4296c;

    /* renamed from: d, reason: collision with root package name */
    public int f4297d;

    static {
        xjhbp.classescxclcy(43);
    }

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, i0.a("Y29udGV4dA=="));
        this.f4294a = context;
        this.f4295b = c();
        a();
        this.f4296c = b();
        this.f4297d = 27;
    }

    public final native void a();

    public final native IBinder b();

    public final native Parcel c();

    @Override // java.lang.Runnable
    public final native void run();
}
