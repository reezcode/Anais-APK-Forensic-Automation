package i2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public final class l extends n implements Iterable<n> {

    /* renamed from: b, reason: collision with root package name */
    public final List<n> f3299b = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f3299b.equals(this.f3299b));
    }

    public final int hashCode() {
        return this.f3299b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i2.n>] */
    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return this.f3299b.iterator();
    }
}
