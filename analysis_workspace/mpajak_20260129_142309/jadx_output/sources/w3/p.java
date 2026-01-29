package w3;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s3.s;

/* loaded from: classes4.dex */
public final class p extends Lambda implements Function0<List<? extends Proxy>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f5894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Proxy f5895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f5896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, Proxy proxy, s sVar) {
        super(0);
        this.f5894b = oVar;
        this.f5895c = proxy;
        this.f5896d = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Proxy> invoke() {
        Proxy proxy = this.f5895c;
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI h5 = this.f5896d.h();
        if (h5.getHost() == null) {
            return t3.c.m(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.f5894b.f5888e.f5148k.select(h5);
        return select == null || select.isEmpty() ? t3.c.m(Proxy.NO_PROXY) : t3.c.z(select);
    }
}
