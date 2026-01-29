package r;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l0.g;
import m0.a;
import r.c;
import r.j;
import r.q;
import t.a;
import t.i;

/* loaded from: classes9.dex */
public final class m implements o, i.a, q.a {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f4895h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final t f4896a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.d f4897b;

    /* renamed from: c, reason: collision with root package name */
    public final t.i f4898c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4899d;

    /* renamed from: e, reason: collision with root package name */
    public final z f4900e;

    /* renamed from: f, reason: collision with root package name */
    public final a f4901f;

    /* renamed from: g, reason: collision with root package name */
    public final r.c f4902g;

    @VisibleForTesting
    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final j.d f4903a;

        /* renamed from: b, reason: collision with root package name */
        public final Pools.Pool<j<?>> f4904b = (a.c) m0.a.a(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, new C0062a());

        /* renamed from: c, reason: collision with root package name */
        public int f4905c;

        /* renamed from: r.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes11.dex */
        public class C0062a implements a.b<j<?>> {
            public C0062a() {
            }

            @Override // m0.a.b
            public final j<?> a() {
                a aVar = a.this;
                return new j<>(aVar.f4903a, aVar.f4904b);
            }
        }

        public a(j.d dVar) {
            this.f4903a = dVar;
        }
    }

    @VisibleForTesting
    /* loaded from: classes20.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final u.a f4907a;

        /* renamed from: b, reason: collision with root package name */
        public final u.a f4908b;

        /* renamed from: c, reason: collision with root package name */
        public final u.a f4909c;

        /* renamed from: d, reason: collision with root package name */
        public final u.a f4910d;

        /* renamed from: e, reason: collision with root package name */
        public final o f4911e;

        /* renamed from: f, reason: collision with root package name */
        public final q.a f4912f;

        /* renamed from: g, reason: collision with root package name */
        public final Pools.Pool<n<?>> f4913g = (a.c) m0.a.a(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, new a());

        /* loaded from: classes7.dex */
        public class a implements a.b<n<?>> {
            public a() {
            }

            @Override // m0.a.b
            public final n<?> a() {
                b bVar = b.this;
                return new n<>(bVar.f4907a, bVar.f4908b, bVar.f4909c, bVar.f4910d, bVar.f4911e, bVar.f4912f, bVar.f4913g);
            }
        }

        public b(u.a aVar, u.a aVar2, u.a aVar3, u.a aVar4, o oVar, q.a aVar5) {
            this.f4907a = aVar;
            this.f4908b = aVar2;
            this.f4909c = aVar3;
            this.f4910d = aVar4;
            this.f4911e = oVar;
            this.f4912f = aVar5;
        }
    }

    /* loaded from: classes19.dex */
    public static class c implements j.d {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0067a f4915a;

        /* renamed from: b, reason: collision with root package name */
        public volatile t.a f4916b;

        public c(a.InterfaceC0067a interfaceC0067a) {
            this.f4915a = interfaceC0067a;
        }

        public final t.a a() {
            if (this.f4916b == null) {
                synchronized (this) {
                    if (this.f4916b == null) {
                        t.d dVar = (t.d) this.f4915a;
                        t.f fVar = (t.f) dVar.f5399b;
                        File cacheDir = fVar.f5405a.getCacheDir();
                        t.e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f5406b != null) {
                            cacheDir = new File(cacheDir, fVar.f5406b);
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            eVar = new t.e(cacheDir, dVar.f5398a);
                        }
                        this.f4916b = eVar;
                    }
                    if (this.f4916b == null) {
                        this.f4916b = new t.b();
                    }
                }
            }
            return this.f4916b;
        }
    }

    /* loaded from: classes23.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final n<?> f4917a;

        /* renamed from: b, reason: collision with root package name */
        public final h0.g f4918b;

        public d(h0.g gVar, n<?> nVar) {
            this.f4918b = gVar;
            this.f4917a = nVar;
        }
    }

    public m(t.i iVar, a.InterfaceC0067a interfaceC0067a, u.a aVar, u.a aVar2, u.a aVar3, u.a aVar4) {
        this.f4898c = iVar;
        c cVar = new c(interfaceC0067a);
        r.c cVar2 = new r.c();
        this.f4902g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f4817d = this;
            }
        }
        this.f4897b = new d1.d();
        this.f4896a = new t();
        this.f4899d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f4901f = new a(cVar);
        this.f4900e = new z();
        ((t.h) iVar).f5407d = this;
    }

    public static void d(String str, long j5, p.f fVar) {
        StringBuilder e5 = androidx.activity.result.a.e(str, " in ");
        e5.append(l0.f.a(j5));
        e5.append("ms, key: ");
        e5.append(fVar);
        Log.v("Engine", e5.toString());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<p.f, r.c$a>] */
    @Override // r.q.a
    public final void a(p.f fVar, q<?> qVar) {
        r.c cVar = this.f4902g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f4815b.remove(fVar);
            if (aVar != null) {
                aVar.f4820c = null;
                aVar.clear();
            }
        }
        if (qVar.f4961b) {
            ((t.h) this.f4898c).d(fVar, qVar);
        } else {
            this.f4900e.a(qVar, false);
        }
    }

    public final <R> d b(com.bumptech.glide.d dVar, Object obj, p.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.f fVar2, l lVar, Map<Class<?>, p.l<?>> map, boolean z4, boolean z5, p.h hVar, boolean z6, boolean z7, boolean z8, boolean z9, h0.g gVar, Executor executor) {
        long j5;
        if (f4895h) {
            int i7 = l0.f.f3932b;
            j5 = SystemClock.elapsedRealtimeNanos();
        } else {
            j5 = 0;
        }
        long j6 = j5;
        Objects.requireNonNull(this.f4897b);
        p pVar = new p(obj, fVar, i5, i6, map, cls, cls2, hVar);
        synchronized (this) {
            q<?> c5 = c(pVar, z6, j6);
            if (c5 == null) {
                return g(dVar, obj, fVar, i5, i6, cls, cls2, fVar2, lVar, map, z4, z5, hVar, z6, z7, z8, z9, gVar, executor, pVar, j6);
            }
            ((h0.h) gVar).p(c5, p.a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<p.f, r.c$a>] */
    @Nullable
    public final q<?> c(p pVar, boolean z4, long j5) {
        q<?> qVar;
        w wVar;
        if (!z4) {
            return null;
        }
        r.c cVar = this.f4902g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f4815b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f4895h) {
                d("Loaded resource from active resources", j5, pVar);
            }
            return qVar;
        }
        t.h hVar = (t.h) this.f4898c;
        synchronized (hVar) {
            g.a aVar2 = (g.a) hVar.f3933a.remove(pVar);
            if (aVar2 == null) {
                wVar = null;
            } else {
                hVar.f3935c -= aVar2.f3937b;
                wVar = aVar2.f3936a;
            }
        }
        w wVar2 = wVar;
        q<?> qVar2 = wVar2 == null ? null : wVar2 instanceof q ? (q) wVar2 : new q<>(wVar2, true, true, pVar, this);
        if (qVar2 != null) {
            qVar2.a();
            this.f4902g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f4895h) {
            d("Loaded resource from cache", j5, pVar);
        }
        return qVar2;
    }

    public final synchronized void e(n<?> nVar, p.f fVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.f4961b) {
                this.f4902g.a(fVar, qVar);
            }
        }
        t tVar = this.f4896a;
        Objects.requireNonNull(tVar);
        Map c5 = tVar.c(nVar.f4935q);
        if (nVar.equals(c5.get(fVar))) {
            c5.remove(fVar);
        }
    }

    public final void f(w<?> wVar) {
        if (!(wVar instanceof q)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((q) wVar).c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        r0 = r15.f4926h;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> r.m.d g(com.bumptech.glide.d r17, java.lang.Object r18, p.f r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, com.bumptech.glide.f r24, r.l r25, java.util.Map<java.lang.Class<?>, p.l<?>> r26, boolean r27, boolean r28, p.h r29, boolean r30, boolean r31, boolean r32, boolean r33, h0.g r34, java.util.concurrent.Executor r35, r.p r36, long r37) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.m.g(com.bumptech.glide.d, java.lang.Object, p.f, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.f, r.l, java.util.Map, boolean, boolean, p.h, boolean, boolean, boolean, boolean, h0.g, java.util.concurrent.Executor, r.p, long):r.m$d");
    }
}
