package h;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public d f3007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3009c;

    public d(c cVar, String str, String str2) {
        if (cVar.f3003n == null) {
            cVar.f3003n = this;
        } else {
            cVar.f3004o.f3007a = this;
        }
        cVar.f3004o = this;
        this.f3008b = cVar.d(str);
        this.f3009c = cVar.d(str2);
    }
}
