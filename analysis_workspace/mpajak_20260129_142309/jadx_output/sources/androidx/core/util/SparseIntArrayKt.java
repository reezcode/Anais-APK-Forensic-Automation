package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i5) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i5) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i5) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.indexOfValue(i5) >= 0;
    }

    public static final void forEach(SparseIntArray sparseIntArray, Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseIntArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            action.invoke(Integer.valueOf(sparseIntArray.keyAt(i5)), Integer.valueOf(sparseIntArray.valueAt(i5)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.get(i5, i6);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i5, Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int indexOfKey = sparseIntArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : defaultValue.invoke().intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return sparseIntArray.size() != 0;
    }

    public static final IntIterator keyIterator(final SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return new IntIterator() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseIntArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray other) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SparseIntArray sparseIntArray2 = new SparseIntArray(other.size() + sparseIntArray.size());
        putAll(sparseIntArray2, sparseIntArray);
        putAll(sparseIntArray2, other);
        return sparseIntArray2;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray other) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseIntArray.put(other.keyAt(i5), other.valueAt(i5));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        int indexOfKey = sparseIntArray.indexOfKey(i5);
        if (indexOfKey < 0 || i6 != sparseIntArray.valueAt(indexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(indexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        sparseIntArray.put(i5, i6);
    }

    public static final IntIterator valueIterator(final SparseIntArray sparseIntArray) {
        Intrinsics.checkNotNullParameter(sparseIntArray, "<this>");
        return new IntIterator() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseIntArray2.valueAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }
}
