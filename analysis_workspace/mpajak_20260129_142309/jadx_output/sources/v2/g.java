package v2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import t2.k;
import t2.m;
import w2.o;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: u, reason: collision with root package name */
    public static final ThreadLocal<b> f5676u = new a();

    /* renamed from: a, reason: collision with root package name */
    public final c3.c f5677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5678b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5679c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5680d;

    /* renamed from: e, reason: collision with root package name */
    public final e f5681e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5682f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5683g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5684h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f5685i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f5686j;

    /* renamed from: k, reason: collision with root package name */
    public final Class<?> f5687k;

    /* renamed from: l, reason: collision with root package name */
    public v2.a f5688l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5689m;

    /* renamed from: n, reason: collision with root package name */
    public Object f5690n;

    /* renamed from: o, reason: collision with root package name */
    public f f5691o;

    /* renamed from: p, reason: collision with root package name */
    public g f5692p;

    /* renamed from: q, reason: collision with root package name */
    public d3.c<?, ?> f5693q;

    /* renamed from: r, reason: collision with root package name */
    public g f5694r;

    /* renamed from: s, reason: collision with root package name */
    public t2.a<?, ?> f5695s;

    /* renamed from: t, reason: collision with root package name */
    public a3.f<Object, Object> f5696t;

    /* loaded from: classes21.dex */
    public static class a extends ThreadLocal<b> {
        @Override // java.lang.ThreadLocal
        public final b initialValue() {
            return new b();
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f5697a;

        /* renamed from: b, reason: collision with root package name */
        public int f5698b;

        /* renamed from: c, reason: collision with root package name */
        public int f5699c;

        /* renamed from: d, reason: collision with root package name */
        public int f5700d;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ba A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(c3.c r9, java.lang.String r10, java.lang.reflect.Field r11, v2.e r12, java.lang.Class<?> r13) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.g.<init>(c3.c, java.lang.String, java.lang.reflect.Field, v2.e, java.lang.Class):void");
    }

    public final void a(u2.c cVar, v2.a aVar) {
        f fVar;
        Object x4;
        this.f5688l = aVar;
        if (aVar == null) {
            e eVar = this.f5681e;
            if (eVar.f5660k || eVar.F) {
                return;
            }
            throw new SQLException("Data persister for field " + this + " is null but the field is not a foreign or foreignCollection");
        }
        Objects.requireNonNull((u2.d) cVar);
        if (f.h.a(aVar.s()) != 2) {
            int a5 = f.h.a(aVar.s());
            fVar = a5 != 3 ? a5 != 14 ? aVar : w2.e.f5763d : u2.b.f5467a;
        } else {
            o oVar = o.f5780e;
            fVar = o.f5780e;
        }
        this.f5691o = fVar;
        if (this.f5683g && !aVar.w()) {
            StringBuilder g5 = androidx.activity.d.g("Generated-id field '");
            g5.append(this.f5679c.getName());
            g5.append("' in ");
            g5.append(this.f5679c.getDeclaringClass().getSimpleName());
            g5.append(" can't be type ");
            g5.append(androidx.appcompat.view.a.j(this.f5688l.s()));
            g5.append(".  Must be one of: ");
            for (c cVar2 : c.values()) {
                v2.a aVar2 = cVar2.f5649b;
                if (aVar2 != null && aVar2.w()) {
                    g5.append(cVar2);
                    g5.append(' ');
                }
            }
            throw new IllegalArgumentException(g5.toString());
        }
        if (this.f5681e.f5663n && !aVar.t()) {
            StringBuilder g6 = androidx.activity.d.g("Field ");
            g6.append(this.f5679c.getName());
            g6.append(" must be a primitive if set with throwIfNull");
            throw new SQLException(g6.toString());
        }
        if (this.f5682f && !aVar.r()) {
            StringBuilder g7 = androidx.activity.d.g("Field '");
            g7.append(this.f5679c.getName());
            g7.append("' is of data type ");
            g7.append(aVar);
            g7.append(" which cannot be the ID field");
            throw new SQLException(g7.toString());
        }
        this.f5690n = aVar.f(this);
        String str = this.f5681e.f5654e;
        if (str == null) {
            x4 = null;
        } else {
            if (this.f5683g) {
                StringBuilder g8 = androidx.activity.d.g("Field '");
                g8.append(this.f5679c.getName());
                g8.append("' cannot be a generatedId and have a default value '");
                g8.append(str);
                g8.append("'");
                throw new SQLException(g8.toString());
            }
            x4 = this.f5691o.x(this, str);
        }
        this.f5689m = x4;
    }

    public final void b(Object obj, Object obj2, boolean z4, m mVar) {
        if (this.f5692p != null && obj2 != null) {
            Object e5 = e(obj);
            if (e5 != null && e5.equals(obj2)) {
                return;
            }
            Objects.requireNonNull(this.f5695s);
            if (!z4) {
                ThreadLocal<b> threadLocal = f5676u;
                b bVar = threadLocal.get();
                int i5 = bVar.f5697a;
                if (i5 == 0) {
                    bVar.f5698b = this.f5681e.f5673x;
                }
                if (i5 >= bVar.f5698b) {
                    Object a5 = this.f5693q.a();
                    this.f5692p.b(a5, obj2, false, mVar);
                    obj2 = a5;
                } else {
                    if (this.f5696t == null) {
                        this.f5696t = a3.f.f(((q2.b) this.f5677a).f4739d, this.f5695s.f5428g, this.f5692p);
                    }
                    bVar.f5697a++;
                    try {
                        try {
                            obj2 = this.f5696t.g(((q2.b) this.f5677a).c(), obj2, mVar);
                            int i6 = bVar.f5697a - 1;
                            bVar.f5697a = i6;
                            if (i6 <= 0) {
                                threadLocal.remove();
                            }
                        } finally {
                            Objects.requireNonNull(this.f5677a);
                        }
                    } catch (Throwable th) {
                        int i7 = bVar.f5697a - 1;
                        bVar.f5697a = i7;
                        if (i7 <= 0) {
                            f5676u.remove();
                        }
                        throw th;
                    }
                }
            }
        }
        Method method = this.f5686j;
        if (method != null) {
            try {
                method.invoke(obj, obj2);
                return;
            } catch (Exception e6) {
                StringBuilder g5 = androidx.activity.d.g("Could not call ");
                g5.append(this.f5686j);
                g5.append(" on object with '");
                g5.append(obj2);
                g5.append("' for ");
                g5.append(this);
                throw d1.c.e(g5.toString(), e6);
            }
        }
        try {
            this.f5679c.set(obj, obj2);
        } catch (IllegalAccessException e7) {
            throw d1.c.e("Could not assign object '" + obj2 + "' to field " + this, e7);
        } catch (IllegalArgumentException e8) {
            throw d1.c.e("Could not assign object '" + obj2 + "' to field " + this, e8);
        }
    }

    public final void c(c3.c cVar, Class<?> cls) {
        t2.a<?, ?> aVar;
        d3.c<?, ?> cVar2;
        g b5;
        g gVar;
        Class<?> type = this.f5679c.getType();
        u2.d dVar = ((q2.b) cVar).f4739d;
        e eVar = this.f5681e;
        String str = eVar.D;
        a3.f<Object, Object> fVar = null;
        if (eVar.f5672w || str != null) {
            aVar = (t2.a) t2.h.a(cVar, type);
            cVar2 = aVar.f5428g;
            if (str == null) {
                b5 = cVar2.f2498f;
                if (b5 == null) {
                    throw new IllegalArgumentException("Foreign field " + type + " does not have id field");
                }
            } else {
                b5 = cVar2.b(str);
            }
            gVar = null;
            fVar = a3.f.f(dVar, cVar2, b5);
        } else if (eVar.f5660k) {
            v2.a aVar2 = this.f5688l;
            if (aVar2 != null && aVar2.t()) {
                throw new IllegalArgumentException("Field " + this + " is a primitive class " + type + " but marked as foreign");
            }
            Objects.requireNonNull(this.f5681e);
            aVar = (t2.a) t2.h.a(cVar, type);
            cVar2 = aVar.f5428g;
            g gVar2 = cVar2.f2498f;
            if (gVar2 == null) {
                throw new IllegalArgumentException("Foreign field " + type + " does not have id field");
            }
            if (this.f5681e.B && !gVar2.f5683g) {
                StringBuilder g5 = androidx.activity.d.g("Field ");
                g5.append(this.f5679c.getName());
                g5.append(", if foreignAutoCreate = true then class ");
                g5.append(type.getSimpleName());
                g5.append(" must have id field with generatedId = true");
                throw new IllegalArgumentException(g5.toString());
            }
            b5 = gVar2;
            gVar = null;
        } else {
            if (eVar.F) {
                if (type != Collection.class && !k.class.isAssignableFrom(type)) {
                    StringBuilder g6 = androidx.activity.d.g("Field class for '");
                    g6.append(this.f5679c.getName());
                    g6.append("' must be of class ");
                    g6.append(k.class.getSimpleName());
                    g6.append(" or Collection.");
                    throw new SQLException(g6.toString());
                }
                Type genericType = this.f5679c.getGenericType();
                if (!(genericType instanceof ParameterizedType)) {
                    StringBuilder g7 = androidx.activity.d.g("Field class for '");
                    g7.append(this.f5679c.getName());
                    g7.append("' must be a parameterized Collection.");
                    throw new SQLException(g7.toString());
                }
                Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                if (actualTypeArguments.length == 0) {
                    StringBuilder g8 = androidx.activity.d.g("Field class for '");
                    g8.append(this.f5679c.getName());
                    g8.append("' must be a parameterized Collection with at least 1 type.");
                    throw new SQLException(g8.toString());
                }
                if (!(actualTypeArguments[0] instanceof Class)) {
                    StringBuilder g9 = androidx.activity.d.g("Field class for '");
                    g9.append(this.f5679c.getName());
                    g9.append("' must be a parameterized Collection whose generic argument is an entity class not: ");
                    g9.append(actualTypeArguments[0]);
                    throw new SQLException(g9.toString());
                }
                Class cls2 = (Class) actualTypeArguments[0];
                Objects.requireNonNull(this.f5681e);
                aVar = (t2.a) t2.h.a(cVar, cls2);
                String str2 = this.f5681e.K;
                g[] gVarArr = aVar.f5428g.f2496d;
                int length = gVarArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    gVar = gVarArr[i5];
                    if (gVar.j() == cls && (str2 == null || gVar.f5679c.getName().equals(str2))) {
                        e eVar2 = gVar.f5681e;
                        if (!eVar2.f5660k && !eVar2.f5672w) {
                            throw new SQLException("Foreign collection object " + cls2 + " for field '" + this.f5679c.getName() + "' contains a field of class " + cls + " but it's not foreign");
                        }
                        cVar2 = null;
                        b5 = null;
                    }
                }
                StringBuilder g10 = androidx.activity.d.g("Foreign collection class ");
                g10.append(cls2.getName());
                g10.append(" for field '");
                g10.append(this.f5679c.getName());
                g10.append("' column-name does not contain a foreign field");
                if (str2 != null) {
                    g10.append(" named '");
                    g10.append(str2);
                    g10.append('\'');
                }
                g10.append(" of class ");
                g10.append(cls.getName());
                throw new SQLException(g10.toString());
            }
            aVar = null;
            cVar2 = null;
            b5 = null;
            gVar = null;
        }
        this.f5696t = fVar;
        this.f5693q = cVar2;
        this.f5694r = gVar;
        this.f5695s = aVar;
        this.f5692p = b5;
        if (b5 != null) {
            a(dVar, b5.f5688l);
        }
    }

    public final Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f5691o.e(this, obj);
    }

    public final Object e(Object obj) {
        Object f5 = f(obj);
        g gVar = this.f5692p;
        return (gVar == null || f5 == null) ? f5 : gVar.f(f5);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != g.class) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f5679c.equals(gVar.f5679c)) {
            return false;
        }
        Class<?> cls = this.f5687k;
        Class<?> cls2 = gVar.f5687k;
        if (cls == null) {
            if (cls2 != null) {
                return false;
            }
        } else if (!cls.equals(cls2)) {
            return false;
        }
        return true;
    }

    public final <FV> FV f(Object obj) {
        Method method = this.f5685i;
        if (method == null) {
            try {
                return (FV) this.f5679c.get(obj);
            } catch (Exception e5) {
                throw d1.c.e("Could not get field value for " + this, e5);
            }
        }
        try {
            return (FV) method.invoke(obj, new Object[0]);
        } catch (Exception e6) {
            StringBuilder g5 = androidx.activity.d.g("Could not call ");
            g5.append(this.f5685i);
            g5.append(" for ");
            g5.append(this);
            throw d1.c.e(g5.toString(), e6);
        }
    }

    public final String g() {
        return this.f5679c.getName();
    }

    public final String h() {
        e eVar = this.f5681e;
        String str = this.f5678b;
        if (eVar.f5668s && eVar.f5669t == null) {
            eVar.f5669t = eVar.b(str);
        }
        return eVar.f5669t;
    }

    public final int hashCode() {
        return this.f5679c.hashCode();
    }

    public final int i() {
        return this.f5691o.s();
    }

    public final Class<?> j() {
        return this.f5679c.getType();
    }

    public final String k() {
        e eVar = this.f5681e;
        String str = this.f5678b;
        if (eVar.f5670u && eVar.f5671v == null) {
            eVar.f5671v = eVar.b(str);
        }
        return eVar.f5671v;
    }

    public final boolean l(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj.equals(this.f5679c.getType() == Boolean.TYPE ? Boolean.FALSE : (this.f5679c.getType() == Byte.TYPE || this.f5679c.getType() == Byte.class) ? (byte) 0 : (this.f5679c.getType() == Character.TYPE || this.f5679c.getType() == Character.class) ? (char) 0 : (this.f5679c.getType() == Short.TYPE || this.f5679c.getType() == Short.class) ? (short) 0 : (this.f5679c.getType() == Integer.TYPE || this.f5679c.getType() == Integer.class) ? 0 : (this.f5679c.getType() == Long.TYPE || this.f5679c.getType() == Long.class) ? 0L : (this.f5679c.getType() == Float.TYPE || this.f5679c.getType() == Float.class) ? Float.valueOf(0.0f) : (this.f5679c.getType() == Double.TYPE || this.f5679c.getType() == Double.class) ? Double.valueOf(0.0d) : null);
    }

    public final boolean m() {
        return this.f5684h != null;
    }

    public final boolean n() {
        return this.f5688l.k();
    }

    public final <T> T o(c3.e eVar, Map<String, Integer> map) {
        Integer num = map.get(this.f5680d);
        if (num == null) {
            String str = this.f5680d;
            q2.d dVar = (q2.d) eVar;
            int f5 = dVar.f(str);
            if (f5 < 0) {
                StringBuilder sb = new StringBuilder(str.length() + 4);
                sb.append('`');
                sb.append(str);
                sb.append('`');
                f5 = dVar.f(sb.toString());
                if (f5 < 0) {
                    String[] columnNames = dVar.f4744a.getColumnNames();
                    StringBuilder f6 = androidx.activity.result.a.f("Unknown field '", str, "' from the Android sqlite cursor, not in:");
                    f6.append(Arrays.toString(columnNames));
                    throw new SQLException(f6.toString());
                }
            }
            num = Integer.valueOf(f5);
            map.put(this.f5680d, num);
        }
        T t4 = (T) this.f5691o.v(this, eVar, num.intValue());
        if (this.f5681e.f5660k) {
            if (((q2.d) eVar).h(num.intValue())) {
                return null;
            }
        } else if (this.f5688l.t()) {
            if (this.f5681e.f5663n) {
                if (((q2.d) eVar).h(num.intValue())) {
                    StringBuilder g5 = androidx.activity.d.g("Results value for primitive field '");
                    g5.append(this.f5679c.getName());
                    g5.append("' was an invalid null value");
                    throw new SQLException(g5.toString());
                }
            }
        } else if (!this.f5691o.c()) {
            if (((q2.d) eVar).h(num.intValue())) {
                return null;
            }
        }
        return t4;
    }

    public final String toString() {
        return g.class.getSimpleName() + ":name=" + this.f5679c.getName() + ",class=" + this.f5679c.getDeclaringClass().getSimpleName();
    }
}
