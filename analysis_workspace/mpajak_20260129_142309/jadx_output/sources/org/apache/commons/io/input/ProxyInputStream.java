package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

/* loaded from: classes2.dex */
public abstract class ProxyInputStream extends FilterInputStream {
    public ProxyInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public void afterRead(int i5) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        try {
            return super.available();
        } catch (IOException e5) {
            handleIOException(e5);
            return 0;
        }
    }

    public void beforeRead(int i5) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterInputStream) this).in, new androidx.constraintlayout.core.state.c(this));
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i5 = 1;
        try {
            beforeRead(1);
            int read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                i5 = -1;
            }
            afterRead(i5);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        try {
            beforeRead(IOUtils.length(bArr));
            int read = ((FilterInputStream) this).in.read(bArr);
            afterRead(read);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        try {
            beforeRead(i6);
            int read = ((FilterInputStream) this).in.read(bArr, i5, i6);
            afterRead(read);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) {
        try {
            return ((FilterInputStream) this).in.skip(j5);
        } catch (IOException e5) {
            handleIOException(e5);
            return 0L;
        }
    }
}
