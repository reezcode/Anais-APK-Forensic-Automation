package l2;

import i2.a0;
import i2.z;

/* loaded from: classes19.dex */
public final class t implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f4044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f4045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4046d;

    public t(Class cls, Class cls2, z zVar) {
        this.f4044b = cls;
        this.f4045c = cls2;
        this.f4046d = zVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        Class<? super T> cls = aVar.f4568a;
        if (cls == this.f4044b || cls == this.f4045c) {
            return this.f4046d;
        }
        return null;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Factory[type=");
        g5.append(this.f4044b.getName());
        g5.append("+");
        g5.append(this.f4045c.getName());
        g5.append(",adapter=");
        g5.append(this.f4046d);
        g5.append("]");
        return g5.toString();
    }
}
