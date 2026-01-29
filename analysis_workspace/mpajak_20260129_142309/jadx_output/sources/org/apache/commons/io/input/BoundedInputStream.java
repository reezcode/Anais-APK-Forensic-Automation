package org.apache.commons.io.input;

import java.io.InputStream;

/* loaded from: classes12.dex */
public class BoundedInputStream extends InputStream {
    private final InputStream in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    public BoundedInputStream(InputStream inputStream, long j5) {
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j5;
        this.in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        long j5 = this.max;
        if (j5 < 0 || this.pos < j5) {
            return this.in.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.propagateClose) {
            this.in.close();
        }
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        this.in.mark(i5);
        this.mark = this.pos;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        long j5 = this.max;
        if (j5 >= 0 && this.pos >= j5) {
            return -1;
        }
        int read = this.in.read();
        this.pos++;
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        long j5 = this.max;
        if (j5 >= 0 && this.pos >= j5) {
            return -1;
        }
        int read = this.in.read(bArr, i5, (int) (j5 >= 0 ? Math.min(i6, j5 - this.pos) : i6));
        if (read == -1) {
            return -1;
        }
        this.pos += read;
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z4) {
        this.propagateClose = z4;
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        long j6 = this.max;
        if (j6 >= 0) {
            j5 = Math.min(j5, j6 - this.pos);
        }
        long skip = this.in.skip(j5);
        this.pos += skip;
        return skip;
    }

    public String toString() {
        return this.in.toString();
    }
}
