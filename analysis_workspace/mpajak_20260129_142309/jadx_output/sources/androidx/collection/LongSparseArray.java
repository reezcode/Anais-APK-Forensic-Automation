package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class LongSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    public LongSparseArray(int i5) {
        this.mGarbage = false;
        if (i5 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_LONGS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i5);
            this.mKeys = new long[idealLongArraySize];
            this.mValues = new Object[idealLongArraySize];
        }
    }

    private void gc() {
        int i5 = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != DELETED) {
                if (i7 != i6) {
                    jArr[i6] = jArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.mGarbage = false;
        this.mSize = i6;
    }

    public void append(long j5, E e5) {
        int i5 = this.mSize;
        if (i5 != 0 && j5 <= this.mKeys[i5 - 1]) {
            put(j5, e5);
            return;
        }
        if (this.mGarbage && i5 >= this.mKeys.length) {
            gc();
        }
        int i6 = this.mSize;
        if (i6 >= this.mKeys.length) {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i6 + 1);
            long[] jArr = new long[idealLongArraySize];
            Object[] objArr = new Object[idealLongArraySize];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = jArr;
            this.mValues = objArr;
        }
        this.mKeys[i6] = j5;
        this.mValues[i6] = e5;
        this.mSize = i6 + 1;
    }

    public void clear() {
        int i5 = this.mSize;
        Object[] objArr = this.mValues;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m1clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public boolean containsKey(long j5) {
        return indexOfKey(j5) >= 0;
    }

    public boolean containsValue(E e5) {
        return indexOfValue(e5) >= 0;
    }

    @Deprecated
    public void delete(long j5) {
        remove(j5);
    }

    @Nullable
    public E get(long j5) {
        return get(j5, null);
    }

    public E get(long j5, E e5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j5);
        if (binarySearch >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[binarySearch] != DELETED) {
                return (E) objArr[binarySearch];
            }
        }
        return e5;
    }

    public int indexOfKey(long j5) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, j5);
    }

    public int indexOfValue(E e5) {
        if (this.mGarbage) {
            gc();
        }
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (this.mValues[i5] == e5) {
                return i5;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i5];
    }

    public void put(long j5, E e5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j5);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e5;
            return;
        }
        int i5 = ~binarySearch;
        int i6 = this.mSize;
        if (i5 < i6) {
            Object[] objArr = this.mValues;
            if (objArr[i5] == DELETED) {
                this.mKeys[i5] = j5;
                objArr[i5] = e5;
                return;
            }
        }
        if (this.mGarbage && i6 >= this.mKeys.length) {
            gc();
            i5 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, j5);
        }
        int i7 = this.mSize;
        if (i7 >= this.mKeys.length) {
            int idealLongArraySize = ContainerHelpers.idealLongArraySize(i7 + 1);
            long[] jArr = new long[idealLongArraySize];
            Object[] objArr2 = new Object[idealLongArraySize];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = jArr;
            this.mValues = objArr2;
        }
        int i8 = this.mSize;
        if (i8 - i5 != 0) {
            long[] jArr3 = this.mKeys;
            int i9 = i5 + 1;
            System.arraycopy(jArr3, i5, jArr3, i9, i8 - i5);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i5, objArr4, i9, this.mSize - i5);
        }
        this.mKeys[i5] = j5;
        this.mValues[i5] = e5;
        this.mSize++;
    }

    public void putAll(@NonNull LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            put(longSparseArray.keyAt(i5), longSparseArray.valueAt(i5));
        }
    }

    @Nullable
    public E putIfAbsent(long j5, E e5) {
        E e6 = get(j5);
        if (e6 == null) {
            put(j5, e5);
        }
        return e6;
    }

    public void remove(long j5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j5);
        if (binarySearch >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public boolean remove(long j5, Object obj) {
        int indexOfKey = indexOfKey(j5);
        if (indexOfKey < 0) {
            return false;
        }
        E valueAt = valueAt(indexOfKey);
        if (obj != valueAt && (obj == null || !obj.equals(valueAt))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public void removeAt(int i5) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i5];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i5] = obj2;
            this.mGarbage = true;
        }
    }

    @Nullable
    public E replace(long j5, E e5) {
        int indexOfKey = indexOfKey(j5);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.mValues;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e5;
        return e6;
    }

    public boolean replace(long j5, E e5, E e6) {
        int indexOfKey = indexOfKey(j5);
        if (indexOfKey < 0) {
            return false;
        }
        Object obj = this.mValues[indexOfKey];
        if (obj != e5 && (e5 == null || !e5.equals(obj))) {
            return false;
        }
        this.mValues[indexOfKey] = e6;
        return true;
    }

    public void setValueAt(int i5, E e5) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i5] = e5;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i5));
            sb.append('=');
            E valueAt = valueAt(i5);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return (E) this.mValues[i5];
    }
}
