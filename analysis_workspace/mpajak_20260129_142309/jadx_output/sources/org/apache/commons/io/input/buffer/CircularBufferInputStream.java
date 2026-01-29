package org.apache.commons.io.input.buffer;

import androidx.appcompat.widget.a;
import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.io.IOUtils;

/* loaded from: classes24.dex */
public class CircularBufferInputStream extends InputStream {
    public final CircularByteBuffer buffer;
    public final int bufferSize;
    private boolean eof;
    public final InputStream in;

    public CircularBufferInputStream(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public CircularBufferInputStream(InputStream inputStream, int i5) {
        if (i5 <= 0) {
            throw new IllegalArgumentException(a.g("Invalid bufferSize: ", i5));
        }
        Objects.requireNonNull(inputStream, "inputStream");
        this.in = inputStream;
        this.buffer = new CircularByteBuffer(i5);
        this.bufferSize = i5;
        this.eof = false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.in.close();
        this.eof = true;
        this.buffer.clear();
    }

    public void fillBuffer() {
        if (this.eof) {
            return;
        }
        int space = this.buffer.getSpace();
        byte[] byteArray = IOUtils.byteArray(space);
        while (space > 0) {
            int read = this.in.read(byteArray, 0, space);
            if (read == -1) {
                this.eof = true;
                return;
            } else if (read > 0) {
                this.buffer.add(byteArray, 0, read);
                space -= read;
            }
        }
    }

    public boolean haveBytes(int i5) {
        if (this.buffer.getCurrentNumberOfBytes() < i5) {
            fillBuffer();
        }
        return this.buffer.hasBytes();
    }

    @Override // java.io.InputStream
    public int read() {
        if (haveBytes(1)) {
            return this.buffer.read() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "targetBuffer");
        if (i5 < 0) {
            throw new IllegalArgumentException("Offset must not be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Length must not be negative");
        }
        if (!haveBytes(i6)) {
            return -1;
        }
        int min = Math.min(i6, this.buffer.getCurrentNumberOfBytes());
        for (int i7 = 0; i7 < min; i7++) {
            bArr[i5 + i7] = this.buffer.read();
        }
        return min;
    }
}
