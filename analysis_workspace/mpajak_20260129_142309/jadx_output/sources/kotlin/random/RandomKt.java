package kotlin.random;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;

/* loaded from: classes13.dex */
public final class RandomKt {
    @SinceKotlin(version = "1.3")
    public static final Random Random(int i5) {
        return new XorWowRandom(i5, i5 >> 31);
    }

    @SinceKotlin(version = "1.3")
    public static final Random Random(long j5) {
        return new XorWowRandom((int) j5, (int) (j5 >> 32));
    }

    public static final String boundsErrorMessage(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void checkRangeBounds(double d5, double d6) {
        if (!(d6 > d5)) {
            throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(d5), Double.valueOf(d6)).toString());
        }
    }

    public static final void checkRangeBounds(int i5, int i6) {
        if (!(i6 > i5)) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i5), Integer.valueOf(i6)).toString());
        }
    }

    public static final void checkRangeBounds(long j5, long j6) {
        if (!(j6 > j5)) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j5), Long.valueOf(j6)).toString());
        }
    }

    public static final int fastLog2(int i5) {
        return 31 - Integer.numberOfLeadingZeros(i5);
    }

    @SinceKotlin(version = "1.3")
    public static final int nextInt(Random random, IntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? random.nextInt(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? random.nextInt(range.getFirst() - 1, range.getLast()) + 1 : random.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @SinceKotlin(version = "1.3")
    public static final long nextLong(Random random, LongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            long last = range.getLast();
            long first = range.getFirst();
            return last < Long.MAX_VALUE ? random.nextLong(first, range.getLast() + 1) : first > Long.MIN_VALUE ? random.nextLong(range.getFirst() - 1, range.getLast()) + 1 : random.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int takeUpperBits(int i5, int i6) {
        return (i5 >>> (32 - i6)) & ((-i6) >> 31);
    }
}
