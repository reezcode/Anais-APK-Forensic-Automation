package kotlin.random;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.apache.commons.io.FilenameUtils;

@SinceKotlin(version = "1.3")
/* loaded from: classes17.dex */
public abstract class Random {
    public static final Default Default = new Default(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    /* loaded from: classes20.dex */
    public static final class Default extends Random implements Serializable {

        /* loaded from: classes14.dex */
        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.Default;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int i5) {
            return Random.defaultRandom.nextBits(i5);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int i5) {
            return Random.defaultRandom.nextBytes(i5);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int i5, int i6) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, i5, i6);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d5) {
            return Random.defaultRandom.nextDouble(d5);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double d5, double d6) {
            return Random.defaultRandom.nextDouble(d5, d6);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int i5) {
            return Random.defaultRandom.nextInt(i5);
        }

        @Override // kotlin.random.Random
        public int nextInt(int i5, int i6) {
            return Random.defaultRandom.nextInt(i5, i6);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long j5) {
            return Random.defaultRandom.nextLong(j5);
        }

        @Override // kotlin.random.Random
        public long nextLong(long j5, long j6) {
            return Random.defaultRandom.nextLong(j5, j6);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return random.nextBytes(bArr, i5, i6);
    }

    public abstract int nextBits(int i5);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(int i5) {
        return nextBytes(new byte[i5]);
    }

    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(byte[] array, int i5, int i6) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!(new IntRange(0, array.length).contains(i5) && new IntRange(0, array.length).contains(i6))) {
            throw new IllegalArgumentException(("fromIndex (" + i5 + ") or toIndex (" + i6 + ") are out of range: 0.." + array.length + FilenameUtils.EXTENSION_SEPARATOR).toString());
        }
        if (!(i5 <= i6)) {
            throw new IllegalArgumentException(("fromIndex (" + i5 + ") must be not greater than toIndex (" + i6 + ").").toString());
        }
        int i7 = (i6 - i5) / 4;
        for (int i8 = 0; i8 < i7; i8++) {
            int nextInt = nextInt();
            array[i5] = (byte) nextInt;
            array[i5 + 1] = (byte) (nextInt >>> 8);
            array[i5 + 2] = (byte) (nextInt >>> 16);
            array[i5 + 3] = (byte) (nextInt >>> 24);
            i5 += 4;
        }
        int i9 = i6 - i5;
        int nextBits = nextBits(i9 * 8);
        for (int i10 = 0; i10 < i9; i10++) {
            array[i5 + i10] = (byte) (nextBits >>> (i10 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double d5) {
        return nextDouble(0.0d, d5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.RandomKt.checkRangeBounds(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L3e
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r7 + r4
            double r7 = r7 + r4
            goto L45
        L3e:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L45:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4f
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.nextDouble(double, double):double");
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int i5) {
        return nextInt(0, i5);
    }

    public int nextInt(int i5, int i6) {
        int nextInt;
        int i7;
        int i8;
        int nextInt2;
        boolean z4;
        RandomKt.checkRangeBounds(i5, i6);
        int i9 = i6 - i5;
        if (i9 <= 0 && i9 != Integer.MIN_VALUE) {
            do {
                nextInt2 = nextInt();
                z4 = false;
                if (i5 <= nextInt2 && nextInt2 < i6) {
                    z4 = true;
                }
            } while (!z4);
            return nextInt2;
        }
        if (((-i9) & i9) == i9) {
            i8 = nextBits(RandomKt.fastLog2(i9));
        } else {
            do {
                nextInt = nextInt() >>> 1;
                i7 = nextInt % i9;
            } while ((i9 - 1) + (nextInt - i7) < 0);
            i8 = i7;
        }
        return i5 + i8;
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public long nextLong(long j5) {
        return nextLong(0L, j5);
    }

    public long nextLong(long j5, long j6) {
        long nextLong;
        boolean z4;
        long nextLong2;
        long j7;
        long j8;
        int nextInt;
        RandomKt.checkRangeBounds(j5, j6);
        long j9 = j6 - j5;
        if (j9 <= 0) {
            do {
                nextLong = nextLong();
                z4 = false;
                if (j5 <= nextLong && nextLong < j6) {
                    z4 = true;
                }
            } while (!z4);
            return nextLong;
        }
        if (((-j9) & j9) == j9) {
            int i5 = (int) j9;
            int i6 = (int) (j9 >>> 32);
            if (i5 != 0) {
                nextInt = nextBits(RandomKt.fastLog2(i5));
            } else if (i6 == 1) {
                nextInt = nextInt();
            } else {
                j8 = (nextBits(RandomKt.fastLog2(i6)) << 32) + (nextInt() & 4294967295L);
            }
            j8 = nextInt & 4294967295L;
        } else {
            do {
                nextLong2 = nextLong() >>> 1;
                j7 = nextLong2 % j9;
            } while ((j9 - 1) + (nextLong2 - j7) < 0);
            j8 = j7;
        }
        return j5 + j8;
    }
}
