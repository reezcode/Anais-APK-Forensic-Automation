package v;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final s f5515a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5516b;

    /* loaded from: classes10.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, C0076a<?>> f5517a = new HashMap();

        /* renamed from: v.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes24.dex */
        public static class C0076a<Model> {

            /* renamed from: a, reason: collision with root package name */
            public final List<o<Model, ?>> f5518a;

            public C0076a(List<o<Model, ?>> list) {
                this.f5518a = list;
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, v.q$a$a<?>>] */
        public final <Model> void a(Class<Model> cls, List<o<Model, ?>> list) {
            if (((C0076a) this.f5517a.put(cls, new C0076a(list))) != null) {
                throw new IllegalStateException(androidx.activity.d.e("Already cached loaders for model: ", cls));
            }
        }
    }

    public q(@NonNull Pools.Pool<List<Throwable>> pool) {
        s sVar = new s(pool);
        this.f5516b = new a();
        this.f5515a = sVar;
    }
}
