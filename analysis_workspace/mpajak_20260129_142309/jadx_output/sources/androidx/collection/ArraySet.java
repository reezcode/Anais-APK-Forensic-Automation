package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final int[] INT = new int[0];
    private static final Object[] OBJECT = new Object[0];
    private static final String TAG = "ArraySet";

    @Nullable
    private static Object[] sBaseCache;
    private static int sBaseCacheSize;

    @Nullable
    private static Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    public Object[] mArray;
    private MapCollections<E, E> mCollections;
    private int[] mHashes;
    public int mSize;

    public ArraySet() {
        this(0);
    }

    public ArraySet(int i5) {
        if (i5 == 0) {
            this.mHashes = INT;
            this.mArray = OBJECT;
        } else {
            allocArrays(i5);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable ArraySet<E> arraySet) {
        this();
        if (arraySet != 0) {
            addAll((ArraySet) arraySet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    private void allocArrays(int i5) {
        if (i5 == 8) {
            synchronized (ArraySet.class) {
                Object[] objArr = sTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    sTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    sTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (ArraySet.class) {
                Object[] objArr2 = sBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    sBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    sBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i5];
        this.mArray = new Object[i5];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCacheSize < 10) {
                    objArr[0] = sTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i6 = i5 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    sTwiceBaseCache = objArr;
                    sTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCacheSize < 10) {
                    objArr[0] = sBaseCache;
                    objArr[1] = iArr;
                    for (int i7 = i5 - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    sBaseCache = objArr;
                    sBaseCacheSize++;
                }
            }
        }
    }

    private MapCollections<E, E> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<E, E>() { // from class: androidx.collection.ArraySet.1
                @Override // androidx.collection.MapCollections
                public void colClear() {
                    ArraySet.this.clear();
                }

                @Override // androidx.collection.MapCollections
                public Object colGetEntry(int i5, int i6) {
                    return ArraySet.this.mArray[i5];
                }

                @Override // androidx.collection.MapCollections
                public Map<E, E> colGetMap() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // androidx.collection.MapCollections
                public int colGetSize() {
                    return ArraySet.this.mSize;
                }

                @Override // androidx.collection.MapCollections
                public int colIndexOfKey(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                @Override // androidx.collection.MapCollections
                public int colIndexOfValue(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                @Override // androidx.collection.MapCollections
                public void colPut(E e5, E e6) {
                    ArraySet.this.add(e5);
                }

                @Override // androidx.collection.MapCollections
                public void colRemoveAt(int i5) {
                    ArraySet.this.removeAt(i5);
                }

                @Override // androidx.collection.MapCollections
                public E colSetValue(int i5, E e5) {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        return this.mCollections;
    }

    private int indexOf(Object obj, int i5) {
        int i6 = this.mSize;
        if (i6 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i6, i5);
        if (binarySearch < 0 || obj.equals(this.mArray[binarySearch])) {
            return binarySearch;
        }
        int i7 = binarySearch + 1;
        while (i7 < i6 && this.mHashes[i7] == i5) {
            if (obj.equals(this.mArray[i7])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = binarySearch - 1; i8 >= 0 && this.mHashes[i8] == i5; i8--) {
            if (obj.equals(this.mArray[i8])) {
                return i8;
            }
        }
        return ~i7;
    }

    private int indexOfNull() {
        int i5 = this.mSize;
        if (i5 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i5, 0);
        if (binarySearch < 0 || this.mArray[binarySearch] == null) {
            return binarySearch;
        }
        int i6 = binarySearch + 1;
        while (i6 < i5 && this.mHashes[i6] == 0) {
            if (this.mArray[i6] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = binarySearch - 1; i7 >= 0 && this.mHashes[i7] == 0; i7--) {
            if (this.mArray[i7] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e5) {
        int i5;
        int indexOf;
        if (e5 == null) {
            indexOf = indexOfNull();
            i5 = 0;
        } else {
            int hashCode = e5.hashCode();
            i5 = hashCode;
            indexOf = indexOf(e5, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i6 = ~indexOf;
        int i7 = this.mSize;
        int[] iArr = this.mHashes;
        if (i7 >= iArr.length) {
            int i8 = 4;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 >= 4) {
                i8 = 8;
            }
            Object[] objArr = this.mArray;
            allocArrays(i8);
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
        int i9 = this.mSize;
        if (i6 < i9) {
            int[] iArr3 = this.mHashes;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.mArray;
            System.arraycopy(objArr2, i6, objArr2, i10, this.mSize - i6);
        }
        this.mHashes[i6] = i5;
        this.mArray[i6] = e5;
        this.mSize++;
        return true;
    }

    public void addAll(@NonNull ArraySet<? extends E> arraySet) {
        int i5 = arraySet.mSize;
        ensureCapacity(this.mSize + i5);
        if (this.mSize != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                add(arraySet.valueAt(i6));
            }
        } else if (i5 > 0) {
            System.arraycopy(arraySet.mHashes, 0, this.mHashes, 0, i5);
            System.arraycopy(arraySet.mArray, 0, this.mArray, 0, i5);
            this.mSize = i5;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        ensureCapacity(collection.size() + this.mSize);
        Iterator<? extends E> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i5 = this.mSize;
        if (i5 != 0) {
            freeArrays(this.mHashes, this.mArray, i5);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void ensureCapacity(int i5) {
        int[] iArr = this.mHashes;
        if (iArr.length < i5) {
            Object[] objArr = this.mArray;
            allocArrays(i5);
            int i6 = this.mSize;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i6);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.mSize; i5++) {
                try {
                    if (!set.contains(valueAt(i5))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.mHashes;
        int i5 = this.mSize;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return getCollection().getKeySet().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public boolean removeAll(@NonNull ArraySet<? extends E> arraySet) {
        int i5 = arraySet.mSize;
        int i6 = this.mSize;
        for (int i7 = 0; i7 < i5; i7++) {
            remove(arraySet.valueAt(i7));
        }
        return i6 != this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    public E removeAt(int i5) {
        Object[] objArr = this.mArray;
        E e5 = (E) objArr[i5];
        int i6 = this.mSize;
        if (i6 <= 1) {
            freeArrays(this.mHashes, objArr, i6);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                int i7 = i6 - 1;
                this.mSize = i7;
                if (i5 < i7) {
                    int i8 = i5 + 1;
                    System.arraycopy(iArr, i8, iArr, i5, i7 - i5);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i8, objArr2, i5, this.mSize - i5);
                }
                this.mArray[this.mSize] = null;
            } else {
                allocArrays(i6 > 8 ? i6 + (i6 >> 1) : 8);
                this.mSize--;
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i5);
                    System.arraycopy(objArr, 0, this.mArray, 0, i5);
                }
                int i9 = this.mSize;
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    System.arraycopy(iArr, i10, this.mHashes, i5, i9 - i5);
                    System.arraycopy(objArr, i10, this.mArray, i5, this.mSize - i5);
                }
            }
        }
        return e5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z4 = false;
        for (int i5 = this.mSize - 1; i5 >= 0; i5--) {
            if (!collection.contains(this.mArray[i5])) {
                removeAt(i5);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i5 = this.mSize;
        Object[] objArr = new Object[i5];
        System.arraycopy(this.mArray, 0, objArr, 0, i5);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.mSize) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.mSize));
        }
        System.arraycopy(this.mArray, 0, tArr, 0, this.mSize);
        int length = tArr.length;
        int i5 = this.mSize;
        if (length > i5) {
            tArr[i5] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 14);
        sb.append('{');
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i5);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Nullable
    public E valueAt(int i5) {
        return (E) this.mArray[i5];
    }
}
