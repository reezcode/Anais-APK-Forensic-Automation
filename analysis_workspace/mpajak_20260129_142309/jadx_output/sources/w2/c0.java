package w2;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.SQLException;

/* loaded from: classes22.dex */
public final class c0 extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f5760d = new c0();

    public c0() {
        super(13, new Class[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // d1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(v2.g r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            byte[] r5 = (byte[]) r5
            r4 = 0
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.Object r4 = r6.readObject()     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L45
            r6.close()     // Catch: java.io.IOException -> L14
        L14:
            return r4
        L15:
            r4 = move-exception
            goto L1d
        L17:
            r5 = move-exception
            goto L48
        L19:
            r6 = move-exception
            r2 = r6
            r6 = r4
            r4 = r2
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Could not read serialized object from byte array: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = java.util.Arrays.toString(r5)     // Catch: java.lang.Throwable -> L45
            r0.append(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "(len "
            r0.append(r1)     // Catch: java.lang.Throwable -> L45
            int r5 = r5.length     // Catch: java.lang.Throwable -> L45
            r0.append(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = ")"
            r0.append(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L45
            java.sql.SQLException r4 = d1.c.e(r5, r4)     // Catch: java.lang.Throwable -> L45
            throw r4     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L48:
            if (r4 == 0) goto L4d
            r4.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.c0.J(v2.g, java.lang.Object, int):java.lang.Object");
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        return ((q2.d) eVar).c(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // d1.f, v2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(v2.g r4, java.lang.Object r5) {
        /*
            r3 = this;
            r4 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            r1.writeObject(r5)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r1.close()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            byte[] r4 = r0.toByteArray()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            return r4
        L16:
            r4 = move-exception
            goto L39
        L18:
            r4 = move-exception
            goto L1f
        L1a:
            r5 = move-exception
            goto L37
        L1c:
            r0 = move-exception
            r1 = r4
            r4 = r0
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Could not write serialized object to byte array: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            r0.append(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L35
            java.sql.SQLException r4 = d1.c.e(r5, r4)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L35:
            r5 = move-exception
            r4 = r1
        L37:
            r1 = r4
            r4 = r5
        L39:
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.c0.e(v2.g, java.lang.Object):java.lang.Object");
    }

    @Override // w2.a, v2.a
    public final Class<?> h() {
        return Serializable.class;
    }

    @Override // w2.a, v2.a
    public final boolean m(Field field) {
        return Serializable.class.isAssignableFrom(field.getType());
    }

    @Override // w2.a, v2.a
    public final boolean p() {
        return true;
    }

    @Override // w2.a, v2.a
    public final boolean r() {
        return false;
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        throw new SQLException("Default values for serializable types are not supported");
    }
}
