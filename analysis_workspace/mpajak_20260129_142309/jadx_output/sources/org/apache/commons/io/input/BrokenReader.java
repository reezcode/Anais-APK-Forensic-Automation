package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;

/* loaded from: classes19.dex */
public class BrokenReader extends Reader {
    private final IOException exception;

    public BrokenReader() {
        this(new IOException("Broken reader"));
    }

    public BrokenReader(IOException iOException) {
        this.exception = iOException;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw this.exception;
    }

    @Override // java.io.Reader
    public void mark(int i5) {
        throw this.exception;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        throw this.exception;
    }

    @Override // java.io.Reader
    public boolean ready() {
        throw this.exception;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        throw this.exception;
    }

    @Override // java.io.Reader
    public long skip(long j5) {
        throw this.exception;
    }
}
