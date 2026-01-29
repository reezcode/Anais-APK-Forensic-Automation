package kotlin.ranges;

import java.util.Iterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes21.dex */
public class LongProgression implements Iterable<Long>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LongProgression fromClosedRange(long j5, long j6, long j7) {
            return new LongProgression(j5, j6, j7);
        }
    }

    public LongProgression(long j5, long j6, long j7) {
        if (j7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j7 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j5;
        this.last = ProgressionUtilKt.getProgressionLastElement(j5, j6, j7);
        this.step = j7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongProgression) {
            if (!isEmpty() || !((LongProgression) obj).isEmpty()) {
                LongProgression longProgression = (LongProgression) obj;
                if (this.first != longProgression.first || this.last != longProgression.last || this.step != longProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j5 = 31;
        long j6 = this.first;
        long j7 = this.last;
        long j8 = (((j6 ^ (j6 >>> 32)) * j5) + (j7 ^ (j7 >>> 32))) * j5;
        long j9 = this.step;
        return (int) (j8 + (j9 ^ (j9 >>> 32)));
    }

    public boolean isEmpty() {
        long j5 = this.step;
        long j6 = this.first;
        long j7 = this.last;
        if (j5 > 0) {
            if (j6 > j7) {
                return true;
            }
        } else if (j6 < j7) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb;
        long j5;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append("..");
            sb.append(this.last);
            sb.append(" step ");
            j5 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append(this.first);
            sb.append(" downTo ");
            sb.append(this.last);
            sb.append(" step ");
            j5 = -this.step;
        }
        sb.append(j5);
        return sb.toString();
    }
}
