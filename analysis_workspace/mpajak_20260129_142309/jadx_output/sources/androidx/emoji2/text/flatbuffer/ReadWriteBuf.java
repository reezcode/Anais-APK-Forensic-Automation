package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b5);

    void put(byte[] bArr, int i5, int i6);

    void putBoolean(boolean z4);

    void putDouble(double d5);

    void putFloat(float f5);

    void putInt(int i5);

    void putLong(long j5);

    void putShort(short s4);

    boolean requestCapacity(int i5);

    void set(int i5, byte b5);

    void set(int i5, byte[] bArr, int i6, int i7);

    void setBoolean(int i5, boolean z4);

    void setDouble(int i5, double d5);

    void setFloat(int i5, float f5);

    void setInt(int i5, int i6);

    void setLong(int i5, long j5);

    void setShort(int i5, short s4);

    int writePosition();
}
