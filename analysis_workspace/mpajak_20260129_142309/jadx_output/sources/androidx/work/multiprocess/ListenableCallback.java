package androidx.work.multiprocess;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public abstract class ListenableCallback<I> {
    public final IWorkManagerImplCallback mCallback;
    public final Executor mExecutor;
    public final h2.a<I> mFuture;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes16.dex */
    public static class ListenableCallbackRunnable<I> implements Runnable {
        private static final String TAG = Logger.tagWithPrefix("ListenableCallbackRbl");
        private final ListenableCallback<I> mCallback;

        public ListenableCallbackRunnable(@NonNull ListenableCallback<I> listenableCallback) {
            this.mCallback = listenableCallback;
        }

        public static void reportFailure(@NonNull IWorkManagerImplCallback iWorkManagerImplCallback, @NonNull Throwable th) {
            try {
                iWorkManagerImplCallback.onFailure(th.getMessage());
            } catch (RemoteException e5) {
                Logger.get().error(TAG, "Unable to notify failures in operation", e5);
            }
        }

        public static void reportSuccess(@NonNull IWorkManagerImplCallback iWorkManagerImplCallback, @NonNull byte[] bArr) {
            try {
                iWorkManagerImplCallback.onSuccess(bArr);
            } catch (RemoteException e5) {
                Logger.get().error(TAG, "Unable to notify successful operation", e5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                I i5 = this.mCallback.mFuture.get();
                ListenableCallback<I> listenableCallback = this.mCallback;
                reportSuccess(listenableCallback.mCallback, listenableCallback.toByteArray(i5));
            } catch (Throwable th) {
                reportFailure(this.mCallback.mCallback, th);
            }
        }
    }

    public ListenableCallback(@NonNull Executor executor, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback, @NonNull h2.a<I> aVar) {
        this.mExecutor = executor;
        this.mCallback = iWorkManagerImplCallback;
        this.mFuture = aVar;
    }

    public void dispatchCallbackSafely() {
        this.mFuture.addListener(new ListenableCallbackRunnable(this), this.mExecutor);
    }

    @NonNull
    public abstract byte[] toByteArray(@NonNull I i5);
}
