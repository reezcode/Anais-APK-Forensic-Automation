package w2;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;
import java.util.Objects;
import w2.b;

/* loaded from: classes11.dex */
public class q extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final q f5786e = new q();

    public q() {
        super(3, new Class[]{Date.class});
    }

    public q(Class[] clsArr) {
        super(3, clsArr);
    }

    @Override // d1.f
    public Object J(v2.g gVar, Object obj, int i5) {
        return new Date(((Timestamp) obj).getTime());
    }

    public b.a N() {
        return b.f5755d;
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        Objects.requireNonNull((q2.d) eVar);
        throw new SQLException("Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types");
    }

    @Override // d1.f, v2.f
    public Object e(v2.g gVar, Object obj) {
        return new Timestamp(((Date) obj).getTime());
    }

    @Override // w2.a, v2.a
    public final boolean p() {
        return true;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        b.a M = b.M(gVar, N());
        try {
            return new Timestamp(M.a().parse(str).getTime());
        } catch (ParseException e5) {
            throw d1.c.e("Problems parsing default date string '" + str + "' using '" + M + '\'', e5);
        }
    }
}
