package kotlin.collections;

import androidx.appcompat.view.a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UByte> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = UInt.m110constructorimpl(UInt.m110constructorimpl(it.next().m83unboximpl() & 255) + i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UInt> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = a.c(it.next(), i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<ULong> it = iterable.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            j5 = ULong.m188constructorimpl(it.next().m239unboximpl() + j5);
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UShort> it = iterable.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = UInt.m110constructorimpl(UInt.m110constructorimpl(it.next().m343unboximpl() & 65535) + i5);
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte[] toUByteArray(Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] m85constructorimpl = UByteArray.m85constructorimpl(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            UByteArray.m96setVurrAj0(m85constructorimpl, i5, it.next().m83unboximpl());
            i5++;
        }
        return m85constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final int[] toUIntArray(Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] m163constructorimpl = UIntArray.m163constructorimpl(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            UIntArray.m174setVXSXFK8(m163constructorimpl, i5, it.next().m161unboximpl());
            i5++;
        }
        return m163constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final long[] toULongArray(Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] m241constructorimpl = ULongArray.m241constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            ULongArray.m252setk8EXiF4(m241constructorimpl, i5, it.next().m239unboximpl());
            i5++;
        }
        return m241constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final short[] toUShortArray(Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] m345constructorimpl = UShortArray.m345constructorimpl(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            UShortArray.m356set01HTLdE(m345constructorimpl, i5, it.next().m343unboximpl());
            i5++;
        }
        return m345constructorimpl;
    }
}
