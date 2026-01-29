package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.OpenEndRange;

/* loaded from: classes4.dex */
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {
    private final T endExclusive;
    private final T start;

    public ComparableOpenEndRange(T start, T endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.start = start;
        this.endExclusive = endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean contains(T t4) {
        return OpenEndRange.DefaultImpls.contains(this, t4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComparableOpenEndRange) {
            if (!isEmpty() || !((ComparableOpenEndRange) obj).isEmpty()) {
                ComparableOpenEndRange comparableOpenEndRange = (ComparableOpenEndRange) obj;
                if (!Intrinsics.areEqual(getStart(), comparableOpenEndRange.getStart()) || !Intrinsics.areEqual(getEndExclusive(), comparableOpenEndRange.getEndExclusive())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public T getEndExclusive() {
        return this.endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public T getStart() {
        return this.start;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.DefaultImpls.isEmpty(this);
    }

    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }
}
