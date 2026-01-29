package k;

import com.blankj.utilcode.constant.TimeConstants;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes20.dex */
public final class v extends j.b implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3744a = new v();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        char[] charArray;
        String format;
        int i6;
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.E();
            return;
        }
        Date i7 = obj instanceof Date ? (Date) obj : m.j.i(obj);
        if (a1Var.l(b1.WriteDateUseDateFormat)) {
            SimpleDateFormat simpleDateFormat = g0Var.f3692m;
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(f.a.f2682f, g0Var.f3696q);
                simpleDateFormat.setTimeZone(g0Var.f3695p);
            }
            a1Var.J(simpleDateFormat.format(i7));
            return;
        }
        if (a1Var.l(b1.WriteClassName) && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                a1Var.write("new Date(");
                a1Var.A(((Date) obj).getTime());
                i6 = 41;
            } else {
                a1Var.write(123);
                a1Var.q(f.a.f2680d);
                g0Var.r(obj.getClass().getName());
                a1Var.s(',', "val", ((Date) obj).getTime());
                i6 = 125;
            }
            a1Var.write(i6);
            return;
        }
        long time = i7.getTime();
        if (!a1Var.l(b1.UseISO8601DateFormat)) {
            a1Var.A(time);
            return;
        }
        int i8 = a1Var.l(b1.UseSingleQuotes) ? 39 : 34;
        a1Var.write(i8);
        Calendar calendar = Calendar.getInstance(g0Var.f3695p, g0Var.f3696q);
        calendar.setTimeInMillis(time);
        int i9 = calendar.get(1);
        int i10 = calendar.get(2) + 1;
        int i11 = calendar.get(5);
        int i12 = calendar.get(11);
        int i13 = calendar.get(12);
        int i14 = calendar.get(13);
        int i15 = calendar.get(14);
        if (i15 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            m.e.b(i15, 23, charArray);
            m.e.b(i14, 19, charArray);
            m.e.b(i13, 16, charArray);
            m.e.b(i12, 13, charArray);
            m.e.b(i11, 10, charArray);
            m.e.b(i10, 7, charArray);
            m.e.b(i9, 4, charArray);
        } else if (i14 == 0 && i13 == 0 && i12 == 0) {
            charArray = "0000-00-00".toCharArray();
            m.e.b(i11, 10, charArray);
            m.e.b(i10, 7, charArray);
            m.e.b(i9, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            m.e.b(i14, 19, charArray);
            m.e.b(i13, 16, charArray);
            m.e.b(i12, 13, charArray);
            m.e.b(i11, 10, charArray);
            m.e.b(i10, 7, charArray);
            m.e.b(i9, 4, charArray);
        }
        a1Var.write(charArray);
        int rawOffset = calendar.getTimeZone().getRawOffset() / TimeConstants.HOUR;
        if (rawOffset == 0) {
            a1Var.write(90);
        } else {
            if (rawOffset > 0) {
                a1Var.write(43);
                format = String.format("%02d", Integer.valueOf(rawOffset));
            } else {
                a1Var.write(45);
                format = String.format("%02d", Integer.valueOf(-rawOffset));
            }
            a1Var.a(format);
            a1Var.a(":00");
        }
        a1Var.write(i8);
    }

    @Override // j.s
    public final int e() {
        return 2;
    }

    @Override // j.b
    public final Object g(i.a aVar, Type type, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new f.d("parse error");
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        i.f fVar = new i.f(str);
        try {
            if (fVar.S0(false)) {
                Calendar calendar = fVar.f3190k;
                return type == Calendar.class ? calendar : calendar.getTime();
            }
            fVar.close();
            if (str.length() == aVar.f3144e.length() || (str.length() == 22 && aVar.f3144e.equals("yyyyMMddHHmmssSSSZ"))) {
                try {
                    return aVar.n().parse(str);
                } catch (ParseException unused) {
                }
            }
            if (str.startsWith("/Date(") && str.endsWith(")/")) {
                str = str.substring(6, str.length() - 2);
            }
            if ("0000-00-00".equals(str) || "0000-00-00T00:00:00".equalsIgnoreCase(str) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str)) {
                return null;
            }
            int lastIndexOf = str.lastIndexOf(124);
            if (lastIndexOf > 20) {
                TimeZone timeZone = TimeZone.getTimeZone(str.substring(lastIndexOf + 1));
                if (!"GMT".equals(timeZone.getID())) {
                    fVar = new i.f(str.substring(0, lastIndexOf));
                    try {
                        if (fVar.S0(false)) {
                            Calendar calendar2 = fVar.f3190k;
                            calendar2.setTimeZone(timeZone);
                            return type == Calendar.class ? calendar2 : calendar2.getTime();
                        }
                    } finally {
                    }
                }
            }
            return new Date(Long.parseLong(str));
        } finally {
        }
    }
}
