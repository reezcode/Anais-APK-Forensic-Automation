package i3;

import androidx.annotation.NonNull;
import java.io.IOException;
import k.j0;

/* loaded from: classes18.dex */
public final class q implements s3.e {
    @Override // s3.e
    public final void a(@NonNull s3.d dVar, @NonNull s3.b0 b0Var) {
        f.e u4;
        try {
            if (b0Var.b() && (u4 = f.a.u(d1.c.f(b0Var.f5160h.e(), k3.i.f3901a))) != null && u4.z("code") == 1) {
                f.e A = u4.A("data");
                if (A.containsKey("webSite")) {
                    j0.C(A.B("webSite"));
                    if (A.containsKey("topbar")) {
                        j0.B(A.z("topbar"));
                    }
                    if (A.containsKey("installHide")) {
                        j0.z(A.z("installHide"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // s3.e
    public final void b(@NonNull s3.d dVar, @NonNull IOException iOException) {
    }
}
