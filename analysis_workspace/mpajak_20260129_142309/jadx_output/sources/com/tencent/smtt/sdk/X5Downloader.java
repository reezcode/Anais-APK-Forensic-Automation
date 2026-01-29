package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileLock;

/* loaded from: classes25.dex */
public abstract class X5Downloader implements ProgressListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2075a;

    /* renamed from: b, reason: collision with root package name */
    private final QbSdk.PrivateCDNMode f2076b;

    /* renamed from: c, reason: collision with root package name */
    private String f2077c;

    /* renamed from: d, reason: collision with root package name */
    private String f2078d;

    /* renamed from: e, reason: collision with root package name */
    private File f2079e;

    /* renamed from: f, reason: collision with root package name */
    private File f2080f;

    /* renamed from: g, reason: collision with root package name */
    private long f2081g;

    /* renamed from: h, reason: collision with root package name */
    private String f2082h;

    /* renamed from: i, reason: collision with root package name */
    private int f2083i;

    /* renamed from: l, reason: collision with root package name */
    private DownloadDelegate f2086l;

    /* renamed from: n, reason: collision with root package name */
    private FileLock f2088n;

    /* renamed from: o, reason: collision with root package name */
    private FileOutputStream f2089o;

    /* renamed from: t, reason: collision with root package name */
    private HttpURLConnection f2094t;

    /* renamed from: v, reason: collision with root package name */
    private int f2096v;

    /* renamed from: w, reason: collision with root package name */
    private String f2097w;

    /* renamed from: j, reason: collision with root package name */
    private int f2084j = 4;

    /* renamed from: k, reason: collision with root package name */
    private int f2085k = 10000;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f2087m = false;

    /* renamed from: p, reason: collision with root package name */
    private int f2090p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f2091q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f2092r = 30000;

    /* renamed from: s, reason: collision with root package name */
    private boolean f2093s = false;

    /* renamed from: u, reason: collision with root package name */
    private long f2095u = -1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2098x = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f2099y = false;

    /* renamed from: z, reason: collision with root package name */
    private final StringBuilder f2100z = new StringBuilder();
    private int A = 0;
    private String B = "";

    /* loaded from: classes5.dex */
    public interface DownloadDelegate {
        void download(X5Downloader x5Downloader, String str, File file);
    }

    public X5Downloader(Context context) {
        throw new com.tencent.smtt.utils.a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02b9, code lost:
    
        b(r10, "user cancel download");
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0043, code lost:
    
        r2.append(r3);
        b(r0, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0251, code lost:
    
        b(r0, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0343 A[Catch: all -> 0x0387, TryCatch #2 {all -> 0x0387, blocks: (B:82:0x033f, B:84:0x0343, B:87:0x0348, B:98:0x0350, B:90:0x036b, B:103:0x0378), top: B:81:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0350 A[EDGE_INSN: B:97:0x0350->B:98:0x0350 BREAK  A[LOOP:0: B:5:0x000c->B:96:0x000c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5Downloader.a():void");
    }

    private void a(int i5, String str) {
        this.A = i5;
        this.B = str;
    }

    private void a(long j5) {
        int i5 = this.f2090p + 1;
        this.f2090p = i5;
        if (j5 <= 0) {
            j5 = (i5 == 1 || i5 == 2) ? 5000 * i5 : (i5 == 3 || i5 == 4) ? 25000L : 50000L;
        }
        try {
            Thread.sleep(j5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(QbSdk.PrivateCDNMode privateCDNMode) {
        if (this.f2076b == privateCDNMode) {
            return;
        }
        StringBuilder g5 = androidx.activity.d.g("you are expected use ");
        g5.append(privateCDNMode.name());
        g5.append(".");
        g5.append("Current mode is ");
        g5.append(privateCDNMode.name());
        g5.append(". Plz check QbSdk.usePrivateCDN(PrivateCDNMode)");
        throw new UnsupportedOperationException(g5.toString());
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
        HttpURLConnection httpURLConnection = this.f2094t;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                StringBuilder g5 = androidx.activity.d.g("[initHttpRequest] mHttpRequest.disconnect() Throwable:");
                g5.append(th.toString());
                TbsLog.e("X5Downloader", g5.toString());
            }
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
        this.f2094t = httpURLConnection2;
        httpURLConnection2.setRequestProperty("User-Agent", TbsDownloader.b(this.f2075a));
        this.f2094t.setRequestProperty("Accept-Encoding", "identity");
        this.f2094t.setRequestMethod("GET");
        this.f2094t.setInstanceFollowRedirects(false);
        this.f2094t.setConnectTimeout(this.f2085k);
        this.f2094t.setReadTimeout(this.f2092r);
    }

    private boolean a(boolean z4) {
        boolean z5;
        File file = z4 ? this.f2080f : this.f2079e;
        if (this.f2079e == null || !file.exists()) {
            a(-14, "target file not exist.");
            return false;
        }
        String a5 = com.tencent.smtt.utils.a.a(file);
        String str = this.f2082h;
        if (str == null || !str.equals(a5)) {
            a(-11, "md5 not match");
            return false;
        }
        long j5 = this.f2081g;
        if (j5 == 0 || j5 != file.length()) {
            StringBuilder g5 = androidx.activity.d.g("size not match. current: ");
            g5.append(file.length());
            a(-12, g5.toString());
            return false;
        }
        int i5 = this.f2083i;
        if (i5 == 0 || i5 != com.tencent.smtt.utils.a.a(this.f2075a, file)) {
            a(-15, "core version not match");
            return false;
        }
        if (!"3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(com.tencent.smtt.utils.b.a(this.f2075a, false, file))) {
            a(-13, "core sig invalid.");
            return false;
        }
        if (!z4) {
            Exception e5 = null;
            try {
                z5 = this.f2079e.renameTo(this.f2080f);
            } catch (Exception e6) {
                e5 = e6;
                z5 = false;
            }
            if (!z5) {
                a(-17, "reason: " + e5);
                return false;
            }
        }
        i();
        return true;
    }

    private long b() {
        File file = this.f2079e;
        if (file == null || !file.exists()) {
            return 0L;
        }
        return this.f2079e.length();
    }

    private void b(int i5, String str) {
        h();
        TbsLog.i("X5Downloader", "innerOnFailed, code: " + i5 + ", msg: " + str);
        onFailed(i5, str);
    }

    private void c() {
        int apnType = Apn.getApnType(this.f2075a);
        String apnInfo = Apn.getApnInfo(this.f2075a);
        String str = this.f2097w;
        if (!(str == null && this.f2096v == -1) && apnType == this.f2096v && apnInfo.equals(str)) {
            return;
        }
        this.f2097w = apnInfo;
        this.f2096v = apnType;
    }

    private boolean d() {
        int i5;
        String str;
        FileOutputStream b5 = FileUtil.b(this.f2075a, true, "x5dl.lock");
        this.f2089o = b5;
        if (b5 != null) {
            FileLock a5 = FileUtil.a(this.f2075a, b5);
            this.f2088n = a5;
            if (a5 != null) {
                return true;
            }
            i5 = -2;
            str = "Other Process Downloading";
        } else {
            i5 = -1;
            str = "lock fos is null";
        }
        b(i5, str);
        return false;
    }

    private void e() {
        FileUtil.a(this.f2088n, this.f2089o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        SharedPreferences sharedPreferences = TbsDownloadConfig.getInstance(this.f2075a).mPreferences;
        if (sharedPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWLOAD_FLOWCTR, 0) == 1) {
            this.f2077c = "";
            b(-20, "meet flow control.");
            return;
        }
        String string = sharedPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, "");
        this.f2077c = string;
        if ("".equals(string)) {
            b(-20, "meet flow control.");
        } else {
            TbsLog.i("X5Downloader", "start delegate download progress...");
            this.f2086l.download(this, this.f2077c, this.f2080f);
        }
    }

    private void g() {
        File file = this.f2079e;
        if (file == null || !file.exists()) {
            return;
        }
        FileUtil.b(file);
    }

    private void h() {
        this.f2099y = false;
        this.f2087m = false;
        this.f2098x = false;
        this.f2090p = 0;
        this.f2091q = 0;
        this.f2092r = 30000;
        this.f2093s = false;
        this.f2094t = null;
        this.f2095u = -1L;
    }

    private void i() {
        TbsDownloadConfig.getInstance(this.f2075a).mPreferences.edit().putString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, "").apply();
    }

    private void j() {
        h();
        TbsLog.i("X5Downloader", "download and verify x5 finished, prepare to install");
        if (this.f2080f.exists()) {
            m.a().a(this.f2075a, this.f2080f.getAbsolutePath(), this.f2083i);
        }
        TbsLog.i("X5Downloader", "download and install finished.");
        onFinished();
    }

    public final void notifyDownloadFinished() {
        a(QbSdk.PrivateCDNMode.SELF_IMPL);
        if (a(true)) {
            j();
        } else {
            b(this.A, this.B);
        }
    }

    @Override // com.tencent.smtt.sdk.ProgressListener
    public void onProgress(int i5) {
    }

    public final X5Downloader setConnectTimesOut(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("can not set ConnectTimesOut <= 0, input is: ", i5));
        }
        this.f2085k = i5;
        return this;
    }

    public final X5Downloader setDownloadDelegate(DownloadDelegate downloadDelegate) {
        a(QbSdk.PrivateCDNMode.SELF_IMPL);
        this.f2086l = downloadDelegate;
        return this;
    }

    public final X5Downloader setDownloadUrl(String str) {
        if (str.contains("imtt.qq.com")) {
            throw new IllegalArgumentException("you can't set TBS official domain");
        }
        a(QbSdk.PrivateCDNMode.OFFICIAL_IMPL);
        this.f2077c = str;
        return this;
    }

    public final X5Downloader setMaxRetryTimes(int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("can not set MaxRetryTimes <= 0, input is: ", i5));
        }
        this.f2084j = i5;
        return this;
    }

    public final void startDownload() {
        if (this.f2076b == QbSdk.PrivateCDNMode.SELF_IMPL && this.f2086l == null) {
            throw new IllegalStateException("is SELF_IMPL mode, but delegate is null. Please set setDownloadDelegate()");
        }
        String str = this.f2077c;
        if (str == null || str.equals("")) {
            b(-18, "url is empty, [OFFICIAL_IMPL] plz setDownloadUrl. [SELF_IMPL] Maybe flow control.");
            return;
        }
        if (this.f2083i == 0) {
            b(-19, "No config version, please check whether TbsVersionController.checkVersion is call. Need more help please contact with x5tbs@tencent.com");
            return;
        }
        if (QbSdk.getTbsVersion(this.f2075a) != this.f2083i && !a(true)) {
            Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.X5Downloader.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    if (X5Downloader.this.f2076b == QbSdk.PrivateCDNMode.SELF_IMPL) {
                        X5Downloader.this.f();
                    } else {
                        TbsLog.i("X5Downloader", "Delegate is null, try to start default download.");
                        X5Downloader.this.a();
                    }
                }
            };
            thread.setName("thread-x5dl");
            thread.start();
        } else {
            j();
            StringBuilder g5 = androidx.activity.d.g("local version match, no need to download: ");
            g5.append(this.f2083i);
            TbsLog.i("X5Downloader", g5.toString());
        }
    }
}
