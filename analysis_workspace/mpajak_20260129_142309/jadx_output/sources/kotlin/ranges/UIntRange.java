package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes6.dex */
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {
    public static final Companion Companion;
    private static final UIntRange EMPTY;

    /* loaded from: classes20.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UIntRange getEMPTY() {
            return UIntRange.EMPTY;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        EMPTY = new UIntRange(-1, 0, defaultConstructorMarker);
    }

    private UIntRange(int i5, int i6) {
        super(i5, i6, 1, null);
    }

    public /* synthetic */ UIntRange(int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i5, i6);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    /* renamed from: getEndExclusive-pVg5ArA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1249getEndExclusivepVg5ArA$annotations() {
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(UInt uInt) {
        return m1250containsWZ4Q5Ns(uInt.m161unboximpl());
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m1250containsWZ4Q5Ns(int i5) {
        return UnsignedKt.uintCompare(m1245getFirstpVg5ArA(), i5) <= 0 && UnsignedKt.uintCompare(i5, m1246getLastpVg5ArA()) <= 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public boolean equals(Object obj) {
        if (obj instanceof UIntRange) {
            if (!isEmpty() || !((UIntRange) obj).isEmpty()) {
                UIntRange uIntRange = (UIntRange) obj;
                if (m1245getFirstpVg5ArA() != uIntRange.m1245getFirstpVg5ArA() || m1246getLastpVg5ArA() != uIntRange.m1246getLastpVg5ArA()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ UInt getEndExclusive() {
        return UInt.m104boximpl(m1251getEndExclusivepVg5ArA());
    }

    /* renamed from: getEndExclusive-pVg5ArA, reason: not valid java name */
    public int m1251getEndExclusivepVg5ArA() {
        if (m1246getLastpVg5ArA() != -1) {
            return UInt.m110constructorimpl(m1246getLastpVg5ArA() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ UInt getEndInclusive() {
        return UInt.m104boximpl(m1252getEndInclusivepVg5ArA());
    }

    /* renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public int m1252getEndInclusivepVg5ArA() {
        return m1246getLastpVg5ArA();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ UInt getStart() {
        return UInt.m104boximpl(m1253getStartpVg5ArA());
    }

    /* renamed from: getStart-pVg5ArA, reason: not valid java name */
    public int m1253getStartpVg5ArA() {
        return m1245getFirstpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m1245getFirstpVg5ArA() * 31) + m1246getLastpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return UnsignedKt.uintCompare(m1245getFirstpVg5ArA(), m1246getLastpVg5ArA()) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public String toString() {
        return ((Object) UInt.m155toStringimpl(m1245getFirstpVg5ArA())) + ".." + ((Object) UInt.m155toStringimpl(m1246getLastpVg5ArA()));
    }
}
