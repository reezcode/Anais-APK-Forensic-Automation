package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* loaded from: classes10.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
        this(10);
    }

    public ArrayReadWriteBuf(int i5) {
        this(new byte[i5]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.buffer = bArr;
        this.writePos = 0;
    }

    public ArrayReadWriteBuf(byte[] bArr, int i5) {
        this.buffer = bArr;
        this.writePos = i5;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i5) {
        return this.buffer[i5];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i5) {
        return this.buffer[i5] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i5) {
        return Double.longBitsToDouble(getLong(i5));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i5) {
        return Float.intBitsToFloat(getInt(i5));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i5) {
        byte[] bArr = this.buffer;
        return (bArr[i5] & 255) | (bArr[i5 + 3] << 24) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i5) {
        byte[] bArr = this.buffer;
        long j5 = bArr[i5] & 255;
        int i6 = i5 + 1 + 1 + 1;
        long j6 = j5 | ((bArr[r1] & 255) << 8) | ((bArr[r9] & 255) << 16);
        long j7 = j6 | ((bArr[i6] & 255) << 24);
        long j8 = j7 | ((bArr[r9] & 255) << 32);
        int i7 = i6 + 1 + 1 + 1;
        return j8 | ((bArr[r3] & 255) << 40) | ((255 & bArr[i7]) << 48) | (bArr[i7 + 1] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i5) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i5] & 255) | (bArr[i5 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i5, int i6) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i5, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.writePos;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b5) {
        set(this.writePos, b5);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i5, int i6) {
        set(this.writePos, bArr, i5, i6);
        this.writePos += i6;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z4) {
        setBoolean(this.writePos, z4);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d5) {
        setDouble(this.writePos, d5);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f5) {
        setFloat(this.writePos, f5);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i5) {
        setInt(this.writePos, i5);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j5) {
        setLong(this.writePos, j5);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s4) {
        setShort(this.writePos, s4);
        this.writePos += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i5) {
        byte[] bArr = this.buffer;
        if (bArr.length > i5) {
            return true;
        }
        int length = bArr.length;
        this.buffer = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i5, byte b5) {
        requestCapacity(i5 + 1);
        this.buffer[i5] = b5;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i5, byte[] bArr, int i6, int i7) {
        requestCapacity((i7 - i6) + i5);
        System.arraycopy(bArr, i6, this.buffer, i5, i7);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i5, boolean z4) {
        set(i5, z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i5, double d5) {
        requestCapacity(i5 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d5);
        int i6 = (int) doubleToRawLongBits;
        byte[] bArr = this.buffer;
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i6 >> 8) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i6 >> 16) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i6 >> 24) & 255);
        int i11 = (int) (doubleToRawLongBits >> 32);
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        bArr[i13 + 1] = (byte) ((i11 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i5, float f5) {
        requestCapacity(i5 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f5);
        byte[] bArr = this.buffer;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (floatToRawIntBits & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i7] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i7 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i5, int i6) {
        requestCapacity(i5 + 4);
        byte[] bArr = this.buffer;
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i6 >> 8) & 255);
        bArr[i8] = (byte) ((i6 >> 16) & 255);
        bArr[i8 + 1] = (byte) ((i6 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i5, long j5) {
        requestCapacity(i5 + 8);
        int i6 = (int) j5;
        byte[] bArr = this.buffer;
        int i7 = i5 + 1;
        bArr[i5] = (byte) (i6 & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i6 >> 8) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i6 >> 16) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i6 >> 24) & 255);
        int i11 = (int) (j5 >> 32);
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        bArr[i13 + 1] = (byte) ((i11 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i5, short s4) {
        requestCapacity(i5 + 2);
        byte[] bArr = this.buffer;
        bArr[i5] = (byte) (s4 & 255);
        bArr[i5 + 1] = (byte) ((s4 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.writePos;
    }
}
