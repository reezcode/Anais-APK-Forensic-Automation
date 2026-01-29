package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.utils.Base64;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes23.dex */
public class TbsLogReport {

    /* renamed from: a, reason: collision with root package name */
    private static TbsLogReport f1935a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f1936b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<EventType, Boolean> f1937c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f1938d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1939e = false;

    /* loaded from: classes11.dex */
    public enum EventType {
        TYPE_DOWNLOAD(0),
        TYPE_INSTALL(1),
        TYPE_LOAD(2),
        TYPE_CDN_DOWNLOAD_STAT(3),
        TYPE_COOKIE_DB_SWITCH(4),
        TYPE_PV_UPLOAD_STAT(5),
        TYPE_CORE_LOAD_PERFORMANCE(6),
        TYPE_CORE_PROTECT_RESET(7);


        /* renamed from: a, reason: collision with root package name */
        public int f1943a;

        EventType(int i5) {
            this.f1943a = i5;
        }
    }

    /* loaded from: classes6.dex */
    public static class TbsLogInfo implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public int f1944a;

        /* renamed from: b, reason: collision with root package name */
        private long f1945b;

        /* renamed from: c, reason: collision with root package name */
        private String f1946c;

        /* renamed from: d, reason: collision with root package name */
        private String f1947d;

        /* renamed from: e, reason: collision with root package name */
        private int f1948e;

        /* renamed from: f, reason: collision with root package name */
        private int f1949f;

        /* renamed from: g, reason: collision with root package name */
        private int f1950g;

        /* renamed from: h, reason: collision with root package name */
        private int f1951h;

        /* renamed from: i, reason: collision with root package name */
        private String f1952i;

        /* renamed from: j, reason: collision with root package name */
        private int f1953j;

        /* renamed from: k, reason: collision with root package name */
        private int f1954k;

        /* renamed from: l, reason: collision with root package name */
        private long f1955l;

        /* renamed from: m, reason: collision with root package name */
        private long f1956m;

        /* renamed from: n, reason: collision with root package name */
        private int f1957n;

        /* renamed from: o, reason: collision with root package name */
        private String f1958o;

        /* renamed from: p, reason: collision with root package name */
        private String f1959p;

        /* renamed from: q, reason: collision with root package name */
        private long f1960q;

