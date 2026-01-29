package v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import v.n;

/* loaded from: classes2.dex */
public final class m extends l0.g<n.a<Object>, Object> {
    public m() {
        super(500L);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayDeque, java.util.Queue<v.n$a<?>>] */
    @Override // l0.g
    public final void c(@NonNull n.a<Object> aVar, @Nullable Object obj) {
        n.a<Object> aVar2 = aVar;
        Objects.requireNonNull(aVar2);
        ?? r22 = n.a.f5508d;
        synchronized (r22) {
            r22.offer(aVar2);
        }
    }
}
