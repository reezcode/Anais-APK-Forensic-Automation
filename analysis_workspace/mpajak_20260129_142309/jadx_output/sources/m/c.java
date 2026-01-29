package m;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.text.Typography;

/* loaded from: classes10.dex */
public final class c implements Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    public final String f4061b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f4062c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4063d;

    /* renamed from: e, reason: collision with root package name */
    public int f4064e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f4065f;

    /* renamed from: g, reason: collision with root package name */
    public final Type f4066g;

    /* renamed from: h, reason: collision with root package name */
    public final Class<?> f4067h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4068i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4069j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4070k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4071l;

    /* renamed from: m, reason: collision with root package name */
    public final g.b f4072m;

    /* renamed from: n, reason: collision with root package name */
    public final g.b f4073n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4074o;

    /* renamed from: p, reason: collision with root package name */
    public final char[] f4075p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4076q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4077r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4078s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4079t;

    /* renamed from: u, reason: collision with root package name */
    public final String[] f4080u;

    public c(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i5, int i6, int i7) {
        this.f4061b = str;
        this.f4067h = cls;
        this.f4065f = cls2;
        this.f4066g = type;
        this.f4062c = null;
        this.f4063d = field;
        this.f4064e = i5;
        this.f4069j = i6;
        this.f4070k = i7;
        this.f4076q = cls2.isEnum();
        if (field != null) {
            int modifiers = field.getModifiers();
            int i8 = modifiers & 1;
            this.f4074o = Modifier.isTransient(modifiers);
        } else {
            this.f4074o = false;
        }
        this.f4075p = b();
        if (field != null) {
            j.P(field);
        }
        this.f4071l = "";
        this.f4072m = null;
        this.f4073n = null;
        this.f4068i = false;
        this.f4077r = false;
        this.f4078s = false;
        this.f4079t = null;
        this.f4080u = new String[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r9.equals(r15) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r15, java.lang.reflect.Method r16, java.lang.reflect.Field r17, java.lang.Class<?> r18, java.lang.reflect.Type r19, int r20, int r21, int r22, g.b r23, g.b r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.c.<init>(java.lang.String, java.lang.reflect.Method, java.lang.reflect.Field, java.lang.Class, java.lang.reflect.Type, int, int, int, g.b, g.b, java.lang.String):void");
    }

    public static boolean d(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z4 = false;
        for (int i5 = 0; i5 < typeArr.length; i5++) {
            Type type = typeArr[i5];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (d(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i5] = new h(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z4 = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i6 = 0; i6 < typeVariableArr.length; i6++) {
                    if (type.equals(typeVariableArr[i6])) {
                        typeArr[i5] = typeArr2[i6];
                        z4 = true;
                    }
                }
            }
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type e(java.lang.Class<?> r6, java.lang.reflect.Type r7, java.lang.reflect.Type r8) {
        /*
            if (r6 == 0) goto Lbb
            if (r7 != 0) goto L6
            goto Lbb
        L6:
            boolean r0 = r8 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L26
            r0 = r8
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            java.lang.reflect.Type r6 = e(r6, r7, r0)
            if (r0 == r6) goto L25
            java.lang.Class r6 = m.j.w(r6)
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            java.lang.Class r6 = r6.getClass()
            return r6
        L25:
            return r8
        L26:
            boolean r0 = m.j.J(r7)
            if (r0 != 0) goto L2d
            return r8
        L2d:
            boolean r0 = r8 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L71
            boolean r0 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L36
            goto L46
        L36:
            boolean r0 = r7 instanceof java.lang.Class
            if (r0 == 0) goto L46
            r0 = r7
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            java.lang.reflect.Type r0 = m.j.B(r0)
            goto L47
        L46:
            r0 = r7
        L47:
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.Class r2 = m.j.w(r0)
            r3 = r8
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.reflect.TypeVariable[] r2 = r2.getTypeParameters()
        L54:
            int r4 = r2.length
            if (r1 >= r4) goto L71
            r4 = r2[r1]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r3.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L6e
            java.lang.reflect.Type[] r6 = r0.getActualTypeArguments()
            r6 = r6[r1]
            return r6
        L6e:
            int r1 = r1 + 1
            goto L54
        L71:
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Lbb
            r0 = r8
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r1 = r0.getActualTypeArguments()
            boolean r2 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L83
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            goto L95
        L83:
            java.lang.reflect.Type r2 = r6.getGenericSuperclass()
            boolean r2 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L9a
            java.lang.reflect.Type r7 = r6.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.Class r6 = r6.getSuperclass()
        L95:
            java.lang.reflect.TypeVariable[] r6 = r6.getTypeParameters()
            goto La3
        L9a:
            java.lang.Class r6 = r7.getClass()
            java.lang.reflect.TypeVariable[] r6 = r6.getTypeParameters()
            r7 = r0
        La3:
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            boolean r6 = d(r1, r6, r7)
            if (r6 == 0) goto Lbb
            m.h r6 = new m.h
            java.lang.reflect.Type r7 = r0.getOwnerType()
            java.lang.reflect.Type r8 = r0.getRawType()
            r6.<init>(r1, r7, r8)
            return r6
        Lbb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m.c.e(java.lang.Class, java.lang.reflect.Type, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c cVar) {
        Class<?> declaringClass;
        int i5 = this.f4064e;
        int i6 = cVar.f4064e;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int compareTo = this.f4061b.compareTo(cVar.f4061b);
        if (compareTo != 0) {
            return compareTo;
        }
        Method method = this.f4062c;
        Class<?> cls = null;
        if (method != null) {
            declaringClass = method.getDeclaringClass();
        } else {
            Field field = this.f4063d;
            declaringClass = field != null ? field.getDeclaringClass() : null;
        }
        Method method2 = cVar.f4062c;
        if (method2 != null) {
            cls = method2.getDeclaringClass();
        } else {
            Field field2 = cVar.f4063d;
            if (field2 != null) {
                cls = field2.getDeclaringClass();
            }
        }
        if (declaringClass != null && cls != null && declaringClass != cls) {
            if (declaringClass.isAssignableFrom(cls)) {
                return -1;
            }
            if (cls.isAssignableFrom(declaringClass)) {
                return 1;
            }
        }
        Field field3 = this.f4063d;
        boolean z4 = false;
        boolean z5 = field3 != null && field3.getType() == this.f4065f;
        Field field4 = cVar.f4063d;
        if (field4 != null && field4.getType() == cVar.f4065f) {
            z4 = true;
        }
        if (z5 && !z4) {
            return 1;
        }
        if (z4 && !z5) {
            return -1;
        }
        if (cVar.f4065f.isPrimitive() && !this.f4065f.isPrimitive()) {
            return 1;
        }
        if (this.f4065f.isPrimitive() && !cVar.f4065f.isPrimitive()) {
            return -1;
        }
        if (cVar.f4065f.getName().startsWith("java.") && !this.f4065f.getName().startsWith("java.")) {
            return 1;
        }
        if (!this.f4065f.getName().startsWith("java.") || cVar.f4065f.getName().startsWith("java.")) {
            return this.f4065f.getName().compareTo(cVar.f4065f.getName());
        }
        return -1;
    }

    public final char[] b() {
        int length = this.f4061b.length();
        char[] cArr = new char[length + 3];
        String str = this.f4061b;
        str.getChars(0, str.length(), cArr, 1);
        cArr[0] = Typography.quote;
        cArr[length + 1] = Typography.quote;
        cArr[length + 2] = ':';
        return cArr;
    }

    public final g.b c() {
        g.b bVar = this.f4072m;
        return bVar != null ? bVar : this.f4073n;
    }

    public final Member f() {
        Method method = this.f4062c;
        return method != null ? method : this.f4063d;
    }

    public final String toString() {
        return this.f4061b;
    }
}
