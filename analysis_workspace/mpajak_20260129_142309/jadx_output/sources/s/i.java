package s;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class i implements s.b {

    /* renamed from: a, reason: collision with root package name */
    public final g<a, Object> f5088a = new g<>();

    /* renamed from: b, reason: collision with root package name */
    public final b f5089b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f5090c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, s.a<?>> f5091d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f5092e;

    /* renamed from: f, reason: collision with root package name */
    public int f5093f;

    /* loaded from: classes9.dex */
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public final b f5094a;

        /* renamed from: b, reason: collision with root package name */
        public int f5095b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f5096c;

        public a(b bVar) {
            this.f5094a = bVar;
        }

        @Override // s.l
        public final void a() {
            this.f5094a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5095b == aVar.f5095b && this.f5096c == aVar.f5096c;
        }

        public final int hashCode() {
            int i5 = this.f5095b * 31;
            Class<?> cls = this.f5096c;
            return i5 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder g5 = androidx.activity.d.g("Key{size=");
            g5.append(this.f5095b);
            g5.append("array=");
            g5.append(this.f5096c);
            g5.append('}');
            return g5.toString();
        }
    }

    public static final class b extends c<a> {
        @Override // s.c
        public final a a() {
            return new a(this);
        }

        public final a d(int i5, Class<?> cls) {
            a b5 = b();
            b5.f5095b = i5;
            b5.f5096c = cls;
            return b5;
        }
    }

    public i(int i5) {
        this.f5092e = i5;
    }

    @Override // s.b
    public final synchronized void a() {
        e(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0040, B:22:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0040, B:22:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: all -> 0x0046, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:12:0x0023, B:16:0x002f, B:17:0x0040, B:22:0x003a), top: B:2:0x0001 }] */
    @Override // s.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized <T> T b(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.h(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L46
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f5093f     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L20
            int r4 = r5.f5092e     // Catch: java.lang.Throwable -> L46
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L46
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L3a
            s.i$b r6 = r5.f5089b     // Catch: java.lang.Throwable -> L46
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L46
            s.i$a r6 = r6.d(r0, r7)     // Catch: java.lang.Throwable -> L46
            goto L40
        L3a:
            s.i$b r0 = r5.f5089b     // Catch: java.lang.Throwable -> L46
            s.i$a r6 = r0.d(r6, r7)     // Catch: java.lang.Throwable -> L46
        L40:
            java.lang.Object r6 = r5.g(r6, r7)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)
            return r6
        L46:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s.i.b(int, java.lang.Class):java.lang.Object");
    }

    @Override // s.b
    public final synchronized Object c() {
        return g(this.f5089b.d(8, byte[].class), byte[].class);
    }

    public final void d(int i5, Class<?> cls) {
        NavigableMap<Integer, Integer> h5 = h(cls);
        Integer num = h5.get(Integer.valueOf(i5));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i5 + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i5);
        if (intValue == 1) {
            h5.remove(valueOf);
        } else {
            h5.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void e(int i5) {
        while (this.f5093f > i5) {
            Object d5 = this.f5088a.d();
            l0.j.b(d5);
            s.a f5 = f(d5.getClass());
            this.f5093f -= f5.c() * f5.b(d5);
            d(f5.b(d5), d5.getClass());
            if (Log.isLoggable(f5.a(), 2)) {
                String a5 = f5.a();
                StringBuilder g5 = androidx.activity.d.g("evicted: ");
                g5.append(f5.b(d5));
                Log.v(a5, g5.toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s.a<?>>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, s.a<?>>] */
    public final <T> s.a<T> f(Class<T> cls) {
        s.a<T> aVar = (s.a) this.f5091d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder g5 = androidx.activity.d.g("No array pool found for: ");
                    g5.append(cls.getSimpleName());
                    throw new IllegalArgumentException(g5.toString());
                }
                aVar = new f();
            }
            this.f5091d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T g(a aVar, Class<T> cls) {
        s.a<T> f5 = f(cls);
        T t4 = (T) this.f5088a.a(aVar);
        if (t4 != null) {
            this.f5093f -= f5.c() * f5.b(t4);
            d(f5.b(t4), cls);
        }
        if (t4 != null) {
            return t4;
        }
        if (Log.isLoggable(f5.a(), 2)) {
            String a5 = f5.a();
            StringBuilder g5 = androidx.activity.d.g("Allocated ");
            g5.append(aVar.f5095b);
            g5.append(" bytes");
            Log.v(a5, g5.toString());
        }
        return f5.newArray(aVar.f5095b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    public final NavigableMap<Integer, Integer> h(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f5090c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5090c.put(cls, treeMap);
        return treeMap;
    }

    @Override // s.b
    public final synchronized <T> void put(T t4) {
        Class<?> cls = t4.getClass();
        s.a<T> f5 = f(cls);
        int b5 = f5.b(t4);
        int c5 = f5.c() * b5;
        int i5 = 1;
        if (c5 <= this.f5092e / 2) {
            a d5 = this.f5089b.d(b5, cls);
            this.f5088a.b(d5, t4);
            NavigableMap<Integer, Integer> h5 = h(cls);
            Integer num = h5.get(Integer.valueOf(d5.f5095b));
            Integer valueOf = Integer.valueOf(d5.f5095b);
            if (num != null) {
                i5 = 1 + num.intValue();
            }
            h5.put(valueOf, Integer.valueOf(i5));
            this.f5093f += c5;
            e(this.f5092e);
        }
    }

    @Override // s.b
    public final synchronized void trimMemory(int i5) {
        try {
            if (i5 >= 40) {
                synchronized (this) {
                    e(0);
                }
            } else if (i5 >= 20 || i5 == 15) {
                e(this.f5092e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
