package r;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes19.dex */
public final class a implements ThreadFactory {

    /* renamed from: r.a$a, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public class RunnableC0061a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f4803b;

        public RunnableC0061a(Runnable runnable) {
            this.f4803b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f4803b.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new RunnableC0061a(runnable), "glide-active-resources");
    }
}
