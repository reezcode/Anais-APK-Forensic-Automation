package com.google.android.gms.iid;

import a1.e;
import a1.h;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w0.a;

/* loaded from: classes25.dex */
public abstract class zze extends Service {

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final ExecutorService f687b;

    /* renamed from: c, reason: collision with root package name */
    public h f688c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f689d;

    /* renamed from: e, reason: collision with root package name */
    public int f690e;

    /* renamed from: f, reason: collision with root package name */
    public int f691f;

    public zze() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f687b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f689d = new Object();
        this.f691f = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f689d) {
            int i5 = this.f691f - 1;
            this.f691f = i5;
            if (i5 == 0) {
                stopSelfResult(this.f690e);
            }
        }
    }

    public abstract void handleIntent(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f688c == null) {
            this.f688c = new h(this);
        }
        return this.f688c;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i6) {
        synchronized (this.f689d) {
            this.f690e = i6;
            this.f691f++;
        }
        if (intent == null) {
            a(intent);
            return 2;
        }
        this.f687b.execute(new e(this, intent, intent));
        return 3;
    }
}
