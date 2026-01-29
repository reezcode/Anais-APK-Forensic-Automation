package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes21.dex */
public class TbsDownloader {
    public static final boolean DEBUG_DISABLE_DOWNLOAD = false;
    public static boolean DOWNLOAD_OVERSEA_TBS = false;
    public static final String LOGTAG = "TbsDownload";
    public static final String TBS_METADATA = "com.tencent.mm.BuildInfo.CLIENT_VERSION";

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1903a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String f1904b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Context f1905c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Handler f1906d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f1907e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f1908f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    private static k f1909g = null;

    /* renamed from: h, reason: collision with root package name */
    private static HandlerThread f1910h = null;

    /* renamed from: i, reason: collision with root package name */
    private static int f1911i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f1912j = false;

    /* renamed from: k, reason: collision with root package name */
    private static String f1913k = "";

    /* renamed from: l, reason: collision with root package name */
    private static String f1914l = "";

    /* renamed from: m, reason: collision with root package name */
    private static boolean f1915m = false;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f1916n = false;

    /* renamed from: o, reason: collision with root package name */
    private static JSONObject f1917o = null;

    /* renamed from: p, reason: collision with root package name */
    private static JSONObject f1918p = null;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f1919q = false;

    /* renamed from: r, reason: collision with root package name */
    private static int f1920r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static int f1921s = 0;

    /* renamed from: t, reason: collision with root package name */
    private static JSONObject f1922t = null;

    /* renamed from: u, reason: collision with root package name */
    private static long f1923u = -1;

    /* loaded from: classes5.dex */
    public interface TbsDownloaderCallback {
        void onNeedDownloadFinish(boolean z4, int i5);
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152 A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c3 A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028c A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0290 A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029d A[Catch: Exception -> 0x02a9, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a4 A[Catch: Exception -> 0x02a9, TRY_LEAVE, TryCatch #1 {Exception -> 0x02a9, blocks: (B:12:0x006d, B:15:0x0081, B:18:0x0090, B:19:0x0093, B:21:0x00a3, B:22:0x00a8, B:24:0x00b5, B:28:0x0147, B:30:0x0152, B:32:0x0173, B:33:0x0178, B:35:0x01c3, B:36:0x01c8, B:39:0x01e0, B:42:0x01ec, B:46:0x01fb, B:47:0x01fe, B:51:0x023c, B:55:0x0248, B:57:0x025f, B:59:0x0274, B:61:0x027e, B:63:0x0282, B:65:0x028c, B:67:0x0290, B:68:0x0295, B:70:0x029d, B:72:0x02a4, B:84:0x00c3, B:86:0x00da, B:88:0x00e6, B:90:0x00f7, B:92:0x0106, B:93:0x0110, B:95:0x012e, B:98:0x00ce, B:99:0x008b), top: B:11:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject a(boolean r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.a(boolean, boolean, boolean):org.json.JSONObject");
    }

    private static void a(int i5) {
        File file = new File(m.o(f1905c), androidx.appcompat.widget.a.g("tbs_switch_disable_", i5));
        if (file.exists()) {
            return;
        }
        try {
            TbsLog.i(LOGTAG, "setTbsCoreDisabledBySwitch status: " + file.createNewFile());
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public static void a(final Context context, final Runnable runnable) {
        Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.TbsDownloader.3
            /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = "release wait download lock"
                    java.lang.String r1 = "TbsDownload"
                    r2 = 0
                    com.tencent.smtt.utils.Timer r3 = com.tencent.smtt.sdk.QbSdk.c()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53
                    android.content.Context r4 = r1     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53
                    r5 = 1
                    java.lang.String r6 = "tbs_download_lock_file"
                    java.io.FileOutputStream r4 = com.tencent.smtt.utils.FileUtil.b(r4, r5, r6)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53
                    if (r4 == 0) goto L41
                    if (r3 == 0) goto L41
                    java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3e
                    java.util.Timer r6 = new java.util.Timer     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    r6.<init>()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    com.tencent.smtt.sdk.TbsDownloader$3$1 r7 = new com.tencent.smtt.sdk.TbsDownloader$3$1     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    r7.<init>()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    int r3 = r3.timeOut     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    long r8 = (long) r3     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    r6.schedule(r7, r8)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    java.lang.String r3 = "start waiting other process Download finished"
                    com.tencent.smtt.utils.TbsLog.i(r1, r3)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    java.nio.channels.FileLock r2 = r5.lock()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    java.lang.String r3 = "wait lock success"
                    com.tencent.smtt.utils.TbsLog.i(r1, r3)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L77
                    goto L42
                L39:
                    r3 = move-exception
                    goto L56
                L3b:
                    r3 = move-exception
                    r5 = r2
                    goto L78
                L3e:
                    r3 = move-exception
                    r5 = r2
                    goto L56
                L41:
                    r5 = r2
                L42:
                    com.tencent.smtt.utils.FileUtil.a(r2, r4)
                    com.tencent.smtt.utils.TbsLog.i(r1, r0)
                    com.tencent.smtt.utils.FileUtil.a(r5)
                    com.tencent.smtt.utils.FileUtil.a(r4)
                    goto L6f
                L4f:
                    r3 = move-exception
                    r4 = r2
                    r5 = r4
                    goto L78
                L53:
                    r3 = move-exception
                    r4 = r2
                    r5 = r4
                L56:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
                    r6.<init>()     // Catch: java.lang.Throwable -> L77
                    java.lang.String r7 = "MultiProcessSyncInit exception: "
                    r6.append(r7)     // Catch: java.lang.Throwable -> L77
                    java.lang.String r3 = android.util.Log.getStackTraceString(r3)     // Catch: java.lang.Throwable -> L77
                    r6.append(r3)     // Catch: java.lang.Throwable -> L77
                    java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L77
                    com.tencent.smtt.utils.TbsLog.w(r1, r3)     // Catch: java.lang.Throwable -> L77
                    goto L42
                L6f:
                    java.lang.Runnable r0 = r2
                    if (r0 == 0) goto L76
                    r0.run()
                L76:
                    return
                L77:
                    r3 = move-exception
                L78:
                    com.tencent.smtt.utils.FileUtil.a(r2, r4)
                    com.tencent.smtt.utils.TbsLog.i(r1, r0)
                    com.tencent.smtt.utils.FileUtil.a(r5)
                    com.tencent.smtt.utils.FileUtil.a(r4)
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.AnonymousClass3.run():void");
            }
        };
        thread.setName("tbsSyncWaiter");
        thread.start();
    }

    private static void a(boolean z4, TbsDownloaderCallback tbsDownloaderCallback, boolean z5) {
        TbsLog.i(LOGTAG, "[TbsDownloader.queryConfig]");
        f1906d.removeMessages(100);
        Message obtain = Message.obtain(f1906d, 100);
        if (tbsDownloaderCallback != null) {
            obtain.obj = tbsDownloaderCallback;
        }
        obtain.arg1 = z4 ? 1 : 0;
        obtain.arg2 = z5 ? 1 : 0;
        obtain.sendToTarget();
    }

    public static boolean a(Context context) {
        return TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1;
    }

    public static boolean a(Context context, int i5) {
        return Build.VERSION.SDK_INT > 28 && context.getApplicationInfo().targetSdkVersion > 28 && i5 > 0 && i5 < 45114;
    }

    private static boolean a(Context context, boolean z4) {
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        String string = tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DEVICE_CPUABI, null);
        f1907e = string;
        if (TextUtils.isEmpty(string) || com.tencent.smtt.utils.b.a(f1907e)) {
            return true;
        }
        TbsLog.e(LOGTAG, "can not support x86 devices!!");
        tbsDownloadConfig.setDownloadInterruptCode(-104);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.a(android.content.Context, boolean, boolean):boolean");
    }

