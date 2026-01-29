package marmojkfnf.dphnidckqxhm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import fmfjq.twyvy.xjhbp;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f4340a;

    /* renamed from: b, reason: collision with root package name */
    public static Handler f4341b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4342c;

    /* loaded from: classes21.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4343a;

        /* renamed from: b, reason: collision with root package name */
        public final Ref.LongRef f4344b;

        static {
            xjhbp.classescxclcy(28);
        }

        public a(Context context, Ref.LongRef longRef) {
            this.f4343a = context;
            this.f4344b = longRef;
        }

        @Override // java.lang.Runnable
        public final native void run();
    }

    static {
        xjhbp.classescxclcy(37);
        f4340a = new j();
        f4341b = new Handler(Looper.getMainLooper());
    }

    public final native void a(Context context);
}
