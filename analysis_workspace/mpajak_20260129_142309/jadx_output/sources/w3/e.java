package w3;

import a4.h;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s3.w;
import s3.y;

/* loaded from: classes7.dex */
public final class e implements s3.d {

    /* renamed from: b, reason: collision with root package name */
    public final l f5828b;

    /* renamed from: c, reason: collision with root package name */
    public final s3.o f5829c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5830d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5831e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5832f;

    /* renamed from: g, reason: collision with root package name */
    public d f5833g;

    /* renamed from: h, reason: collision with root package name */
    public j f5834h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5835i;

    /* renamed from: j, reason: collision with root package name */
    public w3.c f5836j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5837k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5838l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5839m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f5840n;

    /* renamed from: o, reason: collision with root package name */
    public volatile w3.c f5841o;

    /* renamed from: p, reason: collision with root package name */
    public volatile j f5842p;

    /* renamed from: q, reason: collision with root package name */
    public final w f5843q;

    /* renamed from: r, reason: collision with root package name */
    public final y f5844r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5845s;

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f5846b;

        /* renamed from: c, reason: collision with root package name */
        public final s3.e f5847c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f5848d;

        public a(e eVar, s3.e responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f5848d = eVar;
            this.f5847c = responseCallback;
            this.f5846b = new AtomicInteger(0);
        }

