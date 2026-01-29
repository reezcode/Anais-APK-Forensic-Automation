package d3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import v2.e;
import v2.g;

/* loaded from: classes2.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public Class<T> f2487a;

    /* renamed from: b, reason: collision with root package name */
    public String f2488b;

    /* renamed from: c, reason: collision with root package name */
    public List<e> f2489c;

    /* renamed from: d, reason: collision with root package name */
    public g[] f2490d;

    /* renamed from: e, reason: collision with root package name */
    public Constructor<T> f2491e;

    public b(Class<T> cls, String str, List<e> list) {
        this.f2487a = cls;
        this.f2488b = str;
        this.f2489c = list;
    }

    public b(Class<T> cls, String str, g[] gVarArr) {
        this.f2487a = cls;
        this.f2488b = str;
        this.f2490d = gVarArr;
    }

    public static <T> g[] b(c3.c cVar, Class<T> cls, String str) {
        ArrayList arrayList = new ArrayList();
        for (Class<T> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field field : cls2.getDeclaredFields()) {
                ThreadLocal<g.b> threadLocal = g.f5676u;
                e e5 = e.e(((q2.b) cVar).f4739d, field);
                g gVar = e5 == null ? null : new g(cVar, str, field, e5, cls);
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return (g[]) arrayList.toArray(new g[arrayList.size()]);
        }
        StringBuilder g5 = androidx.activity.d.g("No fields have a ");
        g5.append(v2.d.class.getSimpleName());
        g5.append(" annotation in ");
        g5.append(cls);
        throw new IllegalArgumentException(g5.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r0.length() > 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.String c(java.lang.Class<T> r9) {
        /*
            java.lang.Class<d3.a> r0 = d3.a.class
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r0)
            d3.a r0 = (d3.a) r0
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.tableName()
            if (r1 == 0) goto L1f
            java.lang.String r1 = r0.tableName()
            int r1 = r1.length()
            if (r1 <= 0) goto L1f
            java.lang.String r9 = r0.tableName()
            goto L6d
        L1f:
            java.lang.annotation.Annotation[] r0 = r9.getAnnotations()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r2
        L28:
            if (r4 >= r1) goto L40
            r6 = r0[r4]
            java.lang.Class r7 = r6.annotationType()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "javax.persistence.Entity"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3d
            r5 = r6
        L3d:
            int r4 = r4 + 1
            goto L28
        L40:
            if (r5 != 0) goto L43
            goto L60
        L43:
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = "name"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6e
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6e
            if (r0 == 0) goto L60
            int r1 = r0.length()     // Catch: java.lang.Exception -> L6e
            if (r1 <= 0) goto L60
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 != 0) goto L6c
            java.lang.String r9 = r9.getSimpleName()
            java.lang.String r9 = r9.toLowerCase()
            goto L6d
        L6c:
            r9 = r0
        L6d:
            return r9
        L6e:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Could not get entity name from class "
            java.lang.String r9 = androidx.activity.d.e(r2, r9)
            r1.<init>(r9, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.b.c(java.lang.Class):java.lang.String");
    }

    public final void a(c3.c cVar) {
        Field declaredField;
        if (this.f2490d == null) {
            List<e> list = this.f2489c;
            if (list == null) {
                this.f2490d = b(cVar, this.f2487a, this.f2488b);
                return;
            }
            String str = this.f2488b;
            ArrayList arrayList = new ArrayList();
            for (e eVar : list) {
                g gVar = null;
                Class<T> cls = this.f2487a;
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    try {
                        declaredField = cls.getDeclaredField(eVar.f5650a);
                    } catch (NoSuchFieldException unused) {
                    }
                    if (declaredField != null) {
                        gVar = new g(cVar, str, declaredField, eVar, this.f2487a);
                        break;
                    }
                    cls = cls.getSuperclass();
                }
                if (gVar == null) {
                    StringBuilder g5 = androidx.activity.d.g("Could not find declared field with name '");
                    g5.append(eVar.f5650a);
                    g5.append("' for ");
                    g5.append(this.f2487a);
                    throw new SQLException(g5.toString());
                }
                arrayList.add(gVar);
            }
            if (arrayList.isEmpty()) {
                StringBuilder g6 = androidx.activity.d.g("No fields were configured for class ");
                g6.append(this.f2487a);
                throw new SQLException(g6.toString());
            }
            this.f2490d = (g[]) arrayList.toArray(new g[arrayList.size()]);
        }
    }
}
