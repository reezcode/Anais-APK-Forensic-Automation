package d0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<a<?, ?>> f2468a = new ArrayList();

    /* loaded from: classes6.dex */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Z> f2469a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f2470b;

        /* renamed from: c, reason: collision with root package name */
        public final e<Z, R> f2471c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.f2469a = cls;
            this.f2470b = cls2;
            this.f2471c = eVar;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<d0.f$a<?, ?>>] */
    @NonNull
    public final synchronized <Z, R> List<Class<R>> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f2468a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f2469a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f2470b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
