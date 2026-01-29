package kotlin.collections;

import a1.c;
import androidx.activity.d;
import androidx.appcompat.widget.a;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes20.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final boolean all(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (!predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean all(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean all(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final boolean any(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final boolean any(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final boolean any(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final boolean any(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean any(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final boolean any(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean any(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final boolean any(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> boolean any(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T> boolean any(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean any(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final boolean any(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean any(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final boolean any(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final Iterable<Byte> asIterable(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(bArr);
    }

    public static final Iterable<Character> asIterable(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(cArr);
    }

    public static final Iterable<Double> asIterable(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
    }

    public static final Iterable<Float> asIterable(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
    }

    public static final Iterable<Integer> asIterable(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
    }

    public static final Iterable<Long> asIterable(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
    }

    public static final <T> Iterable<T> asIterable(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    public static final Iterable<Short> asIterable(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(sArr);
    }

    public static final Iterable<Boolean> asIterable(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(zArr);
    }

    public static final Sequence<Byte> asSequence(final byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Byte>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            public Iterator<Byte> iterator() {
                return ArrayIteratorsKt.iterator(bArr);
            }
        };
    }

    public static final Sequence<Character> asSequence(final char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return ArrayIteratorsKt.iterator(cArr);
            }
        };
    }

    public static final Sequence<Double> asSequence(final double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Double>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7
            @Override // kotlin.sequences.Sequence
            public Iterator<Double> iterator() {
                return ArrayIteratorsKt.iterator(dArr);
            }
        };
    }

    public static final Sequence<Float> asSequence(final float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Float>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6
            @Override // kotlin.sequences.Sequence
            public Iterator<Float> iterator() {
                return ArrayIteratorsKt.iterator(fArr);
            }
        };
    }

    public static final Sequence<Integer> asSequence(final int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public Iterator<Integer> iterator() {
                return ArrayIteratorsKt.iterator(iArr);
            }
        };
    }

    public static final Sequence<Long> asSequence(final long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Long>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5
            @Override // kotlin.sequences.Sequence
            public Iterator<Long> iterator() {
                return ArrayIteratorsKt.iterator(jArr);
            }
        };
    }

    public static <T> Sequence<T> asSequence(final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    public static final Sequence<Short> asSequence(final short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Short>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            public Iterator<Short> iterator() {
                return ArrayIteratorsKt.iterator(sArr);
            }
        };
    }

    public static final Sequence<Boolean> asSequence(final boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Boolean>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8
            @Override // kotlin.sequences.Sequence
            public Iterator<Boolean> iterator() {
                return ArrayIteratorsKt.iterator(zArr);
            }
        };
    }

    public static final <K, V> Map<K, V> associate(byte[] bArr, Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b5 : bArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Byte.valueOf(b5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(char[] cArr, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(cArr.length), 16));
        for (char c5 : cArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(c5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(double[] dArr, Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d5 : dArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Double.valueOf(d5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(float[] fArr, Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f5 : fArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Float.valueOf(f5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(int[] iArr, Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i5 : iArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Integer.valueOf(i5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(long[] jArr, Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j5 : jArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Long.valueOf(j5));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(T[] tArr, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(tArr.length), 16));
        for (c cVar : tArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(cVar);
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(short[] sArr, Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Short.valueOf(s4));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associate(boolean[] zArr, Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z4 : zArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Boolean.valueOf(z4));
            linkedHashMap.put(invoke.getFirst(), invoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Byte> associateBy(byte[] bArr, Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b5 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b5)), Byte.valueOf(b5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(byte[] bArr, Function1<? super Byte, ? extends K> keySelector, Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b5 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b5)), valueTransform.invoke(Byte.valueOf(b5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Character> associateBy(char[] cArr, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(cArr.length), 16));
        for (char c5 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c5)), Character.valueOf(c5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(char[] cArr, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(cArr.length), 16));
        for (char c5 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c5)), valueTransform.invoke(Character.valueOf(c5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Double> associateBy(double[] dArr, Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d5 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d5)), Double.valueOf(d5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(double[] dArr, Function1<? super Double, ? extends K> keySelector, Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d5 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d5)), valueTransform.invoke(Double.valueOf(d5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Float> associateBy(float[] fArr, Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f5 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f5)), Float.valueOf(f5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(float[] fArr, Function1<? super Float, ? extends K> keySelector, Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f5 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f5)), valueTransform.invoke(Float.valueOf(f5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Integer> associateBy(int[] iArr, Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i5 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i5)), Integer.valueOf(i5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(int[] iArr, Function1<? super Integer, ? extends K> keySelector, Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i5 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i5)), valueTransform.invoke(Integer.valueOf(i5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Long> associateBy(long[] jArr, Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j5 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j5)), Long.valueOf(j5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(long[] jArr, Function1<? super Long, ? extends K> keySelector, Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j5 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j5)), valueTransform.invoke(Long.valueOf(j5)));
        }
        return linkedHashMap;
    }

    public static final <T, K> Map<K, T> associateBy(T[] tArr, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(tArr.length), 16));
        for (T t4 : tArr) {
            linkedHashMap.put(keySelector.invoke(t4), t4);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, V> associateBy(T[] tArr, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(tArr.length), 16));
        for (T t4 : tArr) {
            linkedHashMap.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Short> associateBy(short[] sArr, Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(short[] sArr, Function1<? super Short, ? extends K> keySelector, Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s4)), valueTransform.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, Boolean> associateBy(boolean[] zArr, Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z4 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z4)), Boolean.valueOf(z4));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> associateBy(boolean[] zArr, Function1<? super Boolean, ? extends K> keySelector, Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z4 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z4)), valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(byte[] bArr, M destination, Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b5 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b5)), Byte.valueOf(b5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(byte[] bArr, M destination, Function1<? super Byte, ? extends K> keySelector, Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b5 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b5)), valueTransform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(char[] cArr, M destination, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c5 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c5)), Character.valueOf(c5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(char[] cArr, M destination, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c5 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c5)), valueTransform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(double[] dArr, M destination, Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d5 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d5)), Double.valueOf(d5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(double[] dArr, M destination, Function1<? super Double, ? extends K> keySelector, Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d5 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d5)), valueTransform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(float[] fArr, M destination, Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f5 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f5)), Float.valueOf(f5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(float[] fArr, M destination, Function1<? super Float, ? extends K> keySelector, Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f5 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f5)), valueTransform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(int[] iArr, M destination, Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i5 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i5)), Integer.valueOf(i5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(int[] iArr, M destination, Function1<? super Integer, ? extends K> keySelector, Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i5 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i5)), valueTransform.invoke(Integer.valueOf(i5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(long[] jArr, M destination, Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j5 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j5)), Long.valueOf(j5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(long[] jArr, M destination, Function1<? super Long, ? extends K> keySelector, Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j5 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j5)), valueTransform.invoke(Long.valueOf(j5)));
        }
        return destination;
    }

    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(T[] tArr, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : tArr) {
            destination.put(keySelector.invoke(t4), t4);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(T[] tArr, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : tArr) {
            destination.put(keySelector.invoke(t4), valueTransform.invoke(t4));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(short[] sArr, M destination, Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s4 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s4)), Short.valueOf(s4));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(short[] sArr, M destination, Function1<? super Short, ? extends K> keySelector, Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s4)), valueTransform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z4 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z4)), Boolean.valueOf(z4));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends K> keySelector, Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z4 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z4)), valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(byte[] bArr, M destination, Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b5 : bArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Byte.valueOf(b5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(char[] cArr, M destination, Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c5 : cArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Character.valueOf(c5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(double[] dArr, M destination, Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d5 : dArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Double.valueOf(d5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(float[] fArr, M destination, Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f5 : fArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Float.valueOf(f5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(int[] iArr, M destination, Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 : iArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Integer.valueOf(i5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(long[] jArr, M destination, Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j5 : jArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Long.valueOf(j5));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(T[] tArr, M destination, Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(t4);
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(short[] sArr, M destination, Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Short.valueOf(s4));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z4 : zArr) {
            Pair<? extends K, ? extends V> invoke = transform.invoke(Boolean.valueOf(z4));
            destination.put(invoke.getFirst(), invoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Byte, V> associateWith(byte[] bArr, Function1<? super Byte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b5 : bArr) {
            linkedHashMap.put(Byte.valueOf(b5), valueSelector.invoke(Byte.valueOf(b5)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Character, V> associateWith(char[] cArr, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(RangesKt.coerceAtMost(cArr.length, 128)), 16));
        for (char c5 : cArr) {
            linkedHashMap.put(Character.valueOf(c5), valueSelector.invoke(Character.valueOf(c5)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Double, V> associateWith(double[] dArr, Function1<? super Double, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d5 : dArr) {
            linkedHashMap.put(Double.valueOf(d5), valueSelector.invoke(Double.valueOf(d5)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Float, V> associateWith(float[] fArr, Function1<? super Float, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f5 : fArr) {
            linkedHashMap.put(Float.valueOf(f5), valueSelector.invoke(Float.valueOf(f5)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Integer, V> associateWith(int[] iArr, Function1<? super Integer, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i5 : iArr) {
            linkedHashMap.put(Integer.valueOf(i5), valueSelector.invoke(Integer.valueOf(i5)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Long, V> associateWith(long[] jArr, Function1<? super Long, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j5 : jArr) {
            linkedHashMap.put(Long.valueOf(j5), valueSelector.invoke(Long.valueOf(j5)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    public static final <K, V> Map<K, V> associateWith(K[] kArr, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(kArr.length), 16));
        for (K k5 : kArr) {
            linkedHashMap.put(k5, valueSelector.invoke(k5));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Short, V> associateWith(short[] sArr, Function1<? super Short, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s4 : sArr) {
            linkedHashMap.put(Short.valueOf(s4), valueSelector.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> Map<Boolean, V> associateWith(boolean[] zArr, Function1<? super Boolean, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z4 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z4), valueSelector.invoke(Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Byte, ? super V>> M associateWithTo(byte[] bArr, M destination, Function1<? super Byte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (byte b5 : bArr) {
            destination.put(Byte.valueOf(b5), valueSelector.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(char[] cArr, M destination, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (char c5 : cArr) {
            destination.put(Character.valueOf(c5), valueSelector.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Double, ? super V>> M associateWithTo(double[] dArr, M destination, Function1<? super Double, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (double d5 : dArr) {
            destination.put(Double.valueOf(d5), valueSelector.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Float, ? super V>> M associateWithTo(float[] fArr, M destination, Function1<? super Float, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (float f5 : fArr) {
            destination.put(Float.valueOf(f5), valueSelector.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Integer, ? super V>> M associateWithTo(int[] iArr, M destination, Function1<? super Integer, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i5 : iArr) {
            destination.put(Integer.valueOf(i5), valueSelector.invoke(Integer.valueOf(i5)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Long, ? super V>> M associateWithTo(long[] jArr, M destination, Function1<? super Long, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (long j5 : jArr) {
            destination.put(Long.valueOf(j5), valueSelector.invoke(Long.valueOf(j5)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(K[] kArr, M destination, Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k5 : kArr) {
            destination.put(k5, valueSelector.invoke(k5));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Short, ? super V>> M associateWithTo(short[] sArr, M destination, Function1<? super Short, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (short s4 : sArr) {
            destination.put(Short.valueOf(s4), valueSelector.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V, M extends Map<? super Boolean, ? super V>> M associateWithTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (boolean z4 : zArr) {
            destination.put(Boolean.valueOf(z4), valueSelector.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    public static final double average(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (byte b5 : bArr) {
            d5 += b5;
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    public static final double average(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (double d6 : dArr) {
            d5 += d6;
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    public static final double average(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (float f5 : fArr) {
            d5 += f5;
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    public static final double average(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (int i6 : iArr) {
            d5 += i6;
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    public static final double average(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (long j5 : jArr) {
            d5 += j5;
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    public static final double average(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (short s4 : sArr) {
            d5 += s4;
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (Byte b5 : bArr) {
            d5 += b5.byteValue();
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (Double d6 : dArr) {
            d5 += d6.doubleValue();
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (Float f5 : fArr) {
            d5 += f5.floatValue();
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (Integer num : numArr) {
            d5 += num.intValue();
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (Long l5 : lArr) {
            d5 += l5.longValue();
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        double d5 = 0.0d;
        int i5 = 0;
        for (Short sh : shArr) {
            d5 += sh.shortValue();
            i5++;
        }
        if (i5 == 0) {
            return Double.NaN;
        }
        return d5 / i5;
    }

    @InlineOnly
    private static final byte component1(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[0];
    }

    @InlineOnly
    private static final char component1(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[0];
    }

    @InlineOnly
    private static final double component1(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[0];
    }

    @InlineOnly
    private static final float component1(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[0];
    }

    @InlineOnly
    private static final int component1(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[0];
    }

    @InlineOnly
    private static final long component1(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[0];
    }

    @InlineOnly
    private static final <T> T component1(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[0];
    }

    @InlineOnly
    private static final short component1(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[0];
    }

    @InlineOnly
    private static final boolean component1(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[0];
    }

    @InlineOnly
    private static final byte component2(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[1];
    }

    @InlineOnly
    private static final char component2(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[1];
    }

    @InlineOnly
    private static final double component2(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[1];
    }

    @InlineOnly
    private static final float component2(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[1];
    }

    @InlineOnly
    private static final int component2(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[1];
    }

    @InlineOnly
    private static final long component2(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[1];
    }

    @InlineOnly
    private static final <T> T component2(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[1];
    }

    @InlineOnly
    private static final short component2(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[1];
    }

    @InlineOnly
    private static final boolean component2(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[1];
    }

    @InlineOnly
    private static final byte component3(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[2];
    }

    @InlineOnly
    private static final char component3(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[2];
    }

    @InlineOnly
    private static final double component3(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[2];
    }

    @InlineOnly
    private static final float component3(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[2];
    }

    @InlineOnly
    private static final int component3(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[2];
    }

    @InlineOnly
    private static final long component3(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[2];
    }

    @InlineOnly
    private static final <T> T component3(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[2];
    }

    @InlineOnly
    private static final short component3(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[2];
    }

    @InlineOnly
    private static final boolean component3(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[2];
    }

    @InlineOnly
    private static final byte component4(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[3];
    }

    @InlineOnly
    private static final char component4(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[3];
    }

    @InlineOnly
    private static final double component4(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[3];
    }

    @InlineOnly
    private static final float component4(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[3];
    }

    @InlineOnly
    private static final int component4(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[3];
    }

    @InlineOnly
    private static final long component4(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[3];
    }

    @InlineOnly
    private static final <T> T component4(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[3];
    }

    @InlineOnly
    private static final short component4(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[3];
    }

    @InlineOnly
    private static final boolean component4(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[3];
    }

    @InlineOnly
    private static final byte component5(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[4];
    }

    @InlineOnly
    private static final char component5(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[4];
    }

    @InlineOnly
    private static final double component5(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[4];
    }

    @InlineOnly
    private static final float component5(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[4];
    }

    @InlineOnly
    private static final int component5(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[4];
    }

    @InlineOnly
    private static final long component5(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[4];
    }

    @InlineOnly
    private static final <T> T component5(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[4];
    }

    @InlineOnly
    private static final short component5(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[4];
    }

    @InlineOnly
    private static final boolean component5(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[4];
    }

    public static boolean contains(byte[] bArr, byte b5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return indexOf(bArr, b5) >= 0;
    }

    public static boolean contains(char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c5) >= 0;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        for (double d6 : dArr) {
            if (d6 == d5) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "any { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        for (float f6 : fArr) {
            if (f6 == f5) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return indexOf(iArr, i5) >= 0;
    }

    public static boolean contains(long[] jArr, long j5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return indexOf(jArr, j5) >= 0;
    }

    public static <T> boolean contains(T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t4) >= 0;
    }

    public static boolean contains(short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return indexOf(sArr, s4) >= 0;
    }

    public static final boolean contains(boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z4) >= 0;
    }

    @InlineOnly
    private static final int count(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    public static final int count(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    public static final int count(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    public static final int count(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    public static final int count(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    public static final int count(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (int i6 : iArr) {
            if (predicate.invoke(Integer.valueOf(i6)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    public static final int count(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final <T> int count(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length;
    }

    public static final <T> int count(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    public static final int count(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @InlineOnly
    private static final int count(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    public static final int count(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i5 = 0;
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    public static final List<Byte> distinct(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(bArr));
    }

    public static final List<Character> distinct(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(cArr));
    }

    public static final List<Double> distinct(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(dArr));
    }

    public static final List<Float> distinct(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(fArr));
    }

    public static final List<Integer> distinct(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(iArr));
    }

    public static final List<Long> distinct(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(jArr));
    }

    public static final <T> List<T> distinct(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(tArr));
    }

    public static final List<Short> distinct(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(sArr));
    }

    public static final List<Boolean> distinct(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(zArr));
    }

    public static final <K> List<Byte> distinctBy(byte[] bArr, Function1<? super Byte, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b5)))) {
                arrayList.add(Byte.valueOf(b5));
            }
        }
        return arrayList;
    }

    public static final <K> List<Character> distinctBy(char[] cArr, Function1<? super Character, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c5)))) {
                arrayList.add(Character.valueOf(c5));
            }
        }
        return arrayList;
    }

    public static final <K> List<Double> distinctBy(double[] dArr, Function1<? super Double, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d5)))) {
                arrayList.add(Double.valueOf(d5));
            }
        }
        return arrayList;
    }

    public static final <K> List<Float> distinctBy(float[] fArr, Function1<? super Float, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f5)))) {
                arrayList.add(Float.valueOf(f5));
            }
        }
        return arrayList;
    }

    public static final <K> List<Integer> distinctBy(int[] iArr, Function1<? super Integer, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i5)))) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        return arrayList;
    }

    public static final <K> List<Long> distinctBy(long[] jArr, Function1<? super Long, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j5 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j5)))) {
                arrayList.add(Long.valueOf(j5));
            }
        }
        return arrayList;
    }

    public static final <T, K> List<T> distinctBy(T[] tArr, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (hashSet.add(selector.invoke(t4))) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final <K> List<Short> distinctBy(short[] sArr, Function1<? super Short, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s4)))) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    public static final <K> List<Boolean> distinctBy(boolean[] zArr, Function1<? super Boolean, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z4)))) {
                arrayList.add(Boolean.valueOf(z4));
            }
        }
        return arrayList;
    }

    public static final List<Byte> drop(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i5 >= 0) {
            return takeLast(bArr, RangesKt.coerceAtLeast(bArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Character> drop(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i5 >= 0) {
            return takeLast(cArr, RangesKt.coerceAtLeast(cArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Double> drop(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i5 >= 0) {
            return takeLast(dArr, RangesKt.coerceAtLeast(dArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Float> drop(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i5 >= 0) {
            return takeLast(fArr, RangesKt.coerceAtLeast(fArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Integer> drop(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i5 >= 0) {
            return takeLast(iArr, RangesKt.coerceAtLeast(iArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Long> drop(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i5 >= 0) {
            return takeLast(jArr, RangesKt.coerceAtLeast(jArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final <T> List<T> drop(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i5 >= 0) {
            return takeLast(tArr, RangesKt.coerceAtLeast(tArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Short> drop(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i5 >= 0) {
            return takeLast(sArr, RangesKt.coerceAtLeast(sArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Boolean> drop(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i5 >= 0) {
            return takeLast(zArr, RangesKt.coerceAtLeast(zArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Byte> dropLast(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i5 >= 0) {
            return take(bArr, RangesKt.coerceAtLeast(bArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Character> dropLast(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i5 >= 0) {
            return take(cArr, RangesKt.coerceAtLeast(cArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Double> dropLast(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i5 >= 0) {
            return take(dArr, RangesKt.coerceAtLeast(dArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Float> dropLast(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i5 >= 0) {
            return take(fArr, RangesKt.coerceAtLeast(fArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Integer> dropLast(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i5 >= 0) {
            return take(iArr, RangesKt.coerceAtLeast(iArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Long> dropLast(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i5 >= 0) {
            return take(jArr, RangesKt.coerceAtLeast(jArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final <T> List<T> dropLast(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i5 >= 0) {
            return take(tArr, RangesKt.coerceAtLeast(tArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Short> dropLast(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i5 >= 0) {
            return take(sArr, RangesKt.coerceAtLeast(sArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Boolean> dropLast(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i5 >= 0) {
            return take(zArr, RangesKt.coerceAtLeast(zArr.length - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    public static final List<Byte> dropLastWhile(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Character> dropLastWhile(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Double> dropLastWhile(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Float> dropLastWhile(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Integer> dropLastWhile(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Long> dropLastWhile(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <T> List<T> dropLastWhile(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Short> dropLastWhile(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Boolean> dropLastWhile(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Byte> dropWhile(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (byte b5 : bArr) {
            if (z4) {
                arrayList.add(Byte.valueOf(b5));
            } else if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Character> dropWhile(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (char c5 : cArr) {
            if (z4) {
                arrayList.add(Character.valueOf(c5));
            } else if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Double> dropWhile(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (double d5 : dArr) {
            if (z4) {
                arrayList.add(Double.valueOf(d5));
            } else if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Float> dropWhile(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (float f5 : fArr) {
            if (z4) {
                arrayList.add(Float.valueOf(f5));
            } else if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Integer> dropWhile(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (int i5 : iArr) {
            if (z4) {
                arrayList.add(Integer.valueOf(i5));
            } else if (!predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                arrayList.add(Integer.valueOf(i5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Long> dropWhile(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (long j5 : jArr) {
            if (z4) {
                arrayList.add(Long.valueOf(j5));
            } else if (!predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                arrayList.add(Long.valueOf(j5));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> dropWhile(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (T t4 : tArr) {
            if (z4) {
                arrayList.add(t4);
            } else if (!predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Short> dropWhile(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (short s4 : sArr) {
            if (z4) {
                arrayList.add(Short.valueOf(s4));
            } else if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
                z4 = true;
            }
        }
        return arrayList;
    }

    public static final List<Boolean> dropWhile(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (boolean z5 : zArr) {
            if (z4) {
                arrayList.add(Boolean.valueOf(z5));
            } else if (!predicate.invoke(Boolean.valueOf(z5)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z5));
                z4 = true;
            }
        }
        return arrayList;
    }

    @InlineOnly
    private static final byte elementAtOrElse(byte[] bArr, int i5, Function1<? super Integer, Byte> defaultValue) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(bArr)) ? defaultValue.invoke(Integer.valueOf(i5)).byteValue() : bArr[i5];
    }

    @InlineOnly
    private static final char elementAtOrElse(char[] cArr, int i5, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(cArr)) ? defaultValue.invoke(Integer.valueOf(i5)).charValue() : cArr[i5];
    }

    @InlineOnly
    private static final double elementAtOrElse(double[] dArr, int i5, Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(dArr)) ? defaultValue.invoke(Integer.valueOf(i5)).doubleValue() : dArr[i5];
    }

    @InlineOnly
    private static final float elementAtOrElse(float[] fArr, int i5, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(fArr)) ? defaultValue.invoke(Integer.valueOf(i5)).floatValue() : fArr[i5];
    }

    @InlineOnly
    private static final int elementAtOrElse(int[] iArr, int i5, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(iArr)) ? defaultValue.invoke(Integer.valueOf(i5)).intValue() : iArr[i5];
    }

    @InlineOnly
    private static final long elementAtOrElse(long[] jArr, int i5, Function1<? super Integer, Long> defaultValue) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(jArr)) ? defaultValue.invoke(Integer.valueOf(i5)).longValue() : jArr[i5];
    }

    @InlineOnly
    private static final <T> T elementAtOrElse(T[] tArr, int i5, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(tArr)) ? defaultValue.invoke(Integer.valueOf(i5)) : tArr[i5];
    }

    @InlineOnly
    private static final short elementAtOrElse(short[] sArr, int i5, Function1<? super Integer, Short> defaultValue) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(sArr)) ? defaultValue.invoke(Integer.valueOf(i5)).shortValue() : sArr[i5];
    }

    @InlineOnly
    private static final boolean elementAtOrElse(boolean[] zArr, int i5, Function1<? super Integer, Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(zArr)) ? defaultValue.invoke(Integer.valueOf(i5)).booleanValue() : zArr[i5];
    }

    @InlineOnly
    private static final Boolean elementAtOrNull(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return getOrNull(zArr, i5);
    }

    @InlineOnly
    private static final Byte elementAtOrNull(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return getOrNull(bArr, i5);
    }

    @InlineOnly
    private static final Character elementAtOrNull(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return getOrNull(cArr, i5);
    }

    @InlineOnly
    private static final Double elementAtOrNull(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return getOrNull(dArr, i5);
    }

    @InlineOnly
    private static final Float elementAtOrNull(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return getOrNull(fArr, i5);
    }

    @InlineOnly
    private static final Integer elementAtOrNull(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return getOrNull(iArr, i5);
    }

    @InlineOnly
    private static final Long elementAtOrNull(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return getOrNull(jArr, i5);
    }

    @InlineOnly
    private static final <T> T elementAtOrNull(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) getOrNull(tArr, i5);
    }

    @InlineOnly
    private static final Short elementAtOrNull(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return getOrNull(sArr, i5);
    }

    public static final List<Byte> filter(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            }
        }
        return arrayList;
    }

    public static final List<Character> filter(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            }
        }
        return arrayList;
    }

    public static final List<Double> filter(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            }
        }
        return arrayList;
    }

    public static final List<Float> filter(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            }
        }
        return arrayList;
    }

    public static final List<Integer> filter(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        return arrayList;
    }

    public static final List<Long> filter(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                arrayList.add(Long.valueOf(j5));
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filter(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final List<Short> filter(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    public static final List<Boolean> filter(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            }
        }
        return arrayList;
    }

    public static final List<Byte> filterIndexed(byte[] bArr, Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            byte b5 = bArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final List<Character> filterIndexed(char[] cArr, Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            char c5 = cArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final List<Double> filterIndexed(double[] dArr, Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            double d5 = dArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final List<Float> filterIndexed(float[] fArr, Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            float f5 = fArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final List<Integer> filterIndexed(int[] iArr, Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            int i8 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Integer.valueOf(i7)).booleanValue()) {
                arrayList.add(Integer.valueOf(i7));
            }
            i5++;
            i6 = i8;
        }
        return arrayList;
    }

    public static final List<Long> filterIndexed(long[] jArr, Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            long j5 = jArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Long.valueOf(j5)).booleanValue()) {
                arrayList.add(Long.valueOf(j5));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(T[] tArr, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            T t4 = tArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), t4).booleanValue()) {
                arrayList.add(t4);
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final List<Short> filterIndexed(short[] sArr, Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            short s4 = sArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final List<Boolean> filterIndexed(boolean[] zArr, Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            boolean z4 = zArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final <C extends Collection<? super Byte>> C filterIndexedTo(byte[] bArr, C destination, Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            byte b5 = bArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Byte.valueOf(b5)).booleanValue()) {
                destination.add(Byte.valueOf(b5));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <C extends Collection<? super Character>> C filterIndexedTo(char[] cArr, C destination, Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            char c5 = cArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Character.valueOf(c5)).booleanValue()) {
                destination.add(Character.valueOf(c5));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <C extends Collection<? super Double>> C filterIndexedTo(double[] dArr, C destination, Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            double d5 = dArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Double.valueOf(d5)).booleanValue()) {
                destination.add(Double.valueOf(d5));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <C extends Collection<? super Float>> C filterIndexedTo(float[] fArr, C destination, Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            float f5 = fArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Float.valueOf(f5)).booleanValue()) {
                destination.add(Float.valueOf(f5));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <C extends Collection<? super Integer>> C filterIndexedTo(int[] iArr, C destination, Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            int i8 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Integer.valueOf(i7)).booleanValue()) {
                destination.add(Integer.valueOf(i7));
            }
            i5++;
            i6 = i8;
        }
        return destination;
    }

    public static final <C extends Collection<? super Long>> C filterIndexedTo(long[] jArr, C destination, Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            long j5 = jArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Long.valueOf(j5)).booleanValue()) {
                destination.add(Long.valueOf(j5));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(T[] tArr, C destination, Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            T t4 = tArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), t4).booleanValue()) {
                destination.add(t4);
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <C extends Collection<? super Short>> C filterIndexedTo(short[] sArr, C destination, Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            short s4 = sArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(boolean[] zArr, C destination, Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            boolean z4 = zArr[i5];
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), Boolean.valueOf(z4)).booleanValue()) {
                destination.add(Boolean.valueOf(z4));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final List<Byte> filterNot(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                arrayList.add(Byte.valueOf(b5));
            }
        }
        return arrayList;
    }

    public static final List<Character> filterNot(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                arrayList.add(Character.valueOf(c5));
            }
        }
        return arrayList;
    }

    public static final List<Double> filterNot(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                arrayList.add(Double.valueOf(d5));
            }
        }
        return arrayList;
    }

    public static final List<Float> filterNot(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                arrayList.add(Float.valueOf(f5));
            }
        }
        return arrayList;
    }

    public static final List<Integer> filterNot(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        return arrayList;
    }

    public static final List<Long> filterNot(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j5 : jArr) {
            if (!predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                arrayList.add(Long.valueOf(j5));
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterNot(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static final List<Short> filterNot(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                arrayList.add(Short.valueOf(s4));
            }
        }
        return arrayList;
    }

    public static final List<Boolean> filterNot(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z4));
            }
        }
        return arrayList;
    }

    public static <T> List<T> filterNotNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t4 : tArr) {
            if (t4 != null) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Byte>> C filterNotTo(byte[] bArr, C destination, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                destination.add(Byte.valueOf(b5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Character>> C filterNotTo(char[] cArr, C destination, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                destination.add(Character.valueOf(c5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Double>> C filterNotTo(double[] dArr, C destination, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                destination.add(Double.valueOf(d5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Float>> C filterNotTo(float[] fArr, C destination, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                destination.add(Float.valueOf(f5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Integer>> C filterNotTo(int[] iArr, C destination, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                destination.add(Integer.valueOf(i5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Long>> C filterNotTo(long[] jArr, C destination, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (!predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                destination.add(Long.valueOf(j5));
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(T[] tArr, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Short>> C filterNotTo(short[] sArr, C destination, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Boolean>> C filterNotTo(boolean[] zArr, C destination, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                destination.add(Boolean.valueOf(z4));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Byte>> C filterTo(byte[] bArr, C destination, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                destination.add(Byte.valueOf(b5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Character>> C filterTo(char[] cArr, C destination, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                destination.add(Character.valueOf(c5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Double>> C filterTo(double[] dArr, C destination, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                destination.add(Double.valueOf(d5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Float>> C filterTo(float[] fArr, C destination, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                destination.add(Float.valueOf(f5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Integer>> C filterTo(int[] iArr, C destination, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                destination.add(Integer.valueOf(i5));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Long>> C filterTo(long[] jArr, C destination, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                destination.add(Long.valueOf(j5));
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(T[] tArr, C destination, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                destination.add(t4);
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Short>> C filterTo(short[] sArr, C destination, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                destination.add(Short.valueOf(s4));
            }
        }
        return destination;
    }

    public static final <C extends Collection<? super Boolean>> C filterTo(boolean[] zArr, C destination, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                destination.add(Boolean.valueOf(z4));
            }
        }
        return destination;
    }

    @InlineOnly
    private static final Boolean find(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return Boolean.valueOf(z4);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Byte find(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return Byte.valueOf(b5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character find(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return Character.valueOf(c5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Double find(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return Double.valueOf(d5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Float find(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return Float.valueOf(f5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Integer find(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return Integer.valueOf(i5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Long find(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return Long.valueOf(j5);
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T find(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Short find(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    @InlineOnly
    private static final Boolean findLast(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                boolean z4 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                    return Boolean.valueOf(z4);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Byte findLast(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                byte b5 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                    return Byte.valueOf(b5);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Character findLast(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                char c5 = cArr[length];
                if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                    return Character.valueOf(c5);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Double findLast(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                double d5 = dArr[length];
                if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                    return Double.valueOf(d5);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Float findLast(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                float f5 = fArr[length];
                if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                    return Float.valueOf(f5);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Integer findLast(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                int i6 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i6)).booleanValue()) {
                    return Integer.valueOf(i6);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Long findLast(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                long j5 = jArr[length];
                if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                    return Long.valueOf(j5);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final <T> T findLast(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                T t4 = tArr[length];
                if (predicate.invoke(t4).booleanValue()) {
                    return t4;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    @InlineOnly
    private static final Short findLast(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                short s4 = sArr[length];
                if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                    return Short.valueOf(s4);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return null;
    }

    public static byte first(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[0];
    }

    public static final byte first(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return b5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char first(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[0];
    }

    public static final char first(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return c5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final double first(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    public static final double first(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return d5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static final float first(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return f5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static int first(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static final int first(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return i5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static long first(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[0];
    }

    public static final long first(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return j5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <T> T first(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static final <T> T first(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static short first(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[0];
    }

    public static final short first(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return s4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean first(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[0];
    }

    public static final boolean first(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return z4;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOf(T[] tArr, Function1<? super T, ? extends R> transform) {
        R r4;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                r4 = transform.invoke(tArr[i5]);
                if (r4 != null) {
                    break;
                }
                i5++;
            } else {
                r4 = null;
                break;
            }
        }
        if (r4 != null) {
            return r4;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final <T, R> R firstNotNullOfOrNull(T[] tArr, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            R invoke = transform.invoke(t4);
            if (invoke != null) {
                return invoke;
            }
        }
        return null;
    }

    public static final Boolean firstOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    public static final Boolean firstOrNull(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return Boolean.valueOf(z4);
            }
        }
        return null;
    }

    public static final Byte firstOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public static final Byte firstOrNull(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return Byte.valueOf(b5);
            }
        }
        return null;
    }

    public static final Character firstOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    public static final Character firstOrNull(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return Character.valueOf(c5);
            }
        }
        return null;
    }

    public static final Double firstOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final Double firstOrNull(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return Double.valueOf(d5);
            }
        }
        return null;
    }

    public static final Float firstOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final Float firstOrNull(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return Float.valueOf(f5);
            }
        }
        return null;
    }

    public static final Integer firstOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final Integer firstOrNull(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return Integer.valueOf(i5);
            }
        }
        return null;
    }

    public static final Long firstOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    public static final Long firstOrNull(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return Long.valueOf(j5);
            }
        }
        return null;
    }

    public static final <T> T firstOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <T> T firstOrNull(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
        }
        return null;
    }

    public static final Short firstOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final Short firstOrNull(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
        }
        return null;
    }

    public static final <R> List<R> flatMap(byte[] bArr, Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Byte.valueOf(b5)));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(char[] cArr, Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Character.valueOf(c5)));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(double[] dArr, Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Double.valueOf(d5)));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(float[] fArr, Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Float.valueOf(f5)));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(int[] iArr, Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(long[] jArr, Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j5 : jArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Long.valueOf(j5)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> flatMap(T[] tArr, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(t4));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(short[] sArr, Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Short.valueOf(s4)));
        }
        return arrayList;
    }

    public static final <R> List<R> flatMap(boolean[] zArr, Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Boolean.valueOf(z4)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(byte[] bArr, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Byte.valueOf(bArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(char[] cArr, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Character.valueOf(cArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(double[] dArr, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Double.valueOf(dArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(float[] fArr, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(int[] iArr, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(long[] jArr, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Long.valueOf(jArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedIterable(T[] tArr, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), tArr[i5]));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(short[] sArr, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Short.valueOf(sArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterable")
    @OverloadResolutionByLambdaReturnType
    private static final <R> List<R> flatMapIndexedIterable(boolean[] zArr, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), Boolean.valueOf(zArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(byte[] bArr, C destination, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Byte.valueOf(bArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(char[] cArr, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Character.valueOf(cArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(double[] dArr, C destination, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Double.valueOf(dArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(float[] fArr, C destination, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(int[] iArr, C destination, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(long[] jArr, C destination, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Long.valueOf(jArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), tArr[i5]));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(short[] sArr, C destination, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Short.valueOf(sArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedIterableTo")
    @OverloadResolutionByLambdaReturnType
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(boolean[] zArr, C destination, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), Boolean.valueOf(zArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequence")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R> List<R> flatMapIndexedSequence(T[] tArr, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), tArr[i5]));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "flatMapIndexedSequenceTo")
    @OverloadResolutionByLambdaReturnType
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), tArr[i5]));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapSequence")
    public static final <T, R> List<R> flatMapSequence(T[] tArr, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(t4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @JvmName(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(T[] tArr, C destination, Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(t4));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(byte[] bArr, C destination, Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b5 : bArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(char[] cArr, C destination, Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c5 : cArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(double[] dArr, C destination, Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d5 : dArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(float[] fArr, C destination, Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f5 : fArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(int[] iArr, C destination, Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 : iArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(long[] jArr, C destination, Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j5 : jArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Long.valueOf(j5)));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(T[] tArr, C destination, Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(t4));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(short[] sArr, C destination, Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(boolean[] zArr, C destination, Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z4 : zArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    public static final <R> R fold(byte[] bArr, R r4, Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (byte b5 : bArr) {
            r4 = operation.invoke(r4, Byte.valueOf(b5));
        }
        return r4;
    }

    public static final <R> R fold(char[] cArr, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (char c5 : cArr) {
            r4 = operation.invoke(r4, Character.valueOf(c5));
        }
        return r4;
    }

    public static final <R> R fold(double[] dArr, R r4, Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (double d5 : dArr) {
            r4 = operation.invoke(r4, Double.valueOf(d5));
        }
        return r4;
    }

    public static final <R> R fold(float[] fArr, R r4, Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (float f5 : fArr) {
            r4 = operation.invoke(r4, Float.valueOf(f5));
        }
        return r4;
    }

    public static final <R> R fold(int[] iArr, R r4, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i5 : iArr) {
            r4 = operation.invoke(r4, Integer.valueOf(i5));
        }
        return r4;
    }

    public static final <R> R fold(long[] jArr, R r4, Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (long j5 : jArr) {
            r4 = operation.invoke(r4, Long.valueOf(j5));
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R fold(T[] tArr, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (c cVar : tArr) {
            r4 = operation.invoke(r4, cVar);
        }
        return r4;
    }

    public static final <R> R fold(short[] sArr, R r4, Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (short s4 : sArr) {
            r4 = operation.invoke(r4, Short.valueOf(s4));
        }
        return r4;
    }

    public static final <R> R fold(boolean[] zArr, R r4, Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (boolean z4 : zArr) {
            r4 = operation.invoke(r4, Boolean.valueOf(z4));
        }
        return r4;
    }

    public static final <R> R foldIndexed(byte[] bArr, R r4, Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Byte.valueOf(bArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(char[] cArr, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Character.valueOf(cArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(double[] dArr, R r4, Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Double.valueOf(dArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(float[] fArr, R r4, Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Float.valueOf(fArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(int[] iArr, R r4, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Integer.valueOf(iArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(long[] jArr, R r4, Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Long.valueOf(jArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldIndexed(T[] tArr, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            r4 = operation.invoke(Integer.valueOf(i6), r4, tArr[i5]);
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(short[] sArr, R r4, Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Short.valueOf(sArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldIndexed(boolean[] zArr, R r4, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, Boolean.valueOf(zArr[i5]));
            i5++;
            i6++;
        }
        return r4;
    }

    public static final <R> R foldRight(byte[] bArr, R r4, Function2<? super Byte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Byte.valueOf(bArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRight(char[] cArr, R r4, Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Character.valueOf(cArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRight(double[] dArr, R r4, Function2<? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Double.valueOf(dArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRight(float[] fArr, R r4, Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Float.valueOf(fArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRight(int[] iArr, R r4, Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(iArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRight(long[] jArr, R r4, Function2<? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Long.valueOf(jArr[lastIndex]), r4);
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRight(T[] tArr, R r4, Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(tArr[lastIndex], r4);
        }
        return r4;
    }

    public static final <R> R foldRight(short[] sArr, R r4, Function2<? super Short, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Short.valueOf(sArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRight(boolean[] zArr, R r4, Function2<? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Boolean.valueOf(zArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(byte[] bArr, R r4, Function3<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(char[] cArr, R r4, Function3<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(double[] dArr, R r4, Function3<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(float[] fArr, R r4, Function3<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(int[] iArr, R r4, Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(long[] jArr, R r4, Function3<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r4);
        }
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRightIndexed(T[] tArr, R r4, Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(short[] sArr, R r4, Function3<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final <R> R foldRightIndexed(boolean[] zArr, R r4, Function3<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r4);
        }
        return r4;
    }

    public static final void forEach(byte[] bArr, Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b5 : bArr) {
            action.invoke(Byte.valueOf(b5));
        }
    }

    public static final void forEach(char[] cArr, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c5 : cArr) {
            action.invoke(Character.valueOf(c5));
        }
    }

    public static final void forEach(double[] dArr, Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d5 : dArr) {
            action.invoke(Double.valueOf(d5));
        }
    }

    public static final void forEach(float[] fArr, Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f5 : fArr) {
            action.invoke(Float.valueOf(f5));
        }
    }

    public static final void forEach(int[] iArr, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i5 : iArr) {
            action.invoke(Integer.valueOf(i5));
        }
    }

    public static final void forEach(long[] jArr, Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j5 : jArr) {
            action.invoke(Long.valueOf(j5));
        }
    }

    public static final <T> void forEach(T[] tArr, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t4 : tArr) {
            action.invoke(t4);
        }
    }

    public static final void forEach(short[] sArr, Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s4 : sArr) {
            action.invoke(Short.valueOf(s4));
        }
    }

    public static final void forEach(boolean[] zArr, Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z4 : zArr) {
            action.invoke(Boolean.valueOf(z4));
        }
    }

    public static final void forEachIndexed(byte[] bArr, Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Byte.valueOf(bArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(char[] cArr, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Character.valueOf(cArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(double[] dArr, Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Double.valueOf(dArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(float[] fArr, Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(int[] iArr, Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(long[] jArr, Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Long.valueOf(jArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final <T> void forEachIndexed(T[] tArr, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), tArr[i5]);
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(short[] sArr, Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Short.valueOf(sArr[i5]));
            i5++;
            i6++;
        }
    }

    public static final void forEachIndexed(boolean[] zArr, Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Boolean.valueOf(zArr[i5]));
            i5++;
            i6++;
        }
    }

    public static IntRange getIndices(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IntRange(0, getLastIndex(bArr));
    }

    public static final IntRange getIndices(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IntRange(0, getLastIndex(cArr));
    }

    public static final IntRange getIndices(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IntRange(0, getLastIndex(dArr));
    }

    public static final IntRange getIndices(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IntRange(0, getLastIndex(fArr));
    }

    public static IntRange getIndices(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IntRange(0, getLastIndex(iArr));
    }

    public static IntRange getIndices(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IntRange(0, getLastIndex(jArr));
    }

    public static <T> IntRange getIndices(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IntRange(0, getLastIndex(tArr));
    }

    public static IntRange getIndices(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IntRange(0, getLastIndex(sArr));
    }

    public static final IntRange getIndices(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IntRange(0, getLastIndex(zArr));
    }

    public static int getLastIndex(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    public static final int getLastIndex(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    public static final int getLastIndex(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    public static final int getLastIndex(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    public static int getLastIndex(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int getLastIndex(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int getLastIndex(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    public static int getLastIndex(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    public static final int getLastIndex(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    @InlineOnly
    private static final byte getOrElse(byte[] bArr, int i5, Function1<? super Integer, Byte> defaultValue) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(bArr)) ? defaultValue.invoke(Integer.valueOf(i5)).byteValue() : bArr[i5];
    }

    @InlineOnly
    private static final char getOrElse(char[] cArr, int i5, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(cArr)) ? defaultValue.invoke(Integer.valueOf(i5)).charValue() : cArr[i5];
    }

    @InlineOnly
    private static final double getOrElse(double[] dArr, int i5, Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(dArr)) ? defaultValue.invoke(Integer.valueOf(i5)).doubleValue() : dArr[i5];
    }

    @InlineOnly
    private static final float getOrElse(float[] fArr, int i5, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(fArr)) ? defaultValue.invoke(Integer.valueOf(i5)).floatValue() : fArr[i5];
    }

    @InlineOnly
    private static final int getOrElse(int[] iArr, int i5, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(iArr)) ? defaultValue.invoke(Integer.valueOf(i5)).intValue() : iArr[i5];
    }

    @InlineOnly
    private static final long getOrElse(long[] jArr, int i5, Function1<? super Integer, Long> defaultValue) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(jArr)) ? defaultValue.invoke(Integer.valueOf(i5)).longValue() : jArr[i5];
    }

    @InlineOnly
    private static final <T> T getOrElse(T[] tArr, int i5, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(tArr)) ? defaultValue.invoke(Integer.valueOf(i5)) : tArr[i5];
    }

    @InlineOnly
    private static final short getOrElse(short[] sArr, int i5, Function1<? super Integer, Short> defaultValue) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(sArr)) ? defaultValue.invoke(Integer.valueOf(i5)).shortValue() : sArr[i5];
    }

    @InlineOnly
    private static final boolean getOrElse(boolean[] zArr, int i5, Function1<? super Integer, Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > getLastIndex(zArr)) ? defaultValue.invoke(Integer.valueOf(i5)).booleanValue() : zArr[i5];
    }

    public static final Boolean getOrNull(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i5]);
    }

    public static final Byte getOrNull(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i5]);
    }

    public static final Character getOrNull(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i5]);
    }

    public static final Double getOrNull(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i5]);
    }

    public static final Float getOrNull(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i5]);
    }

    public static final Integer getOrNull(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i5]);
    }

    public static final Long getOrNull(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i5]);
    }

    public static final <T> T getOrNull(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(tArr)) {
            return null;
        }
        return tArr[i5];
    }

    public static final Short getOrNull(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i5 < 0 || i5 > getLastIndex(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i5]);
    }

    public static final <K> Map<K, List<Byte>> groupBy(byte[] bArr, Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Byte.valueOf(b5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(byte[] bArr, Function1<? super Byte, ? extends K> keySelector, Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Byte.valueOf(b5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Character>> groupBy(char[] cArr, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Character.valueOf(c5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(char[] cArr, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(c5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Double>> groupBy(double[] dArr, Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Double.valueOf(d5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(double[] dArr, Function1<? super Double, ? extends K> keySelector, Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Double.valueOf(d5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Float>> groupBy(float[] fArr, Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Float.valueOf(f5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(float[] fArr, Function1<? super Float, ? extends K> keySelector, Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Float.valueOf(f5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Integer>> groupBy(int[] iArr, Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i5 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Integer.valueOf(i5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(int[] iArr, Function1<? super Integer, ? extends K> keySelector, Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i5 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Integer.valueOf(i5)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Long>> groupBy(long[] jArr, Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j5 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Long.valueOf(j5));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(long[] jArr, Function1<? super Long, ? extends K> keySelector, Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j5 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j5));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Long.valueOf(j5)));
        }
        return linkedHashMap;
    }

    public static final <T, K> Map<K, List<T>> groupBy(T[] tArr, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(t4);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(T[] tArr, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(t4));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Short>> groupBy(short[] sArr, Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Short.valueOf(s4));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(short[] sArr, Function1<? super Short, ? extends K> keySelector, Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Short.valueOf(s4)));
        }
        return linkedHashMap;
    }

    public static final <K> Map<K, List<Boolean>> groupBy(boolean[] zArr, Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(Boolean.valueOf(z4));
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, List<V>> groupBy(boolean[] zArr, Function1<? super Boolean, ? extends K> keySelector, Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(byte[] bArr, M destination, Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Byte.valueOf(b5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(byte[] bArr, M destination, Function1<? super Byte, ? extends K> keySelector, Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b5 : bArr) {
            K invoke = keySelector.invoke(Byte.valueOf(b5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(char[] cArr, M destination, Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Character.valueOf(c5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(char[] cArr, M destination, Function1<? super Character, ? extends K> keySelector, Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c5 : cArr) {
            K invoke = keySelector.invoke(Character.valueOf(c5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(double[] dArr, M destination, Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Double.valueOf(d5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(double[] dArr, M destination, Function1<? super Double, ? extends K> keySelector, Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d5 : dArr) {
            K invoke = keySelector.invoke(Double.valueOf(d5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(float[] fArr, M destination, Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Float.valueOf(f5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(float[] fArr, M destination, Function1<? super Float, ? extends K> keySelector, Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f5 : fArr) {
            K invoke = keySelector.invoke(Float.valueOf(f5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(int[] iArr, M destination, Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i5 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Integer.valueOf(i5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(int[] iArr, M destination, Function1<? super Integer, ? extends K> keySelector, Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i5 : iArr) {
            K invoke = keySelector.invoke(Integer.valueOf(i5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Integer.valueOf(i5)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(long[] jArr, M destination, Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j5 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Long.valueOf(j5));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(long[] jArr, M destination, Function1<? super Long, ? extends K> keySelector, Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j5 : jArr) {
            K invoke = keySelector.invoke(Long.valueOf(j5));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Long.valueOf(j5)));
        }
        return destination;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(T[] tArr, M destination, Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(t4);
        }
        return destination;
    }

    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(T[] tArr, M destination, Function1<? super T, ? extends K> keySelector, Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t4 : tArr) {
            K invoke = keySelector.invoke(t4);
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(t4));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(short[] sArr, M destination, Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Short.valueOf(s4));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(short[] sArr, M destination, Function1<? super Short, ? extends K> keySelector, Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s4 : sArr) {
            K invoke = keySelector.invoke(Short.valueOf(s4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(Boolean.valueOf(z4));
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends K> keySelector, Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z4 : zArr) {
            K invoke = keySelector.invoke(Boolean.valueOf(z4));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    public static final <T, K> Grouping<T, K> groupingBy(final T[] tArr, final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.ArraysKt___ArraysKt$groupingBy$1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t4) {
                return keySelector.invoke(t4);
            }

            @Override // kotlin.collections.Grouping
            public Iterator<T> sourceIterator() {
                return ArrayIteratorKt.iterator(tArr);
            }
        };
    }

    public static int indexOf(byte[] bArr, byte b5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (b5 == bArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOf(char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (c5 == cArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (d5 == dArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfFirst { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (f5 == fArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static int indexOf(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (i5 == iArr[i6]) {
                return i6;
            }
        }
        return -1;
    }

    public static int indexOf(long[] jArr, long j5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (j5 == jArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static final <T> int indexOf(T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i5 = 0;
        if (t4 == null) {
            int length = tArr.length;
            while (i5 < length) {
                if (tArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i5 < length2) {
            if (Intrinsics.areEqual(t4, tArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (s4 == sArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOf(boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (z4 == zArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Byte.valueOf(bArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Character.valueOf(cArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Double.valueOf(dArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Float.valueOf(fArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Integer.valueOf(iArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Long.valueOf(jArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final <T> int indexOfFirst(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(tArr[i5]).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Short.valueOf(sArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfLast(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
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

    public static final int indexOfLast(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
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

    public static final int indexOfLast(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
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

    public static final int indexOfLast(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
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

    public static final int indexOfLast(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
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

    public static final int indexOfLast(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
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

    public static final <T> int indexOfLast(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
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

    public static final int indexOfLast(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
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

    public static final int indexOfLast(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
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

    public static final Set<Byte> intersect(byte[] bArr, Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Character> intersect(char[] cArr, Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Double> intersect(double[] dArr, Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Float> intersect(float[] fArr, Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Integer> intersect(int[] iArr, Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Long> intersect(long[] jArr, Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> Set<T> intersect(T[] tArr, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Short> intersect(short[] sArr, Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Boolean> intersect(boolean[] zArr, Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @InlineOnly
    private static final boolean isEmpty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @InlineOnly
    private static final <T> boolean isEmpty(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @InlineOnly
    private static final boolean isEmpty(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @InlineOnly
    private static final boolean isNotEmpty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @InlineOnly
    private static final <T> boolean isNotEmpty(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @InlineOnly
    private static final boolean isNotEmpty(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final <A extends Appendable> A joinTo(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (byte b5 : bArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Byte.valueOf(b5)) : String.valueOf((int) b5));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (char c5 : cArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Character.valueOf(c5)));
            } else {
                buffer.append(c5);
            }
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (double d5 : dArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Double.valueOf(d5)) : String.valueOf(d5));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (float f5 : fArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Float.valueOf(f5)) : String.valueOf(f5));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (int i7 : iArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Integer.valueOf(i7)) : String.valueOf(i7));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (long j5 : jArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Long.valueOf(j5)) : String.valueOf(j5));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T, A extends Appendable> A joinTo(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (T t4 : tArr) {
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

    public static final <A extends Appendable> A joinTo(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (short s4 : sArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Short.valueOf(s4)) : String.valueOf((int) s4));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(boolean[] zArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Boolean, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i6 = 0;
        for (boolean z4 : zArr) {
            i6++;
            if (i6 > 1) {
                buffer.append(separator);
            }
            if (i5 >= 0 && i6 > i5) {
                break;
            }
            buffer.append(function1 != null ? function1.invoke(Boolean.valueOf(z4)) : String.valueOf(z4));
        }
        if (i5 >= 0 && i6 > i5) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String joinToString(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final <T> String joinToString(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static final String joinToString(boolean[] zArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i5, CharSequence truncated, Function1<? super Boolean, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String sb = ((StringBuilder) joinTo(zArr, new StringBuilder(), separator, prefix, postfix, i5, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(bArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Byte, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(cArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Character, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(dArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Double, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(fArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Float, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(iArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Integer, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(jArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Long, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(objArr, charSequence, charSequence5, charSequence6, i7, charSequence7, function1);
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(sArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Short, ? extends CharSequence>) function1);
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, Function1 function1, int i6, Object obj) {
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
        return joinToString(zArr, charSequence, charSequence5, charSequence6, i7, charSequence7, (Function1<? super Boolean, ? extends CharSequence>) function1);
    }

    public static byte last(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[getLastIndex(bArr)];
    }

    public static final byte last(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                byte b5 = bArr[length];
                if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return b5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final char last(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[getLastIndex(cArr)];
    }

    public static final char last(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                char c5 = cArr[length];
                if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return c5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final double last(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[getLastIndex(dArr)];
    }

    public static final double last(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                double d5 = dArr[length];
                if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return d5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[getLastIndex(fArr)];
    }

    public static final float last(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                float f5 = fArr[length];
                if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return f5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static int last(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[getLastIndex(iArr)];
    }

    public static final int last(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                int i6 = iArr[length];
                if (!predicate.invoke(Integer.valueOf(i6)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return i6;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static long last(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[getLastIndex(jArr)];
    }

    public static final long last(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                long j5 = jArr[length];
                if (!predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return j5;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final <T> T last(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[getLastIndex(tArr)];
    }

    public static final <T> T last(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                T t4 = tArr[length];
                if (!predicate.invoke(t4).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return t4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static short last(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[getLastIndex(sArr)];
    }

    public static final short last(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                short s4 = sArr[length];
                if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return s4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final boolean last(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[getLastIndex(zArr)];
    }

    public static final boolean last(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                boolean z4 = zArr[length];
                if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                } else {
                    return z4;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static int lastIndexOf(byte[] bArr, byte b5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (b5 == bArr[length]) {
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

    public static final int lastIndexOf(char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (c5 == cArr[length]) {
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

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (d5 == dArr[length]) {
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

    @Deprecated(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @ReplaceWith(expression = "indexOfLast { it == element }", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (f5 == fArr[length]) {
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

    public static int lastIndexOf(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i6 = length - 1;
                if (i5 == iArr[length]) {
                    return length;
                }
                if (i6 < 0) {
                    break;
                }
                length = i6;
            }
        }
        return -1;
    }

    public static int lastIndexOf(long[] jArr, long j5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (j5 == jArr[length]) {
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

    public static final <T> int lastIndexOf(T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t4 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (Intrinsics.areEqual(t4, tArr[length2])) {
                        return length2;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    length2 = i6;
                }
            }
        }
        return -1;
    }

    public static int lastIndexOf(short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (s4 == sArr[length]) {
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

    public static final int lastIndexOf(boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (z4 == zArr[length]) {
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

    public static final Boolean lastOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static final Boolean lastOrNull(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            boolean z4 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return Boolean.valueOf(z4);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Byte lastOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final Byte lastOrNull(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            byte b5 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return Byte.valueOf(b5);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Character lastOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static final Character lastOrNull(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            char c5 = cArr[length];
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return Character.valueOf(c5);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Double lastOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    public static final Double lastOrNull(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            double d5 = dArr[length];
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return Double.valueOf(d5);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Float lastOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static final Float lastOrNull(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            float f5 = fArr[length];
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return Float.valueOf(f5);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Integer lastOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static final Integer lastOrNull(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            int i6 = iArr[length];
            if (predicate.invoke(Integer.valueOf(i6)).booleanValue()) {
                return Integer.valueOf(i6);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Long lastOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    public static final Long lastOrNull(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            long j5 = jArr[length];
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return Long.valueOf(j5);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final <T> T lastOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final <T> T lastOrNull(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            T t4 = tArr[length];
            if (predicate.invoke(t4).booleanValue()) {
                return t4;
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final Short lastOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    public static final Short lastOrNull(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i5 = length - 1;
            short s4 = sArr[length];
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return Short.valueOf(s4);
            }
            if (i5 < 0) {
                return null;
            }
            length = i5;
        }
    }

    public static final <R> List<R> map(byte[] bArr, Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b5 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b5)));
        }
        return arrayList;
    }

    public static final <R> List<R> map(char[] cArr, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c5 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c5)));
        }
        return arrayList;
    }

    public static final <R> List<R> map(double[] dArr, Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d5 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d5)));
        }
        return arrayList;
    }

    public static final <R> List<R> map(float[] fArr, Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f5 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f5)));
        }
        return arrayList;
    }

    public static final <R> List<R> map(int[] iArr, Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i5 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i5)));
        }
        return arrayList;
    }

    public static final <R> List<R> map(long[] jArr, Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j5 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j5)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> map(T[] tArr, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t4 : tArr) {
            arrayList.add(transform.invoke(t4));
        }
        return arrayList;
    }

    public static final <R> List<R> map(short[] sArr, Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s4)));
        }
        return arrayList;
    }

    public static final <R> List<R> map(boolean[] zArr, Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z4 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z4)));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(byte[] bArr, Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Byte.valueOf(bArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(char[] cArr, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Character.valueOf(cArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(double[] dArr, Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Double.valueOf(dArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(float[] fArr, Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(int[] iArr, Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(long[] jArr, Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Long.valueOf(jArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(T[] tArr, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), tArr[i5]));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(short[] sArr, Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Short.valueOf(sArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(boolean[] zArr, Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), Boolean.valueOf(zArr[i5])));
            i5++;
            i6++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(T[] tArr, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i6 + 1;
            R invoke = transform.invoke(Integer.valueOf(i6), tArr[i5]);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i6 + 1;
            R invoke = transform.invoke(Integer.valueOf(i6), tArr[i5]);
            if (invoke != null) {
                destination.add(invoke);
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(byte[] bArr, C destination, Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Byte.valueOf(bArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(char[] cArr, C destination, Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Character.valueOf(cArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(double[] dArr, C destination, Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Double.valueOf(dArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(float[] fArr, C destination, Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(int[] iArr, C destination, Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(long[] jArr, C destination, Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Long.valueOf(jArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), tArr[i5]));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(short[] sArr, C destination, Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Short.valueOf(sArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(boolean[] zArr, C destination, Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            destination.add(transform.invoke(Integer.valueOf(i6), Boolean.valueOf(zArr[i5])));
            i5++;
            i6++;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(T[] tArr, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            R invoke = transform.invoke(t4);
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(T[] tArr, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            R invoke = transform.invoke(t4);
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(byte[] bArr, C destination, Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b5 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(char[] cArr, C destination, Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c5 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(double[] dArr, C destination, Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d5 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(float[] fArr, C destination, Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f5 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(int[] iArr, C destination, Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i5 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i5)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(long[] jArr, C destination, Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j5 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j5)));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(T[] tArr, C destination, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t4 : tArr) {
            destination.add(transform.invoke(t4));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(short[] sArr, C destination, Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s4 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s4)));
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(boolean[] zArr, C destination, Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z4 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z4)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z4);
        }
        R invoke = selector.invoke(Boolean.valueOf(z4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            boolean z5 = zArr[j5.nextInt()];
            R invoke2 = selector.invoke(Boolean.valueOf(z5));
            if (invoke.compareTo(invoke2) < 0) {
                z4 = z5;
                invoke = invoke2;
            }
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte maxByOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b5);
        }
        R invoke = selector.invoke(Byte.valueOf(b5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte b6 = bArr[j5.nextInt()];
            R invoke2 = selector.invoke(Byte.valueOf(b6));
            if (invoke.compareTo(invoke2) < 0) {
                b5 = b6;
                invoke = invoke2;
            }
        }
        return Byte.valueOf(b5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Character maxByOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c5);
        }
        R invoke = selector.invoke(Character.valueOf(c5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            char c6 = cArr[j5.nextInt()];
            R invoke2 = selector.invoke(Character.valueOf(c6));
            if (invoke.compareTo(invoke2) < 0) {
                c5 = c6;
                invoke = invoke2;
            }
        }
        return Character.valueOf(c5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Double maxByOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d5);
        }
        R invoke = selector.invoke(Double.valueOf(d5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            double d6 = dArr[j5.nextInt()];
            R invoke2 = selector.invoke(Double.valueOf(d6));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Float maxByOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f5);
        }
        R invoke = selector.invoke(Float.valueOf(f5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            float f6 = fArr[j5.nextInt()];
            R invoke2 = selector.invoke(Float.valueOf(f6));
            if (invoke.compareTo(invoke2) < 0) {
                f5 = f6;
                invoke = invoke2;
            }
        }
        return Float.valueOf(f5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer maxByOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i5);
        }
        R invoke = selector.invoke(Integer.valueOf(i5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int i6 = iArr[j5.nextInt()];
            R invoke2 = selector.invoke(Integer.valueOf(i6));
            if (invoke.compareTo(invoke2) < 0) {
                i5 = i6;
                invoke = invoke2;
            }
        }
        return Integer.valueOf(i5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Long maxByOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j5);
        }
        R invoke = selector.invoke(Long.valueOf(j5));
        IntIterator j6 = d.j(1, lastIndex);
        while (j6.hasNext()) {
            long j7 = jArr[j6.nextInt()];
            R invoke2 = selector.invoke(Long.valueOf(j7));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                j5 = j7;
            }
        }
        return Long.valueOf(j5);
    }

    @SinceKotlin(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t4;
        }
        R invoke = selector.invoke(t4);
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            T t5 = tArr[j5.nextInt()];
            R invoke2 = selector.invoke(t5);
            if (invoke.compareTo(invoke2) < 0) {
                t4 = t5;
                invoke = invoke2;
            }
        }
        return t4;
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Short maxByOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R invoke = selector.invoke(Short.valueOf(s4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short s5 = sArr[j5.nextInt()];
            R invoke2 = selector.invoke(Short.valueOf(s5));
            if (invoke.compareTo(invoke2) < 0) {
                s4 = s5;
                invoke = invoke2;
            }
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte maxByOrThrow(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b5 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return b5;
        }
        R invoke = selector.invoke(Byte.valueOf(b5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte b6 = bArr[j5.nextInt()];
            R invoke2 = selector.invoke(Byte.valueOf(b6));
            if (invoke.compareTo(invoke2) < 0) {
                b5 = b6;
                invoke = invoke2;
            }
        }
        return b5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c5 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return c5;
        }
        R invoke = selector.invoke(Character.valueOf(c5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            char c6 = cArr[j5.nextInt()];
            R invoke2 = selector.invoke(Character.valueOf(c6));
            if (invoke.compareTo(invoke2) < 0) {
                c5 = c6;
                invoke = invoke2;
            }
        }
        return c5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double maxByOrThrow(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d5 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return d5;
        }
        R invoke = selector.invoke(Double.valueOf(d5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            double d6 = dArr[j5.nextInt()];
            R invoke2 = selector.invoke(Double.valueOf(d6));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                d5 = d6;
            }
        }
        return d5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float maxByOrThrow(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f5 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return f5;
        }
        R invoke = selector.invoke(Float.valueOf(f5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            float f6 = fArr[j5.nextInt()];
            R invoke2 = selector.invoke(Float.valueOf(f6));
            if (invoke.compareTo(invoke2) < 0) {
                f5 = f6;
                invoke = invoke2;
            }
        }
        return f5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int maxByOrThrow(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i5 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return i5;
        }
        R invoke = selector.invoke(Integer.valueOf(i5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int i6 = iArr[j5.nextInt()];
            R invoke2 = selector.invoke(Integer.valueOf(i6));
            if (invoke.compareTo(invoke2) < 0) {
                i5 = i6;
                invoke = invoke2;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long maxByOrThrow(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j5 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return j5;
        }
        R invoke = selector.invoke(Long.valueOf(j5));
        IntIterator j6 = d.j(1, lastIndex);
        while (j6.hasNext()) {
            long j7 = jArr[j6.nextInt()];
            R invoke2 = selector.invoke(Long.valueOf(j7));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                j5 = j7;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t4 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t4;
        }
        R invoke = selector.invoke(t4);
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            T t5 = tArr[j5.nextInt()];
            R invoke2 = selector.invoke(t5);
            if (invoke.compareTo(invoke2) < 0) {
                t4 = t5;
                invoke = invoke2;
            }
        }
        return t4;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short maxByOrThrow(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s4 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return s4;
        }
        R invoke = selector.invoke(Short.valueOf(s4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short s5 = sArr[j5.nextInt()];
            R invoke2 = selector.invoke(Short.valueOf(s5));
            if (invoke.compareTo(invoke2) < 0) {
                s4 = s5;
                invoke = invoke2;
            }
        }
        return s4;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z4 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return z4;
        }
        R invoke = selector.invoke(Boolean.valueOf(z4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            boolean z5 = zArr[j5.nextInt()];
            R invoke2 = selector.invoke(Boolean.valueOf(z5));
            if (invoke.compareTo(invoke2) < 0) {
                z4 = z5;
                invoke = invoke2;
            }
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double maxOf(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double maxOf(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m367maxOf(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m368maxOf(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m369maxOf(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m370maxOf(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m371maxOf(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m372maxOf(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m373maxOf(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m374maxOf(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m375maxOf(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m376maxOf(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m377maxOf(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m378maxOf(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m379maxOf(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m380maxOf(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m381maxOf(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m382maxOf(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m383maxOf(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m384maxOf(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R maxOfOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m385maxOfOrNull(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m386maxOfOrNull(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m387maxOfOrNull(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m388maxOfOrNull(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m389maxOfOrNull(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m390maxOfOrNull(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m391maxOfOrNull(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m392maxOfOrNull(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m393maxOfOrNull(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m394maxOfOrNull(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m395maxOfOrNull(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m396maxOfOrNull(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m397maxOfOrNull(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m398maxOfOrNull(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m399maxOfOrNull(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m400maxOfOrNull(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m401maxOfOrNull(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m402maxOfOrNull(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R maxOfWith(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
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
    private static final <R> R maxOfWith(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
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
    private static final <R> R maxOfWith(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
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
    private static final <R> R maxOfWith(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
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
    private static final <R> R maxOfWith(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
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
    private static final <R> R maxOfWith(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWith(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(tArr[it.nextInt()]);
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
    private static final <R> R maxOfWith(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
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
    private static final <R> R maxOfWith(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R maxOfWithOrNull(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(tArr[it.nextInt()]);
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
    private static final <R> R maxOfWithOrNull(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
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
    private static final <R> R maxOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Byte maxOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (b5 < b6) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character maxOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (Intrinsics.compare((int) c5, (int) c6) < 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (t4.compareTo(t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double maxOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d5 = Math.max(d5, dArr[it.nextInt()]);
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double maxOrNull(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float maxOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f5 = Math.max(f5, fArr[it.nextInt()]);
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float maxOrNull(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Integer maxOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (i5 < i6) {
                i5 = i6;
            }
        }
        return Integer.valueOf(i5);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Long maxOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (j5 < j6) {
                j5 = j6;
            }
        }
        return Long.valueOf(j5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Short maxOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (s4 < s5) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final byte maxOrThrow(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (b5 < b6) {
                b5 = b6;
            }
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final char maxOrThrow(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (Intrinsics.compare((int) c5, (int) c6) < 0) {
                c5 = c6;
            }
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d5 = Math.max(d5, dArr[it.nextInt()]);
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f5 = Math.max(f5, fArr[it.nextInt()]);
        }
        return f5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final float maxOrThrow(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.nextInt()].floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final int maxOrThrow(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (i5 < i6) {
                i5 = i6;
            }
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final long maxOrThrow(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (j5 < j6) {
                j5 = j6;
            }
        }
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T maxOrThrow(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (t4.compareTo(t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final short maxOrThrow(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (s4 < s5) {
                s4 = s5;
            }
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Boolean maxWithOrNull(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z5 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) < 0) {
                z4 = z5;
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Byte maxWithOrNull(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) < 0) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character maxWithOrNull(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) < 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double maxWithOrNull(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d6 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) < 0) {
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float maxWithOrNull(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f6 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) < 0) {
                f5 = f6;
            }
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Integer maxWithOrNull(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i5), Integer.valueOf(i6)) < 0) {
                i5 = i6;
            }
        }
        return Integer.valueOf(i5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Long maxWithOrNull(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j5), Long.valueOf(j6)) < 0) {
                j5 = j6;
            }
        }
        return Long.valueOf(j5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final <T> T maxWithOrNull(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (comparator.compare(t4, t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Short maxWithOrNull(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) < 0) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final byte maxWithOrThrow(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) < 0) {
                b5 = b6;
            }
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) < 0) {
                c5 = c6;
            }
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final double maxWithOrThrow(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d6 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) < 0) {
                d5 = d6;
            }
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final float maxWithOrThrow(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f6 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) < 0) {
                f5 = f6;
            }
        }
        return f5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final int maxWithOrThrow(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i5), Integer.valueOf(i6)) < 0) {
                i5 = i6;
            }
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final long maxWithOrThrow(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j5), Long.valueOf(j6)) < 0) {
                j5 = j6;
            }
        }
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (comparator.compare(t4, t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final short maxWithOrThrow(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) < 0) {
                s4 = s5;
            }
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final boolean maxWithOrThrow(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z5 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) < 0) {
                z4 = z5;
            }
        }
        return z4;
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Boolean minByOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z4);
        }
        R invoke = selector.invoke(Boolean.valueOf(z4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            boolean z5 = zArr[j5.nextInt()];
            R invoke2 = selector.invoke(Boolean.valueOf(z5));
            if (invoke.compareTo(invoke2) > 0) {
                z4 = z5;
                invoke = invoke2;
            }
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Byte minByOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b5);
        }
        R invoke = selector.invoke(Byte.valueOf(b5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte b6 = bArr[j5.nextInt()];
            R invoke2 = selector.invoke(Byte.valueOf(b6));
            if (invoke.compareTo(invoke2) > 0) {
                b5 = b6;
                invoke = invoke2;
            }
        }
        return Byte.valueOf(b5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Character minByOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c5);
        }
        R invoke = selector.invoke(Character.valueOf(c5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            char c6 = cArr[j5.nextInt()];
            R invoke2 = selector.invoke(Character.valueOf(c6));
            if (invoke.compareTo(invoke2) > 0) {
                c5 = c6;
                invoke = invoke2;
            }
        }
        return Character.valueOf(c5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Double minByOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d5);
        }
        R invoke = selector.invoke(Double.valueOf(d5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            double d6 = dArr[j5.nextInt()];
            R invoke2 = selector.invoke(Double.valueOf(d6));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Float minByOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f5);
        }
        R invoke = selector.invoke(Float.valueOf(f5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            float f6 = fArr[j5.nextInt()];
            R invoke2 = selector.invoke(Float.valueOf(f6));
            if (invoke.compareTo(invoke2) > 0) {
                f5 = f6;
                invoke = invoke2;
            }
        }
        return Float.valueOf(f5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Integer minByOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i5);
        }
        R invoke = selector.invoke(Integer.valueOf(i5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int i6 = iArr[j5.nextInt()];
            R invoke2 = selector.invoke(Integer.valueOf(i6));
            if (invoke.compareTo(invoke2) > 0) {
                i5 = i6;
                invoke = invoke2;
            }
        }
        return Integer.valueOf(i5);
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Long minByOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j5);
        }
        R invoke = selector.invoke(Long.valueOf(j5));
        IntIterator j6 = d.j(1, lastIndex);
        while (j6.hasNext()) {
            long j7 = jArr[j6.nextInt()];
            R invoke2 = selector.invoke(Long.valueOf(j7));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                j5 = j7;
            }
        }
        return Long.valueOf(j5);
    }

    @SinceKotlin(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T minByOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t4;
        }
        R invoke = selector.invoke(t4);
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            T t5 = tArr[j5.nextInt()];
            R invoke2 = selector.invoke(t5);
            if (invoke.compareTo(invoke2) > 0) {
                t4 = t5;
                invoke = invoke2;
            }
        }
        return t4;
    }

    @SinceKotlin(version = "1.4")
    public static final <R extends Comparable<? super R>> Short minByOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s4);
        }
        R invoke = selector.invoke(Short.valueOf(s4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short s5 = sArr[j5.nextInt()];
            R invoke2 = selector.invoke(Short.valueOf(s5));
            if (invoke.compareTo(invoke2) > 0) {
                s4 = s5;
                invoke = invoke2;
            }
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte minByOrThrow(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b5 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return b5;
        }
        R invoke = selector.invoke(Byte.valueOf(b5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte b6 = bArr[j5.nextInt()];
            R invoke2 = selector.invoke(Byte.valueOf(b6));
            if (invoke.compareTo(invoke2) > 0) {
                b5 = b6;
                invoke = invoke2;
            }
        }
        return b5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c5 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return c5;
        }
        R invoke = selector.invoke(Character.valueOf(c5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            char c6 = cArr[j5.nextInt()];
            R invoke2 = selector.invoke(Character.valueOf(c6));
            if (invoke.compareTo(invoke2) > 0) {
                c5 = c6;
                invoke = invoke2;
            }
        }
        return c5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double minByOrThrow(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d5 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return d5;
        }
        R invoke = selector.invoke(Double.valueOf(d5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            double d6 = dArr[j5.nextInt()];
            R invoke2 = selector.invoke(Double.valueOf(d6));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                d5 = d6;
            }
        }
        return d5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float minByOrThrow(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f5 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return f5;
        }
        R invoke = selector.invoke(Float.valueOf(f5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            float f6 = fArr[j5.nextInt()];
            R invoke2 = selector.invoke(Float.valueOf(f6));
            if (invoke.compareTo(invoke2) > 0) {
                f5 = f6;
                invoke = invoke2;
            }
        }
        return f5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int minByOrThrow(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i5 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return i5;
        }
        R invoke = selector.invoke(Integer.valueOf(i5));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int i6 = iArr[j5.nextInt()];
            R invoke2 = selector.invoke(Integer.valueOf(i6));
            if (invoke.compareTo(invoke2) > 0) {
                i5 = i6;
                invoke = invoke2;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long minByOrThrow(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j5 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return j5;
        }
        R invoke = selector.invoke(Long.valueOf(j5));
        IntIterator j6 = d.j(1, lastIndex);
        while (j6.hasNext()) {
            long j7 = jArr[j6.nextInt()];
            R invoke2 = selector.invoke(Long.valueOf(j7));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                j5 = j7;
            }
        }
        return j5;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t4 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex == 0) {
            return t4;
        }
        R invoke = selector.invoke(t4);
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            T t5 = tArr[j5.nextInt()];
            R invoke2 = selector.invoke(t5);
            if (invoke.compareTo(invoke2) > 0) {
                t4 = t5;
                invoke = invoke2;
            }
        }
        return t4;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short minByOrThrow(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s4 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return s4;
        }
        R invoke = selector.invoke(Short.valueOf(s4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short s5 = sArr[j5.nextInt()];
            R invoke2 = selector.invoke(Short.valueOf(s5));
            if (invoke.compareTo(invoke2) > 0) {
                s4 = s5;
                invoke = invoke2;
            }
        }
        return s4;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean minByOrThrow(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z4 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return z4;
        }
        R invoke = selector.invoke(Boolean.valueOf(z4));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            boolean z5 = zArr[j5.nextInt()];
            R invoke2 = selector.invoke(Boolean.valueOf(z5));
            if (invoke.compareTo(invoke2) > 0) {
                z4 = z5;
                invoke = invoke2;
            }
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T> double minOf(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final double minOf(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m403minOf(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m404minOf(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m405minOf(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m406minOf(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m407minOf(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m408minOf(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m409minOf(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m410minOf(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m411minOf(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m412minOf(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m413minOf(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m414minOf(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m415minOf(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m416minOf(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m417minOf(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m418minOf(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m419minOf(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m420minOf(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Character.valueOf(cArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Double.valueOf(dArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Float.valueOf(fArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(tArr[it.nextInt()]);
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Short.valueOf(sArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R extends Comparable<? super R>> R minOfOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R invoke = selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            R invoke2 = selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m421minOfOrNull(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m422minOfOrNull(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m423minOfOrNull(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m424minOfOrNull(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m425minOfOrNull(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m426minOfOrNull(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m427minOfOrNull(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(tArr[0]).doubleValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(tArr[it.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m428minOfOrNull(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m429minOfOrNull(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m430minOfOrNull(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Byte.valueOf(bArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m431minOfOrNull(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Character.valueOf(cArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m432minOfOrNull(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Double.valueOf(dArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m433minOfOrNull(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Float.valueOf(fArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m434minOfOrNull(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Integer.valueOf(iArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m435minOfOrNull(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Long.valueOf(jArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m436minOfOrNull(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(tArr[0]).floatValue();
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(tArr[it.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m437minOfOrNull(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Short.valueOf(sArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m438minOfOrNull(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(Boolean.valueOf(zArr[it.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <R> R minOfWith(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
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
    private static final <R> R minOfWith(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
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
    private static final <R> R minOfWith(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
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
    private static final <R> R minOfWith(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
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
    private static final <R> R minOfWith(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
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
    private static final <R> R minOfWith(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWith(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(tArr[it.nextInt()]);
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
    private static final <R> R minOfWith(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
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
    private static final <R> R minOfWith(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Byte.valueOf(bArr[0]));
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Byte.valueOf(bArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Character.valueOf(cArr[0]));
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Character.valueOf(cArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Double.valueOf(dArr[0]));
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Double.valueOf(dArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Float.valueOf(fArr[0]));
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Float.valueOf(fArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Integer.valueOf(iArr[0]));
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Integer.valueOf(iArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Long.valueOf(jArr[0]));
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Long.valueOf(jArr[it.nextInt()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    @SinceKotlin(version = "1.4")
    @OverloadResolutionByLambdaReturnType
    @InlineOnly
    private static final <T, R> R minOfWithOrNull(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(tArr[0]);
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(tArr[it.nextInt()]);
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
    private static final <R> R minOfWithOrNull(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Short.valueOf(sArr[0]));
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Short.valueOf(sArr[it.nextInt()]));
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
    private static final <R> R minOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) selector.invoke(Boolean.valueOf(zArr[0]));
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(Boolean.valueOf(zArr[it.nextInt()]));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Byte minOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (b5 > b6) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character minOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (Intrinsics.compare((int) c5, (int) c6) > 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (t4.compareTo(t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double minOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d5 = Math.min(d5, dArr[it.nextInt()]);
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double minOrNull(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float minOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f5 = Math.min(f5, fArr[it.nextInt()]);
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float minOrNull(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Integer minOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (i5 > i6) {
                i5 = i6;
            }
        }
        return Integer.valueOf(i5);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Long minOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (j5 > j6) {
                j5 = j6;
            }
        }
        return Long.valueOf(j5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Short minOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (s4 > s5) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final byte minOrThrow(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (b5 > b6) {
                b5 = b6;
            }
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final char minOrThrow(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (Intrinsics.compare((int) c5, (int) c6) > 0) {
                c5 = c6;
            }
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d5 = Math.min(d5, dArr[it.nextInt()]);
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.nextInt()].doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f5 = Math.min(f5, fArr[it.nextInt()]);
        }
        return f5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final float minOrThrow(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.nextInt()].floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final int minOrThrow(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (i5 > i6) {
                i5 = i6;
            }
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final long minOrThrow(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (j5 > j6) {
                j5 = j6;
            }
        }
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T minOrThrow(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (t4.compareTo(t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final short minOrThrow(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (s4 > s5) {
                s4 = s5;
            }
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Boolean minWithOrNull(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z5 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) > 0) {
                z4 = z5;
            }
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Byte minWithOrNull(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) > 0) {
                b5 = b6;
            }
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character minWithOrNull(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) > 0) {
                c5 = c6;
            }
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double minWithOrNull(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d6 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) > 0) {
                d5 = d6;
            }
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float minWithOrNull(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f6 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) > 0) {
                f5 = f6;
            }
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Integer minWithOrNull(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i5), Integer.valueOf(i6)) > 0) {
                i5 = i6;
            }
        }
        return Integer.valueOf(i5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Long minWithOrNull(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j5), Long.valueOf(j6)) > 0) {
                j5 = j6;
            }
        }
        return Long.valueOf(j5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final <T> T minWithOrNull(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (comparator.compare(t4, t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Short minWithOrNull(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) > 0) {
                s4 = s5;
            }
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final byte minWithOrThrow(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            byte b6 = bArr[it.nextInt()];
            if (comparator.compare(Byte.valueOf(b5), Byte.valueOf(b6)) > 0) {
                b5 = b6;
            }
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final char minWithOrThrow(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            char c6 = cArr[it.nextInt()];
            if (comparator.compare(Character.valueOf(c5), Character.valueOf(c6)) > 0) {
                c5 = c6;
            }
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final double minWithOrThrow(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            double d6 = dArr[it.nextInt()];
            if (comparator.compare(Double.valueOf(d5), Double.valueOf(d6)) > 0) {
                d5 = d6;
            }
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final float minWithOrThrow(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            float f6 = fArr[it.nextInt()];
            if (comparator.compare(Float.valueOf(f5), Float.valueOf(f6)) > 0) {
                f5 = f6;
            }
        }
        return f5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final int minWithOrThrow(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int i6 = iArr[it.nextInt()];
            if (comparator.compare(Integer.valueOf(i5), Integer.valueOf(i6)) > 0) {
                i5 = i6;
            }
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final long minWithOrThrow(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            long j6 = jArr[it.nextInt()];
            if (comparator.compare(Long.valueOf(j5), Long.valueOf(j6)) > 0) {
                j5 = j6;
            }
        }
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t4 = tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            T t5 = tArr[it.nextInt()];
            if (comparator.compare(t4, t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final short minWithOrThrow(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            short s5 = sArr[it.nextInt()];
            if (comparator.compare(Short.valueOf(s4), Short.valueOf(s5)) > 0) {
                s4 = s5;
            }
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final boolean minWithOrThrow(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            boolean z5 = zArr[it.nextInt()];
            if (comparator.compare(Boolean.valueOf(z4), Boolean.valueOf(z5)) > 0) {
                z4 = z5;
            }
        }
        return z4;
    }

    public static final boolean none(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    public static final boolean none(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b5 : bArr) {
            if (predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    public static final boolean none(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final boolean none(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d5 : dArr) {
            if (predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final boolean none(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f5 : fArr) {
            if (predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final boolean none(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final boolean none(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean none(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final <T> boolean none(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final boolean none(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean none(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final boolean none(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z4 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte[] onEach(byte[] bArr, Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b5 : bArr) {
            action.invoke(Byte.valueOf(b5));
        }
        return bArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final char[] onEach(char[] cArr, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c5 : cArr) {
            action.invoke(Character.valueOf(c5));
        }
        return cArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final double[] onEach(double[] dArr, Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d5 : dArr) {
            action.invoke(Double.valueOf(d5));
        }
        return dArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final float[] onEach(float[] fArr, Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f5 : fArr) {
            action.invoke(Float.valueOf(f5));
        }
        return fArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int[] onEach(int[] iArr, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i5 : iArr) {
            action.invoke(Integer.valueOf(i5));
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long[] onEach(long[] jArr, Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j5 : jArr) {
            action.invoke(Long.valueOf(j5));
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T[] onEach(T[] tArr, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t4 : tArr) {
            action.invoke(t4);
        }
        return tArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short[] onEach(short[] sArr, Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s4 : sArr) {
            action.invoke(Short.valueOf(s4));
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean[] onEach(boolean[] zArr, Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z4 : zArr) {
            action.invoke(Boolean.valueOf(z4));
        }
        return zArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte[] onEachIndexed(byte[] bArr, Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Byte.valueOf(bArr[i5]));
            i5++;
            i6++;
        }
        return bArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final char[] onEachIndexed(char[] cArr, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Character.valueOf(cArr[i5]));
            i5++;
            i6++;
        }
        return cArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final double[] onEachIndexed(double[] dArr, Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Double.valueOf(dArr[i5]));
            i5++;
            i6++;
        }
        return dArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final float[] onEachIndexed(float[] fArr, Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Float.valueOf(fArr[i5]));
            i5++;
            i6++;
        }
        return fArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int[] onEachIndexed(int[] iArr, Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i5]));
            i5++;
            i6++;
        }
        return iArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long[] onEachIndexed(long[] jArr, Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Long.valueOf(jArr[i5]));
            i5++;
            i6++;
        }
        return jArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T> T[] onEachIndexed(T[] tArr, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), tArr[i5]);
            i5++;
            i6++;
        }
        return tArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short[] onEachIndexed(short[] sArr, Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Short.valueOf(sArr[i5]));
            i5++;
            i6++;
        }
        return sArr;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final boolean[] onEachIndexed(boolean[] zArr, Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            action.invoke(Integer.valueOf(i6), Boolean.valueOf(zArr[i5]));
            i5++;
            i6++;
        }
        return zArr;
    }

    public static final Pair<List<Byte>, List<Byte>> partition(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b5 : bArr) {
            boolean booleanValue = predicate.invoke(Byte.valueOf(b5)).booleanValue();
            Byte valueOf = Byte.valueOf(b5);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Character>, List<Character>> partition(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c5 : cArr) {
            boolean booleanValue = predicate.invoke(Character.valueOf(c5)).booleanValue();
            Character valueOf = Character.valueOf(c5);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Double>, List<Double>> partition(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d5 : dArr) {
            boolean booleanValue = predicate.invoke(Double.valueOf(d5)).booleanValue();
            Double valueOf = Double.valueOf(d5);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Float>, List<Float>> partition(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f5 : fArr) {
            boolean booleanValue = predicate.invoke(Float.valueOf(f5)).booleanValue();
            Float valueOf = Float.valueOf(f5);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Integer>, List<Integer>> partition(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 : iArr) {
            boolean booleanValue = predicate.invoke(Integer.valueOf(i5)).booleanValue();
            Integer valueOf = Integer.valueOf(i5);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Long>, List<Long>> partition(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j5 : jArr) {
            boolean booleanValue = predicate.invoke(Long.valueOf(j5)).booleanValue();
            Long valueOf = Long.valueOf(j5);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> Pair<List<T>, List<T>> partition(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t4 : tArr) {
            if (predicate.invoke(t4).booleanValue()) {
                arrayList.add(t4);
            } else {
                arrayList2.add(t4);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Short>, List<Short>> partition(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s4 : sArr) {
            boolean booleanValue = predicate.invoke(Short.valueOf(s4)).booleanValue();
            Short valueOf = Short.valueOf(s4);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final Pair<List<Boolean>, List<Boolean>> partition(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z4 : zArr) {
            boolean booleanValue = predicate.invoke(Boolean.valueOf(z4)).booleanValue();
            Boolean valueOf = Boolean.valueOf(z4);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final byte random(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return random(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final byte random(byte[] bArr, Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[random.nextInt(bArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return random(cArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final char random(char[] cArr, Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[random.nextInt(cArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final double random(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return random(dArr, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final double random(double[] dArr, Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[random.nextInt(dArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final float random(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return random(fArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final float random(float[] fArr, Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[random.nextInt(fArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return random(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final int random(int[] iArr, Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[random.nextInt(iArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return random(jArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final long random(long[] jArr, Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[random.nextInt(jArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T random(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) random(tArr, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final <T> T random(T[] tArr, Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[random.nextInt(tArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final short random(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return random(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final short random(short[] sArr, Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[random.nextInt(sArr.length)];
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean random(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return random(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final boolean random(boolean[] zArr, Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[random.nextInt(zArr.length)];
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Boolean randomOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return randomOrNull(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Boolean randomOrNull(boolean[] zArr, Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.nextInt(zArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Byte randomOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return randomOrNull(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Byte randomOrNull(byte[] bArr, Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.nextInt(bArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return randomOrNull(cArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character randomOrNull(char[] cArr, Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.nextInt(cArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Double randomOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return randomOrNull(dArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Double randomOrNull(double[] dArr, Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.nextInt(dArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Float randomOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return randomOrNull(fArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Float randomOrNull(float[] fArr, Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.nextInt(fArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Integer randomOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return randomOrNull(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer randomOrNull(int[] iArr, Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.nextInt(iArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Long randomOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return randomOrNull(jArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Long randomOrNull(long[] jArr, Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.nextInt(jArr.length)]);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <T> T randomOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) randomOrNull(tArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T randomOrNull(T[] tArr, Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.nextInt(tArr.length)];
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Short randomOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return randomOrNull(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Short randomOrNull(short[] sArr, Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.nextInt(sArr.length)]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final byte reduce(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            b5 = operation.invoke(Byte.valueOf(b5), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduce(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            c5 = operation.invoke(Character.valueOf(c5), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final double reduce(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d5 = operation.invoke(Double.valueOf(d5), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float reduce(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f5 = operation.invoke(Float.valueOf(f5), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return f5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int reduce(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            i5 = operation.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final long reduce(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            j5 = operation.invoke(Long.valueOf(j5), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final <S, T extends S> S reduce(T[] tArr, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s4 = (S) tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            s4 = operation.invoke(s4, (Object) tArr[it.nextInt()]);
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final short reduce(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            s4 = operation.invoke(Short.valueOf(s4), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final boolean reduce(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            z4 = operation.invoke(Boolean.valueOf(z4), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final byte reduceIndexed(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            b5 = operation.invoke(Integer.valueOf(nextInt), Byte.valueOf(b5), Byte.valueOf(bArr[nextInt])).byteValue();
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final char reduceIndexed(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            c5 = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(c5), Character.valueOf(cArr[nextInt])).charValue();
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final double reduceIndexed(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            d5 = operation.invoke(Integer.valueOf(nextInt), Double.valueOf(d5), Double.valueOf(dArr[nextInt])).doubleValue();
        }
        return d5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float reduceIndexed(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            f5 = operation.invoke(Integer.valueOf(nextInt), Float.valueOf(f5), Float.valueOf(fArr[nextInt])).floatValue();
        }
        return f5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int reduceIndexed(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            i5 = operation.invoke(Integer.valueOf(nextInt), Integer.valueOf(i5), Integer.valueOf(iArr[nextInt])).intValue();
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final long reduceIndexed(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            j5 = operation.invoke(Integer.valueOf(nextInt), Long.valueOf(j5), Long.valueOf(jArr[nextInt])).longValue();
        }
        return j5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final <S, T extends S> S reduceIndexed(T[] tArr, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s4 = (S) tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s4 = operation.invoke(Integer.valueOf(nextInt), s4, (Object) tArr[nextInt]);
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final short reduceIndexed(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s4 = operation.invoke(Integer.valueOf(nextInt), Short.valueOf(s4), Short.valueOf(sArr[nextInt])).shortValue();
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final boolean reduceIndexed(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            z4 = operation.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z4), Boolean.valueOf(zArr[nextInt])).booleanValue();
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Boolean reduceIndexedOrNull(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            z4 = operation.invoke(Integer.valueOf(nextInt), Boolean.valueOf(z4), Boolean.valueOf(zArr[nextInt])).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Byte reduceIndexedOrNull(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            b5 = operation.invoke(Integer.valueOf(nextInt), Byte.valueOf(b5), Byte.valueOf(bArr[nextInt])).byteValue();
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Character reduceIndexedOrNull(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            c5 = operation.invoke(Integer.valueOf(nextInt), Character.valueOf(c5), Character.valueOf(cArr[nextInt])).charValue();
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Double reduceIndexedOrNull(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            d5 = operation.invoke(Integer.valueOf(nextInt), Double.valueOf(d5), Double.valueOf(dArr[nextInt])).doubleValue();
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Float reduceIndexedOrNull(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            f5 = operation.invoke(Integer.valueOf(nextInt), Float.valueOf(f5), Float.valueOf(fArr[nextInt])).floatValue();
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Integer reduceIndexedOrNull(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            i5 = operation.invoke(Integer.valueOf(nextInt), Integer.valueOf(i5), Integer.valueOf(iArr[nextInt])).intValue();
        }
        return Integer.valueOf(i5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Long reduceIndexedOrNull(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            j5 = operation.invoke(Integer.valueOf(nextInt), Long.valueOf(j5), Long.valueOf(jArr[nextInt])).longValue();
        }
        return Long.valueOf(j5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> S reduceIndexedOrNull(T[] tArr, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s4 = (S) tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s4 = operation.invoke(Integer.valueOf(nextInt), s4, (Object) tArr[nextInt]);
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    public static final Short reduceIndexedOrNull(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            s4 = operation.invoke(Integer.valueOf(nextInt), Short.valueOf(s4), Short.valueOf(sArr[nextInt])).shortValue();
        }
        return Short.valueOf(s4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Boolean reduceOrNull(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        ?? it = new IntRange(1, getLastIndex(zArr)).iterator();
        while (it.hasNext()) {
            z4 = operation.invoke(Boolean.valueOf(z4), Boolean.valueOf(zArr[it.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Byte reduceOrNull(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        ?? it = new IntRange(1, getLastIndex(bArr)).iterator();
        while (it.hasNext()) {
            b5 = operation.invoke(Byte.valueOf(b5), Byte.valueOf(bArr[it.nextInt()])).byteValue();
        }
        return Byte.valueOf(b5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character reduceOrNull(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        ?? it = new IntRange(1, getLastIndex(cArr)).iterator();
        while (it.hasNext()) {
            c5 = operation.invoke(Character.valueOf(c5), Character.valueOf(cArr[it.nextInt()])).charValue();
        }
        return Character.valueOf(c5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Double reduceOrNull(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        ?? it = new IntRange(1, getLastIndex(dArr)).iterator();
        while (it.hasNext()) {
            d5 = operation.invoke(Double.valueOf(d5), Double.valueOf(dArr[it.nextInt()])).doubleValue();
        }
        return Double.valueOf(d5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Float reduceOrNull(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        ?? it = new IntRange(1, getLastIndex(fArr)).iterator();
        while (it.hasNext()) {
            f5 = operation.invoke(Float.valueOf(f5), Float.valueOf(fArr[it.nextInt()])).floatValue();
        }
        return Float.valueOf(f5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer reduceOrNull(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        ?? it = new IntRange(1, getLastIndex(iArr)).iterator();
        while (it.hasNext()) {
            i5 = operation.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[it.nextInt()])).intValue();
        }
        return Integer.valueOf(i5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Long reduceOrNull(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        ?? it = new IntRange(1, getLastIndex(jArr)).iterator();
        while (it.hasNext()) {
            j5 = operation.invoke(Long.valueOf(j5), Long.valueOf(jArr[it.nextInt()])).longValue();
        }
        return Long.valueOf(j5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> S reduceOrNull(T[] tArr, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S s4 = (S) tArr[0];
        ?? it = new IntRange(1, getLastIndex(tArr)).iterator();
        while (it.hasNext()) {
            s4 = operation.invoke(s4, (Object) tArr[it.nextInt()]);
        }
        return s4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Short reduceOrNull(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        ?? it = new IntRange(1, getLastIndex(sArr)).iterator();
        while (it.hasNext()) {
            s4 = operation.invoke(Short.valueOf(s4), Short.valueOf(sArr[it.nextInt()])).shortValue();
        }
        return Short.valueOf(s4);
    }

    public static final byte reduceRight(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b5 = bArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            b5 = operation.invoke(Byte.valueOf(bArr[i5]), Byte.valueOf(b5)).byteValue();
        }
        return b5;
    }

    public static final char reduceRight(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c5 = cArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            c5 = operation.invoke(Character.valueOf(cArr[i5]), Character.valueOf(c5)).charValue();
        }
        return c5;
    }

    public static final double reduceRight(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d5 = dArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            d5 = operation.invoke(Double.valueOf(dArr[i5]), Double.valueOf(d5)).doubleValue();
        }
        return d5;
    }

    public static final float reduceRight(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f5 = fArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            f5 = operation.invoke(Float.valueOf(fArr[i5]), Float.valueOf(f5)).floatValue();
        }
        return f5;
    }

    public static final int reduceRight(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i5 = iArr[lastIndex];
        for (int i6 = lastIndex - 1; i6 >= 0; i6--) {
            i5 = operation.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(i5)).intValue();
        }
        return i5;
    }

    public static final long reduceRight(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j5 = jArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            j5 = operation.invoke(Long.valueOf(jArr[i5]), Long.valueOf(j5)).longValue();
        }
        return j5;
    }

    public static final <S, T extends S> S reduceRight(T[] tArr, Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s4 = (S) tArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke((Object) tArr[i5], s4);
        }
        return s4;
    }

    public static final short reduceRight(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s4 = sArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke(Short.valueOf(sArr[i5]), Short.valueOf(s4)).shortValue();
        }
        return s4;
    }

    public static final boolean reduceRight(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z4 = zArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            z4 = operation.invoke(Boolean.valueOf(zArr[i5]), Boolean.valueOf(z4)).booleanValue();
        }
        return z4;
    }

    public static final byte reduceRightIndexed(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b5 = bArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            b5 = operation.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i5]), Byte.valueOf(b5)).byteValue();
        }
        return b5;
    }

    public static final char reduceRightIndexed(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c5 = cArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            c5 = operation.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i5]), Character.valueOf(c5)).charValue();
        }
        return c5;
    }

    public static final double reduceRightIndexed(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d5 = dArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            d5 = operation.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i5]), Double.valueOf(d5)).doubleValue();
        }
        return d5;
    }

    public static final float reduceRightIndexed(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f5 = fArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            f5 = operation.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i5]), Float.valueOf(f5)).floatValue();
        }
        return f5;
    }

    public static final int reduceRightIndexed(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i5 = iArr[lastIndex];
        for (int i6 = lastIndex - 1; i6 >= 0; i6--) {
            i5 = operation.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(i5)).intValue();
        }
        return i5;
    }

    public static final long reduceRightIndexed(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j5 = jArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            j5 = operation.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i5]), Long.valueOf(j5)).longValue();
        }
        return j5;
    }

    public static final <S, T extends S> S reduceRightIndexed(T[] tArr, Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S s4 = (S) tArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke(Integer.valueOf(i5), (Object) tArr[i5], s4);
        }
        return s4;
    }

    public static final short reduceRightIndexed(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s4 = sArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i5]), Short.valueOf(s4)).shortValue();
        }
        return s4;
    }

    public static final boolean reduceRightIndexed(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z4 = zArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            z4 = operation.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i5]), Boolean.valueOf(z4)).booleanValue();
        }
        return z4;
    }

    @SinceKotlin(version = "1.4")
    public static final Boolean reduceRightIndexedOrNull(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean z4 = zArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            z4 = operation.invoke(Integer.valueOf(i5), Boolean.valueOf(zArr[i5]), Boolean.valueOf(z4)).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    public static final Byte reduceRightIndexedOrNull(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte b5 = bArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            b5 = operation.invoke(Integer.valueOf(i5), Byte.valueOf(bArr[i5]), Byte.valueOf(b5)).byteValue();
        }
        return Byte.valueOf(b5);
    }

    @SinceKotlin(version = "1.4")
    public static final Character reduceRightIndexedOrNull(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char c5 = cArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            c5 = operation.invoke(Integer.valueOf(i5), Character.valueOf(cArr[i5]), Character.valueOf(c5)).charValue();
        }
        return Character.valueOf(c5);
    }

    @SinceKotlin(version = "1.4")
    public static final Double reduceRightIndexedOrNull(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double d5 = dArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            d5 = operation.invoke(Integer.valueOf(i5), Double.valueOf(dArr[i5]), Double.valueOf(d5)).doubleValue();
        }
        return Double.valueOf(d5);
    }

    @SinceKotlin(version = "1.4")
    public static final Float reduceRightIndexedOrNull(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float f5 = fArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            f5 = operation.invoke(Integer.valueOf(i5), Float.valueOf(fArr[i5]), Float.valueOf(f5)).floatValue();
        }
        return Float.valueOf(f5);
    }

    @SinceKotlin(version = "1.4")
    public static final Integer reduceRightIndexedOrNull(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int i5 = iArr[lastIndex];
        for (int i6 = lastIndex - 1; i6 >= 0; i6--) {
            i5 = operation.invoke(Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(i5)).intValue();
        }
        return Integer.valueOf(i5);
    }

    @SinceKotlin(version = "1.4")
    public static final Long reduceRightIndexedOrNull(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long j5 = jArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            j5 = operation.invoke(Integer.valueOf(i5), Long.valueOf(jArr[i5]), Long.valueOf(j5)).longValue();
        }
        return Long.valueOf(j5);
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> S reduceRightIndexedOrNull(T[] tArr, Function3<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S s4 = (S) tArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke(Integer.valueOf(i5), (Object) tArr[i5], s4);
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    public static final Short reduceRightIndexedOrNull(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short s4 = sArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke(Integer.valueOf(i5), Short.valueOf(sArr[i5]), Short.valueOf(s4)).shortValue();
        }
        return Short.valueOf(s4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Boolean reduceRightOrNull(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean z4 = zArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            z4 = operation.invoke(Boolean.valueOf(zArr[i5]), Boolean.valueOf(z4)).booleanValue();
        }
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Byte reduceRightOrNull(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte b5 = bArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            b5 = operation.invoke(Byte.valueOf(bArr[i5]), Byte.valueOf(b5)).byteValue();
        }
        return Byte.valueOf(b5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character reduceRightOrNull(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char c5 = cArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            c5 = operation.invoke(Character.valueOf(cArr[i5]), Character.valueOf(c5)).charValue();
        }
        return Character.valueOf(c5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Double reduceRightOrNull(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double d5 = dArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            d5 = operation.invoke(Double.valueOf(dArr[i5]), Double.valueOf(d5)).doubleValue();
        }
        return Double.valueOf(d5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Float reduceRightOrNull(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float f5 = fArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            f5 = operation.invoke(Float.valueOf(fArr[i5]), Float.valueOf(f5)).floatValue();
        }
        return Float.valueOf(f5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer reduceRightOrNull(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int i5 = iArr[lastIndex];
        for (int i6 = lastIndex - 1; i6 >= 0; i6--) {
            i5 = operation.invoke(Integer.valueOf(iArr[i6]), Integer.valueOf(i5)).intValue();
        }
        return Integer.valueOf(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Long reduceRightOrNull(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long j5 = jArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            j5 = operation.invoke(Long.valueOf(jArr[i5]), Long.valueOf(j5)).longValue();
        }
        return Long.valueOf(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> S reduceRightOrNull(T[] tArr, Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S s4 = (S) tArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke((Object) tArr[i5], s4);
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Short reduceRightOrNull(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short s4 = sArr[lastIndex];
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            s4 = operation.invoke(Short.valueOf(sArr[i5]), Short.valueOf(s4)).shortValue();
        }
        return Short.valueOf(s4);
    }

    public static final <T> T[] requireNoNulls(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        for (T t4 : tArr) {
            if (t4 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + FilenameUtils.EXTENSION_SEPARATOR);
            }
        }
        return tArr;
    }

    public static void reverse(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(bArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            byte b5 = bArr[nextInt];
            bArr[nextInt] = bArr[lastIndex];
            bArr[lastIndex] = b5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(byte[] bArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, bArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            byte b5 = bArr[i5];
            bArr[i5] = bArr[i8];
            bArr[i8] = b5;
            i8--;
            i5++;
        }
    }

    public static final void reverse(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(cArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            char c5 = cArr[nextInt];
            cArr[nextInt] = cArr[lastIndex];
            cArr[lastIndex] = c5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(char[] cArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, cArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            char c5 = cArr[i5];
            cArr[i5] = cArr[i8];
            cArr[i8] = c5;
            i8--;
            i5++;
        }
    }

    public static final void reverse(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(dArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            double d5 = dArr[nextInt];
            dArr[nextInt] = dArr[lastIndex];
            dArr[lastIndex] = d5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(double[] dArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, dArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            double d5 = dArr[i5];
            dArr[i5] = dArr[i8];
            dArr[i8] = d5;
            i8--;
            i5++;
        }
    }

    public static final void reverse(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            float f5 = fArr[nextInt];
            fArr[nextInt] = fArr[lastIndex];
            fArr[lastIndex] = f5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(float[] fArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, fArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            float f5 = fArr[i5];
            fArr[i5] = fArr[i8];
            fArr[i8] = f5;
            i8--;
            i5++;
        }
    }

    public static void reverse(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(iArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            int i5 = iArr[nextInt];
            iArr[nextInt] = iArr[lastIndex];
            iArr[lastIndex] = i5;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(int[] iArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, iArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            int i9 = iArr[i5];
            iArr[i5] = iArr[i8];
            iArr[i8] = i9;
            i8--;
            i5++;
        }
    }

    public static void reverse(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(jArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            long j6 = jArr[nextInt];
            jArr[nextInt] = jArr[lastIndex];
            jArr[lastIndex] = j6;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(long[] jArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, jArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            long j5 = jArr[i5];
            jArr[i5] = jArr[i8];
            jArr[i8] = j5;
            i8--;
            i5++;
        }
    }

    public static final <T> void reverse(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            T t4 = tArr[nextInt];
            tArr[nextInt] = tArr[lastIndex];
            tArr[lastIndex] = t4;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void reverse(T[] tArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, tArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            T t4 = tArr[i5];
            tArr[i5] = tArr[i8];
            tArr[i8] = t4;
            i8--;
            i5++;
        }
    }

    public static void reverse(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(sArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            short s4 = sArr[nextInt];
            sArr[nextInt] = sArr[lastIndex];
            sArr[lastIndex] = s4;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static void reverse(short[] sArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, sArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            short s4 = sArr[i5];
            sArr[i5] = sArr[i8];
            sArr[i8] = s4;
            i8--;
            i5++;
        }
    }

    public static final void reverse(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        IntIterator j5 = d.j(0, length);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            boolean z4 = zArr[nextInt];
            zArr[nextInt] = zArr[lastIndex];
            zArr[lastIndex] = z4;
            lastIndex--;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void reverse(boolean[] zArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, zArr.length);
        int i7 = (i5 + i6) / 2;
        if (i5 == i7) {
            return;
        }
        int i8 = i6 - 1;
        while (i5 < i7) {
            boolean z4 = zArr[i5];
            zArr[i5] = zArr[i8];
            zArr[i8] = z4;
            i8--;
            i5++;
        }
    }

    public static final List<Byte> reversed(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Character> reversed(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Double> reversed(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Float> reversed(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Integer> reversed(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Long> reversed(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final <T> List<T> reversed(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Short> reversed(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final List<Boolean> reversed(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static byte[] reversedArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = getLastIndex(bArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            bArr2[lastIndex - nextInt] = bArr[nextInt];
        }
        return bArr2;
    }

    public static final char[] reversedArray(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            cArr2[lastIndex - nextInt] = cArr[nextInt];
        }
        return cArr2;
    }

    public static final double[] reversedArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            dArr2[lastIndex - nextInt] = dArr[nextInt];
        }
        return dArr2;
    }

    public static final float[] reversedArray(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            fArr2[lastIndex - nextInt] = fArr[nextInt];
        }
        return fArr2;
    }

    public static int[] reversedArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = getLastIndex(iArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            iArr2[lastIndex - nextInt] = iArr[nextInt];
        }
        return iArr2;
    }

    public static long[] reversedArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = getLastIndex(jArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            jArr2[lastIndex - nextInt] = jArr[nextInt];
        }
        return jArr2;
    }

    public static final <T> T[] reversedArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            tArr2[lastIndex - nextInt] = tArr[nextInt];
        }
        return tArr2;
    }

    public static short[] reversedArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = getLastIndex(sArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            sArr2[lastIndex - nextInt] = sArr[nextInt];
        }
        return sArr2;
    }

    public static final boolean[] reversedArray(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        IntIterator j5 = d.j(0, lastIndex);
        while (j5.hasNext()) {
            int nextInt = j5.nextInt();
            zArr2[lastIndex - nextInt] = zArr[nextInt];
        }
        return zArr2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(byte[] bArr, R r4, Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        for (byte b5 : bArr) {
            r4 = operation.invoke(r4, Byte.valueOf(b5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(char[] cArr, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        for (char c5 : cArr) {
            r4 = operation.invoke(r4, Character.valueOf(c5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(double[] dArr, R r4, Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        for (double d5 : dArr) {
            r4 = operation.invoke(r4, Double.valueOf(d5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(float[] fArr, R r4, Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        for (float f5 : fArr) {
            r4 = operation.invoke(r4, Float.valueOf(f5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(int[] iArr, R r4, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        for (int i5 : iArr) {
            r4 = operation.invoke(r4, Integer.valueOf(i5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(long[] jArr, R r4, Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        for (long j5 : jArr) {
            r4 = operation.invoke(r4, Long.valueOf(j5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    public static final <T, R> List<R> runningFold(T[] tArr, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        for (c cVar : tArr) {
            r4 = operation.invoke(r4, cVar);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(short[] sArr, R r4, Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        for (short s4 : sArr) {
            r4 = operation.invoke(r4, Short.valueOf(s4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFold(boolean[] zArr, R r4, Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        for (boolean z4 : zArr) {
            r4 = operation.invoke(r4, Boolean.valueOf(z4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(byte[] bArr, R r4, Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Byte.valueOf(bArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(char[] cArr, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        int length = cArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Character.valueOf(cArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(double[] dArr, R r4, Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Double.valueOf(dArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(float[] fArr, R r4, Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Float.valueOf(fArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(int[] iArr, R r4, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Integer.valueOf(iArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(long[] jArr, R r4, Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Long.valueOf(jArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    public static final <T, R> List<R> runningFoldIndexed(T[] tArr, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, tArr[i5]);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(short[] sArr, R r4, Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Short.valueOf(sArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <R> List<R> runningFoldIndexed(boolean[] zArr, R r4, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Boolean.valueOf(zArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Byte> runningReduce(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte b5 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b5));
        int length = bArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            b5 = operation.invoke(Byte.valueOf(b5), Byte.valueOf(bArr[i5])).byteValue();
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Character> runningReduce(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char c5 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c5));
        int length = cArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            c5 = operation.invoke(Character.valueOf(c5), Character.valueOf(cArr[i5])).charValue();
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Double> runningReduce(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double d5 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d5));
        int length = dArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            d5 = operation.invoke(Double.valueOf(d5), Double.valueOf(dArr[i5])).doubleValue();
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Float> runningReduce(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float f5 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f5));
        int length = fArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            f5 = operation.invoke(Float.valueOf(f5), Float.valueOf(fArr[i5])).floatValue();
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Integer> runningReduce(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i5 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i5));
        int length = iArr.length;
        for (int i6 = 1; i6 < length; i6++) {
            i5 = operation.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i6])).intValue();
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Long> runningReduce(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long j5 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j5));
        int length = jArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            j5 = operation.invoke(Long.valueOf(j5), Long.valueOf(jArr[i5])).longValue();
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <S, T extends S> List<S> runningReduce(T[] tArr, Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S s4 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s4);
        int length = tArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            s4 = operation.invoke(s4, (Object) tArr[i5]);
            arrayList.add(s4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Short> runningReduce(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short s4 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s4));
        int length = sArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            s4 = operation.invoke(Short.valueOf(s4), Short.valueOf(sArr[i5])).shortValue();
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Boolean> runningReduce(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z4 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z4));
        int length = zArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            z4 = operation.invoke(Boolean.valueOf(z4), Boolean.valueOf(zArr[i5])).booleanValue();
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Byte> runningReduceIndexed(byte[] bArr, Function3<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte b5 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b5));
        int length = bArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            b5 = operation.invoke(Integer.valueOf(i5), Byte.valueOf(b5), Byte.valueOf(bArr[i5])).byteValue();
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Character> runningReduceIndexed(char[] cArr, Function3<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char c5 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c5));
        int length = cArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            c5 = operation.invoke(Integer.valueOf(i5), Character.valueOf(c5), Character.valueOf(cArr[i5])).charValue();
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Double> runningReduceIndexed(double[] dArr, Function3<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double d5 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d5));
        int length = dArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            d5 = operation.invoke(Integer.valueOf(i5), Double.valueOf(d5), Double.valueOf(dArr[i5])).doubleValue();
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Float> runningReduceIndexed(float[] fArr, Function3<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float f5 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f5));
        int length = fArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            f5 = operation.invoke(Integer.valueOf(i5), Float.valueOf(f5), Float.valueOf(fArr[i5])).floatValue();
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Integer> runningReduceIndexed(int[] iArr, Function3<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i5 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i5));
        int length = iArr.length;
        for (int i6 = 1; i6 < length; i6++) {
            i5 = operation.invoke(Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(iArr[i6])).intValue();
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Long> runningReduceIndexed(long[] jArr, Function3<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long j5 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j5));
        int length = jArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            j5 = operation.invoke(Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(jArr[i5])).longValue();
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final <S, T extends S> List<S> runningReduceIndexed(T[] tArr, Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S s4 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s4);
        int length = tArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            s4 = operation.invoke(Integer.valueOf(i5), s4, (Object) tArr[i5]);
            arrayList.add(s4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Short> runningReduceIndexed(short[] sArr, Function3<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short s4 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s4));
        int length = sArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            s4 = operation.invoke(Integer.valueOf(i5), Short.valueOf(s4), Short.valueOf(sArr[i5])).shortValue();
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final List<Boolean> runningReduceIndexed(boolean[] zArr, Function3<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z4 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z4));
        int length = zArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            z4 = operation.invoke(Integer.valueOf(i5), Boolean.valueOf(z4), Boolean.valueOf(zArr[i5])).booleanValue();
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(byte[] bArr, R r4, Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        for (byte b5 : bArr) {
            r4 = operation.invoke(r4, Byte.valueOf(b5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(char[] cArr, R r4, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        for (char c5 : cArr) {
            r4 = operation.invoke(r4, Character.valueOf(c5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(double[] dArr, R r4, Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        for (double d5 : dArr) {
            r4 = operation.invoke(r4, Double.valueOf(d5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(float[] fArr, R r4, Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        for (float f5 : fArr) {
            r4 = operation.invoke(r4, Float.valueOf(f5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(int[] iArr, R r4, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        for (int i5 : iArr) {
            r4 = operation.invoke(r4, Integer.valueOf(i5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(long[] jArr, R r4, Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        for (long j5 : jArr) {
            r4 = operation.invoke(r4, Long.valueOf(j5));
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> List<R> scan(T[] tArr, R r4, Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        for (c cVar : tArr) {
            r4 = operation.invoke(r4, cVar);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(short[] sArr, R r4, Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        for (short s4 : sArr) {
            r4 = operation.invoke(r4, Short.valueOf(s4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scan(boolean[] zArr, R r4, Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        for (boolean z4 : zArr) {
            r4 = operation.invoke(r4, Boolean.valueOf(z4));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(byte[] bArr, R r4, Function3<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r4);
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Byte.valueOf(bArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(char[] cArr, R r4, Function3<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r4);
        int length = cArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Character.valueOf(cArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(double[] dArr, R r4, Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r4);
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Double.valueOf(dArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(float[] fArr, R r4, Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r4);
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Float.valueOf(fArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(int[] iArr, R r4, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r4);
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Integer.valueOf(iArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(long[] jArr, R r4, Function3<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r4);
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Long.valueOf(jArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> List<R> scanIndexed(T[] tArr, R r4, Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r4);
        int length = tArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, tArr[i5]);
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(short[] sArr, R r4, Function3<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r4);
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Short.valueOf(sArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <R> List<R> scanIndexed(boolean[] zArr, R r4, Function3<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r4);
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, Boolean.valueOf(zArr[i5]));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(byte[] bArr, Random random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte b5 = bArr[lastIndex];
            bArr[lastIndex] = bArr[nextInt];
            bArr[nextInt] = b5;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(char[] cArr, Random random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            char c5 = cArr[lastIndex];
            cArr[lastIndex] = cArr[nextInt];
            cArr[nextInt] = c5;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(double[] dArr, Random random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            double d5 = dArr[lastIndex];
            dArr[lastIndex] = dArr[nextInt];
            dArr[nextInt] = d5;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(float[] fArr, Random random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            float f5 = fArr[lastIndex];
            fArr[lastIndex] = fArr[nextInt];
            fArr[nextInt] = f5;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(int[] iArr, Random random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int i5 = iArr[lastIndex];
            iArr[lastIndex] = iArr[nextInt];
            iArr[nextInt] = i5;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(long[] jArr, Random random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long j5 = jArr[lastIndex];
            jArr[lastIndex] = jArr[nextInt];
            jArr[nextInt] = j5;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final <T> void shuffle(T[] tArr, Random random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            T t4 = tArr[lastIndex];
            tArr[lastIndex] = tArr[nextInt];
            tArr[nextInt] = t4;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (Random) Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(short[] sArr, Random random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short s4 = sArr[lastIndex];
            sArr[lastIndex] = sArr[nextInt];
            sArr[nextInt] = s4;
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    public static final void shuffle(boolean[] zArr, Random random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            boolean z4 = zArr[lastIndex];
            zArr[lastIndex] = zArr[nextInt];
            zArr[nextInt] = z4;
        }
    }

    public static byte single(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final byte single(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte b5 = null;
        boolean z4 = false;
        for (byte b6 : bArr) {
            if (predicate.invoke(Byte.valueOf(b6)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                b5 = Byte.valueOf(b6);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(b5, "null cannot be cast to non-null type kotlin.Byte");
        return b5.byteValue();
    }

    public static char single(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final char single(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                ch = Character.valueOf(c5);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
        return ch.charValue();
    }

    public static final double single(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final double single(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double d5 = null;
        boolean z4 = false;
        for (double d6 : dArr) {
            if (predicate.invoke(Double.valueOf(d6)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                d5 = Double.valueOf(d6);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(d5, "null cannot be cast to non-null type kotlin.Double");
        return d5.doubleValue();
    }

    public static final float single(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final float single(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float f5 = null;
        boolean z4 = false;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                f5 = Float.valueOf(f6);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(f5, "null cannot be cast to non-null type kotlin.Float");
        return f5.floatValue();
    }

    public static int single(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final int single(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer num = null;
        boolean z4 = false;
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                num = Integer.valueOf(i5);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
        return num.intValue();
    }

    public static long single(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final long single(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long l5 = null;
        boolean z4 = false;
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                l5 = Long.valueOf(j5);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(l5, "null cannot be cast to non-null type kotlin.Long");
        return l5.longValue();
    }

    public static final <T> T single(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final <T> T single(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t4 = null;
        boolean z4 = false;
        for (T t5 : tArr) {
            if (predicate.invoke(t5).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z4 = true;
                t4 = t5;
            }
        }
        if (z4) {
            return t4;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static short single(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final short single(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short sh = null;
        boolean z4 = false;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                sh = Short.valueOf(s4);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(sh, "null cannot be cast to non-null type kotlin.Short");
        return sh.shortValue();
    }

    public static final boolean single(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final boolean single(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean bool = null;
        boolean z4 = false;
        for (boolean z5 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z5)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bool = Boolean.valueOf(z5);
                z4 = true;
            }
        }
        if (!z4) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    public static final Boolean singleOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final Boolean singleOrNull(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean bool = null;
        boolean z4 = false;
        for (boolean z5 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z5)).booleanValue()) {
                if (z4) {
                    return null;
                }
                bool = Boolean.valueOf(z5);
                z4 = true;
            }
        }
        if (z4) {
            return bool;
        }
        return null;
    }

    public static final Byte singleOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final Byte singleOrNull(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte b5 = null;
        boolean z4 = false;
        for (byte b6 : bArr) {
            if (predicate.invoke(Byte.valueOf(b6)).booleanValue()) {
                if (z4) {
                    return null;
                }
                b5 = Byte.valueOf(b6);
                z4 = true;
            }
        }
        if (z4) {
            return b5;
        }
        return null;
    }

    public static final Character singleOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final Character singleOrNull(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z4 = false;
        for (char c5 : cArr) {
            if (predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                if (z4) {
                    return null;
                }
                ch = Character.valueOf(c5);
                z4 = true;
            }
        }
        if (z4) {
            return ch;
        }
        return null;
    }

    public static final Double singleOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final Double singleOrNull(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double d5 = null;
        boolean z4 = false;
        for (double d6 : dArr) {
            if (predicate.invoke(Double.valueOf(d6)).booleanValue()) {
                if (z4) {
                    return null;
                }
                d5 = Double.valueOf(d6);
                z4 = true;
            }
        }
        if (z4) {
            return d5;
        }
        return null;
    }

    public static final Float singleOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final Float singleOrNull(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float f5 = null;
        boolean z4 = false;
        for (float f6 : fArr) {
            if (predicate.invoke(Float.valueOf(f6)).booleanValue()) {
                if (z4) {
                    return null;
                }
                f5 = Float.valueOf(f6);
                z4 = true;
            }
        }
        if (z4) {
            return f5;
        }
        return null;
    }

    public static final Integer singleOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final Integer singleOrNull(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer num = null;
        boolean z4 = false;
        for (int i5 : iArr) {
            if (predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                if (z4) {
                    return null;
                }
                num = Integer.valueOf(i5);
                z4 = true;
            }
        }
        if (z4) {
            return num;
        }
        return null;
    }

    public static final Long singleOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final Long singleOrNull(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long l5 = null;
        boolean z4 = false;
        for (long j5 : jArr) {
            if (predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                if (z4) {
                    return null;
                }
                l5 = Long.valueOf(j5);
                z4 = true;
            }
        }
        if (z4) {
            return l5;
        }
        return null;
    }

    public static <T> T singleOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T singleOrNull(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t4 = null;
        boolean z4 = false;
        for (T t5 : tArr) {
            if (predicate.invoke(t5).booleanValue()) {
                if (z4) {
                    return null;
                }
                z4 = true;
                t4 = t5;
            }
        }
        if (z4) {
            return t4;
        }
        return null;
    }

    public static final Short singleOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final Short singleOrNull(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short sh = null;
        boolean z4 = false;
        for (short s4 : sArr) {
            if (predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                if (z4) {
                    return null;
                }
                sh = Short.valueOf(s4);
                z4 = true;
            }
        }
        if (z4) {
            return sh;
        }
        return null;
    }

    public static final List<Byte> slice(byte[] bArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Byte> slice(byte[] bArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Character> slice(char[] cArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Character> slice(char[] cArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Double> slice(double[] dArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Double> slice(double[] dArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Float> slice(float[] fArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Float> slice(float[] fArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Integer> slice(int[] iArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Integer> slice(int[] iArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Long> slice(long[] jArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Long> slice(long[] jArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final <T> List<T> slice(T[] tArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    public static final <T> List<T> slice(T[] tArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(tArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Short> slice(short[] sArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Short> slice(short[] sArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static final List<Boolean> slice(boolean[] zArr, Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final List<Boolean> slice(boolean[] zArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1)));
    }

    public static byte[] sliceArray(byte[] bArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            bArr2[i5] = bArr[it.next().intValue()];
            i5++;
        }
        return bArr2;
    }

    public static byte[] sliceArray(byte[] bArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static final char[] sliceArray(char[] cArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            cArr2[i5] = cArr[it.next().intValue()];
            i5++;
        }
        return cArr2;
    }

    public static final char[] sliceArray(char[] cArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new char[0] : ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static final double[] sliceArray(double[] dArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            dArr2[i5] = dArr[it.next().intValue()];
            i5++;
        }
        return dArr2;
    }

    public static final double[] sliceArray(double[] dArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new double[0] : ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static final float[] sliceArray(float[] fArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            fArr2[i5] = fArr[it.next().intValue()];
            i5++;
        }
        return fArr2;
    }

    public static final float[] sliceArray(float[] fArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new float[0] : ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static int[] sliceArray(int[] iArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr2[i5] = iArr[it.next().intValue()];
            i5++;
        }
        return iArr2;
    }

    public static int[] sliceArray(int[] iArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new int[0] : ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static long[] sliceArray(long[] jArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            jArr2[i5] = jArr[it.next().intValue()];
            i5++;
        }
        return jArr2;
    }

    public static long[] sliceArray(long[] jArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new long[0] : ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static final <T> T[] sliceArray(T[] tArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        T[] tArr2 = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            tArr2[i5] = tArr[it.next().intValue()];
            i5++;
        }
        return tArr2;
    }

    public static final <T> T[] sliceArray(T[] tArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, 0, 0) : (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static short[] sliceArray(short[] sArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            sArr2[i5] = sArr[it.next().intValue()];
            i5++;
        }
        return sArr2;
    }

    public static short[] sliceArray(short[] sArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new short[0] : ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static final boolean[] sliceArray(boolean[] zArr, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            zArr2[i5] = zArr[it.next().intValue()];
            i5++;
        }
        return zArr2;
    }

    public static final boolean[] sliceArray(boolean[] zArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.getStart().intValue(), androidx.activity.result.a.a(indices, 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
        }
    }

    public static final void sortDescending(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(bArr);
            reverse(bArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(byte[] bArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(bArr, i5, i6);
        reverse(bArr, i5, i6);
    }

    public static final void sortDescending(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(cArr);
            reverse(cArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(char[] cArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(cArr, i5, i6);
        reverse(cArr, i5, i6);
    }

    public static final void sortDescending(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(dArr);
            reverse(dArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(double[] dArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(dArr, i5, i6);
        reverse(dArr, i5, i6);
    }

    public static final void sortDescending(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(fArr);
            reverse(fArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(float[] fArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(fArr, i5, i6);
        reverse(fArr, i5, i6);
    }

    public static final void sortDescending(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(iArr);
            reverse(iArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(int[] iArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(iArr, i5, i6);
        reverse(iArr, i5, i6);
    }

    public static final void sortDescending(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(jArr);
            reverse(jArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(long[] jArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(jArr, i5, i6);
        reverse(jArr, i5, i6);
    }

    public static final <T extends Comparable<? super T>> void sortDescending(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(tArr, ComparisonsKt.reverseOrder());
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sortDescending(T[] tArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(tArr, ComparisonsKt.reverseOrder(), i5, i6);
    }

    public static final void sortDescending(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(sArr);
            reverse(sArr);
        }
    }

    @SinceKotlin(version = "1.4")
    public static final void sortDescending(short[] sArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(sArr, i5, i6);
        reverse(sArr, i5, i6);
    }

    public static final List<Byte> sorted(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Character> sorted(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Double> sorted(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Float> sorted(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Integer> sorted(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Long> sorted(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final <T extends Comparable<? super T>> List<T> sorted(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return ArraysKt___ArraysJvmKt.asList(sortedArray(tArr));
    }

    public static final List<Short> sorted(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final byte[] sortedArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final char[] sortedArray(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final double[] sortedArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final float[] sortedArray(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final int[] sortedArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final long[] sortedArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final <T extends Comparable<? super T>> T[] sortedArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        ArraysKt___ArraysJvmKt.sort((Object[]) tArr2);
        return tArr2;
    }

    public static final short[] sortedArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return copyOf;
    }

    public static final byte[] sortedArrayDescending(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final char[] sortedArrayDescending(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final double[] sortedArrayDescending(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final float[] sortedArrayDescending(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final int[] sortedArrayDescending(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final long[] sortedArrayDescending(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        ArraysKt___ArraysJvmKt.sortWith(tArr2, ComparisonsKt.reverseOrder());
        return tArr2;
    }

    public static final short[] sortedArrayDescending(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        sortDescending(copyOf);
        return copyOf;
    }

    public static final <T> T[] sortedArrayWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sortWith(tArr2, comparator);
        return tArr2;
    }

    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Character> sortedBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Double> sortedBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Float> sortedBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Long> sortedBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Short> sortedBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    public static final List<Byte> sortedDescending(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Character> sortedDescending(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Double> sortedDescending(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Float> sortedDescending(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Integer> sortedDescending(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Long> sortedDescending(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return sortedWith(tArr, ComparisonsKt.reverseOrder());
    }

    public static final List<Short> sortedDescending(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        ArraysKt___ArraysJvmKt.sort(copyOf);
        return reversed(copyOf);
    }

    public static final List<Byte> sortedWith(byte[] bArr, Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Character> sortedWith(char[] cArr, Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Double> sortedWith(double[] dArr, Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Float> sortedWith(float[] fArr, Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Integer> sortedWith(int[] iArr, Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Long> sortedWith(long[] jArr, Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static <T> List<T> sortedWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysJvmKt.asList(sortedArrayWith(tArr, comparator));
    }

    public static final List<Short> sortedWith(short[] sArr, Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final List<Boolean> sortedWith(boolean[] zArr, Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(zArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final Set<Byte> subtract(byte[] bArr, Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Character> subtract(char[] cArr, Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Double> subtract(double[] dArr, Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Float> subtract(float[] fArr, Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Integer> subtract(int[] iArr, Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Long> subtract(long[] jArr, Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> Set<T> subtract(T[] tArr, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Short> subtract(short[] sArr, Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Boolean> subtract(boolean[] zArr, Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final double sum(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        for (double d6 : dArr) {
            d5 += d6;
        }
        return d5;
    }

    public static final float sum(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f5 = 0.0f;
        for (float f6 : fArr) {
            f5 += f6;
        }
        return f5;
    }

    public static final int sum(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i5 = 0;
        for (byte b5 : bArr) {
            i5 += b5;
        }
        return i5;
    }

    public static int sum(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        return i5;
    }

    public static final int sum(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int i5 = 0;
        for (short s4 : sArr) {
            i5 += s4;
        }
        return i5;
    }

    public static long sum(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long j5 = 0;
        for (long j6 : jArr) {
            j5 += j6;
        }
        return j5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(byte[] bArr, Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (byte b5 : bArr) {
            i5 += selector.invoke(Byte.valueOf(b5)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(char[] cArr, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (char c5 : cArr) {
            i5 += selector.invoke(Character.valueOf(c5)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(double[] dArr, Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (double d5 : dArr) {
            i5 += selector.invoke(Double.valueOf(d5)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(float[] fArr, Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (float f5 : fArr) {
            i5 += selector.invoke(Float.valueOf(f5)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(int[] iArr, Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += selector.invoke(Integer.valueOf(i6)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(long[] jArr, Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (long j5 : jArr) {
            i5 += selector.invoke(Long.valueOf(j5)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> int sumBy(T[] tArr, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (T t4 : tArr) {
            i5 += selector.invoke(t4).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(short[] sArr, Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (short s4 : sArr) {
            i5 += selector.invoke(Short.valueOf(s4)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final int sumBy(boolean[] zArr, Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (boolean z4 : zArr) {
            i5 += selector.invoke(Boolean.valueOf(z4)).intValue();
        }
        return i5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (byte b5 : bArr) {
            d5 += selector.invoke(Byte.valueOf(b5)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (char c5 : cArr) {
            d5 += selector.invoke(Character.valueOf(c5)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (double d6 : dArr) {
            d5 += selector.invoke(Double.valueOf(d6)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (float f5 : fArr) {
            d5 += selector.invoke(Float.valueOf(f5)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i5 : iArr) {
            d5 += selector.invoke(Integer.valueOf(i5)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (long j5 : jArr) {
            d5 += selector.invoke(Long.valueOf(j5)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final <T> double sumByDouble(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (T t4 : tArr) {
            d5 += selector.invoke(t4).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (short s4 : sArr) {
            d5 += selector.invoke(Short.valueOf(s4)).doubleValue();
        }
        return d5;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final double sumByDouble(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (boolean z4 : zArr) {
            d5 += selector.invoke(Boolean.valueOf(z4)).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i5 = 0;
        for (Byte b5 : bArr) {
            i5 += b5.byteValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (byte b5 : bArr) {
            d5 += selector.invoke(Byte.valueOf(b5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (char c5 : cArr) {
            d5 += selector.invoke(Character.valueOf(c5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (double d6 : dArr) {
            d5 += selector.invoke(Double.valueOf(d6)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (float f5 : fArr) {
            d5 += selector.invoke(Float.valueOf(f5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (int i5 : iArr) {
            d5 += selector.invoke(Integer.valueOf(i5)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (long j5 : jArr) {
            d5 += selector.invoke(Long.valueOf(j5)).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d5 = 0.0d;
        for (Double d6 : dArr) {
            d5 += d6.doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final <T> double sumOfDouble(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (T t4 : tArr) {
            d5 += selector.invoke(t4).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (short s4 : sArr) {
            d5 += selector.invoke(Short.valueOf(s4)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double d5 = 0.0d;
        for (boolean z4 : zArr) {
            d5 += selector.invoke(Boolean.valueOf(z4)).doubleValue();
        }
        return d5;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f5 = 0.0f;
        for (Float f6 : fArr) {
            f5 += f6.floatValue();
        }
        return f5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(byte[] bArr, Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (byte b5 : bArr) {
            i5 += selector.invoke(Byte.valueOf(b5)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(char[] cArr, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (char c5 : cArr) {
            i5 += selector.invoke(Character.valueOf(c5)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(double[] dArr, Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (double d5 : dArr) {
            i5 += selector.invoke(Double.valueOf(d5)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(float[] fArr, Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (float f5 : fArr) {
            i5 += selector.invoke(Float.valueOf(f5)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(int[] iArr, Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += selector.invoke(Integer.valueOf(i6)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(long[] jArr, Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (long j5 : jArr) {
            i5 += selector.invoke(Long.valueOf(j5)).intValue();
        }
        return i5;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int i5 = 0;
        for (Integer num : numArr) {
            i5 += num.intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final <T> int sumOfInt(T[] tArr, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (T t4 : tArr) {
            i5 += selector.invoke(t4).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(short[] sArr, Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (short s4 : sArr) {
            i5 += selector.invoke(Short.valueOf(s4)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(boolean[] zArr, Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int i5 = 0;
        for (boolean z4 : zArr) {
            i5 += selector.invoke(Boolean.valueOf(z4)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(byte[] bArr, Function1<? super Byte, Long> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (byte b5 : bArr) {
            j5 += selector.invoke(Byte.valueOf(b5)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(char[] cArr, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (char c5 : cArr) {
            j5 += selector.invoke(Character.valueOf(c5)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(double[] dArr, Function1<? super Double, Long> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (double d5 : dArr) {
            j5 += selector.invoke(Double.valueOf(d5)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(float[] fArr, Function1<? super Float, Long> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (float f5 : fArr) {
            j5 += selector.invoke(Float.valueOf(f5)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(int[] iArr, Function1<? super Integer, Long> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (int i5 : iArr) {
            j5 += selector.invoke(Integer.valueOf(i5)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(long[] jArr, Function1<? super Long, Long> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (long j6 : jArr) {
            j5 += selector.invoke(Long.valueOf(j6)).longValue();
        }
        return j5;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        long j5 = 0;
        for (Long l5 : lArr) {
            j5 += l5.longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final <T> long sumOfLong(T[] tArr, Function1<? super T, Long> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (T t4 : tArr) {
            j5 += selector.invoke(t4).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(short[] sArr, Function1<? super Short, Long> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (short s4 : sArr) {
            j5 += selector.invoke(Short.valueOf(s4)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(boolean[] zArr, Function1<? super Boolean, Long> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long j5 = 0;
        for (boolean z4 : zArr) {
            j5 += selector.invoke(Boolean.valueOf(z4)).longValue();
        }
        return j5;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int i5 = 0;
        for (Short sh : shArr) {
            i5 += sh.shortValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(byte[] bArr, Function1<? super Byte, UInt> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (byte b5 : bArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Byte.valueOf(b5)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(char[] cArr, Function1<? super Character, UInt> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (char c5 : cArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Character.valueOf(c5)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(double[] dArr, Function1<? super Double, UInt> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (double d5 : dArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Double.valueOf(d5)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(float[] fArr, Function1<? super Float, UInt> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (float f5 : fArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Float.valueOf(f5)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(int[] iArr, Function1<? super Integer, UInt> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (int i5 : iArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Integer.valueOf(i5)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(long[] jArr, Function1<? super Long, UInt> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (long j5 : jArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Long.valueOf(j5)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> int sumOfUInt(T[] tArr, Function1<? super T, UInt> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (T t4 : tArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(t4), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(short[] sArr, Function1<? super Short, UInt> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (short s4 : sArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Short.valueOf(s4)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(boolean[] zArr, Function1<? super Boolean, UInt> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        for (boolean z4 : zArr) {
            m110constructorimpl = androidx.appcompat.view.a.c(selector.invoke(Boolean.valueOf(z4)), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(byte[] bArr, Function1<? super Byte, ULong> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (byte b5 : bArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Byte.valueOf(b5)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(char[] cArr, Function1<? super Character, ULong> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (char c5 : cArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Character.valueOf(c5)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(double[] dArr, Function1<? super Double, ULong> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (double d5 : dArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Double.valueOf(d5)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(float[] fArr, Function1<? super Float, ULong> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (float f5 : fArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Float.valueOf(f5)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(int[] iArr, Function1<? super Integer, ULong> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (int i5 : iArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Integer.valueOf(i5)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(long[] jArr, Function1<? super Long, ULong> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (long j5 : jArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Long.valueOf(j5)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final <T> long sumOfULong(T[] tArr, Function1<? super T, ULong> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (T t4 : tArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(t4).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(short[] sArr, Function1<? super Short, ULong> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (short s4 : sArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Short.valueOf(s4)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(boolean[] zArr, Function1<? super Boolean, ULong> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        for (boolean z4 : zArr) {
            m188constructorimpl = ULong.m188constructorimpl(selector.invoke(Boolean.valueOf(z4)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    public static final List<Byte> take(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= bArr.length) {
            return toList(bArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (byte b5 : bArr) {
            arrayList.add(Byte.valueOf(b5));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Character> take(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= cArr.length) {
            return toList(cArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (char c5 : cArr) {
            arrayList.add(Character.valueOf(c5));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Double> take(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= dArr.length) {
            return toList(dArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (double d5 : dArr) {
            arrayList.add(Double.valueOf(d5));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Float> take(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= fArr.length) {
            return toList(fArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (float f5 : fArr) {
            arrayList.add(Float.valueOf(f5));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Integer> take(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= iArr.length) {
            return toList(iArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Long> take(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= jArr.length) {
            return toList(jArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (long j5 : jArr) {
            arrayList.add(Long.valueOf(j5));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> take(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= tArr.length) {
            return toList(tArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (T t4 : tArr) {
            arrayList.add(t4);
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Short> take(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= sArr.length) {
            return toList(sArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Boolean> take(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i5 >= zArr.length) {
            return toList(zArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i5);
        int i6 = 0;
        for (boolean z4 : zArr) {
            arrayList.add(Boolean.valueOf(z4));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    public static final List<Byte> takeLast(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = bArr.length;
        if (i5 >= length) {
            return toList(bArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Byte.valueOf(bArr[i6]));
        }
        return arrayList;
    }

    public static final List<Character> takeLast(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = cArr.length;
        if (i5 >= length) {
            return toList(cArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Character.valueOf(cArr[i6]));
        }
        return arrayList;
    }

    public static final List<Double> takeLast(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = dArr.length;
        if (i5 >= length) {
            return toList(dArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Double.valueOf(dArr[i6]));
        }
        return arrayList;
    }

    public static final List<Float> takeLast(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = fArr.length;
        if (i5 >= length) {
            return toList(fArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Float.valueOf(fArr[i6]));
        }
        return arrayList;
    }

    public static final List<Integer> takeLast(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = iArr.length;
        if (i5 >= length) {
            return toList(iArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Integer.valueOf(iArr[i6]));
        }
        return arrayList;
    }

    public static final List<Long> takeLast(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = jArr.length;
        if (i5 >= length) {
            return toList(jArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Long.valueOf(jArr[i6]));
        }
        return arrayList;
    }

    public static final <T> List<T> takeLast(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = tArr.length;
        if (i5 >= length) {
            return toList(tArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(tArr[i6]);
        }
        return arrayList;
    }

    public static final List<Short> takeLast(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = sArr.length;
        if (i5 >= length) {
            return toList(sArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Short.valueOf(sArr[i6]));
        }
        return arrayList;
    }

    public static final List<Boolean> takeLast(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = zArr.length;
        if (i5 >= length) {
            return toList(zArr);
        }
        if (i5 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = length - i5; i6 < length; i6++) {
            arrayList.add(Boolean.valueOf(zArr[i6]));
        }
        return arrayList;
    }

    public static final List<Byte> takeLastWhile(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    public static final List<Character> takeLastWhile(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    public static final List<Double> takeLastWhile(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    public static final List<Float> takeLastWhile(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    public static final List<Integer> takeLastWhile(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    public static final List<Long> takeLastWhile(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    public static final <T> List<T> takeLastWhile(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return drop(tArr, lastIndex + 1);
            }
        }
        return toList(tArr);
    }

    public static final List<Short> takeLastWhile(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    public static final List<Boolean> takeLastWhile(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    public static final List<Byte> takeWhile(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b5 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b5)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    public static final List<Character> takeWhile(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c5 : cArr) {
            if (!predicate.invoke(Character.valueOf(c5)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    public static final List<Double> takeWhile(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d5 : dArr) {
            if (!predicate.invoke(Double.valueOf(d5)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    public static final List<Float> takeWhile(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f5 : fArr) {
            if (!predicate.invoke(Float.valueOf(f5)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    public static final List<Integer> takeWhile(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i5)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    public static final List<Long> takeWhile(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j5 : jArr) {
            if (!predicate.invoke(Long.valueOf(j5)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    public static final <T> List<T> takeWhile(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t4 : tArr) {
            if (!predicate.invoke(t4).booleanValue()) {
                break;
            }
            arrayList.add(t4);
        }
        return arrayList;
    }

    public static final List<Short> takeWhile(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s4 : sArr) {
            if (!predicate.invoke(Short.valueOf(s4)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public static final List<Boolean> takeWhile(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z4 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z4)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    public static final boolean[] toBooleanArray(Boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zArr[i5] = boolArr[i5].booleanValue();
        }
        return zArr;
    }

    public static final byte[] toByteArray(Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            bArr2[i5] = bArr[i5].byteValue();
        }
        return bArr2;
    }

    public static final char[] toCharArray(Character[] chArr) {
        Intrinsics.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i5 = 0; i5 < length; i5++) {
            cArr[i5] = chArr[i5].charValue();
        }
        return cArr;
    }

    public static final <C extends Collection<? super Byte>> C toCollection(byte[] bArr, C destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (byte b5 : bArr) {
            destination.add(Byte.valueOf(b5));
        }
        return destination;
    }

    public static final <C extends Collection<? super Character>> C toCollection(char[] cArr, C destination) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (char c5 : cArr) {
            destination.add(Character.valueOf(c5));
        }
        return destination;
    }

    public static final <C extends Collection<? super Double>> C toCollection(double[] dArr, C destination) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (double d5 : dArr) {
            destination.add(Double.valueOf(d5));
        }
        return destination;
    }

    public static final <C extends Collection<? super Float>> C toCollection(float[] fArr, C destination) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (float f5 : fArr) {
            destination.add(Float.valueOf(f5));
        }
        return destination;
    }

    public static final <C extends Collection<? super Integer>> C toCollection(int[] iArr, C destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i5 : iArr) {
            destination.add(Integer.valueOf(i5));
        }
        return destination;
    }

    public static final <C extends Collection<? super Long>> C toCollection(long[] jArr, C destination) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (long j5 : jArr) {
            destination.add(Long.valueOf(j5));
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t4 : tArr) {
            destination.add(t4);
        }
        return destination;
    }

    public static final <C extends Collection<? super Short>> C toCollection(short[] sArr, C destination) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (short s4 : sArr) {
            destination.add(Short.valueOf(s4));
        }
        return destination;
    }

    public static final <C extends Collection<? super Boolean>> C toCollection(boolean[] zArr, C destination) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (boolean z4 : zArr) {
            destination.add(Boolean.valueOf(z4));
        }
        return destination;
    }

    public static final double[] toDoubleArray(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i5 = 0; i5 < length; i5++) {
            dArr2[i5] = dArr[i5].doubleValue();
        }
        return dArr2;
    }

    public static final float[] toFloatArray(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i5 = 0; i5 < length; i5++) {
            fArr2[i5] = fArr[i5].floatValue();
        }
        return fArr2;
    }

    public static final HashSet<Byte> toHashSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (HashSet) toCollection(bArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(bArr.length)));
    }

    public static final HashSet<Character> toHashSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (HashSet) toCollection(cArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(RangesKt.coerceAtMost(cArr.length, 128))));
    }

    public static final HashSet<Double> toHashSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (HashSet) toCollection(dArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(dArr.length)));
    }

    public static final HashSet<Float> toHashSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (HashSet) toCollection(fArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(fArr.length)));
    }

    public static final HashSet<Integer> toHashSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (HashSet) toCollection(iArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length)));
    }

    public static final HashSet<Long> toHashSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (HashSet) toCollection(jArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(jArr.length)));
    }

    public static final <T> HashSet<T> toHashSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (HashSet) toCollection(tArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(tArr.length)));
    }

    public static final HashSet<Short> toHashSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (HashSet) toCollection(sArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(sArr.length)));
    }

    public static final HashSet<Boolean> toHashSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (HashSet) toCollection(zArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(zArr.length)));
    }

    public static final int[] toIntArray(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
        return iArr;
    }

    public static final List<Byte> toList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? toMutableList(bArr) : CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Character> toList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? toMutableList(cArr) : CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Double> toList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? toMutableList(dArr) : CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Float> toList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? toMutableList(fArr) : CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Integer> toList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? toMutableList(iArr) : CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Long> toList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? toMutableList(jArr) : CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static <T> List<T> toList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? toMutableList(tArr) : CollectionsKt__CollectionsJVMKt.listOf(tArr[0]) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Short> toList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? toMutableList(sArr) : CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Boolean> toList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? toMutableList(zArr) : CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0])) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final long[] toLongArray(Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            jArr[i5] = lArr[i5].longValue();
        }
        return jArr;
    }

    public static final List<Byte> toMutableList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b5 : bArr) {
            arrayList.add(Byte.valueOf(b5));
        }
        return arrayList;
    }

    public static final List<Character> toMutableList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c5 : cArr) {
            arrayList.add(Character.valueOf(c5));
        }
        return arrayList;
    }

    public static final List<Double> toMutableList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d5 : dArr) {
            arrayList.add(Double.valueOf(d5));
        }
        return arrayList;
    }

    public static final List<Float> toMutableList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f5 : fArr) {
            arrayList.add(Float.valueOf(f5));
        }
        return arrayList;
    }

    public static final List<Integer> toMutableList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i5 : iArr) {
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    public static final List<Long> toMutableList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j5 : jArr) {
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    public static <T> List<T> toMutableList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    public static final List<Short> toMutableList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public static final List<Boolean> toMutableList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z4 : zArr) {
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    public static final Set<Byte> toMutableSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (Set) toCollection(bArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(bArr.length)));
    }

    public static final Set<Character> toMutableSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (Set) toCollection(cArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(RangesKt.coerceAtMost(cArr.length, 128))));
    }

    public static final Set<Double> toMutableSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (Set) toCollection(dArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(dArr.length)));
    }

    public static final Set<Float> toMutableSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (Set) toCollection(fArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(fArr.length)));
    }

    public static final Set<Integer> toMutableSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (Set) toCollection(iArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length)));
    }

    public static final Set<Long> toMutableSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (Set) toCollection(jArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(jArr.length)));
    }

    public static final <T> Set<T> toMutableSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (Set) toCollection(tArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(tArr.length)));
    }

    public static final Set<Short> toMutableSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (Set) toCollection(sArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(sArr.length)));
    }

    public static final Set<Boolean> toMutableSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (Set) toCollection(zArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(zArr.length)));
    }

    public static final Set<Byte> toSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(bArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(bArr.length))) : SetsKt__SetsJVMKt.setOf(Byte.valueOf(bArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Character> toSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(cArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(RangesKt.coerceAtMost(cArr.length, 128)))) : SetsKt__SetsJVMKt.setOf(Character.valueOf(cArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Double> toSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(dArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(dArr.length))) : SetsKt__SetsJVMKt.setOf(Double.valueOf(dArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Float> toSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(fArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(fArr.length))) : SetsKt__SetsJVMKt.setOf(Float.valueOf(fArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Integer> toSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(iArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length))) : SetsKt__SetsJVMKt.setOf(Integer.valueOf(iArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Long> toSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(jArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(jArr.length))) : SetsKt__SetsJVMKt.setOf(Long.valueOf(jArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final <T> Set<T> toSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(tArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(tArr.length))) : SetsKt__SetsJVMKt.setOf(tArr[0]) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Short> toSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(sArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(sArr.length))) : SetsKt__SetsJVMKt.setOf(Short.valueOf(sArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final Set<Boolean> toSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? (Set) toCollection(zArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(zArr.length))) : SetsKt__SetsJVMKt.setOf(Boolean.valueOf(zArr[0])) : SetsKt__SetsKt.emptySet();
    }

    public static final short[] toShortArray(Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i5 = 0; i5 < length; i5++) {
            sArr[i5] = shArr[i5].shortValue();
        }
        return sArr;
    }

    public static final Set<Byte> union(byte[] bArr, Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Character> union(char[] cArr, Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Double> union(double[] dArr, Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Float> union(float[] fArr, Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Integer> union(int[] iArr, Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Long> union(long[] jArr, Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> Set<T> union(T[] tArr, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Short> union(short[] sArr, Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Set<Boolean> union(boolean[] zArr, Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final Iterable<IndexedValue<Byte>> withIndex(final byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Byte>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Byte> invoke() {
                return ArrayIteratorsKt.iterator(bArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Character>> withIndex(final char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Character>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Character> invoke() {
                return ArrayIteratorsKt.iterator(cArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Double>> withIndex(final double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Double>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Double> invoke() {
                return ArrayIteratorsKt.iterator(dArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Float>> withIndex(final float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Float>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Float> invoke() {
                return ArrayIteratorsKt.iterator(fArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Integer>> withIndex(final int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Integer>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Integer> invoke() {
                return ArrayIteratorsKt.iterator(iArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Long>> withIndex(final long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Long>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Long> invoke() {
                return ArrayIteratorsKt.iterator(jArr);
            }
        });
    }

    public static final <T> Iterable<IndexedValue<T>> withIndex(final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends T>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<T> invoke() {
                return ArrayIteratorKt.iterator(tArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Short>> withIndex(final short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Short>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Short> invoke() {
                return ArrayIteratorsKt.iterator(sArr);
            }
        });
    }

    public static final Iterable<IndexedValue<Boolean>> withIndex(final boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IndexingIterable(new Function0<Iterator<? extends Boolean>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends Boolean> invoke() {
                return ArrayIteratorsKt.iterator(zArr);
            }
        });
    }

    public static final <R> List<Pair<Byte, R>> zip(byte[] bArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(byte[] bArr, Iterable<? extends R> other, Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final List<Pair<Byte, Byte>> zip(byte[] bArr, byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i5]), Byte.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(byte[] bArr, byte[] other, Function2<? super Byte, ? super Byte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i5]), Byte.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Byte, R>> zip(byte[] bArr, R[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            byte b5 = bArr[i5];
            arrayList.add(TuplesKt.to(Byte.valueOf(b5), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(byte[] bArr, R[] other, Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Character, R>> zip(char[] cArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(char[] cArr, Iterable<? extends R> other, Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final List<Pair<Character, Character>> zip(char[] cArr, char[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i5]), Character.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(char[] cArr, char[] other, Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i5]), Character.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Character, R>> zip(char[] cArr, R[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            char c5 = cArr[i5];
            arrayList.add(TuplesKt.to(Character.valueOf(c5), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(char[] cArr, R[] other, Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Double, R>> zip(double[] dArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(double[] dArr, Iterable<? extends R> other, Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final List<Pair<Double, Double>> zip(double[] dArr, double[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i5]), Double.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(double[] dArr, double[] other, Function2<? super Double, ? super Double, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i5]), Double.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Double, R>> zip(double[] dArr, R[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            double d5 = dArr[i5];
            arrayList.add(TuplesKt.to(Double.valueOf(d5), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(double[] dArr, R[] other, Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Float, R>> zip(float[] fArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(float[] fArr, Iterable<? extends R> other, Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final List<Pair<Float, Float>> zip(float[] fArr, float[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i5]), Float.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(float[] fArr, float[] other, Function2<? super Float, ? super Float, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i5]), Float.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Float, R>> zip(float[] fArr, R[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            float f5 = fArr[i5];
            arrayList.add(TuplesKt.to(Float.valueOf(f5), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(float[] fArr, R[] other, Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Integer, R>> zip(int[] iArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(int[] iArr, Iterable<? extends R> other, Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final List<Pair<Integer, Integer>> zip(int[] iArr, int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i5]), Integer.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(int[] iArr, int[] other, Function2<? super Integer, ? super Integer, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Integer, R>> zip(int[] iArr, R[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = iArr[i5];
            arrayList.add(TuplesKt.to(Integer.valueOf(i6), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(int[] iArr, R[] other, Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Long, R>> zip(long[] jArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(long[] jArr, Iterable<? extends R> other, Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final List<Pair<Long, Long>> zip(long[] jArr, long[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i5]), Long.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(long[] jArr, long[] other, Function2<? super Long, ? super Long, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i5]), Long.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Long, R>> zip(long[] jArr, R[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            long j5 = jArr[i5];
            arrayList.add(TuplesKt.to(Long.valueOf(j5), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(long[] jArr, R[] other, Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(T[] tArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(tArr[i5], r4));
            i5++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R, V> List<V> zip(T[] tArr, Iterable<? extends R> other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i5], r4));
            i5++;
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(T[] tArr, R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(tArr[i5], other[i5]));
        }
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(T[] tArr, R[] other, Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(tArr[i5], other[i5]));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Short, R>> zip(short[] sArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(short[] sArr, Iterable<? extends R> other, Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R> List<Pair<Short, R>> zip(short[] sArr, R[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            short s4 = sArr[i5];
            arrayList.add(TuplesKt.to(Short.valueOf(s4), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(short[] sArr, R[] other, Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final List<Pair<Short, Short>> zip(short[] sArr, short[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i5]), Short.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(short[] sArr, short[] other, Function2<? super Short, ? super Short, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i5]), Short.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <R> List<Pair<Boolean, R>> zip(boolean[] zArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(boolean[] zArr, Iterable<? extends R> other, Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i5]), r4));
            i5++;
        }
        return arrayList;
    }

    public static final <R> List<Pair<Boolean, R>> zip(boolean[] zArr, R[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            boolean z4 = zArr[i5];
            arrayList.add(TuplesKt.to(Boolean.valueOf(z4), other[i5]));
        }
        return arrayList;
    }

    public static final <R, V> List<V> zip(boolean[] zArr, R[] other, Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i5]), other[i5]));
        }
        return arrayList;
    }

    public static final List<Pair<Boolean, Boolean>> zip(boolean[] zArr, boolean[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i5]), Boolean.valueOf(other[i5])));
        }
        return arrayList;
    }

    public static final <V> List<V> zip(boolean[] zArr, boolean[] other, Function2<? super Boolean, ? super Boolean, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i5]), Boolean.valueOf(other[i5])));
        }
        return arrayList;
    }
}
