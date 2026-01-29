package kotlin.jvm.internal;

/* loaded from: classes19.dex */
public final class LongSpreadBuilder extends PrimitiveSpreadBuilder<long[]> {
    private final long[] values;

    public LongSpreadBuilder(int i5) {
        super(i5);
        this.values = new long[i5];
    }

    public final void add(long j5) {
        long[] jArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        jArr[position] = j5;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    public final long[] toArray() {
        return toArray(this.values, new long[size()]);
    }
}
