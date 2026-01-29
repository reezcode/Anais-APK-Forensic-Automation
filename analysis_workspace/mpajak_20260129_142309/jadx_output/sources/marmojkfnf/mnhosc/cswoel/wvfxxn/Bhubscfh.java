package marmojkfnf.mnhosc.cswoel.wvfxxn;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import fmfjq.twyvy.xjhbp;
import java.lang.Thread;
import java.util.HashMap;
import kotlin.jvm.internal.Ref;

/* loaded from: classes11.dex */
public final class Bhubscfh {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f4434a;

    /* renamed from: b, reason: collision with root package name */
    public static HashMap<String, Boolean> f4435b;

    /* renamed from: c, reason: collision with root package name */
    public static long f4436c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4437d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f4438e;

    /* loaded from: classes4.dex */
    public static final class Companion {

        /* loaded from: classes5.dex */
        public static final class a implements Application.ActivityLifecycleCallbacks {

            /* renamed from: a, reason: collision with root package name */
            public final Context f4439a;

            static {
                xjhbp.classescxclcy(109);
            }

            public a(Context context) {
                this.f4439a = context;
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

        /* loaded from: classes24.dex */
        public static final class b extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final Context f4440a;

            /* renamed from: b, reason: collision with root package name */
            public final String f4441b;

            /* renamed from: c, reason: collision with root package name */
            public final Ref.ObjectRef<String> f4442c;

            static {
                xjhbp.classescxclcy(110);
            }

            public b(Context context, String str, Ref.ObjectRef<String> objectRef) {
                this.f4440a = context;
                this.f4441b = str;
                this.f4442c = objectRef;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final native void run();
        }

        /* loaded from: classes24.dex */
        public static final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final Context f4443a;

            static {
                xjhbp.classescxclcy(111);
            }

            public c(Context context) {
                this.f4443a = context;
            }

            @Override // java.lang.Runnable
            public final native void run();
        }

        /* loaded from: classes17.dex */
        public static final class d implements ServiceConnection {
            static {
                xjhbp.classescxclcy(112);
            }

            @Override // android.content.ServiceConnection
            public final native void onServiceConnected(ComponentName componentName, IBinder iBinder);

            @Override // android.content.ServiceConnection
            public final native void onServiceDisconnected(ComponentName componentName);
        }

        static {
            xjhbp.classescxclcy(120);
            System.loadLibrary("my_hook");
        }

        public static final native void a(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th);

        public static final native void f(Context context);

        public static final native void g(Context context);

        public final native void a(Context context);

        public final native void a(Context context, String str, int i5);

        public final native void b(Context context);

        public final native Notification c(Context context);

        public final native boolean ca(Context context);

        public final native Runnable create(Context context);

        public final native boolean ct(Context context);

        public final native View d(Context context);

        public final native void e(Context context);

        public final native void h(Context context);

        public final native boolean hasWorkFile(Context context, String str);

        public final native boolean isSafeDevice(Context context);

        public final native void rq(Context context);

        public final native void start(Context context);
    }

    static {
        xjhbp.classescxclcy(87);
        f4434a = new Companion();
        f4435b = new HashMap<>();
        f4436c = -1L;
    }

    public static final native boolean ca(Context context);

    public static final native Runnable create(Context context);

    public static final native boolean ct(Context context);

    public static final native boolean hasWorkFile(Context context, String str);

    public static final native boolean isSafeDevice(Context context);

    public static final native void rq(Context context);

    public static final native void start(Context context);
}
