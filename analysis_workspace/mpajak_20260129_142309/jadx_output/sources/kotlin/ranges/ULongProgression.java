package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    /* loaded from: classes23.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final ULongProgression m1256fromClosedRange7ftBX0g(long j5, long j6, long j7) {
            return new ULongProgression(j5, j6, j7, null);
        }
    }

    private ULongProgression(long j5, long j6, long j7) {
        if (j7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j7 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j5;
        this.last = UProgressionUtilKt.m1230getProgressionLastElement7ftBX0g(j5, j6, j7);
        this.step = j7;
    }

    public /* synthetic */ ULongProgression(long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j5, j6, j7);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m1254getFirstsVKNKU() {
        return this.first;
    }

    /* renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m1255getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j5 = this.first;
        int m188constructorimpl = ((int) ULong.m188constructorimpl(j5 ^ ULong.m188constructorimpl(j5 >>> 32))) * 31;
        long j6 = this.last;
        int m188constructorimpl2 = (m188constructorimpl + ((int) ULong.m188constructorimpl(j6 ^ ULong.m188constructorimpl(j6 >>> 32)))) * 31;
        long j7 = this.step;
        return ((int) (j7 ^ (j7 >>> 32))) + m188constructorimpl2;
    }

    public boolean isEmpty() {
        long j5 = this.step;
        int ulongCompare = UnsignedKt.ulongCompare(this.first, this.last);
        if (j5 > 0) {
            if (ulongCompare > 0) {
                return true;
            }
        } else if (ulongCompare < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb;
        long j5;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m233toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) ULong.m233toStringimpl(this.last));
            sb.append(" step ");
            j5 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m233toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) ULong.m233toStringimpl(this.last));
            sb.append(" step ");
            j5 = -this.step;
        }
        sb.append(j5);
        return sb.toString();
    }
}
