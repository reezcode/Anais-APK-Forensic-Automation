package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes23.dex */
public class ChunkedOutputStream extends FilterOutputStream {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedOutputStream(OutputStream outputStream) {
        this(outputStream, 4096);
    }

    public ChunkedOutputStream(OutputStream outputStream, int i5) {
        super(outputStream);
        if (i5 <= 0) {
            throw new IllegalArgumentException();
        }
        this.chunkSize = i5;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        while (i6 > 0) {
            int min = Math.min(i6, this.chunkSize);
            ((FilterOutputStream) this).out.write(bArr, i5, min);
            i6 -= min;
            i5 += min;
        }
    }
}
