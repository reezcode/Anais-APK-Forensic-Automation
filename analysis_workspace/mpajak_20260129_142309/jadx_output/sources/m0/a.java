package m0;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import m0.d;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e<Object> f4148a = new C0049a();

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public class C0049a implements e<Object> {
        @Override // m0.a.e
        public final void a(@NonNull Object obj) {
        }
    }

    /* loaded from: classes25.dex */
    public interface b<T> {
        T a();
    }

    /* loaded from: classes12.dex */
    public static final class c<T> implements Pools.Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f4149a;

        /* renamed from: b, reason: collision with root package name */
        public final e<T> f4150b;

        /* renamed from: c, reason: collision with root package name */
        public final Pools.Pool<T> f4151c;

        public c(@NonNull Pools.Pool<T> pool, @NonNull b<T> bVar, @NonNull e<T> eVar) {
            this.f4151c = pool;
            this.f4149a = bVar;
            this.f4150b = eVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public final T acquire() {
            T acquire = this.f4151c.acquire();
            if (acquire == null) {
                acquire = this.f4149a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder g5 = androidx.activity.d.g("Created new ");
                    g5.append(acquire.getClass());
                    Log.v("FactoryPools", g5.toString());
                }
            }
            if (acquire instanceof d) {
                ((d.a) acquire.c()).f4152a = false;
            }
            return (T) acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean release(@NonNull T t4) {
            if (t4 instanceof d) {
                ((d.a) ((d) t4).c()).f4152a = true;
            }
            this.f4150b.a(t4);
            return this.f4151c.release(t4);
        }
    }

    /* loaded from: classes19.dex */
    public interface d {
        @NonNull
        m0.d c();
    }

    /* loaded from: classes6.dex */
    public interface e<T> {
        void a(@NonNull T t4);
    }

    @NonNull
    public static <T extends d> Pools.Pool<T> a(int i5, @NonNull b<T> bVar) {
        return new c(new Pools.SynchronizedPool(i5), bVar, f4148a);
    }
}
