package kotlin.collections;

import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes18.dex */
public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
    public static final List<Byte> asList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$1(bArr);
    }

    public static final List<Character> asList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$8(cArr);
    }

    public static List<Double> asList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$6(dArr);
    }

    public static final List<Float> asList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$5(fArr);
    }

    public static List<Integer> asList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$3(iArr);
    }

    public static List<Long> asList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$4(jArr);
    }

    public static <T> List<T> asList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        List<T> asList = ArraysUtilJVM.asList(tArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(this)");
        return asList;
    }

    public static final List<Short> asList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$2(sArr);
    }

    public static final List<Boolean> asList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new ArraysKt___ArraysJvmKt$asList$7(zArr);
    }

    public static final int binarySearch(byte[] bArr, byte b5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i5, i6, b5);
    }

    public static final int binarySearch(char[] cArr, char c5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i5, i6, c5);
    }

    public static final int binarySearch(double[] dArr, double d5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i5, i6, d5);
    }

    public static final int binarySearch(float[] fArr, float f5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i5, i6, f5);
    }

    public static final int binarySearch(int[] iArr, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i6, i7, i5);
    }

    public static final int binarySearch(long[] jArr, long j5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i5, i6, j5);
    }

    public static final <T> int binarySearch(T[] tArr, T t4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i5, i6, t4);
    }

    public static final <T> int binarySearch(T[] tArr, T t4, Comparator<? super T> comparator, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i5, i6, t4, comparator);
    }

    public static final int binarySearch(short[] sArr, short s4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i5, i6, s4);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return binarySearch(bArr, b5, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = cArr.length;
        }
        return binarySearch(cArr, c5, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = dArr.length;
        }
        return binarySearch(dArr, d5, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = fArr.length;
        }
        return binarySearch(fArr, f5, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = iArr.length;
        }
        return binarySearch(iArr, i5, i6, i7);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = jArr.length;
        }
        return binarySearch(jArr, j5, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i5, int i6, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = objArr.length;
        }
        return binarySearch(objArr, obj, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i5, int i6, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i5, i6);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = sArr.length;
        }
        return binarySearch(sArr, s4, i5, i6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "contentDeepEqualsInline")
    @LowPriorityInOverloadResolution
    private static final <T> boolean contentDeepEqualsInline(T[] tArr, T[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ArraysKt__ArraysKt.contentDeepEquals(tArr, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentDeepEqualsNullable")
    private static final <T> boolean contentDeepEqualsNullable(T[] tArr, T[] tArr2) {
        return PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0) ? ArraysKt__ArraysKt.contentDeepEquals(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "contentDeepHashCodeInline")
    @LowPriorityInOverloadResolution
    private static final <T> int contentDeepHashCodeInline(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return ArraysKt__ArraysJVMKt.contentDeepHashCode(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentDeepHashCodeNullable")
    private static final <T> int contentDeepHashCodeNullable(T[] tArr) {
        return PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0) ? ArraysKt__ArraysJVMKt.contentDeepHashCode(tArr) : Arrays.deepHashCode(tArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @JvmName(name = "contentDeepToStringInline")
    @LowPriorityInOverloadResolution
    private static final <T> String contentDeepToStringInline(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return ArraysKt__ArraysKt.contentDeepToString(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentDeepToStringNullable")
    private static final <T> String contentDeepToStringNullable(T[] tArr) {
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return ArraysKt__ArraysKt.contentDeepToString(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        Intrinsics.checkNotNullExpressionValue(deepToString, "deepToString(this)");
        return deepToString;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(byte[] bArr, byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(bArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(char[] cArr, char[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(cArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(double[] dArr, double[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(dArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(float[] fArr, float[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(fArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(int[] iArr, int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(iArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(long[] jArr, long[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(jArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ <T> boolean contentEquals(T[] tArr, T[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(tArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(short[] sArr, short[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(sArr, other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ boolean contentEquals(boolean[] zArr, boolean[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Arrays.equals(zArr, other);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final <T> boolean contentEqualsNullable(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentEqualsNullable")
    private static final boolean contentEqualsNullable(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return Arrays.hashCode(cArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return Arrays.hashCode(dArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return Arrays.hashCode(fArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ <T> int contentHashCode(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return Arrays.hashCode(tArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ int contentHashCode(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return Arrays.hashCode(zArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final <T> int contentHashCodeNullable(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentHashCodeNullable")
    private static final int contentHashCodeNullable(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        String arrays = Arrays.toString(cArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        String arrays = Arrays.toString(dArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        String arrays = Arrays.toString(fArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        String arrays = Arrays.toString(iArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        String arrays = Arrays.toString(jArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ <T> String contentToString(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        String arrays = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        String arrays = Arrays.toString(sArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    @Deprecated(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @DeprecatedSinceKotlin(hiddenSince = "1.4")
    private static final /* synthetic */ String contentToString(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        String arrays = Arrays.toString(zArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final <T> String contentToStringNullable(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "contentToStringNullable")
    private static final String contentToStringNullable(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        return arrays;
    }

    @SinceKotlin(version = "1.3")
    public static byte[] copyInto(byte[] bArr, byte[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final char[] copyInto(char[] cArr, char[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final double[] copyInto(double[] dArr, double[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(dArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final float[] copyInto(float[] fArr, float[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static int[] copyInto(int[] iArr, int[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static long[] copyInto(long[] jArr, long[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static <T> T[] copyInto(T[] tArr, T[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static short[] copyInto(short[] sArr, short[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(sArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    @SinceKotlin(version = "1.3")
    public static final boolean[] copyInto(boolean[] zArr, boolean[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(zArr, i6, destination, i5, i7 - i6);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = bArr.length;
        }
        return copyInto(bArr, bArr2, i5, i6, i7);
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = cArr.length;
        }
        return copyInto(cArr, cArr2, i5, i6, i7);
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = dArr.length;
        }
        return copyInto(dArr, dArr2, i5, i6, i7);
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = fArr.length;
        }
        return copyInto(fArr, fArr2, i5, i6, i7);
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = iArr.length;
        }
        return copyInto(iArr, iArr2, i5, i6, i7);
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = jArr.length;
        }
        return copyInto(jArr, jArr2, i5, i6, i7);
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = objArr.length;
        }
        return copyInto(objArr, objArr2, i5, i6, i7);
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = sArr.length;
        }
        return copyInto(sArr, sArr2, i5, i6, i7);
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = zArr.length;
        }
        return copyInto(zArr, zArr2, i5, i6, i7);
    }

    @InlineOnly
    private static final byte[] copyOf(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final byte[] copyOf(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final char[] copyOf(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final char[] copyOf(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final double[] copyOf(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final double[] copyOf(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final float[] copyOf(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final float[] copyOf(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final int[] copyOf(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final int[] copyOf(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final long[] copyOf(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final long[] copyOf(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final <T> T[] copyOf(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    @InlineOnly
    private static final <T> T[] copyOf(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i5);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    @InlineOnly
    private static final short[] copyOf(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final short[] copyOf(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final boolean[] copyOf(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final boolean[] copyOf(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i5);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static byte[] copyOfRange(byte[] bArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static final char[] copyOfRange(char[] cArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static final double[] copyOfRange(double[] dArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static final float[] copyOfRange(float[] fArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static int[] copyOfRange(int[] iArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static long[] copyOfRange(long[] jArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static <T> T[] copyOfRange(T[] tArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static short[] copyOfRange(short[] sArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "copyOfRange")
    public static final boolean[] copyOfRange(boolean[] zArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i6, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i5, i6);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final byte[] copyOfRangeInline(byte[] bArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(bArr, i5, i6);
        }
        if (i6 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(bArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final char[] copyOfRangeInline(char[] cArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(cArr, i5, i6);
        }
        if (i6 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(cArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final double[] copyOfRangeInline(double[] dArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(dArr, i5, i6);
        }
        if (i6 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(dArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final float[] copyOfRangeInline(float[] fArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(fArr, i5, i6);
        }
        if (i6 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(fArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final int[] copyOfRangeInline(int[] iArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(iArr, i5, i6);
        }
        if (i6 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(iArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final long[] copyOfRangeInline(long[] jArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(jArr, i5, i6);
        }
        if (i6 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(jArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final <T> T[] copyOfRangeInline(T[] tArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return (T[]) copyOfRange(tArr, i5, i6);
        }
        if (i6 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(tArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final short[] copyOfRangeInline(short[] sArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(sArr, i5, i6);
        }
        if (i6 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(sArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    @JvmName(name = "copyOfRangeInline")
    private static final boolean[] copyOfRangeInline(boolean[] zArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            return copyOfRange(zArr, i5, i6);
        }
        if (i6 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i5, i6);
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        StringBuilder e5 = a.e("toIndex: ", i6, ", size: ");
        e5.append(zArr.length);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    @InlineOnly
    private static final byte elementAt(byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[i5];
    }

    @InlineOnly
    private static final char elementAt(char[] cArr, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[i5];
    }

    @InlineOnly
    private static final double elementAt(double[] dArr, int i5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[i5];
    }

    @InlineOnly
    private static final float elementAt(float[] fArr, int i5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[i5];
    }

    @InlineOnly
    private static final int elementAt(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[i5];
    }

    @InlineOnly
    private static final long elementAt(long[] jArr, int i5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[i5];
    }

    @InlineOnly
    private static final <T> T elementAt(T[] tArr, int i5) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i5];
    }

    @InlineOnly
    private static final short elementAt(short[] sArr, int i5) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[i5];
    }

    @InlineOnly
    private static final boolean elementAt(boolean[] zArr, int i5) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i5];
    }

    public static void fill(byte[] bArr, byte b5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i5, i6, b5);
    }

    public static final void fill(char[] cArr, char c5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i5, i6, c5);
    }

    public static final void fill(double[] dArr, double d5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i5, i6, d5);
    }

    public static final void fill(float[] fArr, float f5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i5, i6, f5);
    }

    public static void fill(int[] iArr, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i6, i7, i5);
    }

    public static void fill(long[] jArr, long j5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i5, i6, j5);
    }

    public static <T> void fill(T[] tArr, T t4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i5, i6, t4);
    }

    public static void fill(short[] sArr, short s4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i5, i6, s4);
    }

    public static final void fill(boolean[] zArr, boolean z4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i5, i6, z4);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        fill(bArr, b5, i5, i6);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = cArr.length;
        }
        fill(cArr, c5, i5, i6);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = dArr.length;
        }
        fill(dArr, d5, i5, i6);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = fArr.length;
        }
        fill(fArr, f5, i5, i6);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = iArr.length;
        }
        fill(iArr, i5, i6, i7);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = jArr.length;
        }
        fill(jArr, j5, i5, i6);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i5, int i6, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = objArr.length;
        }
        fill(objArr, obj, i5, i6);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = sArr.length;
        }
        fill(sArr, s4, i5, i6);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = zArr.length;
        }
        fill(zArr, z4, i5, i6);
    }

    public static final <R> List<R> filterIsInstance(Object[] objArr, Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Object[] objArr, C destination, Class<R> klass) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte max(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(bArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character max(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(cArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(comparableArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double max(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double max(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(dArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float max(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float max(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(fArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer max(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(iArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long max(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(jArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short max(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.maxOrNull(sArr);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex != 0) {
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
        }
        return Boolean.valueOf(z4);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex != 0) {
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
        }
        return Byte.valueOf(b5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex != 0) {
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
        }
        return Character.valueOf(c5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex != 0) {
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
        }
        return Double.valueOf(d5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex != 0) {
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
        }
        return Float.valueOf(f5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex != 0) {
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
        }
        return Integer.valueOf(i5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex != 0) {
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
        }
        return Long.valueOf(j5);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
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
        }
        return t4;
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex != 0) {
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
        }
        return Short.valueOf(s4);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(objArr, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte min(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(bArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character min(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(cArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(comparableArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double min(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double min(Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(dArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float min(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @SinceKotlin(version = "1.1")
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float min(Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(fArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer min(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(iArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long min(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(jArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short min(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return ArraysKt___ArraysKt.minOrNull(sArr);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z4 = zArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(zArr);
        if (lastIndex != 0) {
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
        }
        return Boolean.valueOf(z4);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b5 = bArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr);
        if (lastIndex != 0) {
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
        }
        return Byte.valueOf(b5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c5 = cArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(cArr);
        if (lastIndex != 0) {
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
        }
        return Character.valueOf(c5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d5 = dArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(dArr);
        if (lastIndex != 0) {
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
        }
        return Double.valueOf(d5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f5 = fArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        if (lastIndex != 0) {
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
        }
        return Float.valueOf(f5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i5 = iArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(iArr);
        if (lastIndex != 0) {
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
        }
        return Integer.valueOf(i5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j5 = jArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(jArr);
        if (lastIndex != 0) {
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
        }
        return Long.valueOf(j5);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t4 = tArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(tArr);
        if (lastIndex != 0) {
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
        }
        return t4;
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s4 = sArr[0];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(sArr);
        if (lastIndex != 0) {
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
        }
        return Short.valueOf(s4);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(objArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysKt.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static byte[] plus(byte[] bArr, byte b5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, length + 1);
        result[length] = b5;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final byte[] plus(byte[] bArr, Collection<Byte> elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        byte[] result = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().byteValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static byte[] plus(byte[] bArr, byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] result = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final char[] plus(char[] cArr, char c5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, length + 1);
        result[length] = c5;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final char[] plus(char[] cArr, Collection<Character> elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        char[] result = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().charValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final char[] plus(char[] cArr, char[] elements) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] result = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final double[] plus(double[] dArr, double d5) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, length + 1);
        result[length] = d5;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final double[] plus(double[] dArr, Collection<Double> elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        double[] result = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().doubleValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final double[] plus(double[] dArr, double[] elements) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] result = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final float[] plus(float[] fArr, float f5) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, length + 1);
        result[length] = f5;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final float[] plus(float[] fArr, Collection<Float> elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        float[] result = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().floatValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final float[] plus(float[] fArr, float[] elements) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] result = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static int[] plus(int[] iArr, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, length + 1);
        result[length] = i5;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final int[] plus(int[] iArr, Collection<Integer> elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int[] result = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().intValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static int[] plus(int[] iArr, int[] elements) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] result = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static long[] plus(long[] jArr, long j5) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, length + 1);
        result[length] = j5;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final long[] plus(long[] jArr, Collection<Long> elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        long[] result = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().longValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static long[] plus(long[] jArr, long[] elements) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] result = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final <T> T[] plus(T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t4;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final <T> T[] plus(T[] tArr, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final <T> T[] plus(T[] tArr, T[] elements) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final short[] plus(short[] sArr, Collection<Short> elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().shortValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static short[] plus(short[] sArr, short s4) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] result = Arrays.copyOf(sArr, length + 1);
        result[length] = s4;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static short[] plus(short[] sArr, short[] elements) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] result = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final boolean[] plus(boolean[] zArr, Collection<Boolean> elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            result[length] = it.next().booleanValue();
            length++;
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final boolean[] plus(boolean[] zArr, boolean z4) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] result = Arrays.copyOf(zArr, length + 1);
        result[length] = z4;
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public static final boolean[] plus(boolean[] zArr, boolean[] elements) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] result = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @InlineOnly
    private static final <T> T[] plusElement(T[] tArr, T t4) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T[]) plus(tArr, t4);
    }

    public static final void sort(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static final void sort(byte[] bArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i5, i6);
    }

    public static final void sort(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static final void sort(char[] cArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i5, i6);
    }

    public static final void sort(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static final void sort(double[] dArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i5, i6);
    }

    public static final void sort(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static final void sort(float[] fArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Arrays.sort(fArr, i5, i6);
    }

    public static final void sort(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static final void sort(int[] iArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i5, i6);
    }

    public static final void sort(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final void sort(long[] jArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i5, i6);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> void sort(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        sort((Object[]) tArr);
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> void sort(T[] tArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i5, i6);
    }

    public static final <T> void sort(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void sort(T[] tArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i5, i6);
    }

    public static final void sort(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final void sort(short[] sArr, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        sort(bArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = cArr.length;
        }
        sort(cArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = dArr.length;
        }
        sort(dArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = fArr.length;
        }
        sort(fArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = iArr.length;
        }
        sort(iArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = jArr.length;
        }
        sort(jArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = comparableArr.length;
        }
        sort(comparableArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = objArr.length;
        }
        sort(objArr, i5, i6);
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = sArr.length;
        }
        sort(sArr, i5, i6);
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator, int i5, int i6) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i5, i6, comparator);
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = objArr.length;
        }
        sortWith(objArr, comparator, i5, i6);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super Byte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (byte b5 : bArr) {
            valueOf = valueOf.add(selector.invoke(Byte.valueOf(b5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(char[] cArr, Function1<? super Character, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (char c5 : cArr) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(c5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(double[] dArr, Function1<? super Double, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (double d5 : dArr) {
            valueOf = valueOf.add(selector.invoke(Double.valueOf(d5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(float[] fArr, Function1<? super Float, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (float f5 : fArr) {
            valueOf = valueOf.add(selector.invoke(Float.valueOf(f5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super Integer, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i5 : iArr) {
            valueOf = valueOf.add(selector.invoke(Integer.valueOf(i5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super Long, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (long j5 : jArr) {
            valueOf = valueOf.add(selector.invoke(Long.valueOf(j5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigDecimal sumOfBigDecimal(T[] tArr, Function1<? super T, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (T t4 : tArr) {
            valueOf = valueOf.add(selector.invoke(t4));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super Short, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (short s4 : sArr) {
            valueOf = valueOf.add(selector.invoke(Short.valueOf(s4)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(boolean[] zArr, Function1<? super Boolean, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (boolean z4 : zArr) {
            valueOf = valueOf.add(selector.invoke(Boolean.valueOf(z4)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super Byte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (byte b5 : bArr) {
            valueOf = valueOf.add(selector.invoke(Byte.valueOf(b5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(char[] cArr, Function1<? super Character, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (char c5 : cArr) {
            valueOf = valueOf.add(selector.invoke(Character.valueOf(c5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(double[] dArr, Function1<? super Double, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (double d5 : dArr) {
            valueOf = valueOf.add(selector.invoke(Double.valueOf(d5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(float[] fArr, Function1<? super Float, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (float f5 : fArr) {
            valueOf = valueOf.add(selector.invoke(Float.valueOf(f5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super Integer, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i5 : iArr) {
            valueOf = valueOf.add(selector.invoke(Integer.valueOf(i5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super Long, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (long j5 : jArr) {
            valueOf = valueOf.add(selector.invoke(Long.valueOf(j5)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final <T> BigInteger sumOfBigInteger(T[] tArr, Function1<? super T, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (T t4 : tArr) {
            valueOf = valueOf.add(selector.invoke(t4));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super Short, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (short s4 : sArr) {
            valueOf = valueOf.add(selector.invoke(Short.valueOf(s4)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(boolean[] zArr, Function1<? super Boolean, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (boolean z4 : zArr) {
            valueOf = valueOf.add(selector.invoke(Boolean.valueOf(z4)));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final SortedSet<Byte> toSortedSet(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(bArr, new TreeSet());
    }

    public static final SortedSet<Character> toSortedSet(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(cArr, new TreeSet());
    }

    public static final SortedSet<Double> toSortedSet(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(dArr, new TreeSet());
    }

    public static final SortedSet<Float> toSortedSet(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(fArr, new TreeSet());
    }

    public static final SortedSet<Integer> toSortedSet(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(iArr, new TreeSet());
    }

    public static final SortedSet<Long> toSortedSet(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(jArr, new TreeSet());
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet());
    }

    public static final <T> SortedSet<T> toSortedSet(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    public static final SortedSet<Short> toSortedSet(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(sArr, new TreeSet());
    }

    public static final SortedSet<Boolean> toSortedSet(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) ArraysKt___ArraysKt.toCollection(zArr, new TreeSet());
    }

    public static final Boolean[] toTypedArray(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            boolArr[i5] = Boolean.valueOf(zArr[i5]);
        }
        return boolArr;
    }

    public static final Byte[] toTypedArray(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            bArr2[i5] = Byte.valueOf(bArr[i5]);
        }
        return bArr2;
    }

    public static final Character[] toTypedArray(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            chArr[i5] = Character.valueOf(cArr[i5]);
        }
        return chArr;
    }

    public static final Double[] toTypedArray(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            dArr2[i5] = Double.valueOf(dArr[i5]);
        }
        return dArr2;
    }

    public static final Float[] toTypedArray(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            fArr2[i5] = Float.valueOf(fArr[i5]);
        }
        return fArr2;
    }

    public static final Integer[] toTypedArray(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            numArr[i5] = Integer.valueOf(iArr[i5]);
        }
        return numArr;
    }

    public static final Long[] toTypedArray(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            lArr[i5] = Long.valueOf(jArr[i5]);
        }
        return lArr;
    }

    public static final Short[] toTypedArray(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            shArr[i5] = Short.valueOf(sArr[i5]);
        }
        return shArr;
    }
}
