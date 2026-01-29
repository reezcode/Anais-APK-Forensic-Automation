package s3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import s3.r;
import s3.s;

/* loaded from: classes23.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public c f5380a;

    /* renamed from: b, reason: collision with root package name */
    public final s f5381b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5382c;

    /* renamed from: d, reason: collision with root package name */
    public final r f5383d;

    /* renamed from: e, reason: collision with root package name */
    public final d1.f f5384e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, Object> f5385f;

    /* loaded from: classes12.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public s f5386a;

        /* renamed from: b, reason: collision with root package name */
        public String f5387b;

        /* renamed from: c, reason: collision with root package name */
        public r.a f5388c;

        /* renamed from: d, reason: collision with root package name */
        public d1.f f5389d;

        /* renamed from: e, reason: collision with root package name */
        public Map<Class<?>, Object> f5390e;

        public a() {
            this.f5390e = new LinkedHashMap();
            this.f5387b = "GET";
            this.f5388c = new r.a();
        }

        public a(y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f5390e = new LinkedHashMap();
            this.f5386a = request.f5381b;
            this.f5387b = request.f5382c;
            this.f5389d = request.f5384e;
            this.f5390e = request.f5385f.isEmpty() ? new LinkedHashMap<>() : MapsKt.toMutableMap(request.f5385f);
            this.f5388c = request.f5383d.s();
        }

        public final y a() {
            Map unmodifiableMap;
            s sVar = this.f5386a;
            if (sVar == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.f5387b;
            r b5 = this.f5388c.b();
            d1.f fVar = this.f5389d;
            Map<Class<?>, Object> toImmutableMap = this.f5390e;
            byte[] bArr = t3.c.f5449a;
            Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
            if (toImmutableMap.isEmpty()) {
                unmodifiableMap = MapsKt.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new y(sVar, str, b5, fVar, unmodifiableMap);
        }

        public final a b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5388c.d(name, value);
            return this;
        }

        public final a c(String method, d1.f fVar) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (fVar == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (!(!(Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")))) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.a.j("method ", method, " must have a request body.").toString());
                }
            } else if (!x3.f.a(method)) {
                throw new IllegalArgumentException(androidx.appcompat.widget.a.j("method ", method, " must not have a request body.").toString());
            }
            this.f5387b = method;
            this.f5389d = fVar;
            return this;
        }

        public final a d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f5388c.c(name);
            return this;
        }

        public final a e(String toHttpUrl) {
            boolean startsWith;
            boolean startsWith2;
            StringBuilder g5;
            int i5;
            Intrinsics.checkNotNullParameter(toHttpUrl, "url");
            startsWith = StringsKt__StringsJVMKt.startsWith(toHttpUrl, "ws:", true);
            if (!startsWith) {
                startsWith2 = StringsKt__StringsJVMKt.startsWith(toHttpUrl, "wss:", true);
                if (startsWith2) {
                    g5 = androidx.activity.d.g("https:");
                    i5 = 4;
                }
                Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
                s.a aVar = new s.a();
                aVar.d(null, toHttpUrl);
                s url = aVar.a();
                Intrinsics.checkNotNullParameter(url, "url");
                this.f5386a = url;
                return this;
            }
            g5 = androidx.activity.d.g("http:");
            i5 = 3;
            String substring = toHttpUrl.substring(i5);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            g5.append(substring);
            toHttpUrl = g5.toString();
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            s.a aVar2 = new s.a();
            aVar2.d(null, toHttpUrl);
            s url2 = aVar2.a();
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f5386a = url2;
            return this;
        }

        public final a f(s url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f5386a = url;
            return this;
        }
    }

    public y(s url, String method, r headers, d1.f fVar, Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f5381b = url;
        this.f5382c = method;
        this.f5383d = headers;
        this.f5384e = fVar;
        this.f5385f = tags;
    }

    @JvmName(name = "cacheControl")
    public final c a() {
        c cVar = this.f5380a;
        if (cVar != null) {
            return cVar;
        }
        c b5 = c.f5180n.b(this.f5383d);
        this.f5380a = b5;
        return b5;
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f5383d.l(name);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Request{method=");
        g5.append(this.f5382c);
        g5.append(", url=");
        g5.append(this.f5381b);
        if (this.f5383d.f5280b.length / 2 != 0) {
            g5.append(", headers=[");
            int i5 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f5383d) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i5 > 0) {
                    g5.append(", ");
                }
                androidx.appcompat.widget.a.n(g5, component1, ':', component2);
                i5 = i6;
            }
            g5.append(']');
        }
        if (!this.f5385f.isEmpty()) {
            g5.append(", tags=");
            g5.append(this.f5385f);
        }
        g5.append('}');
        String sb = g5.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
