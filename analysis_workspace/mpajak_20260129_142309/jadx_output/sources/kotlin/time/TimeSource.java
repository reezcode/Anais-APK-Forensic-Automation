package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;

@SinceKotlin(version = "1.3")
@ExperimentalTime
/* loaded from: classes6.dex */
public interface TimeSource {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes19.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Monotonic implements TimeSource {
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.7")
        @JvmInline
        @ExperimentalTime
        /* loaded from: classes21.dex */
        public static final class ValueTimeMark implements TimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j5) {
                this.reading = j5;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m1475boximpl(long j5) {
                return new ValueTimeMark(j5);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static long m1476constructorimpl(long j5) {
                return j5;
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m1477elapsedNowUwyO8pc(long j5) {
                return MonotonicTimeSource.INSTANCE.m1468elapsedFrom6eNON_k(j5);
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1478equalsimpl(long j5, Object obj) {
                return (obj instanceof ValueTimeMark) && j5 == ((ValueTimeMark) obj).m1488unboximpl();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1479equalsimpl0(long j5, long j6) {
                return j5 == j6;
            }

            /* renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m1480hasNotPassedNowimpl(long j5) {
                return Duration.m1370isNegativeimpl(m1477elapsedNowUwyO8pc(j5));
            }

            /* renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m1481hasPassedNowimpl(long j5) {
                return !Duration.m1370isNegativeimpl(m1477elapsedNowUwyO8pc(j5));
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1482hashCodeimpl(long j5) {
                return (int) (j5 ^ (j5 >>> 32));
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m1483minusLRDsOJo(long j5, long j6) {
                return MonotonicTimeSource.INSTANCE.m1467adjustReading6QKq23U(j5, Duration.m1389unaryMinusUwyO8pc(j6));
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m1484plusLRDsOJo(long j5, long j6) {
                return MonotonicTimeSource.INSTANCE.m1467adjustReading6QKq23U(j5, j6);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1485toStringimpl(long j5) {
                return "ValueTimeMark(reading=" + j5 + ')';
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo1329elapsedNowUwyO8pc() {
                return m1477elapsedNowUwyO8pc(this.reading);
            }

            public boolean equals(Object obj) {
                return m1478equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m1480hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m1481hasPassedNowimpl(this.reading);
            }

            public int hashCode() {
                return m1482hashCodeimpl(this.reading);
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m1486minusLRDsOJo(long j5) {
                return m1483minusLRDsOJo(this.reading, j5);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1330minusLRDsOJo(long j5) {
                return m1475boximpl(m1486minusLRDsOJo(j5));
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m1487plusLRDsOJo(long j5) {
                return m1484plusLRDsOJo(this.reading, j5);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1331plusLRDsOJo(long j5) {
                return m1475boximpl(m1487plusLRDsOJo(j5));
            }

            public String toString() {
                return m1485toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m1488unboximpl() {
                return this.reading;
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m1475boximpl(m1474markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m1474markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m1469markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }
    }

    TimeMark markNow();
}
