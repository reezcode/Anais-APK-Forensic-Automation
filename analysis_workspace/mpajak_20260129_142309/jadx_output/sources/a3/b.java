package a3;

/* loaded from: classes3.dex */
public abstract class b<T, ID> {

    /* renamed from: f, reason: collision with root package name */
    public static x2.c f68f = x2.d.a(b.class);

    /* renamed from: a, reason: collision with root package name */
    public final d3.c<T, ID> f69a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f70b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.g f71c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.g[] f73e;

    public b(d3.c<T, ID> cVar, String str, v2.g[] gVarArr) {
        this.f69a = cVar;
        this.f70b = cVar.f2494b;
        this.f71c = cVar.f2498f;
        this.f72d = str;
        this.f73e = gVarArr;
    }

    public static void b(u2.c cVar, StringBuilder sb, v2.g gVar) {
        ((u2.a) cVar).a(sb, gVar.f5680d);
        sb.append(' ');
    }

    public static void c(u2.c cVar, StringBuilder sb, String str, String str2) {
        sb.append(str);
        ((u2.a) cVar).a(sb, str2);
        sb.append(' ');
    }

    public static void d(u2.c cVar, v2.g gVar, StringBuilder sb) {
        sb.append("WHERE ");
        b(cVar, sb, gVar);
        sb.append("= ?");
    }

    public final Object[] e(Object obj) {
        Object obj2;
        Object[] objArr = new Object[this.f73e.length];
        int i5 = 0;
        while (true) {
            v2.g[] gVarArr = this.f73e;
            if (i5 >= gVarArr.length) {
                return objArr;
            }
            v2.g gVar = gVarArr[i5];
            if (gVar.f5681e.f5675z) {
                Object e5 = gVar.e(obj);
                if (gVar.l(e5)) {
                    e5 = null;
                }
                objArr[i5] = e5;
            } else {
                objArr[i5] = gVar.d(gVar.e(obj));
            }
            if (objArr[i5] == null && (obj2 = gVar.f5689m) != null) {
                objArr[i5] = obj2;
            }
            i5++;
        }
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("MappedStatement: ");
        g5.append(this.f72d);
        return g5.toString();
    }
}
