package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v, reason: collision with root package name */
    private int f3911v;

    /* renamed from: w, reason: collision with root package name */
    private int f3912w;

    /* renamed from: x, reason: collision with root package name */
    private int f3913x;

    /* renamed from: y, reason: collision with root package name */
    private int f3914y;

    /* renamed from: z, reason: collision with root package name */
    private int f3915z;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public XorWowRandom(int i5, int i6) {
        this(i5, i6, 0, 0, ~i5, (i5 << 10) ^ (i6 >>> 4));
    }

    public XorWowRandom(int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f3913x = i5;
        this.f3914y = i6;
        this.f3915z = i7;
        this.f3912w = i8;
        this.f3911v = i9;
        this.addend = i10;
        int i11 = i5 | i6 | i7 | i8 | i9;
        if (!(i11 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i12 = 0; i12 < 64; i12++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int i5) {
        return RandomKt.takeUpperBits(nextInt(), i5);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i5 = this.f3913x;
        int i6 = i5 ^ (i5 >>> 2);
        this.f3913x = this.f3914y;
        this.f3914y = this.f3915z;
        this.f3915z = this.f3912w;
        int i7 = this.f3911v;
        this.f3912w = i7;
        int i8 = ((i6 ^ (i6 << 1)) ^ i7) ^ (i7 << 4);
        this.f3911v = i8;
        int i9 = this.addend + 362437;
        this.addend = i9;
        return i8 + i9;
    }
}
