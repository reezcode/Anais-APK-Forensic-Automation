package w2;

/* loaded from: classes21.dex */
public class y extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final y f5794d = new y();

    public y() {
        super(9, new Class[]{Integer.class});
    }

    public y(Class[] clsArr) {
        super(9, clsArr);
    }

    @Override // w2.a, v2.a
    public final Object a(Number number) {
        return Integer.valueOf(number.intValue());
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return Integer.valueOf(((q2.d) eVar).f4744a.getInt(i5));
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
            return 1;
        }
        return Integer.valueOf(((Integer) obj).intValue() + 1);
    }

    @Override // w2.a, v2.a
    public final boolean w() {
        return true;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }
}
