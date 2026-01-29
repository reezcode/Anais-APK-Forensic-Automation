package com.tencent.smtt.sdk;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class CacheManager {
    @Deprecated
    public static boolean cacheDisabled() {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            return ((Boolean) a5.c().c()).booleanValue();
        }
        Object a6 = com.tencent.smtt.utils.j.a("android.webkit.CacheManager", "cacheDisabled");
        if (a6 == null) {
            return false;
        }
        return ((Boolean) a6).booleanValue();
    }

    public static InputStream getCacheFile(String str, boolean z4) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            return null;
        }
        return a5.c().a(str, z4);
    }

    public static Object getCacheFile(String str, Map<String, String> map) {
        u a5 = u.a();
        if (a5 != null && a5.b()) {
            return a5.c().g();
        }
        try {
            return com.tencent.smtt.utils.j.a(Class.forName("android.webkit.CacheManager"), "getCacheFile", (Class<?>[]) new Class[]{String.class, Map.class}, str, map);
        } catch (Exception unused) {
            return null;
        }
    }

    @Deprecated
    public static File getCacheFileBaseDir() {
        u a5 = u.a();
        return (File) ((a5 == null || !a5.b()) ? com.tencent.smtt.utils.j.a("android.webkit.CacheManager", "getCacheFileBaseDir") : a5.c().g());
    }
}
