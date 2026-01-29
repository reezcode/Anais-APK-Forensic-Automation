package s;

import java.util.ArrayDeque;
import java.util.Queue;
import s.l;

/* loaded from: classes10.dex */
public abstract class c<T extends l> {

    /* renamed from: a, reason: collision with root package name */
    public final Queue<T> f5081a;

    public c() {
        char[] cArr = l0.k.f3942a;
        this.f5081a = new ArrayDeque(20);
    }

    public abstract T a();

    public final T b() {
        T t4 = (T) this.f5081a.poll();
        return t4 == null ? a() : t4;
    }

    public final void c(T t4) {
        if (this.f5081a.size() < 20) {
            this.f5081a.offer(t4);
        }
    }
}
