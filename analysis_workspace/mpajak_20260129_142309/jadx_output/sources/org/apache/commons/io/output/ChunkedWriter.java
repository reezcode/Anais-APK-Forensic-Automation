package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.Writer;

/* loaded from: classes13.dex */
public class ChunkedWriter extends FilterWriter {
    private static final int DEFAULT_CHUNK_SIZE = 4096;
    private final int chunkSize;

    public ChunkedWriter(Writer writer) {
        this(writer, 4096);
    }

    public ChunkedWriter(Writer writer, int i5) {
        super(writer);
        if (i5 <= 0) {
            throw new IllegalArgumentException();
        }
        this.chunkSize = i5;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        while (i6 > 0) {
            int min = Math.min(i6, this.chunkSize);
            ((FilterWriter) this).out.write(cArr, i5, min);
            i6 -= min;
            i5 += min;
        }
    }
}
