package androidx.concurrent.futures;

import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h2.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class CallbackToFutureAdapter {

    /* loaded from: classes17.dex */
    public static final class Completer<T> {
        private boolean attemptedSetting;
        private ResolvableFuture<Void> cancellationFuture = ResolvableFuture.create();
        public SafeFuture<T> future;
        public Object tag;

        private void setCompletedNormally() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }

        public void addCancellationListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            ResolvableFuture<Void> resolvableFuture = this.cancellationFuture;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        public void finalize() {
            ResolvableFuture<Void> resolvableFuture;
            SafeFuture<T> safeFuture = this.future;
            if (safeFuture != null && !safeFuture.isDone()) {
                StringBuilder g5 = d.g("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                g5.append(this.tag);
                safeFuture.setException(new FutureGarbageCollectedException(g5.toString()));
            }
            if (this.attemptedSetting || (resolvableFuture = this.cancellationFuture) == null) {
                return;
            }
            resolvableFuture.set(null);
        }

        public void fireCancellationListeners() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture.set(null);
        }

        public boolean set(T t4) {
            this.attemptedSetting = true;
            SafeFuture<T> safeFuture = this.future;
            boolean z4 = safeFuture != null && safeFuture.set(t4);
            if (z4) {
                setCompletedNormally();
            }
            return z4;
        }

        public boolean setCancelled() {
            this.attemptedSetting = true;
            SafeFuture<T> safeFuture = this.future;
            boolean z4 = safeFuture != null && safeFuture.cancelWithoutNotifyingCompleter(true);
            if (z4) {
                setCompletedNormally();
            }
            return z4;
        }

        public boolean setException(@NonNull Throwable th) {
            this.attemptedSetting = true;
            SafeFuture<T> safeFuture = this.future;
            boolean z4 = safeFuture != null && safeFuture.setException(th);
            if (z4) {
                setCompletedNormally();
            }
            return z4;
        }
    }

    /* loaded from: classes8.dex */
    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes8.dex */
    public interface Resolver<T> {
        @Nullable
        Object attachCompleter(@NonNull Completer<T> completer);
    }

    /* loaded from: classes5.dex */
    public static final class SafeFuture<T> implements a<T> {
        public final WeakReference<Completer<T>> completerWeakReference;
        private final AbstractResolvableFuture<T> delegate = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                Completer<T> completer = SafeFuture.this.completerWeakReference.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                StringBuilder g5 = d.g("tag=[");
                g5.append(completer.tag);
                g5.append("]");
                return g5.toString();
            }
        };

        public SafeFuture(Completer<T> completer) {
            this.completerWeakReference = new WeakReference<>(completer);
        }

        @Override // h2.a
        public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.delegate.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z4) {
            Completer<T> completer = this.completerWeakReference.get();
            boolean cancel = this.delegate.cancel(z4);
            if (cancel && completer != null) {
                completer.fireCancellationListeners();
            }
            return cancel;
        }

        public boolean cancelWithoutNotifyingCompleter(boolean z4) {
            return this.delegate.cancel(z4);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j5, @NonNull TimeUnit timeUnit) {
            return this.delegate.get(j5, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        public boolean set(T t4) {
            return this.delegate.set(t4);
        }

        public boolean setException(Throwable th) {
            return this.delegate.setException(th);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    private CallbackToFutureAdapter() {
    }

    @NonNull
    public static <T> a<T> getFuture(@NonNull Resolver<T> resolver) {
        Completer<T> completer = new Completer<>();
        SafeFuture<T> safeFuture = new SafeFuture<>(completer);
        completer.future = safeFuture;
        completer.tag = resolver.getClass();
        try {
            Object attachCompleter = resolver.attachCompleter(completer);
            if (attachCompleter != null) {
                completer.tag = attachCompleter;
            }
        } catch (Exception e5) {
            safeFuture.setException(e5);
        }
        return safeFuture;
    }
}
