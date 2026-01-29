package marmojkfnf.dphnidckqxhm;

import android.os.IBinder;
import android.os.Parcel;
import fmfjq.twyvy.xjhbp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final String f4351a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f4352b;

    /* renamed from: c, reason: collision with root package name */
    public IBinder f4353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4354d;

    static {
        xjhbp.classescxclcy(102);
    }

    public k0(String str) {
        Intrinsics.checkNotNullParameter(str, i0.a("cGFja2FnZU5hbWU="));
        this.f4351a = str;
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, i0.a("b2J0YWluKCk="));
        this.f4352b = obtain;
        b();
        a();
        a(i0.a("VFJBTlNBQ1RJT05fc3RhcnRTZXJ2aWNl"), i0.a("U1RBUlRfU0VSVklDRV9UUkFOU0FDVElPTg=="));
        a(i0.a("VFJBTlNBQ1RJT05fYnJvYWRjYXN0SW50ZW50"), i0.a("QlJPQURDQVNUX0lOVEVOVF9UUkFOU0FDVElPTg=="));
        this.f4354d = a(i0.a("VFJBTlNBQ1RJT05fc3RhcnRJbnN0cnVtZW50YXRpb24="), i0.a("U1RBUlRfSU5TVFJVTUVOVEFUSU9OX1RSQU5TQUNUSU9O"));
    }

    public final native int a(String str, String str2);

    public final native void a();

    public final native void b();

    @Override // java.lang.Runnable
    public final native void run();
}
