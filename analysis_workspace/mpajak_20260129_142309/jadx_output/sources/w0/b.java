package w0;

import android.os.Process;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f5751b;

    public b(Runnable runnable) {
        this.f5751b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f5751b.run();
    }
}
