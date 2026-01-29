package l2;

import i2.a0;
import i2.z;

/* loaded from: classes4.dex */
public final class u implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f4047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f4048c;

    /* loaded from: classes8.dex */
    public class a extends z<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f4049a;

        public a(Class cls) {
            this.f4049a = cls;
        }

        @Override // i2.z
        public final Object a(p2.a aVar) {
            Object a5 = u.this.f4048c.a(aVar);
            if (a5 == null || this.f4049a.isInstance(a5)) {
                return a5;
            }
            StringBuilder g5 = androidx.activity.d.g("Expected a ");
            g5.append(this.f4049a.getName());
            g5.append(" but was ");
            g5.append(a5.getClass().getName());
            g5.append("; at path ");
            g5.append(aVar.q());
            throw new i2.u(g5.toString());
        }

        @Override // i2.z
        public final void b(p2.b bVar, Object obj) {
            u.this.f4048c.b(bVar, obj);
        }
    }

    public u(Class cls, z zVar) {
        this.f4047b = cls;
        this.f4048c = zVar;
    }

    @Override // i2.a0
    public final <T2> z<T2> a(i2.i iVar, o2.a<T2> aVar) {
        Class<? super T2> cls = aVar.f4568a;
        if (this.f4047b.isAssignableFrom(cls)) {
            return new a(cls);
        }
        return null;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Factory[typeHierarchy=");
        g5.append(this.f4047b.getName());
        g5.append(",adapter=");
        g5.append(this.f4048c);
        g5.append("]");
        return g5.toString();
    }
}
