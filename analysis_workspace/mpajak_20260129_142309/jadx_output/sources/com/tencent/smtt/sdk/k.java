package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes15.dex */
class k {

    /* renamed from: d, reason: collision with root package name */
    private static int f2157d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static int f2158e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f2159f = {"tbs_downloading_com.tencent.mtt", "tbs_downloading_com.tencent.mm", "tbs_downloading_com.tencent.mobileqq", "tbs_downloading_com.tencent.tbs", "tbs_downloading_com.qzone"};
    private boolean C;

    /* renamed from: g, reason: collision with root package name */
    private Context f2163g;

    /* renamed from: h, reason: collision with root package name */
    private String f2164h;

    /* renamed from: i, reason: collision with root package name */
    private String f2165i;

    /* renamed from: j, reason: collision with root package name */
    private String f2166j;

    /* renamed from: k, reason: collision with root package name */
    private File f2167k;

    /* renamed from: l, reason: collision with root package name */
    private long f2168l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2171o;

    /* renamed from: p, reason: collision with root package name */
    private int f2172p;

    /* renamed from: q, reason: collision with root package name */
    private int f2173q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2174r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f2175s;

    /* renamed from: t, reason: collision with root package name */
    private HttpURLConnection f2176t;

    /* renamed from: u, reason: collision with root package name */
    private String f2177u;

    /* renamed from: v, reason: collision with root package name */
    private final TbsLogReport.TbsLogInfo f2178v;

    /* renamed from: w, reason: collision with root package name */
    private String f2179w;

    /* renamed from: x, reason: collision with root package name */
    private int f2180x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f2181y;

    /* renamed from: z, reason: collision with root package name */
    private Handler f2182z;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2162c = false;

    /* renamed from: m, reason: collision with root package name */
    private int f2169m = 30000;

    /* renamed from: n, reason: collision with root package name */
    private int f2170n = 20000;
    private boolean A = false;
    private int B = f2157d;

    /* renamed from: a, reason: collision with root package name */
    public String[] f2160a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f2161b = 0;

    public k(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2163g = applicationContext;
        this.f2178v = TbsLogReport.getInstance(applicationContext).tbsLogInfo();
        StringBuilder g5 = androidx.activity.d.g("tbs_downloading_");
        g5.append(this.f2163g.getPackageName());
        this.f2177u = g5.toString();
        File o4 = m.o(this.f2163g);
        this.f2167k = o4;
        Objects.requireNonNull(o4, "TbsCorePrivateDir is null!");
        f();
        this.f2179w = null;
        this.f2180x = -1;
    }

