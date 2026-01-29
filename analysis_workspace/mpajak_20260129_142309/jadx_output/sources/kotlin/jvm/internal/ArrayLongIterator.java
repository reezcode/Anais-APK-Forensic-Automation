package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* loaded from: classes11.dex */
final class ArrayLongIterator extends LongIterator {
    private final long[] array;
    private int index;

    public ArrayLongIterator(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        try {
            long[] jArr = this.array;
            int i5 = this.index;
            this.index = i5 + 1;
            return jArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.index--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
