package y3;

import f4.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.r;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f6071a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6072b;

    public a(h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6072b = source;
        this.f6071a = 262144;
    }

    public final r a() {
        r.a aVar = new r.a();
        while (true) {
            String line = this.f6072b.O(this.f6071a);
            this.f6071a -= line.length();
            if (line.length() == 0) {
                return aVar.b();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            int h5 = StringsKt.h(line, ':', 1, 4);
            if (h5 != -1) {
                String substring = line.substring(0, h5);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = line.substring(h5 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                aVar.a(substring, substring2);
            } else {
                if (line.charAt(0) == ':') {
                    line = line.substring(1);
                    Intrinsics.checkNotNullExpressionValue(line, "(this as java.lang.String).substring(startIndex)");
                }
                aVar.a("", line);
            }
        }
    }
}
