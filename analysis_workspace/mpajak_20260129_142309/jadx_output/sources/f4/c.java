package f4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public class c extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final long f2840h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f2841i;

    /* renamed from: j, reason: collision with root package name */
    public static c f2842j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f2843k = new a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2844e;

    /* renamed from: f, reason: collision with root package name */
    public c f2845f;

    /* renamed from: g, reason: collision with root package name */
    public long f2846g;

    /* loaded from: classes8.dex */
    public static final class a {
        public final c a() {
            c cVar = c.f2842j;
            Intrinsics.checkNotNull(cVar);
            c cVar2 = cVar.f2845f;
            long nanoTime = System.nanoTime();
            if (cVar2 == null) {
                c.class.wait(c.f2840h);
                c cVar3 = c.f2842j;
                Intrinsics.checkNotNull(cVar3);
                if (cVar3.f2845f != null || System.nanoTime() - nanoTime < c.f2841i) {
                    return null;
                }
                return c.f2842j;
            }
            long j5 = cVar2.f2846g - nanoTime;
            if (j5 > 0) {
                long j6 = j5 / 1000000;
                c.class.wait(j6, (int) (j5 - (1000000 * j6)));
                return null;
            }
            c cVar4 = c.f2842j;
            Intrinsics.checkNotNull(cVar4);
            cVar4.f2845f = cVar2.f2845f;
            cVar2.f2845f = null;
            return cVar2;
        }
    }

    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            c a5;
            while (true) {
                try {
                    synchronized (c.class) {
                        a5 = c.f2843k.a();
                        if (a5 == c.f2842j) {
                            c.f2842j = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (a5 != null) {
                        a5.l();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2840h = millis;
        f2841i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:11:0x0018, B:13:0x001c, B:14:0x002b, B:17:0x0033, B:18:0x003f, B:19:0x0047, B:20:0x004c, B:22:0x0053, B:24:0x005e, B:27:0x0061, B:29:0x006b, B:30:0x006e, B:36:0x0043, B:37:0x0072, B:38:0x0077), top: B:10:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:11:0x0018, B:13:0x001c, B:14:0x002b, B:17:0x0033, B:18:0x003f, B:19:0x0047, B:20:0x004c, B:22:0x0053, B:24:0x005e, B:27:0x0061, B:29:0x006b, B:30:0x006e, B:36:0x0043, B:37:0x0072, B:38:0x0077), top: B:10:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:27:0x0061 BREAK  A[LOOP:0: B:20:0x004c->B:24:0x005e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r9 = this;
            boolean r0 = r9.f2844e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L7b
            long r2 = r9.f2839c
            boolean r0 = r9.f2837a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L13
            if (r0 != 0) goto L13
            return
        L13:
            r9.f2844e = r1
            java.lang.Class<f4.c> r1 = f4.c.class
            monitor-enter(r1)
            f4.c r4 = f4.c.f2842j     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L2b
            f4.c r4 = new f4.c     // Catch: java.lang.Throwable -> L78
            r4.<init>()     // Catch: java.lang.Throwable -> L78
            f4.c.f2842j = r4     // Catch: java.lang.Throwable -> L78
            f4.c$b r4 = new f4.c$b     // Catch: java.lang.Throwable -> L78
            r4.<init>()     // Catch: java.lang.Throwable -> L78
            r4.start()     // Catch: java.lang.Throwable -> L78
        L2b:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L3d
            if (r0 == 0) goto L3d
            long r6 = r9.c()     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r4
            long r2 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L78
            goto L3f
        L3d:
            if (r6 == 0) goto L41
        L3f:
            long r2 = r2 + r4
            goto L47
        L41:
            if (r0 == 0) goto L72
            long r2 = r9.c()     // Catch: java.lang.Throwable -> L78
        L47:
            r9.f2846g = r2     // Catch: java.lang.Throwable -> L78
            long r2 = r2 - r4
            f4.c r0 = f4.c.f2842j     // Catch: java.lang.Throwable -> L78
        L4c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L78
            f4.c r6 = r0.f2845f     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L61
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L78
            long r6 = r6.f2846g     // Catch: java.lang.Throwable -> L78
            long r6 = r6 - r4
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L5e
            goto L61
        L5e:
            f4.c r0 = r0.f2845f     // Catch: java.lang.Throwable -> L78
            goto L4c
        L61:
            f4.c r2 = r0.f2845f     // Catch: java.lang.Throwable -> L78
            r9.f2845f = r2     // Catch: java.lang.Throwable -> L78
            r0.f2845f = r9     // Catch: java.lang.Throwable -> L78
            f4.c r2 = f4.c.f2842j     // Catch: java.lang.Throwable -> L78
            if (r0 != r2) goto L6e
            r1.notify()     // Catch: java.lang.Throwable -> L78
        L6e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L78
            monitor-exit(r1)
            return
        L72:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L7b:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.i():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        r2.f2845f = r4.f2845f;
        r4.f2845f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r4 = this;
            boolean r0 = r4.f2844e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.f2844e = r1
            java.lang.Class<f4.c> r0 = f4.c.class
            monitor-enter(r0)
            f4.c r2 = f4.c.f2842j     // Catch: java.lang.Throwable -> L20
        Ld:
            if (r2 == 0) goto L1d
            f4.c r3 = r2.f2845f     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L1b
            f4.c r3 = r4.f2845f     // Catch: java.lang.Throwable -> L20
            r2.f2845f = r3     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r4.f2845f = r2     // Catch: java.lang.Throwable -> L20
            goto L1e
        L1b:
            r2 = r3
            goto Ld
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.j():boolean");
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
