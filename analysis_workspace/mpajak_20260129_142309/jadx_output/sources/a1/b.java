package a1;

import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("SdkFlagFactory.class")
    public static b f28a;

    public static synchronized b b() {
        b bVar;
        synchronized (b.class) {
            if (f28a == null) {
                f28a = new b();
            }
            bVar = f28a;
        }
        return bVar;
    }

    public final g3.a a() {
        return new g3.a(Boolean.TRUE, null);
    }
}
