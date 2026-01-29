package org.apache.commons.io.output;

import androidx.activity.d;
import java.io.Writer;
import java.lang.Appendable;
import java.util.Objects;

/* loaded from: classes4.dex */
public class AppendableWriter<T extends Appendable> extends Writer {
    private final T appendable;

    public AppendableWriter(T t4) {
        this.appendable = t4;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c5) {
        this.appendable.append(c5);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.appendable.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i5, int i6) {
        this.appendable.append(charSequence, i5, i6);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public T getAppendable() {
        return this.appendable;
    }

    @Override // java.io.Writer
    public void write(int i5) {
        this.appendable.append((char) i5);
    }

    @Override // java.io.Writer
    public void write(String str, int i5, int i6) {
        Objects.requireNonNull(str, "String is missing");
        this.appendable.append(str, i5, i6 + i5);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        Objects.requireNonNull(cArr, "Character array is missing");
        if (i6 >= 0 && i5 + i6 <= cArr.length) {
            for (int i7 = 0; i7 < i6; i7++) {
                this.appendable.append(cArr[i5 + i7]);
            }
            return;
        }
        StringBuilder g5 = d.g("Array Size=");
        g5.append(cArr.length);
        g5.append(", offset=");
        g5.append(i5);
        g5.append(", length=");
        g5.append(i6);
        throw new IndexOutOfBoundsException(g5.toString());
    }
}
