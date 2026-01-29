package m3;

/* loaded from: classes24.dex */
public final class j0 implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4185b;

    public j0(boolean z4) {
        this.f4185b = z4;
    }

    @Override // m3.p0
    public final b1 a() {
        return null;
    }

    @Override // m3.p0
    public final boolean isActive() {
        return this.f4185b;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Empty{");
        g5.append(this.f4185b ? "Active" : "New");
        g5.append('}');
        return g5.toString();
    }
}
