package w3;

import a4.h;
import com.tencent.smtt.sdk.TbsListener;
import f4.a0;
import f4.t;
import f4.u;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import s3.b0;
import s3.e0;
import s3.q;
import s3.s;
import s3.w;
import s3.x;
import s3.y;
import y3.b;
import z3.f;
import z3.r;

/* loaded from: classes2.dex */
public final class j extends f.d implements s3.i {

    /* renamed from: b, reason: collision with root package name */
    public Socket f5859b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f5860c;

    /* renamed from: d, reason: collision with root package name */
    public q f5861d;

    /* renamed from: e, reason: collision with root package name */
    public x f5862e;

    /* renamed from: f, reason: collision with root package name */
    public z3.f f5863f;

    /* renamed from: g, reason: collision with root package name */
    public u f5864g;

    /* renamed from: h, reason: collision with root package name */
    public t f5865h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5866i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5867j;

    /* renamed from: k, reason: collision with root package name */
    public int f5868k;

    /* renamed from: l, reason: collision with root package name */
    public int f5869l;

    /* renamed from: m, reason: collision with root package name */
    public int f5870m;

    /* renamed from: n, reason: collision with root package name */
    public int f5871n;

    /* renamed from: o, reason: collision with root package name */
    public final List<Reference<e>> f5872o;

    /* renamed from: p, reason: collision with root package name */
    public long f5873p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f5874q;

    public j(l connectionPool, e0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f5874q = route;
        this.f5871n = 1;
        this.f5872o = new ArrayList();
        this.f5873p = Long.MAX_VALUE;
    }

    @Override // z3.f.d
    public final synchronized void a(z3.f connection, z3.u settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f5871n = (settings.f6335a & 16) != 0 ? settings.f6336b[4] : Integer.MAX_VALUE;
    }

    @Override // z3.f.d
    public final void b(z3.q stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(z3.b.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, s3.d r22, s3.o r23) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.j.c(int, int, int, int, boolean, s3.d, s3.o):void");
    }

