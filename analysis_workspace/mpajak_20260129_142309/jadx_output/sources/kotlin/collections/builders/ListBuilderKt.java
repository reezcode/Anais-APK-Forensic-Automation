package kotlin.collections.builders;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class ListBuilderKt {
    public static final <E> E[] arrayOfUninitializedElements(int i5) {
        if (i5 >= 0) {
            return (E[]) new Object[i5];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i5);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i5) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i5] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i5 < i6) {
            resetAt(eArr, i5);
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i5, int i6, List<?> list) {
        if (i6 != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!Intrinsics.areEqual(tArr[i5 + i7], list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i5, int i6) {
        int i7 = 1;
        for (int i8 = 0; i8 < i6; i8++) {
            T t4 = tArr[i5 + i8];
            i7 = (i7 * 31) + (t4 != null ? t4.hashCode() : 0);
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i5, int i6) {
        StringBuilder sb = new StringBuilder((i6 * 3) + 2);
        sb.append("[");
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i5 + i7]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
