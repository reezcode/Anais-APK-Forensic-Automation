package w2;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes19.dex */
public abstract class b extends w2.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f5755d = new a("yyyy-MM-dd HH:mm:ss.SSSSSS");

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal<DateFormat> f5756a = new C0080a();

        /* renamed from: b, reason: collision with root package name */
        public final String f5757b;

        /* renamed from: w2.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public class C0080a extends ThreadLocal<DateFormat> {
            public C0080a() {
            }

            @Override // java.lang.ThreadLocal
            public final DateFormat initialValue() {
                return new SimpleDateFormat(a.this.f5757b);
            }
        }

        public a(String str) {
            this.f5757b = str;
        }

        public final DateFormat a() {
            return this.f5756a.get();
        }

        public final String toString() {
            return this.f5757b;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;[Ljava/lang/Class<*>;)V */
    public b(int i5, Class[] clsArr) {
        super(i5, clsArr);
    }

    public static a M(v2.g gVar, a aVar) {
        a aVar2;
        return (gVar == null || (aVar2 = (a) gVar.f5690n) == null) ? aVar : aVar2;
    }

    @Override // w2.a, v2.a
    public final boolean l() {
        return true;
    }

    @Override // w2.a, v2.a
    public boolean m(Field field) {
        return field.getType() == Date.class;
    }

    @Override // w2.a, v2.a
    public Object o(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        if (obj != null && currentTimeMillis == ((Date) obj).getTime()) {
            return new Date(currentTimeMillis + 1);
        }
        return new Date(currentTimeMillis);
    }
}
