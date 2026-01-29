package t2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import t2.g;

/* loaded from: classes16.dex */
public abstract class a<T, ID> implements g<T, ID> {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal<List<a<?, ?>>> f5422j = new C0068a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f5423b;

    /* renamed from: c, reason: collision with root package name */
    public z2.l<T, ID> f5424c;

    /* renamed from: d, reason: collision with root package name */
    public u2.d f5425d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<T> f5426e;

    /* renamed from: f, reason: collision with root package name */
    public d3.b<T> f5427f;

    /* renamed from: g, reason: collision with root package name */
    public d3.c<T, ID> f5428g;

    /* renamed from: h, reason: collision with root package name */
    public c3.c f5429h;

    /* renamed from: i, reason: collision with root package name */
    public f<T> f5430i;

    /* renamed from: t2.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0068a extends ThreadLocal<List<a<?, ?>>> {
        @Override // java.lang.ThreadLocal
        public final List<a<?, ?>> initialValue() {
            return new ArrayList(10);
        }
    }

    public a(c3.c cVar, Class<T> cls, d3.b<T> bVar) {
        this.f5426e = cls;
        this.f5427f = bVar;
        if (cVar != null) {
            this.f5429h = cVar;
            if (this.f5423b) {
                return;
            }
            u2.d dVar = ((q2.b) cVar).f4739d;
            this.f5425d = dVar;
            if (dVar == null) {
                StringBuilder g5 = androidx.activity.d.g("connectionSource is getting a null DatabaseType in ");
                g5.append(getClass().getSimpleName());
                throw new IllegalStateException(g5.toString());
            }
            if (bVar == null) {
                this.f5428g = new d3.c<>(cVar, this, cls);
            } else {
                bVar.a(cVar);
                this.f5428g = new d3.c<>(this, this.f5427f);
            }
            this.f5424c = new z2.l<>(this.f5425d, this.f5428g, this);
            List<a<?, ?>> list = f5422j.get();
            list.add(this);
            if (list.size() > 1) {
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                try {
                    a<?, ?> aVar = list.get(i5);
                    h.d(this.f5429h, aVar);
                    try {
                        for (v2.g gVar : aVar.f5428g.f2496d) {
                            gVar.c(this.f5429h, aVar.f5426e);
                        }
                        aVar.f5423b = true;
                    } catch (SQLException e5) {
                        h.e(this.f5429h, aVar);
                        throw e5;
                    }
                } finally {
                    list.clear();
                    f5422j.remove();
                }
            }
        }
    }

    @Override // t2.g
    public final Class<T> a() {
        return this.f5426e;
    }

    @Override // t2.g
    public final z2.h<T, ID> c() {
        l();
        return new z2.h<>(this.f5425d, this.f5428g, this);
    }

    @Override // t2.g
    public final int d(T t4) {
        l();
        if (t4 == null) {
            return 0;
        }
        try {
            return this.f5424c.i(((q2.b) this.f5429h).c(), t4, null);
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    @Override // t2.g
    public final T e(ID id) {
        l();
        c3.d c5 = ((q2.b) this.f5429h).c();
        try {
            z2.l<T, ID> lVar = this.f5424c;
            if (lVar.f6151d == null) {
                lVar.f6151d = a3.f.f(lVar.f6148a, lVar.f6149b, null);
            }
            return lVar.f6151d.g(c5, id, null);
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    @Override // t2.g
    public final long f() {
        l();
        try {
            return this.f5424c.f(((q2.b) this.f5429h).c());
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    @Override // t2.g
    public final boolean g(ID id) {
        try {
            return this.f5424c.e(((q2.b) this.f5429h).c(), id);
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    @Override // t2.g
    public final z2.c<T, ID> h() {
        l();
        return new z2.c<>(this.f5425d, this.f5428g, this);
    }

    @Override // t2.g
    public final long i(z2.f<T> fVar) {
        l();
        if (((a3.e) fVar).f81m == 2) {
            try {
                return this.f5424c.h(((q2.b) this.f5429h).c(), fVar);
            } finally {
                Objects.requireNonNull(this.f5429h);
            }
        }
        StringBuilder g5 = androidx.activity.d.g("Prepared query is not of type ");
        g5.append(androidx.appcompat.widget.a.o(2));
        g5.append(", did you call QueryBuilder.setCountOf(true)?");
        throw new IllegalArgumentException(g5.toString());
    }

    @Override // t2.g
    public final T j(z2.f<T> fVar) {
        l();
        try {
            return (T) this.f5424c.g(((q2.b) this.f5429h).c(), fVar);
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    @Override // t2.g
    public final List<T> k(z2.f<T> fVar) {
        l();
        z2.j b5 = this.f5424c.b(null, this.f5429h, fVar);
        try {
            ArrayList arrayList = new ArrayList();
            while (b5.a()) {
                arrayList.add(b5.b());
            }
            z2.l.f6147k.c("query of '{}' returned {} results", ((a3.e) fVar).f72d, Integer.valueOf(arrayList.size()));
            return arrayList;
        } finally {
            b5.close();
        }
    }

    public final void l() {
        if (!this.f5423b) {
            throw new IllegalStateException("you must call initialize() before you can use the dao");
        }
    }

    @Override // t2.g
    public final int m(z2.e<T> eVar) {
        l();
        c3.d c5 = ((q2.b) this.f5429h).c();
        try {
            Objects.requireNonNull(this.f5424c);
            c3.b f5 = ((a3.e) eVar).f(c5, 5);
            try {
                q2.a aVar = (q2.a) f5;
                int f6 = aVar.f();
                aVar.a();
                return f6;
            } catch (Throwable th) {
                ((q2.a) f5).a();
                throw th;
            }
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t2.g
    public final int n(T t4) {
        l();
        if (t4 == 0) {
            return 0;
        }
        if (t4 instanceof y2.a) {
        }
        try {
            this.f5424c.c(((q2.b) this.f5429h).c(), t4);
            return 1;
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    @Override // t2.g
    public final int o(T t4) {
        l();
        if (t4 == null) {
            return 0;
        }
        try {
            return this.f5424c.d(((q2.b) this.f5429h).c(), t4, null);
        } finally {
            Objects.requireNonNull(this.f5429h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t2.g
    public final g.a p(T t4) {
        if (t4 == null) {
            return new g.a();
        }
        l();
        v2.g gVar = this.f5428g.f2498f;
        if (gVar == null) {
            StringBuilder g5 = androidx.activity.d.g("Class ");
            g5.append(this.f5426e);
            g5.append(" does not have an id field");
            throw new SQLException(g5.toString());
        }
        Object e5 = gVar.e(t4);
        if (e5 == null || !g(e5)) {
            n(t4);
            return new g.a();
        }
        d(t4);
        return new g.a();
    }

    @Override // t2.g
    public final f q(z2.f fVar) {
        l();
        try {
            z2.j b5 = this.f5424c.b(this, this.f5429h, fVar);
            this.f5430i = b5;
            return b5;
        } catch (SQLException e5) {
            StringBuilder g5 = androidx.activity.d.g("Could not build prepared-query iterator for ");
            g5.append(this.f5426e);
            throw d1.c.e(g5.toString(), e5);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final f<T> iterator() {
        l();
        try {
            z2.l<T, ID> lVar = this.f5424c;
            c3.c cVar = this.f5429h;
            if (lVar.f6152e == null) {
                lVar.f6152e = new z2.h(lVar.f6148a, lVar.f6149b, lVar.f6150c).f();
            }
            z2.j b5 = lVar.b(this, cVar, lVar.f6152e);
            this.f5430i = b5;
            return b5;
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("Could not build iterator for ");
            g5.append(this.f5426e);
            throw new IllegalStateException(g5.toString(), e5);
        }
    }
}
