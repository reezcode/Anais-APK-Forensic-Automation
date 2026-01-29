package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes22.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i5, ByteBuffer byteBuffer) {
        __reset(i5, 1, byteBuffer);
        return this;
    }

    public boolean get(int i5) {
        return this.bb.get(__element(i5)) != 0;
    }
}
