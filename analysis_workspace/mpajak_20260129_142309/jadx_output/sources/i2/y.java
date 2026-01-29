package i2;

/* loaded from: classes9.dex */
public final class y extends z<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f3311a;

    public y(z zVar) {
        this.f3311a = zVar;
    }

    @Override // i2.z
    public final Object a(p2.a aVar) {
        if (aVar.N() != 9) {
            return this.f3311a.a(aVar);
        }
        aVar.I();
        return null;
    }

    @Override // i2.z
    public final void b(p2.b bVar, Object obj) {
        if (obj == null) {
            bVar.q();
        } else {
            this.f3311a.b(bVar, obj);
        }
    }
}
