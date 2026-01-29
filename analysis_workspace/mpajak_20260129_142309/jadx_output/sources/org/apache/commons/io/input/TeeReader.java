package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

/* loaded from: classes5.dex */
public class TeeReader extends ProxyReader {
    private final Writer branch;
    private final boolean closeBranch;

    public TeeReader(Reader reader, Writer writer) {
        this(reader, writer, false);
    }

    public TeeReader(Reader reader, Writer writer, boolean z4) {
        super(reader);
        this.branch = writer;
        this.closeBranch = z4;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } finally {
            if (this.closeBranch) {
                this.branch.close();
            }
        }
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read() {
        int read = super.read();
        if (read != -1) {
            this.branch.write(read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) {
        int position = charBuffer.position();
        int read = super.read(charBuffer);
        if (read != -1) {
            int position2 = charBuffer.position();
            int limit = charBuffer.limit();
            try {
                charBuffer.position(position).limit(position2);
                this.branch.append((CharSequence) charBuffer);
            } finally {
                charBuffer.position(position2).limit(limit);
            }
        }
        return read;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.Reader
    public int read(char[] cArr) {
        int read = super.read(cArr);
        if (read != -1) {
            this.branch.write(cArr, 0, read);
        }
        return read;
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        int read = super.read(cArr, i5, i6);
        if (read != -1) {
            this.branch.write(cArr, i5, read);
        }
        return read;
    }
}
