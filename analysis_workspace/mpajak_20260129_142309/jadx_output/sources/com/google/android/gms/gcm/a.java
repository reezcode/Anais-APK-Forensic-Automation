package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import d1.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import z0.k;

/* loaded from: classes23.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("GcmNetworkManager.class")
    public static a f683c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f684a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final Map<String, Map<String, Boolean>> f685b = new ArrayMap();

    public a(Context context) {
        this.f684a = context;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f683c == null) {
                f683c = new a(context.getApplicationContext());
            }
            aVar = f683c;
        }
        return aVar;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    public static void c(Throwable th, k kVar) {
        if (th == null) {
            kVar.close();
            return;
        }
        try {
            kVar.close();
        } catch (Throwable th2) {
            e.f2480a.L(th, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0.j d() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f684a
            int r1 = z0.a.f6098a
            java.lang.String r1 = a1.c.f30b
            r2 = 0
            if (r1 == 0) goto Lb
            goto L86
        Lb:
            android.os.Process.myUid()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            boolean r3 = v0.b.a()
            r4 = 1
            if (r3 != 0) goto L44
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r5)
            java.util.List r3 = r1.queryIntentServices(r3, r2)
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L40
            java.lang.Object r6 = r3.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ServiceInfo r6 = r6.serviceInfo
            java.lang.String r6 = r6.packageName
            boolean r6 = a1.c.b(r1, r6, r5)
            if (r6 == 0) goto L28
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            if (r3 == 0) goto L44
            goto L7d
        L44:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r5)
            java.util.List r3 = r1.queryBroadcastReceivers(r3, r2)
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r3.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.packageName
            boolean r6 = a1.c.b(r1, r6, r5)
            if (r6 == 0) goto L53
            goto L6b
        L6a:
            r4 = 0
        L6b:
            if (r4 == 0) goto L6e
            goto L7d
        L6e:
            java.lang.String r3 = "InstanceID"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r3, r4)
            java.lang.String r4 = "com.google.android.gms"
            boolean r1 = a1.c.a(r1, r4)
            if (r1 == 0) goto L80
        L7d:
            java.lang.String r1 = a1.c.f30b
            goto L86
        L80:
            java.lang.String r1 = "Google Play services is missing, unable to get tokens"
            android.util.Log.w(r3, r1)
            r1 = 0
        L86:
            if (r1 == 0) goto L95
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            if (r0 == 0) goto L95
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95
            goto L96
        L95:
            r0 = -1
        L96:
            r1 = 5000000(0x4c4b40, float:7.006492E-39)
            if (r0 >= r1) goto La8
            java.lang.String r0 = "GcmNetworkManager"
            java.lang.String r1 = "Google Play services is not available, dropping all GcmNetworkManager requests"
            android.util.Log.e(r0, r1)
            i.g r0 = new i.g
            r0.<init>()
            return r0
        La8:
            r.t r0 = new r.t
            android.content.Context r1 = r7.f684a
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.a.d():z0.j");
    }

    public final void e(String str) {
        s0.e.c(str, "GcmTaskService must not be null.");
        PackageManager packageManager = this.f684a.getPackageManager();
        List<ResolveInfo> emptyList = packageManager == null ? Collections.emptyList() : packageManager.queryIntentServices(new Intent(GcmTaskService.SERVICE_ACTION_EXECUTE_TASK).setClassName(this.f684a, str), 0);
        if (emptyList == null ? true : emptyList.isEmpty()) {
            Log.e("GcmNetworkManager", str.concat(" is not available. This may cause the task to be lost."));
            return;
        }
        Iterator<ResolveInfo> it = emptyList.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && serviceInfo.enabled) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + 118);
        sb.append("The GcmTaskService class you provided ");
        sb.append(str);
        sb.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
        throw new IllegalArgumentException(sb.toString());
    }

    public final synchronized void f(String str, String str2) {
        Map<String, Boolean> map = this.f685b.get(str2);
        if (map != null) {
            if ((map.remove(str) != null) && map.isEmpty()) {
                this.f685b.remove(str2);
            }
        }
    }

    public final synchronized boolean g(String str) {
        return this.f685b.containsKey(str);
    }

    public final synchronized boolean h(String str, String str2) {
        Map<String, Boolean> map = this.f685b.get(str2);
        if (map == null) {
            return false;
        }
        Boolean bool = map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
