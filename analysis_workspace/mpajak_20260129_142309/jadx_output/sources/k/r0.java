package k;

import java.lang.reflect.Type;
import org.apache.commons.io.IOUtils;

/* loaded from: classes9.dex */
public final class r0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static r0 f3741a = new r0();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullListAsEmpty);
            return;
        }
        int i6 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            a1Var.write(91);
            while (i6 < iArr.length) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                a1Var.z(iArr[i6]);
                i6++;
            }
            a1Var.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            a1Var.write(91);
            while (i6 < sArr.length) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                a1Var.z(sArr[i6]);
                i6++;
            }
            a1Var.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            a1Var.write(91);
            while (i6 < jArr.length) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                a1Var.A(jArr[i6]);
                i6++;
            }
            a1Var.write(93);
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            a1Var.write(91);
            while (i6 < zArr.length) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                a1Var.write(zArr[i6] ? "true" : "false");
                i6++;
            }
            a1Var.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            a1Var.write(91);
            while (i6 < fArr.length) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                float f5 = fArr[i6];
                if (Float.isNaN(f5)) {
                    a1Var.E();
                } else {
                    a1Var.a(Float.toString(f5));
                }
                i6++;
            }
            a1Var.write(93);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            a1Var.write(91);
            while (i6 < dArr.length) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                double d5 = dArr[i6];
                if (Double.isNaN(d5)) {
                    a1Var.E();
                } else {
                    a1Var.a(Double.toString(d5));
                }
                i6++;
            }
            a1Var.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            a1Var.n((byte[]) obj);
            return;
        }
        char[] cArr = (char[]) obj;
        if (!a1Var.f3636f) {
            a1Var.K(new String(cArr), (char) 0);
            return;
        }
        int length = cArr.length;
        int i7 = a1Var.f3633c + length + 2;
        if (i7 > a1Var.f3632b.length) {
            if (a1Var.f3635e != null) {
                a1Var.write(39);
                while (i6 < cArr.length) {
                    char c5 = cArr[i6];
                    if (c5 <= '\r' || c5 == '\\' || c5 == '\'' || (c5 == '/' && a1Var.l(b1.WriteSlashAsSpecial))) {
                        a1Var.write(92);
                        c5 = m.e.f4089i[c5];
                    }
                    a1Var.write(c5);
                    i6++;
                }
                a1Var.write(39);
                return;
            }
            a1Var.e(i7);
        }
        int i8 = a1Var.f3633c;
        int i9 = i8 + 1;
        int i10 = length + i9;
        char[] cArr2 = a1Var.f3632b;
        cArr2[i8] = '\'';
        System.arraycopy(cArr, 0, cArr2, i9, cArr.length);
        a1Var.f3633c = i7;
        int i11 = -1;
        char c6 = 0;
        for (int i12 = i9; i12 < i10; i12++) {
            char c7 = a1Var.f3632b[i12];
            if (c7 <= '\r' || c7 == '\\' || c7 == '\'' || (c7 == '/' && a1Var.l(b1.WriteSlashAsSpecial))) {
                i6++;
                i11 = i12;
                c6 = c7;
            }
        }
        int i13 = i7 + i6;
        if (i13 > a1Var.f3632b.length) {
            a1Var.e(i13);
        }
        a1Var.f3633c = i13;
        if (i6 == 1) {
            char[] cArr3 = a1Var.f3632b;
            int i14 = i11 + 1;
            System.arraycopy(cArr3, i14, cArr3, i11 + 2, (i10 - i11) - 1);
            char[] cArr4 = a1Var.f3632b;
            cArr4[i11] = IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr4[i14] = m.e.f4089i[c6];
        } else if (i6 > 1) {
            char[] cArr5 = a1Var.f3632b;
            int i15 = i11 + 1;
            System.arraycopy(cArr5, i15, cArr5, i11 + 2, (i10 - i11) - 1);
            char[] cArr6 = a1Var.f3632b;
            cArr6[i11] = IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr6[i15] = m.e.f4089i[c6];
            int i16 = i10 + 1;
            for (int i17 = i15 - 2; i17 >= i9; i17--) {
                char c8 = a1Var.f3632b[i17];
                if (c8 <= '\r' || c8 == '\\' || c8 == '\'' || (c8 == '/' && a1Var.l(b1.WriteSlashAsSpecial))) {
                    char[] cArr7 = a1Var.f3632b;
                    int i18 = i17 + 1;
                    System.arraycopy(cArr7, i18, cArr7, i17 + 2, (i16 - i17) - 1);
                    char[] cArr8 = a1Var.f3632b;
                    cArr8[i17] = IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr8[i18] = m.e.f4089i[c8];
                    i16++;
                }
            }
        }
        a1Var.f3632b[a1Var.f3633c - 1] = '\'';
    }
}
