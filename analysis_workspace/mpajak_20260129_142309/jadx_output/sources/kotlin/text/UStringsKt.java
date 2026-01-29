package kotlin.text;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.KotlinNothingValueException;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "UStringsKt")
/* loaded from: classes12.dex */
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m1325toStringJSWoG40(long j5, int i5) {
        return UnsignedKt.ulongToString(j5, CharsKt__CharJVMKt.checkRadix(i5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m1326toStringLxnNnR4(byte b5, int i5) {
        String num = Integer.toString(b5 & 255, CharsKt__CharJVMKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m1327toStringV7xB4Y4(int i5, int i6) {
        String l5 = Long.toString(i5 & 4294967295L, CharsKt__CharJVMKt.checkRadix(i6));
        Intrinsics.checkNotNullExpressionValue(l5, "toString(this, checkRadix(radix))");
        return l5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m1328toStringolVBNx4(short s4, int i5) {
        String num = Integer.toString(s4 & 65535, CharsKt__CharJVMKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.m83unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final byte toUByte(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i5);
        if (uByteOrNull != null) {
            return uByteOrNull.m83unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UByte toUByteOrNull(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i5);
        if (uIntOrNull == null) {
            return null;
        }
        int m161unboximpl = uIntOrNull.m161unboximpl();
        if (UnsignedKt.uintCompare(m161unboximpl, UInt.m110constructorimpl(255)) > 0) {
            return null;
        }
        return UByte.m28boximpl(UByte.m34constructorimpl((byte) m161unboximpl));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.m161unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int toUInt(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i5);
        if (uIntOrNull != null) {
            return uIntOrNull.m161unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UInt toUIntOrNull(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        int i7 = 1;
        if (Intrinsics.compare((int) charAt, 48) >= 0) {
            i7 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int m110constructorimpl = UInt.m110constructorimpl(i5);
        int i8 = 119304647;
        while (i7 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i7), i5);
            if (digitOf < 0) {
                return null;
            }
            if (UnsignedKt.uintCompare(i6, i8) > 0) {
                if (i8 == 119304647) {
                    i8 = UnsignedKt.m363uintDivideJ1ME1BU(-1, m110constructorimpl);
                    if (UnsignedKt.uintCompare(i6, i8) > 0) {
                    }
                }
                return null;
            }
            int m110constructorimpl2 = UInt.m110constructorimpl(i6 * m110constructorimpl);
            int m110constructorimpl3 = UInt.m110constructorimpl(UInt.m110constructorimpl(digitOf) + m110constructorimpl2);
            if (UnsignedKt.uintCompare(m110constructorimpl3, m110constructorimpl2) < 0) {
                return null;
            }
            i7++;
            i6 = m110constructorimpl3;
        }
        return UInt.m104boximpl(i6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.m239unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long toULong(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i5);
        if (uLongOrNull != null) {
            return uLongOrNull.m239unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULong toULongOrNull(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j5 = -1;
        int i6 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i6 = 1;
        }
        long m188constructorimpl = ULong.m188constructorimpl(i5);
        long j6 = 0;
        long j7 = 512409557603043100L;
        while (i6 < length) {
            if (CharsKt__CharJVMKt.digitOf(str.charAt(i6), i5) < 0) {
                return null;
            }
            if (UnsignedKt.ulongCompare(j6, j7) > 0) {
                if (j7 == 512409557603043100L) {
                    j7 = UnsignedKt.m365ulongDivideeb3DHEI(j5, m188constructorimpl);
                    if (UnsignedKt.ulongCompare(j6, j7) > 0) {
                    }
                }
                return null;
            }
            long m188constructorimpl2 = ULong.m188constructorimpl(j6 * m188constructorimpl);
            long m188constructorimpl3 = ULong.m188constructorimpl(ULong.m188constructorimpl(UInt.m110constructorimpl(r15) & 4294967295L) + m188constructorimpl2);
            if (UnsignedKt.ulongCompare(m188constructorimpl3, m188constructorimpl2) < 0) {
                return null;
            }
            i6++;
            j6 = m188constructorimpl3;
            j5 = -1;
        }
        return ULong.m182boximpl(j6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.m343unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final short toUShort(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i5);
        if (uShortOrNull != null) {
            return uShortOrNull.m343unboximpl();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UShort toUShortOrNull(String str, int i5) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i5);
        if (uIntOrNull == null) {
            return null;
        }
        int m161unboximpl = uIntOrNull.m161unboximpl();
        if (UnsignedKt.uintCompare(m161unboximpl, UInt.m110constructorimpl(65535)) > 0) {
            return null;
        }
        return UShort.m288boximpl(UShort.m294constructorimpl((short) m161unboximpl));
    }
}
