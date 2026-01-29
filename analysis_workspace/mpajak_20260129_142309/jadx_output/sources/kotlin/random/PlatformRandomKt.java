package kotlin.random;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes22.dex */
public final class PlatformRandomKt {
    @SinceKotlin(version = "1.3")
    public static final java.util.Random asJavaRandom(Random random) {
        java.util.Random impl;
        Intrinsics.checkNotNullParameter(random, "<this>");
        AbstractPlatformRandom abstractPlatformRandom = random instanceof AbstractPlatformRandom ? (AbstractPlatformRandom) random : null;
        return (abstractPlatformRandom == null || (impl = abstractPlatformRandom.getImpl()) == null) ? new KotlinRandom(random) : impl;
    }

    @SinceKotlin(version = "1.3")
    public static final Random asKotlinRandom(java.util.Random random) {
        Random impl;
        Intrinsics.checkNotNullParameter(random, "<this>");
        KotlinRandom kotlinRandom = random instanceof KotlinRandom ? (KotlinRandom) random : null;
        return (kotlinRandom == null || (impl = kotlinRandom.getImpl()) == null) ? new PlatformRandom(random) : impl;
    }

    @InlineOnly
    private static final Random defaultPlatformRandom() {
        return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();
    }

    public static final double doubleFromParts(int i5, int i6) {
        return ((i5 << 27) + i6) / 9.007199254740992E15d;
    }
}
