package kotlin.collections.unsigned;

import androidx.activity.d;
import androidx.appcompat.view.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
class UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<UInt> m479asListajY9A(int[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m480asListGBYM_sE(byte[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m481asListQwZRm1k(long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m482asListrL5Bavg(short[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m483binarySearch2fe2U9s(int[] binarySearch, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i6, i7, UIntArray.m170getSizeimpl(binarySearch));
        int i8 = i7 - 1;
        while (i6 <= i8) {
            int i9 = (i6 + i8) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(binarySearch[i9], i5);
            if (uintCompare < 0) {
                i6 = i9 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i6 + 1);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m484binarySearch2fe2U9s$default(int[] iArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = UIntArray.m170getSizeimpl(iArr);
        }
        return m483binarySearch2fe2U9s(iArr, i5, i6, i7);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m485binarySearchEtDCXyQ(short[] binarySearch, short s4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, UShortArray.m352getSizeimpl(binarySearch));
        int i7 = s4 & 65535;
        int i8 = i6 - 1;
        while (i5 <= i8) {
            int i9 = (i5 + i8) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(binarySearch[i9], i7);
            if (uintCompare < 0) {
                i5 = i9 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m486binarySearchEtDCXyQ$default(short[] sArr, short s4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = UShortArray.m352getSizeimpl(sArr);
        }
        return m485binarySearchEtDCXyQ(sArr, s4, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m487binarySearchK6DWlUc(long[] binarySearch, long j5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, ULongArray.m248getSizeimpl(binarySearch));
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int ulongCompare = UnsignedKt.ulongCompare(binarySearch[i8], j5);
            if (ulongCompare < 0) {
                i5 = i8 + 1;
            } else {
                if (ulongCompare <= 0) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m488binarySearchK6DWlUc$default(long[] jArr, long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = ULongArray.m248getSizeimpl(jArr);
        }
        return m487binarySearchK6DWlUc(jArr, j5, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m489binarySearchWpHrYlw(byte[] binarySearch, byte b5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i5, i6, UByteArray.m92getSizeimpl(binarySearch));
        int i7 = b5 & 255;
        int i8 = i6 - 1;
        while (i5 <= i8) {
            int i9 = (i5 + i8) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(binarySearch[i9], i7);
            if (uintCompare < 0) {
                i5 = i9 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m490binarySearchWpHrYlw$default(byte[] bArr, byte b5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = UByteArray.m92getSizeimpl(bArr);
        }
        return m489binarySearchWpHrYlw(bArr, b5, i5, i6);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m491elementAtPpDY95g(byte[] elementAt, int i5) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UByteArray.m91getw2LRezQ(elementAt, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m492elementAtnggk6HY(short[] elementAt, int i5) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UShortArray.m351getMh2AYeg(elementAt, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m493elementAtqFRl0hI(int[] elementAt, int i5) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UIntArray.m169getpVg5ArA(elementAt, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m494elementAtr7IrZao(long[] elementAt, int i5) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return ULongArray.m247getsVKNKU(elementAt, i5);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m495maxajY9A(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m875maxOrNullajY9A(max);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m496maxGBYM_sE(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m876maxOrNullGBYM_sE(max);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m497maxQwZRm1k(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m877maxOrNullQwZRm1k(max);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m498maxrL5Bavg(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m878maxOrNullrL5Bavg(max);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m499maxByJOV_ifY(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(maxBy)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
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
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m500maxByMShoTSo(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(maxBy)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
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
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m501maxByjgv0xPQ(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(maxBy)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
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
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m502maxByxTcfx_M(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(maxBy)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
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
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m503maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m883maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m504maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m884maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m505maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m885maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m506maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m886maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m507minajY9A(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m931minOrNullajY9A(min);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m508minGBYM_sE(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m932minOrNullGBYM_sE(min);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m509minQwZRm1k(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m933minOrNullQwZRm1k(min);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m510minrL5Bavg(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m934minOrNullrL5Bavg(min);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m511minByJOV_ifY(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m94isEmptyimpl(minBy)) {
            return null;
        }
        byte m91getw2LRezQ = UByteArray.m91getw2LRezQ(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
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
        }
        return UByte.m28boximpl(m91getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m512minByMShoTSo(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m250isEmptyimpl(minBy)) {
            return null;
        }
        long m247getsVKNKU = ULongArray.m247getsVKNKU(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
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
        }
        return ULong.m182boximpl(m247getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m513minByjgv0xPQ(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m172isEmptyimpl(minBy)) {
            return null;
        }
        int m169getpVg5ArA = UIntArray.m169getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
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
        }
        return UInt.m104boximpl(m169getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m514minByxTcfx_M(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m354isEmptyimpl(minBy)) {
            return null;
        }
        short m351getMh2AYeg = UShortArray.m351getMh2AYeg(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
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
        }
        return UShort.m288boximpl(m351getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m515minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m939minWithOrNullXMRcp5o(minWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m516minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m940minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m517minWitheOHTfZs(short[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m941minWithOrNulleOHTfZs(minWith, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m518minWithzrEWJaI(long[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m942minWithOrNullzrEWJaI(minWith, comparator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(byte[] sumOf, Function1<? super UByte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            valueOf = valueOf.add((BigDecimal) a.e(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(int[] sumOf, Function1<? super UInt, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            valueOf = valueOf.add((BigDecimal) androidx.activity.result.a.c(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(long[] sumOf, Function1<? super ULong, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            valueOf = valueOf.add((BigDecimal) androidx.appcompat.widget.a.f(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(short[] sumOf, Function1<? super UShort, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            valueOf = valueOf.add((BigDecimal) androidx.appcompat.graphics.drawable.a.b(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(byte[] sumOf, Function1<? super UByte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m92getSizeimpl = UByteArray.m92getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m92getSizeimpl; i5++) {
            valueOf = valueOf.add((BigInteger) a.e(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(int[] sumOf, Function1<? super UInt, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m170getSizeimpl = UIntArray.m170getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m170getSizeimpl; i5++) {
            valueOf = valueOf.add((BigInteger) androidx.activity.result.a.c(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(long[] sumOf, Function1<? super ULong, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m248getSizeimpl = ULongArray.m248getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m248getSizeimpl; i5++) {
            valueOf = valueOf.add((BigInteger) androidx.appcompat.widget.a.f(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(short[] sumOf, Function1<? super UShort, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m352getSizeimpl = UShortArray.m352getSizeimpl(sumOf);
        for (int i5 = 0; i5 < m352getSizeimpl; i5++) {
            valueOf = valueOf.add((BigInteger) androidx.appcompat.graphics.drawable.a.b(sumOf, i5, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }
}
