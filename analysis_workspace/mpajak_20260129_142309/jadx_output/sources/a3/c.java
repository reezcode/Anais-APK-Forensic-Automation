package a3;

import java.sql.SQLException;
import java.util.Objects;
import x2.b;

/* loaded from: classes5.dex */
public final class c<T, ID> extends b<T, ID> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f74i = 0;

    /* renamed from: g, reason: collision with root package name */
    public String f75g;

    /* renamed from: h, reason: collision with root package name */
    public int f76h;

    /* loaded from: classes23.dex */
    public static class a implements c3.f {

        /* renamed from: a, reason: collision with root package name */
        public Number f77a;

        public final void a(Number number) {
            if (this.f77a == null) {
                this.f77a = number;
                return;
            }
            StringBuilder g5 = androidx.activity.d.g("generated key has already been set to ");
            g5.append(this.f77a);
            g5.append(", now set to ");
            g5.append(number);
            throw new SQLException(g5.toString());
        }
    }

    public c(d3.c<T, ID> cVar, String str, v2.g[] gVarArr, String str2, int i5) {
        super(cVar, str, gVarArr);
        this.f75g = cVar.f2494b.getSimpleName();
        this.f76h = i5;
    }

    public static boolean g(u2.c cVar, v2.g gVar) {
        v2.e eVar = gVar.f5681e;
        if (eVar.F || eVar.E) {
            return false;
        }
        Objects.requireNonNull(cVar);
        return !gVar.f5683g || gVar.n() || gVar.f5681e.f5675z;
    }

    public final void f(Object obj, Number number, String str) {
        v2.g gVar = this.f71c;
        Object a5 = gVar.f5688l.a(number);
        if (a5 == null) {
            StringBuilder g5 = androidx.activity.d.g("Invalid class ");
            g5.append(gVar.f5688l);
            g5.append(" for sequence-id ");
            g5.append(gVar);
            throw new SQLException(g5.toString());
        }
        gVar.b(obj, a5, false, null);
        x2.c cVar = b.f68f;
        b.a aVar = b.a.DEBUG;
        if (cVar.f5927a.b(aVar)) {
            x2.c cVar2 = b.f68f;
            Object[] objArr = {number, str, this.f71c.g(), this.f75g};
            Object obj2 = x2.c.f5926b;
            cVar2.f(aVar, null, "assigned id '{}' from {} to '{}' in {} object", obj2, obj2, obj2, objArr);
        }
    }
}
