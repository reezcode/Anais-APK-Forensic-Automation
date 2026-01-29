package g4;

import f4.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2982a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        f2982a = bytes;
    }

    public static final String a(f readUtf8Line, long j5) {
        String r4;
        Intrinsics.checkNotNullParameter(readUtf8Line, "$this$readUtf8Line");
        long j6 = 1;
        if (j5 > 0) {
            long j7 = j5 - 1;
            if (readUtf8Line.c(j7) == ((byte) 13)) {
                r4 = readUtf8Line.r(j7);
                j6 = 2;
                readUtf8Line.skip(j6);
                return r4;
            }
        }
        r4 = readUtf8Line.r(j5);
        readUtf8Line.skip(j6);
        return r4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(f4.f r17, f4.r r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.a.b(f4.f, f4.r, boolean):int");
    }
}
