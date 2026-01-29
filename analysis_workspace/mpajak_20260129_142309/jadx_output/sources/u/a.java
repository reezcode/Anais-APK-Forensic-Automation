package u;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements ExecutorService {

    /* renamed from: c, reason: collision with root package name */
    public static final long f5456c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f5457d;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5458b;

    /* renamed from: u.a$a, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public static final class ThreadFactoryC0069a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        public final String f5459b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f5460c;

        /* renamed from: d, reason: collision with root package name */
        public int f5461d;

        /* renamed from: u.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes19.dex */
        public class C0070a extends Thread {
            public C0070a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC0069a.this.f5460c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(ThreadFactoryC0069a.this);
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public ThreadFactoryC0069a(String str, boolean z4) {
            this.f5459b = str;
            this.f5460c = z4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(@NonNull Runnable runnable) {
            C0070a c0070a;
            c0070a = new C0070a(runnable, "glide-" + this.f5459b + "-thread-" + this.f5461d);
            this.f5461d = this.f5461d + 1;
            return c0070a;
        }
    }

    @VisibleForTesting
    public a(ExecutorService executorService) {
        this.f5458b = executorService;
    }

    public static int a() {
        if (f5457d == 0) {
            f5457d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f5457d;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j5, @NonNull TimeUnit timeUnit) {
        return this.f5458b.awaitTermination(j5, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f5458b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f5458b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j5, @NonNull TimeUnit timeUnit) {
        return this.f5458b.invokeAll(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
        return (T) this.f5458b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j5, @NonNull TimeUnit timeUnit) {
        return (T) this.f5458b.invokeAny(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f5458b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f5458b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f5458b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.f5458b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.f5458b.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t4) {
        return this.f5458b.submit(runnable, t4);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f5458b.submit(callable);
    }

    public final String toString() {
        return this.f5458b.toString();
    }
}
