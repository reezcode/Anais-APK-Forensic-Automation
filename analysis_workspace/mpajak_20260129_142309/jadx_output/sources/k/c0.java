package k;

import java.lang.reflect.Type;

/* loaded from: classes17.dex */
public final class c0 implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static c0 f3678a = new c0();

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    @Override // j.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T c(i.a r6, java.lang.reflect.Type r7, java.lang.Object r8) {
        /*
            r5 = this;
            i.c r0 = r6.f3146g
            int r1 = r0.q()
            r2 = 0
            r3 = 16
            r4 = 8
            if (r1 != r4) goto L11
            r0.Q(r3)
            return r2
        L11:
            r4 = 2
            if (r1 != r4) goto L1e
            int r6 = r0.I()     // Catch: java.lang.Exception -> L1c
            r0.Q(r3)     // Catch: java.lang.Exception -> L1c
            goto L2c
        L1c:
            r6 = move-exception
            goto L5a
        L1e:
            r4 = 3
            if (r1 != r4) goto L31
            java.math.BigDecimal r6 = r0.U()     // Catch: java.lang.Exception -> L1c
            r0.Q(r3)     // Catch: java.lang.Exception -> L1c
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L1c
        L2c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1c
            goto L4b
        L31:
            r0 = 12
            if (r1 != r0) goto L43
            f.e r0 = new f.e     // Catch: java.lang.Exception -> L1c
            r1 = 1
            r0.<init>(r1)     // Catch: java.lang.Exception -> L1c
            r6.E(r0)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r6 = m.j.l(r0)     // Catch: java.lang.Exception -> L1c
            goto L4b
        L43:
            java.lang.Object r6 = r6.w(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.Integer r6 = m.j.l(r6)     // Catch: java.lang.Exception -> L1c
        L4b:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r8 = java.util.concurrent.atomic.AtomicInteger.class
            if (r7 != r8) goto L59
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            int r6 = r6.intValue()
            r7.<init>(r6)
            return r7
        L59:
            return r6
        L5a:
            f.d r7 = new f.d
            java.lang.String r0 = "parseInt error, field : "
            java.lang.String r8 = androidx.appcompat.widget.a.i(r0, r8)
            r7.<init>(r8, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c0.c(i.a, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        int i6;
        a1 a1Var = g0Var.f3689j;
        Number number = (Number) obj;
        if (number == null) {
            a1Var.I(b1.WriteNullNumberAsZero);
            return;
        }
        if (obj instanceof Long) {
            a1Var.A(number.longValue());
        } else {
            a1Var.z(number.intValue());
        }
        if (a1Var.l(b1.WriteClassName)) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                i6 = 66;
            } else if (cls != Short.class) {
                return;
            } else {
                i6 = 83;
            }
            a1Var.write(i6);
        }
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
