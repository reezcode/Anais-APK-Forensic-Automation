package w3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s3.q;

/* loaded from: classes25.dex */
public final class h extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(0);
        this.f5855b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        int collectionSizeOrDefault;
        q qVar = this.f5855b.f5861d;
        Intrinsics.checkNotNull(qVar);
        List<Certificate> b5 = qVar.b();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(b5, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Certificate certificate : b5) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
