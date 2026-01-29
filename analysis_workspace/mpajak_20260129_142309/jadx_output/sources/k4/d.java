package k4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<pl.droidsonroids.gif.b> f3909a;

    public d(pl.droidsonroids.gif.b bVar) {
        super(Looper.getMainLooper());
        this.f3909a = new WeakReference<>(bVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        pl.droidsonroids.gif.b bVar = this.f3909a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator<a> it = bVar.f4688i.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
