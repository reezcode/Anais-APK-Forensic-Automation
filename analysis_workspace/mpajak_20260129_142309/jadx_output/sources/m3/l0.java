package m3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public abstract class l0 extends m0 implements d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4190f = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_queue");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4191g = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes11.dex */
    public static abstract class a implements Runnable, Comparable<a>, i0, q3.v {
        private volatile Object _heap;

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public long f4192b;

        /* renamed from: c, reason: collision with root package name */
        public int f4193c;

        @Override // q3.v
        public final void a(q3.u<?> uVar) {
            if (!(this._heap != d1.d.f2478f)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = uVar;
        }

        @Override // q3.v
        public final void b(int i5) {
            this.f4193c = i5;
        }

        @Override // m3.i0
        public final synchronized void c() {
            Object obj = this._heap;
            q3.r rVar = d1.d.f2478f;
            if (obj == rVar) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                synchronized (bVar) {
                    if (e() != null) {
                        bVar.d(getIndex());
                    }
                }
            }
            this._heap = rVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            long j5 = this.f4192b - aVar.f4192b;
            if (j5 > 0) {
                return 1;
            }
            return j5 < 0 ? -1 : 0;
        }

        @Override // q3.v
        public final q3.u<?> e() {
            Object obj = this._heap;
            if (obj instanceof q3.u) {
                return (q3.u) obj;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
        
            if ((r8 - r10.f4194b) > 0) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int f(long r8, m3.l0.b r10, m3.l0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L48
                q3.r r1 = d1.d.f2478f     // Catch: java.lang.Throwable -> L48
                if (r0 != r1) goto L9
                r8 = 2
                goto L43
            L9:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L48
                q3.v r0 = r10.b()     // Catch: java.lang.Throwable -> L45
                m3.l0$a r0 = (m3.l0.a) r0     // Catch: java.lang.Throwable -> L45
                boolean r11 = m3.l0.M(r11)     // Catch: java.lang.Throwable -> L45
                if (r11 == 0) goto L1a
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r7)
                return r8
            L1a:
                r1 = 0
                if (r0 != 0) goto L1f
                goto L31
            L1f:
                long r3 = r0.f4192b     // Catch: java.lang.Throwable -> L45
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L28
                goto L29
            L28:
                r8 = r3
            L29:
                long r3 = r10.f4194b     // Catch: java.lang.Throwable -> L45
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L33
            L31:
                r10.f4194b = r8     // Catch: java.lang.Throwable -> L45
            L33:
                long r8 = r7.f4192b     // Catch: java.lang.Throwable -> L45
                long r3 = r10.f4194b     // Catch: java.lang.Throwable -> L45
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L3e
                r7.f4192b = r3     // Catch: java.lang.Throwable -> L45
            L3e:
                r10.a(r7)     // Catch: java.lang.Throwable -> L45
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L48
                r8 = 0
            L43:
                monitor-exit(r7)
                return r8
            L45:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L48
                throw r8     // Catch: java.lang.Throwable -> L48
            L48:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: m3.l0.a.f(long, m3.l0$b, m3.l0):int");
        }

        @Override // q3.v
        public final int getIndex() {
            return this.f4193c;
        }

        public final String toString() {
            StringBuilder g5 = androidx.activity.d.g("Delayed[nanos=");
            g5.append(this.f4192b);
            g5.append(']');
            return g5.toString();
        }
    }

    public static final class b extends q3.u<a> {

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public long f4194b;

        public b(long j5) {
            this.f4194b = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean M(l0 l0Var) {
        return l0Var._isCompleted;
    }

    public void N(Runnable runnable) {
        if (!P(runnable)) {
            b0.f4164h.N(runnable);
            return;
        }
        Thread J = J();
        if (Thread.currentThread() != J) {
            LockSupport.unpark(J);
        }
    }

    public final boolean P(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z4 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4190f;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z4 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z4) {
                    return true;
                }
            } else if (obj instanceof q3.k) {
                q3.k kVar = (q3.k) obj;
                int a5 = kVar.a(runnable);
                if (a5 == 0) {
                    return true;
                }
                if (a5 == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4190f;
                    q3.k e5 = kVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e5) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a5 == 2) {
                    return false;
                }
            } else {
                if (obj == d1.d.f2479g) {
                    return false;
                }
                q3.k kVar2 = new q3.k(8, true);
                kVar2.a((Runnable) obj);
                kVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f4190f;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, kVar2)) {
                        z4 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z4) {
                    return true;
                }
            }
        }
    }

    public final boolean Q() {
        q3.a<g0<?>> aVar = this.f4188e;
        if (!(aVar == null || aVar.f4756b == aVar.f4757c)) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        return obj instanceof q3.k ? ((q3.k) obj).d() : obj == d1.d.f2479g;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long R() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.l0.R():long");
    }

    public final void S() {
        this._queue = null;
        this._delayed = null;
    }

    public final void U(long j5, a aVar) {
        int f5;
        Thread J;
        a b5;
        a aVar2 = null;
        if (this._isCompleted != 0) {
            f5 = 1;
        } else {
            b bVar = (b) this._delayed;
            if (bVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4191g;
                b bVar2 = new b(j5);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, bVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                Intrinsics.checkNotNull(obj);
                bVar = (b) obj;
            }
            f5 = aVar.f(j5, bVar, this);
        }
        if (f5 != 0) {
            if (f5 == 1) {
                K(j5, aVar);
                return;
            } else {
                if (f5 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        b bVar3 = (b) this._delayed;
        if (bVar3 != null) {
            synchronized (bVar3) {
                b5 = bVar3.b();
            }
            aVar2 = b5;
        }
        if (!(aVar2 == aVar) || Thread.currentThread() == (J = J())) {
            return;
        }
        LockSupport.unpark(J);
    }

    @Override // m3.v
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        N(runnable);
    }

    @Override // m3.k0
    public void shutdown() {
        a e5;
        h1 h1Var = h1.f4181a;
        h1.f4182b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z4 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4190f;
                q3.r rVar = d1.d.f2479g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                        z4 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z4) {
                    break;
                }
            } else {
                if (obj instanceof q3.k) {
                    ((q3.k) obj).b();
                    break;
                }
                if (obj == d1.d.f2479g) {
                    break;
                }
                q3.k kVar = new q3.k(8, true);
                kVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4190f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVar)) {
                        z4 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z4) {
                    break;
                }
            }
        }
        while (R() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar == null || (e5 = bVar.e()) == null) {
                return;
            } else {
                K(nanoTime, e5);
            }
        }
    }
}
