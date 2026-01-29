package kotlin.collections;

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
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
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
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.internal.HidesMembers;
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
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes18.dex */
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    public static final <T> boolean all(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final <T> boolean any(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Iterable<T> asIterable(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable;
    }

    public static <T> Sequence<T> asSequence(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new Sequence<T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static final <T, K, V> Map<K, V> associate(Iterable<? extends T> iterable, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T, K> Map<K, T> associateBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t4 : iterable) {
            linkedHashMap.put(keySelector.invoke(t4), t4);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, V> associateBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t4 : iterable) {
            linkedHashMap.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : iterable) {
            destination.put(keySelector.invoke(t4), t4);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : iterable) {
            destination.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(it.next());
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final <K, V> Map<K, V> associateWith(Iterable<? extends K> iterable, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        HashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (K k5 : iterable) {
            linkedHashMap.put(k5, valueSelector.invoke(k5));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(Iterable<? extends K> iterable, M destination, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k5 : iterable) {
            destination.put(k5, valueSelector.invoke(k5));
        }
        return destination;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().byteValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().doubleValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().floatValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().intValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().longValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double d5 = 0.0d;
        int i5 = 0;
        while (it.hasNext()) {
            d5 += it.next().shortValue();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @SinceKotlin(version = "1.2")
    public static final <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i5) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i5, i5, true);
    }

    @SinceKotlin(version = "1.2")
    public static final <T, R> List<R> chunked(Iterable<? extends T> iterable, int i5, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(iterable, i5, i5, true, transform);
    }

    @InlineOnly
    private static final <T> T component1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(0);
    }

    @InlineOnly
    private static final <T> T component2(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(1);
    }

    @InlineOnly
    private static final <T> T component3(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(2);
    }

    @InlineOnly
    private static final <T> T component4(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(3);
    }

    @InlineOnly
    private static final <T> T component5(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(4);
    }

    public static final <T> boolean contains(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t4) : indexOf(iterable, t4) >= 0;
    }

    public static final <T> int count(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i5 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i5++;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i5;
    }

    public static final <T> int count(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i5 = i5 + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i5;
    }

    @InlineOnly
    private static final <T> int count(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    public static final <T> List<T> distinct(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return toList(toMutableSet(iterable));
    }

    public static final <T, K> List<T> distinctBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (hashSet.add(selector.invoke(t4))) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static <T> List<T> drop(Iterable<? extends T> iterable, int i5) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i6 = 0;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i5;
            if (size <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (size == 1) {
                return CollectionsKt__CollectionsJVMKt.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i5 < size2) {
                        arrayList.add(((List) iterable).get(i5));
                        i5++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i5);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t4 : iterable) {
            if (i6 >= i5) {
                arrayList.add(t4);
            } else {
                i6++;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> dropLast(List<? extends T> list, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i5 >= 0) {
            return take(list, RangesKt.coerceAtLeast(list.size() - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <T> List<T> dropWhile(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (T t4 : iterable) {
            if (z4) {
                arrayList.add(t4);
            } else if (!predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final <T> T elementAt(Iterable<? extends T> iterable, final int i5) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i5) : (T) elementAtOrElse(iterable, i5, new Function1<Integer, T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final T invoke(int i6) {
                StringBuilder g5 = d.g("Collection doesn't contain element at index ");
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

    @InlineOnly
    private static final <T> T elementAt(List<? extends T> list, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(i5);
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i5, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i5 < 0 || i5 > CollectionsKt__CollectionsKt.getLastIndex(list)) ? defaultValue.invoke(Integer.valueOf(i5)) : (T) list.get(i5);
        }
        if (i5 >= 0) {
            int i6 = 0;
            for (T t4 : iterable) {
                int i7 = i6 + 1;
                if (i5 == i6) {
                    return t4;
                }
                i6 = i7;
            }
        }
        return defaultValue.invoke(Integer.valueOf(i5));
    }

    @InlineOnly
    private static final <T> T elementAtOrElse(List<? extends T> list, int i5, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > CollectionsKt__CollectionsKt.getLastIndex(list)) ? defaultValue.invoke(Integer.valueOf(i5)) : list.get(i5);
    }

    public static final <T> T elementAtOrNull(Iterable<? extends T> iterable, int i5) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) getOrNull((List) iterable, i5);
        }
        if (i5 < 0) {
            return null;
        }
        int i6 = 0;
        for (T t4 : iterable) {
            int i7 = i6 + 1;
            if (i5 == i6) {
                return t4;
            }
            i6 = i7;
        }
        return null;
    }

    @InlineOnly
    private static final <T> T elementAtOrNull(List<? extends T> list, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return (T) getOrNull(list, i5);
    }

    public static final <T> List<T> filter(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i5), t4).booleanValue()) {
                arrayList.add(t4);
            }
            i5 = i6;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i5), t4).booleanValue()) {
                destination.add(t4);
            }
            i5 = i6;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> List<T> filterNot(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (!predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t4 : iterable) {
            if (t4 != null) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(Iterable<? extends T> iterable, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : iterable) {
            if (!predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(Iterable<? extends T> iterable, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : iterable) {
            if (predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T find(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        while (h5.hasNext()) {
            ?? r02 = (Object) h5.next();
            if (function1.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    @InlineOnly
    private static final <T> T findLast(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        T t4 = null;
        while (h5.hasNext()) {
            ?? r12 = (Object) h5.next();
            if (function1.invoke(r12).booleanValue()) {
                t4 = r12;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @InlineOnly
    private static final <T> T findLast(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    public static final <T> T first(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T first(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        while (h5.hasNext()) {
            ?? r02 = (Object) h5.next();
            if (function1.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static <T> T first(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        R r4;
        Iterator h5 = d.h(iterable, "<this>", function1, "transform");
        while (true) {
            if (!h5.hasNext()) {
                r4 = null;
                break;
            }
            r4 = function1.invoke((Object) h5.next());
            if (r4 != null) {
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "transform");
        while (h5.hasNext()) {
            R invoke = function1.invoke((Object) h5.next());
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public static final <T> T firstOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T firstOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        while (h5.hasNext()) {
            ?? r02 = (Object) h5.next();
            if (function1.invoke(r02).booleanValue()) {
                return r02;
            }
        }
        return null;
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, R> List<R> flatMap(Iterable<? extends T> iterable, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequence")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequenceTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapSequence")
    public static final <T, R> List<R> flatMapSequence(Iterable<? extends T> iterable, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(Iterable<? extends T> iterable, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.invoke(r4, it.next());
        }
        return r4;
    }

    public static final <T, R> R foldIndexed(Iterable<? extends T> iterable, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            r4 = operation.invoke(Integer.valueOf(i5), r4, t4);
            i5 = i6;
        }
        return r4;
    }

    public static final <T, R> R foldRight(List<? extends T> list, R r4, Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r4 = operation.invoke(listIterator.previous(), r4);
            }
        }
        return r4;
    }

    public static final <T, R> R foldRightIndexed(List<? extends T> list, R r4, Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r4 = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r4);
            }
        }
        return r4;
    }

    @HidesMembers
    public static final <T> void forEach(Iterable<? extends T> iterable, Function1<? super T, Unit> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "action");
        while (h5.hasNext()) {
            function1.invoke((Object) h5.next());
        }
    }

    public static final <T> void forEachIndexed(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i5), t4);
            i5 = i6;
        }
    }

    @InlineOnly
    private static final <T> T getOrElse(List<? extends T> list, int i5, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > CollectionsKt__CollectionsKt.getLastIndex(list)) ? defaultValue.invoke(Integer.valueOf(i5)) : list.get(i5);
    }

    public static final <T> T getOrNull(List<? extends T> list, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i5 < 0 || i5 > CollectionsKt__CollectionsKt.getLastIndex(list)) {
            return null;
        }
        return list.get(i5);
    }

    public static final <T, K> Map<K, List<T>> groupBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : iterable) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(t4);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(Iterable<? extends T> iterable, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : iterable) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : iterable) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(t4);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(Iterable<? extends T> iterable, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : iterable) {
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
    public static final <T, K> Grouping<T, K> groupingBy(final Iterable<? extends T> iterable, final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$groupingBy$1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t4) {
                return keySelector.invoke(t4);
            }

            @Override // kotlin.collections.Grouping
            public Iterator<T> sourceIterator() {
                return iterable.iterator();
            }
        };
    }

    public static final <T> int indexOf(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t4);
        }
        int i5 = 0;
        for (T t5 : iterable) {
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t4, t5)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final <T> int indexOf(List<? extends T> list, T t4) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t4);
    }

    public static final <T> int indexOfFirst(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        int i5 = 0;
        while (h5.hasNext()) {
            a1.d dVar = (Object) h5.next();
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(dVar).booleanValue()) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        int i5 = -1;
        int i6 = 0;
        while (h5.hasNext()) {
            a1.d dVar = (Object) h5.next();
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(dVar).booleanValue()) {
                i5 = i6;
            }
            i6++;
        }
        return i5;
    }

    public static final <T> int indexOfLast(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static final <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (T t4 : iterable) {
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

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(iterable, charSequence, charSequence5, charSequence6, i7, charSequence7, function1);
    }

    public static final <T> T last(Iterable<? extends T> iterable) {
        T next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T last(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        T t4 = null;
        boolean z4 = false;
        while (h5.hasNext()) {
            ?? r22 = (Object) h5.next();
            if (function1.invoke(r22).booleanValue()) {
                z4 = true;
                t4 = r22;
            }
        }
        if (z4) {
            return t4;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static <T> T last(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T last(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t4);
        }
        int i5 = -1;
        int i6 = 0;
        for (T t5 : iterable) {
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t4, t5)) {
                i5 = i6;
            }
            i6++;
        }
        return i5;
    }

    public static final <T> int lastIndexOf(List<? extends T> list, T t4) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t4);
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable) {
        T next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T lastOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        T t4 = null;
        while (h5.hasNext()) {
            ?? r12 = (Object) h5.next();
            if (function1.invoke(r12).booleanValue()) {
                t4 = r12;
            }
        }
        return t4;
    }

    public static final <T> T lastOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T lastOrNull(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (predicate.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    public static final <T, R> List<R> map(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            R invoke = transform.invoke(Integer.valueOf(i5), t4);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i5 = i6;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            R invoke = transform.invoke(Integer.valueOf(i5), t4);
            if (invoke != null) {
                destination.add(invoke);
            }
            i5 = i6;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(Iterable<? extends T> iterable, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i5 = 0;
        for (T t4 : iterable) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i5), t4));
            i5 = i6;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R invoke = transform.invoke(it.next());
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(Iterable<? extends T> iterable, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        ?? r02 = (Object) h5.next();
        if (!h5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) h5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (h5.hasNext());
        return (T) r02;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r02 = (Object) h5.next();
        if (!h5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) h5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (h5.hasNext());
        return (T) r02;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double maxOf(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = function1.invoke((Object) h5.next()).doubleValue();
        while (h5.hasNext()) {
            doubleValue = Math.max(doubleValue, function1.invoke((Object) h5.next()).doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m443maxOf(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = function1.invoke((Object) h5.next()).floatValue();
        while (h5.hasNext()) {
            floatValue = Math.max(floatValue, function1.invoke((Object) h5.next()).floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m444maxOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = function1.invoke((Object) h5.next());
        while (h5.hasNext()) {
            R invoke2 = function1.invoke((Object) h5.next());
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        R invoke = function1.invoke((Object) h5.next());
        while (h5.hasNext()) {
            R invoke2 = function1.invoke((Object) h5.next());
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
    private static final <T> Double m445maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        double doubleValue = function1.invoke((Object) h5.next()).doubleValue();
        while (h5.hasNext()) {
            doubleValue = Math.max(doubleValue, function1.invoke((Object) h5.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m446maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        float floatValue = function1.invoke((Object) h5.next()).floatValue();
        while (h5.hasNext()) {
            floatValue = Math.max(floatValue, function1.invoke((Object) h5.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final Double m447maxOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
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
    public static final Float m448maxOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
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
    public static final double maxOrThrow(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
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
    public static final float m449maxOrThrow(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
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
    public static final <T extends Comparable<? super T>> T m450maxOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T maxWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T, R extends Comparable<? super R>> T minByOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        ?? r02 = (Object) h5.next();
        if (!h5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) h5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (h5.hasNext());
        return (T) r02;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r02 = (Object) h5.next();
        if (!h5.hasNext()) {
            return r02;
        }
        R invoke = function1.invoke(r02);
        do {
            Object obj = (Object) h5.next();
            R invoke2 = function1.invoke(obj);
            r02 = r02;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                r02 = (T) obj;
            }
        } while (h5.hasNext());
        return (T) r02;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double minOf(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = function1.invoke((Object) h5.next()).doubleValue();
        while (h5.hasNext()) {
            doubleValue = Math.min(doubleValue, function1.invoke((Object) h5.next()).doubleValue());
        }
        return doubleValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m451minOf(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        float floatValue = function1.invoke((Object) h5.next()).floatValue();
        while (h5.hasNext()) {
            floatValue = Math.min(floatValue, function1.invoke((Object) h5.next()).floatValue());
        }
        return floatValue;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m452minOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            throw new NoSuchElementException();
        }
        R invoke = function1.invoke((Object) h5.next());
        while (h5.hasNext()) {
            R invoke2 = function1.invoke((Object) h5.next());
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        R invoke = function1.invoke((Object) h5.next());
        while (h5.hasNext()) {
            R invoke2 = function1.invoke((Object) h5.next());
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
    private static final <T> Double m453minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        double doubleValue = function1.invoke((Object) h5.next()).doubleValue();
        while (h5.hasNext()) {
            doubleValue = Math.min(doubleValue, function1.invoke((Object) h5.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m454minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        if (!h5.hasNext()) {
            return null;
        }
        float floatValue = function1.invoke((Object) h5.next()).floatValue();
        while (h5.hasNext()) {
            floatValue = Math.min(floatValue, function1.invoke((Object) h5.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T, R> R minOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    public static <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final Double m455minOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
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
    public static final Float m456minOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
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
    public static final double minOrThrow(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
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
    public static final float m457minOrThrow(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
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
    public static final <T extends Comparable<? super T>> T m458minOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T minWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T minWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
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

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection convertToSetForSetOperationWith = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(elements, iterable);
        if (convertToSetForSetOperationWith.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (!convertToSetForSetOperationWith.contains(t4)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        boolean z4 = false;
        for (T t5 : iterable) {
            boolean z5 = true;
            if (!z4 && Intrinsics.areEqual(t5, t4)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection convertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(elements);
        if (convertToSetForSetOperation.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (!convertToSetForSetOperation.contains(t4)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T[] elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return toList(iterable);
        }
        Collection convertToSetForSetOperation = BrittleContainsOptimizationKt.convertToSetForSetOperation(elements);
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (!convertToSetForSetOperation.contains(t4)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @InlineOnly
    private static final <T> List<T> minusElement(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return minus(iterable, t4);
    }

    public static final <T> boolean none(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static final <T> boolean none(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    public static final <T, C extends Iterable<? extends T>> C onEach(C c5, Function1<? super T, Unit> function1) {
        Iterator h5 = d.h(c5, "<this>", function1, "action");
        while (h5.hasNext()) {
            function1.invoke((Object) h5.next());
        }
        return c5;
    }

    @SinceKotlin(version = "1.4")
    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(C c5, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(c5, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i5 = 0;
        for (T t4 : c5) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i5), t4);
            i5 = i6;
        }
        return c5;
    }

    public static final <T> Pair<List<T>, List<T>> partition(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t4 : iterable) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            } else {
                arrayList2.add(t4);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Iterable) elements);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object) t4);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        arrayList.add(t4);
        return arrayList;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T[] elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object[]) elements);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t4) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t4);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, T[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    @InlineOnly
    private static final <T> List<T> plusElement(Iterable<? extends T> iterable, T t4) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return plus(iterable, t4);
    }

    @InlineOnly
    private static final <T> List<T> plusElement(Collection<? extends T> collection, T t4) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return plus((Collection) collection, (Object) t4);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T random(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return (T) random(collection, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final <T> T random(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <T> T randomOrNull(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return (T) randomOrNull(collection, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T randomOrNull(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <S, T extends S> S reduce(Iterable<? extends T> iterable, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(Iterable<? extends T> iterable, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i5 = 1;
        while (it.hasNext()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i5), next, it.next());
            i5 = i6;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> S reduceIndexedOrNull(Iterable<? extends T> iterable, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i5 = 1;
        while (it.hasNext()) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i5), next, it.next());
            i5 = i6;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> S reduceOrNull(Iterable<? extends T> iterable, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(List<? extends T> list, Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(listIterator.previous(), previous);
        }
        return previous;
    }

    public static final <S, T extends S> S reduceRightIndexed(List<? extends T> list, Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> S reduceRightIndexedOrNull(List<? extends T> list, Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), previous);
        }
        return previous;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> S reduceRightOrNull(List<? extends T> list, Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S previous = listIterator.previous();
        while (listIterator.hasPrevious()) {
            previous = operation.invoke(listIterator.previous(), previous);
        }
        return previous;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Iterable<T> requireNoNulls(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + FilenameUtils.EXTENSION_SEPARATOR);
            }
        }
        return iterable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> requireNoNulls(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + FilenameUtils.EXTENSION_SEPARATOR);
            }
        }
        return list;
    }

    public static final <T> List<T> reversed(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T, R> List<R> runningFold(Iterable<? extends T> iterable, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r4);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.invoke(r4, it.next());
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final <T, R> List<R> runningFoldIndexed(Iterable<? extends T> iterable, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r4);
        int i5 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, it.next());
            arrayList.add(r4);
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> List<S> runningReduce(Iterable<? extends T> iterable, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = operation.invoke(next, it.next());
        }
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> List<S> runningReduceIndexed(Iterable<? extends T> iterable, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i5 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i5), next, it.next());
            arrayList.add(next);
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> List<R> scan(Iterable<? extends T> iterable, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r4);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.invoke(r4, it.next());
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> List<R> scanIndexed(Iterable<? extends T> iterable, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault + 1);
        arrayList.add(r4);
        int i5 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, it.next());
            arrayList.add(r4);
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void shuffle(List<T> list, Random random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            list.set(nextInt, list.set(lastIndex, list.get(nextInt)));
        }
    }

    public static <T> T single(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T single(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        T t4 = null;
        boolean z4 = false;
        while (h5.hasNext()) {
            ?? r22 = (Object) h5.next();
            if (function1.invoke(r22).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z4 = true;
                t4 = r22;
            }
        }
        if (z4) {
            return t4;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> T single(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
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
    public static final <T> T singleOrNull(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "predicate");
        boolean z4 = false;
        T t4 = null;
        while (h5.hasNext()) {
            ?? r32 = (Object) h5.next();
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

    public static <T> T singleOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T> List<T> slice(List<? extends T> list, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    public static final <T> List<T> slice(List<? extends T> list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(List<T> list, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(List<T> list, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        CollectionsKt__MutableCollectionsJVMKt.sortWith(list, ComparisonsKt.reverseOrder());
    }

    public static <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        ArraysKt___ArraysJvmKt.sort(array);
        return ArraysKt___ArraysJvmKt.asList(array);
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iterable, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iterable, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return sortedWith(iterable, ComparisonsKt.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        ArraysKt___ArraysJvmKt.sortWith(array, comparator);
        return ArraysKt___ArraysJvmKt.asList(array);
    }

    public static final <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(Iterable<? extends T> iterable, Function1<? super T, Integer> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        int i5 = 0;
        while (h5.hasNext()) {
            i5 += function1.invoke((Object) h5.next()).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        double d5 = 0.0d;
        while (h5.hasNext()) {
            d5 += function1.invoke((Object) h5.next()).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().byteValue();
        }
        return i5;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
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
    private static final <T> double sumOfDouble(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        double d5 = 0.0d;
        while (h5.hasNext()) {
            d5 += function1.invoke((Object) h5.next()).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float f5 = 0.0f;
        while (it.hasNext()) {
            f5 += it.next().floatValue();
        }
        return f5;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
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
    private static final <T> int sumOfInt(Iterable<? extends T> iterable, Function1<? super T, Integer> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        int i5 = 0;
        while (h5.hasNext()) {
            i5 += function1.invoke((Object) h5.next()).intValue();
        }
        return i5;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
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
    private static final <T> long sumOfLong(Iterable<? extends T> iterable, Function1<? super T, Long> function1) {
        Iterator h5 = d.h(iterable, "<this>", function1, "selector");
        long j5 = 0;
        while (h5.hasNext()) {
            j5 += function1.invoke((Object) h5.next()).longValue();
        }
        return j5;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
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
    private static final <T> int sumOfUInt(Iterable<? extends T> iterable, Function1<? super T, UInt> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        Iterator<? extends T> it = iterable.iterator();
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
    private static final <T> long sumOfULong(Iterable<? extends T> iterable, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(it.next()).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    public static final <T> List<T> take(Iterable<? extends T> iterable, int i5) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i6 = 0;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i5 >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i5 == 1) {
                return CollectionsKt__CollectionsJVMKt.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i5);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static final <T> List<T> takeLast(List<? extends T> list, int i5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int size = list.size();
        if (i5 >= size) {
            return toList(list);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(last((List) list));
        }
        ArrayList arrayList = new ArrayList(i5);
        if (list instanceof RandomAccess) {
            for (int i6 = size - i5; i6 < size; i6++) {
                arrayList.add(list.get(i6));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i5);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(List<? extends T> list, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return toList(list);
    }

    public static final <T> List<T> takeWhile(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : iterable) {
            if (!predicate.invoke(t4).booleanValue()) {
                break;
            }
            arrayList.add(t4);
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            zArr[i5] = it.next().booleanValue();
            i5++;
        }
        return zArr;
    }

    public static final byte[] toByteArray(Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            bArr[i5] = it.next().byteValue();
            i5++;
        }
        return bArr;
    }

    public static final char[] toCharArray(Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            cArr[i5] = it.next().charValue();
            i5++;
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final double[] toDoubleArray(Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            dArr[i5] = it.next().doubleValue();
            i5++;
        }
        return dArr;
    }

    public static final float[] toFloatArray(Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            fArr[i5] = it.next().floatValue();
            i5++;
        }
        return fArr;
    }

    public static final <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) toCollection(iterable, new HashSet(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 12))));
    }

    public static int[] toIntArray(Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = it.next().intValue();
            i5++;
        }
        return iArr;
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (size != 1) {
            return toMutableList(collection);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final long[] toLongArray(Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            jArr[i5] = it.next().longValue();
            i5++;
        }
        return jArr;
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? toMutableList((Collection) iterable) : (List) toCollection(iterable, new ArrayList());
    }

    public static <T> List<T> toMutableList(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return SetsKt__SetsKt.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return SetsKt__SetsKt.emptySet();
        }
        if (size != 1) {
            return (Set) toCollection(iterable, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(collection.size())));
        }
        return SetsKt__SetsJVMKt.setOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final short[] toShortArray(Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            sArr[i5] = it.next().shortValue();
            i5++;
        }
        return sArr;
    }

    public static final <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @SinceKotlin(version = "1.2")
    public static final <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i5, int i6, boolean z4) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        SlidingWindowKt.checkWindowSizeStep(i5, i6);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator windowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i5, i6, z4, false);
            while (windowedIterator.hasNext()) {
                arrayList.add((List) windowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i6) + (size % i6 == 0 ? 0 : 1));
        int i7 = 0;
        while (true) {
            if (!(i7 >= 0 && i7 < size) || ((coerceAtMost = RangesKt.coerceAtMost(i5, size - i7)) < i5 && !z4)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(coerceAtMost);
            for (int i8 = 0; i8 < coerceAtMost; i8++) {
                arrayList3.add(list.get(i8 + i7));
            }
            arrayList2.add(arrayList3);
            i7 += i6;
        }
        return arrayList2;
    }

    @SinceKotlin(version = "1.2")
    public static final <T, R> List<R> windowed(Iterable<? extends T> iterable, int i5, int i6, boolean z4, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i5, i6);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator windowedIterator = SlidingWindowKt.windowedIterator(iterable.iterator(), i5, i6, z4, true);
            while (windowedIterator.hasNext()) {
                arrayList.add(transform.invoke((List) windowedIterator.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i6) + (size % i6 == 0 ? 0 : 1));
        MovingSubList movingSubList = new MovingSubList(list);
        int i7 = 0;
        while (true) {
            if (!(i7 >= 0 && i7 < size)) {
                break;
            }
            int coerceAtMost = RangesKt.coerceAtMost(i5, size - i7);
            if (!z4 && coerceAtMost < i5) {
                break;
            }
            movingSubList.move(i7, coerceAtMost + i7);
            arrayList2.add(transform.invoke(movingSubList));
            i7 += i6;
        }
        return arrayList2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowed(iterable, i5, i6, z4);
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i5, int i6, boolean z4, Function1 function1, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 1;
        }
        if ((i7 & 4) != 0) {
            z4 = false;
        }
        return windowed(iterable, i5, i6, z4, function1);
    }

    public static final <T> Iterable<IndexedValue<T>> withIndex(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends T>>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<T> invoke() {
                return iterable.iterator();
            }
        });
    }

    public static <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(TuplesKt.to(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, Iterable<? extends R> other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, R[] other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i5 = 0;
        for (T t4 : iterable) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(t4, other[i5]));
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, R[] other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i5 = 0;
        for (T t4 : iterable) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t4, other[i5]));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    public static final <T> List<Pair<T, T>> zipWithNext(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(TuplesKt.to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.2")
    public static final <T, R> List<R> zipWithNext(Iterable<? extends T> iterable, Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        a1.d next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }
}
