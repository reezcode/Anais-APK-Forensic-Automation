package kotlin.text;

import androidx.activity.d;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;

/* loaded from: classes12.dex */
class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i5) {
        if (new IntRange(0, 9).contains(i5)) {
            return (char) (i5 + 48);
        }
        throw new IllegalArgumentException(d.c("Int ", i5, " is not a decimal digit"));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i5, int i6) {
        if (!new IntRange(2, 36).contains(i6)) {
            throw new IllegalArgumentException(d.c("Invalid radix: ", i6, ". Valid radix values are in range 2..36"));
        }
        if (i5 < 0 || i5 >= i6) {
            throw new IllegalArgumentException(d.d("Digit ", i5, " does not represent a valid digit in radix ", i6));
        }
        return (char) (i5 < 10 ? i5 + 48 : ((char) (i5 + 65)) - '\n');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c5) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c5, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c5, int i5) {
        Integer digitToIntOrNull = digitToIntOrNull(c5, i5);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a digit in the given radix=" + i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer digitToIntOrNull(char c5) {
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c5, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer digitToIntOrNull(char c5, int i5) {
        CharsKt__CharJVMKt.checkRadix(i5);
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c5, i5));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c5, char c6, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return equals(c5, c6, z4);
    }

    public static final boolean isSurrogate(char c5) {
        return new CharRange((char) 55296, (char) 57343).contains(c5);
    }

    @InlineOnly
    private static final String plus(char c5, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c5 + other;
    }

    @SinceKotlin(version = "1.5")
    public static final String titlecase(char c5) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c5);
    }
}
