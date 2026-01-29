package x3;

import f4.n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.b0;
import s3.d0;
import s3.k;
import s3.l;
import s3.r;
import s3.t;
import s3.u;
import s3.y;

/* loaded from: classes4.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final l f5933a;

    public a(l cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f5933a = cookieJar;
    }

    @Override // s3.t
    public final b0 a(t.a chain) {
        boolean z4;
        d0 d0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        y request = gVar.f5945f;
        y.a aVar = new y.a(request);
        d1.f fVar = request.f5384e;
        if (fVar != null) {
            u B = fVar.B();
            if (B != null) {
                aVar.b("Content-Type", B.f5304a);
            }
            long A = fVar.A();
            if (A != -1) {
                aVar.b("Content-Length", String.valueOf(A));
                aVar.d("Transfer-Encoding");
            } else {
                aVar.b("Transfer-Encoding", "chunked");
                aVar.d("Content-Length");
            }
        }
        int i5 = 0;
        if (request.b("Host") == null) {
            aVar.b("Host", t3.c.y(request.f5381b, false));
        }
        if (request.b("Connection") == null) {
            aVar.b("Connection", "Keep-Alive");
        }
        if (request.b("Accept-Encoding") == null && request.b("Range") == null) {
            aVar.b("Accept-Encoding", "gzip");
            z4 = true;
        } else {
            z4 = false;
        }
        List<k> a5 = this.f5933a.a(request.f5381b);
        if (true ^ a5.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : a5) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                k kVar = (k) obj;
                if (i5 > 0) {
                    sb.append("; ");
                }
                sb.append(kVar.f5250a);
                sb.append('=');
                sb.append(kVar.f5251b);
                i5 = i6;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar.b("Cookie", sb2);
        }
        if (request.b("User-Agent") == null) {
            aVar.b("User-Agent", "okhttp/4.9.3");
        }
        b0 b5 = gVar.b(aVar.a());
        e.b(this.f5933a, request.f5381b, b5.f5159g);
        b0.a aVar2 = new b0.a(b5);
        Intrinsics.checkNotNullParameter(request, "request");
        aVar2.f5167a = request;
        if (z4 && StringsKt.g("gzip", b0.a(b5, "Content-Encoding")) && e.a(b5) && (d0Var = b5.f5160h) != null) {
            n nVar = new n(d0Var.c());
            r.a s4 = b5.f5159g.s();
            s4.c("Content-Encoding");
            s4.c("Content-Length");
            aVar2.d(s4.b());
            aVar2.f5173g = new h(b0.a(b5, "Content-Type"), -1L, d1.d.e(nVar));
        }
        return aVar2.a();
    }
}
