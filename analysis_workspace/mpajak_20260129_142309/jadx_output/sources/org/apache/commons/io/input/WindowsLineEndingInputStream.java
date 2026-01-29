package org.apache.commons.io.input;

import java.io.InputStream;

/* loaded from: classes4.dex */
public class WindowsLineEndingInputStream extends InputStream {
    private final boolean ensureLineFeedAtEndOfFile;
    private boolean eofSeen;
    private boolean injectSlashN;
    private boolean slashNSeen;
    private boolean slashRSeen;
    private final InputStream target;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z4) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z4;
    }

    private int eofGame() {
        if (!this.ensureLineFeedAtEndOfFile) {
            return -1;
        }
        boolean z4 = this.slashNSeen;
        if (!z4 && !this.slashRSeen) {
            this.slashRSeen = true;
            return 13;
        }
        if (z4) {
            return -1;
        }
        this.slashRSeen = false;
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
        this.slashRSeen = read == 13;
        this.slashNSeen = read == 10;
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
        if (this.eofSeen) {
            return eofGame();
        }
        if (this.injectSlashN) {
            this.injectSlashN = false;
            return 10;
        }
        boolean z4 = this.slashRSeen;
        int readWithUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame();
        }
        if (readWithUpdate != 10 || z4) {
            return readWithUpdate;
        }
        this.injectSlashN = true;
        return 13;
    }
}
