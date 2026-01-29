package l2;

import i2.a0;
import i2.z;

/* loaded from: classes19.dex */
public final class r implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f4039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f4040c;

    public r(Class cls, z zVar) {
        this.f4039b = cls;
        this.f4040c = zVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        if (aVar.f4568a == this.f4039b) {
            return this.f4040c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Factory[type=");
        g5.append(this.f4039b.getName());
        g5.append(",adapter=");
        g5.append(this.f4040c);
        g5.append("]");
        return g5.toString();
    }
}
