package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.DoubleIterator;

/* loaded from: classes22.dex */
final class ArrayDoubleIterator extends DoubleIterator {
    private final double[] array;
    private int index;

    public ArrayDoubleIterator(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.DoubleIterator
    public double nextDouble() {
        try {
            double[] dArr = this.array;
            int i5 = this.index;
            this.index = i5 + 1;
            return dArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.index--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
