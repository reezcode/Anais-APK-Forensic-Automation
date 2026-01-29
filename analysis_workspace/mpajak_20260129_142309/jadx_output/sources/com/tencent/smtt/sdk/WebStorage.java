package com.tencent.smtt.sdk;

import java.util.Map;

/* loaded from: classes5.dex */
public class WebStorage {

    /* renamed from: a, reason: collision with root package name */
    private static WebStorage f2032a;

    @Deprecated
    /* loaded from: classes15.dex */
    public interface QuotaUpdater {
        void updateQuota(long j5);
    }

    private static synchronized WebStorage a() {
        WebStorage webStorage;
        synchronized (WebStorage.class) {
            if (f2032a == null) {
                f2032a = new WebStorage();
            }
            webStorage = f2032a;
        }
        return webStorage;
    }

    public static WebStorage getInstance() {
        return a();
    }

    public void deleteAllData() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebStorage.getInstance().deleteAllData();
        } else {
            a5.c().n();
        }
    }

    public void deleteOrigin(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebStorage.getInstance().deleteOrigin(str);
        } else {
            a5.c().e(str);
        }
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebStorage.getInstance().getOrigins(valueCallback);
        } else {
            a5.c().a(valueCallback);
        }
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebStorage.getInstance().getQuotaForOrigin(str, valueCallback);
        } else {
            a5.c().b(str, valueCallback);
        }
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebStorage.getInstance().getUsageForOrigin(str, valueCallback);
        } else {
            a5.c().a(str, valueCallback);
        }
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j5) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebStorage.getInstance().setQuotaForOrigin(str, j5);
        } else {
            a5.c().a(str, j5);
        }
    }
}
