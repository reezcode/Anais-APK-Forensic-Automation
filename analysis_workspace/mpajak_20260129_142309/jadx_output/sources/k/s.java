package k;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* loaded from: classes14.dex */
public final class s implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f3742a = new s();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, f.b, java.util.Collection] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        Collection collection;
        if (aVar.f3146g.q() == 8) {
            aVar.f3146g.Q(16);
            return null;
        }
        if (type == f.b.class) {
            ?? r5 = (T) new f.b();
            aVar.y(r5, null);
            return r5;
        }
        Class<?> F = m.j.F(type);
        if (F == AbstractCollection.class || F == Collection.class) {
            collection = (T) new ArrayList();
        } else if (F.isAssignableFrom(HashSet.class)) {
            collection = (T) new HashSet();
        } else if (F.isAssignableFrom(LinkedHashSet.class)) {
            collection = (T) new LinkedHashSet();
        } else if (F.isAssignableFrom(TreeSet.class)) {
            collection = (T) new TreeSet();
        } else if (F.isAssignableFrom(ArrayList.class)) {
            collection = (T) new ArrayList();
        } else if (F.isAssignableFrom(EnumSet.class)) {
            collection = (T) EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        } else {
            try {
                collection = (T) ((Collection) F.newInstance());
            } catch (Exception unused) {
                throw new f.d(androidx.appcompat.view.a.g(F, androidx.activity.d.g("create instance error, class ")));
            }
        }
        aVar.x(m.j.y(type), collection, obj);
        return (T) collection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (((r2.f3675b & r18) != 0) != false) goto L13;
     */
    @Override // k.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(k.g0 r14, java.lang.Object r15, java.lang.Object r16, java.lang.reflect.Type r17, int r18) {
        /*
            r13 = this;
            r7 = r14
            r0 = r15
            r8 = r18
            k.a1 r9 = r7.f3689j
            if (r0 != 0) goto Le
            k.b1 r0 = k.b1.WriteNullListAsEmpty
            r9.I(r0)
            return
        Le:
            r1 = 0
            k.b1 r2 = k.b1.WriteClassName
            boolean r3 = r9.l(r2)
            r4 = 0
            if (r3 != 0) goto L22
            int r3 = r2.f3675b
            r3 = r3 & r8
            if (r3 == 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r3 == 0) goto L26
        L22:
            java.lang.reflect.Type r1 = m.j.y(r17)
        L26:
            r10 = r1
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            k.v0 r11 = r7.f3694o
            r3 = r16
            r14.o(r11, r15, r3)
            boolean r0 = r9.l(r2)
            if (r0 == 0) goto L4f
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            java.lang.Class r2 = r1.getClass()
            if (r0 != r2) goto L42
            java.lang.String r0 = "Set"
            goto L4c
        L42:
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            java.lang.Class r2 = r1.getClass()
            if (r0 != r2) goto L4f
            java.lang.String r0 = "TreeSet"
        L4c:
            r9.a(r0)
        L4f:
            r0 = 91
            r9.write(r0)     // Catch: java.lang.Throwable -> Ld5
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> Ld5
        L58:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Lcd
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Ld5
            int r12 = r4 + 1
            if (r4 == 0) goto L6b
            r1 = 44
            r9.write(r1)     // Catch: java.lang.Throwable -> Ld5
        L6b:
            if (r3 != 0) goto L71
            r9.E()     // Catch: java.lang.Throwable -> Ld5
            goto Lcb
        L71:
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> Ld5
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 != r2) goto L83
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Ld5
            int r1 = r3.intValue()     // Catch: java.lang.Throwable -> Ld5
            r9.z(r1)     // Catch: java.lang.Throwable -> Ld5
            goto Lcb
        L83:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r1 != r2) goto L9e
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> Ld5
            long r1 = r3.longValue()     // Catch: java.lang.Throwable -> Ld5
            r9.A(r1)     // Catch: java.lang.Throwable -> Ld5
            k.b1 r1 = k.b1.WriteClassName     // Catch: java.lang.Throwable -> Ld5
            boolean r1 = r9.l(r1)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Lcb
            r1 = 76
            r9.write(r1)     // Catch: java.lang.Throwable -> Ld5
            goto Lcb
        L9e:
            k.q0 r1 = r14.k(r1)     // Catch: java.lang.Throwable -> Ld5
            k.b1 r2 = k.b1.WriteClassName     // Catch: java.lang.Throwable -> Ld5
            boolean r2 = k.b1.a(r8, r2)     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto Lbe
            boolean r2 = r1 instanceof k.h0     // Catch: java.lang.Throwable -> Ld5
            if (r2 == 0) goto Lbe
            k.h0 r1 = (k.h0) r1     // Catch: java.lang.Throwable -> Ld5
            int r2 = r12 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Ld5
            r2 = r14
            r5 = r10
            r6 = r18
            r1.q(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld5
            goto Lcb
        Lbe:
            int r2 = r12 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Ld5
            r2 = r14
            r5 = r10
            r6 = r18
            r1.d(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld5
        Lcb:
            r4 = r12
            goto L58
        Lcd:
            r0 = 93
            r9.write(r0)     // Catch: java.lang.Throwable -> Ld5
            r7.f3694o = r11
            return
        Ld5:
            r0 = move-exception
            r7.f3694o = r11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s.d(k.g0, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int):void");
    }

    @Override // j.s
    public final int e() {
        return 14;
    }
}
