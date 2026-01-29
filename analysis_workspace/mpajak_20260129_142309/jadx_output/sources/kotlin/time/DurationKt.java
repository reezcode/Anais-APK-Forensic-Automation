package kotlin.time;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes10.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j5, int i5) {
        return Duration.m1337constructorimpl((j5 << 1) + i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j5) {
        return Duration.m1337constructorimpl((j5 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j5) {
        return new LongRange(-4611686018426L, MAX_NANOS_IN_MILLIS).contains(j5) ? durationOfNanos(millisToNanos(j5)) : durationOfMillis(RangesKt.coerceIn(j5, -4611686018427387903L, MAX_MILLIS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j5) {
        return Duration.m1337constructorimpl(j5 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j5) {
        return new LongRange(-4611686018426999999L, MAX_NANOS).contains(j5) ? durationOfNanos(j5) : durationOfMillis(nanosToMillis(j5));
    }

    public static final long getDays(double d5) {
        return toDuration(d5, DurationUnit.DAYS);
    }

    public static final long getDays(int i5) {
        return toDuration(i5, DurationUnit.DAYS);
    }

    public static final long getDays(long j5) {
        return toDuration(j5, DurationUnit.DAYS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long j5) {
    }

    public static final long getHours(double d5) {
        return toDuration(d5, DurationUnit.HOURS);
    }

    public static final long getHours(int i5) {
        return toDuration(i5, DurationUnit.HOURS);
    }

    public static final long getHours(long j5) {
        return toDuration(j5, DurationUnit.HOURS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long j5) {
    }

    public static final long getMicroseconds(double d5) {
        return toDuration(d5, DurationUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(int i5) {
        return toDuration(i5, DurationUnit.MICROSECONDS);
    }

    public static final long getMicroseconds(long j5) {
        return toDuration(j5, DurationUnit.MICROSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long j5) {
    }

    public static final long getMilliseconds(double d5) {
        return toDuration(d5, DurationUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(int i5) {
        return toDuration(i5, DurationUnit.MILLISECONDS);
    }

    public static final long getMilliseconds(long j5) {
        return toDuration(j5, DurationUnit.MILLISECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long j5) {
    }

    public static final long getMinutes(double d5) {
        return toDuration(d5, DurationUnit.MINUTES);
    }

    public static final long getMinutes(int i5) {
        return toDuration(i5, DurationUnit.MINUTES);
    }

    public static final long getMinutes(long j5) {
        return toDuration(j5, DurationUnit.MINUTES);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long j5) {
    }

    public static final long getNanoseconds(double d5) {
        return toDuration(d5, DurationUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(int i5) {
        return toDuration(i5, DurationUnit.NANOSECONDS);
    }

    public static final long getNanoseconds(long j5) {
        return toDuration(j5, DurationUnit.NANOSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long j5) {
    }

    public static final long getSeconds(double d5) {
        return toDuration(d5, DurationUnit.SECONDS);
    }

    public static final long getSeconds(int i5) {
        return toDuration(i5, DurationUnit.SECONDS);
    }

    public static final long getSeconds(long j5) {
        return toDuration(j5, DurationUnit.SECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double d5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int i5) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long j5) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j5) {
        return j5 * NANOS_IN_MILLIS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j5) {
        return j5 / NANOS_IN_MILLIS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[LOOP:1: B:25:0x0062->B:33:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[EDGE_INSN: B:34:0x0092->B:35:0x0092 BREAK  A[LOOP:1: B:25:0x0062->B:33:0x008b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long parseDuration(java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.DurationKt.parseDuration(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long parseOverLongIsoComponent(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L16
            char r3 = r7.charAt(r2)
            java.lang.String r4 = "+-"
            boolean r3 = kotlin.text.StringsKt.b(r4, r3)
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r0 = r0 - r3
            r4 = 16
            if (r0 <= r4) goto L6b
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r4 = kotlin.text.StringsKt.getLastIndex(r7)
            r0.<init>(r3, r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L33
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L33
            goto L58
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3
            int r3 = r3.nextInt()
            kotlin.ranges.CharRange r4 = new kotlin.ranges.CharRange
            r5 = 48
            r6 = 57
            r4.<init>(r5, r6)
            char r3 = r7.charAt(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L37
            r1 = 0
        L58:
            if (r1 == 0) goto L6b
            char r7 = r7.charAt(r2)
            r0 = 45
            if (r7 != r0) goto L65
            r0 = -9223372036854775808
            goto L6a
        L65:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.StringsKt.u(r7, r0)
            if (r0 == 0) goto L77
            java.lang.String r7 = kotlin.text.StringsKt.d(r7)
        L77:
            long r0 = java.lang.Long.parseLong(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.DurationKt.parseOverLongIsoComponent(java.lang.String):long");
    }

    private static final int skipWhile(String str, int i5, Function1<? super Character, Boolean> function1) {
        while (i5 < str.length() && function1.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
            i5++;
        }
        return i5;
    }

    private static final String substringWhile(String str, int i5, Function1<? super Character, Boolean> function1) {
        int i6 = i5;
        while (i6 < str.length() && function1.invoke(Character.valueOf(str.charAt(i6))).booleanValue()) {
            i6++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i5, i6);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m1462timeskIfJnKk(double d5, long j5) {
        return Duration.m1374timesUwyO8pc(j5, d5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m1463timesmvk6XK0(int i5, long j5) {
        return Duration.m1375timesUwyO8pc(j5, i5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d5, unit, DurationUnit.NANOSECONDS);
        if (!(!Double.isNaN(convertDurationUnit))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long roundToLong = MathKt.roundToLong(convertDurationUnit);
        return new LongRange(-4611686018426999999L, MAX_NANOS).contains(roundToLong) ? durationOfNanos(roundToLong) : durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d5, unit, DurationUnit.MILLISECONDS)));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i5, unit, DurationUnit.NANOSECONDS)) : toDuration(i5, unit);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        return new LongRange(-convertDurationUnitOverflow, convertDurationUnitOverflow).contains(j5) ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j5, unit, durationUnit)) : durationOfMillis(RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j5, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
    }
}
