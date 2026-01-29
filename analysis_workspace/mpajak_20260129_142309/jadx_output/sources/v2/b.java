package v2;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import w2.u;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f5643a = u.f5790d;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, a> f5644b = new HashMap();

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.HashMap, java.util.Map<java.lang.String, v2.a>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap, java.util.Map<java.lang.String, v2.a>] */
    static {
        for (c cVar : c.values()) {
            a aVar = cVar.f5649b;
            if (aVar != null) {
                for (Class<?> cls : aVar.g()) {
                    f5644b.put(cls.getName(), aVar);
                }
                if (aVar.b() != null) {
                    for (String str : aVar.b()) {
                        f5644b.put(str, aVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, v2.a>] */
    public static a a(Field field) {
        a aVar = (a) f5644b.get(field.getType().getName());
        if (aVar != null) {
            return aVar;
        }
        if (field.getType().isEnum()) {
            return f5643a;
        }
        return null;
    }
}
