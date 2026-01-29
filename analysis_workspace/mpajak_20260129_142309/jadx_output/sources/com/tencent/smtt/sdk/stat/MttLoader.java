package com.tencent.smtt.sdk.stat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsConfig;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes18.dex */
public class MttLoader {
    public static final String CHANNEL_ID = "ChannelID";
    public static final String ENTRY_ID = "entryId";

    @Deprecated
    public static final String KEY_ACTIVITY_NAME = "KEY_ACT";

    @Deprecated
    public static final String KEY_APP_NAME = "KEY_APPNAME";
    public static final String KEY_EUSESTAT = "KEY_EUSESTAT";

    @Deprecated
    public static final String KEY_PACKAGE = "KEY_PKG";
    public static final String KEY_PID = "KEY_PID";
    public static final String MTT_ACTION = "com.tencent.QQBrowser.action.VIEW";
    public static final String MTT_ACTION_SP = "com.tencent.QQBrowser.action.VIEWSP";
    public static final String PID_ARTICLE_NEWS = "21272";
    public static final String PID_MOBILE_QQ = "50079";
    public static final String PID_QQPIM = "50190";
    public static final String PID_QZONE = "10494";
    public static final String PID_WECHAT = "10318";
    public static final String POS_ID = "PosID";
    public static final String QQBROWSER_DIRECT_DOWNLOAD_URL = "https://mdc.html5.qq.com/d/directdown.jsp?channel_id=50079";
    public static final String QQBROWSER_DOWNLOAD_URL = "https://mdc.html5.qq.com/mh?channel_id=50079&u=";
    public static final String QQBROWSER_PARAMS_FROME = ",from=";
    public static final String QQBROWSER_PARAMS_PACKAGENAME = ",packagename=";
    public static final String QQBROWSER_PARAMS_PD = ",product=";
    public static final String QQBROWSER_PARAMS_VERSION = ",version=";
    public static final String QQBROWSER_SCHEME = "mttbrowser://url=";
    public static final int RESULT_INVALID_CONTEXT = 3;
    public static final int RESULT_INVALID_URL = 2;
    public static final int RESULT_NOT_INSTALL_QQBROWSER = 4;
    public static final int RESULT_OK = 0;
    public static final int RESULT_QQBROWSER_LOW = 5;
    public static final int RESULT_UNKNOWN = 1;
    public static final String STAT_KEY = "StatKey";

    /* loaded from: classes10.dex */
    public static class BrowserInfo {
        public int browserType = -1;
        public int ver = -1;
        public String quahead = "";
        public String vn = "0";
        public String packageName = null;
    }

    /* loaded from: classes23.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f2229a;

        /* renamed from: b, reason: collision with root package name */
        public String f2230b;

