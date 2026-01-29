package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Logger;

/* loaded from: classes16.dex */
public class RemoteWorkerService extends Service {
    public static final String TAG = Logger.tagWithPrefix("RemoteWorkerService");
    private IBinder mBinder;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        Logger.get().info(TAG, "Binding to RemoteWorkerService");
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mBinder = new ListenableWorkerImpl(this);
    }
}