        private TbsLogInfo() {
            resetArgs();
        }

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException unused) {
                return this;
            }
        }

        public int getDownFinalFlag() {
            return this.f1954k;
        }

        public void resetArgs() {
            this.f1945b = 0L;
            this.f1946c = null;
            this.f1947d = null;
            this.f1948e = 0;
            this.f1949f = 0;
            this.f1950g = 0;
            this.f1951h = 2;
            this.f1952i = EnvironmentCompat.MEDIA_UNKNOWN;
            this.f1953j = 0;
            this.f1954k = 2;
            this.f1955l = 0L;
            this.f1956m = 0L;
            this.f1957n = 1;
            this.f1944a = 0;
            this.f1958o = null;
            this.f1959p = null;
            this.f1960q = 0L;
        }

        public void setApn(String str) {
            this.f1952i = str;
        }

        public void setCheckErrorDetail(String str) {
            setErrorCode(108);
            this.f1958o = str;
        }

        public void setDownConsumeTime(long j5) {
            this.f1956m += j5;
        }

        public void setDownFinalFlag(int i5) {
            this.f1954k = i5;
        }

        public void setDownloadCancel(int i5) {
            this.f1950g = i5;
        }

        public void setDownloadSize(long j5) {
            this.f1960q += j5;
        }

        public void setDownloadUrl(String str) {
            if (this.f1946c != null) {
                str = this.f1946c + ";" + str;
            }
            this.f1946c = str;
        }

        public void setErrorCode(int i5) {
            if (i5 != 100 && i5 != 110 && i5 != 120 && i5 != 111 && i5 < 400) {
                TbsLog.i(TbsDownloader.LOGTAG, "error occured, errorCode:" + i5, true);
            }
            if (i5 == 111) {
                TbsLog.i(TbsDownloader.LOGTAG, "you are not in wifi, downloading stoped", true);
            }
            this.f1944a = i5;
        }

        public void setEventTime(long j5) {
            this.f1945b = j5;
        }

        public void setFailDetail(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                str = str.substring(0, 1024);
            }
            this.f1959p = str;
        }

        public void setFailDetail(Throwable th) {
            if (th == null) {
                this.f1959p = "";
                return;
            }
            String stackTraceString = Log.getStackTraceString(th);
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            this.f1959p = stackTraceString;
        }

        public void setHttpCode(int i5) {
            this.f1948e = i5;
        }

        public void setNetworkChange(int i5) {
            this.f1957n = i5;
        }

        public void setNetworkType(int i5) {
            this.f1953j = i5;
        }

        public void setPatchUpdateFlag(int i5) {
            this.f1949f = i5;
        }

        public void setPkgSize(long j5) {
            this.f1955l = j5;
        }

        public void setResolveIp(String str) {
            this.f1947d = str;
        }

        public void setUnpkgFlag(int i5) {
            this.f1951h = i5;
        }

        public String toString() {
            StringBuilder g5 = androidx.activity.d.g("TbsLogInfo{mEventTime=");
            g5.append(this.f1945b);
            g5.append(", mResolveIp='");
            androidx.appcompat.widget.a.n(g5, this.f1947d, '\'', ", mHttpCode=");
            g5.append(this.f1948e);
            g5.append(", mDownloadCancel=");
            g5.append(this.f1950g);
            g5.append(", mNetworkType=");
            g5.append(this.f1953j);
            g5.append(", mDownConsumeTime=");
            g5.append(this.f1956m);
            g5.append(", mErrorCode=");
            g5.append(this.f1944a);
            g5.append(", mCheckErrorDetail='");
            androidx.appcompat.widget.a.n(g5, this.f1958o, '\'', ", mFailDetail='");
            g5.append(this.f1959p);
            g5.append('\'');
            g5.append('}');
            return g5.toString();
        }
    }

    private TbsLogReport(Context context) {
        this.f1936b = null;
        this.f1938d = context.getApplicationContext();
        this.f1937c = TbsPVConfig.getInstance(context).getLogReportSwitchMap();
        this.f1936b = new Handler(TbsHandlerThread.getInstance().getLooper()) { // from class: com.tencent.smtt.sdk.TbsLogReport.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i5 = message.what;
                if (i5 != 600) {
                    if (i5 == 601) {
                        TbsLogReport.this.b();
                        return;
                    }
                    return;
                }
                Object obj = message.obj;
                if (obj instanceof TbsLogInfo) {
                    try {
                        int i6 = message.arg1;
                        TbsLogReport.this.a(i6, (TbsLogInfo) obj);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        };
    }

    private String a(int i5) {
        return i5 + "|";
    }

    private String a(long j5) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j5));
        } catch (Exception unused) {
            return null;
        }
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        return androidx.appcompat.graphics.drawable.a.c(sb, str, "|");
    }

    private JSONArray a() {
        String string = d().getString("tbs_tbslogreport_upload", null);
        if (string != null) {
            try {
                string = new String(Base64.a(string, 2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (string == null) {
            return new JSONArray();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            if (jSONArray.length() <= 5) {
                return jSONArray;
            }
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            while (true) {
                length--;
                if (length < jSONArray.length() - 5) {
                    return jSONArray2;
                }
                jSONArray2.put(jSONArray.get(length));
            }
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, TbsLogInfo tbsLogInfo) {
        Map<String, Object> map = QbSdk.f1822o;
        if (map != null && map.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.f1822o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("TbsLogReport", "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(i5));
        sb.append(a(""));
        sb.append(a(com.tencent.smtt.utils.l.a(this.f1938d)));
        sb.append(a(m.a().g(this.f1938d)));
        sb.append(a(""));
        String packageName = this.f1938d.getPackageName();
        sb.append(a(packageName));
        sb.append(TbsConfig.APP_WX.equals(packageName) ? a(com.tencent.smtt.utils.b.a(this.f1938d, TbsDownloader.TBS_METADATA)) : a(com.tencent.smtt.utils.b.b(this.f1938d)));
        sb.append(a(a(tbsLogInfo.f1945b)));
        sb.append(a(tbsLogInfo.f1946c));
        sb.append(a(tbsLogInfo.f1947d));
        sb.append(a(tbsLogInfo.f1948e));
        sb.append(a(tbsLogInfo.f1949f));
        sb.append(a(tbsLogInfo.f1950g));
        sb.append(a(tbsLogInfo.f1951h));
        sb.append(a(tbsLogInfo.f1952i));
        sb.append(a(tbsLogInfo.f1953j));
        sb.append(a(tbsLogInfo.f1954k));
        sb.append(b(tbsLogInfo.f1960q));
        sb.append(b(tbsLogInfo.f1955l));
        sb.append(b(tbsLogInfo.f1956m));
        sb.append(a(tbsLogInfo.f1957n));
        sb.append(a(tbsLogInfo.f1944a));
        sb.append(a(tbsLogInfo.f1958o));
        sb.append(a(tbsLogInfo.f1959p));
        sb.append(a(TbsDownloadConfig.getInstance(this.f1938d).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0)));
        sb.append(a(com.tencent.smtt.utils.b.g(this.f1938d)));
        sb.append(a("44286"));
        sb.append(false);
        SharedPreferences d5 = d();
        JSONArray a5 = a();
        a5.put(sb.toString());
        SharedPreferences.Editor edit = d5.edit();
        String jSONArray = a5.toString();
        try {
            jSONArray = Base64.encodeToString(jSONArray.getBytes(), 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        edit.putString("tbs_tbslogreport_upload", jSONArray);
        edit.commit();
        if (this.f1939e) {
            b();
        }
    }

    private void a(int i5, TbsLogInfo tbsLogInfo, EventType eventType) {
        tbsLogInfo.setErrorCode(i5);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        QbSdk.f1821n.onInstallFinish(i5);
        eventReport(eventType, tbsLogInfo);
    }

    private void a(int i5, String str) {
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setErrorCode(i5);
        tbsLogInfo.setEventTime(System.currentTimeMillis());
        tbsLogInfo.setFailDetail(str);
        eventReport(EventType.TYPE_LOAD, tbsLogInfo);
    }

    private String b(long j5) {
        return j5 + "|";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String str;
        String str2;
        Map<String, Object> map = QbSdk.f1822o;
        if (map != null && map.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.f1822o.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            str = "TbsLogReport";
            str2 = "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false";
        } else {
            str = TbsDownloader.LOGTAG;
            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat]");
            JSONArray a5 = a();
            if (a5 != null && a5.length() != 0) {
                TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] jsonArray:" + a5);
                try {
                    TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] response:" + com.tencent.smtt.utils.g.a(com.tencent.smtt.utils.o.a(this.f1938d).c(), a5.toString().getBytes("utf-8"), new g.a() { // from class: com.tencent.smtt.sdk.TbsLogReport.2
                        @Override // com.tencent.smtt.utils.g.a
                        public void a(int i5) {
                            TbsLog.i(TbsDownloader.LOGTAG, "[TbsApkDownloadStat.reportDownloadStat] onHttpResponseCode:" + i5);
                            if (i5 < 300) {
                                TbsLogReport.this.c();
                            }
                        }
                    }, true) + " testcase: -1");
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            str2 = "[TbsApkDownloadStat.reportDownloadStat] no data";
        }
        TbsLog.i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        SharedPreferences.Editor edit = d().edit();
        edit.remove("tbs_tbslogreport_upload");
        edit.commit();
    }

    private SharedPreferences d() {
        return this.f1938d.getSharedPreferences("tbs_event_stat", 4);
    }

    public static TbsLogReport getInstance(Context context) {
        if (f1935a == null) {
            synchronized (TbsLogReport.class) {
                if (f1935a == null) {
                    f1935a = new TbsLogReport(context);
                }
            }
        }
        return f1935a;
    }

    public void clear() {
        try {
            SharedPreferences.Editor edit = d().edit();
            edit.clear();
            edit.commit();
        } catch (Exception unused) {
        }
    }

    public void dailyReport() {
        this.f1936b.sendEmptyMessage(601);
    }

    public void eventReport(EventType eventType, TbsLogInfo tbsLogInfo) {
        TbsLog.i("TbsLogReport", "[TbsLogReport.eventRepost] " + eventType + ": " + tbsLogInfo);
        Boolean bool = this.f1937c.get(eventType);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        TbsLog.i("TbsLogReport", "[TbsLogReport.eventRepost] needReport!");
        try {
            TbsLogInfo tbsLogInfo2 = (TbsLogInfo) tbsLogInfo.clone();
            Message obtainMessage = this.f1936b.obtainMessage();
            obtainMessage.what = 600;
            obtainMessage.arg1 = eventType.f1943a;
            obtainMessage.obj = tbsLogInfo2;
            this.f1936b.sendMessage(obtainMessage);
        } catch (Throwable th) {
            StringBuilder g5 = androidx.activity.d.g("[TbsLogReport.eventReport] error, message=");
            g5.append(th.getMessage());
            TbsLog.w("TbsLogReport", g5.toString());
        }
    }

    public boolean getShouldUploadEventReport() {
        return this.f1939e;
    }

    public void setInstallErrorCode(int i5, String str) {
        setInstallErrorCode(i5, str, EventType.TYPE_INSTALL);
    }

    public void setInstallErrorCode(int i5, String str, EventType eventType) {
        if (i5 != 200 && i5 != 220 && i5 != 221) {
            TbsLog.i(TbsDownloader.LOGTAG, "error occured in installation, errorCode:" + i5, true);
        }
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setFailDetail(str);
        a(i5, tbsLogInfo, eventType);
    }

    public void setInstallErrorCode(int i5, Throwable th) {
        TbsLogInfo tbsLogInfo = tbsLogInfo();
        tbsLogInfo.setFailDetail(th);
        a(i5, tbsLogInfo, EventType.TYPE_INSTALL);
    }

    public void setLoadErrorCode(int i5, Throwable th) {
        String str;
        if (th != null) {
            StringBuilder g5 = androidx.activity.d.g("msg: ");
            g5.append(th.getMessage());
            g5.append("; err: ");
            g5.append(th);
            g5.append("; cause: ");
            g5.append(Log.getStackTraceString(th.getCause()));
            str = g5.toString();
            if (str.length() > 1024) {
                str = str.substring(0, 1024);
            }
        } else {
            str = "NULL";
        }
        a(i5, str);
    }

    public void setShouldUploadEventReport(boolean z4) {
        this.f1939e = z4;
    }

    public TbsLogInfo tbsLogInfo() {
        return new TbsLogInfo();
    }
}
