package f4;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
public final class d implements y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f2847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f2848c;

    public d(c cVar, y yVar) {
        this.f2847b = cVar;
        this.f2848c = yVar;
    }

    @Override // f4.y
    public final void T(f source, long j5) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f2852c, 0L, j5);
        while (true) {
            long j6 = 0;
            if (j5 <= 0) {
                return;
            }
            v vVar = source.f2851b;
            while (true) {
                Intrinsics.checkNotNull(vVar);
                if (j6 >= 65536) {
                    break;
                }
                j6 += vVar.f2896c - vVar.f2895b;
                if (j6 >= j5) {
                    j6 = j5;
                    break;
                }
                vVar = vVar.f2899f;
            }
            c cVar = this.f2847b;
            cVar.i();
            try {
                this.f2848c.T(source, j6);
                Unit unit = Unit.INSTANCE;
                if (cVar.j()) {
                    throw cVar.k(null);
                }
                j5 -= j6;
            } catch (IOException e5) {
                if (!cVar.j()) {
                    throw e5;
                }
                throw cVar.k(e5);
            } finally {
                cVar.j();
            }
        }
    }

    @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f2847b;
        cVar.i();
        try {
            this.f2848c.close();
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

    @Override // f4.y, java.io.Flushable
    public final void flush() {
        c cVar = this.f2847b;
        cVar.i();
        try {
            this.f2848c.flush();
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

    @Override // f4.y
    public final b0 i() {
        return this.f2847b;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("AsyncTimeout.sink(");
        g5.append(this.f2848c);
        g5.append(')');
        return g5.toString();
    }
}
