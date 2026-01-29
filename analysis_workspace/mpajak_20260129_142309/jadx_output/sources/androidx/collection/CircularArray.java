package androidx.collection;

/* loaded from: classes15.dex */
public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    public CircularArray() {
        this(8);
    }

    public CircularArray(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i5 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i5 = Integer.bitCount(i5) != 1 ? Integer.highestOneBit(i5 - 1) << 1 : i5;
        this.mCapacityBitmask = i5 - 1;
        this.mElements = (E[]) new Object[i5];
    }

    private void doubleCapacity() {
        E[] eArr = this.mElements;
        int length = eArr.length;
        int i5 = this.mHead;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i7];
        System.arraycopy(eArr, i5, eArr2, 0, i6);
        System.arraycopy(this.mElements, 0, eArr2, i6, this.mHead);
        this.mElements = eArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i7 - 1;
    }

    public void addFirst(E e5) {
        int i5 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i5;
        this.mElements[i5] = e5;
        if (i5 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(E e5) {
        E[] eArr = this.mElements;
        int i5 = this.mTail;
        eArr[i5] = e5;
        int i6 = this.mCapacityBitmask & (i5 + 1);
        this.mTail = i6;
        if (i6 == this.mHead) {
            doubleCapacity();
        }
    }

    public void clear() {
        removeFromStart(size());
    }

    public E get(int i5) {
        if (i5 < 0 || i5 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i5)];
    }

    public E getFirst() {
        int i5 = this.mHead;
        if (i5 != this.mTail) {
            return this.mElements[i5];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E getLast() {
        int i5 = this.mHead;
        int i6 = this.mTail;
        if (i5 != i6) {
            return this.mElements[(i6 - 1) & this.mCapacityBitmask];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return this.mHead == this.mTail;
    }

    public E popFirst() {
        int i5 = this.mHead;
        if (i5 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.mElements;
        E e5 = eArr[i5];
        eArr[i5] = null;
        this.mHead = (i5 + 1) & this.mCapacityBitmask;
        return e5;
    }

    public E popLast() {
        int i5 = this.mHead;
        int i6 = this.mTail;
        if (i5 == i6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.mCapacityBitmask & (i6 - 1);
        E[] eArr = this.mElements;
        E e5 = eArr[i7];
        eArr[i7] = null;
        this.mTail = i7;
        return e5;
    }

    public void removeFromEnd(int i5) {
        int i6;
        if (i5 <= 0) {
            return;
        }
        if (i5 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.mTail;
        int i8 = i5 < i7 ? i7 - i5 : 0;
        int i9 = i8;
        while (true) {
            i6 = this.mTail;
            if (i9 >= i6) {
                break;
            }
            this.mElements[i9] = null;
            i9++;
        }
        int i10 = i6 - i8;
        int i11 = i5 - i10;
        this.mTail = i6 - i10;
        if (i11 > 0) {
            int length = this.mElements.length;
            this.mTail = length;
            int i12 = length - i11;
            for (int i13 = i12; i13 < this.mTail; i13++) {
                this.mElements[i13] = null;
            }
            this.mTail = i12;
        }
    }

    public void removeFromStart(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.mElements.length;
        int i6 = this.mHead;
        if (i5 < length - i6) {
            length = i6 + i5;
        }
        while (i6 < length) {
            this.mElements[i6] = null;
            i6++;
        }
        int i7 = this.mHead;
        int i8 = length - i7;
        int i9 = i5 - i8;
        this.mHead = this.mCapacityBitmask & (i7 + i8);
        if (i9 > 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                this.mElements[i10] = null;
            }
            this.mHead = i9;
        }
    }

    public int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }
}
