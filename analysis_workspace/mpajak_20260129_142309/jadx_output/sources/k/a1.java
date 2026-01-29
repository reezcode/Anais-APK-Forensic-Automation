package k;

import java.io.IOException;
import java.io.Writer;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: classes11.dex */
public final class a1 extends Writer {

    /* renamed from: s, reason: collision with root package name */
    public static final ThreadLocal<char[]> f3630s = new ThreadLocal<>();

    /* renamed from: t, reason: collision with root package name */
    public static final int f3631t;

    /* renamed from: b, reason: collision with root package name */
    public char[] f3632b;

    /* renamed from: c, reason: collision with root package name */
    public int f3633c;

    /* renamed from: d, reason: collision with root package name */
    public int f3634d;

    /* renamed from: e, reason: collision with root package name */
    public final Writer f3635e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3636f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3637g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3638h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3639i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3640j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3641k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3642l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3643m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3644n;

    /* renamed from: o, reason: collision with root package name */
    public char f3645o;

    /* renamed from: p, reason: collision with root package name */
    public int f3646p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3647q;

    /* renamed from: r, reason: collision with root package name */
    public long f3648r;

    static {
        new ThreadLocal();
        f3631t = b1.UseSingleQuotes.f3675b | 0 | b1.BrowserCompatible.f3675b | b1.PrettyFormat.f3675b | b1.WriteEnumUsingToString.f3675b | b1.WriteNonStringValueAsString.f3675b | b1.WriteSlashAsSpecial.f3675b | b1.IgnoreErrorGetter.f3675b | b1.WriteClassName.f3675b | b1.NotWriteDefaultValue.f3675b;
    }

    public a1() {
        this(f.a.f2684h, b1.E);
    }

