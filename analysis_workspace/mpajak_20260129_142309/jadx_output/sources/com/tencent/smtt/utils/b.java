package com.tencent.smtt.utils;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes20.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f2310a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f2311b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f2312c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f2313d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f2314e = "";

    /* renamed from: f, reason: collision with root package name */
    public static String f2315f = "";

    /* renamed from: g, reason: collision with root package name */
    private static boolean f2316g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f2317h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f2318i;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        if (r3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = "os.arch"
            boolean r1 = com.tencent.smtt.utils.b.f2317h
            if (r1 != 0) goto L79
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "getprop ro.product.cpu.abi"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L47
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L47
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L47
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L47
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "x86"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L32
            java.lang.String r4 = "i686"
        L2d:
            java.lang.String r0 = b(r4)     // Catch: java.lang.Throwable -> L42
            goto L37
        L32:
            java.lang.String r4 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L42
            goto L2d
        L37:
            if (r0 == 0) goto L3b
            com.tencent.smtt.utils.b.f2312c = r0
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3e
        L3e:
            r3.close()     // Catch: java.io.IOException -> L63
            goto L63
        L42:
            r4 = move-exception
            goto L4a
        L44:
            r4 = move-exception
            r2 = r1
            goto L4a
        L47:
            r4 = move-exception
            r2 = r1
            r3 = r2
        L4a:
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = b(r0)     // Catch: java.lang.Throwable -> L67
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L59
            com.tencent.smtt.utils.b.f2312c = r1
        L59:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L60
        L5f:
        L60:
            if (r3 == 0) goto L63
            goto L3e
        L63:
            r0 = 1
            com.tencent.smtt.utils.b.f2317h = r0
            goto L79
        L67:
            r0 = move-exception
            if (r1 == 0) goto L6c
            com.tencent.smtt.utils.b.f2312c = r1
        L6c:
            if (r2 == 0) goto L73
            r2.close()     // Catch: java.io.IOException -> L72
            goto L73
        L72:
        L73:
            if (r3 == 0) goto L78
            r3.close()     // Catch: java.io.IOException -> L78
        L78:
            throw r0
        L79:
            java.lang.String r0 = com.tencent.smtt.utils.b.f2312c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.b.a():java.lang.String");
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:3:0x0003, B:5:0x0013, B:7:0x0017, B:9:0x001a, B:11:0x0026, B:16:0x001e), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r4, java.io.File r5) {
        /*
            java.lang.String r0 = "AppUtil"
            r1 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L2b
            r3 = 65
            android.content.pm.PackageInfo r4 = r4.getPackageArchiveInfo(r2, r3)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L23
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L1e
            int r2 = r4.length     // Catch: java.lang.Exception -> L2b
            if (r2 <= 0) goto L1e
            r2 = 0
            r4 = r4[r2]     // Catch: java.lang.Exception -> L2b
            goto L24
        L1e:
            java.lang.String r4 = "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!"
            com.tencent.smtt.utils.TbsLog.w(r0, r4)     // Catch: java.lang.Exception -> L2b
        L23:
            r4 = r1
        L24:
            if (r4 == 0) goto L44
            java.lang.String r1 = r4.toCharsString()     // Catch: java.lang.Exception -> L2b
            goto L44
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "getSign "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r5 = "failed"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.smtt.utils.TbsLog.i(r0, r4)
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.b.a(android.content.Context, java.io.File):java.lang.String");
    }

    public static String a(Context context, String str) {
        String str2 = null;
        try {
            str2 = String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
            return String.valueOf(Integer.toHexString(Integer.parseInt(str2)));
        } catch (Exception unused) {
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0066 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:42:0x0056, B:44:0x0066, B:46:0x0071), top: B:41:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5, boolean r6, java.io.File r7) {
        /*
            java.lang.String r0 = "AppUtil"
            java.lang.String r1 = ""
            if (r7 == 0) goto Lb4
            boolean r2 = r7.exists()
            if (r2 != 0) goto Le
            goto Lb4
        Le:
            if (r6 == 0) goto L56
            r6 = 0
            r2 = 2
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r4 = "r"
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r3.read(r2)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L4b
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L4b
            r6.<init>(r2)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L4b
            java.lang.String r2 = "PK"
            boolean r6 = r6.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L4b
            if (r6 != 0) goto L34
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r5 = move-exception
            r5.printStackTrace()
        L33:
            return r1
        L34:
            r3.close()     // Catch: java.io.IOException -> L46
            goto L56
        L38:
            r6 = move-exception
            goto L3f
        L3a:
            r5 = move-exception
            goto L4d
        L3c:
            r1 = move-exception
            r3 = r6
            r6 = r1
        L3f:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4b
            r3.close()     // Catch: java.io.IOException -> L46
            goto L56
        L46:
            r6 = move-exception
            r6.printStackTrace()
            goto L56
        L4b:
            r5 = move-exception
            r6 = r3
        L4d:
            r6.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            throw r5
        L56:
            android.content.Context r6 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "com.jd.jrapp"
            boolean r6 = r6.contains(r1)     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L7c
            java.lang.String r6 = "[AppUtil.getSignatureFromApk]  #1"
            com.tencent.smtt.utils.TbsLog.i(r0, r6)     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = a(r7)     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L7c
            java.lang.String r1 = "[AppUtil.getSignatureFromApk]  #2"
            com.tencent.smtt.utils.TbsLog.i(r0, r1)     // Catch: java.lang.Throwable -> L77
            return r6
        L77:
            java.lang.String r6 = "[AppUtil.getSignatureFromApk]  #3"
            com.tencent.smtt.utils.TbsLog.i(r0, r6)
        L7c:
            java.lang.String r6 = "[AppUtil.getSignatureFromApk]  #4"
            com.tencent.smtt.utils.TbsLog.i(r0, r6)
            java.lang.String r5 = a(r5, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "[AppUtil.getSignatureFromApk]  android api signature="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.smtt.utils.TbsLog.i(r0, r6)
            if (r5 != 0) goto Lb3
            java.lang.String r5 = a(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[AppUtil.getSignatureFromApk]  java get signature="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.smtt.utils.TbsLog.i(r0, r6)
        Lb3:
            return r5
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.b.a(android.content.Context, boolean, java.io.File):java.lang.String");
    }

    private static String a(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            byte[] bArr = new byte[8192];
            String a5 = a(a(jarFile, jarFile.getJarEntry("AndroidManifest.xml"), bArr)[0].getEncoded());
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                if (name != null) {
                    Certificate[] a6 = a(jarFile, nextElement, bArr);
                    String a7 = a6 != null ? a(a6[0].getEncoded()) : null;
                    if (a7 == null) {
                        if (!name.startsWith("META-INF/")) {
                            return null;
                        }
                    } else if (!a7.equals(a5)) {
                        return null;
                    }
                }
            }
            return a5;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i5 = 0; i5 < length; i5++) {
            byte b5 = bArr[i5];
            int i6 = (b5 >> 4) & 15;
            int i7 = i5 * 2;
            cArr[i7] = (char) (i6 >= 10 ? (i6 + 97) - 10 : i6 + 48);
            int i8 = b5 & 15;
            cArr[i7 + 1] = (char) (i8 >= 10 ? (i8 + 97) - 10 : i8 + 48);
        }
        return new String(cArr);
    }

    public static void a(String str, boolean z4) {
        if (z4) {
            str = k.a(str);
        }
        f2310a = str;
    }

    public static boolean a(String str) {
        Matcher matcher;
        try {
            matcher = Pattern.compile("i686|mips|x86_64|x86").matcher(str);
        } catch (Exception unused) {
            matcher = null;
        }
        return matcher == null || !matcher.find();
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        while (inputStream.read(bArr, 0, bArr.length) != -1) {
        }
        inputStream.close();
        if (jarEntry != null) {
            return jarEntry.getCertificates();
        }
        return null;
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }

    public static void b(Context context, String str) {
        try {
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_GUID, str);
            tbsDownloadConfig.commit();
        } catch (Exception unused) {
        }
    }

    public static boolean b() {
        Matcher matcher;
        try {
            matcher = Pattern.compile("i686|mips|x86_64|x86").matcher(f2312c);
        } catch (Exception unused) {
            matcher = null;
        }
        return matcher == null || !matcher.find();
    }

    public static String c(Context context) {
        try {
            return TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_GUID, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean c() {
        Class<?> cls;
        Method declaredMethod;
        Object invoke;
        Method declaredMethod2;
        try {
            cls = Class.forName("dalvik.system.VMRuntime");
            declaredMethod = cls.getDeclaredMethod("getRuntime", new Class[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (declaredMethod == null || (invoke = declaredMethod.invoke(null, new Object[0])) == null || (declaredMethod2 = cls.getDeclaredMethod("is64Bit", new Class[0])) == null) {
            return false;
        }
        Object invoke2 = declaredMethod2.invoke(invoke, new Object[0]);
        if (invoke2 instanceof Boolean) {
            return ((Boolean) invoke2).booleanValue();
        }
        return false;
    }

    public static String d(Context context) {
        if (!f2316g) {
            try {
                if (TextUtils.isEmpty(f2310a)) {
                    f2310a = k.a(context);
                }
            } catch (Exception e5) {
                TbsLog.i(e5);
            }
            f2316g = true;
        }
        return f2310a;
    }

    public static String e(Context context) {
        return "";
    }

    public static String f(Context context) {
        return "02:00:00:00:00:00";
    }

    public static String g(Context context) {
        return "";
    }
}