    private long a(long j5, long j6) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f2178v.setDownConsumeTime(currentTimeMillis - j5);
        this.f2178v.setDownloadSize(j6);
        return currentTimeMillis;
    }

    private String a(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        return stackTraceString.length() > 1024 ? stackTraceString.substring(0, 1024) : stackTraceString;
    }

    private void a(int i5, String str, boolean z4) {
        if (z4 || this.f2172p > this.B) {
            this.f2178v.setErrorCode(i5);
            this.f2178v.setFailDetail(str);
        }
    }

    private void a(long j5) {
        this.f2172p++;
        if (j5 <= 0) {
            try {
                j5 = m();
            } catch (Exception unused) {
                return;
            }
        }
        Thread.sleep(j5);
    }

    public static void a(Context context) {
        try {
            TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld #00");
            File a5 = m.a().a(context, context.getDir("tbs_64", 0));
            FileUtil.b(a5);
            if (a5 != null) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld dir is " + a5.getAbsolutePath());
            }
            File a6 = m.a().a(context, context.getDir("tbs", 0));
            FileUtil.b(a6);
            if (a6 != null) {
                TbsLog.i(TbsDownloader.LOGTAG, "clearDecoupleDirOld dir is " + a6.getAbsolutePath());
            }
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("clearDecoupleDirOld stack is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i(TbsDownloader.LOGTAG, g5.toString());
        }
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void a(String str) {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = this.f2176t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                StringBuilder g5 = androidx.activity.d.g("[initHttpRequest] mHttpRequest.disconnect() Throwable:");
                g5.append(th.toString());
                TbsLog.e(TbsDownloader.LOGTAG, g5.toString());
            }
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
        this.f2176t = httpURLConnection2;
        httpURLConnection2.setRequestProperty("User-Agent", TbsDownloader.b(this.f2163g));
        this.f2176t.setRequestProperty("Accept-Encoding", "identity");
        this.f2176t.setRequestMethod("GET");
        this.f2176t.setInstanceFollowRedirects(false);
        this.f2176t.setConnectTimeout(this.f2170n);
        this.f2176t.setReadTimeout(this.f2169m);
    }

    public static void b(Context context) {
        try {
            m.a();
            File o4 = m.o(context);
            new File(o4, "x5.tbs").delete();
            new File(o4, "x5.tbs.temp").delete();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r10 != r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.k.b(boolean, boolean):boolean");
    }

    private void c(boolean z4) {
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(this.f2163g);
        Map<String, Object> map = tbsDownloadConfig.mSyncMap;
        Boolean bool = Boolean.FALSE;
        map.put(TbsDownloadConfig.TbsConfigKey.KEY_FULL_PACKAGE, bool);
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, bool);
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_INTERRUPT_CODE_REASON, -123);
        tbsDownloadConfig.commit();
        this.f2178v.f1944a = 100;
        int i5 = tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
        TbsDownloader.a(this.f2163g);
        if (i5 == 5 || i5 == 3) {
            Bundle a5 = a(i5);
            if (a5 == null) {
                TbsLog.i(TbsDownloader.LOGTAG, "downloadSuccess RESPONSECODE_TPATCH bundle is null ");
            } else {
                TbsLog.i(TbsDownloader.LOGTAG, "downloadSuccess RESPONSECODE_TPATCH bundle is " + a5);
                m.a().b(this.f2163g, a5);
            }
        } else if (i5 > 10000) {
            b();
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.TRUE);
            tbsDownloadConfig.commit();
        } else {
            m.a().a(this.f2163g, new File(this.f2167k, "x5.tbs").getAbsolutePath(), tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
        }
        a(this.f2163g);
    }

    private boolean d(boolean z4) {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.deleteFile] isApk=" + z4);
        File file = z4 ? new File(this.f2167k, "x5.tbs") : new File(this.f2167k, "x5.tbs.temp");
        if (file.exists()) {
            FileUtil.b(file);
        }
        return true;
    }

    private void f() {
        this.f2172p = 0;
        this.f2173q = 0;
        this.f2168l = -1L;
        this.f2166j = null;
        this.f2171o = false;
        this.f2174r = false;
        this.f2175s = false;
        this.f2181y = false;
    }

    private void g() {
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest]");
        HttpURLConnection httpURLConnection = this.f2176t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                StringBuilder g5 = androidx.activity.d.g("[closeHttpRequest] mHttpRequest.disconnect() Throwable:");
                g5.append(th.toString());
                TbsLog.e(TbsDownloader.LOGTAG, g5.toString());
            }
            this.f2176t = null;
        }
        int i5 = this.f2178v.f1944a;
        TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloader.closeHttpRequest] download finish code: " + i5);
        if (!this.f2174r && this.f2181y) {
            h();
        } else if (!this.f2162c) {
            TbsDownloader.f1903a = false;
        }
        TbsDownloadConfig.getInstance(this.f2163g).saveDownloadInterruptCode();
        QbSdk.f1821n.onDownloadFinish(i5);
    }

    private void h() {
        this.f2178v.setEventTime(System.currentTimeMillis());
        String apnInfo = Apn.getApnInfo(this.f2163g);
        if (apnInfo == null) {
            apnInfo = "";
        }
        int apnType = Apn.getApnType(this.f2163g);
        this.f2178v.setApn(apnInfo);
        this.f2178v.setNetworkType(apnType);
        if (apnType != this.f2180x || !apnInfo.equals(this.f2179w)) {
            this.f2178v.setNetworkChange(0);
        }
        TbsLogReport.TbsLogInfo tbsLogInfo = this.f2178v;
        int i5 = tbsLogInfo.f1944a;
        if ((i5 == 0 || i5 == 107) && tbsLogInfo.getDownFinalFlag() == 0 && (!Apn.isNetworkAvailable(this.f2163g) || !l())) {
            a(101, null, true);
        }
        TbsLogReport.getInstance(this.f2163g).eventReport(TbsLogReport.EventType.TYPE_CDN_DOWNLOAD_STAT, this.f2178v);
        this.f2178v.resetArgs();
    }

    private void i() {
        int apnType = Apn.getApnType(this.f2163g);
        String apnInfo = Apn.getApnInfo(this.f2163g);
        String str = this.f2179w;
        if (str != null || this.f2180x != -1) {
            if (apnType == this.f2180x && apnInfo.equals(str)) {
                return;
            } else {
                this.f2178v.setNetworkChange(0);
            }
        }
        this.f2179w = apnInfo;
        this.f2180x = apnType;
    }

    private boolean j() {
        return new File(this.f2167k, "x5.tbs.temp").exists();
    }

    private long k() {
        File file = new File(this.f2167k, "x5.tbs.temp");
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    private boolean l() {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        boolean z4 = false;
        try {
            inputStream = Runtime.getRuntime().exec("ping www.qq.com").getInputStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    int i5 = 0;
                    do {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (readLine.contains("TTL") || readLine.contains("ttl")) {
                                z4 = true;
                                break;
                            }
                            i5++;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                return z4;
                            } finally {
                                a(inputStream);
                                a(inputStreamReader);
                                a(bufferedReader);
                            }
                        }
                    } while (i5 < 5);
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            inputStream = null;
        }
        return z4;
    }

    private long m() {
        int i5 = this.f2172p;
        return (i5 == 1 || i5 == 2) ? i5 * 20000 : (i5 == 3 || i5 == 4) ? 100000L : 200000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean n() {
        /*
            r8 = this;
            android.content.Context r0 = r8.f2163g
            int r0 = com.tencent.smtt.utils.Apn.getApnType(r0)
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 != r3) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[TbsApkDwonloader.detectWifiNetworkAvailable] isWifi="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TbsDownload"
            com.tencent.smtt.utils.TbsLog.i(r4, r3)
            r3 = 0
            if (r0 == 0) goto L7e
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = "https://pms.mb.qq.com/rsp204"
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L6c
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L6c
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L6c
            r0.setInstanceFollowRedirects(r2)     // Catch: java.lang.Throwable -> L6a
            r5 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L6a
            r0.setReadTimeout(r5)     // Catch: java.lang.Throwable -> L6a
            r0.setUseCaches(r2)     // Catch: java.lang.Throwable -> L6a
            r0.getInputStream()     // Catch: java.lang.Throwable -> L6a
            int r5 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r6.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "[TbsApkDwonloader.detectWifiNetworkAvailable] responseCode="
            r6.append(r7)     // Catch: java.lang.Throwable -> L6a
            r6.append(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6a
            com.tencent.smtt.utils.TbsLog.i(r4, r6)     // Catch: java.lang.Throwable -> L6a
            r4 = 204(0xcc, float:2.86E-43)
            if (r5 != r4) goto L63
            r4 = 1
            goto L64
        L63:
            r4 = 0
        L64:
            r0.disconnect()     // Catch: java.lang.Exception -> L68
            goto L7f
        L68:
            goto L7f
        L6a:
            r4 = move-exception
            goto L6e
        L6c:
            r4 = move-exception
            r0 = r3
        L6e:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L7e
            r0.disconnect()     // Catch: java.lang.Exception -> L7e
            goto L7e
        L77:
            r1 = move-exception
            if (r0 == 0) goto L7d
            r0.disconnect()     // Catch: java.lang.Exception -> L7d
        L7d:
            throw r1
        L7e:
            r4 = 0
        L7f:
            if (r4 == 0) goto L84
            r8.A = r1
            goto L96
        L84:
            r8.A = r2
            android.os.Handler r0 = r8.f2182z
            r1 = 150(0x96, float:2.1E-43)
            android.os.Message r0 = r0.obtainMessage(r1, r3)
            android.os.Handler r1 = r8.f2182z
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendMessageDelayed(r0, r2)
        L96:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.k.n():boolean");
    }

    public Bundle a(int i5) {
        File n4 = m.a().n(this.f2163g);
        int g5 = m.a().g(this.f2163g);
        File file = new File(this.f2167k, "x5.tbs");
        String absolutePath = file.exists() ? file.getAbsolutePath() : null;
        if (absolutePath == null) {
            StringBuilder g6 = androidx.activity.d.g("getTpatchBundle tbsApkFile is ");
            g6.append(file.getAbsolutePath());
            TbsLog.i(TbsDownloader.LOGTAG, g6.toString());
            return null;
        }
        int i6 = TbsDownloadConfig.getInstance(this.f2163g).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
        File e5 = m.a().e(this.f2163g, 5);
        Bundle bundle = new Bundle();
        bundle.putInt("operation", i5);
        bundle.putInt("old_core_ver", g5);
        bundle.putInt("new_core_ver", i6);
        bundle.putString("old_apk_location", n4.getAbsolutePath());
        bundle.putString("new_apk_location", e5.getAbsolutePath());
        bundle.putString("diff_file_location", absolutePath);
        bundle.putString("core_type_tpatch", "not_stable");
        bundle.putInt("for_self_core", 1);
        return bundle;
    }

    public void a() {
        this.f2174r = true;
        if (TbsShareManager.isThirdPartyApp(this.f2163g)) {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(this.f2163g).tbsLogInfo();
            tbsLogInfo.setErrorCode(-309);
            tbsLogInfo.setFailDetail(new Exception());
            TbsLogReport.getInstance(this.f2163g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
        }
    }

    public void a(boolean z4) {
        a(z4, false);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public void a(boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 3096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.k.a(boolean, boolean):void");
    }

    public void b() {
        a();
        d(false);
        d(true);
    }

    public void b(int i5) {
        if (m.a().p(this.f2163g)) {
            m.a().c();
            try {
                File file = new File(this.f2167k, "x5.tbs");
                int a5 = com.tencent.smtt.utils.a.a(this.f2163g, file);
                if (-1 == a5 || (i5 > 0 && i5 == a5)) {
                    FileUtil.b(file);
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean b(boolean z4) {
        String[] strArr;
        int i5;
        if ((z4 && !n() && (!QbSdk.canDownloadWithoutWifi() || !Apn.isNetworkAvailable(this.f2163g))) || (strArr = this.f2160a) == null || (i5 = this.f2161b) < 0 || i5 >= strArr.length) {
            return false;
        }
        this.f2161b = i5 + 1;
        this.f2166j = strArr[i5];
        this.f2172p = 0;
        this.f2173q = 0;
        this.f2168l = -1L;
        this.f2171o = false;
        this.f2174r = false;
        this.f2175s = false;
        this.f2181y = false;
        return true;
    }

    public boolean c() {
        StringBuilder g5 = androidx.activity.d.g("[TbsApkDownloader.isDownloadForeground] mIsDownloadForeground=");
        g5.append(this.C);
        TbsLog.i(TbsDownloader.LOGTAG, g5.toString());
        return this.C;
    }

    public void d() {
        StringBuilder g5 = androidx.activity.d.g("pauseDownload,isPause=");
        g5.append(this.f2162c);
        g5.append("isDownloading=");
        g5.append(TbsDownloader.isDownloading());
        TbsLog.i(TbsDownloader.LOGTAG, g5.toString());
        if (this.f2162c || !TbsDownloader.isDownloading()) {
            return;
        }
        a();
        this.f2162c = true;
        this.f2181y = false;
    }

    public void e() {
        StringBuilder g5 = androidx.activity.d.g("resumeDownload,isPause=");
        g5.append(this.f2162c);
        g5.append("isDownloading=");
        g5.append(TbsDownloader.isDownloading());
        TbsLog.i(TbsDownloader.LOGTAG, g5.toString());
        if (this.f2162c && TbsDownloader.isDownloading()) {
            this.f2162c = false;
            a(false);
        }
    }
}
