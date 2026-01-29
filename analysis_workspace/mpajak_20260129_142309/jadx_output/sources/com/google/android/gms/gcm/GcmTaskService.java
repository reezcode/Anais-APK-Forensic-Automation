package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import d1.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import z0.d;
import z0.e;
import z0.f;
import z0.k;

/* loaded from: classes12.dex */
public abstract class GcmTaskService extends Service {
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private ComponentName componentName;
    private final Object lock = new Object();
    private d1.b zzg;

    @GuardedBy("lock")
    private int zzu;
    private ExecutorService zzv;
    private Messenger zzw;
    private com.google.android.gms.gcm.a zzx;

    @TargetApi(21)
    /* loaded from: classes10.dex */
    public class a extends d1.a {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z4;
            Messenger messenger;
            GcmTaskService gcmTaskService = GcmTaskService.this;
            int i5 = message.sendingUid;
            x0.a a5 = x0.b.a(gcmTaskService);
            Objects.requireNonNull(a5);
            try {
                ((AppOpsManager) a5.f5906a.getSystemService("appops")).checkPackage(i5, "com.google.android.gms");
                z4 = true;
            } catch (SecurityException unused) {
                z4 = false;
            }
            if (!z4) {
                Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
                return;
            }
            int i6 = message.what;
            if (i6 == 1) {
                Bundle data = message.getData();
                if (data.isEmpty() || (messenger = message.replyTo) == null) {
                    return;
                }
                String string = data.getString("tag");
                ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                long j5 = data.getLong("max_exec_duration", 180L);
                if (GcmTaskService.this.zzg(string)) {
                    return;
                }
                Bundle bundle = data.getBundle(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
                GcmTaskService gcmTaskService2 = GcmTaskService.this;
                gcmTaskService2.zzd(gcmTaskService2.new b(string, messenger, bundle, j5, parcelableArrayList));
                return;
            }
            if (i6 == 2) {
                if (Log.isLoggable("GcmTaskService", 3)) {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                    sb.append("ignoring unimplemented stop message for now: ");
                    sb.append(valueOf);
                    Log.d("GcmTaskService", sb.toString());
                    return;
                }
                return;
            }
            if (i6 == 4) {
                GcmTaskService.this.onInitializeTasks();
                return;
            }
            String valueOf2 = String.valueOf(message);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 31);
            sb2.append("Unrecognized message received: ");
            sb2.append(valueOf2);
            Log.e("GcmTaskService", sb2.toString());
        }
    }

    /* loaded from: classes13.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final String f653b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f654c;

        /* renamed from: d, reason: collision with root package name */
        public final List<Uri> f655d;

        /* renamed from: e, reason: collision with root package name */
        public final long f656e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public final e f657f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public final Messenger f658g;

        public b(String str, @NonNull IBinder iBinder, Bundle bundle, long j5, List<Uri> list) {
            e fVar;
            this.f653b = str;
            if (iBinder == null) {
                fVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                fVar = queryLocalInterface instanceof e ? (e) queryLocalInterface : new f(iBinder);
            }
            this.f657f = fVar;
            this.f654c = bundle;
            this.f656e = j5;
            this.f655d = list;
            this.f658g = null;
        }

        public b(String str, @NonNull Messenger messenger, Bundle bundle, long j5, List<Uri> list) {
            this.f653b = str;
            this.f658g = messenger;
            this.f654c = bundle;
            this.f656e = j5;
            this.f655d = list;
            this.f657f = null;
        }

        public final void a(int i5) {
            GcmTaskService gcmTaskService;
            int i6;
            synchronized (GcmTaskService.this.lock) {
                try {
                    try {
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(this.f653b);
                        Log.e("GcmTaskService", valueOf.length() != 0 ? "Error reporting result of operation to scheduler for ".concat(valueOf) : new String("Error reporting result of operation to scheduler for "));
                        GcmTaskService.this.zzx.f(this.f653b, GcmTaskService.this.componentName.getClassName());
                        if (!b() && !GcmTaskService.this.zzx.g(GcmTaskService.this.componentName.getClassName())) {
                            gcmTaskService = GcmTaskService.this;
                            i6 = gcmTaskService.zzu;
                        }
                    }
                    if (GcmTaskService.this.zzx.h(this.f653b, GcmTaskService.this.componentName.getClassName())) {
                        return;
                    }
                    if (b()) {
                        Messenger messenger = this.f658g;
                        Message obtain = Message.obtain();
                        obtain.what = 3;
                        obtain.arg1 = i5;
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("component", GcmTaskService.this.componentName);
                        bundle.putString("tag", this.f653b);
                        obtain.setData(bundle);
                        messenger.send(obtain);
                    } else {
                        this.f657f.a(i5);
                    }
                    GcmTaskService.this.zzx.f(this.f653b, GcmTaskService.this.componentName.getClassName());
                    if (!b() && !GcmTaskService.this.zzx.g(GcmTaskService.this.componentName.getClassName())) {
                        gcmTaskService = GcmTaskService.this;
                        i6 = gcmTaskService.zzu;
                        gcmTaskService.stopSelf(i6);
                    }
                } finally {
                    GcmTaskService.this.zzx.f(this.f653b, GcmTaskService.this.componentName.getClassName());
                    if (!b() && !GcmTaskService.this.zzx.g(GcmTaskService.this.componentName.getClassName())) {
                        GcmTaskService gcmTaskService2 = GcmTaskService.this;
                        gcmTaskService2.stopSelf(gcmTaskService2.zzu);
                    }
                }
            }
        }

        public final boolean b() {
            return this.f658g != null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String valueOf = String.valueOf(this.f653b);
            k kVar = new k(valueOf.length() != 0 ? "nts:client:onRunTask:".concat(valueOf) : new String("nts:client:onRunTask:"));
            try {
                z0.b bVar = new z0.b(this.f653b, this.f654c);
                Objects.requireNonNull(GcmTaskService.this.zzg);
                try {
                    a(GcmTaskService.this.onRunTask(bVar));
                    kVar.close();
                } finally {
                }
            } finally {
            }
        }
    }

    private final void zzd(int i5) {
        synchronized (this.lock) {
            this.zzu = i5;
            if (!this.zzx.g(this.componentName.getClassName())) {
                stopSelf(this.zzu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(b bVar) {
        try {
            this.zzv.execute(bVar);
        } catch (RejectedExecutionException e5) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e5);
            bVar.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzg(String str) {
        boolean z4;
        boolean z5;
        synchronized (this.lock) {
            com.google.android.gms.gcm.a aVar = this.zzx;
            String className = this.componentName.getClassName();
            synchronized (aVar) {
                Map<String, Boolean> map = aVar.f685b.get(className);
                if (map == null) {
                    map = new ArrayMap<>();
                    aVar.f685b.put(className, map);
                }
                z4 = map.put(str, Boolean.FALSE) == null;
            }
            z5 = !z4;
            if (z5) {
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 44 + String.valueOf(str).length());
                sb.append(packageName);
                sb.append(" ");
                sb.append(str);
                sb.append(": Task already running, won't start another");
                Log.w("GcmTaskService", sb.toString());
            }
        }
        return z5;
    }

    @Override // android.app.Service
    @CallSuper
    public IBinder onBind(Intent intent) {
        if (intent == null || !SERVICE_ACTION_EXECUTE_TASK.equals(intent.getAction())) {
            return null;
        }
        return this.zzw.getBinder();
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        super.onCreate();
        this.zzx = com.google.android.gms.gcm.a.a(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new d());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzv = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zzw = new Messenger(new a(Looper.getMainLooper()));
        this.componentName = new ComponentName(this, getClass());
        this.zzg = c.f2473e;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        super.onDestroy();
        List<Runnable> shutdownNow = this.zzv.shutdownNow();
        if (shutdownNow.isEmpty()) {
            return;
        }
        int size = shutdownNow.size();
        StringBuilder sb = new StringBuilder(79);
        sb.append("Shutting down, but not all tasks are finished executing. Remaining: ");
        sb.append(size);
        Log.e("GcmTaskService", sb.toString());
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(z0.b bVar);

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(Intent intent, int i5, int i6) {
        if (intent == null) {
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                if (!(parcelableExtra instanceof PendingCallback)) {
                    String packageName = getPackageName();
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + String.valueOf(stringExtra).length());
                    sb.append(packageName);
                    sb.append(" ");
                    sb.append(stringExtra);
                    sb.append(": Could not process request, invalid callback.");
                    Log.e("GcmTaskService", sb.toString());
                    return 2;
                }
                if (zzg(stringExtra)) {
                    return 2;
                }
                zzd(new b(stringExtra, ((PendingCallback) parcelableExtra).f664b, bundleExtra, longExtra, parcelableArrayListExtra));
            } else if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                onInitializeTasks();
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                sb2.append("Unknown action received ");
                sb2.append(action);
                sb2.append(", terminating");
                Log.e("GcmTaskService", sb2.toString());
            }
            return 2;
        } finally {
            zzd(i6);
        }
    }
}
