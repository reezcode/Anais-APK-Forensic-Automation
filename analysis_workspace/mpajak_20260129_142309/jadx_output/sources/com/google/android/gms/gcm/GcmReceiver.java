package com.google.android.gms.gcm;

import a1.f;
import a1.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.tencent.smtt.sdk.TbsListener;
import v0.b;

@Deprecated
/* loaded from: classes5.dex */
public class GcmReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static j f650a;

    /* renamed from: b, reason: collision with root package name */
    public static j f651b;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[Catch: IllegalStateException -> 0x00c7, SecurityException -> 0x00e9, TryCatch #2 {IllegalStateException -> 0x00c7, SecurityException -> 0x00e9, blocks: (B:27:0x00a5, B:29:0x00ad, B:31:0x00bd, B:36:0x00b2), top: B:26:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd A[Catch: IllegalStateException -> 0x00c7, SecurityException -> 0x00e9, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x00c7, SecurityException -> 0x00e9, blocks: (B:27:0x00a5, B:29:0x00ad, B:31:0x00bd, B:36:0x00b2), top: B:26:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[Catch: IllegalStateException -> 0x00c7, SecurityException -> 0x00e9, TryCatch #2 {IllegalStateException -> 0x00c7, SecurityException -> 0x00e9, blocks: (B:27:0x00a5, B:29:0x00ad, B:31:0x00bd, B:36:0x00b2), top: B:26:0x00a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r5, android.content.Intent r6) {
        /*
            java.lang.String r0 = "GcmReceiver"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto Le
            java.lang.String r2 = "Starting service"
            android.util.Log.d(r0, r2)
        Le:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 0
            android.content.pm.ResolveInfo r2 = r2.resolveService(r6, r3)
            if (r2 == 0) goto La0
            android.content.pm.ServiceInfo r2 = r2.serviceInfo
            if (r2 != 0) goto L1f
            goto La0
        L1f:
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r4 = r2.packageName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L78
            java.lang.String r3 = r2.name
            if (r3 != 0) goto L30
            goto L78
        L30:
            java.lang.String r2 = "."
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L50
            java.lang.String r2 = r5.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r3.length()
            if (r4 == 0) goto L4b
            java.lang.String r3 = r2.concat(r3)
            goto L50
        L4b:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
        L50:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L70
            java.lang.String r1 = "Restricting intent to a specific service: "
            java.lang.String r2 = java.lang.String.valueOf(r3)
            int r4 = r2.length()
            if (r4 == 0) goto L67
            java.lang.String r1 = r1.concat(r2)
            goto L6d
        L67:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L6d:
            android.util.Log.d(r0, r1)
        L70:
            java.lang.String r1 = r5.getPackageName()
            r6.setClassName(r1, r3)
            goto La5
        L78:
            java.lang.String r1 = r2.packageName
            java.lang.String r2 = r2.name
            r3 = 94
            int r3 = androidx.activity.d.b(r1, r3)
            int r3 = androidx.activity.d.b(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = "/"
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            goto La2
        La0:
            java.lang.String r1 = "Failed to resolve target intent service, skipping classname enforcement"
        La2:
            android.util.Log.e(r0, r1)
        La5:
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r5.checkCallingOrSelfPermission(r1)     // Catch: java.lang.IllegalStateException -> Lc7 java.lang.SecurityException -> Le9
            if (r1 != 0) goto Lb2
            android.content.ComponentName r5 = androidx.legacy.content.WakefulBroadcastReceiver.startWakefulService(r5, r6)     // Catch: java.lang.IllegalStateException -> Lc7 java.lang.SecurityException -> Le9
            goto Lbb
        Lb2:
            android.content.ComponentName r5 = r5.startService(r6)     // Catch: java.lang.IllegalStateException -> Lc7 java.lang.SecurityException -> Le9
            java.lang.String r6 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r0, r6)     // Catch: java.lang.IllegalStateException -> Lc7 java.lang.SecurityException -> Le9
        Lbb:
            if (r5 != 0) goto Lc5
            java.lang.String r5 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r0, r5)     // Catch: java.lang.IllegalStateException -> Lc7 java.lang.SecurityException -> Le9
            r5 = 404(0x194, float:5.66E-43)
            return r5
        Lc5:
            r5 = -1
            return r5
        Lc7:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            int r6 = r6 + 45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            java.lang.String r6 = "Failed to start service while in background: "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.e(r0, r5)
            r5 = 402(0x192, float:5.63E-43)
            return r5
        Le9:
            r5 = move-exception
            java.lang.String r6 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r0, r6, r5)
            r5 = 401(0x191, float:5.62E-43)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmReceiver.b(android.content.Context, android.content.Intent):int");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayDeque, java.util.Queue<a1.f>] */
    public final void a(Context context, Intent intent) {
        j jVar;
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "Binding to service");
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        String action = intent.getAction();
        synchronized (this) {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
                if (f651b == null) {
                    f651b = new j(context, action);
                }
                jVar = f651b;
            } else {
                if (f650a == null) {
                    f650a = new j(context, action);
                }
                jVar = f650a;
            }
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        synchronized (jVar) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            jVar.f49d.add(new f(intent, goAsync, jVar.f48c));
            jVar.a();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i5;
        if (Log.isLoggable("GcmReceiver", 3)) {
            Log.d("GcmReceiver", "received new intent");
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra(TypedValues.TransitionType.S_FROM))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (isOrderedBroadcast()) {
            setResultCode(TbsListener.ErrorCode.INFO_CODE_MINIQB);
        }
        boolean z4 = b.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z5 = (intent.getFlags() & 268435456) != 0;
        if (!z4 || z5) {
            "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
            int b5 = b(context, intent);
            if (b.a() && b5 == 402) {
                a(context, intent);
                i5 = 403;
            } else {
                i5 = b5;
            }
        } else {
            a(context, intent);
            i5 = -1;
        }
        if (isOrderedBroadcast()) {
            setResultCode(i5);
        }
    }
}
