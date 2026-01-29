package org.apache.commons.io.input;

import java.io.InputStream;

/* loaded from: classes6.dex */
public class UnixLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private boolean eofSeen;
    private boolean slashNSeen;
    private boolean slashRSeen;
    private final InputStream target;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z4) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z4;
    }

    private int eofGame(boolean z4) {
        if (z4 || !this.ensureLineFeedAtEndOfFile || this.slashNSeen) {
            return -1;
        }
        this.slashNSeen = true;
        return 10;
    }

    private int readWithUpdate() {
        int read = this.target.read();
        boolean z4 = read == -1;
        this.eofSeen = z4;
        if (z4) {
            return read;
        }
        this.slashNSeen = read == 10;
        this.slashRSeen = read == 13;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.target.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        throw UnsupportedOperationExceptions.mark();
    }

    @Override // java.io.InputStream
    public int read() {
        boolean z4 = this.slashRSeen;
        if (this.eofSeen) {
            return eofGame(z4);
        }
        int readWithUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame(z4);
        }
        if (this.slashRSeen) {
            return 10;
        }
        return (z4 && this.slashNSeen) ? read() : readWithUpdate;
    }
}
