package org.apache.commons.io.input;

import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes13.dex */
public class CharSequenceReader extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence charSequence;
    private final Integer end;
    private int idx;
    private int mark;
    private final int start;

    public CharSequenceReader(CharSequence charSequence) {
        this(charSequence, 0);
    }

    public CharSequenceReader(CharSequence charSequence, int i5) {
        this(charSequence, i5, Integer.MAX_VALUE);
    }

    public CharSequenceReader(String str, int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Start index is less than zero: ", i5));
        }
        if (i6 < i5) {
            throw new IllegalArgumentException(androidx.activity.d.d("End index is less than start ", i5, ": ", i6));
        }
        this.charSequence = str == null ? "" : str;
        this.start = i5;
        this.end = Integer.valueOf(i6);
        this.idx = i5;
        this.mark = i5;
    }

    private int end() {
        int length = this.charSequence.length();
        Integer num = this.end;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    private int start() {
        return Math.min(this.charSequence.length(), this.start);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i5 = this.start;
        this.idx = i5;
        this.mark = i5;
    }

    @Override // java.io.Reader
    public void mark(int i5) {
        this.mark = this.idx;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.idx >= end()) {
            return -1;
        }
        CharSequence charSequence = this.charSequence;
        int i5 = this.idx;
        this.idx = i5 + 1;
        return charSequence.charAt(i5);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        int min;
        if (this.idx >= end()) {
            return -1;
        }
        Objects.requireNonNull(cArr, "array");
        if (i6 < 0 || i5 < 0 || i5 + i6 > cArr.length) {
            StringBuilder g5 = androidx.activity.d.g("Array Size=");
            g5.append(cArr.length);
            g5.append(", offset=");
            g5.append(i5);
            g5.append(", length=");
            g5.append(i6);
            throw new IndexOutOfBoundsException(g5.toString());
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof String) {
            min = Math.min(i6, end() - this.idx);
            String str = (String) this.charSequence;
            int i7 = this.idx;
            str.getChars(i7, i7 + min, cArr, i5);
        } else if (charSequence instanceof StringBuilder) {
            min = Math.min(i6, end() - this.idx);
            StringBuilder sb = (StringBuilder) this.charSequence;
            int i8 = this.idx;
            sb.getChars(i8, i8 + min, cArr, i5);
        } else {
            if (!(charSequence instanceof StringBuffer)) {
                int i9 = 0;
                for (int i10 = 0; i10 < i6; i10++) {
                    int read = read();
                    if (read == -1) {
                        return i9;
                    }
                    cArr[i5 + i10] = (char) read;
                    i9++;
                }
                return i9;
            }
            min = Math.min(i6, end() - this.idx);
            StringBuffer stringBuffer = (StringBuffer) this.charSequence;
            int i11 = this.idx;
            stringBuffer.getChars(i11, i11 + min, cArr, i5);
        }
        this.idx += min;
        return min;
    }

    @Override // java.io.Reader
    public boolean ready() {
        return this.idx < end();
    }

    @Override // java.io.Reader
    public void reset() {
        this.idx = this.mark;
    }

    @Override // java.io.Reader
    public long skip(long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Number of characters to skip is less than zero: ", j5));
        }
        if (this.idx >= end()) {
            return 0L;
        }
        int min = (int) Math.min(end(), this.idx + j5);
        int i5 = min - this.idx;
        this.idx = min;
        return i5;
    }

    public String toString() {
        return this.charSequence.subSequence(start(), end()).toString();
    }
}
