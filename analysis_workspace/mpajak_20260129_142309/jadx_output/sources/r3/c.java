package r3;

/* loaded from: classes8.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final c f5061d = new c();

    public c() {
        super(k.f5069b, k.f5070c, k.f5071d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // m3.v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
