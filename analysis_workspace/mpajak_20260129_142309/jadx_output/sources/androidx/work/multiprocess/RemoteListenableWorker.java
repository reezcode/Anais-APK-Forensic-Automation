package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;

/* loaded from: classes12.dex */
public abstract class RemoteListenableWorker extends ListenableWorker {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    public static final String ARGUMENT_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    public static final String TAG = Logger.tagWithPrefix("RemoteListenableWorker");
    public final ListenableWorkerImplClient mClient;

    @Nullable
    private ComponentName mComponentName;

    @Nullable
    public String mWorkerClassName;
    public final WorkerParameters mWorkerParameters;

    public RemoteListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.mWorkerParameters = workerParameters;
        this.mClient = new ListenableWorkerImplClient(context, getBackgroundExecutor());
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ComponentName componentName = this.mComponentName;
        if (componentName != null) {
            this.mClient.execute(componentName, new RemoteDispatcher<IListenableWorkerImpl>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.3
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public void execute(@NonNull IListenableWorkerImpl iListenableWorkerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                    iListenableWorkerImpl.interrupt(ParcelConverters.marshall(new ParcelableWorkerParameters(RemoteListenableWorker.this.mWorkerParameters)), iWorkManagerImplCallback);
                }
            });
        }
    }

    @NonNull
    public abstract h2.a<ListenableWorker.Result> startRemoteWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final h2.a<ListenableWorker.Result> startWork() {
        SettableFuture create = SettableFuture.create();
        Data inputData = getInputData();
        final String uuid = this.mWorkerParameters.getId().toString();
        String string = inputData.getString(ARGUMENT_PACKAGE_NAME);
        String string2 = inputData.getString(ARGUMENT_CLASS_NAME);
        if (TextUtils.isEmpty(string)) {
            Logger.get().error(TAG, "Need to specify a package name for the Remote Service.");
            create.setException(new IllegalArgumentException("Need to specify a package name for the Remote Service."));
            return create;
        }
        if (TextUtils.isEmpty(string2)) {
            Logger.get().error(TAG, "Need to specify a class name for the Remote Service.");
            create.setException(new IllegalArgumentException("Need to specify a class name for the Remote Service."));
            return create;
        }
        this.mComponentName = new ComponentName(string, string2);
        final WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        return RemoteClientUtils.map(this.mClient.execute(this.mComponentName, new RemoteDispatcher<IListenableWorkerImpl>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.1
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(@NonNull IListenableWorkerImpl iListenableWorkerImpl, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback) {
                WorkSpec workSpec = workManagerImpl.getWorkDatabase().workSpecDao().getWorkSpec(uuid);
                RemoteListenableWorker.this.mWorkerClassName = workSpec.workerClassName;
                iListenableWorkerImpl.startWork(ParcelConverters.marshall(new ParcelableRemoteWorkRequest(workSpec.workerClassName, RemoteListenableWorker.this.mWorkerParameters)), iWorkManagerImplCallback);
            }
        }), new Function<byte[], ListenableWorker.Result>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.2
            @Override // androidx.arch.core.util.Function
            public ListenableWorker.Result apply(byte[] bArr) {
                ParcelableResult parcelableResult = (ParcelableResult) ParcelConverters.unmarshall(bArr, ParcelableResult.CREATOR);
                Logger.get().debug(RemoteListenableWorker.TAG, "Cleaning up");
                RemoteListenableWorker.this.mClient.unbindService();
                return parcelableResult.getResult();
            }
        }, getBackgroundExecutor());
    }
}
