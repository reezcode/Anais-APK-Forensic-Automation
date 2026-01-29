package v3;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f5705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function0 function0, String str) {
        super(str, true);
        this.f5705e = function0;
    }

    @Override // v3.a
    public final long a() {
        this.f5705e.invoke();
        return -1L;
    }
}
