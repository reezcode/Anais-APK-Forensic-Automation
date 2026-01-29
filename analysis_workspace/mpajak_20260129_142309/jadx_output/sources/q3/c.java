package q3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes16.dex */
public abstract class c<T> extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4759a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = b.f4758a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q3.n
    public final Object a(Object obj) {
        boolean z4;
        Object obj2 = this._consensus;
        r rVar = b.f4758a;
        if (obj2 == rVar) {
            Object c5 = c(obj);
            obj2 = this._consensus;
            if (obj2 == rVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4759a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, c5)) {
                        z4 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != rVar) {
                        z4 = false;
                        break;
                    }
                }
                obj2 = z4 ? c5 : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t4, Object obj);

    public abstract Object c(T t4);
}
