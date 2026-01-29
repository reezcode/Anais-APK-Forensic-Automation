package h;

import com.tencent.smtt.sdk.TbsListener;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public h f3028a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3029b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3030c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3031d;

    /* renamed from: e, reason: collision with root package name */
    public int f3032e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3033f;

    /* renamed from: g, reason: collision with root package name */
    public a f3034g = new a();

    /* renamed from: h, reason: collision with root package name */
    public int f3035h;

    /* renamed from: i, reason: collision with root package name */
    public int f3036i;

    public h(c cVar, String str, String str2, String[] strArr) {
        if (cVar.f3005p == null) {
            cVar.f3005p = this;
        } else {
            cVar.f3006q.f3028a = this;
        }
        cVar.f3006q = this;
        this.f3029b = cVar;
        this.f3030c = cVar.d(str);
        this.f3031d = cVar.d(str2);
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f3032e = length;
        this.f3033f = new int[length];
        for (int i5 = 0; i5 < this.f3032e; i5++) {
            this.f3033f[i5] = cVar.b(strArr[i5]).f3010a;
        }
    }

    public final void a(int i5, String str, String str2, String str3) {
        c cVar = this.f3029b;
        cVar.f2997h.a(9, str, str2, str3);
        e a5 = cVar.a(cVar.f2997h);
        if (a5 == null) {
            int i6 = cVar.b(str).f3010a;
            int i7 = cVar.c(str2, str3).f3010a;
            a aVar = cVar.f2992c;
            aVar.c(9, i6);
            aVar.g(i7);
            int i8 = cVar.f2991b;
            cVar.f2991b = i8 + 1;
            a5 = new e(i8, cVar.f2997h);
            cVar.e(a5);
        }
        this.f3034g.c(i5, a5.f3010a);
    }

    public final void b(int i5) {
        a aVar = this.f3034g;
        aVar.d(TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL);
        aVar.b(i5, 1);
    }

    public final void c(int i5) {
        this.f3034g.d(i5);
    }

    public final void d(int i5, int i6) {
        this.f3034g.b(i5, i6);
    }

    public final void e(int i5, f fVar) {
        int i6;
        if ((fVar.f3019a & 2) != 0 && fVar.f3020b - this.f3034g.f2984b < -32768) {
            throw new UnsupportedOperationException();
        }
        this.f3034g.d(i5);
        a aVar = this.f3034g;
        int i7 = aVar.f2984b;
        int i8 = i7 - 1;
        if ((fVar.f3019a & 2) == 0) {
            if (fVar.f3022d == null) {
                fVar.f3022d = new int[6];
            }
            int i9 = fVar.f3021c;
            int[] iArr = fVar.f3022d;
            if (i9 >= iArr.length) {
                int[] iArr2 = new int[iArr.length + 6];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                fVar.f3022d = iArr2;
            }
            int[] iArr3 = fVar.f3022d;
            int i10 = fVar.f3021c;
            int i11 = i10 + 1;
            fVar.f3021c = i11;
            iArr3[i10] = i8;
            fVar.f3021c = i11 + 1;
            iArr3[i11] = i7;
            i6 = -1;
        } else {
            i6 = fVar.f3020b - i8;
        }
        aVar.g(i6);
    }

    public final void f(f fVar) {
        a aVar = this.f3034g;
        int i5 = aVar.f2984b;
        byte[] bArr = aVar.f2983a;
        fVar.f3019a |= 2;
        fVar.f3020b = i5;
        int i6 = 0;
        while (i6 < fVar.f3021c) {
            int[] iArr = fVar.f3022d;
            int i7 = i6 + 1;
            int i8 = iArr[i6];
            int i9 = iArr[i7];
            int i10 = i5 - i8;
            bArr[i9] = (byte) (i10 >>> 8);
            bArr[i9 + 1] = (byte) i10;
            i6 = i7 + 1;
        }
    }

    public final void g(Object obj) {
        e b5;
        a aVar;
        int i5;
        c cVar = this.f3029b;
        Objects.requireNonNull(cVar);
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            e eVar = cVar.f2995f;
            eVar.f3011b = 3;
            eVar.f3012c = intValue;
            eVar.f3017h = (intValue + 3) & Integer.MAX_VALUE;
            b5 = cVar.a(eVar);
            if (b5 == null) {
                a aVar2 = cVar.f2992c;
                aVar2.d(3);
                aVar2.f(intValue);
                int i6 = cVar.f2991b;
                cVar.f2991b = i6 + 1;
                b5 = new e(i6, cVar.f2995f);
                cVar.e(b5);
            }
        } else if (obj instanceof String) {
            String str = (String) obj;
            cVar.f2996g.a(8, str, null, null);
            b5 = cVar.a(cVar.f2996g);
            if (b5 == null) {
                cVar.f2992c.c(8, cVar.d(str));
                int i7 = cVar.f2991b;
                cVar.f2991b = i7 + 1;
                b5 = new e(i7, cVar.f2996g);
                cVar.e(b5);
            }
        } else {
            if (!(obj instanceof i)) {
                throw new IllegalArgumentException(androidx.appcompat.widget.a.i("value ", obj));
            }
            i iVar = (i) obj;
            b5 = cVar.b(iVar.f3046a == 10 ? new String(iVar.f3047b, iVar.f3048c, iVar.f3049d) : new String(iVar.f3047b, iVar.f3048c, iVar.f3049d));
        }
        int i8 = b5.f3010a;
        int i9 = b5.f3011b;
        if (i9 == 5 || i9 == 6) {
            aVar = this.f3034g;
            i5 = 20;
        } else if (i8 < 256) {
            this.f3034g.b(18, i8);
            return;
        } else {
            aVar = this.f3034g;
            i5 = 19;
        }
        aVar.c(i5, i8);
    }

    public final void h(int i5) {
        this.f3035h = 10;
        this.f3036i = i5;
    }

    public final void i(int i5, String str, String str2, String str3) {
        int i6;
        int i7 = 1;
        boolean z4 = i5 == 185;
        c cVar = this.f3029b;
        int i8 = z4 ? 11 : 10;
        cVar.f2997h.a(i8, str, str2, str3);
        e a5 = cVar.a(cVar.f2997h);
        if (a5 == null) {
            int i9 = cVar.b(str).f3010a;
            int i10 = cVar.c(str2, str3).f3010a;
            a aVar = cVar.f2992c;
            aVar.c(i8, i9);
            aVar.g(i10);
            int i11 = cVar.f2991b;
            cVar.f2991b = i11 + 1;
            a5 = new e(i11, cVar.f2997h);
            cVar.e(a5);
        }
        int i12 = a5.f3012c;
        if (!z4) {
            this.f3034g.c(i5, a5.f3010a);
            return;
        }
        if (i12 == 0) {
            int i13 = 1;
            int i14 = 1;
            while (true) {
                i6 = i13 + 1;
                char charAt = str3.charAt(i13);
                if (charAt == ')') {
                    break;
                }
                if (charAt == 'L') {
                    while (true) {
                        i13 = i6 + 1;
                        if (str3.charAt(i6) == ';') {
                            break;
                        } else {
                            i6 = i13;
                        }
                    }
                    i14++;
                } else {
                    i14 = (charAt == 'D' || charAt == 'J') ? i14 + 2 : i14 + 1;
                    i13 = i6;
                }
            }
            char charAt2 = str3.charAt(i6);
            int i15 = i14 << 2;
            if (charAt2 == 'V') {
                i7 = 0;
            } else if (charAt2 == 'D' || charAt2 == 'J') {
                i7 = 2;
            }
            i12 = i15 | i7;
            a5.f3012c = i12;
        }
        a aVar2 = this.f3034g;
        aVar2.c(185, a5.f3010a);
        aVar2.b(i12 >> 2, 0);
    }

    public final void j(int i5, String str) {
        this.f3034g.c(i5, this.f3029b.b(str).f3010a);
    }

    public final void k(int i5, int i6) {
        if (i6 < 4 && i5 != 169) {
            this.f3034g.d((i5 < 54 ? ((i5 - 21) << 2) + 26 : ((i5 - 54) << 2) + 59) + i6);
        } else {
            if (i6 < 256) {
                this.f3034g.b(i5, i6);
                return;
            }
            a aVar = this.f3034g;
            aVar.d(196);
            aVar.c(i5, i6);
        }
    }
}
