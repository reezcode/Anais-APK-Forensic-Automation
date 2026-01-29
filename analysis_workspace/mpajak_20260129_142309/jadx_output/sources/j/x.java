package j;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes17.dex */
public final class x extends b {

    /* renamed from: b, reason: collision with root package name */
    public static final x f3418b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final x f3419c = new x(true);

    /* renamed from: a, reason: collision with root package name */
    public boolean f3420a = false;

    public x() {
    }

    public x(boolean z4) {
    }

    @Override // j.s
    public final int e() {
        return 2;
    }

    @Override // j.b
    public final Object g(i.a aVar, Type type, Object obj) {
        i.f fVar;
        long parseLong;
        long parseLong2;
        if (this.f3420a) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Date) {
                return new Timestamp(((Date) obj).getTime());
            }
            if (obj instanceof Number) {
                return new Timestamp(((Number) obj).longValue());
            }
            if (!(obj instanceof String)) {
                throw new f.d("parse error");
            }
            String str = (String) obj;
            if (str.length() == 0) {
                return null;
            }
            fVar = new i.f(str);
            try {
                if (fVar.S0(true)) {
                    parseLong2 = fVar.f3190k.getTimeInMillis();
                } else {
                    try {
                        return new Timestamp(aVar.n().parse(str).getTime());
                    } catch (ParseException unused) {
                        parseLong2 = Long.parseLong(str);
                    }
                }
                fVar.close();
                return new Timestamp(parseLong2);
            } finally {
            }
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return new java.sql.Date(((Date) obj).getTime());
        }
        if (obj instanceof Number) {
            return new java.sql.Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new f.d(androidx.appcompat.widget.a.i("parse error : ", obj));
        }
        String str2 = (String) obj;
        if (str2.length() == 0) {
            return null;
        }
        fVar = new i.f(str2);
        try {
            if (fVar.S0(true)) {
                parseLong = fVar.f3190k.getTimeInMillis();
            } else {
                try {
                    return new java.sql.Date(aVar.n().parse(str2).getTime());
                } catch (ParseException unused2) {
                    parseLong = Long.parseLong(str2);
                }
            }
            fVar.close();
            return new java.sql.Date(parseLong);
        } finally {
        }
    }
}
