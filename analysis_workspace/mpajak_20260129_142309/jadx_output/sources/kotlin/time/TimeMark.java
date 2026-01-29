package kotlin.time;

import kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes8.dex */
public interface TimeMark {

    /* loaded from: classes19.dex */
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(TimeMark timeMark) {
            return Duration.m1370isNegativeimpl(timeMark.mo1329elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(TimeMark timeMark) {
            return !Duration.m1370isNegativeimpl(timeMark.mo1329elapsedNowUwyO8pc());
        }

        /* renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1472minusLRDsOJo(TimeMark timeMark, long j5) {
            return timeMark.mo1331plusLRDsOJo(Duration.m1389unaryMinusUwyO8pc(j5));
        }

        /* renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1473plusLRDsOJo(TimeMark timeMark, long j5) {
            return new AdjustedTimeMark(timeMark, j5, null);
        }
    }

    /* renamed from: elapsedNow-UwyO8pc */
    long mo1329elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* renamed from: minus-LRDsOJo */
    TimeMark mo1330minusLRDsOJo(long j5);

    /* renamed from: plus-LRDsOJo */
    TimeMark mo1331plusLRDsOJo(long j5);
}
