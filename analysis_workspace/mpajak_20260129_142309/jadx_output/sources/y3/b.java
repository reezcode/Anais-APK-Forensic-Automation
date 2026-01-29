package y3;

import f4.a0;
import f4.b0;
import f4.g;
import f4.h;
import f4.m;
import f4.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import s3.b0;
import s3.l;
import s3.r;
import s3.s;
import s3.w;
import w3.j;
import x3.j;

/* loaded from: classes21.dex */
public final class b implements x3.d {

    /* renamed from: a, reason: collision with root package name */
    public int f6073a;

    /* renamed from: b, reason: collision with root package name */
    public final y3.a f6074b;

    /* renamed from: c, reason: collision with root package name */
    public r f6075c;

    /* renamed from: d, reason: collision with root package name */
    public final w f6076d;

    /* renamed from: e, reason: collision with root package name */
    public final j f6077e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6078f;

    /* renamed from: g, reason: collision with root package name */
    public final g f6079g;

    /* loaded from: classes22.dex */
    public abstract class a implements a0 {

        /* renamed from: b, reason: collision with root package name */
        public final m f6080b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6081c;

        public a() {
            this.f6080b = new m(b.this.f6078f.i());
        }

        public final void a() {
            b bVar = b.this;
            int i5 = bVar.f6073a;
            if (i5 == 6) {
                return;
            }
            if (i5 == 5) {
                b.i(bVar, this.f6080b);
                b.this.f6073a = 6;
            } else {
                StringBuilder g5 = androidx.activity.d.g("state: ");
                g5.append(b.this.f6073a);
                throw new IllegalStateException(g5.toString());
            }
        }

        @Override // f4.a0
        public final b0 i() {
            return this.f6080b;
        }

