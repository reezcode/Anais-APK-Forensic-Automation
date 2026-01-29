package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public class UIntProgression implements Iterable<UInt>, KMappedMarker {
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final UIntProgression m1247fromClosedRangeNkh28Cs(int i5, int i6, int i7) {
            return new UIntProgression(i5, i6, i7, null);
        }
    }

    private UIntProgression(int i5, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i5;
        this.last = UProgressionUtilKt.m1231getProgressionLastElementNkh28Cs(i5, i6, i7);
        this.step = i7;
    }

    public /* synthetic */ UIntProgression(int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i6, i7);
    }

    public boolean equals(Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (this.first != uIntProgression.first || this.last != uIntProgression.last || this.step != uIntProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m1245getFirstpVg5ArA() {
        return this.first;
    }

    /* renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m1246getLastpVg5ArA() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (UnsignedKt.uintCompare(this.first, this.last) > 0) {
                return true;
            }
        } else if (UnsignedKt.uintCompare(this.first, this.last) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    public String toString() {
        StringBuilder sb;
        int i5;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m155toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) UInt.m155toStringimpl(this.last));
            sb.append(" step ");
            i5 = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m155toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) UInt.m155toStringimpl(this.last));
            sb.append(" step ");
            i5 = -this.step;
        }
        sb.append(i5);
        return sb.toString();
    }
}
