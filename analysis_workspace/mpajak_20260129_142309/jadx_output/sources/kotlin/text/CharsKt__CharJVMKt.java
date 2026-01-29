package kotlin.text;

import androidx.appcompat.graphics.drawable.a;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class CharsKt__CharJVMKt {
    @PublishedApi
    public static int checkRadix(int i5) {
        if (new IntRange(2, 36).contains(i5)) {
            return i5;
        }
        StringBuilder e5 = a.e("radix ", i5, " was not in valid range ");
        e5.append(new IntRange(2, 36));
        throw new IllegalArgumentException(e5.toString());
    }

    public static final int digitOf(char c5, int i5) {
        return Character.digit((int) c5, i5);
    }

    public static final CharCategory getCategory(char c5) {
        return CharCategory.Companion.valueOf(Character.getType(c5));
    }

    public static final CharDirectionality getDirectionality(char c5) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c5));
    }

    @InlineOnly
    private static final boolean isDefined(char c5) {
        return Character.isDefined(c5);
    }

    @InlineOnly
    private static final boolean isDigit(char c5) {
        return Character.isDigit(c5);
    }

    @InlineOnly
    private static final boolean isHighSurrogate(char c5) {
        return Character.isHighSurrogate(c5);
    }

    @InlineOnly
    private static final boolean isISOControl(char c5) {
        return Character.isISOControl(c5);
    }

    @InlineOnly
    private static final boolean isIdentifierIgnorable(char c5) {
        return Character.isIdentifierIgnorable(c5);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierPart(char c5) {
        return Character.isJavaIdentifierPart(c5);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierStart(char c5) {
        return Character.isJavaIdentifierStart(c5);
    }

    @InlineOnly
    private static final boolean isLetter(char c5) {
        return Character.isLetter(c5);
    }

    @InlineOnly
    private static final boolean isLetterOrDigit(char c5) {
        return Character.isLetterOrDigit(c5);
    }

    @InlineOnly
    private static final boolean isLowSurrogate(char c5) {
        return Character.isLowSurrogate(c5);
    }

    @InlineOnly
    private static final boolean isLowerCase(char c5) {
        return Character.isLowerCase(c5);
    }

    @InlineOnly
    private static final boolean isTitleCase(char c5) {
        return Character.isTitleCase(c5);
    }

    @InlineOnly
    private static final boolean isUpperCase(char c5) {
        return Character.isUpperCase(c5);
    }

    public static final boolean isWhitespace(char c5) {
        return Character.isWhitespace(c5) || Character.isSpaceChar(c5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String lowercase(char c5) {
        String valueOf = String.valueOf(c5);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String lowercase(char c5, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c5);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char lowercaseChar(char c5) {
        return Character.toLowerCase(c5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String titlecase(char c5, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String uppercase = uppercase(c5, locale);
        if (uppercase.length() <= 1) {
            String valueOf = String.valueOf(c5);
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !Intrinsics.areEqual(uppercase, upperCase) ? uppercase : String.valueOf(Character.toTitleCase(c5));
        }
        if (c5 == 329) {
            return uppercase;
        }
        char charAt = uppercase.charAt(0);
        Intrinsics.checkNotNull(uppercase, "null cannot be cast to non-null type java.lang.String");
        String substring = uppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return charAt + lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char titlecaseChar(char c5) {
        return Character.toTitleCase(c5);
    }

    @Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char toLowerCase(char c5) {
        return Character.toLowerCase(c5);
    }

    @Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char toTitleCase(char c5) {
        return Character.toTitleCase(c5);
    }

    @Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char toUpperCase(char c5) {
        return Character.toUpperCase(c5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String uppercase(char c5) {
        String valueOf = String.valueOf(c5);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String uppercase(char c5, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c5);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char uppercaseChar(char c5) {
        return Character.toUpperCase(c5);
    }
}
