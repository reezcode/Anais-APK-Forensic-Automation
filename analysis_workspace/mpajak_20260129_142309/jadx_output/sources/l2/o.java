package l2;

import i2.z;
import java.lang.reflect.Type;
import k.j0;

/* loaded from: classes9.dex */
public final class o<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final i2.t<T> f4001a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.m<T> f4002b;

    /* renamed from: c, reason: collision with root package name */
    public final i2.i f4003c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.a<T> f4004d;

    /* renamed from: e, reason: collision with root package name */
    public final o<T>.a f4005e = new a();

    /* renamed from: f, reason: collision with root package name */
    public volatile z<T> f4006f;

    /* loaded from: classes20.dex */
    public final class a {
    }

    public o(i2.t tVar, i2.m mVar, i2.i iVar, o2.a aVar) {
        this.f4001a = tVar;
        this.f4002b = mVar;
        this.f4003c = iVar;
        this.f4004d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    @Override // i2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T a(p2.a r4) {
        /*
            r3 = this;
            i2.m<T> r0 = r3.f4002b
            r1 = 0
            if (r0 != 0) goto L19
            i2.z<T> r0 = r3.f4006f
            if (r0 == 0) goto La
            goto L14
        La:
            i2.i r0 = r3.f4003c
            o2.a<T> r2 = r3.f4004d
            i2.z r0 = r0.f(r1, r2)
            r3.f4006f = r0
        L14:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L19:
            r4.N()     // Catch: java.lang.NumberFormatException -> L26 java.io.IOException -> L2d p2.c -> L34 java.io.EOFException -> L3b
            r0 = 0
            i2.z<i2.n> r2 = l2.q.V     // Catch: java.io.EOFException -> L24 java.lang.NumberFormatException -> L26 java.io.IOException -> L2d p2.c -> L34
            i2.n r4 = r2.a(r4)     // Catch: java.io.EOFException -> L24 java.lang.NumberFormatException -> L26 java.io.IOException -> L2d p2.c -> L34
            goto L41
        L24:
            r4 = move-exception
            goto L3d
        L26:
            r4 = move-exception
            i2.u r0 = new i2.u
            r0.<init>(r4)
            throw r0
        L2d:
            r4 = move-exception
            i2.o r0 = new i2.o
            r0.<init>(r4)
            throw r0
        L34:
            r4 = move-exception
            i2.u r0 = new i2.u
            r0.<init>(r4)
            throw r0
        L3b:
            r4 = move-exception
            r0 = 1
        L3d:
            if (r0 == 0) goto L54
            i2.p r4 = i2.p.f3300a
        L41:
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4 instanceof i2.p
            if (r4 == 0) goto L49
            return r1
        L49:
            i2.m<T> r4 = r3.f4002b
            o2.a<T> r0 = r3.f4004d
            java.lang.reflect.Type r0 = r0.f4569b
            java.lang.Object r4 = r4.deserialize()
            return r4
        L54:
            i2.u r0 = new i2.u
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.o.a(p2.a):java.lang.Object");
    }

    @Override // i2.z
    public final void b(p2.b bVar, T t4) {
        i2.t<T> tVar = this.f4001a;
        if (tVar == null) {
            z<T> zVar = this.f4006f;
            if (zVar == null) {
                zVar = this.f4003c.f(null, this.f4004d);
                this.f4006f = zVar;
            }
            zVar.b(bVar, t4);
            return;
        }
        if (t4 == null) {
            bVar.q();
        } else {
            Type type = this.f4004d.f4569b;
            j0.E(tVar.serialize(), bVar);
        }
    }
}
