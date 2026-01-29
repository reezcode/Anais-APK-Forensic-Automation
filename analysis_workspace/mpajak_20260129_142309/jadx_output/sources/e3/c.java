package e3;

import android.content.Intent;
import androidx.work.WorkRequest;
import com.superbock.App;

/* loaded from: classes21.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f2590b;

    public c(Intent intent) {
        this.f2590b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (App.f1373c || System.currentTimeMillis() - App.f1376f <= WorkRequest.MIN_BACKOFF_MILLIS) {
            return;
        }
        k3.d.f(App.f1372b, this.f2590b, true);
    }
}
