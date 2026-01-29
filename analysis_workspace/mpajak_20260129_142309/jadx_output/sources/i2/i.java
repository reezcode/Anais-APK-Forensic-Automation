package i2;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import k.j0;

/* loaded from: classes22.dex */
public final class i {

    /* renamed from: l, reason: collision with root package name */
    public static final o2.a<?> f3272l = new o2.a<>(Object.class);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<o2.a<?>, a<?>>> f3273a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<o2.a<?>, z<?>> f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.e f3275c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.e f3276d;

    /* renamed from: e, reason: collision with root package name */
    public final List<a0> f3277e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Type, k<?>> f3278f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3279g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3280h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3281i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3282j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3283k;

    /* loaded from: classes15.dex */
    public static class a<T> extends z<T> {

        /* renamed from: a, reason: collision with root package name */
        public z<T> f3284a;

        @Override // i2.z
        public final T a(p2.a aVar) {
            z<T> zVar = this.f3284a;
            if (zVar != null) {
                return zVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // i2.z
        public final void b(p2.b bVar, T t4) {
            z<T> zVar = this.f3284a;
            if (zVar == null) {
                throw new IllegalStateException();
            }
            zVar.b(bVar, t4);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i() {
        /*
            r12 = this;
            k2.m r1 = k2.m.f3823d
            i2.b$a r2 = i2.b.f3262b
            java.util.Map r3 = java.util.Collections.emptyMap()
            i2.v$a r8 = i2.v.f3303b
            java.util.Collections.emptyList()
            java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            i2.w$a r10 = i2.w.f3306b
            i2.w$b r11 = i2.w.f3307c
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.i.<init>():void");
    }

    public i(k2.m mVar, c cVar, Map map, boolean z4, boolean z5, boolean z6, boolean z7, v vVar, List list, x xVar, x xVar2) {
        this.f3273a = new ThreadLocal<>();
        this.f3274b = new ConcurrentHashMap();
        this.f3278f = map;
        k2.e eVar = new k2.e(map, z7);
        this.f3275c = eVar;
        this.f3279g = z4;
        this.f3280h = false;
        this.f3281i = z5;
        this.f3282j = z6;
        this.f3283k = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(l2.q.W);
        arrayList.add(xVar == w.f3306b ? l2.l.f3983c : new l2.k(xVar));
        arrayList.add(mVar);
        arrayList.addAll(list);
        arrayList.add(l2.q.C);
        arrayList.add(l2.q.f4022m);
        arrayList.add(l2.q.f4016g);
        arrayList.add(l2.q.f4018i);
        arrayList.add(l2.q.f4020k);
        z fVar = vVar == v.f3303b ? l2.q.f4029t : new f();
        arrayList.add(new l2.s(Long.TYPE, Long.class, fVar));
        arrayList.add(new l2.s(Double.TYPE, Double.class, new d()));
        arrayList.add(new l2.s(Float.TYPE, Float.class, new e()));
        arrayList.add(xVar2 == w.f3307c ? l2.j.f3980b : new l2.i(new l2.j(xVar2)));
        arrayList.add(l2.q.f4024o);
        arrayList.add(l2.q.f4026q);
        arrayList.add(new l2.r(AtomicLong.class, new y(new g(fVar))));
        arrayList.add(new l2.r(AtomicLongArray.class, new y(new h(fVar))));
        arrayList.add(l2.q.f4028s);
        arrayList.add(l2.q.f4033x);
        arrayList.add(l2.q.E);
        arrayList.add(l2.q.G);
        arrayList.add(new l2.r(BigDecimal.class, l2.q.f4035z));
        arrayList.add(new l2.r(BigInteger.class, l2.q.A));
        arrayList.add(new l2.r(k2.o.class, l2.q.B));
        arrayList.add(l2.q.I);
        arrayList.add(l2.q.K);
        arrayList.add(l2.q.O);
        arrayList.add(l2.q.Q);
        arrayList.add(l2.q.U);
        arrayList.add(l2.q.M);
        arrayList.add(l2.q.f4013d);
        arrayList.add(l2.c.f3956b);
        arrayList.add(l2.q.S);
        if (n2.d.f4512a) {
            arrayList.add(n2.d.f4516e);
            arrayList.add(n2.d.f4515d);
            arrayList.add(n2.d.f4517f);
        }
        arrayList.add(l2.a.f3950c);
        arrayList.add(l2.q.f4011b);
        arrayList.add(new l2.b(eVar));
        arrayList.add(new l2.h(eVar));
        l2.e eVar2 = new l2.e(eVar);
        this.f3276d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(l2.q.X);
        arrayList.add(new l2.n(eVar, cVar, mVar, eVar2));
        this.f3277e = Collections.unmodifiableList(arrayList);
    }

    public static void a(Object obj, p2.a aVar) {
        if (obj != null) {
            try {
                if (aVar.N() == 10) {
                } else {
                    throw new o("JSON document was not fully consumed.");
                }
            } catch (p2.c e5) {
                throw new u(e5);
            } catch (IOException e6) {
                throw new o(e6);
            }
        }
    }

    public static void b(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T c(String str, Type type) {
        if (str == null) {
            return null;
        }
        p2.a aVar = new p2.a(new StringReader(str));
        aVar.f4648c = this.f3283k;
        T t4 = (T) d(aVar, type);
        a(t4, aVar);
        return t4;
    }

    public final <T> T d(p2.a aVar, Type type) {
        boolean z4 = aVar.f4648c;
        boolean z5 = true;
        aVar.f4648c = true;
        try {
            try {
                try {
                    aVar.N();
                    z5 = false;
                    T a5 = e(new o2.a<>(type)).a(aVar);
                    aVar.f4648c = z4;
                    return a5;
                } catch (IOException e5) {
                    throw new u(e5);
                } catch (AssertionError e6) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e6.getMessage());
                    assertionError.initCause(e6);
                    throw assertionError;
                }
            } catch (EOFException e7) {
                if (!z5) {
                    throw new u(e7);
                }
                aVar.f4648c = z4;
                return null;
            } catch (IllegalStateException e8) {
                throw new u(e8);
            }
        } catch (Throwable th) {
            aVar.f4648c = z4;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<o2.a<?>, i2.z<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map<o2.a<?>, i2.z<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final <T> z<T> e(o2.a<T> aVar) {
        z<T> zVar = (z) this.f3274b.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        Map<o2.a<?>, a<?>> map = this.f3273a.get();
        boolean z4 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f3273a.set(map);
            z4 = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<a0> it = this.f3277e.iterator();
            while (it.hasNext()) {
                z<T> a5 = it.next().a(this, aVar);
                if (a5 != null) {
                    if (aVar3.f3284a != null) {
                        throw new AssertionError();
                    }
                    aVar3.f3284a = a5;
                    this.f3274b.put(aVar, a5);
                    return a5;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z4) {
                this.f3273a.remove();
            }
        }
    }

    public final <T> z<T> f(a0 a0Var, o2.a<T> aVar) {
        if (!this.f3277e.contains(a0Var)) {
            a0Var = this.f3276d;
        }
        boolean z4 = false;
        for (a0 a0Var2 : this.f3277e) {
            if (z4) {
                z<T> a5 = a0Var2.a(this, aVar);
                if (a5 != null) {
                    return a5;
                }
            } else if (a0Var2 == a0Var) {
                z4 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final p2.b g(Writer writer) {
        if (this.f3280h) {
            writer.write(")]}'\n");
        }
        p2.b bVar = new p2.b(writer);
        if (this.f3282j) {
            bVar.f4668e = "  ";
            bVar.f4669f = ": ";
        }
        bVar.f4671h = this.f3281i;
        bVar.f4670g = this.f3283k;
        bVar.f4673j = this.f3279g;
        return bVar;
    }

    public final String h(Object obj) {
        if (obj != null) {
            return i(obj, obj.getClass());
        }
        StringWriter stringWriter = new StringWriter();
        try {
            k(g(stringWriter));
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new o(e5);
        }
    }

    public final String i(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            j(obj, type, g(stringWriter));
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new o(e5);
        }
    }

    public final void j(Object obj, Type type, p2.b bVar) {
        z e5 = e(new o2.a(type));
        boolean z4 = bVar.f4670g;
        bVar.f4670g = true;
        boolean z5 = bVar.f4671h;
        bVar.f4671h = this.f3281i;
        boolean z6 = bVar.f4673j;
        bVar.f4673j = this.f3279g;
        try {
            try {
                e5.b(bVar, obj);
            } catch (IOException e6) {
                throw new o(e6);
            } catch (AssertionError e7) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e7.getMessage());
                assertionError.initCause(e7);
                throw assertionError;
            }
        } finally {
            bVar.f4670g = z4;
            bVar.f4671h = z5;
            bVar.f4673j = z6;
        }
    }

    public final void k(p2.b bVar) {
        p pVar = p.f3300a;
        boolean z4 = bVar.f4670g;
        bVar.f4670g = true;
        boolean z5 = bVar.f4671h;
        bVar.f4671h = this.f3281i;
        boolean z6 = bVar.f4673j;
        bVar.f4673j = this.f3279g;
        try {
            try {
                j0.E(pVar, bVar);
            } catch (IOException e5) {
                throw new o(e5);
            } catch (AssertionError e6) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e6.getMessage());
                assertionError.initCause(e6);
                throw assertionError;
            }
        } finally {
            bVar.f4670g = z4;
            bVar.f4671h = z5;
            bVar.f4673j = z6;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f3279g + ",factories:" + this.f3277e + ",instanceCreators:" + this.f3275c + "}";
    }
}
