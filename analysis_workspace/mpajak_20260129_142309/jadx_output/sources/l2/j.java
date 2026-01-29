package l2;

import i2.w;
import i2.x;
import i2.z;

/* loaded from: classes18.dex */
public final class j extends z<Number> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f3980b = new i(new j(w.f3307c));

    /* renamed from: a, reason: collision with root package name */
    public final x f3981a;

    public j(x xVar) {
        this.f3981a = xVar;
    }

    @Override // i2.z
    public final Number a(p2.a aVar) {
        int N = aVar.N();
        int a5 = f.h.a(N);
        if (a5 == 5 || a5 == 6) {
            return this.f3981a.a(aVar);
        }
        if (a5 == 8) {
            aVar.I();
            return null;
        }
        StringBuilder g5 = androidx.activity.d.g("Expecting number, got: ");
        g5.append(androidx.activity.result.a.j(N));
        g5.append("; at path ");
        g5.append(aVar.getPath());
        throw new i2.u(g5.toString());
    }

    @Override // i2.z
    public final void b(p2.b bVar, Number number) {
        bVar.A(number);
    }
}
