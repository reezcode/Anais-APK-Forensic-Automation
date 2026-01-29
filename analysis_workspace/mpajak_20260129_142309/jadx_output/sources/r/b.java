package r;

import java.util.Objects;
import r.c;

/* loaded from: classes15.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f4806b;

    public b(c cVar) {
        this.f4806b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f4806b;
        Objects.requireNonNull(cVar);
        while (true) {
            try {
                cVar.b((c.a) cVar.f4816c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
