package w2;

import java.util.UUID;

/* loaded from: classes25.dex */
public final class j0 extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f5775d = new j0();

    public j0() {
        super(1, new Class[]{UUID.class});
    }

    @Override // d1.f
    public final Object J(v2.g gVar, Object obj, int i5) {
        String str = (String) obj;
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException e5) {
            throw d1.c.e("Problems with column " + i5 + " parsing UUID-string '" + str + "'", e5);
        }
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return ((q2.d) eVar).e(i5);
    }

    @Override // d1.f, v2.f
    public final Object e(v2.g gVar, Object obj) {
        return ((UUID) obj).toString();
    }

    @Override // w2.a, v2.a
    public final int n() {
        return 48;
    }

    @Override // w2.a, v2.a
    public final Object q() {
        return UUID.randomUUID();
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException e5) {
            throw d1.c.e("Problems with field " + gVar + " parsing default UUID-string '" + str + "'", e5);
        }
    }
}
