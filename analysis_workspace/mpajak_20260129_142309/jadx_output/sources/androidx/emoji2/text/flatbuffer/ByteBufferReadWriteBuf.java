package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes14.dex */
public class ByteBufferReadWriteBuf implements ReadWriteBuf {
    private final ByteBuffer buffer;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i5) {
        return this.buffer.get(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i5) {
        return get(i5) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i5) {
        return this.buffer.getDouble(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i5) {
        return this.buffer.getFloat(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i5) {
        return this.buffer.getInt(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i5) {
        return this.buffer.getLong(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i5) {
        return this.buffer.getShort(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i5, int i6) {
        return Utf8Safe.decodeUtf8Buffer(this.buffer, i5, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.buffer.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b5) {
        this.buffer.put(b5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i5, int i6) {
        this.buffer.put(bArr, i5, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z4) {
        this.buffer.put(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d5) {
        this.buffer.putDouble(d5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f5) {
        this.buffer.putFloat(f5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i5) {
        this.buffer.putInt(i5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j5) {
        this.buffer.putLong(j5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s4) {
        this.buffer.putShort(s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i5) {
        return i5 <= this.buffer.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i5, byte b5) {
        requestCapacity(i5 + 1);
        this.buffer.put(i5, b5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i5, byte[] bArr, int i6, int i7) {
        requestCapacity((i7 - i6) + i5);
        int position = this.buffer.position();
        this.buffer.position(i5);
        this.buffer.put(bArr, i6, i7);
        this.buffer.position(position);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i5, boolean z4) {
        set(i5, z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i5, double d5) {
        requestCapacity(i5 + 8);
        this.buffer.putDouble(i5, d5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i5, float f5) {
        requestCapacity(i5 + 4);
        this.buffer.putFloat(i5, f5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i5, int i6) {
        requestCapacity(i5 + 4);
        this.buffer.putInt(i5, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i5, long j5) {
        requestCapacity(i5 + 8);
        this.buffer.putLong(i5, j5);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i5, short s4) {
        requestCapacity(i5 + 2);
        this.buffer.putShort(i5, s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.buffer.position();
    }
}
