package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes25.dex */
public class AutoCloseInputStream extends ProxyInputStream {
    public AutoCloseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    public void afterRead(int i5) {
        if (i5 == -1) {
            close();
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in.close();
        ((FilterInputStream) this).in = ClosedInputStream.CLOSED_INPUT_STREAM;
    }

    public void finalize() {
        close();
        super.finalize();
    }
}
