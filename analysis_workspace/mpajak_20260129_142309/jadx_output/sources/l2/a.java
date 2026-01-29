package l2;

import i2.a0;
import i2.z;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class a<E> extends z<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final C0045a f3950c = new C0045a();

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f3951a;

    /* renamed from: b, reason: collision with root package name */
    public final z<E> f3952b;

    /* renamed from: l2.a$a, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public class C0045a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
            Type type = aVar.f4569b;
            boolean z4 = type instanceof GenericArrayType;
            if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z4 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(iVar, iVar.e(new o2.a<>(genericComponentType)), k2.a.f(genericComponentType));
        }
    }

    public a(i2.i iVar, z<E> zVar, Class<E> cls) {
        this.f3952b = new p(iVar, zVar, cls);
        this.f3951a = cls;
    }

    @Override // i2.z
    public final Object a(p2.a aVar) {
        if (aVar.N() == 9) {
            aVar.I();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.r()) {
            arrayList.add(this.f3952b.a(aVar));
        }
        aVar.f();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f3951a, size);
        for (int i5 = 0; i5 < size; i5++) {
            Array.set(newInstance, i5, arrayList.get(i5));
        }
        return newInstance;
    }

    @Override // i2.z
    public final void b(p2.b bVar, Object obj) {
        if (obj == null) {
            bVar.q();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            this.f3952b.b(bVar, Array.get(obj, i5));
        }
        bVar.f();
    }
}
