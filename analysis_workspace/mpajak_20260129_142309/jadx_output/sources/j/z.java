package j;

import java.lang.reflect.Constructor;

/* loaded from: classes13.dex */
public final class z extends n {
    public z(i.i iVar, Class<?> cls) {
        super(iVar, cls, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (java.lang.Throwable.class.isAssignableFrom(r14) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        r15.Q(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (r14 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r15 = (T) new java.lang.Exception(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fb, code lost:
    
        ((java.lang.Throwable) r15).setStackTrace(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        if (r14 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        if (r14 != r12.f3381c) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0106, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0116, code lost:
    
        r14 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0122, code lost:
    
        if (r14.hasNext() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
    
        r0 = (java.util.Map.Entry) r14.next();
        r2 = (java.lang.String) r0.getKey();
        r0 = r0.getValue();
        r2 = r13.i(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
    
        if (r2 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013a, code lost:
    
        r2.c(r15, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        r13 = r13.f3143d.c(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0110, code lost:
    
        if ((r13 instanceof j.n) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        r13 = (j.n) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        return (T) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        if (java.lang.Throwable.class.isAssignableFrom(r14) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        throw new f.d(androidx.appcompat.view.a.g(r14, androidx.activity.d.g("type not match, not Throwable. ")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
    
        r15 = (T) o(r5, r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f2, code lost:
    
        if (r15 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f4, code lost:
    
        r15 = (T) new java.lang.Exception(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0147, code lost:
    
        throw new f.d("create instance error", r13);
     */
    @Override // j.n, j.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T c(i.a r13, java.lang.reflect.Type r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.z.c(i.a, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // j.n, j.s
    public final int e() {
        return 12;
    }

    public final Throwable o(String str, Throwable th, Class<?> cls) {
        Object newInstance;
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        Constructor<?> constructor3 = null;
        for (Constructor<?> constructor4 : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor4.getParameterTypes();
            if (parameterTypes.length == 0) {
                constructor3 = constructor4;
            } else if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                constructor2 = constructor4;
            } else if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == Throwable.class) {
                constructor = constructor4;
            }
        }
        if (constructor != null) {
            newInstance = constructor.newInstance(str, th);
        } else if (constructor2 != null) {
            newInstance = constructor2.newInstance(str);
        } else {
            if (constructor3 == null) {
                return null;
            }
            newInstance = constructor3.newInstance(new Object[0]);
        }
        return (Throwable) newInstance;
    }
}
