package com.tencent.smtt.sdk;

import android.content.Context;

/* loaded from: classes11.dex */
public class WebViewDatabase {

    /* renamed from: a, reason: collision with root package name */
    private static WebViewDatabase f2073a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2074b;

    public WebViewDatabase(Context context) {
        this.f2074b = context;
    }

    private static synchronized WebViewDatabase a(Context context) {
        WebViewDatabase webViewDatabase;
        synchronized (WebViewDatabase.class) {
            if (f2073a == null) {
                f2073a = new WebViewDatabase(context);
            }
            webViewDatabase = f2073a;
        }
        return webViewDatabase;
    }

    public static WebViewDatabase getInstance(Context context) {
        return a(context);
    }

    public void clearFormData() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebViewDatabase.getInstance(this.f2074b).clearFormData();
        } else {
            a5.c().g(this.f2074b);
        }
    }

    public void clearHttpAuthUsernamePassword() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebViewDatabase.getInstance(this.f2074b).clearHttpAuthUsernamePassword();
        } else {
            a5.c().e(this.f2074b);
        }
    }

    @Deprecated
    public void clearUsernamePassword() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebViewDatabase.getInstance(this.f2074b).clearUsernamePassword();
        } else {
            a5.c().c(this.f2074b);
        }
    }

    public boolean hasFormData() {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.WebViewDatabase.getInstance(this.f2074b).hasFormData() : a5.c().f(this.f2074b);
    }

    public boolean hasHttpAuthUsernamePassword() {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.WebViewDatabase.getInstance(this.f2074b).hasHttpAuthUsernamePassword() : a5.c().d(this.f2074b);
    }

    @Deprecated
    public boolean hasUsernamePassword() {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.WebViewDatabase.getInstance(this.f2074b).hasUsernamePassword() : a5.c().b(this.f2074b);
    }
}
