package com.tencent.smtt.sdk;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.webkit.WebIconDatabase;
import com.tencent.smtt.export.external.interfaces.IconListener;

@Deprecated
/* loaded from: classes14.dex */
public class WebIconDatabase {

    /* renamed from: a, reason: collision with root package name */
    private static WebIconDatabase f2024a;

    @Deprecated
    /* loaded from: classes13.dex */
    public interface a {
        void a(String str, Bitmap bitmap);
    }

    private WebIconDatabase() {
    }

    private static synchronized WebIconDatabase a() {
        WebIconDatabase webIconDatabase;
        synchronized (WebIconDatabase.class) {
            if (f2024a == null) {
                f2024a = new WebIconDatabase();
            }
            webIconDatabase = f2024a;
        }
        return webIconDatabase;
    }

    public static WebIconDatabase getInstance() {
        return a();
    }

    public void bulkRequestIconForPageUrl(ContentResolver contentResolver, String str, a aVar) {
    }

    public void close() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebIconDatabase.getInstance().close();
        } else {
            a5.c().m();
        }
    }

    public void open(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebIconDatabase.getInstance().open(str);
        } else {
            a5.c().b(str);
        }
    }

    public void releaseIconForPageUrl(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebIconDatabase.getInstance().releaseIconForPageUrl(str);
        } else {
            a5.c().d(str);
        }
    }

    public void removeAllIcons() {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
        } else {
            a5.c().l();
        }
    }

    public void requestIconForPageUrl(String str, final a aVar) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebIconDatabase.getInstance().requestIconForPageUrl(str, new WebIconDatabase.IconListener() { // from class: com.tencent.smtt.sdk.WebIconDatabase.2
                @Override // android.webkit.WebIconDatabase.IconListener
                public void onReceivedIcon(String str2, Bitmap bitmap) {
                    aVar.a(str2, bitmap);
                }
            });
        } else {
            a5.c().a(str, new IconListener() { // from class: com.tencent.smtt.sdk.WebIconDatabase.1
                @Override // com.tencent.smtt.export.external.interfaces.IconListener
                public void onReceivedIcon(String str2, Bitmap bitmap) {
                    aVar.a(str2, bitmap);
                }
            });
        }
    }

    public void retainIconForPageUrl(String str) {
        u a5 = u.a();
        if (a5 == null || !a5.b()) {
            android.webkit.WebIconDatabase.getInstance().retainIconForPageUrl(str);
        } else {
            a5.c().c(str);
        }
    }
}
