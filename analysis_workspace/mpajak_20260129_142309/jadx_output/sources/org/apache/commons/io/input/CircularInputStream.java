package org.apache.commons.io.input;

import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes16.dex */
public class CircularInputStream extends InputStream {
    private long byteCount;
    private int position = -1;
    private final byte[] repeatedContent;
    private final long targetByteCount;

    public CircularInputStream(byte[] bArr, long j5) {
        this.repeatedContent = validate(bArr);
        if (bArr.length == 0) {
            throw new IllegalArgumentException("repeatContent is empty.");
        }
        this.targetByteCount = j5;
    }

    private static byte[] validate(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b5 : bArr) {
            if (b5 == -1) {
                throw new IllegalArgumentException("repeatContent contains the end-of-stream marker -1");
            }
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int read() {
        long j5 = this.targetByteCount;
        if (j5 >= 0) {
            long j6 = this.byteCount;
            if (j6 == j5) {
                return -1;
            }
            this.byteCount = j6 + 1;
        }
        int i5 = this.position + 1;
        byte[] bArr = this.repeatedContent;
        int length = i5 % bArr.length;
        this.position = length;
        return bArr[length] & 255;
    }
}
