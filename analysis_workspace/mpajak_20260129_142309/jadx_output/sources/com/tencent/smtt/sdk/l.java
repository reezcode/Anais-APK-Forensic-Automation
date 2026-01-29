package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes22.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private static l f2183a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f2184b;

    private l() {
    }

    public static l a(Context context) {
        if (f2183a == null) {
            synchronized (l.class) {
                if (f2183a == null) {
                    f2183a = new l();
                }
            }
        }
        f2184b = context.getApplicationContext();
        return f2183a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Properties e() {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.a()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            if (r1 == 0) goto L2a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L40
            r3.<init>(r1)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L40
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            r2.load(r1)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L62
            r0 = r1
            goto L2b
        L1b:
            r0 = move-exception
            goto L4a
        L1d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L63
        L22:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L4a
        L27:
            r1 = move-exception
            r3 = r0
            goto L48
        L2a:
            r3 = r0
        L2b:
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r0 = move-exception
            r0.printStackTrace()
        L35:
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.io.IOException -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            r0.printStackTrace()
        L3f:
            return r2
        L40:
            r1 = move-exception
            r3 = r0
            r0 = r1
            r1 = r3
            goto L63
        L45:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L48:
            r0 = r1
            r1 = r3
        L4a:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r0 = move-exception
            r0.printStackTrace()
        L57:
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r0 = move-exception
            r0.printStackTrace()
        L61:
            return r2
        L62:
            r0 = move-exception
        L63:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r1 = move-exception
            r1.printStackTrace()
        L6d:
            if (r3 == 0) goto L77
            r3.close()     // Catch: java.io.IOException -> L73
            goto L77
        L73:
            r1 = move-exception
            r1.printStackTrace()
        L77:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.l.e():java.util.Properties");
    }

    public File a() {
        File file = new File(m.o(f2184b), "tbscoreinstall.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return file;
    }

    public void a(int i5) {
        a("dexopt_retry_num", i5);
    }

    public void a(int i5, int i6) {
        a("copy_core_ver", i5);
        a("copy_status", i6);
    }

    public void a(String str) {
        a("install_apk_path", str);
    }

    public void a(String str, int i5) {
        a(str, String.valueOf(i5));
    }

    public void a(String str, String str2) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    Properties e5 = e();
                    if (e5 != null) {
                        e5.setProperty(str, str2);
                        File a5 = a();
                        if (a5 != null) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(a5);
                            try {
                                e5.store(fileOutputStream2, "update " + str + " and status!");
                                fileOutputStream = fileOutputStream2;
                            } catch (Exception e6) {
                                e = e6;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e8) {
                e = e8;
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public int b() {
        return c("install_core_ver");
    }

    public int b(String str) {
        Properties e5 = e();
        if (e5 != null && e5.getProperty(str) != null) {
            try {
                return Integer.parseInt(e5.getProperty(str));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public void b(int i5) {
        a("unzip_retry_num", i5);
    }

    public void b(int i5, int i6) {
        a("tpatch_ver", i5);
        a("tpatch_status", i6);
    }

    public int c() {
        return b("install_status");
    }

    public int c(String str) {
        Properties e5 = e();
        if (e5 != null && e5.getProperty(str) != null) {
            try {
                return Integer.parseInt(e5.getProperty(str));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public void c(int i5) {
        a("incrupdate_status", i5);
    }

    public void c(int i5, int i6) {
        a("install_core_ver", i5);
        a("install_status", i6);
    }

    public int d() {
        return b("incrupdate_status");
    }

    public String d(String str) {
        Properties e5 = e();
        if (e5 == null || e5.getProperty(str) == null) {
            return null;
        }
        return e5.getProperty(str);
    }

    public void d(int i5) {
        a("unlzma_status", i5);
    }
}
