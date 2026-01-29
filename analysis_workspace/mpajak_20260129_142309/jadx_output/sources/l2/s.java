package l2;

import i2.a0;
import i2.z;

/* loaded from: classes22.dex */
public final class s implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f4041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f4042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4043d;

    public s(Class cls, Class cls2, z zVar) {
        this.f4041b = cls;
        this.f4042c = cls2;
        this.f4043d = zVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        Class<? super T> cls = aVar.f4568a;
        if (cls == this.f4041b || cls == this.f4042c) {
            return this.f4043d;
        }
        return null;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Factory[type=");
        g5.append(this.f4042c.getName());
        g5.append("+");
        g5.append(this.f4041b.getName());
        g5.append(",adapter=");
        g5.append(this.f4043d);
        g5.append("]");
        return g5.toString();
    }
}
