package d1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class h extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public final int f2484a;

    public h(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f2484a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == h.class) {
            if (this == obj) {
                return true;
            }
            h hVar = (h) obj;
            if (this.f2484a == hVar.f2484a && get() == hVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2484a;
    }
}
