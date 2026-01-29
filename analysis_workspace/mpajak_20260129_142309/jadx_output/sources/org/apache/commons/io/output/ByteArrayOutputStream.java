package org.apache.commons.io.output;

import androidx.appcompat.widget.a;
import androidx.constraintlayout.core.state.f;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class ByteArrayOutputStream extends AbstractByteArrayOutputStream {
    public ByteArrayOutputStream() {
        this(1024);
    }

    public ByteArrayOutputStream(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(a.g("Negative initial size: ", i5));
        }
        synchronized (this) {
            needNewBuffer(i5);
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return toBufferedInputStream(inputStream, 1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        try {
            byteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = byteArrayOutputStream.toInputStream();
            byteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int size() {
        return this.count;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized InputStream toInputStream() {
        return toInputStream(f.f154b);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int write(InputStream inputStream) {
        return writeImpl(inputStream);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i5) {
        writeImpl(i5);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 > bArr.length || i6 < 0 || (i7 = i5 + i6) > bArr.length || i7 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i6 == 0) {
            return;
        }
        synchronized (this) {
            writeImpl(bArr, i5, i6);
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void writeTo(OutputStream outputStream) {
        writeToImpl(outputStream);
    }
}
