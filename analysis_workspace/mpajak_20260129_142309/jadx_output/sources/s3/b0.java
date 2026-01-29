package s3;

import java.io.Closeable;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import s3.r;

/* loaded from: classes22.dex */
public final class b0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final y f5154b;

    /* renamed from: c, reason: collision with root package name */
    public final x f5155c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5156d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5157e;

    /* renamed from: f, reason: collision with root package name */
    public final q f5158f;

    /* renamed from: g, reason: collision with root package name */
    public final r f5159g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f5160h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f5161i;

    /* renamed from: j, reason: collision with root package name */
    public final b0 f5162j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f5163k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5164l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5165m;

    /* renamed from: n, reason: collision with root package name */
    public final w3.c f5166n;

    /* loaded from: classes25.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public y f5167a;

        /* renamed from: b, reason: collision with root package name */
        public x f5168b;

        /* renamed from: c, reason: collision with root package name */
        public int f5169c;

        /* renamed from: d, reason: collision with root package name */
        public String f5170d;

        /* renamed from: e, reason: collision with root package name */
        public q f5171e;

        /* renamed from: f, reason: collision with root package name */
        public r.a f5172f;

        /* renamed from: g, reason: collision with root package name */
        public d0 f5173g;

        /* renamed from: h, reason: collision with root package name */
        public b0 f5174h;

        /* renamed from: i, reason: collision with root package name */
        public b0 f5175i;

        /* renamed from: j, reason: collision with root package name */
        public b0 f5176j;

        /* renamed from: k, reason: collision with root package name */
        public long f5177k;

        /* renamed from: l, reason: collision with root package name */
        public long f5178l;

        /* renamed from: m, reason: collision with root package name */
        public w3.c f5179m;

        public a() {
            this.f5169c = -1;
            this.f5172f = new r.a();
        }

        public a(b0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f5169c = -1;
            this.f5167a = response.f5154b;
            this.f5168b = response.f5155c;
            this.f5169c = response.f5157e;
            this.f5170d = response.f5156d;
            this.f5171e = response.f5158f;
            this.f5172f = response.f5159g.s();
            this.f5173g = response.f5160h;
            this.f5174h = response.f5161i;
            this.f5175i = response.f5162j;
            this.f5176j = response.f5163k;
            this.f5177k = response.f5164l;
            this.f5178l = response.f5165m;
            this.f5179m = response.f5166n;
        }

        public final b0 a() {
            int i5 = this.f5169c;
            if (!(i5 >= 0)) {
                StringBuilder g5 = androidx.activity.d.g("code < 0: ");
                g5.append(this.f5169c);
                throw new IllegalStateException(g5.toString().toString());
            }
            y yVar = this.f5167a;
            if (yVar == null) {
                throw new IllegalStateException("request == null".toString());
            }
            x xVar = this.f5168b;
            if (xVar == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f5170d;
            if (str != null) {
                return new b0(yVar, xVar, str, i5, this.f5171e, this.f5172f.b(), this.f5173g, this.f5174h, this.f5175i, this.f5176j, this.f5177k, this.f5178l, this.f5179m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public final a b(b0 b0Var) {
            c("cacheResponse", b0Var);
            this.f5175i = b0Var;
            return this;
        }

        public final void c(String str, b0 b0Var) {
            if (b0Var != null) {
                if (!(b0Var.f5160h == null)) {
                    throw new IllegalArgumentException(androidx.activity.d.f(str, ".body != null").toString());
                }
                if (!(b0Var.f5161i == null)) {
                    throw new IllegalArgumentException(androidx.activity.d.f(str, ".networkResponse != null").toString());
                }
                if (!(b0Var.f5162j == null)) {
                    throw new IllegalArgumentException(androidx.activity.d.f(str, ".cacheResponse != null").toString());
                }
                if (!(b0Var.f5163k == null)) {
                    throw new IllegalArgumentException(androidx.activity.d.f(str, ".priorResponse != null").toString());
                }
            }
        }

        public final a d(r headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f5172f = headers.s();
            return this;
        }

        public final a e(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f5170d = message;
            return this;
        }

        public final a f(x protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f5168b = protocol;
            return this;
        }

        public final a g(y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f5167a = request;
            return this;
        }
    }

    public b0(y request, x protocol, String message, int i5, q qVar, r headers, d0 d0Var, b0 b0Var, b0 b0Var2, b0 b0Var3, long j5, long j6, w3.c cVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f5154b = request;
        this.f5155c = protocol;
        this.f5156d = message;
        this.f5157e = i5;
        this.f5158f = qVar;
        this.f5159g = headers;
        this.f5160h = d0Var;
        this.f5161i = b0Var;
        this.f5162j = b0Var2;
        this.f5163k = b0Var3;
        this.f5164l = j5;
        this.f5165m = j6;
        this.f5166n = cVar;
    }

    public static String a(b0 b0Var, String name) {
        Objects.requireNonNull(b0Var);
        Intrinsics.checkNotNullParameter(name, "name");
        String l5 = b0Var.f5159g.l(name);
        if (l5 != null) {
            return l5;
        }
        return null;
    }

    public final boolean b() {
        int i5 = this.f5157e;
        return 200 <= i5 && 299 >= i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d0 d0Var = this.f5160h;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        d0Var.close();
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Response{protocol=");
        g5.append(this.f5155c);
        g5.append(", code=");
        g5.append(this.f5157e);
        g5.append(", message=");
        g5.append(this.f5156d);
        g5.append(", url=");
        g5.append(this.f5154b.f5381b);
        g5.append('}');
        return g5.toString();
    }
}
