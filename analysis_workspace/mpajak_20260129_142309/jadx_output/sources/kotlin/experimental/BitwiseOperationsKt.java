package kotlin.experimental;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* loaded from: classes19.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b5, byte b6) {
        return (byte) (b5 & b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s4, short s5) {
        return (short) (s4 & s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b5) {
        return (byte) (~b5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s4) {
        return (short) (~s4);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(byte b5, byte b6) {
        return (byte) (b5 | b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(short s4, short s5) {
        return (short) (s4 | s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b5, byte b6) {
        return (byte) (b5 ^ b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s4, short s5) {
        return (short) (s4 ^ s5);
    }
}
