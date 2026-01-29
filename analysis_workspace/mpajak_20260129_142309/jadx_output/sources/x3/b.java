package x3;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.b0;
import s3.d0;
import s3.o;
import s3.t;
import s3.y;
import w3.c;

/* loaded from: classes7.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5934a;

    public b(boolean z4) {
        this.f5934a = z4;
    }

    @Override // s3.t
    public final b0 a(t.a chain) {
        b0.a aVar;
        b0 a5;
        boolean z4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        w3.c cVar = gVar.f5944e;
        Intrinsics.checkNotNull(cVar);
        y request = gVar.f5945f;
        d1.f fVar = request.f5384e;
        long currentTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            o oVar = cVar.f5804d;
            w3.e call = cVar.f5803c;
            Objects.requireNonNull(oVar);
            Intrinsics.checkNotNullParameter(call, "call");
            cVar.f5806f.a(request);
            o oVar2 = cVar.f5804d;
            w3.e call2 = cVar.f5803c;
            Objects.requireNonNull(oVar2);
            Intrinsics.checkNotNullParameter(call2, "call");
            Intrinsics.checkNotNullParameter(request, "request");
            boolean z5 = true;
            if (!f.a(request.f5382c) || fVar == null) {
                cVar.f5803c.h(cVar, true, false, null);
                aVar = null;
            } else {
                if (StringsKt.g("100-continue", request.b("Expect"))) {
                    try {
                        cVar.f5806f.c();
                        aVar = cVar.d(true);
                        cVar.e();
                        z4 = false;
                    } catch (IOException e5) {
                        cVar.f5804d.b(cVar.f5803c, e5);
                        cVar.f(e5);
                        throw e5;
                    }
                } else {
                    z4 = true;
                    aVar = null;
                }
                if (aVar == null) {
                    f4.g d5 = d1.d.d(cVar.b(request));
                    fVar.K(d5);
                    ((f4.t) d5).close();
                } else {
                    cVar.f5803c.h(cVar, true, false, null);
                    if (!cVar.f5802b.j()) {
                        cVar.f5806f.h().l();
                    }
                }
                z5 = z4;
            }
            try {
                cVar.f5806f.b();
                if (aVar == null) {
                    aVar = cVar.d(false);
                    Intrinsics.checkNotNull(aVar);
                    if (z5) {
                        cVar.e();
                        z5 = false;
                    }
                }
                Objects.requireNonNull(aVar);
                Intrinsics.checkNotNullParameter(request, "request");
                aVar.f5167a = request;
                aVar.f5171e = cVar.f5802b.f5861d;
                aVar.f5177k = currentTimeMillis;
                aVar.f5178l = System.currentTimeMillis();
                b0 response = aVar.a();
                int i5 = response.f5157e;
                if (i5 == 100) {
                    b0.a d6 = cVar.d(false);
                    Intrinsics.checkNotNull(d6);
                    if (z5) {
                        cVar.e();
                    }
                    Objects.requireNonNull(d6);
                    Intrinsics.checkNotNullParameter(request, "request");
                    d6.f5167a = request;
                    d6.f5171e = cVar.f5802b.f5861d;
                    d6.f5177k = currentTimeMillis;
                    d6.f5178l = System.currentTimeMillis();
                    response = d6.a();
                    i5 = response.f5157e;
                }
                Intrinsics.checkNotNullParameter(response, "response");
                o oVar3 = cVar.f5804d;
                w3.e call3 = cVar.f5803c;
                Objects.requireNonNull(oVar3);
                Intrinsics.checkNotNullParameter(call3, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (this.f5934a && i5 == 101) {
                    b0.a aVar2 = new b0.a(response);
                    aVar2.f5173g = t3.c.f5451c;
                    a5 = aVar2.a();
                } else {
                    b0.a aVar3 = new b0.a(response);
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        String a6 = b0.a(response, "Content-Type");
                        long e6 = cVar.f5806f.e(response);
                        aVar3.f5173g = new h(a6, e6, d1.d.e(new c.b(cVar, cVar.f5806f.f(response), e6)));
                        a5 = aVar3.a();
                    } catch (IOException e7) {
                        cVar.f5804d.c(cVar.f5803c, e7);
                        cVar.f(e7);
                        throw e7;
                    }
                }
                if (StringsKt.g("close", a5.f5154b.b("Connection")) || StringsKt.g("close", b0.a(a5, "Connection"))) {
                    cVar.f5806f.h().l();
                }
                if (i5 == 204 || i5 == 205) {
                    d0 d0Var = a5.f5160h;
                    if ((d0Var != null ? d0Var.a() : -1L) > 0) {
                        StringBuilder e8 = androidx.appcompat.graphics.drawable.a.e("HTTP ", i5, " had non-zero Content-Length: ");
                        d0 d0Var2 = a5.f5160h;
                        e8.append(d0Var2 != null ? Long.valueOf(d0Var2.a()) : null);
                        throw new ProtocolException(e8.toString());
                    }
                }
                return a5;
            } catch (IOException e9) {
                cVar.f5804d.b(cVar.f5803c, e9);
                cVar.f(e9);
                throw e9;
            }
        } catch (IOException e10) {
            cVar.f5804d.b(cVar.f5803c, e10);
            cVar.f(e10);
            throw e10;
        }
    }
}
