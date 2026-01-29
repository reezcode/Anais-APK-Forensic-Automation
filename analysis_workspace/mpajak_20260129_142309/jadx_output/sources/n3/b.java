package n3;

import kotlin.coroutines.AbstractCoroutineContextElement;
import m3.w;

/* loaded from: classes22.dex */
public final class b extends AbstractCoroutineContextElement implements w {
    private volatile Object _preHandler;

    public b() {
        super(w.a.f4221b);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // m3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleException(java.lang.Throwable r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 26
            if (r3 > r0) goto Le
            r3 = 28
            if (r0 >= r3) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L59
            java.lang.Object r0 = r6._preHandler
            r3 = 0
            if (r0 == r6) goto L19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L3f
        L19:
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.String r4 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L3c
            int r4 = r0.getModifiers()     // Catch: java.lang.Throwable -> L3c
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L38
            int r4 = r0.getModifiers()     // Catch: java.lang.Throwable -> L3c
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r3
        L3d:
            r6._preHandler = r0
        L3f:
            if (r0 == 0) goto L48
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r3, r1)
            goto L49
        L48:
            r0 = r3
        L49:
            boolean r1 = r0 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L50
            r3 = r0
            java.lang.Thread$UncaughtExceptionHandler r3 = (java.lang.Thread.UncaughtExceptionHandler) r3
        L50:
            if (r3 == 0) goto L59
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r3.uncaughtException(r0, r7)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.b.handleException(java.lang.Throwable):void");
    }
}
