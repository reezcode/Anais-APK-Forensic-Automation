package q3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes12.dex */
public class j<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4778a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new k(8, false);

    public final boolean a(E e5) {
        while (true) {
            k kVar = (k) this._cur;
            int a5 = kVar.a(e5);
            if (a5 == 0) {
                return true;
            }
            if (a5 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4778a;
                k<E> e6 = kVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, e6) && atomicReferenceFieldUpdater.get(this) == kVar) {
                }
            } else if (a5 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            k kVar = (k) this._cur;
            if (kVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4778a;
            k<E> e5 = kVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, e5) && atomicReferenceFieldUpdater.get(this) == kVar) {
            }
        }
    }

    public final int c() {
        return ((k) this._cur).c();
    }

    public final E d() {
        while (true) {
            k kVar = (k) this._cur;
            E e5 = (E) kVar.f();
            if (e5 != k.f4781g) {
                return e5;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4778a;
            k<E> e6 = kVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, e6) && atomicReferenceFieldUpdater.get(this) == kVar) {
            }
        }
    }
}
