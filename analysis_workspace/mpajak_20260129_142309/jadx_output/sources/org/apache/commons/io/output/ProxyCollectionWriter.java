package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import org.apache.commons.io.IOUtils;

/* loaded from: classes5.dex */
public class ProxyCollectionWriter extends FilterCollectionWriter {
    public ProxyCollectionWriter(Collection<Writer> collection) {
        super(collection);
    }

    public ProxyCollectionWriter(Writer... writerArr) {
        super(writerArr);
    }

    public void afterWrite(int i5) {
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public Writer append(char c5) {
        try {
            beforeWrite(1);
            super.append(c5);
            afterWrite(1);
        } catch (IOException e5) {
            handleIOException(e5);
        }
        return this;
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        try {
            int length = IOUtils.length(charSequence);
            beforeWrite(length);
            super.append(charSequence);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
        return this;
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i5, int i6) {
        int i7 = i6 - i5;
        try {
            beforeWrite(i7);
            super.append(charSequence, i5, i6);
            afterWrite(i7);
        } catch (IOException e5) {
            handleIOException(e5);
        }
        return this;
    }

    public void beforeWrite(int i5) {
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(int i5) {
        try {
            beforeWrite(1);
            super.write(i5);
            afterWrite(1);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(String str) {
        try {
            int length = IOUtils.length(str);
            beforeWrite(length);
            super.write(str);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(String str, int i5, int i6) {
        try {
            beforeWrite(i6);
            super.write(str, i5, i6);
            afterWrite(i6);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(char[] cArr) {
        try {
            int length = IOUtils.length(cArr);
            beforeWrite(length);
            super.write(cArr);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        try {
            beforeWrite(i6);
            super.write(cArr, i5, i6);
            afterWrite(i6);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }
}
