package com.tencent.smtt.sdk;

import java.util.Set;

/* loaded from: classes19.dex */
public class GeolocationPermissions {

    /* renamed from: a, reason: collision with root package name */
    private static GeolocationPermissions f1781a;

    private static synchronized GeolocationPermissions a() {
        GeolocationPermissions geolocationPermissions;
        synchronized (GeolocationPermissions.class) {
            if (f1781a == null) {
                f1781a = new GeolocationPermissions();
            }
            geolocationPermissions = f1781a;
        }
        return geolocationPermissions;
    }

    public static GeolocationPermissions getInstance() {
        return a();
    }

    public void allow(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.GeolocationPermissions.getInstance().allow(str);
        } else {
            a5.c().g(str);
        }
    }

    public void clear(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.GeolocationPermissions.getInstance().clear(str);
        } else {
            a5.c().f(str);
        }
    }

    public void clearAll() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.GeolocationPermissions.getInstance().clearAll();
        } else {
            a5.c().o();
        }
    }

    public void getAllowed(String str, ValueCallback<Boolean> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.GeolocationPermissions.getInstance().getAllowed(str, valueCallback);
        } else {
            a5.c().c(str, valueCallback);
        }
    }

    public void getOrigins(ValueCallback<Set<String>> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.GeolocationPermissions.getInstance().getOrigins(valueCallback);
        } else {
            a5.c().b(valueCallback);
        }
    }
}
