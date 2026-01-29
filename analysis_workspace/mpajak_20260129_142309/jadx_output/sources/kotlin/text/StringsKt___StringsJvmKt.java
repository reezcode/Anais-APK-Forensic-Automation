package kotlin.text;

import androidx.activity.d;
import androidx.appcompat.view.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes18.dex */
class StringsKt___StringsJvmKt extends StringsKt__StringsKt {
    @InlineOnly
    private static final char elementAt(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i5);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.maxOrNull(charSequence);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex != 0) {
            R invoke = function1.invoke(Character.valueOf(charAt));
            IntIterator j5 = d.j(1, lastIndex);
            while (j5.hasNext()) {
                char charAt2 = charSequence.charAt(j5.nextInt());
                R invoke2 = function1.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) < 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.maxWithOrNull(charSequence, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character min(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.minOrNull(charSequence);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex != 0) {
            R invoke = function1.invoke(Character.valueOf(charAt));
            IntIterator j5 = d.j(1, lastIndex);
            while (j5.hasNext()) {
                char charAt2 = charSequence.charAt(j5.nextInt());
                R invoke2 = function1.invoke(Character.valueOf(charAt2));
                if (invoke.compareTo(invoke2) > 0) {
                    charAt = charAt2;
                    invoke = invoke2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.minWithOrNull(charSequence, comparator);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(CharSequence charSequence, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            valueOf = valueOf.add((BigDecimal) androidx.activity.result.a.b(charSequence, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(CharSequence charSequence, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            valueOf = valueOf.add((BigInteger) androidx.activity.result.a.b(charSequence, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final SortedSet<Character> toSortedSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) StringsKt___StringsKt.toCollection(charSequence, new TreeSet());
    }
}
