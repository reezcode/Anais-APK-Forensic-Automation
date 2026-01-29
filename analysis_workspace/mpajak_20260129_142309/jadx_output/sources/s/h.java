package s;

/* loaded from: classes21.dex */
public final class h implements a<int[]> {
    @Override // s.a
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // s.a
    public final int b(int[] iArr) {
        return iArr.length;
    }

    @Override // s.a
    public final int c() {
        return 4;
    }

    @Override // s.a
    public final int[] newArray(int i5) {
        return new int[i5];
    }
}
