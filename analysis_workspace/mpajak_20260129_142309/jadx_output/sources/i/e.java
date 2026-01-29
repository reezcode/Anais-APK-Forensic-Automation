package i;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class e extends d {

    /* renamed from: s, reason: collision with root package name */
    public static final ThreadLocal<char[]> f3195s = new ThreadLocal<>();

    /* renamed from: r, reason: collision with root package name */
    public char[] f3196r;

    @Override // i.d
    public final String N0(int i5, int i6) {
        if (i6 >= 0) {
            return new String(this.f3196r, i5, i6);
        }
        throw new StringIndexOutOfBoundsException(i6);
    }

    @Override // i.d
    public final char[] O0(int i5, int i6) {
        if (i6 < 0) {
            throw new StringIndexOutOfBoundsException(i6);
        }
        if (i5 == 0) {
            return this.f3196r;
        }
        char[] cArr = new char[i6];
        System.arraycopy(this.f3196r, i5, cArr, 0, i6);
        return cArr;
    }

    @Override // i.d, i.c
    public final BigDecimal U() {
        int i5 = this.f3188i;
        if (i5 == -1) {
            i5 = 0;
        }
        char p02 = p0((this.f3187h + i5) - 1);
        int i6 = this.f3187h;
        if (p02 == 'L' || p02 == 'S' || p02 == 'B' || p02 == 'F' || p02 == 'D') {
            i6--;
        }
        return new BigDecimal(this.f3196r, i5, i6);
    }

    @Override // i.c
    public final byte[] a0() {
        int i5;
        if (this.f3181b == 26) {
            throw new f.d("TODO");
        }
        char[] cArr = this.f3196r;
        int i6 = this.f3188i + 1;
        int i7 = this.f3187h;
        Properties properties = m.e.f4081a;
        int i8 = 0;
        if (i7 == 0) {
            return new byte[0];
        }
        int i9 = (i6 + i7) - 1;
        while (i6 < i9 && m.e.f4096p[cArr[i6]] < 0) {
            i6++;
        }
        while (i9 > 0 && m.e.f4096p[cArr[i9]] < 0) {
            i9--;
        }
        int i10 = cArr[i9] == '=' ? cArr[i9 + (-1)] == '=' ? 2 : 1 : 0;
        int i11 = (i9 - i6) + 1;
        if (i7 > 76) {
            i5 = (cArr[76] == '\r' ? i11 / 78 : 0) << 1;
        } else {
            i5 = 0;
        }
        int i12 = (((i11 - i5) * 6) >> 3) - i10;
        byte[] bArr = new byte[i12];
        int i13 = (i12 / 3) * 3;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int[] iArr = m.e.f4096p;
            int i16 = i6 + 1;
            int i17 = i16 + 1;
            int i18 = (iArr[cArr[i6]] << 18) | (iArr[cArr[i16]] << 12);
            int i19 = i17 + 1;
            int i20 = i18 | (iArr[cArr[i17]] << 6);
            int i21 = i19 + 1;
            int i22 = i20 | iArr[cArr[i19]];
            int i23 = i14 + 1;
            bArr[i14] = (byte) (i22 >> 16);
            int i24 = i23 + 1;
            bArr[i23] = (byte) (i22 >> 8);
            int i25 = i24 + 1;
            bArr[i24] = (byte) i22;
            if (i5 <= 0 || (i15 = i15 + 1) != 19) {
                i6 = i21;
            } else {
                i6 = i21 + 2;
                i15 = 0;
            }
            i14 = i25;
        }
        if (i14 < i12) {
            int i26 = 0;
            while (i6 <= i9 - i10) {
                i26 |= m.e.f4096p[cArr[i6]] << (18 - (i8 * 6));
                i8++;
                i6++;
            }
            int i27 = 16;
            while (i14 < i12) {
                bArr[i14] = (byte) (i26 >> i27);
                i27 -= 8;
                i14++;
            }
        }
        return bArr;
    }

    @Override // i.d, i.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        char[] cArr = this.f3196r;
        if (cArr.length <= 65536) {
            f3195s.set(cArr);
        }
        this.f3196r = null;
        Properties properties = m.e.f4081a;
    }

    @Override // i.d, i.c
    public final String i0() {
        int i5 = this.f3188i;
        if (i5 == -1) {
            i5 = 0;
        }
        char p02 = p0((this.f3187h + i5) - 1);
        int i6 = this.f3187h;
        if (p02 == 'L' || p02 == 'S' || p02 == 'B' || p02 == 'F' || p02 == 'D') {
            i6--;
        }
        return new String(this.f3196r, i5, i6);
    }

    @Override // i.d, i.c
    public final String k0() {
        if (this.f3189j) {
            return new String(this.f3186g, 0, this.f3187h);
        }
        int i5 = this.f3188i + 1;
        if (i5 < 0) {
            throw new IllegalStateException();
        }
        char[] cArr = this.f3196r;
        int length = cArr.length;
        int i6 = this.f3187h;
        if (i5 <= length - i6) {
            return new String(cArr, i5, i6);
        }
        throw new IllegalStateException();
    }

    @Override // i.d
    public final String m0(int i5, int i6, int i7, j jVar) {
        return jVar.b(this.f3196r, i5, i6, i7);
    }

    @Override // i.d, i.c
    public final boolean n() {
        int i5 = 0;
        while (true) {
            char c5 = this.f3196r[i5];
            if (c5 == 26) {
                this.f3181b = 20;
                return true;
            }
            if (!d.t0(c5)) {
                return false;
            }
            i5++;
        }
    }

    @Override // i.d
    public final void n0(int i5, char[] cArr, int i6) {
        System.arraycopy(this.f3196r, i5, cArr, 0, i6);
    }

    @Override // i.d, i.c
    public final char next() {
        int i5 = this.f3185f + 1;
        this.f3185f = i5;
        if (i5 < 0) {
            char c5 = this.f3196r[i5];
            this.f3184e = c5;
            return c5;
        }
        int i6 = this.f3187h;
        if (i6 > 0) {
            int i7 = 0 - i6;
            if (this.f3184e == '\"' && i7 > 0) {
                i7--;
            }
            char[] cArr = this.f3196r;
            System.arraycopy(cArr, i7, cArr, 0, i6);
        }
        this.f3188i = -1;
        int i8 = this.f3187h;
        this.f3185f = i8;
        try {
            char[] cArr2 = this.f3196r;
            if (cArr2.length - i8 == 0) {
                char[] cArr3 = new char[cArr2.length * 2];
                System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
                this.f3196r = cArr3;
            }
            throw null;
        } catch (IOException e5) {
            throw new f.d(e5.getMessage(), e5);
        }
    }

    @Override // i.d
    public final boolean o0(char[] cArr) {
        for (int i5 = 0; i5 < cArr.length; i5++) {
            if (p0(this.f3185f + i5) != cArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // i.d
    public final char p0(int i5) {
        if (i5 < 0) {
            return this.f3196r[i5];
        }
        int i6 = this.f3185f;
        if (i6 == 0) {
            char[] cArr = this.f3196r;
            System.arraycopy(cArr, i6, new char[(cArr.length * 3) / 2], 0, 0);
            throw null;
        }
        int i7 = 0 - i6;
        if (i7 > 0) {
            char[] cArr2 = this.f3196r;
            System.arraycopy(cArr2, i6, cArr2, 0, i7);
        }
        try {
            int length = this.f3196r.length;
            throw null;
        } catch (IOException e5) {
            throw new f.d(e5.getMessage(), e5);
        }
    }

    @Override // i.d
    public final void q0(int i5, int i6, char[] cArr) {
        System.arraycopy(this.f3196r, i5, cArr, 0, i6);
    }

    @Override // i.d
    public final int r0(int i5) {
        int i6 = i5 - this.f3185f;
        while (true) {
            char p02 = p0(this.f3185f + i6);
            if ('\"' == p02) {
                return i6 + this.f3185f;
            }
            if (p02 == 26) {
                return -1;
            }
            i6++;
        }
    }

    @Override // i.d
    public final boolean s0() {
        int i5 = this.f3185f;
        char[] cArr = this.f3196r;
        if (i5 != cArr.length) {
            return this.f3184e == 26 && i5 + 1 == cArr.length;
        }
        return true;
    }
}
