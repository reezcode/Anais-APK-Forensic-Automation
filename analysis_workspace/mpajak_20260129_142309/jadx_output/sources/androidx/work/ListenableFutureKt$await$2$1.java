package androidx.work;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import m3.e;

/* loaded from: classes22.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    public final /* synthetic */ e<R> $cancellableContinuation;
    public final /* synthetic */ h2.a<R> $this_await;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(e<? super R> eVar, h2.a<R> aVar) {
        this.$cancellableContinuation = eVar;
        this.$this_await = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuation = this.$cancellableContinuation;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m16constructorimpl(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.c(cause);
                return;
            }
            Continuation continuation2 = this.$cancellableContinuation;
            Result.Companion companion2 = Result.Companion;
            continuation2.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(cause)));
        }
    }
}
