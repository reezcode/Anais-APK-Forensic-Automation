package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes15.dex */
public class CloseShieldOutputStream extends ProxyOutputStream {
    @Deprecated
    public CloseShieldOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public static CloseShieldOutputStream wrap(OutputStream outputStream) {
        return new CloseShieldOutputStream(outputStream);
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out = ClosedOutputStream.CLOSED_OUTPUT_STREAM;
    }
}
