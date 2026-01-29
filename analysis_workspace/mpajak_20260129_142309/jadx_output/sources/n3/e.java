package n3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes16.dex */
public final class e {
    private static volatile Choreographer choreographer;

    static {
        Object m16constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(new c(a(Looper.getMainLooper()), null, false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(ResultKt.createFailure(th));
        }
    }

    @VisibleForTesting
    public static final Handler a(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
