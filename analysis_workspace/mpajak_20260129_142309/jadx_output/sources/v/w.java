package v;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.d;
import v.o;

/* loaded from: classes5.dex */
public final class w<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    public static final w<?> f5545a = new w<>();

    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        public static final a<?> f5546a = new a<>();

        @Deprecated
        public a() {
        }

        @Override // v.p
        @NonNull
        public final o<Model, Model> b(s sVar) {
            return w.f5545a;
        }
    }

    /* loaded from: classes23.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: b, reason: collision with root package name */
        public final Model f5547b;

        public b(Model model) {
            this.f5547b = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final Class<Model> a() {
            return (Class<Model>) this.f5547b.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public final p.a e() {
            return p.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void f(@NonNull com.bumptech.glide.f fVar, @NonNull d.a<? super Model> aVar) {
            aVar.d(this.f5547b);
        }
    }

    @Deprecated
    public w() {
    }

    @Override // v.o
    public final o.a<Model> a(@NonNull Model model, int i5, int i6, @NonNull p.h hVar) {
        return new o.a<>(new k0.d(model), new b(model));
    }

    @Override // v.o
    public final boolean b(@NonNull Model model) {
        return true;
    }
}
