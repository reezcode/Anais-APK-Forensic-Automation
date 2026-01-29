package u3;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.b0;
import s3.d0;
import s3.r;
import s3.t;
import s3.x;
import s3.y;
import t3.c;
import w3.e;
import x3.g;

/* loaded from: classes18.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0072a f5468a = new C0072a();

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0072a {
        public static final b0 a(b0 b0Var) {
            if ((b0Var != null ? b0Var.f5160h : null) == null) {
                return b0Var;
            }
            b0.a aVar = new b0.a(b0Var);
            aVar.f5173g = null;
            return aVar.a();
        }

        public final boolean b(String str) {
            return StringsKt.g("Content-Length", str) || StringsKt.g("Content-Encoding", str) || StringsKt.g("Content-Type", str);
        }

        public final boolean c(String str) {
            return (StringsKt.g("Connection", str) || StringsKt.g("Keep-Alive", str) || StringsKt.g("Proxy-Authenticate", str) || StringsKt.g("Proxy-Authorization", str) || StringsKt.g("TE", str) || StringsKt.g("Trailers", str) || StringsKt.g("Transfer-Encoding", str) || StringsKt.g("Upgrade", str)) ? false : true;
        }
    }

    @Override // s3.t
    public final b0 a(t.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        e call = gVar.f5941b;
        System.currentTimeMillis();
        y request = gVar.f5945f;
        Intrinsics.checkNotNullParameter(request, "request");
        b bVar = new b(request, null);
        if (request != null && request.a().f5190j) {
            bVar = new b(null, null);
        }
        y yVar = bVar.f5469a;
        b0 cachedResponse = bVar.f5470b;
        boolean z4 = call instanceof e;
        if (yVar == null && cachedResponse == null) {
            b0.a aVar = new b0.a();
            aVar.g(gVar.f5945f);
            x protocol = x.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            aVar.f5168b = protocol;
            aVar.f5169c = 504;
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
            aVar.f5170d = "Unsatisfiable Request (only-if-cached)";
            aVar.f5173g = c.f5451c;
            aVar.f5177k = -1L;
            aVar.f5178l = System.currentTimeMillis();
            b0 response = aVar.a();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            return response;
        }
        if (yVar == null) {
            Intrinsics.checkNotNull(cachedResponse);
            b0.a aVar2 = new b0.a(cachedResponse);
            aVar2.b(C0072a.a(cachedResponse));
            b0 response2 = aVar2.a();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response2, "response");
            return response2;
        }
        if (cachedResponse != null) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        }
        b0 b5 = ((g) chain).b(yVar);
        if (cachedResponse != null) {
            if (b5.f5157e == 304) {
                b0.a aVar3 = new b0.a(cachedResponse);
                C0072a c0072a = f5468a;
                r rVar = cachedResponse.f5159g;
                r rVar2 = b5.f5159g;
                r.a aVar4 = new r.a();
                int length = rVar.f5280b.length / 2;
                for (int i5 = 0; i5 < length; i5++) {
                    String r4 = rVar.r(i5);
                    String t4 = rVar.t(i5);
                    if ((!StringsKt.g("Warning", r4) || !StringsKt.u(t4, "1")) && (c0072a.b(r4) || !c0072a.c(r4) || rVar2.l(r4) == null)) {
                        aVar4.a(r4, t4);
                    }
                }
                int length2 = rVar2.f5280b.length / 2;
                for (int i6 = 0; i6 < length2; i6++) {
                    String r5 = rVar2.r(i6);
                    if (!c0072a.b(r5) && c0072a.c(r5)) {
                        aVar4.a(r5, rVar2.t(i6));
                    }
                }
                aVar3.d(aVar4.b());
                aVar3.f5177k = b5.f5164l;
                aVar3.f5178l = b5.f5165m;
                aVar3.b(C0072a.a(cachedResponse));
                b0 a5 = C0072a.a(b5);
                aVar3.c("networkResponse", a5);
                aVar3.f5174h = a5;
                aVar3.a();
                d0 d0Var = b5.f5160h;
                Intrinsics.checkNotNull(d0Var);
                d0Var.close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            d0 d0Var2 = cachedResponse.f5160h;
            if (d0Var2 != null) {
                c.d(d0Var2);
            }
        }
        Intrinsics.checkNotNull(b5);
        b0.a aVar5 = new b0.a(b5);
        aVar5.b(C0072a.a(cachedResponse));
        b0 a6 = C0072a.a(b5);
        aVar5.c("networkResponse", a6);
        aVar5.f5174h = a6;
        return aVar5.a();
    }
}
