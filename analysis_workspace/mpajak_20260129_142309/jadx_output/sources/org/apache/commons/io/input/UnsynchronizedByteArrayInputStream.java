package org.apache.commons.io.input;

import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes15.dex */
public class UnsynchronizedByteArrayInputStream extends InputStream {
    public static final int END_OF_STREAM = -1;
    private final byte[] data;
    private final int eod;
    private int markedOffset;
    private int offset;

    public UnsynchronizedByteArrayInputStream(byte[] bArr) {
        Objects.requireNonNull(bArr, "data");
        this.data = bArr;
        this.offset = 0;
        this.eod = bArr.length;
        this.markedOffset = 0;
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i5) {
        Objects.requireNonNull(bArr, "data");
        if (i5 < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        }
        this.data = bArr;
        int min = Math.min(i5, bArr.length > 0 ? bArr.length : i5);
        this.offset = min;
        this.eod = bArr.length;
        this.markedOffset = min;
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("length cannot be negative");
        }
        Objects.requireNonNull(bArr, "data");
        this.data = bArr;
        int min = Math.min(i5, bArr.length > 0 ? bArr.length : i5);
        this.offset = min;
        this.eod = Math.min(min + i6, bArr.length);
        this.markedOffset = this.offset;
    }

    @Override // java.io.InputStream
    public int available() {
        int i5 = this.offset;
        int i6 = this.eod;
        if (i5 < i6) {
            return i6 - i5;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        this.markedOffset = this.offset;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i5 = this.offset;
        if (i5 >= this.eod) {
            return -1;
        }
        byte[] bArr = this.data;
        this.offset = i5 + 1;
        return bArr[i5] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "dest");
        if (i5 < 0 || i6 < 0 || i5 + i6 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i7 = this.offset;
        int i8 = this.eod;
        if (i7 >= i8) {
            return -1;
        }
        int i9 = i8 - i7;
        if (i6 >= i9) {
            i6 = i9;
        }
        if (i6 <= 0) {
            return 0;
        }
        System.arraycopy(this.data, i7, bArr, i5, i6);
        this.offset += i6;
        return i6;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.offset = this.markedOffset;
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i5 = this.eod;
        int i6 = this.offset;
        long j6 = i5 - i6;
        if (j5 >= j6) {
            j5 = j6;
        }
        this.offset = (int) (i6 + j5);
        return j5;
    }
}
