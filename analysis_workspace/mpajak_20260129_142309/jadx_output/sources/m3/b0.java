package m3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.ranges.RangesKt;
import m3.l0;

/* loaded from: classes10.dex */
public final class b0 extends l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h, reason: collision with root package name */
    public static final b0 f4164h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f4165i;

    static {
        Long l5;
        b0 b0Var = new b0();
        f4164h = b0Var;
        b0Var.E(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f4165i = timeUnit.toNanos(l5.longValue());
    }

    @Override // m3.m0
    public final Thread J() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // m3.m0
    public final void K(long j5, l0.a aVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // m3.l0
    public final void N(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.N(runnable);
    }

    public final synchronized void V() {
        if (W()) {
            debugStatus = 3;
            S();
            notifyAll();
        }
    }

    public final boolean W() {
        int i5 = debugStatus;
        return i5 == 2 || i5 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        boolean Q;
        h1 h1Var = h1.f4181a;
        h1.f4182b.set(this);
        try {
            synchronized (this) {
                if (W()) {
                    z4 = false;
                } else {
                    z4 = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z4) {
                if (Q) {
                    return;
                } else {
                    return;
                }
            }
            long j5 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long R = R();
                if (R == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j5 == Long.MAX_VALUE) {
                        j5 = f4165i + nanoTime;
                    }
                    long j6 = j5 - nanoTime;
                    if (j6 <= 0) {
                        _thread = null;
                        V();
                        if (Q()) {
                            return;
                        }
                        J();
                        return;
                    }
                    R = RangesKt.coerceAtMost(R, j6);
                } else {
                    j5 = Long.MAX_VALUE;
                }
                if (R > 0) {
                    if (W()) {
                        _thread = null;
                        V();
                        if (Q()) {
                            return;
                        }
                        J();
                        return;
                    }
                    LockSupport.parkNanos(this, R);
                }
            }
        } finally {
            _thread = null;
            V();
            if (!Q()) {
                J();
            }
        }
    }

    @Override // m3.l0, m3.k0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
