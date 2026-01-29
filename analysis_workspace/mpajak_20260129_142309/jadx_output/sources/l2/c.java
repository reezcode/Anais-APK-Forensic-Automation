package l2;

import i2.a0;
import i2.z;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class c extends z<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3956b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<DateFormat> f3957a;

    /* loaded from: classes23.dex */
    public class a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
            if (aVar.f4568a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f3957a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (k2.n.f3832a >= 9) {
            arrayList.add(d1.d.f(2, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<java.text.DateFormat>] */
    @Override // i2.z
    public final Date a(p2.a aVar) {
        Date b5;
        if (aVar.N() == 9) {
            aVar.I();
            return null;
        }
        String K = aVar.K();
        synchronized (this.f3957a) {
            Iterator it = this.f3957a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    try {
                        b5 = m2.a.b(K, new ParsePosition(0));
                        break;
                    } catch (ParseException e5) {
                        StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as Date; at path ");
                        f5.append(aVar.q());
                        throw new i2.u(f5.toString(), e5);
                    }
                }
                try {
                    b5 = ((DateFormat) it.next()).parse(K);
                    break;
                } catch (ParseException unused) {
                }
            }
        }
        return b5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.text.DateFormat>] */
    @Override // i2.z
    public final void b(p2.b bVar, Date date) {
        String format;
        Date date2 = date;
        if (date2 == null) {
            bVar.q();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3957a.get(0);
        synchronized (this.f3957a) {
            format = dateFormat.format(date2);
        }
        bVar.E(format);
    }
}
