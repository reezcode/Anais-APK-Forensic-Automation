package z3;

import kotlin.jvm.internal.Ref;
import z3.f;

/* loaded from: classes19.dex */
public final class g extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f.e f6254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f6255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, f.e eVar, Ref.ObjectRef objectRef) {
        super(str, true);
        this.f6254e = eVar;
        this.f6255f = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.a
    public final long a() {
        f fVar = this.f6254e.f6244c;
        fVar.f6207c.a(fVar, (u) this.f6255f.element);
        return -1L;
    }
}
