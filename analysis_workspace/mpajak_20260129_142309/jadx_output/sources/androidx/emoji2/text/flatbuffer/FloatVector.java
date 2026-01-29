package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes17.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i5, ByteBuffer byteBuffer) {
        __reset(i5, 4, byteBuffer);
        return this;
    }

    public float get(int i5) {
        return this.bb.getFloat(__element(i5));
    }
}
