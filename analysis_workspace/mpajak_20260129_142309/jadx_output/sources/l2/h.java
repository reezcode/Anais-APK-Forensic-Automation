package l2;

import i2.a0;
import i2.z;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import k.j0;

/* loaded from: classes5.dex */
public final class h implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f3973b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3974c = false;

    /* loaded from: classes24.dex */
    public final class a<K, V> extends z<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final z<K> f3975a;

        /* renamed from: b, reason: collision with root package name */
        public final z<V> f3976b;

        /* renamed from: c, reason: collision with root package name */
        public final k2.q<? extends Map<K, V>> f3977c;

        public a(i2.i iVar, Type type, z<K> zVar, Type type2, z<V> zVar2, k2.q<? extends Map<K, V>> qVar) {
            this.f3975a = new p(iVar, zVar, type);
            this.f3976b = new p(iVar, zVar2, type2);
            this.f3977c = qVar;
        }

        @Override // i2.z
        public final Object a(p2.a aVar) {
            int i5;
            int N = aVar.N();
            if (N == 9) {
                aVar.I();
                return null;
            }
            Map<K, V> c5 = this.f3977c.c();
            if (N == 1) {
                aVar.a();
                while (aVar.r()) {
                    aVar.a();
                    K a5 = this.f3975a.a(aVar);
                    if (c5.put(a5, this.f3976b.a(aVar)) != null) {
                        throw new i2.u(androidx.appcompat.widget.a.i("duplicate key: ", a5));
                    }
                    aVar.f();
                }
                aVar.f();
            } else {
                aVar.b();
                while (aVar.r()) {
                    Objects.requireNonNull(d1.f.f2481a);
                    if (aVar instanceof f) {
                        f fVar = (f) aVar;
                        fVar.W(5);
                        Map.Entry entry = (Map.Entry) ((Iterator) fVar.Y()).next();
                        fVar.a0(entry.getValue());
                        fVar.a0(new i2.s((String) entry.getKey()));
                    } else {
                        int i6 = aVar.f4654i;
                        if (i6 == 0) {
                            i6 = aVar.e();
                        }
                        if (i6 == 13) {
                            aVar.f4654i = 9;
                        } else {
                            if (i6 == 12) {
                                i5 = 8;
                            } else {
                                if (i6 != 14) {
                                    StringBuilder g5 = androidx.activity.d.g("Expected a name but was ");
                                    g5.append(androidx.activity.result.a.j(aVar.N()));
                                    g5.append(aVar.w());
                                    throw new IllegalStateException(g5.toString());
                                }
                                i5 = 10;
                            }
                            aVar.f4654i = i5;
                        }
                    }
                    K a6 = this.f3975a.a(aVar);
                    if (c5.put(a6, this.f3976b.a(aVar)) != null) {
                        throw new i2.u(androidx.appcompat.widget.a.i("duplicate key: ", a6));
                    }
                }
                aVar.l();
            }
            return c5;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList, java.util.List<i2.n>] */
        @Override // i2.z
        public final void b(p2.b bVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                bVar.q();
                return;
            }
            if (h.this.f3974c) {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i5 = 0;
                boolean z4 = false;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    z<K> zVar = this.f3975a;
                    K key = entry.getKey();
                    Objects.requireNonNull(zVar);
                    try {
                        g gVar = new g();
                        zVar.b(gVar, key);
                        if (!gVar.f3970n.isEmpty()) {
                            throw new IllegalStateException("Expected one JSON element but was " + gVar.f3970n);
                        }
                        i2.n nVar = gVar.f3972p;
                        arrayList.add(nVar);
                        arrayList2.add(entry.getValue());
                        Objects.requireNonNull(nVar);
                        z4 |= (nVar instanceof i2.l) || (nVar instanceof i2.q);
                    } catch (IOException e5) {
                        throw new i2.o(e5);
                    }
                }
                if (z4) {
                    bVar.b();
                    int size = arrayList.size();
                    while (i5 < size) {
                        bVar.b();
                        j0.E((i2.n) arrayList.get(i5), bVar);
                        this.f3976b.b(bVar, arrayList2.get(i5));
                        bVar.f();
                        i5++;
                    }
                    bVar.f();
                    return;
                }
                bVar.c();
                int size2 = arrayList.size();
                while (i5 < size2) {
                    i2.n nVar2 = (i2.n) arrayList.get(i5);
                    Objects.requireNonNull(nVar2);
                    if (nVar2 instanceof i2.s) {
                        i2.s l5 = nVar2.l();
                        Serializable serializable = l5.f3302a;
                        if (serializable instanceof Number) {
                            str = String.valueOf(l5.s());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(l5.r());
                        } else {
                            if (!(serializable instanceof String)) {
                                throw new AssertionError();
                            }
                            str = l5.t();
                        }
                    } else {
                        if (!(nVar2 instanceof i2.p)) {
                            throw new AssertionError();
                        }
                        str = "null";
                    }
                    bVar.n(str);
                    this.f3976b.b(bVar, arrayList2.get(i5));
                    i5++;
                }
            } else {
                bVar.c();
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    bVar.n(String.valueOf(entry2.getKey()));
                    this.f3976b.b(bVar, entry2.getValue());
                }
            }
            bVar.l();
        }
    }

    public h(k2.e eVar) {
        this.f3973b = eVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f4569b;
        if (!Map.class.isAssignableFrom(aVar.f4568a)) {
            return null;
        }
        Class<?> f5 = k2.a.f(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type g5 = k2.a.g(type, f5, Map.class);
            actualTypeArguments = g5 instanceof ParameterizedType ? ((ParameterizedType) g5).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new a(iVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? q.f4015f : iVar.e(new o2.a<>(type2)), actualTypeArguments[1], iVar.e(new o2.a<>(actualTypeArguments[1])), this.f3973b.a(aVar));
    }
}
