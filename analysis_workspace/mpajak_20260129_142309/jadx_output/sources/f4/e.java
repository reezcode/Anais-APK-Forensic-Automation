package f4;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class e implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f2850c;

    public e(c cVar, a0 a0Var) {
        this.f2849b = cVar;
        this.f2850c = a0Var;
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f2849b;
        cVar.i();
        try {
            this.f2850c.close();
            Unit unit = Unit.INSTANCE;
            if (cVar.j()) {
                throw cVar.k(null);
            }
        } catch (IOException e5) {
            if (!cVar.j()) {
                throw e5;
            }
            throw cVar.k(e5);
        } finally {
            cVar.j();
        }
    }

    @Override // f4.a0
    public final b0 i() {
        return this.f2849b;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("AsyncTimeout.source(");
        g5.append(this.f2850c);
        g5.append(')');
        return g5.toString();
    }

    @Override // f4.a0
    public final long u(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        c cVar = this.f2849b;
        cVar.i();
        try {
            long u4 = this.f2850c.u(sink, j5);
            if (cVar.j()) {
                throw cVar.k(null);
            }
            return u4;
        } catch (IOException e5) {
            if (cVar.j()) {
                throw cVar.k(e5);
            }
            throw e5;
        } finally {
            cVar.j();
        }
    }
}
