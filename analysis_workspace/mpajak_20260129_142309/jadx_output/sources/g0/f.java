package g0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p.k;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<a<?>> f2922a = new ArrayList();

    /* loaded from: classes6.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f2923a;

        /* renamed from: b, reason: collision with root package name */
        public final k<T> f2924b;

        public a(@NonNull Class<T> cls, @NonNull k<T> kVar) {
            this.f2923a = cls;
            this.f2924b = kVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<g0.f$a<?>>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<g0.f$a<?>>] */
    @Nullable
    public final synchronized <Z> k<Z> a(@NonNull Class<Z> cls) {
        int size = this.f2922a.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) this.f2922a.get(i5);
            if (aVar.f2923a.isAssignableFrom(cls)) {
                return (k<Z>) aVar.f2924b;
            }
        }
        return null;
    }
}
