package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

/* loaded from: classes19.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static o f2437c;

    /* renamed from: a, reason: collision with root package name */
    private Context f2438a;

    /* renamed from: b, reason: collision with root package name */
    private File f2439b = null;

    /* renamed from: d, reason: collision with root package name */
    private String f2440d = "https://log.tbs.qq.com/ajax?c=pu&v=2&k=";

    /* renamed from: e, reason: collision with root package name */
    private String f2441e = "https://log.tbs.qq.com/ajax?c=pu&tk=";

    /* renamed from: f, reason: collision with root package name */
    private String f2442f = "https://log.tbs.qq.com/ajax?c=dl&k=";

    /* renamed from: g, reason: collision with root package name */
    private String f2443g = "https://cfg.imtt.qq.com/tbs?v=2&mk=";

    /* renamed from: h, reason: collision with root package name */
    private String f2444h = "https://log.tbs.qq.com/ajax?c=ul&v=2&k=";

    @TargetApi(11)
    private o(Context context) {
        this.f2438a = null;
        TbsLog.w("TbsCommonConfig", "TbsCommonConfig constructing...");
        this.f2438a = context.getApplicationContext();
        f();
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            oVar = f2437c;
        }
        return oVar;
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            if (f2437c == null) {
                f2437c = new o(context);
            }
            oVar = f2437c;
        }
        return oVar;
    }

    private synchronized void f() {
        File g5;
        BufferedInputStream bufferedInputStream = null;
        try {
            g5 = g();
        } catch (Throwable th) {
            th = th;
        }
        if (g5 == null) {
            TbsLog.e("TbsCommonConfig", "Config file is null, default values will be applied");
            return;
        }
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(g5));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream2);
            String property = properties.getProperty("pv_post_url", "");
            if (!"".equals(property)) {
                this.f2440d = property;
            }
            String property2 = properties.getProperty("tbs_download_stat_post_url", "");
            if (!"".equals(property2)) {
                this.f2442f = property2;
            }
            String property3 = properties.getProperty("tbs_downloader_post_url", "");
            TbsLog.i("TbsCommonConfig", "KEY_TBS_DOWNLOADER_POST_URL is " + property3);
            if (!"".equals(property3)) {
                this.f2443g = property3;
            }
            String property4 = properties.getProperty("tbs_log_post_url", "");
            if (!"".equals(property4)) {
                this.f2444h = property4;
            }
            String property5 = properties.getProperty("pv_post_url_tk", "");
            if (!"".equals(property5)) {
                this.f2441e = property5;
            }
            try {
                bufferedInputStream2.close();
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
            try {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                TbsLog.e("TbsCommonConfig", "exceptions occurred1:" + stringWriter.toString());
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                        e = e6;
                        e.printStackTrace();
                    }
                }
            } finally {
            }
        }
    }

    private File g() {
        File file = null;
        try {
            if (this.f2439b == null) {
                if (!TextUtils.isEmpty(this.f2438a.getApplicationContext().getApplicationInfo().packageName)) {
                    this.f2439b = new File(FileUtil.a(this.f2438a, 8));
                }
                File file2 = this.f2439b;
                if (file2 == null || !file2.isDirectory()) {
                    return null;
                }
            }
            TbsLog.i("TbsCommonConfig", "mTbsConfigDir is " + this.f2439b.getAbsolutePath());
            File file3 = new File(this.f2439b, "tbsnet.conf");
            if (!file3.exists()) {
                TbsLog.e("TbsCommonConfig", "Get file(" + file3.getCanonicalPath() + ") failed!");
                return null;
            }
            try {
                TbsLog.w("TbsCommonConfig", "pathc:" + file3.getCanonicalPath());
                return file3;
            } catch (Throwable th) {
                th = th;
                file = file3;
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                TbsLog.e("TbsCommonConfig", "exceptions occurred2:" + stringWriter.toString());
                return file;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String b() {
        return this.f2440d;
    }

    public String c() {
        return this.f2442f;
    }

    public String d() {
        return this.f2443g;
    }

    public String e() {
        return this.f2441e;
    }
}
