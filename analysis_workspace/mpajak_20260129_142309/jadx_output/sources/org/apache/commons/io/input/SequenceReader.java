package org.apache.commons.io.input;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes16.dex */
public class SequenceReader extends Reader {
    private Reader reader;
    private Iterator<? extends Reader> readers;

    public SequenceReader(Iterable<? extends Reader> iterable) {
        Objects.requireNonNull(iterable, "readers");
        this.readers = iterable.iterator();
        this.reader = nextReader();
    }

    public SequenceReader(Reader... readerArr) {
        this(Arrays.asList(readerArr));
    }

    private Reader nextReader() {
        if (this.readers.hasNext()) {
            return this.readers.next();
        }
        return null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.readers = null;
        this.reader = null;
    }

    @Override // java.io.Reader
    public int read() {
        int i5 = -1;
        while (true) {
            Reader reader = this.reader;
            if (reader == null || (i5 = reader.read()) != -1) {
                break;
            }
            this.reader = nextReader();
        }
        return i5;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        Objects.requireNonNull(cArr, "cbuf");
        if (i6 < 0 || i5 < 0 || i5 + i6 > cArr.length) {
            StringBuilder g5 = androidx.activity.d.g("Array Size=");
            g5.append(cArr.length);
            g5.append(", offset=");
            g5.append(i5);
            g5.append(", length=");
            g5.append(i6);
            throw new IndexOutOfBoundsException(g5.toString());
        }
        int i7 = 0;
        while (true) {
            Reader reader = this.reader;
            if (reader == null) {
                break;
            }
            int read = reader.read(cArr, i5, i6);
            if (read == -1) {
                this.reader = nextReader();
            } else {
                i7 += read;
                i5 += read;
                i6 -= read;
                if (i6 <= 0) {
                    break;
                }
            }
        }
        if (i7 > 0) {
            return i7;
        }
        return -1;
    }
}
