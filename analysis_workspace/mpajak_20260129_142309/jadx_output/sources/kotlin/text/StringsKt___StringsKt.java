package kotlin.text;

import androidx.activity.d;
import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static final boolean all(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (!((Boolean) a.b(charSequence, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final boolean any(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (((Boolean) a.b(charSequence, i5, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Character> asIterable(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return CollectionsKt.emptyList();
            }
        }
        return new StringsKt___StringsKt$asIterable$$inlined$Iterable$1(charSequence);
    }

    public static final Sequence<Character> asSequence(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return SequencesKt.emptySequence();
            }
        }
        return new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(CharSequence charSequence, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            Pair pair = (Pair) a.b(charSequence, i5, transform);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Character> associateBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(charSequence.length()), 16));
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            Pair pair = (Pair) a.b(charSequence, i5, transform);
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final <V> Map<Character, V> associateWith(CharSequence charSequence, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            linkedHashMap.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            destination.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.2")
    public static final List<String> chunked(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i5, i5, true);
    }

    @SinceKotlin(version = "1.2")
    public static final <R> List<R> chunked(CharSequence charSequence, int i5, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i5, i5, true, transform);
    }

    @SinceKotlin(version = "1.2")
    public static final Sequence<String> chunkedSequence(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i5, new Function1<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$chunkedSequence$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        });
    }

    @SinceKotlin(version = "1.2")
    public static final <R> Sequence<R> chunkedSequence(CharSequence charSequence, int i5, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i5, i5, true, transform);
    }

    @InlineOnly
    private static final int count(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    public static final int count(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            if (((Boolean) a.b(charSequence, i6, predicate)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    public static final CharSequence drop(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i5 >= 0) {
            return charSequence.subSequence(RangesKt.coerceAtMost(i5, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
    }

    public static String drop(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
        }
        String substring = str.substring(RangesKt.coerceAtMost(i5, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final CharSequence dropLast(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i5 >= 0) {
            return take(charSequence, RangesKt.coerceAtLeast(charSequence.length() - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
    }

    public static String dropLast(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i5 >= 0) {
            return take(str, RangesKt.coerceAtLeast(str.length() - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
    }

    public static final CharSequence dropLastWhile(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) a.b(charSequence, lastIndex, predicate)).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    public static final String dropLastWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(0, lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    public static final CharSequence dropWhile(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int b5 = androidx.appcompat.view.a.b(charSequence, "<this>", function1, "predicate");
        for (int i5 = 0; i5 < b5; i5++) {
            if (!((Boolean) a.b(charSequence, i5, function1)).booleanValue()) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    public static final String dropWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
                String substring = str.substring(i5);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    @InlineOnly
    private static final char elementAtOrElse(CharSequence charSequence, int i5, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > StringsKt__StringsKt.getLastIndex(charSequence)) ? defaultValue.invoke(Integer.valueOf(i5)).charValue() : charSequence.charAt(i5);
    }

    @InlineOnly
    private static final Character elementAtOrNull(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i5);
    }

    public static final CharSequence filter(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static final String filter(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final CharSequence filterIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            char charAt = charSequence.charAt(i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i5++;
            i6 = i7;
        }
        return sb;
    }

    public static final String filterIndexed(String str, Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        int i6 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
            i5++;
            i6 = i7;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    public static final <C extends Appendable> C filterIndexedTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            char charAt = charSequence.charAt(i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final CharSequence filterNot(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static final String filterNot(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final <C extends Appendable> C filterNotTo(CharSequence charSequence, C destination, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    public static final <C extends Appendable> C filterTo(CharSequence charSequence, C destination, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Character find(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character findLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                char charAt = charSequence.charAt(length);
                if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                    return Character.valueOf(charAt);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    public static final char first(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final char first(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOf(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        R r4;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        while (true) {
            if (i5 >= charSequence.length()) {
                r4 = null;
                break;
            }
            r4 = (R) a.b(charSequence, i5, transform);
            if (r4 != null) {
                break;
            }
            i5++;
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            R r4 = (R) a.b(charSequence, i5, transform);
            if (r4 != null) {
                return r4;
            }
        }
        return null;
    }

    public static final Character firstOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final Character firstOrNull(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(CharSequence charSequence, Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            CollectionsKt.addAll(arrayList, (Iterable) a.b(charSequence, i5, transform));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(CharSequence charSequence, C destination, Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            CollectionsKt.addAll(destination, (Iterable) a.b(charSequence, i5, transform));
        }
        return destination;
    }

    public static final <R> R fold(CharSequence charSequence, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            r4 = operation.invoke(r4, Character.valueOf(charSequence.charAt(i5)));
        }
        return r4;
    }

    public static final <R> R foldIndexed(CharSequence charSequence, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Character.valueOf(charSequence.charAt(i5)));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldRight(CharSequence charSequence, R r4, Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(CharSequence charSequence, R r4, Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r4);
        }
        return r4;
    }

    public static final void forEach(CharSequence charSequence, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            action.invoke(Character.valueOf(charSequence.charAt(i5)));
        }
    }

    public static final void forEachIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            action.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5)));
            i5++;
            i6++;
        }
    }

    @InlineOnly
    private static final char getOrElse(CharSequence charSequence, int i5, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > StringsKt__StringsKt.getLastIndex(charSequence)) ? defaultValue.invoke(Integer.valueOf(i5)).charValue() : charSequence.charAt(i5);
    }

    public static final Character getOrNull(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i5 < 0 || i5 > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i5));
    }

    public static final <K> Map<K, List<Character>> groupBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(CharSequence charSequence, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(CharSequence charSequence, M destination, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            K invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    public static final <K> Grouping<Character, K> groupingBy(final CharSequence charSequence, final Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<Character, K>() { // from class: kotlin.text.StringsKt___StringsKt$groupingBy$1
            public K keyOf(char c5) {
                return keySelector.invoke(Character.valueOf(c5));
            }

            @Override // kotlin.collections.Grouping
            public /* bridge */ /* synthetic */ Object keyOf(Character ch) {
                return keyOf(ch.charValue());
            }

            @Override // kotlin.collections.Grouping
            public Iterator<Character> sourceIterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }

    public static final int indexOfFirst(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int b5 = androidx.appcompat.view.a.b(charSequence, "<this>", function1, "predicate");
        for (int i5 = 0; i5 < b5; i5++) {
            if (((Boolean) a.b(charSequence, i5, function1)).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfLast(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (((Boolean) a.b(charSequence, length, predicate)).booleanValue()) {
                    return length;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return -1;
    }

    public static char last(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
    }

    public static final char last(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                char charAt = charSequence.charAt(length);
                if (!predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final Character lastOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final Character lastOrNull(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            char charAt = charSequence.charAt(length);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final <R> List<R> map(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i5))));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexedNotNull(CharSequence charSequence, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            int i7 = i6 + 1;
            R invoke = transform.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            int i7 = i6 + 1;
            R invoke = transform.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5)));
            if (invoke != null) {
                destination.add(invoke);
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(CharSequence charSequence, C destination, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i6), Character.valueOf(charSequence.charAt(i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R> List<R> mapNotNull(CharSequence charSequence, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            Object b5 = a.b(charSequence, i5, transform);
            if (b5 != null) {
                arrayList.add(b5);
            }
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(CharSequence charSequence, C destination, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            Object b5 = a.b(charSequence, i5, transform);
            if (b5 != null) {
                destination.add(b5);
            }
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(CharSequence charSequence, C destination, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i5))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Character maxByOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
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
        return Character.valueOf(charAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return charAt;
        }
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
        return charAt;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) a.b(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m1317maxOf(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) a.b(charSequence, 0, function1)).floatValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1318maxOf(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        R r4 = (R) a.b(charSequence, 0, function1);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R invoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        R r4 = (R) a.b(charSequence, 0, function1);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R invoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m1319maxOfOrNull(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        double doubleValue = ((Number) a.b(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m1320maxOfOrNull(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        float floatValue = ((Number) a.b(charSequence, 0, function1)).floatValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) a.b(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) a.b(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character maxOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) charAt, (int) charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) charAt, (int) charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character maxWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Character minByOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
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
        return Character.valueOf(charAt);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return charAt;
        }
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
        return charAt;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) a.b(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m1321minOf(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) a.b(charSequence, 0, function1)).floatValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1322minOf(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            throw new NoSuchElementException();
        }
        R r4 = (R) a.b(charSequence, 0, function1);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R invoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, Function1<? super Character, ? extends R> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        R r4 = (R) a.b(charSequence, 0, function1);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            R invoke = function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m1323minOfOrNull(CharSequence charSequence, Function1<? super Character, Double> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        double doubleValue = ((Number) a.b(charSequence, 0, function1)).doubleValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m1324minOfOrNull(CharSequence charSequence, Function1<? super Character, Float> function1) {
        if (androidx.appcompat.view.a.b(charSequence, "<this>", function1, "selector") == 0) {
            return null;
        }
        float floatValue = ((Number) a.b(charSequence, 0, function1)).floatValue();
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, function1.invoke(Character.valueOf(charSequence.charAt(it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) a.b(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        Object obj = (R) a.b(charSequence, 0, selector);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character minOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) charAt, (int) charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (Intrinsics.compare((int) charAt, (int) charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character minWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    public static final boolean none(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static final boolean none(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (((Boolean) a.b(charSequence, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    public static final <S extends CharSequence> S onEach(S s4, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s4, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i5 = 0; i5 < s4.length(); i5++) {
            action.invoke(Character.valueOf(s4.charAt(i5)));
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    public static final <S extends CharSequence> S onEachIndexed(S s4, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(s4, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i5 = 0;
        int i6 = 0;
        while (i5 < s4.length()) {
            action.invoke(Integer.valueOf(i6), Character.valueOf(s4.charAt(i5)));
            i5++;
            i6++;
        }
        return s4;
    }

    public static final Pair<CharSequence, CharSequence> partition(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    public static final Pair<String, String> partition(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "first.toString()");
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "second.toString()");
        return new Pair<>(sb3, sb4);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final char random(CharSequence charSequence, Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(random.nextInt(charSequence.length()));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character randomOrNull(CharSequence charSequence, Random random) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduce(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return charAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduceIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            charAt = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt))).charValue();
        }
        return charAt;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character reduceIndexedOrNull(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            charAt = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt))).charValue();
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character reduceOrNull(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        ?? it = new IntRange(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.nextInt()))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final char reduceRight(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            charAt = operation.invoke(Character.valueOf(charSequence.charAt(i5)), Character.valueOf(charAt)).charValue();
        }
        return charAt;
    }

    public static final char reduceRightIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            charAt = operation.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i5)), Character.valueOf(charAt)).charValue();
        }
        return charAt;
    }

    @SinceKotlin(version = "1.4")
    public static final Character reduceRightIndexedOrNull(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            charAt = operation.invoke(Integer.valueOf(i5), Character.valueOf(charSequence.charAt(i5)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character reduceRightOrNull(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            charAt = operation.invoke(Character.valueOf(charSequence.charAt(i5)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final CharSequence reversed(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    @InlineOnly
    private static final String reversed(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return reversed((CharSequence) str).toString();
    }

    @SinceKotlin(version = "1.4")
    public static final <R> List<R> runningFold(CharSequence charSequence, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            r4 = operation.invoke(r4, Character.valueOf(charSequence.charAt(i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final <R> List<R> runningFoldIndexed(CharSequence charSequence, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Character.valueOf(charSequence.charAt(i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final List<Character> runningReduce(CharSequence charSequence, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i5 = 1; i5 < length; i5++) {
            charAt = operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i5))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final List<Character> runningReduceIndexed(CharSequence charSequence, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i5 = 1; i5 < length; i5++) {
            charAt = operation.invoke(Integer.valueOf(i5), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i5))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <R> List<R> scan(CharSequence charSequence, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            r4 = operation.invoke(r4, Character.valueOf(charSequence.charAt(i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <R> List<R> scanIndexed(CharSequence charSequence, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r4);
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Character.valueOf(charSequence.charAt(i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    public static final char single(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final char single(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
                ch = Character.valueOf(charAt);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
        }
        Intrinsics.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
        return ch.charValue();
    }

    public static final Character singleOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final Character singleOrNull(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            char charAt = charSequence.charAt(i5);
            if (predicate.invoke(Character.valueOf(charAt)).booleanValue()) {
                if (z4) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z4 = true;
            }
        }
        if (z4) {
            return ch;
        }
        return null;
    }

    public static final CharSequence slice(CharSequence charSequence, Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    public static final CharSequence slice(CharSequence charSequence, IntRange indices) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence, indices);
    }

    @InlineOnly
    private static final String slice(String str, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return slice((CharSequence) str, indices).toString();
    }

    public static final String slice(String str, IntRange indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.substring(str, indices);
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            i5 += ((Number) a.b(charSequence, i6, selector)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            d5 += ((Number) a.b(charSequence, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(CharSequence charSequence, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            d5 += ((Number) a.b(charSequence, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(CharSequence charSequence, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            i5 += ((Number) a.b(charSequence, i6, selector)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(CharSequence charSequence, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            j5 += ((Number) a.b(charSequence, i5, selector)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(CharSequence charSequence, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            m110constructorimpl = androidx.appcompat.view.a.c((UInt) a.b(charSequence, i5, selector), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(CharSequence charSequence, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            m188constructorimpl = ULong.m188constructorimpl(((ULong) a.b(charSequence, i5, selector)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    public static final CharSequence take(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i5 >= 0) {
            return charSequence.subSequence(0, RangesKt.coerceAtMost(i5, charSequence.length()));
        }
        throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
    }

    public static String take(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
        }
        String substring = str.substring(0, RangesKt.coerceAtMost(i5, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence takeLast(CharSequence charSequence, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
        }
        int length = charSequence.length();
        return charSequence.subSequence(length - RangesKt.coerceAtMost(i5, length), length);
    }

    public static final String takeLast(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested character count ", i5, " is less than zero.").toString());
        }
        int length = str.length();
        String substring = str.substring(length - RangesKt.coerceAtMost(i5, length));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final CharSequence takeLastWhile(CharSequence charSequence, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) a.b(charSequence, lastIndex, predicate)).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String takeLastWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(str.charAt(lastIndex))).booleanValue()) {
                String substring = str.substring(lastIndex + 1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final CharSequence takeWhile(CharSequence charSequence, Function1<? super Character, Boolean> function1) {
        int b5 = androidx.appcompat.view.a.b(charSequence, "<this>", function1, "predicate");
        for (int i5 = 0; i5 < b5; i5++) {
            if (!((Boolean) a.b(charSequence, i5, function1)).booleanValue()) {
                return charSequence.subSequence(0, i5);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String takeWhile(String str, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!predicate.invoke(Character.valueOf(str.charAt(i5))).booleanValue()) {
                String substring = str.substring(0, i5);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            destination.add(Character.valueOf(charSequence.charAt(i5)));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128))));
    }

    public static final List<Character> toList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? toMutableList(charSequence) : CollectionsKt.listOf(Character.valueOf(charSequence.charAt(0))) : CollectionsKt.emptyList();
    }

    public static final List<Character> toMutableList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Set<Character> toSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) toCollection(charSequence, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128)))) : SetsKt.setOf(Character.valueOf(charSequence.charAt(0))) : SetsKt.emptySet();
    }

    @SinceKotlin(version = "1.2")
    public static final List<String> windowed(CharSequence charSequence, int i5, int i6, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i5, i6, z4, new Function1<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$windowed$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        });
    }

    @SinceKotlin(version = "1.2")
    public static final <R> List<R> windowed(CharSequence charSequence, int i5, int i6, boolean z4, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i5, i6);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i6) + (length % i6 == 0 ? 0 : 1));
        int i7 = 0;
        while (true) {
            if (!(i7 >= 0 && i7 < length)) {
                break;
            }
            int i8 = i7 + i5;
            if (i8 < 0 || i8 > length) {
                if (!z4) {
                    break;
                }
                i8 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i7, i8)));
            i7 += i6;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowed(charSequence, i5, i6, z4);
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i5, int i6, boolean z4, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowed(charSequence, i5, i6, z4, function1);
    }

    @SinceKotlin(version = "1.2")
    public static final Sequence<String> windowedSequence(CharSequence charSequence, int i5, int i6, boolean z4) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i5, i6, z4, new Function1<CharSequence, String>() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        });
    }

    @SinceKotlin(version = "1.2")
    public static final <R> Sequence<R> windowedSequence(final CharSequence charSequence, final int i5, int i6, boolean z4, final Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i5, i6);
        return SequencesKt.map(CollectionsKt.asSequence(RangesKt.step(z4 ? StringsKt__StringsKt.getIndices(charSequence) : RangesKt.until(0, (charSequence.length() - i5) + 1), i6)), new Function1<Integer, R>() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R invoke(int i7) {
                int i8 = i5 + i7;
                if (i8 < 0 || i8 > charSequence.length()) {
                    i8 = charSequence.length();
                }
                return transform.invoke(charSequence.subSequence(i7, i8));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        });
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowedSequence(charSequence, i5, i6, z4);
    }

    public static /* synthetic */ Sequence windowedSequence$default(CharSequence charSequence, int i5, int i6, boolean z4, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowedSequence(charSequence, i5, i6, z4, function1);
    }

    public static final Iterable<IndexedValue<Character>> withIndex(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Character>>() { // from class: kotlin.text.StringsKt___StringsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Character> invoke() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        });
    }

    public static final List<Pair<Character, Character>> zip(CharSequence charSequence, CharSequence other) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Character.valueOf(charSequence.charAt(i5)), Character.valueOf(other.charAt(i5))));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(CharSequence charSequence, CharSequence other, Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i5)), Character.valueOf(other.charAt(i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    public static final List<Pair<Character, Character>> zipWithNext(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i5 = 0;
        while (i5 < length) {
            char charAt = charSequence.charAt(i5);
            i5++;
            arrayList.add(TuplesKt.to(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    public static final <R> List<R> zipWithNext(CharSequence charSequence, Function2<? super Character, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i5 = 0;
        while (i5 < length) {
            Character valueOf = Character.valueOf(charSequence.charAt(i5));
            i5++;
            arrayList.add(transform.invoke(valueOf, Character.valueOf(charSequence.charAt(i5))));
        }
        return arrayList;
    }
}
