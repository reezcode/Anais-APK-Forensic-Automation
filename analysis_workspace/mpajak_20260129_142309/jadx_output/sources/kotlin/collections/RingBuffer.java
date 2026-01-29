package kotlin.collections;

import androidx.appcompat.widget.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
final class RingBuffer<T> extends AbstractList<T> implements RandomAccess {
    private final Object[] buffer;
    private final int capacity;
    private int size;
    private int startIndex;

    public RingBuffer(int i5) {
        this(new Object[i5], 0);
    }

    public RingBuffer(Object[] buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(a.g("ring buffer filled size should not be negative but it is ", i5).toString());
        }
        if (i5 <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i5;
        } else {
            StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("ring buffer filled size: ", i5, " cannot be larger than the buffer size: ");
            e5.append(buffer.length);
            throw new IllegalArgumentException(e5.toString().toString());
        }
    }

    private final int forward(int i5, int i6) {
        return (i5 + i6) % this.capacity;
    }

    @Override // java.util.Collection, java.util.List
    public final void add(T t4) {
        if (isFull()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(size() + this.startIndex) % this.capacity] = t4;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RingBuffer<T> expanded(int i5) {
        Object[] array;
        int i6 = this.capacity;
        int coerceAtMost = RangesKt.coerceAtMost(i6 + (i6 >> 1) + 1, i5);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer<>(array, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i5) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i5, size());
        return (T) this.buffer[(this.startIndex + i5) % this.capacity];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public final boolean isFull() {
        return size() == this.capacity;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer$iterator$1
            private int count;
            private int index;
            public final /* synthetic */ RingBuffer<T> this$0;

            {
                int i5;
                this.this$0 = this;
                this.count = this.size();
                i5 = ((RingBuffer) this).startIndex;
                this.index = i5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                if (this.count == 0) {
                    done();
                    return;
                }
                objArr = ((RingBuffer) this.this$0).buffer;
                setNext(objArr[this.index]);
                this.index = (this.index + 1) % ((RingBuffer) this.this$0).capacity;
                this.count--;
            }
        };
    }

    public final void removeFirst(int i5) {
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(a.g("n shouldn't be negative but it is ", i5).toString());
        }
        if (!(i5 <= size())) {
            StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("n shouldn't be greater than the buffer size: n = ", i5, ", size = ");
            e5.append(size());
            throw new IllegalArgumentException(e5.toString().toString());
        }
        if (i5 > 0) {
            int i6 = this.startIndex;
            int i7 = (i6 + i5) % this.capacity;
            if (i6 > i7) {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i6, this.capacity);
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, 0, i7);
            } else {
                ArraysKt___ArraysJvmKt.fill(this.buffer, (Object) null, i6, i7);
            }
            this.startIndex = i7;
            this.size = size() - i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = this.startIndex; i6 < size && i7 < this.capacity; i7++) {
            array[i6] = this.buffer[i7];
            i6++;
        }
        while (i6 < size) {
            array[i6] = this.buffer[i5];
            i6++;
            i5++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
