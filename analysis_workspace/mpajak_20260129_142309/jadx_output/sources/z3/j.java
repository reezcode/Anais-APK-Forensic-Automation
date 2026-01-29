package z3;

import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class j extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f6261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f4.f f6263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, f fVar, int i5, f4.f fVar2, int i6, boolean z4) {
        super(str, true);
        this.f6261e = fVar;
        this.f6262f = i5;
        this.f6263g = fVar2;
        this.f6264h = i6;
    }

    @Override // v3.a
    public final long a() {
        try {
            i.g gVar = this.f6261e.f6217m;
            f4.f source = this.f6263g;
            int i5 = this.f6264h;
            Objects.requireNonNull(gVar);
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i5);
            this.f6261e.f6230z.n(this.f6262f, b.CANCEL);
            synchronized (this.f6261e) {
                this.f6261e.B.remove(Integer.valueOf(this.f6262f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
