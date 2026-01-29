package j;

import java.lang.reflect.Type;
import java.sql.Time;

/* loaded from: classes2.dex */
public final class a0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f3368a = new a0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        long parseLong;
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 16) {
            cVar.Q(4);
            if (cVar.q() != 4) {
                throw new f.d("syntax error");
            }
            cVar.H();
            if (cVar.q() != 2) {
                throw new f.d("syntax error");
            }
            long e5 = cVar.e();
            cVar.Q(13);
            if (cVar.q() != 13) {
                throw new f.d("syntax error");
            }
            cVar.Q(16);
            return (T) new Time(e5);
        }
        T t4 = (T) aVar.w(null);
        if (t4 == 0) {
            return null;
        }
        if (t4 instanceof Time) {
            return t4;
        }
        if (t4 instanceof Number) {
            return (T) new Time(((Number) t4).longValue());
        }
        if (!(t4 instanceof String)) {
            throw new f.d("parse error");
        }
        String str = (String) t4;
        if (str.length() == 0) {
            return null;
        }
        i.f fVar = new i.f(str);
        boolean z4 = true;
        if (fVar.S0(true)) {
            parseLong = fVar.f3190k.getTimeInMillis();
        } else {
            for (int i5 = 0; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    z4 = false;
                    break;
                }
            }
            if (!z4) {
                fVar.close();
                return (T) Time.valueOf(str);
            }
            parseLong = Long.parseLong(str);
        }
        fVar.close();
        return (T) new Time(parseLong);
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
