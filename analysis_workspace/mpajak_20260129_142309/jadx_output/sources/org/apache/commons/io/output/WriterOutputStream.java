package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes3.dex */
public class WriterOutputStream extends OutputStream {
    private static final int BUFFER_SIZE = 1024;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    @Deprecated
    public WriterOutputStream(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }

    public WriterOutputStream(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    public WriterOutputStream(Writer writer, String str, int i5, boolean z4) {
        this(writer, Charset.forName(str), i5, z4);
    }

    public WriterOutputStream(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public WriterOutputStream(Writer writer, Charset charset, int i5, boolean z4) {
        this(writer, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), i5, z4);
    }

    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder, int i5, boolean z4) {
        this.decoderIn = ByteBuffer.allocate(128);
        checkIbmJdkWithBrokenUTF16(charsetDecoder.charset());
        this.writer = writer;
        this.decoder = charsetDecoder;
        this.writeImmediately = z4;
        this.decoderOut = CharBuffer.allocate(i5);
    }

    private static void checkIbmJdkWithBrokenUTF16(Charset charset) {
        if ("UTF-16".equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder newDecoder = charset.newDecoder();
            ByteBuffer allocate = ByteBuffer.allocate(16);
            CharBuffer allocate2 = CharBuffer.allocate(3);
            int length = bytes.length;
            int i5 = 0;
            while (i5 < length) {
                allocate.put(bytes[i5]);
                allocate.flip();
                try {
                    newDecoder.decode(allocate, allocate2, i5 == length + (-1));
                    allocate.compact();
                    i5++;
                } catch (IllegalArgumentException unused) {
                    throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                }
            }
            allocate2.rewind();
            if (!"vés".equals(allocate2.toString())) {
                throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
            }
        }
    }

    private void flushOutput() {
        if (this.decoderOut.position() > 0) {
            this.writer.write(this.decoderOut.array(), 0, this.decoderOut.position());
            this.decoderOut.rewind();
        }
    }

    private void processInput(boolean z4) {
        CoderResult decode;
        this.decoderIn.flip();
        while (true) {
            decode = this.decoder.decode(this.decoderIn, this.decoderOut, z4);
            if (!decode.isOverflow()) {
                break;
            } else {
                flushOutput();
            }
        }
        if (!decode.isUnderflow()) {
            throw new IOException("Unexpected coder result");
        }
        this.decoderIn.compact();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        processInput(true);
        flushOutput();
        this.writer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        flushOutput();
        this.writer.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        write(new byte[]{(byte) i5}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        while (i6 > 0) {
            int min = Math.min(i6, this.decoderIn.remaining());
            this.decoderIn.put(bArr, i5, min);
            processInput(false);
            i6 -= min;
            i5 += min;
        }
        if (this.writeImmediately) {
            flushOutput();
        }
    }
}