    public final void d(w client, e0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f5198b.type() != Proxy.Type.DIRECT) {
            s3.a aVar = failedRoute.f5197a;
            aVar.f5148k.connectFailed(aVar.f5138a.h(), failedRoute.f5198b.address(), failure);
        }
        m mVar = client.D;
        synchronized (mVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            mVar.f5881a.add(failedRoute);
        }
    }

    public final void e(int i5, int i6, s3.d call, s3.o oVar) {
        Socket socket;
        int i7;
        e0 e0Var = this.f5874q;
        Proxy proxy = e0Var.f5198b;
        s3.a aVar = e0Var.f5197a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i7 = f.f5851a[type.ordinal()]) == 1 || i7 == 2)) {
            socket = aVar.f5142e.createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f5859b = socket;
        InetSocketAddress inetSocketAddress = this.f5874q.f5199c;
        Objects.requireNonNull(oVar);
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        socket.setSoTimeout(i6);
        try {
            h.a aVar2 = a4.h.f116c;
            a4.h.f114a.e(socket, this.f5874q.f5199c, i5);
            try {
                this.f5864g = (u) d1.d.e(d1.d.n(socket));
                this.f5865h = (t) d1.d.d(d1.d.m(socket));
            } catch (NullPointerException e5) {
                if (Intrinsics.areEqual(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e6) {
            StringBuilder g5 = androidx.activity.d.g("Failed to connect to ");
            g5.append(this.f5874q.f5199c);
            ConnectException connectException = new ConnectException(g5.toString());
            connectException.initCause(e6);
            throw connectException;
        }
    }

    public final void f(int i5, int i6, int i7, s3.d dVar, s3.o oVar) {
        y.a aVar = new y.a();
        aVar.f(this.f5874q.f5197a.f5138a);
        aVar.c("CONNECT", null);
        aVar.b("Host", t3.c.y(this.f5874q.f5197a.f5138a, true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", "okhttp/4.9.3");
        y request = aVar.a();
        b0.a aVar2 = new b0.a();
        Intrinsics.checkNotNullParameter(request, "request");
        aVar2.f5167a = request;
        x protocol = x.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        aVar2.f5168b = protocol;
        aVar2.f5169c = TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5;
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        aVar2.f5170d = "Preemptive Authenticate";
        aVar2.f5173g = t3.c.f5451c;
        aVar2.f5177k = -1L;
        aVar2.f5178l = -1L;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        aVar2.f5172f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        b0 a5 = aVar2.a();
        e0 e0Var = this.f5874q;
        e0Var.f5197a.f5146i.a(e0Var, a5);
        s sVar = request.f5381b;
        e(i5, i6, dVar, oVar);
        String str = "CONNECT " + t3.c.y(sVar, true) + " HTTP/1.1";
        u uVar = this.f5864g;
        Intrinsics.checkNotNull(uVar);
        t tVar = this.f5865h;
        Intrinsics.checkNotNull(tVar);
        y3.b bVar = new y3.b(null, this, uVar, tVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.i().g(i6, timeUnit);
        tVar.i().g(i7, timeUnit);
        bVar.k(request.f5383d, str);
        bVar.f6079g.flush();
        b0.a g5 = bVar.g(false);
        Intrinsics.checkNotNull(g5);
        Objects.requireNonNull(g5);
        Intrinsics.checkNotNullParameter(request, "request");
        g5.f5167a = request;
        b0 response = g5.a();
        Intrinsics.checkNotNullParameter(response, "response");
        long l5 = t3.c.l(response);
        if (l5 != -1) {
            a0 j5 = bVar.j(l5);
            t3.c.v(j5, Integer.MAX_VALUE);
            ((b.d) j5).close();
        }
        int i8 = response.f5157e;
        if (i8 == 200) {
            if (!uVar.f2891b.B() || !tVar.f2888b.B()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i8 == 407) {
                e0 e0Var2 = this.f5874q;
                e0Var2.f5197a.f5146i.a(e0Var2, response);
                throw new IOException("Failed to authenticate with proxy");
            }
            StringBuilder g6 = androidx.activity.d.g("Unexpected response code for CONNECT: ");
            g6.append(response.f5157e);
            throw new IOException(g6.toString());
        }
    }

    public final void g(b bVar, int i5, s3.d call, s3.o oVar) {
        String trimMargin$default;
        x xVar = x.HTTP_1_1;
        s3.a aVar = this.f5874q.f5197a;
        if (aVar.f5143f == null) {
            List<x> list = aVar.f5139b;
            x xVar2 = x.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(xVar2)) {
                this.f5860c = this.f5859b;
                this.f5862e = xVar;
                return;
            } else {
                this.f5860c = this.f5859b;
                this.f5862e = xVar2;
                m(i5);
                return;
            }
        }
        Objects.requireNonNull(oVar);
        Intrinsics.checkNotNullParameter(call, "call");
        s3.a aVar2 = this.f5874q.f5197a;
        SSLSocketFactory sSLSocketFactory = aVar2.f5143f;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f5859b;
            s sVar = aVar2.f5138a;
            Socket createSocket = sSLSocketFactory.createSocket(socket, sVar.f5288e, sVar.f5289f, true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                s3.j a5 = bVar.a(sSLSocket2);
                if (a5.f5238b) {
                    h.a aVar3 = a4.h.f116c;
                    a4.h.f114a.d(sSLSocket2, aVar2.f5138a.f5288e, aVar2.f5139b);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                q.a aVar4 = q.f5272e;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                q a6 = aVar4.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = aVar2.f5144g;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.f5138a.f5288e, sslSocketSession)) {
                    s3.f fVar = aVar2.f5145h;
                    Intrinsics.checkNotNull(fVar);
                    this.f5861d = new q(a6.f5274b, a6.f5275c, a6.f5276d, new g(fVar, a6, aVar2));
                    fVar.a(aVar2.f5138a.f5288e, new h(this));
                    if (a5.f5238b) {
                        h.a aVar5 = a4.h.f116c;
                        str = a4.h.f114a.f(sSLSocket2);
                    }
                    this.f5860c = sSLSocket2;
                    this.f5864g = (u) d1.d.e(d1.d.n(sSLSocket2));
                    this.f5865h = (t) d1.d.d(d1.d.m(sSLSocket2));
                    if (str != null) {
                        xVar = x.f5378j.a(str);
                    }
                    this.f5862e = xVar;
                    h.a aVar6 = a4.h.f116c;
                    a4.h.f114a.a(sSLSocket2);
                    Intrinsics.checkNotNullParameter(call, "call");
                    if (this.f5862e == x.HTTP_2) {
                        m(i5);
                        return;
                    }
                    return;
                }
                List<Certificate> b5 = a6.b();
                if (!(!b5.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f5138a.f5288e + " not verified (no certificates)");
                }
                Certificate certificate = b5.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate certificate2 = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder();
                sb.append("\n              |Hostname ");
                sb.append(aVar2.f5138a.f5288e);
                sb.append(" not verified:\n              |    certificate: ");
                sb.append(s3.f.f5201d.a(certificate2));
                sb.append("\n              |    DN: ");
                Principal subjectDN = certificate2.getSubjectDN();
                Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                d4.c cVar = d4.c.f2506a;
                Intrinsics.checkNotNullParameter(certificate2, "certificate");
                sb.append(CollectionsKt.plus((Collection) cVar.b(certificate2, 7), (Iterable) cVar.b(certificate2, 2)));
                sb.append("\n              ");
                trimMargin$default = StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null);
                throw new SSLPeerUnverifiedException(trimMargin$default);
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    h.a aVar7 = a4.h.f116c;
                    a4.h.f114a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    t3.c.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
    
        if (r8 == false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.ref.Reference<w3.e>>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(s3.a r7, java.util.List<s3.e0> r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.j.h(s3.a, java.util.List):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r0 >= r2.f6222r) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = t3.c.f5449a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f5859b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.net.Socket r3 = r9.f5860c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            f4.u r4 = r9.f5864g
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L86
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L86
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L86
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L2f
            goto L86
        L2f:
            z3.f r2 = r9.f5863f
            r6 = 1
            if (r2 == 0) goto L50
            monitor-enter(r2)
            boolean r10 = r2.f6212h     // Catch: java.lang.Throwable -> L4d
            if (r10 == 0) goto L3a
            goto L48
        L3a:
            long r3 = r2.f6221q     // Catch: java.lang.Throwable -> L4d
            long r7 = r2.f6220p     // Catch: java.lang.Throwable -> L4d
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L4a
            long r3 = r2.f6222r     // Catch: java.lang.Throwable -> L4d
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L4a
        L48:
            monitor-exit(r2)
            goto L4c
        L4a:
            monitor-exit(r2)
            r5 = 1
        L4c:
            return r5
        L4d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L50:
            monitor-enter(r9)
            long r7 = r9.f5873p     // Catch: java.lang.Throwable -> L83
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L82
            if (r10 == 0) goto L82
            java.lang.String r10 = "$this$isHealthy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r10)
            java.lang.String r10 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)
            int r10 = r3.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L80 java.io.IOException -> L81
            r3.setSoTimeout(r6)     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r4.B()     // Catch: java.lang.Throwable -> L7b
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L80 java.io.IOException -> L81
            r5 = r0
            goto L81
        L7b:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch: java.net.SocketTimeoutException -> L80 java.io.IOException -> L81
            throw r0     // Catch: java.net.SocketTimeoutException -> L80 java.io.IOException -> L81
        L80:
            r5 = 1
        L81:
            return r5
        L82:
            return r6
        L83:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.j.i(boolean):boolean");
    }

    public final boolean j() {
        return this.f5863f != null;
    }

    public final x3.d k(w client, x3.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f5860c;
        Intrinsics.checkNotNull(socket);
        u uVar = this.f5864g;
        Intrinsics.checkNotNull(uVar);
        t tVar = this.f5865h;
        Intrinsics.checkNotNull(tVar);
        z3.f fVar = this.f5863f;
        if (fVar != null) {
            return new z3.o(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.f5947h);
        f4.b0 i5 = uVar.i();
        long j5 = chain.f5947h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i5.g(j5, timeUnit);
        tVar.i().g(chain.f5948i, timeUnit);
        return new y3.b(client, this, uVar, tVar);
    }

    public final synchronized void l() {
        this.f5866i = true;
    }

    public final void m(int i5) {
        StringBuilder g5;
        Socket socket = this.f5860c;
        Intrinsics.checkNotNull(socket);
        u source = this.f5864g;
        Intrinsics.checkNotNull(source);
        t sink = this.f5865h;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        v3.d taskRunner = v3.d.f5712h;
        f.b bVar = new f.b(taskRunner);
        String peerName = this.f5874q.f5197a.f5138a.f5288e;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        bVar.f6233a = socket;
        if (bVar.f6240h) {
            g5 = new StringBuilder();
            g5.append(t3.c.f5455g);
            g5.append(' ');
        } else {
            g5 = androidx.activity.d.g("MockWebServer ");
        }
        g5.append(peerName);
        bVar.f6234b = g5.toString();
        bVar.f6235c = source;
        bVar.f6236d = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        bVar.f6237e = this;
        bVar.f6239g = i5;
        z3.f fVar = new z3.f(bVar);
        this.f5863f = fVar;
        f.c cVar = z3.f.D;
        z3.u uVar = z3.f.C;
        this.f5871n = (uVar.f6335a & 16) != 0 ? uVar.f6336b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        r rVar = fVar.f6230z;
        synchronized (rVar) {
            if (rVar.f6323d) {
                throw new IOException("closed");
            }
            if (rVar.f6326g) {
                Logger logger = r.f6320h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(t3.c.j(">> CONNECTION " + z3.e.f6201a.d(), new Object[0]));
                }
                rVar.f6325f.X(z3.e.f6201a);
                rVar.f6325f.flush();
            }
        }
        r rVar2 = fVar.f6230z;
        z3.u settings = fVar.f6223s;
        synchronized (rVar2) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (rVar2.f6323d) {
                throw new IOException("closed");
            }
            rVar2.c(0, Integer.bitCount(settings.f6335a) * 6, 4, 0);
            int i6 = 0;
            while (i6 < 10) {
                boolean z4 = true;
                if (((1 << i6) & settings.f6335a) == 0) {
                    z4 = false;
                }
                if (z4) {
                    rVar2.f6325f.o(i6 != 4 ? i6 != 7 ? i6 : 4 : 3);
                    rVar2.f6325f.t(settings.f6336b[i6]);
                }
                i6++;
            }
            rVar2.f6325f.flush();
        }
        if (fVar.f6223s.a() != 65535) {
            fVar.f6230z.p(0, r0 - 65535);
        }
        taskRunner.f().c(new v3.b(fVar.A, fVar.f6209e), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder g5 = androidx.activity.d.g("Connection{");
        g5.append(this.f5874q.f5197a.f5138a.f5288e);
        g5.append(':');
        g5.append(this.f5874q.f5197a.f5138a.f5289f);
        g5.append(',');
        g5.append(" proxy=");
        g5.append(this.f5874q.f5198b);
        g5.append(" hostAddress=");
        g5.append(this.f5874q.f5199c);
        g5.append(" cipherSuite=");
        q qVar = this.f5861d;
        if (qVar == null || (obj = qVar.f5275c) == null) {
            obj = "none";
        }
        g5.append(obj);
        g5.append(" protocol=");
        g5.append(this.f5862e);
        g5.append('}');
        return g5.toString();
    }
}
