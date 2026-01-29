package u0;

import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5463a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f5464b;

    public a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a a() {
        if (f5464b == null) {
            synchronized (f5463a) {
                if (f5464b == null) {
                    f5464b = new a();
                }
            }
        }
        return f5464b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r4, android.content.Intent r5, android.content.ServiceConnection r6, int r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = r5.getComponent()
            r1 = 0
            if (r0 != 0) goto L8
            goto L28
        L8:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r0)
            x0.a r2 = x0.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            android.content.Context r2 = r2.f5906a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            int r0 = r0.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L33
            java.lang.String r4 = "ConnectionTracker"
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r4, r5)
            return r1
        L33:
            boolean r4 = r4.bindService(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.a.b(android.content.Context, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
