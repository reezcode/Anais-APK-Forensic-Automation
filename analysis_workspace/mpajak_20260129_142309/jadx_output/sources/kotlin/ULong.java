package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;

@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes11.dex */
public final class ULong implements Comparable<ULong> {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

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
    private /* synthetic */ ULong(long j5) {
        this.data = j5;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m181andVKZWuLQ(long j5, long j6) {
        return m188constructorimpl(j5 & j6);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m182boximpl(long j5) {
        return new ULong(j5);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m183compareTo7apg3OU(long j5, byte b5) {
        return UnsignedKt.ulongCompare(j5, m188constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m184compareToVKZWuLQ(long j5) {
        return UnsignedKt.ulongCompare(m239unboximpl(), j5);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m185compareToVKZWuLQ(long j5, long j6) {
        return UnsignedKt.ulongCompare(j5, j6);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m186compareToWZ4Q5Ns(long j5, int i5) {
        return UnsignedKt.ulongCompare(j5, m188constructorimpl(i5 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m187compareToxj2QHRw(long j5, short s4) {
        return UnsignedKt.ulongCompare(j5, m188constructorimpl(s4 & 65535));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m188constructorimpl(long j5) {
        return j5;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m189decsVKNKU(long j5) {
        return m188constructorimpl(j5 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m190div7apg3OU(long j5, byte b5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m191divVKZWuLQ(long j5, long j6) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, j6);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m192divWZ4Q5Ns(long j5, int i5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl(i5 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m193divxj2QHRw(long j5, short s4) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl(s4 & 65535));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m194equalsimpl(long j5, Object obj) {
        return (obj instanceof ULong) && j5 == ((ULong) obj).m239unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m195equalsimpl0(long j5, long j6) {
        return j5 == j6;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m196floorDiv7apg3OU(long j5, byte b5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m197floorDivVKZWuLQ(long j5, long j6) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, j6);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m198floorDivWZ4Q5Ns(long j5, int i5) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl(i5 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m199floorDivxj2QHRw(long j5, short s4) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl(s4 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m200hashCodeimpl(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m201incsVKNKU(long j5) {
        return m188constructorimpl(j5 + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m202invsVKNKU(long j5) {
        return m188constructorimpl(~j5);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m203minus7apg3OU(long j5, byte b5) {
        return m188constructorimpl(j5 - m188constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m204minusVKZWuLQ(long j5, long j6) {
        return m188constructorimpl(j5 - j6);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m205minusWZ4Q5Ns(long j5, int i5) {
        return m188constructorimpl(j5 - m188constructorimpl(i5 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m206minusxj2QHRw(long j5, short s4) {
        return m188constructorimpl(j5 - m188constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m207mod7apg3OU(long j5, byte b5) {
        return UByte.m34constructorimpl((byte) UnsignedKt.m366ulongRemaindereb3DHEI(j5, m188constructorimpl(b5 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m208modVKZWuLQ(long j5, long j6) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j5, j6);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m209modWZ4Q5Ns(long j5, int i5) {
        return UInt.m110constructorimpl((int) UnsignedKt.m366ulongRemaindereb3DHEI(j5, m188constructorimpl(i5 & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m210modxj2QHRw(long j5, short s4) {
        return UShort.m294constructorimpl((short) UnsignedKt.m366ulongRemaindereb3DHEI(j5, m188constructorimpl(s4 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m211orVKZWuLQ(long j5, long j6) {
        return m188constructorimpl(j5 | j6);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m212plus7apg3OU(long j5, byte b5) {
        return m188constructorimpl(m188constructorimpl(b5 & 255) + j5);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m213plusVKZWuLQ(long j5, long j6) {
        return m188constructorimpl(j5 + j6);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m214plusWZ4Q5Ns(long j5, int i5) {
        return m188constructorimpl(m188constructorimpl(i5 & 4294967295L) + j5);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m215plusxj2QHRw(long j5, short s4) {
        return m188constructorimpl(m188constructorimpl(s4 & 65535) + j5);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m216rangeToVKZWuLQ(long j5, long j6) {
        return new ULongRange(j5, j6, null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m217rem7apg3OU(long j5, byte b5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j5, m188constructorimpl(b5 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m218remVKZWuLQ(long j5, long j6) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j5, j6);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m219remWZ4Q5Ns(long j5, int i5) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j5, m188constructorimpl(i5 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m220remxj2QHRw(long j5, short s4) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j5, m188constructorimpl(s4 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m221shlsVKNKU(long j5, int i5) {
        return m188constructorimpl(j5 << i5);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m222shrsVKNKU(long j5, int i5) {
        return m188constructorimpl(j5 >>> i5);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m223times7apg3OU(long j5, byte b5) {
        return m188constructorimpl(m188constructorimpl(b5 & 255) * j5);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m224timesVKZWuLQ(long j5, long j6) {
        return m188constructorimpl(j5 * j6);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m225timesWZ4Q5Ns(long j5, int i5) {
        return m188constructorimpl(m188constructorimpl(i5 & 4294967295L) * j5);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m226timesxj2QHRw(long j5, short s4) {
        return m188constructorimpl(m188constructorimpl(s4 & 65535) * j5);
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m227toByteimpl(long j5) {
        return (byte) j5;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m228toDoubleimpl(long j5) {
        return UnsignedKt.ulongToDouble(j5);
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m229toFloatimpl(long j5) {
        return (float) UnsignedKt.ulongToDouble(j5);
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m230toIntimpl(long j5) {
        return (int) j5;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m231toLongimpl(long j5) {
        return j5;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m232toShortimpl(long j5) {
        return (short) j5;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m233toStringimpl(long j5) {
        return UnsignedKt.ulongToString(j5);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m234toUBytew2LRezQ(long j5) {
        return UByte.m34constructorimpl((byte) j5);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m235toUIntpVg5ArA(long j5) {
        return UInt.m110constructorimpl((int) j5);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m236toULongsVKNKU(long j5) {
        return j5;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m237toUShortMh2AYeg(long j5) {
        return UShort.m294constructorimpl((short) j5);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m238xorVKZWuLQ(long j5, long j6) {
        return m188constructorimpl(j5 ^ j6);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m239unboximpl(), uLong.m239unboximpl());
    }

    public boolean equals(Object obj) {
        return m194equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m200hashCodeimpl(this.data);
    }

    public String toString() {
        return m233toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m239unboximpl() {
        return this.data;
    }
}
