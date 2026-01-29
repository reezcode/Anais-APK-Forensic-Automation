package marmojkfnf.dphnidckqxhm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import fmfjq.twyvy.xjhbp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4319a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f4320b;

    /* renamed from: c, reason: collision with root package name */
    public static int f4321c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4322d;

    /* renamed from: e, reason: collision with root package name */
    public static f0 f4323e;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap<Integer, WeakReference<Activity>> f4324f;

    /* loaded from: classes21.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4325a;

        static {
            xjhbp.classescxclcy(31);
        }

        public a(Context context) {
            Intrinsics.checkNotNullParameter(context, i0.a("Y29udGV4dA=="));
            this.f4325a = context;
        }

        @Override // java.lang.Runnable
        public final native void run();
    }

    static {
        xjhbp.classescxclcy(41);
        f4319a = new f();
        f4320b = new Handler(Looper.getMainLooper());
        f4324f = new HashMap<>();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final native void onActivityStopped(Activity activity);
}
