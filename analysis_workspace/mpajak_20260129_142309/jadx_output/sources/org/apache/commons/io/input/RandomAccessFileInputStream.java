package org.apache.commons.io.input;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;

/* loaded from: classes10.dex */
public class RandomAccessFileInputStream extends InputStream {
    private final boolean closeOnClose;
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, false);
    }

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile, boolean z4) {
        Objects.requireNonNull(randomAccessFile, "file");
        this.randomAccessFile = randomAccessFile;
        this.closeOnClose = z4;
    }

    private void seek(long j5) {
        this.randomAccessFile.seek(j5);
    }

    @Override // java.io.InputStream
    public int available() {
        long availableLong = availableLong();
        if (availableLong > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) availableLong;
    }

    public long availableLong() {
        return this.randomAccessFile.length() - this.randomAccessFile.getFilePointer();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.closeOnClose) {
            this.randomAccessFile.close();
        }
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.randomAccessFile;
    }

    public boolean isCloseOnClose() {
        return this.closeOnClose;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.randomAccessFile.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.randomAccessFile.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        return this.randomAccessFile.read(bArr, i5, i6);
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        if (j5 <= 0) {
            return 0L;
        }
        long filePointer = this.randomAccessFile.getFilePointer();
        long length = this.randomAccessFile.length();
        if (filePointer >= length) {
            return 0L;
        }
        long j6 = j5 + filePointer;
        if (j6 > length) {
            j6 = length - 1;
        }
        if (j6 > 0) {
            seek(j6);
        }
        return this.randomAccessFile.getFilePointer() - filePointer;
    }
}
