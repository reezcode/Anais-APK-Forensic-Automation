package r;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes19.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5005a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5006b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes22.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).recycle();
            return true;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z4) {
        if (!this.f5005a && !z4) {
            this.f5005a = true;
            wVar.recycle();
            this.f5005a = false;
        }
        this.f5006b.obtainMessage(1, wVar).sendToTarget();
    }
}
