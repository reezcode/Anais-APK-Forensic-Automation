package h;

/* loaded from: classes23.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3024b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3027e;

    /* renamed from: d, reason: collision with root package name */
    public final StringBuffer f3026d = new StringBuffer();

    /* renamed from: c, reason: collision with root package name */
    public int f3025c = 0;

    public g(int i5, int i6) {
        this.f3024b = i5;
        this.f3023a = i6;
        this.f3027e = i6 == 0;
    }

    public final String a() {
        return this.f3026d.length() != 0 ? this.f3026d.substring(1) : "";
    }
}
