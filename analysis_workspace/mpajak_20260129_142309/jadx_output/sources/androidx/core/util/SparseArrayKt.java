package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArray<T> sparseArray, int i5) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i5) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t4) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.indexOfValue(t4) >= 0;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            action.invoke(Integer.valueOf(sparseArray.keyAt(i5)), sparseArray.valueAt(i5));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i5, T t4) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        T t5 = sparseArray.get(i5);
        return t5 == null ? t4 : t5;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i5, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t4 = sparseArray.get(i5);
        return t4 == null ? defaultValue.invoke() : t4;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return sparseArray.size() != 0;
    }

    public static final <T> IntIterator keyIterator(final SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new IntIterator() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.IntIterator
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> other) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SparseArray<T> sparseArray2 = new SparseArray<>(other.size() + sparseArray.size());
        putAll(sparseArray2, sparseArray);
        putAll(sparseArray2, other);
        return sparseArray2;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> other) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseArray.put(other.keyAt(i5), other.valueAt(i5));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i5, T t4) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i5);
        if (indexOfKey < 0 || !Intrinsics.areEqual(t4, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i5, T t4) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        sparseArray.put(i5, t4);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        Intrinsics.checkNotNullParameter(sparseArray, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
