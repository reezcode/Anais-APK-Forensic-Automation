package m3;

/* loaded from: classes12.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f4181a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<k0> f4182b = new ThreadLocal<>();

    public static final k0 a() {
        ThreadLocal<k0> threadLocal = f4182b;
        k0 k0Var = threadLocal.get();
        if (k0Var != null) {
            return k0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
