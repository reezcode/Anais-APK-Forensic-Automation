package i;

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: classes6.dex */
public abstract class d implements c, Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final ThreadLocal<char[]> f3179p = new ThreadLocal<>();

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f3180q;

    /* renamed from: b, reason: collision with root package name */
    public int f3181b;

    /* renamed from: c, reason: collision with root package name */
    public int f3182c;

    /* renamed from: d, reason: collision with root package name */
    public int f3183d;

    /* renamed from: e, reason: collision with root package name */
    public char f3184e;

    /* renamed from: f, reason: collision with root package name */
    public int f3185f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f3186g;

    /* renamed from: h, reason: collision with root package name */
    public int f3187h;

    /* renamed from: i, reason: collision with root package name */
    public int f3188i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3189j;

    /* renamed from: k, reason: collision with root package name */
    public Calendar f3190k = null;

    /* renamed from: l, reason: collision with root package name */
    public TimeZone f3191l = f.a.f2678b;

    /* renamed from: m, reason: collision with root package name */
    public Locale f3192m = f.a.f2679c;

    /* renamed from: n, reason: collision with root package name */
    public int f3193n = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f3194o;

    static {
        StringBuilder g5 = androidx.activity.d.g("\"");
        g5.append(f.a.f2680d);
        g5.append("\":\"");
        g5.toString().toCharArray();
        f3180q = new int[103];
        for (int i5 = 48; i5 <= 57; i5++) {
            f3180q[i5] = i5 - 48;
        }
        for (int i6 = 97; i6 <= 102; i6++) {
            f3180q[i6] = (i6 - 97) + 10;
        }
        for (int i7 = 65; i7 <= 70; i7++) {
            f3180q[i7] = (i7 - 65) + 10;
        }
    }

    public d(int i5) {
        this.f3194o = null;
        this.f3183d = i5;
        if ((i5 & b.InitStringFieldAsEmpty.f3178b) != 0) {
            this.f3194o = "";
        }
        char[] cArr = f3179p.get();
        this.f3186g = cArr;
        if (cArr == null) {
            this.f3186g = new char[512];
        }
    }

    public static boolean t0(char c5) {
        return c5 <= ' ' && (c5 == ' ' || c5 == '\n' || c5 == '\r' || c5 == '\t' || c5 == '\f' || c5 == '\b');
    }

    public static String x0(char[] cArr, int i5) {
        int i6;
        char[] cArr2 = new char[i5];
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            char c5 = cArr[i7];
            if (c5 != '\\') {
                cArr2[i8] = c5;
                i8++;
            } else {
                i7++;
                char c6 = cArr[i7];
                if (c6 == '\"') {
                    i6 = i8 + 1;
                    cArr2[i8] = Typography.quote;
                } else if (c6 != '\'') {
                    if (c6 != 'F') {
                        if (c6 == '\\') {
                            i6 = i8 + 1;
                            cArr2[i8] = IOUtils.DIR_SEPARATOR_WINDOWS;
                        } else if (c6 == 'b') {
                            i6 = i8 + 1;
                            cArr2[i8] = '\b';
                        } else if (c6 != 'f') {
                            if (c6 == 'n') {
                                i6 = i8 + 1;
                                cArr2[i8] = '\n';
                            } else if (c6 == 'r') {
                                i6 = i8 + 1;
                                cArr2[i8] = '\r';
                            } else if (c6 != 'x') {
                                switch (c6) {
                                    case '/':
                                        i6 = i8 + 1;
                                        cArr2[i8] = IOUtils.DIR_SEPARATOR_UNIX;
                                        break;
                                    case '0':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 0;
                                        break;
                                    case '1':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 1;
                                        break;
                                    case '2':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 2;
                                        break;
                                    case '3':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 3;
                                        break;
                                    case '4':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 4;
                                        break;
                                    case '5':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 5;
                                        break;
                                    case '6':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 6;
                                        break;
                                    case '7':
                                        i6 = i8 + 1;
                                        cArr2[i8] = 7;
                                        break;
                                    default:
                                        switch (c6) {
                                            case 't':
                                                i6 = i8 + 1;
                                                cArr2[i8] = '\t';
                                                break;
                                            case 'u':
                                                i6 = i8 + 1;
                                                int i9 = i7 + 1;
                                                int i10 = i9 + 1;
                                                int i11 = i10 + 1;
                                                i7 = i11 + 1;
                                                cArr2[i8] = (char) Integer.parseInt(new String(new char[]{cArr[i9], cArr[i10], cArr[i11], cArr[i7]}), 16);
                                                break;
                                            case 'v':
                                                i6 = i8 + 1;
                                                cArr2[i8] = 11;
                                                break;
                                            default:
                                                throw new f.d("unclosed.str.lit");
                                        }
                                }
                            } else {
                                i6 = i8 + 1;
                                int[] iArr = f3180q;
                                int i12 = i7 + 1;
                                int i13 = iArr[cArr[i12]] * 16;
                                i7 = i12 + 1;
                                cArr2[i8] = (char) (i13 + iArr[cArr[i7]]);
                            }
                        }
                    }
                    i6 = i8 + 1;
                    cArr2[i8] = '\f';
                } else {
                    i6 = i8 + 1;
                    cArr2[i8] = '\'';
                }
                i8 = i6;
            }
            i7++;
        }
        return new String(cArr2, 0, i8);
    }

    @Override // i.c
    public final boolean A(b bVar) {
        return isEnabled(bVar.f3178b);
    }

    public Date A0(char[] cArr) {
        int i5;
        long j5;
        Date date;
        int i6;
        char p02;
        int i7;
        int i8;
        boolean z4 = false;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return null;
        }
        int length = cArr.length;
        int i9 = length + 1;
        char p03 = p0(this.f3185f + length);
        if (p03 == '\"') {
            int r02 = r0(this.f3185f + cArr.length + 1);
            if (r02 == -1) {
                throw new f.d("unclosed str");
            }
            int length2 = this.f3185f + cArr.length + 1;
            String N0 = N0(length2, r02 - length2);
            if (N0.indexOf(92) != -1) {
                while (true) {
                    int i10 = 0;
                    for (int i11 = r02 - 1; i11 >= 0 && p0(i11) == '\\'; i11--) {
                        i10++;
                    }
                    if (i10 % 2 == 0) {
                        break;
                    }
                    r02 = r0(r02 + 1);
                }
                int i12 = this.f3185f;
                int length3 = r02 - ((cArr.length + i12) + 1);
                N0 = x0(O0(i12 + cArr.length + 1, length3), length3);
            }
            int i13 = this.f3185f;
            int length4 = (r02 - ((cArr.length + i13) + 1)) + 1 + i9;
            i5 = length4 + 1;
            p03 = p0(i13 + length4);
            f fVar = new f(N0);
            try {
                if (!fVar.S0(false)) {
                    this.f3193n = -1;
                    return null;
                }
                date = fVar.f3190k.getTime();
            } finally {
                fVar.close();
            }
        } else {
            if (p03 != '-' && (p03 < '0' || p03 > '9')) {
                this.f3193n = -1;
                return null;
            }
            if (p03 == '-') {
                p03 = p0(this.f3185f + i9);
                i9++;
                z4 = true;
            }
            if (p03 < '0' || p03 > '9') {
                i5 = i9;
                j5 = 0;
            } else {
                j5 = p03 - '0';
                while (true) {
                    i6 = i9 + 1;
                    p02 = p0(this.f3185f + i9);
                    if (p02 < '0' || p02 > '9') {
                        break;
                    }
                    j5 = (j5 * 10) + (p02 - '0');
                    i9 = i6;
                }
                p03 = p02;
                i5 = i6;
            }
            if (j5 < 0) {
                this.f3193n = -1;
                return null;
            }
            if (z4) {
                j5 = -j5;
            }
            date = new Date(j5);
        }
        if (p03 == ',') {
            int i14 = this.f3185f + i5;
            this.f3185f = i14;
            this.f3184e = p0(i14);
            i8 = 3;
        } else {
            if (p03 != '}') {
                this.f3193n = -1;
                return null;
            }
            int i15 = i5 + 1;
            char p04 = p0(this.f3185f + i5);
            if (p04 == ',') {
                i7 = 16;
            } else if (p04 == ']') {
                i7 = 15;
            } else if (p04 == '}') {
                i7 = 13;
            } else {
                if (p04 != 26) {
                    this.f3193n = -1;
                    return null;
                }
                this.f3181b = 20;
                this.f3185f = (i15 - 1) + this.f3185f;
                this.f3184e = (char) 26;
                i8 = 4;
            }
            this.f3181b = i7;
            int i16 = this.f3185f + i15;
            this.f3185f = i16;
            this.f3184e = p0(i16);
            i8 = 4;
        }
        this.f3193n = i8;
        return date;
    }

    public final BigDecimal B0(char[] cArr) {
        int i5;
        char p02;
        d dVar;
        int length;
        int i6;
        int i7;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return null;
        }
        int length2 = cArr.length;
        int i8 = length2 + 1;
        char p03 = p0(this.f3185f + length2);
        boolean z4 = p03 == '\"';
        if (z4) {
            p03 = p0(this.f3185f + i8);
            i8++;
        }
        if (p03 == '-') {
            p03 = p0(this.f3185f + i8);
            i8++;
        }
        if (p03 < '0' || p03 > '9') {
            if (p03 != 'n' || p0(this.f3185f + i8) != 'u' || androidx.appcompat.view.a.a(this.f3185f, i8, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, i8, 2, this) != 'l') {
                this.f3193n = -1;
                return null;
            }
            this.f3193n = 5;
            int i9 = i8 + 3;
            int i10 = i9 + 1;
            char p04 = p0(this.f3185f + i9);
            if (z4 && p04 == '\"') {
                p04 = p0(this.f3185f + i10);
                i10++;
            }
            while (p04 != ',') {
                if (p04 == '}') {
                    int i11 = this.f3185f + i10;
                    this.f3185f = i11;
                    this.f3184e = p0(i11);
                    this.f3193n = 5;
                    this.f3181b = 13;
                    return null;
                }
                if (!t0(p04)) {
                    this.f3193n = -1;
                    return null;
                }
                p04 = p0(this.f3185f + i10);
                i10++;
            }
            int i12 = this.f3185f + i10;
            this.f3185f = i12;
            this.f3184e = p0(i12);
            this.f3193n = 5;
            this.f3181b = 16;
            return null;
        }
        while (true) {
            i5 = i8 + 1;
            p02 = p0(this.f3185f + i8);
            if (p02 < '0' || p02 > '9') {
                break;
            }
            i8 = i5;
        }
        if (p02 == '.') {
            int i13 = i5 + 1;
            char p05 = p0(this.f3185f + i5);
            if (p05 >= '0' && p05 <= '9') {
                while (true) {
                    i5 = i13 + 1;
                    p02 = p0(this.f3185f + i13);
                    if (p02 < '0' || p02 > '9') {
                        break;
                    }
                    i13 = i5;
                }
            } else {
                this.f3193n = -1;
                return null;
            }
        }
        if (p02 == 'e' || p02 == 'E') {
            int i14 = i5 + 1;
            p02 = p0(this.f3185f + i5);
            if (p02 == '+' || p02 == '-') {
                int i15 = i14 + 1;
                p02 = p0(this.f3185f + i14);
                dVar = this;
                i5 = i15;
            } else {
                i5 = i14;
                dVar = this;
            }
            while (p02 >= '0' && p02 <= '9') {
                int i16 = i5 + 1;
                p02 = dVar.p0(dVar.f3185f + i5);
                i5 = i16;
            }
        } else {
            dVar = this;
        }
        if (!z4) {
            int i17 = dVar.f3185f;
            length = cArr.length + i17;
            i6 = ((i17 + i5) - length) - 1;
        } else {
            if (p02 != '\"') {
                dVar.f3193n = -1;
                return null;
            }
            int i18 = i5 + 1;
            p02 = dVar.p0(dVar.f3185f + i5);
            int i19 = dVar.f3185f;
            length = cArr.length + i19 + 1;
            i6 = ((i19 + i18) - length) - 2;
            i5 = i18;
        }
        BigDecimal bigDecimal = new BigDecimal(dVar.O0(length, i6));
        if (p02 == ',') {
            int i20 = dVar.f3185f + i5;
            dVar.f3185f = i20;
            dVar.f3184e = dVar.p0(i20);
            dVar.f3193n = 3;
            dVar.f3181b = 16;
            return bigDecimal;
        }
        if (p02 != '}') {
            dVar.f3193n = -1;
            return null;
        }
        int i21 = i5 + 1;
        char p06 = dVar.p0(dVar.f3185f + i5);
        if (p06 == ',') {
            dVar.f3181b = 16;
        } else {
            if (p06 == ']') {
                i7 = 15;
            } else {
                if (p06 != '}') {
                    if (p06 != 26) {
                        dVar.f3193n = -1;
                        return null;
                    }
                    dVar.f3181b = 20;
                    dVar.f3185f = (i21 - 1) + dVar.f3185f;
                    dVar.f3184e = (char) 26;
                    dVar.f3193n = 4;
                    return bigDecimal;
                }
                i7 = 13;
            }
            dVar.f3181b = i7;
        }
        int i22 = dVar.f3185f + i21;
        dVar.f3185f = i22;
        dVar.f3184e = dVar.p0(i22);
        dVar.f3193n = 4;
        return bigDecimal;
    }

    public final double C0(char[] cArr) {
        int i5;
        char p02;
        d dVar;
        int length;
        int i6;
        double parseDouble;
        char p03;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return 0.0d;
        }
        int length2 = cArr.length;
        int i7 = length2 + 1;
        char p04 = p0(this.f3185f + length2);
        boolean z4 = p04 == '\"';
        if (z4) {
            p04 = p0(this.f3185f + i7);
            i7++;
        }
        boolean z5 = p04 == '-';
        if (z5) {
            p04 = p0(this.f3185f + i7);
            i7++;
        }
        char c5 = '0';
        if (p04 >= '0') {
            char c6 = '9';
            if (p04 <= '9') {
                long j5 = p04 - '0';
                while (true) {
                    i5 = i7 + 1;
                    p02 = p0(this.f3185f + i7);
                    if (p02 < '0' || p02 > '9') {
                        break;
                    }
                    j5 = (j5 * 10) + (p02 - '0');
                    i7 = i5;
                    z5 = z5;
                }
                boolean z6 = z5;
                long j6 = 1;
                if (p02 == '.') {
                    int i8 = i5 + 1;
                    char p05 = p0(this.f3185f + i5);
                    if (p05 < '0' || p05 > '9') {
                        this.f3193n = -1;
                        return 0.0d;
                    }
                    j5 = (j5 * 10) + (p05 - '0');
                    long j7 = 10;
                    while (true) {
                        i5 = i8 + 1;
                        p02 = p0(this.f3185f + i8);
                        if (p02 < c5 || p02 > c6) {
                            break;
                        }
                        j5 = (j5 * 10) + (p02 - '0');
                        j7 *= 10;
                        i8 = i5;
                        c5 = '0';
                        c6 = '9';
                    }
                    j6 = j7;
                }
                boolean z7 = p02 == 'e' || p02 == 'E';
                if (z7) {
                    int i9 = i5 + 1;
                    p02 = p0(this.f3185f + i5);
                    if (p02 == '+' || p02 == '-') {
                        p02 = p0(this.f3185f + i9);
                        dVar = this;
                        i5 = i9 + 1;
                    } else {
                        dVar = this;
                        i5 = i9;
                    }
                    while (p02 >= '0' && p02 <= '9') {
                        p02 = dVar.p0(dVar.f3185f + i5);
                        i5++;
                    }
                } else {
                    dVar = this;
                }
                if (!z4) {
                    int i10 = dVar.f3185f;
                    length = cArr.length + i10;
                    i6 = ((i10 + i5) - length) - 1;
                } else {
                    if (p02 != '\"') {
                        dVar.f3193n = -1;
                        return 0.0d;
                    }
                    int i11 = i5 + 1;
                    p02 = dVar.p0(dVar.f3185f + i5);
                    int i12 = dVar.f3185f;
                    length = cArr.length + i12 + 1;
                    i6 = ((i12 + i11) - length) - 2;
                    i5 = i11;
                }
                if (z7 || i6 >= 20) {
                    parseDouble = Double.parseDouble(dVar.N0(length, i6));
                } else {
                    parseDouble = j5 / j6;
                    if (z6) {
                        parseDouble = -parseDouble;
                    }
                }
                if (p02 == ',') {
                    int i13 = dVar.f3185f + i5;
                    dVar.f3185f = i13;
                    dVar.f3184e = dVar.p0(i13);
                    dVar.f3193n = 3;
                    dVar.f3181b = 16;
                    return parseDouble;
                }
                int i14 = 16;
                if (p02 != '}') {
                    dVar.f3193n = -1;
                    return 0.0d;
                }
                int i15 = i5 + 1;
                char p06 = dVar.p0(dVar.f3185f + i5);
                if (p06 != ',') {
                    if (p06 == ']') {
                        i14 = 15;
                    } else {
                        if (p06 != '}') {
                            p03 = 26;
                            if (p06 != 26) {
                                dVar.f3193n = -1;
                                return 0.0d;
                            }
                            dVar.f3181b = 20;
                            dVar.f3185f = (i15 - 1) + dVar.f3185f;
                            dVar.f3184e = p03;
                            dVar.f3193n = 4;
                            return parseDouble;
                        }
                        i14 = 13;
                    }
                }
                dVar.f3181b = i14;
                int i16 = dVar.f3185f + i15;
                dVar.f3185f = i16;
                p03 = dVar.p0(i16);
                dVar.f3184e = p03;
                dVar.f3193n = 4;
                return parseDouble;
            }
        }
        if (p04 != 'n' || p0(this.f3185f + i7) != 'u' || androidx.appcompat.view.a.a(this.f3185f, i7, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, i7, 2, this) != 'l') {
            this.f3193n = -1;
            return 0.0d;
        }
        this.f3193n = 5;
        int i17 = i7 + 3;
        int i18 = i17 + 1;
        char p07 = p0(this.f3185f + i17);
        if (z4 && p07 == '\"') {
            p07 = p0(this.f3185f + i18);
            i18++;
        }
        while (p07 != ',') {
            if (p07 == '}') {
                int i19 = this.f3185f + i18;
                this.f3185f = i19;
                this.f3184e = p0(i19);
                this.f3193n = 5;
                this.f3181b = 13;
                return 0.0d;
            }
            if (!t0(p07)) {
                this.f3193n = -1;
                return 0.0d;
            }
            p07 = p0(this.f3185f + i18);
            i18++;
        }
        int i20 = this.f3185f + i18;
        this.f3185f = i20;
        this.f3184e = p0(i20);
        this.f3193n = 5;
        this.f3181b = 16;
        return 0.0d;
    }

    public final float D0(char[] cArr) {
        int i5;
        char p02;
        int i6;
        int i7;
        d dVar;
        int length;
        int i8;
        float parseFloat;
        int i9;
        char p03;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return 0.0f;
        }
        int length2 = cArr.length;
        int i10 = length2 + 1;
        char p04 = p0(this.f3185f + length2);
        boolean z4 = p04 == '\"';
        if (z4) {
            p04 = p0(this.f3185f + i10);
            i10++;
        }
        boolean z5 = p04 == '-';
        if (z5) {
            p04 = p0(this.f3185f + i10);
            i10++;
        }
        if (p04 < '0' || p04 > '9') {
            if (p04 != 'n' || p0(this.f3185f + i10) != 'u' || androidx.appcompat.view.a.a(this.f3185f, i10, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, i10, 2, this) != 'l') {
                this.f3193n = -1;
                return 0.0f;
            }
            this.f3193n = 5;
            int i11 = i10 + 3;
            int i12 = i11 + 1;
            char p05 = p0(this.f3185f + i11);
            if (z4 && p05 == '\"') {
                p05 = p0(this.f3185f + i12);
                i12++;
            }
            while (p05 != ',') {
                if (p05 == '}') {
                    int i13 = this.f3185f + i12;
                    this.f3185f = i13;
                    this.f3184e = p0(i13);
                    this.f3193n = 5;
                    this.f3181b = 13;
                    return 0.0f;
                }
                if (!t0(p05)) {
                    this.f3193n = -1;
                    return 0.0f;
                }
                p05 = p0(this.f3185f + i12);
                i12++;
            }
            int i14 = this.f3185f + i12;
            this.f3185f = i14;
            this.f3184e = p0(i14);
            this.f3193n = 5;
            this.f3181b = 16;
            return 0.0f;
        }
        int i15 = p04 - '0';
        while (true) {
            i5 = i10 + 1;
            p02 = p0(this.f3185f + i10);
            if (p02 < '0' || p02 > '9') {
                break;
            }
            i15 = (i15 * 10) + (p02 - '0');
            i10 = i5;
        }
        if (p02 == '.') {
            int i16 = i5 + 1;
            char p06 = p0(this.f3185f + i5);
            if (p06 < '0' || p06 > '9') {
                this.f3193n = -1;
                return 0.0f;
            }
            int i17 = (p06 - '0') + (i15 * 10);
            int i18 = 10;
            while (true) {
                i9 = i16 + 1;
                p03 = p0(this.f3185f + i16);
                if (p03 < '0' || p03 > '9') {
                    break;
                }
                i17 = (i17 * 10) + (p03 - '0');
                i18 *= 10;
                i16 = i9;
            }
            i5 = i9;
            i6 = i18;
            i15 = i17;
            p02 = p03;
        } else {
            i6 = 1;
        }
        boolean z6 = p02 == 'e' || p02 == 'E';
        if (z6) {
            i7 = i5 + 1;
            p02 = p0(this.f3185f + i5);
            if (p02 == '+' || p02 == '-') {
                int i19 = i7 + 1;
                dVar = this;
                p02 = dVar.p0(this.f3185f + i7);
                i7 = i19;
            } else {
                dVar = this;
            }
            while (p02 >= '0' && p02 <= '9') {
                int i20 = i7 + 1;
                p02 = dVar.p0(dVar.f3185f + i7);
                i7 = i20;
            }
        } else {
            i7 = i5;
            dVar = this;
        }
        if (!z4) {
            int i21 = dVar.f3185f;
            length = cArr.length + i21;
            i8 = ((i21 + i7) - length) - 1;
        } else {
            if (p02 != '\"') {
                dVar.f3193n = -1;
                return 0.0f;
            }
            int i22 = i7 + 1;
            char p07 = dVar.p0(dVar.f3185f + i7);
            int i23 = dVar.f3185f;
            length = cArr.length + i23 + 1;
            i8 = ((i23 + i22) - length) - 2;
            i7 = i22;
            p02 = p07;
        }
        if (z6 || i8 >= 20) {
            parseFloat = Float.parseFloat(dVar.N0(length, i8));
        } else {
            parseFloat = i15 / i6;
            if (z5) {
                parseFloat = -parseFloat;
            }
        }
        if (p02 == ',') {
            int i24 = dVar.f3185f + i7;
            dVar.f3185f = i24;
            dVar.f3184e = dVar.p0(i24);
            dVar.f3193n = 3;
            dVar.f3181b = 16;
            return parseFloat;
        }
        int i25 = 16;
        if (p02 != '}') {
            dVar.f3193n = -1;
            return 0.0f;
        }
        int i26 = i7 + 1;
        char p08 = dVar.p0(dVar.f3185f + i7);
        if (p08 != ',') {
            if (p08 == ']') {
                dVar.f3181b = 15;
                int i27 = dVar.f3185f + i26;
                dVar.f3185f = i27;
                dVar.f3184e = dVar.p0(i27);
                dVar.f3193n = 4;
                return parseFloat;
            }
            if (p08 != '}') {
                if (p08 != 26) {
                    dVar.f3193n = -1;
                    return 0.0f;
                }
                dVar.f3185f = (i26 - 1) + dVar.f3185f;
                dVar.f3181b = 20;
                dVar.f3184e = (char) 26;
                dVar.f3193n = 4;
                return parseFloat;
            }
            i25 = 13;
        }
        dVar.f3181b = i25;
        int i272 = dVar.f3185f + i26;
        dVar.f3185f = i272;
        dVar.f3184e = dVar.p0(i272);
        dVar.f3193n = 4;
        return parseFloat;
    }

    @Override // i.c
    public final void E() {
        int i5;
        this.f3188i = this.f3185f;
        this.f3189j = false;
        while (true) {
            char next = next();
            char c5 = Typography.quote;
            if (next == '\"') {
                this.f3181b = 4;
                this.f3184e = next();
                return;
            }
            char c6 = 26;
            if (next != 26) {
                c6 = IOUtils.DIR_SEPARATOR_WINDOWS;
                if (next == '\\') {
                    if (!this.f3189j) {
                        this.f3189j = true;
                        int i6 = this.f3187h;
                        char[] cArr = this.f3186g;
                        if (i6 >= cArr.length) {
                            int length = cArr.length * 2;
                            if (i6 <= length) {
                                i6 = length;
                            }
                            char[] cArr2 = new char[i6];
                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                            this.f3186g = cArr2;
                        }
                        q0(this.f3188i + 1, this.f3187h, this.f3186g);
                    }
                    char next2 = next();
                    if (next2 != '\"') {
                        c5 = '\'';
                        if (next2 != '\'') {
                            if (next2 != 'F') {
                                if (next2 != '\\') {
                                    if (next2 == 'b') {
                                        next = '\b';
                                    } else if (next2 != 'f') {
                                        if (next2 == 'n') {
                                            next = '\n';
                                        } else if (next2 != 'r') {
                                            if (next2 != 'x') {
                                                c5 = 3;
                                                switch (next2) {
                                                    case '/':
                                                        next = IOUtils.DIR_SEPARATOR_UNIX;
                                                        break;
                                                    case '0':
                                                        w0((char) 0);
                                                        break;
                                                    case '1':
                                                        w0((char) 1);
                                                        break;
                                                    case '2':
                                                        w0((char) 2);
                                                        break;
                                                    case '3':
                                                        break;
                                                    case '4':
                                                        w0((char) 4);
                                                        break;
                                                    case '5':
                                                        next = 5;
                                                        break;
                                                    case '6':
                                                        next = 6;
                                                        break;
                                                    case '7':
                                                        next = 7;
                                                        break;
                                                    default:
                                                        switch (next2) {
                                                            case 't':
                                                                next = '\t';
                                                                break;
                                                            case 'u':
                                                                i5 = Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                                break;
                                                            case 'v':
                                                                next = 11;
                                                                break;
                                                            default:
                                                                this.f3184e = next2;
                                                                throw new f.d("unclosed string : " + next2);
                                                        }
                                                }
                                            } else {
                                                char next3 = next();
                                                char next4 = next();
                                                int[] iArr = f3180q;
                                                i5 = (iArr[next3] * 16) + iArr[next4];
                                            }
                                            next = (char) i5;
                                        } else {
                                            next = '\r';
                                        }
                                    }
                                    w0(next);
                                }
                            }
                            next = '\f';
                            w0(next);
                        }
                    }
                    w0(c5);
                } else if (this.f3189j) {
                    int i7 = this.f3187h;
                    char[] cArr3 = this.f3186g;
                    if (i7 == cArr3.length) {
                        w0(next);
                    } else {
                        this.f3187h = i7 + 1;
                        cArr3[i7] = next;
                    }
                } else {
                    this.f3187h++;
                }
            } else if (s0()) {
                throw new f.d("unclosed string : " + next);
            }
            w0(c6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00aa, code lost:
    
        r19.f3193n = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00ac, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] E0(char[] r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.E0(char[]):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00b2, code lost:
    
        r19.f3193n = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b4, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0203, code lost:
    
        r6 = r4;
        r19.f3193n = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0206, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[][] F0(char[] r20) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.F0(char[]):float[][]");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int G0(char[] r11) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.G0(char[]):int");
    }

    @Override // i.c
    public final void H() {
        v0();
    }

    public final int[] H0(char[] cArr) {
        boolean z4;
        int i5;
        char p02;
        int i6;
        int i7;
        char p03;
        int i8;
        this.f3193n = 0;
        int[] iArr = null;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return null;
        }
        int length = cArr.length;
        int i9 = length + 1;
        if (p0(this.f3185f + length) != '[') {
            this.f3193n = -2;
            return null;
        }
        int i10 = i9 + 1;
        char p04 = p0(this.f3185f + i9);
        int[] iArr2 = new int[16];
        if (p04 != ']') {
            int i11 = 0;
            while (true) {
                if (p04 == '-') {
                    p04 = p0(this.f3185f + i10);
                    i10++;
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (p04 < '0' || p04 > '9') {
                    break;
                }
                int i12 = p04 - '0';
                while (true) {
                    i5 = i10 + 1;
                    p02 = p0(this.f3185f + i10);
                    if (p02 < '0' || p02 > '9') {
                        break;
                    }
                    i12 = (i12 * 10) + (p02 - '0');
                    i10 = i5;
                }
                if (i11 >= iArr2.length) {
                    int[] iArr3 = new int[(iArr2.length * 3) / 2];
                    System.arraycopy(iArr2, 0, iArr3, 0, i11);
                    iArr2 = iArr3;
                }
                i6 = i11 + 1;
                if (z4) {
                    i12 = -i12;
                }
                iArr2[i11] = i12;
                if (p02 == ',') {
                    char p05 = p0(this.f3185f + i5);
                    i5++;
                    p02 = p05;
                } else if (p02 == ']') {
                    i7 = i5 + 1;
                    p03 = p0(this.f3185f + i5);
                    break;
                }
                i11 = i6;
                iArr = null;
                p04 = p02;
                i10 = i5;
            }
            int[] iArr4 = iArr;
            this.f3193n = -1;
            return iArr4;
        }
        i7 = i10 + 1;
        p03 = p0(this.f3185f + i10);
        i6 = 0;
        if (i6 != iArr2.length) {
            int[] iArr5 = new int[i6];
            System.arraycopy(iArr2, 0, iArr5, 0, i6);
            iArr2 = iArr5;
        }
        if (p03 == ',') {
            this.f3185f = (i7 - 1) + this.f3185f;
            next();
            this.f3193n = 3;
            this.f3181b = 16;
            return iArr2;
        }
        if (p03 != '}') {
            this.f3193n = -1;
            return null;
        }
        int i13 = i7 + 1;
        char p06 = p0(this.f3185f + i7);
        if (p06 == ',') {
            this.f3181b = 16;
        } else {
            if (p06 == ']') {
                i8 = 15;
            } else {
                if (p06 != '}') {
                    if (p06 != 26) {
                        this.f3193n = -1;
                        return null;
                    }
                    this.f3185f = (i13 - 1) + this.f3185f;
                    this.f3181b = 20;
                    this.f3184e = (char) 26;
                    this.f3193n = 4;
                    return iArr2;
                }
                i8 = 13;
            }
            this.f3181b = i8;
        }
        this.f3185f = (i13 - 1) + this.f3185f;
        next();
        this.f3193n = 4;
        return iArr2;
    }

    @Override // i.c
    public final int I() {
        int i5;
        boolean z4;
        int i6 = 0;
        if (this.f3188i == -1) {
            this.f3188i = 0;
        }
        int i7 = this.f3188i;
        int i8 = this.f3187h + i7;
        if (p0(i7) == '-') {
            i5 = Integer.MIN_VALUE;
            i7++;
            z4 = true;
        } else {
            i5 = -2147483647;
            z4 = false;
        }
        if (i7 < i8) {
            i6 = -(p0(i7) - '0');
            i7++;
        }
        while (i7 < i8) {
            int i9 = i7 + 1;
            char p02 = p0(i7);
            if (p02 == 'L' || p02 == 'S' || p02 == 'B') {
                i7 = i9;
                break;
            }
            int i10 = p02 - '0';
            if (i6 < -214748364) {
                throw new NumberFormatException(i0());
            }
            int i11 = i6 * 10;
            if (i11 < i5 + i10) {
                throw new NumberFormatException(i0());
            }
            i6 = i11 - i10;
            i7 = i9;
        }
        if (!z4) {
            return -i6;
        }
        if (i7 > this.f3188i + 1) {
            return i6;
        }
        throw new NumberFormatException(i0());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long I0(char[] r18) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.I0(char[]):long");
    }

    @Override // i.c
    public final void J() {
        while (true) {
            char c5 = this.f3184e;
            if (c5 > '/') {
                return;
            }
            if (c5 == ' ' || c5 == '\r' || c5 == '\n' || c5 == '\t' || c5 == '\f' || c5 == '\b') {
                next();
            } else if (c5 != '/') {
                return;
            } else {
                M0();
            }
        }
    }

    public String J0(char[] cArr) {
        int i5;
        int i6;
        this.f3193n = 0;
        if (o0(cArr)) {
            int length = cArr.length;
            int i7 = length + 1;
            if (p0(this.f3185f + length) == '\"') {
                int r02 = r0(this.f3185f + cArr.length + 1);
                if (r02 == -1) {
                    throw new f.d("unclosed str");
                }
                int length2 = this.f3185f + cArr.length + 1;
                String N0 = N0(length2, r02 - length2);
                if (N0.indexOf(92) != -1) {
                    while (true) {
                        int i8 = 0;
                        for (int i9 = r02 - 1; i9 >= 0 && p0(i9) == '\\'; i9--) {
                            i8++;
                        }
                        if (i8 % 2 == 0) {
                            break;
                        }
                        r02 = r0(r02 + 1);
                    }
                    int i10 = this.f3185f;
                    int length3 = r02 - ((cArr.length + i10) + 1);
                    N0 = x0(O0(i10 + cArr.length + 1, length3), length3);
                }
                int i11 = this.f3185f;
                int length4 = (r02 - ((cArr.length + i11) + 1)) + 1 + i7;
                int i12 = length4 + 1;
                char p02 = p0(i11 + length4);
                if (p02 == ',') {
                    int i13 = this.f3185f + i12;
                    this.f3185f = i13;
                    this.f3184e = p0(i13);
                    i6 = 3;
                } else if (p02 == '}') {
                    int i14 = i12 + 1;
                    char p03 = p0(this.f3185f + i12);
                    if (p03 == ',') {
                        i5 = 16;
                    } else if (p03 == ']') {
                        i5 = 15;
                    } else if (p03 == '}') {
                        i5 = 13;
                    } else if (p03 == 26) {
                        this.f3181b = 20;
                        this.f3185f = (i14 - 1) + this.f3185f;
                        this.f3184e = (char) 26;
                        i6 = 4;
                    }
                    this.f3181b = i5;
                    int i15 = this.f3185f + i14;
                    this.f3185f = i15;
                    this.f3184e = p0(i15);
                    i6 = 4;
                }
                this.f3193n = i6;
                return N0;
            }
            this.f3193n = -1;
        } else {
            this.f3193n = -2;
        }
        return this.f3194o;
    }

    @Override // i.c
    public final void K() {
        this.f3187h = 0;
    }

    public long K0(char[] cArr) {
        int i5;
        int i6;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return 0L;
        }
        int length = cArr.length;
        int i7 = length + 1;
        if (p0(this.f3185f + length) != '\"') {
            this.f3193n = -1;
            return 0L;
        }
        long j5 = -3750763034362895579L;
        while (true) {
            int i8 = i7 + 1;
            char p02 = p0(this.f3185f + i7);
            if (p02 == '\"') {
                int i9 = i8 + 1;
                char p03 = p0(this.f3185f + i8);
                if (p03 == ',') {
                    int i10 = this.f3185f + i9;
                    this.f3185f = i10;
                    this.f3184e = p0(i10);
                    i6 = 3;
                } else {
                    if (p03 != '}') {
                        this.f3193n = -1;
                        return 0L;
                    }
                    int i11 = i9 + 1;
                    char p04 = p0(this.f3185f + i9);
                    if (p04 == ',') {
                        i5 = 16;
                    } else if (p04 == ']') {
                        i5 = 15;
                    } else if (p04 == '}') {
                        i5 = 13;
                    } else {
                        if (p04 != 26) {
                            this.f3193n = -1;
                            return 0L;
                        }
                        this.f3181b = 20;
                        this.f3185f = (i11 - 1) + this.f3185f;
                        this.f3184e = (char) 26;
                        i6 = 4;
                    }
                    this.f3181b = i5;
                    int i12 = this.f3185f + i11;
                    this.f3185f = i12;
                    this.f3184e = p0(i12);
                    i6 = 4;
                }
                this.f3193n = i6;
                return j5;
            }
            j5 = (j5 ^ p02) * 1099511628211L;
            if (p02 == '\\') {
                this.f3193n = -1;
                return 0L;
            }
            i7 = i8;
        }
    }

    public final void L0() {
        this.f3188i = this.f3185f - 1;
        this.f3189j = false;
        do {
            this.f3187h++;
            next();
        } while (Character.isLetterOrDigit(this.f3184e));
        String k02 = k0();
        this.f3181b = "null".equalsIgnoreCase(k02) ? 8 : "new".equals(k02) ? 9 : "true".equals(k02) ? 6 : "false".equals(k02) ? 7 : "undefined".equals(k02) ? 23 : "Set".equals(k02) ? 21 : "TreeSet".equals(k02) ? 22 : 18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0077, code lost:
    
        if (r0 != '-') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r0 != 'F') goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0085 -> B:44:0x0079). Please report as a decompilation issue!!! */
    @Override // i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            r9 = this;
            int r0 = r9.f3185f
            r9.f3188i = r0
            char r0 = r9.f3184e
            r1 = 45
            r2 = 1
            if (r0 != r1) goto L13
        Lb:
            int r0 = r9.f3187h
            int r0 = r0 + r2
            r9.f3187h = r0
            r9.next()
        L13:
            char r0 = r9.f3184e
            r3 = 57
            r4 = 48
            if (r0 < r4) goto L1e
            if (r0 > r3) goto L1e
            goto Lb
        L1e:
            r5 = 0
            r6 = 46
            if (r0 != r6) goto L33
        L23:
            int r0 = r9.f3187h
            int r0 = r0 + r2
            r9.f3187h = r0
            r9.next()
            char r0 = r9.f3184e
            if (r0 < r4) goto L32
            if (r0 > r3) goto L32
            goto L23
        L32:
            r5 = 1
        L33:
            char r0 = r9.f3184e
            r6 = 76
            if (r0 != r6) goto L42
        L39:
            int r0 = r9.f3187h
            int r0 = r0 + r2
            r9.f3187h = r0
            r9.next()
            goto L67
        L42:
            r6 = 83
            if (r0 != r6) goto L47
            goto L39
        L47:
            r6 = 66
            if (r0 != r6) goto L4c
            goto L39
        L4c:
            r6 = 70
            if (r0 != r6) goto L59
        L50:
            int r0 = r9.f3187h
            int r0 = r0 + r2
            r9.f3187h = r0
            r9.next()
            goto L8d
        L59:
            r7 = 68
            if (r0 != r7) goto L5e
            goto L50
        L5e:
            r8 = 101(0x65, float:1.42E-43)
            if (r0 == r8) goto L69
            r8 = 69
            if (r0 != r8) goto L67
            goto L69
        L67:
            r2 = r5
            goto L8d
        L69:
            int r0 = r9.f3187h
            int r0 = r0 + r2
            r9.f3187h = r0
            r9.next()
            char r0 = r9.f3184e
            r5 = 43
            if (r0 == r5) goto L79
            if (r0 != r1) goto L81
        L79:
            int r0 = r9.f3187h
            int r0 = r0 + r2
            r9.f3187h = r0
            r9.next()
        L81:
            char r0 = r9.f3184e
            if (r0 < r4) goto L88
            if (r0 > r3) goto L88
            goto L79
        L88:
            if (r0 == r7) goto L50
            if (r0 != r6) goto L8d
            goto L50
        L8d:
            if (r2 == 0) goto L91
            r0 = 3
            goto L92
        L91:
            r0 = 2
        L92:
            r9.f3181b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.M():void");
    }

    public final void M0() {
        char c5;
        next();
        char c6 = this.f3184e;
        if (c6 == '/') {
            do {
                next();
                c5 = this.f3184e;
                if (c5 == '\n') {
                    next();
                    return;
                }
            } while (c5 != 26);
            return;
        }
        if (c6 != '*') {
            throw new f.d("invalid comment");
        }
        while (true) {
            next();
            do {
                char c7 = this.f3184e;
                if (c7 == 26) {
                    return;
                }
                if (c7 == '*') {
                    next();
                }
            } while (this.f3184e != '/');
            next();
            return;
        }
    }

    @Override // i.c
    public final String N(j jVar) {
        int i5;
        J();
        char c5 = this.f3184e;
        if (c5 == '\"') {
            return b(jVar, Typography.quote);
        }
        if (c5 == '\'') {
            if (A(b.AllowSingleQuotes)) {
                return b(jVar, '\'');
            }
            throw new f.d("syntax error");
        }
        if (c5 == '}') {
            next();
            i5 = 13;
        } else if (c5 == ',') {
            next();
            i5 = 16;
        } else {
            if (c5 != 26) {
                if (A(b.AllowUnQuotedFieldNames)) {
                    return W(jVar);
                }
                throw new f.d("syntax error");
            }
            i5 = 20;
        }
        this.f3181b = i5;
        return null;
    }

    public abstract String N0(int i5, int i6);

    public abstract char[] O0(int i5, int i6);

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0129 -> B:64:0x012b). Please report as a decompilation issue!!! */
    @Override // i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long P(char r16) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.P(char):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // i.c
    public final void Q(int i5) {
        this.f3187h = 0;
        while (true) {
            if (i5 == 2) {
                char c5 = this.f3184e;
                if (c5 >= '0' && c5 <= '9') {
                    this.f3182c = this.f3185f;
                    M();
                    return;
                }
                if (c5 == '\"') {
                    this.f3182c = this.f3185f;
                    E();
                    return;
                } else if (c5 == '[') {
                    this.f3181b = 14;
                    next();
                    return;
                } else if (c5 == '{') {
                    this.f3181b = 12;
                    next();
                    return;
                }
            } else if (i5 == 4) {
                char c6 = this.f3184e;
                if (c6 == '\"') {
                    this.f3182c = this.f3185f;
                    E();
                    return;
                }
                if (c6 >= '0' && c6 <= '9') {
                    this.f3182c = this.f3185f;
                    M();
                    return;
                } else if (c6 == '[') {
                    this.f3181b = 14;
                    next();
                    return;
                } else if (c6 == '{') {
                    this.f3181b = 12;
                    next();
                    return;
                }
            } else if (i5 == 12) {
                char c7 = this.f3184e;
                if (c7 == '{') {
                    this.f3181b = 12;
                    next();
                    return;
                } else if (c7 == '[') {
                    this.f3181b = 14;
                    next();
                    return;
                }
            } else {
                if (i5 == 18) {
                    while (t0(this.f3184e)) {
                        next();
                    }
                    char c8 = this.f3184e;
                    if (c8 == '_' || c8 == '$' || Character.isLetter(c8)) {
                        L0();
                        return;
                    } else {
                        y();
                        return;
                    }
                }
                if (i5 != 20) {
                    switch (i5) {
                        case 14:
                            char c9 = this.f3184e;
                            if (c9 != '[') {
                                if (c9 == '{') {
                                    this.f3181b = 12;
                                    next();
                                    break;
                                }
                            } else {
                                this.f3181b = 14;
                                next();
                                break;
                            }
                            break;
                        case 15:
                            if (this.f3184e == ']') {
                                this.f3181b = 15;
                                next();
                                break;
                            }
                            break;
                        case 16:
                            char c10 = this.f3184e;
                            if (c10 != ',') {
                                if (c10 != '}') {
                                    if (c10 != ']') {
                                        if (c10 == 26) {
                                            this.f3181b = 20;
                                            break;
                                        }
                                    } else {
                                        this.f3181b = 15;
                                        next();
                                        break;
                                    }
                                } else {
                                    this.f3181b = 13;
                                    next();
                                    break;
                                }
                            } else {
                                this.f3181b = 16;
                                next();
                                break;
                            }
                            break;
                    }
                    return;
                }
                if (this.f3184e == 26) {
                    this.f3181b = 20;
                    return;
                }
            }
            char c11 = this.f3184e;
            if (c11 != ' ' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != '\f' && c11 != '\b') {
                y();
                return;
            }
            next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    @Override // i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum<?> R(java.lang.Class<?> r10, i.j r11, char r12) {
        /*
            r9 = this;
            r0 = 0
            r9.f3193n = r0
            int r1 = r9.f3185f
            int r1 = r1 + r0
            char r1 = r9.p0(r1)
            r2 = 1
            r3 = 3
            r4 = -1
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 0
            if (r1 != r5) goto L49
            int r11 = r9.f3185f
            int r11 = r11 + r2
            char r11 = r9.p0(r11)
            r0 = 117(0x75, float:1.64E-43)
            if (r11 != r0) goto L9a
            int r11 = r9.f3185f
            char r11 = androidx.appcompat.view.a.a(r11, r2, r2, r9)
            r0 = 108(0x6c, float:1.51E-43)
            if (r11 != r0) goto L9a
            int r11 = r9.f3185f
            r1 = 2
            char r11 = androidx.appcompat.view.a.a(r11, r2, r1, r9)
            if (r11 != r0) goto L9a
            int r11 = r9.f3185f
            int r11 = r11 + 4
            char r11 = r9.p0(r11)
            if (r11 != r12) goto L9a
            int r11 = r9.f3185f
            int r11 = r11 + 5
            r9.f3185f = r11
            char r11 = r9.p0(r11)
            r9.f3184e = r11
            r9.f3193n = r3
            goto L9c
        L49:
            r5 = 34
            if (r1 == r5) goto L4e
            goto L9a
        L4e:
            r1 = 1
        L4f:
            int r7 = r9.f3185f
            int r8 = r1 + 1
            int r7 = r7 + r1
            char r1 = r9.p0(r7)
            if (r1 != r5) goto L93
            int r1 = r9.f3185f
            int r5 = r1 + 0
            int r5 = r5 + r2
            int r1 = r1 + r8
            int r1 = r1 - r5
            int r1 = r1 - r2
            java.lang.String r11 = r9.m0(r5, r1, r0, r11)
            int r0 = r9.f3185f
            int r1 = r8 + 1
            int r0 = r0 + r8
            char r0 = r9.p0(r0)
        L6f:
            if (r0 != r12) goto L7f
            int r12 = r9.f3185f
            int r12 = r12 + r1
            r9.f3185f = r12
            char r12 = r9.p0(r12)
            r9.f3184e = r12
            r9.f3193n = r3
            goto L9d
        L7f:
            boolean r0 = t0(r0)
            if (r0 == 0) goto L90
            int r0 = r9.f3185f
            int r2 = r1 + 1
            int r0 = r0 + r1
            char r0 = r9.p0(r0)
            r1 = r2
            goto L6f
        L90:
            r9.f3193n = r4
            goto L9d
        L93:
            int r0 = r0 * 31
            int r0 = r0 + r1
            r7 = 92
            if (r1 != r7) goto La5
        L9a:
            r9.f3193n = r4
        L9c:
            r11 = r6
        L9d:
            if (r11 != 0) goto La0
            return r6
        La0:
            java.lang.Enum r10 = java.lang.Enum.valueOf(r10, r11)
            return r10
        La5:
            r1 = r8
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.R(java.lang.Class, i.j, char):java.lang.Enum");
    }

    @Override // i.c
    public final void S() {
        v0();
    }

    @Override // i.c
    public abstract BigDecimal U();

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00ef -> B:53:0x00f1). Please report as a decompilation issue!!! */
    @Override // i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int V(char r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.V(char):int");
    }

    @Override // i.c
    public final String W(j jVar) {
        if (this.f3181b == 1 && this.f3182c == 0 && this.f3185f == 1) {
            this.f3185f = 0;
        }
        boolean[] zArr = m.e.f4083c;
        int i5 = this.f3184e;
        if (!(i5 >= zArr.length || zArr[i5])) {
            StringBuilder g5 = androidx.activity.d.g("illegal identifier : ");
            g5.append(this.f3184e);
            g5.append(c());
            throw new f.d(g5.toString());
        }
        boolean[] zArr2 = m.e.f4084d;
        this.f3188i = this.f3185f;
        this.f3187h = 1;
        while (true) {
            char next = next();
            if (next < zArr2.length && !zArr2[next]) {
                break;
            }
            i5 = (i5 * 31) + next;
            this.f3187h++;
        }
        this.f3184e = p0(this.f3185f);
        this.f3181b = 18;
        if (this.f3187h == 4 && i5 == 3392903 && p0(this.f3188i) == 'n' && p0(this.f3188i + 1) == 'u' && p0(this.f3188i + 2) == 'l' && p0(this.f3188i + 3) == 'l') {
            return null;
        }
        return jVar == null ? N0(this.f3188i, this.f3187h) : m0(this.f3188i, this.f3187h, i5, jVar);
    }

    @Override // i.c
    public final String Y() {
        return g.w(this.f3181b);
    }

    @Override // i.c
    public final Number Z(boolean z4) {
        char p02 = p0((this.f3188i + this.f3187h) - 1);
        try {
            if (p02 == 'F') {
                return Float.valueOf(Float.parseFloat(i0()));
            }
            if (p02 != 'D' && z4) {
                return U();
            }
            return Double.valueOf(Double.parseDouble(i0()));
        } catch (NumberFormatException e5) {
            throw new f.d(e5.getMessage() + ", " + c());
        }
    }

    @Override // i.c
    public final int a() {
        return this.f3182c;
    }

    @Override // i.c
    public final String b(j jVar, char c5) {
        String b5;
        int i5;
        this.f3188i = this.f3185f;
        this.f3187h = 0;
        boolean z4 = false;
        int i6 = 0;
        while (true) {
            char next = next();
            if (next == c5) {
                this.f3181b = 4;
                if (z4) {
                    b5 = jVar.b(this.f3186g, 0, this.f3187h, i6);
                } else {
                    int i7 = this.f3188i;
                    b5 = m0(i7 == -1 ? 0 : i7 + 1, this.f3187h, i6, jVar);
                }
                this.f3187h = 0;
                next();
                return b5;
            }
            if (next == 26) {
                throw new f.d("unclosed.str");
            }
            char c6 = IOUtils.DIR_SEPARATOR_WINDOWS;
            if (next == '\\') {
                if (!z4) {
                    int i8 = this.f3187h;
                    char[] cArr = this.f3186g;
                    if (i8 >= cArr.length) {
                        int length = cArr.length * 2;
                        if (i8 <= length) {
                            i8 = length;
                        }
                        char[] cArr2 = new char[i8];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.f3186g = cArr2;
                    }
                    n0(this.f3188i + 1, this.f3186g, this.f3187h);
                    z4 = true;
                }
                char next2 = next();
                char c7 = Typography.quote;
                if (next2 != '\"') {
                    c7 = '\'';
                    if (next2 != '\'') {
                        if (next2 != 'F') {
                            if (next2 != '\\') {
                                if (next2 == 'b') {
                                    i5 = i6 * 31;
                                    next = '\b';
                                } else if (next2 != 'f') {
                                    if (next2 == 'n') {
                                        i5 = i6 * 31;
                                        next = '\n';
                                    } else if (next2 == 'r') {
                                        i5 = i6 * 31;
                                        next = '\r';
                                    } else if (next2 != 'x') {
                                        c6 = 3;
                                        switch (next2) {
                                            case '/':
                                                i5 = i6 * 31;
                                                next = IOUtils.DIR_SEPARATOR_UNIX;
                                                break;
                                            case '0':
                                                i6 = (i6 * 31) + next2;
                                                w0((char) 0);
                                                break;
                                            case '1':
                                                i6 = (i6 * 31) + next2;
                                                w0((char) 1);
                                                break;
                                            case '2':
                                                i6 = (i6 * 31) + next2;
                                                next = 2;
                                                w0(next);
                                                break;
                                            case '3':
                                                i6 = (i6 * 31) + next2;
                                                break;
                                            case '4':
                                                i6 = (i6 * 31) + next2;
                                                w0((char) 4);
                                                break;
                                            case '5':
                                                i6 = (i6 * 31) + next2;
                                                next = 5;
                                                w0(next);
                                                break;
                                            case '6':
                                                i6 = (i6 * 31) + next2;
                                                next = 6;
                                                w0(next);
                                                break;
                                            case '7':
                                                i6 = (i6 * 31) + next2;
                                                next = 7;
                                                w0(next);
                                                break;
                                            default:
                                                switch (next2) {
                                                    case 't':
                                                        i5 = i6 * 31;
                                                        next = '\t';
                                                        break;
                                                    case 'u':
                                                        int parseInt = Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                        i6 = (i6 * 31) + parseInt;
                                                        next = (char) parseInt;
                                                        w0(next);
                                                        break;
                                                    case 'v':
                                                        i5 = i6 * 31;
                                                        next = 11;
                                                        break;
                                                    default:
                                                        this.f3184e = next2;
                                                        throw new f.d("unclosed.str.lit");
                                                }
                                        }
                                    } else {
                                        char next3 = next();
                                        this.f3184e = next3;
                                        char next4 = next();
                                        this.f3184e = next4;
                                        int[] iArr = f3180q;
                                        next = (char) ((iArr[next3] * 16) + iArr[next4]);
                                        i5 = i6 * 31;
                                    }
                                }
                                i6 = i5 + next;
                                w0(next);
                            } else {
                                i6 = (i6 * 31) + 92;
                            }
                            w0(c6);
                        }
                        i5 = i6 * 31;
                        next = '\f';
                        i6 = i5 + next;
                        w0(next);
                    }
                }
                i6 = (i6 * 31) + c7;
                w0(c7);
            } else {
                i6 = (i6 * 31) + next;
                if (z4) {
                    int i9 = this.f3187h;
                    char[] cArr3 = this.f3186g;
                    if (i9 == cArr3.length) {
                        w0(next);
                    } else {
                        this.f3187h = i9 + 1;
                        cArr3[i9] = next;
                    }
                } else {
                    this.f3187h++;
                }
            }
        }
    }

    @Override // i.c
    public String c() {
        return "";
    }

    @Override // i.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.f3186g;
        if (cArr.length <= 8192) {
            f3179p.set(cArr);
        }
        this.f3186g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:10:0x0032). Please report as a decompilation issue!!! */
    @Override // i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e() {
        /*
            r15 = this;
            int r0 = r15.f3188i
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L8
            r15.f3188i = r1
        L8:
            int r0 = r15.f3188i
            int r2 = r15.f3187h
            int r2 = r2 + r0
            char r3 = r15.p0(r0)
            r4 = 45
            r5 = 1
            if (r3 != r4) goto L1c
            r3 = -9223372036854775808
            int r0 = r0 + 1
            r1 = 1
            goto L21
        L1c:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L21:
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            if (r0 >= r2) goto L34
            int r8 = r0 + 1
            char r0 = r15.p0(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r9 = (long) r0
        L32:
            r0 = r8
            goto L36
        L34:
            r9 = 0
        L36:
            if (r0 >= r2) goto L73
            int r8 = r0 + 1
            char r0 = r15.p0(r0)
            r11 = 76
            if (r0 == r11) goto L72
            r11 = 83
            if (r0 == r11) goto L72
            r11 = 66
            if (r0 != r11) goto L4b
            goto L72
        L4b:
            int r0 = r0 + (-48)
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 < 0) goto L68
            r11 = 10
            long r9 = r9 * r11
            long r11 = (long) r0
            long r13 = r3 + r11
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 < 0) goto L5e
            long r9 = r9 - r11
            goto L32
        L5e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r15.i0()
            r0.<init>(r1)
            throw r0
        L68:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r15.i0()
            r0.<init>(r1)
            throw r0
        L72:
            r0 = r8
        L73:
            if (r1 == 0) goto L85
            int r1 = r15.f3188i
            int r1 = r1 + r5
            if (r0 <= r1) goto L7b
            return r9
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r15.i0()
            r0.<init>(r1)
            throw r0
        L85:
            long r0 = -r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.e():long");
    }

    @Override // i.c
    public final Number f() {
        long j5;
        long j6;
        boolean z4 = false;
        if (this.f3188i == -1) {
            this.f3188i = 0;
        }
        int i5 = this.f3188i;
        int i6 = this.f3187h + i5;
        char c5 = ' ';
        char p02 = p0(i6 - 1);
        if (p02 == 'B') {
            i6--;
            c5 = 'B';
        } else if (p02 == 'L') {
            i6--;
            c5 = 'L';
        } else if (p02 == 'S') {
            i6--;
            c5 = 'S';
        }
        if (p0(this.f3188i) == '-') {
            j5 = Long.MIN_VALUE;
            i5++;
            z4 = true;
        } else {
            j5 = -9223372036854775807L;
        }
        long j7 = -922337203685477580L;
        if (i5 < i6) {
            j6 = -(p0(i5) - '0');
            i5++;
        } else {
            j6 = 0;
        }
        while (i5 < i6) {
            int i7 = i5 + 1;
            int p03 = p0(i5) - '0';
            if (j6 < j7) {
                return new BigInteger(i0());
            }
            long j8 = j6 * 10;
            long j9 = p03;
            if (j8 < j5 + j9) {
                return new BigInteger(i0());
            }
            j6 = j8 - j9;
            i5 = i7;
            j7 = -922337203685477580L;
        }
        if (z4) {
            if (i5 > this.f3188i + 1) {
                return (j6 < -2147483648L || c5 == 'L') ? Long.valueOf(j6) : c5 == 'S' ? Short.valueOf((short) j6) : c5 == 'B' ? Byte.valueOf((byte) j6) : Integer.valueOf((int) j6);
            }
            throw new NumberFormatException(i0());
        }
        long j10 = -j6;
        if (j10 > 2147483647L || c5 == 'L') {
            return Long.valueOf(j10);
        }
        if (c5 == 'S') {
            return Short.valueOf((short) j10);
        }
        int i8 = (int) j10;
        return c5 == 'B' ? Byte.valueOf((byte) i8) : Integer.valueOf(i8);
    }

    @Override // i.c
    public final Locale f0() {
        return this.f3192m;
    }

    @Override // i.c
    public final boolean g0() {
        return this.f3187h == 4 && p0(this.f3188i + 1) == '$' && p0(this.f3188i + 2) == 'r' && p0(this.f3188i + 3) == 'e' && p0(this.f3188i + 4) == 'f';
    }

    @Override // i.c
    public abstract String i0();

    @Override // i.c
    public final boolean isEnabled(int i5) {
        return (i5 & this.f3183d) != 0;
    }

    @Override // i.c
    public abstract String k0();

    @Override // i.c
    public final float l() {
        char charAt;
        String i02 = i0();
        float parseFloat = Float.parseFloat(i02);
        if ((parseFloat == 0.0f || parseFloat == Float.POSITIVE_INFINITY) && (charAt = i02.charAt(0)) > '0' && charAt <= '9') {
            throw new f.d(androidx.activity.d.f("float overflow : ", i02));
        }
        return parseFloat;
    }

    @Override // i.c
    public final TimeZone l0() {
        return this.f3191l;
    }

    public abstract String m0(int i5, int i6, int i7, j jVar);

    @Override // i.c
    public boolean n() {
        int i5 = 0;
        while (true) {
            char p02 = p0(i5);
            if (p02 == 26) {
                this.f3181b = 20;
                return true;
            }
            if (!t0(p02)) {
                return false;
            }
            i5++;
        }
    }

    public abstract void n0(int i5, char[] cArr, int i6);

    @Override // i.c
    public abstract char next();

    public abstract boolean o0(char[] cArr);

    @Override // i.c
    public final BigDecimal p() {
        int i5;
        int i6;
        char p02;
        d dVar;
        int i7;
        int i8;
        char c5;
        int i9;
        this.f3193n = 0;
        char p03 = p0(this.f3185f + 0);
        boolean z4 = p03 == '\"';
        if (z4) {
            p03 = p0(this.f3185f + 1);
            i5 = 2;
        } else {
            i5 = 1;
        }
        if (p03 == '-') {
            p03 = p0(this.f3185f + i5);
            i5++;
        }
        if (p03 < '0' || p03 > '9') {
            if (p03 != 'n' || p0(this.f3185f + i5) != 'u' || androidx.appcompat.view.a.a(this.f3185f, i5, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, i5, 2, this) != 'l') {
                this.f3193n = -1;
                return null;
            }
            this.f3193n = 5;
            int i10 = i5 + 3;
            int i11 = i10 + 1;
            char p04 = p0(this.f3185f + i10);
            if (z4 && p04 == '\"') {
                p04 = p0(this.f3185f + i11);
                i11++;
            }
            while (p04 != ',') {
                if (p04 == '}') {
                    int i12 = this.f3185f + i11;
                    this.f3185f = i12;
                    this.f3184e = p0(i12);
                    this.f3193n = 5;
                    this.f3181b = 13;
                    return null;
                }
                if (!t0(p04)) {
                    this.f3193n = -1;
                    return null;
                }
                p04 = p0(this.f3185f + i11);
                i11++;
            }
            int i13 = this.f3185f + i11;
            this.f3185f = i13;
            this.f3184e = p0(i13);
            this.f3193n = 5;
            this.f3181b = 16;
            return null;
        }
        while (true) {
            i6 = i5 + 1;
            p02 = p0(this.f3185f + i5);
            if (p02 < '0' || p02 > '9') {
                break;
            }
            i5 = i6;
        }
        if (p02 == '.') {
            int i14 = i6 + 1;
            char p05 = p0(this.f3185f + i6);
            if (p05 >= '0' && p05 <= '9') {
                while (true) {
                    i6 = i14 + 1;
                    p02 = p0(this.f3185f + i14);
                    if (p02 < '0' || p02 > '9') {
                        break;
                    }
                    i14 = i6;
                }
            } else {
                this.f3193n = -1;
                return null;
            }
        }
        if (p02 == 'e' || p02 == 'E') {
            int i15 = i6 + 1;
            p02 = p0(this.f3185f + i6);
            if (p02 == '+' || p02 == '-') {
                int i16 = i15 + 1;
                p02 = p0(this.f3185f + i15);
                dVar = this;
                i6 = i16;
            } else {
                i6 = i15;
                dVar = this;
            }
            while (p02 >= '0' && p02 <= '9') {
                int i17 = i6 + 1;
                p02 = dVar.p0(dVar.f3185f + i6);
                i6 = i17;
            }
        } else {
            dVar = this;
        }
        if (!z4) {
            i7 = dVar.f3185f;
            i8 = ((i7 + i6) - i7) - 1;
        } else {
            if (p02 != '\"') {
                dVar.f3193n = -1;
                return null;
            }
            int i18 = i6 + 1;
            p02 = dVar.p0(dVar.f3185f + i6);
            int i19 = dVar.f3185f;
            i7 = i19 + 1;
            i8 = ((i19 + i18) - i7) - 2;
            i6 = i18;
        }
        BigDecimal bigDecimal = new BigDecimal(dVar.O0(i7, i8));
        if (p02 == ',') {
            int i20 = dVar.f3185f + i6;
            dVar.f3185f = i20;
            dVar.f3184e = dVar.p0(i20);
            dVar.f3193n = 3;
            dVar.f3181b = 16;
            return bigDecimal;
        }
        if (p02 != ']') {
            dVar.f3193n = -1;
            return null;
        }
        int i21 = i6 + 1;
        char p06 = dVar.p0(dVar.f3185f + i6);
        if (p06 == ',') {
            dVar.f3181b = 16;
        } else {
            if (p06 == ']') {
                i9 = 15;
            } else {
                if (p06 != '}') {
                    if (p06 != 26) {
                        dVar.f3193n = -1;
                        return null;
                    }
                    dVar.f3181b = 20;
                    dVar.f3185f = (i21 - 1) + dVar.f3185f;
                    c5 = 26;
                    dVar.f3184e = c5;
                    dVar.f3193n = 4;
                    return bigDecimal;
                }
                i9 = 13;
            }
            dVar.f3181b = i9;
        }
        int i22 = dVar.f3185f + i21;
        dVar.f3185f = i22;
        c5 = dVar.p0(i22);
        dVar.f3184e = c5;
        dVar.f3193n = 4;
        return bigDecimal;
    }

    public abstract char p0(int i5);

    @Override // i.c
    public final int q() {
        return this.f3181b;
    }

    public abstract void q0(int i5, int i6, char[] cArr);

    @Override // i.c
    public final String r(char c5) {
        this.f3193n = 0;
        char p02 = p0(this.f3185f + 0);
        if (p02 == 'n') {
            if (p0(this.f3185f + 1) != 'u' || androidx.appcompat.view.a.a(this.f3185f, 1, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, 1, 2, this) != 'l') {
                this.f3193n = -1;
                return null;
            }
            if (p0(this.f3185f + 4) != c5) {
                this.f3193n = -1;
                return null;
            }
            int i5 = this.f3185f + 5;
            this.f3185f = i5;
            this.f3184e = p0(i5);
            this.f3193n = 3;
            return null;
        }
        int i6 = 1;
        while (p02 != '\"') {
            if (!t0(p02)) {
                this.f3193n = -1;
                return this.f3194o;
            }
            p02 = p0(this.f3185f + i6);
            i6++;
        }
        int i7 = this.f3185f + i6;
        int r02 = r0(i7);
        if (r02 == -1) {
            throw new f.d("unclosed str");
        }
        String N0 = N0(this.f3185f + i6, r02 - i7);
        if (N0.indexOf(92) != -1) {
            while (true) {
                int i8 = 0;
                for (int i9 = r02 - 1; i9 >= 0 && p0(i9) == '\\'; i9--) {
                    i8++;
                }
                if (i8 % 2 == 0) {
                    break;
                }
                r02 = r0(r02 + 1);
            }
            int i10 = r02 - i7;
            N0 = x0(O0(this.f3185f + 1, i10), i10);
        }
        int i11 = (r02 - i7) + 1 + i6;
        int i12 = i11 + 1;
        char p03 = p0(this.f3185f + i11);
        while (p03 != c5) {
            if (!t0(p03)) {
                this.f3193n = -1;
                return N0;
            }
            p03 = p0(this.f3185f + i12);
            i12++;
        }
        int i13 = this.f3185f + i12;
        this.f3185f = i13;
        this.f3184e = p0(i13);
        this.f3193n = 3;
        return N0;
    }

    public abstract int r0(int i5);

    @Override // i.c
    public final boolean s(char c5) {
        boolean z4 = false;
        this.f3193n = 0;
        char p02 = p0(this.f3185f + 0);
        int i5 = 5;
        if (p02 == 't') {
            if (p0(this.f3185f + 1) != 'r' || androidx.appcompat.view.a.a(this.f3185f, 1, 1, this) != 'u' || androidx.appcompat.view.a.a(this.f3185f, 1, 2, this) != 'e') {
                this.f3193n = -1;
                return false;
            }
            p02 = p0(this.f3185f + 4);
            z4 = true;
        } else if (p02 != 'f') {
            if (p02 == '1') {
                p02 = p0(this.f3185f + 1);
                z4 = true;
            } else if (p02 == '0') {
                p02 = p0(this.f3185f + 1);
            } else {
                i5 = 1;
            }
            i5 = 2;
        } else {
            if (p0(this.f3185f + 1) != 'a' || androidx.appcompat.view.a.a(this.f3185f, 1, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, 1, 2, this) != 's' || androidx.appcompat.view.a.a(this.f3185f, 1, 3, this) != 'e') {
                this.f3193n = -1;
                return false;
            }
            p02 = p0(this.f3185f + 5);
            i5 = 6;
        }
        while (p02 != c5) {
            if (!t0(p02)) {
                this.f3193n = -1;
                return z4;
            }
            p02 = p0(this.f3185f + i5);
            i5++;
        }
        int i6 = this.f3185f + i5;
        this.f3185f = i6;
        this.f3184e = p0(i6);
        this.f3193n = 3;
        return z4;
    }

    public abstract boolean s0();

    public final boolean u0(char[] cArr) {
        int i5;
        while (!o0(cArr)) {
            if (!t0(this.f3184e)) {
                return false;
            }
            next();
        }
        int length = this.f3185f + cArr.length;
        this.f3185f = length;
        char p02 = p0(length);
        this.f3184e = p02;
        if (p02 == '{') {
            next();
            i5 = 12;
        } else if (p02 == '[') {
            next();
            i5 = 14;
        } else {
            if (p02 != 'S' || p0(this.f3185f + 1) != 'e' || p0(this.f3185f + 2) != 't' || p0(this.f3185f + 3) != '[') {
                y();
                return true;
            }
            int i6 = this.f3185f + 3;
            this.f3185f = i6;
            this.f3184e = p0(i6);
            i5 = 21;
        }
        this.f3181b = i5;
        return true;
    }

    public final void v0() {
        this.f3187h = 0;
        while (true) {
            char c5 = this.f3184e;
            if (c5 == ':') {
                next();
                y();
                return;
            }
            if (c5 != ' ' && c5 != '\n' && c5 != '\r' && c5 != '\t' && c5 != '\f' && c5 != '\b') {
                throw new f.d("not match : - " + this.f3184e + ", info : " + c());
            }
            next();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0194, code lost:
    
        r18.f3181b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0196, code lost:
    
        return 0.0d;
     */
    @Override // i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double w(char r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d.w(char):double");
    }

    public final void w0(char c5) {
        int i5 = this.f3187h;
        char[] cArr = this.f3186g;
        if (i5 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f3186g = cArr2;
        }
        char[] cArr3 = this.f3186g;
        int i6 = this.f3187h;
        this.f3187h = i6 + 1;
        cArr3[i6] = c5;
    }

    @Override // i.c
    public final float x(char c5) {
        int i5;
        int i6;
        int i7;
        char p02;
        boolean z4;
        d dVar;
        boolean z5;
        long j5;
        char c6;
        char c7;
        int i8;
        int i9;
        int i10;
        float parseFloat;
        boolean z6;
        char c8;
        this.f3193n = 0;
        char p03 = p0(this.f3185f + 0);
        boolean z7 = p03 == '\"';
        if (z7) {
            p03 = p0(this.f3185f + 1);
            i5 = 2;
        } else {
            i5 = 1;
        }
        boolean z8 = p03 == '-';
        if (z8) {
            p03 = p0(this.f3185f + i5);
            i5++;
        }
        if (p03 < '0' || p03 > '9') {
            boolean z9 = z7;
            if (p03 != 'n' || p0(this.f3185f + i5) != 'u' || androidx.appcompat.view.a.a(this.f3185f, i5, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, i5, 2, this) != 'l') {
                this.f3193n = -1;
                return 0.0f;
            }
            this.f3193n = 5;
            int i11 = i5 + 3;
            int i12 = i11 + 1;
            char p04 = p0(this.f3185f + i11);
            if (z9 && p04 == '\"') {
                p04 = p0(this.f3185f + i12);
                i12++;
            }
            while (true) {
                if (p04 == ',') {
                    int i13 = this.f3185f + i12;
                    this.f3185f = i13;
                    this.f3184e = p0(i13);
                    this.f3193n = 5;
                    i6 = 16;
                    break;
                }
                if (p04 == ']') {
                    int i14 = this.f3185f + i12;
                    this.f3185f = i14;
                    this.f3184e = p0(i14);
                    this.f3193n = 5;
                    i6 = 15;
                    break;
                }
                if (!t0(p04)) {
                    this.f3193n = -1;
                    return 0.0f;
                }
                p04 = p0(this.f3185f + i12);
                i12++;
            }
            this.f3181b = i6;
            return 0.0f;
        }
        long j6 = p03 - '0';
        while (true) {
            i7 = i5 + 1;
            p02 = p0(this.f3185f + i5);
            if (p02 < '0' || p02 > '9') {
                break;
            }
            j6 = (j6 * 10) + (p02 - '0');
            i5 = i7;
        }
        long j7 = 1;
        if (p02 == '.') {
            int i15 = i7 + 1;
            char p05 = p0(this.f3185f + i7);
            if (p05 >= '0' && p05 <= '9') {
                z4 = z7;
                j6 = (j6 * 10) + (p05 - '0');
                j7 = 10;
                while (true) {
                    i7 = i15 + 1;
                    p02 = p0(this.f3185f + i15);
                    if (p02 < '0' || p02 > '9') {
                        break;
                    }
                    j6 = (j6 * 10) + (p02 - '0');
                    j7 *= 10;
                    i15 = i7;
                }
            } else {
                this.f3193n = -1;
                return 0.0f;
            }
        } else {
            z4 = z7;
        }
        boolean z10 = p02 == 'e' || p02 == 'E';
        if (z10) {
            int i16 = i7 + 1;
            p02 = p0(this.f3185f + i7);
            if (p02 == '+' || p02 == '-') {
                int i17 = i16 + 1;
                char p06 = p0(this.f3185f + i16);
                dVar = this;
                z6 = z10;
                c8 = Typography.quote;
                i7 = i17;
                c7 = c5;
                p02 = p06;
            } else {
                dVar = this;
                i7 = i16;
                c8 = Typography.quote;
                z6 = z10;
                c7 = c5;
            }
            while (p02 >= '0' && p02 <= '9') {
                int i18 = i7 + 1;
                char p07 = dVar.p0(dVar.f3185f + i7);
                i7 = i18;
                c7 = c7;
                p02 = p07;
            }
            z5 = z6;
            j5 = j7;
            c6 = c8;
        } else {
            dVar = this;
            z5 = z10;
            j5 = j7;
            c6 = Typography.quote;
            c7 = c5;
        }
        if (!z4) {
            int i19 = dVar.f3185f;
            i8 = ((i19 + i7) - i19) - 1;
            int i20 = i7;
            i9 = i19;
            i10 = i20;
        } else {
            if (p02 != c6) {
                dVar.f3193n = -1;
                return 0.0f;
            }
            i10 = i7 + 1;
            p02 = dVar.p0(dVar.f3185f + i7);
            int i21 = dVar.f3185f;
            i9 = i21 + 1;
            i8 = ((i21 + i10) - i9) - 2;
        }
        if (z5 || i8 >= 20) {
            parseFloat = Float.parseFloat(dVar.N0(i9, i8));
        } else {
            parseFloat = j6 / j5;
            if (z8) {
                parseFloat = -parseFloat;
            }
        }
        if (p02 != c7) {
            dVar.f3193n = -1;
            return parseFloat;
        }
        int i22 = dVar.f3185f + i10;
        dVar.f3185f = i22;
        dVar.f3184e = dVar.p0(i22);
        dVar.f3193n = 3;
        dVar.f3181b = 16;
        return parseFloat;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // i.c
    public final void y() {
        char c5;
        char next;
        this.f3187h = 0;
        while (true) {
            this.f3182c = this.f3185f;
            char c6 = this.f3184e;
            if (c6 == '/') {
                M0();
            } else {
                if (c6 == '\"') {
                    E();
                    return;
                }
                if (c6 == ',') {
                    next();
                    this.f3181b = 16;
                    return;
                }
                if (c6 >= '0' && c6 <= '9') {
                    M();
                    return;
                }
                if (c6 != '-') {
                    switch (c6) {
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                            next();
                            break;
                        case '\'':
                            if (!A(b.AllowSingleQuotes)) {
                                throw new f.d("Feature.AllowSingleQuotes is false");
                            }
                            this.f3188i = this.f3185f;
                            this.f3189j = false;
                            while (true) {
                                char next2 = next();
                                char c7 = '\'';
                                if (next2 == '\'') {
                                    this.f3181b = 4;
                                    next();
                                    return;
                                }
                                if (next2 == 26) {
                                    if (s0()) {
                                        throw new f.d("unclosed single-quote string");
                                    }
                                    next2 = 26;
                                } else if (next2 == '\\') {
                                    if (!this.f3189j) {
                                        this.f3189j = true;
                                        int i5 = this.f3187h;
                                        char[] cArr = this.f3186g;
                                        if (i5 > cArr.length) {
                                            char[] cArr2 = new char[i5 * 2];
                                            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                                            this.f3186g = cArr2;
                                        }
                                        q0(this.f3188i + 1, this.f3187h, this.f3186g);
                                    }
                                    char next3 = next();
                                    if (next3 != '\"') {
                                        if (next3 != '\'') {
                                            if (next3 != 'F') {
                                                if (next3 == '\\') {
                                                    next2 = IOUtils.DIR_SEPARATOR_WINDOWS;
                                                } else if (next3 == 'b') {
                                                    next2 = '\b';
                                                } else if (next3 != 'f') {
                                                    if (next3 == 'n') {
                                                        next2 = '\n';
                                                    } else if (next3 == 'r') {
                                                        next2 = '\r';
                                                    } else if (next3 != 'x') {
                                                        c7 = 3;
                                                        c5 = 2;
                                                        switch (next3) {
                                                            case '/':
                                                                next2 = IOUtils.DIR_SEPARATOR_UNIX;
                                                                break;
                                                            case '0':
                                                                next2 = 0;
                                                                break;
                                                            case '1':
                                                                w0((char) 1);
                                                                break;
                                                            case '2':
                                                                break;
                                                            case '3':
                                                                break;
                                                            case '4':
                                                                w0((char) 4);
                                                                break;
                                                            case '5':
                                                                next2 = 5;
                                                                break;
                                                            case '6':
                                                                next2 = 6;
                                                                break;
                                                            case '7':
                                                                next2 = 7;
                                                                break;
                                                            default:
                                                                switch (next3) {
                                                                    case 't':
                                                                        next2 = '\t';
                                                                        break;
                                                                    case 'u':
                                                                        next2 = (char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                                        break;
                                                                    case 'v':
                                                                        next2 = 11;
                                                                        break;
                                                                    default:
                                                                        this.f3184e = next3;
                                                                        throw new f.d("unclosed single-quote string");
                                                                }
                                                        }
                                                    } else {
                                                        int[] iArr = f3180q;
                                                        next2 = (char) ((iArr[next()] * 16) + iArr[next()]);
                                                    }
                                                }
                                            }
                                            next2 = '\f';
                                        }
                                        w0(c7);
                                    } else {
                                        c5 = Typography.quote;
                                    }
                                    w0(c5);
                                } else if (this.f3189j) {
                                    int i6 = this.f3187h;
                                    char[] cArr3 = this.f3186g;
                                    if (i6 != cArr3.length) {
                                        this.f3187h = i6 + 1;
                                        cArr3[i6] = next2;
                                    }
                                } else {
                                    this.f3187h++;
                                }
                                w0(next2);
                            }
                        case '(':
                            next();
                            this.f3181b = 10;
                            return;
                        case ')':
                            next();
                            this.f3181b = 11;
                            return;
                        case '+':
                            next();
                            M();
                            return;
                        case '.':
                            next();
                            this.f3181b = 25;
                            return;
                        case ':':
                            next();
                            this.f3181b = 17;
                            return;
                        case ';':
                            next();
                            this.f3181b = 24;
                            return;
                        case 'N':
                        case 'S':
                        case 'T':
                        case 'u':
                            L0();
                            return;
                        case '[':
                            next();
                            this.f3181b = 14;
                            return;
                        case ']':
                            next();
                            this.f3181b = 15;
                            return;
                        case 'f':
                            if (c6 != 'f') {
                                throw new f.d("error parse false");
                            }
                            next();
                            if (this.f3184e != 'a') {
                                throw new f.d("error parse false");
                            }
                            next();
                            if (this.f3184e != 'l') {
                                throw new f.d("error parse false");
                            }
                            next();
                            if (this.f3184e != 's') {
                                throw new f.d("error parse false");
                            }
                            next();
                            if (this.f3184e != 'e') {
                                throw new f.d("error parse false");
                            }
                            next();
                            char c8 = this.f3184e;
                            if (c8 != ' ' && c8 != ',' && c8 != '}' && c8 != ']' && c8 != '\n' && c8 != '\r' && c8 != '\t' && c8 != 26 && c8 != '\f' && c8 != '\b' && c8 != ':' && c8 != '/') {
                                throw new f.d("scan false error");
                            }
                            this.f3181b = 7;
                            return;
                        case 'n':
                            if (c6 != 'n') {
                                throw new f.d("error parse null or new");
                            }
                            next();
                            char c9 = this.f3184e;
                            if (c9 != 'u') {
                                if (c9 != 'e') {
                                    throw new f.d("error parse new");
                                }
                                next();
                                if (this.f3184e != 'w') {
                                    throw new f.d("error parse new");
                                }
                                next();
                                char c10 = this.f3184e;
                                if (c10 != ' ' && c10 != ',' && c10 != '}' && c10 != ']' && c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != 26 && c10 != '\f' && c10 != '\b') {
                                    throw new f.d("scan new error");
                                }
                                this.f3181b = 9;
                                return;
                            }
                            next();
                            if (this.f3184e != 'l') {
                                throw new f.d("error parse null");
                            }
                            next();
                            if (this.f3184e != 'l') {
                                throw new f.d("error parse null");
                            }
                            next();
                            char c11 = this.f3184e;
                            if (c11 != ' ' && c11 != ',' && c11 != '}' && c11 != ']' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != 26 && c11 != '\f' && c11 != '\b') {
                                throw new f.d("scan null error");
                            }
                            this.f3181b = 8;
                            return;
                        case 't':
                            if (c6 != 't') {
                                throw new f.d("error parse true");
                            }
                            next();
                            if (this.f3184e != 'r') {
                                throw new f.d("error parse true");
                            }
                            next();
                            if (this.f3184e != 'u') {
                                throw new f.d("error parse true");
                            }
                            next();
                            if (this.f3184e != 'e') {
                                throw new f.d("error parse true");
                            }
                            next();
                            char c12 = this.f3184e;
                            if (c12 != ' ' && c12 != ',' && c12 != '}' && c12 != ']' && c12 != '\n' && c12 != '\r' && c12 != '\t' && c12 != 26 && c12 != '\f' && c12 != '\b' && c12 != ':' && c12 != '/') {
                                throw new f.d("scan true error");
                            }
                            this.f3181b = 6;
                            return;
                        case 'x':
                            if (c6 != 'x') {
                                StringBuilder g5 = androidx.activity.d.g("illegal state. ");
                                g5.append(this.f3184e);
                                throw new f.d(g5.toString());
                            }
                            next();
                            if (this.f3184e != '\'') {
                                StringBuilder g6 = androidx.activity.d.g("illegal state. ");
                                g6.append(this.f3184e);
                                throw new f.d(g6.toString());
                            }
                            this.f3188i = this.f3185f;
                            next();
                            while (true) {
                                next = next();
                                if ((next >= '0' && next <= '9') || (next >= 'A' && next <= 'F')) {
                                    this.f3187h++;
                                }
                            }
                            if (next == '\'') {
                                this.f3187h++;
                                next();
                                this.f3181b = 26;
                                return;
                            } else {
                                throw new f.d("illegal state. " + next);
                            }
                        case '{':
                            next();
                            this.f3181b = 12;
                            return;
                        case '}':
                            next();
                            this.f3181b = 13;
                            return;
                        default:
                            if (!s0()) {
                                char c13 = this.f3184e;
                                if (c13 > 31 && c13 != 127) {
                                    String.valueOf((int) c13);
                                    this.f3181b = 1;
                                    next();
                                    return;
                                }
                                next();
                                break;
                            } else {
                                if (this.f3181b == 20) {
                                    throw new f.d("EOF error");
                                }
                                this.f3181b = 20;
                                this.f3185f = 0;
                                this.f3182c = 0;
                                return;
                            }
                    }
                } else {
                    M();
                    return;
                }
            }
        }
    }

    public final BigInteger y0(char[] cArr) {
        int i5;
        char p02;
        int length;
        int i6;
        BigInteger valueOf;
        char p03;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return null;
        }
        int length2 = cArr.length;
        int i7 = length2 + 1;
        char p04 = p0(this.f3185f + length2);
        boolean z4 = p04 == '\"';
        if (z4) {
            p04 = p0(this.f3185f + i7);
            i7++;
        }
        boolean z5 = p04 == '-';
        if (z5) {
            p04 = p0(this.f3185f + i7);
            i7++;
        }
        char c5 = '0';
        if (p04 >= '0') {
            char c6 = '9';
            if (p04 <= '9') {
                long j5 = p04 - '0';
                while (true) {
                    i5 = i7 + 1;
                    p02 = p0(this.f3185f + i7);
                    if (p02 < c5 || p02 > c6) {
                        break;
                    }
                    j5 = (j5 * 10) + (p02 - '0');
                    i7 = i5;
                    c5 = '0';
                    c6 = '9';
                }
                if (!z4) {
                    int i8 = this.f3185f;
                    length = cArr.length + i8;
                    i6 = ((i8 + i5) - length) - 1;
                } else {
                    if (p02 != '\"') {
                        this.f3193n = -1;
                        return null;
                    }
                    int i9 = i5 + 1;
                    p02 = p0(this.f3185f + i5);
                    int i10 = this.f3185f;
                    length = cArr.length + i10 + 1;
                    i6 = ((i10 + i9) - length) - 2;
                    i5 = i9;
                }
                if (i6 < 20 || (z5 && i6 < 21)) {
                    if (z5) {
                        j5 = -j5;
                    }
                    valueOf = BigInteger.valueOf(j5);
                } else {
                    valueOf = new BigInteger(N0(length, i6));
                }
                if (p02 == ',') {
                    int i11 = this.f3185f + i5;
                    this.f3185f = i11;
                    this.f3184e = p0(i11);
                    this.f3193n = 3;
                    this.f3181b = 16;
                    return valueOf;
                }
                int i12 = 16;
                if (p02 != '}') {
                    this.f3193n = -1;
                    return null;
                }
                int i13 = i5 + 1;
                char p05 = p0(this.f3185f + i5);
                if (p05 != ',') {
                    if (p05 == ']') {
                        i12 = 15;
                    } else {
                        if (p05 != '}') {
                            p03 = 26;
                            if (p05 != 26) {
                                this.f3193n = -1;
                                return null;
                            }
                            this.f3181b = 20;
                            this.f3185f = (i13 - 1) + this.f3185f;
                            this.f3184e = p03;
                            this.f3193n = 4;
                            return valueOf;
                        }
                        i12 = 13;
                    }
                }
                this.f3181b = i12;
                int i14 = this.f3185f + i13;
                this.f3185f = i14;
                p03 = p0(i14);
                this.f3184e = p03;
                this.f3193n = 4;
                return valueOf;
            }
        }
        if (p04 != 'n' || p0(this.f3185f + i7) != 'u' || androidx.appcompat.view.a.a(this.f3185f, i7, 1, this) != 'l' || androidx.appcompat.view.a.a(this.f3185f, i7, 2, this) != 'l') {
            this.f3193n = -1;
            return null;
        }
        this.f3193n = 5;
        int i15 = i7 + 3;
        int i16 = i15 + 1;
        char p06 = p0(this.f3185f + i15);
        if (z4 && p06 == '\"') {
            p06 = p0(this.f3185f + i16);
            i16++;
        }
        while (p06 != ',') {
            if (p06 == '}') {
                int i17 = this.f3185f + i16;
                this.f3185f = i17;
                this.f3184e = p0(i17);
                this.f3193n = 5;
                this.f3181b = 13;
                return null;
            }
            if (!t0(p06)) {
                this.f3193n = -1;
                return null;
            }
            p06 = p0(this.f3185f + i16);
            i16++;
        }
        int i18 = this.f3185f + i16;
        this.f3185f = i18;
        this.f3184e = p0(i18);
        this.f3193n = 5;
        this.f3181b = 16;
        return null;
    }

    @Override // i.c
    public final char z() {
        return this.f3184e;
    }

    public boolean z0(char[] cArr) {
        int i5;
        boolean z4;
        int i6;
        this.f3193n = 0;
        if (!o0(cArr)) {
            this.f3193n = -2;
            return false;
        }
        int length = cArr.length;
        int i7 = length + 1;
        char p02 = p0(this.f3185f + length);
        if (p02 == 't') {
            int i8 = i7 + 1;
            if (p0(this.f3185f + i7) != 'r') {
                this.f3193n = -1;
                return false;
            }
            int i9 = i8 + 1;
            if (p0(this.f3185f + i8) != 'u') {
                this.f3193n = -1;
                return false;
            }
            i5 = i9 + 1;
            if (p0(this.f3185f + i9) != 'e') {
                this.f3193n = -1;
                return false;
            }
            z4 = true;
        } else {
            if (p02 != 'f') {
                this.f3193n = -1;
                return false;
            }
            int i10 = i7 + 1;
            if (p0(this.f3185f + i7) != 'a') {
                this.f3193n = -1;
                return false;
            }
            int i11 = i10 + 1;
            if (p0(this.f3185f + i10) != 'l') {
                this.f3193n = -1;
                return false;
            }
            int i12 = i11 + 1;
            if (p0(this.f3185f + i11) != 's') {
                this.f3193n = -1;
                return false;
            }
            int i13 = i12 + 1;
            if (p0(this.f3185f + i12) != 'e') {
                this.f3193n = -1;
                return false;
            }
            i5 = i13;
            z4 = false;
        }
        int i14 = i5 + 1;
        char p03 = p0(this.f3185f + i5);
        if (p03 == ',') {
            int i15 = this.f3185f + i14;
            this.f3185f = i15;
            this.f3184e = p0(i15);
            this.f3193n = 3;
            this.f3181b = 16;
            return z4;
        }
        if (p03 != '}') {
            this.f3193n = -1;
            return false;
        }
        int i16 = i14 + 1;
        char p04 = p0(this.f3185f + i14);
        if (p04 == ',') {
            this.f3181b = 16;
        } else {
            if (p04 == ']') {
                i6 = 15;
            } else {
                if (p04 != '}') {
                    if (p04 != 26) {
                        this.f3193n = -1;
                        return false;
                    }
                    this.f3181b = 20;
                    this.f3185f = (i16 - 1) + this.f3185f;
                    this.f3184e = (char) 26;
                    this.f3193n = 4;
                    return z4;
                }
                i6 = 13;
            }
            this.f3181b = i6;
        }
        int i17 = this.f3185f + i16;
        this.f3185f = i17;
        this.f3184e = p0(i17);
        this.f3193n = 4;
        return z4;
    }
}
