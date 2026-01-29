package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public final class ShortSpreadBuilder extends PrimitiveSpreadBuilder<short[]> {
    private final short[] values;

    public ShortSpreadBuilder(int i5) {
        super(i5);
        this.values = new short[i5];
    }

    public final void add(short s4) {
        short[] sArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        sArr[position] = s4;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    public final short[] toArray() {
        return toArray(this.values, new short[size()]);
    }
}
