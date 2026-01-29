package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.ByteIterator;

/* loaded from: classes15.dex */
final class ArrayByteIterator extends ByteIterator {
    private final byte[] array;
    private int index;

    public ArrayByteIterator(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.array;
            int i5 = this.index;
            this.index = i5 + 1;
            return bArr[i5];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.index--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }
}
