package h;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f3010a;

    /* renamed from: b, reason: collision with root package name */
    public int f3011b;

    /* renamed from: c, reason: collision with root package name */
    public int f3012c;

    /* renamed from: d, reason: collision with root package name */
    public long f3013d;

    /* renamed from: e, reason: collision with root package name */
    public String f3014e;

    /* renamed from: f, reason: collision with root package name */
    public String f3015f;

    /* renamed from: g, reason: collision with root package name */
    public String f3016g;

    /* renamed from: h, reason: collision with root package name */
    public int f3017h;

    /* renamed from: i, reason: collision with root package name */
    public e f3018i;

    public e() {
    }

    public e(int i5, e eVar) {
        this.f3010a = i5;
        this.f3011b = eVar.f3011b;
        this.f3012c = eVar.f3012c;
        this.f3013d = eVar.f3013d;
        this.f3014e = eVar.f3014e;
        this.f3015f = eVar.f3015f;
        this.f3016g = eVar.f3016g;
        this.f3017h = eVar.f3017h;
    }

    public final void a(int i5, String str, String str2, String str3) {
        int hashCode;
        int i6;
        this.f3011b = i5;
        this.f3014e = str;
        this.f3015f = str2;
        this.f3016g = str3;
        if (i5 != 1 && i5 != 7 && i5 != 8) {
            if (i5 == 12) {
                i6 = ((str2.hashCode() * str.hashCode()) + i5) & Integer.MAX_VALUE;
                this.f3017h = i6;
            } else if (i5 != 13) {
                hashCode = str3.hashCode() * str2.hashCode() * str.hashCode();
                i6 = (hashCode + i5) & Integer.MAX_VALUE;
                this.f3017h = i6;
            }
        }
        hashCode = str.hashCode();
        i6 = (hashCode + i5) & Integer.MAX_VALUE;
        this.f3017h = i6;
    }
}
