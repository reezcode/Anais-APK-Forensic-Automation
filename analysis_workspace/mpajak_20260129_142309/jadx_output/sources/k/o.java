package k;

import com.blankj.utilcode.constant.TimeConstants;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/* loaded from: classes19.dex */
public final class o implements q0, j.s {

    /* renamed from: b, reason: collision with root package name */
    public static final o f3736b = new o();

    /* renamed from: a, reason: collision with root package name */
    public DatatypeFactory f3737a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.Calendar] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        T t4 = (T) v.f3744a.f(aVar, type, obj, null);
        if (t4 instanceof Calendar) {
            return t4;
        }
        Date date = (Date) t4;
        if (date == null) {
            return null;
        }
        i.c cVar = aVar.f3146g;
        ?? r32 = (T) Calendar.getInstance(cVar.l0(), cVar.f0());
        r32.setTime(date);
        return type == XMLGregorianCalendar.class ? (T) f((GregorianCalendar) r32) : r32;
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        char[] charArray;
        String format;
        String str;
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.E();
            return;
        }
        Calendar gregorianCalendar = obj instanceof XMLGregorianCalendar ? ((XMLGregorianCalendar) obj).toGregorianCalendar() : (Calendar) obj;
        if (!a1Var.l(b1.UseISO8601DateFormat)) {
            g0Var.q(gregorianCalendar.getTime());
            return;
        }
        int i6 = a1Var.l(b1.UseSingleQuotes) ? 39 : 34;
        a1Var.write(i6);
        int i7 = gregorianCalendar.get(1);
        int i8 = gregorianCalendar.get(2) + 1;
        int i9 = gregorianCalendar.get(5);
        int i10 = gregorianCalendar.get(11);
        int i11 = gregorianCalendar.get(12);
        int i12 = gregorianCalendar.get(13);
        int i13 = gregorianCalendar.get(14);
        if (i13 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            m.e.b(i13, 23, charArray);
            m.e.b(i12, 19, charArray);
            m.e.b(i11, 16, charArray);
            m.e.b(i10, 13, charArray);
            m.e.b(i9, 10, charArray);
            m.e.b(i8, 7, charArray);
            m.e.b(i7, 4, charArray);
        } else if (i12 == 0 && i11 == 0 && i10 == 0) {
            charArray = "0000-00-00".toCharArray();
            m.e.b(i9, 10, charArray);
            m.e.b(i8, 7, charArray);
            m.e.b(i7, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            m.e.b(i12, 19, charArray);
            m.e.b(i11, 16, charArray);
            m.e.b(i10, 13, charArray);
            m.e.b(i9, 10, charArray);
            m.e.b(i8, 7, charArray);
            m.e.b(i7, 4, charArray);
        }
        a1Var.write(charArray);
        int rawOffset = gregorianCalendar.getTimeZone().getRawOffset() / TimeConstants.HOUR;
        if (rawOffset == 0) {
            str = "Z";
        } else {
            if (rawOffset > 0) {
                a1Var.a("+");
                format = String.format("%02d", Integer.valueOf(rawOffset));
            } else {
                a1Var.a("-");
                format = String.format("%02d", Integer.valueOf(-rawOffset));
            }
            a1Var.a(format);
            str = ":00";
        }
        a1Var.a(str);
        a1Var.write(i6);
    }

    @Override // j.s
    public final int e() {
        return 2;
    }

    public final XMLGregorianCalendar f(Calendar calendar) {
        if (this.f3737a == null) {
            try {
                this.f3737a = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e5) {
                throw new IllegalStateException("Could not obtain an instance of DatatypeFactory.", e5);
            }
        }
        return this.f3737a.newXMLGregorianCalendar((GregorianCalendar) calendar);
    }
}
