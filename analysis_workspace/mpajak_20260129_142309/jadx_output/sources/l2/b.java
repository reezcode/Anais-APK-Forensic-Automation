package l2;

import i2.a0;
import i2.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class b implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f3953b;

    /* loaded from: classes5.dex */
    public static final class a<E> extends z<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final z<E> f3954a;

        /* renamed from: b, reason: collision with root package name */
        public final k2.q<? extends Collection<E>> f3955b;

        public a(i2.i iVar, Type type, z<E> zVar, k2.q<? extends Collection<E>> qVar) {
            this.f3954a = new p(iVar, zVar, type);
            this.f3955b = qVar;
        }

        @Override // i2.z
        public final Object a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            Collection<E> c5 = this.f3955b.c();
            aVar.a();
            while (aVar.r()) {
                c5.add(this.f3954a.a(aVar));
            }
            aVar.f();
            return c5;
        }

        @Override // i2.z
        public final void b(p2.b bVar, Object obj) {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.q();
                return;
            }
            bVar.b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f3954a.b(bVar, it.next());
            }
            bVar.f();
        }
    }

    public b(k2.e eVar) {
        this.f3953b = eVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        Type type = aVar.f4569b;
        Class<? super T> cls = aVar.f4568a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type g5 = k2.a.g(type, cls, Collection.class);
        if (g5 instanceof WildcardType) {
            g5 = ((WildcardType) g5).getUpperBounds()[0];
        }
        Class cls2 = g5 instanceof ParameterizedType ? ((ParameterizedType) g5).getActualTypeArguments()[0] : Object.class;
        return new a(iVar, cls2, iVar.e(new o2.a<>(cls2)), this.f3953b.a(aVar));
    }
}
