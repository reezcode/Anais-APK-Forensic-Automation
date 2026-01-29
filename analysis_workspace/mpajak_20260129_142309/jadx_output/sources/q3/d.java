package q3;

import kotlin.coroutines.CoroutineContext;
import m3.y;

/* loaded from: classes7.dex */
public final class d implements y {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f4760b;

    public d(CoroutineContext coroutineContext) {
        this.f4760b = coroutineContext;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("CoroutineScope(coroutineContext=");
        g5.append(this.f4760b);
        g5.append(')');
        return g5.toString();
    }
}
