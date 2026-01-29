package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public class SparseArrayCompat<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i5) {
        this.mGarbage = false;
        if (i5 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i5);
            this.mKeys = new int[idealIntArraySize];
            this.mValues = new Object[idealIntArraySize];
        }
    }

    private void gc() {
        int i5 = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != DELETED) {
                if (i7 != i6) {
                    iArr[i6] = iArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.mGarbage = false;
        this.mSize = i6;
    }

    public void append(int i5, E e5) {
        int i6 = this.mSize;
        if (i6 != 0 && i5 <= this.mKeys[i6 - 1]) {
            put(i5, e5);
            return;
        }
        if (this.mGarbage && i6 >= this.mKeys.length) {
            gc();
        }
        int i7 = this.mSize;
        if (i7 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i7 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i7] = i5;
        this.mValues[i7] = e5;
        this.mSize = i7 + 1;
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
    public SparseArrayCompat<E> m2clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public boolean containsKey(int i5) {
        return indexOfKey(i5) >= 0;
    }

    public boolean containsValue(E e5) {
        return indexOfValue(e5) >= 0;
    }

    @Deprecated
    public void delete(int i5) {
        remove(i5);
    }

    @Nullable
    public E get(int i5) {
        return get(i5, null);
    }

    public E get(int i5, E e5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        if (binarySearch >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[binarySearch] != DELETED) {
                return (E) objArr[binarySearch];
            }
        }
        return e5;
    }

    public int indexOfKey(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
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

    public int keyAt(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i5];
    }

    public void put(int i5, E e5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e5;
            return;
        }
        int i6 = ~binarySearch;
        int i7 = this.mSize;
        if (i6 < i7) {
            Object[] objArr = this.mValues;
            if (objArr[i6] == DELETED) {
                this.mKeys[i6] = i5;
                objArr[i6] = e5;
                return;
            }
        }
        if (this.mGarbage && i7 >= this.mKeys.length) {
            gc();
            i6 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        }
        int i8 = this.mSize;
        if (i8 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i8 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr2 = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i9 = this.mSize;
        if (i9 - i6 != 0) {
            int[] iArr3 = this.mKeys;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i6, objArr4, i10, this.mSize - i6);
        }
        this.mKeys[i6] = i5;
        this.mValues[i6] = e5;
        this.mSize++;
    }

    public void putAll(@NonNull SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i5 = 0; i5 < size; i5++) {
            put(sparseArrayCompat.keyAt(i5), sparseArrayCompat.valueAt(i5));
        }
    }

    @Nullable
    public E putIfAbsent(int i5, E e5) {
        E e6 = get(i5);
        if (e6 == null) {
            put(i5, e5);
        }
        return e6;
    }

    public void remove(int i5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
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

    public boolean remove(int i5, Object obj) {
        int indexOfKey = indexOfKey(i5);
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

    public void removeAtRange(int i5, int i6) {
        int min = Math.min(this.mSize, i6 + i5);
        while (i5 < min) {
            removeAt(i5);
            i5++;
        }
    }

    @Nullable
    public E replace(int i5, E e5) {
        int indexOfKey = indexOfKey(i5);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.mValues;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e5;
        return e6;
    }

    public boolean replace(int i5, E e5, E e6) {
        int indexOfKey = indexOfKey(i5);
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
