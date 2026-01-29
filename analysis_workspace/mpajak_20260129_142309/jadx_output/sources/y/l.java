package y;

/* loaded from: classes19.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5989a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final a f5990b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final b f5991c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f5992d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f5993e;

    /* renamed from: f, reason: collision with root package name */
    public static final p.g<l> f5994f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5995g;

    /* loaded from: classes23.dex */
    public static class a extends l {
        @Override // y.l
        public final int a(int i5, int i6, int i7, int i8) {
            return (b(i5, i6, i7, i8) == 1.0f || l.f5995g) ? 2 : 1;
        }

        @Override // y.l
        public final float b(int i5, int i6, int i7, int i8) {
            return Math.min(1.0f, l.f5989a.b(i5, i6, i7, i8));
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends l {
        @Override // y.l
        public final int a(int i5, int i6, int i7, int i8) {
            return 2;
        }

        @Override // y.l
        public final float b(int i5, int i6, int i7, int i8) {
            return Math.max(i7 / i5, i8 / i6);
        }
    }

    /* loaded from: classes16.dex */
    public static class c extends l {
        @Override // y.l
        public final int a(int i5, int i6, int i7, int i8) {
            return l.f5995g ? 2 : 1;
        }

        @Override // y.l
        public final float b(int i5, int i6, int i7, int i8) {
            if (l.f5995g) {
                return Math.min(i7 / i5, i8 / i6);
            }
            if (Math.max(i6 / i8, i5 / i7) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* loaded from: classes17.dex */
    public static class d extends l {
        @Override // y.l
        public final int a(int i5, int i6, int i7, int i8) {
            return 2;
        }

        @Override // y.l
        public final float b(int i5, int i6, int i7, int i8) {
            return 1.0f;
        }
    }

    static {
        b bVar = new b();
        f5991c = bVar;
        f5992d = new d();
        f5993e = bVar;
        f5994f = p.g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
        f5995g = true;
    }

    public abstract int a(int i5, int i6, int i7, int i8);

    public abstract float b(int i5, int i6, int i7, int i8);
}
