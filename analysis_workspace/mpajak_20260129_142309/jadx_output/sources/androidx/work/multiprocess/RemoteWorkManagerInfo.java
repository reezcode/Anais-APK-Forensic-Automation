package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ProgressUpdater;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes19.dex */
public final class RemoteWorkManagerInfo {
    private static volatile RemoteWorkManagerInfo sInstance;
    private static final Object sLock = new Object();
    private final Configuration mConfiguration;
    private final ForegroundUpdater mForegroundUpdater;
    private final ProgressUpdater mProgressUpdater;
    private final TaskExecutor mTaskExecutor;

    /* JADX WARN: Multi-variable type inference failed */
    private RemoteWorkManagerInfo(@NonNull Context context) {
        TaskExecutor workManagerTaskExecutor;
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
        if (workManagerImpl != null) {
            this.mConfiguration = workManagerImpl.getConfiguration();
            workManagerTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        } else {
            Context applicationContext = context.getApplicationContext();
            this.mConfiguration = applicationContext instanceof Configuration.Provider ? ((Configuration.Provider) applicationContext).getWorkManagerConfiguration() : new Configuration.Builder().setDefaultProcessName(applicationContext.getPackageName()).build();
            workManagerTaskExecutor = new WorkManagerTaskExecutor(this.mConfiguration.getTaskExecutor());
        }
        this.mTaskExecutor = workManagerTaskExecutor;
        this.mProgressUpdater = new RemoteProgressUpdater();
        this.mForegroundUpdater = new RemoteForegroundUpdater();
    }

    @VisibleForTesting
    public static void clearInstance() {
        synchronized (sLock) {
            sInstance = null;
        }
    }

    @NonNull
    public static RemoteWorkManagerInfo getInstance(@NonNull Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new RemoteWorkManagerInfo(context);
                }
            }
        }
        return sInstance;
    }

    @NonNull
    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    @NonNull
    public ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }

    @NonNull
    public ProgressUpdater getProgressUpdater() {
        return this.mProgressUpdater;
    }

    @NonNull
    public TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }
}
