package com.tencent.smtt.sdk;

import androidx.core.os.EnvironmentCompat;

/* loaded from: classes11.dex */
public class TbsWebViewPerformanceRecorder {

    /* renamed from: a, reason: collision with root package name */
    private long f2002a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f2003b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f2004c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f2005d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f2006e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f2007f = EnvironmentCompat.MEDIA_UNKNOWN;

    public void a(long j5) {
        this.f2002a = j5;
    }

    public void a(long j5, String str) {
        this.f2005d += j5;
        this.f2004c++;
        this.f2006e = j5;
        this.f2007f = str;
    }

    public void b(long j5) {
        this.f2003b = j5;
    }

    public long getAverageUrlLoadTime() {
        long j5 = this.f2004c;
        if (j5 == 0) {
            return 0L;
        }
        return this.f2005d / j5;
    }

    public long getConstructTime() {
        return this.f2002a;
    }

    public long getCoreInitTime() {
        return this.f2003b;
    }

    public String getCurrentUrl() {
        return this.f2007f;
    }

    public long getCurrentUrlLoadTime() {
        return this.f2006e;
    }

    public String getLog() {
        StringBuilder g5 = androidx.activity.d.g("TbsWebViewPerformanceRecorder{constructTime=");
        g5.append(this.f2002a);
        g5.append(", coreInitTime=");
        g5.append(this.f2003b);
        g5.append(", currentUrlLoadTime=");
        g5.append(this.f2006e);
        g5.append(", currentUrl='");
        g5.append(this.f2007f);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
