package m;

import f.k;
import f.l;
import f.n;
import j.s;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.Map;
import k.a1;
import k.b1;
import k.e1;
import k.g0;
import k.h0;
import k.i0;
import k.j0;
import k.o0;
import k.q0;
import k.s0;
import k.t;
import k.t0;
import k.u;
import k.v0;
import k.w0;
import k.x0;
import k.y0;
import k.z0;

/* loaded from: classes6.dex */
public final class a extends ClassLoader {

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, Class<?>> f4059b = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public static ProtectionDomain f4058a = (ProtectionDomain) AccessController.doPrivileged(new C0048a());

    /* renamed from: m.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static class C0048a implements PrivilegedAction<Object> {
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return a.class.getProtectionDomain();
        }
    }

    /* JADX WARN: Type inference failed for: r4v55, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    static {
        Class[] clsArr = {f.a.class, f.e.class, f.b.class, f.g.class, f.c.class, f.d.class, f.i.class, f.j.class, k.class, l.class, n.class, c.class, j.class, e.class, f.class, h.class, g.class, q0.class, h0.class, z0.class, w0.class, g0.class, a1.class, y0.class, j0.class, i0.class, u.class, k.c.class, k.k.class, o0.class, s0.class, t0.class, e1.class, b1.class, t.class, v0.class, x0.class, j.n.class, i.i.class, i.a.class, i.c.class, i.d.class, i.h.class, i.g.class, i.j.class, i.b.class, i.f.class, i.e.class, j.d.class, s.class, j.i.class, j.h.class, j.j.class, k.j.class, j.k.class, j.f.class};
        for (int i5 = 0; i5 < 56; i5++) {
            Class cls = clsArr[i5];
            f4059b.put(cls.getName(), cls);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r3 = this;
            java.lang.Class<f.a> r0 = f.a.class
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
            if (r1 == 0) goto L14
            java.lang.String r2 = r0.getName()     // Catch: java.lang.ClassNotFoundException -> L14
            r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L14
            goto L18
        L14:
            java.lang.ClassLoader r1 = r0.getClassLoader()
        L18:
            r3.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.<init>():void");
    }

    public final Class a(String str, byte[] bArr, int i5) {
        return defineClass(str, bArr, 0, i5, f4058a);
    }

    public final boolean b(Class<?> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        for (ClassLoader classLoader2 = this; classLoader2 != null; classLoader2 = classLoader2.getParent()) {
            if (classLoader2 == classLoader) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z4) {
        Class<?> cls = (Class) f4059b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return super.loadClass(str, z4);
        } catch (ClassNotFoundException e5) {
            throw e5;
        }
    }
}
