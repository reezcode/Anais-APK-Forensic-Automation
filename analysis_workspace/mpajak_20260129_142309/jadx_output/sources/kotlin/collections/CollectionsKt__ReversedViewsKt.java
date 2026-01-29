package kotlin.collections;

import androidx.appcompat.graphics.drawable.a;
import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes14.dex */
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public static final <T> List<T> asReversed(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    @JvmName(name = "asReversedMutable")
    public static final <T> List<T> asReversedMutable(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i5) {
        if (new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)).contains(i5)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list) - i5;
        }
        StringBuilder e5 = a.e("Element index ", i5, " must be in range [");
        e5.append(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)));
        e5.append("].");
        throw new IndexOutOfBoundsException(e5.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i5) {
        if (new IntRange(0, list.size()).contains(i5)) {
            return list.size() - i5;
        }
        StringBuilder e5 = a.e("Position index ", i5, " must be in range [");
        e5.append(new IntRange(0, list.size()));
        e5.append("].");
        throw new IndexOutOfBoundsException(e5.toString());
    }
}
