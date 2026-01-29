package kotlin.jvm.internal;

/* loaded from: classes14.dex */
public final class ByteSpreadBuilder extends PrimitiveSpreadBuilder<byte[]> {
    private final byte[] values;

    public ByteSpreadBuilder(int i5) {
        super(i5);
        this.values = new byte[i5];
    }

    public final void add(byte b5) {
        byte[] bArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        bArr[position] = b5;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    public final byte[] toArray() {
        return toArray(this.values, new byte[size()]);
    }
}
