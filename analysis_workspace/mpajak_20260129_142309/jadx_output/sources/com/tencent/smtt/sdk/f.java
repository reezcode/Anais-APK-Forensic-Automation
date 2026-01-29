package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

/* loaded from: classes13.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    public static int f2121a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2122b = false;

    /* renamed from: e, reason: collision with root package name */
    private static f f2123e = null;

    /* renamed from: h, reason: collision with root package name */
    private static int f2124h = 0;

    /* renamed from: j, reason: collision with root package name */
    private static int f2125j = 3;

    /* renamed from: l, reason: collision with root package name */
    private static String f2126l;

    /* renamed from: c, reason: collision with root package name */
    private s f2127c = null;

    /* renamed from: d, reason: collision with root package name */
    private s f2128d = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2129f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2130g = false;

    /* renamed from: i, reason: collision with root package name */
    private String f2131i = "";

    /* renamed from: k, reason: collision with root package name */
    private File f2132k = null;

    private f() {
    }

    public static f a(boolean z4) {
        if (f2123e == null && z4) {
            synchronized (f.class) {
                if (f2123e == null) {
                    f2123e = new f();
                }
            }
        }
        return f2123e;
    }

    public static void a(int i5) {
        f2124h = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r6) {
        /*
            r5 = this;
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.lang.String r1 = com.tencent.smtt.sdk.f.f2126l
            r0.setProperty(r1, r6)
            r6 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L27
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L27
            java.io.File r3 = r5.f2132k     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L27
            java.lang.String r4 = "count.prop"
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L27
            r1.<init>(r2)     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L27
            r0.store(r1, r6)     // Catch: java.io.IOException -> L21 java.io.FileNotFoundException -> L23
            goto L2d
        L21:
            r6 = move-exception
            goto L2a
        L23:
            r6 = move-exception
            goto L2a
        L25:
            r0 = move-exception
            goto L28
        L27:
            r0 = move-exception
        L28:
            r1 = r6
            r6 = r0
        L2a:
            r6.printStackTrace()
        L2d:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.lang.Throwable -> L32
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.f.b(int):void");
    }

    public static int d() {
        return f2124h;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0054: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int j() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.File r3 = r6.f2132k     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.lang.String r4 = "count.prop"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r3 != 0) goto L12
            return r0
        L12:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            r1.load(r2)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            java.lang.String r3 = com.tencent.smtt.sdk.f.f2126l     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            java.lang.String r4 = "1"
            java.lang.String r1 = r1.getProperty(r3, r4)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L53
            r2.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r1 = move-exception
            r1.printStackTrace()
        L3c:
            return r0
        L3d:
            r1 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L55
        L41:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L45:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            r1.printStackTrace()
        L52:
            return r0
        L53:
            r0 = move-exception
            r1 = r2
        L55:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L5f
        L5b:
            r1 = move-exception
            r1.printStackTrace()
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.f.j():int");
    }

    public s a() {
        if (this.f2129f) {
            return this.f2127c;
        }
        return null;
    }

    public synchronized void a(Context context, boolean z4, boolean z5) {
        TbsLog.initIfNeed(context);
        f2121a++;
        TbsLog.i("SDKEngine", "init", "#1# context: " + context + ", mInitCount: " + f2121a);
        if (this.f2129f) {
            return;
        }
        m.a().b(context, f2121a == 1);
        m.a().i(context);
        boolean a5 = QbSdk.a(context, z4, z5);
        TbsLog.i("SDKEngine", "init", "#2# canLoadX5 is " + a5);
        if (a5) {
            TbsLog.i("SDKEngine", "init", "#3# start to load tbs");
            try {
                File n4 = m.a().n(context);
                Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                if (n4 == null) {
                    this.f2129f = false;
                    this.f2131i = "false03";
                    TbsCoreLoadStat.getInstance().a(context, 312, new Throwable());
                    QbSdk.a(context, "SDKEngine::useSystemWebView by tbs_core_share_dir null!");
                    return;
                }
                String[] dexLoaderFileList = QbSdk.getDexLoaderFileList(context, applicationContext, n4.getAbsolutePath());
                for (int i5 = 0; i5 < dexLoaderFileList.length; i5++) {
                    TbsLog.i("SDKEngine", "dexLoaderFileList[" + i5 + "]: " + dexLoaderFileList[i5]);
                }
                String absolutePath = n4.getAbsolutePath();
                TbsLog.i("SDKEngine", "init", "#4# optDir is " + absolutePath);
                s sVar = this.f2128d;
                if (sVar != null) {
                    this.f2127c = sVar;
                    sVar.a(context, applicationContext, n4.getAbsolutePath(), absolutePath, dexLoaderFileList, QbSdk.f1811d);
                } else {
                    this.f2127c = new s(context, applicationContext, n4.getAbsolutePath(), absolutePath, dexLoaderFileList, QbSdk.f1811d);
                }
                this.f2129f = true;
                this.f2131i = "true01";
            } catch (Throwable th) {
                TbsLog.e("SDKEngine", "useSystemWebView by exception: " + th);
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE, th);
                this.f2129f = false;
                this.f2131i = "false04";
                QbSdk.a(context, "SDKEngine::useSystemWebView by exception: " + th);
            }
        } else if (!QbSdk.f1808a || !this.f2129f) {
            this.f2129f = false;
            this.f2131i = "false05";
            TbsLog.e("SDKEngine", "init", "[LoadError] check log upon for details");
        }
        this.f2132k = m.o(context);
        this.f2130g = true;
    }

    public void a(String str) {
        f2126l = str;
    }

    public boolean b() {
        return this.f2129f;
    }

    public boolean b(boolean z4) {
        f2122b = z4;
        return z4;
    }

    public s c() {
        return this.f2127c;
    }

    public String e() {
        s sVar = this.f2127c;
        return (sVar == null || QbSdk.f1808a) ? "system webview get nothing..." : sVar.a();
    }

    public String f() {
        s sVar = this.f2127c;
        return (sVar == null || QbSdk.f1808a) ? "system webview get nothing..." : sVar.b();
    }

    public boolean g() {
        if (f2122b) {
            if (f2126l == null) {
                return false;
            }
            int j5 = j();
            if (j5 == 0) {
                b(1);
            } else {
                int i5 = j5 + 1;
                if (i5 > f2125j) {
                    return false;
                }
                b(i5);
            }
        }
        return f2122b;
    }

    public boolean h() {
        return this.f2130g;
    }

    public boolean i() {
        return QbSdk.useSoftWare();
    }
}
