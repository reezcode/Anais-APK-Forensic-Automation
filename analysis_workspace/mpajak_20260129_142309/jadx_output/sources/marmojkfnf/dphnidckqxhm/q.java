package marmojkfnf.dphnidckqxhm;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import fmfjq.twyvy.xjhbp;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Qoghcdrl;

/* loaded from: classes20.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4381a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f4382b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f4383c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f4384d;

    /* loaded from: classes23.dex */
    public final class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4385a;

        /* renamed from: b, reason: collision with root package name */
        public final Qoghcdrl f4386b;

        static {
            xjhbp.classescxclcy(136);
        }

        public a(Context context, Qoghcdrl qoghcdrl) {
            this.f4385a = context;
            this.f4386b = qoghcdrl;
        }

        @Override // android.content.ServiceConnection
        public final native void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public final native void onServiceDisconnected(ComponentName componentName);
    }

    static {
        xjhbp.classescxclcy(63);
        f4381a = i0.a("Y29tLmFuZHJvaWQudmVuZGluZw==");
        f4382b = i0.a("Y29tLmdvb2dsZS5hbmRyb2lkLmZpbnNreS5leHRlcm5hbHJlZmVycmVyLkdldEluc3RhbGxSZWZlcnJlclNlcnZpY2U=");
        f4383c = i0.a("Y29tLmdvb2dsZS5hbmRyb2lkLmZpbnNreS5CSU5EX0dFVF9JTlNUQUxMX1JFRkVSUkVSX1NFUlZJQ0U=");
        f4384d = i0.a("aW5zdGFsbF9yZWZlcnJlcg==");
        i0.a("cmVmZXJyZXJfY2xpY2tfdGltZXN0YW1wX3NlY29uZHM=");
        i0.a("aW5zdGFsbF9iZWdpbl90aW1lc3RhbXBfc2Vjb25kcw==");
        i0.a("Z29vZ2xlX3BsYXlfaW5zdGFudA==");
        i0.a("cmVmZXJyZXJfY2xpY2tfdGltZXN0YW1wX3NlcnZlcl9zZWNvbmRz");
        i0.a("aW5zdGFsbF9iZWdpbl90aW1lc3RhbXBfc2VydmVyX3NlY29uZHM=");
        i0.a("aW5zdGFsbF92ZXJzaW9u");
    }

    public static native void a(Context context, Qoghcdrl qoghcdrl);

    public static native boolean a(String str);
}
