package marmojkfnf.dphnidckqxhm;

import android.content.ComponentName;
import android.content.Context;
import fmfjq.twyvy.xjhbp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4299a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f4300b;

    static {
        xjhbp.classescxclcy(44);
    }

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, i0.a("Y29udGV4dA=="));
        this.f4299a = context;
        this.f4300b = new ComponentName(context.getPackageName(), i0.a("bWFybW9qa2ZuZi51eHlmcmdjLmZhY250d3Uuc2FxeXBzc2cuQ2prYm9jZg=="));
        try {
            context.getPackageManager().getPackageInfo(context.getPackageName(), 16);
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public final native void run();
}
