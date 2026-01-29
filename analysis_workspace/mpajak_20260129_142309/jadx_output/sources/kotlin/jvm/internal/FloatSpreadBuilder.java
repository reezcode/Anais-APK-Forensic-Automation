package kotlin.jvm.internal;

/* loaded from: classes19.dex */
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {
    private final float[] values;

    public FloatSpreadBuilder(int i5) {
        super(i5);
        this.values = new float[i5];
    }

    public final void add(float f5) {
        float[] fArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        fArr[position] = f5;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    public final float[] toArray() {
        return toArray(this.values, new float[size()]);
    }
}
