package kotlin.coroutines.jvm.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;

@JvmName(name = "Boxing")
/* loaded from: classes12.dex */
public final class Boxing {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Boolean boxBoolean(boolean z4) {
        return Boolean.valueOf(z4);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Byte boxByte(byte b5) {
        return Byte.valueOf(b5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Character boxChar(char c5) {
        return new Character(c5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Double boxDouble(double d5) {
        return new Double(d5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Float boxFloat(float f5) {
        return new Float(f5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Integer boxInt(int i5) {
        return new Integer(i5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Long boxLong(long j5) {
        return new Long(j5);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final Short boxShort(short s4) {
        return new Short(s4);
    }
}
