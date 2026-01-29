package f3;

/* loaded from: classes25.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f2833a;

    /* renamed from: b, reason: collision with root package name */
    public String f2834b;

    public n(int i5, String str) {
        this.f2833a = i5;
        this.f2834b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n.class == obj.getClass() && this.f2833a == ((n) obj).f2833a;
    }

    public final int hashCode() {
        return this.f2833a;
    }

    public final String toString() {
        return this.f2834b;
    }
}
