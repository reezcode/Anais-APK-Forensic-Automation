package org.apache.commons.io.output;

import androidx.activity.d;
import androidx.appcompat.view.a;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes18.dex */
public class ClosedWriter extends Writer {
    public static final ClosedWriter CLOSED_WRITER = new ClosedWriter();

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        StringBuilder g5 = d.g("write(");
        g5.append(new String(cArr));
        g5.append(", ");
        g5.append(i5);
        g5.append(", ");
        throw new IOException(a.h(g5, i6, ") failed: stream is closed"));
    }
}
