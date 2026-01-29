package c3;

/* loaded from: classes21.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public ThreadLocal<C0012a> f522a = new ThreadLocal<>();

    /* renamed from: c3.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0012a {

        /* renamed from: a, reason: collision with root package name */
        public final d f523a;

        /* renamed from: b, reason: collision with root package name */
        public int f524b = 1;

        public C0012a(d dVar) {
            this.f523a = dVar;
        }
    }

    public final d a() {
        C0012a c0012a = this.f522a.get();
        if (c0012a == null) {
            return null;
        }
        return c0012a.f523a;
    }
}
