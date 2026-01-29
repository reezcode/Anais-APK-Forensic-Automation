package org.apache.commons.io.input;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

/* loaded from: classes6.dex */
public class CharSequenceInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private static final int NO_MARK = -1;
    private final ByteBuffer bbuf;
    private final CharBuffer cbuf;
    private final CharsetEncoder encoder;
    private int mark_bbuf;
    private int mark_cbuf;

    public CharSequenceInputStream(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, String str, int i5) {
        this(charSequence, Charset.forName(str), i5);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i5) {
        CharsetEncoder onUnmappableCharacter = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        this.encoder = onUnmappableCharacter;
        float maxBytesPerChar = onUnmappableCharacter.maxBytesPerChar();
        if (i5 < maxBytesPerChar) {
            throw new IllegalArgumentException("Buffer size " + i5 + " is less than maxBytesPerChar " + maxBytesPerChar);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i5);
        this.bbuf = allocate;
        allocate.flip();
        this.cbuf = CharBuffer.wrap(charSequence);
        this.mark_cbuf = -1;
        this.mark_bbuf = -1;
    }

    private void fillBuffer() {
        this.bbuf.compact();
        CoderResult encode = this.encoder.encode(this.cbuf, this.bbuf, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.bbuf.flip();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.cbuf.remaining() + this.bbuf.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        this.mark_cbuf = this.cbuf.position();
        this.mark_bbuf = this.bbuf.position();
        this.cbuf.mark();
        this.bbuf.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        while (!this.bbuf.hasRemaining()) {
            fillBuffer();
            if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                return -1;
            }
        }
        return this.bbuf.get() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "array");
        if (i6 < 0 || i5 + i6 > bArr.length) {
            StringBuilder g5 = androidx.activity.d.g("Array Size=");
            g5.append(bArr.length);
            g5.append(", offset=");
            g5.append(i5);
            g5.append(", length=");
            g5.append(i6);
            throw new IndexOutOfBoundsException(g5.toString());
        }
        int i7 = 0;
        if (i6 == 0) {
            return 0;
        }
        if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
            return -1;
        }
        while (i6 > 0) {
            if (!this.bbuf.hasRemaining()) {
                fillBuffer();
                if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                    break;
                }
            } else {
                int min = Math.min(this.bbuf.remaining(), i6);
                this.bbuf.get(bArr, i5, min);
                i5 += min;
                i6 -= min;
                i7 += min;
            }
        }
        if (i7 != 0 || this.cbuf.hasRemaining()) {
            return i7;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        if (this.mark_cbuf != -1) {
            if (this.cbuf.position() != 0) {
                this.encoder.reset();
                this.cbuf.rewind();
                this.bbuf.rewind();
                this.bbuf.limit(0);
                while (this.cbuf.position() < this.mark_cbuf) {
                    this.bbuf.rewind();
                    this.bbuf.limit(0);
                    fillBuffer();
                }
            }
            if (this.cbuf.position() != this.mark_cbuf) {
                throw new IllegalStateException("Unexpected CharBuffer position: actual=" + this.cbuf.position() + " expected=" + this.mark_cbuf);
            }
            this.bbuf.position(this.mark_bbuf);
            this.mark_cbuf = -1;
            this.mark_bbuf = -1;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j5) {
        long j6 = 0;
        while (j5 > 0 && available() > 0) {
            read();
            j5--;
            j6++;
        }
        return j6;
    }
}
