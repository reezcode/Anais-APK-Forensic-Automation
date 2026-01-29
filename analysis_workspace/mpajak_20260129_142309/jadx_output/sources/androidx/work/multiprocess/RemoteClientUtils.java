package androidx.work.multiprocess;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes24.dex */
public final class RemoteClientUtils {
    public static final Function<byte[], Void> sVoidMapper = new Function<byte[], Void>() { // from class: androidx.work.multiprocess.RemoteClientUtils.1
        @Override // androidx.arch.core.util.Function
        public Void apply(byte[] bArr) {
            return null;
        }
    };

    private RemoteClientUtils() {
    }

    @NonNull
    public static <I, O> h2.a<O> map(@NonNull final h2.a<I> aVar, @NonNull final Function<I, O> function, @NonNull Executor executor) {
        final SettableFuture create = SettableFuture.create();
        aVar.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteClientUtils.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    create.set(function.apply(h2.a.this.get()));
                } catch (Throwable th) {
                    th = th;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    create.setException(th);
                }
            }
        }, executor);
        return create;
    }
}
