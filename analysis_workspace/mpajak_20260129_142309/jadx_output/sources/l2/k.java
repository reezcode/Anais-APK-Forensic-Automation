package l2;

import i2.a0;
import i2.x;
import i2.z;

/* loaded from: classes8.dex */
public final class k implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3982b;

    public k(x xVar) {
        this.f3982b = xVar;
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        if (aVar.f4568a == Object.class) {
            return new l(iVar, this.f3982b);
        }
        return null;
    }
}
