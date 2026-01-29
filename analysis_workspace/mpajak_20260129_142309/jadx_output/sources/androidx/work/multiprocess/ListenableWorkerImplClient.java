package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.ListenableCallback;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes23.dex */
public class ListenableWorkerImplClient {
    public static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplClient");
    private Connection mConnection;
    public final Context mContext;
    public final Executor mExecutor;
    private final Object mLock = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes8.dex */
    public static class Connection implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplSession");
        public final SettableFuture<IListenableWorkerImpl> mFuture = SettableFuture.create();

        @Override // android.content.ServiceConnection
        public void onBindingDied(@NonNull ComponentName componentName) {
            Logger.get().warning(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NonNull ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IListenableWorkerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NonNull ComponentName componentName) {
            Logger.get().warning(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
        }
    }

    public ListenableWorkerImplClient(@NonNull Context context, @NonNull Executor executor) {
        this.mContext = context;
        this.mExecutor = executor;
    }

    private static void unableToBind(@NonNull Connection connection, @NonNull Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        connection.mFuture.setException(th);
    }

    @NonNull
    public h2.a<byte[]> execute(@NonNull ComponentName componentName, @NonNull RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher) {
        return execute(getListenableWorkerImpl(componentName), remoteDispatcher, new RemoteCallback());
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public h2.a<byte[]> execute(@NonNull final h2.a<IListenableWorkerImpl> aVar, @NonNull final RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher, @NonNull final RemoteCallback remoteCallback) {
        aVar.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImplClient.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final IListenableWorkerImpl iListenableWorkerImpl = (IListenableWorkerImpl) aVar.get();
                    remoteCallback.setBinder(iListenableWorkerImpl.asBinder());
                    ListenableWorkerImplClient.this.mExecutor.execute(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImplClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                remoteDispatcher.execute(iListenableWorkerImpl, remoteCallback);
                            } catch (Throwable th) {
                                Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to execute", th);
                                ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, th);
                            }
                        }
                    });
                } catch (InterruptedException | ExecutionException e5) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to bind to service", e5);
                    ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, e5);
                }
            }
        }, this.mExecutor);
        return remoteCallback.getFuture();
    }

    @Nullable
    @VisibleForTesting
    public Connection getConnection() {
        return this.mConnection;
    }

    @NonNull
    public h2.a<IListenableWorkerImpl> getListenableWorkerImpl(@NonNull ComponentName componentName) {
        SettableFuture<IListenableWorkerImpl> settableFuture;
        synchronized (this.mLock) {
            if (this.mConnection == null) {
                Logger.get().debug(TAG, "Binding to " + componentName.getPackageName() + ", " + componentName.getClassName());
                this.mConnection = new Connection();
                try {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    if (!this.mContext.bindService(intent, this.mConnection, 1)) {
                        unableToBind(this.mConnection, new RuntimeException("Unable to bind to service"));
                    }
                } catch (Throwable th) {
                    unableToBind(this.mConnection, th);
                }
            }
            settableFuture = this.mConnection.mFuture;
        }
        return settableFuture;
    }

    public void unbindService() {
        synchronized (this.mLock) {
            Connection connection = this.mConnection;
            if (connection != null) {
                this.mContext.unbindService(connection);
                this.mConnection = null;
            }
        }
    }
}
