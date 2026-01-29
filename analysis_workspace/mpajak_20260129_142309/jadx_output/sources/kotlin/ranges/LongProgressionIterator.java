package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* loaded from: classes17.dex */
public final class LongProgressionIterator extends LongIterator {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public LongProgressionIterator(long j5, long j6, long j7) {
        this.step = j7;
        this.finalElement = j6;
        boolean z4 = true;
        if (j7 <= 0 ? j5 < j6 : j5 > j6) {
            z4 = false;
        }
        this.hasNext = z4;
        this.next = z4 ? j5 : j6;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j5 = this.next;
        if (j5 != this.finalElement) {
            this.next = this.step + j5;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j5;
    }
}
