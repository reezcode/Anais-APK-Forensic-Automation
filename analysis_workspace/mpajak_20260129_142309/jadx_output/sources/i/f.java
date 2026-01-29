package i;

import com.blankj.utilcode.constant.CacheConstants;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes15.dex */
public final class f extends d {

    /* renamed from: r, reason: collision with root package name */
    public final String f3197r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3198s;

    public f(String str) {
        this(str, f.a.f2683g);
    }

    public f(String str, int i5) {
        super(i5);
        this.f3197r = str;
        this.f3198s = str.length();
        this.f3185f = -1;
        next();
        if (this.f3184e == 65279) {
            next();
        }
    }

    public static boolean P0(String str, int i5, char[] cArr) {
        int length = cArr.length;
        if (length + i5 > str.length()) {
            return false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (cArr[i6] != str.charAt(i5 + i6)) {
                return false;
            }
        }
        return true;
    }

    public static boolean Q0(char c5, char c6, char c7, char c8, char c9, char c10, int i5, int i6) {
        if (c5 >= '1' && c5 <= '3' && c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
            if (c9 == '0') {
                if (c10 < '1' || c10 > '9') {
                    return false;
                }
            } else if (c9 != '1' || (c10 != '0' && c10 != '1' && c10 != '2')) {
                return false;
            }
            if (i5 == 48) {
                return i6 >= 49 && i6 <= 57;
            }
            if (i5 != 49 && i5 != 50) {
                return i5 == 51 && (i6 == 48 || i6 == 49);
            }
            if (i6 >= 48 && i6 <= 57) {
                return true;
            }
        }
        return false;
    }

    @Override // i.d
    public final Date A0(char[] cArr) {
        char c5;
        long j5;
        char c6;
        Date date;
        int i5;
        int i6;
        boolean z4 = false;
        this.f3193n = 0;
        int i7 = this.f3185f;
        char c7 = this.f3184e;
        if (!P0(this.f3197r, i7, cArr)) {
            this.f3193n = -2;
            return null;
        }
        int length = this.f3185f + cArr.length;
        int i8 = length + 1;
        char p02 = p0(length);
        if (p02 == '\"') {
            int r02 = r0(i8);
            if (r02 == -1) {
                throw new f.d("unclosed str");
            }
            this.f3185f = i8;
            if (!T0(false, r02 - i8)) {
                this.f3185f = i7;
                this.f3193n = -1;
                return null;
            }
            date = this.f3190k.getTime();
            c6 = p0(r02 + 1);
            this.f3185f = i7;
            while (c6 != ',' && c6 != '}') {
                if (!d.t0(c6)) {
                    this.f3193n = -1;
                    return null;
                }
                r02++;
                c6 = p0(r02 + 1);
            }
            this.f3185f = r02 + 1;
            this.f3184e = c6;
        } else {
            char c8 = '0';
            char c9 = '9';
            if (p02 != '-' && (p02 < '0' || p02 > '9')) {
                this.f3193n = -1;
                return null;
            }
            if (p02 == '-') {
                p02 = p0(i8);
                i8++;
                z4 = true;
            }
            if (p02 < '0' || p02 > '9') {
                c5 = p02;
                j5 = 0;
            } else {
                j5 = p02 - '0';
                while (true) {
                    i5 = i8 + 1;
                    c5 = p0(i8);
                    if (c5 < c8 || c5 > c9) {
                        break;
                    }
                    j5 = (j5 * 10) + (c5 - '0');
                    i8 = i5;
                    c8 = '0';
                    c9 = '9';
                }
                if (c5 == ',' || c5 == '}') {
                    this.f3185f = i5 - 1;
                }
            }
            if (j5 < 0) {
                this.f3193n = -1;
                return null;
            }
            if (z4) {
                j5 = -j5;
            }
            c6 = c5;
            date = new Date(j5);
        }
        if (c6 == ',') {
            int i9 = this.f3185f + 1;
            this.f3185f = i9;
            this.f3184e = p0(i9);
            this.f3193n = 3;
            this.f3181b = 16;
            return date;
        }
        int i10 = this.f3185f + 1;
        this.f3185f = i10;
        char p03 = p0(i10);
        if (p03 == ',') {
            this.f3181b = 16;
        } else {
            if (p03 == ']') {
                i6 = 15;
            } else {
                if (p03 != '}') {
                    if (p03 == 26) {
                        this.f3181b = 20;
                        this.f3193n = 4;
                        return date;
                    }
                    this.f3185f = i7;
                    this.f3184e = c7;
                    this.f3193n = -1;
                    return null;
                }
                i6 = 13;
            }
            this.f3181b = i6;
        }
        int i11 = this.f3185f + 1;
        this.f3185f = i11;
        this.f3184e = p0(i11);
        this.f3193n = 4;
        return date;
    }

