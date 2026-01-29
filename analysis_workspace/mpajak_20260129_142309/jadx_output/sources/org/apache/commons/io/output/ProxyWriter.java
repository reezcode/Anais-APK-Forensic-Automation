package org.apache.commons.io.output;

import androidx.core.view.inputmethod.a;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.io.IOUtils;

/* loaded from: classes20.dex */
public class ProxyWriter extends FilterWriter {
    public ProxyWriter(Writer writer) {
        super(writer);
    }

    public void afterWrite(int i5) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.append(c5);
            afterWrite(1);
        } catch (IOException e5) {
            handleIOException(e5);
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        try {
            int length = IOUtils.length(charSequence);
            beforeWrite(length);
            ((FilterWriter) this).out.append(charSequence);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i5, int i6) {
        int i7 = i6 - i5;
        try {
            beforeWrite(i7);
            ((FilterWriter) this).out.append(charSequence, i5, i6);
            afterWrite(i7);
        } catch (IOException e5) {
            handleIOException(e5);
        }
        return this;
    }

    public void beforeWrite(int i5) {
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterWriter) this).out, new a(this, 2));
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i5) {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.write(i5);
            afterWrite(1);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.Writer
    public void write(String str) {
        try {
            int length = IOUtils.length(str);
            beforeWrite(length);
            ((FilterWriter) this).out.write(str);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i5, int i6) {
        try {
            beforeWrite(i6);
            ((FilterWriter) this).out.write(str, i5, i6);
            afterWrite(i6);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        try {
            int length = IOUtils.length(cArr);
            beforeWrite(length);
            ((FilterWriter) this).out.write(cArr);
            afterWrite(length);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        try {
            beforeWrite(i6);
            ((FilterWriter) this).out.write(cArr, i5, i6);
            afterWrite(i6);
        } catch (IOException e5) {
            handleIOException(e5);
        }
    }
}
