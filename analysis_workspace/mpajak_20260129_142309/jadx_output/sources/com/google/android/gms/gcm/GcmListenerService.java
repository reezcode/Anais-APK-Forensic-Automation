package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.iid.zze;
import d1.c;
import d1.d;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes9.dex */
public class GcmListenerService extends zze {

    /* renamed from: g, reason: collision with root package name */
    public d f649g = c.f2473e;

    public static void b(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        String stringExtra;
        boolean z4;
        z0.c cVar;
        String str;
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("GcmListenerService", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
            return;
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        z4 = false;
        switch (stringExtra) {
            case "deleted_messages":
                return;
            case "gcm":
                Bundle extras = intent.getExtras();
                extras.remove("message_type");
                extras.remove("androidx.contentpager.content.wakelockid");
                if ("1".equals(z0.c.a(extras, "gcm.n.e")) || z0.c.a(extras, "gcm.n.icon") != null) {
                    if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        int myPid = Process.myPid();
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
                        if (runningAppProcesses != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (next.pid == myPid) {
                                        if (next.importance == 100) {
                                            z4 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!z4) {
                        synchronized (z0.c.class) {
                            if (z0.c.f6101d == null) {
                                z0.c.f6101d = new z0.c(this);
                            }
                            cVar = z0.c.f6101d;
                        }
                        cVar.c(extras);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    Iterator<String> it2 = extras.keySet().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        String string = extras.getString(next2);
                        if (next2.startsWith("gcm.notification.")) {
                            next2 = next2.replace("gcm.notification.", "gcm.n.");
                        }
                        if (next2.startsWith("gcm.n.")) {
                            if (!"gcm.n.e".equals(next2)) {
                                bundle.putString(next2.substring(6), string);
                            }
                            it2.remove();
                        }
                    }
                    String string2 = bundle.getString("sound2");
                    if (string2 != null) {
                        bundle.remove("sound2");
                        bundle.putString("sound", string2);
                    }
                    if (!bundle.isEmpty()) {
                        extras.putBundle("notification", bundle);
                    }
                }
                extras.getString(TypedValues.TransitionType.S_FROM);
                extras.remove(TypedValues.TransitionType.S_FROM);
                b(extras);
                Objects.requireNonNull(this.f649g);
                return;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                str = "error";
                break;
            case "send_event":
                str = "google.message_id";
                break;
            default:
                Log.w("GcmListenerService", stringExtra.length() != 0 ? "Received message with unknown type: ".concat(stringExtra) : new String("Received message with unknown type: "));
                return;
        }
        intent.getStringExtra(str);
    }

    @Override // android.app.Service
    @CallSuper
    public final void onCreate() {
        super.onCreate();
        this.f649g = c.f2473e;
    }
}
