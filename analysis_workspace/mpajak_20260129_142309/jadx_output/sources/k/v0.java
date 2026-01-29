package k;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f3745a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3746b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3747c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3748d;

    public v0(v0 v0Var, Object obj, Object obj2, int i5) {
        this.f3745a = v0Var;
        this.f3746b = obj;
        this.f3747c = obj2;
        this.f3748d = i5;
    }

    public final String toString() {
        StringBuilder sb;
        if (this.f3745a == null) {
            return "$";
        }
        if (this.f3747c instanceof Integer) {
            sb = new StringBuilder();
            sb.append(this.f3745a.toString());
            sb.append("[");
            sb.append(this.f3747c);
            sb.append("]");
        } else {
            sb = new StringBuilder();
            sb.append(this.f3745a.toString());
            sb.append(".");
            sb.append(this.f3747c);
        }
        return sb.toString();
    }
}
