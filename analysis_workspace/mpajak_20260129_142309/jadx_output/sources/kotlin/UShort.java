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
/* loaded from: classes20.dex */
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* loaded from: classes21.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s4) {
        this.data = s4;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m287andxj2QHRw(short s4, short s5) {
        return m294constructorimpl((short) (s4 & s5));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m288boximpl(short s4) {
        return new UShort(s4);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m289compareTo7apg3OU(short s4, byte b5) {
        return Intrinsics.compare(s4 & 65535, b5 & 255);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m290compareToVKZWuLQ(short s4, long j5) {
        return UnsignedKt.ulongCompare(ULong.m188constructorimpl(s4 & 65535), j5);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m291compareToWZ4Q5Ns(short s4, int i5) {
        return UnsignedKt.uintCompare(UInt.m110constructorimpl(s4 & 65535), i5);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m292compareToxj2QHRw(short s4) {
        return Intrinsics.compare(m343unboximpl() & 65535, s4 & 65535);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m293compareToxj2QHRw(short s4, short s5) {
        return Intrinsics.compare(s4 & 65535, s5 & 65535);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m294constructorimpl(short s4) {
        return s4;
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m295decMh2AYeg(short s4) {
        return m294constructorimpl((short) (s4 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m296div7apg3OU(short s4, byte b5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m297divVKZWuLQ(short s4, long j5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(s4 & 65535), j5);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m298divWZ4Q5Ns(short s4, int i5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), i5);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m299divxj2QHRw(short s4, short s5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(s5 & 65535));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m300equalsimpl(short s4, Object obj) {
        return (obj instanceof UShort) && s4 == ((UShort) obj).m343unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m301equalsimpl0(short s4, short s5) {
        return s4 == s5;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m302floorDiv7apg3OU(short s4, byte b5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m303floorDivVKZWuLQ(short s4, long j5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(s4 & 65535), j5);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m304floorDivWZ4Q5Ns(short s4, int i5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), i5);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m305floorDivxj2QHRw(short s4, short s5) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(s5 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m306hashCodeimpl(short s4) {
        return s4;
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m307incMh2AYeg(short s4) {
        return m294constructorimpl((short) (s4 + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m308invMh2AYeg(short s4) {
        return m294constructorimpl((short) (~s4));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m309minus7apg3OU(short s4, byte b5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) - UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m310minusVKZWuLQ(short s4, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(s4 & 65535) - j5);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m311minusWZ4Q5Ns(short s4, int i5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) - i5);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m312minusxj2QHRw(short s4, short s5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) - UInt.m110constructorimpl(s5 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m313mod7apg3OU(short s4, byte b5) {
        return UByte.m34constructorimpl((byte) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(b5 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m314modVKZWuLQ(short s4, long j5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(s4 & 65535), j5);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m315modWZ4Q5Ns(short s4, int i5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), i5);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m316modxj2QHRw(short s4, short s5) {
        return m294constructorimpl((short) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(s5 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m317orxj2QHRw(short s4, short s5) {
        return m294constructorimpl((short) (s4 | s5));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m318plus7apg3OU(short s4, byte b5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) + UInt.m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m319plusVKZWuLQ(short s4, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(s4 & 65535) + j5);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m320plusWZ4Q5Ns(short s4, int i5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) + i5);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m321plusxj2QHRw(short s4, short s5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s5 & 65535) + UInt.m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m322rangeToxj2QHRw(short s4, short s5) {
        return new UIntRange(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(s5 & 65535), null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m323rem7apg3OU(short s4, byte b5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m324remVKZWuLQ(short s4, long j5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(s4 & 65535), j5);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m325remWZ4Q5Ns(short s4, int i5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), i5);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m326remxj2QHRw(short s4, short s5) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(s5 & 65535));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m327times7apg3OU(short s4, byte b5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b5 & 255) * UInt.m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m328timesVKZWuLQ(short s4, long j5) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(s4 & 65535) * j5);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m329timesWZ4Q5Ns(short s4, int i5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s4 & 65535) * i5);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m330timesxj2QHRw(short s4, short s5) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s5 & 65535) * UInt.m110constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m331toByteimpl(short s4) {
        return (byte) s4;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m332toDoubleimpl(short s4) {
        return s4 & 65535;
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m333toFloatimpl(short s4) {
        return s4 & 65535;
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m334toIntimpl(short s4) {
        return s4 & 65535;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m335toLongimpl(short s4) {
        return s4 & 65535;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m336toShortimpl(short s4) {
        return s4;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m337toStringimpl(short s4) {
        return String.valueOf(s4 & 65535);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m338toUBytew2LRezQ(short s4) {
        return UByte.m34constructorimpl((byte) s4);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m339toUIntpVg5ArA(short s4) {
        return UInt.m110constructorimpl(s4 & 65535);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m340toULongsVKNKU(short s4) {
        return ULong.m188constructorimpl(s4 & 65535);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m341toUShortMh2AYeg(short s4) {
        return s4;
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m342xorxj2QHRw(short s4, short s5) {
        return m294constructorimpl((short) (s4 ^ s5));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m343unboximpl() & 65535, uShort.m343unboximpl() & 65535);
    }

    public boolean equals(Object obj) {
        return m300equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m306hashCodeimpl(this.data);
    }

    public String toString() {
        return m337toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m343unboximpl() {
        return this.data;
    }
}
