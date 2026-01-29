package t2;

import java.lang.reflect.Constructor;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static Map<a, g<?, ?>> f5438a;

    /* renamed from: b, reason: collision with root package name */
    public static Map<Object, g<?, ?>> f5439b;

    /* renamed from: c, reason: collision with root package name */
    public static x2.c f5440c = x2.d.a(h.class);

    /* loaded from: classes15.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public c3.c f5441a;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f5442b;

        public a(c3.c cVar, Class<?> cls) {
            this.f5441a = cVar;
            this.f5442b = cls;
        }

        public final boolean equals(Object obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5442b.equals(aVar.f5442b) && this.f5441a.equals(aVar.f5441a);
        }

        public final int hashCode() {
            return this.f5441a.hashCode() + ((this.f5442b.hashCode() + 31) * 31);
        }
    }

    public static synchronized <D extends g<T, ?>, T> D a(c3.c cVar, Class<T> cls) {
        D cVar2;
        synchronized (h.class) {
            if (cVar == null) {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
            D d5 = (D) c(new a(cVar, cls));
            if (d5 != null) {
                return d5;
            }
            d3.a aVar = (d3.a) cls.getAnnotation(d3.a.class);
            if (aVar != null && aVar.daoClass() != Void.class && aVar.daoClass() != t2.a.class) {
                Class<?> daoClass = aVar.daoClass();
                Object[] objArr = {cVar, cls};
                Constructor<?> b5 = b(daoClass, objArr);
                if (b5 == null && (b5 = b(daoClass, (objArr = new Object[]{cVar}))) == null) {
                    throw new SQLException("Could not find public constructor with ConnectionSource and optional Class parameters " + daoClass + ".  Missing static on class?");
                }
                try {
                    cVar2 = (D) b5.newInstance(objArr);
                    f5440c.b("created dao for class {} from constructor", cls);
                    d(cVar, cVar2);
                    return cVar2;
                } catch (Exception e5) {
                    throw d1.c.e("Could not call the constructor in class " + daoClass, e5);
                }
            }
            d3.b<T> b6 = ((q2.b) cVar).f4739d.b(cVar, cls);
            if (b6 == null) {
                ThreadLocal<List<t2.a<?, ?>>> threadLocal = t2.a.f5422j;
                cVar2 = new b(cVar, cls);
            } else {
                ThreadLocal<List<t2.a<?, ?>>> threadLocal2 = t2.a.f5422j;
                cVar2 = new c(cVar, b6);
            }
            f5440c.b("created dao for class {} with reflection", cls);
            d(cVar, cVar2);
            return cVar2;
        }
    }

    public static Constructor<?> b(Class<?> cls, Object[] objArr) {
        boolean z4;
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == objArr.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= parameterTypes.length) {
                        z4 = true;
                        break;
                    }
                    if (!parameterTypes[i5].isAssignableFrom(objArr[i5].getClass())) {
                        z4 = false;
                        break;
                    }
                    i5++;
                }
                if (z4) {
                    return constructor;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<t2.h$a, t2.g<?, ?>>] */
    public static <T> g<?, ?> c(a aVar) {
        if (f5438a == null) {
            f5438a = new HashMap();
        }
        g<?, ?> gVar = (g) f5438a.get(aVar);
        if (gVar == null) {
            return null;
        }
        return gVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap, java.util.Map<t2.h$a, t2.g<?, ?>>] */
    public static synchronized void d(c3.c cVar, g<?, ?> gVar) {
        synchronized (h.class) {
            try {
                if (cVar == null) {
                    throw new IllegalArgumentException("connectionSource argument cannot be null");
                }
                a aVar = new a(cVar, gVar.a());
                if (f5438a == null) {
                    f5438a = new HashMap();
                }
                f5438a.put(aVar, gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<t2.h$a, t2.g<?, ?>>] */
    public static synchronized void e(c3.c cVar, g<?, ?> gVar) {
        synchronized (h.class) {
            if (cVar == null) {
                throw new IllegalArgumentException("connectionSource argument cannot be null");
            }
            a aVar = new a(cVar, ((t2.a) gVar).f5426e);
            ?? r22 = f5438a;
            if (r22 != 0) {
                r22.remove(aVar);
            }
        }
    }
}
