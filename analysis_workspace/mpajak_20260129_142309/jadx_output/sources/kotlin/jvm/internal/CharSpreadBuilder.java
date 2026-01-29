package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class CharSpreadBuilder extends PrimitiveSpreadBuilder<char[]> {
    private final char[] values;

    public CharSpreadBuilder(int i5) {
        super(i5);
        this.values = new char[i5];
    }

    public final void add(char c5) {
        char[] cArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        cArr[position] = c5;
    }

    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    public final char[] toArray() {
        return toArray(this.values, new char[size()]);
    }
}
