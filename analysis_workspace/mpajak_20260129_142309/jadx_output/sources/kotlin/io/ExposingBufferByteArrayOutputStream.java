package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
final class ExposingBufferByteArrayOutputStream extends ByteArrayOutputStream {
    public ExposingBufferByteArrayOutputStream(int i5) {
        super(i5);
    }

    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
