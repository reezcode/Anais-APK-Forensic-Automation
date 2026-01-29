package kotlin.sequences;

import androidx.activity.d;
import androidx.appcompat.widget.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
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
import kotlin.collections.ArraysKt;
import kotlin.collections.BrittleContainsOptimizationKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes17.dex */
public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
    public static final <T> boolean all(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        while (i5.hasNext()) {
            if (!function1.invoke((Object) i5.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence.iterator().hasNext();
    }

    public static final <T> boolean any(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        while (i5.hasNext()) {
            if (function1.invoke((Object) i5.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterable<T> asIterable(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Sequence<T> asSequence(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence;
    }

    public static final <T, K, V> Map<K, V> associate(Sequence<? extends T> sequence, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T, K> Map<K, T> associateBy(Sequence<? extends T> sequence, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : sequence) {
            linkedHashMap.put(keySelector.invoke(t4), t4);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, V> associateBy(Sequence<? extends T> sequence, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : sequence) {
            linkedHashMap.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(Sequence<? extends T> sequence, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : sequence) {
            destination.put(keySelector.invoke(t4), t4);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(Sequence<? extends T> sequence, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : sequence) {
            destination.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(Sequence<? extends T> sequence, M destination, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final <K, V> Map<K, V> associateWith(Sequence<? extends K> sequence, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        HashMap linkedHashMap = new LinkedHashMap();
        for (K k5 : sequence) {
            linkedHashMap.put(k5, valueSelector.invoke(k5));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(Sequence<? extends K> sequence, M destination, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k5 : sequence) {
            destination.put(k5, valueSelector.invoke(k5));
        }
        return destination;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(Sequence<Byte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Byte> it = sequence.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().byteValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().doubleValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().floatValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(Sequence<Integer> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Integer> it = sequence.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().intValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(Sequence<Long> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Long> it = sequence.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().longValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(Sequence<Short> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Short> it = sequence.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().shortValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @SinceKotlin(version = "1.2")
    public static final <T> Sequence<List<T>> chunked(Sequence<? extends T> sequence, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return windowed(sequence, i5, i5, true);
    }

    @SinceKotlin(version = "1.2")
    public static final <T, R> Sequence<R> chunked(Sequence<? extends T> sequence, int i5, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(sequence, i5, i5, true, transform);
    }

    public static final <T> boolean contains(Sequence<? extends T> sequence, T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return indexOf(sequence, t4) >= 0;
    }

    public static <T> int count(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            it.next();
            i5++;
            if (i5 < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i5;
    }

    public static final <T> int count(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        int i6 = 0;
        while (i5.hasNext()) {
            if (function1.invoke((Object) i5.next()).booleanValue() && (i6 = i6 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i6;
    }

    public static final <T> Sequence<T> distinct(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return distinctBy(sequence, new Function1<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$distinct$1
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T t4) {
                return t4;
            }
        });
    }

    public static final <T, K> Sequence<T> distinctBy(Sequence<? extends T> sequence, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new DistinctSequence(sequence, selector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> drop(Sequence<? extends T> sequence, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i5 >= 0) {
            return i5 == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).drop(i5) : new DropSequence(sequence, i5);
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final <T> Sequence<T> dropWhile(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new DropWhileSequence(sequence, predicate);
    }

    public static final <T> T elementAt(Sequence<? extends T> sequence, final int i5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (T) elementAtOrElse(sequence, i5, new Function1<Integer, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T invoke(int i6) {
                StringBuilder g5 = d.g("Sequence doesn't contain element at index ");
                g5.append(i5);
                g5.append(FilenameUtils.EXTENSION_SEPARATOR);
                throw new IndexOutOfBoundsException(g5.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        });
    }

    public static final <T> T elementAtOrElse(Sequence<? extends T> sequence, int i5, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i5 >= 0) {
            int i6 = 0;
            for (T t4 : sequence) {
                int i7 = i6 + 1;
                if (i5 == i6) {
                    return t4;
                }
                i6 = i7;
            }
        }
        return defaultValue.invoke(Integer.valueOf(i5));
    }

    public static final <T> T elementAtOrNull(Sequence<? extends T> sequence, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i5 < 0) {
            return null;
        }
        int i6 = 0;
        for (T t4 : sequence) {
            int i7 = i6 + 1;
            if (i5 == i6) {
                return t4;
            }
            i6 = i7;
        }
        return null;
    }

    public static final <T> Sequence<T> filter(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    public static final <T> Sequence<T> filterIndexed(Sequence<? extends T> sequence, final Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TransformingSequence(new FilteringSequence(new IndexingSequence(sequence), true, new Function1<IndexedValue<? extends T>, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(IndexedValue<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return predicate.invoke(Integer.valueOf(it.getIndex()), it.getValue());
            }
        }), new Function1<IndexedValue<? extends T>, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$2
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(IndexedValue<? extends T> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getValue();
            }
        });
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i5), t4).booleanValue()) {
                destination.add(t4);
            }
            i5 = i6;
        }
        return destination;
    }

    public static final /* synthetic */ <R> Sequence<R> filterIsInstance(Sequence<?> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.needClassReification();
        Sequence<R> filter = filter(sequence, new Function1<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                Intrinsics.reifiedOperationMarker(3, "R");
                return Boolean.valueOf(obj instanceof Object);
            }
        });
        Intrinsics.checkNotNull(filter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return filter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Sequence<?> sequence, C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : sequence) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> Sequence<T> filterNot(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence(sequence, false, predicate);
    }

    public static final <T> Sequence<T> filterNotNull(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence<T> filterNot = filterNot(sequence, new Function1<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(T t4) {
                return Boolean.valueOf(t4 == null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((SequencesKt___SequencesKt$filterNotNull$1<T>) obj);
            }
        });
        Intrinsics.checkNotNull(filterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return filterNot;
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Sequence<? extends T> sequence, C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t4 : sequence) {
            if (t4 != null) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(Sequence<? extends T> sequence, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : sequence) {
            if (!predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(Sequence<? extends T> sequence, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : sequence) {
            if (predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T find(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        while (i5.hasNext()) {
            ?? r02 = (Object) i5.next();
            if (function1.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    @InlineOnly
    private static final <T> T findLast(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        T t4 = null;
        while (i5.hasNext()) {
            ?? r12 = (Object) i5.next();
            if (function1.invoke(r12).booleanValue()) {
                t4 = r12;
            }
        }
        return t4;
    }

    public static final <T> T first(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T first(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        while (i5.hasNext()) {
            ?? r02 = (Object) i5.next();
            if (function1.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOf(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        R r4;
        Iterator i5 = d.i(sequence, "<this>", function1, "transform");
        while (true) {
            if (!i5.hasNext()) {
                r4 = null;
                break;
            }
            r4 = function1.invoke((Object) i5.next());
            if (r4 != null) {
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOfOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "transform");
        while (i5.hasNext()) {
            R invoke = function1.invoke((Object) i5.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public static <T> T firstOrNull(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T firstOrNull(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        while (i5.hasNext()) {
            ?? r02 = (Object) i5.next();
            if (function1.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        return null;
    }

    public static final <T, R> Sequence<R> flatMap(Sequence<? extends T> sequence, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence(sequence, transform, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapIndexedIterable")
    public static final <T, R> Sequence<R> flatMapIndexedIterable(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(sequence, transform, SequencesKt___SequencesKt$flatMapIndexed$1.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapIndexedSequence")
    public static final <T, R> Sequence<R> flatMapIndexedSequence(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(sequence, transform, SequencesKt___SequencesKt$flatMapIndexed$2.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequenceTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapIterable")
    public static final <T, R> Sequence<R> flatMapIterable(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence(sequence, transform, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapIterableTo")
    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(Sequence<? extends T> sequence, C destination, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(Sequence<? extends T> sequence, C destination, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(Sequence<? extends T> sequence, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            r4 = operation.invoke(r4, it.next());
        }
        return r4;
    }

    public static final <T, R> R foldIndexed(Sequence<? extends T> sequence, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            r4 = operation.invoke(Integer.valueOf(i5), r4, t4);
            i5 = i6;
        }
        return r4;
    }

    public static final <T> void forEach(Sequence<? extends T> sequence, Function1<? super T, Unit> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "action");
        while (i5.hasNext()) {
            function1.invoke((Object) i5.next());
        }
    }

    public static final <T> void forEachIndexed(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i5), t4);
            i5 = i6;
        }
    }

    public static final <T, K> Map<K, List<T>> groupBy(Sequence<? extends T> sequence, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : sequence) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(t4);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(Sequence<? extends T> sequence, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : sequence) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(Sequence<? extends T> sequence, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : sequence) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(t4);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(Sequence<? extends T> sequence, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : sequence) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(t4));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    public static final <T, K> Grouping<T, K> groupingBy(final Sequence<? extends T> sequence, final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$groupingBy$1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t4) {
                return keySelector.invoke(t4);
            }

            @Override // kotlin.collections.Grouping
            public Iterator<T> sourceIterator() {
                return sequence.iterator();
            }
        };
    }

    public static final <T> int indexOf(Sequence<? extends T> sequence, T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i5 = 0;
        for (T t5 : sequence) {
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t4, t5)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        int i6 = 0;
        while (i5.hasNext()) {
            a1.d dVar = (Object) i5.next();
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(dVar).booleanValue()) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        int i6 = -1;
        int i7 = 0;
        while (i5.hasNext()) {
            a1.d dVar = (Object) i5.next();
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(dVar).booleanValue()) {
                i6 = i7;
            }
            i7++;
        }
        return i6;
    }

    public static final <T, A extends Appendable> A joinTo(Sequence<? extends T> sequence, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (T t4 : sequence) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            StringsKt.appendElement(buffer, t4, function1);
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(Sequence<? extends T> sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(sequence, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i6 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i6 & 4) == 0 ? charSequence3 : "";
        int i7 = (i6 & 8) != 0 ? -1 : i5;
        if ((i6 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i6 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sequence, charSequence, charSequence5, charSequence6, i7, charSequence7, function1);
    }

    public static <T> T last(Sequence<? extends T> sequence) {
        T next;
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T last(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        T t4 = null;
        boolean z4 = false;
        while (i5.hasNext()) {
            ?? r22 = (Object) i5.next();
            if (function1.invoke(r22).booleanValue()) {
                z4 = true;
                t4 = r22;
            }
        }
        if (z4) {
            return t4;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(Sequence<? extends T> sequence, T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i5 = -1;
        int i6 = 0;
        for (T t5 : sequence) {
            if (i6 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t4, t5)) {
                i5 = i6;
            }
            i6++;
        }
        return i5;
    }

    public static final <T> T lastOrNull(Sequence<? extends T> sequence) {
        T next;
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    public static final <T> T lastOrNull(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        T t4 = null;
        while (i5.hasNext()) {
            ?? r12 = (Object) i5.next();
            if (function1.invoke(r12).booleanValue()) {
                t4 = r12;
            }
        }
        return t4;
    }

    public static <T, R> Sequence<R> map(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    public static final <T, R> Sequence<R> mapIndexed(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingIndexedSequence(sequence, transform);
    }

    public static final <T, R> Sequence<R> mapIndexedNotNull(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return filterNotNull(new TransformingIndexedSequence(sequence, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            R invoke = transform.invoke(Integer.valueOf(i5), t4);
            if (invoke != null) {
                destination.add(invoke);
            }
            i5 = i6;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(Sequence<? extends T> sequence, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : sequence) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return destination;
    }

    public static <T, R> Sequence<R> mapNotNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return filterNotNull(new TransformingSequence(sequence, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(Sequence<? extends T> sequence, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(Sequence<? extends T> sequence, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        ?? r02 = (Object) i5.next();
        if (!i5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) i5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (i5.hasNext());
        return (T) r02;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r02 = (Object) i5.next();
        if (!i5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) i5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (i5.hasNext());
        return (T) r02;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double maxOf(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = function1.invoke((Object) i5.next()).doubleValue();
        while (i5.hasNext()) {
            doubleValue = Math.max(doubleValue, function1.invoke((Object) i5.next()).doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m1301maxOf(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = function1.invoke((Object) i5.next()).floatValue();
        while (i5.hasNext()) {
            floatValue = Math.max(floatValue, function1.invoke((Object) i5.next()).floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1302maxOf(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = function1.invoke((Object) i5.next());
        while (i5.hasNext()) {
            R invoke2 = function1.invoke((Object) i5.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        R invoke = function1.invoke((Object) i5.next());
        while (i5.hasNext()) {
            R invoke2 = function1.invoke((Object) i5.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m1303maxOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        double doubleValue = function1.invoke((Object) i5.next()).doubleValue();
        while (i5.hasNext()) {
            doubleValue = Math.max(doubleValue, function1.invoke((Object) i5.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m1304maxOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        float floatValue = function1.invoke((Object) i5.next()).floatValue();
        while (i5.hasNext()) {
            floatValue = Math.max(floatValue, function1.invoke((Object) i5.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWith(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWithOrNull(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOrNull(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m1305maxOrNull(Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m1306maxOrNull(Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m1307maxOrThrow(Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1308maxOrThrow(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    public static final <T> T maxWithOrNull(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T minByOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        ?? r02 = (Object) i5.next();
        if (!i5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) i5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (i5.hasNext());
        return (T) r02;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r02 = (Object) i5.next();
        if (!i5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) i5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (i5.hasNext());
        return (T) r02;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double minOf(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = function1.invoke((Object) i5.next()).doubleValue();
        while (i5.hasNext()) {
            doubleValue = Math.min(doubleValue, function1.invoke((Object) i5.next()).doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m1309minOf(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = function1.invoke((Object) i5.next()).floatValue();
        while (i5.hasNext()) {
            floatValue = Math.min(floatValue, function1.invoke((Object) i5.next()).floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m1310minOf(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = function1.invoke((Object) i5.next());
        while (i5.hasNext()) {
            R invoke2 = function1.invoke((Object) i5.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(Sequence<? extends T> sequence, Function1<? super T, ? extends R> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        R invoke = function1.invoke((Object) i5.next());
        while (i5.hasNext()) {
            R invoke2 = function1.invoke((Object) i5.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m1311minOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        double doubleValue = function1.invoke((Object) i5.next()).doubleValue();
        while (i5.hasNext()) {
            doubleValue = Math.min(doubleValue, function1.invoke((Object) i5.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m1312minOfOrNull(Sequence<? extends T> sequence, Function1<? super T, Float> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        if (!i5.hasNext()) {
            return null;
        }
        float floatValue = function1.invoke((Object) i5.next()).floatValue();
        while (i5.hasNext()) {
            floatValue = Math.min(floatValue, function1.invoke((Object) i5.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWith(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWithOrNull(Sequence<? extends T> sequence, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) selector.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOrNull(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m1313minOrNull(Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m1314minOrNull(Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m1315minOrThrow(Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m1316minOrThrow(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    public static final <T> T minWithOrNull(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T> Sequence<T> minus(final Sequence<? extends T> sequence, final Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                final Collection convertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(elements);
                return (convertToSetForSetOperation.isEmpty() ? sequence : SequencesKt___SequencesKt.filterNot(sequence, new Function1<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$3$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(T t4) {
                        return Boolean.valueOf(convertToSetForSetOperation.contains(t4));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$3$iterator$1<T>) obj);
                    }
                })).iterator();
            }
        };
    }

    public static final <T> Sequence<T> minus(final Sequence<? extends T> sequence, final T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Sequence<T> sequence2 = sequence;
                final T t5 = t4;
                return SequencesKt___SequencesKt.filter(sequence2, new Function1<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(T t6) {
                        boolean z4 = true;
                        if (!Ref.BooleanRef.this.element && Intrinsics.areEqual(t6, t5)) {
                            Ref.BooleanRef.this.element = true;
                            z4 = false;
                        }
                        return Boolean.valueOf(z4);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$1$iterator$1<T>) obj);
                    }
                }).iterator();
            }
        };
    }

    public static final <T> Sequence<T> minus(final Sequence<? extends T> sequence, final Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$4
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                final Collection convertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(elements);
                return (convertToSetForSetOperation.isEmpty() ? sequence : SequencesKt___SequencesKt.filterNot(sequence, new Function1<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$4$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(T t4) {
                        return Boolean.valueOf(convertToSetForSetOperation.contains(t4));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$4$iterator$1<T>) obj);
                    }
                })).iterator();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Sequence<T> minus(final Sequence<? extends T> sequence, final T[] elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? sequence : new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                final Collection convertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(elements);
                return SequencesKt___SequencesKt.filterNot(sequence, new Function1<T, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$2$iterator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(T t4) {
                        return Boolean.valueOf(convertToSetForSetOperation.contains(t4));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((SequencesKt___SequencesKt$minus$2$iterator$1<T>) obj);
                    }
                }).iterator();
            }
        };
    }

    @InlineOnly
    private static final <T> Sequence<T> minusElement(Sequence<? extends T> sequence, T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return minus(sequence, t4);
    }

    public static final <T> boolean none(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return !sequence.iterator().hasNext();
    }

    public static final <T> boolean none(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        while (i5.hasNext()) {
            if (function1.invoke((Object) i5.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    public static final <T> Sequence<T> onEach(Sequence<? extends T> sequence, final Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return map(sequence, new Function1<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEach$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T t4) {
                action.invoke(t4);
                return t4;
            }
        });
    }

    @SinceKotlin(version = "1.4")
    public static final <T> Sequence<T> onEachIndexed(Sequence<? extends T> sequence, final Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return mapIndexed(sequence, new Function2<Integer, T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$onEachIndexed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final T invoke(int i5, T t4) {
                action.invoke(Integer.valueOf(i5), t4);
                return t4;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
                return invoke(num.intValue(), (int) obj);
            }
        });
    }

    public static final <T> Pair<List<T>, List<T>> partition(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t4 : sequence) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            } else {
                arrayList2.add(t4);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> Sequence<T> plus(Sequence<? extends T> sequence, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, CollectionsKt.asSequence(elements)));
    }

    public static final <T> Sequence<T> plus(Sequence<? extends T> sequence, T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, SequencesKt__SequencesKt.sequenceOf(t4)));
    }

    public static final <T> Sequence<T> plus(Sequence<? extends T> sequence, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, elements));
    }

    public static final <T> Sequence<T> plus(Sequence<? extends T> sequence, T[] elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return plus((Sequence) sequence, (Iterable) ArraysKt.asList(elements));
    }

    @InlineOnly
    private static final <T> Sequence<T> plusElement(Sequence<? extends T> sequence, T t4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return plus(sequence, t4);
    }

    public static final <S, T extends S> S reduce(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(Sequence<? extends T> sequence, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        int i5 = 1;
        while (it.hasNext()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i5), next, it.next());
            i5 = i6;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> S reduceIndexedOrNull(Sequence<? extends T> sequence, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i5 = 1;
        while (it.hasNext()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i5), next, it.next());
            i5 = i6;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> S reduceOrNull(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <T> Sequence<T> requireNoNulls(final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return map(sequence, new Function1<T, T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$requireNoNulls$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T t4) {
                if (t4 != null) {
                    return t4;
                }
                StringBuilder g5 = d.g("null element found in ");
                g5.append(sequence);
                g5.append(FilenameUtils.EXTENSION_SEPARATOR);
                throw new IllegalArgumentException(g5.toString());
            }
        });
    }

    @SinceKotlin(version = "1.4")
    public static final <T, R> Sequence<R> runningFold(Sequence<? extends T> sequence, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new SequencesKt___SequencesKt$runningFold$1(r4, sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    public static final <T, R> Sequence<R> runningFoldIndexed(Sequence<? extends T> sequence, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new SequencesKt___SequencesKt$runningFoldIndexed$1(r4, sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> Sequence<S> runningReduce(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new SequencesKt___SequencesKt$runningReduce$1(sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> Sequence<S> runningReduceIndexed(Sequence<? extends T> sequence, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new SequencesKt___SequencesKt$runningReduceIndexed$1(sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> Sequence<R> scan(Sequence<? extends T> sequence, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return runningFold(sequence, r4, operation);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> Sequence<R> scanIndexed(Sequence<? extends T> sequence, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return runningFoldIndexed(sequence, r4, operation);
    }

    public static final <T> T single(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T single(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        T t4 = null;
        boolean z4 = false;
        while (i5.hasNext()) {
            ?? r22 = (Object) i5.next();
            if (function1.invoke(r22).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z4 = true;
                t4 = r22;
            }
        }
        if (z4) {
            return t4;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T singleOrNull(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    public static final <T> T singleOrNull(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "predicate");
        boolean z4 = false;
        T t4 = null;
        while (i5.hasNext()) {
            ?? r32 = (Object) i5.next();
            if (function1.invoke(r32).booleanValue()) {
                if (z4) {
                    return null;
                }
                z4 = true;
                t4 = r32;
            }
        }
        if (z4) {
            return t4;
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> Sequence<T> sorted(final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (Sequence<T>) new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sorted$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(sequence);
                CollectionsKt.sort(mutableList);
                return mutableList.iterator();
            }
        };
    }

    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedBy(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sequence, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedByDescending(Sequence<? extends T> sequence, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sequence, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <T extends Comparable<? super T>> Sequence<T> sortedDescending(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sortedWith(sequence, ComparisonsKt.reverseOrder());
    }

    public static final <T> Sequence<T> sortedWith(final Sequence<? extends T> sequence, final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sortedWith$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(sequence);
                CollectionsKt.sortWith(mutableList, comparator);
                return mutableList.iterator();
            }
        };
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(Sequence<? extends T> sequence, Function1<? super T, Integer> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        int i6 = 0;
        while (i5.hasNext()) {
            i6 += function1.invoke((Object) i5.next()).intValue();
        }
        return i6;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        double d5 = 0.0d;
        while (i5.hasNext()) {
            d5 += function1.invoke((Object) i5.next()).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(Sequence<Byte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Byte> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().byteValue();
        }
        return i5;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        double d5 = 0.0d;
        while (it.hasNext()) {
            d5 += it.next().doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final <T> double sumOfDouble(Sequence<? extends T> sequence, Function1<? super T, Double> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        double d5 = 0.0d;
        while (i5.hasNext()) {
            d5 += function1.invoke((Object) i5.next()).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        float f5 = 0.0f;
        while (it.hasNext()) {
            f5 += it.next().floatValue();
        }
        return f5;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(Sequence<Integer> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Integer> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final <T> int sumOfInt(Sequence<? extends T> sequence, Function1<? super T, Integer> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        int i6 = 0;
        while (i5.hasNext()) {
            i6 += function1.invoke((Object) i5.next()).intValue();
        }
        return i6;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(Sequence<Long> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Long> it = sequence.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 += it.next().longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final <T> long sumOfLong(Sequence<? extends T> sequence, Function1<? super T, Long> function1) {
        Iterator i5 = d.i(sequence, "<this>", function1, "selector");
        long j5 = 0;
        while (i5.hasNext()) {
            j5 += function1.invoke((Object) i5.next()).longValue();
        }
        return j5;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(Sequence<Short> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Short> it = sequence.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().shortValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> int sumOfUInt(Sequence<? extends T> sequence, Function1<? super T, UInt> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(it.next()), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> long sumOfULong(Sequence<? extends T> sequence, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(it.next()).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    public static final <T> Sequence<T> take(Sequence<? extends T> sequence, int i5) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i5 >= 0) {
            return i5 == 0 ? SequencesKt__SequencesKt.emptySequence() : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).take(i5) : new TakeSequence(sequence, i5);
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final <T> Sequence<T> takeWhile(Sequence<? extends T> sequence, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TakeWhileSequence(sequence, predicate);
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Sequence<? extends T> sequence, C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> HashSet<T> toHashSet(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (HashSet) toCollection(sequence, new HashSet());
    }

    public static <T> List<T> toList(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return CollectionsKt.optimizeReadOnlyList(toMutableList(sequence));
    }

    public static final <T> List<T> toMutableList(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (List) toCollection(sequence, new ArrayList());
    }

    public static final <T> Set<T> toMutableSet(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> toSet(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SetsKt.optimizeReadOnlySet((Set) toCollection(sequence, new LinkedHashSet()));
    }

    @SinceKotlin(version = "1.2")
    public static final <T> Sequence<List<T>> windowed(Sequence<? extends T> sequence, int i5, int i6, boolean z4) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SlidingWindowKt.windowedSequence(sequence, i5, i6, z4, false);
    }

    @SinceKotlin(version = "1.2")
    public static final <T, R> Sequence<R> windowed(Sequence<? extends T> sequence, int i5, int i6, boolean z4, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return map(SlidingWindowKt.windowedSequence(sequence, i5, i6, z4, true), transform);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowed(sequence, i5, i6, z4);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i5, int i6, boolean z4, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowed(sequence, i5, i6, z4, function1);
    }

    public static final <T> Sequence<IndexedValue<T>> withIndex(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new IndexingSequence(sequence);
    }

    public static final <T, R> Sequence<Pair<T, R>> zip(Sequence<? extends T> sequence, Sequence<? extends R> other) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new MergingSequence(sequence, other, new Function2<T, R, Pair<? extends T, ? extends R>>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SequencesKt___SequencesKt$zip$1<R, T>) obj, obj2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Pair<T, R> invoke(T t4, R r4) {
                return TuplesKt.to(t4, r4);
            }
        });
    }

    public static final <T, R, V> Sequence<V> zip(Sequence<? extends T> sequence, Sequence<? extends R> other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new MergingSequence(sequence, other, transform);
    }

    @SinceKotlin(version = "1.2")
    public static final <T> Sequence<Pair<T, T>> zipWithNext(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return zipWithNext(sequence, new Function2<T, T, Pair<? extends T, ? extends T>>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$1
            @Override // kotlin.jvm.functions.Function2
            public final Pair<T, T> invoke(T t4, T t5) {
                return TuplesKt.to(t4, t5);
            }
        });
    }

    @SinceKotlin(version = "1.2")
    public static final <T, R> Sequence<R> zipWithNext(Sequence<? extends T> sequence, Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequenceBuilderKt.sequence(new SequencesKt___SequencesKt$zipWithNext$2(sequence, transform, null));
    }
}
