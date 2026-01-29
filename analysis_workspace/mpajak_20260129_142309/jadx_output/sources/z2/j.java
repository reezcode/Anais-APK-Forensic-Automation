package z2;

import java.sql.SQLException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class j<T, ID> implements t2.f<T> {

    /* renamed from: n, reason: collision with root package name */
    public static final x2.c f6126n = x2.d.a(j.class);

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f6127b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.g<T, ID> f6128c;

    /* renamed from: d, reason: collision with root package name */
    public final c3.c f6129d;

    /* renamed from: e, reason: collision with root package name */
    public final c3.b f6130e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.d f6131f;

    /* renamed from: g, reason: collision with root package name */
    public final d<T> f6132g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6133h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6134i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6135j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6136k;

    /* renamed from: l, reason: collision with root package name */
    public T f6137l;

    /* renamed from: m, reason: collision with root package name */
    public int f6138m;

    public j(Class cls, t2.g gVar, d dVar, c3.c cVar, c3.d dVar2, c3.b bVar, String str) {
        this.f6127b = cls;
        this.f6128c = gVar;
        this.f6132g = dVar;
        this.f6129d = cVar;
        this.f6130e = bVar;
        this.f6131f = (q2.d) ((q2.a) bVar).e();
        this.f6133h = str;
        if (str != null) {
            f6126n.c("starting iterator @{} for '{}'", Integer.valueOf(hashCode()), str);
        }
    }

    public final boolean a() {
        boolean g5;
        if (this.f6135j) {
            return false;
        }
        if (this.f6136k) {
            return true;
        }
        if (this.f6134i) {
            this.f6134i = false;
            g5 = this.f6131f.b();
        } else {
            g5 = this.f6131f.g();
        }
        if (!g5) {
            close();
        }
        this.f6136k = true;
        return g5;
    }

    public final T b() {
        boolean g5;
        if (this.f6135j) {
            return null;
        }
        if (!this.f6136k) {
            if (this.f6134i) {
                this.f6134i = false;
                g5 = this.f6131f.b();
            } else {
                g5 = this.f6131f.g();
            }
            if (!g5) {
                this.f6134i = false;
                return null;
            }
        }
        this.f6134i = false;
        T a5 = this.f6132g.a(this.f6131f);
        this.f6137l = a5;
        this.f6136k = false;
        this.f6138m++;
        return a5;
    }

    public final void c() {
        T t4 = this.f6137l;
        if (t4 == null) {
            StringBuilder g5 = androidx.activity.d.g("No last ");
            g5.append(this.f6127b);
            g5.append(" object to remove. Must be called after a call to next.");
            throw new IllegalStateException(g5.toString());
        }
        t2.g<T, ID> gVar = this.f6128c;
        if (gVar != null) {
            try {
                gVar.o(t4);
            } finally {
                this.f6137l = null;
            }
        } else {
            StringBuilder g6 = androidx.activity.d.g("Cannot remove ");
            g6.append(this.f6127b);
            g6.append(" object because classDao not initialized");
            throw new IllegalStateException(g6.toString());
        }
    }

    @Override // t2.f
    public final void close() {
        if (this.f6135j) {
            return;
        }
        ((q2.a) this.f6130e).a();
        this.f6135j = true;
        this.f6137l = null;
        if (this.f6133h != null) {
            f6126n.c("closed iterator @{} after {} rows", Integer.valueOf(hashCode()), Integer.valueOf(this.f6138m));
        }
        Objects.requireNonNull(this.f6129d);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return a();
        } catch (SQLException e5) {
            this.f6137l = null;
            try {
                close();
            } catch (SQLException unused) {
            }
            StringBuilder g5 = androidx.activity.d.g("Errors getting more results of ");
            g5.append(this.f6127b);
            throw new IllegalStateException(g5.toString(), e5);
        }
    }

    @Override // t2.f
    public final void moveToNext() {
        this.f6137l = null;
        this.f6134i = false;
        this.f6136k = false;
    }

    @Override // java.util.Iterator
    public final T next() {
        T b5;
        try {
            b5 = b();
        } catch (SQLException e5) {
            e = e5;
        }
        if (b5 != null) {
            return b5;
        }
        e = null;
        this.f6137l = null;
        try {
            close();
        } catch (SQLException unused) {
        }
        StringBuilder g5 = androidx.activity.d.g("Could not get next result for ");
        g5.append(this.f6127b);
        throw new IllegalStateException(g5.toString(), e);
    }

    @Override // java.util.Iterator
    public final void remove() {
        try {
            c();
        } catch (SQLException e5) {
            try {
                close();
            } catch (SQLException unused) {
            }
            StringBuilder g5 = androidx.activity.d.g("Could not delete ");
            g5.append(this.f6127b);
            g5.append(" object ");
            g5.append(this.f6137l);
            throw new IllegalStateException(g5.toString(), e5);
        }
    }
}
