package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.widget.TextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes17.dex */
public class TbsLogClient {

    /* renamed from: a, reason: collision with root package name */
    public static TbsLogClient f2299a;

    /* renamed from: c, reason: collision with root package name */
    public static File f2300c;

    /* renamed from: d, reason: collision with root package name */
    public static String f2301d;

    /* renamed from: e, reason: collision with root package name */
    public static byte[] f2302e;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2303b;

    /* renamed from: f, reason: collision with root package name */
    private SimpleDateFormat f2304f;

    /* renamed from: g, reason: collision with root package name */
    private Context f2305g;

    /* renamed from: h, reason: collision with root package name */
    private StringBuffer f2306h = new StringBuffer();

    /* renamed from: i, reason: collision with root package name */
    private boolean f2307i = false;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public String f2308a;

        public a(String str) {
            this.f2308a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = TbsLogClient.this.f2303b;
            if (textView != null) {
                textView.append(this.f2308a + "\n");
            }
        }
    }

    public TbsLogClient(Context context) {
        this.f2304f = null;
        this.f2305g = null;
        try {
            this.f2305g = context.getApplicationContext();
            this.f2304f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS", Locale.US);
        } catch (Exception unused) {
            this.f2304f = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
        }
    }

    private void a() {
        try {
            if (f2300c == null) {
                String a5 = FileUtil.a(this.f2305g, 6);
                if (a5 == null) {
                    f2300c = null;
                } else {
                    f2300c = new File(a5, "tbslog.txt");
                    f2301d = LogFileUtils.createKey();
                    f2302e = LogFileUtils.createHeaderText(f2300c.getName(), f2301d);
                }
            }
        } catch (NullPointerException | SecurityException e5) {
            e5.printStackTrace();
        }
    }

    public void d(String str, String str2) {
    }

    public void e(String str, String str2) {
    }

    public void i(String str, String str2) {
    }

    public void setLogView(TextView textView) {
        this.f2303b = textView;
    }

    public void setWriteLogJIT(boolean z4) {
        this.f2307i = z4;
    }

    public void showLog(String str) {
        TextView textView = this.f2303b;
        if (textView != null) {
            textView.post(new a(str));
        }
    }

    public void v(String str, String str2) {
    }

    public void w(String str, String str2) {
    }

    public void writeLog(String str) {
        try {
            StringBuffer stringBuffer = this.f2306h;
            stringBuffer.append(System.currentTimeMillis());
            stringBuffer.append(" pid=");
            stringBuffer.append(Process.myPid());
            stringBuffer.append(" tid=");
            stringBuffer.append(Process.myTid());
            stringBuffer.append(str);
            stringBuffer.append("\n");
            if (Thread.currentThread() != Looper.getMainLooper().getThread() || this.f2307i) {
                writeLogToDisk();
            }
            if (this.f2306h.length() > 524288) {
                StringBuffer stringBuffer2 = this.f2306h;
                stringBuffer2.delete(0, stringBuffer2.length());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void writeLogToDisk() {
        try {
            a();
            File file = f2300c;
            if (file != null) {
                LogFileUtils.writeDataToStorage(file, f2301d, f2302e, this.f2306h.toString(), true);
                StringBuffer stringBuffer = this.f2306h;
                stringBuffer.delete(0, stringBuffer.length());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
