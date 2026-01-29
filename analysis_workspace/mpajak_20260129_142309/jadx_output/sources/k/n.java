package k;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class n implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final n f3731a = new n();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r5 == 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // j.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T c(i.a r5, java.lang.reflect.Type r6, java.lang.Object r7) {
        /*
            r4 = this;
            i.c r0 = r5.f3146g
            int r1 = r0.q()     // Catch: java.lang.Exception -> L4c
            r2 = 6
            r3 = 16
            if (r1 != r2) goto Lf
            r0.Q(r3)     // Catch: java.lang.Exception -> L4c
            goto L2b
        Lf:
            int r1 = r0.q()     // Catch: java.lang.Exception -> L4c
            r2 = 7
            if (r1 != r2) goto L1a
            r0.Q(r3)     // Catch: java.lang.Exception -> L4c
            goto L2e
        L1a:
            int r1 = r0.q()     // Catch: java.lang.Exception -> L4c
            r2 = 2
            if (r1 != r2) goto L31
            int r5 = r0.I()     // Catch: java.lang.Exception -> L4c
            r0.Q(r3)     // Catch: java.lang.Exception -> L4c
            r0 = 1
            if (r5 != r0) goto L2e
        L2b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L4c
            goto L3d
        L2e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L4c
            goto L3d
        L31:
            r0 = 0
            java.lang.Object r5 = r5.w(r0)     // Catch: java.lang.Exception -> L4c
            if (r5 != 0) goto L39
            return r0
        L39:
            java.lang.Boolean r5 = m.j.f(r5)     // Catch: java.lang.Exception -> L4c
        L3d:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r6 != r7) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            boolean r5 = r5.booleanValue()
            r6.<init>(r5)
            return r6
        L4b:
            return r5
        L4c:
            r5 = move-exception
            f.d r6 = new f.d
            java.lang.String r0 = "parseBoolean error, field : "
            java.lang.String r7 = androidx.appcompat.widget.a.i(r0, r7)
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.n.c(i.a, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            a1Var.I(b1.WriteNullBooleanAsFalse);
        } else {
            a1Var.write(bool.booleanValue() ? "true" : "false");
        }
    }

    @Override // j.s
    public final int e() {
        return 6;
    }
}
