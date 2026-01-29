package n2;

import i2.a0;
import i2.i;
import i2.u;
import i2.z;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes24.dex */
public final class a extends z<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final C0057a f4506b = new C0057a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4507a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: n2.a$a, reason: collision with other inner class name */
    /* loaded from: classes11.dex */
    public class C0057a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i iVar, o2.a<T> aVar) {
            if (aVar.f4568a == Date.class) {
                return new a();
            }
            return null;
        }
    }

    @Override // i2.z
    public final Date a(p2.a aVar) {
        java.util.Date parse;
        if (aVar.N() == 9) {
            aVar.I();
            return null;
        }
        String K = aVar.K();
        try {
            synchronized (this) {
                parse = this.f4507a.parse(K);
            }
            return new Date(parse.getTime());
        } catch (ParseException e5) {
            StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as SQL Date; at path ");
            f5.append(aVar.q());
            throw new u(f5.toString(), e5);
        }
    }

    @Override // i2.z
    public final void b(p2.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.q();
            return;
        }
        synchronized (this) {
            format = this.f4507a.format((java.util.Date) date2);
        }
        bVar.E(format);
    }
}
