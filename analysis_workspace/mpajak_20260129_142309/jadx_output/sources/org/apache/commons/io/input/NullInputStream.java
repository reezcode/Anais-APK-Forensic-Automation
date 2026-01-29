package org.apache.commons.io.input;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class NullInputStream extends InputStream {
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readlimit;
    private final long size;
    private final boolean throwEofException;

    public NullInputStream() {
        this(0L, true, false);
    }

    public NullInputStream(long j5) {
        this(j5, true, false);
    }

    public NullInputStream(long j5, boolean z4, boolean z5) {
        this.mark = -1L;
        this.size = j5;
        this.markSupported = z4;
        this.throwEofException = z5;
    }

    private int doEndOfFile() {
        this.eof = true;
        if (this.throwEofException) {
            throw new EOFException();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int available() {
        long j5 = this.size - this.position;
        if (j5 <= 0) {
            return 0;
        }
        if (j5 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j5;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.eof = false;
        this.position = 0L;
        this.mark = -1L;
    }

    public long getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        if (!this.markSupported) {
            throw UnsupportedOperationExceptions.mark();
        }
        this.mark = this.position;
        this.readlimit = i5;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.markSupported;
    }

    public int processByte() {
        return 0;
    }

    public void processBytes(byte[] bArr, int i5, int i6) {
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.eof) {
            throw new IOException("Read after end of file");
        }
        long j5 = this.position;
        if (j5 == this.size) {
            return doEndOfFile();
        }
        this.position = j5 + 1;
        return processByte();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        if (this.eof) {
            throw new IOException("Read after end of file");
        }
        long j5 = this.position;
        long j6 = this.size;
        if (j5 == j6) {
            return doEndOfFile();
        }
        long j7 = j5 + i6;
        this.position = j7;
        if (j7 > j6) {
            i6 -= (int) (j7 - j6);
            this.position = j6;
        }
        processBytes(bArr, i5, i6);
        return i6;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        if (!this.markSupported) {
            throw UnsupportedOperationExceptions.reset();
        }
        long j5 = this.mark;
        if (j5 < 0) {
            throw new IOException("No position has been marked");
        }
        if (this.position > this.readlimit + j5) {
            throw new IOException("Marked position [" + this.mark + "] is no longer valid - passed the read limit [" + this.readlimit + "]");
        }
        this.position = j5;
        this.eof = false;
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        if (this.eof) {
            throw new IOException("Skip after end of file");
        }
        long j6 = this.position;
        long j7 = this.size;
        if (j6 == j7) {
            return doEndOfFile();
        }
        long j8 = j6 + j5;
        this.position = j8;
        if (j8 <= j7) {
            return j5;
        }
        long j9 = j5 - (j8 - j7);
        this.position = j7;
        return j9;
    }
}
