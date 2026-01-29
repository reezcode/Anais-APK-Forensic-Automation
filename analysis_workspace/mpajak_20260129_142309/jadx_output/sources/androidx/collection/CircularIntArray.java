package androidx.collection;

/* loaded from: classes3.dex */
public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    public CircularIntArray() {
        this(8);
    }

    public CircularIntArray(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i5 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i5 = Integer.bitCount(i5) != 1 ? Integer.highestOneBit(i5 - 1) << 1 : i5;
        this.mCapacityBitmask = i5 - 1;
        this.mElements = new int[i5];
    }

    private void doubleCapacity() {
        int[] iArr = this.mElements;
        int length = iArr.length;
        int i5 = this.mHead;
        int i6 = length - i5;
        int i7 = length << 1;
        if (i7 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i7];
        System.arraycopy(iArr, i5, iArr2, 0, i6);
        System.arraycopy(this.mElements, 0, iArr2, i6, this.mHead);
        this.mElements = iArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i7 - 1;
    }

    public void addFirst(int i5) {
        int i6 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i6;
        this.mElements[i6] = i5;
        if (i6 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(int i5) {
        int[] iArr = this.mElements;
        int i6 = this.mTail;
        iArr[i6] = i5;
        int i7 = this.mCapacityBitmask & (i6 + 1);
        this.mTail = i7;
        if (i7 == this.mHead) {
            doubleCapacity();
        }
    }

    public void clear() {
        this.mTail = this.mHead;
    }

    public int get(int i5) {
        if (i5 < 0 || i5 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i5)];
    }

    public int getFirst() {
        int i5 = this.mHead;
        if (i5 != this.mTail) {
            return this.mElements[i5];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getLast() {
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

    public int popFirst() {
        int i5 = this.mHead;
        if (i5 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.mElements[i5];
        this.mHead = (i5 + 1) & this.mCapacityBitmask;
        return i6;
    }

    public int popLast() {
        int i5 = this.mHead;
        int i6 = this.mTail;
        if (i5 == i6) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = this.mCapacityBitmask & (i6 - 1);
        int i8 = this.mElements[i7];
        this.mTail = i7;
        return i8;
    }

    public void removeFromEnd(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mTail = this.mCapacityBitmask & (this.mTail - i5);
    }

    public void removeFromStart(int i5) {
        if (i5 <= 0) {
            return;
        }
        if (i5 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mHead = this.mCapacityBitmask & (this.mHead + i5);
    }

    public int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }
}
