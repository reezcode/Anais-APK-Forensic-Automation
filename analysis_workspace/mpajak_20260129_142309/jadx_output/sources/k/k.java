package k;

/* loaded from: classes22.dex */
public abstract class k implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<g0> f3723a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<Character> f3724b = new ThreadLocal<>();

    public final char e(g0 g0Var, Object obj, char c5) {
        ThreadLocal<g0> threadLocal = f3723a;
        threadLocal.set(g0Var);
        ThreadLocal<Character> threadLocal2 = f3724b;
        threadLocal2.set(Character.valueOf(c5));
        f();
        threadLocal.set(null);
        return threadLocal2.get().charValue();
    }

    public abstract void f();
}
