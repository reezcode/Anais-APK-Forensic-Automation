package kotlin.time;

import androidx.appcompat.widget.a;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.io.FilenameUtils;

@SinceKotlin(version = "1.6")
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes20.dex */
public final class Duration implements Comparable<Duration> {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m1337constructorimpl(0);

    /* loaded from: classes21.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1392getDaysUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1393getDaysUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1394getDaysUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1395getDaysUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1396getDaysUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1397getDaysUwyO8pc$annotations(long j5) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1398getHoursUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1399getHoursUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1400getHoursUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1401getHoursUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1402getHoursUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1403getHoursUwyO8pc$annotations(long j5) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1404getMicrosecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1405getMicrosecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1406getMicrosecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1407getMicrosecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1408getMicrosecondsUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1409getMicrosecondsUwyO8pc$annotations(long j5) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1410getMillisecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1411getMillisecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1412getMillisecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1413getMillisecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1414getMillisecondsUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1415getMillisecondsUwyO8pc$annotations(long j5) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1416getMinutesUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1417getMinutesUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1418getMinutesUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1419getMinutesUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1420getMinutesUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1421getMinutesUwyO8pc$annotations(long j5) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1422getNanosecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1423getNanosecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1424getNanosecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1425getNanosecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1426getNanosecondsUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1427getNanosecondsUwyO8pc$annotations(long j5) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1428getSecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1429getSecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1430getSecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1431getSecondsUwyO8pc$annotations(double d5) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1432getSecondsUwyO8pc$annotations(int i5) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1433getSecondsUwyO8pc$annotations(long j5) {
        }

        @ExperimentalTime
        public final double convert(double d5, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d5, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1434daysUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1435daysUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m1436daysUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1437getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1438getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1439getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1440hoursUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1441hoursUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m1442hoursUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1443microsecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1444microsecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m1445microsecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1446millisecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1447millisecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m1448millisecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1449minutesUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1450minutesUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m1451minutesUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1452nanosecondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1453nanosecondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m1454nanosecondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1455parseUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return parseDuration;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(a.j("Invalid duration string format: '", value, "'."), e5);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1456parseIsoStringUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return parseDuration;
            } catch (IllegalArgumentException e5) {
                throw new IllegalArgumentException(a.j("Invalid ISO duration string format: '", value, "'."), e5);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m1457parseIsoStringOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return Duration.m1335boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m1458parseOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return Duration.m1335boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1459secondsUwyO8pc(double d5) {
            return DurationKt.toDuration(d5, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1460secondsUwyO8pc(int i5) {
            return DurationKt.toDuration(i5, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m1461secondsUwyO8pc(long j5) {
            return DurationKt.toDuration(j5, DurationUnit.SECONDS);
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    private /* synthetic */ Duration(long j5) {
        this.rawValue = j5;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1333addValuesMixedRangesUwyO8pc(long j5, long j6, long j7) {
        long nanosToMillis;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = DurationKt.nanosToMillis(j7);
        long j8 = j6 + nanosToMillis;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(j8)) {
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j8, -4611686018427387903L, DurationKt.MAX_MILLIS));
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j9 = j7 - millisToNanos;
        millisToNanos2 = DurationKt.millisToNanos(j8);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + j9);
        return durationOfNanos;
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1334appendFractionalimpl(long j5, StringBuilder sb, int i5, int i6, int i7, String str, boolean z4) {
        String padStart;
        sb.append(i5);
        if (i6 != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i6), i7, '0');
            int i8 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i9 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i8 = length;
                        break;
                    } else if (i9 < 0) {
                        break;
                    } else {
                        length = i9;
                    }
                }
            }
            int i10 = i8 + 1;
            if (z4 || i10 >= 3) {
                i10 = ((i10 + 2) / 3) * 3;
            }
            sb.append((CharSequence) padStart, 0, i10);
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m1335boximpl(long j5) {
        return new Duration(j5);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1336compareToLRDsOJo(long j5, long j6) {
        long j7 = j5 ^ j6;
        if (j7 < 0 || (((int) j7) & 1) == 0) {
            return Intrinsics.compare(j5, j6);
        }
        int i5 = (((int) j5) & 1) - (((int) j6) & 1);
        return m1370isNegativeimpl(j5) ? -i5 : i5;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1337constructorimpl(long j5) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1368isInNanosimpl(j5)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m1364getValueimpl(j5))) {
                    throw new AssertionError(m1364getValueimpl(j5) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(m1364getValueimpl(j5))) {
                    throw new AssertionError(m1364getValueimpl(j5) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m1364getValueimpl(j5))) {
                    throw new AssertionError(m1364getValueimpl(j5) + " ms is denormalized");
                }
            }
        }
        return j5;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1338divLRDsOJo(long j5, long j6) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m1362getStorageUnitimpl(j5), m1362getStorageUnitimpl(j6));
        return m1380toDoubleimpl(j5, durationUnit) / m1380toDoubleimpl(j6, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1339divUwyO8pc(long j5, double d5) {
        int roundToInt = MathKt.roundToInt(d5);
        if ((((double) roundToInt) == d5) && roundToInt != 0) {
            return m1340divUwyO8pc(j5, roundToInt);
        }
        DurationUnit m1362getStorageUnitimpl = m1362getStorageUnitimpl(j5);
        return DurationKt.toDuration(m1380toDoubleimpl(j5, m1362getStorageUnitimpl) / d5, m1362getStorageUnitimpl);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1340divUwyO8pc(long j5, int i5) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        long durationOfNanos2;
        if (i5 == 0) {
            if (m1371isPositiveimpl(j5)) {
                return INFINITE;
            }
            if (m1370isNegativeimpl(j5)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1368isInNanosimpl(j5)) {
            durationOfNanos2 = DurationKt.durationOfNanos(m1364getValueimpl(j5) / i5);
            return durationOfNanos2;
        }
        if (m1369isInfiniteimpl(j5)) {
            return m1375timesUwyO8pc(j5, MathKt.getSign(i5));
        }
        long j6 = i5;
        long m1364getValueimpl = m1364getValueimpl(j5) / j6;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(m1364getValueimpl)) {
            durationOfMillis = DurationKt.durationOfMillis(m1364getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(m1364getValueimpl(j5) - (m1364getValueimpl * j6));
        millisToNanos2 = DurationKt.millisToNanos(m1364getValueimpl);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + (millisToNanos / j6));
        return durationOfNanos;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1341equalsimpl(long j5, Object obj) {
        return (obj instanceof Duration) && j5 == ((Duration) obj).m1391unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1342equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1343getAbsoluteValueUwyO8pc(long j5) {
        return m1370isNegativeimpl(j5) ? m1389unaryMinusUwyO8pc(j5) : j5;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1344getHoursComponentimpl(long j5) {
        if (m1369isInfiniteimpl(j5)) {
            return 0;
        }
        return (int) (m1353getInWholeHoursimpl(j5) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    /* renamed from: getInDays-impl, reason: not valid java name */
    public static final double m1345getInDaysimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.DAYS);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    /* renamed from: getInHours-impl, reason: not valid java name */
    public static final double m1346getInHoursimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.HOURS);
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    /* renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final double m1347getInMicrosecondsimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    /* renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final double m1348getInMillisecondsimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    /* renamed from: getInMinutes-impl, reason: not valid java name */
    public static final double m1349getInMinutesimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.MINUTES);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    /* renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final double m1350getInNanosecondsimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInSeconds-impl, reason: not valid java name */
    public static final double m1351getInSecondsimpl(long j5) {
        return m1380toDoubleimpl(j5, DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1352getInWholeDaysimpl(long j5) {
        return m1383toLongimpl(j5, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1353getInWholeHoursimpl(long j5) {
        return m1383toLongimpl(j5, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1354getInWholeMicrosecondsimpl(long j5) {
        return m1383toLongimpl(j5, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1355getInWholeMillisecondsimpl(long j5) {
        return (m1367isInMillisimpl(j5) && m1366isFiniteimpl(j5)) ? m1364getValueimpl(j5) : m1383toLongimpl(j5, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1356getInWholeMinutesimpl(long j5) {
        return m1383toLongimpl(j5, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1357getInWholeNanosecondsimpl(long j5) {
        long millisToNanos;
        long m1364getValueimpl = m1364getValueimpl(j5);
        if (m1368isInNanosimpl(j5)) {
            return m1364getValueimpl;
        }
        if (m1364getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m1364getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = DurationKt.millisToNanos(m1364getValueimpl);
        return millisToNanos;
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1358getInWholeSecondsimpl(long j5) {
        return m1383toLongimpl(j5, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1359getMinutesComponentimpl(long j5) {
        if (m1369isInfiniteimpl(j5)) {
            return 0;
        }
        return (int) (m1356getInWholeMinutesimpl(j5) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1360getNanosecondsComponentimpl(long j5) {
        if (m1369isInfiniteimpl(j5)) {
            return 0;
        }
        boolean m1367isInMillisimpl = m1367isInMillisimpl(j5);
        long m1364getValueimpl = m1364getValueimpl(j5);
        return (int) (m1367isInMillisimpl ? DurationKt.millisToNanos(m1364getValueimpl % 1000) : m1364getValueimpl % 1000000000);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1361getSecondsComponentimpl(long j5) {
        if (m1369isInfiniteimpl(j5)) {
            return 0;
        }
        return (int) (m1358getInWholeSecondsimpl(j5) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m1362getStorageUnitimpl(long j5) {
        return m1368isInNanosimpl(j5) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1363getUnitDiscriminatorimpl(long j5) {
        return ((int) j5) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m1364getValueimpl(long j5) {
        return j5 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1365hashCodeimpl(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1366isFiniteimpl(long j5) {
        return !m1369isInfiniteimpl(j5);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1367isInMillisimpl(long j5) {
        return (((int) j5) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1368isInNanosimpl(long j5) {
        return (((int) j5) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1369isInfiniteimpl(long j5) {
        return j5 == INFINITE || j5 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1370isNegativeimpl(long j5) {
        return j5 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1371isPositiveimpl(long j5) {
        return j5 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1372minusLRDsOJo(long j5, long j6) {
        return m1373plusLRDsOJo(j5, m1389unaryMinusUwyO8pc(j6));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1373plusLRDsOJo(long j5, long j6) {
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if (m1369isInfiniteimpl(j5)) {
            if (m1366isFiniteimpl(j6) || (j6 ^ j5) >= 0) {
                return j5;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1369isInfiniteimpl(j6)) {
            return j6;
        }
        if ((((int) j5) & 1) != (((int) j6) & 1)) {
            return m1367isInMillisimpl(j5) ? m1333addValuesMixedRangesUwyO8pc(j5, m1364getValueimpl(j5), m1364getValueimpl(j6)) : m1333addValuesMixedRangesUwyO8pc(j5, m1364getValueimpl(j6), m1364getValueimpl(j5));
        }
        long m1364getValueimpl = m1364getValueimpl(j5) + m1364getValueimpl(j6);
        if (m1368isInNanosimpl(j5)) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(m1364getValueimpl);
            return durationOfNanosNormalized;
        }
        durationOfMillisNormalized = DurationKt.durationOfMillisNormalized(m1364getValueimpl);
        return durationOfMillisNormalized;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1374timesUwyO8pc(long j5, double d5) {
        int roundToInt = MathKt.roundToInt(d5);
        if (((double) roundToInt) == d5) {
            return m1375timesUwyO8pc(j5, roundToInt);
        }
        DurationUnit m1362getStorageUnitimpl = m1362getStorageUnitimpl(j5);
        return DurationKt.toDuration(m1380toDoubleimpl(j5, m1362getStorageUnitimpl) * d5, m1362getStorageUnitimpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if ((kotlin.math.MathKt.getSign(r18) * kotlin.math.MathKt.getSign(r1)) > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        return kotlin.time.Duration.NEG_INFINITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return kotlin.time.Duration.INFINITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        if ((kotlin.math.MathKt.getSign(r18) * kotlin.math.MathKt.getSign(r1)) > 0) goto L36;
     */
    /* renamed from: times-UwyO8pc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m1375timesUwyO8pc(long r16, int r18) {
        /*
            r0 = r18
            boolean r1 = m1369isInfiniteimpl(r16)
            if (r1 == 0) goto L1c
            if (r0 == 0) goto L14
            if (r0 <= 0) goto Lf
            r0 = r16
            goto L13
        Lf:
            long r0 = m1389unaryMinusUwyO8pc(r16)
        L13:
            return r0
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Multiplying infinite duration by zero yields an undefined result."
            r0.<init>(r1)
            throw r0
        L1c:
            if (r0 != 0) goto L21
            long r0 = kotlin.time.Duration.ZERO
            return r0
        L21:
            long r1 = m1364getValueimpl(r16)
            long r3 = (long) r0
            long r5 = r1 * r3
            boolean r7 = m1368isInNanosimpl(r16)
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r10 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r7 == 0) goto L91
            kotlin.ranges.LongRange r7 = new kotlin.ranges.LongRange
            r12 = -2147483647(0xffffffff80000001, double:NaN)
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r7.<init>(r12, r14)
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L4e
            long r0 = kotlin.time.DurationKt.access$durationOfNanos(r5)
            goto Lb6
        L4e:
            long r12 = r5 / r3
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 != 0) goto L59
            long r0 = kotlin.time.DurationKt.access$durationOfNanosNormalized(r5)
            goto Lb6
        L59:
            long r5 = kotlin.time.DurationKt.access$nanosToMillis(r1)
            long r12 = kotlin.time.DurationKt.access$millisToNanos(r5)
            long r12 = r1 - r12
            long r14 = r5 * r3
            long r12 = r12 * r3
            long r12 = kotlin.time.DurationKt.access$nanosToMillis(r12)
            long r12 = r12 + r14
            long r3 = r14 / r3
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L84
            long r3 = r12 ^ r14
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L84
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r0.<init>(r10, r8)
            long r0 = kotlin.ranges.RangesKt.coerceIn(r12, r0)
            goto La0
        L84:
            int r1 = kotlin.math.MathKt.getSign(r1)
            int r0 = kotlin.math.MathKt.getSign(r18)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lb4
            goto Lb1
        L91:
            long r3 = r5 / r3
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto La5
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r0.<init>(r10, r8)
            long r0 = kotlin.ranges.RangesKt.coerceIn(r5, r0)
        La0:
            long r0 = kotlin.time.DurationKt.access$durationOfMillis(r0)
            goto Lb6
        La5:
            int r1 = kotlin.math.MathKt.getSign(r1)
            int r0 = kotlin.math.MathKt.getSign(r18)
            int r0 = r0 * r1
            if (r0 <= 0) goto Lb4
        Lb1:
            long r0 = kotlin.time.Duration.INFINITE
            goto Lb6
        Lb4:
            long r0 = kotlin.time.Duration.NEG_INFINITE
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m1375timesUwyO8pc(long, int):long");
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1376toComponentsimpl(long j5, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1358getInWholeSecondsimpl(j5)), Integer.valueOf(m1360getNanosecondsComponentimpl(j5)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1377toComponentsimpl(long j5, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1356getInWholeMinutesimpl(j5)), Integer.valueOf(m1361getSecondsComponentimpl(j5)), Integer.valueOf(m1360getNanosecondsComponentimpl(j5)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1378toComponentsimpl(long j5, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1353getInWholeHoursimpl(j5)), Integer.valueOf(m1359getMinutesComponentimpl(j5)), Integer.valueOf(m1361getSecondsComponentimpl(j5)), Integer.valueOf(m1360getNanosecondsComponentimpl(j5)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1379toComponentsimpl(long j5, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1352getInWholeDaysimpl(j5)), Integer.valueOf(m1344getHoursComponentimpl(j5)), Integer.valueOf(m1359getMinutesComponentimpl(j5)), Integer.valueOf(m1361getSecondsComponentimpl(j5)), Integer.valueOf(m1360getNanosecondsComponentimpl(j5)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1380toDoubleimpl(long j5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j5 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j5 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1364getValueimpl(j5), m1362getStorageUnitimpl(j5), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m1381toIntimpl(long j5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m1383toLongimpl(j5, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m1382toIsoStringimpl(long j5) {
        StringBuilder sb = new StringBuilder();
        if (m1370isNegativeimpl(j5)) {
            sb.append('-');
        }
        sb.append("PT");
        long m1343getAbsoluteValueUwyO8pc = m1343getAbsoluteValueUwyO8pc(j5);
        long m1353getInWholeHoursimpl = m1353getInWholeHoursimpl(m1343getAbsoluteValueUwyO8pc);
        int m1359getMinutesComponentimpl = m1359getMinutesComponentimpl(m1343getAbsoluteValueUwyO8pc);
        int m1361getSecondsComponentimpl = m1361getSecondsComponentimpl(m1343getAbsoluteValueUwyO8pc);
        int m1360getNanosecondsComponentimpl = m1360getNanosecondsComponentimpl(m1343getAbsoluteValueUwyO8pc);
        if (m1369isInfiniteimpl(j5)) {
            m1353getInWholeHoursimpl = 9999999999999L;
        }
        boolean z4 = true;
        boolean z5 = m1353getInWholeHoursimpl != 0;
        boolean z6 = (m1361getSecondsComponentimpl == 0 && m1360getNanosecondsComponentimpl == 0) ? false : true;
        if (m1359getMinutesComponentimpl == 0 && (!z6 || !z5)) {
            z4 = false;
        }
        if (z5) {
            sb.append(m1353getInWholeHoursimpl);
            sb.append('H');
        }
        if (z4) {
            sb.append(m1359getMinutesComponentimpl);
            sb.append('M');
        }
        if (z6 || (!z5 && !z4)) {
            m1334appendFractionalimpl(j5, sb, m1361getSecondsComponentimpl, m1360getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m1383toLongimpl(long j5, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j5 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j5 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1364getValueimpl(j5), m1362getStorageUnitimpl(j5), unit);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @ExperimentalTime
    /* renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final long m1384toLongMillisecondsimpl(long j5) {
        return m1355getInWholeMillisecondsimpl(j5);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @ExperimentalTime
    /* renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final long m1385toLongNanosecondsimpl(long j5) {
        return m1357getInWholeNanosecondsimpl(j5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1386toStringimpl(long j5) {
        int i5;
        long j6;
        StringBuilder sb;
        int i6;
        int i7;
        String str;
        boolean z4;
        if (j5 == 0) {
            return "0s";
        }
        if (j5 == INFINITE) {
            return "Infinity";
        }
        if (j5 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1370isNegativeimpl = m1370isNegativeimpl(j5);
        StringBuilder sb2 = new StringBuilder();
        if (m1370isNegativeimpl) {
            sb2.append('-');
        }
        long m1343getAbsoluteValueUwyO8pc = m1343getAbsoluteValueUwyO8pc(j5);
        long m1352getInWholeDaysimpl = m1352getInWholeDaysimpl(m1343getAbsoluteValueUwyO8pc);
        int m1344getHoursComponentimpl = m1344getHoursComponentimpl(m1343getAbsoluteValueUwyO8pc);
        int m1359getMinutesComponentimpl = m1359getMinutesComponentimpl(m1343getAbsoluteValueUwyO8pc);
        int m1361getSecondsComponentimpl = m1361getSecondsComponentimpl(m1343getAbsoluteValueUwyO8pc);
        int m1360getNanosecondsComponentimpl = m1360getNanosecondsComponentimpl(m1343getAbsoluteValueUwyO8pc);
        int i8 = 0;
        boolean z5 = m1352getInWholeDaysimpl != 0;
        boolean z6 = m1344getHoursComponentimpl != 0;
        boolean z7 = m1359getMinutesComponentimpl != 0;
        boolean z8 = (m1361getSecondsComponentimpl == 0 && m1360getNanosecondsComponentimpl == 0) ? false : true;
        if (z5) {
            sb2.append(m1352getInWholeDaysimpl);
            sb2.append('d');
            i8 = 1;
        }
        if (z6 || (z5 && (z7 || z8))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb2.append(' ');
            }
            sb2.append(m1344getHoursComponentimpl);
            sb2.append('h');
            i8 = i9;
        }
        if (z7 || (z8 && (z6 || z5))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb2.append(' ');
            }
            sb2.append(m1359getMinutesComponentimpl);
            sb2.append('m');
            i8 = i10;
        }
        if (z8) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb2.append(' ');
            }
            if (m1361getSecondsComponentimpl != 0 || z5 || z6 || z7) {
                i5 = 9;
                j6 = j5;
                sb = sb2;
                i6 = m1361getSecondsComponentimpl;
                i7 = m1360getNanosecondsComponentimpl;
                str = "s";
                z4 = false;
            } else {
                if (m1360getNanosecondsComponentimpl >= 1000000) {
                    i6 = m1360getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS;
                    i7 = m1360getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS;
                    i5 = 6;
                    z4 = false;
                    str = "ms";
                } else if (m1360getNanosecondsComponentimpl >= 1000) {
                    i6 = m1360getNanosecondsComponentimpl / 1000;
                    i7 = m1360getNanosecondsComponentimpl % 1000;
                    i5 = 3;
                    z4 = false;
                    str = "us";
                } else {
                    sb2.append(m1360getNanosecondsComponentimpl);
                    sb2.append("ns");
                    i8 = i11;
                }
                j6 = j5;
                sb = sb2;
            }
            m1334appendFractionalimpl(j6, sb, i6, i7, i5, str, z4);
            i8 = i11;
        }
        if (m1370isNegativeimpl && i8 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m1387toStringimpl(long j5, DurationUnit unit, int i5) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(a.g("decimals must be not negative, but was ", i5).toString());
        }
        double m1380toDoubleimpl = m1380toDoubleimpl(j5, unit);
        if (Double.isInfinite(m1380toDoubleimpl)) {
            return String.valueOf(m1380toDoubleimpl);
        }
        return DurationJvmKt.formatToExactDecimals(m1380toDoubleimpl, RangesKt.coerceAtMost(i5, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m1388toStringimpl$default(long j5, DurationUnit durationUnit, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return m1387toStringimpl(j5, durationUnit, i5);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1389unaryMinusUwyO8pc(long j5) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m1364getValueimpl(j5), ((int) j5) & 1);
        return durationOf;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1390compareToLRDsOJo(duration.m1391unboximpl());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1390compareToLRDsOJo(long j5) {
        return m1336compareToLRDsOJo(this.rawValue, j5);
    }

    public boolean equals(Object obj) {
        return m1341equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m1365hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m1386toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1391unboximpl() {
        return this.rawValue;
    }
}
