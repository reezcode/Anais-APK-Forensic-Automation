package w3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s3.q;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function0<List<? extends Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s3.f f5852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f5853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s3.a f5854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s3.f fVar, q qVar, s3.a aVar) {
        super(0);
        this.f5852b = fVar;
        this.f5853c = qVar;
        this.f5854d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        d1.f fVar = this.f5852b.f5203b;
        Intrinsics.checkNotNull(fVar);
        return fVar.z(this.f5853c.b(), this.f5854d.f5138a.f5288e);
    }
}
