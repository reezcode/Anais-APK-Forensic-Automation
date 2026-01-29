package z3;

import f4.a0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.b0;
import s3.w;
import s3.x;
import s3.y;
import z3.q;

/* loaded from: classes4.dex */
public final class o implements x3.d {

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f6275g = t3.c.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List<String> f6276h = t3.c.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public volatile q f6277a;

    /* renamed from: b, reason: collision with root package name */
    public final x f6278b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f6279c;

    /* renamed from: d, reason: collision with root package name */
    public final w3.j f6280d;

    /* renamed from: e, reason: collision with root package name */
    public final x3.g f6281e;

    /* renamed from: f, reason: collision with root package name */
    public final f f6282f;

    public o(w client, w3.j connection, x3.g chain, f http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f6280d = connection;
        this.f6281e = chain;
        this.f6282f = http2Connection;
        List<x> list = client.f5338t;
        x xVar = x.H2_PRIOR_KNOWLEDGE;
        this.f6278b = list.contains(xVar) ? xVar : x.HTTP_2;
    }

    @Override // x3.d
    public final void a(y request) {
        int i5;
        q qVar;
        boolean z4;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f6277a != null) {
            return;
        }
        boolean z5 = request.f5384e != null;
        Intrinsics.checkNotNullParameter(request, "request");
        s3.r rVar = request.f5383d;
        ArrayList requestHeaders = new ArrayList((rVar.f5280b.length / 2) + 4);
        requestHeaders.add(new c(c.f6174f, request.f5382c));
        f4.i iVar = c.f6175g;
        s3.s url = request.f5381b;
        Intrinsics.checkNotNullParameter(url, "url");
        String b5 = url.b();
        String d5 = url.d();
        if (d5 != null) {
            b5 = b5 + '?' + d5;
        }
        requestHeaders.add(new c(iVar, b5));
        String b6 = request.b("Host");
        if (b6 != null) {
            requestHeaders.add(new c(c.f6177i, b6));
        }
        requestHeaders.add(new c(c.f6176h, request.f5381b.f5285b));
        int length = rVar.f5280b.length / 2;
        for (int i6 = 0; i6 < length; i6++) {
            String r4 = rVar.r(i6);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(r4, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = r4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f6275g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(rVar.t(i6), "trailers"))) {
                requestHeaders.add(new c(lowerCase, rVar.t(i6)));
            }
        }
        f fVar = this.f6282f;
        Objects.requireNonNull(fVar);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z6 = !z5;
        synchronized (fVar.f6230z) {
            synchronized (fVar) {
                if (fVar.f6211g > 1073741823) {
                    fVar.l(b.REFUSED_STREAM);
                }
                if (fVar.f6212h) {
                    throw new a();
                }
                i5 = fVar.f6211g;
                fVar.f6211g = i5 + 2;
                qVar = new q(i5, fVar, z6, false, null);
                z4 = !z5 || fVar.f6227w >= fVar.f6228x || qVar.f6297c >= qVar.f6298d;
                if (qVar.i()) {
                    fVar.f6208d.put(Integer.valueOf(i5), qVar);
                }
                Unit unit = Unit.INSTANCE;
            }
            fVar.f6230z.f(z6, i5, requestHeaders);
        }
        if (z4) {
            fVar.f6230z.flush();
        }
        this.f6277a = qVar;
        if (this.f6279c) {
            q qVar2 = this.f6277a;
            Intrinsics.checkNotNull(qVar2);
            qVar2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        q qVar3 = this.f6277a;
        Intrinsics.checkNotNull(qVar3);
        q.c cVar = qVar3.f6303i;
        long j5 = this.f6281e.f5947h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g(j5, timeUnit);
        q qVar4 = this.f6277a;
        Intrinsics.checkNotNull(qVar4);
        qVar4.f6304j.g(this.f6281e.f5948i, timeUnit);
    }

    @Override // x3.d
    public final void b() {
        q qVar = this.f6277a;
        Intrinsics.checkNotNull(qVar);
        ((q.a) qVar.g()).close();
    }

    @Override // x3.d
    public final void c() {
        this.f6282f.flush();
    }

    @Override // x3.d
    public final void cancel() {
        this.f6279c = true;
        q qVar = this.f6277a;
        if (qVar != null) {
            qVar.e(b.CANCEL);
        }
    }

    @Override // x3.d
    public final f4.y d(y request, long j5) {
        Intrinsics.checkNotNullParameter(request, "request");
        q qVar = this.f6277a;
        Intrinsics.checkNotNull(qVar);
        return qVar.g();
    }

    @Override // x3.d
    public final long e(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (x3.e.a(response)) {
            return t3.c.l(response);
        }
        return 0L;
    }

    @Override // x3.d
    public final a0 f(b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        q qVar = this.f6277a;
        Intrinsics.checkNotNull(qVar);
        return qVar.f6301g;
    }

    @Override // x3.d
    public final b0.a g(boolean z4) {
        s3.r headerBlock;
        q qVar = this.f6277a;
        Intrinsics.checkNotNull(qVar);
        synchronized (qVar) {
            qVar.f6303i.i();
            while (qVar.f6299e.isEmpty() && qVar.f6305k == null) {
                try {
                    qVar.k();
                } catch (Throwable th) {
                    qVar.f6303i.m();
                    throw th;
                }
            }
            qVar.f6303i.m();
            if (!(!qVar.f6299e.isEmpty())) {
                IOException iOException = qVar.f6306l;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = qVar.f6305k;
                Intrinsics.checkNotNull(bVar);
                throw new v(bVar);
            }
            s3.r removeFirst = qVar.f6299e.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
            headerBlock = removeFirst;
        }
        x protocol = this.f6278b;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int length = headerBlock.f5280b.length / 2;
        x3.j jVar = null;
        for (int i5 = 0; i5 < length; i5++) {
            String name = headerBlock.r(i5);
            String value = headerBlock.t(i5);
            if (Intrinsics.areEqual(name, ":status")) {
                jVar = x3.j.f5953d.a("HTTP/1.1 " + value);
            } else if (!f6276h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.trim((CharSequence) value).toString());
            }
        }
        if (jVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        b0.a aVar = new b0.a();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        aVar.f5168b = protocol;
        aVar.f5169c = jVar.f5955b;
        aVar.e(jVar.f5956c);
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        aVar.d(new s3.r((String[]) array));
        if (z4 && aVar.f5169c == 100) {
            return null;
        }
        return aVar;
    }

    @Override // x3.d
    public final w3.j h() {
        return this.f6280d;
    }
}
