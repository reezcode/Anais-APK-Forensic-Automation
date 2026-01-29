package x3;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import s3.b0;
import s3.t;
import s3.y;

/* loaded from: classes11.dex */
public final class g implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public int f5940a;

    /* renamed from: b, reason: collision with root package name */
    public final w3.e f5941b;

    /* renamed from: c, reason: collision with root package name */
    public final List<t> f5942c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5943d;

    /* renamed from: e, reason: collision with root package name */
    public final w3.c f5944e;

    /* renamed from: f, reason: collision with root package name */
    public final y f5945f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5946g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5947h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5948i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(w3.e call, List<? extends t> interceptors, int i5, w3.c cVar, y request, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5941b = call;
        this.f5942c = interceptors;
        this.f5943d = i5;
        this.f5944e = cVar;
        this.f5945f = request;
        this.f5946g = i6;
        this.f5947h = i7;
        this.f5948i = i8;
    }

    public static g a(g gVar, int i5, w3.c cVar, y yVar, int i6) {
        if ((i6 & 1) != 0) {
            i5 = gVar.f5943d;
        }
        int i7 = i5;
        if ((i6 & 2) != 0) {
            cVar = gVar.f5944e;
        }
        w3.c cVar2 = cVar;
        if ((i6 & 4) != 0) {
            yVar = gVar.f5945f;
        }
        y request = yVar;
        int i8 = (i6 & 8) != 0 ? gVar.f5946g : 0;
        int i9 = (i6 & 16) != 0 ? gVar.f5947h : 0;
        int i10 = (i6 & 32) != 0 ? gVar.f5948i : 0;
        Objects.requireNonNull(gVar);
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(gVar.f5941b, gVar.f5942c, i7, cVar2, request, i8, i9, i10);
    }

    public final b0 b(y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.f5943d < this.f5942c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f5940a++;
        w3.c cVar = this.f5944e;
        if (cVar != null) {
            if (!cVar.f5805e.b(request.f5381b)) {
                StringBuilder g5 = androidx.activity.d.g("network interceptor ");
                g5.append(this.f5942c.get(this.f5943d - 1));
                g5.append(" must retain the same host and port");
                throw new IllegalStateException(g5.toString().toString());
            }
            if (!(this.f5940a == 1)) {
                StringBuilder g6 = androidx.activity.d.g("network interceptor ");
                g6.append(this.f5942c.get(this.f5943d - 1));
                g6.append(" must call proceed() exactly once");
                throw new IllegalStateException(g6.toString().toString());
            }
        }
        g a5 = a(this, this.f5943d + 1, null, request, 58);
        t tVar = this.f5942c.get(this.f5943d);
        b0 a6 = tVar.a(a5);
        if (a6 == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (this.f5944e != null) {
            if (!(this.f5943d + 1 >= this.f5942c.size() || a5.f5940a == 1)) {
                throw new IllegalStateException(("network interceptor " + tVar + " must call proceed() exactly once").toString());
            }
        }
        if (a6.f5160h != null) {
            return a6;
        }
        throw new IllegalStateException(("interceptor " + tVar + " returned a response with no body").toString());
    }
}
