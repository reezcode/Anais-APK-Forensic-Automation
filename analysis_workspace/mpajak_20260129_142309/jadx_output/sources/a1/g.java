package a1;

import android.content.Intent;
import android.util.Log;

/* loaded from: classes19.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f41b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f42c;

    public g(f fVar, Intent intent) {
        this.f42c = fVar;
        this.f41b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String action = this.f41b.getAction();
        StringBuilder sb = new StringBuilder(androidx.activity.d.b(action, 61));
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        this.f42c.a();
    }
}
