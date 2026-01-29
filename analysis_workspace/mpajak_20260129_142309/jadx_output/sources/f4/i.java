package f4;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: b, reason: collision with root package name */
    public transient int f2862b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f2863c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2864d;

    /* renamed from: f, reason: collision with root package name */
    public static final a f2861f = new a();

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final i f2860e = new i(new byte[0]);

    /* loaded from: classes19.dex */
    public static final class a {
        public static i c(byte[] toByteString) {
            a aVar = i.f2861f;
            int length = toByteString.length;
            Intrinsics.checkNotNullParameter(toByteString, "$this$toByteString");
            b.b(toByteString.length, 0, length);
            return new i(ArraysKt.copyOfRange(toByteString, 0, length + 0));
        }

        @JvmStatic
        public final i a(String decodeHex) {
            Intrinsics.checkNotNullParameter(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(androidx.activity.d.f("Unexpected hex string: ", decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = i5 * 2;
                bArr[i5] = (byte) (f1.j.b(decodeHex.charAt(i6 + 1)) + (f1.j.b(decodeHex.charAt(i6)) << 4));
            }
            return new i(bArr);
        }

        @JvmStatic
        public final i b(String asUtf8ToByteArray) {
            Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$encodeUtf8");
            Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
            byte[] bytes = asUtf8ToByteArray.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.f2863c = asUtf8ToByteArray;
            return iVar;
        }
    }

    public i(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2864d = data;
    }

    public String a() {
        byte[] encodeBase64 = this.f2864d;
        byte[] bArr = f4.a.f2835a;
        byte[] map = f4.a.f2835a;
        Intrinsics.checkNotNullParameter(encodeBase64, "$this$encodeBase64");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] toUtf8String = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i5 + 1;
            byte b5 = encodeBase64[i5];
            int i8 = i7 + 1;
            byte b6 = encodeBase64[i7];
            int i9 = i8 + 1;
            byte b7 = encodeBase64[i8];
            int i10 = i6 + 1;
            toUtf8String[i6] = map[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            toUtf8String[i10] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i12 = i11 + 1;
            toUtf8String[i11] = map[((b6 & 15) << 2) | ((b7 & 255) >> 6)];
            i6 = i12 + 1;
            toUtf8String[i12] = map[b7 & 63];
            i5 = i9;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b8 = encodeBase64[i5];
            int i13 = i6 + 1;
            toUtf8String[i6] = map[(b8 & 255) >> 2];
            int i14 = i13 + 1;
            toUtf8String[i13] = map[(b8 & 3) << 4];
            byte b9 = (byte) 61;
            toUtf8String[i14] = b9;
            toUtf8String[i14 + 1] = b9;
        } else if (length2 == 2) {
            int i15 = i5 + 1;
            byte b10 = encodeBase64[i5];
            byte b11 = encodeBase64[i15];
            int i16 = i6 + 1;
            toUtf8String[i6] = map[(b10 & 255) >> 2];
            int i17 = i16 + 1;
            toUtf8String[i16] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            toUtf8String[i17] = map[(b11 & 15) << 2];
            toUtf8String[i17 + 1] = (byte) 61;
        }
        Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, Charsets.UTF_8);
    }

    public i b(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        byte[] digest = MessageDigest.getInstance(algorithm).digest(this.f2864d);
        Intrinsics.checkNotNullExpressionValue(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new i(digest);
    }

    public int c() {
        return this.f2864d.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(f4.i r8) {
        /*
            r7 = this;
            f4.i r8 = (f4.i) r8
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r7.c()
            int r1 = r8.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.f(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.f(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.i.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f2864d;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (byte b5 : bArr) {
            int i6 = i5 + 1;
            char[] cArr2 = f1.j.f2786e;
            cArr[i5] = cArr2[(b5 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f2864d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int c5 = iVar.c();
            byte[] bArr = this.f2864d;
            if (c5 == bArr.length && iVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i5) {
        return this.f2864d[i5];
    }

    public boolean g(int i5, byte[] other, int i6, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i5 >= 0) {
            byte[] bArr = this.f2864d;
            if (i5 <= bArr.length - i7 && i6 >= 0 && i6 <= other.length - i7 && b.a(bArr, i5, other, i6, i7)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(i other, int i5) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.g(0, this.f2864d, 0, i5);
    }

    public int hashCode() {
        int i5 = this.f2862b;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = Arrays.hashCode(this.f2864d);
        this.f2862b = hashCode;
        return hashCode;
    }

    public i i() {
        byte b5;
        int i5 = 0;
        while (true) {
            byte[] bArr = this.f2864d;
            if (i5 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i5];
            byte b7 = (byte) 65;
            if (b6 >= b7 && b6 <= (b5 = (byte) 90)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i5] = (byte) (b6 + 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b8 = copyOf[i6];
                    if (b8 >= b7 && b8 <= b5) {
                        copyOf[i6] = (byte) (b8 + 32);
                    }
                }
                return new i(copyOf);
            }
            i5++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f2864d;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public final String k() {
        String str = this.f2863c;
        if (str != null) {
            return str;
        }
        byte[] toUtf8String = e();
        Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
        String str2 = new String(toUtf8String, Charsets.UTF_8);
        this.f2863c = str2;
        return str2;
    }

    public void l(f buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.z(this.f2864d, 0, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0186, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0175, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0162, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f1, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0122, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0119, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0107, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00f8, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00e5, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00a5, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x009a, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0089, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b3, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f4, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ba, code lost:
    
        if (r4 == 64) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ab, code lost:
    
        if (r4 == 64) goto L214;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.i.toString():java.lang.String");
    }
}
