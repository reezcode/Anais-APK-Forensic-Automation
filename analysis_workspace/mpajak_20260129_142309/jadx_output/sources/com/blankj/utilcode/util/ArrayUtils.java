package com.blankj.utilcode.util;

import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes8.dex */
public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;

    /* loaded from: classes16.dex */
    public interface Closure<E> {
        void execute(int i5, E e5);
    }

    private ArrayUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, byte b5) {
        return (byte[]) realAddOne(bArr, Byte.valueOf(b5), Byte.TYPE);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, int i5, byte b5) {
        return (byte[]) realAdd(bArr, i5, Byte.valueOf(b5), Byte.TYPE);
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, int i5, @Nullable byte[] bArr2) {
        Object realAddArr = realAddArr(bArr, i5, bArr2, Byte.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (byte[]) realAddArr;
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, char c5) {
        return (char[]) realAddOne(cArr, Character.valueOf(c5), Character.TYPE);
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, int i5, char c5) {
        return (char[]) realAdd(cArr, i5, Character.valueOf(c5), Character.TYPE);
    }

    public static char[] add(@Nullable char[] cArr, int i5, @Nullable char[] cArr2) {
        Object realAddArr = realAddArr(cArr, i5, cArr2, Character.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (char[]) realAddArr;
    }

    @Nullable
    public static char[] add(@Nullable char[] cArr, @Nullable char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, double d5) {
        return (double[]) realAddOne(dArr, Double.valueOf(d5), Double.TYPE);
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, int i5, double d5) {
        return (double[]) realAdd(dArr, i5, Double.valueOf(d5), Double.TYPE);
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, int i5, @Nullable double[] dArr2) {
        Object realAddArr = realAddArr(dArr, i5, dArr2, Double.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (double[]) realAddArr;
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, @Nullable double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, float f5) {
        return (float[]) realAddOne(fArr, Float.valueOf(f5), Float.TYPE);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, int i5, float f5) {
        return (float[]) realAdd(fArr, i5, Float.valueOf(f5), Float.TYPE);
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, int i5, @Nullable float[] fArr2) {
        Object realAddArr = realAddArr(fArr, i5, fArr2, Float.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (float[]) realAddArr;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, @Nullable float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i5) {
        return (int[]) realAddOne(iArr, Integer.valueOf(i5), Integer.TYPE);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i5, int i6) {
        return (int[]) realAdd(iArr, i5, Integer.valueOf(i6), Integer.TYPE);
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        Object realAddArr = realAddArr(iArr, i5, iArr2, Integer.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (int[]) realAddArr;
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, @Nullable int[] iArr2) {
        return (int[]) realAddArr(iArr, iArr2);
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, int i5, long j5) {
        return (long[]) realAdd(jArr, i5, Long.valueOf(j5), Long.TYPE);
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, int i5, @Nullable long[] jArr2) {
        Object realAddArr = realAddArr(jArr, i5, jArr2, Long.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (long[]) realAddArr;
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, long j5) {
        return (long[]) realAddOne(jArr, Long.valueOf(j5), Long.TYPE);
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, @Nullable long[] jArr2) {
        return (long[]) realAddArr(jArr, jArr2);
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, int i5, @Nullable T t4) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else {
            if (t4 == null) {
                T[] tArr2 = (T[]) new Object[1];
                tArr2[0] = null;
                return tArr2;
            }
            cls = t4.getClass();
        }
        return (T[]) ((Object[]) realAdd(tArr, i5, t4, cls));
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, int i5, @Nullable T[] tArr2) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else {
            if (tArr2 == null) {
                return null;
            }
            cls = tArr2.getClass();
        }
        return (T[]) ((Object[]) realAddArr(tArr, i5, tArr2, cls.getComponentType()));
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T t4) {
        return (T[]) ((Object[]) realAddOne(tArr, t4, tArr != null ? tArr.getClass() : t4 != null ? t4.getClass() : Object.class));
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T[] tArr2) {
        return (T[]) ((Object[]) realAddArr(tArr, tArr2));
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, int i5, short s4) {
        return (short[]) realAdd(sArr, i5, Short.valueOf(s4), Short.TYPE);
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, int i5, @Nullable short[] sArr2) {
        Object realAddArr = realAddArr(sArr, i5, sArr2, Short.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (short[]) realAddArr;
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, short s4) {
        return (short[]) realAddOne(sArr, Short.valueOf(s4), Short.TYPE);
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, @Nullable short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, int i5, boolean z4) {
        return (boolean[]) realAdd(zArr, i5, Boolean.valueOf(z4), Boolean.TYPE);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, int i5, @Nullable boolean[] zArr2) {
        Object realAddArr = realAddArr(zArr, i5, zArr2, Boolean.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (boolean[]) realAddArr;
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, boolean z4) {
        return (boolean[]) realAddOne(zArr, Boolean.valueOf(z4), Boolean.TYPE);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, @Nullable boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    @NonNull
    public static <T> List<T> asArrayList(@Nullable T... tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(Arrays.asList(tArr));
        }
        return arrayList;
    }

    @NonNull
    public static <T> List<T> asLinkedList(@Nullable T... tArr) {
        LinkedList linkedList = new LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(Arrays.asList(tArr));
        }
        return linkedList;
    }

    @NonNull
    public static <T> List<T> asList(@Nullable T... tArr) {
        return (tArr == null || tArr.length == 0) ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @NonNull
    public static <T> List<T> asUnmodifiableList(@Nullable T... tArr) {
        return Collections.unmodifiableList(asList(tArr));
    }

    public static boolean contains(@Nullable byte[] bArr, byte b5) {
        return indexOf(bArr, b5) != -1;
    }

    public static boolean contains(@Nullable char[] cArr, char c5) {
        return indexOf(cArr, c5) != -1;
    }

    public static boolean contains(@Nullable double[] dArr, double d5) {
        return indexOf(dArr, d5) != -1;
    }

    public static boolean contains(@Nullable double[] dArr, double d5, double d6) {
        return indexOf(dArr, d5, 0, d6) != -1;
    }

    public static boolean contains(@Nullable float[] fArr, float f5) {
        return indexOf(fArr, f5) != -1;
    }

    public static boolean contains(@Nullable int[] iArr, int i5) {
        return indexOf(iArr, i5) != -1;
    }

    public static boolean contains(@Nullable long[] jArr, long j5) {
        return indexOf(jArr, j5) != -1;
    }

    public static boolean contains(@Nullable Object[] objArr, @Nullable Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    public static boolean contains(@Nullable short[] sArr, short s4) {
        return indexOf(sArr, s4) != -1;
    }

    public static boolean contains(@Nullable boolean[] zArr, boolean z4) {
        return indexOf(zArr, z4) != -1;
    }

    @Nullable
    public static byte[] copy(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return subArray(bArr, 0, bArr.length);
    }

    @Nullable
    public static char[] copy(@Nullable char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return subArray(cArr, 0, cArr.length);
    }

    @Nullable
    public static double[] copy(@Nullable double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return subArray(dArr, 0, dArr.length);
    }

    @Nullable
    public static float[] copy(@Nullable float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return subArray(fArr, 0, fArr.length);
    }

    @Nullable
    public static int[] copy(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return subArray(iArr, 0, iArr.length);
    }

    @Nullable
    public static long[] copy(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return subArray(jArr, 0, jArr.length);
    }

    @Nullable
    public static <T> T[] copy(@Nullable T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) subArray(tArr, 0, tArr.length);
    }

    @Nullable
    public static short[] copy(@Nullable short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return subArray(sArr, 0, sArr.length);
    }

    @Nullable
    public static boolean[] copy(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean equals(@Nullable Object[] objArr, @Nullable Object[] objArr2) {
        return Arrays.deepEquals(objArr, objArr2);
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void forAllDo(@Nullable Object obj, @Nullable Closure<E> closure) {
        if (obj == null || closure == 0) {
            return;
        }
        int i5 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i5 < length) {
                closure.execute(i5, objArr[i5]);
                i5++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i5 < length2) {
                closure.execute(i5, zArr[i5] ? Boolean.TRUE : Boolean.FALSE);
                i5++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (i5 < length3) {
                closure.execute(i5, Byte.valueOf(bArr[i5]));
                i5++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i5 < length4) {
                closure.execute(i5, Character.valueOf(cArr[i5]));
                i5++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (i5 < length5) {
                closure.execute(i5, Short.valueOf(sArr[i5]));
                i5++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length6 = iArr.length;
            while (i5 < length6) {
                closure.execute(i5, Integer.valueOf(iArr[i5]));
                i5++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (i5 < length7) {
                closure.execute(i5, Long.valueOf(jArr[i5]));
                i5++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (i5 < length8) {
                closure.execute(i5, Float.valueOf(fArr[i5]));
                i5++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            StringBuilder g5 = d.g("Not an array: ");
            g5.append(obj.getClass());
            throw new IllegalArgumentException(g5.toString());
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        while (i5 < length9) {
            closure.execute(i5, Double.valueOf(dArr[i5]));
            i5++;
        }
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i5) {
        return get(obj, i5, null);
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i5, @Nullable Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, i5);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static int getLength(@Nullable Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b5) {
        return indexOf(bArr, b5, 0);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b5, int i5) {
        if (bArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < bArr.length) {
            if (b5 == bArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable char[] cArr, char c5) {
        return indexOf(cArr, c5, 0);
    }

    public static int indexOf(@Nullable char[] cArr, char c5, int i5) {
        if (cArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < cArr.length) {
            if (c5 == cArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable double[] dArr, double d5) {
        return indexOf(dArr, d5, 0);
    }

    public static int indexOf(@Nullable double[] dArr, double d5, double d6) {
        return indexOf(dArr, d5, 0, d6);
    }

    public static int indexOf(@Nullable double[] dArr, double d5, int i5) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < dArr.length) {
            if (d5 == dArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable double[] dArr, double d5, int i5, double d6) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        double d7 = d5 - d6;
        double d8 = d5 + d6;
        while (i5 < dArr.length) {
            if (dArr[i5] >= d7 && dArr[i5] <= d8) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable float[] fArr, float f5) {
        return indexOf(fArr, f5, 0);
    }

    public static int indexOf(@Nullable float[] fArr, float f5, int i5) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < fArr.length) {
            if (f5 == fArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable int[] iArr, int i5) {
        return indexOf(iArr, i5, 0);
    }

    public static int indexOf(@Nullable int[] iArr, int i5, int i6) {
        if (iArr == null) {
            return -1;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < iArr.length) {
            if (i5 == iArr[i6]) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static int indexOf(@Nullable long[] jArr, long j5) {
        return indexOf(jArr, j5, 0);
    }

    public static int indexOf(@Nullable long[] jArr, long j5, int i5) {
        if (jArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < jArr.length) {
            if (j5 == jArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj, int i5) {
        if (objArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (obj == null) {
            while (i5 < objArr.length) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
        } else {
            while (i5 < objArr.length) {
                if (obj.equals(objArr[i5])) {
                    return i5;
                }
                i5++;
            }
        }
        return -1;
    }

    public static int indexOf(@Nullable short[] sArr, short s4) {
        return indexOf(sArr, s4, 0);
    }

    public static int indexOf(@Nullable short[] sArr, short s4, int i5) {
        if (sArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < sArr.length) {
            if (s4 == sArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z4) {
        return indexOf(zArr, z4, 0);
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z4, int i5) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < zArr.length) {
            if (z4 == zArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static boolean isEmpty(@Nullable Object obj) {
        return getLength(obj) == 0;
    }

    public static boolean isSameLength(@Nullable Object obj, @Nullable Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b5) {
        return lastIndexOf(bArr, b5, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b5, int i5) {
        if (bArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= bArr.length) {
            i5 = bArr.length - 1;
        }
        while (i5 >= 0) {
            if (b5 == bArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c5) {
        return lastIndexOf(cArr, c5, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c5, int i5) {
        if (cArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= cArr.length) {
            i5 = cArr.length - 1;
        }
        while (i5 >= 0) {
            if (c5 == cArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d5) {
        return lastIndexOf(dArr, d5, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d5, double d6) {
        return lastIndexOf(dArr, d5, Integer.MAX_VALUE, d6);
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d5, int i5) {
        if (isEmpty(dArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= dArr.length) {
            i5 = dArr.length - 1;
        }
        while (i5 >= 0) {
            if (d5 == dArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d5, int i5, double d6) {
        if (isEmpty(dArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= dArr.length) {
            i5 = dArr.length - 1;
        }
        double d7 = d5 - d6;
        double d8 = d5 + d6;
        while (i5 >= 0) {
            if (dArr[i5] >= d7 && dArr[i5] <= d8) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f5) {
        return lastIndexOf(fArr, f5, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f5, int i5) {
        if (isEmpty(fArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= fArr.length) {
            i5 = fArr.length - 1;
        }
        while (i5 >= 0) {
            if (f5 == fArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i5) {
        return lastIndexOf(iArr, i5, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i5, int i6) {
        if (iArr == null || i6 < 0) {
            return -1;
        }
        if (i6 >= iArr.length) {
            i6 = iArr.length - 1;
        }
        while (i6 >= 0) {
            if (i5 == iArr[i6]) {
                return i6;
            }
            i6--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j5) {
        return lastIndexOf(jArr, j5, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j5, int i5) {
        if (jArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= jArr.length) {
            i5 = jArr.length - 1;
        }
        while (i5 >= 0) {
            if (j5 == jArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj, int i5) {
        if (objArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= objArr.length) {
            i5 = objArr.length - 1;
        }
        if (obj == null) {
            while (i5 >= 0) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5--;
            }
        } else {
            while (i5 >= 0) {
                if (obj.equals(objArr[i5])) {
                    return i5;
                }
                i5--;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s4) {
        return lastIndexOf(sArr, s4, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s4, int i5) {
        if (sArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= sArr.length) {
            i5 = sArr.length - 1;
        }
        while (i5 >= 0) {
            if (s4 == sArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z4) {
        return lastIndexOf(zArr, z4, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z4, int i5) {
        if (isEmpty(zArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= zArr.length) {
            i5 = zArr.length - 1;
        }
        while (i5 >= 0) {
            if (z4 == zArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    @NonNull
    public static <T> T[] newArray(T... tArr) {
        return tArr;
    }

    @NonNull
    public static boolean[] newBooleanArray(boolean... zArr) {
        return zArr;
    }

    @NonNull
    public static byte[] newByteArray(byte... bArr) {
        return bArr;
    }

    @NonNull
    public static char[] newCharArray(char... cArr) {
        return cArr;
    }

    @NonNull
    public static double[] newDoubleArray(double... dArr) {
        return dArr;
    }

    @NonNull
    public static float[] newFloatArray(float... fArr) {
        return fArr;
    }

    @NonNull
    public static int[] newIntArray(int... iArr) {
        return iArr;
    }

    @NonNull
    public static long[] newLongArray(long... jArr) {
        return jArr;
    }

    @NonNull
    public static short[] newShortArray(short... sArr) {
        return sArr;
    }

    @NonNull
    private static Object realAdd(@Nullable Object obj, int i5, @Nullable Object obj2, Class cls) {
        if (obj == null) {
            if (i5 != 0) {
                throw new IndexOutOfBoundsException(d.c("Index: ", i5, ", Length: 0"));
            }
            Object newInstance = Array.newInstance((Class<?>) cls, 1);
            Array.set(newInstance, 0, obj2);
            return newInstance;
        }
        int length = Array.getLength(obj);
        if (i5 > length || i5 < 0) {
            throw new IndexOutOfBoundsException(d.d("Index: ", i5, ", Length: ", length));
        }
        Object newInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, newInstance2, 0, i5);
        Array.set(newInstance2, i5, obj2);
        if (i5 < length) {
            System.arraycopy(obj, i5, newInstance2, i5 + 1, length - i5);
        }
        return newInstance2;
    }

    @Nullable
    private static Object realAddArr(@Nullable Object obj, int i5, @Nullable Object obj2, Class cls) {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (i5 == 0) {
                return realCopy(obj2);
            }
            throw new IndexOutOfBoundsException(d.c("Index: ", i5, ", array1 Length: 0"));
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (i5 > length || i5 < 0) {
            throw new IndexOutOfBoundsException(d.d("Index: ", i5, ", array1 Length: ", length));
        }
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        if (i5 == length) {
            System.arraycopy(obj, 0, newInstance, 0, length);
            System.arraycopy(obj2, 0, newInstance, length, length2);
        } else if (i5 == 0) {
            System.arraycopy(obj2, 0, newInstance, 0, length2);
            System.arraycopy(obj, 0, newInstance, length2, length);
        } else {
            System.arraycopy(obj, 0, newInstance, 0, i5);
            System.arraycopy(obj2, 0, newInstance, i5, length2);
            System.arraycopy(obj, i5, newInstance, length2 + i5, length - i5);
        }
        return newInstance;
    }

    private static Object realAddArr(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return realCopy(obj2);
        }
        if (obj2 == null) {
            return realCopy(obj);
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    @NonNull
    private static Object realAddOne(@Nullable Object obj, @Nullable Object obj2, Class cls) {
        Object newInstance;
        int i5 = 0;
        if (obj != null) {
            int length = getLength(obj);
            newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            i5 = length;
        } else {
            newInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(newInstance, i5, obj2);
        return newInstance;
    }

    @Nullable
    private static Object realCopy(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return realSubArray(obj, 0, getLength(obj));
    }

    @Nullable
    private static Object realSubArray(@Nullable Object obj, int i5, int i6) {
        if (obj == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int length = getLength(obj);
        if (i6 > length) {
            i6 = length;
        }
        int i7 = i6 - i5;
        Class<?> componentType = obj.getClass().getComponentType();
        if (i7 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object newInstance = Array.newInstance(componentType, i7);
        System.arraycopy(obj, i5, newInstance, 0, i7);
        return newInstance;
    }

    @NonNull
    private static Object remove(@NonNull Object obj, int i5) {
        int length = getLength(obj);
        if (i5 < 0 || i5 >= length) {
            throw new IndexOutOfBoundsException(d.d("Index: ", i5, ", Length: ", length));
        }
        int i6 = length - 1;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i6);
        System.arraycopy(obj, 0, newInstance, 0, i5);
        if (i5 < i6) {
            System.arraycopy(obj, i5 + 1, newInstance, i5, (length - i5) - 1);
        }
        return newInstance;
    }

    @Nullable
    public static byte[] remove(@Nullable byte[] bArr, int i5) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((Object) bArr, i5);
    }

    @Nullable
    public static char[] remove(@Nullable char[] cArr, int i5) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((Object) cArr, i5);
    }

    @Nullable
    public static double[] remove(@Nullable double[] dArr, int i5) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((Object) dArr, i5);
    }

    @Nullable
    public static float[] remove(@Nullable float[] fArr, int i5) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((Object) fArr, i5);
    }

    @Nullable
    public static int[] remove(@Nullable int[] iArr, int i5) {
        if (iArr == null) {
            return null;
        }
        return (int[]) remove((Object) iArr, i5);
    }

    @Nullable
    public static long[] remove(@Nullable long[] jArr, int i5) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((Object) jArr, i5);
    }

    @Nullable
    public static Object[] remove(@Nullable Object[] objArr, int i5) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) remove((Object) objArr, i5);
    }

    @Nullable
    public static short[] remove(@Nullable short[] sArr, int i5) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((Object) sArr, i5);
    }

    @Nullable
    public static boolean[] remove(@Nullable boolean[] zArr, int i5) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((Object) zArr, i5);
    }

    @Nullable
    public static byte[] removeElement(@Nullable byte[] bArr, byte b5) {
        int indexOf = indexOf(bArr, b5);
        return indexOf == -1 ? copy(bArr) : remove(bArr, indexOf);
    }

    @Nullable
    public static char[] removeElement(@Nullable char[] cArr, char c5) {
        int indexOf = indexOf(cArr, c5);
        return indexOf == -1 ? copy(cArr) : remove(cArr, indexOf);
    }

    @Nullable
    public static double[] removeElement(@Nullable double[] dArr, double d5) {
        int indexOf = indexOf(dArr, d5);
        return indexOf == -1 ? copy(dArr) : remove(dArr, indexOf);
    }

    @Nullable
    public static float[] removeElement(@Nullable float[] fArr, float f5) {
        int indexOf = indexOf(fArr, f5);
        return indexOf == -1 ? copy(fArr) : remove(fArr, indexOf);
    }

    @Nullable
    public static int[] removeElement(@Nullable int[] iArr, int i5) {
        int indexOf = indexOf(iArr, i5);
        return indexOf == -1 ? copy(iArr) : remove(iArr, indexOf);
    }

    @Nullable
    public static long[] removeElement(@Nullable long[] jArr, long j5) {
        int indexOf = indexOf(jArr, j5);
        return indexOf == -1 ? copy(jArr) : remove(jArr, indexOf);
    }

    @Nullable
    public static Object[] removeElement(@Nullable Object[] objArr, @Nullable Object obj) {
        int indexOf = indexOf(objArr, obj);
        return indexOf == -1 ? copy(objArr) : remove(objArr, indexOf);
    }

    @Nullable
    public static short[] removeElement(@Nullable short[] sArr, short s4) {
        int indexOf = indexOf(sArr, s4);
        return indexOf == -1 ? copy(sArr) : remove(sArr, indexOf);
    }

    @Nullable
    public static boolean[] removeElement(@Nullable boolean[] zArr, boolean z4) {
        int indexOf = indexOf(zArr, z4);
        return indexOf == -1 ? copy(zArr) : remove(zArr, indexOf);
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            byte b5 = bArr[length];
            bArr[length] = bArr[i5];
            bArr[i5] = b5;
            length--;
        }
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            char c5 = cArr[length];
            cArr[length] = cArr[i5];
            cArr[i5] = c5;
            length--;
        }
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            double d5 = dArr[length];
            dArr[length] = dArr[i5];
            dArr[i5] = d5;
            length--;
        }
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            float f5 = fArr[length];
            fArr[length] = fArr[i5];
            fArr[i5] = f5;
            length--;
        }
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            int i6 = iArr[length];
            iArr[length] = iArr[i5];
            iArr[i5] = i6;
            length--;
        }
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            long j5 = jArr[length];
            jArr[length] = jArr[i5];
            jArr[i5] = j5;
            length--;
        }
    }

    public static <T> void reverse(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            T t4 = tArr[length];
            tArr[length] = tArr[i5];
            tArr[i5] = t4;
            length--;
        }
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            short s4 = sArr[length];
            sArr[length] = sArr[i5];
            sArr[i5] = s4;
            length--;
        }
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            boolean z4 = zArr[length];
            zArr[length] = zArr[i5];
            zArr[i5] = z4;
            length--;
        }
    }

    public static void set(@Nullable Object obj, int i5, @Nullable Object obj2) {
        if (obj == null) {
            return;
        }
        Array.set(obj, i5, obj2);
    }

    public static void sort(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        Arrays.sort(bArr);
    }

    public static void sort(@Nullable char[] cArr) {
        if (cArr == null || cArr.length < 2) {
            return;
        }
        Arrays.sort(cArr);
    }

    public static void sort(@Nullable double[] dArr) {
        if (dArr == null || dArr.length < 2) {
            return;
        }
        Arrays.sort(dArr);
    }

    public static void sort(@Nullable float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return;
        }
        Arrays.sort(fArr);
    }

    public static void sort(@Nullable int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return;
        }
        Arrays.sort(iArr);
    }

    public static void sort(@Nullable long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return;
        }
        Arrays.sort(jArr);
    }

    public static <T> void sort(@Nullable T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        Arrays.sort(tArr, comparator);
    }

    public static void sort(@Nullable short[] sArr) {
        if (sArr == null || sArr.length < 2) {
            return;
        }
        Arrays.sort(sArr);
    }

    @Nullable
    public static byte[] subArray(@Nullable byte[] bArr, int i5, int i6) {
        return (byte[]) realSubArray(bArr, i5, i6);
    }

    @Nullable
    public static char[] subArray(@Nullable char[] cArr, int i5, int i6) {
        return (char[]) realSubArray(cArr, i5, i6);
    }

    @Nullable
    public static double[] subArray(@Nullable double[] dArr, int i5, int i6) {
        return (double[]) realSubArray(dArr, i5, i6);
    }

    @Nullable
    public static float[] subArray(@Nullable float[] fArr, int i5, int i6) {
        return (float[]) realSubArray(fArr, i5, i6);
    }

    @Nullable
    public static int[] subArray(@Nullable int[] iArr, int i5, int i6) {
        return (int[]) realSubArray(iArr, i5, i6);
    }

    @Nullable
    public static long[] subArray(@Nullable long[] jArr, int i5, int i6) {
        return (long[]) realSubArray(jArr, i5, i6);
    }

    @Nullable
    public static <T> T[] subArray(@Nullable T[] tArr, int i5, int i6) {
        return (T[]) ((Object[]) realSubArray(tArr, i5, i6));
    }

    @Nullable
    public static short[] subArray(@Nullable short[] sArr, int i5, int i6) {
        return (short[]) realSubArray(sArr, i5, i6);
    }

    @Nullable
    public static boolean[] subArray(@Nullable boolean[] zArr, int i5, int i6) {
        return (boolean[]) realSubArray(zArr, i5, i6);
    }

    @Nullable
    public static Boolean[] toObject(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i5 = 0; i5 < zArr.length; i5++) {
            boolArr[i5] = zArr[i5] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    @Nullable
    public static Byte[] toObject(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr2[i5] = new Byte(bArr[i5]);
        }
        return bArr2;
    }

    @Nullable
    public static Character[] toObject(@Nullable char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[cArr.length];
        for (int i5 = 0; i5 < cArr.length; i5++) {
            chArr[i5] = new Character(cArr[i5]);
        }
        return chArr;
    }

    @Nullable
    public static Double[] toObject(@Nullable double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr2[i5] = new Double(dArr[i5]);
        }
        return dArr2;
    }

    @Nullable
    public static Float[] toObject(@Nullable float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr2[i5] = new Float(fArr[i5]);
        }
        return fArr2;
    }

    @Nullable
    public static Integer[] toObject(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            numArr[i5] = new Integer(iArr[i5]);
        }
        return numArr;
    }

    @Nullable
    public static Long[] toObject(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[jArr.length];
        for (int i5 = 0; i5 < jArr.length; i5++) {
            lArr[i5] = new Long(jArr[i5]);
        }
        return lArr;
    }

    @Nullable
    public static Short[] toObject(@Nullable short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[sArr.length];
        for (int i5 = 0; i5 < sArr.length; i5++) {
            shArr[i5] = new Short(sArr[i5]);
        }
        return shArr;
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr2[i5] = bArr[i5].byteValue();
        }
        return bArr2;
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr, byte b5) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            Byte b6 = bArr[i5];
            bArr2[i5] = b6 == null ? b5 : b6.byteValue();
        }
        return bArr2;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i5 = 0; i5 < chArr.length; i5++) {
            cArr[i5] = chArr[i5].charValue();
        }
        return cArr;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr, char c5) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i5 = 0; i5 < chArr.length; i5++) {
            Character ch = chArr[i5];
            cArr[i5] = ch == null ? c5 : ch.charValue();
        }
        return cArr;
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr2[i5] = dArr[i5].doubleValue();
        }
        return dArr2;
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr, double d5) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            Double d6 = dArr[i5];
            dArr2[i5] = d6 == null ? d5 : d6.doubleValue();
        }
        return dArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr2[i5] = fArr[i5].floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr, float f5) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            Float f6 = fArr[i5];
            fArr2[i5] = f6 == null ? f5 : f6.floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i5 = 0; i5 < numArr.length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
        return iArr;
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr, int i5) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i6 = 0; i6 < numArr.length; i6++) {
            Integer num = numArr[i6];
            iArr[i6] = num == null ? i5 : num.intValue();
        }
        return iArr;
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i5 = 0; i5 < lArr.length; i5++) {
            jArr[i5] = lArr[i5].longValue();
        }
        return jArr;
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr, long j5) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i5 = 0; i5 < lArr.length; i5++) {
            Long l5 = lArr[i5];
            jArr[i5] = l5 == null ? j5 : l5.longValue();
        }
        return jArr;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i5 = 0; i5 < shArr.length; i5++) {
            sArr[i5] = shArr[i5].shortValue();
        }
        return sArr;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr, short s4) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i5 = 0; i5 < shArr.length; i5++) {
            Short sh = shArr[i5];
            sArr[i5] = sh == null ? s4 : sh.shortValue();
        }
        return sArr;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i5 = 0; i5 < boolArr.length; i5++) {
            zArr[i5] = boolArr[i5].booleanValue();
        }
        return zArr;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr, boolean z4) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i5 = 0; i5 < boolArr.length; i5++) {
            Boolean bool = boolArr[i5];
            zArr[i5] = bool == null ? z4 : bool.booleanValue();
        }
        return zArr;
    }

    @NonNull
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        StringBuilder g5 = d.g("Array has incompatible type: ");
        g5.append(obj.getClass());
        throw new IllegalArgumentException(g5.toString());
    }
}
