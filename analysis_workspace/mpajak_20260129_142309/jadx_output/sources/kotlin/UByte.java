package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;

@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class UByte implements Comparable<UByte> {
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* loaded from: classes24.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b5) {
        this.data = b5;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m27and7apg3OU(byte b5, byte b6) {
        return m34constructorimpl((byte) (b5 & b6));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m28boximpl(byte b5) {
        return new UByte(b5);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m29compareTo7apg3OU(byte b5) {
        return Intrinsics.compare(m83unboximpl() & 255, b5 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m30compareTo7apg3OU(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m31compareToVKZWuLQ(byte b5, long j5) {
        return UnsignedKt.ulongCompare(ULong.m188constructorimpl(b5 & 255), j5);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m32compareToWZ4Q5Ns(byte b5, int i5) {
        return UnsignedKt.uintCompare(UInt.m110constructorimpl(b5 & 255), i5);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m33compareToxj2QHRw(byte b5, short s4) {
        return Intrinsics.compare(b5 & 255, s4 & 65535);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m34constructorimpl(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m35decw2LRezQ(byte b5) {
        return m34constructorimpl((byte) (b5 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m36div7apg3OU(byte b5, byte b6) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m37divVKZWuLQ(byte b5, long j5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(b5 & 255), j5);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m38divWZ4Q5Ns(byte b5, int i5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b5 & 255), i5);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m39divxj2QHRw(byte b5, short s4) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(s4 & 65535));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m40equalsimpl(byte b5, Object obj) {
        return (obj instanceof UByte) && b5 == ((UByte) obj).m83unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m41equalsimpl0(byte b5, byte b6) {
        return b5 == b6;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m42floorDiv7apg3OU(byte b5, byte b6) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m43floorDivVKZWuLQ(byte b5, long j5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(b5 & 255), j5);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m44floorDivWZ4Q5Ns(byte b5, int i5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b5 & 255), i5);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m45floorDivxj2QHRw(byte b5, short s4) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(s4 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m46hashCodeimpl(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m47incw2LRezQ(byte b5) {
        return m34constructorimpl((byte) (b5 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m48invw2LRezQ(byte b5) {
        return m34constructorimpl((byte) (~b5));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m49minus7apg3OU(byte b5, byte b6) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) - UInt.m110constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m50minusVKZWuLQ(byte b5, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(b5 & 255) - j5);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m51minusWZ4Q5Ns(byte b5, int i5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) - i5);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m52minusxj2QHRw(byte b5, short s4) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) - UInt.m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m53mod7apg3OU(byte b5, byte b6) {
        return m34constructorimpl((byte) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(b6 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m54modVKZWuLQ(byte b5, long j5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(b5 & 255), j5);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m55modWZ4Q5Ns(byte b5, int i5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b5 & 255), i5);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m56modxj2QHRw(byte b5, short s4) {
        return UShort.m294constructorimpl((short) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(s4 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m57or7apg3OU(byte b5, byte b6) {
        return m34constructorimpl((byte) (b5 | b6));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m58plus7apg3OU(byte b5, byte b6) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b6 & 255) + UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m59plusVKZWuLQ(byte b5, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(b5 & 255) + j5);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m60plusWZ4Q5Ns(byte b5, int i5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) + i5);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m61plusxj2QHRw(byte b5, short s4) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) + UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m62rangeTo7apg3OU(byte b5, byte b6) {
        return new UIntRange(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(b6 & 255), null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m63rem7apg3OU(byte b5, byte b6) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(b6 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m64remVKZWuLQ(byte b5, long j5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(b5 & 255), j5);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m65remWZ4Q5Ns(byte b5, int i5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b5 & 255), i5);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m66remxj2QHRw(byte b5, short s4) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m67times7apg3OU(byte b5, byte b6) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b6 & 255) * UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m68timesVKZWuLQ(byte b5, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(b5 & 255) * j5);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m69timesWZ4Q5Ns(byte b5, int i5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) * i5);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m70timesxj2QHRw(byte b5, short s4) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) * UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m71toByteimpl(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m72toDoubleimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m73toFloatimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m74toIntimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m75toLongimpl(byte b5) {
        return b5 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m76toShortimpl(byte b5) {
        return (short) (b5 & 255);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m77toStringimpl(byte b5) {
        return String.valueOf(b5 & 255);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m78toUBytew2LRezQ(byte b5) {
        return b5;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m79toUIntpVg5ArA(byte b5) {
        return UInt.m110constructorimpl(b5 & 255);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m80toULongsVKNKU(byte b5) {
        return ULong.m188constructorimpl(b5 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m81toUShortMh2AYeg(byte b5) {
        return UShort.m294constructorimpl((short) (b5 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m82xor7apg3OU(byte b5, byte b6) {
        return m34constructorimpl((byte) (b5 ^ b6));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m83unboximpl() & 255, uByte.m83unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m40equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m46hashCodeimpl(this.data);
    }

    public String toString() {
        return m77toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m83unboximpl() {
        return this.data;
    }
}
