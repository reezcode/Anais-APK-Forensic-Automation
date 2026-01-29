package j;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes11.dex */
public abstract class b extends e {
    @Override // j.e, j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        return (T) f(aVar, type, obj, null);
    }

    @Override // j.e
    public final Object f(i.a aVar, Type type, Object obj, String str) {
        Object w4;
        SimpleDateFormat simpleDateFormat;
        Date parse;
        i.c cVar = aVar.f3146g;
        Object obj2 = null;
        if (cVar.q() == 2) {
            obj2 = Long.valueOf(cVar.e());
            cVar.Q(16);
        } else if (cVar.q() == 4) {
            String k02 = cVar.k0();
            if (str != null) {
                try {
                    simpleDateFormat = new SimpleDateFormat(str, f.a.f2679c);
                } catch (IllegalArgumentException unused) {
                    if (str.equals("yyyy-MM-ddTHH:mm:ss.SSS")) {
                        str = "yyyy-MM-dd'T'HH:mm:ss.SSS";
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
                    } else if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                        str = "yyyy-MM-dd'T'HH:mm:ss";
                        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                    } else {
                        simpleDateFormat = null;
                    }
                }
                try {
                    parse = simpleDateFormat.parse(k02);
                } catch (ParseException unused2) {
                    if (str.equals("yyyy-MM-dd'T'HH:mm:ss.SSS") && k02.length() == 19) {
                        try {
                            parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(k02);
                        } catch (ParseException unused3) {
                        }
                    }
                }
                obj2 = parse;
            }
            if (obj2 == null) {
                cVar.Q(16);
                Object obj3 = k02;
                if (cVar.A(i.b.AllowISO8601DateFormat)) {
                    i.f fVar = new i.f(k02);
                    Object obj4 = k02;
                    if (fVar.S0(true)) {
                        obj4 = fVar.f3190k.getTime();
                    }
                    fVar.close();
                    obj3 = obj4;
                }
                obj2 = obj3;
            }
        } else if (cVar.q() == 8) {
            cVar.y();
        } else {
            if (cVar.q() == 12) {
                cVar.y();
                if (cVar.q() != 4) {
                    throw new f.d("syntax error");
                }
                if (f.a.f2680d.equals(cVar.k0())) {
                    cVar.y();
                    aVar.a(17);
                    Class<?> a5 = aVar.f3143d.a(cVar.k0(), null);
                    if (a5 != null) {
                        type = a5;
                    }
                    aVar.a(4);
                    aVar.a(16);
                }
                cVar.H();
                if (cVar.q() != 2) {
                    StringBuilder g5 = androidx.activity.d.g("syntax error : ");
                    g5.append(cVar.Y());
                    throw new f.d(g5.toString());
                }
                long e5 = cVar.e();
                cVar.y();
                w4 = Long.valueOf(e5);
            } else if (aVar.f3151l == 2) {
                aVar.f3151l = 0;
                aVar.a(16);
                if (cVar.q() != 4) {
                    throw new f.d("syntax error");
                }
                if (!"val".equals(cVar.k0())) {
                    throw new f.d("syntax error");
                }
                cVar.y();
                aVar.a(17);
                w4 = aVar.w(null);
            } else {
                obj2 = aVar.w(null);
            }
            obj2 = w4;
            aVar.a(13);
        }
        return g(aVar, type, obj2);
    }

    public abstract Object g(i.a aVar, Type type, Object obj);
}
