package m;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes18.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f4102a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f4103b;

    /* renamed from: c, reason: collision with root package name */
    public final Constructor<?> f4104c;

    /* renamed from: d, reason: collision with root package name */
    public final Constructor<?> f4105d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4106e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f4107f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4108g;

    /* renamed from: h, reason: collision with root package name */
    public final c[] f4109h;

    /* renamed from: i, reason: collision with root package name */
    public final c[] f4110i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4111j;

    /* renamed from: k, reason: collision with root package name */
    public final g.d f4112k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4113l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4114m;

    /* renamed from: n, reason: collision with root package name */
    public String[] f4115n;

    /* renamed from: o, reason: collision with root package name */
    public Type[] f4116o;

    /* renamed from: p, reason: collision with root package name */
    public String[] f4117p;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.Class<?> r8, java.lang.Class<?> r9, java.lang.reflect.Constructor<?> r10, java.lang.reflect.Constructor<?> r11, java.lang.reflect.Method r12, java.lang.reflect.Method r13, g.d r14, java.util.List<m.c> r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g.<init>(java.lang.Class, java.lang.Class, java.lang.reflect.Constructor, java.lang.reflect.Constructor, java.lang.reflect.Method, java.lang.reflect.Method, g.d, java.util.List):void");
    }

    public static boolean a(List<c> list, c cVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar2 = list.get(size);
            if (cVar2.f4061b.equals(cVar.f4061b) && (!cVar2.f4068i || cVar.f4068i)) {
                if (!cVar2.f4065f.isAssignableFrom(cVar.f4065f) && cVar2.compareTo(cVar) >= 0) {
                    return false;
                }
                list.remove(size);
                list.add(cVar);
                return true;
            }
        }
        list.add(cVar);
        return true;
    }

    public static g b(Class cls, Type type) {
        boolean z4 = j.f4122a;
        return c(cls, type, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x07e9, code lost:
    
        if (java.lang.Character.isUpperCase(r3.charAt(4)) != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x09b8, code lost:
    
        if (r1.deserialize() == false) goto L459;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0899  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m.g c(java.lang.Class r41, java.lang.reflect.Type r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 2628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g.c(java.lang.Class, java.lang.reflect.Type, boolean):m.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if ((java.util.Map.class.isAssignableFrom(r5) || java.util.Collection.class.isAssignableFrom(r5) || java.util.concurrent.atomic.AtomicLong.class.equals(r5) || java.util.concurrent.atomic.AtomicInteger.class.equals(r5) || java.util.concurrent.atomic.AtomicBoolean.class.equals(r5)) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.Class<?> r18, java.lang.reflect.Type r19, f.m r20, java.util.List<m.c> r21, java.lang.reflect.Field[] r22) {
        /*
            r0 = r20
            r1 = r22
            int r2 = r1.length
            r4 = 0
        L6:
            if (r4 >= r2) goto Ld2
            r8 = r1[r4]
            int r5 = r8.getModifiers()
            r6 = r5 & 8
            if (r6 == 0) goto L14
            goto L82
        L14:
            r5 = r5 & 16
            r6 = 1
            if (r5 == 0) goto L4c
            java.lang.Class r5 = r8.getType()
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r7 = r7.isAssignableFrom(r5)
            if (r7 != 0) goto L48
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            boolean r7 = r7.isAssignableFrom(r5)
            if (r7 != 0) goto L48
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r7 = java.util.concurrent.atomic.AtomicLong.class
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L48
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r7 = java.util.concurrent.atomic.AtomicInteger.class
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L48
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L46
            goto L48
        L46:
            r5 = 0
            goto L49
        L48:
            r5 = 1
        L49:
            if (r5 != 0) goto L4c
            goto L82
        L4c:
            java.util.Iterator r5 = r21.iterator()
        L50:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r5.next()
            m.c r7 = (m.c) r7
            java.lang.String r7 = r7.f4061b
            java.lang.String r9 = r8.getName()
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L50
            goto L6a
        L69:
            r6 = 0
        L6a:
            if (r6 == 0) goto L6d
            goto L82
        L6d:
            java.lang.String r5 = r8.getName()
            java.lang.Class<g.b> r6 = g.b.class
            java.lang.annotation.Annotation r6 = r8.getAnnotation(r6)
            r15 = r6
            g.b r15 = (g.b) r15
            if (r15 == 0) goto Lab
            boolean r6 = r15.deserialize()
            if (r6 != 0) goto L85
        L82:
            r5 = r21
            goto Lce
        L85:
            int r6 = r15.ordinal()
            k.b1[] r7 = r15.serialzeFeatures()
            int r7 = k.b1.b(r7)
            i.b[] r9 = r15.parseFeatures()
            int r9 = i.b.a(r9)
            java.lang.String r10 = r15.name()
            int r10 = r10.length()
            if (r10 == 0) goto La7
            java.lang.String r5 = r15.name()
        La7:
            r11 = r6
            r12 = r7
            r13 = r9
            goto Lae
        Lab:
            r11 = 0
            r12 = 0
            r13 = 0
        Lae:
            if (r0 == 0) goto Lb4
            java.lang.String r5 = r0.a(r5)
        Lb4:
            r6 = r5
            m.c r14 = new m.c
            r7 = 0
            r16 = 0
            r17 = 0
            r5 = r14
            r9 = r18
            r10 = r19
            r3 = r14
            r14 = r16
            r16 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = r21
            a(r5, r3)
        Lce:
            int r4 = r4 + 1
            goto L6
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.g.d(java.lang.Class, java.lang.reflect.Type, f.m, java.util.List, java.lang.reflect.Field[]):void");
    }

    public static Class<?> e(Class<?> cls, g.d dVar) {
        Class<?> builder;
        if (cls != null && cls.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest")) {
            return j.O("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder");
        }
        if (dVar == null || (builder = dVar.builder()) == Void.class) {
            return null;
        }
        return builder;
    }

    public static Constructor<?> f(Class<?> cls, Constructor<?>[] constructorArr) {
        Constructor<?> constructor = null;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        int length = constructorArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            Constructor<?> constructor2 = constructorArr[i5];
            if (constructor2.getParameterTypes().length == 0) {
                constructor = constructor2;
                break;
            }
            i5++;
        }
        if (constructor != null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return constructor;
        }
        for (Constructor<?> constructor3 : constructorArr) {
            Class<?>[] parameterTypes = constructor3.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                return constructor3;
            }
        }
        return constructor;
    }
}
