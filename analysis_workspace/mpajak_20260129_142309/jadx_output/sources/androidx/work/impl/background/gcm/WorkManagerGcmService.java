package androidx.work.impl.background.gcm;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.WorkTimer;
import com.google.android.gms.gcm.GcmTaskService;
import z0.b;

/* loaded from: classes.dex */
public class WorkManagerGcmService extends GcmTaskService {
    private static final String TAG = "WorkManagerGcmService";
    private WorkManagerGcmDispatcher mGcmDispatcher;
    private boolean mIsShutdown;

    @MainThread
    private void checkDispatcher() {
        if (this.mIsShutdown) {
            Logger.get().debug(TAG, "Re-initializing dispatcher after a request to shutdown");
            initializeDispatcher();
        }
    }

    @MainThread
    private void initializeDispatcher() {
        this.mIsShutdown = false;
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        this.mGcmDispatcher = new WorkManagerGcmDispatcher(workManagerImpl, new WorkTimer(workManagerImpl.getConfiguration().getRunnableScheduler()));
    }

    @Override // com.google.android.gms.gcm.GcmTaskService, android.app.Service
    public void onCreate() {
        super.onCreate();
        initializeDispatcher();
    }

    @Override // com.google.android.gms.gcm.GcmTaskService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mIsShutdown = true;
    }

    @Override // com.google.android.gms.gcm.GcmTaskService
    @MainThread
    public void onInitializeTasks() {
        checkDispatcher();
        this.mGcmDispatcher.onInitializeTasks();
    }

    @Override // com.google.android.gms.gcm.GcmTaskService
    public int onRunTask(@NonNull b bVar) {
        checkDispatcher();
        return this.mGcmDispatcher.onRunTask(bVar);
    }
}
