package kotlin.jvm.internal;

import kotlin.ranges.IntRange;

/* loaded from: classes16.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i5) {
        this.size = i5;
        this.spreads = (T[]) new Object[i5];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i5 = this.position;
        this.position = i5 + 1;
        tArr[i5] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(T t4);

    public final void setPosition(int i5) {
        this.position = i5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final int size() {
        int i5 = 0;
        ?? it = new IntRange(0, this.size - 1).iterator();
        while (it.hasNext()) {
            T t4 = this.spreads[it.nextInt()];
            i5 += t4 != null ? getSize(t4) : 1;
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public final T toArray(T values, T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        ?? it = new IntRange(0, this.size - 1).iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t4 = this.spreads[nextInt];
            if (t4 != null) {
                if (i5 < nextInt) {
                    int i7 = nextInt - i5;
                    System.arraycopy(values, i5, result, i6, i7);
                    i6 += i7;
                }
                int size = getSize(t4);
                System.arraycopy(t4, 0, result, i6, size);
                i6 += size;
                i5 = nextInt + 1;
            }
        }
        int i8 = this.size;
        if (i5 < i8) {
            System.arraycopy(values, i5, result, i6, i8 - i5);
        }
        return result;
    }
}
