package z3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f6335a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6336b = new int[10];

    public final int a() {
        if ((this.f6335a & 128) != 0) {
            return this.f6336b[7];
        }
        return 65535;
    }

    public final void b(u other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i5 = 0; i5 < 10; i5++) {
            if (((1 << i5) & other.f6335a) != 0) {
                c(i5, other.f6336b[i5]);
            }
        }
    }

    public final u c(int i5, int i6) {
        if (i5 >= 0) {
            int[] iArr = this.f6336b;
            if (i5 < iArr.length) {
                this.f6335a = (1 << i5) | this.f6335a;
                iArr[i5] = i6;
            }
        }
        return this;
    }
}
