package r;

import d0.f;
import g0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import r.j;
import r.m;
import v.o;

/* loaded from: classes24.dex */
public final class i<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final List<o.a<?>> f4835a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List<p.f> f4836b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.d f4837c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4838d;

    /* renamed from: e, reason: collision with root package name */
    public int f4839e;

    /* renamed from: f, reason: collision with root package name */
    public int f4840f;

    /* renamed from: g, reason: collision with root package name */
    public Class<?> f4841g;

    /* renamed from: h, reason: collision with root package name */
    public j.d f4842h;

    /* renamed from: i, reason: collision with root package name */
    public p.h f4843i;

    /* renamed from: j, reason: collision with root package name */
    public Map<Class<?>, p.l<?>> f4844j;

    /* renamed from: k, reason: collision with root package name */
    public Class<Transcode> f4845k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4846l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4847m;

    /* renamed from: n, reason: collision with root package name */
    public p.f f4848n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.f f4849o;

    /* renamed from: p, reason: collision with root package name */
    public l f4850p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4851q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4852r;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<p.f>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<p.f>] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList, java.util.List<p.f>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList, java.util.List<p.f>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<p.f>] */
    public final List<p.f> a() {
        if (!this.f4847m) {
            this.f4847m = true;
            this.f4836b.clear();
            ArrayList arrayList = (ArrayList) c();
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                o.a aVar = (o.a) arrayList.get(i5);
                if (!this.f4836b.contains(aVar.f5512a)) {
                    this.f4836b.add(aVar.f5512a);
                }
                for (int i6 = 0; i6 < aVar.f5513b.size(); i6++) {
                    if (!this.f4836b.contains(aVar.f5513b.get(i6))) {
                        this.f4836b.add(aVar.f5513b.get(i6));
                    }
                }
            }
        }
        return this.f4836b;
    }

    public final t.a b() {
        return ((m.c) this.f4842h).a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<v.o$a<?>>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<v.o$a<?>>] */
    public final List<o.a<?>> c() {
        if (!this.f4846l) {
            this.f4846l = true;
            this.f4835a.clear();
            List f5 = this.f4837c.f555b.f(this.f4838d);
            int size = f5.size();
            for (int i5 = 0; i5 < size; i5++) {
                o.a a5 = ((v.o) f5.get(i5)).a(this.f4838d, this.f4839e, this.f4840f, this.f4843i);
                if (a5 != null) {
                    this.f4835a.add(a5);
                }
            }
        }
        return this.f4835a;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList, java.util.List<d0.f$a<?, ?>>] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<g0.e$a<?, ?>>>] */
    public final <Data> u<Data, ?, Transcode> d(Class<Data> cls) {
        u<Data, ?, Transcode> uVar;
        ArrayList arrayList;
        d0.e eVar;
        d0.e eVar2;
        com.bumptech.glide.g gVar = this.f4837c.f555b;
        Class<?> cls2 = this.f4841g;
        Class<Transcode> cls3 = this.f4845k;
        g0.c cVar = gVar.f579i;
        l0.i andSet = cVar.f2914b.getAndSet(null);
        if (andSet == null) {
            andSet = new l0.i();
        }
        andSet.a(cls, cls2, cls3);
        synchronized (cVar.f2913a) {
            uVar = (u) cVar.f2913a.get(andSet);
        }
        cVar.f2914b.set(andSet);
        Objects.requireNonNull(gVar.f579i);
        if (g0.c.f2912c.equals(uVar)) {
            return null;
        }
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) gVar.f573c.b(cls, cls2)).iterator();
        while (it.hasNext()) {
            Class<?> cls4 = (Class) it.next();
            Iterator it2 = ((ArrayList) gVar.f576f.a(cls4, cls3)).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                g0.e eVar3 = gVar.f573c;
                synchronized (eVar3) {
                    arrayList = new ArrayList();
                    Iterator it3 = eVar3.f2917a.iterator();
                    while (it3.hasNext()) {
                        List<e.a> list = (List) eVar3.f2918b.get((String) it3.next());
                        if (list != null) {
                            for (e.a aVar : list) {
                                if (aVar.f2919a.isAssignableFrom(cls) && cls4.isAssignableFrom(aVar.f2920b)) {
                                    arrayList.add(aVar.f2921c);
                                }
                            }
                        }
                    }
                }
                d0.f fVar = gVar.f576f;
                synchronized (fVar) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        Iterator it4 = fVar.f2468a.iterator();
                        while (it4.hasNext()) {
                            f.a aVar2 = (f.a) it4.next();
                            if (aVar2.f2469a.isAssignableFrom(cls4) && cls5.isAssignableFrom(aVar2.f2470b)) {
                                eVar = aVar2.f2471c;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                    }
                    eVar = d0.g.f2472a;
                    eVar2 = eVar;
                }
                arrayList2.add(new k(cls, cls4, cls5, arrayList, eVar2, gVar.f580j));
            }
        }
        u<Data, ?, Transcode> uVar2 = arrayList2.isEmpty() ? null : new u<>(cls, cls2, cls3, arrayList2, gVar.f580j);
        g0.c cVar2 = gVar.f579i;
        synchronized (cVar2.f2913a) {
            cVar2.f2913a.put(new l0.i(cls, cls2, cls3), uVar2 != null ? uVar2 : g0.c.f2912c);
        }
        return uVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r1 = (p.d<X>) r3.f2910b;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<g0.a$a<?>>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <X> p.d<X> e(X r6) {
        /*
            r5 = this;
            com.bumptech.glide.d r0 = r5.f4837c
            com.bumptech.glide.g r0 = r0.f555b
            g0.a r0 = r0.f572b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List<g0.a$a<?>> r2 = r0.f2908a     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L37
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L37
            g0.a$a r3 = (g0.a.C0034a) r3     // Catch: java.lang.Throwable -> L37
            java.lang.Class<T> r4 = r3.f2909a     // Catch: java.lang.Throwable -> L37
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L11
            p.d<T> r1 = r3.f2910b     // Catch: java.lang.Throwable -> L37
            goto L29
        L28:
            r1 = 0
        L29:
            monitor-exit(r0)
            if (r1 == 0) goto L2d
            return r1
        L2d:
            com.bumptech.glide.g$e r0 = new com.bumptech.glide.g$e
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L37:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.i.e(java.lang.Object):p.d");
    }

    public final <Z> p.l<Z> f(Class<Z> cls) {
        p.l<Z> lVar = (p.l) this.f4844j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, p.l<?>>> it = this.f4844j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, p.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (p.l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f4844j.isEmpty() || !this.f4851q) {
            return (p.l<Z>) x.b.f5905b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
