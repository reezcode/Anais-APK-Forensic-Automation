package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @SinceKotlin(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @SinceKotlin(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    @SinceKotlin(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i6 = str.charAt(0) == '-' ? 1 : 0; i6 < length; i6++) {
                if (CharsKt__CharJVMKt.digitOf(str.charAt(i6), i5) < 0) {
                    return null;
                }
            }
        } else if (CharsKt__CharJVMKt.digitOf(str.charAt(0), i5) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    @InlineOnly
    private static final /* synthetic */ boolean toBoolean(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Boolean.parseBoolean(str);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "toBooleanNullable")
    private static final boolean toBooleanNullable(String str) {
        return Boolean.parseBoolean(str);
    }

    @InlineOnly
    private static final byte toByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte toByte(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @InlineOnly
    private static final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    @SinceKotlin(version = "1.1")
    public static final Double toDoubleOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InlineOnly
    private static final float toFloat(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    @SinceKotlin(version = "1.1")
    public static final Float toFloatOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InlineOnly
    private static final int toInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int toInt(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @InlineOnly
    private static final long toLong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long toLong(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @InlineOnly
    private static final short toShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short toShort(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(byte b5, int i5) {
        String num = Integer.toString(b5, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(i5)));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(int i5, int i6) {
        String num = Integer.toString(i5, CharsKt__CharJVMKt.checkRadix(i6));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(long j5, int i5) {
        String l5 = Long.toString(j5, CharsKt__CharJVMKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(l5, "toString(this, checkRadix(radix))");
        return l5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String toString(short s4, int i5) {
        String num = Integer.toString(s4, CharsKt__CharJVMKt.checkRadix(CharsKt__CharJVMKt.checkRadix(i5)));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }
}
