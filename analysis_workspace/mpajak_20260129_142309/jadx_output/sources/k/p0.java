package k;

import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes24.dex */
public final class p0 implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f3738a = new p0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, byte[]] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        Class<?> cls;
        Type type2;
        i.c cVar = aVar.f3146g;
        int q4 = cVar.q();
        Type type3 = null;
        if (q4 == 8) {
            cVar.Q(16);
            return null;
        }
        if (q4 == 4 || q4 == 26) {
            ?? r8 = (T) cVar.a0();
            cVar.Q(16);
            if (r8.length != 0 || type == byte[].class) {
                return r8;
            }
            return null;
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) genericComponentType;
                Type type4 = aVar.f3147h.f3224d;
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type rawType = parameterizedType.getRawType();
                    if (rawType instanceof Class) {
                        TypeVariable<Class<T>>[] typeParameters = ((Class) rawType).getTypeParameters();
                        for (int i5 = 0; i5 < typeParameters.length; i5++) {
                            if (typeParameters[i5].getName().equals(typeVariable.getName())) {
                                type3 = parameterizedType.getActualTypeArguments()[i5];
                            }
                        }
                    }
                    if (type3 instanceof Class) {
                        cls = (Class) type3;
                        type2 = genericComponentType;
                    } else {
                        cls = Object.class;
                        type2 = genericComponentType;
                    }
                } else {
                    cls = m.j.w(typeVariable.getBounds()[0]);
                    type2 = genericComponentType;
                }
            } else {
                cls = m.j.w(genericComponentType);
                type2 = genericComponentType;
            }
        } else {
            Class<?> componentType = ((Class) type).getComponentType();
            cls = componentType;
            type2 = componentType;
        }
        f.b bVar = new f.b();
        aVar.x(type2, bVar, obj);
        return (T) f(aVar, cls, bVar);
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            a1Var.I(b1.WriteNullListAsEmpty);
            return;
        }
        int length = objArr.length;
        int i6 = length - 1;
        if (i6 == -1) {
            a1Var.a("[]");
            return;
        }
        v0 v0Var = g0Var.f3694o;
        g0Var.o(v0Var, obj, obj2);
        try {
            a1Var.write(91);
            if (a1Var.l(b1.PrettyFormat)) {
                g0Var.l();
                g0Var.n();
                for (int i7 = 0; i7 < length; i7++) {
                    if (i7 != 0) {
                        a1Var.write(44);
                        g0Var.n();
                    }
                    g0Var.q(objArr[i7]);
                }
                g0Var.j();
                g0Var.n();
                a1Var.write(93);
                return;
            }
            Class<?> cls = null;
            q0 q0Var = null;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj3 = objArr[i8];
                if (obj3 == null) {
                    a1Var.a("null,");
                } else {
                    if (g0Var.i(obj3)) {
                        g0Var.t(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            q0Var.d(g0Var, obj3, null, null, 0);
                        } else {
                            q0Var = g0Var.k(cls2);
                            q0Var.d(g0Var, obj3, null, null, 0);
                            cls = cls2;
                        }
                    }
                    a1Var.write(44);
                }
            }
            Object obj4 = objArr[i6];
            if (obj4 == null) {
                a1Var.a("null]");
            } else {
                if (g0Var.i(obj4)) {
                    g0Var.t(obj4);
                } else {
                    try {
                        g0Var.k(obj4.getClass()).d(g0Var, obj4, Integer.valueOf(i6), null, 0);
                    } catch (IOException e5) {
                        throw new f.d(e5.getMessage(), e5);
                    }
                }
                a1Var.write(93);
            }
        } finally {
            g0Var.f3694o = v0Var;
        }
    }

    @Override // j.s
    public final int e() {
        return 14;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T f(i.a r12, java.lang.Class<?> r13, f.b r14) {
        /*
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.size()
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r13, r1)
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r1) goto L63
            java.lang.Object r5 = r14.get(r4)
            if (r5 != r14) goto L1a
            java.lang.reflect.Array.set(r2, r4, r2)
            goto L60
        L1a:
            boolean r6 = r13.isArray()
            if (r6 == 0) goto L31
            boolean r6 = r13.isInstance(r5)
            if (r6 == 0) goto L27
            goto L2d
        L27:
            f.b r5 = (f.b) r5
            java.lang.Object r5 = r11.f(r12, r13, r5)
        L2d:
            java.lang.reflect.Array.set(r2, r4, r5)
            goto L60
        L31:
            boolean r6 = r5 instanceof f.b
            if (r6 == 0) goto L54
            r6 = r5
            f.b r6 = (f.b) r6
            int r7 = r6.size()
            r8 = 0
            r9 = 0
        L3e:
            if (r8 >= r7) goto L4d
            java.lang.Object r10 = r6.get(r8)
            if (r10 != r14) goto L4a
            r6.set(r4, r2)
            r9 = 1
        L4a:
            int r8 = r8 + 1
            goto L3e
        L4d:
            if (r9 == 0) goto L54
            java.lang.Object[] r6 = r6.toArray()
            goto L55
        L54:
            r6 = r0
        L55:
            if (r6 != 0) goto L5d
            i.i r6 = r12.f3143d
            java.lang.Object r6 = m.j.b(r5, r13, r6)
        L5d:
            java.lang.reflect.Array.set(r2, r4, r6)
        L60:
            int r4 = r4 + 1
            goto Le
        L63:
            r14.f2686j = r2
            r14.f2687k = r13
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.p0.f(i.a, java.lang.Class, f.b):java.lang.Object");
    }
}
