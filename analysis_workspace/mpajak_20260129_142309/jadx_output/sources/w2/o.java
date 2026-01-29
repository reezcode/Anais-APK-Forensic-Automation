package w2;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import w2.b;

/* loaded from: classes20.dex */
public final class o extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final o f5780e = new o();

    public o() {
        super(1, new Class[0]);
    }

    @Override // d1.f
    public final Object J(v2.g gVar, Object obj, int i5) {
        String str = (String) obj;
        b.a M = b.M(gVar, b.f5755d);
        try {
            return M.a().parse(str);
        } catch (ParseException e5) {
            throw d1.c.e("Problems with column " + i5 + " parsing date-string '" + str + "' using '" + M + "'", e5);
        }
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return ((q2.d) eVar).e(i5);
    }

    @Override // d1.f, v2.f
    public final Object e(v2.g gVar, Object obj) {
        return b.M(gVar, b.f5755d).a().format((Date) obj);
    }

    @Override // w2.a, v2.a
    public final Object f(v2.g gVar) {
        String str = gVar.f5681e.f5665p;
        return str == null ? b.f5755d : new b.a(str);
    }

    @Override // w2.a, v2.a
    public final Class<?> h() {
        return byte[].class;
    }

    @Override // w2.a, v2.a
    public final int n() {
        return 50;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        b.a M = b.M(gVar, b.f5755d);
        try {
            DateFormat a5 = M.a();
            return a5.format(a5.parse(str));
        } catch (ParseException e5) {
            throw d1.c.e("Problems with field " + gVar + " parsing default date-string '" + str + "' using '" + M + "'", e5);
        }
    }
}
