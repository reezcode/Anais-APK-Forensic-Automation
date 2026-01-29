package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes9.dex */
public class BrokenWriter extends Writer {
    private final IOException exception;

    public BrokenWriter() {
        this(new IOException("Broken writer"));
    }

    public BrokenWriter(IOException iOException) {
        this.exception = iOException;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw this.exception;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        throw this.exception;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        throw this.exception;
    }
}
