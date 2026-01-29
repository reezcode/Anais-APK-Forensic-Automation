package a1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes18.dex */
public final class j implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f47b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f48c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue<f> f49d;

    /* renamed from: e, reason: collision with root package name */
    public h f50e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f51f;

    public j(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new w0.a());
        this.f49d = new ArrayDeque();
        this.f51f = false;
        Context applicationContext = context.getApplicationContext();
        this.f46a = applicationContext;
        this.f47b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f48c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayDeque, java.util.Queue<a1.f>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayDeque, java.util.Queue<a1.f>] */
    public final synchronized void a() {
        u0.a a5;
        Context context;
        Intent intent;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (!this.f49d.isEmpty()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "found intent to be delivered");
            }
            h hVar = this.f50e;
            if (hVar == null || !hVar.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z4 = !this.f51f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z4);
                    Log.d("EnhancedIntentService", sb.toString());
                }
                if (!this.f51f) {
                    this.f51f = true;
                    try {
                        a5 = u0.a.a();
                        context = this.f46a;
                        intent = this.f47b;
                        Objects.requireNonNull(a5);
                        context.getClass();
                    } catch (SecurityException e5) {
                        Log.e("EnhancedIntentService", "Exception while binding the service", e5);
                    }
                    if (a5.b(context, intent, this, 65)) {
                        return;
                    }
                    Log.e("EnhancedIntentService", "binding to the service failed");
                    this.f51f = false;
                    b();
                }
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
            }
            this.f50e.a((f) this.f49d.poll());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Queue<a1.f>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayDeque, java.util.Queue<a1.f>] */
    @GuardedBy("this")
    public final void b() {
        while (!this.f49d.isEmpty()) {
            ((f) this.f49d.poll()).a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f51f = false;
            this.f50e = (h) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                b();
            } else {
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        a();
    }
}
