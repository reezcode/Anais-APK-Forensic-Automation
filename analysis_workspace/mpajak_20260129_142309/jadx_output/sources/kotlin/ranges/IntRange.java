package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {
    public static final Companion Companion = new Companion(null);
    private static final IntRange EMPTY = new IntRange(1, 0);

    /* loaded from: classes24.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange getEMPTY() {
            return IntRange.EMPTY;
        }
    }

    public IntRange(int i5, int i6) {
        super(i5, i6, 1);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public boolean contains(int i5) {
        return getFirst() <= i5 && i5 <= getLast();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Integer num) {
        return contains(num.intValue());
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (getFirst() != intRange.getFirst() || getLast() != intRange.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public Integer getEndExclusive() {
        if (getLast() != Integer.MAX_VALUE) {
            return Integer.valueOf(getLast() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    @Override // kotlin.ranges.ClosedRange
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
