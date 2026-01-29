package r;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m0.a;
import m0.d;
import r.j;
import r.q;

/* loaded from: classes5.dex */
public final class n<R> implements j.a<R>, a.d {
    public static final c A = new c();

    /* renamed from: b, reason: collision with root package name */
    public final e f4920b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a f4921c;

    /* renamed from: d, reason: collision with root package name */
    public final q.a f4922d;

    /* renamed from: e, reason: collision with root package name */
    public final Pools.Pool<n<?>> f4923e;

    /* renamed from: f, reason: collision with root package name */
    public final c f4924f;

    /* renamed from: g, reason: collision with root package name */
    public final o f4925g;

    /* renamed from: h, reason: collision with root package name */
    public final u.a f4926h;

    /* renamed from: i, reason: collision with root package name */
    public final u.a f4927i;

    /* renamed from: j, reason: collision with root package name */
    public final u.a f4928j;

    /* renamed from: k, reason: collision with root package name */
    public final u.a f4929k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f4930l;

    /* renamed from: m, reason: collision with root package name */
    public p.f f4931m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4932n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4933o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4934p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4935q;

    /* renamed from: r, reason: collision with root package name */
    public w<?> f4936r;

    /* renamed from: s, reason: collision with root package name */
    public p.a f4937s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4938t;

    /* renamed from: u, reason: collision with root package name */
    public r f4939u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4940v;

    /* renamed from: w, reason: collision with root package name */
    public q<?> f4941w;

    /* renamed from: x, reason: collision with root package name */
    public j<R> f4942x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f4943y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4944z;

    /* loaded from: classes13.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final h0.g f4945b;

        public a(h0.g gVar) {
            this.f4945b = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h0.h hVar = (h0.h) this.f4945b;
            hVar.f3086b.a();
            synchronized (hVar.f3087c) {
                synchronized (n.this) {
                    if (n.this.f4920b.f4951b.contains(new d(this.f4945b, l0.e.f3930b))) {
                        n nVar = n.this;
                        h0.g gVar = this.f4945b;
                        Objects.requireNonNull(nVar);
                        try {
                            ((h0.h) gVar).n(nVar.f4939u, 5);
                        } catch (Throwable th) {
                            throw new r.d(th);
                        }
                    }
                    n.this.d();
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final h0.g f4947b;

        public b(h0.g gVar) {
            this.f4947b = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h0.h hVar = (h0.h) this.f4947b;
            hVar.f3086b.a();
            synchronized (hVar.f3087c) {
                synchronized (n.this) {
                    if (n.this.f4920b.f4951b.contains(new d(this.f4947b, l0.e.f3930b))) {
                        n.this.f4941w.a();
                        n nVar = n.this;
                        h0.g gVar = this.f4947b;
                        Objects.requireNonNull(nVar);
                        try {
                            ((h0.h) gVar).p(nVar.f4941w, nVar.f4937s, nVar.f4944z);
                            n.this.h(this.f4947b);
                        } catch (Throwable th) {
                            throw new r.d(th);
                        }
                    }
                    n.this.d();
                }
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes7.dex */
    public static class c {
    }

    /* loaded from: classes7.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final h0.g f4949a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f4950b;

        public d(h0.g gVar, Executor executor) {
            this.f4949a = gVar;
            this.f4950b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4949a.equals(((d) obj).f4949a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f4949a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {

        /* renamed from: b, reason: collision with root package name */
        public final List<d> f4951b = new ArrayList(2);

        public final boolean isEmpty() {
            return this.f4951b.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<d> iterator() {
            return this.f4951b.iterator();
        }
    }

    public n(u.a aVar, u.a aVar2, u.a aVar3, u.a aVar4, o oVar, q.a aVar5, Pools.Pool<n<?>> pool) {
        c cVar = A;
        this.f4920b = new e();
        this.f4921c = new d.a();
        this.f4930l = new AtomicInteger();
        this.f4926h = aVar;
        this.f4927i = aVar2;
        this.f4928j = aVar3;
        this.f4929k = aVar4;
        this.f4925g = oVar;
        this.f4922d = aVar5;
        this.f4923e = pool;
        this.f4924f = cVar;
    }

    public final synchronized void a(h0.g gVar, Executor executor) {
        Runnable aVar;
        this.f4921c.a();
        this.f4920b.f4951b.add(new d(gVar, executor));
        boolean z4 = true;
        if (this.f4938t) {
            e(1);
            aVar = new b(gVar);
        } else if (this.f4940v) {
            e(1);
            aVar = new a(gVar);
        } else {
            if (this.f4943y) {
                z4 = false;
            }
            l0.j.a(z4, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f4943y = true;
        j<R> jVar = this.f4942x;
        jVar.F = true;
        h hVar = jVar.D;
        if (hVar != null) {
            hVar.cancel();
        }
        o oVar = this.f4925g;
        p.f fVar = this.f4931m;
        m mVar = (m) oVar;
        synchronized (mVar) {
            t tVar = mVar.f4896a;
            Objects.requireNonNull(tVar);
            Map c5 = tVar.c(this.f4935q);
            if (equals(c5.get(fVar))) {
                c5.remove(fVar);
            }
        }
    }

    @Override // m0.a.d
    @NonNull
    public final m0.d c() {
        return this.f4921c;
    }

    public final void d() {
        q<?> qVar;
        synchronized (this) {
            this.f4921c.a();
            l0.j.a(f(), "Not yet complete!");
            int decrementAndGet = this.f4930l.decrementAndGet();
            l0.j.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.f4941w;
                g();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.c();
        }
    }

    public final synchronized void e(int i5) {
        q<?> qVar;
        l0.j.a(f(), "Not yet complete!");
        if (this.f4930l.getAndAdd(i5) == 0 && (qVar = this.f4941w) != null) {
            qVar.a();
        }
    }

    public final boolean f() {
        return this.f4940v || this.f4938t || this.f4943y;
    }

    public final synchronized void g() {
        boolean a5;
        if (this.f4931m == null) {
            throw new IllegalArgumentException();
        }
        this.f4920b.f4951b.clear();
        this.f4931m = null;
        this.f4941w = null;
        this.f4936r = null;
        this.f4940v = false;
        this.f4943y = false;
        this.f4938t = false;
        this.f4944z = false;
        j<R> jVar = this.f4942x;
        j.e eVar = jVar.f4859h;
        synchronized (eVar) {
            eVar.f4883a = true;
            a5 = eVar.a();
        }
        if (a5) {
            jVar.l();
        }
        this.f4942x = null;
        this.f4939u = null;
        this.f4937s = null;
        this.f4923e.release(this);
    }

    public final synchronized void h(h0.g gVar) {
        boolean z4;
        this.f4921c.a();
        this.f4920b.f4951b.remove(new d(gVar, l0.e.f3930b));
        if (this.f4920b.isEmpty()) {
            b();
            if (!this.f4938t && !this.f4940v) {
                z4 = false;
                if (z4 && this.f4930l.get() == 0) {
                    g();
                }
            }
            z4 = true;
            if (z4) {
                g();
            }
        }
    }

    public final void i(j<?> jVar) {
        (this.f4933o ? this.f4928j : this.f4934p ? this.f4929k : this.f4927i).execute(jVar);
    }
}
