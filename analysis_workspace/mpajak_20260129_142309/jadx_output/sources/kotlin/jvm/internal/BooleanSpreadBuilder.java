package kotlin.jvm.internal;

/* loaded from: classes11.dex */
public final class BooleanSpreadBuilder extends PrimitiveSpreadBuilder<boolean[]> {
    private final boolean[] values;

    public BooleanSpreadBuilder(int i5) {
        super(i5);
        this.values = new boolean[i5];
    }

    public final void add(boolean z4) {
        boolean[] zArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        zArr[position] = z4;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    public final boolean[] toArray() {
        return toArray(this.values, new boolean[size()]);
    }
}
