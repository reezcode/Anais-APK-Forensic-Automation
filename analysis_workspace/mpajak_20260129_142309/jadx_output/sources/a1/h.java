package a1;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.iid.zze;

/* loaded from: classes18.dex */
public final class h extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final zze f43a;

    public h(zze zzeVar) {
        this.f43a = zzeVar;
    }

    public final void a(f fVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.f43a.f687b.execute(new i(this, fVar));
    }
}
