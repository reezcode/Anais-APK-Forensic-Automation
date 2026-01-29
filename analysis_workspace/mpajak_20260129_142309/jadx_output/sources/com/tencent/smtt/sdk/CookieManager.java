package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes21.dex */
public class CookieManager {
    public static String LOGTAG = "CookieManager";

    /* renamed from: c, reason: collision with root package name */
    private static CookieManager f1763c;

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<b> f1764a;

    /* renamed from: b, reason: collision with root package name */
    public a f1765b = a.MODE_NONE;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1766d = false;

    /* loaded from: classes4.dex */
    public enum a {
        MODE_NONE,
        MODE_KEYS,
        MODE_ALL
    }

    /* loaded from: classes11.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1771a;

        /* renamed from: b, reason: collision with root package name */
        public String f1772b;

        /* renamed from: c, reason: collision with root package name */
        public String f1773c;

        /* renamed from: d, reason: collision with root package name */
        public ValueCallback<Boolean> f1774d;

        public b() {
        }
    }

    private CookieManager() {
    }

    public static boolean checkSysCoreNotExist() {
        SystemCoreProtector e5 = QbSdk.e();
        if (e5 == null) {
            return false;
        }
        try {
            android.webkit.CookieManager.getInstance();
            return false;
        } catch (Exception e6) {
            e5.onCookieManagerException(e6);
            return true;
        }
    }

    public static CookieManager getInstance() {
        if (f1763c == null) {
            synchronized (CookieManager.class) {
                if (f1763c == null) {
                    f1763c = new CookieManager();
                }
            }
        }
        return f1763c;
    }

    public static int getROMCookieDBVersion(Context context) {
        return context.getSharedPreferences("cookiedb_info", 4).getInt("db_version", -1);
    }

    public static void setROMCookieDBVersion(Context context, int i5) {
        SharedPreferences.Editor edit = context.getSharedPreferences("cookiedb_info", 4).edit();
        edit.putInt("db_version", i5);
        edit.commit();
    }

    public synchronized void a() {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f1764a;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            u a5 = u.a();
            if (a5 == null || !a5.b()) {
                Iterator<b> it = this.f1764a.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    int i5 = next.f1771a;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            if (checkSysCoreNotExist()) {
                                return;
                            } else {
                                android.webkit.CookieManager.getInstance().setCookie(next.f1772b, next.f1773c);
                            }
                        }
                    } else if (checkSysCoreNotExist()) {
                        return;
                    } else {
                        com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "setCookie", (Class<?>[]) new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, next.f1772b, next.f1773c, next.f1774d);
                    }
                }
            } else {
                Iterator<b> it2 = this.f1764a.iterator();
                while (it2.hasNext()) {
                    b next2 = it2.next();
                    int i6 = next2.f1771a;
                    if (i6 == 1) {
                        setCookie(next2.f1772b, next2.f1773c, next2.f1774d);
                    } else if (i6 == 2) {
                        setCookie(next2.f1772b, next2.f1773c);
                    }
                }
            }
            this.f1764a.clear();
        }
    }

    public boolean acceptCookie() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            return a5.c().d();
        }
        if (checkSysCoreNotExist()) {
            return false;
        }
        return android.webkit.CookieManager.getInstance().acceptCookie();
    }

    public synchronized boolean acceptThirdPartyCookies(WebView webView) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            Object invokeStaticMethod = a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptThirdPartyCookies", new Class[]{Object.class}, webView.getView());
            if (invokeStaticMethod == null) {
                return true;
            }
            return ((Boolean) invokeStaticMethod).booleanValue();
        }
        if (checkSysCoreNotExist()) {
            return false;
        }
        Object a6 = com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "acceptThirdPartyCookies", (Class<?>[]) new Class[]{android.webkit.WebView.class}, webView.getView());
        if (a6 == null) {
            return false;
        }
        return ((Boolean) a6).booleanValue();
    }

    public void flush() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_flush", new Class[0], new Object[0]);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "flush", (Class<?>[]) new Class[0], new Object[0]);
        }
    }

    public String getCookie(String str) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            return a5.c().a(str);
        }
        if (checkSysCoreNotExist()) {
            return null;
        }
        try {
            return android.webkit.CookieManager.getInstance().getCookie(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public boolean hasCookies() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            return a5.c().h();
        }
        if (checkSysCoreNotExist()) {
            return false;
        }
        return android.webkit.CookieManager.getInstance().hasCookies();
    }

    @Deprecated
    public void removeAllCookie() {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f1764a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().e();
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            android.webkit.CookieManager.getInstance().removeAllCookie();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f1764a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "removeAllCookies", (Class<?>[]) new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    @Deprecated
    public void removeExpiredCookie() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeExpiredCookie", new Class[0], new Object[0]);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            android.webkit.CookieManager.getInstance().removeExpiredCookie();
        }
    }

    @Deprecated
    public void removeSessionCookie() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookie", new Class[0], new Object[0]);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            android.webkit.CookieManager.getInstance().removeSessionCookie();
        }
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else {
            if (checkSysCoreNotExist()) {
                return;
            }
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "removeSessionCookies", (Class<?>[]) new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    public synchronized void setAcceptCookie(boolean z4) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            try {
                if (checkSysCoreNotExist()) {
                } else {
                    android.webkit.CookieManager.getInstance().setAcceptCookie(z4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptCookie", new Class[]{Boolean.TYPE}, Boolean.valueOf(z4));
        }
    }

    public synchronized void setAcceptThirdPartyCookies(WebView webView, boolean z4) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptThirdPartyCookies", new Class[]{Object.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z4));
        } else if (checkSysCoreNotExist()) {
        } else {
            com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "setAcceptThirdPartyCookies", (Class<?>[]) new Class[]{android.webkit.WebView.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z4));
        }
    }

    public synchronized void setCookie(String str, String str2) {
        setCookie(str, str2, false);
    }

    public synchronized void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            if (!a5.d()) {
                b bVar = new b();
                bVar.f1771a = 1;
                bVar.f1772b = str;
                bVar.f1773c = str2;
                bVar.f1774d = valueCallback;
                if (this.f1764a == null) {
                    this.f1764a = new CopyOnWriteArrayList<>();
                }
                this.f1764a.add(bVar);
            }
            if (checkSysCoreNotExist()) {
            } else {
                com.tencent.smtt.utils.j.a(android.webkit.CookieManager.getInstance(), "setCookie", (Class<?>[]) new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
            }
        } else {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
        }
    }

    public synchronized void setCookie(String str, String str2, boolean z4) {
        android.webkit.CookieManager cookieManager;
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            a5.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class}, str, str2);
            if (WebView.hasCreatedSysWebViewInstance()) {
                if (checkSysCoreNotExist()) {
                    return;
                } else {
                    cookieManager = android.webkit.CookieManager.getInstance();
                }
            }
        }
        if (!u.a().d()) {
            b bVar = new b();
            bVar.f1771a = 2;
            bVar.f1772b = str;
            bVar.f1773c = str2;
            bVar.f1774d = null;
            if (this.f1764a == null) {
                this.f1764a = new CopyOnWriteArrayList<>();
            }
            this.f1764a.add(bVar);
        }
        if (checkSysCoreNotExist()) {
            return;
        } else {
            cookieManager = android.webkit.CookieManager.getInstance();
        }
        cookieManager.setCookie(str, str2);
    }

    public void setCookies(Map<String, String[]> map) {
        u a5 = u.a();
        if ((a5 == null || !a5.b()) ? false : a5.c().a(map)) {
            return;
        }
        for (String str : map.keySet()) {
            for (String str2 : map.get(str)) {
                setCookie(str, str2);
            }
        }
    }
}
