package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.time.TimeSource;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes15.dex */
public final class MonotonicTimeSource implements TimeSource {
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    /* renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m1467adjustReading6QKq23U(long j5, long j6) {
        return TimeSource.Monotonic.ValueTimeMark.m1476constructorimpl(LongSaturatedMathKt.m1465saturatingAddpTJri5U(j5, j6));
    }

    /* renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m1468elapsedFrom6eNON_k(long j5) {
        return LongSaturatedMathKt.saturatingDiff(read(), j5);
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m1475boximpl(m1469markNowz9LOYto());
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m1469markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m1476constructorimpl(read());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
