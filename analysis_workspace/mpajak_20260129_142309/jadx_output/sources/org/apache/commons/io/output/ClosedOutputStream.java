package org.apache.commons.io.output;

import androidx.activity.d;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class ClosedOutputStream extends OutputStream {
    public static final ClosedOutputStream CLOSED_OUTPUT_STREAM = new ClosedOutputStream();

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        throw new IOException("flush() failed: stream is closed");
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        throw new IOException(d.c("write(", i5, ") failed: stream is closed"));
    }
}
