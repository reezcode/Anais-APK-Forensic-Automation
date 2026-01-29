package w2;

/* loaded from: classes8.dex */
public class d0 extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f5762d = new d0();

    public d0() {
        super(8, new Class[]{Short.class});
    }

    public d0(Class[] clsArr) {
        super(8, clsArr);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return Short.valueOf(((q2.d) eVar).f4744a.getShort(i5));
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
            return (short) 1;
        }
        return Short.valueOf((short) (((Short) obj).shortValue() + 1));
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        return Short.valueOf(Short.parseShort(str));
    }
}
