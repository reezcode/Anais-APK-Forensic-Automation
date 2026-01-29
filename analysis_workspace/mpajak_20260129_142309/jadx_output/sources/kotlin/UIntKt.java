package kotlin;

import kotlin.internal.InlineOnly;

/* loaded from: classes23.dex */
public final class UIntKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(byte b5) {
        return UInt.m110constructorimpl(b5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(double d5) {
        return UnsignedKt.doubleToUInt(d5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(float f5) {
        return UnsignedKt.doubleToUInt(f5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(int i5) {
        return UInt.m110constructorimpl(i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(long j5) {
        return UInt.m110constructorimpl((int) j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int toUInt(short s4) {
        return UInt.m110constructorimpl(s4);
    }
}
