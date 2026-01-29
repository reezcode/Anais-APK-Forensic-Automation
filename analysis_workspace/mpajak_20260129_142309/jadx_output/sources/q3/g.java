package q3;

import kotlin.coroutines.CoroutineContext;
import m3.c0;
import m3.d0;

/* loaded from: classes11.dex */
public final class g extends m3.v implements Runnable, d0 {

    /* renamed from: c, reason: collision with root package name */
    public final m3.v f4768c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f4770e;

    /* renamed from: f, reason: collision with root package name */
    public final j<Runnable> f4771f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4772g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public g(m3.v vVar, int i5) {
        this.f4768c = vVar;
        this.f4769d = i5;
        d0 d0Var = vVar instanceof d0 ? (d0) vVar : null;
        this.f4770e = d0Var == null ? c0.f4167a : d0Var;
        this.f4771f = new j<>();
        this.f4772g = new Object();
    }

    @Override // m3.v
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        this.f4771f.a(runnable);
        boolean z4 = false;
        if (this.runningWorkers >= this.f4769d) {
            return;
        }
        synchronized (this.f4772g) {
            if (this.runningWorkers < this.f4769d) {
                this.runningWorkers++;
                z4 = true;
            }
        }
        if (z4) {
            this.f4768c.c(this, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r0 = r3.f4772g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        r3.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r3.f4771f.c() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r3.runningWorkers++;
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            q3.j<java.lang.Runnable> r1 = r3.f4771f
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L15
        Lf:
            r1 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            d1.d.g(r2, r1)
        L15:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            m3.v r1 = r3.f4768c
            boolean r1 = r1.x()
            if (r1 == 0) goto L1
            m3.v r0 = r3.f4768c
            r0.c(r3, r3)
            return
        L29:
            java.lang.Object r0 = r3.f4772g
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + (-1)
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            q3.j<java.lang.Runnable> r1 = r3.f4771f     // Catch: java.lang.Throwable -> L46
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return
        L3c:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            goto L0
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.g.run():void");
    }
}
