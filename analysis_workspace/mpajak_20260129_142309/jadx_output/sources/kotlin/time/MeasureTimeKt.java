package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;

/* loaded from: classes8.dex */
public final class MeasureTimeKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long m1474markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1474markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m1477elapsedNowUwyO8pc(m1474markNowz9LOYto);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalTime
    public static final long measureTime(TimeSource.Monotonic monotonic, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        long m1474markNowz9LOYto = monotonic.m1474markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m1477elapsedNowUwyO8pc(m1474markNowz9LOYto);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final long measureTime(TimeSource timeSource, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        TimeMark markNow = timeSource.markNow();
        block.invoke();
        return markNow.mo1329elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m1477elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m1474markNowz9LOYto()), null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(TimeSource.Monotonic monotonic, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(monotonic, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m1477elapsedNowUwyO8pc(monotonic.m1474markNowz9LOYto()), null);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(TimeSource timeSource, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new TimedValue<>(block.invoke(), timeSource.markNow().mo1329elapsedNowUwyO8pc(), null);
    }
}
