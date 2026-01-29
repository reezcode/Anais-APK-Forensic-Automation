package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import d0.f;
import g0.e;
import g0.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.a;
import p.k;
import v.o;
import v.p;
import v.q;
import v.s;

/* loaded from: classes22.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final q f571a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.a f572b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.e f573c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.f f574d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f575e;

    /* renamed from: f, reason: collision with root package name */
    public final d0.f f576f;

    /* renamed from: g, reason: collision with root package name */
    public final g0.b f577g;

    /* renamed from: h, reason: collision with root package name */
    public final g0.d f578h = new g0.d();

    /* renamed from: i, reason: collision with root package name */
    public final g0.c f579i = new g0.c();

    /* renamed from: j, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f580j;

    /* loaded from: classes2.dex */
    public static class a extends RuntimeException {
        public a(@NonNull String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes8.dex */
    public static class c extends a {
        public c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@androidx.annotation.NonNull java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.c.<init>(java.lang.Object):void");
        }

        public <M> c(@NonNull M m5, @NonNull List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m5);
        }
    }

    /* loaded from: classes18.dex */
    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes13.dex */
    public static class e extends a {
        public e(@NonNull Class<?> cls) {
            super(androidx.activity.d.e("Failed to find source encoder for data class: ", cls));
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public g() {
        a.c cVar = new a.c(new Pools.SynchronizedPool(20), new m0.b(), new m0.c());
        this.f580j = cVar;
        this.f571a = new q(cVar);
        this.f572b = new g0.a();
        this.f573c = new g0.e();
        this.f574d = new g0.f();
        this.f575e = new com.bumptech.glide.load.data.f();
        this.f576f = new d0.f();
        this.f577g = new g0.b();
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        g0.e eVar = this.f573c;
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.f2917a);
            eVar.f2917a.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                eVar.f2917a.add((String) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!arrayList.contains(str)) {
                    eVar.f2917a.add(str);
                }
            }
        }
    }

    @NonNull
    public final <Data, TResource> g a(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull p.j<Data, TResource> jVar) {
        d("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, v.q$a$a<?>>] */
    @NonNull
    public final <Model, Data> g b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<Model, Data> pVar) {
        q qVar = this.f571a;
        synchronized (qVar) {
            s sVar = qVar.f5515a;
            synchronized (sVar) {
                s.b bVar = new s.b(cls, cls2, pVar);
                ?? r4 = sVar.f5530a;
                r4.add(r4.size(), bVar);
            }
            qVar.f5516b.f5517a.clear();
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<g0.f$a<?>>] */
    @NonNull
    public final <TResource> g c(@NonNull Class<TResource> cls, @NonNull k<TResource> kVar) {
        g0.f fVar = this.f574d;
        synchronized (fVar) {
            fVar.f2922a.add(new f.a(cls, kVar));
        }
        return this;
    }

    @NonNull
    public final <Data, TResource> g d(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull p.j<Data, TResource> jVar) {
        g0.e eVar = this.f573c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a<>(cls, cls2, jVar));
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.load.ImageHeaderParser>] */
    @NonNull
    public final List<ImageHeaderParser> e() {
        ?? r12;
        g0.b bVar = this.f577g;
        synchronized (bVar) {
            r12 = bVar.f2911a;
        }
        if (r12.isEmpty()) {
            throw new b();
        }
        return r12;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, v.q$a$a<?>>] */
    @NonNull
    public final <Model> List<o<Model, ?>> f(@NonNull Model model) {
        List<o<Model, ?>> list;
        q qVar = this.f571a;
        Objects.requireNonNull(qVar);
        Class<?> cls = model.getClass();
        synchronized (qVar) {
            q.a.C0076a c0076a = (q.a.C0076a) qVar.f5516b.f5517a.get(cls);
            list = c0076a == null ? null : c0076a.f5518a;
            if (list == null) {
                list = Collections.unmodifiableList(qVar.f5515a.a(cls));
                qVar.f5516b.a(cls, list);
            }
        }
        if (list.isEmpty()) {
            throw new c(model);
        }
        int size = list.size();
        List<o<Model, ?>> emptyList = Collections.emptyList();
        boolean z4 = true;
        for (int i5 = 0; i5 < size; i5++) {
            o<Model, ?> oVar = list.get(i5);
            if (oVar.b(model)) {
                if (z4) {
                    emptyList = new ArrayList<>(size - i5);
                    z4 = false;
                }
                emptyList.add(oVar);
            }
        }
        if (emptyList.isEmpty()) {
            throw new c(model, list);
        }
        return emptyList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>>] */
    @NonNull
    public final g g(@NonNull e.a<?> aVar) {
        com.bumptech.glide.load.data.f fVar = this.f575e;
        synchronized (fVar) {
            fVar.f612a.put(aVar.a(), aVar);
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<d0.f$a<?, ?>>] */
    @NonNull
    public final <TResource, Transcode> g h(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull d0.e<TResource, Transcode> eVar) {
        d0.f fVar = this.f576f;
        synchronized (fVar) {
            fVar.f2468a.add(new f.a(cls, cls2, eVar));
        }
        return this;
    }
}
