package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import org.apache.commons.io.IOUtils;

/* loaded from: classes2.dex */
public abstract class ProxyReader extends FilterReader {
    public ProxyReader(Reader reader) {
        super(reader);
    }

    public void afterRead(int i5) {
    }

    public void beforeRead(int i5) {
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterReader) this).in.close();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i5) {
        try {
            ((FilterReader) this).in.mark(i5);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return ((FilterReader) this).in.markSupported();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() {
        int i5 = 1;
        try {
            beforeRead(1);
            int read = ((FilterReader) this).in.read();
            if (read == -1) {
                i5 = -1;
            }
            afterRead(i5);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        try {
            beforeRead(IOUtils.length(charBuffer));
            int read = ((FilterReader) this).in.read(charBuffer);
            afterRead(read);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) {
        try {
            beforeRead(IOUtils.length(cArr));
            int read = ((FilterReader) this).in.read(cArr);
            afterRead(read);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        try {
            beforeRead(i6);
            int read = ((FilterReader) this).in.read(cArr, i5, i6);
            afterRead(read);
            return read;
        } catch (IOException e5) {
            handleIOException(e5);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() {
        try {
            return ((FilterReader) this).in.ready();
        } catch (IOException e5) {
            handleIOException(e5);
            return false;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() {
        try {
            ((FilterReader) this).in.reset();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j5) {
        try {
            return ((FilterReader) this).in.skip(j5);
        } catch (IOException e5) {
            handleIOException(e5);
            return 0L;
        }
    }
}
