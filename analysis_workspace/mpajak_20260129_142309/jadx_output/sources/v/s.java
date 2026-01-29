package v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import v.o;

/* loaded from: classes13.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final c f5528e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final o<Object, Object> f5529f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<b<?, ?>> f5530a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5531b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b<?, ?>> f5532c;

    /* renamed from: d, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f5533d;

    /* loaded from: classes4.dex */
    public static class a implements o<Object, Object> {
        @Override // v.o
        @Nullable
        public final o.a<Object> a(@NonNull Object obj, int i5, int i6, @NonNull p.h hVar) {
            return null;
        }

        @Override // v.o
        public final boolean b(@NonNull Object obj) {
            return false;
        }
    }

    /* loaded from: classes11.dex */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Model> f5534a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<Data> f5535b;

        /* renamed from: c, reason: collision with root package name */
        public final p<? extends Model, ? extends Data> f5536c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<? extends Model, ? extends Data> pVar) {
            this.f5534a = cls;
            this.f5535b = cls2;
            this.f5536c = pVar;
        }

        public final boolean a(@NonNull Class<?> cls) {
            return this.f5534a.isAssignableFrom(cls);
        }
    }

    /* loaded from: classes24.dex */
    public static class c {
    }

    public s(@NonNull Pools.Pool<List<Throwable>> pool) {
        c cVar = f5528e;
        this.f5530a = new ArrayList();
        this.f5532c = new HashSet();
        this.f5533d = pool;
        this.f5531b = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    @NonNull
    public final synchronized <Model> List<o<Model, ?>> a(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f5530a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f5532c.contains(bVar) && bVar.a(cls)) {
                    this.f5532c.add(bVar);
                    o b5 = bVar.f5536c.b(this);
                    Objects.requireNonNull(b5, "Argument must not be null");
                    arrayList.add(b5);
                    this.f5532c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f5532c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashSet, java.util.Set<v.s$b<?, ?>>] */
    @NonNull
    public final synchronized <Model, Data> o<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f5530a.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                b<?, ?> bVar = (b) it.next();
                if (this.f5532c.contains(bVar)) {
                    z4 = true;
                } else {
                    if (bVar.a(cls) && bVar.f5535b.isAssignableFrom(cls2)) {
                        this.f5532c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f5532c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f5531b;
                Pools.Pool<List<Throwable>> pool = this.f5533d;
                Objects.requireNonNull(cVar);
                return new r(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            }
            if (z4) {
                return (o<Model, Data>) f5529f;
            }
            throw new g.c((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.f5532c.clear();
            throw th;
        }
    }

    @NonNull
    public final <Model, Data> o<Model, Data> c(@NonNull b<?, ?> bVar) {
        o<Model, Data> oVar = (o<Model, Data>) bVar.f5536c.b(this);
        Objects.requireNonNull(oVar, "Argument must not be null");
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<v.s$b<?, ?>>] */
    @NonNull
    public final synchronized List<Class<?>> d(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f5530a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f5535b) && bVar.a(cls)) {
                arrayList.add(bVar.f5535b);
            }
        }
        return arrayList;
    }
}
