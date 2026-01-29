package w2;

/* loaded from: classes6.dex */
public class z extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final z f5795d = new z();

    public z() {
        super(10, new Class[]{Long.class});
    }

    public z(Class[] clsArr) {
        super(10, clsArr);
    }

    @Override // w2.a, v2.a
    public final Object a(Number number) {
        return Long.valueOf(number.longValue());
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return Long.valueOf(((q2.d) eVar).d(i5));
    }

    @Override // w2.a, v2.a
    public final boolean j() {
        return false;
    }

    @Override // w2.a, v2.a
    public final boolean l() {
        return true;
    }

    @Override // w2.a, v2.a
    public final Object o(Object obj) {
        if (obj == null) {
            return 1L;
        }
        return Long.valueOf(((Long) obj).longValue() + 1);
    }

    @Override // w2.a, v2.a
    public final boolean w() {
        return true;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        return Long.valueOf(Long.parseLong(str));
    }
}
