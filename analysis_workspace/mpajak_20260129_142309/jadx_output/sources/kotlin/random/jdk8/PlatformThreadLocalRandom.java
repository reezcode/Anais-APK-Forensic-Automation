package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;

/* loaded from: classes16.dex */
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.AbstractPlatformRandom
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current()");
        return current;
    }

    @Override // kotlin.random.Random
    public double nextDouble(double d5) {
        return ThreadLocalRandom.current().nextDouble(d5);
    }

    @Override // kotlin.random.Random
    public int nextInt(int i5, int i6) {
        return ThreadLocalRandom.current().nextInt(i5, i6);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j5) {
        return ThreadLocalRandom.current().nextLong(j5);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j5, long j6) {
        return ThreadLocalRandom.current().nextLong(j5, j6);
    }
}
