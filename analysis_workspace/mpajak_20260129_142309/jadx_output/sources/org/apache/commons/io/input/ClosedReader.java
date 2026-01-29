package org.apache.commons.io.input;

import java.io.Reader;

/* loaded from: classes17.dex */
public class ClosedReader extends Reader {
    public static final ClosedReader CLOSED_READER = new ClosedReader();

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        return -1;
    }
}
