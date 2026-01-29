package v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v.o;

/* loaded from: classes15.dex */
public final class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List<o<Model, Data>> f5519a;

    /* renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f5520b;

    /* loaded from: classes17.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f5521b;

        /* renamed from: c, reason: collision with root package name */
        public final Pools.Pool<List<Throwable>> f5522c;

        /* renamed from: d, reason: collision with root package name */
        public int f5523d;

        /* renamed from: e, reason: collision with root package name */
        public com.bumptech.glide.f f5524e;

        /* renamed from: f, reason: collision with root package name */
        public d.a<? super Data> f5525f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public List<Throwable> f5526g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5527h;

        public a(@NonNull List<com.bumptech.glide.load.data.d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f5522c = pool;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f5521b = list;
            this.f5523d = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Data> a() {
            return this.f5521b.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f5526g;
            if (list != null) {
                this.f5522c.release(list);
            }
            this.f5526g = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f5521b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(@NonNull Exception exc) {
            List<Throwable> list = this.f5526g;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f5527h = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f5521b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void d(@Nullable Data data) {
            if (data != null) {
                this.f5525f.d(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final p.a e() {
            return this.f5521b.get(0).e();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super Data> aVar) {
            this.f5524e = fVar;
            this.f5525f = aVar;
            this.f5526g = this.f5522c.acquire();
            this.f5521b.get(this.f5523d).f(fVar, this);
            if (this.f5527h) {
                cancel();
            }
        }

        public final void g() {
            if (this.f5527h) {
                return;
            }
            if (this.f5523d < this.f5521b.size() - 1) {
                this.f5523d++;
                f(this.f5524e, this.f5525f);
            } else {
                l0.j.b(this.f5526g);
                this.f5525f.c(new r.r("Fetch failed", new ArrayList(this.f5526g)));
            }
        }
    }

    public r(@NonNull List<o<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f5519a = list;
        this.f5520b = pool;
    }

    @Override // v.o
    public final o.a<Data> a(@NonNull Model model, int i5, int i6, @NonNull p.h hVar) {
        o.a<Data> a5;
        int size = this.f5519a.size();
        ArrayList arrayList = new ArrayList(size);
        p.f fVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            o<Model, Data> oVar = this.f5519a.get(i7);
            if (oVar.b(model) && (a5 = oVar.a(model, i5, i6, hVar)) != null) {
                fVar = a5.f5512a;
                arrayList.add(a5.f5514c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f5520b));
    }

    @Override // v.o
    public final boolean b(@NonNull Model model) {
        Iterator<o<Model, Data>> it = this.f5519a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("MultiModelLoader{modelLoaders=");
        g5.append(Arrays.toString(this.f5519a.toArray()));
        g5.append('}');
        return g5.toString();
    }
}
