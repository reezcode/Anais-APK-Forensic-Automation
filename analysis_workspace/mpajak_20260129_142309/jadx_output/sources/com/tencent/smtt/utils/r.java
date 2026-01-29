package com.tencent.smtt.utils;

import android.content.Context;
import com.tencent.smtt.sdk.TbsLogReport;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static r f2458a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2460c = false;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Long> f2459b = new HashMap();

    private r() {
    }

    public static r a() {
        if (f2458a == null) {
            synchronized (TbsLogReport.class) {
                if (f2458a == null) {
                    f2458a = new r();
                }
            }
        }
        return f2458a;
    }

    private boolean a(long j5) {
        return j5 <= 100000 && j5 > 0;
    }

    private long b(String str) {
        Long l5 = this.f2459b.get(str);
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }

    public void a(Context context) {
        if (this.f2460c) {
            return;
        }
        TbsLog.i("TbsTimeRecorder", b());
        this.f2460c = true;
        TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
        tbsLogReport.eventReport(TbsLogReport.EventType.TYPE_CORE_LOAD_PERFORMANCE, tbsLogReport.tbsLogInfo());
    }

    public void a(String str) {
        this.f2459b.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public String b() {
        long b5 = b("init_tbs_end") - b("init_tbs_Start");
        long b6 = b("preinit_finish") - b("preinit_start");
        long b7 = b("create_webview_end") - b("create_webview_start");
        long b8 = b("core_load_end") - b("core_load_start");
        StringBuilder e5 = androidx.activity.result.a.e("", "initX5Environment: ");
        if (!a(b5)) {
            b5 = -1;
        }
        e5.append(b5);
        e5.append(",");
        StringBuilder e6 = androidx.activity.result.a.e(e5.toString(), "preInit: ");
        if (!a(b6)) {
            b6 = -1;
        }
        e6.append(b6);
        e6.append(",");
        StringBuilder e7 = androidx.activity.result.a.e(e6.toString(), "webview: ");
        if (!a(b7)) {
            b7 = -1;
        }
        e7.append(b7);
        e7.append(",");
        StringBuilder e8 = androidx.activity.result.a.e(e7.toString(), "coreLoadCost: ");
        if (!a(b8)) {
            b8 = -1;
        }
        e8.append(b8);
        return e8.toString();
    }
}
