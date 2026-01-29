package w2;

import java.math.BigDecimal;

/* loaded from: classes13.dex */
public final class e extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final e f5763d = new e();

    public e() {
        super(1, new Class[]{BigDecimal.class});
    }

    @Override // d1.f
    public final Object J(v2.g gVar, Object obj, int i5) {
        try {
            return new BigDecimal((String) obj);
        } catch (IllegalArgumentException e5) {
            throw d1.c.e("Problems with column " + i5 + " parsing BigDecimal string '" + obj + "'", e5);
        }
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return ((q2.d) eVar).e(i5);
    }

    @Override // d1.f, v2.f
    public final Object e(v2.g gVar, Object obj) {
        return ((BigDecimal) obj).toString();
    }

    @Override // w2.a, v2.a
    public final int n() {
        return 255;
    }

    @Override // w2.a, v2.a
    public final boolean r() {
        return false;
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