        public final String a() {
            return this.f5848d.f5844r.f5381b.f5288e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z4;
            w wVar;
            StringBuilder g5 = androidx.activity.d.g("OkHttp ");
            g5.append(this.f5848d.f5844r.f5381b.g());
            String sb = g5.toString();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(sb);
            try {
                try {
                    this.f5848d.f5830d.i();
                    try {
                        z4 = true;
                        try {
                            this.f5847c.a(this.f5848d, this.f5848d.g());
                            wVar = this.f5848d.f5843q;
                        } catch (IOException e5) {
                            e = e5;
                            if (z4) {
                                h.a aVar = a4.h.f116c;
                                a4.h.f114a.i("Callback failure for " + e.a(this.f5848d), 4, e);
                            } else {
                                this.f5847c.b(this.f5848d, e);
                            }
                            wVar = this.f5848d.f5843q;
                            wVar.f5320b.a(this);
                        } catch (Throwable th) {
                            th = th;
                            this.f5848d.d();
                            if (!z4) {
                                IOException iOException = new IOException("canceled due to " + th);
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.f5847c.b(this.f5848d, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        z4 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        z4 = false;
                    }
                    wVar.f5320b.a(this);
                } catch (Throwable th3) {
                    this.f5848d.f5843q.f5320b.a(this);
                    throw th3;
                }
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes20.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f5849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f5849a = obj;
        }
    }

    /* loaded from: classes13.dex */
    public static final class c extends f4.c {
        public c() {
        }

        @Override // f4.c
        public final void l() {
            e.this.d();
        }
    }

    public e(w client, y originalRequest, boolean z4) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f5843q = client;
        this.f5844r = originalRequest;
        this.f5845s = z4;
        this.f5828b = (l) client.f5321c.f2958b;
        this.f5829c = client.f5324f.a(this);
        c cVar = new c();
        cVar.g(client.f5342x, TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.f5830d = cVar;
        this.f5831e = new AtomicBoolean();
        this.f5839m = true;
    }

    public static final String a(e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f5840n ? "canceled " : "");
        sb.append(eVar.f5845s ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(eVar.f5844r.f5381b.g());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<java.lang.ref.Reference<w3.e>>] */
    public final void b(j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = t3.c.f5449a;
        if (!(this.f5834h == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f5834h = connection;
        connection.f5872o.add(new b(this, this.f5832f));
    }

    public final <E extends IOException> E c(E e5) {
        E ioe;
        Socket j5;
        byte[] bArr = t3.c.f5449a;
        j connection = this.f5834h;
        if (connection != null) {
            synchronized (connection) {
                j5 = j();
            }
            if (this.f5834h == null) {
                if (j5 != null) {
                    t3.c.e(j5);
                }
                Objects.requireNonNull(this.f5829c);
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else {
                if (!(j5 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f5835i && this.f5830d.j()) {
            ioe = new InterruptedIOException("timeout");
            if (e5 != null) {
                ioe.initCause(e5);
            }
        } else {
            ioe = e5;
        }
        if (e5 != null) {
            s3.o oVar = this.f5829c;
            Intrinsics.checkNotNull(ioe);
            Objects.requireNonNull(oVar);
            Intrinsics.checkNotNullParameter(this, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
        } else {
            Objects.requireNonNull(this.f5829c);
            Intrinsics.checkNotNullParameter(this, "call");
        }
        return ioe;
    }

    public final Object clone() {
        return new e(this.f5843q, this.f5844r, this.f5845s);
    }

    public final void d() {
        Socket socket;
        if (this.f5840n) {
            return;
        }
        this.f5840n = true;
        w3.c cVar = this.f5841o;
        if (cVar != null) {
            cVar.f5806f.cancel();
        }
        j jVar = this.f5842p;
        if (jVar != null && (socket = jVar.f5859b) != null) {
            t3.c.e(socket);
        }
        Objects.requireNonNull(this.f5829c);
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final void e(s3.e responseCallback) {
        a other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f5831e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        h.a aVar = a4.h.f116c;
        this.f5832f = a4.h.f114a.g();
        Objects.requireNonNull(this.f5829c);
        Intrinsics.checkNotNullParameter(this, "call");
        s3.m mVar = this.f5843q.f5320b;
        a call = new a(this, responseCallback);
        Objects.requireNonNull(mVar);
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (mVar) {
            mVar.f5261b.add(call);
            if (!call.f5848d.f5845s) {
                String a5 = call.a();
                Iterator<a> it = mVar.f5262c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<a> it2 = mVar.f5261b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            } else {
                                other = it2.next();
                                if (Intrinsics.areEqual(other.a(), a5)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        other = it.next();
                        if (Intrinsics.areEqual(other.a(), a5)) {
                            break;
                        }
                    }
                }
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f5846b = other.f5846b;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        mVar.b();
    }

    public final void f(boolean z4) {
        w3.c cVar;
        synchronized (this) {
            if (!this.f5839m) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z4 && (cVar = this.f5841o) != null) {
            cVar.f5806f.cancel();
            cVar.f5803c.h(cVar, true, true, null);
        }
        this.f5836j = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.b0 g() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            s3.w r0 = r10.f5843q
            java.util.List<s3.t> r0 = r0.f5322d
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            x3.i r0 = new x3.i
            s3.w r1 = r10.f5843q
            r0.<init>(r1)
            r2.add(r0)
            x3.a r0 = new x3.a
            s3.w r1 = r10.f5843q
            s3.l r1 = r1.f5329k
            r0.<init>(r1)
            r2.add(r0)
            u3.a r0 = new u3.a
            s3.w r1 = r10.f5843q
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            w3.a r0 = w3.a.f5796a
            r2.add(r0)
            boolean r0 = r10.f5845s
            if (r0 != 0) goto L3f
            s3.w r0 = r10.f5843q
            java.util.List<s3.t> r0 = r0.f5323e
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L3f:
            x3.b r0 = new x3.b
            boolean r1 = r10.f5845s
            r0.<init>(r1)
            r2.add(r0)
            x3.g r9 = new x3.g
            r3 = 0
            r4 = 0
            s3.y r5 = r10.f5844r
            s3.w r0 = r10.f5843q
            int r6 = r0.f5343y
            int r7 = r0.f5344z
            int r8 = r0.A
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            s3.y r2 = r10.f5844r     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            s3.b0 r2 = r9.b(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            boolean r3 = r10.f5840n     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            if (r3 != 0) goto L6c
            r10.i(r1)
            return r2
        L6c:
            t3.c.d(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            throw r2     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
        L77:
            r2 = move-exception
            goto L8c
        L79:
            r0 = move-exception
            java.io.IOException r0 = r10.i(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L88
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L88:
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L8c:
            if (r0 != 0) goto L91
            r10.i(r1)
        L91:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.g():s3.b0");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:50:0x0014, B:12:0x0023, B:14:0x0027, B:15:0x0029, B:17:0x002d, B:21:0x0036, B:23:0x003a, B:27:0x0043, B:9:0x001d), top: B:49:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:50:0x0014, B:12:0x0023, B:14:0x0027, B:15:0x0029, B:17:0x002d, B:21:0x0036, B:23:0x003a, B:27:0x0043, B:9:0x001d), top: B:49:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <E extends java.io.IOException> E h(w3.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            w3.c r0 = r2.f5841o
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.f5837k     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L62
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.f5838l     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.f5837k = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.f5838l = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.f5837k     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.f5838l     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.f5838l     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.f5839m     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            r3 = 1
        L3f:
            r4 = r3
            r3 = r5
            goto L43
        L42:
            r4 = 0
        L43:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L5a
            r3 = 0
            r2.f5841o = r3
            w3.j r3 = r2.f5834h
            if (r3 == 0) goto L5a
            monitor-enter(r3)
            int r5 = r3.f5869l     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r0
            r3.f5869l = r5     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            goto L5a
        L57:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L5a:
            if (r4 == 0) goto L61
            java.io.IOException r3 = r2.c(r6)
            return r3
        L61:
            return r6
        L62:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e.h(w3.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            if (this.f5839m) {
                this.f5839m = false;
                if (!this.f5837k && !this.f5838l) {
                    z4 = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z4 ? c(iOException) : iOException;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.ref.Reference<w3.e>>] */
    public final Socket j() {
        j connection = this.f5834h;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = t3.c.f5449a;
        ?? r12 = connection.f5872o;
        Iterator it = r12.iterator();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (Intrinsics.areEqual((e) ((Reference) it.next()).get(), this)) {
                break;
            }
            i5++;
        }
        if (!(i5 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        r12.remove(i5);
        this.f5834h = null;
        if (r12.isEmpty()) {
            connection.f5873p = System.nanoTime();
            l lVar = this.f5828b;
            Objects.requireNonNull(lVar);
            Intrinsics.checkNotNullParameter(connection, "connection");
            byte[] bArr2 = t3.c.f5449a;
            if (connection.f5866i || lVar.f5880e == 0) {
                connection.f5866i = true;
                lVar.f5879d.remove(connection);
                if (lVar.f5879d.isEmpty()) {
                    lVar.f5877b.a();
                }
                z4 = true;
            } else {
                lVar.f5877b.c(lVar.f5878c, 0L);
            }
            if (z4) {
                Socket socket = connection.f5860c;
                Intrinsics.checkNotNull(socket);
                return socket;
            }
        }
        return null;
    }

    public final void k() {
        if (!(!this.f5835i)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f5835i = true;
        this.f5830d.j();
    }
}
