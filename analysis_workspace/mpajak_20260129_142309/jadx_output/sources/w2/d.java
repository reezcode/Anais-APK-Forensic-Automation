package w2;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f5761d = new d();

    public d() {
        super(15, new Class[0]);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        Objects.requireNonNull((q2.d) eVar);
        throw new SQLException("Android does not support BigDecimal type.  Use BIG_DECIMAL or BIG_DECIMAL_STRING types");
    }

    @Override // w2.a, v2.a
    public final Class<?> h() {
        return BigDecimal.class;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        try {
            return new BigDecimal(str);
        } catch (IllegalArgumentException e5) {
            throw d1.c.e("Problems with field " + gVar + " parsing default BigDecimal string '" + str + "'", e5);
        }
    }
}
