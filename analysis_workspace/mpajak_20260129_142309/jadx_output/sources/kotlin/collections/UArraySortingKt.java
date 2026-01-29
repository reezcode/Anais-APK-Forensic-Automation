package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m467partitionnroSd4(long[] jArr, int i5, int i6) {
        long m247getsVKNKU = ULongArray.m247getsVKNKU(jArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (UnsignedKt.ulongCompare(ULongArray.m247getsVKNKU(jArr, i5), m247getsVKNKU) < 0) {
                i5++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m247getsVKNKU(jArr, i6), m247getsVKNKU) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                long m247getsVKNKU2 = ULongArray.m247getsVKNKU(jArr, i5);
                ULongArray.m252setk8EXiF4(jArr, i5, ULongArray.m247getsVKNKU(jArr, i6));
                ULongArray.m252setk8EXiF4(jArr, i6, m247getsVKNKU2);
                i5++;
                i6--;
            }
        }
        return i5;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m468partition4UcCI2c(byte[] bArr, int i5, int i6) {
        int i7;
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(bArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (true) {
                i7 = m91getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m91getw2LRezQ(bArr, i5) & 255, i7) >= 0) {
                    break;
                }
                i5++;
            }
            while (Intrinsics.compare(UByteArray.m91getw2LRezQ(bArr, i6) & 255, i7) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                byte m91getw2LRezQ2 = UByteArray.m91getw2LRezQ(bArr, i5);
                UByteArray.m96setVurrAj0(bArr, i5, UByteArray.m91getw2LRezQ(bArr, i6));
                UByteArray.m96setVurrAj0(bArr, i6, m91getw2LRezQ2);
                i5++;
                i6--;
            }
        }
        return i5;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m469partitionAa5vz7o(short[] sArr, int i5, int i6) {
        int i7;
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(sArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (true) {
                i7 = m351getMh2AYeg & 65535;
                if (Intrinsics.compare(UShortArray.m351getMh2AYeg(sArr, i5) & 65535, i7) >= 0) {
                    break;
                }
                i5++;
            }
            while (Intrinsics.compare(UShortArray.m351getMh2AYeg(sArr, i6) & 65535, i7) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                short m351getMh2AYeg2 = UShortArray.m351getMh2AYeg(sArr, i5);
                UShortArray.m356set01HTLdE(sArr, i5, UShortArray.m351getMh2AYeg(sArr, i6));
                UShortArray.m356set01HTLdE(sArr, i6, m351getMh2AYeg2);
                i5++;
                i6--;
            }
        }
        return i5;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m470partitionoBK06Vg(int[] iArr, int i5, int i6) {
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(iArr, (i5 + i6) / 2);
        while (i5 <= i6) {
            while (UnsignedKt.uintCompare(UIntArray.m169getpVg5ArA(iArr, i5), m169getpVg5ArA) < 0) {
                i5++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m169getpVg5ArA(iArr, i6), m169getpVg5ArA) > 0) {
                i6--;
            }
            if (i5 <= i6) {
                int m169getpVg5ArA2 = UIntArray.m169getpVg5ArA(iArr, i5);
                UIntArray.m174setVXSXFK8(iArr, i5, UIntArray.m169getpVg5ArA(iArr, i6));
                UIntArray.m174setVXSXFK8(iArr, i6, m169getpVg5ArA2);
                i5++;
                i6--;
            }
        }
        return i5;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m471quickSortnroSd4(long[] jArr, int i5, int i6) {
        int m467partitionnroSd4 = m467partitionnroSd4(jArr, i5, i6);
        int i7 = m467partitionnroSd4 - 1;
        if (i5 < i7) {
            m471quickSortnroSd4(jArr, i5, i7);
        }
        if (m467partitionnroSd4 < i6) {
            m471quickSortnroSd4(jArr, m467partitionnroSd4, i6);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m472quickSort4UcCI2c(byte[] bArr, int i5, int i6) {
        int m468partition4UcCI2c = m468partition4UcCI2c(bArr, i5, i6);
        int i7 = m468partition4UcCI2c - 1;
        if (i5 < i7) {
            m472quickSort4UcCI2c(bArr, i5, i7);
        }
        if (m468partition4UcCI2c < i6) {
            m472quickSort4UcCI2c(bArr, m468partition4UcCI2c, i6);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m473quickSortAa5vz7o(short[] sArr, int i5, int i6) {
        int m469partitionAa5vz7o = m469partitionAa5vz7o(sArr, i5, i6);
        int i7 = m469partitionAa5vz7o - 1;
        if (i5 < i7) {
            m473quickSortAa5vz7o(sArr, i5, i7);
        }
        if (m469partitionAa5vz7o < i6) {
            m473quickSortAa5vz7o(sArr, m469partitionAa5vz7o, i6);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m474quickSortoBK06Vg(int[] iArr, int i5, int i6) {
        int m470partitionoBK06Vg = m470partitionoBK06Vg(iArr, i5, i6);
        int i7 = m470partitionoBK06Vg - 1;
        if (i5 < i7) {
            m474quickSortoBK06Vg(iArr, i5, i7);
        }
        if (m470partitionoBK06Vg < i6) {
            m474quickSortoBK06Vg(iArr, m470partitionoBK06Vg, i6);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m475sortArraynroSd4(long[] array, int i5, int i6) {
        Intrinsics.checkNotNullParameter(array, "array");
        m471quickSortnroSd4(array, i5, i6 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m476sortArray4UcCI2c(byte[] array, int i5, int i6) {
        Intrinsics.checkNotNullParameter(array, "array");
        m472quickSort4UcCI2c(array, i5, i6 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m477sortArrayAa5vz7o(short[] array, int i5, int i6) {
        Intrinsics.checkNotNullParameter(array, "array");
        m473quickSortAa5vz7o(array, i5, i6 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m478sortArrayoBK06Vg(int[] array, int i5, int i6) {
        Intrinsics.checkNotNullParameter(array, "array");
        m474quickSortoBK06Vg(array, i5, i6 - 1);
    }
}
