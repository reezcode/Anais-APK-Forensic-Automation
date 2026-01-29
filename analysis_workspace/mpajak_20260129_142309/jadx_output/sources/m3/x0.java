package m3;

import kotlin.PublishedApi;

@PublishedApi
/* loaded from: classes5.dex */
public final class x0 extends z0 implements l {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var) {
        super(true);
        z0 l5;
        boolean z4 = true;
        A(u0Var);
        i v4 = v();
        j jVar = v4 instanceof j ? (j) v4 : null;
        if (jVar != null && (l5 = jVar.l()) != null) {
            while (!l5.t()) {
                i v5 = l5.v();
                j jVar2 = v5 instanceof j ? (j) v5 : null;
                if (jVar2 != null && (l5 = jVar2.l()) != null) {
                }
            }
            this.f4223c = z4;
        }
        z4 = false;
        this.f4223c = z4;
    }

    @Override // m3.z0
    public final boolean t() {
        return this.f4223c;
    }
}
