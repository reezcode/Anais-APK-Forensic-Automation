package f4;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "-Util")
/* loaded from: classes6.dex */
public final class b {
    public static final boolean a(byte[] a5, int i5, byte[] b5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        for (int i8 = 0; i8 < i7; i8++) {
            if (a5[i8 + i5] != b5[i8 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException("size=" + j5 + " offset=" + j6 + " byteCount=" + j7);
        }
    }
}