    @Override // i.d
    public final int G0(char[] cArr) {
        int i5;
        char p02;
        int i6;
        this.f3193n = 0;
        int i7 = this.f3185f;
        char c5 = this.f3184e;
        if (!P0(this.f3197r, i7, cArr)) {
            this.f3193n = -2;
            return 0;
        }
        int length = this.f3185f + cArr.length;
        int i8 = length + 1;
        char p03 = p0(length);
        boolean z4 = p03 == '\"';
        if (z4) {
            p03 = p0(i8);
            i8++;
        }
        boolean z5 = p03 == '-';
        if (z5) {
            p03 = p0(i8);
            i8++;
        }
        if (p03 < '0' || p03 > '9') {
            this.f3193n = -1;
            return 0;
        }
        int i9 = p03 - '0';
        while (true) {
            i5 = i8 + 1;
            p02 = p0(i8);
            if (p02 < '0' || p02 > '9') {
                break;
            }
            i9 = (i9 * 10) + (p02 - '0');
            i8 = i5;
        }
        if (p02 == '.') {
            this.f3193n = -1;
            return 0;
        }
        if (i9 < 0) {
            this.f3193n = -1;
            return 0;
        }
        if (z4) {
            if (p02 != '\"') {
                this.f3193n = -1;
                return 0;
            }
            char p04 = p0(i5);
            i5++;
            p02 = p04;
        }
        while (p02 != ',' && p02 != '}') {
            if (!d.t0(p02)) {
                this.f3193n = -1;
                return 0;
            }
            char p05 = p0(i5);
            i5++;
            p02 = p05;
        }
        int i10 = i5 - 1;
        this.f3185f = i10;
        if (p02 == ',') {
            int i11 = i10 + 1;
            this.f3185f = i11;
            this.f3184e = p0(i11);
            this.f3193n = 3;
            this.f3181b = 16;
            return z5 ? -i9 : i9;
        }
        if (p02 == '}') {
            int i12 = i10 + 1;
            this.f3185f = i12;
            char p06 = p0(i12);
            while (p06 != ',') {
                if (p06 == ']') {
                    i6 = 15;
                } else if (p06 == '}') {
                    i6 = 13;
                } else {
                    if (p06 == 26) {
                        this.f3181b = 20;
                        break;
                    }
                    if (!d.t0(p06)) {
                        this.f3185f = i7;
                        this.f3184e = c5;
                        this.f3193n = -1;
                        return 0;
                    }
                    int i13 = this.f3185f + 1;
                    this.f3185f = i13;
                    p06 = p0(i13);
                }
                this.f3181b = i6;
                break;
            }
            this.f3181b = 16;
            int i14 = this.f3185f + 1;
            this.f3185f = i14;
            this.f3184e = p0(i14);
            this.f3193n = 4;
        }
        return z5 ? -i9 : i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // i.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long I0(char[] r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f.I0(char[]):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r9.f3194o;
     */
    @Override // i.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J0(char[] r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f.J0(char[]):java.lang.String");
    }

    @Override // i.d
    public final long K0(char[] cArr) {
        int i5;
        this.f3193n = 0;
        if (!P0(this.f3197r, this.f3185f, cArr)) {
            this.f3193n = -2;
            return 0L;
        }
        int length = this.f3185f + cArr.length;
        int i6 = length + 1;
        if (p0(length) != '\"') {
            this.f3193n = -1;
            return 0L;
        }
        long j5 = -3750763034362895579L;
        while (true) {
            int i7 = i6 + 1;
            char p02 = p0(i6);
            if (p02 == '\"') {
                this.f3185f = i7;
                char p03 = p0(i7);
                this.f3184e = p03;
                while (p03 != ',') {
                    if (p03 == '}') {
                        next();
                        J();
                        char c5 = this.f3184e;
                        if (c5 == ',') {
                            i5 = 16;
                        } else if (c5 == ']') {
                            i5 = 15;
                        } else {
                            if (c5 != '}') {
                                if (c5 != 26) {
                                    this.f3193n = -1;
                                    return 0L;
                                }
                                this.f3181b = 20;
                                this.f3193n = 4;
                                return j5;
                            }
                            i5 = 13;
                        }
                        this.f3181b = i5;
                        int i8 = this.f3185f + 1;
                        this.f3185f = i8;
                        this.f3184e = p0(i8);
                        this.f3193n = 4;
                        return j5;
                    }
                    if (!d.t0(p03)) {
                        this.f3193n = -1;
                        return 0L;
                    }
                    int i9 = this.f3185f + 1;
                    this.f3185f = i9;
                    p03 = p0(i9);
                }
                int i10 = this.f3185f + 1;
                this.f3185f = i10;
                this.f3184e = p0(i10);
                this.f3193n = 3;
                return j5;
            }
            if (i7 > this.f3198s) {
                this.f3193n = -1;
                return 0L;
            }
            j5 = (j5 ^ p02) * 1099511628211L;
            i6 = i7;
        }
    }

