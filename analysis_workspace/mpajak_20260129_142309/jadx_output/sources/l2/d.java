package l2;

import i2.a0;
import i2.z;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes22.dex */
public final class d<T extends Date> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f3958a;

    /* renamed from: b, reason: collision with root package name */
    public final List<DateFormat> f3959b;

    /* loaded from: classes14.dex */
    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final b<Date> f3960b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f3961a;

        /* loaded from: classes21.dex */
        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // l2.d.b
            public final Date b(Date date) {
                return date;
            }
        }

        public b(Class<T> cls) {
            this.f3961a = cls;
        }

        public final a0 a(int i5, int i6) {
            d dVar = new d(this, i5, i6, null);
            Class<T> cls = this.f3961a;
            z<Class> zVar = q.f4010a;
            return new r(cls, dVar);
        }

        public abstract T b(Date date);
    }

    public d(b bVar, int i5, int i6, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f3959b = arrayList;
        Objects.requireNonNull(bVar);
        this.f3958a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i5, i6, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i5, i6));
        }
        if (k2.n.f3832a >= 9) {
            arrayList.add(d1.d.f(i5, i6));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<java.text.DateFormat>] */
    @Override // i2.z
    public final Object a(p2.a aVar) {
        Date b5;
        if (aVar.N() == 9) {
            aVar.I();
            return null;
        }
        String K = aVar.K();
        synchronized (this.f3959b) {
            Iterator it = this.f3959b.iterator();
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
        return this.f3958a.b(b5);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.text.DateFormat>] */
    @Override // i2.z
    public final void b(p2.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.q();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3959b.get(0);
        synchronized (this.f3959b) {
            format = dateFormat.format(date);
        }
        bVar.E(format);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.text.DateFormat>] */
    public final String toString() {
        StringBuilder g5;
        String simpleName;
        DateFormat dateFormat = (DateFormat) this.f3959b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            g5 = androidx.activity.d.g("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            g5 = androidx.activity.d.g("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        g5.append(simpleName);
        g5.append(')');
        return g5.toString();
    }
}
