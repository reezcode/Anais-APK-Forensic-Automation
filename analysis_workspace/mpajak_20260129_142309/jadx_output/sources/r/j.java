package r;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.a;
import m0.d;
import r.h;
import r.k;
import r.m;
import r.n;
import r.q;

/* loaded from: classes7.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public Object A;
    public p.a B;
    public com.bumptech.glide.load.data.d<?> C;
    public volatile h D;
    public volatile boolean E;
    public volatile boolean F;
    public boolean G;

    /* renamed from: e, reason: collision with root package name */
    public final d f4856e;

    /* renamed from: f, reason: collision with root package name */
    public final Pools.Pool<j<?>> f4857f;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.d f4860i;

    /* renamed from: j, reason: collision with root package name */
    public p.f f4861j;

    /* renamed from: k, reason: collision with root package name */
    public com.bumptech.glide.f f4862k;

    /* renamed from: l, reason: collision with root package name */
    public p f4863l;

    /* renamed from: m, reason: collision with root package name */
    public int f4864m;

    /* renamed from: n, reason: collision with root package name */
    public int f4865n;

    /* renamed from: o, reason: collision with root package name */
    public l f4866o;

    /* renamed from: p, reason: collision with root package name */
    public p.h f4867p;

    /* renamed from: q, reason: collision with root package name */
    public a<R> f4868q;

    /* renamed from: r, reason: collision with root package name */
    public int f4869r;

    /* renamed from: s, reason: collision with root package name */
    public int f4870s;

    /* renamed from: t, reason: collision with root package name */
    public int f4871t;

    /* renamed from: u, reason: collision with root package name */
    public long f4872u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4873v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4874w;

    /* renamed from: x, reason: collision with root package name */
    public Thread f4875x;

    /* renamed from: y, reason: collision with root package name */
    public p.f f4876y;

    /* renamed from: z, reason: collision with root package name */
    public p.f f4877z;

    /* renamed from: b, reason: collision with root package name */
    public final i<R> f4853b = new i<>();

    /* renamed from: c, reason: collision with root package name */
    public final List<Throwable> f4854c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final d.a f4855d = new d.a();

    /* renamed from: g, reason: collision with root package name */
    public final c<?> f4858g = new c<>();

    /* renamed from: h, reason: collision with root package name */
    public final e f4859h = new e();

    /* loaded from: classes12.dex */
    public interface a<R> {
    }

    public final class b<Z> implements k.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        public final p.a f4878a;

        public b(p.a aVar) {
            this.f4878a = aVar;
        }
    }

    /* loaded from: classes17.dex */
    public static class c<Z> {

        /* renamed from: a, reason: collision with root package name */
        public p.f f4880a;

        /* renamed from: b, reason: collision with root package name */
        public p.k<Z> f4881b;

        /* renamed from: c, reason: collision with root package name */
        public v<Z> f4882c;
    }

    /* loaded from: classes15.dex */
    public interface d {
    }

    /* loaded from: classes20.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4883a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4884b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4885c;

        public final boolean a() {
            return (this.f4885c || this.f4884b) && this.f4883a;
        }
    }

    public j(d dVar, Pools.Pool<j<?>> pool) {
        this.f4856e = dVar;
        this.f4857f = pool;
    }

    @Override // r.h.a
    public final void a() {
        this.f4871t = 2;
        ((n) this.f4868q).i(this);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    @Override // r.h.a
    public final void b(p.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, p.a aVar) {
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a5 = dVar.a();
        rVar.f4970c = fVar;
        rVar.f4971d = aVar;
        rVar.f4972e = a5;
        this.f4854c.add(rVar);
        if (Thread.currentThread() == this.f4875x) {
            m();
        } else {
            this.f4871t = 2;
            ((n) this.f4868q).i(this);
        }
    }

    @Override // m0.a.d
    @NonNull
    public final m0.d c() {
        return this.f4855d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.f4862k.ordinal() - jVar2.f4862k.ordinal();
        return ordinal == 0 ? this.f4869r - jVar2.f4869r : ordinal;
    }

    @Override // r.h.a
    public final void d(p.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, p.a aVar, p.f fVar2) {
        this.f4876y = fVar;
        this.A = obj;
        this.C = dVar;
        this.B = aVar;
        this.f4877z = fVar2;
        this.G = fVar != ((ArrayList) this.f4853b.a()).get(0);
        if (Thread.currentThread() == this.f4875x) {
            g();
        } else {
            this.f4871t = 3;
            ((n) this.f4868q).i(this);
        }
    }

    public final <Data> w<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, p.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            int i5 = l0.f.f3932b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> f5 = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f5, elapsedRealtimeNanos, null);
            }
            return f5;
        } finally {
            dVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.collection.ArrayMap<p.g<?>, java.lang.Object>, l0.b] */
    public final <Data> w<R> f(Data data, p.a aVar) {
        com.bumptech.glide.load.data.e<Data> b5;
        u<Data, ?, R> d5 = this.f4853b.d(data.getClass());
        p.h hVar = this.f4867p;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z4 = aVar == p.a.RESOURCE_DISK_CACHE || this.f4853b.f4852r;
            p.g<Boolean> gVar = y.m.f5999i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z4)) {
                hVar = new p.h();
                hVar.d(this.f4867p);
                hVar.f4618b.put(gVar, Boolean.valueOf(z4));
            }
        }
        p.h hVar2 = hVar;
        com.bumptech.glide.load.data.f fVar = this.f4860i.f555b.f575e;
        synchronized (fVar) {
            e.a<?> aVar2 = (e.a) fVar.f612a.get(data.getClass());
            if (aVar2 == null) {
                Iterator it = fVar.f612a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> aVar3 = (e.a) it.next();
                    if (aVar3.a().isAssignableFrom(data.getClass())) {
                        aVar2 = aVar3;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = com.bumptech.glide.load.data.f.f611b;
            }
            b5 = aVar2.b(data);
        }
        try {
            return d5.a(b5, hVar2, this.f4864m, this.f4865n, new b(aVar));
        } finally {
            b5.b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    public final void g() {
        v vVar;
        boolean a5;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j5 = this.f4872u;
            StringBuilder g5 = androidx.activity.d.g("data: ");
            g5.append(this.A);
            g5.append(", cache key: ");
            g5.append(this.f4876y);
            g5.append(", fetcher: ");
            g5.append(this.C);
            j("Retrieved data", j5, g5.toString());
        }
        v vVar2 = null;
        try {
            vVar = e(this.C, this.A, this.B);
        } catch (r e5) {
            p.f fVar = this.f4877z;
            p.a aVar = this.B;
            e5.f4970c = fVar;
            e5.f4971d = aVar;
            e5.f4972e = null;
            this.f4854c.add(e5);
            vVar = null;
        }
        if (vVar == null) {
            m();
            return;
        }
        p.a aVar2 = this.B;
        boolean z4 = this.G;
        if (vVar instanceof s) {
            ((s) vVar).a();
        }
        if (this.f4858g.f4882c != null) {
            vVar2 = v.a(vVar);
            vVar = vVar2;
        }
        o();
        n<?> nVar = (n) this.f4868q;
        synchronized (nVar) {
            nVar.f4936r = vVar;
            nVar.f4937s = aVar2;
            nVar.f4944z = z4;
        }
        synchronized (nVar) {
            nVar.f4921c.a();
            if (nVar.f4943y) {
                nVar.f4936r.recycle();
                nVar.g();
            } else {
                if (nVar.f4920b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (nVar.f4938t) {
                    throw new IllegalStateException("Already have resource");
                }
                n.c cVar = nVar.f4924f;
                w<?> wVar = nVar.f4936r;
                boolean z5 = nVar.f4932n;
                p.f fVar2 = nVar.f4931m;
                q.a aVar3 = nVar.f4922d;
                Objects.requireNonNull(cVar);
                nVar.f4941w = new q<>(wVar, z5, true, fVar2, aVar3);
                nVar.f4938t = true;
                n.e eVar = nVar.f4920b;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.f4951b);
                nVar.e(arrayList.size() + 1);
                ((m) nVar.f4925g).e(nVar, nVar.f4931m, nVar.f4941w);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n.d dVar = (n.d) it.next();
                    dVar.f4950b.execute(new n.b(dVar.f4949a));
                }
                nVar.d();
            }
        }
        this.f4870s = 5;
        try {
            c<?> cVar2 = this.f4858g;
            if (cVar2.f4882c != null) {
                try {
                    ((m.c) this.f4856e).a().b(cVar2.f4880a, new g(cVar2.f4881b, cVar2.f4882c, this.f4867p));
                    cVar2.f4882c.d();
                } catch (Throwable th) {
                    cVar2.f4882c.d();
                    throw th;
                }
            }
            e eVar2 = this.f4859h;
            synchronized (eVar2) {
                eVar2.f4884b = true;
                a5 = eVar2.a();
            }
            if (a5) {
                l();
            }
        } finally {
            if (vVar2 != null) {
                vVar2.d();
            }
        }
    }

    public final h h() {
        int a5 = f.h.a(this.f4870s);
        if (a5 == 1) {
            return new x(this.f4853b, this);
        }
        if (a5 == 2) {
            return new r.e(this.f4853b, this);
        }
        if (a5 == 3) {
            return new b0(this.f4853b, this);
        }
        if (a5 == 5) {
            return null;
        }
        StringBuilder g5 = androidx.activity.d.g("Unrecognized stage: ");
        g5.append(androidx.appcompat.view.a.i(this.f4870s));
        throw new IllegalStateException(g5.toString());
    }

    public final int i(int i5) {
        if (i5 == 0) {
            throw null;
        }
        int i6 = i5 - 1;
        if (i6 == 0) {
            if (this.f4866o.b()) {
                return 2;
            }
            return i(2);
        }
        if (i6 == 1) {
            if (this.f4866o.a()) {
                return 3;
            }
            return i(3);
        }
        if (i6 == 2) {
            return this.f4873v ? 6 : 4;
        }
        if (i6 == 3 || i6 == 5) {
            return 6;
        }
        StringBuilder g5 = androidx.activity.d.g("Unrecognized stage: ");
        g5.append(androidx.appcompat.view.a.i(i5));
        throw new IllegalArgumentException(g5.toString());
    }

    public final void j(String str, long j5, String str2) {
        StringBuilder e5 = androidx.activity.result.a.e(str, " in ");
        e5.append(l0.f.a(j5));
        e5.append(", load key: ");
        e5.append(this.f4863l);
        e5.append(str2 != null ? androidx.activity.d.f(", ", str2) : "");
        e5.append(", thread: ");
        e5.append(Thread.currentThread().getName());
        Log.v("DecodeJob", e5.toString());
    }

    public final void k() {
        boolean a5;
        o();
        r rVar = new r("Failed to load resource", new ArrayList(this.f4854c));
        n<?> nVar = (n) this.f4868q;
        synchronized (nVar) {
            nVar.f4939u = rVar;
        }
        synchronized (nVar) {
            nVar.f4921c.a();
            if (nVar.f4943y) {
                nVar.g();
            } else {
                if (nVar.f4920b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (nVar.f4940v) {
                    throw new IllegalStateException("Already failed once");
                }
                nVar.f4940v = true;
                p.f fVar = nVar.f4931m;
                n.e eVar = nVar.f4920b;
                Objects.requireNonNull(eVar);
                ArrayList arrayList = new ArrayList(eVar.f4951b);
                nVar.e(arrayList.size() + 1);
                ((m) nVar.f4925g).e(nVar, fVar, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n.d dVar = (n.d) it.next();
                    dVar.f4950b.execute(new n.a(dVar.f4949a));
                }
                nVar.d();
            }
        }
        e eVar2 = this.f4859h;
        synchronized (eVar2) {
            eVar2.f4885c = true;
            a5 = eVar2.a();
        }
        if (a5) {
            l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<v.o$a<?>>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<p.f>] */
    public final void l() {
        e eVar = this.f4859h;
        synchronized (eVar) {
            eVar.f4884b = false;
            eVar.f4883a = false;
            eVar.f4885c = false;
        }
        c<?> cVar = this.f4858g;
        cVar.f4880a = null;
        cVar.f4881b = null;
        cVar.f4882c = null;
        i<R> iVar = this.f4853b;
        iVar.f4837c = null;
        iVar.f4838d = null;
        iVar.f4848n = null;
        iVar.f4841g = null;
        iVar.f4845k = null;
        iVar.f4843i = null;
        iVar.f4849o = null;
        iVar.f4844j = null;
        iVar.f4850p = null;
        iVar.f4835a.clear();
        iVar.f4846l = false;
        iVar.f4836b.clear();
        iVar.f4847m = false;
        this.E = false;
        this.f4860i = null;
        this.f4861j = null;
        this.f4867p = null;
        this.f4862k = null;
        this.f4863l = null;
        this.f4868q = null;
        this.f4870s = 0;
        this.D = null;
        this.f4875x = null;
        this.f4876y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.f4872u = 0L;
        this.F = false;
        this.f4874w = null;
        this.f4854c.clear();
        this.f4857f.release(this);
    }

    public final void m() {
        this.f4875x = Thread.currentThread();
        int i5 = l0.f.f3932b;
        this.f4872u = SystemClock.elapsedRealtimeNanos();
        boolean z4 = false;
        while (!this.F && this.D != null && !(z4 = this.D.e())) {
            this.f4870s = i(this.f4870s);
            this.D = h();
            if (this.f4870s == 4) {
                this.f4871t = 2;
                ((n) this.f4868q).i(this);
                return;
            }
        }
        if ((this.f4870s == 6 || this.F) && !z4) {
            k();
        }
    }

    public final void n() {
        int a5 = f.h.a(this.f4871t);
        if (a5 == 0) {
            this.f4870s = i(1);
            this.D = h();
        } else if (a5 != 1) {
            if (a5 == 2) {
                g();
                return;
            } else {
                StringBuilder g5 = androidx.activity.d.g("Unrecognized run reason: ");
                g5.append(androidx.activity.d.k(this.f4871t));
                throw new IllegalStateException(g5.toString());
            }
        }
        m();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    public final void o() {
        Throwable th;
        this.f4855d.a();
        if (!this.E) {
            this.E = true;
            return;
        }
        if (this.f4854c.isEmpty()) {
            th = null;
        } else {
            ?? r02 = this.f4854c;
            th = (Throwable) r02.get(r02.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.C;
        try {
            try {
                if (this.F) {
                    k();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                n();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (r.d e5) {
            throw e5;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + androidx.appcompat.view.a.i(this.f4870s), th2);
            }
            if (this.f4870s != 5) {
                this.f4854c.add(th2);
                k();
            }
            if (!this.F) {
                throw th2;
            }
            throw th2;
        }
    }
}
