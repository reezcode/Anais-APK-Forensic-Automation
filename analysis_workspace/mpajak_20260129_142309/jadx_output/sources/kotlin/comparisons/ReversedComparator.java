package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
final class ReversedComparator<T> implements Comparator<T> {
    private final Comparator<T> comparator;

    public ReversedComparator(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    @Override // java.util.Comparator
    public int compare(T t4, T t5) {
        return this.comparator.compare(t5, t4);
    }

    public final Comparator<T> getComparator() {
        return this.comparator;
    }

    @Override // java.util.Comparator
    public final Comparator<T> reversed() {
        return this.comparator;
    }
}
