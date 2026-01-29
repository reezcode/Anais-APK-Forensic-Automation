package org.apache.commons.io.input;

import java.io.Reader;

/* loaded from: classes23.dex */
public class BoundedReader extends Reader {
    private static final int INVALID = -1;
    private int charsRead;
    private int markedAt = -1;
    private final int maxCharsFromTargetReader;
    private int readAheadLimit;
    private final Reader target;

    public BoundedReader(Reader reader, int i5) {
        this.target = reader;
        this.maxCharsFromTargetReader = i5;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.target.close();
    }

    @Override // java.io.Reader
    public void mark(int i5) {
        int i6 = this.charsRead;
        this.readAheadLimit = i5 - i6;
        this.markedAt = i6;
        this.target.mark(i5);
    }

    @Override // java.io.Reader
    public int read() {
        int i5 = this.charsRead;
        if (i5 >= this.maxCharsFromTargetReader) {
            return -1;
        }
        int i6 = this.markedAt;
        if (i6 >= 0 && i5 - i6 >= this.readAheadLimit) {
            return -1;
        }
        this.charsRead = i5 + 1;
        return this.target.read();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            int read = read();
            if (read == -1) {
                if (i7 == 0) {
                    return -1;
                }
                return i7;
            }
            cArr[i5 + i7] = (char) read;
        }
        return i6;
    }

    @Override // java.io.Reader
    public void reset() {
        this.charsRead = this.markedAt;
        this.target.reset();
    }
}
