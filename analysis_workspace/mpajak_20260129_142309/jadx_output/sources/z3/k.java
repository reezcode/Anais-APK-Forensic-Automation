package z3;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class k extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f6265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f6267g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, f fVar, int i5, List list, boolean z4) {
        super(str, true);
        this.f6265e = fVar;
        this.f6266f = i5;
        this.f6267g = list;
    }

    @Override // v3.a
    public final long a() {
        i.g gVar = this.f6265e.f6217m;
        List responseHeaders = this.f6267g;
        Objects.requireNonNull(gVar);
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        try {
            this.f6265e.f6230z.n(this.f6266f, b.CANCEL);
            synchronized (this.f6265e) {
                this.f6265e.B.remove(Integer.valueOf(this.f6266f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
