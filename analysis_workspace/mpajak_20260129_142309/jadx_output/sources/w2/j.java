package w2;

/* loaded from: classes14.dex */
public class j extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final j f5774d = new j();

    public j() {
        super(6, new Class[]{Byte.class});
    }

    public j(Class[] clsArr) {
        super(6, clsArr);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return Byte.valueOf((byte) ((q2.d) eVar).f4744a.getShort(i5));
    }

    @Override // w2.a, v2.a
    public final boolean j() {
        return false;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        return Byte.valueOf(Byte.parseByte(str));
    }
}
