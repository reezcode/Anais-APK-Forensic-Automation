package h;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f2990a;

    /* renamed from: b, reason: collision with root package name */
    public int f2991b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final a f2992c = new a();

    /* renamed from: d, reason: collision with root package name */
    public e[] f2993d = new e[256];

    /* renamed from: e, reason: collision with root package name */
    public int f2994e = (int) (256 * 0.75d);

    /* renamed from: f, reason: collision with root package name */
    public final e f2995f = new e();

    /* renamed from: g, reason: collision with root package name */
    public final e f2996g = new e();

    /* renamed from: h, reason: collision with root package name */
    public final e f2997h = new e();

    /* renamed from: i, reason: collision with root package name */
    public int f2998i;

    /* renamed from: j, reason: collision with root package name */
    public int f2999j;

    /* renamed from: k, reason: collision with root package name */
    public int f3000k;

    /* renamed from: l, reason: collision with root package name */
    public int f3001l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f3002m;

    /* renamed from: n, reason: collision with root package name */
    public d f3003n;

    /* renamed from: o, reason: collision with root package name */
    public d f3004o;

    /* renamed from: p, reason: collision with root package name */
    public h f3005p;

    /* renamed from: q, reason: collision with root package name */
    public h f3006q;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r0.f3016g.equals(r9.f3016g) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r0.f3012c == r9.f3012c) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r0.f3015f.equals(r9.f3015f) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r0.f3013d == r9.f3013d) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h.e a(h.e r9) {
        /*
            r8 = this;
            h.e[] r0 = r8.f2993d
            int r1 = r9.f3017h
            int r2 = r0.length
            int r1 = r1 % r2
            r0 = r0[r1]
        L8:
            if (r0 == 0) goto L76
            int r1 = r0.f3011b
            int r2 = r9.f3011b
            if (r1 != r2) goto L73
            r1 = 1
            if (r2 == r1) goto L69
            r3 = 15
            r4 = 0
            if (r2 == r3) goto L60
            r3 = 12
            if (r2 == r3) goto L4b
            r3 = 13
            if (r2 == r3) goto L69
            switch(r2) {
                case 3: goto L42;
                case 4: goto L42;
                case 5: goto L60;
                case 6: goto L60;
                case 7: goto L69;
                case 8: goto L69;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = r0.f3014e
            java.lang.String r3 = r9.f3014e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.f3015f
            java.lang.String r3 = r9.f3015f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.f3016g
            java.lang.String r3 = r9.f3016g
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            goto L71
        L42:
            int r2 = r0.f3012c
            int r3 = r9.f3012c
            if (r2 != r3) goto L49
            goto L71
        L49:
            r1 = 0
            goto L71
        L4b:
            java.lang.String r2 = r0.f3014e
            java.lang.String r3 = r9.f3014e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            java.lang.String r2 = r0.f3015f
            java.lang.String r3 = r9.f3015f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            goto L71
        L60:
            long r2 = r0.f3013d
            long r5 = r9.f3013d
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L49
            goto L71
        L69:
            java.lang.String r1 = r0.f3014e
            java.lang.String r2 = r9.f3014e
            boolean r1 = r1.equals(r2)
        L71:
            if (r1 != 0) goto L76
        L73:
            h.e r0 = r0.f3018i
            goto L8
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.a(h.e):h.e");
    }

    public final e b(String str) {
        this.f2996g.a(7, str, null, null);
        e a5 = a(this.f2996g);
        if (a5 != null) {
            return a5;
        }
        this.f2992c.c(7, d(str));
        int i5 = this.f2991b;
        this.f2991b = i5 + 1;
        e eVar = new e(i5, this.f2996g);
        e(eVar);
        return eVar;
    }

    public final e c(String str, String str2) {
        this.f2996g.a(12, str, str2, null);
        e a5 = a(this.f2996g);
        if (a5 != null) {
            return a5;
        }
        int d5 = d(str);
        int d6 = d(str2);
        a aVar = this.f2992c;
        aVar.c(12, d5);
        aVar.g(d6);
        int i5 = this.f2991b;
        this.f2991b = i5 + 1;
        e eVar = new e(i5, this.f2996g);
        e(eVar);
        return eVar;
    }

    public final int d(String str) {
        this.f2995f.a(1, str, null, null);
        e a5 = a(this.f2995f);
        if (a5 == null) {
            a aVar = this.f2992c;
            aVar.d(1);
            int length = str.length();
            int i5 = aVar.f2984b;
            if (i5 + 2 + length > aVar.f2983a.length) {
                aVar.a(length + 2);
            }
            byte[] bArr = aVar.f2983a;
            int i6 = i5 + 1;
            bArr[i5] = (byte) (length >>> 8);
            int i7 = i6 + 1;
            bArr[i6] = (byte) length;
            int i8 = 0;
            while (i8 < length) {
                char charAt = str.charAt(i8);
                if (charAt < 1 || charAt > 127) {
                    throw new UnsupportedOperationException();
                }
                bArr[i7] = (byte) charAt;
                i8++;
                i7++;
            }
            aVar.f2984b = i7;
            int i9 = this.f2991b;
            this.f2991b = i9 + 1;
            a5 = new e(i9, this.f2995f);
            e(a5);
        }
        return a5.f3010a;
    }

    public final void e(e eVar) {
        if (this.f2991b > this.f2994e) {
            int length = this.f2993d.length;
            int i5 = (length * 2) + 1;
            e[] eVarArr = new e[i5];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                e eVar2 = this.f2993d[length];
                while (eVar2 != null) {
                    int i6 = eVar2.f3017h % i5;
                    e eVar3 = eVar2.f3018i;
                    eVar2.f3018i = eVarArr[i6];
                    eVarArr[i6] = eVar2;
                    eVar2 = eVar3;
                }
            }
            this.f2993d = eVarArr;
            this.f2994e = (int) (i5 * 0.75d);
        }
        int i7 = eVar.f3017h;
        e[] eVarArr2 = this.f2993d;
        int length2 = i7 % eVarArr2.length;
        eVar.f3018i = eVarArr2[length2];
        eVarArr2[length2] = eVar;
    }

    public final byte[] f() {
        int i5;
        int i6 = (this.f3001l * 2) + 24;
        int i7 = 0;
        for (d dVar = this.f3003n; dVar != null; dVar = dVar.f3007a) {
            i7++;
            i6 += 8;
        }
        int i8 = 0;
        for (h hVar = this.f3005p; hVar != null; hVar = hVar.f3028a) {
            i8++;
            if (hVar.f3034g.f2984b > 0) {
                hVar.f3029b.d("Code");
                i5 = hVar.f3034g.f2984b + 18 + 0 + 8;
            } else {
                i5 = 8;
            }
            if (hVar.f3032e > 0) {
                hVar.f3029b.d("Exceptions");
                i5 += (hVar.f3032e * 2) + 8;
            }
            i6 += i5;
        }
        a aVar = new a(i6 + this.f2992c.f2984b);
        aVar.f(-889275714);
        aVar.f(this.f2990a);
        aVar.g(this.f2991b);
        a aVar2 = this.f2992c;
        aVar.e(aVar2.f2983a, aVar2.f2984b);
        aVar.g(this.f2998i & (-393217));
        aVar.g(this.f2999j);
        aVar.g(this.f3000k);
        aVar.g(this.f3001l);
        for (int i9 = 0; i9 < this.f3001l; i9++) {
            aVar.g(this.f3002m[i9]);
        }
        aVar.g(i7);
        for (d dVar2 = this.f3003n; dVar2 != null; dVar2 = dVar2.f3007a) {
            aVar.g(1);
            aVar.g(dVar2.f3008b);
            aVar.g(dVar2.f3009c);
            aVar.g(0);
        }
        aVar.g(i8);
        for (h hVar2 = this.f3005p; hVar2 != null; hVar2 = hVar2.f3028a) {
            aVar.g(1);
            aVar.g(hVar2.f3030c);
            aVar.g(hVar2.f3031d);
            int i10 = hVar2.f3034g.f2984b > 0 ? 1 : 0;
            if (hVar2.f3032e > 0) {
                i10++;
            }
            aVar.g(i10);
            int i11 = hVar2.f3034g.f2984b;
            if (i11 > 0) {
                aVar.g(hVar2.f3029b.d("Code"));
                aVar.f(i11 + 12 + 0);
                aVar.g(hVar2.f3035h);
                aVar.g(hVar2.f3036i);
                aVar.f(hVar2.f3034g.f2984b);
                a aVar3 = hVar2.f3034g;
                aVar.e(aVar3.f2983a, aVar3.f2984b);
                aVar.g(0);
                aVar.g(0);
            }
            if (hVar2.f3032e > 0) {
                aVar.g(hVar2.f3029b.d("Exceptions"));
                aVar.f((hVar2.f3032e * 2) + 2);
                aVar.g(hVar2.f3032e);
                for (int i12 = 0; i12 < hVar2.f3032e; i12++) {
                    aVar.g(hVar2.f3033f[i12]);
                }
            }
        }
        aVar.g(0);
        return aVar.f2983a;
    }

    public final void g(String str, String str2, String[] strArr) {
        this.f2990a = 49;
        this.f2998i = 33;
        this.f2999j = b(str).f3010a;
        this.f3000k = str2 == null ? 0 : b(str2).f3010a;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.f3001l = length;
        this.f3002m = new int[length];
        for (int i5 = 0; i5 < this.f3001l; i5++) {
            this.f3002m[i5] = b(strArr[i5]).f3010a;
        }
    }
}
