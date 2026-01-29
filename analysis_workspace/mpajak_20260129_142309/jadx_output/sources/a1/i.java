package a1;

import android.util.Log;

/* loaded from: classes6.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f44b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f45c;

    public i(h hVar, f fVar) {
        this.f45c = hVar;
        this.f44b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f45c.f43a.handleIntent(this.f44b.f37a);
        this.f44b.a();
    }
}
