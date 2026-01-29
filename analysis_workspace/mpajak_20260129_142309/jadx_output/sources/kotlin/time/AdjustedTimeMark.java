package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.TimeMark;

@ExperimentalTime
/* loaded from: classes22.dex */
final class AdjustedTimeMark implements TimeMark {
    private final long adjustment;
    private final TimeMark mark;

    private AdjustedTimeMark(TimeMark timeMark, long j5) {
        this.mark = timeMark;
        this.adjustment = j5;
    }

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j5);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: elapsedNow-UwyO8pc */
    public long mo1329elapsedNowUwyO8pc() {
        return Duration.m1372minusLRDsOJo(this.mark.mo1329elapsedNowUwyO8pc(), this.adjustment);
    }

    /* renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m1332getAdjustmentUwyO8pc() {
        return this.adjustment;
    }

    public final TimeMark getMark() {
        return this.mark;
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
        return new AdjustedTimeMark(this.mark, Duration.m1373plusLRDsOJo(this.adjustment, j5), null);
    }
}
