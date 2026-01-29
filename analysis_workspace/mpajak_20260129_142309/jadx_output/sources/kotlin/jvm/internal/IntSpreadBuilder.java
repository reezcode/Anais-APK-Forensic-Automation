package kotlin.jvm.internal;

/* loaded from: classes19.dex */
public final class IntSpreadBuilder extends PrimitiveSpreadBuilder<int[]> {
    private final int[] values;

    public IntSpreadBuilder(int i5) {
        super(i5);
        this.values = new int[i5];
    }

    public final void add(int i5) {
        int[] iArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        iArr[position] = i5;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    public final int[] toArray() {
        return toArray(this.values, new int[size()]);
    }
}
