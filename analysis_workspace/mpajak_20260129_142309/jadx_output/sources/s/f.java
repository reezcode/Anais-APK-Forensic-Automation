package s;

/* loaded from: classes23.dex */
public final class f implements a<byte[]> {
    @Override // s.a
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // s.a
    public final int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // s.a
    public final int c() {
        return 1;
    }

    @Override // s.a
    public final byte[] newArray(int i5) {
        return new byte[i5];
    }
}
