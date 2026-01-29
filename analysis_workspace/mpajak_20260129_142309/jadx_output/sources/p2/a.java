package p2;

import androidx.activity.d;
import d1.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes12.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final Reader f4647b;

    /* renamed from: j, reason: collision with root package name */
    public long f4655j;

    /* renamed from: k, reason: collision with root package name */
    public int f4656k;

    /* renamed from: l, reason: collision with root package name */
    public String f4657l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f4658m;

    /* renamed from: o, reason: collision with root package name */
    public String[] f4660o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f4661p;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4648c = false;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f4649d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    public int f4650e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4651f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f4652g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f4653h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f4654i = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4659n = 0 + 1;

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0059a extends f {
    }

    static {
        f.f2481a = new C0059a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4658m = iArr;
        iArr[0] = 6;
        this.f4660o = new String[32];
        this.f4661p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4647b = reader;
    }

    public long A() {
        String J;
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 15) {
            this.f4654i = 0;
            int[] iArr = this.f4661p;
            int i6 = this.f4659n - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f4655j;
        }
        if (i5 == 16) {
            this.f4657l = new String(this.f4649d, this.f4650e, this.f4656k);
            this.f4650e += this.f4656k;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                StringBuilder g5 = d.g("Expected a long but was ");
                g5.append(androidx.activity.result.a.j(N()));
                g5.append(w());
                throw new IllegalStateException(g5.toString());
            }
            if (i5 == 10) {
                J = M();
            } else {
                J = J(i5 == 8 ? '\'' : Typography.quote);
            }
            this.f4657l = J;
            try {
                long parseLong = Long.parseLong(this.f4657l);
                this.f4654i = 0;
                int[] iArr2 = this.f4661p;
                int i7 = this.f4659n - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4654i = 11;
        double parseDouble = Double.parseDouble(this.f4657l);
        long j5 = (long) parseDouble;
        if (j5 != parseDouble) {
            StringBuilder g6 = d.g("Expected a long but was ");
            g6.append(this.f4657l);
            g6.append(w());
            throw new NumberFormatException(g6.toString());
        }
        this.f4657l = null;
        this.f4654i = 0;
        int[] iArr3 = this.f4661p;
        int i8 = this.f4659n - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return j5;
    }

    public String E() {
        char c5;
        String J;
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 14) {
            J = M();
        } else {
            if (i5 == 12) {
                c5 = '\'';
            } else {
                if (i5 != 13) {
                    StringBuilder g5 = d.g("Expected a name but was ");
                    g5.append(androidx.activity.result.a.j(N()));
                    g5.append(w());
                    throw new IllegalStateException(g5.toString());
                }
                c5 = Typography.quote;
            }
            J = J(c5);
        }
        this.f4654i = 0;
        this.f4660o[this.f4659n - 1] = J;
        return J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r1 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r9.f4650e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r9.f4650e = r4 - 1;
        r2 = n(2);
        r9.f4650e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        c();
        r2 = r9.f4650e;
        r4 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r4 == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r9.f4650e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if ((r9.f4650e + 2) <= r9.f4651f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (n(2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r3 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        V("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r1 = r9.f4649d;
        r2 = r9.f4650e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        if (r1[r2] != '\n') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r9.f4652g++;
        r9.f4653h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        r9.f4650e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a2, code lost:
    
        if (r4 >= 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        if (r9.f4649d[r9.f4650e + r4] == "*\/".charAt(r4)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0073, code lost:
    
        if (r4 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0076, code lost:
    
        r9.f4650e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ca, code lost:
    
        r9.f4650e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ce, code lost:
    
        if (r1 != '#') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H(boolean r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a.H(boolean):int");
    }

    public void I() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 != 7) {
            StringBuilder g5 = d.g("Expected null but was ");
            g5.append(androidx.activity.result.a.j(N()));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        this.f4654i = 0;
        int[] iArr = this.f4661p;
        int i6 = this.f4659n - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    public final String J(char c5) {
        char[] cArr = this.f4649d;
        StringBuilder sb = null;
        while (true) {
            int i5 = this.f4650e;
            int i6 = this.f4651f;
            while (true) {
                if (i5 < i6) {
                    int i7 = i5 + 1;
                    char c6 = cArr[i5];
                    if (c6 == c5) {
                        this.f4650e = i7;
                        int i8 = (i7 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i8);
                        }
                        sb.append(cArr, i5, i8);
                        return sb.toString();
                    }
                    if (c6 == '\\') {
                        this.f4650e = i7;
                        int i9 = (i7 - i5) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i9 + 1) * 2, 16));
                        }
                        sb.append(cArr, i5, i9);
                        sb.append(Q());
                    } else {
                        if (c6 == '\n') {
                            this.f4652g++;
                            this.f4653h = i7;
                        }
                        i5 = i7;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i5 - i5) * 2, 16));
                    }
                    sb.append(cArr, i5, i5 - i5);
                    this.f4650e = i5;
                    if (!n(1)) {
                        V("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String K() {
        String str;
        char c5;
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 10) {
            str = M();
        } else {
            if (i5 == 8) {
                c5 = '\'';
            } else if (i5 == 9) {
                c5 = Typography.quote;
            } else if (i5 == 11) {
                str = this.f4657l;
                this.f4657l = null;
            } else if (i5 == 15) {
                str = Long.toString(this.f4655j);
            } else {
                if (i5 != 16) {
                    StringBuilder g5 = d.g("Expected a string but was ");
                    g5.append(androidx.activity.result.a.j(N()));
                    g5.append(w());
                    throw new IllegalStateException(g5.toString());
                }
                str = new String(this.f4649d, this.f4650e, this.f4656k);
                this.f4650e += this.f4656k;
            }
            str = J(c5);
        }
        this.f4654i = 0;
        int[] iArr = this.f4661p;
        int i6 = this.f4659n - 1;
        iArr[i6] = iArr[i6] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String M() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f4650e
            int r4 = r3 + r2
            int r5 = r6.f4651f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f4649d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.c()
            goto L5c
        L4e:
            char[] r3 = r6.f4649d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.n(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f4649d
            int r4 = r6.f4650e
            r1.append(r3, r4, r2)
            int r3 = r6.f4650e
            int r3 = r3 + r2
            r6.f4650e = r3
            r2 = 1
            boolean r2 = r6.n(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4649d
            int r3 = r6.f4650e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f4649d
            int r3 = r6.f4650e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f4650e
            int r2 = r2 + r0
            r6.f4650e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a.M():java.lang.String");
    }

    public int N() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        switch (i5) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void P(int i5) {
        int i6 = this.f4659n;
        int[] iArr = this.f4658m;
        if (i6 == iArr.length) {
            int i7 = i6 * 2;
            this.f4658m = Arrays.copyOf(iArr, i7);
            this.f4661p = Arrays.copyOf(this.f4661p, i7);
            this.f4660o = (String[]) Arrays.copyOf(this.f4660o, i7);
        }
        int[] iArr2 = this.f4658m;
        int i8 = this.f4659n;
        this.f4659n = i8 + 1;
        iArr2[i8] = i5;
    }

    public final char Q() {
        int i5;
        int i6;
        if (this.f4650e == this.f4651f && !n(1)) {
            V("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f4649d;
        int i7 = this.f4650e;
        int i8 = i7 + 1;
        this.f4650e = i8;
        char c5 = cArr[i7];
        if (c5 == '\n') {
            this.f4652g++;
            this.f4653h = i8;
        } else if (c5 != '\"' && c5 != '\'' && c5 != '/' && c5 != '\\') {
            if (c5 == 'b') {
                return '\b';
            }
            if (c5 == 'f') {
                return '\f';
            }
            if (c5 == 'n') {
                return '\n';
            }
            if (c5 == 'r') {
                return '\r';
            }
            if (c5 == 't') {
                return '\t';
            }
            if (c5 != 'u') {
                V("Invalid escape sequence");
                throw null;
            }
            if (i8 + 4 > this.f4651f && !n(4)) {
                V("Unterminated escape sequence");
                throw null;
            }
            char c6 = 0;
            int i9 = this.f4650e;
            int i10 = i9 + 4;
            while (i9 < i10) {
                char c7 = this.f4649d[i9];
                char c8 = (char) (c6 << 4);
                if (c7 < '0' || c7 > '9') {
                    if (c7 >= 'a' && c7 <= 'f') {
                        i5 = c7 - 'a';
                    } else {
                        if (c7 < 'A' || c7 > 'F') {
                            StringBuilder g5 = d.g("\\u");
                            g5.append(new String(this.f4649d, this.f4650e, 4));
                            throw new NumberFormatException(g5.toString());
                        }
                        i5 = c7 - 'A';
                    }
                    i6 = i5 + 10;
                } else {
                    i6 = c7 - '0';
                }
                c6 = (char) (i6 + c8);
                i9++;
            }
            this.f4650e += 4;
            return c6;
        }
        return c5;
    }

    public final void R(char c5) {
        char[] cArr = this.f4649d;
        while (true) {
            int i5 = this.f4650e;
            int i6 = this.f4651f;
            while (true) {
                if (i5 < i6) {
                    int i7 = i5 + 1;
                    char c6 = cArr[i5];
                    if (c6 == c5) {
                        this.f4650e = i7;
                        return;
                    }
                    if (c6 == '\\') {
                        this.f4650e = i7;
                        Q();
                        break;
                    } else {
                        if (c6 == '\n') {
                            this.f4652g++;
                            this.f4653h = i7;
                        }
                        i5 = i7;
                    }
                } else {
                    this.f4650e = i5;
                    if (!n(1)) {
                        V("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void S() {
        char c5;
        do {
            if (this.f4650e >= this.f4651f && !n(1)) {
                return;
            }
            char[] cArr = this.f4649d;
            int i5 = this.f4650e;
            int i6 = i5 + 1;
            this.f4650e = i6;
            c5 = cArr[i5];
            if (c5 == '\n') {
                this.f4652g++;
                this.f4653h = i6;
                return;
            }
        } while (c5 != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x0093. Please report as an issue. */
    public void U() {
        char c5;
        int i5 = 0;
        do {
            int i6 = this.f4654i;
            if (i6 == 0) {
                i6 = e();
            }
            if (i6 == 3) {
                P(1);
            } else if (i6 == 1) {
                P(3);
            } else {
                if (i6 == 4 || i6 == 2) {
                    this.f4659n--;
                    i5--;
                } else if (i6 == 14 || i6 == 10) {
                    do {
                        int i7 = 0;
                        while (true) {
                            int i8 = this.f4650e + i7;
                            if (i8 < this.f4651f) {
                                char c6 = this.f4649d[i8];
                                if (c6 != '\t' && c6 != '\n' && c6 != '\f' && c6 != '\r' && c6 != ' ') {
                                    if (c6 != '#') {
                                        if (c6 != ',') {
                                            if (c6 != '/' && c6 != '=') {
                                                if (c6 != '{' && c6 != '}' && c6 != ':') {
                                                    if (c6 != ';') {
                                                        switch (c6) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i7++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f4650e = i8;
                            }
                        }
                        c();
                        this.f4650e += i7;
                    } while (n(1));
                } else {
                    if (i6 == 8 || i6 == 12) {
                        c5 = '\'';
                    } else if (i6 == 9 || i6 == 13) {
                        c5 = Typography.quote;
                    } else if (i6 == 16) {
                        this.f4650e += this.f4656k;
                    }
                    R(c5);
                }
                this.f4654i = 0;
            }
            i5++;
            this.f4654i = 0;
        } while (i5 != 0);
        int[] iArr = this.f4661p;
        int i9 = this.f4659n;
        int i10 = i9 - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f4660o[i9 - 1] = "null";
    }

    public final IOException V(String str) {
        StringBuilder g5 = d.g(str);
        g5.append(w());
        throw new c(g5.toString());
    }

    public void a() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 3) {
            P(1);
            this.f4661p[this.f4659n - 1] = 0;
            this.f4654i = 0;
        } else {
            StringBuilder g5 = d.g("Expected BEGIN_ARRAY but was ");
            g5.append(androidx.activity.result.a.j(N()));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
    }

    public void b() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 1) {
            P(3);
            this.f4654i = 0;
        } else {
            StringBuilder g5 = d.g("Expected BEGIN_OBJECT but was ");
            g5.append(androidx.activity.result.a.j(N()));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
    }

    public final void c() {
        if (this.f4648c) {
            return;
        }
        V("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4654i = 0;
        this.f4658m[0] = 8;
        this.f4659n = 1;
        this.f4647b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0212, code lost:
    
        if (s(r1) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a1, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0215, code lost:
    
        if (r9 != 2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0217, code lost:
    
        if (r10 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x021f, code lost:
    
        if (r16 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0223, code lost:
    
        if (r11 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0225, code lost:
    
        if (r16 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0227, code lost:
    
        if (r16 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022a, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022b, code lost:
    
        r19.f4655j = r11;
        r19.f4650e += r8;
        r13 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0246, code lost:
    
        r19.f4654i = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0237, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0238, code lost:
    
        if (r9 == r1) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023b, code lost:
    
        if (r9 == 4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023e, code lost:
    
        if (r9 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0240, code lost:
    
        r19.f4656k = r8;
        r13 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e() {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a.e():int");
    }

    public void f() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 != 4) {
            StringBuilder g5 = d.g("Expected END_ARRAY but was ");
            g5.append(androidx.activity.result.a.j(N()));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        int i6 = this.f4659n - 1;
        this.f4659n = i6;
        int[] iArr = this.f4661p;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f4654i = 0;
    }

    public String getPath() {
        return p(false);
    }

    public void l() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 != 2) {
            StringBuilder g5 = d.g("Expected END_OBJECT but was ");
            g5.append(androidx.activity.result.a.j(N()));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        int i6 = this.f4659n - 1;
        this.f4659n = i6;
        this.f4660o[i6] = null;
        int[] iArr = this.f4661p;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f4654i = 0;
    }

    public final boolean n(int i5) {
        int i6;
        int i7;
        char[] cArr = this.f4649d;
        int i8 = this.f4653h;
        int i9 = this.f4650e;
        this.f4653h = i8 - i9;
        int i10 = this.f4651f;
        if (i10 != i9) {
            int i11 = i10 - i9;
            this.f4651f = i11;
            System.arraycopy(cArr, i9, cArr, 0, i11);
        } else {
            this.f4651f = 0;
        }
        this.f4650e = 0;
        do {
            Reader reader = this.f4647b;
            int i12 = this.f4651f;
            int read = reader.read(cArr, i12, cArr.length - i12);
            if (read == -1) {
                return false;
            }
            i6 = this.f4651f + read;
            this.f4651f = i6;
            if (this.f4652g == 0 && (i7 = this.f4653h) == 0 && i6 > 0 && cArr[0] == 65279) {
                this.f4650e++;
                this.f4653h = i7 + 1;
                i5++;
            }
        } while (i6 < i5);
        return true;
    }

    public final String p(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.dollar);
        int i5 = 0;
        while (true) {
            int i6 = this.f4659n;
            if (i5 >= i6) {
                return sb.toString();
            }
            int i7 = this.f4658m[i5];
            if (i7 == 1 || i7 == 2) {
                int i8 = this.f4661p[i5];
                if (z4 && i8 > 0 && i5 == i6 - 1) {
                    i8--;
                }
                sb.append('[');
                sb.append(i8);
                sb.append(']');
            } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                String[] strArr = this.f4660o;
                if (strArr[i5] != null) {
                    sb.append(strArr[i5]);
                }
            }
            i5++;
        }
    }

    public String q() {
        return p(true);
    }

    public boolean r() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        return (i5 == 2 || i5 == 4 || i5 == 17) ? false : true;
    }

    public final boolean s(char c5) {
        if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
            return false;
        }
        if (c5 != '#') {
            if (c5 == ',') {
                return false;
            }
            if (c5 != '/' && c5 != '=') {
                if (c5 == '{' || c5 == '}' || c5 == ':') {
                    return false;
                }
                if (c5 != ';') {
                    switch (c5) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + w();
    }

    public final String w() {
        return " at line " + (this.f4652g + 1) + " column " + ((this.f4650e - this.f4653h) + 1) + " path " + getPath();
    }

    public boolean x() {
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 5) {
            this.f4654i = 0;
            int[] iArr = this.f4661p;
            int i6 = this.f4659n - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        }
        if (i5 != 6) {
            StringBuilder g5 = d.g("Expected a boolean but was ");
            g5.append(androidx.activity.result.a.j(N()));
            g5.append(w());
            throw new IllegalStateException(g5.toString());
        }
        this.f4654i = 0;
        int[] iArr2 = this.f4661p;
        int i7 = this.f4659n - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return false;
    }

    public double y() {
        String J;
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 15) {
            this.f4654i = 0;
            int[] iArr = this.f4661p;
            int i6 = this.f4659n - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f4655j;
        }
        if (i5 == 16) {
            this.f4657l = new String(this.f4649d, this.f4650e, this.f4656k);
            this.f4650e += this.f4656k;
        } else {
            if (i5 == 8 || i5 == 9) {
                J = J(i5 == 8 ? '\'' : Typography.quote);
            } else if (i5 == 10) {
                J = M();
            } else if (i5 != 11) {
                StringBuilder g5 = d.g("Expected a double but was ");
                g5.append(androidx.activity.result.a.j(N()));
                g5.append(w());
                throw new IllegalStateException(g5.toString());
            }
            this.f4657l = J;
        }
        this.f4654i = 11;
        double parseDouble = Double.parseDouble(this.f4657l);
        if (!this.f4648c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new c("JSON forbids NaN and infinities: " + parseDouble + w());
        }
        this.f4657l = null;
        this.f4654i = 0;
        int[] iArr2 = this.f4661p;
        int i7 = this.f4659n - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return parseDouble;
    }

    public int z() {
        String J;
        int i5 = this.f4654i;
        if (i5 == 0) {
            i5 = e();
        }
        if (i5 == 15) {
            long j5 = this.f4655j;
            int i6 = (int) j5;
            if (j5 != i6) {
                StringBuilder g5 = d.g("Expected an int but was ");
                g5.append(this.f4655j);
                g5.append(w());
                throw new NumberFormatException(g5.toString());
            }
            this.f4654i = 0;
            int[] iArr = this.f4661p;
            int i7 = this.f4659n - 1;
            iArr[i7] = iArr[i7] + 1;
            return i6;
        }
        if (i5 == 16) {
            this.f4657l = new String(this.f4649d, this.f4650e, this.f4656k);
            this.f4650e += this.f4656k;
        } else {
            if (i5 != 8 && i5 != 9 && i5 != 10) {
                StringBuilder g6 = d.g("Expected an int but was ");
                g6.append(androidx.activity.result.a.j(N()));
                g6.append(w());
                throw new IllegalStateException(g6.toString());
            }
            if (i5 == 10) {
                J = M();
            } else {
                J = J(i5 == 8 ? '\'' : Typography.quote);
            }
            this.f4657l = J;
            try {
                int parseInt = Integer.parseInt(this.f4657l);
                this.f4654i = 0;
                int[] iArr2 = this.f4661p;
                int i8 = this.f4659n - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4654i = 11;
        double parseDouble = Double.parseDouble(this.f4657l);
        int i9 = (int) parseDouble;
        if (i9 != parseDouble) {
            StringBuilder g7 = d.g("Expected an int but was ");
            g7.append(this.f4657l);
            g7.append(w());
            throw new NumberFormatException(g7.toString());
        }
        this.f4657l = null;
        this.f4654i = 0;
        int[] iArr3 = this.f4661p;
        int i10 = this.f4659n - 1;
        iArr3[i10] = iArr3[i10] + 1;
        return i9;
    }
}
