package n3;

import android.os.Looper;
import m3.a1;
import q3.l;

/* loaded from: classes17.dex */
public final class a implements l {
    @Override // q3.l
    public final a1 a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper), null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // q3.l
    public final void b() {
    }

    @Override // q3.l
    public final void c() {
    }
}
