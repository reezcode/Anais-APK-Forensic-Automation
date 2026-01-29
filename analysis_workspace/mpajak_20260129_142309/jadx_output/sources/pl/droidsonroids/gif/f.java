package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes19.dex */
public abstract class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final b f4707b;

    public f(b bVar) {
        this.f4707b = bVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            GifInfoHandle gifInfoHandle = this.f4707b.f4687h;
            synchronized (gifInfoHandle) {
                z4 = gifInfoHandle.f4679a == 0;
            }
            if (z4) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
