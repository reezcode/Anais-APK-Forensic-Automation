package i0;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes16.dex */
public final class f<Z> extends c<Z> {

    /* renamed from: f, reason: collision with root package name */
    public static final Handler f3248f = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.i f3249e;

    /* loaded from: classes4.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            f fVar = (f) message.obj;
            fVar.f3249e.k(fVar);
            return true;
        }
    }

    public f(com.bumptech.glide.i iVar) {
        this.f3249e = iVar;
    }

    @Override // i0.h
    public final void h(@Nullable Drawable drawable) {
    }

    @Override // i0.h
    public final void i(@NonNull Object obj) {
        f3248f.obtainMessage(1, this).sendToTarget();
    }
}
