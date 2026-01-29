package e0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.i;
import e0.c;
import java.util.Objects;

/* loaded from: classes19.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2510b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f2511c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2512d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2513e;

    /* renamed from: f, reason: collision with root package name */
    public final a f2514f = new a();

    /* loaded from: classes21.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, Intent intent) {
            e eVar = e.this;
            boolean z4 = eVar.f2512d;
            eVar.f2512d = eVar.j(context);
            if (z4 != e.this.f2512d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder g5 = androidx.activity.d.g("connectivity changed, isConnected: ");
                    g5.append(e.this.f2512d);
                    Log.d("ConnectivityMonitor", g5.toString());
                }
                e eVar2 = e.this;
                c.a aVar = eVar2.f2511c;
                boolean z5 = eVar2.f2512d;
                i.b bVar = (i.b) aVar;
                Objects.requireNonNull(bVar);
                if (z5) {
                    synchronized (com.bumptech.glide.i.this) {
                        bVar.f595a.b();
                    }
                }
            }
        }
    }

    public e(@NonNull Context context, @NonNull c.a aVar) {
        this.f2510b = context.getApplicationContext();
        this.f2511c = aVar;
    }

    @Override // e0.l
    public final void d() {
        if (this.f2513e) {
            this.f2510b.unregisterReceiver(this.f2514f);
            this.f2513e = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public final boolean j(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e5) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e5);
            }
            return true;
        }
    }

    @Override // e0.l
    public final void onDestroy() {
    }

    @Override // e0.l
    public final void onStart() {
        if (this.f2513e) {
            return;
        }
        this.f2512d = j(this.f2510b);
        try {
            this.f2510b.registerReceiver(this.f2514f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f2513e = true;
        } catch (SecurityException e5) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e5);
            }
        }
    }
}
