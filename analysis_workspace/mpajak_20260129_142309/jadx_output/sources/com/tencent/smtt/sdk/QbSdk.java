package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import androidx.core.provider.FontsContractCompat;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.TbsLogClient;
import com.tencent.smtt.utils.Timer;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class QbSdk {
    private static int A = 170;
    private static String B = null;
    private static String C = null;

    @Deprecated
    public static final int CORE_VER_ENABLE_202112 = 45912;
    public static final int CORE_VER_ENABLE_202207 = 46110;
    private static boolean D = false;
    private static boolean E = false;
    public static final int EXTENSION_INIT_FAILURE = -99999;
    private static boolean F = false;
    private static TbsListener G = null;
    private static TbsListener H = null;
    private static boolean I = false;
    private static boolean J = false;
    public static final String KEY_SET_SENDREQUEST_AND_UPLOAD = "SET_SENDREQUEST_AND_UPLOAD";
    public static final String KEY_THIRD_PARTY_TURING = "turing";
    public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
    public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
    public static final int QBMODE = 2;
    public static final String SHARE_PREFERENCES_NAME = "tbs_file_open_dialog_config";
    public static final String SVNVERSION = "jnizz";
    public static final int TBSMODE = 1;
    public static final String TID_QQNumber_Prefix = "QQ:";
    public static final int VERSION = 1;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1808a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1809b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1810c = true;

    /* renamed from: d, reason: collision with root package name */
    public static String f1811d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1812e = false;

    /* renamed from: f, reason: collision with root package name */
    public static long f1813f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static long f1814g = 0;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1816i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f1817j = true;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f1818k = false;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f1819l = false;

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f1820m = false;
    public static boolean mDisableUseHostBackupCore = false;

    /* renamed from: p, reason: collision with root package name */
    private static int f1823p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static String f1824q = "";

    /* renamed from: r, reason: collision with root package name */
    private static Class<?> f1825r = null;

    /* renamed from: s, reason: collision with root package name */
    private static Object f1826s = null;
    public static boolean sIsVersionPrinted = false;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f1827t = false;

    /* renamed from: u, reason: collision with root package name */
    private static String[] f1828u = null;

    /* renamed from: v, reason: collision with root package name */
    private static String f1829v = "NULL";

    /* renamed from: w, reason: collision with root package name */
    private static String f1830w = "UNKNOWN";

    /* renamed from: x, reason: collision with root package name */
    private static boolean f1831x = false;

    /* renamed from: y, reason: collision with root package name */
    private static int f1832y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static int f1833z;

    /* renamed from: h, reason: collision with root package name */
    public static Object f1815h = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static TbsListener f1821n = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.5
        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadFinish(int i5) {
            TbsDownloader.f1903a = false;
            if (QbSdk.G != null) {
                QbSdk.G.onDownloadFinish(i5);
            }
            if (QbSdk.H != null) {
                QbSdk.H.onDownloadFinish(i5);
            }
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public void onDownloadProgress(int i5) {
            if (QbSdk.H != null) {
                QbSdk.H.onDownloadProgress(i5);
            }
            if (QbSdk.G != null) {
                QbSdk.G.onDownloadProgress(i5);
            }
        }

        @Override // com.tencent.smtt.sdk.TbsListener
        public void onInstallFinish(int i5) {
            if (i5 == 243 && QbSdk.H != null) {
                QbSdk.H.onInstallFinish(i5);
                return;
            }
            if (i5 != 200) {
            }
            TbsLog.i("QbSdk", "onInstallFinish errCode is " + i5, true);
            QbSdk.setTBSInstallingStatus(false);
            TbsDownloader.f1903a = false;
            if (QbSdk.G != null) {
                QbSdk.G.onInstallFinish(i5);
            }
            if (QbSdk.H != null) {
                QbSdk.H.onInstallFinish(i5);
            }
        }
    };
    private static boolean K = false;
    private static boolean L = false;

    /* renamed from: o, reason: collision with root package name */
    public static Map<String, Object> f1822o = null;

    @Deprecated
    public static final String USER_ID_FROM_APP_IMSI = TbsPrivacyAccess.ConfigurablePrivacy.IMSI.f1972a;

    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_ID = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_ID.f1972a;

    @Deprecated
    public static final String USER_ID_FROM_APP_MAC = TbsPrivacyAccess.ConfigurablePrivacy.MAC.f1972a;

    @Deprecated
    public static final String USER_ID_FROM_APP_ANDROID_VERSION = TbsPrivacyAccess.ConfigurablePrivacy.ANDROID_VERSION.f1972a;

    @Deprecated
    public static final String USER_ID_FROM_APP_DEVICE_MODEL = TbsPrivacyAccess.ConfigurablePrivacy.DEVICE_MODEL.f1972a;
    public static final String USER_ID_FROM_APP_QIMEI36 = TbsPrivacyAccess.ConfigurablePrivacy.QIMEI36.f1972a;
    private static int M = -1;
    private static Timer N = null;
    private static PrivateCDNMode O = PrivateCDNMode.NOT_USE;
    private static SystemCoreProtector P = null;

    /* loaded from: classes3.dex */
    public interface PreInitCallback {
        void onCoreInitFinished();

        void onViewInitFinished(boolean z4);
    }

    /* loaded from: classes7.dex */
    public enum PrivateCDNMode {
        OFFICIAL_IMPL,
        SELF_IMPL,
        NOT_USE
    }

    /* loaded from: classes15.dex */
    public interface a {
        void a(File[] fileArr);
    }

    public static Bundle a(Context context, Bundle bundle) {
        TbsLogReport tbsLogReport;
        String str;
        if (a(context)) {
            Object a5 = com.tencent.smtt.utils.j.a(f1826s, "incrUpdate", (Class<?>[]) new Class[]{Context.class, Bundle.class}, context, bundle);
            if (a5 != null) {
                return (Bundle) a5;
            }
            tbsLogReport = TbsLogReport.getInstance(context);
            str = "incrUpdate return null!";
        } else {
            tbsLogReport = TbsLogReport.getInstance(context);
            str = "initForPatch return false!";
        }
        tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.INCR_UPDATE_ERROR, str);
        return null;
    }

    public static Object a(Context context, String str, Bundle bundle) {
        if (!a(context)) {
            return Integer.valueOf(EXTENSION_INIT_FAILURE);
        }
        Object a5 = com.tencent.smtt.utils.j.a(f1826s, "miscCall", (Class<?>[]) new Class[]{String.class, Bundle.class}, str, bundle);
        if (a5 != null) {
            return a5;
        }
        return null;
    }

    public static String a() {
        return f1824q;
    }

    public static synchronized void a(Context context, String str) {
        synchronized (QbSdk.class) {
            if (f1809b) {
                TbsCoreLoadStat.getInstance().a(context, 402, new Throwable(f1829v));
                return;
            }
            if (f1808a) {
                return;
            }
            f1808a = true;
            f1830w = "forceSysWebViewInner: " + str;
            TbsLog.e("QbSdk", "forceSysWebViewInner", "Reason:" + f1830w);
            TbsLog.e("QbSdk", "forceSysWebViewInner", Log.getStackTraceString(new Throwable("#")));
            TbsCoreLoadStat.getInstance().a(context, 401);
        }
    }

    public static boolean a(Context context) {
        try {
            if (f1825r != null) {
                return true;
            }
            File n4 = m.a().n(context);
            if (n4 == null) {
                TbsLog.e("QbSdk", "QbSdk initExtension (false) optDir == null");
                return false;
            }
            File file = new File(n4, "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                TbsLog.e("QbSdk", "QbSdk initExtension (false) dexFile.exists()=false", true);
                return false;
            }
            TbsLog.i("QbSdk", "new DexLoader #3 dexFile is " + file.getAbsolutePath());
            u.a().b(context);
            com.tencent.smtt.utils.n.a(context);
            f1825r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, n4.getAbsolutePath(), getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (isEnableSensitiveApi() || com.tencent.smtt.utils.j.a(f1825r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) != null) {
                loadTBSSDKExtension(context, file.getParent());
                return true;
            }
            TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
            return false;
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("initExtension sys WebView: ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.e("QbSdk", g5.toString());
            return false;
        }
    }

    public static boolean a(Context context, int i5) {
        return a(context, i5, 20000);
    }

    public static boolean a(Context context, int i5, int i6) {
        Map<String, Object> map = f1822o;
        if (map != null && map.containsKey(KEY_SET_SENDREQUEST_AND_UPLOAD) && f1822o.get(KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("QbSdk", "[QbSdk.isX5Disabled] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return true;
        }
        if (!isEnableSensitiveApi() && com.tencent.smtt.utils.j.a(f1825r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
            TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
            return false;
        }
        m.a().b(context, f.f2121a == 0);
        if (d(context)) {
            return TbsDownloader.isTbsCoreDisabledBySwitch(context.getApplicationContext(), i5);
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    private static boolean a(Context context, boolean z4) {
        TbsLog.initIfNeed(context);
        if (!sIsVersionPrinted) {
            TbsLog.i("QbSdk", "svn revision: jnizz; SDK_VERSION_CODE: 44286; SDK_VERSION_NAME: 4.3.0.386");
            sIsVersionPrinted = true;
        }
        if (f1808a && !z4) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_SDKINIT_IS_SYS_FORCED);
            TbsLog.e("QbSdk", "init", "Force WebView Inner, " + f1830w);
            return false;
        }
        if (f1809b) {
            TbsCoreLoadStat.getInstance().a(context, 402, new Throwable(f1829v));
            TbsLog.e("QbSdk", "init", "QbSdk init mIsSysWebViewForcedByOuter = true, " + f1829v);
            return false;
        }
        if (!com.tencent.smtt.utils.b.b()) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_CPU_NOT_SUPPORT, new Throwable(com.tencent.smtt.utils.b.f2312c));
            TbsLog.i("QbSdk", "init", "cpu is invalid: " + com.tencent.smtt.utils.b.f2312c);
            return false;
        }
        if (TbsPVConfig.getInstance(context).isEnableProtection()) {
            e(context);
        }
        try {
            File n4 = m.a().n(context);
            if (n4 == null) {
                TbsCoreLoadStat.getInstance().a(context, 312, new Throwable("QbSdk.init (false) TbsCoreShareDir is null"));
                return false;
            }
            int a5 = m.a().a(true, context);
            int i5 = f1823p;
            if (i5 != 0 && i5 != a5) {
                f1825r = null;
                f1826s = null;
                TbsCoreLoadStat.getInstance().a(context, 303, new Throwable("sTbsVersion: " + f1823p + "; tbsCoreInstalledVer: " + a5));
                return false;
            }
            f1823p = a5;
            if (TbsDownloader.a(context, a5)) {
                TbsLog.w("QbSdk", "init", "version " + f1823p + " is in blacklist,can not load! return");
                return false;
            }
            if (b(context, f1823p)) {
                TbsLog.w("QbSdk", "version " + f1823p + " is in below min-version that app set by QbSdk.setCoreMinVersion, reset and not load.");
                return false;
            }
            int i6 = f1832y;
            if (i6 == -1) {
                boolean isTbsCoreDisabledBySwitch = TbsDownloader.isTbsCoreDisabledBySwitch(context.getApplicationContext(), f1823p);
                f1832y = isTbsCoreDisabledBySwitch ? 0 : 1;
                if (isTbsCoreDisabledBySwitch) {
                    TbsLog.w("QbSdk", "init", "version " + f1823p + "is disable by remote switch");
                    TbsCoreLoadStat.getInstance().a(context, 309, new Throwable("version " + f1823p + "is disable by remote switch"));
                    return false;
                }
            } else if (i6 == 0) {
                TbsLog.w("QbSdk", "init", "version " + f1823p + "is disable by remote switch");
                return false;
            }
            if (f1825r != null && f1826s != null) {
                return true;
            }
            File n5 = m.a().n(context);
            File file = new File(n5, "tbs_sdk_extension_dex.jar");
            if (file.exists()) {
                String absolutePath = n4.getAbsolutePath();
                TbsLog.i("QbSdk", "init", "optDirExtension #1 is " + absolutePath);
                TbsLog.i("QbSdk", "init", "new DexLoader #1 dexFile is " + file.getAbsolutePath());
                u.a().b(context);
                com.tencent.smtt.utils.n.a(context);
                f1825r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                if (!isEnableSensitiveApi() && com.tencent.smtt.utils.j.a(f1825r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                    TbsLog.e("QbSdk", "init", "isSuiteableGetSensitative check failed, can not use x5");
                    return false;
                }
                loadTBSSDKExtension(context, file.getParent());
                com.tencent.smtt.utils.j.a(f1826s, "setClientVersion", (Class<?>[]) new Class[]{Integer.TYPE}, 1);
                return true;
            }
            try {
                int g5 = m.a().g(context);
                if (g5 > 0) {
                    File file2 = new File(file.getParentFile(), "tbs_jars_fusion_dex.jar");
                    TbsCoreLoadStat.getInstance().a(context, 403, new Throwable("[loadMsg] extension is miss, fusion exist is " + file2.exists() + ", core is " + g5 + ", dexPath is " + file.getPath()));
                } else {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, new Throwable("core path: " + n5));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return false;
        } catch (Throwable th2) {
            StringBuilder g6 = androidx.activity.d.g("QbSdk init Throwable: ");
            g6.append(Log.getStackTraceString(th2));
            TbsLog.e("QbSdk", g6.toString());
            TbsCoreLoadStat.getInstance().a(context, 306, th2);
            return false;
        }
    }

    public static boolean a(Context context, boolean z4, boolean z5) {
        boolean z6;
        TbsLog.i("QbSdk", "canLoadX5", "#1# installTbsCoreIfNeeded");
        m.a().b(context, f.f2121a == 0);
        int disabledCoreVersion = TbsPVConfig.getInstance(context).getDisabledCoreVersion();
        int g5 = m.a().g(context);
        TbsLog.i("QbSdk", "canLoadX5", androidx.activity.d.d("#1-1# disabledCoreVersion is ", disabledCoreVersion, " localCoreVersion is ", g5));
        if (disabledCoreVersion != 0 && disabledCoreVersion == g5) {
            TbsLog.e("QbSdk", "canLoadX5", "#2-1# force use sys by remote switch");
            return false;
        }
        if (!a(context, z4)) {
            TbsLog.e("QbSdk", "canLoadX5", "#2-4# QbSdk.init failure!");
            return false;
        }
        Object obj = f1826s;
        Class cls = Integer.TYPE;
        Object a5 = com.tencent.smtt.utils.j.a(obj, "canLoadX5Core", (Class<?>[]) new Class[]{cls}, 44286);
        StringBuilder g6 = androidx.activity.d.g("#3# invoke sExtensionObj canLoadX5Core and ret is ");
        g6.append(a5 != null);
        TbsLog.i("QbSdk", "canLoadX5", g6.toString());
        if (a5 == null) {
            Object a6 = com.tencent.smtt.utils.j.a(f1826s, "canLoadX5", (Class<?>[]) new Class[]{cls}, Integer.valueOf(com.tencent.smtt.sdk.a.a()));
            if (a6 == null) {
                TbsCoreLoadStat.getInstance().a(context, 308, new Throwable());
                return false;
            }
            if (((a6 instanceof String) && ((String) a6).equalsIgnoreCase("AuthenticationFail")) || !(a6 instanceof Boolean)) {
                return false;
            }
            f1823p = f.d();
            boolean a7 = a(context, f.d());
            z6 = ((Boolean) a6).booleanValue() && !a7;
            if (!z6) {
                TbsCoreLoadStat.getInstance().a(context, 318, new Throwable("isX5Disable:" + a7 + "(Boolean) ret:" + a6));
            }
            return z6;
        }
        if ((a5 instanceof String) && ((String) a5).equalsIgnoreCase("AuthenticationFail")) {
            TbsLog.e("QbSdk", "canLoadX5", "[LoadError] authenticationFail");
            return false;
        }
        if (!(a5 instanceof Bundle)) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, new Throwable(androidx.appcompat.widget.a.i("", a5)));
            TbsLog.e("QbSdk", "canLoadX5", "[LoadError] ret not instance of bundle, ret:" + a5);
            return false;
        }
        Bundle bundle = (Bundle) a5;
        if (bundle.isEmpty()) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_EMPTY_BUNDLE, new Throwable(androidx.appcompat.widget.a.i("", a5)));
            TbsLog.e("QbSdk", "canLoadX5", "[LoadError] empty bundle" + a5);
            return false;
        }
        try {
            int i5 = bundle.getInt(FontsContractCompat.Columns.RESULT_CODE, -1);
            z6 = i5 == 0;
            if (!z6) {
                Object obj2 = null;
                try {
                    obj2 = com.tencent.smtt.utils.j.a(f1826s, "getErrorCodeForLogReport", (Class<?>[]) new Class[0], new Object[0]);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (obj2 instanceof Integer) {
                    TbsCoreLoadStat.getInstance().a(context, ((Integer) obj2).intValue(), new Throwable(androidx.appcompat.widget.a.i("detail: ", obj2)));
                } else {
                    TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_RETCODE_ERROR, new Throwable("retcode:" + i5 + "; detail: " + obj2));
                }
                return false;
            }
            try {
                f1824q = bundle.getString("tbs_core_version", "0");
            } catch (Exception unused) {
                f1824q = "0";
            }
            try {
                f1823p = Integer.parseInt(f1824q);
            } catch (NumberFormatException e6) {
                e6.printStackTrace();
                TbsLog.e("QbSdk", "core version string to num error: " + f1824q);
                f1823p = 0;
            }
            f.a(f1823p);
            if (f1823p == 0) {
                TbsCoreLoadStat tbsCoreLoadStat = TbsCoreLoadStat.getInstance();
                StringBuilder g7 = androidx.activity.d.g("sTbsVersion is 0, string is ");
                g7.append(f1824q);
                tbsCoreLoadStat.a(context, 307, new Throwable(g7.toString()));
                TbsLog.e("QbSdk", "canLoadX5", "[LoadError] sTbsVersion is 0, version string is " + f1824q);
                return false;
            }
            try {
                String[] stringArray = bundle.getStringArray("tbs_jarfiles");
                f1828u = stringArray;
                if (stringArray != null) {
                    try {
                        f1811d = bundle.getString("tbs_librarypath");
                        return z6;
                    } catch (Exception e7) {
                        TbsCoreLoadStat.getInstance().a(context, 307, e7);
                        return false;
                    }
                }
                TbsCoreLoadStat tbsCoreLoadStat2 = TbsCoreLoadStat.getInstance();
                StringBuilder g8 = androidx.activity.d.g("sJarFiles not instanceof String[]: ");
                g8.append(f1828u);
                tbsCoreLoadStat2.a(context, 307, new Throwable(g8.toString()));
                TbsLog.e("QbSdk", "canLoadX5", "sJarFiles not instanceof String[]: " + f1828u);
                return false;
            } catch (Throwable th) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_GETSTRINGARRAY_JARFILE, th);
                return false;
            }
        } catch (Exception e8) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_QBSDK_INIT_RETCODE_ERROR, e8);
            return false;
        }
    }

    public static String b() {
        Object invokeStaticMethod;
        u a5 = u.a();
        if (a5 == null || !a5.b() || (invokeStaticMethod = a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getGUID", new Class[0], new Object[0])) == null || !(invokeStaticMethod instanceof String)) {
            return null;
        }
        return (String) invokeStaticMethod;
    }

    public static boolean b(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null) {
            return false;
        }
        try {
            if (!context.getApplicationInfo().packageName.contains("com.tencent.portfolio")) {
                return true;
            }
            TbsLog.i("QbSdk", "clearPluginConfigFile #1");
            String string = TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONNAME, null);
            String str = context.getPackageManager().getPackageInfo("com.tencent.portfolio", 0).versionName;
            TbsLog.i("QbSdk", "clearPluginConfigFile oldAppVersionName is " + string + " newAppVersionName is " + str);
            if (string == null || string.contains(str) || (sharedPreferences = context.getSharedPreferences("plugin_setting", 0)) == null) {
                return true;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.commit();
            TbsLog.i("QbSdk", "clearPluginConfigFile done");
            return true;
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("clearPluginConfigFile error is ");
            g5.append(th.getMessage());
            TbsLog.i("QbSdk", g5.toString());
            return false;
        }
    }

    public static boolean b(Context context, int i5) {
        int i6 = M;
        if (i5 >= i6 || i5 == 0 || i6 == -1 || !TbsShareManager.isThirdPartyApp(context)) {
            return false;
        }
        g(context);
        TbsCoreLoadStat tbsCoreLoadStat = TbsCoreLoadStat.getInstance();
        StringBuilder g5 = androidx.activity.d.g("QbSdk.setCoreMinVersion: ");
        g5.append(M);
        tbsCoreLoadStat.a(context, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, new Throwable(g5.toString()));
        return true;
    }

    public static Timer c() {
        return N;
    }

    public static boolean canDownloadWithoutWifi() {
        return I;
    }

    @Deprecated
    public static void canGetAndroidId(boolean z4) {
        TbsPrivacyAccess.AndroidId.setEnabled(z4);
    }

    @Deprecated
    public static void canGetDeviceId(boolean z4) {
        TbsPrivacyAccess.DeviceId.setEnabled(z4);
    }

    @Deprecated
    public static void canGetSubscriberId(boolean z4) {
        TbsPrivacyAccess.Imsi.setEnabled(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean canLoadVideo(android.content.Context r5) {
        /*
            java.lang.Object r0 = com.tencent.smtt.sdk.QbSdk.f1826s
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r4 = 0
            r2[r4] = r3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r1[r4] = r3
            java.lang.String r3 = "canLoadVideo"
            java.lang.Object r0 = com.tencent.smtt.utils.j.a(r0, r3, r2, r1)
            if (r0 == 0) goto L2a
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L33
            com.tencent.smtt.sdk.TbsCoreLoadStat r1 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()
            r2 = 313(0x139, float:4.39E-43)
            goto L30
        L2a:
            com.tencent.smtt.sdk.TbsCoreLoadStat r1 = com.tencent.smtt.sdk.TbsCoreLoadStat.getInstance()
            r2 = 314(0x13a, float:4.4E-43)
        L30:
            r1.a(r5, r2)
        L33:
            if (r0 != 0) goto L36
            goto L3c
        L36:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.canLoadVideo(android.content.Context):boolean");
    }

    @Deprecated
    public static boolean canLoadX5(Context context) {
        return a(context, false, false);
    }

    @Deprecated
    public static boolean canLoadX5FirstTimeThirdApp(Context context) {
        return false;
    }

    public static void canOpenFile(Context context, String str, ValueCallback<Boolean> valueCallback) {
        throw new IllegalAccessError("Current SDK not support TbsReaderView.");
    }

    public static boolean canOpenMimeFileType(Context context, String str) {
        throw new IllegalAccessError("Current SDK not support TbsReaderView.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.FileInputStream, java.io.InputStream] */
    public static boolean canOpenWebPlus(Context context) {
        if (f1833z == 0) {
            f1833z = com.tencent.smtt.sdk.a.a();
        }
        StringBuilder g5 = androidx.activity.d.g("canOpenWebPlus - totalRAM: ");
        g5.append(f1833z);
        TbsLog.i("QbSdk", g5.toString());
        boolean z4 = false;
        if (f1833z < A || context == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(new File(m.a().n(context), "tbs.conf")));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream2);
                String property = properties.getProperty("android_sdk_max_supported");
                String property2 = properties.getProperty("android_sdk_min_supported");
                int parseInt = Integer.parseInt(property);
                int parseInt2 = Integer.parseInt(property2);
                int parseInt3 = Integer.parseInt(Build.VERSION.SDK);
                if (parseInt3 <= parseInt && parseInt3 >= parseInt2) {
                    int parseInt4 = Integer.parseInt(properties.getProperty("tbs_core_version"));
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        ?? fileInputStream = new FileInputStream(new File(m.o(context), "tbs_extension.conf"));
                        try {
                            ?? properties2 = new Properties();
                            properties2.load(fileInputStream);
                            int parseInt5 = Integer.parseInt(properties2.getProperty("tbs_local_version"));
                            int parseInt6 = Integer.parseInt(properties2.getProperty(TbsDownloadConfig.TbsConfigKey.KEY_APP_VERSIONCODE_FOR_SWITCH));
                            if (parseInt4 != 88888888 && parseInt5 != 88888888 && parseInt4 <= parseInt5 && parseInt4 == parseInt5 && ((parseInt6 <= 0 || parseInt6 == com.tencent.smtt.utils.b.b(context)) && Boolean.parseBoolean(properties2.getProperty("x5_disabled")))) {
                                if (!TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_SWITCH_BACKUPCORE_ENABLE, false)) {
                                    z4 = true;
                                }
                            }
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        } catch (Throwable unused3) {
                            bufferedInputStream = fileInputStream;
                            try {
                                TbsLog.i("QbSdk", "canOpenWebPlus - isX5Disabled Exception");
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                }
                                z4 = true;
                                return !z4;
                            } catch (Throwable th) {
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (Exception unused5) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable unused6) {
                    }
                    return !z4;
                }
                TbsLog.i("QbSdk", "canOpenWebPlus - sdkVersion: " + parseInt3);
                try {
                    bufferedInputStream2.close();
                } catch (Exception unused7) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                try {
                    th.printStackTrace();
                    TbsLog.i("QbSdk", "canOpenWebPlus - canLoadX5 Exception");
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused8) {
                        }
                    }
                    return false;
                } catch (Throwable th3) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused9) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean canUseVideoFeatrue(Context context, int i5) {
        Object a5 = com.tencent.smtt.utils.j.a(f1826s, "canUseVideoFeatrue", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i5));
        if (a5 == null || !(a5 instanceof Boolean)) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }

    public static void checkTbsValidity(Context context) {
        if (context == null || com.tencent.smtt.utils.n.b(context)) {
            return;
        }
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedBy checkTbsValidity");
        TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_CORE_CHECK_VALIDITY_FALSE);
        forceSysWebView();
    }

    @Deprecated
    public static void clear(Context context) {
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void clearAllWebViewCache(android.content.Context r5, boolean r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "clearAllWebViewCache("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "QbSdk"
            com.tencent.smtt.utils.TbsLog.i(r1, r0)
            r0 = 1
            r2 = 0
            com.tencent.smtt.sdk.WebView r3 = new com.tencent.smtt.sdk.WebView     // Catch: java.lang.Throwable -> L48
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L48
            com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension r3 = r3.getWebViewClientExtension()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L5f
            com.tencent.smtt.sdk.u r2 = com.tencent.smtt.sdk.u.a()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L43
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L43
            com.tencent.smtt.sdk.v r2 = r2.c()     // Catch: java.lang.Throwable -> L45
            r2.a(r5, r6)     // Catch: java.lang.Throwable -> L45
        L43:
            r2 = 1
            goto L5f
        L45:
            r2 = move-exception
            r3 = 1
            goto L4a
        L48:
            r2 = move-exception
            r3 = 0
        L4a:
            java.lang.String r4 = "clearAllWebViewCache exception 2 -- "
            java.lang.StringBuilder r4 = androidx.activity.d.g(r4)
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.smtt.utils.TbsLog.e(r1, r2)
            r2 = r3
        L5f:
            if (r2 == 0) goto L67
            java.lang.String r5 = "is_in_x5_mode --> no need to clear system webview!"
            com.tencent.smtt.utils.TbsLog.i(r1, r5)
            return
        L67:
            android.webkit.WebView r2 = new android.webkit.WebView     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "searchBoxJavaBridge_"
            r2.removeJavascriptInterface(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "accessibility"
            r2.removeJavascriptInterface(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "accessibilityTraversal"
            r2.removeJavascriptInterface(r3)     // Catch: java.lang.Throwable -> Lae
            r2.clearCache(r0)     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L8a
            android.webkit.CookieSyncManager.createInstance(r5)     // Catch: java.lang.Throwable -> Lae
            android.webkit.CookieManager r6 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> Lae
            r6.removeAllCookie()     // Catch: java.lang.Throwable -> Lae
        L8a:
            android.webkit.WebViewDatabase r6 = android.webkit.WebViewDatabase.getInstance(r5)     // Catch: java.lang.Throwable -> Lae
            r6.clearUsernamePassword()     // Catch: java.lang.Throwable -> Lae
            android.webkit.WebViewDatabase r6 = android.webkit.WebViewDatabase.getInstance(r5)     // Catch: java.lang.Throwable -> Lae
            r6.clearHttpAuthUsernamePassword()     // Catch: java.lang.Throwable -> Lae
            android.webkit.WebViewDatabase r5 = android.webkit.WebViewDatabase.getInstance(r5)     // Catch: java.lang.Throwable -> Lae
            r5.clearFormData()     // Catch: java.lang.Throwable -> Lae
            android.webkit.WebStorage r5 = android.webkit.WebStorage.getInstance()     // Catch: java.lang.Throwable -> Lae
            r5.deleteAllData()     // Catch: java.lang.Throwable -> Lae
            android.webkit.WebIconDatabase r5 = android.webkit.WebIconDatabase.getInstance()     // Catch: java.lang.Throwable -> Lae
            r5.removeAllIcons()     // Catch: java.lang.Throwable -> Lae
            goto Lc3
        Lae:
            r5 = move-exception
            java.lang.String r6 = "clearAllWebViewCache exception 1 -- "
            java.lang.StringBuilder r6 = androidx.activity.d.g(r6)
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.smtt.utils.TbsLog.e(r1, r5)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.QbSdk.clearAllWebViewCache(android.content.Context, boolean):void");
    }

    @Deprecated
    public static void closeFileReader(Context context) {
        u a5 = u.a();
        a5.a(context);
        if (a5.b()) {
            a5.c().p();
        }
    }

    public static String closeNetLogAndSavaToLocal() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            try {
                Object invokeStaticMethod = a5.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "closeNetLogAndSavaToLocal", new Class[0], new Object[0]);
                if (invokeStaticMethod != null && (invokeStaticMethod instanceof String)) {
                    return (String) invokeStaticMethod;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static void configurePrivacy(Context context, TbsPrivacyAccess.ConfigurablePrivacy configurablePrivacy, String str) {
        TbsPrivacyAccess.configurePrivacy(context, configurablePrivacy, str);
    }

    public static boolean createMiniQBShortCut(Context context, String str, String str2, Drawable drawable) {
        u a5;
        if (context != null && !TbsDownloader.getOverSea(context) && !isMiniQBShortCutExist(context, str, str2) && (a5 = u.a()) != null && a5.b()) {
            Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            DexLoader b5 = a5.c().b();
            TbsLog.e("QbSdk", "qbsdk createMiniQBShortCut");
            Object invokeStaticMethod = b5.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createMiniQBShortCut", new Class[]{Context.class, String.class, String.class, Bitmap.class}, context, str, str2, bitmap);
            TbsLog.e("QbSdk", "qbsdk after createMiniQBShortCut ret: " + invokeStaticMethod);
            if (invokeStaticMethod != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        return O != PrivateCDNMode.NOT_USE;
    }

    private static boolean d(Context context) {
        try {
            if (f1825r != null) {
                return true;
            }
            File n4 = m.a().n(context);
            if (n4 == null) {
                TbsLog.e("QbSdk", "QbSdk initForX5DisableConfig (false) optDir == null");
                return false;
            }
            File file = new File(m.a().n(context), "tbs_sdk_extension_dex.jar");
            if (!file.exists()) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD, new Exception("initForX5DisableConfig failure -- tbs_sdk_extension_dex.jar is not exist!"));
                return false;
            }
            String absolutePath = n4.getAbsolutePath();
            TbsLog.i("QbSdk", "QbSdk init optDirExtension #3 is " + absolutePath);
            TbsLog.i("QbSdk", "new DexLoader #4 dexFile is " + file.getAbsolutePath());
            u.a().b(context);
            com.tencent.smtt.utils.n.a(context);
            f1825r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            if (!isEnableSensitiveApi() && com.tencent.smtt.utils.j.a(f1825r, "isSuiteableGetSensitative", (Class<?>[]) new Class[0], new Object[0]) == null) {
                TbsLog.e("QbSdk", "isSuiteableGetSensitative check failed,can not use x5");
                return false;
            }
            loadTBSSDKExtension(context, file.getParent());
            com.tencent.smtt.utils.j.a(f1826s, "setClientVersion", (Class<?>[]) new Class[]{Integer.TYPE}, 1);
            return true;
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("initForX5DisableConfig sys WebView: ");
            g5.append(Log.getStackTraceString(th));
            TbsLog.e("QbSdk", g5.toString());
            return false;
        }
    }

    public static boolean deleteMiniQBShortCut(Context context, String str, String str2) {
        u a5;
        return (context == null || TbsDownloader.getOverSea(context) || (a5 = u.a()) == null || !a5.b() || a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "deleteMiniQBShortCut", new Class[]{Context.class, String.class, String.class}, context, str, str2) == null) ? false : true;
    }

    @Deprecated
    public static void deleteStableCore(Context context, int i5) {
    }

    public static void disAllowThirdAppDownload() {
        f1810c = false;
    }

    public static void disableAutoCreateX5Webview() {
        f1817j = false;
    }

    @Deprecated
    public static void disableSensitiveApi() {
        TbsPrivacyAccess.disableSensitiveApi();
    }

    public static SystemCoreProtector e() {
        return P;
    }

    private static void e(Context context) {
        if (F || !Thread.currentThread().getName().equals("tbs_preinit")) {
            return;
        }
        F = true;
        StringBuilder g5 = androidx.activity.d.g("QbSdk - preload_x5_check -- process:");
        g5.append(context.getApplicationInfo().processName);
        g5.append("; thread:");
        g5.append(Thread.currentThread().getName());
        TbsLog.i("QbSdk", g5.toString());
        int g6 = m.a().g(context);
        if (g6 <= 0) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4);
            int i5 = sharedPreferences.getInt("tbs_preload_x5_recorder", 0) + 1;
            if (i5 > 3) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.ERROR_CORE_LOAD_CRASH_PROTECT, new Throwable("thread " + Thread.currentThread().getName()));
                f(context);
                g(context);
                TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
                TbsLogReport.TbsLogInfo tbsLogInfo = tbsLogReport.tbsLogInfo();
                tbsLogInfo.setErrorCode(g6);
                tbsLogReport.eventReport(TbsLogReport.EventType.TYPE_CORE_PROTECT_RESET, tbsLogInfo);
            } else {
                sharedPreferences.edit().putInt("tbs_preload_x5_recorder", i5).commit();
            }
        } catch (Throwable th) {
            StringBuilder g7 = androidx.activity.d.g("tbs_preload_x5_counter Inc exception:");
            g7.append(Log.getStackTraceString(th));
            TbsLog.e("QbSdk", g7.toString());
        }
    }

    public static void enableX5WithoutRestart() {
        throw new UnsupportedOperationException("Current TBS SDK doesn't support");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (Thread.currentThread().getName().equals("tbs_preinit")) {
            context.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4).edit().putInt("tbs_preload_x5_recorder", 0).commit();
        }
    }

    public static void fileInfoDetect(Context context, String str, android.webkit.ValueCallback<String> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return;
        }
        try {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "fileInfoDetect", new Class[]{Context.class, String.class, android.webkit.ValueCallback.class}, context, str, valueCallback);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void forceSysWebView() {
        f1809b = true;
        StringBuilder g5 = androidx.activity.d.g("SysWebViewForcedByOuter: ");
        g5.append(Log.getStackTraceString(new Throwable()));
        f1829v = g5.toString();
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedByOuter");
    }

    private static void g(Context context) {
        TbsLog.e("QbSdk", "QbSdk reset!", true);
        try {
            TbsDownloader.stopDownload();
            TbsDownloader.c(context);
            FileUtil.a(getTbsFolderDir(context), false, "core_share_decouple");
            TbsLog.i("QbSdk", "delete downloaded apk success", true);
            m.b();
            File file = new File(context.getFilesDir(), TbsExtensionFunctionManager.BUGLY_SWITCH_FILE_NAME);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("QbSdk reset exception:");
            g5.append(Log.getStackTraceString(th));
            TbsLog.e("QbSdk", g5.toString());
        }
    }

    public static long getApkFileSize(Context context) {
        if (context != null) {
            return TbsDownloadConfig.getInstance(context.getApplicationContext()).mPreferences.getLong(TbsDownloadConfig.TbsConfigKey.KEY_TBSAPKFILESIZE, 0L);
        }
        return 0L;
    }

    public static String getCurrentProcessName(Context context) {
        FileInputStream fileInputStream;
        byte[] bArr;
        int i5;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/self/cmdline");
                try {
                    bArr = new byte[256];
                    i5 = 0;
                    while (true) {
                        int read = fileInputStream.read();
                        if (read <= 0 || i5 >= 256) {
                            break;
                        }
                        bArr[i5] = (byte) read;
                        i5++;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        if (i5 <= 0) {
            fileInputStream.close();
            return null;
        }
        String str = new String(bArr, 0, i5, "UTF-8");
        try {
            fileInputStream.close();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        return str;
    }

    public static String[] getDexLoaderFileList(Context context, Context context2, String str) {
        String[] strArr = f1828u;
        if (!(strArr instanceof String[])) {
            Object a5 = com.tencent.smtt.utils.j.a(f1826s, "getJarFiles", (Class<?>[]) new Class[]{Context.class, Context.class, String.class}, context, context2, str);
            if (!(a5 instanceof String[])) {
                a5 = new String[]{""};
            }
            return (String[]) a5;
        }
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            StringBuilder g5 = androidx.activity.d.g(str);
            g5.append(f1828u[i5]);
            strArr2[i5] = g5.toString();
        }
        return strArr2;
    }

    @Deprecated
    public static boolean getDownloadWithoutWifi() {
        return I;
    }

    public static boolean getIsInitX5Environment() {
        return f1818k;
    }

    public static boolean getIsSysWebViewForcedByOuter() {
        return f1809b;
    }

    public static boolean getJarFilesAndLibraryPath(Context context) {
        String sb;
        Object obj = f1826s;
        if (obj == null) {
            sb = "getJarFilesAndLibraryPath sExtensionObj is null";
        } else {
            Bundle bundle = (Bundle) com.tencent.smtt.utils.j.a(obj, "canLoadX5CoreAndNotLoadSo", (Class<?>[]) new Class[]{Integer.TYPE}, 44286);
            if (bundle != null) {
                f1828u = bundle.getStringArray("tbs_jarfiles");
                f1811d = bundle.getString("tbs_librarypath");
                return true;
            }
            StringBuilder g5 = androidx.activity.d.g("getJarFilesAndLibraryPath bundle is null and coreverison is ");
            g5.append(m.a().a(true, context));
            sb = g5.toString();
        }
        TbsLog.i("QbSdk", sb);
        return false;
    }

    public static String getMiniQBVersion(Context context) {
        u a5 = u.a();
        a5.a(context);
        if (a5.b()) {
            return a5.c().f();
        }
        return null;
    }

    public static boolean getOnlyDownload() {
        return f1819l;
    }

    public static String getQQBuildNumber() {
        return C;
    }

    public static Map<String, Object> getSettings() {
        return f1822o;
    }

    public static boolean getTBSInstalling() {
        return J;
    }

    public static String getTID() {
        return B;
    }

    public static File getTbsFolderDir(Context context) {
        if (context == null) {
            return null;
        }
        return context.getDir(com.tencent.smtt.utils.b.c() ? "tbs_64" : "tbs", 0);
    }

    @Deprecated
    public static String getTbsResourcesPath(Context context) {
        return "";
    }

    public static int getTbsSdkVersion() {
        return 44286;
    }

    public static int getTbsVersion(Context context) {
        return m.a().g(context);
    }

    public static int getTbsVersionForCrash(Context context) {
        if (f1808a) {
            return 0;
        }
        int h5 = m.a().h(context);
        if (h5 == 0 && l.a(context).c() == 3) {
            g(context);
        }
        return h5;
    }

    public static int getTmpDirTbsVersion(Context context) {
        if (l.a(context).c() == 2) {
            return m.a().d(context, 0);
        }
        if (l.a(context).b("copy_status") == 1) {
            return m.a().d(context, 1);
        }
        return 0;
    }

    public static String getX5CoreLoadHelp(Context context) {
        String c5;
        if (context == null) {
            return "context is null";
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        int g5 = m.a().g(context);
        if (g5 > 0) {
            int loadErrorCode = TbsCoreLoadStat.getLoadErrorCode();
            if (loadErrorCode == -1 && u.a().b()) {
                c5 = "core load success";
            } else {
                c5 = "Core Exist version is " + g5 + ", error code: " + loadErrorCode + ", detail: " + TbsCoreLoadStat.getLoadErrorMessage() + ", suggestion: " + com.tencent.smtt.utils.f.a().a(loadErrorCode);
            }
        } else {
            int nextPostInterval = TbsDownloader.getNextPostInterval(context);
            c5 = TbsDownloader.f1903a ? "core is downloading, please check TbsListener.onDownloadProgress." : (Apn.getApnType(context) == 3 || canDownloadWithoutWifi()) ? nextPostInterval > 0 ? androidx.activity.d.c("Perhaps server is busy, try to restart your app in ", nextPostInterval, "s later or (uninstall + reinstall).") : "Core not exist, unknown network problem." : "Mobile Network will not download as default. If you want, you can set QbSdk.setDownloadWithoutWifi(true) in the beginning of your app.";
        }
        return androidx.activity.d.f(c5, "If it doesn't help, contact with x5 with your tbslog.txt, site: x5.tencent.com");
    }

    public static void initBuglyAsync(boolean z4) {
        f1816i = z4;
    }

    public static void initForinitAndNotLoadSo(Context context) {
        String str;
        if (f1825r == null) {
            File n4 = m.a().n(context);
            if (n4 == null) {
                str = "QbSdk initForinitAndNotLoadSo optDir == null";
            } else {
                File file = new File(n4, "tbs_sdk_extension_dex.jar");
                if (file.exists()) {
                    String absolutePath = n4.getAbsolutePath();
                    u.a().b(context);
                    com.tencent.smtt.utils.n.a(context);
                    f1825r = new DexLoader(file.getParent(), context, new String[]{file.getAbsolutePath()}, absolutePath, getSettings()).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                    return;
                }
                str = "QbSdk initForinitAndNotLoadSo dexFile.exists()=false";
            }
            Log.e("QbSdk", str);
        }
    }

    public static void initTbsSettings(Map<String, Object> map) {
        Map<String, Object> map2 = f1822o;
        if (map2 == null) {
            f1822o = map;
            return;
        }
        try {
            map2.putAll(map);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void initX5Environment(final Context context, final PreInitCallback preInitCallback) {
        com.tencent.smtt.utils.r.a().a("init_tbs_Start");
        TbsLog.initIfNeed(context);
        if (context == null) {
            TbsLog.e("QbSdk", "initX5Environment,context=null");
            return;
        }
        if (d()) {
            TbsLog.i("QbSdk", "using private CDN mode, preInit directly.");
            preInit(context, preInitCallback);
            return;
        }
        b(context);
        H = new TbsListener() { // from class: com.tencent.smtt.sdk.QbSdk.3
            @Override // com.tencent.smtt.sdk.TbsListener
            public void onDownloadFinish(int i5) {
            }

            @Override // com.tencent.smtt.sdk.TbsListener
            public void onDownloadProgress(int i5) {
            }

            @Override // com.tencent.smtt.sdk.TbsListener
            public void onInstallFinish(int i5) {
                QbSdk.preInit(context, preInitCallback);
            }
        };
        if (TbsShareManager.isThirdPartyApp(context)) {
            m.a().b(context, f.f2121a == 0);
        }
        TbsDownloader.needDownload(context, false, false, true, new TbsDownloader.TbsDownloaderCallback() { // from class: com.tencent.smtt.sdk.QbSdk.4
            @Override // com.tencent.smtt.sdk.TbsDownloader.TbsDownloaderCallback
            public void onNeedDownloadFinish(boolean z4, int i5) {
                if (TbsShareManager.isThirdPartyApp(context)) {
                    QbSdk.f1821n.onDownloadFinish(TbsDownloadConfig.getInstance(context).getCurrentDownloadInterruptCode());
                    if (QbSdk.f1816i) {
                        TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(context);
                    }
                }
                if (QbSdk.c() != null) {
                    TbsDownloader.a(context, new Runnable() { // from class: com.tencent.smtt.sdk.QbSdk.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            QbSdk.preInit(context, preInitCallback);
                        }
                    });
                } else {
                    QbSdk.preInit(context, preInitCallback);
                }
            }
        });
        f1818k = true;
    }

    public static boolean installLocalQbApk(Context context, String str, String str2, Bundle bundle) {
        f a5 = f.a(true);
        a5.a(context, false, false);
        if (a5.b()) {
            return a5.a().a(context, str, str2, bundle);
        }
        return false;
    }

    @Deprecated
    public static void installLocalTbsCore(Context context, int i5, String str) {
        m.a().a(context, str, i5);
    }

    public static boolean intentDispatch(WebView webView, Intent intent, String str, String str2) {
        String str3;
        if (webView == null) {
            return false;
        }
        if (str.startsWith("mttbrowser://miniqb/ch=icon?")) {
            Context context = webView.getContext();
            int indexOf = str.indexOf("url=");
            str = indexOf > 0 ? str.substring(indexOf + 4) : null;
            HashMap hashMap = new HashMap();
            try {
                str3 = context.getApplicationInfo().packageName;
            } catch (Exception e5) {
                e5.printStackTrace();
                str3 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            hashMap.put("ChannelID", str3);
            hashMap.put("PosID", "14004");
            if (MttLoader.loadUrl(context, "miniqb://home".equals(str) ? "qb://navicard/addCard?cardId=168&cardName=168" : str, hashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
                u a5 = u.a();
                if (a5 != null && a5.b() && a5.c().a(context, str, null, str2, null) == 0) {
                    return true;
                }
            }
            return false;
        }
        webView.loadUrl(str);
        return false;
    }

    @Deprecated
    public static boolean isEnableCanGetSubscriberId() {
        return TbsPrivacyAccess.Imsi.isEnabled();
    }

    @Deprecated
    public static boolean isEnableGetAndroidID() {
        return TbsPrivacyAccess.AndroidId.isEnabled();
    }

    @Deprecated
    public static boolean isEnableGetDeviceID() {
        return TbsPrivacyAccess.DeviceId.isEnabled();
    }

    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return TbsPrivacyAccess.isEnableSensitiveApi();
    }

    public static boolean isEnableX5WithoutRestart() {
        return E;
    }

    public static boolean isMiniQBShortCutExist(Context context, String str, String str2) {
        u a5;
        Object invokeStaticMethod;
        if (context == null || TbsDownloader.getOverSea(context) || (a5 = u.a()) == null || !a5.b() || (invokeStaticMethod = a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "isMiniQBShortCutExist", new Class[]{Context.class, String.class}, context, str)) == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        if (invokeStaticMethod instanceof Boolean) {
            bool = (Boolean) invokeStaticMethod;
        }
        return bool.booleanValue();
    }

    public static boolean isNeedInitX5FirstTime() {
        return f1831x;
    }

    public static boolean isStaticNeedDownload() {
        return L;
    }

    public static boolean isTbsCoreInited() {
        f a5 = f.a(false);
        return a5 != null && a5.h();
    }

    public static boolean isX5Core() {
        if (getIsSysWebViewForcedByOuter()) {
            return false;
        }
        return u.a().b();
    }

    public static boolean isX5DisabledSync(Context context) {
        if (l.a(context).c() == 2) {
            return false;
        }
        if (!d(context)) {
            return true;
        }
        int g5 = m.a().g(context);
        Object obj = f1826s;
        Class cls = Integer.TYPE;
        Object a5 = com.tencent.smtt.utils.j.a(obj, "isX5DisabledSync", (Class<?>[]) new Class[]{cls, cls}, Integer.valueOf(g5), 44286);
        if (a5 != null) {
            return ((Boolean) a5).booleanValue();
        }
        return true;
    }

    public static void loadTBSSDKExtension(Context context, String str) {
        Constructor<?> constructor;
        boolean z4;
        Object newInstance;
        if (f1826s != null) {
            return;
        }
        synchronized (QbSdk.class) {
            if (f1826s != null) {
                return;
            }
            if (f1825r == null) {
                TbsLog.i("QbSdk", "QbSdk loadTBSSDKExtension sExtensionClass is null");
            }
            try {
                constructor = f1825r.getConstructor(Context.class, Context.class, String.class, String.class, String.class);
                z4 = true;
            } catch (Throwable unused) {
                constructor = null;
                z4 = false;
            }
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                if (z4) {
                    newInstance = constructor.newInstance(context, context, null, str, (!TbsConfig.APP_WX.equals(getCurrentProcessName(context)) || WebView.mWebViewCreated) ? null : "notLoadSo");
                } else {
                    newInstance = f1825r.getConstructor(Context.class, Context.class).newInstance(context, context);
                }
                f1826s = newInstance;
            } catch (Throwable th) {
                TbsCoreLoadStat.getInstance().a(context, 310, th);
                TbsLog.e("QbSdk", "throwable" + Log.getStackTraceString(th));
            }
        }
    }

    public static void openNetLog(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return;
        }
        try {
            a5.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "openNetLog", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void pauseDownload() {
        TbsDownloader.pauseDownload();
    }

    public static void preInit(Context context) {
        preInit(context, null);
    }

    public static void preInit(Context context, PreInitCallback preInitCallback) {
        preInit(context, false, preInitCallback);
    }

    public static synchronized void preInit(final Context context, boolean z4, final PreInitCallback preInitCallback) {
        synchronized (QbSdk.class) {
            com.tencent.smtt.utils.r.a().a("preinit_start");
            TbsLog.initIfNeed(context);
            TbsLog.i("QbSdk", "preInit", "processName: " + getCurrentProcessName(context));
            TbsLog.i("QbSdk", "preInit", "stack trace: " + Log.getStackTraceString(new Throwable("PreInit Detect:")));
            if (z4 && f1827t && !E) {
                TbsLog.w("QbSdk", "haven't enableX5WithoutRestart");
                return;
            }
            if (z4) {
                f1808a = false;
                f1827t = false;
                TbsLog.w("QbSdk", "is forcePreInit, local web core status has reset");
            }
            if (!f1827t) {
                TbsLog.i("QbSdk", "preInit", "#1# Start new thread to preInit, thread name: tbs_preinit");
                final Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.tencent.smtt.sdk.QbSdk.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        PreInitCallback preInitCallback2;
                        int i5 = message.what;
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3 && (preInitCallback2 = preInitCallback) != null) {
                                    preInitCallback2.onCoreInitFinished();
                                    return;
                                }
                                return;
                            }
                            com.tencent.smtt.utils.r.a().a("preinit_finish");
                            PreInitCallback preInitCallback3 = preInitCallback;
                            if (preInitCallback3 != null) {
                                preInitCallback3.onViewInitFinished(false);
                                com.tencent.smtt.utils.r.a().a("init_tbs_end");
                            }
                            TbsLog.writeLogToDisk();
                            com.tencent.smtt.utils.r.a().a(context);
                            return;
                        }
                        com.tencent.smtt.utils.r.a().a("preinit_finish");
                        if (QbSdk.f1817j) {
                            com.tencent.smtt.utils.r.a().a("create_webview_start");
                            v c5 = u.a().c();
                            if (c5 != null) {
                                c5.a(context);
                            }
                            com.tencent.smtt.utils.r.a().a("create_webview_end");
                        }
                        PreInitCallback preInitCallback4 = preInitCallback;
                        if (preInitCallback4 != null) {
                            preInitCallback4.onViewInitFinished(true);
                            com.tencent.smtt.utils.r.a().a("init_tbs_end");
                        }
                        com.tencent.smtt.utils.r.a().a(context);
                        TbsLog.writeLogToDisk();
                    }
                };
                Thread thread = new Thread() { // from class: com.tencent.smtt.sdk.QbSdk.2
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        int a5 = m.a().a(true, context);
                        TbsDownloader.setAppContext(context);
                        TbsLog.i("QbSdk", "QbSdk preinit ver is " + a5);
                        m.a().b(context, f.f2121a == 0);
                        TbsLog.i("QbSdk", "preInit", "#2-1# prepare initAndLoadSo");
                        u a6 = u.a();
                        a6.a(context);
                        QbSdk.f(context);
                        TbsLog.i("QbSdk", "preInit", "#2-3# X5CoreEngine init finish");
                        boolean b5 = a6.b();
                        handler.sendEmptyMessage(3);
                        if (b5) {
                            handler.sendEmptyMessage(1);
                        } else {
                            handler.sendEmptyMessage(2);
                        }
                    }
                };
                thread.setName("tbs_preinit");
                thread.setPriority(10);
                thread.start();
                f1827t = true;
            }
        }
    }

    public static boolean preinstallStaticTbs(Context context) {
        throw new IllegalStateException("Current SDK is not support static mode.");
    }

    public static void reset(Context context) {
        if (K) {
            TbsLog.w("QbSdk", "[warning] TBS only allow reset 1 times each process.");
        } else {
            K = true;
            g(context);
        }
    }

    @Deprecated
    public static void reset(Context context, boolean z4) {
        if (K) {
            TbsLog.w("QbSdk", "[warning] TBS only allow reset 1 times each process.");
        } else {
            K = true;
            g(context);
        }
    }

    @Deprecated
    public static void resetDecoupleCore(Context context) {
    }

    public static void resumeDownload() {
        TbsDownloader.resumeDownload();
    }

    public static void setAppList(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        TbsPrivacyAccess.configureAllPrivacy(context, TextUtils.join(",", list));
    }

    public static void setCoreMinVersion(int i5) {
        TbsLog.i("QbSdk", "setCoreMinVersion: " + i5);
        M = i5;
    }

    public static void setCurrentID(String str) {
        if (str != null && str.startsWith(TID_QQNumber_Prefix)) {
            String substring = str.substring(3);
            B = "0000000000000000".substring(substring.length()) + substring;
        }
    }

    public static void setDisableUnpreinitBySwitch(boolean z4) {
        D = z4;
        StringBuilder g5 = androidx.activity.d.g("setDisableUnpreinitBySwitch -- mDisableUnpreinitBySwitch is ");
        g5.append(D);
        TbsLog.i("QbSdk", g5.toString());
    }

    public static void setDisableUseHostBackupCoreBySwitch(boolean z4) {
        mDisableUseHostBackupCore = z4;
        StringBuilder g5 = androidx.activity.d.g("setDisableUseHostBackupCoreBySwitch -- mDisableUseHostBackupCore is ");
        g5.append(mDisableUseHostBackupCore);
        TbsLog.i("QbSdk", g5.toString());
    }

    public static void setDownloadWithoutWifi(boolean z4) {
        I = z4;
    }

    @Deprecated
    public static void setEnableForThirdParty(Context context, Bundle bundle) {
        com.tencent.smtt.utils.s.a(context, bundle);
    }

    public static void setMultiProcessSyncInitTimer(Timer timer) {
        if (N == null) {
            N = timer;
        }
    }

    public static void setNeedInitX5FirstTime(boolean z4) {
        f1831x = z4;
    }

    public static void setNeedStaticWithDownload(boolean z4) {
        throw new IllegalStateException("Current SDK is not support static mode.");
    }

    public static void setNetLogEncryptionKey(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return;
        }
        try {
            a5.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "setNetLogEncryptionKey", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void setNewDnsHostList(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return;
        }
        try {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "setNewDnsHostList", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void setOnlyDownload(boolean z4) {
        f1819l = z4;
    }

    public static void setQQBuildNumber(String str) {
        C = str;
    }

    public static void setSandboxExternalEnable(boolean z4) {
        FileUtil.a(z4);
    }

    public static void setSystemCoreProtector(SystemCoreProtector systemCoreProtector) {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static void setTBSInstallingStatus(boolean z4) {
        J = z4;
    }

    public static void setTbsInstallerCallback(a aVar) {
        m.a().a(aVar);
    }

    public static void setTbsListener(TbsListener tbsListener) {
        G = tbsListener;
    }

    public static void setTbsLogClient(TbsLogClient tbsLogClient) {
        TbsLog.setTbsLogClient(tbsLogClient);
    }

    public static void setUUID(String str) {
        com.tencent.smtt.utils.b.a(str, true);
    }

    @Deprecated
    public static void setUploadCode(Context context, int i5) {
    }

    public static void setUserID(Context context, Bundle bundle) {
        TbsPrivacyAccess.configureAllPrivacy(context, bundle);
    }

    public static int startMiniQBToLoadUrl(Context context, String str, HashMap<String, String> hashMap, android.webkit.ValueCallback<String> valueCallback) {
        TbsCoreLoadStat.getInstance().a(context, 501);
        if (context == null) {
            return -100;
        }
        u a5 = u.a();
        a5.a(context);
        if (!a5.b()) {
            TbsCoreLoadStat.getInstance().a(context, 502);
            Log.e("QbSdk", "startMiniQBToLoadUrl  ret = -102");
            return -102;
        }
        if (context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") && getTbsVersion(context) < 25487) {
            return -101;
        }
        int a6 = a5.c().a(context, str, hashMap, null, valueCallback);
        TbsLog.i("QbSdk", "startMiniQBToLoadUrl  ret = " + a6);
        return a6;
    }

    public static boolean startQBForDoc(Context context, String str, int i5, int i6, String str2, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("ChannelID", context.getApplicationContext().getApplicationInfo().processName);
        hashMap.put("PosID", Integer.toString(i5));
        return MttLoader.openDocWithQb(context, str, i6, str2, hashMap, bundle);
    }

    public static boolean startQBForVideo(Context context, String str, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("ChannelID", context.getApplicationInfo().processName);
        hashMap.put("PosID", Integer.toString(i5));
        return MttLoader.openVideoWithQb(context, str, hashMap);
    }

    public static boolean startQBToLoadurl(Context context, String str, int i5, WebView webView) {
        u a5;
        Object invokeStaticMethod;
        HashMap hashMap = new HashMap();
        hashMap.put("ChannelID", context.getApplicationInfo().processName);
        hashMap.put("PosID", Integer.toString(i5));
        if (webView == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                if ((str2 == TbsConfig.APP_WX || str2 == TbsConfig.APP_QQ) && (a5 = u.a()) != null && a5.b() && (invokeStaticMethod = a5.c().b().invokeStaticMethod("com.tencent.smtt.webkit.WebViewList", "getCurrentMainWebviewJustForQQandWechat", new Class[0], new Object[0])) != null) {
                    webView = (WebView) ((IX5WebViewBase) invokeStaticMethod).getView().getParent();
                }
            } catch (Exception unused) {
            }
        }
        return MttLoader.loadUrl(context, str, hashMap, "QbSdk.startQBToLoadurl", webView) == 0;
    }

    public static boolean startQbOrMiniQBToLoadUrl(Context context, String str, HashMap<String, String> hashMap, ValueCallback<String> valueCallback) {
        if (context == null) {
            return false;
        }
        u a5 = u.a();
        a5.a(context);
        if (hashMap != null && "5".equals(hashMap.get("PosID")) && a5.b()) {
        }
        if (MttLoader.loadUrl(context, str, hashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0) {
            return a5.b() && (!context.getApplicationInfo().packageName.equals("com.nd.android.pandahome2") || getTbsVersion(context) >= 25487) && a5.c().a(context, str, hashMap, null, valueCallback) == 0;
        }
        return true;
    }

    public static void unForceSysWebView() {
        f1809b = false;
        TbsLog.e("QbSdk", "sys WebView: unForceSysWebView called");
    }

    public static void uploadNetLog(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return;
        }
        try {
            a5.c().b().invokeStaticMethod("com.tencent.smtt.livelog.NetLogManager", "uploadNetLog", new Class[]{String.class}, str);
        } catch (Exception unused) {
        }
    }

    public static void usePrivateCDN() {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static void usePrivateCDN(PrivateCDNMode privateCDNMode) {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static boolean useSoftWare() {
        Object obj = f1826s;
        if (obj == null) {
            return false;
        }
        Object a5 = com.tencent.smtt.utils.j.a(obj, "useSoftWare", (Class<?>[]) new Class[0], new Object[0]);
        if (a5 == null) {
            a5 = com.tencent.smtt.utils.j.a(f1826s, "useSoftWare", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(com.tencent.smtt.sdk.a.a()));
        }
        if (a5 == null) {
            return false;
        }
        return ((Boolean) a5).booleanValue();
    }
}
