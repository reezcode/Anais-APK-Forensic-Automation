package d1;

import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;
import k2.q;
import kotlin.coroutines.CoroutineContext;
import m3.l;
import m3.u0;
import m3.x0;
import m3.y;
import q3.r;

/* loaded from: classes25.dex */
public final class c implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final d f2473e = new d();

    /* renamed from: f, reason: collision with root package name */
    public static volatile c f2474f = new c();

    /* renamed from: g, reason: collision with root package name */
    public static byte[] f2475g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    /* renamed from: h, reason: collision with root package name */
    public static final r f2476h = new r("CONDITION_FALSE");

    public static final y a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(u0.b.f4217b) == null) {
            coroutineContext = coroutineContext.plus(b());
        }
        return new q3.d(coroutineContext);
    }

    public static l b() {
        return new x0(null);
    }

    public static void d(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static SQLException e(String str, Throwable th) {
        SQLException sQLException = new SQLException(str);
        sQLException.initCause(th);
        return sQLException;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(java.lang.String r16, byte[] r17) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.c.f(java.lang.String, byte[]):java.lang.String");
    }

    public static Class g(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    @Override // k2.q
    public Object c() {
        return new ConcurrentHashMap();
    }
}
