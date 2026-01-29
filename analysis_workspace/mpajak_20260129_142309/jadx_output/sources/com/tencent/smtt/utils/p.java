package com.tencent.smtt.utils;

import android.content.Context;
import com.tencent.smtt.sdk.QbSdk;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/* loaded from: classes11.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    private static p f2445e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2446a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2447b;

    /* renamed from: c, reason: collision with root package name */
    private File f2448c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2449d;

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            pVar = f2445e;
        }
        return pVar;
    }

    private File c() {
        try {
            if (this.f2448c == null) {
                File file = new File(QbSdk.getTbsFolderDir(this.f2447b), "core_private");
                this.f2448c = file;
                if (!file.isDirectory()) {
                    return null;
                }
            }
            File file2 = new File(this.f2448c, "debug.conf");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            return file2;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void a(boolean z4) {
        this.f2449d = z4;
        b();
    }

    public void b() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        File c5 = c();
        if (c5 == null) {
            return;
        }
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(c5));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    properties.setProperty("setting_forceUseSystemWebview", Boolean.toString(this.f2446a));
                    properties.setProperty("result_systemWebviewForceUsed", Boolean.toString(this.f2449d));
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(c5));
                    try {
                        properties.store(bufferedOutputStream, (String) null);
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            try {
                                bufferedInputStream.close();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th4) {
                bufferedInputStream = null;
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
