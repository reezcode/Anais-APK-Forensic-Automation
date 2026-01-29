package v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes22.dex */
public interface o<Model, Data> {

    /* loaded from: classes10.dex */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final p.f f5512a;

        /* renamed from: b, reason: collision with root package name */
        public final List<p.f> f5513b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f5514c;

        public a(@NonNull p.f fVar, @NonNull com.bumptech.glide.load.data.d<Data> dVar) {
            List<p.f> emptyList = Collections.emptyList();
            Objects.requireNonNull(fVar, "Argument must not be null");
            this.f5512a = fVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f5513b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f5514c = dVar;
        }
    }

    @Nullable
    a<Data> a(@NonNull Model model, int i5, int i6, @NonNull p.h hVar);

    boolean b(@NonNull Model model);
}
