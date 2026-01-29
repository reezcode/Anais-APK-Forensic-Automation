package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes20.dex */
public abstract class AbstractLongTimeSource implements TimeSource {
    private final DurationUnit unit;

    /* loaded from: classes4.dex */
    public static final class LongTimeMark implements TimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        private LongTimeMark(long j5, AbstractLongTimeSource abstractLongTimeSource, long j6) {
            this.startedAt = j5;
            this.timeSource = abstractLongTimeSource;
            this.offset = j6;
        }

        public /* synthetic */ LongTimeMark(long j5, AbstractLongTimeSource abstractLongTimeSource, long j6, DefaultConstructorMarker defaultConstructorMarker) {
            this(j5, abstractLongTimeSource, j6);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
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
        /* renamed from: minus-LRDsOJo */
        public TimeMark mo1330minusLRDsOJo(long j5) {
            return TimeMark.DefaultImpls.m1472minusLRDsOJo(this, j5);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public TimeMark mo1331plusLRDsOJo(long j5) {
            return new LongTimeMark(this.startedAt, this.timeSource, Duration.m1373plusLRDsOJo(this.offset, j5), null);
        }
    }

    public AbstractLongTimeSource(DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // kotlin.time.TimeSource
    public TimeMark markNow() {
        return new LongTimeMark(read(), this, Duration.Companion.m1439getZEROUwyO8pc(), null);
    }

    public abstract long read();
}