        private a() {
            this.f2229a = "";
            this.f2230b = "";
        }
    }

    private static int a(Context context) {
        String str = context.getApplicationInfo().processName;
        if (str.equals(TbsConfig.APP_QQ)) {
            return 13;
        }
        if (str.equals(TbsConfig.APP_QZONE)) {
            return 14;
        }
        if (str.equals("com.tencent.WBlog")) {
            return 15;
        }
        return str.equals(TbsConfig.APP_WX) ? 24 : 26;
    }

    private static Uri a(Context context, String str) {
        return Uri.fromFile(new File(str));
    }

    private static a a(Context context, Uri uri) {
        Intent intent = new Intent(MTT_ACTION);
        intent.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() <= 0) {
            return null;
        }
        a aVar = new a();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (str.contains(TbsConfig.APP_QB)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                aVar.f2229a = activityInfo.name;
                aVar.f2230b = activityInfo.packageName;
                return aVar;
            }
            if (str.contains("com.tencent.qbx")) {
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                aVar.f2229a = activityInfo2.name;
                aVar.f2230b = activityInfo2.packageName;
            }
        }
        return aVar;
    }

    private static String a(Certificate certificate) {
        byte[] encoded = certificate.getEncoded();
        int length = encoded.length;
        char[] cArr = new char[length * 2];
        for (int i5 = 0; i5 < length; i5++) {
            byte b5 = encoded[i5];
            int i6 = (b5 >> 4) & 15;
            int i7 = i5 * 2;
            cArr[i7] = (char) (i6 >= 10 ? (i6 + 97) - 10 : i6 + 48);
            int i8 = b5 & 15;
            cArr[i7 + 1] = (char) (i8 >= 10 ? (i8 + 97) - 10 : i8 + 48);
        }
        return new String(cArr);
    }

    private static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String trim = str.trim();
        int indexOf = trim.toLowerCase().indexOf("://");
        int indexOf2 = trim.toLowerCase().indexOf(46);
        if (indexOf <= 0 || indexOf2 <= 0 || indexOf <= indexOf2) {
            return trim.toLowerCase().contains("://");
        }
        return false;
    }

    public static BrowserInfo getBrowserInfo(Context context) {
        int i5;
        boolean z4 = context.getApplicationContext().getSharedPreferences("x5_proxy_setting", 0).getBoolean("qb_install_status", false);
        BrowserInfo browserInfo = new BrowserInfo();
        if (z4) {
            return browserInfo;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = null;
            try {
                packageInfo = packageManager.getPackageInfo(TbsConfig.APP_QB, 0);
                browserInfo.browserType = 2;
                browserInfo.packageName = TbsConfig.APP_QB;
                browserInfo.quahead = "ADRQB_";
                if (packageInfo != null && (i5 = packageInfo.versionCode) > 420000) {
                    browserInfo.ver = i5;
                    browserInfo.quahead += packageInfo.versionName.replaceAll("\\.", "");
                    browserInfo.vn = packageInfo.versionName.replaceAll("\\.", "");
                    return browserInfo;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            try {
                try {
                    try {
                        try {
                            try {
                                packageInfo = packageManager.getPackageInfo("com.tencent.qbx", 0);
                                browserInfo.browserType = 0;
                                browserInfo.packageName = "com.tencent.qbx";
                                browserInfo.quahead = "ADRQBX_";
                            } catch (PackageManager.NameNotFoundException unused2) {
                                packageInfo = packageManager.getPackageInfo("com.tencent.mtt.x86", 0);
                                browserInfo.packageName = "com.tencent.mtt.x86";
                                browserInfo.browserType = 2;
                                browserInfo.quahead = "ADRQB_";
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                        packageInfo = packageManager.getPackageInfo("com.tencent.qbx5", 0);
                        browserInfo.browserType = 1;
                        browserInfo.packageName = "com.tencent.qbx5";
                        browserInfo.quahead = "ADRQBX5_";
                    }
                } catch (Exception unused5) {
                    a a5 = a(context, Uri.parse(QQBROWSER_DOWNLOAD_URL));
                    if (a5 != null && !TextUtils.isEmpty(a5.f2230b)) {
                        PackageInfo packageInfo2 = packageManager.getPackageInfo(a5.f2230b, 0);
                        try {
                            browserInfo.packageName = a5.f2230b;
                            browserInfo.browserType = 2;
                            browserInfo.quahead = "ADRQB_";
                        } catch (Exception unused6) {
                        }
                        packageInfo = packageInfo2;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused7) {
                packageInfo = packageManager.getPackageInfo(TbsConfig.APP_QB, 0);
                browserInfo.packageName = TbsConfig.APP_QB;
                browserInfo.browserType = 2;
                browserInfo.quahead = "ADRQB_";
            }
            if (packageInfo != null) {
                browserInfo.ver = packageInfo.versionCode;
                browserInfo.quahead += packageInfo.versionName.replaceAll("\\.", "");
                browserInfo.vn = packageInfo.versionName.replaceAll("\\.", "");
            }
        } catch (Exception unused8) {
        }
        return browserInfo;
    }

    public static String getDownloadUrlWithQb(String str) {
        try {
            return QQBROWSER_DOWNLOAD_URL + URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
            return QQBROWSER_DOWNLOAD_URL;
        }
    }

    public static String getValidQBUrl(Context context, String str) {
        if (str.toLowerCase().startsWith("qb://")) {
            boolean z4 = false;
            BrowserInfo browserInfo = getBrowserInfo(context);
            int i5 = browserInfo.browserType;
            if (i5 == -1 || (i5 == 2 && browserInfo.ver < 33)) {
                z4 = true;
            }
            if (z4) {
                return getDownloadUrlWithQb(str);
            }
        }
        return str;
    }

    public static boolean isBrowserInstalled(Context context) {
        return getBrowserInfo(context).browserType != -1;
    }

    public static boolean isBrowserInstalledEx(Context context) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        boolean z4 = false;
        try {
            if (Long.valueOf(browserInfo.vn).longValue() >= 6001500) {
                z4 = true;
            }
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        if (browserInfo.ver >= 601500) {
            return true;
        }
        return z4;
    }

    public static boolean isGreatBrowserVer(Context context, long j5, long j6) {
        boolean z4 = false;
        try {
            if (Long.valueOf(getBrowserInfo(context).vn).longValue() >= j5) {
                z4 = true;
            }
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        if (r5.ver >= j6) {
            return true;
        }
        return z4;
    }

    public static boolean isSupportQBScheme(Context context) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        int i5 = browserInfo.browserType;
        if (i5 == -1) {
            return false;
        }
        return i5 != 2 || browserInfo.ver >= 42;
    }

    public static boolean isSupportingTbsTips(Context context) {
        BrowserInfo browserInfo = getBrowserInfo(context);
        return browserInfo.browserType == 2 && browserInfo.ver >= 580000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0069, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f2229a) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        r1 = r0.f2230b;
        r0 = r0.f2229a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f2229a) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b8, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f2229a) == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc A[Catch: ActivityNotFoundException -> 0x0125, TryCatch #0 {ActivityNotFoundException -> 0x0125, blocks: (B:43:0x00ec, B:45:0x00fc, B:46:0x0120), top: B:42:0x00ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int loadUrl(android.content.Context r7, java.lang.String r8, java.util.HashMap<java.lang.String, java.lang.String> r9, com.tencent.smtt.sdk.WebView r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.loadUrl(android.content.Context, java.lang.String, java.util.HashMap, com.tencent.smtt.sdk.WebView):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(3:7|8|(8:10|11|12|(1:14)|15|(1:17)(1:21)|18|19))|25|11|12|(0)|15|(0)(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int loadUrl(android.content.Context r4, java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6, java.lang.String r7, com.tencent.smtt.sdk.WebView r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            java.lang.String r3 = "com.tencent.mtt"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L1d
            r3 = 601000(0x92ba8, float:8.4218E-40)
            if (r2 <= r3) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.String r3 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r5, r3)     // Catch: java.lang.Exception -> L29
            if (r2 == 0) goto L27
            r5 = r1
        L27:
            r1 = r2
            goto L2a
        L29:
        L2a:
            if (r1 == 0) goto L2f
            java.lang.String r1 = ",encoded=1"
            goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            java.lang.String r2 = "mttbrowser://url="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ",product="
            r0.append(r5)
            java.lang.String r5 = "TBS"
            r0.append(r5)
            java.lang.String r5 = ",packagename="
            r0.append(r5)
            java.lang.String r5 = r4.getPackageName()
            r0.append(r5)
            java.lang.String r5 = ",from="
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = ",version="
            r0.append(r5)
            java.lang.String r5 = "4.3.0.386"
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            int r4 = loadUrl(r4, r5, r6, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.loadUrl(android.content.Context, java.lang.String, java.util.HashMap, java.lang.String, com.tencent.smtt.sdk.WebView):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0010, B:8:0x0014, B:10:0x001a, B:13:0x002c, B:18:0x0030, B:20:0x0046, B:24:0x0050, B:25:0x0059, B:27:0x0060, B:29:0x006a, B:31:0x006e, B:32:0x0071, B:36:0x007d, B:38:0x00a0, B:39:0x00a5), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean openDocWithQb(android.content.Context r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.util.HashMap<java.lang.String, java.lang.String> r11, android.os.Bundle r12) {
        /*
            r0 = 0
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> La9
            java.lang.String r2 = "com.tencent.QQBrowser.action.sdk.document"
            r1.<init>(r2)     // Catch: java.lang.Exception -> La9
            if (r11 == 0) goto L30
            java.util.Set r2 = r11.keySet()     // Catch: java.lang.Exception -> La9
            if (r2 == 0) goto L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> La9
        L14:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> La9
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> La9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> La9
            java.lang.Object r4 = r11.get(r3)     // Catch: java.lang.Exception -> La9
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> La9
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> La9
            if (r5 != 0) goto L14
            r1.putExtra(r3, r4)     // Catch: java.lang.Exception -> La9
            goto L14
        L30:
            java.io.File r11 = new java.io.File     // Catch: java.lang.Exception -> La9
            r11.<init>(r7)     // Catch: java.lang.Exception -> La9
            java.lang.String r11 = "key_reader_sdk_id"
            r2 = 3
            r1.putExtra(r11, r2)     // Catch: java.lang.Exception -> La9
            java.lang.String r11 = "key_reader_sdk_type"
            r1.putExtra(r11, r8)     // Catch: java.lang.Exception -> La9
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> La9
            if (r11 != 0) goto L4b
            java.lang.String r11 = "big_brother_source_key"
            r1.putExtra(r11, r10)     // Catch: java.lang.Exception -> La9
        L4b:
            r10 = 1
            if (r8 != 0) goto L54
            java.lang.String r8 = "key_reader_sdk_path"
        L50:
            r1.putExtra(r8, r7)     // Catch: java.lang.Exception -> La9
            goto L59
        L54:
            if (r8 != r10) goto L59
            java.lang.String r8 = "key_reader_sdk_url"
            goto L50
        L59:
            java.lang.String r8 = "key_reader_sdk_format"
            r1.putExtra(r8, r9)     // Catch: java.lang.Exception -> La9
            if (r6 == 0) goto L71
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo()     // Catch: java.lang.Exception -> La9
            int r8 = r8.targetSdkVersion     // Catch: java.lang.Exception -> La9
            r11 = 24
            if (r8 < r11) goto L71
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La9
            if (r8 < r11) goto L71
            r1.addFlags(r10)     // Catch: java.lang.Exception -> La9
        L71:
            r8 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r8)     // Catch: java.lang.Exception -> La9
            android.net.Uri r7 = a(r6, r7)     // Catch: java.lang.Exception -> La9
            if (r7 != 0) goto L7d
            return r0
        L7d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La9
            r8.<init>()     // Catch: java.lang.Exception -> La9
            java.lang.String r11 = "mtt/"
            r8.append(r11)     // Catch: java.lang.Exception -> La9
            r8.append(r9)     // Catch: java.lang.Exception -> La9
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> La9
            r1.setDataAndType(r7, r8)     // Catch: java.lang.Exception -> La9
            java.lang.String r7 = "loginType"
            android.content.Context r8 = r6.getApplicationContext()     // Catch: java.lang.Exception -> La9
            int r8 = a(r8)     // Catch: java.lang.Exception -> La9
            r1.putExtra(r7, r8)     // Catch: java.lang.Exception -> La9
            if (r12 == 0) goto La5
            java.lang.String r7 = "key_reader_sdk_extrals"
            r1.putExtra(r7, r12)     // Catch: java.lang.Exception -> La9
        La5:
            r6.startActivity(r1)     // Catch: java.lang.Exception -> La9
            return r10
        La9:
            r6 = move-exception
            r6.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.openDocWithQb(android.content.Context, java.lang.String, int, java.lang.String, java.lang.String, java.util.HashMap, android.os.Bundle):boolean");
    }

    public static boolean openDocWithQb(Context context, String str, int i5, String str2, HashMap<String, String> hashMap) {
        return openDocWithQb(context, str, i5, str2, hashMap, null);
    }

    public static boolean openDocWithQb(Context context, String str, int i5, String str2, HashMap<String, String> hashMap, Bundle bundle) {
        return openDocWithQb(context, str, i5, str2, "", hashMap, null);
    }

    public static boolean openVideoWithQb(Context context, String str, HashMap<String, String> hashMap) {
        boolean z4;
        Set<String> keySet;
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setDataAndType(parse, "video/*");
        if (hashMap != null && (keySet = hashMap.keySet()) != null) {
            for (String str2 : keySet) {
                String str3 = hashMap.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    intent.putExtra(str2, str3);
                }
            }
        }
        try {
            intent.putExtra("loginType", a(context));
            intent.setComponent(new ComponentName(TbsConfig.APP_QB, "com.tencent.mtt.browser.video.H5VideoThrdcallActivity"));
            context.startActivity(intent);
            z4 = true;
        } catch (Throwable unused) {
            z4 = false;
        }
        if (!z4) {
            try {
                intent.setComponent(null);
                context.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        if (r2 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean verifySignature(java.io.File r7) {
        /*
            r0 = 0
            r1 = 0
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L53
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = "AndroidManifest.xml"
            java.util.jar.JarEntry r7 = r2.getJarEntry(r7)     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L13
            r2.close()     // Catch: java.io.IOException -> L12
        L12:
            return r1
        L13:
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L54
            java.io.InputStream r0 = r2.getInputStream(r7)     // Catch: java.lang.Throwable -> L54
        L1b:
            int r5 = r0.read(r4, r1, r3)     // Catch: java.lang.Throwable -> L54
            r6 = -1
            if (r5 == r6) goto L23
            goto L1b
        L23:
            r0.close()     // Catch: java.lang.Throwable -> L54
            java.security.cert.Certificate[] r7 = r7.getCertificates()     // Catch: java.lang.Throwable -> L54
            int r3 = r7.length     // Catch: java.lang.Throwable -> L54
            r4 = 1
            if (r3 >= r4) goto L35
            r0.close()     // Catch: java.io.IOException -> L31
        L31:
            r2.close()     // Catch: java.io.IOException -> L34
        L34:
            return r1
        L35:
            r7 = r7[r1]     // Catch: java.lang.Throwable -> L54
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L4c
            java.lang.String r3 = "3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a"
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L4c
            r0.close()     // Catch: java.io.IOException -> L48
        L48:
            r2.close()     // Catch: java.io.IOException -> L4b
        L4b:
            return r4
        L4c:
            r0.close()     // Catch: java.io.IOException -> L4f
        L4f:
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L5e
        L53:
            r2 = r0
        L54:
            if (r0 == 0) goto L5b
            r0.close()     // Catch: java.io.IOException -> L5a
            goto L5b
        L5a:
        L5b:
            if (r2 == 0) goto L5e
            goto L4f
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.MttLoader.verifySignature(java.io.File):boolean");
    }
}
