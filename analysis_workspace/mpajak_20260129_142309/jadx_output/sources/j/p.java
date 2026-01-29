package j;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import k.a1;
import k.b1;
import k.g0;
import k.q0;

/* loaded from: classes18.dex */
public final class p extends e implements q0, k.t {

    /* renamed from: a, reason: collision with root package name */
    public static final p f3388a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f3389b = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c, reason: collision with root package name */
    public static final DateTimeFormatter f3390c = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    /* renamed from: d, reason: collision with root package name */
    public static final DateTimeFormatter f3391d = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");

    /* renamed from: e, reason: collision with root package name */
    public static final DateTimeFormatter f3392e = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");

    /* renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f3393f = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");

    /* renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f3394g = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    /* renamed from: h, reason: collision with root package name */
    public static final DateTimeFormatter f3395h = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    /* renamed from: i, reason: collision with root package name */
    public static final DateTimeFormatter f3396i = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    /* renamed from: j, reason: collision with root package name */
    public static final DateTimeFormatter f3397j = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    /* renamed from: k, reason: collision with root package name */
    public static final DateTimeFormatter f3398k = DateTimeFormatter.ofPattern("yyyyMMdd");

    /* renamed from: l, reason: collision with root package name */
    public static final DateTimeFormatter f3399l = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    /* renamed from: m, reason: collision with root package name */
    public static final DateTimeFormatter f3400m = DateTimeFormatter.ofPattern("yyyy年M月d日");

    /* renamed from: n, reason: collision with root package name */
    public static final DateTimeFormatter f3401n = DateTimeFormatter.ofPattern("yyyy년M월d일");

    /* renamed from: o, reason: collision with root package name */
    public static final DateTimeFormatter f3402o = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    /* renamed from: p, reason: collision with root package name */
    public static final DateTimeFormatter f3403p = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /* renamed from: q, reason: collision with root package name */
    public static final DateTimeFormatter f3404q = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /* renamed from: r, reason: collision with root package name */
    public static final DateTimeFormatter f3405r = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /* renamed from: s, reason: collision with root package name */
    public static final DateTimeFormatter f3406s = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

    /* renamed from: t, reason: collision with root package name */
    public static final DateTimeFormatter f3407t = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override // k.t
    public final void b(g0 g0Var, Object obj, k.j jVar) {
        a1 a1Var = g0Var.f3689j;
        String str = jVar.f3704b;
        a1Var.J((str == "yyyy-MM-dd'T'HH:mm:ss" ? f3407t : DateTimeFormatter.ofPattern(str)).format((TemporalAccessor) obj));
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.E();
            return;
        }
        if (type == null) {
            type = obj.getClass();
        }
        if (type == LocalDateTime.class) {
            b1 b1Var = b1.UseISO8601DateFormat;
            int i6 = b1Var.f3675b;
            LocalDateTime localDateTime = (LocalDateTime) obj;
            SimpleDateFormat simpleDateFormat = g0Var.f3692m;
            String pattern = simpleDateFormat instanceof SimpleDateFormat ? simpleDateFormat.toPattern() : null;
            if ((pattern == null && (i5 & i6) != 0) || g0Var.f3689j.l(b1Var)) {
                pattern = "yyyy-MM-dd'T'HH:mm:ss";
            }
            if (localDateTime.getNano() == 0 || pattern != null) {
                if (pattern == null) {
                    pattern = f.a.f2682f;
                }
                a1Var.J((pattern == "yyyy-MM-dd'T'HH:mm:ss" ? f3407t : DateTimeFormatter.ofPattern(pattern)).format(localDateTime));
                return;
            }
        }
        a1Var.J(obj.toString());
    }

    @Override // j.s
    public final int e() {
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d6, code lost:
    
        if (r13 == ' ') goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0238, code lost:
    
        if (r1.equals("AU") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r6 == ' ') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        if (r1.equals("AU") == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0258  */
    @Override // j.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(i.a r17, java.lang.reflect.Type r18, java.lang.Object r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.p.f(i.a, java.lang.reflect.Type, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r0.equals("AU") == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.time.LocalDate g(java.lang.String r10, java.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            if (r11 != 0) goto Laa
            int r0 = r10.length()
            r1 = 8
            if (r0 != r1) goto Lc
            java.time.format.DateTimeFormatter r11 = j.p.f3398k
        Lc:
            int r0 = r10.length()
            r1 = 4
            r2 = 10
            if (r0 != r2) goto L90
            char r0 = r10.charAt(r1)
            r3 = 7
            char r3 = r10.charAt(r3)
            r4 = 47
            if (r0 != r4) goto L26
            if (r3 != r4) goto L26
            java.time.format.DateTimeFormatter r11 = j.p.f3399l
        L26:
            r3 = 0
            char r3 = r10.charAt(r3)
            r5 = 1
            char r5 = r10.charAt(r5)
            r6 = 2
            char r6 = r10.charAt(r6)
            r7 = 3
            char r7 = r10.charAt(r7)
            r8 = 5
            char r8 = r10.charAt(r8)
            if (r6 != r4) goto L7f
            if (r8 != r4) goto L7f
            int r3 = r3 + (-48)
            int r3 = r3 * 10
            int r5 = r5 + (-48)
            int r5 = r5 + r3
            int r7 = r7 + (-48)
            int r7 = r7 * 10
            int r0 = r0 + (-48)
            int r0 = r0 + r7
            r2 = 12
            if (r5 <= r2) goto L56
            goto L7c
        L56:
            if (r0 <= r2) goto L59
            goto L69
        L59:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r2 = "US"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L6c
        L69:
            java.time.format.DateTimeFormatter r11 = j.p.f3402o
            goto L90
        L6c:
            java.lang.String r2 = "BR"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L7c
            java.lang.String r2 = "AU"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L90
        L7c:
            java.time.format.DateTimeFormatter r11 = j.p.f3403p
            goto L90
        L7f:
            r0 = 46
            if (r6 != r0) goto L88
            if (r8 != r0) goto L88
            java.time.format.DateTimeFormatter r11 = j.p.f3404q
            goto L90
        L88:
            r0 = 45
            if (r6 != r0) goto L90
            if (r8 != r0) goto L90
            java.time.format.DateTimeFormatter r11 = j.p.f3405r
        L90:
            int r0 = r10.length()
            r2 = 9
            if (r0 < r2) goto Laa
            char r0 = r10.charAt(r1)
            r1 = 24180(0x5e74, float:3.3883E-41)
            if (r0 != r1) goto La3
            java.time.format.DateTimeFormatter r11 = j.p.f3400m
            goto Laa
        La3:
            r1 = 45380(0xb144, float:6.3591E-41)
            if (r0 != r1) goto Laa
            java.time.format.DateTimeFormatter r11 = j.p.f3401n
        Laa:
            if (r11 != 0) goto Lb1
            java.time.LocalDate r10 = java.time.LocalDate.parse(r10)
            goto Lb5
        Lb1:
            java.time.LocalDate r10 = java.time.LocalDate.parse(r10, r11)
        Lb5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.p.g(java.lang.String, java.time.format.DateTimeFormatter):java.time.LocalDate");
    }
}
