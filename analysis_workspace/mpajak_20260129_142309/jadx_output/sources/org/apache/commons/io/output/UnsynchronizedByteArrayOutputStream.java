package org.apache.commons.io.output;

import androidx.appcompat.widget.a;
import androidx.constraintlayout.core.state.g;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class UnsynchronizedByteArrayOutputStream extends AbstractByteArrayOutputStream {
    public UnsynchronizedByteArrayOutputStream() {
        this(1024);
    }

    public UnsynchronizedByteArrayOutputStream(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(a.g("Negative initial size: ", i5));
        }
        needNewBuffer(i5);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return toBufferedInputStream(inputStream, 1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i5) {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = new UnsynchronizedByteArrayOutputStream(i5);
        try {
            unsynchronizedByteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = unsynchronizedByteArrayOutputStream.toInputStream();
            unsynchronizedByteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int size() {
        return this.count;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public InputStream toInputStream() {
        return toInputStream(g.f156b);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int write(InputStream inputStream) {
        return writeImpl(inputStream);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(int i5) {
        writeImpl(i5);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 > bArr.length || i6 < 0 || (i7 = i5 + i6) > bArr.length || i7 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        if (i6 == 0) {
            return;
        }
        writeImpl(bArr, i5, i6);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void writeTo(OutputStream outputStream) {
        writeToImpl(outputStream);
    }
}
