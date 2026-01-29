package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes11.dex */
public class BrokenOutputStream extends OutputStream {
    private final IOException exception;

    public BrokenOutputStream() {
        this(new IOException("Broken output stream"));
    }

    public BrokenOutputStream(IOException iOException) {
        this.exception = iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw this.exception;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        throw this.exception;
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        throw this.exception;
    }
}
