package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes22.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m1203maxOf5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & 65535, 65535 & s5) >= 0 ? s4 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m1204maxOfJ1ME1BU(int i5, int i6) {
        return UnsignedKt.uintCompare(i5, i6) >= 0 ? i5 : i6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m1205maxOfKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) >= 0 ? b5 : b6;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m1206maxOfMd2H83M(int i5, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(other);
        for (int i6 = 0; i6 < m170getSizeimpl; i6++) {
            i5 = m1204maxOfJ1ME1BU(i5, UIntArray.m169getpVg5ArA(other, i6));
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m1207maxOfR03FKyM(long j5, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(other);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            j5 = m1212maxOfeb3DHEI(j5, ULongArray.m247getsVKNKU(other, i5));
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m1208maxOfVKSA0NQ(short s4, short s5, short s6) {
        return m1203maxOf5PvTz6A(s4, m1203maxOf5PvTz6A(s5, s6));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m1209maxOfWZ9TVnA(int i5, int i6, int i7) {
        return m1204maxOfJ1ME1BU(i5, m1204maxOfJ1ME1BU(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1210maxOfWr6uiD8(byte b5, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(other);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            b5 = m1205maxOfKr8caGY(b5, UByteArray.m91getw2LRezQ(other, i5));
        }
        return b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m1211maxOfb33U2AM(byte b5, byte b6, byte b7) {
        return m1205maxOfKr8caGY(b5, m1205maxOfKr8caGY(b6, b7));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m1212maxOfeb3DHEI(long j5, long j6) {
        return UnsignedKt.ulongCompare(j5, j6) >= 0 ? j5 : j6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m1213maxOfsambcqE(long j5, long j6, long j7) {
        return m1212maxOfeb3DHEI(j5, m1212maxOfeb3DHEI(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m1214maxOft1qELG4(short s4, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(other);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            s4 = m1203maxOf5PvTz6A(s4, UShortArray.m351getMh2AYeg(other, i5));
        }
        return s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m1215minOf5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & 65535, 65535 & s5) <= 0 ? s4 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m1216minOfJ1ME1BU(int i5, int i6) {
        return UnsignedKt.uintCompare(i5, i6) <= 0 ? i5 : i6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m1217minOfKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) <= 0 ? b5 : b6;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m1218minOfMd2H83M(int i5, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(other);
        for (int i6 = 0; i6 < m170getSizeimpl; i6++) {
            i5 = m1216minOfJ1ME1BU(i5, UIntArray.m169getpVg5ArA(other, i6));
        }
        return i5;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m1219minOfR03FKyM(long j5, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(other);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            j5 = m1224minOfeb3DHEI(j5, ULongArray.m247getsVKNKU(other, i5));
        }
        return j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m1220minOfVKSA0NQ(short s4, short s5, short s6) {
        return m1215minOf5PvTz6A(s4, m1215minOf5PvTz6A(s5, s6));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m1221minOfWZ9TVnA(int i5, int i6, int i7) {
        return m1216minOfJ1ME1BU(i5, m1216minOfJ1ME1BU(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1222minOfWr6uiD8(byte b5, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(other);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            b5 = m1217minOfKr8caGY(b5, UByteArray.m91getw2LRezQ(other, i5));
        }
        return b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m1223minOfb33U2AM(byte b5, byte b6, byte b7) {
        return m1217minOfKr8caGY(b5, m1217minOfKr8caGY(b6, b7));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m1224minOfeb3DHEI(long j5, long j6) {
        return UnsignedKt.ulongCompare(j5, j6) <= 0 ? j5 : j6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m1225minOfsambcqE(long j5, long j6, long j7) {
        return m1224minOfeb3DHEI(j5, m1224minOfeb3DHEI(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m1226minOft1qELG4(short s4, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(other);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            s4 = m1215minOf5PvTz6A(s4, UShortArray.m351getMh2AYeg(other, i5));
        }
        return s4;
    }
}
