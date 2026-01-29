package x0;

import android.content.Context;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f5907b = new b();

    /* renamed from: a, reason: collision with root package name */
    public a f5908a = null;

    public static a a(Context context) {
        a aVar;
        b bVar = f5907b;
        synchronized (bVar) {
            if (bVar.f5908a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.f5908a = new a(context);
            }
            aVar = bVar.f5908a;
        }
        return aVar;
    }
}
