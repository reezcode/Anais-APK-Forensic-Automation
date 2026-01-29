package x3;

import f4.i;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.b0;

@JvmName(name = "HttpHeaders")
/* loaded from: classes25.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final f4.i f5938a;

    /* renamed from: b, reason: collision with root package name */
    public static final f4.i f5939b;

    static {
        i.a aVar = f4.i.f2861f;
        f5938a = aVar.b("\"\\");
        f5939b = aVar.b("\t ,=");
    }

    public static final boolean a(b0 promisesBody) {
        Intrinsics.checkNotNullParameter(promisesBody, "$this$promisesBody");
        if (Intrinsics.areEqual(promisesBody.f5154b.f5382c, "HEAD")) {
            return false;
        }
        int i5 = promisesBody.f5157e;
        return (((i5 >= 100 && i5 < 200) || i5 == 204 || i5 == 304) && t3.c.l(promisesBody) == -1 && !StringsKt.g("chunked", b0.a(promisesBody, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x022f, code lost:
    
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f4575g.a(r15) == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0215, code lost:
    
        if (t3.c.f5454f.matches(r0) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x021a, code lost:
    
        if (r19 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(s3.l r39, s3.s r40, s3.r r41) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.b(s3.l, s3.s, s3.r):void");
    }
}
