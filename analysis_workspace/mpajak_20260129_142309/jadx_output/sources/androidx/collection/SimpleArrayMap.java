package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes7.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";

    @Nullable
    public static Object[] mBaseCache;
    public static int mBaseCacheSize;

    @Nullable
    public static Object[] mTwiceBaseCache;
    public static int mTwiceBaseCacheSize;
    public Object[] mArray;
    public int[] mHashes;
    public int mSize;

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int i5) {
        if (i5 == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i5);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    private void allocArrays(int i5) {
        if (i5 == 8) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr = mTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    mTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr2 = mBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    mBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i5];
        this.mArray = new Object[i5 << 1];
    }

    private static int binarySearchHashes(int[] iArr, int i5, int i6) {
        try {
            return ContainerHelpers.binarySearch(iArr, i5, i6);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i6 = (i5 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                if (mBaseCacheSize < 10) {
                    objArr[0] = mBaseCache;
                    objArr[1] = iArr;
                    for (int i7 = (i5 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    mBaseCache = objArr;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public void clear() {
        int i5 = this.mSize;
        if (i5 > 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(iArr, objArr, i5);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i5) {
        int i6 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i5) {
            Object[] objArr = this.mArray;
            allocArrays(i5);
            if (this.mSize > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i6);
                System.arraycopy(objArr, 0, this.mArray, 0, i6 << 1);
            }
            freeArrays(iArr, objArr, i6);
        }
        if (this.mSize != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.mSize; i5++) {
                try {
                    K keyAt = keyAt(i5);
                    V valueAt = valueAt(i5);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i6 = 0; i6 < this.mSize; i6++) {
                try {
                    K keyAt2 = keyAt(i6);
                    V valueAt2 = valueAt(i6);
                    Object obj3 = map.get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !map.containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!valueAt2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v4) {
        int indexOfKey = indexOfKey(obj);
        return indexOfKey >= 0 ? (V) this.mArray[(indexOfKey << 1) + 1] : v4;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i5 = this.mSize;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            i8 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public int indexOf(Object obj, int i5) {
        int i6 = this.mSize;
        if (i6 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i6, i5);
        if (binarySearchHashes < 0 || obj.equals(this.mArray[binarySearchHashes << 1])) {
            return binarySearchHashes;
        }
        int i7 = binarySearchHashes + 1;
        while (i7 < i6 && this.mHashes[i7] == i5) {
            if (obj.equals(this.mArray[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = binarySearchHashes - 1; i8 >= 0 && this.mHashes[i8] == i5; i8--) {
            if (obj.equals(this.mArray[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public int indexOfKey(@Nullable Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    public int indexOfNull() {
        int i5 = this.mSize;
        if (i5 == 0) {
            return -1;
        }
        int binarySearchHashes = binarySearchHashes(this.mHashes, i5, 0);
        if (binarySearchHashes < 0 || this.mArray[binarySearchHashes << 1] == null) {
            return binarySearchHashes;
        }
        int i6 = binarySearchHashes + 1;
        while (i6 < i5 && this.mHashes[i6] == 0) {
            if (this.mArray[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = binarySearchHashes - 1; i7 >= 0 && this.mHashes[i7] == 0; i7--) {
            if (this.mArray[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    public int indexOfValue(Object obj) {
        int i5 = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public K keyAt(int i5) {
        return (K) this.mArray[i5 << 1];
    }

    @Nullable
    public V put(K k5, V v4) {
        int i5;
        int indexOf;
        int i6 = this.mSize;
        if (k5 == null) {
            indexOf = indexOfNull();
            i5 = 0;
        } else {
            int hashCode = k5.hashCode();
            i5 = hashCode;
            indexOf = indexOf(k5, hashCode);
        }
        if (indexOf >= 0) {
            int i7 = (indexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v5 = (V) objArr[i7];
            objArr[i7] = v4;
            return v5;
        }
        int i8 = ~indexOf;
        int[] iArr = this.mHashes;
        if (i6 >= iArr.length) {
            int i9 = 4;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 >= 4) {
                i9 = 8;
            }
            Object[] objArr2 = this.mArray;
            allocArrays(i9);
            if (i6 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, i6);
        }
        if (i8 < i6) {
            int[] iArr3 = this.mHashes;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.mSize - i8) << 1);
        }
        int i11 = this.mSize;
        if (i6 == i11) {
            int[] iArr4 = this.mHashes;
            if (i8 < iArr4.length) {
                iArr4[i8] = i5;
                Object[] objArr4 = this.mArray;
                int i12 = i8 << 1;
                objArr4[i12] = k5;
                objArr4[i12 + 1] = v4;
                this.mSize = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i5 = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i5);
        if (this.mSize != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                put(simpleArrayMap.keyAt(i6), simpleArrayMap.valueAt(i6));
            }
        } else if (i5 > 0) {
            System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i5);
            System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i5 << 1);
            this.mSize = i5;
        }
    }

    @Nullable
    public V putIfAbsent(K k5, V v4) {
        V v5 = get(k5);
        return v5 == null ? put(k5, v4) : v5;
    }

    @Nullable
    public V remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey < 0) {
            return false;
        }
        V valueAt = valueAt(indexOfKey);
        if (obj2 != valueAt && (obj2 == null || !obj2.equals(valueAt))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public V removeAt(int i5) {
        Object[] objArr = this.mArray;
        int i6 = i5 << 1;
        V v4 = (V) objArr[i6 + 1];
        int i7 = this.mSize;
        int i8 = 0;
        if (i7 <= 1) {
            freeArrays(this.mHashes, objArr, i7);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int i9 = i7 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length <= 8 || i7 >= iArr.length / 3) {
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    int i11 = i9 - i5;
                    System.arraycopy(iArr, i10, iArr, i5, i11);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i6, i11 << 1);
                }
                Object[] objArr3 = this.mArray;
                int i12 = i9 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                allocArrays(i7 > 8 ? i7 + (i7 >> 1) : 8);
                if (i7 != this.mSize) {
                    throw new ConcurrentModificationException();
                }
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i5);
                    System.arraycopy(objArr, 0, this.mArray, 0, i6);
                }
                if (i5 < i9) {
                    int i13 = i5 + 1;
                    int i14 = i9 - i5;
                    System.arraycopy(iArr, i13, this.mHashes, i5, i14);
                    System.arraycopy(objArr, i13 << 1, this.mArray, i6, i14 << 1);
                }
            }
            i8 = i9;
        }
        if (i7 != this.mSize) {
            throw new ConcurrentModificationException();
        }
        this.mSize = i8;
        return v4;
    }

    @Nullable
    public V replace(K k5, V v4) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v4);
        }
        return null;
    }

    public boolean replace(K k5, V v4, V v5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey < 0) {
            return false;
        }
        V valueAt = valueAt(indexOfKey);
        if (valueAt != v4 && (v4 == null || !v4.equals(valueAt))) {
            return false;
        }
        setValueAt(indexOfKey, v5);
        return true;
    }

    public V setValueAt(int i5, V v4) {
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.mArray;
        V v5 = (V) objArr[i6];
        objArr[i6] = v4;
        return v5;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i5);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i5);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i5) {
        return (V) this.mArray[(i5 << 1) + 1];
    }
}
