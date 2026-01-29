package kotlin.collections.unsigned;

import androidx.activity.d;
import androidx.appcompat.view.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.UArraySortingKt;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-JOV_ifY, reason: not valid java name */
    private static final boolean m535allJOV_ifY(byte[] all, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(all);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            if (!((Boolean) a.e(all, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-MShoTSo, reason: not valid java name */
    private static final boolean m536allMShoTSo(long[] all, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(all);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            if (!((Boolean) androidx.appcompat.widget.a.f(all, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-jgv0xPQ, reason: not valid java name */
    private static final boolean m537alljgv0xPQ(int[] all, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(all);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            if (!((Boolean) androidx.activity.result.a.c(all, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: all-xTcfx_M, reason: not valid java name */
    private static final boolean m538allxTcfx_M(short[] all, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(all, "$this$all");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(all);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            if (!((Boolean) androidx.appcompat.graphics.drawable.a.b(all, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any--ajY-9A, reason: not valid java name */
    private static final boolean m539anyajY9A(int[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-GBYM_sE, reason: not valid java name */
    private static final boolean m540anyGBYM_sE(byte[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-JOV_ifY, reason: not valid java name */
    private static final boolean m541anyJOV_ifY(byte[] any, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(any);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            if (((Boolean) a.e(any, i5, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-MShoTSo, reason: not valid java name */
    private static final boolean m542anyMShoTSo(long[] any, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(any);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            if (((Boolean) androidx.appcompat.widget.a.f(any, i5, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-QwZRm1k, reason: not valid java name */
    private static final boolean m543anyQwZRm1k(long[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-jgv0xPQ, reason: not valid java name */
    private static final boolean m544anyjgv0xPQ(int[] any, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(any);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            if (((Boolean) androidx.activity.result.a.c(any, i5, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-rL5Bavg, reason: not valid java name */
    private static final boolean m545anyrL5Bavg(short[] any) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        return ArraysKt.any(any);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: any-xTcfx_M, reason: not valid java name */
    private static final boolean m546anyxTcfx_M(short[] any, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(any, "$this$any");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(any);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            if (((Boolean) androidx.appcompat.graphics.drawable.a.b(any, i5, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m547asByteArrayGBYM_sE(byte[] asByteArray) {
        Intrinsics.checkNotNullParameter(asByteArray, "$this$asByteArray");
        return asByteArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m548asIntArrayajY9A(int[] asIntArray) {
        Intrinsics.checkNotNullParameter(asIntArray, "$this$asIntArray");
        return asIntArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m549asLongArrayQwZRm1k(long[] asLongArray) {
        Intrinsics.checkNotNullParameter(asLongArray, "$this$asLongArray");
        return asLongArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: asShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m550asShortArrayrL5Bavg(short[] asShortArray) {
        Intrinsics.checkNotNullParameter(asShortArray, "$this$asShortArray");
        return asShortArray;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] asUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return UByteArray.m86constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] asUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return UIntArray.m164constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] asULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ULongArray.m242constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] asUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return UShortArray.m346constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-JOV_ifY, reason: not valid java name */
    private static final <V> Map<UByte, V> m551associateWithJOV_ifY(byte[] associateWith, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UByteArray.m92getSizeimpl(associateWith)), 16));
        int m92getSizeimpl = UByteArray.m92getSizeimpl(associateWith);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(associateWith, i5);
            linkedHashMap.put(UByte.m28boximpl(m91getw2LRezQ), valueSelector.invoke(UByte.m28boximpl(m91getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-MShoTSo, reason: not valid java name */
    private static final <V> Map<ULong, V> m552associateWithMShoTSo(long[] associateWith, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(ULongArray.m248getSizeimpl(associateWith)), 16));
        int m248getSizeimpl = ULongArray.m248getSizeimpl(associateWith);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(associateWith, i5);
            linkedHashMap.put(ULong.m182boximpl(m247getsVKNKU), valueSelector.invoke(ULong.m182boximpl(m247getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-jgv0xPQ, reason: not valid java name */
    private static final <V> Map<UInt, V> m553associateWithjgv0xPQ(int[] associateWith, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UIntArray.m170getSizeimpl(associateWith)), 16));
        int m170getSizeimpl = UIntArray.m170getSizeimpl(associateWith);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(associateWith, i5);
            linkedHashMap.put(UInt.m104boximpl(m169getpVg5ArA), valueSelector.invoke(UInt.m104boximpl(m169getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWith-xTcfx_M, reason: not valid java name */
    private static final <V> Map<UShort, V> m554associateWithxTcfx_M(short[] associateWith, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWith, "$this$associateWith");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(UShortArray.m352getSizeimpl(associateWith)), 16));
        int m352getSizeimpl = UShortArray.m352getSizeimpl(associateWith);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(associateWith, i5);
            linkedHashMap.put(UShort.m288boximpl(m351getMh2AYeg), valueSelector.invoke(UShort.m288boximpl(m351getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-4D70W2E, reason: not valid java name */
    private static final <V, M extends Map<? super UInt, ? super V>> M m555associateWithTo4D70W2E(int[] associateWithTo, M destination, Function1<? super UInt, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(associateWithTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(associateWithTo, i5);
            destination.put(UInt.m104boximpl(m169getpVg5ArA), valueSelector.invoke(UInt.m104boximpl(m169getpVg5ArA)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-H21X9dk, reason: not valid java name */
    private static final <V, M extends Map<? super UByte, ? super V>> M m556associateWithToH21X9dk(byte[] associateWithTo, M destination, Function1<? super UByte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(associateWithTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(associateWithTo, i5);
            destination.put(UByte.m28boximpl(m91getw2LRezQ), valueSelector.invoke(UByte.m28boximpl(m91getw2LRezQ)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-X6OPwNk, reason: not valid java name */
    private static final <V, M extends Map<? super ULong, ? super V>> M m557associateWithToX6OPwNk(long[] associateWithTo, M destination, Function1<? super ULong, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(associateWithTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(associateWithTo, i5);
            destination.put(ULong.m182boximpl(m247getsVKNKU), valueSelector.invoke(ULong.m182boximpl(m247getsVKNKU)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: associateWithTo-ciTST-8, reason: not valid java name */
    private static final <V, M extends Map<? super UShort, ? super V>> M m558associateWithTociTST8(short[] associateWithTo, M destination, Function1<? super UShort, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(associateWithTo, "$this$associateWithTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(associateWithTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(associateWithTo, i5);
            destination.put(UShort.m288boximpl(m351getMh2AYeg), valueSelector.invoke(UShort.m288boximpl(m351getMh2AYeg)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1--ajY-9A, reason: not valid java name */
    private static final int m559component1ajY9A(int[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UIntArray.m169getpVg5ArA(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1-GBYM_sE, reason: not valid java name */
    private static final byte m560component1GBYM_sE(byte[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UByteArray.m91getw2LRezQ(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1-QwZRm1k, reason: not valid java name */
    private static final long m561component1QwZRm1k(long[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return ULongArray.m247getsVKNKU(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component1-rL5Bavg, reason: not valid java name */
    private static final short m562component1rL5Bavg(short[] component1) {
        Intrinsics.checkNotNullParameter(component1, "$this$component1");
        return UShortArray.m351getMh2AYeg(component1, 0);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2--ajY-9A, reason: not valid java name */
    private static final int m563component2ajY9A(int[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UIntArray.m169getpVg5ArA(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2-GBYM_sE, reason: not valid java name */
    private static final byte m564component2GBYM_sE(byte[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UByteArray.m91getw2LRezQ(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2-QwZRm1k, reason: not valid java name */
    private static final long m565component2QwZRm1k(long[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return ULongArray.m247getsVKNKU(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component2-rL5Bavg, reason: not valid java name */
    private static final short m566component2rL5Bavg(short[] component2) {
        Intrinsics.checkNotNullParameter(component2, "$this$component2");
        return UShortArray.m351getMh2AYeg(component2, 1);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3--ajY-9A, reason: not valid java name */
    private static final int m567component3ajY9A(int[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UIntArray.m169getpVg5ArA(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3-GBYM_sE, reason: not valid java name */
    private static final byte m568component3GBYM_sE(byte[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UByteArray.m91getw2LRezQ(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3-QwZRm1k, reason: not valid java name */
    private static final long m569component3QwZRm1k(long[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return ULongArray.m247getsVKNKU(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component3-rL5Bavg, reason: not valid java name */
    private static final short m570component3rL5Bavg(short[] component3) {
        Intrinsics.checkNotNullParameter(component3, "$this$component3");
        return UShortArray.m351getMh2AYeg(component3, 2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4--ajY-9A, reason: not valid java name */
    private static final int m571component4ajY9A(int[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UIntArray.m169getpVg5ArA(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4-GBYM_sE, reason: not valid java name */
    private static final byte m572component4GBYM_sE(byte[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UByteArray.m91getw2LRezQ(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4-QwZRm1k, reason: not valid java name */
    private static final long m573component4QwZRm1k(long[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return ULongArray.m247getsVKNKU(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component4-rL5Bavg, reason: not valid java name */
    private static final short m574component4rL5Bavg(short[] component4) {
        Intrinsics.checkNotNullParameter(component4, "$this$component4");
        return UShortArray.m351getMh2AYeg(component4, 3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5--ajY-9A, reason: not valid java name */
    private static final int m575component5ajY9A(int[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UIntArray.m169getpVg5ArA(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5-GBYM_sE, reason: not valid java name */
    private static final byte m576component5GBYM_sE(byte[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UByteArray.m91getw2LRezQ(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5-QwZRm1k, reason: not valid java name */
    private static final long m577component5QwZRm1k(long[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return ULongArray.m247getsVKNKU(component5, 4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: component5-rL5Bavg, reason: not valid java name */
    private static final short m578component5rL5Bavg(short[] component5) {
        Intrinsics.checkNotNullParameter(component5, "$this$component5");
        return UShortArray.m351getMh2AYeg(component5, 4);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m579contentEqualsFGO6Aew(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m580contentEqualsKJPZfPQ(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-ctEhBpI, reason: not valid java name */
    public static final /* synthetic */ boolean m581contentEqualsctEhBpI(int[] contentEquals, int[] other) {
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        return m580contentEqualsKJPZfPQ(contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m582contentEqualskV0jMPg(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-kdPth3s, reason: not valid java name */
    public static final /* synthetic */ boolean m583contentEqualskdPth3s(byte[] contentEquals, byte[] other) {
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        return m582contentEqualskV0jMPg(contentEquals, other);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m584contentEqualslec5QzE(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-mazbYpA, reason: not valid java name */
    public static final /* synthetic */ boolean m585contentEqualsmazbYpA(short[] contentEquals, short[] other) {
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        return m579contentEqualsFGO6Aew(contentEquals, other);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentEquals-us8wMrg, reason: not valid java name */
    public static final /* synthetic */ boolean m586contentEqualsus8wMrg(long[] contentEquals, long[] other) {
        Intrinsics.checkNotNullParameter(contentEquals, "$this$contentEquals");
        Intrinsics.checkNotNullParameter(other, "other");
        return m584contentEqualslec5QzE(contentEquals, other);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ int m587contentHashCodeajY9A(int[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m591contentHashCodeXUkPCBk(contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-2csIQuQ, reason: not valid java name */
    public static final int m588contentHashCode2csIQuQ(byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ int m589contentHashCodeGBYM_sE(byte[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m588contentHashCode2csIQuQ(contentHashCode);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ int m590contentHashCodeQwZRm1k(long[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m594contentHashCodeuLth9ew(contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-XUkPCBk, reason: not valid java name */
    public static final int m591contentHashCodeXUkPCBk(int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-d-6D3K8, reason: not valid java name */
    public static final int m592contentHashCoded6D3K8(short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentHashCode-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ int m593contentHashCoderL5Bavg(short[] contentHashCode) {
        Intrinsics.checkNotNullParameter(contentHashCode, "$this$contentHashCode");
        return m592contentHashCoded6D3K8(contentHashCode);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: contentHashCode-uLth9ew, reason: not valid java name */
    public static final int m594contentHashCodeuLth9ew(long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ String m595contentToStringajY9A(int[] contentToString) {
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        return m599contentToStringXUkPCBk(contentToString);
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r6 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.UByteArray.m84boximpl(r6), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m596contentToString2csIQuQ(byte[] r6) {
        /*
            if (r6 == 0) goto L15
            kotlin.UByteArray r0 = kotlin.UByteArray.m84boximpl(r6)
            r4 = 0
            r5 = 56
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r6 = kotlin.collections.CollectionsKt.e(r0, r1, r2, r3, r4, r5)
            if (r6 != 0) goto L17
        L15:
            java.lang.String r6 = "null"
        L17:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m596contentToString2csIQuQ(byte[]):java.lang.String");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ String m597contentToStringGBYM_sE(byte[] contentToString) {
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        return m596contentToString2csIQuQ(contentToString);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ String m598contentToStringQwZRm1k(long[] contentToString) {
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        return m602contentToStringuLth9ew(contentToString);
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r6 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.UIntArray.m162boximpl(r6), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m599contentToStringXUkPCBk(int[] r6) {
        /*
            if (r6 == 0) goto L15
            kotlin.UIntArray r0 = kotlin.UIntArray.m162boximpl(r6)
            r4 = 0
            r5 = 56
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r6 = kotlin.collections.CollectionsKt.e(r0, r1, r2, r3, r4, r5)
            if (r6 != 0) goto L17
        L15:
            java.lang.String r6 = "null"
        L17:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m599contentToStringXUkPCBk(int[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r6 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.UShortArray.m344boximpl(r6), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m600contentToStringd6D3K8(short[] r6) {
        /*
            if (r6 == 0) goto L15
            kotlin.UShortArray r0 = kotlin.UShortArray.m344boximpl(r6)
            r4 = 0
            r5 = 56
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r6 = kotlin.collections.CollectionsKt.e(r0, r1, r2, r3, r4, r5)
            if (r6 != 0) goto L17
        L15:
            java.lang.String r6 = "null"
        L17:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m600contentToStringd6D3K8(short[]):java.lang.String");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    /* renamed from: contentToString-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ String m601contentToStringrL5Bavg(short[] contentToString) {
        Intrinsics.checkNotNullParameter(contentToString, "$this$contentToString");
        return m600contentToStringd6D3K8(contentToString);
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r6 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(kotlin.ULongArray.m240boximpl(r6), ", ", "[", "]", 0, null, null, 56, null);
     */
    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.ExperimentalUnsignedTypes
    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m602contentToStringuLth9ew(long[] r6) {
        /*
            if (r6 == 0) goto L15
            kotlin.ULongArray r0 = kotlin.ULongArray.m240boximpl(r6)
            r4 = 0
            r5 = 56
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r6 = kotlin.collections.CollectionsKt.e(r0, r1, r2, r3, r4, r5)
            if (r6 != 0) goto L17
        L15:
            java.lang.String r6 = "null"
        L17:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.unsigned.UArraysKt___UArraysKt.m602contentToStringuLth9ew(long[]):java.lang.String");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto--B0-L2c, reason: not valid java name */
    private static final long[] m603copyIntoB0L2c(long[] copyInto, long[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    /* renamed from: copyInto--B0-L2c$default, reason: not valid java name */
    public static /* synthetic */ long[] m604copyIntoB0L2c$default(long[] copyInto, long[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = ULongArray.m248getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto-9-ak10g, reason: not valid java name */
    private static final short[] m605copyInto9ak10g(short[] copyInto, short[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    /* renamed from: copyInto-9-ak10g$default, reason: not valid java name */
    public static /* synthetic */ short[] m606copyInto9ak10g$default(short[] copyInto, short[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = UShortArray.m352getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto-FUQE5sA, reason: not valid java name */
    private static final byte[] m607copyIntoFUQE5sA(byte[] copyInto, byte[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    /* renamed from: copyInto-FUQE5sA$default, reason: not valid java name */
    public static /* synthetic */ byte[] m608copyIntoFUQE5sA$default(byte[] copyInto, byte[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = UByteArray.m92getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyInto-sIZ3KeM, reason: not valid java name */
    private static final int[] m609copyIntosIZ3KeM(int[] copyInto, int[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    /* renamed from: copyInto-sIZ3KeM$default, reason: not valid java name */
    public static /* synthetic */ int[] m610copyIntosIZ3KeM$default(int[] copyInto, int[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = UIntArray.m170getSizeimpl(copyInto);
        }
        Intrinsics.checkNotNullParameter(copyInto, "$this$copyInto");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ArraysKt.copyInto(copyInto, destination, i5, i6, i7);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf--ajY-9A, reason: not valid java name */
    private static final int[] m611copyOfajY9A(int[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return UIntArray.m164constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m612copyOfGBYM_sE(byte[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return UByteArray.m86constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-PpDY95g, reason: not valid java name */
    private static final byte[] m613copyOfPpDY95g(byte[] copyOf, int i5) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        byte[] copyOf2 = Arrays.copyOf(copyOf, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return UByteArray.m86constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-QwZRm1k, reason: not valid java name */
    private static final long[] m614copyOfQwZRm1k(long[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return ULongArray.m242constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-nggk6HY, reason: not valid java name */
    private static final short[] m615copyOfnggk6HY(short[] copyOf, int i5) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return UShortArray.m346constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-qFRl0hI, reason: not valid java name */
    private static final int[] m616copyOfqFRl0hI(int[] copyOf, int i5) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        int[] copyOf2 = Arrays.copyOf(copyOf, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return UIntArray.m164constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-r7IrZao, reason: not valid java name */
    private static final long[] m617copyOfr7IrZao(long[] copyOf, int i5) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        long[] copyOf2 = Arrays.copyOf(copyOf, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return ULongArray.m242constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOf-rL5Bavg, reason: not valid java name */
    private static final short[] m618copyOfrL5Bavg(short[] copyOf) {
        Intrinsics.checkNotNullParameter(copyOf, "$this$copyOf");
        short[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        return UShortArray.m346constructorimpl(copyOf2);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange--nroSd4, reason: not valid java name */
    private static final long[] m619copyOfRangenroSd4(long[] copyOfRange, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return ULongArray.m242constructorimpl(ArraysKt.copyOfRange(copyOfRange, i5, i6));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange-4UcCI2c, reason: not valid java name */
    private static final byte[] m620copyOfRange4UcCI2c(byte[] copyOfRange, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return UByteArray.m86constructorimpl(ArraysKt.copyOfRange(copyOfRange, i5, i6));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange-Aa5vz7o, reason: not valid java name */
    private static final short[] m621copyOfRangeAa5vz7o(short[] copyOfRange, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return UShortArray.m346constructorimpl(ArraysKt.copyOfRange(copyOfRange, i5, i6));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: copyOfRange-oBK06Vg, reason: not valid java name */
    private static final int[] m622copyOfRangeoBK06Vg(int[] copyOfRange, int i5, int i6) {
        Intrinsics.checkNotNullParameter(copyOfRange, "$this$copyOfRange");
        return UIntArray.m164constructorimpl(ArraysKt.copyOfRange(copyOfRange, i5, i6));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-JOV_ifY, reason: not valid java name */
    private static final int m623countJOV_ifY(byte[] count, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(count);
        int i5 = 0;
        for (int i6 = 0; i6 < m92getSizeimpl; i6++) {
            if (((Boolean) a.e(count, i6, predicate)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-MShoTSo, reason: not valid java name */
    private static final int m624countMShoTSo(long[] count, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(count);
        int i5 = 0;
        for (int i6 = 0; i6 < m248getSizeimpl; i6++) {
            if (((Boolean) androidx.appcompat.widget.a.f(count, i6, predicate)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-jgv0xPQ, reason: not valid java name */
    private static final int m625countjgv0xPQ(int[] count, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(count);
        int i5 = 0;
        for (int i6 = 0; i6 < m170getSizeimpl; i6++) {
            if (((Boolean) androidx.activity.result.a.c(count, i6, predicate)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: count-xTcfx_M, reason: not valid java name */
    private static final int m626countxTcfx_M(short[] count, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(count, "$this$count");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(count);
        int i5 = 0;
        for (int i6 = 0; i6 < m352getSizeimpl; i6++) {
            if (((Boolean) androidx.appcompat.graphics.drawable.a.b(count, i6, predicate)).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: drop-PpDY95g, reason: not valid java name */
    public static final List<UByte> m627dropPpDY95g(byte[] drop, int i5) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i5 >= 0) {
            return m1155takeLastPpDY95g(drop, RangesKt.coerceAtLeast(UByteArray.m92getSizeimpl(drop) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: drop-nggk6HY, reason: not valid java name */
    public static final List<UShort> m628dropnggk6HY(short[] drop, int i5) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i5 >= 0) {
            return m1156takeLastnggk6HY(drop, RangesKt.coerceAtLeast(UShortArray.m352getSizeimpl(drop) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: drop-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m629dropqFRl0hI(int[] drop, int i5) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i5 >= 0) {
            return m1157takeLastqFRl0hI(drop, RangesKt.coerceAtLeast(UIntArray.m170getSizeimpl(drop) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: drop-r7IrZao, reason: not valid java name */
    public static final List<ULong> m630dropr7IrZao(long[] drop, int i5) {
        Intrinsics.checkNotNullParameter(drop, "$this$drop");
        if (i5 >= 0) {
            return m1158takeLastr7IrZao(drop, RangesKt.coerceAtLeast(ULongArray.m248getSizeimpl(drop) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: dropLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m631dropLastPpDY95g(byte[] dropLast, int i5) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i5 >= 0) {
            return m1151takePpDY95g(dropLast, RangesKt.coerceAtLeast(UByteArray.m92getSizeimpl(dropLast) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: dropLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m632dropLastnggk6HY(short[] dropLast, int i5) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i5 >= 0) {
            return m1152takenggk6HY(dropLast, RangesKt.coerceAtLeast(UShortArray.m352getSizeimpl(dropLast) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: dropLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m633dropLastqFRl0hI(int[] dropLast, int i5) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i5 >= 0) {
            return m1153takeqFRl0hI(dropLast, RangesKt.coerceAtLeast(UIntArray.m170getSizeimpl(dropLast) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: dropLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m634dropLastr7IrZao(long[] dropLast, int i5) {
        Intrinsics.checkNotNullParameter(dropLast, "$this$dropLast");
        if (i5 >= 0) {
            return m1154taker7IrZao(dropLast, RangesKt.coerceAtLeast(ULongArray.m248getSizeimpl(dropLast) - i5, 0));
        }
        throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m635dropLastWhileJOV_ifY(byte[] dropLastWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) a.e(dropLastWhile, lastIndex, predicate)).booleanValue()) {
                return m1151takePpDY95g(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m636dropLastWhileMShoTSo(long[] dropLastWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.appcompat.widget.a.f(dropLastWhile, lastIndex, predicate)).booleanValue()) {
                return m1154taker7IrZao(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m637dropLastWhilejgv0xPQ(int[] dropLastWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.activity.result.a.c(dropLastWhile, lastIndex, predicate)).booleanValue()) {
                return m1153takeqFRl0hI(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m638dropLastWhilexTcfx_M(short[] dropLastWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropLastWhile, "$this$dropLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(dropLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.appcompat.graphics.drawable.a.b(dropLastWhile, lastIndex, predicate)).booleanValue()) {
                return m1152takenggk6HY(dropLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m639dropWhileJOV_ifY(byte[] dropWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(dropWhile, i5);
            if (z4) {
                arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
            } else if (!predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m640dropWhileMShoTSo(long[] dropWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(dropWhile, i5);
            if (z4) {
                arrayList.add(ULong.m182boximpl(m247getsVKNKU));
            } else if (!predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m182boximpl(m247getsVKNKU));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m641dropWhilejgv0xPQ(int[] dropWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(dropWhile, i5);
            if (z4) {
                arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
            } else if (!predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: dropWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m642dropWhilexTcfx_M(short[] dropWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dropWhile, "$this$dropWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(dropWhile);
        boolean z4 = false;
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(dropWhile, i5);
            if (z4) {
                arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
            } else if (!predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
                z4 = true;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-CVVdw08, reason: not valid java name */
    private static final short m643elementAtOrElseCVVdw08(short[] elementAtOrElse, int i5, Function1<? super Integer, UShort> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m343unboximpl() : UShortArray.m351getMh2AYeg(elementAtOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-QxvSvLU, reason: not valid java name */
    private static final int m644elementAtOrElseQxvSvLU(int[] elementAtOrElse, int i5, Function1<? super Integer, UInt> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m161unboximpl() : UIntArray.m169getpVg5ArA(elementAtOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m645elementAtOrElseXw8i6dc(long[] elementAtOrElse, int i5, Function1<? super Integer, ULong> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m239unboximpl() : ULongArray.m247getsVKNKU(elementAtOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m646elementAtOrElsecOVybQ(byte[] elementAtOrElse, int i5, Function1<? super Integer, UByte> defaultValue) {
        Intrinsics.checkNotNullParameter(elementAtOrElse, "$this$elementAtOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(elementAtOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m83unboximpl() : UByteArray.m91getw2LRezQ(elementAtOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-PpDY95g, reason: not valid java name */
    private static final UByte m647elementAtOrNullPpDY95g(byte[] elementAtOrNull, int i5) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m767getOrNullPpDY95g(elementAtOrNull, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-nggk6HY, reason: not valid java name */
    private static final UShort m648elementAtOrNullnggk6HY(short[] elementAtOrNull, int i5) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m768getOrNullnggk6HY(elementAtOrNull, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-qFRl0hI, reason: not valid java name */
    private static final UInt m649elementAtOrNullqFRl0hI(int[] elementAtOrNull, int i5) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m769getOrNullqFRl0hI(elementAtOrNull, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAtOrNull-r7IrZao, reason: not valid java name */
    private static final ULong m650elementAtOrNullr7IrZao(long[] elementAtOrNull, int i5) {
        Intrinsics.checkNotNullParameter(elementAtOrNull, "$this$elementAtOrNull");
        return m770getOrNullr7IrZao(elementAtOrNull, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-2fe2U9s, reason: not valid java name */
    public static final void m651fill2fe2U9s(int[] fill, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, i5, i6, i7);
    }

    /* renamed from: fill-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ void m652fill2fe2U9s$default(int[] iArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = UIntArray.m170getSizeimpl(iArr);
        }
        m651fill2fe2U9s(iArr, i5, i6, i7);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-EtDCXyQ, reason: not valid java name */
    public static final void m653fillEtDCXyQ(short[] fill, short s4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, s4, i5, i6);
    }

    /* renamed from: fill-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ void m654fillEtDCXyQ$default(short[] sArr, short s4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = UShortArray.m352getSizeimpl(sArr);
        }
        m653fillEtDCXyQ(sArr, s4, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-K6DWlUc, reason: not valid java name */
    public static final void m655fillK6DWlUc(long[] fill, long j5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, j5, i5, i6);
    }

    /* renamed from: fill-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ void m656fillK6DWlUc$default(long[] jArr, long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = ULongArray.m248getSizeimpl(jArr);
        }
        m655fillK6DWlUc(jArr, j5, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: fill-WpHrYlw, reason: not valid java name */
    public static final void m657fillWpHrYlw(byte[] fill, byte b5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        ArraysKt.fill(fill, b5, i5, i6);
    }

    /* renamed from: fill-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ void m658fillWpHrYlw$default(byte[] bArr, byte b5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = UByteArray.m92getSizeimpl(bArr);
        }
        m657fillWpHrYlw(bArr, b5, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m659filterJOV_ifY(byte[] filter, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(filter);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(filter, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-MShoTSo, reason: not valid java name */
    private static final List<ULong> m660filterMShoTSo(long[] filter, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(filter);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(filter, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m182boximpl(m247getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m661filterjgv0xPQ(int[] filter, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(filter);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(filter, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filter-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m662filterxTcfx_M(short[] filter, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(filter);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(filter, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-ELGow60, reason: not valid java name */
    private static final List<UByte> m663filterIndexedELGow60(byte[] filterIndexed, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(filterIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(filterIndexed, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-WyvcNBI, reason: not valid java name */
    private static final List<UInt> m664filterIndexedWyvcNBI(int[] filterIndexed, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(filterIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(filterIndexed, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-s8dVfGU, reason: not valid java name */
    private static final List<ULong> m665filterIndexeds8dVfGU(long[] filterIndexed, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(filterIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(filterIndexed, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m182boximpl(m247getsVKNKU));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexed-xzaTVY8, reason: not valid java name */
    private static final List<UShort> m666filterIndexedxzaTVY8(short[] filterIndexed, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexed, "$this$filterIndexed");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(filterIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(filterIndexed, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
            }
            i5++;
            i6 = i7;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo--6EtJGI, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m667filterIndexedTo6EtJGI(int[] filterIndexedTo, C destination, Function2<? super Integer, ? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(filterIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(filterIndexedTo, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m104boximpl(m169getpVg5ArA));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m668filterIndexedToQqktQ3k(short[] filterIndexedTo, C destination, Function2<? super Integer, ? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(filterIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(filterIndexedTo, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m288boximpl(m351getMh2AYeg));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m669filterIndexedToeNpIKz8(byte[] filterIndexedTo, C destination, Function2<? super Integer, ? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(filterIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(filterIndexedTo, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m28boximpl(m91getw2LRezQ));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m670filterIndexedTope2Q0Dw(long[] filterIndexedTo, C destination, Function2<? super Integer, ? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterIndexedTo, "$this$filterIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(filterIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(filterIndexedTo, i5);
            int i7 = i6 + 1;
            if (predicate.invoke(Integer.valueOf(i6), ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                destination.add(ULong.m182boximpl(m247getsVKNKU));
            }
            i5++;
            i6 = i7;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m671filterNotJOV_ifY(byte[] filterNot, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(filterNot);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(filterNot, i5);
            if (!predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-MShoTSo, reason: not valid java name */
    private static final List<ULong> m672filterNotMShoTSo(long[] filterNot, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(filterNot);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(filterNot, i5);
            if (!predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                arrayList.add(ULong.m182boximpl(m247getsVKNKU));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m673filterNotjgv0xPQ(int[] filterNot, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(filterNot);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(filterNot, i5);
            if (!predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNot-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m674filterNotxTcfx_M(short[] filterNot, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNot, "$this$filterNot");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(filterNot);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(filterNot, i5);
            if (!predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m675filterNotToHqK1JgA(long[] filterNotTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(filterNotTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(filterNotTo, i5);
            if (!predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                destination.add(ULong.m182boximpl(m247getsVKNKU));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m676filterNotTooEOeDjA(short[] filterNotTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(filterNotTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(filterNotTo, i5);
            if (!predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m288boximpl(m351getMh2AYeg));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m677filterNotTowU5IKMo(int[] filterNotTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(filterNotTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(filterNotTo, i5);
            if (!predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m104boximpl(m169getpVg5ArA));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterNotTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m678filterNotTowzUQCXU(byte[] filterNotTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterNotTo, "$this$filterNotTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(filterNotTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(filterNotTo, i5);
            if (!predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m28boximpl(m91getw2LRezQ));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-HqK1JgA, reason: not valid java name */
    private static final <C extends Collection<? super ULong>> C m679filterToHqK1JgA(long[] filterTo, C destination, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(filterTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(filterTo, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                destination.add(ULong.m182boximpl(m247getsVKNKU));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-oEOeDjA, reason: not valid java name */
    private static final <C extends Collection<? super UShort>> C m680filterTooEOeDjA(short[] filterTo, C destination, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(filterTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(filterTo, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                destination.add(UShort.m288boximpl(m351getMh2AYeg));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-wU5IKMo, reason: not valid java name */
    private static final <C extends Collection<? super UInt>> C m681filterTowU5IKMo(int[] filterTo, C destination, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(filterTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(filterTo, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                destination.add(UInt.m104boximpl(m169getpVg5ArA));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: filterTo-wzUQCXU, reason: not valid java name */
    private static final <C extends Collection<? super UByte>> C m682filterTowzUQCXU(byte[] filterTo, C destination, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(filterTo, "$this$filterTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(filterTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(filterTo, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                destination.add(UByte.m28boximpl(m91getw2LRezQ));
            }
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-JOV_ifY, reason: not valid java name */
    private static final UByte m683findJOV_ifY(byte[] find, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(find);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(find, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                return UByte.m28boximpl(m91getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-MShoTSo, reason: not valid java name */
    private static final ULong m684findMShoTSo(long[] find, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(find);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(find, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                return ULong.m182boximpl(m247getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-jgv0xPQ, reason: not valid java name */
    private static final UInt m685findjgv0xPQ(int[] find, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(find);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(find, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                return UInt.m104boximpl(m169getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: find-xTcfx_M, reason: not valid java name */
    private static final UShort m686findxTcfx_M(short[] find, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(find, "$this$find");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(find);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(find, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                return UShort.m288boximpl(m351getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-JOV_ifY, reason: not valid java name */
    private static final UByte m687findLastJOV_ifY(byte[] findLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(findLast) - 1;
        if (m92getSizeimpl >= 0) {
            while (true) {
                int i5 = m92getSizeimpl - 1;
                byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(findLast, m92getSizeimpl);
                if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                    return UByte.m28boximpl(m91getw2LRezQ);
                }
                if (i5 < 0) {
                    break;
                }
                m92getSizeimpl = i5;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-MShoTSo, reason: not valid java name */
    private static final ULong m688findLastMShoTSo(long[] findLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(findLast) - 1;
        if (m248getSizeimpl >= 0) {
            while (true) {
                int i5 = m248getSizeimpl - 1;
                long m247getsVKNKU = ULongArray.m247getsVKNKU(findLast, m248getSizeimpl);
                if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                    return ULong.m182boximpl(m247getsVKNKU);
                }
                if (i5 < 0) {
                    break;
                }
                m248getSizeimpl = i5;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-jgv0xPQ, reason: not valid java name */
    private static final UInt m689findLastjgv0xPQ(int[] findLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(findLast) - 1;
        if (m170getSizeimpl >= 0) {
            while (true) {
                int i5 = m170getSizeimpl - 1;
                int m169getpVg5ArA = UIntArray.m169getpVg5ArA(findLast, m170getSizeimpl);
                if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                    return UInt.m104boximpl(m169getpVg5ArA);
                }
                if (i5 < 0) {
                    break;
                }
                m170getSizeimpl = i5;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: findLast-xTcfx_M, reason: not valid java name */
    private static final UShort m690findLastxTcfx_M(short[] findLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(findLast, "$this$findLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(findLast) - 1;
        if (m352getSizeimpl >= 0) {
            while (true) {
                int i5 = m352getSizeimpl - 1;
                short m351getMh2AYeg = UShortArray.m351getMh2AYeg(findLast, m352getSizeimpl);
                if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                    return UShort.m288boximpl(m351getMh2AYeg);
                }
                if (i5 < 0) {
                    break;
                }
                m352getSizeimpl = i5;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first--ajY-9A, reason: not valid java name */
    private static final int m691firstajY9A(int[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UInt.m110constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-GBYM_sE, reason: not valid java name */
    private static final byte m692firstGBYM_sE(byte[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UByte.m34constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-JOV_ifY, reason: not valid java name */
    private static final byte m693firstJOV_ifY(byte[] first, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(first);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(first, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                return m91getw2LRezQ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-MShoTSo, reason: not valid java name */
    private static final long m694firstMShoTSo(long[] first, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(first);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(first, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                return m247getsVKNKU;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-QwZRm1k, reason: not valid java name */
    private static final long m695firstQwZRm1k(long[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return ULong.m188constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-jgv0xPQ, reason: not valid java name */
    private static final int m696firstjgv0xPQ(int[] first, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(first);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(first, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                return m169getpVg5ArA;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-rL5Bavg, reason: not valid java name */
    private static final short m697firstrL5Bavg(short[] first) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        return UShort.m294constructorimpl(ArraysKt.first(first));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: first-xTcfx_M, reason: not valid java name */
    private static final short m698firstxTcfx_M(short[] first, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(first, "$this$first");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(first);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(first, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                return m351getMh2AYeg;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: firstOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m699firstOrNullajY9A(int[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UIntArray.m172isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UInt.m104boximpl(UIntArray.m169getpVg5ArA(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: firstOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m700firstOrNullGBYM_sE(byte[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UByteArray.m94isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UByte.m28boximpl(UByteArray.m91getw2LRezQ(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m701firstOrNullJOV_ifY(byte[] firstOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(firstOrNull);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(firstOrNull, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                return UByte.m28boximpl(m91getw2LRezQ);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m702firstOrNullMShoTSo(long[] firstOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(firstOrNull);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(firstOrNull, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                return ULong.m182boximpl(m247getsVKNKU);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: firstOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m703firstOrNullQwZRm1k(long[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (ULongArray.m250isEmptyimpl(firstOrNull)) {
            return null;
        }
        return ULong.m182boximpl(ULongArray.m247getsVKNKU(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m704firstOrNulljgv0xPQ(int[] firstOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(firstOrNull);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(firstOrNull, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                return UInt.m104boximpl(m169getpVg5ArA);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: firstOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m705firstOrNullrL5Bavg(short[] firstOrNull) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        if (UShortArray.m354isEmptyimpl(firstOrNull)) {
            return null;
        }
        return UShort.m288boximpl(UShortArray.m351getMh2AYeg(firstOrNull, 0));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: firstOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m706firstOrNullxTcfx_M(short[] firstOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(firstOrNull, "$this$firstOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(firstOrNull);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(firstOrNull, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                return UShort.m288boximpl(m351getMh2AYeg);
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m707flatMapJOV_ifY(byte[] flatMap, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(flatMap);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            CollectionsKt.addAll(arrayList, (Iterable) a.e(flatMap, i5, transform));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m708flatMapMShoTSo(long[] flatMap, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(flatMap);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            CollectionsKt.addAll(arrayList, (Iterable) androidx.appcompat.widget.a.f(flatMap, i5, transform));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m709flatMapjgv0xPQ(int[] flatMap, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(flatMap);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            CollectionsKt.addAll(arrayList, (Iterable) androidx.activity.result.a.c(flatMap, i5, transform));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMap-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m710flatMapxTcfx_M(short[] flatMap, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(flatMap);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            CollectionsKt.addAll(arrayList, (Iterable) androidx.appcompat.graphics.drawable.a.b(flatMap, i5, transform));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m711flatMapIndexedELGow60(byte[] flatMapIndexed, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(flatMapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), UByte.m28boximpl(UByteArray.m91getw2LRezQ(flatMapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m712flatMapIndexedWyvcNBI(int[] flatMapIndexed, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(flatMapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), UInt.m104boximpl(UIntArray.m169getpVg5ArA(flatMapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m713flatMapIndexeds8dVfGU(long[] flatMapIndexed, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(flatMapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), ULong.m182boximpl(ULongArray.m247getsVKNKU(flatMapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m714flatMapIndexedxzaTVY8(short[] flatMapIndexed, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexed, "$this$flatMapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(flatMapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            CollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i6), UShort.m288boximpl(UShortArray.m351getMh2AYeg(flatMapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m715flatMapIndexedTo6EtJGI(int[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(flatMapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), UInt.m104boximpl(UIntArray.m169getpVg5ArA(flatMapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m716flatMapIndexedToQqktQ3k(short[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(flatMapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), UShort.m288boximpl(UShortArray.m351getMh2AYeg(flatMapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m717flatMapIndexedToeNpIKz8(byte[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(flatMapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), UByte.m28boximpl(UByteArray.m91getw2LRezQ(flatMapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: flatMapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m718flatMapIndexedTope2Q0Dw(long[] flatMapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapIndexedTo, "$this$flatMapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(flatMapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            CollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i6), ULong.m182boximpl(ULongArray.m247getsVKNKU(flatMapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m719flatMapToHqK1JgA(long[] flatMapTo, C destination, Function1<? super ULong, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(flatMapTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            CollectionsKt.addAll(destination, (Iterable) androidx.appcompat.widget.a.f(flatMapTo, i5, transform));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m720flatMapTooEOeDjA(short[] flatMapTo, C destination, Function1<? super UShort, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(flatMapTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            CollectionsKt.addAll(destination, (Iterable) androidx.appcompat.graphics.drawable.a.b(flatMapTo, i5, transform));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m721flatMapTowU5IKMo(int[] flatMapTo, C destination, Function1<? super UInt, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(flatMapTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            CollectionsKt.addAll(destination, (Iterable) androidx.activity.result.a.c(flatMapTo, i5, transform));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: flatMapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m722flatMapTowzUQCXU(byte[] flatMapTo, C destination, Function1<? super UByte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(flatMapTo, "$this$flatMapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(flatMapTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            CollectionsKt.addAll(destination, (Iterable) a.e(flatMapTo, i5, transform));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-A8wKCXQ, reason: not valid java name */
    private static final <R> R m723foldA8wKCXQ(long[] fold, R r4, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(fold);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            r4 = operation.invoke(r4, ULong.m182boximpl(ULongArray.m247getsVKNKU(fold, i5)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-yXmHNn8, reason: not valid java name */
    private static final <R> R m724foldyXmHNn8(byte[] fold, R r4, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(fold);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UByte.m28boximpl(UByteArray.m91getw2LRezQ(fold, i5)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-zi1B2BA, reason: not valid java name */
    private static final <R> R m725foldzi1B2BA(int[] fold, R r4, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(fold);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UInt.m104boximpl(UIntArray.m169getpVg5ArA(fold, i5)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: fold-zww5nb8, reason: not valid java name */
    private static final <R> R m726foldzww5nb8(short[] fold, R r4, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(fold);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UShort.m288boximpl(UShortArray.m351getMh2AYeg(fold, i5)));
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m727foldIndexed3iWJZGE(byte[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(foldIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, UByte.m28boximpl(UByteArray.m91getw2LRezQ(foldIndexed, i5)));
            i5++;
            i6++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m728foldIndexedbzxtMww(short[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(foldIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, UShort.m288boximpl(UShortArray.m351getMh2AYeg(foldIndexed, i5)));
            i5++;
            i6++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m729foldIndexedmwnnOCs(long[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(foldIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, ULong.m182boximpl(ULongArray.m247getsVKNKU(foldIndexed, i5)));
            i5++;
            i6++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m730foldIndexedyVwIW0Q(int[] foldIndexed, R r4, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldIndexed, "$this$foldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(foldIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            R r5 = r4;
            r4 = operation.invoke(Integer.valueOf(i6), r5, UInt.m104boximpl(UIntArray.m169getpVg5ArA(foldIndexed, i5)));
            i5++;
            i6++;
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-A8wKCXQ, reason: not valid java name */
    private static final <R> R m731foldRightA8wKCXQ(long[] foldRight, R r4, Function2<? super ULong, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-yXmHNn8, reason: not valid java name */
    private static final <R> R m732foldRightyXmHNn8(byte[] foldRight, R r4, Function2<? super UByte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-zi1B2BA, reason: not valid java name */
    private static final <R> R m733foldRightzi1B2BA(int[] foldRight, R r4, Function2<? super UInt, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRight-zww5nb8, reason: not valid java name */
    private static final <R> R m734foldRightzww5nb8(short[] foldRight, R r4, Function2<? super UShort, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRight, "$this$foldRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRight); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(foldRight, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> R m735foldRightIndexed3iWJZGE(byte[] foldRightIndexed, R r4, Function3<? super Integer, ? super UByte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), UByte.m28boximpl(UByteArray.m91getw2LRezQ(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-bzxtMww, reason: not valid java name */
    private static final <R> R m736foldRightIndexedbzxtMww(short[] foldRightIndexed, R r4, Function3<? super Integer, ? super UShort, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), UShort.m288boximpl(UShortArray.m351getMh2AYeg(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> R m737foldRightIndexedmwnnOCs(long[] foldRightIndexed, R r4, Function3<? super Integer, ? super ULong, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), ULong.m182boximpl(ULongArray.m247getsVKNKU(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: foldRightIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> R m738foldRightIndexedyVwIW0Q(int[] foldRightIndexed, R r4, Function3<? super Integer, ? super UInt, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(foldRightIndexed, "$this$foldRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = ArraysKt.getLastIndex(foldRightIndexed); lastIndex >= 0; lastIndex--) {
            r4 = operation.invoke(Integer.valueOf(lastIndex), UInt.m104boximpl(UIntArray.m169getpVg5ArA(foldRightIndexed, lastIndex)), r4);
        }
        return r4;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-JOV_ifY, reason: not valid java name */
    private static final void m739forEachJOV_ifY(byte[] forEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(forEach);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            action.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(forEach, i5)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-MShoTSo, reason: not valid java name */
    private static final void m740forEachMShoTSo(long[] forEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(forEach);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            action.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(forEach, i5)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-jgv0xPQ, reason: not valid java name */
    private static final void m741forEachjgv0xPQ(int[] forEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(forEach);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            action.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(forEach, i5)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEach-xTcfx_M, reason: not valid java name */
    private static final void m742forEachxTcfx_M(short[] forEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEach, "$this$forEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(forEach);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            action.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(forEach, i5)));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-ELGow60, reason: not valid java name */
    private static final void m743forEachIndexedELGow60(byte[] forEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(forEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            action.invoke(Integer.valueOf(i6), UByte.m28boximpl(UByteArray.m91getw2LRezQ(forEachIndexed, i5)));
            i5++;
            i6++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-WyvcNBI, reason: not valid java name */
    private static final void m744forEachIndexedWyvcNBI(int[] forEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(forEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            action.invoke(Integer.valueOf(i6), UInt.m104boximpl(UIntArray.m169getpVg5ArA(forEachIndexed, i5)));
            i5++;
            i6++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-s8dVfGU, reason: not valid java name */
    private static final void m745forEachIndexeds8dVfGU(long[] forEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(forEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            action.invoke(Integer.valueOf(i6), ULong.m182boximpl(ULongArray.m247getsVKNKU(forEachIndexed, i5)));
            i5++;
            i6++;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: forEachIndexed-xzaTVY8, reason: not valid java name */
    private static final void m746forEachIndexedxzaTVY8(short[] forEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(forEachIndexed, "$this$forEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(forEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            action.invoke(Integer.valueOf(i6), UShort.m288boximpl(UShortArray.m351getMh2AYeg(forEachIndexed, i5)));
            i5++;
            i6++;
        }
    }

    /* renamed from: getIndices--ajY-9A, reason: not valid java name */
    public static final IntRange m747getIndicesajY9A(int[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m748getIndicesajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getIndices-GBYM_sE, reason: not valid java name */
    public static final IntRange m749getIndicesGBYM_sE(byte[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m750getIndicesGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getIndices-QwZRm1k, reason: not valid java name */
    public static final IntRange m751getIndicesQwZRm1k(long[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m752getIndicesQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getIndices-rL5Bavg, reason: not valid java name */
    public static final IntRange m753getIndicesrL5Bavg(short[] indices) {
        Intrinsics.checkNotNullParameter(indices, "$this$indices");
        return ArraysKt.getIndices(indices);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getIndices-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m754getIndicesrL5Bavg$annotations(short[] sArr) {
    }

    /* renamed from: getLastIndex--ajY-9A, reason: not valid java name */
    public static final int m755getLastIndexajY9A(int[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex--ajY-9A$annotations, reason: not valid java name */
    public static /* synthetic */ void m756getLastIndexajY9A$annotations(int[] iArr) {
    }

    /* renamed from: getLastIndex-GBYM_sE, reason: not valid java name */
    public static final int m757getLastIndexGBYM_sE(byte[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-GBYM_sE$annotations, reason: not valid java name */
    public static /* synthetic */ void m758getLastIndexGBYM_sE$annotations(byte[] bArr) {
    }

    /* renamed from: getLastIndex-QwZRm1k, reason: not valid java name */
    public static final int m759getLastIndexQwZRm1k(long[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-QwZRm1k$annotations, reason: not valid java name */
    public static /* synthetic */ void m760getLastIndexQwZRm1k$annotations(long[] jArr) {
    }

    /* renamed from: getLastIndex-rL5Bavg, reason: not valid java name */
    public static final int m761getLastIndexrL5Bavg(short[] lastIndex) {
        Intrinsics.checkNotNullParameter(lastIndex, "$this$lastIndex");
        return ArraysKt.getLastIndex(lastIndex);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getLastIndex-rL5Bavg$annotations, reason: not valid java name */
    public static /* synthetic */ void m762getLastIndexrL5Bavg$annotations(short[] sArr) {
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-CVVdw08, reason: not valid java name */
    private static final short m763getOrElseCVVdw08(short[] getOrElse, int i5, Function1<? super Integer, UShort> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m343unboximpl() : UShortArray.m351getMh2AYeg(getOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-QxvSvLU, reason: not valid java name */
    private static final int m764getOrElseQxvSvLU(int[] getOrElse, int i5, Function1<? super Integer, UInt> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m161unboximpl() : UIntArray.m169getpVg5ArA(getOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-Xw8i6dc, reason: not valid java name */
    private static final long m765getOrElseXw8i6dc(long[] getOrElse, int i5, Function1<? super Integer, ULong> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m239unboximpl() : ULongArray.m247getsVKNKU(getOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: getOrElse-cO-VybQ, reason: not valid java name */
    private static final byte m766getOrElsecOVybQ(byte[] getOrElse, int i5, Function1<? super Integer, UByte> defaultValue) {
        Intrinsics.checkNotNullParameter(getOrElse, "$this$getOrElse");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrElse)) ? defaultValue.invoke(Integer.valueOf(i5)).m83unboximpl() : UByteArray.m91getw2LRezQ(getOrElse, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getOrNull-PpDY95g, reason: not valid java name */
    public static final UByte m767getOrNullPpDY95g(byte[] getOrNull, int i5) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return UByte.m28boximpl(UByteArray.m91getw2LRezQ(getOrNull, i5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getOrNull-nggk6HY, reason: not valid java name */
    public static final UShort m768getOrNullnggk6HY(short[] getOrNull, int i5) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return UShort.m288boximpl(UShortArray.m351getMh2AYeg(getOrNull, i5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getOrNull-qFRl0hI, reason: not valid java name */
    public static final UInt m769getOrNullqFRl0hI(int[] getOrNull, int i5) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return UInt.m104boximpl(UIntArray.m169getpVg5ArA(getOrNull, i5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: getOrNull-r7IrZao, reason: not valid java name */
    public static final ULong m770getOrNullr7IrZao(long[] getOrNull, int i5) {
        Intrinsics.checkNotNullParameter(getOrNull, "$this$getOrNull");
        if (i5 < 0 || i5 > ArraysKt.getLastIndex(getOrNull)) {
            return null;
        }
        return ULong.m182boximpl(ULongArray.m247getsVKNKU(getOrNull, i5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy--_j2Y-Q, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m771groupBy_j2YQ(long[] groupBy, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(groupBy, i5);
            K invoke = keySelector.invoke(ULong.m182boximpl(m247getsVKNKU));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(ULong.m182boximpl(m247getsVKNKU)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-3bBvP4M, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m772groupBy3bBvP4M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(groupBy, i5);
            K invoke = keySelector.invoke(UShort.m288boximpl(m351getMh2AYeg));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(UShort.m288boximpl(m351getMh2AYeg)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-JOV_ifY, reason: not valid java name */
    private static final <K> Map<K, List<UByte>> m773groupByJOV_ifY(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(groupBy, i5);
            K invoke = keySelector.invoke(UByte.m28boximpl(m91getw2LRezQ));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(UByte.m28boximpl(m91getw2LRezQ));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-L4rlFek, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m774groupByL4rlFek(int[] groupBy, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(groupBy, i5);
            K invoke = keySelector.invoke(UInt.m104boximpl(m169getpVg5ArA));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(UInt.m104boximpl(m169getpVg5ArA)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-MShoTSo, reason: not valid java name */
    private static final <K> Map<K, List<ULong>> m775groupByMShoTSo(long[] groupBy, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(groupBy, i5);
            K invoke = keySelector.invoke(ULong.m182boximpl(m247getsVKNKU));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(ULong.m182boximpl(m247getsVKNKU));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-bBsjw1Y, reason: not valid java name */
    private static final <K, V> Map<K, List<V>> m776groupBybBsjw1Y(byte[] groupBy, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(groupBy, i5);
            K invoke = keySelector.invoke(UByte.m28boximpl(m91getw2LRezQ));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(valueTransform.invoke(UByte.m28boximpl(m91getw2LRezQ)));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-jgv0xPQ, reason: not valid java name */
    private static final <K> Map<K, List<UInt>> m777groupByjgv0xPQ(int[] groupBy, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(groupBy, i5);
            K invoke = keySelector.invoke(UInt.m104boximpl(m169getpVg5ArA));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(UInt.m104boximpl(m169getpVg5ArA));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupBy-xTcfx_M, reason: not valid java name */
    private static final <K> Map<K, List<UShort>> m778groupByxTcfx_M(short[] groupBy, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupBy, "$this$groupBy");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(groupBy);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(groupBy, i5);
            K invoke = keySelector.invoke(UShort.m288boximpl(m351getMh2AYeg));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.widget.a.k(linkedHashMap, invoke);
            }
            ((List) obj).add(UShort.m288boximpl(m351getMh2AYeg));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-4D70W2E, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UInt>>> M m779groupByTo4D70W2E(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(groupByTo, i5);
            K invoke = keySelector.invoke(UInt.m104boximpl(m169getpVg5ArA));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(UInt.m104boximpl(m169getpVg5ArA));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-H21X9dk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UByte>>> M m780groupByToH21X9dk(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(groupByTo, i5);
            K invoke = keySelector.invoke(UByte.m28boximpl(m91getw2LRezQ));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(UByte.m28boximpl(m91getw2LRezQ));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-JM6gNCM, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m781groupByToJM6gNCM(int[] groupByTo, M destination, Function1<? super UInt, ? extends K> keySelector, Function1<? super UInt, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(groupByTo, i5);
            K invoke = keySelector.invoke(UInt.m104boximpl(m169getpVg5ArA));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(UInt.m104boximpl(m169getpVg5ArA)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-QxgOkWg, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m782groupByToQxgOkWg(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector, Function1<? super ULong, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(groupByTo, i5);
            K invoke = keySelector.invoke(ULong.m182boximpl(m247getsVKNKU));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(ULong.m182boximpl(m247getsVKNKU)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-X6OPwNk, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<ULong>>> M m783groupByToX6OPwNk(long[] groupByTo, M destination, Function1<? super ULong, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(groupByTo, i5);
            K invoke = keySelector.invoke(ULong.m182boximpl(m247getsVKNKU));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(ULong.m182boximpl(m247getsVKNKU));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-ciTST-8, reason: not valid java name */
    private static final <K, M extends Map<? super K, List<UShort>>> M m784groupByTociTST8(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(groupByTo, i5);
            K invoke = keySelector.invoke(UShort.m288boximpl(m351getMh2AYeg));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(UShort.m288boximpl(m351getMh2AYeg));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-q8RuPII, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m785groupByToq8RuPII(short[] groupByTo, M destination, Function1<? super UShort, ? extends K> keySelector, Function1<? super UShort, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(groupByTo, i5);
            K invoke = keySelector.invoke(UShort.m288boximpl(m351getMh2AYeg));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(UShort.m288boximpl(m351getMh2AYeg)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: groupByTo-qOZmbk8, reason: not valid java name */
    private static final <K, V, M extends Map<? super K, List<V>>> M m786groupByToqOZmbk8(byte[] groupByTo, M destination, Function1<? super UByte, ? extends K> keySelector, Function1<? super UByte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(groupByTo, "$this$groupByTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(groupByTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(groupByTo, i5);
            K invoke = keySelector.invoke(UByte.m28boximpl(m91getw2LRezQ));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = androidx.appcompat.graphics.drawable.a.f(destination, invoke);
            }
            ((List) obj).add(valueTransform.invoke(UByte.m28boximpl(m91getw2LRezQ)));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-3uqUaXg, reason: not valid java name */
    private static final int m787indexOf3uqUaXg(long[] indexOf, long j5) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, j5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-XzdR7RA, reason: not valid java name */
    private static final int m788indexOfXzdR7RA(short[] indexOf, short s4) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, s4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-gMuBH34, reason: not valid java name */
    private static final int m789indexOfgMuBH34(byte[] indexOf, byte b5) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, b5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOf-uWY9BYg, reason: not valid java name */
    private static final int m790indexOfuWY9BYg(int[] indexOf, int i5) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        return ArraysKt.indexOf(indexOf, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-JOV_ifY, reason: not valid java name */
    private static final int m791indexOfFirstJOV_ifY(byte[] indexOfFirst, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(UByte.m28boximpl(UByte.m34constructorimpl(indexOfFirst[i5]))).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-MShoTSo, reason: not valid java name */
    private static final int m792indexOfFirstMShoTSo(long[] indexOfFirst, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(ULong.m182boximpl(ULong.m188constructorimpl(indexOfFirst[i5]))).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-jgv0xPQ, reason: not valid java name */
    private static final int m793indexOfFirstjgv0xPQ(int[] indexOfFirst, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(UInt.m104boximpl(UInt.m110constructorimpl(indexOfFirst[i5]))).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfFirst-xTcfx_M, reason: not valid java name */
    private static final int m794indexOfFirstxTcfx_M(short[] indexOfFirst, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfFirst, "$this$indexOfFirst");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfFirst.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (predicate.invoke(UShort.m288boximpl(UShort.m294constructorimpl(indexOfFirst[i5]))).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-JOV_ifY, reason: not valid java name */
    private static final int m795indexOfLastJOV_ifY(byte[] indexOfLast, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (predicate.invoke(UByte.m28boximpl(UByte.m34constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i5 < 0) {
                return -1;
            }
            length = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-MShoTSo, reason: not valid java name */
    private static final int m796indexOfLastMShoTSo(long[] indexOfLast, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (predicate.invoke(ULong.m182boximpl(ULong.m188constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i5 < 0) {
                return -1;
            }
            length = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-jgv0xPQ, reason: not valid java name */
    private static final int m797indexOfLastjgv0xPQ(int[] indexOfLast, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (predicate.invoke(UInt.m104boximpl(UInt.m110constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i5 < 0) {
                return -1;
            }
            length = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: indexOfLast-xTcfx_M, reason: not valid java name */
    private static final int m798indexOfLastxTcfx_M(short[] indexOfLast, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(indexOfLast, "$this$indexOfLast");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = indexOfLast.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i5 = length - 1;
            if (predicate.invoke(UShort.m288boximpl(UShort.m294constructorimpl(indexOfLast[length]))).booleanValue()) {
                return length;
            }
            if (i5 < 0) {
                return -1;
            }
            length = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last--ajY-9A, reason: not valid java name */
    private static final int m799lastajY9A(int[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UInt.m110constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-GBYM_sE, reason: not valid java name */
    private static final byte m800lastGBYM_sE(byte[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UByte.m34constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-JOV_ifY, reason: not valid java name */
    private static final byte m801lastJOV_ifY(byte[] last, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(last) - 1;
        if (m92getSizeimpl >= 0) {
            while (true) {
                int i5 = m92getSizeimpl - 1;
                byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(last, m92getSizeimpl);
                if (!predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    m92getSizeimpl = i5;
                } else {
                    return m91getw2LRezQ;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-MShoTSo, reason: not valid java name */
    private static final long m802lastMShoTSo(long[] last, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(last) - 1;
        if (m248getSizeimpl >= 0) {
            while (true) {
                int i5 = m248getSizeimpl - 1;
                long m247getsVKNKU = ULongArray.m247getsVKNKU(last, m248getSizeimpl);
                if (!predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    m248getSizeimpl = i5;
                } else {
                    return m247getsVKNKU;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-QwZRm1k, reason: not valid java name */
    private static final long m803lastQwZRm1k(long[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return ULong.m188constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-jgv0xPQ, reason: not valid java name */
    private static final int m804lastjgv0xPQ(int[] last, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(last) - 1;
        if (m170getSizeimpl >= 0) {
            while (true) {
                int i5 = m170getSizeimpl - 1;
                int m169getpVg5ArA = UIntArray.m169getpVg5ArA(last, m170getSizeimpl);
                if (!predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    m170getSizeimpl = i5;
                } else {
                    return m169getpVg5ArA;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-rL5Bavg, reason: not valid java name */
    private static final short m805lastrL5Bavg(short[] last) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        return UShort.m294constructorimpl(ArraysKt.last(last));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: last-xTcfx_M, reason: not valid java name */
    private static final short m806lastxTcfx_M(short[] last, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(last, "$this$last");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(last) - 1;
        if (m352getSizeimpl >= 0) {
            while (true) {
                int i5 = m352getSizeimpl - 1;
                short m351getMh2AYeg = UShortArray.m351getMh2AYeg(last, m352getSizeimpl);
                if (!predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                    if (i5 < 0) {
                        break;
                    }
                    m352getSizeimpl = i5;
                } else {
                    return m351getMh2AYeg;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-3uqUaXg, reason: not valid java name */
    private static final int m807lastIndexOf3uqUaXg(long[] lastIndexOf, long j5) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, j5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-XzdR7RA, reason: not valid java name */
    private static final int m808lastIndexOfXzdR7RA(short[] lastIndexOf, short s4) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, s4);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-gMuBH34, reason: not valid java name */
    private static final int m809lastIndexOfgMuBH34(byte[] lastIndexOf, byte b5) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, b5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastIndexOf-uWY9BYg, reason: not valid java name */
    private static final int m810lastIndexOfuWY9BYg(int[] lastIndexOf, int i5) {
        Intrinsics.checkNotNullParameter(lastIndexOf, "$this$lastIndexOf");
        return ArraysKt.lastIndexOf(lastIndexOf, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: lastOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m811lastOrNullajY9A(int[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UIntArray.m172isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UInt.m104boximpl(UIntArray.m169getpVg5ArA(lastOrNull, UIntArray.m170getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: lastOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m812lastOrNullGBYM_sE(byte[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UByteArray.m94isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UByte.m28boximpl(UByteArray.m91getw2LRezQ(lastOrNull, UByteArray.m92getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m813lastOrNullJOV_ifY(byte[] lastOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(lastOrNull) - 1;
        if (m92getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i5 = m92getSizeimpl - 1;
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(lastOrNull, m92getSizeimpl);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                return UByte.m28boximpl(m91getw2LRezQ);
            }
            if (i5 < 0) {
                return null;
            }
            m92getSizeimpl = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m814lastOrNullMShoTSo(long[] lastOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(lastOrNull) - 1;
        if (m248getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i5 = m248getSizeimpl - 1;
            long m247getsVKNKU = ULongArray.m247getsVKNKU(lastOrNull, m248getSizeimpl);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                return ULong.m182boximpl(m247getsVKNKU);
            }
            if (i5 < 0) {
                return null;
            }
            m248getSizeimpl = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: lastOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m815lastOrNullQwZRm1k(long[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (ULongArray.m250isEmptyimpl(lastOrNull)) {
            return null;
        }
        return ULong.m182boximpl(ULongArray.m247getsVKNKU(lastOrNull, ULongArray.m248getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m816lastOrNulljgv0xPQ(int[] lastOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(lastOrNull) - 1;
        if (m170getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i5 = m170getSizeimpl - 1;
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(lastOrNull, m170getSizeimpl);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                return UInt.m104boximpl(m169getpVg5ArA);
            }
            if (i5 < 0) {
                return null;
            }
            m170getSizeimpl = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: lastOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m817lastOrNullrL5Bavg(short[] lastOrNull) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        if (UShortArray.m354isEmptyimpl(lastOrNull)) {
            return null;
        }
        return UShort.m288boximpl(UShortArray.m351getMh2AYeg(lastOrNull, UShortArray.m352getSizeimpl(lastOrNull) - 1));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: lastOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m818lastOrNullxTcfx_M(short[] lastOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(lastOrNull, "$this$lastOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(lastOrNull) - 1;
        if (m352getSizeimpl < 0) {
            return null;
        }
        while (true) {
            int i5 = m352getSizeimpl - 1;
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(lastOrNull, m352getSizeimpl);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                return UShort.m288boximpl(m351getMh2AYeg);
            }
            if (i5 < 0) {
                return null;
            }
            m352getSizeimpl = i5;
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-JOV_ifY, reason: not valid java name */
    private static final <R> List<R> m819mapJOV_ifY(byte[] map, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(map));
        int m92getSizeimpl = UByteArray.m92getSizeimpl(map);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            arrayList.add(transform.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(map, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-MShoTSo, reason: not valid java name */
    private static final <R> List<R> m820mapMShoTSo(long[] map, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(map));
        int m248getSizeimpl = ULongArray.m248getSizeimpl(map);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            arrayList.add(transform.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(map, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-jgv0xPQ, reason: not valid java name */
    private static final <R> List<R> m821mapjgv0xPQ(int[] map, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(map));
        int m170getSizeimpl = UIntArray.m170getSizeimpl(map);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            arrayList.add(transform.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(map, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: map-xTcfx_M, reason: not valid java name */
    private static final <R> List<R> m822mapxTcfx_M(short[] map, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(map));
        int m352getSizeimpl = UShortArray.m352getSizeimpl(map);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            arrayList.add(transform.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(map, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-ELGow60, reason: not valid java name */
    private static final <R> List<R> m823mapIndexedELGow60(byte[] mapIndexed, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(mapIndexed));
        int m92getSizeimpl = UByteArray.m92getSizeimpl(mapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), UByte.m28boximpl(UByteArray.m91getw2LRezQ(mapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-WyvcNBI, reason: not valid java name */
    private static final <R> List<R> m824mapIndexedWyvcNBI(int[] mapIndexed, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(mapIndexed));
        int m170getSizeimpl = UIntArray.m170getSizeimpl(mapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), UInt.m104boximpl(UIntArray.m169getpVg5ArA(mapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-s8dVfGU, reason: not valid java name */
    private static final <R> List<R> m825mapIndexeds8dVfGU(long[] mapIndexed, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(mapIndexed));
        int m248getSizeimpl = ULongArray.m248getSizeimpl(mapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), ULong.m182boximpl(ULongArray.m247getsVKNKU(mapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexed-xzaTVY8, reason: not valid java name */
    private static final <R> List<R> m826mapIndexedxzaTVY8(short[] mapIndexed, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexed, "$this$mapIndexed");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(mapIndexed));
        int m352getSizeimpl = UShortArray.m352getSizeimpl(mapIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            arrayList.add(transform.invoke(Integer.valueOf(i6), UShort.m288boximpl(UShortArray.m351getMh2AYeg(mapIndexed, i5))));
            i5++;
            i6++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo--6EtJGI, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m827mapIndexedTo6EtJGI(int[] mapIndexedTo, C destination, Function2<? super Integer, ? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(mapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i6), UInt.m104boximpl(UIntArray.m169getpVg5ArA(mapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo-QqktQ3k, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m828mapIndexedToQqktQ3k(short[] mapIndexedTo, C destination, Function2<? super Integer, ? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(mapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i6), UShort.m288boximpl(UShortArray.m351getMh2AYeg(mapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo-eNpIKz8, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m829mapIndexedToeNpIKz8(byte[] mapIndexedTo, C destination, Function2<? super Integer, ? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(mapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i6), UByte.m28boximpl(UByteArray.m91getw2LRezQ(mapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapIndexedTo-pe2Q0Dw, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m830mapIndexedTope2Q0Dw(long[] mapIndexedTo, C destination, Function2<? super Integer, ? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapIndexedTo, "$this$mapIndexedTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(mapIndexedTo);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            destination.add(transform.invoke(Integer.valueOf(i6), ULong.m182boximpl(ULongArray.m247getsVKNKU(mapIndexedTo, i5))));
            i5++;
            i6++;
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-HqK1JgA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m831mapToHqK1JgA(long[] mapTo, C destination, Function1<? super ULong, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(mapTo);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            destination.add(transform.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(mapTo, i5))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-oEOeDjA, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m832mapTooEOeDjA(short[] mapTo, C destination, Function1<? super UShort, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(mapTo);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            destination.add(transform.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(mapTo, i5))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-wU5IKMo, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m833mapTowU5IKMo(int[] mapTo, C destination, Function1<? super UInt, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(mapTo);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            destination.add(transform.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(mapTo, i5))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: mapTo-wzUQCXU, reason: not valid java name */
    private static final <R, C extends Collection<? super R>> C m834mapTowzUQCXU(byte[] mapTo, C destination, Function1<? super UByte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(mapTo, "$this$mapTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(mapTo);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            destination.add(transform.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(mapTo, i5))));
        }
        return destination;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m835maxByOrNullJOV_ifY(byte[] maxByOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxByOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UByte.m28boximpl(m91getw2LRezQ);
        }
        R invoke = selector.invoke(UByte.m28boximpl(m91getw2LRezQ));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(maxByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(UByte.m28boximpl(m91getw2LRezQ2));
            if (invoke.compareTo(invoke2) < 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
                invoke = invoke2;
            }
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m836maxByOrNullMShoTSo(long[] maxByOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxByOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return ULong.m182boximpl(m247getsVKNKU);
        }
        R invoke = selector.invoke(ULong.m182boximpl(m247getsVKNKU));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(maxByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(ULong.m182boximpl(m247getsVKNKU2));
            if (invoke.compareTo(invoke2) < 0) {
                m247getsVKNKU = m247getsVKNKU2;
                invoke = invoke2;
            }
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m837maxByOrNulljgv0xPQ(int[] maxByOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxByOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UInt.m104boximpl(m169getpVg5ArA);
        }
        R invoke = selector.invoke(UInt.m104boximpl(m169getpVg5ArA));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(maxByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(UInt.m104boximpl(m169getpVg5ArA2));
            if (invoke.compareTo(invoke2) < 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
                invoke = invoke2;
            }
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: maxByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m838maxByOrNullxTcfx_M(short[] maxByOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxByOrNull, "$this$maxByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxByOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(maxByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(maxByOrNull);
        if (lastIndex == 0) {
            return UShort.m288boximpl(m351getMh2AYeg);
        }
        R invoke = selector.invoke(UShort.m288boximpl(m351getMh2AYeg));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(maxByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(UShort.m288boximpl(m351getMh2AYeg2));
            if (invoke.compareTo(invoke2) < 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
                invoke = invoke2;
            }
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m839maxByOrThrowU(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return m91getw2LRezQ;
        }
        R invoke = selector.invoke(UByte.m28boximpl(m91getw2LRezQ));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(maxBy, j5.nextInt());
            R invoke2 = selector.invoke(UByte.m28boximpl(m91getw2LRezQ2));
            if (invoke.compareTo(invoke2) < 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
                invoke = invoke2;
            }
        }
        return m91getw2LRezQ;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m840maxByOrThrowU(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return m169getpVg5ArA;
        }
        R invoke = selector.invoke(UInt.m104boximpl(m169getpVg5ArA));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(maxBy, j5.nextInt());
            R invoke2 = selector.invoke(UInt.m104boximpl(m169getpVg5ArA2));
            if (invoke.compareTo(invoke2) < 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
                invoke = invoke2;
            }
        }
        return m169getpVg5ArA;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m841maxByOrThrowU(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return m247getsVKNKU;
        }
        R invoke = selector.invoke(ULong.m182boximpl(m247getsVKNKU));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(maxBy, j5.nextInt());
            R invoke2 = selector.invoke(ULong.m182boximpl(m247getsVKNKU2));
            if (invoke.compareTo(invoke2) < 0) {
                m247getsVKNKU = m247getsVKNKU2;
                invoke = invoke2;
            }
        }
        return m247getsVKNKU;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "maxByOrThrow-U")
    /* renamed from: maxByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m842maxByOrThrowU(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxBy)) {
            throw new NoSuchElementException();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex == 0) {
            return m351getMh2AYeg;
        }
        R invoke = selector.invoke(UShort.m288boximpl(m351getMh2AYeg));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(maxBy, j5.nextInt());
            R invoke2 = selector.invoke(UShort.m288boximpl(m351getMh2AYeg2));
            if (invoke.compareTo(invoke2) < 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
                invoke = invoke2;
            }
        }
        return m351getMh2AYeg;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final double m843maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) a.e(maxOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final float m844maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) a.e(maxOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m845maxOfJOV_ifY(byte[] maxOf, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) a.e(maxOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOf, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final double m846maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) androidx.appcompat.widget.a.f(maxOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final float m847maxOfMShoTSo(long[] maxOf, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) androidx.appcompat.widget.a.f(maxOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m848maxOfMShoTSo(long[] maxOf, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) androidx.appcompat.widget.a.f(maxOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOf, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final double m849maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) androidx.activity.result.a.c(maxOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final float m850maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) androidx.activity.result.a.c(maxOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m851maxOfjgv0xPQ(int[] maxOf, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) androidx.activity.result.a.c(maxOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOf, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final double m852maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) androidx.appcompat.graphics.drawable.a.b(maxOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final float m853maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) androidx.appcompat.graphics.drawable.a.b(maxOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m854maxOfxTcfx_M(short[] maxOf, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOf, "$this$maxOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) androidx.appcompat.graphics.drawable.a.b(maxOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOf, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m855maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r4 = (R) a.e(maxOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m856maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) a.e(maxOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m857maxOfOrNullJOV_ifY(byte[] maxOfOrNull, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) a.e(maxOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m858maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r4 = (R) androidx.appcompat.widget.a.f(maxOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m859maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) androidx.appcompat.widget.a.f(maxOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m860maxOfOrNullMShoTSo(long[] maxOfOrNull, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) androidx.appcompat.widget.a.f(maxOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m861maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r4 = (R) androidx.activity.result.a.c(maxOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m862maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) androidx.activity.result.a.c(maxOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m863maxOfOrNulljgv0xPQ(int[] maxOfOrNull, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) androidx.activity.result.a.c(maxOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m864maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        R r4 = (R) androidx.appcompat.graphics.drawable.a.b(maxOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) < 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m865maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) androidx.appcompat.graphics.drawable.a.b(maxOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m866maxOfOrNullxTcfx_M(short[] maxOfOrNull, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(maxOfOrNull, "$this$maxOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) androidx.appcompat.graphics.drawable.a.b(maxOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m867maxOfWith5NtCtWE(long[] maxOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) androidx.appcompat.widget.a.f(maxOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m868maxOfWithLTi4i_s(byte[] maxOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) a.e(maxOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m869maxOfWithl8EHGbQ(short[] maxOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) androidx.appcompat.graphics.drawable.a.b(maxOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m870maxOfWithmyNOsp4(int[] maxOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWith, "$this$maxOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) androidx.activity.result.a.c(maxOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m871maxOfWithOrNull5NtCtWE(long[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) androidx.appcompat.widget.a.f(maxOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m872maxOfWithOrNullLTi4i_s(byte[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) a.e(maxOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m873maxOfWithOrNulll8EHGbQ(short[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) androidx.appcompat.graphics.drawable.a.b(maxOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: maxOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m874maxOfWithOrNullmyNOsp4(int[] maxOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxOfWithOrNull, "$this$maxOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxOfWithOrNull)) {
            return null;
        }
        Object obj = (R) androidx.activity.result.a.c(maxOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(maxOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m875maxOrNullajY9A(int[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UIntArray.m172isEmptyimpl(maxOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(maxOrNull, it.nextInt());
            if (UnsignedKt.uintCompare(m169getpVg5ArA, m169getpVg5ArA2) < 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m876maxOrNullGBYM_sE(byte[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UByteArray.m94isEmptyimpl(maxOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(maxOrNull, it.nextInt());
            if (Intrinsics.compare(m91getw2LRezQ & 255, m91getw2LRezQ2 & 255) < 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m877maxOrNullQwZRm1k(long[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (ULongArray.m250isEmptyimpl(maxOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(maxOrNull, it.nextInt());
            if (UnsignedKt.ulongCompare(m247getsVKNKU, m247getsVKNKU2) < 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m878maxOrNullrL5Bavg(short[] maxOrNull) {
        Intrinsics.checkNotNullParameter(maxOrNull, "$this$maxOrNull");
        if (UShortArray.m354isEmptyimpl(maxOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(maxOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxOrNull)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(maxOrNull, it.nextInt());
            if (Intrinsics.compare(m351getMh2AYeg & 65535, 65535 & m351getMh2AYeg2) < 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final byte m879maxOrThrowU(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UByteArray.m94isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(max, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(max, it.nextInt());
            if (Intrinsics.compare(m91getw2LRezQ & 255, m91getw2LRezQ2 & 255) < 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return m91getw2LRezQ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final int m880maxOrThrowU(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UIntArray.m172isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(max, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(max, it.nextInt());
            if (UnsignedKt.uintCompare(m169getpVg5ArA, m169getpVg5ArA2) < 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return m169getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final long m881maxOrThrowU(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (ULongArray.m250isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(max, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(max, it.nextInt());
            if (UnsignedKt.ulongCompare(m247getsVKNKU, m247getsVKNKU2) < 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return m247getsVKNKU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxOrThrow-U")
    /* renamed from: maxOrThrow-U, reason: not valid java name */
    public static final short m882maxOrThrowU(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        if (UShortArray.m354isEmptyimpl(max)) {
            throw new NoSuchElementException();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(max, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(max)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(max, it.nextInt());
            if (Intrinsics.compare(m351getMh2AYeg & 65535, 65535 & m351getMh2AYeg2) < 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return m351getMh2AYeg;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m883maxWithOrNullXMRcp5o(byte[] maxWithOrNull, Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m94isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(maxWithOrNull, it.nextInt());
            if (comparator.compare(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(m91getw2LRezQ2)) < 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m884maxWithOrNullYmdZ_VM(int[] maxWithOrNull, Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m172isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(maxWithOrNull, it.nextInt());
            if (comparator.compare(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(m169getpVg5ArA2)) < 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m885maxWithOrNulleOHTfZs(short[] maxWithOrNull, Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m354isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(maxWithOrNull, it.nextInt());
            if (comparator.compare(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(m351getMh2AYeg2)) < 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m886maxWithOrNullzrEWJaI(long[] maxWithOrNull, Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWithOrNull, "$this$maxWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m250isEmptyimpl(maxWithOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(maxWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWithOrNull)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(maxWithOrNull, it.nextInt());
            if (comparator.compare(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(m247getsVKNKU2)) < 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final byte m887maxWithOrThrowU(byte[] maxWith, Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m94isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(maxWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(maxWith, it.nextInt());
            if (comparator.compare(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(m91getw2LRezQ2)) < 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return m91getw2LRezQ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final int m888maxWithOrThrowU(int[] maxWith, Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m172isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(maxWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(maxWith, it.nextInt());
            if (comparator.compare(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(m169getpVg5ArA2)) < 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return m169getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final long m889maxWithOrThrowU(long[] maxWith, Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m250isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(maxWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(maxWith, it.nextInt());
            if (comparator.compare(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(m247getsVKNKU2)) < 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return m247getsVKNKU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "maxWithOrThrow-U")
    /* renamed from: maxWithOrThrow-U, reason: not valid java name */
    public static final short m890maxWithOrThrowU(short[] maxWith, Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m354isEmptyimpl(maxWith)) {
            throw new NoSuchElementException();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(maxWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(maxWith)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(maxWith, it.nextInt());
            if (comparator.compare(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(m351getMh2AYeg2)) < 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return m351getMh2AYeg;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UByte m891minByOrNullJOV_ifY(byte[] minByOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minByOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UByte.m28boximpl(m91getw2LRezQ);
        }
        R invoke = selector.invoke(UByte.m28boximpl(m91getw2LRezQ));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(minByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(UByte.m28boximpl(m91getw2LRezQ2));
            if (invoke.compareTo(invoke2) > 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
                invoke = invoke2;
            }
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> ULong m892minByOrNullMShoTSo(long[] minByOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minByOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return ULong.m182boximpl(m247getsVKNKU);
        }
        R invoke = selector.invoke(ULong.m182boximpl(m247getsVKNKU));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(minByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(ULong.m182boximpl(m247getsVKNKU2));
            if (invoke.compareTo(invoke2) > 0) {
                m247getsVKNKU = m247getsVKNKU2;
                invoke = invoke2;
            }
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UInt m893minByOrNulljgv0xPQ(int[] minByOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minByOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UInt.m104boximpl(m169getpVg5ArA);
        }
        R invoke = selector.invoke(UInt.m104boximpl(m169getpVg5ArA));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(minByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(UInt.m104boximpl(m169getpVg5ArA2));
            if (invoke.compareTo(invoke2) > 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
                invoke = invoke2;
            }
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: minByOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> UShort m894minByOrNullxTcfx_M(short[] minByOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minByOrNull, "$this$minByOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minByOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(minByOrNull, 0);
        int lastIndex = ArraysKt.getLastIndex(minByOrNull);
        if (lastIndex == 0) {
            return UShort.m288boximpl(m351getMh2AYeg);
        }
        R invoke = selector.invoke(UShort.m288boximpl(m351getMh2AYeg));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(minByOrNull, j5.nextInt());
            R invoke2 = selector.invoke(UShort.m288boximpl(m351getMh2AYeg2));
            if (invoke.compareTo(invoke2) > 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
                invoke = invoke2;
            }
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> byte m895minByOrThrowU(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return m91getw2LRezQ;
        }
        R invoke = selector.invoke(UByte.m28boximpl(m91getw2LRezQ));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(minBy, j5.nextInt());
            R invoke2 = selector.invoke(UByte.m28boximpl(m91getw2LRezQ2));
            if (invoke.compareTo(invoke2) > 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
                invoke = invoke2;
            }
        }
        return m91getw2LRezQ;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> int m896minByOrThrowU(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return m169getpVg5ArA;
        }
        R invoke = selector.invoke(UInt.m104boximpl(m169getpVg5ArA));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(minBy, j5.nextInt());
            R invoke2 = selector.invoke(UInt.m104boximpl(m169getpVg5ArA2));
            if (invoke.compareTo(invoke2) > 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
                invoke = invoke2;
            }
        }
        return m169getpVg5ArA;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> long m897minByOrThrowU(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return m247getsVKNKU;
        }
        R invoke = selector.invoke(ULong.m182boximpl(m247getsVKNKU));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(minBy, j5.nextInt());
            R invoke2 = selector.invoke(ULong.m182boximpl(m247getsVKNKU2));
            if (invoke.compareTo(invoke2) > 0) {
                m247getsVKNKU = m247getsVKNKU2;
                invoke = invoke2;
            }
        }
        return m247getsVKNKU;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "minByOrThrow-U")
    /* renamed from: minByOrThrow-U, reason: not valid java name */
    private static final <R extends Comparable<? super R>> short m898minByOrThrowU(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minBy)) {
            throw new NoSuchElementException();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex == 0) {
            return m351getMh2AYeg;
        }
        R invoke = selector.invoke(UShort.m288boximpl(m351getMh2AYeg));
        IntIterator j5 = d.j(1, lastIndex);
        while (j5.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(minBy, j5.nextInt());
            R invoke2 = selector.invoke(UShort.m288boximpl(m351getMh2AYeg2));
            if (invoke.compareTo(invoke2) > 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
                invoke = invoke2;
            }
        }
        return m351getMh2AYeg;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final double m899minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) a.e(minOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final float m900minOfJOV_ifY(byte[] minOf, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) a.e(minOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m901minOfJOV_ifY(byte[] minOf, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) a.e(minOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOf, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final double m902minOfMShoTSo(long[] minOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) androidx.appcompat.widget.a.f(minOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final float m903minOfMShoTSo(long[] minOf, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) androidx.appcompat.widget.a.f(minOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m904minOfMShoTSo(long[] minOf, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) androidx.appcompat.widget.a.f(minOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOf, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final double m905minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) androidx.activity.result.a.c(minOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final float m906minOfjgv0xPQ(int[] minOf, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) androidx.activity.result.a.c(minOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m907minOfjgv0xPQ(int[] minOf, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) androidx.activity.result.a.c(minOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOf, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final double m908minOfxTcfx_M(short[] minOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) androidx.appcompat.graphics.drawable.a.b(minOf, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOf, it.nextInt()))).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final float m909minOfxTcfx_M(short[] minOf, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        float floatValue = ((Number) androidx.appcompat.graphics.drawable.a.b(minOf, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOf, it.nextInt()))).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOf-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m910minOfxTcfx_M(short[] minOf, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOf, "$this$minOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOf)) {
            throw new NoSuchElementException();
        }
        R r4 = (R) androidx.appcompat.graphics.drawable.a.b(minOf, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOf)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOf, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m911minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r4 = (R) a.e(minOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Double m912minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) a.e(minOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-JOV_ifY, reason: not valid java name */
    private static final Float m913minOfOrNullJOV_ifY(byte[] minOfOrNull, Function1<? super UByte, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) a.e(minOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m914minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r4 = (R) androidx.appcompat.widget.a.f(minOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Double m915minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) androidx.appcompat.widget.a.f(minOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-MShoTSo, reason: not valid java name */
    private static final Float m916minOfOrNullMShoTSo(long[] minOfOrNull, Function1<? super ULong, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) androidx.appcompat.widget.a.f(minOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m917minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r4 = (R) androidx.activity.result.a.c(minOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Double m918minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) androidx.activity.result.a.c(minOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-jgv0xPQ, reason: not valid java name */
    private static final Float m919minOfOrNulljgv0xPQ(int[] minOfOrNull, Function1<? super UInt, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) androidx.activity.result.a.c(minOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final <R extends Comparable<? super R>> R m920minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOfOrNull)) {
            return null;
        }
        R r4 = (R) androidx.appcompat.graphics.drawable.a.b(minOfOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            R invoke = selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOfOrNull, it.nextInt())));
            if (r4.compareTo(invoke) > 0) {
                r4 = invoke;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Double m921minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOfOrNull)) {
            return null;
        }
        double doubleValue = ((Number) androidx.appcompat.graphics.drawable.a.b(minOfOrNull, 0, selector)).doubleValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOfOrNull, it.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfOrNull-xTcfx_M, reason: not valid java name */
    private static final Float m922minOfOrNullxTcfx_M(short[] minOfOrNull, Function1<? super UShort, Float> selector) {
        Intrinsics.checkNotNullParameter(minOfOrNull, "$this$minOfOrNull");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOfOrNull)) {
            return null;
        }
        float floatValue = ((Number) androidx.appcompat.graphics.drawable.a.b(minOfOrNull, 0, selector)).floatValue();
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfOrNull)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOfOrNull, it.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-5NtCtWE, reason: not valid java name */
    private static final <R> R m923minOfWith5NtCtWE(long[] minOfWith, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) androidx.appcompat.widget.a.f(minOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-LTi4i_s, reason: not valid java name */
    private static final <R> R m924minOfWithLTi4i_s(byte[] minOfWith, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) a.e(minOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-l8EHGbQ, reason: not valid java name */
    private static final <R> R m925minOfWithl8EHGbQ(short[] minOfWith, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) androidx.appcompat.graphics.drawable.a.b(minOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWith-myNOsp4, reason: not valid java name */
    private static final <R> R m926minOfWithmyNOsp4(int[] minOfWith, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWith, "$this$minOfWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOfWith)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) androidx.activity.result.a.c(minOfWith, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWith)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOfWith, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-5NtCtWE, reason: not valid java name */
    private static final <R> R m927minOfWithOrNull5NtCtWE(long[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) androidx.appcompat.widget.a.f(minOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-LTi4i_s, reason: not valid java name */
    private static final <R> R m928minOfWithOrNullLTi4i_s(byte[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) a.e(minOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-l8EHGbQ, reason: not valid java name */
    private static final <R> R m929minOfWithOrNulll8EHGbQ(short[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) androidx.appcompat.graphics.drawable.a.b(minOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    /* renamed from: minOfWithOrNull-myNOsp4, reason: not valid java name */
    private static final <R> R m930minOfWithOrNullmyNOsp4(int[] minOfWithOrNull, Comparator<? super R> comparator, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minOfWithOrNull, "$this$minOfWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minOfWithOrNull)) {
            return null;
        }
        Object obj = (R) androidx.activity.result.a.c(minOfWithOrNull, 0, selector);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOfWithOrNull)).iterator();
        while (it.hasNext()) {
            Object obj2 = (R) selector.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(minOfWithOrNull, it.nextInt())));
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m931minOrNullajY9A(int[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UIntArray.m172isEmptyimpl(minOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(minOrNull, it.nextInt());
            if (UnsignedKt.uintCompare(m169getpVg5ArA, m169getpVg5ArA2) > 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m932minOrNullGBYM_sE(byte[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UByteArray.m94isEmptyimpl(minOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(minOrNull, it.nextInt());
            if (Intrinsics.compare(m91getw2LRezQ & 255, m91getw2LRezQ2 & 255) > 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m933minOrNullQwZRm1k(long[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (ULongArray.m250isEmptyimpl(minOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(minOrNull, it.nextInt());
            if (UnsignedKt.ulongCompare(m247getsVKNKU, m247getsVKNKU2) > 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m934minOrNullrL5Bavg(short[] minOrNull) {
        Intrinsics.checkNotNullParameter(minOrNull, "$this$minOrNull");
        if (UShortArray.m354isEmptyimpl(minOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(minOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minOrNull)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(minOrNull, it.nextInt());
            if (Intrinsics.compare(m351getMh2AYeg & 65535, 65535 & m351getMh2AYeg2) > 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final byte m935minOrThrowU(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UByteArray.m94isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(min, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(min, it.nextInt());
            if (Intrinsics.compare(m91getw2LRezQ & 255, m91getw2LRezQ2 & 255) > 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return m91getw2LRezQ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final int m936minOrThrowU(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UIntArray.m172isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(min, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(min, it.nextInt());
            if (UnsignedKt.uintCompare(m169getpVg5ArA, m169getpVg5ArA2) > 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return m169getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final long m937minOrThrowU(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (ULongArray.m250isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(min, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(min, it.nextInt());
            if (UnsignedKt.ulongCompare(m247getsVKNKU, m247getsVKNKU2) > 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return m247getsVKNKU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minOrThrow-U")
    /* renamed from: minOrThrow-U, reason: not valid java name */
    public static final short m938minOrThrowU(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        if (UShortArray.m354isEmptyimpl(min)) {
            throw new NoSuchElementException();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(min, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(min)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(min, it.nextInt());
            if (Intrinsics.compare(m351getMh2AYeg & 65535, 65535 & m351getMh2AYeg2) > 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return m351getMh2AYeg;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minWithOrNull-XMRcp5o, reason: not valid java name */
    public static final UByte m939minWithOrNullXMRcp5o(byte[] minWithOrNull, Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m94isEmptyimpl(minWithOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(minWithOrNull, it.nextInt());
            if (comparator.compare(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(m91getw2LRezQ2)) > 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minWithOrNull-YmdZ_VM, reason: not valid java name */
    public static final UInt m940minWithOrNullYmdZ_VM(int[] minWithOrNull, Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m172isEmptyimpl(minWithOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(minWithOrNull, it.nextInt());
            if (comparator.compare(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(m169getpVg5ArA2)) > 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minWithOrNull-eOHTfZs, reason: not valid java name */
    public static final UShort m941minWithOrNulleOHTfZs(short[] minWithOrNull, Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m354isEmptyimpl(minWithOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(minWithOrNull, it.nextInt());
            if (comparator.compare(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(m351getMh2AYeg2)) > 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minWithOrNull-zrEWJaI, reason: not valid java name */
    public static final ULong m942minWithOrNullzrEWJaI(long[] minWithOrNull, Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWithOrNull, "$this$minWithOrNull");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m250isEmptyimpl(minWithOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(minWithOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWithOrNull)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(minWithOrNull, it.nextInt());
            if (comparator.compare(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(m247getsVKNKU2)) > 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final byte m943minWithOrThrowU(byte[] minWith, Comparator<? super UByte> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UByteArray.m94isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(minWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(minWith, it.nextInt());
            if (comparator.compare(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(m91getw2LRezQ2)) > 0) {
                m91getw2LRezQ = m91getw2LRezQ2;
            }
        }
        return m91getw2LRezQ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final int m944minWithOrThrowU(int[] minWith, Comparator<? super UInt> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UIntArray.m172isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(minWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(minWith, it.nextInt());
            if (comparator.compare(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(m169getpVg5ArA2)) > 0) {
                m169getpVg5ArA = m169getpVg5ArA2;
            }
        }
        return m169getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final long m945minWithOrThrowU(long[] minWith, Comparator<? super ULong> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (ULongArray.m250isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(minWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            long m247getsVKNKU2 = ULongArray.m247getsVKNKU(minWith, it.nextInt());
            if (comparator.compare(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(m247getsVKNKU2)) > 0) {
                m247getsVKNKU = m247getsVKNKU2;
            }
        }
        return m247getsVKNKU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.7")
    @ExperimentalUnsignedTypes
    @JvmName(name = "minWithOrThrow-U")
    /* renamed from: minWithOrThrow-U, reason: not valid java name */
    public static final short m946minWithOrThrowU(short[] minWith, Comparator<? super UShort> comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (UShortArray.m354isEmptyimpl(minWith)) {
            throw new NoSuchElementException();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(minWith, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(minWith)).iterator();
        while (it.hasNext()) {
            short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(minWith, it.nextInt());
            if (comparator.compare(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(m351getMh2AYeg2)) > 0) {
                m351getMh2AYeg = m351getMh2AYeg2;
            }
        }
        return m351getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none--ajY-9A, reason: not valid java name */
    private static final boolean m947noneajY9A(int[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UIntArray.m172isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-GBYM_sE, reason: not valid java name */
    private static final boolean m948noneGBYM_sE(byte[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UByteArray.m94isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-JOV_ifY, reason: not valid java name */
    private static final boolean m949noneJOV_ifY(byte[] none, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(none);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            if (((Boolean) a.e(none, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-MShoTSo, reason: not valid java name */
    private static final boolean m950noneMShoTSo(long[] none, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(none);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            if (((Boolean) androidx.appcompat.widget.a.f(none, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-QwZRm1k, reason: not valid java name */
    private static final boolean m951noneQwZRm1k(long[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return ULongArray.m250isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-jgv0xPQ, reason: not valid java name */
    private static final boolean m952nonejgv0xPQ(int[] none, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(none);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            if (((Boolean) androidx.activity.result.a.c(none, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-rL5Bavg, reason: not valid java name */
    private static final boolean m953nonerL5Bavg(short[] none) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        return UShortArray.m354isEmptyimpl(none);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: none-xTcfx_M, reason: not valid java name */
    private static final boolean m954nonexTcfx_M(short[] none, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(none, "$this$none");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(none);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            if (((Boolean) androidx.appcompat.graphics.drawable.a.b(none, i5, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-JOV_ifY, reason: not valid java name */
    private static final byte[] m955onEachJOV_ifY(byte[] onEach, Function1<? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(onEach);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            action.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(onEach, i5)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-MShoTSo, reason: not valid java name */
    private static final long[] m956onEachMShoTSo(long[] onEach, Function1<? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(onEach);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            action.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(onEach, i5)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-jgv0xPQ, reason: not valid java name */
    private static final int[] m957onEachjgv0xPQ(int[] onEach, Function1<? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(onEach);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            action.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(onEach, i5)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEach-xTcfx_M, reason: not valid java name */
    private static final short[] m958onEachxTcfx_M(short[] onEach, Function1<? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEach, "$this$onEach");
        Intrinsics.checkNotNullParameter(action, "action");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(onEach);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            action.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(onEach, i5)));
        }
        return onEach;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-ELGow60, reason: not valid java name */
    private static final byte[] m959onEachIndexedELGow60(byte[] onEachIndexed, Function2<? super Integer, ? super UByte, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(onEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m92getSizeimpl) {
            action.invoke(Integer.valueOf(i6), UByte.m28boximpl(UByteArray.m91getw2LRezQ(onEachIndexed, i5)));
            i5++;
            i6++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-WyvcNBI, reason: not valid java name */
    private static final int[] m960onEachIndexedWyvcNBI(int[] onEachIndexed, Function2<? super Integer, ? super UInt, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(onEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m170getSizeimpl) {
            action.invoke(Integer.valueOf(i6), UInt.m104boximpl(UIntArray.m169getpVg5ArA(onEachIndexed, i5)));
            i5++;
            i6++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-s8dVfGU, reason: not valid java name */
    private static final long[] m961onEachIndexeds8dVfGU(long[] onEachIndexed, Function2<? super Integer, ? super ULong, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(onEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m248getSizeimpl) {
            action.invoke(Integer.valueOf(i6), ULong.m182boximpl(ULongArray.m247getsVKNKU(onEachIndexed, i5)));
            i5++;
            i6++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: onEachIndexed-xzaTVY8, reason: not valid java name */
    private static final short[] m962onEachIndexedxzaTVY8(short[] onEachIndexed, Function2<? super Integer, ? super UShort, Unit> action) {
        Intrinsics.checkNotNullParameter(onEachIndexed, "$this$onEachIndexed");
        Intrinsics.checkNotNullParameter(action, "action");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(onEachIndexed);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m352getSizeimpl) {
            action.invoke(Integer.valueOf(i6), UShort.m288boximpl(UShortArray.m351getMh2AYeg(onEachIndexed, i5)));
            i5++;
            i6++;
        }
        return onEachIndexed;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-3uqUaXg, reason: not valid java name */
    private static final long[] m963plus3uqUaXg(long[] plus, long j5) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return ULongArray.m242constructorimpl(ArraysKt.plus(plus, j5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: plus-CFIt9YE, reason: not valid java name */
    public static final int[] m964plusCFIt9YE(int[] plus, Collection<UInt> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(plus);
        int[] copyOf = Arrays.copyOf(plus, elements.size() + UIntArray.m170getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<UInt> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m170getSizeimpl] = it.next().m161unboximpl();
            m170getSizeimpl++;
        }
        return UIntArray.m164constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-XzdR7RA, reason: not valid java name */
    private static final short[] m965plusXzdR7RA(short[] plus, short s4) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UShortArray.m346constructorimpl(ArraysKt.plus(plus, s4));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-ctEhBpI, reason: not valid java name */
    private static final int[] m966plusctEhBpI(int[] plus, int[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UIntArray.m164constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-gMuBH34, reason: not valid java name */
    private static final byte[] m967plusgMuBH34(byte[] plus, byte b5) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UByteArray.m86constructorimpl(ArraysKt.plus(plus, b5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-kdPth3s, reason: not valid java name */
    private static final byte[] m968pluskdPth3s(byte[] plus, byte[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UByteArray.m86constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: plus-kzHmqpY, reason: not valid java name */
    public static final long[] m969pluskzHmqpY(long[] plus, Collection<ULong> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(plus);
        long[] copyOf = Arrays.copyOf(plus, elements.size() + ULongArray.m248getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<ULong> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m248getSizeimpl] = it.next().m239unboximpl();
            m248getSizeimpl++;
        }
        return ULongArray.m242constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-mazbYpA, reason: not valid java name */
    private static final short[] m970plusmazbYpA(short[] plus, short[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return UShortArray.m346constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: plus-ojwP5H8, reason: not valid java name */
    public static final short[] m971plusojwP5H8(short[] plus, Collection<UShort> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(plus);
        short[] copyOf = Arrays.copyOf(plus, elements.size() + UShortArray.m352getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<UShort> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m352getSizeimpl] = it.next().m343unboximpl();
            m352getSizeimpl++;
        }
        return UShortArray.m346constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-uWY9BYg, reason: not valid java name */
    private static final int[] m972plusuWY9BYg(int[] plus, int i5) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return UIntArray.m164constructorimpl(ArraysKt.plus(plus, i5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: plus-us8wMrg, reason: not valid java name */
    private static final long[] m973plusus8wMrg(long[] plus, long[] elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ULongArray.m242constructorimpl(ArraysKt.plus(plus, elements));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: plus-xo_DsdI, reason: not valid java name */
    public static final byte[] m974plusxo_DsdI(byte[] plus, Collection<UByte> elements) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(plus);
        byte[] copyOf = Arrays.copyOf(plus, elements.size() + UByteArray.m92getSizeimpl(plus));
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Iterator<UByte> it = elements.iterator();
        while (it.hasNext()) {
            copyOf[m92getSizeimpl] = it.next().m83unboximpl();
            m92getSizeimpl++;
        }
        return UByteArray.m86constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random--ajY-9A, reason: not valid java name */
    private static final int m975randomajY9A(int[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m976random2D5oskM(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-2D5oskM, reason: not valid java name */
    public static final int m976random2D5oskM(int[] random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UIntArray.m172isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UIntArray.m169getpVg5ArA(random, random2.nextInt(UIntArray.m170getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random-GBYM_sE, reason: not valid java name */
    private static final byte m977randomGBYM_sE(byte[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m980randomoSF2wD8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-JzugnMA, reason: not valid java name */
    public static final long m978randomJzugnMA(long[] random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (ULongArray.m250isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return ULongArray.m247getsVKNKU(random, random2.nextInt(ULongArray.m248getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random-QwZRm1k, reason: not valid java name */
    private static final long m979randomQwZRm1k(long[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m978randomJzugnMA(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-oSF2wD8, reason: not valid java name */
    public static final byte m980randomoSF2wD8(byte[] random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UByteArray.m94isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UByteArray.m91getw2LRezQ(random, random2.nextInt(UByteArray.m92getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: random-rL5Bavg, reason: not valid java name */
    private static final short m981randomrL5Bavg(short[] random) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        return m982randoms5X_as8(random, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: random-s5X_as8, reason: not valid java name */
    public static final short m982randoms5X_as8(short[] random, Random random2) {
        Intrinsics.checkNotNullParameter(random, "$this$random");
        Intrinsics.checkNotNullParameter(random2, "random");
        if (UShortArray.m354isEmptyimpl(random)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return UShortArray.m351getMh2AYeg(random, random2.nextInt(UShortArray.m352getSizeimpl(random)));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull--ajY-9A, reason: not valid java name */
    private static final UInt m983randomOrNullajY9A(int[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m984randomOrNull2D5oskM(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-2D5oskM, reason: not valid java name */
    public static final UInt m984randomOrNull2D5oskM(int[] randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UIntArray.m172isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UInt.m104boximpl(UIntArray.m169getpVg5ArA(randomOrNull, random.nextInt(UIntArray.m170getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-GBYM_sE, reason: not valid java name */
    private static final UByte m985randomOrNullGBYM_sE(byte[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m988randomOrNulloSF2wD8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-JzugnMA, reason: not valid java name */
    public static final ULong m986randomOrNullJzugnMA(long[] randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (ULongArray.m250isEmptyimpl(randomOrNull)) {
            return null;
        }
        return ULong.m182boximpl(ULongArray.m247getsVKNKU(randomOrNull, random.nextInt(ULongArray.m248getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-QwZRm1k, reason: not valid java name */
    private static final ULong m987randomOrNullQwZRm1k(long[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m986randomOrNullJzugnMA(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-oSF2wD8, reason: not valid java name */
    public static final UByte m988randomOrNulloSF2wD8(byte[] randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UByteArray.m94isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UByte.m28boximpl(UByteArray.m91getw2LRezQ(randomOrNull, random.nextInt(UByteArray.m92getSizeimpl(randomOrNull))));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-rL5Bavg, reason: not valid java name */
    private static final UShort m989randomOrNullrL5Bavg(short[] randomOrNull) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        return m990randomOrNulls5X_as8(randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: randomOrNull-s5X_as8, reason: not valid java name */
    public static final UShort m990randomOrNulls5X_as8(short[] randomOrNull, Random random) {
        Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        Intrinsics.checkNotNullParameter(random, "random");
        if (UShortArray.m354isEmptyimpl(randomOrNull)) {
            return null;
        }
        return UShort.m288boximpl(UShortArray.m351getMh2AYeg(randomOrNull, random.nextInt(UShortArray.m352getSizeimpl(randomOrNull))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-ELGow60, reason: not valid java name */
    private static final byte m991reduceELGow60(byte[] reduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduce, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m91getw2LRezQ = operation.invoke(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduce, it.nextInt()))).m83unboximpl();
        }
        return m91getw2LRezQ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-WyvcNBI, reason: not valid java name */
    private static final int m992reduceWyvcNBI(int[] reduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduce, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m169getpVg5ArA = operation.invoke(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduce, it.nextInt()))).m161unboximpl();
        }
        return m169getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-s8dVfGU, reason: not valid java name */
    private static final long m993reduces8dVfGU(long[] reduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduce, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m247getsVKNKU = operation.invoke(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(ULongArray.m247getsVKNKU(reduce, it.nextInt()))).m239unboximpl();
        }
        return m247getsVKNKU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduce-xzaTVY8, reason: not valid java name */
    private static final short m994reducexzaTVY8(short[] reduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(reduce)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduce, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduce)).iterator();
        while (it.hasNext()) {
            m351getMh2AYeg = operation.invoke(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduce, it.nextInt()))).m343unboximpl();
        }
        return m351getMh2AYeg;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-D40WMg8, reason: not valid java name */
    private static final int m995reduceIndexedD40WMg8(int[] reduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceIndexed, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m169getpVg5ArA = operation.invoke(Integer.valueOf(nextInt), UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceIndexed, nextInt))).m161unboximpl();
        }
        return m169getpVg5ArA;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m996reduceIndexedEOyYB1Y(byte[] reduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceIndexed, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m91getw2LRezQ = operation.invoke(Integer.valueOf(nextInt), UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceIndexed, nextInt))).m83unboximpl();
        }
        return m91getw2LRezQ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m997reduceIndexedaLgx1Fo(short[] reduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceIndexed, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m351getMh2AYeg = operation.invoke(Integer.valueOf(nextInt), UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceIndexed, nextInt))).m343unboximpl();
        }
        return m351getMh2AYeg;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexed-z1zDJgo, reason: not valid java name */
    private static final long m998reduceIndexedz1zDJgo(long[] reduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexed, "$this$reduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(reduceIndexed)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceIndexed, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexed)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m247getsVKNKU = operation.invoke(Integer.valueOf(nextInt), ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceIndexed, nextInt))).m239unboximpl();
        }
        return m247getsVKNKU;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final UInt m999reduceIndexedOrNullD40WMg8(int[] reduceIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceIndexedOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m169getpVg5ArA = operation.invoke(Integer.valueOf(nextInt), UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceIndexedOrNull, nextInt))).m161unboximpl();
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final UByte m1000reduceIndexedOrNullEOyYB1Y(byte[] reduceIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceIndexedOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m91getw2LRezQ = operation.invoke(Integer.valueOf(nextInt), UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceIndexedOrNull, nextInt))).m83unboximpl();
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final UShort m1001reduceIndexedOrNullaLgx1Fo(short[] reduceIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceIndexedOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m351getMh2AYeg = operation.invoke(Integer.valueOf(nextInt), UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceIndexedOrNull, nextInt))).m343unboximpl();
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final ULong m1002reduceIndexedOrNullz1zDJgo(long[] reduceIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceIndexedOrNull, "$this$reduceIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(reduceIndexedOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceIndexedOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceIndexedOrNull)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            m247getsVKNKU = operation.invoke(Integer.valueOf(nextInt), ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceIndexedOrNull, nextInt))).m239unboximpl();
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-ELGow60, reason: not valid java name */
    private static final UByte m1003reduceOrNullELGow60(byte[] reduceOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(reduceOrNull)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m91getw2LRezQ = operation.invoke(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceOrNull, it.nextInt()))).m83unboximpl();
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-WyvcNBI, reason: not valid java name */
    private static final UInt m1004reduceOrNullWyvcNBI(int[] reduceOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(reduceOrNull)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m169getpVg5ArA = operation.invoke(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceOrNull, it.nextInt()))).m161unboximpl();
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-s8dVfGU, reason: not valid java name */
    private static final ULong m1005reduceOrNulls8dVfGU(long[] reduceOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(reduceOrNull)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m247getsVKNKU = operation.invoke(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceOrNull, it.nextInt()))).m239unboximpl();
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceOrNull-xzaTVY8, reason: not valid java name */
    private static final UShort m1006reduceOrNullxzaTVY8(short[] reduceOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceOrNull, "$this$reduceOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(reduceOrNull)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceOrNull, 0);
        ?? it = new IntRange(1, ArraysKt.getLastIndex(reduceOrNull)).iterator();
        while (it.hasNext()) {
            m351getMh2AYeg = operation.invoke(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceOrNull, it.nextInt()))).m343unboximpl();
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-ELGow60, reason: not valid java name */
    private static final byte m1007reduceRightELGow60(byte[] reduceRight, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceRight, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m91getw2LRezQ = operation.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceRight, i5)), UByte.m28boximpl(m91getw2LRezQ)).m83unboximpl();
        }
        return m91getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-WyvcNBI, reason: not valid java name */
    private static final int m1008reduceRightWyvcNBI(int[] reduceRight, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceRight, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m169getpVg5ArA = operation.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceRight, i5)), UInt.m104boximpl(m169getpVg5ArA)).m161unboximpl();
        }
        return m169getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-s8dVfGU, reason: not valid java name */
    private static final long m1009reduceRights8dVfGU(long[] reduceRight, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceRight, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m247getsVKNKU = operation.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceRight, i5)), ULong.m182boximpl(m247getsVKNKU)).m239unboximpl();
        }
        return m247getsVKNKU;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRight-xzaTVY8, reason: not valid java name */
    private static final short m1010reduceRightxzaTVY8(short[] reduceRight, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRight, "$this$reduceRight");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRight);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceRight, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m351getMh2AYeg = operation.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceRight, i5)), UShort.m288boximpl(m351getMh2AYeg)).m343unboximpl();
        }
        return m351getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-D40WMg8, reason: not valid java name */
    private static final int m1011reduceRightIndexedD40WMg8(int[] reduceRightIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceRightIndexed, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m169getpVg5ArA = operation.invoke(Integer.valueOf(i5), UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceRightIndexed, i5)), UInt.m104boximpl(m169getpVg5ArA)).m161unboximpl();
        }
        return m169getpVg5ArA;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-EOyYB1Y, reason: not valid java name */
    private static final byte m1012reduceRightIndexedEOyYB1Y(byte[] reduceRightIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceRightIndexed, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m91getw2LRezQ = operation.invoke(Integer.valueOf(i5), UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceRightIndexed, i5)), UByte.m28boximpl(m91getw2LRezQ)).m83unboximpl();
        }
        return m91getw2LRezQ;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-aLgx1Fo, reason: not valid java name */
    private static final short m1013reduceRightIndexedaLgx1Fo(short[] reduceRightIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceRightIndexed, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m351getMh2AYeg = operation.invoke(Integer.valueOf(i5), UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceRightIndexed, i5)), UShort.m288boximpl(m351getMh2AYeg)).m343unboximpl();
        }
        return m351getMh2AYeg;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexed-z1zDJgo, reason: not valid java name */
    private static final long m1014reduceRightIndexedz1zDJgo(long[] reduceRightIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexed, "$this$reduceRightIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexed);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceRightIndexed, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m247getsVKNKU = operation.invoke(Integer.valueOf(i5), ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceRightIndexed, i5)), ULong.m182boximpl(m247getsVKNKU)).m239unboximpl();
        }
        return m247getsVKNKU;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-D40WMg8, reason: not valid java name */
    private static final UInt m1015reduceRightIndexedOrNullD40WMg8(int[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceRightIndexedOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m169getpVg5ArA = operation.invoke(Integer.valueOf(i5), UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceRightIndexedOrNull, i5)), UInt.m104boximpl(m169getpVg5ArA)).m161unboximpl();
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-EOyYB1Y, reason: not valid java name */
    private static final UByte m1016reduceRightIndexedOrNullEOyYB1Y(byte[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceRightIndexedOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m91getw2LRezQ = operation.invoke(Integer.valueOf(i5), UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceRightIndexedOrNull, i5)), UByte.m28boximpl(m91getw2LRezQ)).m83unboximpl();
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-aLgx1Fo, reason: not valid java name */
    private static final UShort m1017reduceRightIndexedOrNullaLgx1Fo(short[] reduceRightIndexedOrNull, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceRightIndexedOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m351getMh2AYeg = operation.invoke(Integer.valueOf(i5), UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceRightIndexedOrNull, i5)), UShort.m288boximpl(m351getMh2AYeg)).m343unboximpl();
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reduceRightIndexedOrNull-z1zDJgo, reason: not valid java name */
    private static final ULong m1018reduceRightIndexedOrNullz1zDJgo(long[] reduceRightIndexedOrNull, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightIndexedOrNull, "$this$reduceRightIndexedOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightIndexedOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceRightIndexedOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m247getsVKNKU = operation.invoke(Integer.valueOf(i5), ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceRightIndexedOrNull, i5)), ULong.m182boximpl(m247getsVKNKU)).m239unboximpl();
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-ELGow60, reason: not valid java name */
    private static final UByte m1019reduceRightOrNullELGow60(byte[] reduceRightOrNull, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(reduceRightOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m91getw2LRezQ = operation.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(reduceRightOrNull, i5)), UByte.m28boximpl(m91getw2LRezQ)).m83unboximpl();
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-WyvcNBI, reason: not valid java name */
    private static final UInt m1020reduceRightOrNullWyvcNBI(int[] reduceRightOrNull, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(reduceRightOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m169getpVg5ArA = operation.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(reduceRightOrNull, i5)), UInt.m104boximpl(m169getpVg5ArA)).m161unboximpl();
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-s8dVfGU, reason: not valid java name */
    private static final ULong m1021reduceRightOrNulls8dVfGU(long[] reduceRightOrNull, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(reduceRightOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m247getsVKNKU = operation.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(reduceRightOrNull, i5)), ULong.m182boximpl(m247getsVKNKU)).m239unboximpl();
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: reduceRightOrNull-xzaTVY8, reason: not valid java name */
    private static final UShort m1022reduceRightOrNullxzaTVY8(short[] reduceRightOrNull, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(reduceRightOrNull, "$this$reduceRightOrNull");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = ArraysKt.getLastIndex(reduceRightOrNull);
        if (lastIndex < 0) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(reduceRightOrNull, lastIndex);
        for (int i5 = lastIndex - 1; i5 >= 0; i5--) {
            m351getMh2AYeg = operation.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(reduceRightOrNull, i5)), UShort.m288boximpl(m351getMh2AYeg)).m343unboximpl();
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse--ajY-9A, reason: not valid java name */
    private static final void m1023reverseajY9A(int[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse--nroSd4, reason: not valid java name */
    private static final void m1024reversenroSd4(long[] reverse, int i5, int i6) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-4UcCI2c, reason: not valid java name */
    private static final void m1025reverse4UcCI2c(byte[] reverse, int i5, int i6) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-Aa5vz7o, reason: not valid java name */
    private static final void m1026reverseAa5vz7o(short[] reverse, int i5, int i6) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-GBYM_sE, reason: not valid java name */
    private static final void m1027reverseGBYM_sE(byte[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-QwZRm1k, reason: not valid java name */
    private static final void m1028reverseQwZRm1k(long[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-oBK06Vg, reason: not valid java name */
    private static final void m1029reverseoBK06Vg(int[] reverse, int i5, int i6) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reverse-rL5Bavg, reason: not valid java name */
    private static final void m1030reverserL5Bavg(short[] reverse) {
        Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        ArraysKt.reverse(reverse);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: reversed--ajY-9A, reason: not valid java name */
    public static final List<UInt> m1031reversedajY9A(int[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UIntArray.m172isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<UInt> mutableList = CollectionsKt.toMutableList((Collection) UIntArray.m162boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: reversed-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m1032reversedGBYM_sE(byte[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UByteArray.m94isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<UByte> mutableList = CollectionsKt.toMutableList((Collection) UByteArray.m84boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: reversed-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m1033reversedQwZRm1k(long[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (ULongArray.m250isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<ULong> mutableList = CollectionsKt.toMutableList((Collection) ULongArray.m240boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: reversed-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m1034reversedrL5Bavg(short[] reversed) {
        Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (UShortArray.m354isEmptyimpl(reversed)) {
            return CollectionsKt.emptyList();
        }
        List<UShort> mutableList = CollectionsKt.toMutableList((Collection) UShortArray.m344boximpl(reversed));
        CollectionsKt.reverse(mutableList);
        return mutableList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray--ajY-9A, reason: not valid java name */
    private static final int[] m1035reversedArrayajY9A(int[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UIntArray.m164constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1036reversedArrayGBYM_sE(byte[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UByteArray.m86constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1037reversedArrayQwZRm1k(long[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return ULongArray.m242constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: reversedArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1038reversedArrayrL5Bavg(short[] reversedArray) {
        Intrinsics.checkNotNullParameter(reversedArray, "$this$reversedArray");
        return UShortArray.m346constructorimpl(ArraysKt.reversedArray(reversedArray));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1039runningFoldA8wKCXQ(long[] runningFold, R r4, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(runningFold);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            r4 = operation.invoke(r4, ULong.m182boximpl(ULongArray.m247getsVKNKU(runningFold, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1040runningFoldyXmHNn8(byte[] runningFold, R r4, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(runningFold);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UByte.m28boximpl(UByteArray.m91getw2LRezQ(runningFold, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1041runningFoldzi1B2BA(int[] runningFold, R r4, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(runningFold);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UInt.m104boximpl(UIntArray.m169getpVg5ArA(runningFold, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFold-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1042runningFoldzww5nb8(short[] runningFold, R r4, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFold, "$this$runningFold");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(runningFold)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(runningFold) + 1);
        arrayList.add(r4);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(runningFold);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UShort.m288boximpl(UShortArray.m351getMh2AYeg(runningFold, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1043runningFoldIndexed3iWJZGE(byte[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(runningFoldIndexed);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, UByte.m28boximpl(UByteArray.m91getw2LRezQ(runningFoldIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1044runningFoldIndexedbzxtMww(short[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(runningFoldIndexed);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, UShort.m288boximpl(UShortArray.m351getMh2AYeg(runningFoldIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1045runningFoldIndexedmwnnOCs(long[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(runningFoldIndexed);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, ULong.m182boximpl(ULongArray.m247getsVKNKU(runningFoldIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningFoldIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1046runningFoldIndexedyVwIW0Q(int[] runningFoldIndexed, R r4, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(runningFoldIndexed, "$this$runningFoldIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(runningFoldIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(runningFoldIndexed) + 1);
        arrayList.add(r4);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(runningFoldIndexed);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, UInt.m104boximpl(UIntArray.m169getpVg5ArA(runningFoldIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-ELGow60, reason: not valid java name */
    private static final List<UByte> m1047runningReduceELGow60(byte[] runningReduce, Function2<? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(runningReduce));
        arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
        int m92getSizeimpl = UByteArray.m92getSizeimpl(runningReduce);
        for (int i5 = 1; i5 < m92getSizeimpl; i5++) {
            m91getw2LRezQ = operation.invoke(UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(UByteArray.m91getw2LRezQ(runningReduce, i5))).m83unboximpl();
            arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-WyvcNBI, reason: not valid java name */
    private static final List<UInt> m1048runningReduceWyvcNBI(int[] runningReduce, Function2<? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(runningReduce));
        arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
        int m170getSizeimpl = UIntArray.m170getSizeimpl(runningReduce);
        for (int i5 = 1; i5 < m170getSizeimpl; i5++) {
            m169getpVg5ArA = operation.invoke(UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(UIntArray.m169getpVg5ArA(runningReduce, i5))).m161unboximpl();
            arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-s8dVfGU, reason: not valid java name */
    private static final List<ULong> m1049runningReduces8dVfGU(long[] runningReduce, Function2<? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(runningReduce, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(runningReduce));
        arrayList.add(ULong.m182boximpl(m247getsVKNKU));
        int m248getSizeimpl = ULongArray.m248getSizeimpl(runningReduce);
        for (int i5 = 1; i5 < m248getSizeimpl; i5++) {
            m247getsVKNKU = operation.invoke(ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(ULongArray.m247getsVKNKU(runningReduce, i5))).m239unboximpl();
            arrayList.add(ULong.m182boximpl(m247getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduce-xzaTVY8, reason: not valid java name */
    private static final List<UShort> m1050runningReducexzaTVY8(short[] runningReduce, Function2<? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(runningReduce, "$this$runningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(runningReduce)) {
            return CollectionsKt.emptyList();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(runningReduce, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(runningReduce));
        arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
        int m352getSizeimpl = UShortArray.m352getSizeimpl(runningReduce);
        for (int i5 = 1; i5 < m352getSizeimpl; i5++) {
            m351getMh2AYeg = operation.invoke(UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(UShortArray.m351getMh2AYeg(runningReduce, i5))).m343unboximpl();
            arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-D40WMg8, reason: not valid java name */
    private static final List<UInt> m1051runningReduceIndexedD40WMg8(int[] runningReduceIndexed, Function3<? super Integer, ? super UInt, ? super UInt, UInt> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(runningReduceIndexed));
        arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
        int m170getSizeimpl = UIntArray.m170getSizeimpl(runningReduceIndexed);
        for (int i5 = 1; i5 < m170getSizeimpl; i5++) {
            m169getpVg5ArA = operation.invoke(Integer.valueOf(i5), UInt.m104boximpl(m169getpVg5ArA), UInt.m104boximpl(UIntArray.m169getpVg5ArA(runningReduceIndexed, i5))).m161unboximpl();
            arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-EOyYB1Y, reason: not valid java name */
    private static final List<UByte> m1052runningReduceIndexedEOyYB1Y(byte[] runningReduceIndexed, Function3<? super Integer, ? super UByte, ? super UByte, UByte> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(runningReduceIndexed));
        arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
        int m92getSizeimpl = UByteArray.m92getSizeimpl(runningReduceIndexed);
        for (int i5 = 1; i5 < m92getSizeimpl; i5++) {
            m91getw2LRezQ = operation.invoke(Integer.valueOf(i5), UByte.m28boximpl(m91getw2LRezQ), UByte.m28boximpl(UByteArray.m91getw2LRezQ(runningReduceIndexed, i5))).m83unboximpl();
            arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-aLgx1Fo, reason: not valid java name */
    private static final List<UShort> m1053runningReduceIndexedaLgx1Fo(short[] runningReduceIndexed, Function3<? super Integer, ? super UShort, ? super UShort, UShort> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(runningReduceIndexed));
        arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
        int m352getSizeimpl = UShortArray.m352getSizeimpl(runningReduceIndexed);
        for (int i5 = 1; i5 < m352getSizeimpl; i5++) {
            m351getMh2AYeg = operation.invoke(Integer.valueOf(i5), UShort.m288boximpl(m351getMh2AYeg), UShort.m288boximpl(UShortArray.m351getMh2AYeg(runningReduceIndexed, i5))).m343unboximpl();
            arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: runningReduceIndexed-z1zDJgo, reason: not valid java name */
    private static final List<ULong> m1054runningReduceIndexedz1zDJgo(long[] runningReduceIndexed, Function3<? super Integer, ? super ULong, ? super ULong, ULong> operation) {
        Intrinsics.checkNotNullParameter(runningReduceIndexed, "$this$runningReduceIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(runningReduceIndexed)) {
            return CollectionsKt.emptyList();
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(runningReduceIndexed, 0);
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(runningReduceIndexed));
        arrayList.add(ULong.m182boximpl(m247getsVKNKU));
        int m248getSizeimpl = ULongArray.m248getSizeimpl(runningReduceIndexed);
        for (int i5 = 1; i5 < m248getSizeimpl; i5++) {
            m247getsVKNKU = operation.invoke(Integer.valueOf(i5), ULong.m182boximpl(m247getsVKNKU), ULong.m182boximpl(ULongArray.m247getsVKNKU(runningReduceIndexed, i5))).m239unboximpl();
            arrayList.add(ULong.m182boximpl(m247getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-A8wKCXQ, reason: not valid java name */
    private static final <R> List<R> m1055scanA8wKCXQ(long[] scan, R r4, Function2<? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(scan);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            r4 = operation.invoke(r4, ULong.m182boximpl(ULongArray.m247getsVKNKU(scan, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-yXmHNn8, reason: not valid java name */
    private static final <R> List<R> m1056scanyXmHNn8(byte[] scan, R r4, Function2<? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(scan);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UByte.m28boximpl(UByteArray.m91getw2LRezQ(scan, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-zi1B2BA, reason: not valid java name */
    private static final <R> List<R> m1057scanzi1B2BA(int[] scan, R r4, Function2<? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(scan);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UInt.m104boximpl(UIntArray.m169getpVg5ArA(scan, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scan-zww5nb8, reason: not valid java name */
    private static final <R> List<R> m1058scanzww5nb8(short[] scan, R r4, Function2<? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scan, "$this$scan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(scan)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(scan) + 1);
        arrayList.add(r4);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(scan);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            r4 = operation.invoke(r4, UShort.m288boximpl(UShortArray.m351getMh2AYeg(scan, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-3iWJZGE, reason: not valid java name */
    private static final <R> List<R> m1059scanIndexed3iWJZGE(byte[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super UByte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UByteArray.m94isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UByteArray.m92getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(scanIndexed);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, UByte.m28boximpl(UByteArray.m91getw2LRezQ(scanIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-bzxtMww, reason: not valid java name */
    private static final <R> List<R> m1060scanIndexedbzxtMww(short[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super UShort, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UShortArray.m354isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UShortArray.m352getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(scanIndexed);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, UShort.m288boximpl(UShortArray.m351getMh2AYeg(scanIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-mwnnOCs, reason: not valid java name */
    private static final <R> List<R> m1061scanIndexedmwnnOCs(long[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super ULong, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (ULongArray.m250isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(ULongArray.m248getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(scanIndexed);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, ULong.m182boximpl(ULongArray.m247getsVKNKU(scanIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: scanIndexed-yVwIW0Q, reason: not valid java name */
    private static final <R> List<R> m1062scanIndexedyVwIW0Q(int[] scanIndexed, R r4, Function3<? super Integer, ? super R, ? super UInt, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(scanIndexed, "$this$scanIndexed");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (UIntArray.m172isEmptyimpl(scanIndexed)) {
            return CollectionsKt.listOf(r4);
        }
        ArrayList arrayList = new ArrayList(UIntArray.m170getSizeimpl(scanIndexed) + 1);
        arrayList.add(r4);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(scanIndexed);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            r4 = operation.invoke(Integer.valueOf(i5), r4, UInt.m104boximpl(UIntArray.m169getpVg5ArA(scanIndexed, i5)));
            arrayList.add(r4);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle--ajY-9A, reason: not valid java name */
    public static final void m1063shuffleajY9A(int[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1064shuffle2D5oskM(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-2D5oskM, reason: not valid java name */
    public static final void m1064shuffle2D5oskM(int[] shuffle, Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(shuffle, lastIndex);
            UIntArray.m174setVXSXFK8(shuffle, lastIndex, UIntArray.m169getpVg5ArA(shuffle, nextInt));
            UIntArray.m174setVXSXFK8(shuffle, nextInt, m169getpVg5ArA);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-GBYM_sE, reason: not valid java name */
    public static final void m1065shuffleGBYM_sE(byte[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1068shuffleoSF2wD8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-JzugnMA, reason: not valid java name */
    public static final void m1066shuffleJzugnMA(long[] shuffle, Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            long m247getsVKNKU = ULongArray.m247getsVKNKU(shuffle, lastIndex);
            ULongArray.m252setk8EXiF4(shuffle, lastIndex, ULongArray.m247getsVKNKU(shuffle, nextInt));
            ULongArray.m252setk8EXiF4(shuffle, nextInt, m247getsVKNKU);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-QwZRm1k, reason: not valid java name */
    public static final void m1067shuffleQwZRm1k(long[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1066shuffleJzugnMA(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-oSF2wD8, reason: not valid java name */
    public static final void m1068shuffleoSF2wD8(byte[] shuffle, Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(shuffle, lastIndex);
            UByteArray.m96setVurrAj0(shuffle, lastIndex, UByteArray.m91getw2LRezQ(shuffle, nextInt));
            UByteArray.m96setVurrAj0(shuffle, nextInt, m91getw2LRezQ);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-rL5Bavg, reason: not valid java name */
    public static final void m1069shufflerL5Bavg(short[] shuffle) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        m1070shuffles5X_as8(shuffle, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: shuffle-s5X_as8, reason: not valid java name */
    public static final void m1070shuffles5X_as8(short[] shuffle, Random random) {
        Intrinsics.checkNotNullParameter(shuffle, "$this$shuffle");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = ArraysKt.getLastIndex(shuffle); lastIndex > 0; lastIndex--) {
            int nextInt = random.nextInt(lastIndex + 1);
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(shuffle, lastIndex);
            UShortArray.m356set01HTLdE(shuffle, lastIndex, UShortArray.m351getMh2AYeg(shuffle, nextInt));
            UShortArray.m356set01HTLdE(shuffle, nextInt, m351getMh2AYeg);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single--ajY-9A, reason: not valid java name */
    private static final int m1071singleajY9A(int[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UInt.m110constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-GBYM_sE, reason: not valid java name */
    private static final byte m1072singleGBYM_sE(byte[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UByte.m34constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-JOV_ifY, reason: not valid java name */
    private static final byte m1073singleJOV_ifY(byte[] single, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(single);
        UByte uByte = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(single, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uByte = UByte.m28boximpl(m91getw2LRezQ);
                z4 = true;
            }
        }
        if (z4) {
            return uByte.m83unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-MShoTSo, reason: not valid java name */
    private static final long m1074singleMShoTSo(long[] single, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(single);
        ULong uLong = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(single, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uLong = ULong.m182boximpl(m247getsVKNKU);
                z4 = true;
            }
        }
        if (z4) {
            return uLong.m239unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-QwZRm1k, reason: not valid java name */
    private static final long m1075singleQwZRm1k(long[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return ULong.m188constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-jgv0xPQ, reason: not valid java name */
    private static final int m1076singlejgv0xPQ(int[] single, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(single);
        UInt uInt = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(single, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uInt = UInt.m104boximpl(m169getpVg5ArA);
                z4 = true;
            }
        }
        if (z4) {
            return uInt.m161unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-rL5Bavg, reason: not valid java name */
    private static final short m1077singlerL5Bavg(short[] single) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        return UShort.m294constructorimpl(ArraysKt.single(single));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: single-xTcfx_M, reason: not valid java name */
    private static final short m1078singlexTcfx_M(short[] single, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(single);
        UShort uShort = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(single, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                if (z4) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                uShort = UShort.m288boximpl(m351getMh2AYeg);
                z4 = true;
            }
        }
        if (z4) {
            return uShort.m343unboximpl();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: singleOrNull--ajY-9A, reason: not valid java name */
    public static final UInt m1079singleOrNullajY9A(int[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UIntArray.m170getSizeimpl(singleOrNull) == 1) {
            return UInt.m104boximpl(UIntArray.m169getpVg5ArA(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: singleOrNull-GBYM_sE, reason: not valid java name */
    public static final UByte m1080singleOrNullGBYM_sE(byte[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UByteArray.m92getSizeimpl(singleOrNull) == 1) {
            return UByte.m28boximpl(UByteArray.m91getw2LRezQ(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-JOV_ifY, reason: not valid java name */
    private static final UByte m1081singleOrNullJOV_ifY(byte[] singleOrNull, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(singleOrNull);
        UByte uByte = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(singleOrNull, i5);
            if (predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uByte = UByte.m28boximpl(m91getw2LRezQ);
                z4 = true;
            }
        }
        if (z4) {
            return uByte;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-MShoTSo, reason: not valid java name */
    private static final ULong m1082singleOrNullMShoTSo(long[] singleOrNull, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(singleOrNull);
        ULong uLong = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(singleOrNull, i5);
            if (predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uLong = ULong.m182boximpl(m247getsVKNKU);
                z4 = true;
            }
        }
        if (z4) {
            return uLong;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: singleOrNull-QwZRm1k, reason: not valid java name */
    public static final ULong m1083singleOrNullQwZRm1k(long[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (ULongArray.m248getSizeimpl(singleOrNull) == 1) {
            return ULong.m182boximpl(ULongArray.m247getsVKNKU(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-jgv0xPQ, reason: not valid java name */
    private static final UInt m1084singleOrNulljgv0xPQ(int[] singleOrNull, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(singleOrNull);
        UInt uInt = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(singleOrNull, i5);
            if (predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uInt = UInt.m104boximpl(m169getpVg5ArA);
                z4 = true;
            }
        }
        if (z4) {
            return uInt;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: singleOrNull-rL5Bavg, reason: not valid java name */
    public static final UShort m1085singleOrNullrL5Bavg(short[] singleOrNull) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        if (UShortArray.m352getSizeimpl(singleOrNull) == 1) {
            return UShort.m288boximpl(UShortArray.m351getMh2AYeg(singleOrNull, 0));
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: singleOrNull-xTcfx_M, reason: not valid java name */
    private static final UShort m1086singleOrNullxTcfx_M(short[] singleOrNull, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(singleOrNull, "$this$singleOrNull");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(singleOrNull);
        UShort uShort = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(singleOrNull, i5);
            if (predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                if (z4) {
                    return null;
                }
                uShort = UShort.m288boximpl(m351getMh2AYeg);
                z4 = true;
            }
        }
        if (z4) {
            return uShort;
        }
        return null;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-F7u83W8, reason: not valid java name */
    public static final List<ULong> m1087sliceF7u83W8(long[] slice, Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(ULong.m182boximpl(ULongArray.m247getsVKNKU(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-HwE9HBo, reason: not valid java name */
    public static final List<UInt> m1088sliceHwE9HBo(int[] slice, Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UInt.m104boximpl(UIntArray.m169getpVg5ArA(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-JGPC0-M, reason: not valid java name */
    public static final List<UShort> m1089sliceJGPC0M(short[] slice, Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UShort.m288boximpl(UShortArray.m351getMh2AYeg(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-JQknh5Q, reason: not valid java name */
    public static final List<UByte> m1090sliceJQknh5Q(byte[] slice, Iterable<Integer> indices) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(UByte.m28boximpl(UByteArray.m91getw2LRezQ(slice, it.next().intValue())));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-Q6IL4kU, reason: not valid java name */
    public static final List<UShort> m1091sliceQ6IL4kU(short[] slice, IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m482asListrL5Bavg(UShortArray.m346constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static final List<ULong> m1092sliceZRhS8yI(long[] slice, IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m481asListQwZRm1k(ULongArray.m242constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-c0bezYM, reason: not valid java name */
    public static final List<UByte> m1093slicec0bezYM(byte[] slice, IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m480asListGBYM_sE(UByteArray.m86constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: slice-tAntMlw, reason: not valid java name */
    public static final List<UInt> m1094slicetAntMlw(int[] slice, IntRange indices) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt.emptyList() : UArraysKt___UArraysJvmKt.m479asListajY9A(UIntArray.m164constructorimpl(ArraysKt.copyOfRange(slice, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1)));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-CFIt9YE, reason: not valid java name */
    public static final int[] m1095sliceArrayCFIt9YE(int[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m164constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-Q6IL4kU, reason: not valid java name */
    public static final short[] m1096sliceArrayQ6IL4kU(short[] sliceArray, IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m346constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-ZRhS8yI, reason: not valid java name */
    public static final long[] m1097sliceArrayZRhS8yI(long[] sliceArray, IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m242constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-c0bezYM, reason: not valid java name */
    public static final byte[] m1098sliceArrayc0bezYM(byte[] sliceArray, IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m86constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-kzHmqpY, reason: not valid java name */
    public static final long[] m1099sliceArraykzHmqpY(long[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return ULongArray.m242constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-ojwP5H8, reason: not valid java name */
    public static final short[] m1100sliceArrayojwP5H8(short[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UShortArray.m346constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-tAntMlw, reason: not valid java name */
    public static final int[] m1101sliceArraytAntMlw(int[] sliceArray, IntRange indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UIntArray.m164constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sliceArray-xo_DsdI, reason: not valid java name */
    public static final byte[] m1102sliceArrayxo_DsdI(byte[] sliceArray, Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sliceArray, "$this$sliceArray");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return UByteArray.m86constructorimpl(ArraysKt.sliceArray(sliceArray, indices));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort--ajY-9A, reason: not valid java name */
    public static final void m1103sortajY9A(int[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UIntArray.m170getSizeimpl(sort) > 1) {
            UArraySortingKt.m478sortArrayoBK06Vg(sort, 0, UIntArray.m170getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort--nroSd4, reason: not valid java name */
    public static final void m1104sortnroSd4(long[] sort, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, ULongArray.m248getSizeimpl(sort));
        UArraySortingKt.m475sortArraynroSd4(sort, i5, i6);
    }

    /* renamed from: sort--nroSd4$default, reason: not valid java name */
    public static /* synthetic */ void m1105sortnroSd4$default(long[] jArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = ULongArray.m248getSizeimpl(jArr);
        }
        m1104sortnroSd4(jArr, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-4UcCI2c, reason: not valid java name */
    public static final void m1106sort4UcCI2c(byte[] sort, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, UByteArray.m92getSizeimpl(sort));
        UArraySortingKt.m476sortArray4UcCI2c(sort, i5, i6);
    }

    /* renamed from: sort-4UcCI2c$default, reason: not valid java name */
    public static /* synthetic */ void m1107sort4UcCI2c$default(byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = UByteArray.m92getSizeimpl(bArr);
        }
        m1106sort4UcCI2c(bArr, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-Aa5vz7o, reason: not valid java name */
    public static final void m1108sortAa5vz7o(short[] sort, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, UShortArray.m352getSizeimpl(sort));
        UArraySortingKt.m477sortArrayAa5vz7o(sort, i5, i6);
    }

    /* renamed from: sort-Aa5vz7o$default, reason: not valid java name */
    public static /* synthetic */ void m1109sortAa5vz7o$default(short[] sArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = UShortArray.m352getSizeimpl(sArr);
        }
        m1108sortAa5vz7o(sArr, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-GBYM_sE, reason: not valid java name */
    public static final void m1110sortGBYM_sE(byte[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UByteArray.m92getSizeimpl(sort) > 1) {
            UArraySortingKt.m476sortArray4UcCI2c(sort, 0, UByteArray.m92getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-QwZRm1k, reason: not valid java name */
    public static final void m1111sortQwZRm1k(long[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (ULongArray.m248getSizeimpl(sort) > 1) {
            UArraySortingKt.m475sortArraynroSd4(sort, 0, ULongArray.m248getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-oBK06Vg, reason: not valid java name */
    public static final void m1112sortoBK06Vg(int[] sort, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, UIntArray.m170getSizeimpl(sort));
        UArraySortingKt.m478sortArrayoBK06Vg(sort, i5, i6);
    }

    /* renamed from: sort-oBK06Vg$default, reason: not valid java name */
    public static /* synthetic */ void m1113sortoBK06Vg$default(int[] iArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = UIntArray.m170getSizeimpl(iArr);
        }
        m1112sortoBK06Vg(iArr, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sort-rL5Bavg, reason: not valid java name */
    public static final void m1114sortrL5Bavg(short[] sort) {
        Intrinsics.checkNotNullParameter(sort, "$this$sort");
        if (UShortArray.m352getSizeimpl(sort) > 1) {
            UArraySortingKt.m477sortArrayAa5vz7o(sort, 0, UShortArray.m352getSizeimpl(sort));
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending--ajY-9A, reason: not valid java name */
    public static final void m1115sortDescendingajY9A(int[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UIntArray.m170getSizeimpl(sortDescending) > 1) {
            m1103sortajY9A(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending--nroSd4, reason: not valid java name */
    public static final void m1116sortDescendingnroSd4(long[] sortDescending, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1104sortnroSd4(sortDescending, i5, i6);
        ArraysKt.reverse(sortDescending, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-4UcCI2c, reason: not valid java name */
    public static final void m1117sortDescending4UcCI2c(byte[] sortDescending, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1106sort4UcCI2c(sortDescending, i5, i6);
        ArraysKt.reverse(sortDescending, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-Aa5vz7o, reason: not valid java name */
    public static final void m1118sortDescendingAa5vz7o(short[] sortDescending, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1108sortAa5vz7o(sortDescending, i5, i6);
        ArraysKt.reverse(sortDescending, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-GBYM_sE, reason: not valid java name */
    public static final void m1119sortDescendingGBYM_sE(byte[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UByteArray.m92getSizeimpl(sortDescending) > 1) {
            m1110sortGBYM_sE(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-QwZRm1k, reason: not valid java name */
    public static final void m1120sortDescendingQwZRm1k(long[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (ULongArray.m248getSizeimpl(sortDescending) > 1) {
            m1111sortQwZRm1k(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-oBK06Vg, reason: not valid java name */
    public static final void m1121sortDescendingoBK06Vg(int[] sortDescending, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        m1112sortoBK06Vg(sortDescending, i5, i6);
        ArraysKt.reverse(sortDescending, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortDescending-rL5Bavg, reason: not valid java name */
    public static final void m1122sortDescendingrL5Bavg(short[] sortDescending) {
        Intrinsics.checkNotNullParameter(sortDescending, "$this$sortDescending");
        if (UShortArray.m352getSizeimpl(sortDescending) > 1) {
            m1114sortrL5Bavg(sortDescending);
            ArraysKt.reverse(sortDescending);
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sorted--ajY-9A, reason: not valid java name */
    public static final List<UInt> m1123sortedajY9A(int[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        int[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m164constructorimpl = UIntArray.m164constructorimpl(copyOf);
        m1103sortajY9A(m164constructorimpl);
        return UArraysKt___UArraysJvmKt.m479asListajY9A(m164constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sorted-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m1124sortedGBYM_sE(byte[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m86constructorimpl = UByteArray.m86constructorimpl(copyOf);
        m1110sortGBYM_sE(m86constructorimpl);
        return UArraysKt___UArraysJvmKt.m480asListGBYM_sE(m86constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sorted-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m1125sortedQwZRm1k(long[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        long[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m242constructorimpl = ULongArray.m242constructorimpl(copyOf);
        m1111sortQwZRm1k(m242constructorimpl);
        return UArraysKt___UArraysJvmKt.m481asListQwZRm1k(m242constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sorted-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m1126sortedrL5Bavg(short[] sorted) {
        Intrinsics.checkNotNullParameter(sorted, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sorted, sorted.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m346constructorimpl = UShortArray.m346constructorimpl(copyOf);
        m1114sortrL5Bavg(m346constructorimpl);
        return UArraysKt___UArraysJvmKt.m482asListrL5Bavg(m346constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArray--ajY-9A, reason: not valid java name */
    public static final int[] m1127sortedArrayajY9A(int[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UIntArray.m172isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        int[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m164constructorimpl = UIntArray.m164constructorimpl(copyOf);
        m1103sortajY9A(m164constructorimpl);
        return m164constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArray-GBYM_sE, reason: not valid java name */
    public static final byte[] m1128sortedArrayGBYM_sE(byte[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UByteArray.m94isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        byte[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m86constructorimpl = UByteArray.m86constructorimpl(copyOf);
        m1110sortGBYM_sE(m86constructorimpl);
        return m86constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArray-QwZRm1k, reason: not valid java name */
    public static final long[] m1129sortedArrayQwZRm1k(long[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (ULongArray.m250isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        long[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m242constructorimpl = ULongArray.m242constructorimpl(copyOf);
        m1111sortQwZRm1k(m242constructorimpl);
        return m242constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArray-rL5Bavg, reason: not valid java name */
    public static final short[] m1130sortedArrayrL5Bavg(short[] sortedArray) {
        Intrinsics.checkNotNullParameter(sortedArray, "$this$sortedArray");
        if (UShortArray.m354isEmptyimpl(sortedArray)) {
            return sortedArray;
        }
        short[] copyOf = Arrays.copyOf(sortedArray, sortedArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m346constructorimpl = UShortArray.m346constructorimpl(copyOf);
        m1114sortrL5Bavg(m346constructorimpl);
        return m346constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArrayDescending--ajY-9A, reason: not valid java name */
    public static final int[] m1131sortedArrayDescendingajY9A(int[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UIntArray.m172isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        int[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m164constructorimpl = UIntArray.m164constructorimpl(copyOf);
        m1115sortDescendingajY9A(m164constructorimpl);
        return m164constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArrayDescending-GBYM_sE, reason: not valid java name */
    public static final byte[] m1132sortedArrayDescendingGBYM_sE(byte[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UByteArray.m94isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        byte[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m86constructorimpl = UByteArray.m86constructorimpl(copyOf);
        m1119sortDescendingGBYM_sE(m86constructorimpl);
        return m86constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArrayDescending-QwZRm1k, reason: not valid java name */
    public static final long[] m1133sortedArrayDescendingQwZRm1k(long[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (ULongArray.m250isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        long[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m242constructorimpl = ULongArray.m242constructorimpl(copyOf);
        m1120sortDescendingQwZRm1k(m242constructorimpl);
        return m242constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedArrayDescending-rL5Bavg, reason: not valid java name */
    public static final short[] m1134sortedArrayDescendingrL5Bavg(short[] sortedArrayDescending) {
        Intrinsics.checkNotNullParameter(sortedArrayDescending, "$this$sortedArrayDescending");
        if (UShortArray.m354isEmptyimpl(sortedArrayDescending)) {
            return sortedArrayDescending;
        }
        short[] copyOf = Arrays.copyOf(sortedArrayDescending, sortedArrayDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m346constructorimpl = UShortArray.m346constructorimpl(copyOf);
        m1122sortDescendingrL5Bavg(m346constructorimpl);
        return m346constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedDescending--ajY-9A, reason: not valid java name */
    public static final List<UInt> m1135sortedDescendingajY9A(int[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] m164constructorimpl = UIntArray.m164constructorimpl(copyOf);
        m1103sortajY9A(m164constructorimpl);
        return m1031reversedajY9A(m164constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedDescending-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m1136sortedDescendingGBYM_sE(byte[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        byte[] m86constructorimpl = UByteArray.m86constructorimpl(copyOf);
        m1110sortGBYM_sE(m86constructorimpl);
        return m1032reversedGBYM_sE(m86constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedDescending-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m1137sortedDescendingQwZRm1k(long[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        long[] m242constructorimpl = ULongArray.m242constructorimpl(copyOf);
        m1111sortQwZRm1k(m242constructorimpl);
        return m1033reversedQwZRm1k(m242constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: sortedDescending-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m1138sortedDescendingrL5Bavg(short[] sortedDescending) {
        Intrinsics.checkNotNullParameter(sortedDescending, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sortedDescending, sortedDescending.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        short[] m346constructorimpl = UShortArray.m346constructorimpl(copyOf);
        m1114sortrL5Bavg(m346constructorimpl);
        return m1034reversedrL5Bavg(m346constructorimpl);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum--ajY-9A, reason: not valid java name */
    private static final int m1139sumajY9A(int[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return UInt.m110constructorimpl(ArraysKt.sum(sum));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum-GBYM_sE, reason: not valid java name */
    private static final int m1140sumGBYM_sE(byte[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sum);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            m110constructorimpl = UInt.m110constructorimpl(UInt.m110constructorimpl(UByteArray.m91getw2LRezQ(sum, i5) & 255) + m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum-QwZRm1k, reason: not valid java name */
    private static final long m1141sumQwZRm1k(long[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        return ULong.m188constructorimpl(ArraysKt.sum(sum));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: sum-rL5Bavg, reason: not valid java name */
    private static final int m1142sumrL5Bavg(short[] sum) {
        Intrinsics.checkNotNullParameter(sum, "$this$sum");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sum);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            m110constructorimpl = UInt.m110constructorimpl(UInt.m110constructorimpl(UShortArray.m351getMh2AYeg(sum, i5) & 65535) + m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-JOV_ifY, reason: not valid java name */
    private static final int m1143sumByJOV_ifY(byte[] sumBy, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumBy);
        int i5 = 0;
        for (int i6 = 0; i6 < m92getSizeimpl; i6++) {
            i5 = a.c((UInt) a.e(sumBy, i6, selector), i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-MShoTSo, reason: not valid java name */
    private static final int m1144sumByMShoTSo(long[] sumBy, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumBy);
        int i5 = 0;
        for (int i6 = 0; i6 < m248getSizeimpl; i6++) {
            i5 = a.c((UInt) androidx.appcompat.widget.a.f(sumBy, i6, selector), i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-jgv0xPQ, reason: not valid java name */
    private static final int m1145sumByjgv0xPQ(int[] sumBy, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumBy);
        int i5 = 0;
        for (int i6 = 0; i6 < m170getSizeimpl; i6++) {
            i5 = a.c((UInt) androidx.activity.result.a.c(sumBy, i6, selector), i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumBy-xTcfx_M, reason: not valid java name */
    private static final int m1146sumByxTcfx_M(short[] sumBy, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumBy, "$this$sumBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumBy);
        int i5 = 0;
        for (int i6 = 0; i6 < m352getSizeimpl; i6++) {
            i5 = a.c((UInt) androidx.appcompat.graphics.drawable.a.b(sumBy, i6, selector), i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-JOV_ifY, reason: not valid java name */
    private static final double m1147sumByDoubleJOV_ifY(byte[] sumByDouble, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            d5 += ((Number) a.e(sumByDouble, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-MShoTSo, reason: not valid java name */
    private static final double m1148sumByDoubleMShoTSo(long[] sumByDouble, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            d5 += ((Number) androidx.appcompat.widget.a.f(sumByDouble, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-jgv0xPQ, reason: not valid java name */
    private static final double m1149sumByDoublejgv0xPQ(int[] sumByDouble, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            d5 += ((Number) androidx.activity.result.a.c(sumByDouble, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    /* renamed from: sumByDouble-xTcfx_M, reason: not valid java name */
    private static final double m1150sumByDoublexTcfx_M(short[] sumByDouble, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumByDouble, "$this$sumByDouble");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumByDouble);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            d5 += ((Number) androidx.appcompat.graphics.drawable.a.b(sumByDouble, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(byte[] sumOf, Function1<? super UByte, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            d5 += ((Number) a.e(sumOf, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(int[] sumOf, Function1<? super UInt, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            d5 += ((Number) androidx.activity.result.a.c(sumOf, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(long[] sumOf, Function1<? super ULong, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            d5 += ((Number) androidx.appcompat.widget.a.f(sumOf, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfDouble")
    @OverloadResolutionByLambdaReturnType
    private static final double sumOfDouble(short[] sumOf, Function1<? super UShort, Double> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        double d5 = 0.0d;
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            d5 += ((Number) androidx.appcompat.graphics.drawable.a.b(sumOf, i5, selector)).doubleValue();
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(byte[] sumOf, Function1<? super UByte, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        int i5 = 0;
        for (int i6 = 0; i6 < m92getSizeimpl; i6++) {
            i5 += ((Number) a.e(sumOf, i6, selector)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(int[] sumOf, Function1<? super UInt, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        int i5 = 0;
        for (int i6 = 0; i6 < m170getSizeimpl; i6++) {
            i5 += ((Number) androidx.activity.result.a.c(sumOf, i6, selector)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(long[] sumOf, Function1<? super ULong, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        int i5 = 0;
        for (int i6 = 0; i6 < m248getSizeimpl; i6++) {
            i5 += ((Number) androidx.appcompat.widget.a.f(sumOf, i6, selector)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfInt")
    @OverloadResolutionByLambdaReturnType
    private static final int sumOfInt(short[] sumOf, Function1<? super UShort, Integer> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        int i5 = 0;
        for (int i6 = 0; i6 < m352getSizeimpl; i6++) {
            i5 += ((Number) androidx.appcompat.graphics.drawable.a.b(sumOf, i6, selector)).intValue();
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(byte[] sumOf, Function1<? super UByte, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        long j5 = 0;
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            j5 += ((Number) a.e(sumOf, i5, selector)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(int[] sumOf, Function1<? super UInt, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        long j5 = 0;
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            j5 += ((Number) androidx.activity.result.a.c(sumOf, i5, selector)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(long[] sumOf, Function1<? super ULong, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        long j5 = 0;
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            j5 += ((Number) androidx.appcompat.widget.a.f(sumOf, i5, selector)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfLong")
    @OverloadResolutionByLambdaReturnType
    private static final long sumOfLong(short[] sumOf, Function1<? super UShort, Long> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        long j5 = 0;
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            j5 += ((Number) androidx.appcompat.graphics.drawable.a.b(sumOf, i5, selector)).longValue();
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int i5 = 0;
        for (UByte uByte : uByteArr) {
            i5 = UInt.m110constructorimpl(UInt.m110constructorimpl(uByte.m83unboximpl() & 255) + i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(byte[] sumOf, Function1<? super UByte, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            m110constructorimpl = a.c((UInt) a.e(sumOf, i5, selector), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(int[] sumOf, Function1<? super UInt, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            m110constructorimpl = a.c((UInt) androidx.activity.result.a.c(sumOf, i5, selector), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(long[] sumOf, Function1<? super ULong, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            m110constructorimpl = a.c((UInt) androidx.appcompat.widget.a.f(sumOf, i5, selector), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int i5 = 0;
        for (UInt uInt : uIntArr) {
            i5 = a.c(uInt, i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfUInt")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final int sumOfUInt(short[] sumOf, Function1<? super UShort, UInt> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int m110constructorimpl = UInt.m110constructorimpl(0);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            m110constructorimpl = a.c((UInt) androidx.appcompat.graphics.drawable.a.b(sumOf, i5, selector), m110constructorimpl);
        }
        return m110constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(byte[] sumOf, Function1<? super UByte, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            m188constructorimpl = ULong.m188constructorimpl(((ULong) a.e(sumOf, i5, selector)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(int[] sumOf, Function1<? super UInt, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            m188constructorimpl = ULong.m188constructorimpl(((ULong) androidx.activity.result.a.c(sumOf, i5, selector)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(long[] sumOf, Function1<? super ULong, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            m188constructorimpl = ULong.m188constructorimpl(((ULong) androidx.appcompat.widget.a.f(sumOf, i5, selector)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        long j5 = 0;
        for (ULong uLong : uLongArr) {
            j5 = ULong.m188constructorimpl(uLong.m239unboximpl() + j5);
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfULong")
    @OverloadResolutionByLambdaReturnType
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    private static final long sumOfULong(short[] sumOf, Function1<? super UShort, ULong> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long m188constructorimpl = ULong.m188constructorimpl(0L);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            m188constructorimpl = ULong.m188constructorimpl(((ULong) androidx.appcompat.graphics.drawable.a.b(sumOf, i5, selector)).m239unboximpl() + m188constructorimpl);
        }
        return m188constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int i5 = 0;
        for (UShort uShort : uShortArr) {
            i5 = UInt.m110constructorimpl(UInt.m110constructorimpl(uShort.m343unboximpl() & 65535) + i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: take-PpDY95g, reason: not valid java name */
    public static final List<UByte> m1151takePpDY95g(byte[] take, int i5) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i5 >= UByteArray.m92getSizeimpl(take)) {
            return CollectionsKt.toList(UByteArray.m84boximpl(take));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(UByte.m28boximpl(UByteArray.m91getw2LRezQ(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i5);
        int m92getSizeimpl = UByteArray.m92getSizeimpl(take);
        int i6 = 0;
        for (int i7 = 0; i7 < m92getSizeimpl; i7++) {
            arrayList.add(UByte.m28boximpl(UByteArray.m91getw2LRezQ(take, i7)));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: take-nggk6HY, reason: not valid java name */
    public static final List<UShort> m1152takenggk6HY(short[] take, int i5) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i5 >= UShortArray.m352getSizeimpl(take)) {
            return CollectionsKt.toList(UShortArray.m344boximpl(take));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(UShort.m288boximpl(UShortArray.m351getMh2AYeg(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i5);
        int m352getSizeimpl = UShortArray.m352getSizeimpl(take);
        int i6 = 0;
        for (int i7 = 0; i7 < m352getSizeimpl; i7++) {
            arrayList.add(UShort.m288boximpl(UShortArray.m351getMh2AYeg(take, i7)));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: take-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m1153takeqFRl0hI(int[] take, int i5) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i5 >= UIntArray.m170getSizeimpl(take)) {
            return CollectionsKt.toList(UIntArray.m162boximpl(take));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(UInt.m104boximpl(UIntArray.m169getpVg5ArA(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i5);
        int m170getSizeimpl = UIntArray.m170getSizeimpl(take);
        int i6 = 0;
        for (int i7 = 0; i7 < m170getSizeimpl; i7++) {
            arrayList.add(UInt.m104boximpl(UIntArray.m169getpVg5ArA(take, i7)));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: take-r7IrZao, reason: not valid java name */
    public static final List<ULong> m1154taker7IrZao(long[] take, int i5) {
        Intrinsics.checkNotNullParameter(take, "$this$take");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        if (i5 >= ULongArray.m248getSizeimpl(take)) {
            return CollectionsKt.toList(ULongArray.m240boximpl(take));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(ULong.m182boximpl(ULongArray.m247getsVKNKU(take, 0)));
        }
        ArrayList arrayList = new ArrayList(i5);
        int m248getSizeimpl = ULongArray.m248getSizeimpl(take);
        int i6 = 0;
        for (int i7 = 0; i7 < m248getSizeimpl; i7++) {
            arrayList.add(ULong.m182boximpl(ULongArray.m247getsVKNKU(take, i7)));
            i6++;
            if (i6 == i5) {
                break;
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: takeLast-PpDY95g, reason: not valid java name */
    public static final List<UByte> m1155takeLastPpDY95g(byte[] takeLast, int i5) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        int m92getSizeimpl = UByteArray.m92getSizeimpl(takeLast);
        if (i5 >= m92getSizeimpl) {
            return CollectionsKt.toList(UByteArray.m84boximpl(takeLast));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(UByte.m28boximpl(UByteArray.m91getw2LRezQ(takeLast, m92getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = m92getSizeimpl - i5; i6 < m92getSizeimpl; i6++) {
            arrayList.add(UByte.m28boximpl(UByteArray.m91getw2LRezQ(takeLast, i6)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: takeLast-nggk6HY, reason: not valid java name */
    public static final List<UShort> m1156takeLastnggk6HY(short[] takeLast, int i5) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        int m352getSizeimpl = UShortArray.m352getSizeimpl(takeLast);
        if (i5 >= m352getSizeimpl) {
            return CollectionsKt.toList(UShortArray.m344boximpl(takeLast));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(UShort.m288boximpl(UShortArray.m351getMh2AYeg(takeLast, m352getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = m352getSizeimpl - i5; i6 < m352getSizeimpl; i6++) {
            arrayList.add(UShort.m288boximpl(UShortArray.m351getMh2AYeg(takeLast, i6)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: takeLast-qFRl0hI, reason: not valid java name */
    public static final List<UInt> m1157takeLastqFRl0hI(int[] takeLast, int i5) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        int m170getSizeimpl = UIntArray.m170getSizeimpl(takeLast);
        if (i5 >= m170getSizeimpl) {
            return CollectionsKt.toList(UIntArray.m162boximpl(takeLast));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(UInt.m104boximpl(UIntArray.m169getpVg5ArA(takeLast, m170getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = m170getSizeimpl - i5; i6 < m170getSizeimpl; i6++) {
            arrayList.add(UInt.m104boximpl(UIntArray.m169getpVg5ArA(takeLast, i6)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: takeLast-r7IrZao, reason: not valid java name */
    public static final List<ULong> m1158takeLastr7IrZao(long[] takeLast, int i5) {
        Intrinsics.checkNotNullParameter(takeLast, "$this$takeLast");
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(d.c("Requested element count ", i5, " is less than zero.").toString());
        }
        if (i5 == 0) {
            return CollectionsKt.emptyList();
        }
        int m248getSizeimpl = ULongArray.m248getSizeimpl(takeLast);
        if (i5 >= m248getSizeimpl) {
            return CollectionsKt.toList(ULongArray.m240boximpl(takeLast));
        }
        if (i5 == 1) {
            return CollectionsKt.listOf(ULong.m182boximpl(ULongArray.m247getsVKNKU(takeLast, m248getSizeimpl - 1)));
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = m248getSizeimpl - i5; i6 < m248getSizeimpl; i6++) {
            arrayList.add(ULong.m182boximpl(ULongArray.m247getsVKNKU(takeLast, i6)));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m1159takeLastWhileJOV_ifY(byte[] takeLastWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) a.e(takeLastWhile, lastIndex, predicate)).booleanValue()) {
                return m627dropPpDY95g(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(UByteArray.m84boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m1160takeLastWhileMShoTSo(long[] takeLastWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.appcompat.widget.a.f(takeLastWhile, lastIndex, predicate)).booleanValue()) {
                return m630dropr7IrZao(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(ULongArray.m240boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m1161takeLastWhilejgv0xPQ(int[] takeLastWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.activity.result.a.c(takeLastWhile, lastIndex, predicate)).booleanValue()) {
                return m629dropqFRl0hI(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(UIntArray.m162boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeLastWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m1162takeLastWhilexTcfx_M(short[] takeLastWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeLastWhile, "$this$takeLastWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = ArraysKt.getLastIndex(takeLastWhile); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) androidx.appcompat.graphics.drawable.a.b(takeLastWhile, lastIndex, predicate)).booleanValue()) {
                return m628dropnggk6HY(takeLastWhile, lastIndex + 1);
            }
        }
        return CollectionsKt.toList(UShortArray.m344boximpl(takeLastWhile));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-JOV_ifY, reason: not valid java name */
    private static final List<UByte> m1163takeWhileJOV_ifY(byte[] takeWhile, Function1<? super UByte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m92getSizeimpl = UByteArray.m92getSizeimpl(takeWhile);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(takeWhile, i5);
            if (!predicate.invoke(UByte.m28boximpl(m91getw2LRezQ)).booleanValue()) {
                break;
            }
            arrayList.add(UByte.m28boximpl(m91getw2LRezQ));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-MShoTSo, reason: not valid java name */
    private static final List<ULong> m1164takeWhileMShoTSo(long[] takeWhile, Function1<? super ULong, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m248getSizeimpl = ULongArray.m248getSizeimpl(takeWhile);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(takeWhile, i5);
            if (!predicate.invoke(ULong.m182boximpl(m247getsVKNKU)).booleanValue()) {
                break;
            }
            arrayList.add(ULong.m182boximpl(m247getsVKNKU));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-jgv0xPQ, reason: not valid java name */
    private static final List<UInt> m1165takeWhilejgv0xPQ(int[] takeWhile, Function1<? super UInt, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m170getSizeimpl = UIntArray.m170getSizeimpl(takeWhile);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(takeWhile, i5);
            if (!predicate.invoke(UInt.m104boximpl(m169getpVg5ArA)).booleanValue()) {
                break;
            }
            arrayList.add(UInt.m104boximpl(m169getpVg5ArA));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: takeWhile-xTcfx_M, reason: not valid java name */
    private static final List<UShort> m1166takeWhilexTcfx_M(short[] takeWhile, Function1<? super UShort, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(takeWhile, "$this$takeWhile");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int m352getSizeimpl = UShortArray.m352getSizeimpl(takeWhile);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(takeWhile, i5);
            if (!predicate.invoke(UShort.m288boximpl(m351getMh2AYeg)).booleanValue()) {
                break;
            }
            arrayList.add(UShort.m288boximpl(m351getMh2AYeg));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toByteArray-GBYM_sE, reason: not valid java name */
    private static final byte[] m1167toByteArrayGBYM_sE(byte[] toByteArray) {
        Intrinsics.checkNotNullParameter(toByteArray, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(toByteArray, toByteArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toIntArray--ajY-9A, reason: not valid java name */
    private static final int[] m1168toIntArrayajY9A(int[] toIntArray) {
        Intrinsics.checkNotNullParameter(toIntArray, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(toIntArray, toIntArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toLongArray-QwZRm1k, reason: not valid java name */
    private static final long[] m1169toLongArrayQwZRm1k(long[] toLongArray) {
        Intrinsics.checkNotNullParameter(toLongArray, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(toLongArray, toLongArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toShortArray-rL5Bavg, reason: not valid java name */
    private static final short[] m1170toShortArrayrL5Bavg(short[] toShortArray) {
        Intrinsics.checkNotNullParameter(toShortArray, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(toShortArray, toShortArray.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: toTypedArray--ajY-9A, reason: not valid java name */
    public static final UInt[] m1171toTypedArrayajY9A(int[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(toTypedArray);
        UInt[] uIntArr = new UInt[m170getSizeimpl];
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            uIntArr[i5] = UInt.m104boximpl(UIntArray.m169getpVg5ArA(toTypedArray, i5));
        }
        return uIntArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: toTypedArray-GBYM_sE, reason: not valid java name */
    public static final UByte[] m1172toTypedArrayGBYM_sE(byte[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(toTypedArray);
        UByte[] uByteArr = new UByte[m92getSizeimpl];
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            uByteArr[i5] = UByte.m28boximpl(UByteArray.m91getw2LRezQ(toTypedArray, i5));
        }
        return uByteArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: toTypedArray-QwZRm1k, reason: not valid java name */
    public static final ULong[] m1173toTypedArrayQwZRm1k(long[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(toTypedArray);
        ULong[] uLongArr = new ULong[m248getSizeimpl];
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            uLongArr[i5] = ULong.m182boximpl(ULongArray.m247getsVKNKU(toTypedArray, i5));
        }
        return uLongArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: toTypedArray-rL5Bavg, reason: not valid java name */
    public static final UShort[] m1174toTypedArrayrL5Bavg(short[] toTypedArray) {
        Intrinsics.checkNotNullParameter(toTypedArray, "$this$toTypedArray");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(toTypedArray);
        UShort[] uShortArr = new UShort[m352getSizeimpl];
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            uShortArr[i5] = UShort.m288boximpl(UShortArray.m351getMh2AYeg(toTypedArray, i5));
        }
        return uShortArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] toUByteArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return UByteArray.m86constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte[] toUByteArray(UByte[] uByteArr) {
        Intrinsics.checkNotNullParameter(uByteArr, "<this>");
        int length = uByteArr.length;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            bArr[i5] = uByteArr[i5].m83unboximpl();
        }
        return UByteArray.m86constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] toUIntArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return UIntArray.m164constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int[] toUIntArray(UInt[] uIntArr) {
        Intrinsics.checkNotNullParameter(uIntArr, "<this>");
        int length = uIntArr.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = uIntArr[i5].m161unboximpl();
        }
        return UIntArray.m164constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] toULongArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return ULongArray.m242constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long[] toULongArray(ULong[] uLongArr) {
        Intrinsics.checkNotNullParameter(uLongArr, "<this>");
        int length = uLongArr.length;
        long[] jArr = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            jArr[i5] = uLongArr[i5].m239unboximpl();
        }
        return ULongArray.m242constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short[] toUShortArray(UShort[] uShortArr) {
        Intrinsics.checkNotNullParameter(uShortArr, "<this>");
        int length = uShortArr.length;
        short[] sArr = new short[length];
        for (int i5 = 0; i5 < length; i5++) {
            sArr[i5] = uShortArr[i5].m343unboximpl();
        }
        return UShortArray.m346constructorimpl(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final short[] toUShortArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return UShortArray.m346constructorimpl(copyOf);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: withIndex--ajY-9A, reason: not valid java name */
    public static final Iterable<IndexedValue<UInt>> m1175withIndexajY9A(final int[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends UInt>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends UInt> invoke() {
                return UIntArray.m173iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: withIndex-GBYM_sE, reason: not valid java name */
    public static final Iterable<IndexedValue<UByte>> m1176withIndexGBYM_sE(final byte[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends UByte>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends UByte> invoke() {
                return UByteArray.m95iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: withIndex-QwZRm1k, reason: not valid java name */
    public static final Iterable<IndexedValue<ULong>> m1177withIndexQwZRm1k(final long[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends ULong>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends ULong> invoke() {
                return ULongArray.m251iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: withIndex-rL5Bavg, reason: not valid java name */
    public static final Iterable<IndexedValue<UShort>> m1178withIndexrL5Bavg(final short[] withIndex) {
        Intrinsics.checkNotNullParameter(withIndex, "$this$withIndex");
        return new IndexingIterable(new Function0<Iterator<? extends UShort>>() { // from class: kotlin.collections.unsigned.UArraysKt___UArraysKt$withIndex$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Iterator<? extends UShort> invoke() {
                return UShortArray.m355iteratorimpl(withIndex);
            }
        });
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-7znnbtw, reason: not valid java name */
    private static final <R, V> List<V> m1179zip7znnbtw(int[] zip, Iterable<? extends R> other, Function2<? super UInt, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m170getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m170getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-8LME4QE, reason: not valid java name */
    private static final <R, V> List<V> m1180zip8LME4QE(long[] zip, R[] other, Function2<? super ULong, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(ULongArray.m248getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(zip, i5)), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-C-E_24M, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m1181zipCE_24M(int[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UIntArray.m170getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            int m169getpVg5ArA = UIntArray.m169getpVg5ArA(zip, i5);
            arrayList.add(TuplesKt.to(UInt.m104boximpl(m169getpVg5ArA), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-F7u83W8, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m1182zipF7u83W8(long[] zip, Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m248getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m248getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(ULong.m182boximpl(ULongArray.m247getsVKNKU(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-HwE9HBo, reason: not valid java name */
    public static final <R> List<Pair<UInt, R>> m1183zipHwE9HBo(int[] zip, Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m170getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m170getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UInt.m104boximpl(UIntArray.m169getpVg5ArA(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-JAKpvQM, reason: not valid java name */
    private static final <V> List<V> m1184zipJAKpvQM(byte[] zip, byte[] other, Function2<? super UByte, ? super UByte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UByteArray.m92getSizeimpl(zip), UByteArray.m92getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(zip, i5)), UByte.m28boximpl(UByteArray.m91getw2LRezQ(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-JGPC0-M, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m1185zipJGPC0M(short[] zip, Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m352getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m352getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UShort.m288boximpl(UShortArray.m351getMh2AYeg(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-JQknh5Q, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m1186zipJQknh5Q(byte[] zip, Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m92getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m92getSizeimpl) {
                break;
            }
            arrayList.add(TuplesKt.to(UByte.m28boximpl(UByteArray.m91getw2LRezQ(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-L83TJbI, reason: not valid java name */
    private static final <V> List<V> m1187zipL83TJbI(int[] zip, int[] other, Function2<? super UInt, ? super UInt, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UIntArray.m170getSizeimpl(zip), UIntArray.m170getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(zip, i5)), UInt.m104boximpl(UIntArray.m169getpVg5ArA(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-LuipOMY, reason: not valid java name */
    private static final <R, V> List<V> m1188zipLuipOMY(byte[] zip, R[] other, Function2<? super UByte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UByteArray.m92getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(zip, i5)), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-PabeH-Q, reason: not valid java name */
    private static final <V> List<V> m1189zipPabeHQ(long[] zip, long[] other, Function2<? super ULong, ? super ULong, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(ULongArray.m248getSizeimpl(zip), ULongArray.m248getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(zip, i5)), ULong.m182boximpl(ULongArray.m247getsVKNKU(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-TUPTUsU, reason: not valid java name */
    private static final <R, V> List<V> m1190zipTUPTUsU(long[] zip, Iterable<? extends R> other, Function2<? super ULong, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m248getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m248getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-UCnP4_w, reason: not valid java name */
    private static final <R, V> List<V> m1191zipUCnP4_w(byte[] zip, Iterable<? extends R> other, Function2<? super UByte, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m92getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m92getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-ZjwqOic, reason: not valid java name */
    private static final <R, V> List<V> m1192zipZjwqOic(int[] zip, R[] other, Function2<? super UInt, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UIntArray.m170getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(zip, i5)), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-ctEhBpI, reason: not valid java name */
    public static final List<Pair<UInt, UInt>> m1193zipctEhBpI(int[] zip, int[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UIntArray.m170getSizeimpl(zip), UIntArray.m170getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(UInt.m104boximpl(UIntArray.m169getpVg5ArA(zip, i5)), UInt.m104boximpl(UIntArray.m169getpVg5ArA(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-ePBmRWY, reason: not valid java name */
    private static final <R, V> List<V> m1194zipePBmRWY(short[] zip, R[] other, Function2<? super UShort, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UShortArray.m352getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(zip, i5)), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-f7H3mmw, reason: not valid java name */
    public static final <R> List<Pair<ULong, R>> m1195zipf7H3mmw(long[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(ULongArray.m248getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            long m247getsVKNKU = ULongArray.m247getsVKNKU(zip, i5);
            arrayList.add(TuplesKt.to(ULong.m182boximpl(m247getsVKNKU), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-gVVukQo, reason: not valid java name */
    private static final <V> List<V> m1196zipgVVukQo(short[] zip, short[] other, Function2<? super UShort, ? super UShort, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int min = Math.min(UShortArray.m352getSizeimpl(zip), UShortArray.m352getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(transform.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(zip, i5)), UShort.m288boximpl(UShortArray.m351getMh2AYeg(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: zip-kBb4a-s, reason: not valid java name */
    private static final <R, V> List<V> m1197zipkBb4as(short[] zip, Iterable<? extends R> other, Function2<? super UShort, ? super R, ? extends V> transform) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(zip);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, m352getSizeimpl));
        int i5 = 0;
        for (R r4 : other) {
            if (i5 >= m352getSizeimpl) {
                break;
            }
            arrayList.add(transform.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(zip, i5)), r4));
            i5++;
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-kdPth3s, reason: not valid java name */
    public static final List<Pair<UByte, UByte>> m1198zipkdPth3s(byte[] zip, byte[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UByteArray.m92getSizeimpl(zip), UByteArray.m92getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(UByte.m28boximpl(UByteArray.m91getw2LRezQ(zip, i5)), UByte.m28boximpl(UByteArray.m91getw2LRezQ(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-mazbYpA, reason: not valid java name */
    public static final List<Pair<UShort, UShort>> m1199zipmazbYpA(short[] zip, short[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UShortArray.m352getSizeimpl(zip), UShortArray.m352getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(UShort.m288boximpl(UShortArray.m351getMh2AYeg(zip, i5)), UShort.m288boximpl(UShortArray.m351getMh2AYeg(other, i5))));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-nl983wc, reason: not valid java name */
    public static final <R> List<Pair<UByte, R>> m1200zipnl983wc(byte[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UByteArray.m92getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(zip, i5);
            arrayList.add(TuplesKt.to(UByte.m28boximpl(m91getw2LRezQ), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-uaTIQ5s, reason: not valid java name */
    public static final <R> List<Pair<UShort, R>> m1201zipuaTIQ5s(short[] zip, R[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(UShortArray.m352getSizeimpl(zip), other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            short m351getMh2AYeg = UShortArray.m351getMh2AYeg(zip, i5);
            arrayList.add(TuplesKt.to(UShort.m288boximpl(m351getMh2AYeg), other[i5]));
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: zip-us8wMrg, reason: not valid java name */
    public static final List<Pair<ULong, ULong>> m1202zipus8wMrg(long[] zip, long[] other) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(ULongArray.m248getSizeimpl(zip), ULongArray.m248getSizeimpl(other));
        ArrayList arrayList = new ArrayList(min);
        for (int i5 = 0; i5 < min; i5++) {
            arrayList.add(TuplesKt.to(ULong.m182boximpl(ULongArray.m247getsVKNKU(zip, i5)), ULong.m182boximpl(ULongArray.m247getsVKNKU(other, i5))));
        }
        return arrayList;
    }
}
