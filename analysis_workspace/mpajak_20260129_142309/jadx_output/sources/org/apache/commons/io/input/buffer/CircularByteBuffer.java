package org.apache.commons.io.input.buffer;

import androidx.activity.d;
import androidx.appcompat.widget.a;
import java.util.Objects;
import org.apache.commons.io.IOUtils;

/* loaded from: classes8.dex */
public class CircularByteBuffer {
    private final byte[] buffer;
    private int currentNumberOfBytes;
    private int endOffset;
    private int startOffset;

    public CircularByteBuffer() {
        this(8192);
    }

    public CircularByteBuffer(int i5) {
        this.buffer = IOUtils.byteArray(i5);
        this.startOffset = 0;
        this.endOffset = 0;
        this.currentNumberOfBytes = 0;
    }

    public void add(byte b5) {
        int i5 = this.currentNumberOfBytes;
        byte[] bArr = this.buffer;
        if (i5 >= bArr.length) {
            throw new IllegalStateException("No space available");
        }
        int i6 = this.endOffset;
        bArr[i6] = b5;
        this.currentNumberOfBytes = i5 + 1;
        int i7 = i6 + 1;
        this.endOffset = i7;
        if (i7 == bArr.length) {
            this.endOffset = 0;
        }
    }

    public void add(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i5 < 0 || i5 >= bArr.length) {
            throw new IllegalArgumentException(a.g("Invalid offset: ", i5));
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(a.g("Invalid length: ", i6));
        }
        if (this.currentNumberOfBytes + i6 > this.buffer.length) {
            throw new IllegalStateException("No space available");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            byte[] bArr2 = this.buffer;
            int i8 = this.endOffset;
            bArr2[i8] = bArr[i5 + i7];
            int i9 = i8 + 1;
            this.endOffset = i9;
            if (i9 == bArr2.length) {
                this.endOffset = 0;
            }
        }
        this.currentNumberOfBytes += i6;
    }

    public void clear() {
        this.startOffset = 0;
        this.endOffset = 0;
        this.currentNumberOfBytes = 0;
    }

    public int getCurrentNumberOfBytes() {
        return this.currentNumberOfBytes;
    }

    public int getSpace() {
        return this.buffer.length - this.currentNumberOfBytes;
    }

    public boolean hasBytes() {
        return this.currentNumberOfBytes > 0;
    }

    public boolean hasSpace() {
        return this.currentNumberOfBytes < this.buffer.length;
    }

    public boolean hasSpace(int i5) {
        return this.currentNumberOfBytes + i5 <= this.buffer.length;
    }

    public boolean peek(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i5 < 0 || i5 >= bArr.length) {
            throw new IllegalArgumentException(a.g("Invalid offset: ", i5));
        }
        if (i6 < 0 || i6 > this.buffer.length) {
            throw new IllegalArgumentException(a.g("Invalid length: ", i6));
        }
        if (i6 < this.currentNumberOfBytes) {
            return false;
        }
        int i7 = this.startOffset;
        for (int i8 = 0; i8 < i6; i8++) {
            byte[] bArr2 = this.buffer;
            if (bArr2[i7] != bArr[i8 + i5]) {
                return false;
            }
            i7++;
            if (i7 == bArr2.length) {
                i7 = 0;
            }
        }
        return true;
    }

    public byte read() {
        int i5 = this.currentNumberOfBytes;
        if (i5 <= 0) {
            throw new IllegalStateException("No bytes available.");
        }
        byte[] bArr = this.buffer;
        int i6 = this.startOffset;
        byte b5 = bArr[i6];
        this.currentNumberOfBytes = i5 - 1;
        int i7 = i6 + 1;
        this.startOffset = i7;
        if (i7 == bArr.length) {
            this.startOffset = 0;
        }
        return b5;
    }

    public void read(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "targetBuffer");
        if (i5 < 0 || i5 >= bArr.length) {
            throw new IllegalArgumentException(a.g("Invalid offset: ", i5));
        }
        if (i6 < 0 || i6 > this.buffer.length) {
            throw new IllegalArgumentException(a.g("Invalid length: ", i6));
        }
        int i7 = i5 + i6;
        if (i7 > bArr.length) {
            StringBuilder g5 = d.g("The supplied byte array contains only ");
            g5.append(bArr.length);
            g5.append(" bytes, but offset, and length would require ");
            g5.append(i7 - 1);
            throw new IllegalArgumentException(g5.toString());
        }
        if (this.currentNumberOfBytes < i6) {
            StringBuilder g6 = d.g("Currently, there are only ");
            g6.append(this.currentNumberOfBytes);
            g6.append("in the buffer, not ");
            g6.append(i6);
            throw new IllegalStateException(g6.toString());
        }
        int i8 = 0;
        while (i8 < i6) {
            int i9 = i5 + 1;
            byte[] bArr2 = this.buffer;
            int i10 = this.startOffset;
            bArr[i5] = bArr2[i10];
            this.currentNumberOfBytes--;
            int i11 = i10 + 1;
            this.startOffset = i11;
            if (i11 == bArr2.length) {
                this.startOffset = 0;
            }
            i8++;
            i5 = i9;
        }
    }
}
