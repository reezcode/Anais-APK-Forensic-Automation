package s3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes16.dex */
public final class g extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f5213c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, List list, String str) {
        super(0);
        this.f5212b = fVar;
        this.f5213c = list;
        this.f5214d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> list;
        int collectionSizeOrDefault;
        d1.f fVar = this.f5212b.f5203b;
        if (fVar == null || (list = fVar.z(this.f5213c, this.f5214d)) == null) {
            list = this.f5213c;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Certificate certificate : list) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
