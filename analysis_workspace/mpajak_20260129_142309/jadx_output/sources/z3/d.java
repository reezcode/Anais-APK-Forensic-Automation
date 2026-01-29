package z3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import f4.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import z3.s;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c[] f6181a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<f4.i, Integer> f6182b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f6183c = new d();

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<c> f6184a;

        /* renamed from: b, reason: collision with root package name */
        public final f4.u f6185b;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public c[] f6186c;

        /* renamed from: d, reason: collision with root package name */
        public int f6187d;

        /* renamed from: e, reason: collision with root package name */
        @JvmField
        public int f6188e;

        /* renamed from: f, reason: collision with root package name */
        @JvmField
        public int f6189f;

        /* renamed from: g, reason: collision with root package name */
        public final int f6190g;

        /* renamed from: h, reason: collision with root package name */
        public int f6191h;

        public a(a0 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f6190g = 4096;
            this.f6191h = 4096;
            this.f6184a = new ArrayList();
            this.f6185b = (f4.u) d1.d.e(source);
            this.f6186c = new c[8];
            this.f6187d = 7;
        }

        public final void a() {
            ArraysKt___ArraysJvmKt.fill$default(this.f6186c, (Object) null, 0, 0, 6, (Object) null);
            this.f6187d = this.f6186c.length - 1;
            this.f6188e = 0;
            this.f6189f = 0;
        }

        public final int b(int i5) {
            int i6;
            int i7 = 0;
            if (i5 > 0) {
                int length = this.f6186c.length;
                while (true) {
                    length--;
                    i6 = this.f6187d;
                    if (length < i6 || i5 <= 0) {
                        break;
                    }
                    c cVar = this.f6186c[length];
                    Intrinsics.checkNotNull(cVar);
                    int i8 = cVar.f6178a;
                    i5 -= i8;
                    this.f6189f -= i8;
                    this.f6188e--;
                    i7++;
                }
                c[] cVarArr = this.f6186c;
                System.arraycopy(cVarArr, i6 + 1, cVarArr, i6 + 1 + i7, this.f6188e);
                this.f6187d += i7;
            }
            return i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final f4.i c(int r4) {
            /*
                r3 = this;
                if (r4 < 0) goto Ld
                z3.d r0 = z3.d.f6183c
                z3.c[] r0 = z3.d.f6181a
                int r0 = r0.length
                int r0 = r0 + (-1)
                if (r4 > r0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L17
                z3.d r0 = z3.d.f6183c
                z3.c[] r0 = z3.d.f6181a
                r4 = r0[r4]
                goto L2f
            L17:
                z3.d r0 = z3.d.f6183c
                z3.c[] r0 = z3.d.f6181a
                int r0 = r0.length
                int r0 = r4 - r0
                int r1 = r3.f6187d
                int r1 = r1 + 1
                int r1 = r1 + r0
                if (r1 < 0) goto L32
                z3.c[] r0 = r3.f6186c
                int r2 = r0.length
                if (r1 >= r2) goto L32
                r4 = r0[r1]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            L2f:
                f4.i r4 = r4.f6179b
                return r4
            L32:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Header index too large "
                java.lang.StringBuilder r1 = androidx.activity.d.g(r1)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.d.a.c(int):f4.i");
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<z3.c>] */
        public final void d(c cVar) {
            this.f6184a.add(cVar);
            int i5 = cVar.f6178a;
            int i6 = this.f6191h;
            if (i5 > i6) {
                a();
                return;
            }
            b((this.f6189f + i5) - i6);
            int i7 = this.f6188e + 1;
            c[] cVarArr = this.f6186c;
            if (i7 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f6187d = this.f6186c.length - 1;
                this.f6186c = cVarArr2;
            }
            int i8 = this.f6187d;
            this.f6187d = i8 - 1;
            this.f6186c[i8] = cVar;
            this.f6188e++;
            this.f6189f += i5;
        }

        public final f4.i e() {
            byte readByte = this.f6185b.readByte();
            byte[] bArr = t3.c.f5449a;
            int i5 = readByte & 255;
            int i6 = 0;
            boolean z4 = (i5 & 128) == 128;
            long f5 = f(i5, 127);
            if (!z4) {
                return this.f6185b.d(f5);
            }
            f4.f sink = new f4.f();
            s sVar = s.f6330d;
            f4.u source = this.f6185b;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            s.a aVar = s.f6329c;
            int i7 = 0;
            for (long j5 = 0; j5 < f5; j5++) {
                byte readByte2 = source.readByte();
                byte[] bArr2 = t3.c.f5449a;
                i6 = (i6 << 8) | (readByte2 & 255);
                i7 += 8;
                while (i7 >= 8) {
                    int i8 = i7 - 8;
                    s.a[] aVarArr = aVar.f6331a;
                    Intrinsics.checkNotNull(aVarArr);
                    aVar = aVarArr[(i6 >>> i8) & 255];
                    Intrinsics.checkNotNull(aVar);
                    if (aVar.f6331a == null) {
                        sink.A(aVar.f6332b);
                        i7 -= aVar.f6333c;
                        aVar = s.f6329c;
                    } else {
                        i7 = i8;
                    }
                }
            }
            while (i7 > 0) {
                s.a[] aVarArr2 = aVar.f6331a;
                Intrinsics.checkNotNull(aVarArr2);
                s.a aVar2 = aVarArr2[(i6 << (8 - i7)) & 255];
                Intrinsics.checkNotNull(aVar2);
                if (aVar2.f6331a != null || aVar2.f6333c > i7) {
                    break;
                }
                sink.A(aVar2.f6332b);
                i7 -= aVar2.f6333c;
                aVar = s.f6329c;
            }
            return sink.l();
        }

        public final int f(int i5, int i6) {
            int i7 = i5 & i6;
            if (i7 < i6) {
                return i7;
            }
            int i8 = 0;
            while (true) {
                byte readByte = this.f6185b.readByte();
                byte[] bArr = t3.c.f5449a;
                int i9 = readByte & 255;
                if ((i9 & 128) == 0) {
                    return i6 + (i9 << i8);
                }
                i6 += (i9 & 127) << i8;
                i8 += 7;
            }
        }
    }

    /* loaded from: classes23.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f6192a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6193b;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public int f6194c;

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        public c[] f6195d;

        /* renamed from: e, reason: collision with root package name */
        public int f6196e;

        /* renamed from: f, reason: collision with root package name */
        @JvmField
        public int f6197f;

        /* renamed from: g, reason: collision with root package name */
        @JvmField
        public int f6198g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f6199h;

        /* renamed from: i, reason: collision with root package name */
        public final f4.f f6200i;

        public b(f4.f out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f6199h = true;
            this.f6200i = out;
            this.f6192a = Integer.MAX_VALUE;
            this.f6194c = 4096;
            this.f6195d = new c[8];
            this.f6196e = 7;
        }

        public final void a() {
            ArraysKt___ArraysJvmKt.fill$default(this.f6195d, (Object) null, 0, 0, 6, (Object) null);
            this.f6196e = this.f6195d.length - 1;
            this.f6197f = 0;
            this.f6198g = 0;
        }

        public final int b(int i5) {
            int i6;
            int i7 = 0;
            if (i5 > 0) {
                int length = this.f6195d.length;
                while (true) {
                    length--;
                    i6 = this.f6196e;
                    if (length < i6 || i5 <= 0) {
                        break;
                    }
                    c cVar = this.f6195d[length];
                    Intrinsics.checkNotNull(cVar);
                    i5 -= cVar.f6178a;
                    int i8 = this.f6198g;
                    c cVar2 = this.f6195d[length];
                    Intrinsics.checkNotNull(cVar2);
                    this.f6198g = i8 - cVar2.f6178a;
                    this.f6197f--;
                    i7++;
                }
                c[] cVarArr = this.f6195d;
                System.arraycopy(cVarArr, i6 + 1, cVarArr, i6 + 1 + i7, this.f6197f);
                c[] cVarArr2 = this.f6195d;
                int i9 = this.f6196e;
                Arrays.fill(cVarArr2, i9 + 1, i9 + 1 + i7, (Object) null);
                this.f6196e += i7;
            }
            return i7;
        }

        public final void c(c cVar) {
            int i5 = cVar.f6178a;
            int i6 = this.f6194c;
            if (i5 > i6) {
                a();
                return;
            }
            b((this.f6198g + i5) - i6);
            int i7 = this.f6197f + 1;
            c[] cVarArr = this.f6195d;
            if (i7 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f6196e = this.f6195d.length - 1;
                this.f6195d = cVarArr2;
            }
            int i8 = this.f6196e;
            this.f6196e = i8 - 1;
            this.f6195d[i8] = cVar;
            this.f6197f++;
            this.f6198g += i5;
        }

        public final void d(f4.i source) {
            int c5;
            Intrinsics.checkNotNullParameter(source, "data");
            int i5 = 0;
            if (this.f6199h) {
                s sVar = s.f6330d;
                Intrinsics.checkNotNullParameter(source, "bytes");
                int c6 = source.c();
                long j5 = 0;
                for (int i6 = 0; i6 < c6; i6++) {
                    byte f5 = source.f(i6);
                    byte[] bArr = t3.c.f5449a;
                    j5 += s.f6328b[f5 & 255];
                }
                if (((int) ((j5 + 7) >> 3)) < source.c()) {
                    f4.f sink = new f4.f();
                    s sVar2 = s.f6330d;
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    int c7 = source.c();
                    long j6 = 0;
                    int i7 = 0;
                    while (i5 < c7) {
                        byte f6 = source.f(i5);
                        byte[] bArr2 = t3.c.f5449a;
                        int i8 = f6 & 255;
                        int i9 = s.f6327a[i8];
                        byte b5 = s.f6328b[i8];
                        j6 = (j6 << b5) | i9;
                        i7 += b5;
                        while (i7 >= 8) {
                            i7 -= 8;
                            sink.C((int) (j6 >> i7));
                        }
                        i5++;
                    }
                    if (i7 > 0) {
                        sink.C((int) ((255 >>> i7) | (j6 << (8 - i7))));
                    }
                    source = sink.l();
                    c5 = source.c();
                    i5 = 128;
                    f(c5, 127, i5);
                    this.f6200i.x(source);
                }
            }
            c5 = source.c();
            f(c5, 127, i5);
            this.f6200i.x(source);
        }

        public final void e(List<c> headerBlock) {
            int i5;
            int i6;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f6193b) {
                int i7 = this.f6192a;
                if (i7 < this.f6194c) {
                    f(i7, 31, 32);
                }
                this.f6193b = false;
                this.f6192a = Integer.MAX_VALUE;
                f(this.f6194c, 31, 32);
            }
            int size = headerBlock.size();
            for (int i8 = 0; i8 < size; i8++) {
                c cVar = headerBlock.get(i8);
                f4.i i9 = cVar.f6179b.i();
                f4.i iVar = cVar.f6180c;
                d dVar = d.f6183c;
                Integer num = d.f6182b.get(i9);
                if (num != null) {
                    i5 = num.intValue() + 1;
                    if (2 <= i5 && 7 >= i5) {
                        c[] cVarArr = d.f6181a;
                        if (Intrinsics.areEqual(cVarArr[i5 - 1].f6180c, iVar)) {
                            i6 = i5;
                        } else if (Intrinsics.areEqual(cVarArr[i5].f6180c, iVar)) {
                            i6 = i5;
                            i5++;
                        }
                    }
                    i6 = i5;
                    i5 = -1;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                if (i5 == -1) {
                    int i10 = this.f6196e + 1;
                    int length = this.f6195d.length;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        c cVar2 = this.f6195d[i10];
                        Intrinsics.checkNotNull(cVar2);
                        if (Intrinsics.areEqual(cVar2.f6179b, i9)) {
                            c cVar3 = this.f6195d[i10];
                            Intrinsics.checkNotNull(cVar3);
                            if (Intrinsics.areEqual(cVar3.f6180c, iVar)) {
                                int i11 = i10 - this.f6196e;
                                d dVar2 = d.f6183c;
                                i5 = d.f6181a.length + i11;
                                break;
                            } else if (i6 == -1) {
                                int i12 = i10 - this.f6196e;
                                d dVar3 = d.f6183c;
                                i6 = i12 + d.f6181a.length;
                            }
                        }
                        i10++;
                    }
                }
                if (i5 != -1) {
                    f(i5, 127, 128);
                } else {
                    if (i6 == -1) {
                        this.f6200i.A(64);
                        d(i9);
                    } else {
                        f4.i prefix = c.f6172d;
                        Objects.requireNonNull(i9);
                        Intrinsics.checkNotNullParameter(prefix, "prefix");
                        if (i9.h(prefix, prefix.f2864d.length) && (!Intrinsics.areEqual(c.f6177i, i9))) {
                            f(i6, 15, 0);
                            d(iVar);
                        } else {
                            f(i6, 63, 64);
                        }
                    }
                    d(iVar);
                    c(cVar);
                }
            }
        }

        public final void f(int i5, int i6, int i7) {
            int i8;
            f4.f fVar;
            if (i5 < i6) {
                fVar = this.f6200i;
                i8 = i5 | i7;
            } else {
                this.f6200i.A(i7 | i6);
                i8 = i5 - i6;
                while (i8 >= 128) {
                    this.f6200i.A(128 | (i8 & 127));
                    i8 >>>= 7;
                }
                fVar = this.f6200i;
            }
            fVar.A(i8);
        }
    }

    static {
        c cVar = new c(c.f6177i, "");
        f4.i iVar = c.f6174f;
        f4.i iVar2 = c.f6175g;
        f4.i iVar3 = c.f6176h;
        f4.i iVar4 = c.f6173e;
        c[] cVarArr = {cVar, new c(iVar, "GET"), new c(iVar, "POST"), new c(iVar2, "/"), new c(iVar2, "/index.html"), new c(iVar3, "http"), new c(iVar3, "https"), new c(iVar4, "200"), new c(iVar4, "204"), new c(iVar4, "206"), new c(iVar4, "304"), new c(iVar4, "400"), new c(iVar4, "404"), new c(iVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f6181a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            c[] cVarArr2 = f6181a;
            if (!linkedHashMap.containsKey(cVarArr2[i5].f6179b)) {
                linkedHashMap.put(cVarArr2[i5].f6179b, Integer.valueOf(i5));
            }
        }
        Map<f4.i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f6182b = unmodifiableMap;
    }

    public final f4.i a(f4.i name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int c5 = name.c();
        for (int i5 = 0; i5 < c5; i5++) {
            byte b5 = (byte) 65;
            byte b6 = (byte) 90;
            byte f5 = name.f(i5);
            if (b5 <= f5 && b6 >= f5) {
                StringBuilder g5 = androidx.activity.d.g("PROTOCOL_ERROR response malformed: mixed case name: ");
                g5.append(name.k());
                throw new IOException(g5.toString());
            }
        }
        return name;
    }
}
