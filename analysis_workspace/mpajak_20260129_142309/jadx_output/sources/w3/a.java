package w3;

import java.io.IOException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s3.b0;
import s3.t;
import s3.w;

/* loaded from: classes15.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5796a = new a();

    @Override // s3.t
    public final b0 a(t.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        x3.g chain2 = (x3.g) chain;
        e eVar = chain2.f5941b;
        Objects.requireNonNull(eVar);
        Intrinsics.checkNotNullParameter(chain2, "chain");
        synchronized (eVar) {
            if (!eVar.f5839m) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!eVar.f5838l)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!eVar.f5837k)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        d dVar = eVar.f5833g;
        Intrinsics.checkNotNull(dVar);
        w client = eVar.f5843q;
        Objects.requireNonNull(dVar);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain2, "chain");
        try {
            c cVar = new c(eVar, eVar.f5829c, dVar, dVar.a(chain2.f5946g, chain2.f5947h, chain2.f5948i, client.B, client.f5325g, !Intrinsics.areEqual(chain2.f5945f.f5382c, "GET")).k(client, chain2));
            eVar.f5836j = cVar;
            eVar.f5841o = cVar;
            synchronized (eVar) {
                eVar.f5837k = true;
                eVar.f5838l = true;
            }
            if (eVar.f5840n) {
                throw new IOException("Canceled");
            }
            return x3.g.a(chain2, 0, cVar, null, 61).b(chain2.f5945f);
        } catch (IOException e5) {
            dVar.c(e5);
            throw new n(e5);
        } catch (n e6) {
            dVar.c(e6.f5882b);
            throw e6;
        }
    }
}
