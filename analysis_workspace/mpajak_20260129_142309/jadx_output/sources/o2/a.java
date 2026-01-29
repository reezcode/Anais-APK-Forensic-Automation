package o2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import k2.a;

/* loaded from: classes25.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super T> f4568a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f4569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4570c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type a5 = k2.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f4569b = a5;
        this.f4568a = (Class<? super T>) k2.a.f(a5);
        this.f4570c = a5.hashCode();
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a5 = k2.a.a(type);
        this.f4569b = a5;
        this.f4568a = (Class<? super T>) k2.a.f(a5);
        this.f4570c = a5.hashCode();
    }

    public static a<?> a(Type type, Type... typeArr) {
        return new a<>(new a.b(null, type, typeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && k2.a.d(this.f4569b, ((a) obj).f4569b);
    }

    public final int hashCode() {
        return this.f4570c;
    }

    public final String toString() {
        return k2.a.j(this.f4569b);
    }
}
