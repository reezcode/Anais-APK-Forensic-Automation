package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes25.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource {
    private final DurationUnit unit;

    public static final class DoubleTimeMark implements TimeMark {
        private final long offset;
        private final double startedAt;
        private final AbstractDoubleTimeSource timeSource;

        private DoubleTimeMark(double d5, AbstractDoubleTimeSource abstractDoubleTimeSource, long j5) {
            this.startedAt = d5;
            this.timeSource = abstractDoubleTimeSource;
            this.offset = j5;
        }

        public /* synthetic */ DoubleTimeMark(double d5, AbstractDoubleTimeSource abstractDoubleTimeSource, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(d5, abstractDoubleTimeSource, j5);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo1329elapsedNowUwyO8pc() {
            return Duration.m1372minusLRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return TimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return TimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public TimeMark mo1330minusLRDsOJo(long j5) {
            return TimeMark.DefaultImpls.m1472minusLRDsOJo(this, j5);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public TimeMark mo1331plusLRDsOJo(long j5) {
            return new DoubleTimeMark(this.startedAt, this.timeSource, Duration.m1373plusLRDsOJo(this.offset, j5), null);
        }
    }

    public AbstractDoubleTimeSource(DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // kotlin.time.TimeSource
    public TimeMark markNow() {
        return new DoubleTimeMark(read(), this, Duration.Companion.m1439getZEROUwyO8pc(), null);
    }

    public abstract double read();
}
