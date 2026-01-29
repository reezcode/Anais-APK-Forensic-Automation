package w2;

/* loaded from: classes3.dex */
public class g extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final g f5768d = new g();

    public g() {
        super(4, new Class[]{Boolean.class});
    }

    public g(Class[] clsArr) {
        super(4, clsArr);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        q2.d dVar = (q2.d) eVar;
        return Boolean.valueOf((dVar.f4744a.isNull(i5) || dVar.f4744a.getShort(i5) == 0) ? false : true);
    }

    @Override // w2.a, v2.a
    public final boolean j() {
        return false;
    }

    @Override // w2.a, v2.a
    public final boolean r() {
        return false;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }
}
