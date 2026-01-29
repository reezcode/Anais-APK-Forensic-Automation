package d1;

import java.lang.ref.Reference;
import java.util.List;
import java.util.Vector;

/* loaded from: classes8.dex */
public final class i extends f {

    /* renamed from: b, reason: collision with root package name */
    public final g f2485b = new g();

    @Override // d1.f
    public final void L(Throwable th, Throwable th2) {
        List<Throwable> putIfAbsent;
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        g gVar = this.f2485b;
        while (true) {
            Reference<? extends Throwable> poll = gVar.f2483b.poll();
            if (poll == null) {
                break;
            } else {
                gVar.f2482a.remove(poll);
            }
        }
        List<Throwable> list = gVar.f2482a.get(new h(th, null));
        if (list == null && (putIfAbsent = gVar.f2482a.putIfAbsent(new h(th, gVar.f2483b), (list = new Vector<>(2)))) != null) {
            list = putIfAbsent;
        }
        list.add(th2);
    }
}