        @Override // f4.a0
        public long u(f4.f sink, long j5) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return b.this.f6078f.u(sink, j5);
            } catch (IOException e5) {
                b.this.f6077e.l();
                a();
                throw e5;
            }
        }
    }

    /* renamed from: y3.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0087b implements y {

        /* renamed from: b, reason: collision with root package name */
        public final m f6083b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6084c;

        public C0087b() {
            this.f6083b = new m(b.this.f6079g.i());
        }

        @Override // f4.y
        public final void T(f4.f source, long j5) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f6084c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j5 == 0) {
                return;
            }
            b.this.f6079g.k(j5);
            b.this.f6079g.d0("\r\n");
            b.this.f6079g.T(source, j5);
            b.this.f6079g.d0("\r\n");
        }

        @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f6084c) {
                return;
            }
            this.f6084c = true;
            b.this.f6079g.d0("0\r\n\r\n");
            b.i(b.this, this.f6083b);
            b.this.f6073a = 3;
        }

        @Override // f4.y, java.io.Flushable
        public final synchronized void flush() {
            if (this.f6084c) {
                return;
            }
            b.this.f6079g.flush();
        }

        @Override // f4.y
        public final b0 i() {
            return this.f6083b;
        }
    }

    /* loaded from: classes19.dex */
    public final class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public long f6086e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6087f;

        /* renamed from: g, reason: collision with root package name */
        public final s f6088g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f6089h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, s url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f6089h = bVar;
            this.f6088g = url;
            this.f6086e = -1L;
            this.f6087f = true;
        }

        @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f6081c) {
                return;
            }
            if (this.f6087f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!t3.c.i(this)) {
                    this.f6089h.f6077e.l();
                    a();
                }
            }
            this.f6081c = true;
        }

        @Override // y3.b.a, f4.a0
        public final long u(f4.f sink, long j5) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            boolean z4 = true;
            if (!(j5 >= 0)) {
                throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
            }
            if (!(!this.f6081c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f6087f) {
                return -1L;
            }
            long j6 = this.f6086e;
            if (j6 == 0 || j6 == -1) {
                if (j6 != -1) {
                    this.f6089h.f6078f.v();
                }
                try {
                    this.f6086e = this.f6089h.f6078f.h0();
                    String v4 = this.f6089h.f6078f.v();
                    if (v4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    String obj = StringsKt.trim((CharSequence) v4).toString();
                    if (this.f6086e >= 0) {
                        if (obj.length() <= 0) {
                            z4 = false;
                        }
                        if (!z4 || StringsKt.u(obj, ";")) {
                            if (this.f6086e == 0) {
                                this.f6087f = false;
                                b bVar = this.f6089h;
                                bVar.f6075c = bVar.f6074b.a();
                                w wVar = this.f6089h.f6076d;
                                Intrinsics.checkNotNull(wVar);
                                l lVar = wVar.f5329k;
                                s sVar = this.f6088g;
                                r rVar = this.f6089h.f6075c;
                                Intrinsics.checkNotNull(rVar);
                                x3.e.b(lVar, sVar, rVar);
                                a();
                            }
                            if (!this.f6087f) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f6086e + obj + Typography.quote);
                } catch (NumberFormatException e5) {
                    throw new ProtocolException(e5.getMessage());
                }
            }
            long u4 = super.u(sink, Math.min(j5, this.f6086e));
            if (u4 != -1) {
                this.f6086e -= u4;
                return u4;
            }
            this.f6089h.f6077e.l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
    }

    /* loaded from: classes19.dex */
    public final class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public long f6090e;

        public d(long j5) {
            super();
            this.f6090e = j5;
            if (j5 == 0) {
                a();
            }
        }

        @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f6081c) {
                return;
            }
            if (this.f6090e != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!t3.c.i(this)) {
                    b.this.f6077e.l();
                    a();
                }
            }
            this.f6081c = true;
        }

        @Override // y3.b.a, f4.a0
        public final long u(f4.f sink, long j5) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j5 >= 0)) {
                throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
            }
            if (!(!this.f6081c)) {
                throw new IllegalStateException("closed".toString());
            }
            long j6 = this.f6090e;
            if (j6 == 0) {
                return -1L;
            }
            long u4 = super.u(sink, Math.min(j6, j5));
            if (u4 == -1) {
                b.this.f6077e.l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j7 = this.f6090e - u4;
            this.f6090e = j7;
            if (j7 == 0) {
                a();
            }
            return u4;
        }
    }

    /* loaded from: classes20.dex */
    public final class e implements y {

        /* renamed from: b, reason: collision with root package name */
        public final m f6092b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6093c;

        public e() {
            this.f6092b = new m(b.this.f6079g.i());
        }

        @Override // f4.y
        public final void T(f4.f source, long j5) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f6093c)) {
                throw new IllegalStateException("closed".toString());
            }
            t3.c.c(source.f2852c, 0L, j5);
            b.this.f6079g.T(source, j5);
        }

        @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f6093c) {
                return;
            }
            this.f6093c = true;
            b.i(b.this, this.f6092b);
            b.this.f6073a = 3;
        }

        @Override // f4.y, java.io.Flushable
        public final void flush() {
            if (this.f6093c) {
                return;
            }
            b.this.f6079g.flush();
        }

        @Override // f4.y
        public final b0 i() {
            return this.f6092b;
        }
    }

    /* loaded from: classes17.dex */
    public final class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f6095e;

        public f(b bVar) {
            super();
        }

        @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f6081c) {
                return;
            }
            if (!this.f6095e) {
                a();
            }
            this.f6081c = true;
        }

        @Override // y3.b.a, f4.a0
        public final long u(f4.f sink, long j5) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(j5 >= 0)) {
                throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
            }
            if (!(!this.f6081c)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f6095e) {
                return -1L;
            }
            long u4 = super.u(sink, j5);
            if (u4 != -1) {
                return u4;
            }
            this.f6095e = true;
            a();
            return -1L;
        }
    }

    public b(w wVar, j connection, h source, g sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6076d = wVar;
        this.f6077e = connection;
        this.f6078f = source;
        this.f6079g = sink;
        this.f6074b = new y3.a(source);
    }

    public static final void i(b bVar, m mVar) {
        Objects.requireNonNull(bVar);
        b0 b0Var = mVar.f2870e;
        b0.a delegate = b0.f2836d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        mVar.f2870e = delegate;
        b0Var.a();
        b0Var.b();
    }

    @Override // x3.d
    public final void a(s3.y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f6077e.f5874q.f5198b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f5382c);
        sb.append(' ');
        s url = request.f5381b;
        if (!url.f5284a && proxyType == Proxy.Type.HTTP) {
            sb.append(url);
        } else {
            Intrinsics.checkNotNullParameter(url, "url");
            String b5 = url.b();
            String d5 = url.d();
            if (d5 != null) {
                b5 = b5 + '?' + d5;
            }
            sb.append(b5);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        k(request.f5383d, sb2);
    }

    @Override // x3.d
    public final void b() {
        this.f6079g.flush();
    }

    @Override // x3.d
    public final void c() {
        this.f6079g.flush();
    }

    @Override // x3.d
    public final void cancel() {
        Socket socket = this.f6077e.f5859b;
        if (socket != null) {
            t3.c.e(socket);
        }
    }

    @Override // x3.d
    public final y d(s3.y request, long j5) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (StringsKt.g("chunked", request.b("Transfer-Encoding"))) {
            if (this.f6073a == 1) {
                this.f6073a = 2;
                return new C0087b();
            }
            StringBuilder g5 = androidx.activity.d.g("state: ");
            g5.append(this.f6073a);
            throw new IllegalStateException(g5.toString().toString());
        }
        if (j5 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f6073a == 1) {
            this.f6073a = 2;
            return new e();
        }
        StringBuilder g6 = androidx.activity.d.g("state: ");
        g6.append(this.f6073a);
        throw new IllegalStateException(g6.toString().toString());
    }

    @Override // x3.d
    public final long e(s3.b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!x3.e.a(response)) {
            return 0L;
        }
        if (StringsKt.g("chunked", s3.b0.a(response, "Transfer-Encoding"))) {
            return -1L;
        }
        return t3.c.l(response);
    }

    @Override // x3.d
    public final a0 f(s3.b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!x3.e.a(response)) {
            return j(0L);
        }
        if (StringsKt.g("chunked", s3.b0.a(response, "Transfer-Encoding"))) {
            s sVar = response.f5154b.f5381b;
            if (this.f6073a == 4) {
                this.f6073a = 5;
                return new c(this, sVar);
            }
            StringBuilder g5 = androidx.activity.d.g("state: ");
            g5.append(this.f6073a);
            throw new IllegalStateException(g5.toString().toString());
        }
        long l5 = t3.c.l(response);
        if (l5 != -1) {
            return j(l5);
        }
        if (this.f6073a == 4) {
            this.f6073a = 5;
            this.f6077e.l();
            return new f(this);
        }
        StringBuilder g6 = androidx.activity.d.g("state: ");
        g6.append(this.f6073a);
        throw new IllegalStateException(g6.toString().toString());
    }

    @Override // x3.d
    public final b0.a g(boolean z4) {
        int i5 = this.f6073a;
        boolean z5 = true;
        if (i5 != 1 && i5 != 3) {
            z5 = false;
        }
        if (!z5) {
            StringBuilder g5 = androidx.activity.d.g("state: ");
            g5.append(this.f6073a);
            throw new IllegalStateException(g5.toString().toString());
        }
        try {
            j.a aVar = x3.j.f5953d;
            y3.a aVar2 = this.f6074b;
            String O = aVar2.f6072b.O(aVar2.f6071a);
            aVar2.f6071a -= O.length();
            x3.j a5 = aVar.a(O);
            b0.a aVar3 = new b0.a();
            aVar3.f(a5.f5954a);
            aVar3.f5169c = a5.f5955b;
            aVar3.e(a5.f5956c);
            aVar3.d(this.f6074b.a());
            if (z4 && a5.f5955b == 100) {
                return null;
            }
            if (a5.f5955b == 100) {
                this.f6073a = 3;
                return aVar3;
            }
            this.f6073a = 4;
            return aVar3;
        } catch (EOFException e5) {
            throw new IOException(androidx.activity.d.f("unexpected end of stream on ", this.f6077e.f5874q.f5197a.f5138a.g()), e5);
        }
    }

    @Override // x3.d
    public final w3.j h() {
        return this.f6077e;
    }

    public final a0 j(long j5) {
        if (this.f6073a == 4) {
            this.f6073a = 5;
            return new d(j5);
        }
        StringBuilder g5 = androidx.activity.d.g("state: ");
        g5.append(this.f6073a);
        throw new IllegalStateException(g5.toString().toString());
    }

    public final void k(r headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (!(this.f6073a == 0)) {
            StringBuilder g5 = androidx.activity.d.g("state: ");
            g5.append(this.f6073a);
            throw new IllegalStateException(g5.toString().toString());
        }
        this.f6079g.d0(requestLine).d0("\r\n");
        int length = headers.f5280b.length / 2;
        for (int i5 = 0; i5 < length; i5++) {
            this.f6079g.d0(headers.r(i5)).d0(": ").d0(headers.t(i5)).d0("\r\n");
        }
        this.f6079g.d0("\r\n");
        this.f6073a = 1;
    }
}