    @TargetApi(11)
    private static boolean a(String str, int i5, boolean z4, boolean z5, boolean z6) {
        int i6;
        JSONObject jSONObject;
        boolean z7;
        Integer num;
        String str2;
        String str3;
        int tbsVersion;
        TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] response=" + str + ";isNeedInstall=" + z6);
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f1905c);
        if (TextUtils.isEmpty(str)) {
            tbsDownloadConfig.setDownloadInterruptCode(-108);
            TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] return #1,response is empty...");
            return false;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        int i7 = jSONObject2.getInt("RET");
        if (i7 != 0) {
            tbsDownloadConfig.setDownloadInterruptCode(-109);
            TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] return #2,returnCode=" + i7);
            return false;
        }
        int i8 = jSONObject2.getInt("RESPONSECODE");
        String string = jSONObject2.getString("DOWNLOADURL");
        String optString = jSONObject2.optString("URLLIST", "");
        int i9 = jSONObject2.getInt("TBSAPKSERVERVERSION");
        if (QbSdk.b(f1905c, i9)) {
            tbsDownloadConfig.setDownloadInterruptCode(-126);
            return false;
        }
        int i10 = jSONObject2.getInt("DOWNLOADMAXFLOW") * 2;
        int i11 = jSONObject2.getInt("DOWNLOAD_MIN_FREE_SPACE");
        int i12 = jSONObject2.getInt("DOWNLOAD_SUCCESS_MAX_RETRYTIMES");
        int i13 = jSONObject2.getInt("DOWNLOAD_FAILED_MAX_RETRYTIMES");
        long j5 = jSONObject2.getLong("DOWNLOAD_SINGLE_TIMEOUT");
        long j6 = jSONObject2.getLong("TBSAPKFILESIZE");
        long optLong = jSONObject2.optLong("RETRY_INTERVAL", 0L);
        int optInt = jSONObject2.optInt("FLOWCTR", -1);
        int optInt2 = jSONObject2.optInt("USEX5", 1);
        h();
        g();
        if (optInt2 == 0 && (tbsVersion = QbSdk.getTbsVersion(f1905c)) != 0) {
            a(tbsVersion);
        }
        try {
            if (!TextUtils.isEmpty(string)) {
                string.contains("" + i9);
            }
            i6 = i11;
        } catch (Throwable th) {
            i6 = i11;
            StringBuilder g5 = androidx.activity.d.g("throwable is ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.i(LOGTAG, g5.toString());
        }
        int optInt3 = jSONObject2.optInt("USEBBACKUPVER", 0);
        try {
            optInt3 = jSONObject2.getInt("USEBBACKUPVER");
        } catch (Exception unused) {
        }
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_USE_BACKUP_VERSION, Integer.valueOf(optInt3));
        String optString2 = jSONObject2.optString("PKGMD5", null);
        int optInt4 = jSONObject2.optInt("RESETX5", 0);
        jSONObject2.optInt("UPLOADLOG", 0);
        jSONObject2.optInt("RESETDECOUPLECORE", 0);
        String optString3 = jSONObject2.optString("SETTOKEN", "");
        boolean z8 = jSONObject2.optInt("RESETTOKEN", 0) != 0;
        boolean z9 = jSONObject2.optInt("ENABLE_LOAD_RENAME_FILE_LOCK_WAIT", 1) != 0;
        int optInt5 = jSONObject2.optInt("RESETTODECOUPLECORE", 0);
        synchronized (f1908f) {
            if (z8) {
                try {
                    jSONObject = jSONObject2;
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, "");
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                jSONObject = jSONObject2;
            }
            if (!TextUtils.isEmpty(optString3) && optString3.length() == 96) {
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, optString3 + "&" + com.tencent.smtt.utils.h.c());
            }
        }
        if (optInt4 == 1) {
            tbsDownloadConfig.setDownloadInterruptCode(-110);
            QbSdk.reset(f1905c, optInt5 == 1);
            str2 = LOGTAG;
            str3 = "[TbsDownloader.readResponse] return #3,needResetTbs=1,isQuery=" + z4;
        } else {
            if (!z9) {
                tbsDownloadConfig.setTbsCoreLoadRenameFileLockWaitEnable(z9);
            }
            long j7 = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
            if (optInt == 1) {
                if (optLong > 604800) {
                    optLong = 604800;
                }
                if (optLong > 0) {
                    j7 = optLong;
                }
                TbsLog.w(LOGTAG, "Download is Flowed, next download request is " + j7 + "s later");
                if (TbsShareManager.isThirdPartyApp(f1905c)) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                    tbsDownloadConfig.commit();
                    tbsDownloadConfig.setDownloadInterruptCode(TbsCommonCode.DOWNLOAD_FLOW_CANCEL);
                    return false;
                }
            }
            if (getRetryIntervalInSeconds() >= 0) {
                j7 = getRetryIntervalInSeconds();
            }
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RETRY_INTERVAL, Long.valueOf(j7));
            if (TextUtils.isEmpty(string) && TbsShareManager.isThirdPartyApp(f1905c)) {
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                tbsDownloadConfig.commit();
                tbsDownloadConfig.setDownloadInterruptCode(-124);
                str2 = LOGTAG;
                str3 = "[TbsDownloader.readResponse] blank url,current app is third app...";
            } else {
                TbsLog.i(LOGTAG, "in response responseCode is " + i8);
                if (i8 == 0) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, Integer.valueOf(i8));
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                    tbsDownloadConfig.setDownloadInterruptCode(-111);
                    tbsDownloadConfig.commit();
                    TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] return #5,responseCode=0");
                    return false;
                }
                int i14 = TbsDownloadConfig.getInstance(f1905c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0);
                if (i14 > i9) {
                    f1909g.b();
                    m.a().l(f1905c);
                }
                if (TbsShareManager.isThirdPartyApp(f1905c)) {
                    z7 = false;
                } else {
                    int d5 = m.a().d(f1905c, 0);
                    z7 = d5 >= i9;
                    TbsLog.i(LOGTAG, "tmpCoreVersion is " + d5 + " tbsDownloadVersion is" + i9);
                }
                if (i5 >= i9 || TextUtils.isEmpty(string) || z7) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                    tbsDownloadConfig.commit();
                    tbsDownloadConfig.setDownloadInterruptCode(TextUtils.isEmpty(string) ? -124 : i9 <= 0 ? -125 : i5 >= i9 ? -127 : -112);
                    TbsLog.i(LOGTAG, "version error or downloadUrl empty ,return ahead tbsLocalVersion=" + i5 + " tbsDownloadVersion=" + i9 + " tbsLastDownloadVersion=" + i14 + " downloadUrl=" + string);
                    return false;
                }
                if (string.equals(tbsDownloadConfig.mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, null))) {
                    num = 0;
                } else {
                    f1909g.b();
                    num = 0;
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_RETRYTIMES, null);
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_RETRYTIMES, null);
                }
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, Integer.valueOf(i9));
                TbsLog.i(LOGTAG, "put KEY_TBS_DOWNLOAD_V is " + i9);
                if (i9 > 0) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V_TYPE, num);
                }
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOADURL, string);
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADURL_LIST, optString);
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, Integer.valueOf(i8));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_MAXFLOW, Integer.valueOf(i10));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_MIN_FREE_SPACE, Integer.valueOf(i6));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_MAX_RETRYTIMES, Integer.valueOf(i12));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_MAX_RETRYTIMES, Integer.valueOf(i13));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SINGLE_TIMEOUT, Long.valueOf(j5));
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, Long.valueOf(j6));
                tbsDownloadConfig.commit();
                if (optString2 != null) {
                    tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPK_MD5, optString2);
                }
                if (z5 || !z6 || !m.a().b(f1905c, i9)) {
                    if (!z4) {
                        tbsDownloadConfig.setDownloadInterruptCode(-216);
                    }
                    Map<String, Object> map = tbsDownloadConfig.mSyncMap;
                    Boolean bool = Boolean.TRUE;
                    map.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, bool);
                    TbsLog.i(LOGTAG, "[TbsDownloader.readResponse] ##9 set needDownload=true");
                    if (jSONObject.optInt("stop_pre_oat", 0) == 1) {
                        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_STOP_PRE_OAT, bool);
                    }
                    tbsDownloadConfig.commit();
                    return true;
                }
                tbsDownloadConfig.setDownloadInterruptCode(-213);
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, Boolean.FALSE);
                str2 = LOGTAG;
                str3 = "[TbsDownloader.readResponse] ##6 set needDownload=false";
            }
        }
        TbsLog.i(str2, str3);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r7) {
        /*
            java.lang.String r0 = "ISO8859-1"
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = com.tencent.smtt.sdk.TbsDownloader.f1904b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lf
            java.lang.String r7 = com.tencent.smtt.sdk.TbsDownloader.f1904b
            return r7
        Lf:
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L25
            byte[] r6 = r4.getBytes(r1)     // Catch: java.lang.Exception -> L25
            r5.<init>(r6, r0)     // Catch: java.lang.Exception -> L25
            r4 = r5
            goto L26
        L25:
        L26:
            java.lang.String r5 = "1.0"
            if (r4 != 0) goto L2e
        L2a:
            r3.append(r5)
            goto L37
        L2e:
            int r6 = r4.length()
            if (r6 <= 0) goto L2a
            r3.append(r4)
        L37:
            java.lang.String r4 = "; "
            r3.append(r4)
            java.lang.String r5 = r2.getLanguage()
            if (r5 == 0) goto L59
            java.lang.String r5 = r5.toLowerCase()
            r3.append(r5)
            java.lang.String r2 = r2.getCountry()
            if (r2 == 0) goto L5e
            java.lang.String r5 = "-"
            r3.append(r5)
            java.lang.String r2 = r2.toLowerCase()
            goto L5b
        L59:
            java.lang.String r2 = "en"
        L5b:
            r3.append(r2)
        L5e:
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            java.lang.String r5 = "REL"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
            java.lang.String r7 = com.tencent.smtt.utils.s.a(r7)
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L77
            byte[] r1 = r7.getBytes(r1)     // Catch: java.lang.Exception -> L77
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L77
            r7 = r2
            goto L78
        L77:
        L78:
            if (r7 != 0) goto L7e
            r3.append(r4)
            goto L8a
        L7e:
            int r0 = r7.length()
            if (r0 <= 0) goto L8a
            r3.append(r4)
            r3.append(r7)
        L8a:
            java.lang.String r7 = android.os.Build.ID
            java.lang.String r0 = ""
            if (r7 != 0) goto L91
            r7 = r0
        L91:
            java.lang.String r1 = "[一-龥]"
            java.lang.String r7 = r7.replaceAll(r1, r0)
            java.lang.String r0 = " Build/"
            if (r7 != 0) goto La4
            r3.append(r0)
            java.lang.String r7 = "00"
        La0:
            r3.append(r7)
            goto Lae
        La4:
            int r1 = r7.length()
            if (r1 <= 0) goto Lae
            r3.append(r0)
            goto La0
        Lae:
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r0 = 0
            r7[r0] = r3
            java.lang.String r0 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1"
            java.lang.String r7 = java.lang.String.format(r0, r7)
            com.tencent.smtt.sdk.TbsDownloader.f1904b = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloader.b(android.content.Context):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(final boolean z4, boolean z5, boolean z6, boolean z7) {
        int i5;
        final TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f1905c);
        Map<String, Object> map = QbSdk.f1822o;
        if (map != null && map.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.f1822o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
            tbsDownloadConfig.setDownloadInterruptCode(-131);
            return false;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest]isQuery: " + z4 + " forDecoupleCore is " + z6);
        if (m.a().c(f1905c)) {
            TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest] -- isTbsLocalInstalled!");
            tbsDownloadConfig.setDownloadInterruptCode(-132);
            return false;
        }
        if (f1907e == null) {
            String a5 = com.tencent.smtt.utils.b.a();
            f1907e = a5;
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_DEVICE_CPUABI, a5);
            tbsDownloadConfig.commit();
        }
        if (!TextUtils.isEmpty(f1907e) && !com.tencent.smtt.utils.b.a(f1907e)) {
            tbsDownloadConfig.setDownloadInterruptCode(-104);
            TbsLog.i(LOGTAG, "TbsDownloader sendRequest cpu is invalid:" + f1907e);
            return false;
        }
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, com.tencent.smtt.utils.b.a(f1905c));
        tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, Integer.valueOf(com.tencent.smtt.utils.b.b(f1905c)));
        tbsDownloadConfig.commit();
        JSONObject a6 = a(z4, z5, z6);
        int optInt = a6.optInt("TBSV", -1);
        if (optInt != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (TbsShareManager.isThirdPartyApp(f1905c)) {
                tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, Long.valueOf(currentTimeMillis - tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL, 0L) < tbsDownloadConfig.getRetryInterval() * 1000 ? tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, 0L) + 1 : 1L));
            }
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL, Long.valueOf(currentTimeMillis));
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, com.tencent.smtt.utils.b.a(f1905c));
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE, Integer.valueOf(com.tencent.smtt.utils.b.b(f1905c)));
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_APP_METADATA, com.tencent.smtt.utils.b.a(f1905c, TBS_METADATA));
            tbsDownloadConfig.commit();
        }
        if (optInt != -1 || z6) {
            try {
                String d5 = com.tencent.smtt.utils.o.a(f1905c).d();
                TbsLog.i(LOGTAG, "[TbsDownloader.sendRequest] postUrl=" + d5);
                if (z4) {
                    f1917o = a6;
                } else {
                    f1918p = a6;
                }
                if (z4) {
                    return true;
                }
                String a7 = com.tencent.smtt.utils.g.a(d5, a6.toString().getBytes("utf-8"), new g.a() { // from class: com.tencent.smtt.sdk.TbsDownloader.2
                    @Override // com.tencent.smtt.utils.g.a
                    public void a(int i6) {
                        TbsDownloadConfig tbsDownloadConfig2;
                        int i7;
                        TbsDownloadConfig.this.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, Long.valueOf(System.currentTimeMillis()));
                        TbsDownloadConfig.this.commit();
                        TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.sendRequest] httpResponseCode=" + i6);
                        if (TbsShareManager.isThirdPartyApp(TbsDownloader.f1905c) && i6 == 200) {
                            TbsDownloadConfig.this.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_LAST_REQUEST_SUCCESS, Long.valueOf(System.currentTimeMillis()));
                            TbsDownloadConfig.this.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL, 0L);
                            TbsDownloadConfig.this.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_COUNT_REQUEST_FAIL_IN_24HOURS, 0L);
                            TbsDownloadConfig.this.commit();
                        }
                        if (i6 >= 300) {
                            if (z4) {
                                tbsDownloadConfig2 = TbsDownloadConfig.this;
                                i7 = -107;
                            } else {
                                tbsDownloadConfig2 = TbsDownloadConfig.this;
                                i7 = -207;
                            }
                            tbsDownloadConfig2.setDownloadInterruptCode(i7);
                        }
                    }
                }, false);
                if (!TextUtils.isEmpty(a7) && a7.contains("HttpError")) {
                    TbsLog.i(LOGTAG, "Cfg Request error: " + a7);
                    TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(f1905c).tbsLogInfo();
                    tbsLogInfo.setErrorCode(-129);
                    tbsLogInfo.setFailDetail(a7);
                    TbsLogReport.getInstance(f1905c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, tbsLogInfo);
                }
                return a(a7, optInt, z4, z5, z7);
            } catch (Throwable th) {
                StringBuilder g5 = androidx.activity.d.g("sendrequest return false ");
                g5.append(Log.getStackTraceString(th));
                TbsLog.i(LOGTAG, g5.toString());
                th.printStackTrace();
                i5 = -106;
            }
        } else {
            i5 = -113;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i5);
        return false;
    }

    private static synchronized void c() {
        synchronized (TbsDownloader.class) {
            if (f1910h == null) {
                f1910h = TbsHandlerThread.getInstance();
                try {
                    f1909g = new k(f1905c);
                    f1906d = new Handler(f1910h.getLooper()) { // from class: com.tencent.smtt.sdk.TbsDownloader.1
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            int i5 = message.what;
                            if (i5 == 109) {
                                if (TbsDownloader.f1909g != null) {
                                    TbsDownloader.f1909g.e();
                                    return;
                                }
                                return;
                            }
                            if (i5 == 110) {
                                if (TbsDownloader.f1905c != null) {
                                    TbsDownloadConfig.getInstance(TbsDownloader.f1905c).saveDownloadInterruptCode();
                                    return;
                                }
                                return;
                            }
                            switch (i5) {
                                case 100:
                                    boolean z4 = message.arg1 == 1;
                                    boolean b5 = TbsDownloader.b(true, false, false, message.arg2 == 1);
                                    Object obj = message.obj;
                                    if (obj != null && (obj instanceof TbsDownloaderCallback)) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "needDownload-onNeedDownloadFinish needStartDownload=" + b5);
                                        String str = (TbsDownloader.f1905c == null || TbsDownloader.f1905c.getApplicationContext() == null || TbsDownloader.f1905c.getApplicationContext().getApplicationInfo() == null) ? "" : TbsDownloader.f1905c.getApplicationContext().getApplicationInfo().packageName;
                                        if (b5 && !z4) {
                                            if (TbsConfig.APP_WX.equals(str) || TbsConfig.APP_QQ.equals(str)) {
                                                TbsLog.i(TbsDownloader.LOGTAG, "needDownload-onNeedDownloadFinish in mm or QQ callback needStartDownload = " + b5);
                                            }
                                        }
                                        ((TbsDownloaderCallback) message.obj).onNeedDownloadFinish(b5, TbsDownloadConfig.getInstance(TbsDownloader.f1905c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
                                    }
                                    if (TbsShareManager.isThirdPartyApp(TbsDownloader.f1905c) && b5) {
                                        TbsDownloader.startDownload(TbsDownloader.f1905c);
                                        break;
                                    }
                                    break;
                                case 101:
                                    TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(TbsDownloader.f1905c);
                                    if (Apn.getApnType(TbsDownloader.f1905c) != 3 && !QbSdk.canDownloadWithoutWifi()) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "not wifi,no need send request");
                                        tbsDownloadConfig.setDownloadInterruptCode(-220);
                                        QbSdk.f1821n.onDownloadFinish(111);
                                        QbSdk.f1821n.onInstallFinish(243);
                                        break;
                                    } else {
                                        TbsLog.i(TbsDownloader.LOGTAG, "---getting download file lock...");
                                        FileOutputStream b6 = FileUtil.b(TbsDownloader.f1905c, true, "tbs_download_lock_file");
                                        if (b6 == null) {
                                            tbsDownloadConfig.setDownloadInterruptCode(-204);
                                            QbSdk.f1821n.onDownloadFinish(TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED);
                                            QbSdk.f1821n.onInstallFinish(243);
                                            TbsLog.w(TbsDownloader.LOGTAG, "download file-lock file io exception");
                                            break;
                                        } else {
                                            FileLock a5 = FileUtil.a(TbsDownloader.f1905c, b6);
                                            if (a5 == null) {
                                                TbsLog.i(TbsDownloader.LOGTAG, "download file-lock locked, core is downloading");
                                                tbsDownloadConfig.setDownloadInterruptCode(-203);
                                                FileUtil.a(b6);
                                                if (QbSdk.c() == null) {
                                                    QbSdk.f1821n.onDownloadFinish(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
                                                    QbSdk.f1821n.onInstallFinish(243);
                                                    break;
                                                } else {
                                                    TbsDownloader.a(TbsDownloader.f1905c, new Runnable() { // from class: com.tencent.smtt.sdk.TbsDownloader.1.1
                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            QbSdk.f1821n.onDownloadFinish(TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING);
                                                            QbSdk.f1821n.onInstallFinish(243);
                                                        }
                                                    });
                                                    break;
                                                }
                                            } else {
                                                boolean z5 = message.arg1 == 1;
                                                if (TbsDownloader.b(false, z5, false, true)) {
                                                    if (z5 && m.a().b(TbsDownloader.f1905c, TbsDownloadConfig.getInstance(TbsDownloader.f1905c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0))) {
                                                        TbsLog.i(TbsDownloader.LOGTAG, "needStartDownload, but try local install core firstly");
                                                        QbSdk.f1821n.onDownloadFinish(122);
                                                        QbSdk.f1821n.onInstallFinish(243);
                                                        tbsDownloadConfig.setDownloadInterruptCode(-213);
                                                    } else if (tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false)) {
                                                        TbsDownloadConfig.getInstance(TbsDownloader.f1905c).setDownloadInterruptCode(-215);
                                                        TbsLog.i(TbsDownloader.LOGTAG, "start download in apk downloader...");
                                                        TbsDownloader.f1909g.a(z5, false);
                                                    } else {
                                                        tbsDownloadConfig.setDownloadInterruptCode(-133);
                                                        QbSdk.f1821n.onDownloadFinish(TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR);
                                                    }
                                                    TbsLog.i(TbsDownloader.LOGTAG, "------freeDownloadFileLock...");
                                                    FileUtil.a(a5, b6);
                                                    break;
                                                } else {
                                                    int currentDownloadInterruptCode = TbsDownloadConfig.getInstance(TbsDownloader.f1905c).getCurrentDownloadInterruptCode();
                                                    TbsLog.i(TbsDownloader.LOGTAG, "No need to download, code is " + currentDownloadInterruptCode);
                                                    QbSdk.f1821n.onDownloadFinish(currentDownloadInterruptCode);
                                                }
                                                QbSdk.f1821n.onInstallFinish(243);
                                                TbsLog.i(TbsDownloader.LOGTAG, "------freeDownloadFileLock...");
                                                FileUtil.a(a5, b6);
                                            }
                                        }
                                    }
                                    break;
                                case 102:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_REPORT_DOWNLOAD_STAT");
                                    int k5 = m.a().k(TbsDownloader.f1905c);
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] localTbsVersion=" + k5);
                                    TbsDownloader.f1909g.b(k5);
                                    TbsLogReport.getInstance(TbsDownloader.f1905c).dailyReport();
                                    break;
                                case 103:
                                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsDownloader.handleMessage] MSG_CONTINUEINSTALL_TBSCORE");
                                    if (message.arg1 == 0) {
                                        m.a().a((Context) message.obj, true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                } catch (Exception e5) {
                    f1912j = true;
                    TbsLog.e(LOGTAG, "TbsApkDownloader init has Exception, " + Log.getStackTraceString(e5));
                }
            }
        }
    }

    @TargetApi(11)
    public static void c(Context context) {
        TbsDownloadConfig.getInstance(context).clear();
        TbsLogReport.getInstance(context).clear();
        k.b(context);
        context.getSharedPreferences("tbs_extension_config", 4).edit().clear().commit();
        context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit().clear().commit();
    }

    private static boolean d() {
        try {
            return TbsDownloadConfig.getInstance(f1905c).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION, "").equals(e().toString());
        } catch (Exception unused) {
            return false;
        }
    }

    private static JSONArray e() {
        if (!TbsShareManager.isThirdPartyApp(f1905c)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int tbsVersion = QbSdk.getTbsVersion(f1905c);
        if (tbsVersion > 0) {
            jSONArray.put(tbsVersion);
        }
        return jSONArray;
    }

    private static boolean f() {
        int i5;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f1905c);
        if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_SUCCESS_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadSuccessMaxRetrytimes()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] out of success retrytimes", true);
            i5 = -115;
        } else if (tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOAD_FAILED_RETRYTIMES, 0) >= tbsDownloadConfig.getDownloadFailedMaxRetrytimes()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] out of failed retrytimes", true);
            i5 = -116;
        } else {
            if (FileUtil.b(f1905c)) {
                if (System.currentTimeMillis() - tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_STARTTIME, 0L) <= 86400000) {
                    long j5 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSDOWNLOAD_FLOW, 0L);
                    TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] downloadFlow=" + j5);
                    if (j5 >= tbsDownloadConfig.getDownloadMaxflow()) {
                        TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] failed because you exceeded max flow!", true);
                        i5 = -120;
                    }
                }
                return true;
            }
            TbsLog.i(LOGTAG, "[TbsDownloader.needStartDownload] local rom freespace limit", true);
            i5 = -117;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i5);
        return false;
    }

    private static void g() {
        File o4 = m.o(f1905c);
        if (o4 == null) {
            return;
        }
        File[] listFiles = o4.listFiles();
        Pattern compile = Pattern.compile("tbs_switch_disable_(.*)");
        for (File file : listFiles) {
            if (compile.matcher(file.getName()).find() && file.isFile() && file.exists() && file.canRead()) {
                boolean delete = file.delete();
                StringBuilder g5 = androidx.activity.d.g("clearTbsCoreDisableFlagFiles: ");
                g5.append(file.getName());
                g5.append("; res: ");
                g5.append(delete);
                TbsLog.i(LOGTAG, g5.toString());
            }
        }
    }

    public static String getBackupFileName(boolean z4) {
        return getBackupFileName(z4, 0);
    }

    public static String getBackupFileName(boolean z4, int i5) {
        boolean c5 = i5 == 64 ? true : i5 == 32 ? false : com.tencent.smtt.utils.b.c();
        return z4 ? c5 ? "x5.tbs.decouple.64" : "x5.tbs.decouple" : c5 ? "x5.tbs.org.64" : "x5.tbs.org";
    }

    public static int getCoreShareDecoupleCoreVersion() {
        return m.a().f(f1905c);
    }

    public static int getCoreShareDecoupleCoreVersionByContext(Context context) {
        return m.a().f(context);
    }

    public static int getNextPostInterval(Context context) {
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
        long j5 = tbsDownloadConfig.mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, 0L);
        return Math.max((int) (((tbsDownloadConfig.getRetryInterval() * 1000) - (System.currentTimeMillis() - j5)) / 1000), 0);
    }

    public static synchronized boolean getOverSea(Context context) {
        boolean z4;
        synchronized (TbsDownloader.class) {
            if (!f1916n) {
                f1916n = true;
                TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
                if (tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA)) {
                    f1915m = tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_IS_OVERSEA, false);
                    TbsLog.i(LOGTAG, "[TbsDownloader.getOverSea]  first called. sOverSea = " + f1915m);
                }
                TbsLog.i(LOGTAG, "[TbsDownloader.getOverSea]  sOverSea = " + f1915m);
            }
            z4 = f1915m;
        }
        return z4;
    }

    public static long getRetryIntervalInSeconds() {
        return f1923u;
    }

    public static HandlerThread getsTbsHandlerThread() {
        return f1910h;
    }

    private static void h() {
        File file = new File(m.o(f1905c), "switch_disable_check");
        if (file.exists()) {
            return;
        }
        try {
            TbsLog.i(LOGTAG, "addSwitchDisableCheckFlag status: " + file.createNewFile());
        } catch (IOException e5) {
            TbsLog.i(LOGTAG, "" + e5);
        }
    }

    private static void i() {
        Handler handler = f1906d;
        if (handler != null) {
            handler.obtainMessage(110).sendToTarget();
        }
    }

    public static boolean isDownloadForeground() {
        k kVar = f1909g;
        return kVar != null && kVar.c();
    }

    public static synchronized boolean isDownloading() {
        boolean z4;
        synchronized (TbsDownloader.class) {
            TbsLog.i(LOGTAG, "[TbsDownloader.isDownloading] is " + f1903a);
            z4 = f1903a;
        }
        return z4;
    }

    public static boolean isTbsCoreDisabledBySwitch(Context context, int i5) {
        return new File(m.o(context), androidx.appcompat.widget.a.g("tbs_switch_disable_", i5)).exists();
    }

    public static boolean needDownload(Context context, boolean z4) {
        return needDownload(context, z4, false, true, null);
    }

    public static boolean needDownload(Context context, boolean z4, boolean z5, TbsDownloaderCallback tbsDownloaderCallback) {
        return needDownload(context, z4, z5, true, tbsDownloaderCallback);
    }

    public static boolean needDownload(Context context, boolean z4, boolean z5, boolean z6, TbsDownloaderCallback tbsDownloaderCallback) {
        int i5;
        TbsShareManager.mHasQueried = true;
        Context applicationContext = context.getApplicationContext();
        f1905c = applicationContext;
        TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(applicationContext);
        tbsDownloadConfig.setDownloadInterruptCode(-100);
        TbsLog.initIfNeed(context);
        StringBuilder g5 = androidx.activity.d.g("needDownload,process=");
        g5.append(QbSdk.getCurrentProcessName(context));
        g5.append("stack=");
        g5.append(Log.getStackTraceString(new Throwable()));
        TbsLog.i(LOGTAG, g5.toString());
        m.a().b(context, f.f2121a == 0);
        int b5 = m.a().b(context);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],renameRet=" + b5);
        if (b5 != 0) {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
            tbsLogInfo.f1944a = TbsListener.ErrorCode.RENAME_NO_NEED_SENDREQUEST;
            tbsLogInfo.setFailDetail("code=2" + b5);
        }
        if (b5 < 0) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needReNameFile=" + b5);
            tbsDownloadConfig.setDownloadInterruptCode(-128);
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] oversea=" + z4 + ",isDownloadForeground=" + z5);
        if (m.f2185a) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#1 Static Installing, return false");
            tbsDownloadConfig.setDownloadInterruptCode(-130);
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        if (!a(f1905c, z4)) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#2 Not shouldDoNeedDownload, return false");
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        c();
        if (f1912j) {
            tbsDownloadConfig.setDownloadInterruptCode(-105);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#3 TbsApkDownloader init Exception, return false");
            if (tbsDownloaderCallback != null) {
                tbsDownloaderCallback.onNeedDownloadFinish(false, 0);
            }
            return false;
        }
        boolean a5 = a(f1905c, z5, false);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needSendRequest=" + a5);
        if (a5) {
            a(z5, tbsDownloaderCallback, z6);
            i5 = -114;
        } else {
            i5 = TbsCommonCode.DOWNLOAD_NO_NEED_REQUEST;
        }
        tbsDownloadConfig.setDownloadInterruptCode(i5);
        f1906d.removeMessages(102);
        Message.obtain(f1906d, 102).sendToTarget();
        boolean contains = tbsDownloadConfig.mPreferences.contains(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD);
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] hasNeedDownloadKey=" + contains);
        boolean z7 = (contains || TbsShareManager.isThirdPartyApp(context)) ? tbsDownloadConfig.mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_NEEDDOWNLOAD, false) : true;
        TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#4,needDownload=" + z7 + ",hasNeedDownloadKey=" + contains);
        if (!z7) {
            int k5 = m.a().k(f1905c);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#7,tbsLocalVersion=" + k5 + ",needSendRequest=" + a5);
            if (a5 || k5 <= 0) {
                f1906d.removeMessages(103);
                if (k5 <= 0 && !a5) {
                    Message.obtain(f1906d, 103, 0, 0, f1905c).sendToTarget();
                }
            }
        } else if (f()) {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload] NEEDDOWNLOAD_WILL_STARTDOWNLOAD");
        } else {
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload]#5,set needDownload = false");
            z7 = false;
        }
        if (!a5 && tbsDownloaderCallback != null) {
            tbsDownloaderCallback.onNeedDownloadFinish(z7, 0);
        }
        i();
        return z7;
    }

    public static boolean needDownloadDecoupleCore() {
        int i5;
        if (TbsShareManager.isThirdPartyApp(f1905c) || a(f1905c)) {
            return false;
        }
        return System.currentTimeMillis() - TbsDownloadConfig.getInstance(f1905c).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_DOWNLOAD_DECOUPLE_CORE, 0L) >= TbsDownloadConfig.getInstance(f1905c).getRetryInterval() * 1000 && (i5 = TbsDownloadConfig.getInstance(f1905c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0)) > 0 && i5 != m.a().f(f1905c) && TbsDownloadConfig.getInstance(f1905c).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0) != i5;
    }

    public static void pauseDownload() {
        StringBuilder g5 = androidx.activity.d.g("called pauseDownload,downloader=");
        g5.append(f1909g);
        TbsLog.i(LOGTAG, g5.toString());
        k kVar = f1909g;
        if (kVar != null) {
            kVar.d();
        }
    }

    public static void resumeDownload() {
        StringBuilder g5 = androidx.activity.d.g("called resumeDownload,downloader=");
        g5.append(f1909g);
        TbsLog.i(LOGTAG, g5.toString());
        Handler handler = f1906d;
        if (handler != null) {
            handler.removeMessages(109);
            f1906d.sendEmptyMessage(109);
        }
    }

    public static void setAppContext(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        f1905c = context.getApplicationContext();
    }

    public static void setRetryIntervalInSeconds(Context context, long j5) {
        if (context == null) {
            return;
        }
        if (context.getApplicationInfo().packageName.equals("com.tencent.qqlive")) {
            f1923u = j5;
        }
        StringBuilder g5 = androidx.activity.d.g("mRetryIntervalInSeconds is ");
        g5.append(f1923u);
        TbsLog.i(LOGTAG, g5.toString());
    }

    @Deprecated
    public static boolean startDecoupleCoreIfNeeded() {
        return false;
    }

    public static void startDownload(Context context) {
        startDownload(context, false);
    }

    public static synchronized void startDownload(Context context, boolean z4) {
        synchronized (TbsDownloader.class) {
            int i5 = 1;
            if (TbsShareManager.isThirdPartyApp(context)) {
                int i6 = f1911i + 1;
                f1911i = i6;
                if (i6 > 1) {
                    TbsLog.w(LOGTAG, "[Warning] for privacy security, TBS Only allow startDownload 1 times each process");
                    QbSdk.f1821n.onDownloadFinish(127);
                    return;
                }
            }
            if (QbSdk.d()) {
                TbsLog.w(LOGTAG, "[warning] using private CDN mode, default downloader can not startDownload.");
                QbSdk.f1821n.onDownloadFinish(135);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            f1905c = applicationContext;
            TbsLog.initIfNeed(applicationContext);
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(f1905c);
            tbsDownloadConfig.setDownloadInterruptCode(-200);
            TbsLog.i(LOGTAG, "[TbsDownloader.startDownload] sAppContext=" + f1905c);
            if (m.f2185a) {
                tbsDownloadConfig.setDownloadInterruptCode(-130);
                QbSdk.f1821n.onDownloadFinish(TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING);
                return;
            }
            m.a().b(context, f.f2121a == 0);
            int b5 = m.a().b(context);
            TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],renameRet=" + b5);
            if (b5 < 0) {
                tbsDownloadConfig.setDownloadInterruptCode(-128);
                QbSdk.f1821n.onDownloadFinish(TbsListener.ErrorCode.NEEDDOWNLOAD_TMPCORE_PREPARING);
                TbsLog.i(LOGTAG, "[TbsDownloader.needDownload],needReNameFile=" + b5);
                return;
            }
            f1903a = true;
            c();
            if (f1912j) {
                tbsDownloadConfig.setDownloadInterruptCode(-202);
                QbSdk.f1821n.onDownloadFinish(121);
                return;
            }
            if (z4) {
                stopDownload();
            }
            f1906d.removeMessages(101);
            f1906d.removeMessages(100);
            Message obtain = Message.obtain(f1906d, 101, QbSdk.f1821n);
            if (!z4) {
                i5 = 0;
            }
            obtain.arg1 = i5;
            obtain.sendToTarget();
        }
    }

    public static void stopDownload() {
        if (f1912j) {
            return;
        }
        TbsLog.i(LOGTAG, "[TbsDownloader.stopDownload]");
        k kVar = f1909g;
        if (kVar != null) {
            kVar.a();
        }
        Handler handler = f1906d;
        if (handler != null) {
            handler.removeMessages(100);
            f1906d.removeMessages(101);
            f1906d.removeMessages(108);
        }
    }
}
