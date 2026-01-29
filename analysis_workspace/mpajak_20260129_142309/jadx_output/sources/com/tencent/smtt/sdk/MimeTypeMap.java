package com.tencent.smtt.sdk;

/* loaded from: classes8.dex */
public class MimeTypeMap {

    /* renamed from: a, reason: collision with root package name */
    private static MimeTypeMap f1800a;

    private MimeTypeMap() {
    }

    public static String getFileExtensionFromUrl(String str) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.MimeTypeMap.getFileExtensionFromUrl(str) : a5.c().h(str);
    }

    public static synchronized MimeTypeMap getSingleton() {
        MimeTypeMap mimeTypeMap;
        synchronized (MimeTypeMap.class) {
            if (f1800a == null) {
                f1800a = new MimeTypeMap();
            }
            mimeTypeMap = f1800a;
        }
        return mimeTypeMap;
    }

    public String getExtensionFromMimeType(String str) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str) : a5.c().l(str);
    }

    public String getMimeTypeFromExtension(String str) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str) : a5.c().j(str);
    }

    public boolean hasExtension(String str) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.MimeTypeMap.getSingleton().hasExtension(str) : a5.c().k(str);
    }

    public boolean hasMimeType(String str) {
        u a5 = u.a();
        return (a5 == null || !a5.b()) ? android.webkit.MimeTypeMap.getSingleton().hasMimeType(str) : a5.c().i(str);
    }
}
