package x3;

import com.tencent.smtt.sdk.TbsListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import s3.b0;
import s3.d0;
import s3.e0;
import s3.s;
import s3.t;
import s3.w;
import s3.y;
import w3.l;
import w3.n;
import w3.o;

/* loaded from: classes23.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final w f5952a;

    public i(w client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f5952a = client;
    }

    @Override // s3.t
    public final b0 a(t.a chain) {
        List list;
        b0 b0Var;
        int i5;
        b0 b0Var2;
        List plus;
        boolean z4;
        b0 b0Var3;
        w3.c cVar;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        s3.f fVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        y yVar = gVar.f5945f;
        w3.e eVar = gVar.f5941b;
        boolean z5 = true;
        List emptyList = CollectionsKt.emptyList();
        b0 b0Var4 = null;
        int i6 = 0;
        y request = yVar;
        boolean z6 = true;
        while (true) {
            Objects.requireNonNull(eVar);
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(eVar.f5836j == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (eVar) {
                if (!(eVar.f5838l ^ z5)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(eVar.f5837k ^ z5)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z6) {
                l lVar = eVar.f5828b;
                s sVar = request.f5381b;
                if (sVar.f5284a) {
                    w wVar = eVar.f5843q;
                    SSLSocketFactory sSLSocketFactory2 = wVar.f5335q;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = wVar.f5339u;
                    fVar = wVar.f5340v;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    fVar = null;
                }
                String str = sVar.f5288e;
                int i7 = sVar.f5289f;
                w wVar2 = eVar.f5843q;
                list = emptyList;
                i5 = i6;
                b0Var = b0Var4;
                eVar.f5833g = new w3.d(lVar, new s3.a(str, i7, wVar2.f5330l, wVar2.f5334p, sSLSocketFactory, hostnameVerifier, fVar, wVar2.f5333o, wVar2.f5331m, wVar2.f5338t, wVar2.f5337s, wVar2.f5332n), eVar, eVar.f5829c);
            } else {
                list = emptyList;
                b0Var = b0Var4;
                i5 = i6;
            }
            try {
                if (eVar.f5840n) {
                    throw new IOException("Canceled");
                }
                try {
                    b0 b5 = gVar.b(request);
                    if (b0Var != null) {
                        b0.a aVar = new b0.a(b5);
                        b0.a aVar2 = new b0.a(b0Var);
                        aVar2.f5173g = null;
                        b0 a5 = aVar2.a();
                        if (!(a5.f5160h == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        aVar.f5176j = a5;
                        b5 = aVar.a();
                    }
                    b0Var3 = b5;
                    cVar = eVar.f5836j;
                } catch (IOException e5) {
                    b0Var2 = b0Var;
                    List list2 = list;
                    if (!c(e5, eVar, request, !(e5 instanceof z3.a))) {
                        t3.c.C(e5, list2);
                        throw e5;
                    }
                    plus = CollectionsKt.plus((Collection<? extends IOException>) list2, e5);
                    z4 = true;
                    eVar.f(z4);
                    emptyList = plus;
                    i6 = i5;
                    z6 = false;
                    b0Var4 = b0Var2;
                    z5 = true;
                } catch (n e6) {
                    List list3 = list;
                    b0Var2 = b0Var;
                    if (!c(e6.f5882b, eVar, request, false)) {
                        IOException iOException = e6.f5883c;
                        t3.c.C(iOException, list3);
                        throw iOException;
                    }
                    plus = CollectionsKt.plus((Collection<? extends IOException>) list3, e6.f5883c);
                    z4 = true;
                    eVar.f(z4);
                    emptyList = plus;
                    i6 = i5;
                    z6 = false;
                    b0Var4 = b0Var2;
                    z5 = true;
                }
                try {
                    request = b(b0Var3, cVar);
                    if (request == null) {
                        if (cVar != null && cVar.f5801a) {
                            eVar.k();
                        }
                        eVar.f(false);
                        return b0Var3;
                    }
                    d0 d0Var = b0Var3.f5160h;
                    if (d0Var != null) {
                        t3.c.d(d0Var);
                    }
                    i6 = i5 + 1;
                    if (i6 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i6);
                    }
                    eVar.f(true);
                    b0Var2 = b0Var3;
                    emptyList = list;
                    z6 = true;
                    b0Var4 = b0Var2;
                    z5 = true;
                } catch (Throwable th) {
                    th = th;
                    eVar.f(true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final y b(b0 b0Var, w3.c cVar) {
        String link;
        s.a aVar;
        s3.b bVar;
        w3.j jVar;
        d1.f fVar = null;
        e0 e0Var = (cVar == null || (jVar = cVar.f5802b) == null) ? null : jVar.f5874q;
        int i5 = b0Var.f5157e;
        String method = b0Var.f5154b.f5382c;
        if (i5 != 307 && i5 != 308) {
            if (i5 == 401) {
                bVar = this.f5952a.f5326h;
            } else {
                if (i5 == 421) {
                    if (cVar == null || !(!Intrinsics.areEqual(cVar.f5805e.f5825h.f5138a.f5288e, cVar.f5802b.f5874q.f5197a.f5138a.f5288e))) {
                        return null;
                    }
                    w3.j jVar2 = cVar.f5802b;
                    synchronized (jVar2) {
                        jVar2.f5867j = true;
                    }
                    return b0Var.f5154b;
                }
                if (i5 == 503) {
                    b0 b0Var2 = b0Var.f5163k;
                    if ((b0Var2 == null || b0Var2.f5157e != 503) && d(b0Var, Integer.MAX_VALUE) == 0) {
                        return b0Var.f5154b;
                    }
                    return null;
                }
                if (i5 == 407) {
                    Intrinsics.checkNotNull(e0Var);
                    if (e0Var.f5198b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    bVar = this.f5952a.f5333o;
                } else {
                    if (i5 == 408) {
                        if (!this.f5952a.f5325g) {
                            return null;
                        }
                        b0 b0Var3 = b0Var.f5163k;
                        if ((b0Var3 == null || b0Var3.f5157e != 408) && d(b0Var, 0) <= 0) {
                            return b0Var.f5154b;
                        }
                        return null;
                    }
                    switch (i5) {
                        case TbsListener.ErrorCode.ERROR_CODE_LOAD_BASE /* 300 */:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            }
            bVar.a(e0Var, b0Var);
            return null;
        }
        if (!this.f5952a.f5327i || (link = b0.a(b0Var, "Location")) == null) {
            return null;
        }
        s sVar = b0Var.f5154b.f5381b;
        Objects.requireNonNull(sVar);
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            aVar = new s.a();
            aVar.d(sVar, link);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        s url = aVar != null ? aVar.a() : null;
        if (url == null) {
            return null;
        }
        if (!Intrinsics.areEqual(url.f5285b, b0Var.f5154b.f5381b.f5285b) && !this.f5952a.f5328j) {
            return null;
        }
        y.a aVar2 = new y.a(b0Var.f5154b);
        if (f.a(method)) {
            int i6 = b0Var.f5157e;
            Intrinsics.checkNotNullParameter(method, "method");
            boolean z4 = Intrinsics.areEqual(method, "PROPFIND") || i6 == 308 || i6 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if ((true ^ Intrinsics.areEqual(method, "PROPFIND")) && i6 != 308 && i6 != 307) {
                method = "GET";
            } else if (z4) {
                fVar = b0Var.f5154b.f5384e;
            }
            aVar2.c(method, fVar);
            if (!z4) {
                aVar2.d("Transfer-Encoding");
                aVar2.d("Content-Length");
                aVar2.d("Content-Type");
            }
        }
        if (!t3.c.a(b0Var.f5154b.f5381b, url)) {
            aVar2.d("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        aVar2.f5386a = url;
        return aVar2.a();
    }

    public final boolean c(IOException iOException, w3.e eVar, y yVar, boolean z4) {
        boolean z5;
        o oVar;
        w3.j jVar;
        if (!this.f5952a.f5325g) {
            return false;
        }
        if (z4 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z4)))) {
            return false;
        }
        w3.d dVar = eVar.f5833g;
        Intrinsics.checkNotNull(dVar);
        int i5 = dVar.f5820c;
        if (i5 == 0 && dVar.f5821d == 0 && dVar.f5822e == 0) {
            z5 = false;
        } else {
            if (dVar.f5823f == null) {
                e0 e0Var = null;
                if (i5 <= 1 && dVar.f5821d <= 1 && dVar.f5822e <= 0 && (jVar = dVar.f5826i.f5834h) != null) {
                    synchronized (jVar) {
                        if (jVar.f5868k == 0 && t3.c.a(jVar.f5874q.f5197a.f5138a, dVar.f5825h.f5138a)) {
                            e0Var = jVar.f5874q;
                        }
                    }
                }
                if (e0Var != null) {
                    dVar.f5823f = e0Var;
                } else {
                    o.a aVar = dVar.f5818a;
                    if ((aVar == null || !aVar.a()) && (oVar = dVar.f5819b) != null) {
                        z5 = oVar.a();
                    }
                }
            }
            z5 = true;
        }
        return z5;
    }

    public final int d(b0 b0Var, int i5) {
        String a5 = b0.a(b0Var, "Retry-After");
        if (a5 == null) {
            return i5;
        }
        if (!new Regex("\\d+").matches(a5)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a5);
        Intrinsics.checkNotNullExpressionValue(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
