package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import com.tencent.smtt.sdk.TbsHandlerThread;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;

/* loaded from: classes19.dex */
public class TbsLog {
    public static final int MSG_PV_REPORT = 501;
    public static final String X5LOGTAG = "x5logtag";

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2296a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f2297b;

    /* renamed from: c, reason: collision with root package name */
    private static TbsLogClient f2298c;

    public static void d(String str, String str2) {
        d(str, "", str2);
    }

    public static void d(String str, String str2, String str3) {
    }

    public static void d(String str, String str2, boolean z4) {
        d(str, str2);
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient != null && f2296a && z4) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void e(String str, String str2) {
        e(str, "", str2);
    }

    public static void e(String str, String str2, String str3) {
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.e(str, "TBS:" + str2 + " " + str3);
        f2298c.writeLog("(E)-" + str + "-TBS:" + str2 + " " + str3);
    }

    public static void e(String str, String str2, boolean z4) {
        e(str, str2);
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient != null && f2296a && z4) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static String getTbsLogFilePath() {
        File file = TbsLogClient.f2300c;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static Handler getTbsLogHandler() {
        return f2297b;
    }

    public static void i(String str, String str2) {
        i(str, "", str2);
    }

    public static void i(String str, String str2, String str3) {
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.i(str, "TBS:" + str2 + " " + str3);
        f2298c.writeLog("(I)-" + str + "-TBS:" + str2 + " " + str3);
    }

    public static void i(String str, String str2, boolean z4) {
        i(str, str2);
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient != null && f2296a && z4) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void i(Throwable th) {
        i("handle_throwable", Log.getStackTraceString(th));
    }

    public static synchronized void initIfNeed(Context context) {
        synchronized (TbsLog.class) {
            if (f2298c == null) {
                setTbsLogClient(new TbsLogClient(context));
            }
            if (f2297b == null) {
                f2297b = new Handler(TbsHandlerThread.getInstance().getLooper()) { // from class: com.tencent.smtt.utils.TbsLog.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        int i5 = message.what;
                        if (i5 == 500) {
                            if (TbsLog.f2298c != null) {
                                TbsLog.f2298c.writeLogToDisk();
                            }
                        } else if (i5 == 501) {
                            Object obj = message.obj;
                            if (obj instanceof Runnable) {
                                ((Runnable) obj).run();
                            }
                        }
                    }
                };
            }
        }
    }

    public static void setLogView(TextView textView) {
        TbsLogClient tbsLogClient;
        if (textView == null || (tbsLogClient = f2298c) == null) {
            return;
        }
        tbsLogClient.setLogView(textView);
    }

    public static boolean setTbsLogClient(TbsLogClient tbsLogClient) {
        if (tbsLogClient == null) {
            return false;
        }
        f2298c = tbsLogClient;
        return true;
    }

    @Deprecated
    public static void setWriteLogJIT(boolean z4) {
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.setWriteLogJIT(z4);
    }

    public static void v(String str, String str2) {
        v(str, "", str2);
    }

    public static void v(String str, String str2, String str3) {
    }

    public static void v(String str, String str2, boolean z4) {
        v(str, str2);
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient != null && f2296a && z4) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static void w(String str, String str2) {
        w(str, "", str2);
    }

    public static void w(String str, String str2, String str3) {
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.w(str, "TBS:" + str2 + " " + str3);
        f2298c.writeLog("(W)-" + str + "-TBS:" + str2 + " " + str3);
    }

    public static void w(String str, String str2, boolean z4) {
        w(str, str2);
        TbsLogClient tbsLogClient = f2298c;
        if (tbsLogClient != null && f2296a && z4) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    public static synchronized void writeLogToDisk() {
        Handler handler;
        synchronized (TbsLog.class) {
            if (f2298c != null && (handler = f2297b) != null) {
                handler.obtainMessage(TbsListener.ErrorCode.INFO_CODE_MINIQB).sendToTarget();
            }
        }
    }
}
