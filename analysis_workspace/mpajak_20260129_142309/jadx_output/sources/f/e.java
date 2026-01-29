package f;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes18.dex */
public final class e extends a implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, Object> f2688i;

    public e() {
        this(16, false);
    }

    public e(int i5, boolean z4) {
        this.f2688i = z4 ? new LinkedHashMap<>(i5) : new HashMap<>(i5);
    }

    public e(Map<String, Object> map) {
        this.f2688i = map;
    }

    public e(boolean z4) {
        this(16, z4);
    }

    public final e A(String str) {
        Object obj = this.f2688i.get(str);
        return obj instanceof e ? (e) obj : obj instanceof String ? a.u((String) obj) : (e) a.w(obj);
    }

    public final String B(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final Object put(String str, Object obj) {
        return this.f2688i.put(str, obj);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f2688i.clear();
    }

    public final Object clone() {
        return new e((Map<String, Object>) (this.f2688i instanceof LinkedHashMap ? new LinkedHashMap(this.f2688i) : new HashMap(this.f2688i)));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f2688i.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f2688i.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.f2688i.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f2688i.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.f2688i.get(obj);
        return (obj2 == null && (obj instanceof Number)) ? this.f2688i.get(obj.toString()) : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f2688i.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String substring;
        StringBuilder sb;
        Class<?>[] parameterTypes = method.getParameterTypes();
        String str = null;
        if (parameterTypes.length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() != Void.TYPE) {
                throw new d("illegal setter");
            }
            g.b bVar = (g.b) method.getAnnotation(g.b.class);
            String name = (bVar == null || bVar.name().length() == 0) ? null : bVar.name();
            if (name == null) {
                String name2 = method.getName();
                if (!name2.startsWith("set")) {
                    throw new d("illegal setter");
                }
                String substring2 = name2.substring(3);
                if (substring2.length() == 0) {
                    throw new d("illegal setter");
                }
                name = Character.toLowerCase(substring2.charAt(0)) + substring2.substring(1);
            }
            this.f2688i.put(name, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == Void.TYPE) {
            throw new d("illegal getter");
        }
        g.b bVar2 = (g.b) method.getAnnotation(g.b.class);
        if (bVar2 != null && bVar2.name().length() != 0) {
            str = bVar2.name();
        }
        if (str == null) {
            String name3 = method.getName();
            if (name3.startsWith("get")) {
                substring = name3.substring(3);
                if (substring.length() == 0) {
                    throw new d("illegal getter");
                }
                sb = new StringBuilder();
            } else {
                if (!name3.startsWith("is")) {
                    if (name3.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name3.startsWith("toString")) {
                        return l();
                    }
                    throw new d("illegal getter");
                }
                substring = name3.substring(2);
                if (substring.length() == 0) {
                    throw new d("illegal getter");
                }
                sb = new StringBuilder();
            }
            sb.append(Character.toLowerCase(substring.charAt(0)));
            sb.append(substring.substring(1));
            str = sb.toString();
        }
        return m.j.c(this.f2688i.get(str), method.getGenericReturnType(), i.i.f3229n);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2688i.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f2688i.keySet();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        this.f2688i.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f2688i.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2688i.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.f2688i.values();
    }

    public final float y(String str) {
        Float k5 = m.j.k(get(str));
        if (k5 == null) {
            return 0.0f;
        }
        return k5.floatValue();
    }

    public final int z(String str) {
        Integer l5 = m.j.l(get(str));
        if (l5 == null) {
            return 0;
        }
        return l5.intValue();
    }
}
