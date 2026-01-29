package a1;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f37a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f38b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39c = false;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledFuture<?> f40d;

    public f(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f37a = intent;
        this.f38b = pendingResult;
        this.f40d = scheduledExecutorService.schedule(new g(this, intent), 9500L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void a() {
        if (!this.f39c) {
            this.f38b.finish();
            this.f40d.cancel(false);
            this.f39c = true;
        }
    }
}
