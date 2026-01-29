package j;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class o implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3387a = new o();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        if (!(type instanceof GenericArrayType)) {
            return (!(type instanceof Class) || type == Object.class || type == Serializable.class) ? (T) aVar.w(obj) : (T) aVar.A(type, null);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof TypeVariable) {
            genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
        }
        ArrayList arrayList = new ArrayList();
        aVar.x(genericComponentType, arrayList, null);
        if (!(genericComponentType instanceof Class)) {
            return (T) arrayList.toArray();
        }
        T t4 = (T) ((Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size()));
        arrayList.toArray((Object[]) t4);
        return t4;
    }

    @Override // j.s
    public final int e() {
        return 12;
    }
}
