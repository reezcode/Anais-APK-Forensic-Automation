package t2;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes16.dex */
public abstract class d<T, ID> implements k<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final transient g<T, ID> f5431b;

    /* renamed from: c, reason: collision with root package name */
    public final transient v2.g f5432c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f5433d;

    /* renamed from: e, reason: collision with root package name */
    public transient z2.f<T> f5434e;

    /* renamed from: f, reason: collision with root package name */
    public final transient String f5435f;

    /* renamed from: g, reason: collision with root package name */
    public final transient boolean f5436g;

    /* renamed from: h, reason: collision with root package name */
    public final transient Object f5437h;

    public d(g<T, ID> gVar, Object obj, Object obj2, v2.g gVar2, String str, boolean z4) {
        this.f5431b = gVar;
        this.f5432c = gVar2;
        this.f5433d = obj2;
        this.f5435f = str;
        this.f5436g = z4;
        this.f5437h = obj;
    }

    @Override // java.util.Collection
    public boolean add(T t4) {
        try {
            return l(t4);
        } catch (SQLException e5) {
            throw new IllegalStateException("Could not create data element in dao", e5);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            try {
                if (l(it.next())) {
                    z4 = true;
                }
            } catch (SQLException e5) {
                throw new IllegalStateException("Could not create data elements in dao", e5);
            }
        }
        return z4;
    }

    @Override // java.util.Collection
    public final void clear() {
        if (this.f5431b == null) {
            return;
        }
        f<T> b5 = b();
        while (b5.hasNext()) {
            try {
                b5.next();
                b5.remove();
            } finally {
                try {
                    b5.close();
                } catch (SQLException unused) {
                }
            }
        }
    }

    public final boolean l(T t4) {
        if (this.f5431b == null) {
            return false;
        }
        if (this.f5437h != null) {
            v2.g gVar = this.f5432c;
            Object e5 = gVar.e(t4);
            if (gVar.l(e5)) {
                e5 = null;
            }
            if (e5 == null) {
                this.f5432c.b(t4, this.f5437h, true, null);
            }
        }
        this.f5431b.n(t4);
        return true;
    }

    public final z2.f<T> r() {
        g<T, ID> gVar = this.f5431b;
        if (gVar == null) {
            return null;
        }
        if (this.f5434e == null) {
            z2.i iVar = new z2.i();
            Object obj = this.f5433d;
            iVar.f6124c = true;
            iVar.f6125d = obj;
            z2.h<T, ID> c5 = gVar.c();
            String str = this.f5435f;
            if (str != null) {
                c5.l(str, this.f5436g);
            }
            z2.m<T, ID> g5 = c5.g();
            g5.c(this.f5432c.f5680d, iVar);
            z2.f<T> j5 = g5.j();
            this.f5434e = (a3.e) j5;
            a3.e eVar = (a3.e) j5;
            Object obj2 = this.f5437h;
            Object obj3 = this.f5433d;
            eVar.f66i = obj2;
            eVar.f67j = obj3;
        }
        return this.f5434e;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean z4 = false;
        if (this.f5431b == null) {
            return false;
        }
        f<T> b5 = b();
        while (b5.hasNext()) {
            try {
                if (!collection.contains(b5.next())) {
                    b5.remove();
                    z4 = true;
                }
            } finally {
                try {
                    b5.close();
                } catch (SQLException unused) {
                }
            }
        }
        return z4;
    }
}
