package r3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import m3.a0;
import q3.p;
import q3.r;

/* loaded from: classes22.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final int f5044b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public final int f5045c;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public final long f5046d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public final String f5047e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public final d f5048f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public final d f5049g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public final p<C0065a> f5050h;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final r f5043l = new r("NOT_IN_STACK");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5040i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5041j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5042k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: r3.a$a, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public final class C0065a extends Thread {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f5051i = AtomicIntegerFieldUpdater.newUpdater(C0065a.class, "workerCtl");

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public final m f5052b;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public int f5053c;

        /* renamed from: d, reason: collision with root package name */
        public long f5054d;

        /* renamed from: e, reason: collision with root package name */
        public long f5055e;

        /* renamed from: f, reason: collision with root package name */
        public int f5056f;

        /* renamed from: g, reason: collision with root package name */
        @JvmField
        public boolean f5057g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public C0065a(int i5) {
            setDaemon(true);
            this.f5052b = new m();
            this.f5053c = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f5043l;
            this.f5056f = Random.Default.nextInt();
            f(i5);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final r3.g a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f5053c
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L7
                goto L2e
            L7:
                r3.a r0 = r3.a.this
            L9:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r4 = (int) r3
                if (r4 != 0) goto L19
                r0 = 0
                goto L2a
            L19:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = r3.a.f5041j
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L9
                r0 = 1
            L2a:
                if (r0 == 0) goto L30
                r9.f5053c = r2
            L2e:
                r0 = 1
                goto L31
            L30:
                r0 = 0
            L31:
                if (r0 == 0) goto L6a
                if (r10 == 0) goto L5e
                r3.a r10 = r3.a.this
                int r10 = r10.f5044b
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L42
                goto L43
            L42:
                r2 = 0
            L43:
                if (r2 == 0) goto L4c
                r3.g r10 = r9.e()
                if (r10 == 0) goto L4c
                goto L69
            L4c:
                r3.m r10 = r9.f5052b
                r3.g r10 = r10.d()
                if (r10 == 0) goto L55
                goto L69
            L55:
                if (r2 != 0) goto L65
                r3.g r10 = r9.e()
                if (r10 == 0) goto L65
                goto L69
            L5e:
                r3.g r10 = r9.e()
                if (r10 == 0) goto L65
                goto L69
            L65:
                r3.g r10 = r9.i(r1)
            L69:
                return r10
            L6a:
                if (r10 == 0) goto L74
                r3.m r10 = r9.f5052b
                r3.g r10 = r10.d()
                if (r10 != 0) goto L7e
            L74:
                r3.a r10 = r3.a.this
                r3.d r10 = r10.f5049g
                java.lang.Object r10 = r10.d()
                r3.g r10 = (r3.g) r10
            L7e:
                if (r10 != 0) goto L84
                r3.g r10 = r9.i(r2)
            L84:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.a.C0065a.a(boolean):r3.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i5) {
            int i6 = this.f5056f;
            int i7 = i6 ^ (i6 << 13);
            int i8 = i7 ^ (i7 >> 17);
            int i9 = i8 ^ (i8 << 5);
            this.f5056f = i9;
            int i10 = i5 - 1;
            return (i10 & i5) == 0 ? i9 & i10 : (i9 & Integer.MAX_VALUE) % i5;
        }

        public final g e() {
            d dVar;
            if (d(2) == 0) {
                g d5 = a.this.f5048f.d();
                if (d5 != null) {
                    return d5;
                }
                dVar = a.this.f5049g;
            } else {
                g d6 = a.this.f5049g.d();
                if (d6 != null) {
                    return d6;
                }
                dVar = a.this.f5048f;
            }
            return dVar.d();
        }

        public final void f(int i5) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f5047e);
            sb.append("-worker-");
            sb.append(i5 == 0 ? "TERMINATED" : String.valueOf(i5));
            setName(sb.toString());
            this.indexInArray = i5;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i5) {
            int i6 = this.f5053c;
            boolean z4 = i6 == 1;
            if (z4) {
                a.f5041j.addAndGet(a.this, 4398046511104L);
            }
            if (i6 != i5) {
                this.f5053c = i5;
            }
            return z4;
        }

        public final g i(boolean z4) {
            long g5;
            int i5 = (int) (a.this.controlState & 2097151);
            if (i5 < 2) {
                return null;
            }
            int d5 = d(i5);
            a aVar = a.this;
            long j5 = Long.MAX_VALUE;
            for (int i6 = 0; i6 < i5; i6++) {
                d5++;
                if (d5 > i5) {
                    d5 = 1;
                }
                C0065a b5 = aVar.f5050h.b(d5);
                if (b5 != null && b5 != this) {
                    m mVar = this.f5052b;
                    m mVar2 = b5.f5052b;
                    if (z4) {
                        g5 = mVar.f(mVar2);
                    } else {
                        Objects.requireNonNull(mVar);
                        g e5 = mVar2.e();
                        if (e5 != null) {
                            mVar.a(e5, false);
                            g5 = -1;
                        } else {
                            g5 = mVar.g(mVar2, false);
                        }
                    }
                    if (g5 == -1) {
                        return this.f5052b.d();
                    }
                    if (g5 > 0) {
                        j5 = Math.min(j5, g5);
                    }
                }
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.f5055e = j5;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0002 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0065 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.a.C0065a.run():void");
        }
    }

    public a(int i5, int i6, long j5, String str) {
        this.f5044b = i5;
        this.f5045c = i6;
        this.f5046d = j5;
        this.f5047e = str;
        if (!(i5 >= 1)) {
            throw new IllegalArgumentException(androidx.activity.d.c("Core pool size ", i5, " should be at least 1").toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(androidx.activity.d.d("Max pool size ", i6, " should be greater than or equals to core pool size ", i5).toString());
        }
        if (!(i6 <= 2097150)) {
            throw new IllegalArgumentException(androidx.activity.d.c("Max pool size ", i6, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j5 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f5048f = new d();
        this.f5049g = new d();
        this.parkedWorkersStack = 0L;
        this.f5050h = new p<>(i5 + 1);
        this.controlState = i5 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        int i5;
        synchronized (this.f5050h) {
            if (this._isTerminated != 0) {
                i5 = -1;
            } else {
                long j5 = this.controlState;
                int i6 = (int) (j5 & 2097151);
                int coerceAtLeast = RangesKt.coerceAtLeast(i6 - ((int) ((j5 & 4398044413952L) >> 21)), 0);
                if (coerceAtLeast >= this.f5044b) {
                    return 0;
                }
                if (i6 >= this.f5045c) {
                    return 0;
                }
                int i7 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i7 > 0 && this.f5050h.b(i7) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C0065a c0065a = new C0065a(i7);
                this.f5050h.c(i7, c0065a);
                if (!(i7 == ((int) (2097151 & f5041j.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c0065a.start();
                i5 = coerceAtLeast + 1;
            }
            return i5;
        }
    }

    public final C0065a b() {
        Thread currentThread = Thread.currentThread();
        C0065a c0065a = currentThread instanceof C0065a ? (C0065a) currentThread : null;
        if (c0065a == null || !Intrinsics.areEqual(a.this, this)) {
            return null;
        }
        return c0065a;
    }

    public final void c(Runnable runnable, h hVar, boolean z4) {
        g jVar;
        g gVar;
        Objects.requireNonNull(k.f5072e);
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            jVar = (g) runnable;
            jVar.f5064b = nanoTime;
            jVar.f5065c = hVar;
        } else {
            jVar = new j(runnable, nanoTime, hVar);
        }
        C0065a b5 = b();
        if (b5 == null || b5.f5053c == 5 || (jVar.f5065c.b() == 0 && b5.f5053c == 2)) {
            gVar = jVar;
        } else {
            b5.f5057g = true;
            gVar = b5.f5052b.a(jVar, z4);
        }
        if (gVar != null) {
            if (!(gVar.f5065c.b() == 1 ? this.f5049g : this.f5048f).a(gVar)) {
                throw new RejectedExecutionException(androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), this.f5047e, " was terminated"));
            }
        }
        boolean z5 = z4 && b5 != null;
        if (jVar.f5065c.b() == 0) {
            if (z5 || p() || n(this.controlState)) {
                return;
            }
            p();
            return;
        }
        long addAndGet = f5041j.addAndGet(this, 2097152L);
        if (z5 || p() || n(addAndGet)) {
            return;
        }
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r1 == null) goto L31;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = r3.a.f5042k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto L94
        Lc:
            r3.a$a r0 = r9.b()
            q3.p<r3.a$a> r3 = r9.f5050h
            monitor-enter(r3)
            long r4 = r9.controlState     // Catch: java.lang.Throwable -> La8
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L62
            r3 = 1
        L1e:
            q3.p<r3.a$a> r4 = r9.f5050h
            java.lang.Object r4 = r4.b(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r3.a$a r4 = (r3.a.C0065a) r4
            if (r4 == r0) goto L5d
        L2b:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L3a
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L2b
        L3a:
            r3.m r4 = r4.f5052b
            r3.d r6 = r9.f5049g
            java.util.Objects.requireNonNull(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = r3.m.f5076b
            r8 = 0
            java.lang.Object r7 = r7.getAndSet(r4, r8)
            r3.g r7 = (r3.g) r7
            if (r7 == 0) goto L4f
            r6.a(r7)
        L4f:
            r3.g r7 = r4.e()
            if (r7 != 0) goto L57
            r7 = 0
            goto L5b
        L57:
            r6.a(r7)
            r7 = 1
        L5b:
            if (r7 != 0) goto L4f
        L5d:
            if (r3 == r5) goto L62
            int r3 = r3 + 1
            goto L1e
        L62:
            r3.d r1 = r9.f5049g
            r1.b()
            r3.d r1 = r9.f5048f
            r1.b()
        L6c:
            if (r0 == 0) goto L74
            r3.g r1 = r0.a(r2)
            if (r1 != 0) goto L95
        L74:
            r3.d r1 = r9.f5048f
            java.lang.Object r1 = r1.d()
            r3.g r1 = (r3.g) r1
            if (r1 != 0) goto L95
            r3.d r1 = r9.f5049g
            java.lang.Object r1 = r1.d()
            r3.g r1 = (r3.g) r1
            if (r1 != 0) goto L95
            if (r0 == 0) goto L8e
            r1 = 5
            r0.h(r1)
        L8e:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L94:
            return
        L95:
            r1.run()     // Catch: java.lang.Throwable -> L99
            goto L6c
        L99:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La6
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> La6
            r4.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> La6
            goto L6c
        La6:
            r0 = move-exception
            throw r0
        La8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.a.close():void");
    }

    public final int e(C0065a c0065a) {
        int b5;
        do {
            Object c5 = c0065a.c();
            if (c5 == f5043l) {
                return -1;
            }
            if (c5 == null) {
                return 0;
            }
            c0065a = (C0065a) c5;
            b5 = c0065a.b();
        } while (b5 == 0);
        return b5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, k.f5073f, false);
    }

    public final boolean f(C0065a c0065a) {
        long j5;
        int b5;
        if (c0065a.c() != f5043l) {
            return false;
        }
        do {
            j5 = this.parkedWorkersStack;
            b5 = c0065a.b();
            c0065a.g(this.f5050h.b((int) (2097151 & j5)));
        } while (!f5040i.compareAndSet(this, j5, ((2097152 + j5) & (-2097152)) | b5));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void l(C0065a c0065a, int i5, int i6) {
        while (true) {
            long j5 = this.parkedWorkersStack;
            int i7 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i7 == i5) {
                i7 = i6 == 0 ? e(c0065a) : i6;
            }
            if (i7 >= 0 && f5040i.compareAndSet(this, j5, j6 | i7)) {
                return;
            }
        }
    }

    public final boolean n(long j5) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21)), 0) < this.f5044b) {
            int a5 = a();
            if (a5 == 1 && this.f5044b > 1) {
                a();
            }
            if (a5 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        while (true) {
            long j5 = this.parkedWorkersStack;
            C0065a b5 = this.f5050h.b((int) (2097151 & j5));
            if (b5 == null) {
                b5 = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                int e5 = e(b5);
                if (e5 >= 0 && f5040i.compareAndSet(this, j5, e5 | j6)) {
                    b5.g(f5043l);
                }
            }
            if (b5 == null) {
                return false;
            }
            if (C0065a.f5051i.compareAndSet(b5, -1, 0)) {
                LockSupport.unpark(b5);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        char c5;
        ArrayList arrayList = new ArrayList();
        int a5 = this.f5050h.a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a5; i10++) {
            C0065a b5 = this.f5050h.b(i10);
            if (b5 != null) {
                int c6 = b5.f5052b.c();
                int a6 = f.h.a(b5.f5053c);
                if (a6 == 0) {
                    i5++;
                    sb = new StringBuilder();
                    sb.append(c6);
                    c5 = 'c';
                } else if (a6 == 1) {
                    i6++;
                    sb = new StringBuilder();
                    sb.append(c6);
                    c5 = 'b';
                } else if (a6 == 2) {
                    i7++;
                } else if (a6 == 3) {
                    i8++;
                    if (c6 > 0) {
                        sb = new StringBuilder();
                        sb.append(c6);
                        c5 = 'd';
                    }
                } else if (a6 == 4) {
                    i9++;
                }
                sb.append(c5);
                arrayList.add(sb.toString());
            }
        }
        long j5 = this.controlState;
        return this.f5047e + '@' + a0.b(this) + "[Pool Size {core = " + this.f5044b + ", max = " + this.f5045c + "}, Worker States {CPU = " + i5 + ", blocking = " + i6 + ", parked = " + i7 + ", dormant = " + i8 + ", terminated = " + i9 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f5048f.c() + ", global blocking queue size = " + this.f5049g.c() + ", Control State {created workers= " + ((int) (2097151 & j5)) + ", blocking tasks = " + ((int) ((4398044413952L & j5) >> 21)) + ", CPUs acquired = " + (this.f5044b - ((int) ((9223367638808264704L & j5) >> 42))) + "}]";
    }
}
