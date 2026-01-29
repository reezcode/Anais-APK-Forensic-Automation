package kotlin.jvm.internal;

/* loaded from: classes6.dex */
public final class DoubleSpreadBuilder extends PrimitiveSpreadBuilder<double[]> {
    private final double[] values;

    public DoubleSpreadBuilder(int i5) {
        super(i5);
        this.values = new double[i5];
    }

    public final void add(double d5) {
        double[] dArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        dArr[position] = d5;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    public final double[] toArray() {
        return toArray(this.values, new double[size()]);
    }
}
