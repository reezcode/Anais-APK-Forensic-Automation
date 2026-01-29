package z3;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class l extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f6268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f6270g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, f fVar, int i5, List list) {
        super(str, true);
        this.f6268e = fVar;
        this.f6269f = i5;
        this.f6270g = list;
    }

    @Override // v3.a
    public final long a() {
        i.g gVar = this.f6268e.f6217m;
        List requestHeaders = this.f6270g;
        Objects.requireNonNull(gVar);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        try {
            this.f6268e.f6230z.n(this.f6269f, b.CANCEL);
            synchronized (this.f6268e) {
                this.f6268e.B.remove(Integer.valueOf(this.f6269f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
