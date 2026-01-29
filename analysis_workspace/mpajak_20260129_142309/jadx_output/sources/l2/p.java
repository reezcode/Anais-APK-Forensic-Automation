package l2;

import i2.z;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import l2.n;

/* loaded from: classes11.dex */
public final class p<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f4007a;

    /* renamed from: b, reason: collision with root package name */
    public final z<T> f4008b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f4009c;

    public p(i2.i iVar, z<T> zVar, Type type) {
        this.f4007a = iVar;
        this.f4008b = zVar;
        this.f4009c = type;
    }

    @Override // i2.z
    public final T a(p2.a aVar) {
        return this.f4008b.a(aVar);
    }

    @Override // i2.z
    public final void b(p2.b bVar, T t4) {
        z<T> zVar = this.f4008b;
        Type type = this.f4009c;
        if (t4 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t4.getClass();
        }
        if (type != this.f4009c) {
            zVar = this.f4007a.e(new o2.a<>(type));
            if (zVar instanceof n.a) {
                z<T> zVar2 = this.f4008b;
                if (!(zVar2 instanceof n.a)) {
                    zVar = zVar2;
                }
            }
        }
        zVar.b(bVar, t4);
    }
}
