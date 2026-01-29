package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes17.dex */
public class LifecycleService extends Service implements LifecycleOwner {
    private final ServiceLifecycleDispatcher mDispatcher = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mDispatcher.getLifecycle();
    }

    @Override // android.app.Service
    @Nullable
    @CallSuper
    public IBinder onBind(@NonNull Intent intent) {
        this.mDispatcher.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        this.mDispatcher.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.mDispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    @CallSuper
    public void onStart(@NonNull Intent intent, int i5) {
        this.mDispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i5);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@NonNull Intent intent, int i5, int i6) {
        return super.onStartCommand(intent, i5, i6);
    }
}
