package com.google.android.gms.iid;

import a1.a;
import a1.c;
import a1.d;
import a1.k;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;

@Deprecated
/* loaded from: classes12.dex */
public class InstanceIDListenerService extends zze {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f686g = 0;

    @Override // com.google.android.gms.iid.zze
    public final void handleIntent(Intent intent) {
        a aVar;
        String sb;
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            Bundle bundle = null;
            String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString("subtype", stringExtra);
            }
            g3.a aVar2 = a.f24b;
            synchronized (a.class) {
                String string = bundle == null ? "" : bundle.getString("subtype");
                if (string == null) {
                    string = "";
                }
                Context applicationContext = getApplicationContext();
                if (a.f26d == null) {
                    String packageName = applicationContext.getPackageName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 73);
                    sb2.append("Instance ID SDK is deprecated, ");
                    sb2.append(packageName);
                    sb2.append(" should update to use Firebase Instance ID");
                    Log.w("InstanceID", sb2.toString());
                    a.f26d = new d(applicationContext);
                    new c();
                }
                int i5 = 0;
                try {
                    i5 = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e5) {
                    String valueOf = String.valueOf(e5);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 38);
                    sb3.append("Never happens: can't find own package ");
                    sb3.append(valueOf);
                    Log.w("InstanceID", sb3.toString());
                }
                Integer.toString(i5);
                aVar = a.f25c.get(string);
                if (aVar == null) {
                    aVar = new a(applicationContext, string);
                    a.f25c.put(string, aVar);
                }
            }
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                StringBuilder sb4 = new StringBuilder(androidx.activity.d.b(stringExtra2, androidx.activity.d.b(stringExtra, 34)));
                sb4.append("Service command. subtype:");
                sb4.append(stringExtra);
                sb4.append(" command:");
                sb4.append(stringExtra2);
                Log.d("InstanceID", sb4.toString());
            }
            if (!"RST".equals(stringExtra2)) {
                if ("RST_FULL".equals(stringExtra2)) {
                    if (a.f26d.f31a.getAll().isEmpty()) {
                        return;
                    }
                    a.f26d.b();
                    return;
                } else {
                    if ("SYNC".equals(stringExtra2)) {
                        d dVar = a.f26d;
                        dVar.a(String.valueOf(stringExtra).concat("|T|"));
                        dVar.a(String.valueOf(stringExtra).concat("|T-timestamp|"));
                        return;
                    }
                    return;
                }
            }
            d dVar2 = a.f26d;
            String str = aVar.f27a;
            synchronized (dVar2) {
                dVar2.f33c.remove(str);
            }
            Context context = dVar2.f32b;
            if (TextUtils.isEmpty(str)) {
                sb = "com.google.InstanceId.properties";
            } else {
                try {
                    String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                    sb5.append("com.google.InstanceId_");
                    sb5.append(encodeToString);
                    sb5.append(".properties");
                    sb = sb5.toString();
                } catch (UnsupportedEncodingException e6) {
                    throw new AssertionError(e6);
                }
            }
            File file = new File(k.a(context), sb);
            if (file.exists()) {
                file.delete();
            }
            dVar2.a(String.valueOf(str).concat("|"));
        }
    }
}
