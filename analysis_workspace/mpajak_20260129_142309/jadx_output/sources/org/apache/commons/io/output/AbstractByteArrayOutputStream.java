package org.apache.commons.io.output;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ClosedInputStream;

/* loaded from: classes17.dex */
public abstract class AbstractByteArrayOutputStream extends OutputStream {
    public static final int DEFAULT_SIZE = 1024;
    public int count;
    private byte[] currentBuffer;
    private int currentBufferIndex;
    private int filledBufferSum;
    private final List<byte[]> buffers = new ArrayList();
    private boolean reuseBuffers = true;

    @FunctionalInterface
    /* loaded from: classes4.dex */
    public interface InputStreamConstructor<T extends InputStream> {
        T construct(byte[] bArr, int i5, int i6);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void needNewBuffer(int i5) {
        int length;
        if (this.currentBufferIndex < this.buffers.size() - 1) {
            this.filledBufferSum += this.currentBuffer.length;
            int i6 = this.currentBufferIndex + 1;
            this.currentBufferIndex = i6;
            this.currentBuffer = this.buffers.get(i6);
            return;
        }
        byte[] bArr = this.currentBuffer;
        if (bArr == null) {
            length = 0;
        } else {
            i5 = Math.max(bArr.length << 1, i5 - this.filledBufferSum);
            length = this.filledBufferSum + this.currentBuffer.length;
        }
        this.filledBufferSum = length;
        this.currentBufferIndex++;
        byte[] byteArray = IOUtils.byteArray(i5);
        this.currentBuffer = byteArray;
        this.buffers.add(byteArray);
    }

    public abstract void reset();

    public void resetImpl() {
        this.count = 0;
        this.filledBufferSum = 0;
        this.currentBufferIndex = 0;
        if (this.reuseBuffers) {
            this.currentBuffer = this.buffers.get(0);
            return;
        }
        this.currentBuffer = null;
        int length = this.buffers.get(0).length;
        this.buffers.clear();
        needNewBuffer(length);
        this.reuseBuffers = true;
    }

    public abstract int size();

    public abstract byte[] toByteArray();

    public byte[] toByteArrayImpl() {
        int i5 = this.count;
        if (i5 == 0) {
            return IOUtils.EMPTY_BYTE_ARRAY;
        }
        byte[] byteArray = IOUtils.byteArray(i5);
        int i6 = 0;
        for (byte[] bArr : this.buffers) {
            int min = Math.min(bArr.length, i5);
            System.arraycopy(bArr, 0, byteArray, i6, min);
            i6 += min;
            i5 -= min;
            if (i5 == 0) {
                break;
            }
        }
        return byteArray;
    }

    public abstract InputStream toInputStream();

    public <T extends InputStream> InputStream toInputStream(InputStreamConstructor<T> inputStreamConstructor) {
        int i5 = this.count;
        if (i5 == 0) {
            return ClosedInputStream.CLOSED_INPUT_STREAM;
        }
        ArrayList arrayList = new ArrayList(this.buffers.size());
        for (byte[] bArr : this.buffers) {
            int min = Math.min(bArr.length, i5);
            arrayList.add(inputStreamConstructor.construct(bArr, 0, min));
            i5 -= min;
            if (i5 == 0) {
                break;
            }
        }
        this.reuseBuffers = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Deprecated
    public String toString() {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    public String toString(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public abstract int write(InputStream inputStream);

    @Override // java.io.OutputStream
    public abstract void write(int i5);

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i5, int i6);

    public int writeImpl(InputStream inputStream) {
        int i5 = this.count - this.filledBufferSum;
        byte[] bArr = this.currentBuffer;
        int read = inputStream.read(bArr, i5, bArr.length - i5);
        int i6 = 0;
        while (read != -1) {
            i6 += read;
            i5 += read;
            this.count += read;
            byte[] bArr2 = this.currentBuffer;
            if (i5 == bArr2.length) {
                needNewBuffer(bArr2.length);
                i5 = 0;
            }
            byte[] bArr3 = this.currentBuffer;
            read = inputStream.read(bArr3, i5, bArr3.length - i5);
        }
        return i6;
    }

    public void writeImpl(int i5) {
        int i6 = this.count;
        int i7 = i6 - this.filledBufferSum;
        if (i7 == this.currentBuffer.length) {
            needNewBuffer(i6 + 1);
            i7 = 0;
        }
        this.currentBuffer[i7] = (byte) i5;
        this.count++;
    }

    public void writeImpl(byte[] bArr, int i5, int i6) {
        int i7 = this.count;
        int i8 = i7 + i6;
        int i9 = i7 - this.filledBufferSum;
        int i10 = i6;
        while (i10 > 0) {
            int min = Math.min(i10, this.currentBuffer.length - i9);
            System.arraycopy(bArr, (i5 + i6) - i10, this.currentBuffer, i9, min);
            i10 -= min;
            if (i10 > 0) {
                needNewBuffer(i8);
                i9 = 0;
            }
        }
        this.count = i8;
    }

    public abstract void writeTo(OutputStream outputStream);

    public void writeToImpl(OutputStream outputStream) {
        int i5 = this.count;
        for (byte[] bArr : this.buffers) {
            int min = Math.min(bArr.length, i5);
            outputStream.write(bArr, 0, min);
            i5 -= min;
            if (i5 == 0) {
                return;
            }
        }
    }
}
