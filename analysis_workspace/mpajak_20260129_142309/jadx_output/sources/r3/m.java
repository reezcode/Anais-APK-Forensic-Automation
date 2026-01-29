package r3;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5076b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5077c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5078d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5079e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<g> f5080a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z4) {
        if (z4) {
            return b(gVar);
        }
        g gVar2 = (g) f5076b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        if (gVar.f5065c.b() == 1) {
            f5079e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i5 = this.producerIndex & 127;
        while (this.f5080a.get(i5) != null) {
            Thread.yield();
        }
        this.f5080a.lazySet(i5, gVar);
        f5077c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g gVar = (g) f5076b.getAndSet(this, null);
        return gVar == null ? e() : gVar;
    }

    public final g e() {
        g andSet;
        while (true) {
            int i5 = this.consumerIndex;
            if (i5 - this.producerIndex == 0) {
                return null;
            }
            int i6 = i5 & 127;
            if (f5078d.compareAndSet(this, i5, i5 + 1) && (andSet = this.f5080a.getAndSet(i6, null)) != null) {
                if (andSet.f5065c.b() == 1) {
                    f5079e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long f(m mVar) {
        int i5 = mVar.consumerIndex;
        int i6 = mVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = mVar.f5080a;
        while (true) {
            if (i5 == i6) {
                break;
            }
            int i7 = i5 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i7);
            if (gVar != null) {
                if ((gVar.f5065c.b() == 1) && atomicReferenceArray.compareAndSet(i7, gVar, null)) {
                    f5079e.decrementAndGet(mVar);
                    a(gVar, false);
                    return -1L;
                }
            }
            i5++;
        }
        return g(mVar, true);
    }

    public final long g(m mVar, boolean z4) {
        g gVar;
        boolean z5;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar != null) {
                z5 = true;
                if (z4) {
                    if (!(gVar.f5065c.b() == 1)) {
                        return -2L;
                    }
                }
                Objects.requireNonNull(k.f5072e);
                long nanoTime = System.nanoTime() - gVar.f5064b;
                long j5 = k.f5068a;
                if (nanoTime >= j5) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5076b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, null)) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                            z5 = false;
                            break;
                        }
                    }
                } else {
                    return j5 - nanoTime;
                }
            } else {
                return -2L;
            }
        } while (!z5);
        a(gVar, false);
        return -1L;
    }
}
