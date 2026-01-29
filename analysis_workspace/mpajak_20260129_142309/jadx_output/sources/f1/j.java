package f1;

import java.util.concurrent.ConcurrentSkipListMap;
import k2.q;
import kotlin.jvm.internal.Intrinsics;
import s3.b0;
import s3.e0;

/* loaded from: classes6.dex */
public final class j implements q, s3.b {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f2786e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int b(char c5) {
        if ('0' <= c5 && '9' >= c5) {
            return c5 - '0';
        }
        char c6 = 'a';
        if ('a' > c5 || 'f' < c5) {
            c6 = 'A';
            if ('A' > c5 || 'F' < c5) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c5);
            }
        }
        return (c5 - c6) + 10;
    }

    @Override // s3.b
    public void a(e0 e0Var, b0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
    }

    @Override // k2.q
    public Object c() {
        return new ConcurrentSkipListMap();
    }
}
