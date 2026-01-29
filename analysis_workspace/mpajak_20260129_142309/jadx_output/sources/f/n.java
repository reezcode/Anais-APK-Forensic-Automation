package f;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes12.dex */
public class n<T> {

    /* renamed from: b, reason: collision with root package name */
    public static ConcurrentMap<Type, Type> f2764b = new ConcurrentHashMap(16, 0.75f, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final Type f2765c = new a().f2766a;

    /* renamed from: a, reason: collision with root package name */
    public final Type f2766a;

    /* loaded from: classes24.dex */
    public static class a extends n<List<String>> {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.lang.reflect.Type>] */
    public n() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Type type2 = (Type) f2764b.get(type);
        if (type2 == null) {
            f2764b.putIfAbsent(type, type);
            type2 = (Type) f2764b.get(type);
        }
        this.f2766a = type2;
    }
}
