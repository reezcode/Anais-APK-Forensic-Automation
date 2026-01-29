package m0;

/* loaded from: classes10.dex */
public abstract class d {

    /* loaded from: classes15.dex */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f4152a;

        public final void a() {
            if (this.f4152a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
