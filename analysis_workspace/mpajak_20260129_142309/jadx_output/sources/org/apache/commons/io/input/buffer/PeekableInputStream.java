package org.apache.commons.io.input.buffer;

import androidx.activity.d;
import androidx.appcompat.view.a;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class PeekableInputStream extends CircularBufferInputStream {
    public PeekableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public PeekableInputStream(InputStream inputStream, int i5) {
        super(inputStream, i5);
    }

    public boolean peek(byte[] bArr) {
        Objects.requireNonNull(bArr, "sourceBuffer");
        return peek(bArr, 0, bArr.length);
    }

    public boolean peek(byte[] bArr, int i5, int i6) {
        Objects.requireNonNull(bArr, "sourceBuffer");
        if (bArr.length <= this.bufferSize) {
            if (this.buffer.getCurrentNumberOfBytes() < bArr.length) {
                fillBuffer();
            }
            return this.buffer.peek(bArr, i5, i6);
        }
        StringBuilder g5 = d.g("Peek request size of ");
        g5.append(bArr.length);
        g5.append(" bytes exceeds buffer size of ");
        throw new IllegalArgumentException(a.h(g5, this.bufferSize, " bytes"));
    }
}
