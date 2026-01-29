package d3;

import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import v2.e;
import v2.g;

/* loaded from: classes6.dex */
public final class c<T, ID> {

    /* renamed from: j, reason: collision with root package name */
    public static final g[] f2492j = new g[0];

    /* renamed from: a, reason: collision with root package name */
    public final t2.a<T, ID> f2493a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2495c;

    /* renamed from: d, reason: collision with root package name */
    public final g[] f2496d;

    /* renamed from: e, reason: collision with root package name */
    public final g[] f2497e;

    /* renamed from: f, reason: collision with root package name */
    public final g f2498f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<T> f2499g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2500h;

    /* renamed from: i, reason: collision with root package name */
    public Map<String, g> f2501i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(c3.c r3, t2.a<T, ID> r4, java.lang.Class<T> r5) {
        /*
            r2 = this;
            r0 = r3
            q2.b r0 = (q2.b) r0
            u2.d r1 = r0.f4739d
            java.lang.String r1 = d3.b.c(r5)
            u2.d r0 = r0.f4739d
            java.util.Objects.requireNonNull(r0)
            d3.b r0 = new d3.b
            v2.g[] r3 = d3.b.b(r3, r5, r1)
            r0.<init>(r5, r1, r3)
            r2.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.c.<init>(c3.c, t2.a, java.lang.Class):void");
    }

    public c(t2.a aVar, b bVar) {
        this.f2493a = aVar;
        this.f2494b = bVar.f2487a;
        this.f2495c = bVar.f2488b;
        g[] gVarArr = bVar.f2490d;
        if (gVarArr == null) {
            throw new SQLException("Field types have not been extracted in table config");
        }
        this.f2496d = gVarArr;
        g gVar = null;
        int i5 = 0;
        boolean z4 = false;
        for (g gVar2 : gVarArr) {
            if (gVar2.f5682f || gVar2.f5683g || gVar2.m()) {
                if (gVar != null) {
                    StringBuilder g5 = androidx.activity.d.g("More than 1 idField configured for class ");
                    g5.append(this.f2494b);
                    g5.append(" (");
                    g5.append(gVar);
                    g5.append(",");
                    g5.append(gVar2);
                    g5.append(")");
                    throw new SQLException(g5.toString());
                }
                gVar = gVar2;
            }
            e eVar = gVar2.f5681e;
            z4 = eVar.B ? true : z4;
            if (eVar.F) {
                i5++;
            }
        }
        this.f2498f = gVar;
        if (bVar.f2491e == null) {
            Class<T> cls = bVar.f2487a;
            try {
                for (Object obj : cls.getDeclaredConstructors()) {
                    Constructor<T> constructor = (Constructor<T>) obj;
                    if (constructor.getParameterTypes().length == 0) {
                        if (!constructor.isAccessible()) {
                            try {
                                constructor.setAccessible(true);
                            } catch (SecurityException unused) {
                                throw new IllegalArgumentException(androidx.activity.d.e("Could not open access to constructor for ", cls));
                            }
                        }
                        bVar.f2491e = constructor;
                    }
                }
                if (cls.getEnclosingClass() == null) {
                    throw new IllegalArgumentException(androidx.activity.d.e("Can't find a no-arg constructor for ", cls));
                }
                throw new IllegalArgumentException("Can't find a no-arg constructor for " + cls + ".  Missing static on inner class?");
            } catch (Exception e5) {
                throw new IllegalArgumentException(androidx.activity.d.e("Can't lookup declared constructors for ", cls), e5);
            }
        }
        this.f2499g = bVar.f2491e;
        this.f2500h = z4;
        if (i5 == 0) {
            this.f2497e = f2492j;
            return;
        }
        this.f2497e = new g[i5];
        int i6 = 0;
        for (g gVar3 : this.f2496d) {
            if (gVar3.f5681e.F) {
                this.f2497e[i6] = gVar3;
                i6++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T a() {
        try {
            t2.a<T, ID> aVar = this.f2493a;
            if (aVar != null) {
                Objects.requireNonNull(aVar);
            }
            T newInstance = this.f2499g.newInstance(new Object[0]);
            if (newInstance instanceof y2.a) {
                Objects.requireNonNull((y2.a) newInstance);
            }
            return newInstance;
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("Could not create object for ");
            g5.append(this.f2499g.getDeclaringClass());
            throw d1.c.e(g5.toString(), e5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, v2.g>] */
    public final g b(String str) {
        if (this.f2501i == null) {
            HashMap hashMap = new HashMap();
            for (g gVar : this.f2496d) {
                hashMap.put(gVar.f5680d.toLowerCase(), gVar);
            }
            this.f2501i = hashMap;
        }
        g gVar2 = (g) this.f2501i.get(str.toLowerCase());
        if (gVar2 != null) {
            return gVar2;
        }
        for (g gVar3 : this.f2496d) {
            if (gVar3.g().equals(str)) {
                StringBuilder g5 = androidx.activity.d.g("You should use columnName '");
                g5.append(gVar3.f5680d);
                g5.append("' for table ");
                g5.append(this.f2495c);
                g5.append(" instead of fieldName '");
                g5.append(gVar3.g());
                g5.append("'");
                throw new IllegalArgumentException(g5.toString());
            }
        }
        StringBuilder f5 = androidx.activity.result.a.f("Unknown column name '", str, "' in table ");
        f5.append(this.f2495c);
        throw new IllegalArgumentException(f5.toString());
    }
}