    @Override // i.d
    public final String N0(int i5, int i6) {
        if (!m.b.f4060a) {
            return this.f3197r.substring(i5, i6 + i5);
        }
        char[] cArr = this.f3186g;
        if (i6 < cArr.length) {
            this.f3197r.getChars(i5, i5 + i6, cArr, 0);
            return new String(this.f3186g, 0, i6);
        }
        char[] cArr2 = new char[i6];
        this.f3197r.getChars(i5, i6 + i5, cArr2, 0);
        return new String(cArr2);
    }

    @Override // i.d
    public final char[] O0(int i5, int i6) {
        if (m.b.f4060a) {
            char[] cArr = this.f3186g;
            if (i6 < cArr.length) {
                this.f3197r.getChars(i5, i6 + i5, cArr, 0);
                return this.f3186g;
            }
        }
        char[] cArr2 = new char[i6];
        this.f3197r.getChars(i5, i6 + i5, cArr2, 0);
        return cArr2;
    }

    @Override // i.d, i.c
    public final long P(char c5) {
        int i5;
        char p02;
        boolean z4 = false;
        this.f3193n = 0;
        int i6 = this.f3185f;
        int i7 = i6 + 1;
        char p03 = p0(i6);
        boolean z5 = p03 == '\"';
        if (z5) {
            int i8 = i7 + 1;
            char p04 = p0(i7);
            i7 = i8;
            p03 = p04;
        }
        boolean z6 = p03 == '-';
        if (z6) {
            int i9 = i7 + 1;
            char p05 = p0(i7);
            i7 = i9;
            p03 = p05;
        }
        char c6 = '0';
        if (p03 >= '0' && p03 <= '9') {
            long j5 = p03 - '0';
            while (true) {
                i5 = i7 + 1;
                p02 = p0(i7);
                if (p02 < c6 || p02 > '9') {
                    break;
                }
                j5 = (j5 * 10) + (p02 - '0');
                i7 = i5;
                c6 = '0';
            }
            if (p02 == '.') {
                this.f3193n = -1;
                return 0L;
            }
            if (z5) {
                if (p02 != '\"') {
                    this.f3193n = -1;
                    return 0L;
                }
                p02 = p0(i5);
                i5++;
            }
            if (j5 >= 0 || (j5 == Long.MIN_VALUE && z6)) {
                z4 = true;
            }
            if (!z4) {
                this.f3193n = -1;
                return 0L;
            }
            while (p02 != c5) {
                if (!d.t0(p02)) {
                    this.f3193n = -1;
                    return j5;
                }
                p02 = p0(i5);
                i5++;
            }
            this.f3185f = i5;
            this.f3184e = p0(i5);
            this.f3193n = 3;
            this.f3181b = 16;
            return z6 ? -j5 : j5;
        }
        if (p03 == 'n') {
            int i10 = i7 + 1;
            if (p0(i7) == 'u') {
                int i11 = i10 + 1;
                if (p0(i10) == 'l') {
                    int i12 = i11 + 1;
                    if (p0(i11) == 'l') {
                        this.f3193n = 5;
                        int i13 = i12 + 1;
                        char p06 = p0(i12);
                        if (z5 && p06 == '\"') {
                            int i14 = i13 + 1;
                            char p07 = p0(i13);
                            i13 = i14;
                            p06 = p07;
                        }
                        while (p06 != ',') {
                            if (p06 == ']') {
                                this.f3185f = i13;
                                this.f3184e = p0(i13);
                                this.f3193n = 5;
                                this.f3181b = 15;
                                return 0L;
                            }
                            if (!d.t0(p06)) {
                                this.f3193n = -1;
                                return 0L;
                            }
                            int i15 = i13 + 1;
                            char p08 = p0(i13);
                            i13 = i15;
                            p06 = p08;
                        }
                        this.f3185f = i13;
                        this.f3184e = p0(i13);
                        this.f3193n = 5;
                        this.f3181b = 16;
                        return 0L;
                    }
                }
            }
        }
        this.f3193n = -1;
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001d, code lost:
    
        if (r6 <= '4') goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R0(char r5, char r6, char r7, char r8, char r9, char r10) {
        /*
            r4 = this;
            r0 = 57
            r1 = 0
            r2 = 48
            if (r5 != r2) goto Lc
            if (r6 < r2) goto Lb
            if (r6 <= r0) goto L20
        Lb:
            return r1
        Lc:
            r3 = 49
            if (r5 != r3) goto L15
            if (r6 < r2) goto L14
            if (r6 <= r0) goto L20
        L14:
            return r1
        L15:
            r3 = 50
            if (r5 != r3) goto L42
            if (r6 < r2) goto L42
            r5 = 52
            if (r6 <= r5) goto L20
            goto L42
        L20:
            r5 = 53
            r6 = 54
            if (r7 < r2) goto L2d
            if (r7 > r5) goto L2d
            if (r8 < r2) goto L2c
            if (r8 <= r0) goto L32
        L2c:
            return r1
        L2d:
            if (r7 != r6) goto L42
            if (r8 == r2) goto L32
            return r1
        L32:
            if (r9 < r2) goto L3b
            if (r9 > r5) goto L3b
            if (r10 < r2) goto L3a
            if (r10 <= r0) goto L40
        L3a:
            return r1
        L3b:
            if (r9 != r6) goto L42
            if (r10 == r2) goto L40
            return r1
        L40:
            r5 = 1
            return r5
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f.R0(char, char, char, char, char, char):boolean");
    }

    public final boolean S0(boolean z4) {
        return T0(z4, this.f3198s - this.f3185f);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T0(boolean r36, int r37) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f.T0(boolean, int):boolean");
    }

    @Override // i.d, i.c
    public final BigDecimal U() {
        char p02 = p0((this.f3188i + this.f3187h) - 1);
        int i5 = this.f3187h;
        if (p02 == 'L' || p02 == 'S' || p02 == 'B' || p02 == 'F' || p02 == 'D') {
            i5--;
        }
        int i6 = this.f3188i;
        char[] cArr = this.f3186g;
        if (i5 < cArr.length) {
            this.f3197r.getChars(i6, i6 + i5, cArr, 0);
            return new BigDecimal(this.f3186g, 0, i5);
        }
        char[] cArr2 = new char[i5];
        this.f3197r.getChars(i6, i5 + i6, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    public final void U0(char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12) {
        Calendar calendar = Calendar.getInstance(this.f3191l, this.f3192m);
        this.f3190k = calendar;
        int i5 = c8 - '0';
        calendar.set(1, i5 + ((c7 - '0') * 10) + ((c6 - '0') * 100) + ((c5 - '0') * 1000));
        this.f3190k.set(2, ((c10 - '0') + ((c9 - '0') * 10)) - 1);
        this.f3190k.set(5, (c12 - '0') + ((c11 - '0') * 10));
    }

    @Override // i.d, i.c
    public final int V(char c5) {
        int i5;
        char p02;
        this.f3193n = 0;
        int i6 = this.f3185f;
        int i7 = i6 + 1;
        char p03 = p0(i6);
        while (d.t0(p03)) {
            int i8 = i7 + 1;
            char p04 = p0(i7);
            i7 = i8;
            p03 = p04;
        }
        boolean z4 = p03 == '\"';
        if (z4) {
            int i9 = i7 + 1;
            char p05 = p0(i7);
            i7 = i9;
            p03 = p05;
        }
        boolean z5 = p03 == '-';
        if (z5) {
            int i10 = i7 + 1;
            char p06 = p0(i7);
            i7 = i10;
            p03 = p06;
        }
        if (p03 >= '0' && p03 <= '9') {
            int i11 = p03 - '0';
            while (true) {
                i5 = i7 + 1;
                p02 = p0(i7);
                if (p02 < '0' || p02 > '9') {
                    break;
                }
                i11 = (i11 * 10) + (p02 - '0');
                i7 = i5;
            }
            if (p02 == '.') {
                this.f3193n = -1;
                return 0;
            }
            if (z4) {
                if (p02 != '\"') {
                    this.f3193n = -1;
                    return 0;
                }
                char p07 = p0(i5);
                i5++;
                p02 = p07;
            }
            if (i11 < 0) {
                this.f3193n = -1;
                return 0;
            }
            while (p02 != c5) {
                if (!d.t0(p02)) {
                    this.f3193n = -1;
                    return z5 ? -i11 : i11;
                }
                p02 = p0(i5);
                i5++;
            }
            this.f3185f = i5;
            this.f3184e = p0(i5);
            this.f3193n = 3;
            this.f3181b = 16;
            return z5 ? -i11 : i11;
        }
        if (p03 == 'n') {
            int i12 = i7 + 1;
            if (p0(i7) == 'u') {
                int i13 = i12 + 1;
                if (p0(i12) == 'l') {
                    int i14 = i13 + 1;
                    if (p0(i13) == 'l') {
                        this.f3193n = 5;
                        int i15 = i14 + 1;
                        char p08 = p0(i14);
                        if (z4 && p08 == '\"') {
                            int i16 = i15 + 1;
                            char p09 = p0(i15);
                            i15 = i16;
                            p08 = p09;
                        }
                        while (p08 != ',') {
                            if (p08 == ']') {
                                this.f3185f = i15;
                                this.f3184e = p0(i15);
                                this.f3193n = 5;
                                this.f3181b = 15;
                                return 0;
                            }
                            if (!d.t0(p08)) {
                                this.f3193n = -1;
                                return 0;
                            }
                            int i17 = i15 + 1;
                            char p010 = p0(i15);
                            i15 = i17;
                            p08 = p010;
                        }
                        this.f3185f = i15;
                        this.f3184e = p0(i15);
                        this.f3193n = 5;
                        this.f3181b = 16;
                        return 0;
                    }
                }
            }
        }
        this.f3193n = -1;
        return 0;
    }

    public final void V0(char c5, char c6, char c7, char c8, char c9, char c10) {
        this.f3190k.set(11, (c6 - '0') + ((c5 - '0') * 10));
        this.f3190k.set(12, (c8 - '0') + ((c7 - '0') * 10));
        this.f3190k.set(13, (c10 - '0') + ((c9 - '0') * 10));
    }

    public final void W0(char c5, char c6, char c7, char c8, char c9) {
        int i5 = (((c9 - '0') + ((c8 - '0') * 10)) * 60 * 1000) + (((c7 - '0') + ((c6 - '0') * 10)) * CacheConstants.HOUR * 1000);
        if (c5 == '-') {
            i5 = -i5;
        }
        if (this.f3190k.getTimeZone().getRawOffset() != i5) {
            String[] availableIDs = TimeZone.getAvailableIDs(i5);
            if (availableIDs.length > 0) {
                this.f3190k.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
            }
        }
    }

    @Override // i.c
    public final byte[] a0() {
        int i5;
        int i6 = 2;
        int i7 = 0;
        if (this.f3181b == 26) {
            int i8 = this.f3188i + 1;
            int i9 = this.f3187h;
            if (i9 % 2 != 0) {
                throw new f.d(androidx.appcompat.widget.a.g("illegal state. ", i9));
            }
            int i10 = i9 / 2;
            byte[] bArr = new byte[i10];
            while (i7 < i10) {
                int i11 = (i7 * 2) + i8;
                char charAt = this.f3197r.charAt(i11);
                char charAt2 = this.f3197r.charAt(i11 + 1);
                char c5 = '0';
                int i12 = charAt - (charAt <= '9' ? '0' : '7');
                if (charAt2 > '9') {
                    c5 = '7';
                }
                bArr[i7] = (byte) ((i12 << 4) | (charAt2 - c5));
                i7++;
            }
            return bArr;
        }
        String str = this.f3197r;
        int i13 = this.f3188i + 1;
        int i14 = this.f3187h;
        if (i14 == 0) {
            return new byte[0];
        }
        int i15 = (i13 + i14) - 1;
        while (i13 < i15 && m.e.f4096p[str.charAt(i13)] < 0) {
            i13++;
        }
        while (i15 > 0 && m.e.f4096p[str.charAt(i15)] < 0) {
            i15--;
        }
        if (str.charAt(i15) != '=') {
            i6 = 0;
        } else if (str.charAt(i15 - 1) != '=') {
            i6 = 1;
        }
        int i16 = (i15 - i13) + 1;
        if (i14 > 76) {
            i5 = (str.charAt(76) == '\r' ? i16 / 78 : 0) << 1;
        } else {
            i5 = 0;
        }
        int i17 = (((i16 - i5) * 6) >> 3) - i6;
        byte[] bArr2 = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i18) {
            int[] iArr = m.e.f4096p;
            int i21 = i13 + 1;
            int i22 = i21 + 1;
            int i23 = (iArr[str.charAt(i13)] << 18) | (iArr[str.charAt(i21)] << 12);
            int i24 = i22 + 1;
            int i25 = i23 | (iArr[str.charAt(i22)] << 6);
            int i26 = i24 + 1;
            int i27 = i25 | iArr[str.charAt(i24)];
            int i28 = i19 + 1;
            bArr2[i19] = (byte) (i27 >> 16);
            int i29 = i28 + 1;
            bArr2[i28] = (byte) (i27 >> 8);
            int i30 = i29 + 1;
            bArr2[i29] = (byte) i27;
            if (i5 <= 0 || (i20 = i20 + 1) != 19) {
                i13 = i26;
            } else {
                i13 = i26 + 2;
                i20 = 0;
            }
            i19 = i30;
        }
        if (i19 < i17) {
            int i31 = 0;
            while (i13 <= i15 - i6) {
                i31 |= m.e.f4096p[str.charAt(i13)] << (18 - (i7 * 6));
                i7++;
                i13++;
            }
            int i32 = 16;
            while (i19 < i17) {
                bArr2[i19] = (byte) (i31 >> i32);
                i32 -= 8;
                i19++;
            }
        }
        return bArr2;
    }

    @Override // i.d, i.c
    public final String c() {
        StringBuilder g5 = androidx.activity.d.g("pos ");
        g5.append(this.f3185f);
        g5.append(", json : ");
        g5.append(this.f3197r.length() < 65536 ? this.f3197r : this.f3197r.substring(0, 65536));
        return g5.toString();
    }

    @Override // i.d, i.c
    public final String i0() {
        char p02 = p0((this.f3188i + this.f3187h) - 1);
        int i5 = this.f3187h;
        if (p02 == 'L' || p02 == 'S' || p02 == 'B' || p02 == 'F' || p02 == 'D') {
            i5--;
        }
        return N0(this.f3188i, i5);
    }

    @Override // i.d, i.c
    public final String k0() {
        return !this.f3189j ? N0(this.f3188i + 1, this.f3187h) : new String(this.f3186g, 0, this.f3187h);
    }

    @Override // i.d
    public final String m0(int i5, int i6, int i7, j jVar) {
        return jVar.a(this.f3197r, i5, i6, i7);
    }

    @Override // i.d
    public final void n0(int i5, char[] cArr, int i6) {
        this.f3197r.getChars(i5, i6 + i5, cArr, 0);
    }

    @Override // i.d, i.c
    public final char next() {
        int i5 = this.f3185f + 1;
        this.f3185f = i5;
        char charAt = i5 >= this.f3198s ? (char) 26 : this.f3197r.charAt(i5);
        this.f3184e = charAt;
        return charAt;
    }

    @Override // i.d
    public final boolean o0(char[] cArr) {
        return P0(this.f3197r, this.f3185f, cArr);
    }

    @Override // i.d
    public final char p0(int i5) {
        if (i5 >= this.f3198s) {
            return (char) 26;
        }
        return this.f3197r.charAt(i5);
    }

    @Override // i.d
    public final void q0(int i5, int i6, char[] cArr) {
        this.f3197r.getChars(i5, i6 + i5, cArr, 0);
    }

    @Override // i.d
    public final int r0(int i5) {
        return this.f3197r.indexOf(34, i5);
    }

    @Override // i.d
    public final boolean s0() {
        int i5 = this.f3185f;
        int i6 = this.f3198s;
        if (i5 != i6) {
            return this.f3184e == 26 && i5 + 1 == i6;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c4 -> B:42:0x00b4). Please report as a decompilation issue!!! */
    @Override // i.d, i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double w(char r22) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f.w(char):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb A[SYNTHETIC] */
    @Override // i.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z0(char[] r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f.z0(char[]):boolean");
    }
}
