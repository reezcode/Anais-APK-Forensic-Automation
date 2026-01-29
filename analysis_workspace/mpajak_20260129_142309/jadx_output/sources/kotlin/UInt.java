package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;

@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class UInt implements Comparable<UInt> {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UInt(int i5) {
        this.data = i5;
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m103andWZ4Q5Ns(int i5, int i6) {
        return m110constructorimpl(i5 & i6);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m104boximpl(int i5) {
        return new UInt(i5);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m105compareTo7apg3OU(int i5, byte b5) {
        return UnsignedKt.uintCompare(i5, m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m106compareToVKZWuLQ(int i5, long j5) {
        return UnsignedKt.ulongCompare(ULong.m188constructorimpl(i5 & 4294967295L), j5);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m107compareToWZ4Q5Ns(int i5) {
        return UnsignedKt.uintCompare(m161unboximpl(), i5);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m108compareToWZ4Q5Ns(int i5, int i6) {
        return UnsignedKt.uintCompare(i5, i6);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m109compareToxj2QHRw(int i5, short s4) {
        return UnsignedKt.uintCompare(i5, m110constructorimpl(s4 & 65535));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m110constructorimpl(int i5) {
        return i5;
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m111decpVg5ArA(int i5) {
        return m110constructorimpl(i5 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m112div7apg3OU(int i5, byte b5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(i5, m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m113divVKZWuLQ(int i5, long j5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(i5 & 4294967295L), j5);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m114divWZ4Q5Ns(int i5, int i6) {
        return UnsignedKt.m363uintDivideJ1ME1BU(i5, i6);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m115divxj2QHRw(int i5, short s4) {
        return UnsignedKt.m363uintDivideJ1ME1BU(i5, m110constructorimpl(s4 & 65535));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m116equalsimpl(int i5, Object obj) {
        return (obj instanceof UInt) && i5 == ((UInt) obj).m161unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m117equalsimpl0(int i5, int i6) {
        return i5 == i6;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m118floorDiv7apg3OU(int i5, byte b5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(i5, m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m119floorDivVKZWuLQ(int i5, long j5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(i5 & 4294967295L), j5);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m120floorDivWZ4Q5Ns(int i5, int i6) {
        return UnsignedKt.m363uintDivideJ1ME1BU(i5, i6);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m121floorDivxj2QHRw(int i5, short s4) {
        return UnsignedKt.m363uintDivideJ1ME1BU(i5, m110constructorimpl(s4 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m122hashCodeimpl(int i5) {
        return i5;
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m123incpVg5ArA(int i5) {
        return m110constructorimpl(i5 + 1);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m124invpVg5ArA(int i5) {
        return m110constructorimpl(~i5);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m125minus7apg3OU(int i5, byte b5) {
        return m110constructorimpl(i5 - m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m126minusVKZWuLQ(int i5, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(i5 & 4294967295L) - j5);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m127minusWZ4Q5Ns(int i5, int i6) {
        return m110constructorimpl(i5 - i6);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m128minusxj2QHRw(int i5, short s4) {
        return m110constructorimpl(i5 - m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m129mod7apg3OU(int i5, byte b5) {
        return UByte.m34constructorimpl((byte) UnsignedKt.m364uintRemainderJ1ME1BU(i5, m110constructorimpl(b5 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m130modVKZWuLQ(int i5, long j5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(i5 & 4294967295L), j5);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m131modWZ4Q5Ns(int i5, int i6) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(i5, i6);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m132modxj2QHRw(int i5, short s4) {
        return UShort.m294constructorimpl((short) UnsignedKt.m364uintRemainderJ1ME1BU(i5, m110constructorimpl(s4 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m133orWZ4Q5Ns(int i5, int i6) {
        return m110constructorimpl(i5 | i6);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m134plus7apg3OU(int i5, byte b5) {
        return m110constructorimpl(m110constructorimpl(b5 & 255) + i5);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m135plusVKZWuLQ(int i5, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(i5 & 4294967295L) + j5);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m136plusWZ4Q5Ns(int i5, int i6) {
        return m110constructorimpl(i5 + i6);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m137plusxj2QHRw(int i5, short s4) {
        return m110constructorimpl(m110constructorimpl(s4 & 65535) + i5);
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m138rangeToWZ4Q5Ns(int i5, int i6) {
        return new UIntRange(i5, i6, null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m139rem7apg3OU(int i5, byte b5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(i5, m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m140remVKZWuLQ(int i5, long j5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(i5 & 4294967295L), j5);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m141remWZ4Q5Ns(int i5, int i6) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(i5, i6);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m142remxj2QHRw(int i5, short s4) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(i5, m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m143shlpVg5ArA(int i5, int i6) {
        return m110constructorimpl(i5 << i6);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m144shrpVg5ArA(int i5, int i6) {
        return m110constructorimpl(i5 >>> i6);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m145times7apg3OU(int i5, byte b5) {
        return m110constructorimpl(m110constructorimpl(b5 & 255) * i5);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m146timesVKZWuLQ(int i5, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(i5 & 4294967295L) * j5);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m147timesWZ4Q5Ns(int i5, int i6) {
        return m110constructorimpl(i5 * i6);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m148timesxj2QHRw(int i5, short s4) {
        return m110constructorimpl(m110constructorimpl(s4 & 65535) * i5);
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m149toByteimpl(int i5) {
        return (byte) i5;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m150toDoubleimpl(int i5) {
        return UnsignedKt.uintToDouble(i5);
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m151toFloatimpl(int i5) {
        return (float) UnsignedKt.uintToDouble(i5);
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m152toIntimpl(int i5) {
        return i5;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m153toLongimpl(int i5) {
        return i5 & 4294967295L;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m154toShortimpl(int i5) {
        return (short) i5;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m155toStringimpl(int i5) {
        return String.valueOf(i5 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m156toUBytew2LRezQ(int i5) {
        return UByte.m34constructorimpl((byte) i5);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m157toUIntpVg5ArA(int i5) {
        return i5;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m158toULongsVKNKU(int i5) {
        return ULong.m188constructorimpl(i5 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m159toUShortMh2AYeg(int i5) {
        return UShort.m294constructorimpl((short) i5);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m160xorWZ4Q5Ns(int i5, int i6) {
        return m110constructorimpl(i5 ^ i6);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m161unboximpl(), uInt.m161unboximpl());
    }

    public boolean equals(Object obj) {
        return m116equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m122hashCodeimpl(this.data);
    }

    public String toString() {
        return m155toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m161unboximpl() {
        return this.data;
    }
}
