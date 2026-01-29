package kotlin.time;

import kotlin.time.Duration;

/* loaded from: classes13.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1464checkInfiniteSumDefinedPjuGub4(long j5, long j6, long j7) {
        if (!Duration.m1369isInfiniteimpl(j6) || (j5 ^ j7) >= 0) {
            return j5;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* renamed from: saturatingAdd-pTJri5U, reason: not valid java name */
    public static final long m1465saturatingAddpTJri5U(long j5, long j6) {
        long m1357getInWholeNanosecondsimpl = Duration.m1357getInWholeNanosecondsimpl(j6);
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            return m1464checkInfiniteSumDefinedPjuGub4(j5, j6, m1357getInWholeNanosecondsimpl);
        }
        if ((1 | (m1357getInWholeNanosecondsimpl - 1)) == Long.MAX_VALUE) {
            return m1466saturatingAddInHalvespTJri5U(j5, j6);
        }
        long j7 = j5 + m1357getInWholeNanosecondsimpl;
        return ((j5 ^ j7) & (m1357getInWholeNanosecondsimpl ^ j7)) < 0 ? j5 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j7;
    }

    /* renamed from: saturatingAddInHalves-pTJri5U, reason: not valid java name */
    private static final long m1466saturatingAddInHalvespTJri5U(long j5, long j6) {
        long m1340divUwyO8pc = Duration.m1340divUwyO8pc(j6, 2);
        if (((Duration.m1357getInWholeNanosecondsimpl(m1340divUwyO8pc) - 1) | 1) != Long.MAX_VALUE) {
            return m1465saturatingAddpTJri5U(m1465saturatingAddpTJri5U(j5, m1340divUwyO8pc), m1340divUwyO8pc);
        }
        return (long) (Duration.m1380toDoubleimpl(j6, DurationUnit.NANOSECONDS) + j5);
    }

    public static final long saturatingDiff(long j5, long j6) {
        if ((1 | (j6 - 1)) == Long.MAX_VALUE) {
            return Duration.m1389unaryMinusUwyO8pc(DurationKt.toDuration(j6, DurationUnit.DAYS));
        }
        long j7 = j5 - j6;
        if (((j7 ^ j5) & (~(j7 ^ j6))) >= 0) {
            Duration.Companion companion = Duration.Companion;
            return DurationKt.toDuration(j7, DurationUnit.NANOSECONDS);
        }
        long j8 = DurationKt.NANOS_IN_MILLIS;
        long j9 = (j5 / j8) - (j6 / j8);
        long j10 = (j5 % j8) - (j6 % j8);
        Duration.Companion companion2 = Duration.Companion;
        return Duration.m1373plusLRDsOJo(DurationKt.toDuration(j9, DurationUnit.MILLISECONDS), DurationKt.toDuration(j10, DurationUnit.NANOSECONDS));
    }
}
