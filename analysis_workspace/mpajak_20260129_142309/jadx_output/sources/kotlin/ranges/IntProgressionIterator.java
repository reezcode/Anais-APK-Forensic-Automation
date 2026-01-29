package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

/* loaded from: classes2.dex */
public final class IntProgressionIterator extends IntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public IntProgressionIterator(int i5, int i6, int i7) {
        this.step = i7;
        this.finalElement = i6;
        boolean z4 = true;
        if (i7 <= 0 ? i5 < i6 : i5 > i6) {
            z4 = false;
        }
        this.hasNext = z4;
        this.next = z4 ? i5 : i6;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i5 = this.next;
        if (i5 != this.finalElement) {
            this.next = this.step + i5;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i5;
    }
}
