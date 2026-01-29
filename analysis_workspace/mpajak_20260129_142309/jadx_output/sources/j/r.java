package j;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* loaded from: classes14.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3409a = new r();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Number, java.lang.Object, java.math.BigDecimal] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 2) {
            if (type == Double.TYPE || type == Double.class) {
                String i02 = cVar.i0();
                cVar.Q(16);
                return (T) Double.valueOf(Double.parseDouble(i02));
            }
            long e5 = cVar.e();
            cVar.Q(16);
            if (type == Short.TYPE || type == Short.class) {
                if (e5 > 32767 || e5 < -32768) {
                    throw new f.d(androidx.activity.result.a.d("short overflow : ", e5));
                }
                return (T) Short.valueOf((short) e5);
            }
            if (type != Byte.TYPE && type != Byte.class) {
                return (e5 < -2147483648L || e5 > 2147483647L) ? (T) Long.valueOf(e5) : (T) Integer.valueOf((int) e5);
            }
            if (e5 > 127 || e5 < -128) {
                throw new f.d(androidx.activity.result.a.d("short overflow : ", e5));
            }
            return (T) Byte.valueOf((byte) e5);
        }
        if (cVar.q() == 3) {
            if (type == Double.TYPE || type == Double.class) {
                String i03 = cVar.i0();
                cVar.Q(16);
                return (T) Double.valueOf(Double.parseDouble(i03));
            }
            ?? r02 = (T) cVar.U();
            cVar.Q(16);
            if (type != Short.TYPE && type != Short.class) {
                return (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf(r02.byteValue()) : r02;
            }
            if (r02.compareTo(BigDecimal.valueOf(32767L)) <= 0 && r02.compareTo(BigDecimal.valueOf(-32768L)) >= 0) {
                return (T) Short.valueOf(r02.shortValue());
            }
            throw new f.d("short overflow : " + ((Object) r02));
        }
        if (cVar.q() == 18 && "NaN".equals(cVar.k0())) {
            cVar.y();
            if (type == Double.class) {
                return (T) Double.valueOf(Double.NaN);
            }
            if (type == Float.class) {
                return (T) Float.valueOf(Float.NaN);
            }
            return null;
        }
        Object w4 = aVar.w(null);
        if (w4 == null) {
            return null;
        }
        if (type == Double.TYPE || type == Double.class) {
            try {
                return (T) m.j.j(w4);
            } catch (Exception e6) {
                throw new f.d(androidx.appcompat.widget.a.i("parseDouble error, field : ", obj), e6);
            }
        }
        if (type == Short.TYPE || type == Short.class) {
            try {
                return (T) m.j.o(w4);
            } catch (Exception e7) {
                throw new f.d(androidx.appcompat.widget.a.i("parseShort error, field : ", obj), e7);
            }
        }
        if (type != Byte.TYPE && type != Byte.class) {
            return (T) m.j.d(w4);
        }
        try {
            return (T) m.j.g(w4);
        } catch (Exception e8) {
            throw new f.d(androidx.appcompat.widget.a.i("parseByte error, field : ", obj), e8);
        }
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
