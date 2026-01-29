package z3;

import f4.a0;
import f4.b0;
import f4.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public long f6295a;

    /* renamed from: b, reason: collision with root package name */
    public long f6296b;

    /* renamed from: c, reason: collision with root package name */
    public long f6297c;

    /* renamed from: d, reason: collision with root package name */
    public long f6298d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<s3.r> f6299e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6300f;

    /* renamed from: g, reason: collision with root package name */
    public final b f6301g;

    /* renamed from: h, reason: collision with root package name */
    public final a f6302h;

    /* renamed from: i, reason: collision with root package name */
    public final c f6303i;

    /* renamed from: j, reason: collision with root package name */
    public final c f6304j;

    /* renamed from: k, reason: collision with root package name */
    public z3.b f6305k;

    /* renamed from: l, reason: collision with root package name */
    public IOException f6306l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6307m;

    /* renamed from: n, reason: collision with root package name */
    public final f f6308n;

    /* loaded from: classes20.dex */
    public final class a implements y {

        /* renamed from: b, reason: collision with root package name */
        public final f4.f f6309b = new f4.f();

        /* renamed from: c, reason: collision with root package name */
        public boolean f6310c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6311d;

        public a(boolean z4) {
            this.f6311d = z4;
        }

        @Override // f4.y
        public final void T(f4.f source, long j5) {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = t3.c.f5449a;
            this.f6309b.T(source, j5);
            while (this.f6309b.f2852c >= 16384) {
                a(false);
            }
        }

        public final void a(boolean z4) {
            long min;
            q qVar;
            boolean z5;
            synchronized (q.this) {
                q.this.f6304j.i();
                while (true) {
                    try {
                        q qVar2 = q.this;
                        if (qVar2.f6297c < qVar2.f6298d || this.f6311d || this.f6310c || qVar2.f() != null) {
                            break;
                        } else {
                            q.this.k();
                        }
                    } finally {
                    }
                }
                q.this.f6304j.m();
                q.this.b();
                q qVar3 = q.this;
                min = Math.min(qVar3.f6298d - qVar3.f6297c, this.f6309b.f2852c);
                qVar = q.this;
                qVar.f6297c += min;
                z5 = z4 && min == this.f6309b.f2852c;
                Unit unit = Unit.INSTANCE;
            }
            qVar.f6304j.i();
            try {
                q qVar4 = q.this;
                qVar4.f6308n.p(qVar4.f6307m, z5, this.f6309b, min);
            } finally {
            }
        }

        @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            q qVar = q.this;
            byte[] bArr = t3.c.f5449a;
            synchronized (qVar) {
                if (this.f6310c) {
                    return;
                }
                boolean z4 = q.this.f() == null;
                Unit unit = Unit.INSTANCE;
                q qVar2 = q.this;
                if (!qVar2.f6302h.f6311d) {
                    if (this.f6309b.f2852c > 0) {
                        while (this.f6309b.f2852c > 0) {
                            a(true);
                        }
                    } else if (z4) {
                        qVar2.f6308n.p(qVar2.f6307m, true, null, 0L);
                    }
                }
                synchronized (q.this) {
                    this.f6310c = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                q.this.f6308n.flush();
                q.this.a();
            }
        }

        @Override // f4.y, java.io.Flushable
        public final void flush() {
            q qVar = q.this;
            byte[] bArr = t3.c.f5449a;
            synchronized (qVar) {
                q.this.b();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f6309b.f2852c > 0) {
                a(false);
                q.this.f6308n.flush();
            }
        }

        @Override // f4.y
        public final b0 i() {
            return q.this.f6304j;
        }
    }

    /* loaded from: classes24.dex */
    public final class b implements a0 {

        /* renamed from: b, reason: collision with root package name */
        public final f4.f f6313b = new f4.f();

        /* renamed from: c, reason: collision with root package name */
        public final f4.f f6314c = new f4.f();

        /* renamed from: d, reason: collision with root package name */
        public boolean f6315d;

        /* renamed from: e, reason: collision with root package name */
        public final long f6316e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6317f;

        public b(long j5, boolean z4) {
            this.f6316e = j5;
            this.f6317f = z4;
        }

        public final void a(long j5) {
            q qVar = q.this;
            byte[] bArr = t3.c.f5449a;
            qVar.f6308n.n(j5);
        }

        @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j5;
            synchronized (q.this) {
                this.f6315d = true;
                f4.f fVar = this.f6314c;
                j5 = fVar.f2852c;
                fVar.a();
                q qVar = q.this;
                if (qVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                qVar.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j5 > 0) {
                a(j5);
            }
            q.this.a();
        }

        @Override // f4.a0
        public final b0 i() {
            return q.this.f6303i;
        }

        @Override // f4.a0
        public final long u(f4.f sink, long j5) {
            long j6;
            boolean z4;
            long j7;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j8 = 0;
            if (!(j5 >= 0)) {
                throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
            }
            while (true) {
                Throwable th = null;
                synchronized (q.this) {
                    q.this.f6303i.i();
                    try {
                        if (q.this.f() != null && (th = q.this.f6306l) == null) {
                            z3.b f5 = q.this.f();
                            Intrinsics.checkNotNull(f5);
                            th = new v(f5);
                        }
                        if (this.f6315d) {
                            throw new IOException("stream closed");
                        }
                        f4.f fVar = this.f6314c;
                        long j9 = fVar.f2852c;
                        if (j9 > j8) {
                            j6 = fVar.u(sink, Math.min(j5, j9));
                            q qVar = q.this;
                            long j10 = qVar.f6295a + j6;
                            qVar.f6295a = j10;
                            long j11 = j10 - qVar.f6296b;
                            if (th == null && j11 >= qVar.f6308n.f6223s.a() / 2) {
                                q qVar2 = q.this;
                                qVar2.f6308n.s(qVar2.f6307m, j11);
                                q qVar3 = q.this;
                                qVar3.f6296b = qVar3.f6295a;
                            }
                        } else if (this.f6317f || th != null) {
                            j6 = -1;
                        } else {
                            q.this.k();
                            z4 = true;
                            j7 = -1;
                            q.this.f6303i.m();
                            Unit unit = Unit.INSTANCE;
                        }
                        j7 = j6;
                        z4 = false;
                        q.this.f6303i.m();
                        Unit unit2 = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (!z4) {
                    if (j7 != -1) {
                        a(j7);
                        return j7;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    Intrinsics.checkNotNull(th);
                    throw th;
                }
                j8 = 0;
            }
        }
    }

    /* loaded from: classes13.dex */
    public final class c extends f4.c {
        public c() {
        }

        @Override // f4.c
        public final IOException k(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // f4.c
        public final void l() {
            q.this.e(z3.b.CANCEL);
            f fVar = q.this.f6308n;
            synchronized (fVar) {
                long j5 = fVar.f6221q;
                long j6 = fVar.f6220p;
                if (j5 < j6) {
                    return;
                }
                fVar.f6220p = j6 + 1;
                fVar.f6222r = System.nanoTime() + 1000000000;
                Unit unit = Unit.INSTANCE;
                fVar.f6214j.c(new n(androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), fVar.f6209e, " ping"), fVar), 0L);
            }
        }

        public final void m() {
            if (j()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public q(int i5, f connection, boolean z4, boolean z5, s3.r rVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f6307m = i5;
        this.f6308n = connection;
        this.f6298d = connection.f6224t.a();
        ArrayDeque<s3.r> arrayDeque = new ArrayDeque<>();
        this.f6299e = arrayDeque;
        this.f6301g = new b(connection.f6223s.a(), z5);
        this.f6302h = new a(z4);
        this.f6303i = new c();
        this.f6304j = new c();
        if (rVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!h())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(rVar);
        }
    }

    public final void a() {
        boolean z4;
        boolean i5;
        byte[] bArr = t3.c.f5449a;
        synchronized (this) {
            b bVar = this.f6301g;
            if (!bVar.f6317f && bVar.f6315d) {
                a aVar = this.f6302h;
                if (aVar.f6311d || aVar.f6310c) {
                    z4 = true;
                    i5 = i();
                    Unit unit = Unit.INSTANCE;
                }
            }
            z4 = false;
            i5 = i();
            Unit unit2 = Unit.INSTANCE;
        }
        if (z4) {
            c(z3.b.CANCEL, null);
        } else {
            if (i5) {
                return;
            }
            this.f6308n.f(this.f6307m);
        }
    }

    public final void b() {
        a aVar = this.f6302h;
        if (aVar.f6310c) {
            throw new IOException("stream closed");
        }
        if (aVar.f6311d) {
            throw new IOException("stream finished");
        }
        if (this.f6305k != null) {
            IOException iOException = this.f6306l;
            if (iOException != null) {
                throw iOException;
            }
            z3.b bVar = this.f6305k;
            Intrinsics.checkNotNull(bVar);
            throw new v(bVar);
        }
    }

    public final void c(z3.b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            f fVar = this.f6308n;
            int i5 = this.f6307m;
            Objects.requireNonNull(fVar);
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            fVar.f6230z.n(i5, statusCode);
        }
    }

    public final boolean d(z3.b bVar, IOException iOException) {
        byte[] bArr = t3.c.f5449a;
        synchronized (this) {
            if (this.f6305k != null) {
                return false;
            }
            if (this.f6301g.f6317f && this.f6302h.f6311d) {
                return false;
            }
            this.f6305k = bVar;
            this.f6306l = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.f6308n.f(this.f6307m);
            return true;
        }
    }

    public final void e(z3.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f6308n.r(this.f6307m, errorCode);
        }
    }

    public final synchronized z3.b f() {
        return this.f6305k;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x0011, B:15:0x0017, B:16:0x0022), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f4.y g() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f6300f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.h()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            z3.q$a r0 = r2.f6302h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.q.g():f4.y");
    }

    public final boolean h() {
        return this.f6308n.f6206b == ((this.f6307m & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.f6305k != null) {
            return false;
        }
        b bVar = this.f6301g;
        if (bVar.f6317f || bVar.f6315d) {
            a aVar = this.f6302h;
            if (aVar.f6311d || aVar.f6310c) {
                if (this.f6300f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(s3.r r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = t3.c.f5449a
            monitor-enter(r2)
            boolean r0 = r2.f6300f     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            z3.q$b r3 = r2.f6301g     // Catch: java.lang.Throwable -> L37
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L37
            goto L1d
        L16:
            r2.f6300f = r1     // Catch: java.lang.Throwable -> L37
            java.util.ArrayDeque<s3.r> r0 = r2.f6299e     // Catch: java.lang.Throwable -> L37
            r0.add(r3)     // Catch: java.lang.Throwable -> L37
        L1d:
            if (r4 == 0) goto L23
            z3.q$b r3 = r2.f6301g     // Catch: java.lang.Throwable -> L37
            r3.f6317f = r1     // Catch: java.lang.Throwable -> L37
        L23:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L37
            r2.notifyAll()     // Catch: java.lang.Throwable -> L37
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r3 != 0) goto L36
            z3.f r3 = r2.f6308n
            int r4 = r2.f6307m
            r3.f(r4)
        L36:
            return
        L37:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.q.j(s3.r, boolean):void");
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
