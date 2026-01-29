package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public interface ClosedRange<T extends Comparable<? super T>> {

    /* loaded from: classes19.dex */
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean contains(ClosedRange<T> closedRange, T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(closedRange.getStart()) >= 0 && value.compareTo(closedRange.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(ClosedRange<T> closedRange) {
            return closedRange.getStart().compareTo(closedRange.getEndInclusive()) > 0;
        }
    }

    boolean contains(T t4);

    T getEndInclusive();

    T getStart();

    boolean isEmpty();
}
