package s3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import s3.u;

/* loaded from: classes21.dex */
public final class v extends d1.f {

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final u f5307f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final u f5308g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f5309h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f5310i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f5311j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f5312k = new a();

    /* renamed from: b, reason: collision with root package name */
    public final u f5313b;

    /* renamed from: c, reason: collision with root package name */
    public long f5314c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.i f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f5316e;

    /* loaded from: classes17.dex */
    public static final class a {
        public final void a(StringBuilder appendQuotedString, String key) {
            String str;
            Intrinsics.checkNotNullParameter(appendQuotedString, "$this$appendQuotedString");
            Intrinsics.checkNotNullParameter(key, "key");
            appendQuotedString.append(Typography.quote);
            int length = key.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = key.charAt(i5);
                if (charAt == '\n') {
                    str = "%0A";
                } else if (charAt == '\r') {
                    str = "%0D";
                } else if (charAt != '\"') {
                    appendQuotedString.append(charAt);
                } else {
                    str = "%22";
                }
                appendQuotedString.append(str);
            }
            appendQuotedString.append(Typography.quote);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f5317c = new a();

        /* renamed from: a, reason: collision with root package name */
        public final r f5318a;

        /* renamed from: b, reason: collision with root package name */
        public final d1.f f5319b;

        /* loaded from: classes23.dex */
        public static final class a {
            @JvmStatic
            public final b a(String name, String str, d1.f body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                a aVar = v.f5312k;
                aVar.a(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    aVar.a(sb, str);
                }
                String value = sb.toString();
                Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
                ArrayList arrayList = new ArrayList(20);
                Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                Intrinsics.checkNotNullParameter(value, "value");
                r.f5279c.a("Content-Disposition");
                Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add("Content-Disposition");
                arrayList.add(StringsKt.trim((CharSequence) value).toString());
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                r rVar = new r((String[]) array);
                Intrinsics.checkNotNullParameter(body, "body");
                if (!(rVar.l("Content-Type") == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if (rVar.l("Content-Length") == null) {
                    return new b(rVar, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        public b(r rVar, d1.f fVar) {
            this.f5318a = rVar;
            this.f5319b = fVar;
        }
    }

    static {
        u.a aVar = u.f5303f;
        f5307f = aVar.a("multipart/mixed");
        aVar.a("multipart/alternative");
        aVar.a("multipart/digest");
        aVar.a("multipart/parallel");
        f5308g = aVar.a("multipart/form-data");
        f5309h = new byte[]{(byte) 58, (byte) 32};
        f5310i = new byte[]{(byte) 13, (byte) 10};
        byte b5 = (byte) 45;
        f5311j = new byte[]{b5, b5};
    }

    public v(f4.i boundaryByteString, u type, List<b> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f5315d = boundaryByteString;
        this.f5316e = parts;
        this.f5313b = u.f5303f.a(type + "; boundary=" + boundaryByteString.k());
        this.f5314c = -1L;
    }

    @Override // d1.f
    public final long A() {
        long j5 = this.f5314c;
        if (j5 != -1) {
            return j5;
        }
        long M = M(null, true);
        this.f5314c = M;
        return M;
    }

    @Override // d1.f
    public final u B() {
        return this.f5313b;
    }

    @Override // d1.f
    public final void K(f4.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        M(sink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long M(f4.g gVar, boolean z4) {
        f4.f fVar;
        if (z4) {
            gVar = new f4.f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.f5316e.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f5316e.get(i5);
            r rVar = bVar.f5318a;
            d1.f fVar2 = bVar.f5319b;
            Intrinsics.checkNotNull(gVar);
            gVar.G(f5311j);
            gVar.X(this.f5315d);
            gVar.G(f5310i);
            if (rVar != null) {
                int length = rVar.f5280b.length / 2;
                for (int i6 = 0; i6 < length; i6++) {
                    gVar.d0(rVar.r(i6)).G(f5309h).d0(rVar.t(i6)).G(f5310i);
                }
            }
            u B = fVar2.B();
            if (B != null) {
                gVar.d0("Content-Type: ").d0(B.f5304a).G(f5310i);
            }
            long A = fVar2.A();
            if (A != -1) {
                gVar.d0("Content-Length: ").e0(A).G(f5310i);
            } else if (z4) {
                Intrinsics.checkNotNull(fVar);
                fVar.a();
                return -1L;
            }
            byte[] bArr = f5310i;
            gVar.G(bArr);
            if (z4) {
                j5 += A;
            } else {
                fVar2.K(gVar);
            }
            gVar.G(bArr);
        }
        Intrinsics.checkNotNull(gVar);
        byte[] bArr2 = f5311j;
        gVar.G(bArr2);
        gVar.X(this.f5315d);
        gVar.G(bArr2);
        gVar.G(f5310i);
        if (!z4) {
            return j5;
        }
        Intrinsics.checkNotNull(fVar);
        long j6 = j5 + fVar.f2852c;
        fVar.a();
        return j6;
    }
}