    public a1(int i5, b1... b1VarArr) {
        this.f3646p = -1;
        this.f3635e = null;
        ThreadLocal<char[]> threadLocal = f3630s;
        char[] cArr = threadLocal.get();
        this.f3632b = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        } else {
            this.f3632b = new char[2048];
        }
        for (b1 b1Var : b1VarArr) {
            i5 |= b1Var.f3675b;
        }
        this.f3634d = i5;
        c();
    }

    public final void A(long j5) {
        boolean z4 = l(b1.BrowserCompatible) && !l(b1.WriteClassName) && (j5 > 9007199254740991L || j5 < -9007199254740991L);
        if (j5 == Long.MIN_VALUE) {
            write(z4 ? "\"-9223372036854775808\"" : "-9223372036854775808");
            return;
        }
        int f5 = j5 < 0 ? m.e.f(-j5) + 1 : m.e.f(j5);
        int i5 = this.f3633c + f5;
        if (z4) {
            i5 += 2;
        }
        if (i5 > this.f3632b.length) {
            if (this.f3635e != null) {
                char[] cArr = new char[f5];
                m.e.c(j5, f5, cArr);
                if (!z4) {
                    write(cArr, 0, f5);
                    return;
                }
                write(34);
                write(cArr, 0, f5);
                write(34);
                return;
            }
            e(i5);
        }
        if (z4) {
            char[] cArr2 = this.f3632b;
            cArr2[this.f3633c] = Typography.quote;
            int i6 = i5 - 1;
            m.e.c(j5, i6, cArr2);
            this.f3632b[i6] = Typography.quote;
        } else {
            m.e.c(j5, i5, this.f3632b);
        }
        this.f3633c = i5;
    }

    public final void E() {
        write("null");
    }

    public final void H(int i5, int i6) {
        String str;
        if ((i5 & i6) == 0 && (this.f3634d & i6) == 0) {
            E();
            return;
        }
        if (i6 == b1.WriteNullListAsEmpty.f3675b) {
            str = "[]";
        } else if (i6 == b1.WriteNullStringAsEmpty.f3675b) {
            J("");
            return;
        } else {
            if (i6 != b1.WriteNullBooleanAsFalse.f3675b) {
                if (i6 == b1.WriteNullNumberAsZero.f3675b) {
                    write(48);
                    return;
                } else {
                    E();
                    return;
                }
            }
            str = "false";
        }
        write(str);
    }

    public final void I(b1 b1Var) {
        H(0, b1Var.f3675b);
    }

    public final void J(String str) {
        if (this.f3636f) {
            M(str);
        } else {
            K(str, (char) 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02d6, code lost:
    
        if (r8[r10] == 4) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x041d, code lost:
    
        if (r4 != '>') goto L219;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r23, char r24) {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a1.K(java.lang.String, char):void");
    }

    public final void M(String str) {
        int i5 = 0;
        if (str == null) {
            int i6 = this.f3633c + 4;
            if (i6 > this.f3632b.length) {
                e(i6);
            }
            "null".getChars(0, 4, this.f3632b, this.f3633c);
            this.f3633c = i6;
            return;
        }
        int length = str.length();
        int i7 = this.f3633c + length + 2;
        if (i7 > this.f3632b.length) {
            if (this.f3635e != null) {
                write(39);
                while (i5 < str.length()) {
                    char charAt = str.charAt(i5);
                    if (charAt <= '\r' || charAt == '\\' || charAt == '\'' || (charAt == '/' && l(b1.WriteSlashAsSpecial))) {
                        write(92);
                        charAt = m.e.f4089i[charAt];
                    }
                    write(charAt);
                    i5++;
                }
                write(39);
                return;
            }
            e(i7);
        }
        int i8 = this.f3633c;
        int i9 = i8 + 1;
        int i10 = i9 + length;
        char[] cArr = this.f3632b;
        cArr[i8] = '\'';
        str.getChars(0, length, cArr, i9);
        this.f3633c = i7;
        int i11 = -1;
        char c5 = 0;
        for (int i12 = i9; i12 < i10; i12++) {
            char c6 = this.f3632b[i12];
            if (c6 <= '\r' || c6 == '\\' || c6 == '\'' || (c6 == '/' && l(b1.WriteSlashAsSpecial))) {
                i5++;
                i11 = i12;
                c5 = c6;
            }
        }
        int i13 = i7 + i5;
        if (i13 > this.f3632b.length) {
            e(i13);
        }
        this.f3633c = i13;
        if (i5 == 1) {
            char[] cArr2 = this.f3632b;
            int i14 = i11 + 1;
            System.arraycopy(cArr2, i14, cArr2, i11 + 2, (i10 - i11) - 1);
            char[] cArr3 = this.f3632b;
            cArr3[i11] = IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr3[i14] = m.e.f4089i[c5];
        } else if (i5 > 1) {
            char[] cArr4 = this.f3632b;
            int i15 = i11 + 1;
            System.arraycopy(cArr4, i15, cArr4, i11 + 2, (i10 - i11) - 1);
            char[] cArr5 = this.f3632b;
            cArr5[i11] = IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr5[i15] = m.e.f4089i[c5];
            int i16 = i10 + 1;
            for (int i17 = i15 - 2; i17 >= i9; i17--) {
                char c7 = this.f3632b[i17];
                if (c7 <= '\r' || c7 == '\\' || c7 == '\'' || (c7 == '/' && l(b1.WriteSlashAsSpecial))) {
                    char[] cArr6 = this.f3632b;
                    int i18 = i17 + 1;
                    System.arraycopy(cArr6, i18, cArr6, i17 + 2, (i16 - i17) - 1);
                    char[] cArr7 = this.f3632b;
                    cArr7[i17] = IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr7[i18] = m.e.f4089i[c7];
                    i16++;
                }
            }
        }
        this.f3632b[this.f3633c - 1] = '\'';
    }

    public final a1 a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "null" : charSequence.toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c5) {
        write(c5);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) {
        a(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence, int i5, int i6) {
        b(charSequence, i5, i6);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c5) {
        write(c5);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        a(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i5, int i6) {
        b(charSequence, i5, i6);
        return this;
    }

    public final a1 b(CharSequence charSequence, int i5, int i6) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i5, i6).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    public final void c() {
        int i5 = this.f3634d;
        boolean z4 = (b1.QuoteFieldNames.f3675b & i5) != 0;
        this.f3637g = z4;
        boolean z5 = (b1.UseSingleQuotes.f3675b & i5) != 0;
        this.f3636f = z5;
        this.f3638h = (b1.SortField.f3675b & i5) != 0;
        this.f3639i = (b1.DisableCircularReferenceDetect.f3675b & i5) != 0;
        this.f3640j = (b1.BeanToArray.f3675b & i5) != 0;
        this.f3641k = (b1.WriteNonStringValueAsString.f3675b & i5) != 0;
        this.f3642l = (b1.NotWriteDefaultValue.f3675b & i5) != 0;
        this.f3643m = (b1.WriteEnumUsingName.f3675b & i5) != 0;
        this.f3644n = (b1.WriteEnumUsingToString.f3675b & i5) != 0;
        if (z4) {
            int i6 = f3631t & i5;
        }
        this.f3645o = z5 ? '\'' : Typography.quote;
        boolean z6 = (b1.BrowserSecure.f3675b & i5) != 0;
        this.f3647q = z6;
        this.f3648r = z6 ? 5764610843043954687L : (i5 & b1.WriteSlashAsSpecial.f3675b) != 0 ? 140758963191807L : 21474836479L;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3635e != null && this.f3633c > 0) {
            flush();
        }
        char[] cArr = this.f3632b;
        if (cArr.length <= 131072) {
            f3630s.set(cArr);
        }
        this.f3632b = null;
    }

    public final void e(int i5) {
        int i6 = this.f3646p;
        if (i6 != -1 && i5 >= i6) {
            StringBuilder g5 = androidx.activity.d.g("serialize exceeded MAX_OUTPUT_LENGTH=");
            g5.append(this.f3646p);
            g5.append(", minimumCapacity=");
            g5.append(i5);
            throw new f.d(g5.toString());
        }
        char[] cArr = this.f3632b;
        int length = cArr.length + (cArr.length >> 1) + 1;
        if (length >= i5) {
            i5 = length;
        }
        char[] cArr2 = new char[i5];
        System.arraycopy(cArr, 0, cArr2, 0, this.f3633c);
        this.f3632b = cArr2;
    }

    public final boolean f(int i5) {
        return (i5 & this.f3634d) != 0;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        Writer writer = this.f3635e;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.f3632b, 0, this.f3633c);
            this.f3635e.flush();
            this.f3633c = 0;
        } catch (IOException e5) {
            throw new f.d(e5.getMessage(), e5);
        }
    }

    public final boolean l(b1 b1Var) {
        return (b1Var.f3675b & this.f3634d) != 0;
    }

    public final void n(byte[] bArr) {
        if (f(b1.WriteClassName.f3675b)) {
            y(bArr);
            return;
        }
        int length = bArr.length;
        boolean z4 = this.f3636f;
        char c5 = z4 ? '\'' : Typography.quote;
        if (length == 0) {
            write(z4 ? "''" : "\"\"");
            return;
        }
        char[] cArr = m.e.f4095o;
        int i5 = (length / 3) * 3;
        int i6 = length - 1;
        int i7 = this.f3633c;
        int i8 = (((i6 / 3) + 1) << 2) + i7 + 2;
        if (i8 > this.f3632b.length) {
            if (this.f3635e != null) {
                write(c5);
                int i9 = 0;
                while (i9 < i5) {
                    int i10 = i9 + 1;
                    int i11 = i10 + 1;
                    int i12 = ((bArr[i9] & 255) << 16) | ((bArr[i10] & 255) << 8) | (bArr[i11] & 255);
                    write(cArr[(i12 >>> 18) & 63]);
                    write(cArr[(i12 >>> 12) & 63]);
                    write(cArr[(i12 >>> 6) & 63]);
                    write(cArr[i12 & 63]);
                    i9 = i11 + 1;
                }
                int i13 = length - i5;
                if (i13 > 0) {
                    int i14 = ((bArr[i5] & 255) << 10) | (i13 == 2 ? (bArr[i6] & 255) << 2 : 0);
                    write(cArr[i14 >> 12]);
                    write(cArr[(i14 >>> 6) & 63]);
                    write(i13 == 2 ? cArr[i14 & 63] : '=');
                    write(61);
                }
                write(c5);
                return;
            }
            e(i8);
        }
        this.f3633c = i8;
        int i15 = i7 + 1;
        this.f3632b[i7] = c5;
        int i16 = 0;
        while (i16 < i5) {
            int i17 = i16 + 1;
            int i18 = i17 + 1;
            int i19 = ((bArr[i16] & 255) << 16) | ((bArr[i17] & 255) << 8);
            int i20 = i18 + 1;
            int i21 = i19 | (bArr[i18] & 255);
            char[] cArr2 = this.f3632b;
            int i22 = i15 + 1;
            cArr2[i15] = cArr[(i21 >>> 18) & 63];
            int i23 = i22 + 1;
            cArr2[i22] = cArr[(i21 >>> 12) & 63];
            int i24 = i23 + 1;
            cArr2[i23] = cArr[(i21 >>> 6) & 63];
            i15 = i24 + 1;
            cArr2[i24] = cArr[i21 & 63];
            i16 = i20;
        }
        int i25 = length - i5;
        if (i25 > 0) {
            int i26 = ((bArr[i5] & 255) << 10) | (i25 == 2 ? (bArr[i6] & 255) << 2 : 0);
            char[] cArr3 = this.f3632b;
            cArr3[i8 - 5] = cArr[i26 >> 12];
            cArr3[i8 - 4] = cArr[(i26 >>> 6) & 63];
            cArr3[i8 - 3] = i25 == 2 ? cArr[i26 & 63] : '=';
            cArr3[i8 - 2] = '=';
        }
        this.f3632b[i8 - 1] = c5;
    }

    public final void p(double d5, boolean z4) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            E();
            return;
        }
        String d6 = Double.toString(d5);
        if (l(b1.WriteNullNumberAsZero) && d6.endsWith(".0")) {
            d6 = d6.substring(0, d6.length() - 2);
        }
        write(d6);
        if (z4 && l(b1.WriteClassName)) {
            write(68);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        if (r6 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a1.q(java.lang.String):void");
    }

    public final void r(char c5, String str, int i5) {
        if (i5 == Integer.MIN_VALUE || !this.f3637g) {
            write(c5);
            q(str);
            z(i5);
            return;
        }
        int e5 = i5 < 0 ? m.e.e(-i5) + 1 : m.e.e(i5);
        int length = str.length();
        int i6 = this.f3633c + length + 4 + e5;
        if (i6 > this.f3632b.length) {
            if (this.f3635e != null) {
                write(c5);
                q(str);
                z(i5);
                return;
            }
            e(i6);
        }
        int i7 = this.f3633c;
        this.f3633c = i6;
        char[] cArr = this.f3632b;
        cArr[i7] = c5;
        int i8 = i7 + length + 1;
        cArr[i7 + 1] = this.f3645o;
        str.getChars(0, length, cArr, i7 + 2);
        char[] cArr2 = this.f3632b;
        cArr2[i8 + 1] = this.f3645o;
        cArr2[i8 + 2] = ':';
        m.e.b(i5, this.f3633c, cArr2);
    }

    public final void s(char c5, String str, long j5) {
        if (j5 == Long.MIN_VALUE || !this.f3637g) {
            write(c5);
            q(str);
            A(j5);
            return;
        }
        int f5 = j5 < 0 ? m.e.f(-j5) + 1 : m.e.f(j5);
        int length = str.length();
        int i5 = this.f3633c + length + 4 + f5;
        if (i5 > this.f3632b.length) {
            if (this.f3635e != null) {
                write(c5);
                q(str);
                A(j5);
                return;
            }
            e(i5);
        }
        int i6 = this.f3633c;
        this.f3633c = i5;
        char[] cArr = this.f3632b;
        cArr[i6] = c5;
        int i7 = i6 + length + 1;
        cArr[i6 + 1] = this.f3645o;
        str.getChars(0, length, cArr, i6 + 2);
        char[] cArr2 = this.f3632b;
        cArr2[i7 + 1] = this.f3645o;
        cArr2[i7 + 2] = ':';
        m.e.c(j5, this.f3633c, cArr2);
    }

    public final String toString() {
        return new String(this.f3632b, 0, this.f3633c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        J(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(char r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            boolean r0 = r1.f3637g
            if (r0 == 0) goto L2a
            boolean r0 = r1.f3636f
            if (r0 == 0) goto L11
            r1.write(r2)
            r1.q(r3)
            if (r4 != 0) goto L36
            goto L32
        L11:
            k.b1 r0 = k.b1.BrowserCompatible
            boolean r0 = r1.l(r0)
            if (r0 == 0) goto L26
            r1.write(r2)
            r2 = 58
            r1.K(r3, r2)
            r2 = 0
            r1.K(r4, r2)
            goto L39
        L26:
            r1.x(r2, r3, r4)
            goto L39
        L2a:
            r1.write(r2)
            r1.q(r3)
            if (r4 != 0) goto L36
        L32:
            r1.E()
            goto L39
        L36:
            r1.J(r4)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a1.w(char, java.lang.String, java.lang.String):void");
    }

    @Override // java.io.Writer
    public final void write(int i5) {
        int i6 = 1;
        int i7 = this.f3633c + 1;
        if (i7 > this.f3632b.length) {
            if (this.f3635e != null) {
                flush();
                this.f3632b[this.f3633c] = (char) i5;
                this.f3633c = i6;
            }
            e(i7);
        }
        i6 = i7;
        this.f3632b[this.f3633c] = (char) i5;
        this.f3633c = i6;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str == null) {
            E();
        } else {
            write(str, 0, str.length());
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i5, int i6) {
        int i7;
        int i8 = this.f3633c + i6;
        if (i8 > this.f3632b.length) {
            if (this.f3635e == null) {
                e(i8);
            } else {
                while (true) {
                    char[] cArr = this.f3632b;
                    int length = cArr.length;
                    int i9 = this.f3633c;
                    int i10 = length - i9;
                    i7 = i5 + i10;
                    str.getChars(i5, i7, cArr, i9);
                    this.f3633c = this.f3632b.length;
                    flush();
                    i6 -= i10;
                    if (i6 <= this.f3632b.length) {
                        break;
                    } else {
                        i5 = i7;
                    }
                }
                i8 = i6;
                i5 = i7;
            }
        }
        str.getChars(i5, i6 + i5, this.f3632b, this.f3633c);
        this.f3633c = i8;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 > cArr.length || i6 < 0 || (i7 = i5 + i6) > cArr.length || i7 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i6 == 0) {
            return;
        }
        int i8 = this.f3633c + i6;
        if (i8 > this.f3632b.length) {
            if (this.f3635e == null) {
                e(i8);
            } else {
                do {
                    char[] cArr2 = this.f3632b;
                    int length = cArr2.length;
                    int i9 = this.f3633c;
                    int i10 = length - i9;
                    System.arraycopy(cArr, i5, cArr2, i9, i10);
                    this.f3633c = this.f3632b.length;
                    flush();
                    i6 -= i10;
                    i5 += i10;
                } while (i6 > this.f3632b.length);
                i8 = i6;
            }
        }
        System.arraycopy(cArr, i5, this.f3632b, this.f3633c, i6);
        this.f3633c = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021b, code lost:
    
        if (r3 != '>') goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r1[r7] == 4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(char r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.a1.x(char, java.lang.String, java.lang.String):void");
    }

    public final void y(byte[] bArr) {
        int i5 = 2;
        int length = (bArr.length * 2) + this.f3633c + 3;
        int i6 = 0;
        if (length > this.f3632b.length) {
            if (this.f3635e != null) {
                char[] cArr = new char[bArr.length + 3];
                cArr[0] = 'x';
                cArr[1] = '\'';
                while (i6 < bArr.length) {
                    int i7 = bArr[i6] & 255;
                    int i8 = i7 >> 4;
                    int i9 = i7 & 15;
                    int i10 = i5 + 1;
                    cArr[i5] = (char) (i8 + (i8 < 10 ? 48 : 55));
                    i5 = i10 + 1;
                    cArr[i10] = (char) (i9 + (i9 < 10 ? 48 : 55));
                    i6++;
                }
                cArr[i5] = '\'';
                try {
                    this.f3635e.write(cArr);
                    return;
                } catch (IOException e5) {
                    throw new f.d("writeBytes error.", e5);
                }
            }
            e(length);
        }
        char[] cArr2 = this.f3632b;
        int i11 = this.f3633c;
        int i12 = i11 + 1;
        this.f3633c = i12;
        cArr2[i11] = 'x';
        this.f3633c = i12 + 1;
        cArr2[i12] = '\'';
        while (i6 < bArr.length) {
            int i13 = bArr[i6] & 255;
            int i14 = i13 >> 4;
            int i15 = i13 & 15;
            char[] cArr3 = this.f3632b;
            int i16 = this.f3633c;
            int i17 = i16 + 1;
            this.f3633c = i17;
            cArr3[i16] = (char) (i14 + (i14 < 10 ? 48 : 55));
            this.f3633c = i17 + 1;
            cArr3[i17] = (char) (i15 + (i15 < 10 ? 48 : 55));
            i6++;
        }
        char[] cArr4 = this.f3632b;
        int i18 = this.f3633c;
        this.f3633c = i18 + 1;
        cArr4[i18] = '\'';
    }

    public final void z(int i5) {
        if (i5 == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int e5 = i5 < 0 ? m.e.e(-i5) + 1 : m.e.e(i5);
        int i6 = this.f3633c + e5;
        if (i6 > this.f3632b.length) {
            if (this.f3635e != null) {
                char[] cArr = new char[e5];
                m.e.b(i5, e5, cArr);
                write(cArr, 0, e5);
                return;
            }
            e(i6);
        }
        m.e.b(i5, i6, this.f3632b);
        this.f3633c = i6;
    }
}
