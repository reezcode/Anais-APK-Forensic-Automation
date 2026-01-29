package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.ListenableCallback;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ListenableWorkerImpl extends IListenableWorkerImpl.Stub {
    public static final String TAG = Logger.tagWithPrefix("ListenableWorkerImpl");
    public static byte[] sEMPTY = new byte[0];
    public static final Object sLock = new Object();
    public final Configuration mConfiguration;
    public final Context mContext;
    public final ForegroundUpdater mForegroundUpdater;
    public final Map<String, h2.a<ListenableWorker.Result>> mFutureMap;
    public final ProgressUpdater mProgressUpdater;
    public final TaskExecutor mTaskExecutor;

    public ListenableWorkerImpl(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
        RemoteWorkManagerInfo remoteWorkManagerInfo = RemoteWorkManagerInfo.getInstance(context);
        this.mConfiguration = remoteWorkManagerInfo.getConfiguration();
        this.mTaskExecutor = remoteWorkManagerInfo.getTaskExecutor();
        this.mProgressUpdater = remoteWorkManagerInfo.getProgressUpdater();
        this.mForegroundUpdater = remoteWorkManagerInfo.getForegroundUpdater();
        this.mFutureMap = new HashMap();
    }

    @NonNull
    private h2.a<ListenableWorker.Result> executeWorkRequest(@NonNull String str, @NonNull final String str2, @NonNull final WorkerParameters workerParameters) {
        final SettableFuture create = SettableFuture.create();
        Logger.get().debug(TAG, "Tracking execution of " + str + " (" + str2 + ")");
        synchronized (sLock) {
            this.mFutureMap.put(str, create);
        }
        this.mTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.multiprocess.a
            @Override // java.lang.Runnable
            public final void run() {
                ListenableWorkerImpl.this.lambda$executeWorkRequest$0(str2, workerParameters, create);
            }
        });
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeWorkRequest$0(String str, WorkerParameters workerParameters, SettableFuture settableFuture) {
        try {
            ListenableWorker createWorkerWithDefaultFallback = this.mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(this.mContext, str, workerParameters);
            if (createWorkerWithDefaultFallback == null) {
                String str2 = "Unable to create an instance of " + str;
                Logger.get().error(TAG, str2);
                settableFuture.setException(new IllegalStateException(str2));
                return;
            }
            if (createWorkerWithDefaultFallback instanceof RemoteListenableWorker) {
                settableFuture.setFuture(((RemoteListenableWorker) createWorkerWithDefaultFallback).startRemoteWork());
                return;
            }
            String str3 = str + " does not extend " + RemoteListenableWorker.class.getName();
            Logger.get().error(TAG, str3);
            settableFuture.setException(new IllegalStateException(str3));
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void interrupt(@NonNull byte[] bArr, @NonNull final IWorkManagerImplCallback iWorkManagerImplCallback) {
        final h2.a<ListenableWorker.Result> remove;
        try {
            String uuid = ((ParcelableWorkerParameters) ParcelConverters.unmarshall(bArr, ParcelableWorkerParameters.CREATOR)).getId().toString();
            Logger.get().debug(TAG, "Interrupting work with id (" + uuid + ")");
            synchronized (sLock) {
                remove = this.mFutureMap.remove(uuid);
            }
            if (remove != null) {
                this.mTaskExecutor.getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        remove.cancel(true);
                        ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, ListenableWorkerImpl.sEMPTY);
                    }
                });
            } else {
                ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
            }
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void startWork(@NonNull byte[] bArr, @NonNull final IWorkManagerImplCallback iWorkManagerImplCallback) {
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) ParcelConverters.unmarshall(bArr, ParcelableRemoteWorkRequest.CREATOR);
            WorkerParameters workerParameters = parcelableRemoteWorkRequest.getParcelableWorkerParameters().toWorkerParameters(this.mConfiguration, this.mTaskExecutor, this.mProgressUpdater, this.mForegroundUpdater);
            final String uuid = workerParameters.getId().toString();
            String workerClassName = parcelableRemoteWorkRequest.getWorkerClassName();
            Logger.get().debug(TAG, "Executing work request (" + uuid + ", " + workerClassName + ")");
            final h2.a<ListenableWorker.Result> executeWorkRequest = executeWorkRequest(uuid, workerClassName, workerParameters);
            executeWorkRequest.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r5 = this;
                        h2.a r0 = r2     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        androidx.work.ListenableWorker$Result r0 = (androidx.work.ListenableWorker.Result) r0     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        androidx.work.multiprocess.parcelable.ParcelableResult r1 = new androidx.work.multiprocess.parcelable.ParcelableResult     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        byte[] r0 = androidx.work.multiprocess.parcelable.ParcelConverters.marshall(r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        androidx.work.multiprocess.IWorkManagerImplCallback r1 = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportSuccess(r1, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L61 java.util.concurrent.ExecutionException -> L63
                        java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r0)
                        androidx.work.multiprocess.ListenableWorkerImpl r1 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L24
                        java.util.Map<java.lang.String, h2.a<androidx.work.ListenableWorker$Result>> r1 = r1.mFutureMap     // Catch: java.lang.Throwable -> L24
                        java.lang.String r2 = r4     // Catch: java.lang.Throwable -> L24
                        r1.remove(r2)     // Catch: java.lang.Throwable -> L24
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                        goto L76
                    L24:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                        throw r1
                    L27:
                        r0 = move-exception
                        goto L7a
                    L29:
                        r0 = move-exception
                        androidx.work.Logger r1 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L27
                        java.lang.String r2 = androidx.work.multiprocess.ListenableWorkerImpl.TAG     // Catch: java.lang.Throwable -> L27
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
                        r3.<init>()     // Catch: java.lang.Throwable -> L27
                        java.lang.String r4 = "Worker ("
                        r3.append(r4)     // Catch: java.lang.Throwable -> L27
                        java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L27
                        r3.append(r4)     // Catch: java.lang.Throwable -> L27
                        java.lang.String r4 = ") was cancelled"
                        r3.append(r4)     // Catch: java.lang.Throwable -> L27
                        java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L27
                        r1.debug(r2, r3)     // Catch: java.lang.Throwable -> L27
                        androidx.work.multiprocess.IWorkManagerImplCallback r1 = r3     // Catch: java.lang.Throwable -> L27
                        androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r1, r0)     // Catch: java.lang.Throwable -> L27
                        java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r0)
                        androidx.work.multiprocess.ListenableWorkerImpl r1 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L5e
                        java.util.Map<java.lang.String, h2.a<androidx.work.ListenableWorker$Result>> r1 = r1.mFutureMap     // Catch: java.lang.Throwable -> L5e
                        java.lang.String r2 = r4     // Catch: java.lang.Throwable -> L5e
                        r1.remove(r2)     // Catch: java.lang.Throwable -> L5e
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
                        goto L76
                    L5e:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
                        throw r1
                    L61:
                        r0 = move-exception
                        goto L64
                    L63:
                        r0 = move-exception
                    L64:
                        androidx.work.multiprocess.IWorkManagerImplCallback r1 = r3     // Catch: java.lang.Throwable -> L27
                        androidx.work.multiprocess.ListenableCallback.ListenableCallbackRunnable.reportFailure(r1, r0)     // Catch: java.lang.Throwable -> L27
                        java.lang.Object r0 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r0)
                        androidx.work.multiprocess.ListenableWorkerImpl r1 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L77
                        java.util.Map<java.lang.String, h2.a<androidx.work.ListenableWorker$Result>> r1 = r1.mFutureMap     // Catch: java.lang.Throwable -> L77
                        java.lang.String r2 = r4     // Catch: java.lang.Throwable -> L77
                        r1.remove(r2)     // Catch: java.lang.Throwable -> L77
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                    L76:
                        return
                    L77:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                        throw r1
                    L7a:
                        java.lang.Object r1 = androidx.work.multiprocess.ListenableWorkerImpl.sLock
                        monitor-enter(r1)
                        androidx.work.multiprocess.ListenableWorkerImpl r2 = androidx.work.multiprocess.ListenableWorkerImpl.this     // Catch: java.lang.Throwable -> L88
                        java.util.Map<java.lang.String, h2.a<androidx.work.ListenableWorker$Result>> r2 = r2.mFutureMap     // Catch: java.lang.Throwable -> L88
                        java.lang.String r3 = r4     // Catch: java.lang.Throwable -> L88
                        r2.remove(r3)     // Catch: java.lang.Throwable -> L88
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
                        throw r0
                    L88:
                        r0 = move-exception
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.ListenableWorkerImpl.AnonymousClass1.run():void");
                }
            }, this.mTaskExecutor.getSerialTaskExecutor());
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }
}
