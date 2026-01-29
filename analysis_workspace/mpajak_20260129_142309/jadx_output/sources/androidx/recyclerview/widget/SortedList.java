package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes18.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    public T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    /* loaded from: classes14.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        public final Callback<T2> mWrappedCallback;

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areContentsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areItemsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.mWrappedCallback.compare(t22, t23);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return this.mWrappedCallback.getChangePayload(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i5, int i6) {
            this.mBatchingListUpdateCallback.onChanged(i5, i6, null);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i5, int i6, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i5, i6, obj);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i5, int i6) {
            this.mBatchingListUpdateCallback.onInserted(i5, i6);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i5, int i6) {
            this.mBatchingListUpdateCallback.onMoved(i5, i6);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i5, int i6) {
            this.mBatchingListUpdateCallback.onRemoved(i5, i6);
        }
    }

    /* loaded from: classes11.dex */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t22, T2 t23);

        public abstract boolean areItemsTheSame(T2 t22, T2 t23);

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return null;
        }

        public abstract void onChanged(int i5, int i6);

        public void onChanged(int i5, int i6, Object obj) {
            onChanged(i5, i6);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i5) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i5));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t4, boolean z4) {
        int findIndexOf = findIndexOf(t4, this.mData, 0, this.mSize, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            T t5 = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(t5, t4)) {
                if (this.mCallback.areContentsTheSame(t5, t4)) {
                    this.mData[findIndexOf] = t4;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t4;
                Callback callback = this.mCallback;
                callback.onChanged(findIndexOf, 1, callback.getChangePayload(t5, t4));
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t4);
        if (z4) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int sortAndDedup = sortAndDedup(tArr);
        if (this.mSize != 0) {
            merge(tArr, sortAndDedup);
            return;
        }
        this.mData = tArr;
        this.mSize = sortAndDedup;
        this.mCallback.onInserted(0, sortAndDedup);
    }

    private void addToData(int i5, T t4) {
        int i6 = this.mSize;
        if (i5 > i6) {
            StringBuilder e5 = a.e("cannot add item to ", i5, " because size is ");
            e5.append(this.mSize);
            throw new IndexOutOfBoundsException(e5.toString());
        }
        T[] tArr = this.mData;
        if (i6 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
            System.arraycopy(this.mData, 0, tArr2, 0, i5);
            tArr2[i5] = t4;
            System.arraycopy(this.mData, i5, tArr2, i5 + 1, this.mSize - i5);
            this.mData = tArr2;
        } else {
            System.arraycopy(tArr, i5, tArr, i5 + 1, i6 - i5);
            this.mData[i5] = t4;
        }
        this.mSize++;
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t4, T[] tArr, int i5, int i6, int i7) {
        while (i5 < i6) {
            int i8 = (i5 + i6) / 2;
            T t5 = tArr[i8];
            int compare = this.mCallback.compare(t5, t4);
            if (compare < 0) {
                i5 = i8 + 1;
            } else {
                if (compare == 0) {
                    if (this.mCallback.areItemsTheSame(t5, t4)) {
                        return i8;
                    }
                    int linearEqualitySearch = linearEqualitySearch(t4, i8, i5, i6);
                    return (i7 == 1 && linearEqualitySearch == -1) ? i8 : linearEqualitySearch;
                }
                i6 = i8;
            }
        }
        if (i7 == 1) {
            return i5;
        }
        return -1;
    }

    private int findSameItem(T t4, T[] tArr, int i5, int i6) {
        while (i5 < i6) {
            if (this.mCallback.areItemsTheSame(tArr[i5], t4)) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t4, int i5, int i6, int i7) {
        T t5;
        for (int i8 = i5 - 1; i8 >= i6; i8--) {
            T t6 = this.mData[i8];
            if (this.mCallback.compare(t6, t4) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t6, t4)) {
                return i8;
            }
        }
        do {
            i5++;
            if (i5 >= i7) {
                return -1;
            }
            t5 = this.mData[i5];
            if (this.mCallback.compare(t5, t4) != 0) {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t5, t4));
        return i5;
    }

    private void merge(T[] tArr, int i5) {
        boolean z4 = !(this.mCallback instanceof BatchedCallback);
        if (z4) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i6 = 0;
        this.mOldDataStart = 0;
        int i7 = this.mSize;
        this.mOldDataSize = i7;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i7 + i5 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i8 = this.mOldDataStart;
            int i9 = this.mOldDataSize;
            if (i8 >= i9 && i6 >= i5) {
                break;
            }
            if (i8 == i9) {
                int i10 = i5 - i6;
                System.arraycopy(tArr, i6, this.mData, this.mNewDataStart, i10);
                int i11 = this.mNewDataStart + i10;
                this.mNewDataStart = i11;
                this.mSize += i10;
                this.mCallback.onInserted(i11 - i10, i10);
                break;
            }
            if (i6 == i5) {
                int i12 = i9 - i8;
                System.arraycopy(this.mOldData, i8, this.mData, this.mNewDataStart, i12);
                this.mNewDataStart += i12;
                break;
            }
            T t4 = this.mOldData[i8];
            T t5 = tArr[i6];
            int compare = this.mCallback.compare(t4, t5);
            if (compare > 0) {
                T[] tArr2 = this.mData;
                int i13 = this.mNewDataStart;
                int i14 = i13 + 1;
                this.mNewDataStart = i14;
                tArr2[i13] = t5;
                this.mSize++;
                i6++;
                this.mCallback.onInserted(i14 - 1, 1);
            } else if (compare == 0 && this.mCallback.areItemsTheSame(t4, t5)) {
                T[] tArr3 = this.mData;
                int i15 = this.mNewDataStart;
                this.mNewDataStart = i15 + 1;
                tArr3[i15] = t5;
                i6++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t4, t5)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t4, t5));
                }
            } else {
                T[] tArr4 = this.mData;
                int i16 = this.mNewDataStart;
                this.mNewDataStart = i16 + 1;
                tArr4[i16] = t4;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z4) {
            endBatchedUpdates();
        }
    }

    private boolean remove(T t4, boolean z4) {
        int findIndexOf = findIndexOf(t4, this.mData, 0, this.mSize, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z4);
        return true;
    }

    private void removeItemAtIndex(int i5, boolean z4) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i5 + 1, tArr, i5, (this.mSize - i5) - 1);
        int i6 = this.mSize - 1;
        this.mSize = i6;
        this.mData[i6] = null;
        if (z4) {
            this.mCallback.onRemoved(i5, 1);
        }
    }

    private void replaceAllInsert(T t4) {
        T[] tArr = this.mData;
        int i5 = this.mNewDataStart;
        tArr[i5] = t4;
        int i6 = i5 + 1;
        this.mNewDataStart = i6;
        this.mSize++;
        this.mCallback.onInserted(i6 - 1, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z4 = !(this.mCallback instanceof BatchedCallback);
        if (z4) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int sortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, sortAndDedup));
        while (true) {
            int i5 = this.mNewDataStart;
            if (i5 >= sortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i6 = this.mOldDataStart;
            int i7 = this.mOldDataSize;
            if (i6 >= i7) {
                int i8 = sortAndDedup - i5;
                System.arraycopy(tArr, i5, this.mData, i5, i8);
                this.mNewDataStart += i8;
                this.mSize += i8;
                this.mCallback.onInserted(i5, i8);
                break;
            }
            if (i5 >= sortAndDedup) {
                int i9 = i7 - i6;
                this.mSize -= i9;
                this.mCallback.onRemoved(i5, i9);
                break;
            }
            T t4 = this.mOldData[i6];
            T t5 = tArr[i5];
            int compare = this.mCallback.compare(t4, t5);
            if (compare < 0) {
                replaceAllRemove();
            } else {
                if (compare <= 0) {
                    if (this.mCallback.areItemsTheSame(t4, t5)) {
                        T[] tArr2 = this.mData;
                        int i10 = this.mNewDataStart;
                        tArr2[i10] = t5;
                        this.mOldDataStart++;
                        this.mNewDataStart = i10 + 1;
                        if (!this.mCallback.areContentsTheSame(t4, t5)) {
                            Callback callback = this.mCallback;
                            callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t4, t5));
                        }
                    } else {
                        replaceAllRemove();
                    }
                }
                replaceAllInsert(t5);
            }
        }
        this.mOldData = null;
        if (z4) {
            endBatchedUpdates();
        }
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i5 = 1;
        int i6 = 0;
        for (int i7 = 1; i7 < tArr.length; i7++) {
            T t4 = tArr[i7];
            if (this.mCallback.compare(tArr[i6], t4) == 0) {
                int findSameItem = findSameItem(t4, tArr, i6, i5);
                if (findSameItem != -1) {
                    tArr[findSameItem] = t4;
                } else {
                    if (i5 != i7) {
                        tArr[i5] = t4;
                    }
                    i5++;
                }
            } else {
                if (i5 != i7) {
                    tArr[i5] = t4;
                }
                i6 = i5;
                i5++;
            }
        }
        return i5;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t4) {
        throwIfInMutationOperation();
        return add(t4, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    public void addAll(@NonNull T[] tArr, boolean z4) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z4) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i5 = this.mSize;
        if (i5 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i5, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i5);
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    public T get(int i5) {
        int i6;
        if (i5 < this.mSize && i5 >= 0) {
            T[] tArr = this.mOldData;
            return (tArr == null || i5 < (i6 = this.mNewDataStart)) ? this.mData[i5] : tArr[(i5 - i6) + this.mOldDataStart];
        }
        StringBuilder e5 = a.e("Asked to get item at ", i5, " but size is ");
        e5.append(this.mSize);
        throw new IndexOutOfBoundsException(e5.toString());
    }

    public int indexOf(T t4) {
        if (this.mOldData == null) {
            return findIndexOf(t4, this.mData, 0, this.mSize, 4);
        }
        int findIndexOf = findIndexOf(t4, this.mData, 0, this.mNewDataStart, 4);
        if (findIndexOf != -1) {
            return findIndexOf;
        }
        int findIndexOf2 = findIndexOf(t4, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
        if (findIndexOf2 != -1) {
            return (findIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i5) {
        throwIfInMutationOperation();
        T t4 = get(i5);
        removeItemAtIndex(i5, false);
        int add = add(t4, false);
        if (i5 != add) {
            this.mCallback.onMoved(i5, add);
        }
    }

    public boolean remove(T t4) {
        throwIfInMutationOperation();
        return remove(t4, true);
    }

    public T removeItemAt(int i5) {
        throwIfInMutationOperation();
        T t4 = get(i5);
        removeItemAtIndex(i5, true);
        return t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void replaceAll(@NonNull T[] tArr, boolean z4) {
        throwIfInMutationOperation();
        if (z4) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i5, T t4) {
        throwIfInMutationOperation();
        T t5 = get(i5);
        boolean z4 = t5 == t4 || !this.mCallback.areContentsTheSame(t5, t4);
        if (t5 != t4 && this.mCallback.compare(t5, t4) == 0) {
            this.mData[i5] = t4;
            if (z4) {
                Callback callback = this.mCallback;
                callback.onChanged(i5, 1, callback.getChangePayload(t5, t4));
                return;
            }
            return;
        }
        if (z4) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i5, 1, callback2.getChangePayload(t5, t4));
        }
        removeItemAtIndex(i5, false);
        int add = add(t4, false);
        if (i5 != add) {
            this.mCallback.onMoved(i5, add);
        }
    }
}
