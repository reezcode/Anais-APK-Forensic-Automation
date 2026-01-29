package z3;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class m extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f6271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f6273g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, f fVar, int i5, b bVar) {
        super(str, true);
        this.f6271e = fVar;
        this.f6272f = i5;
        this.f6273g = bVar;
    }

    @Override // v3.a
    public final long a() {
        i.g gVar = this.f6271e.f6217m;
        b errorCode = this.f6273g;
        Objects.requireNonNull(gVar);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this.f6271e) {
            this.f6271e.B.remove(Integer.valueOf(this.f6272f));
            Unit unit = Unit.INSTANCE;
        }
        return -1L;
    }
}
