package f4;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class x extends i {

    /* renamed from: g, reason: collision with root package name */
    public final transient byte[][] f2905g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int[] f2906h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(byte[][] segments, int[] directory) {
        super(i.f2860e.f2864d);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f2905g = segments;
        this.f2906h = directory;
    }

    @Override // f4.i
    public final String a() {
        return m().a();
    }

    @Override // f4.i
    public final i b(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = this.f2905g.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int[] iArr = this.f2906h;
            int i7 = iArr[length + i5];
            int i8 = iArr[i5];
            messageDigest.update(this.f2905g[i5], i7, i8 - i6);
            i5++;
            i6 = i8;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
        return new i(digest);
    }

    @Override // f4.i
    public final int c() {
        return this.f2906h[this.f2905g.length - 1];
    }

    @Override // f4.i
    public final String d() {
        return m().d();
    }

    @Override // f4.i
    public final byte[] e() {
        return j();
    }

    @Override // f4.i
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (iVar.c() != c() || !h(iVar, c())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // f4.i
    public final byte f(int i5) {
        b.b(this.f2906h[this.f2905g.length - 1], i5, 1L);
        int y4 = i.g.y(this, i5);
        int i6 = y4 == 0 ? 0 : this.f2906h[y4 - 1];
        int[] iArr = this.f2906h;
        byte[][] bArr = this.f2905g;
        return bArr[y4][(i5 - i6) + iArr[bArr.length + y4]];
    }

    @Override // f4.i
    public final boolean g(int i5, byte[] other, int i6, int i7) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i5 < 0 || i5 > c() - i7 || i6 < 0 || i6 > other.length - i7) {
            return false;
        }
        int i8 = i7 + i5;
        int y4 = i.g.y(this, i5);
        while (i5 < i8) {
            int i9 = y4 == 0 ? 0 : this.f2906h[y4 - 1];
            int[] iArr = this.f2906h;
            int i10 = iArr[y4] - i9;
            int i11 = iArr[this.f2905g.length + y4];
            int min = Math.min(i8, i10 + i9) - i5;
            if (!b.a(this.f2905g[y4], (i5 - i9) + i11, other, i6, min)) {
                return false;
            }
            i6 += min;
            i5 += min;
            y4++;
        }
        return true;
    }

    @Override // f4.i
    public final boolean h(i other, int i5) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (c() - i5 < 0) {
            return false;
        }
        int i6 = i5 + 0;
        int y4 = i.g.y(this, 0);
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = y4 == 0 ? 0 : this.f2906h[y4 - 1];
            int[] iArr = this.f2906h;
            int i10 = iArr[y4] - i9;
            int i11 = iArr[this.f2905g.length + y4];
            int min = Math.min(i6, i10 + i9) - i7;
            if (!other.g(i8, this.f2905g[y4], (i7 - i9) + i11, min)) {
                return false;
            }
            i8 += min;
            i7 += min;
            y4++;
        }
        return true;
    }

    @Override // f4.i
    public final int hashCode() {
        int i5 = this.f2862b;
        if (i5 != 0) {
            return i5;
        }
        int length = this.f2905g.length;
        int i6 = 0;
        int i7 = 1;
        int i8 = 0;
        while (i6 < length) {
            int[] iArr = this.f2906h;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            byte[] bArr = this.f2905g[i6];
            int i11 = (i10 - i8) + i9;
            while (i9 < i11) {
                i7 = (i7 * 31) + bArr[i9];
                i9++;
            }
            i6++;
            i8 = i10;
        }
        this.f2862b = i7;
        return i7;
    }

    @Override // f4.i
    public final i i() {
        return m().i();
    }

    @Override // f4.i
    public final byte[] j() {
        byte[] bArr = new byte[c()];
        int length = this.f2905g.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f2906h;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            int i10 = i9 - i6;
            ArraysKt.copyInto(this.f2905g[i5], bArr, i7, i8, i8 + i10);
            i7 += i10;
            i5++;
            i6 = i9;
        }
        return bArr;
    }

    @Override // f4.i
    public final void l(f buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i6 = i5 + 0;
        int y4 = i.g.y(this, 0);
        int i7 = 0;
        while (i7 < i6) {
            int i8 = y4 == 0 ? 0 : this.f2906h[y4 - 1];
            int[] iArr = this.f2906h;
            int i9 = iArr[y4] - i8;
            int i10 = iArr[this.f2905g.length + y4];
            int min = Math.min(i6, i9 + i8) - i7;
            int i11 = (i7 - i8) + i10;
            v vVar = new v(this.f2905g[y4], i11, i11 + min, true, false);
            v vVar2 = buffer.f2851b;
            if (vVar2 == null) {
                vVar.f2900g = vVar;
                vVar.f2899f = vVar;
                buffer.f2851b = vVar;
            } else {
                Intrinsics.checkNotNull(vVar2);
                v vVar3 = vVar2.f2900g;
                Intrinsics.checkNotNull(vVar3);
                vVar3.b(vVar);
            }
            i7 += min;
            y4++;
        }
        buffer.f2852c += c();
    }

    public final i m() {
        return new i(j());
    }

    @Override // f4.i
    public final String toString() {
        return m().toString();
    }
}
