package org.apache.commons.io.output;

import java.io.OutputStream;

/* loaded from: classes10.dex */
public class NullOutputStream extends OutputStream {
    public static final NullOutputStream NULL_OUTPUT_STREAM = new NullOutputStream();

    @Deprecated
    public NullOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
    }
}
