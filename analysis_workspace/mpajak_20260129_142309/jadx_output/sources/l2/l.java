package l2;

import i2.w;
import i2.x;
import i2.z;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes12.dex */
public final class l extends z<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final k f3983c = new k(w.f3306b);

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f3984a;

    /* renamed from: b, reason: collision with root package name */
    public final x f3985b;

    public l(i2.i iVar, x xVar) {
        this.f3984a = iVar;
        this.f3985b = xVar;
    }

    @Override // i2.z
    public final Object a(p2.a aVar) {
        int a5 = f.h.a(aVar.N());
        if (a5 == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.r()) {
                arrayList.add(a(aVar));
            }
            aVar.f();
            return arrayList;
        }
        if (a5 == 2) {
            k2.p pVar = new k2.p();
            aVar.b();
            while (aVar.r()) {
                pVar.put(aVar.E(), a(aVar));
            }
            aVar.l();
            return pVar;
        }
        if (a5 == 5) {
            return aVar.K();
        }
        if (a5 == 6) {
            return this.f3985b.a(aVar);
        }
        if (a5 == 7) {
            return Boolean.valueOf(aVar.x());
        }
        if (a5 != 8) {
            throw new IllegalStateException();
        }
        aVar.I();
        return null;
    }

    @Override // i2.z
    public final void b(p2.b bVar, Object obj) {
        if (obj == null) {
            bVar.q();
            return;
        }
        i2.i iVar = this.f3984a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(iVar);
        z e5 = iVar.e(new o2.a(cls));
        if (!(e5 instanceof l)) {
            e5.b(bVar, obj);
        } else {
            bVar.c();
            bVar.l();
        }
    }
}
