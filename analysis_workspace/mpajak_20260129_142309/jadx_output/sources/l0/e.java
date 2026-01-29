package l0;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes23.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3929a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f3930b = new b();

    /* loaded from: classes22.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            k.f().post(runnable);
        }
    }

    /* loaded from: classes25.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }
}
