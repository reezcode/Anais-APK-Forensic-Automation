package j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes19.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final m.c f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f3378b;

    public k(Class<?> cls, m.c cVar) {
        this.f3378b = cls;
        this.f3377a = cVar;
    }

    public int a() {
        return 0;
    }

    public abstract void b(i.a aVar, Object obj, Type type, Map<String, Object> map);

    public void c(Object obj, Object obj2) {
        Collection collection;
        Map map;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        String str;
        if (obj2 == null && this.f3377a.f4065f.isPrimitive()) {
            return;
        }
        m.c cVar = this.f3377a;
        if (cVar.f4065f == String.class && (str = cVar.f4079t) != null && str.equals("trim")) {
            obj2 = ((String) obj2).trim();
        }
        try {
            m.c cVar2 = this.f3377a;
            Method method = cVar2.f4062c;
            if (method != null) {
                if (!cVar2.f4068i) {
                    method.invoke(obj, obj2);
                    return;
                }
                Class<?> cls = cVar2.f4065f;
                if (cls == AtomicInteger.class) {
                    atomicInteger = (AtomicInteger) method.invoke(obj, new Object[0]);
                    if (atomicInteger != null) {
                        atomicInteger2 = (AtomicInteger) obj2;
                        atomicInteger.set(atomicInteger2.get());
                        return;
                    }
                    return;
                }
                if (cls == AtomicLong.class) {
                    atomicLong = (AtomicLong) method.invoke(obj, new Object[0]);
                    if (atomicLong != null) {
                        atomicLong2 = (AtomicLong) obj2;
                        atomicLong.set(atomicLong2.get());
                        return;
                    }
                    return;
                }
                if (cls == AtomicBoolean.class) {
                    atomicBoolean = (AtomicBoolean) method.invoke(obj, new Object[0]);
                    if (atomicBoolean != null) {
                        atomicBoolean2 = (AtomicBoolean) obj2;
                        atomicBoolean.set(atomicBoolean2.get());
                        return;
                    }
                    return;
                }
                if (Map.class.isAssignableFrom(method.getReturnType())) {
                    map = (Map) method.invoke(obj, new Object[0]);
                    if (map == null) {
                        return;
                    }
                    map.putAll((Map) obj2);
                    return;
                }
                collection = (Collection) method.invoke(obj, new Object[0]);
                if (collection == null || obj2 == null) {
                    return;
                }
                collection.clear();
                collection.addAll((Collection) obj2);
            }
            Field field = cVar2.f4063d;
            if (!cVar2.f4068i) {
                if (field != null) {
                    field.set(obj, obj2);
                    return;
                }
                return;
            }
            Class<?> cls2 = cVar2.f4065f;
            if (cls2 == AtomicInteger.class) {
                atomicInteger = (AtomicInteger) field.get(obj);
                if (atomicInteger != null) {
                    atomicInteger2 = (AtomicInteger) obj2;
                    atomicInteger.set(atomicInteger2.get());
                    return;
                }
                return;
            }
            if (cls2 == AtomicLong.class) {
                atomicLong = (AtomicLong) field.get(obj);
                if (atomicLong != null) {
                    atomicLong2 = (AtomicLong) obj2;
                    atomicLong.set(atomicLong2.get());
                    return;
                }
                return;
            }
            if (cls2 == AtomicBoolean.class) {
                atomicBoolean = (AtomicBoolean) field.get(obj);
                if (atomicBoolean != null) {
                    atomicBoolean2 = (AtomicBoolean) obj2;
                    atomicBoolean.set(atomicBoolean2.get());
                    return;
                }
                return;
            }
            if (Map.class.isAssignableFrom(cls2)) {
                map = (Map) field.get(obj);
                if (map != null) {
                    map.putAll((Map) obj2);
                    return;
                }
                return;
            }
            collection = (Collection) field.get(obj);
            if (collection == null || obj2 == null) {
                return;
            }
            collection.clear();
            collection.addAll((Collection) obj2);
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("set property error, ");
            g5.append(this.f3377a.f4061b);
            throw new f.d(g5.toString(), e5);
        }
    }

    public final void d(Object obj, String str) {
        c(obj, str);
    }
}
