package w2;

import java.sql.SQLException;

/* loaded from: classes24.dex */
public final class i extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final i f5772d = new i();

    public i() {
        super(7, new Class[0]);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return ((q2.d) eVar).c(i5);
    }

    @Override // w2.a, v2.a
    public final Class<?> h() {
        return byte[].class;
    }

    @Override // w2.a, v2.a
    public final boolean r() {
        return false;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        throw new SQLException("byte[] type cannot have default values");
    }
}
