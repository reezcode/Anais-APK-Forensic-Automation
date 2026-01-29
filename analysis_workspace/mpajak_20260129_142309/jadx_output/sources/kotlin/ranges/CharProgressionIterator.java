package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class CharProgressionIterator extends CharIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public CharProgressionIterator(char c5, char c6, int i5) {
        this.step = i5;
        this.finalElement = c6;
        boolean z4 = true;
        if (i5 <= 0 ? Intrinsics.compare((int) c5, (int) c6) < 0 : Intrinsics.compare((int) c5, (int) c6) > 0) {
            z4 = false;
        }
        this.hasNext = z4;
        this.next = z4 ? c5 : c6;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i5 = this.next;
        if (i5 != this.finalElement) {
            this.next = this.step + i5;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return (char) i5;
    }
}
