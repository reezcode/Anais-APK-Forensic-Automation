package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import d1.c;
import i.g;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import m3.f;
import m3.h0;
import m3.l;
import m3.v;
import m3.y;

/* loaded from: classes25.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final v coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final l job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = c.b();
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.future = create;
        create.addListener(new androidx.room.a(this, 2), getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = h0.f4179a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            this$0.job.r(null);
        }
    }

    @Deprecated(message = "use withContext(...) inside doWork() instead.")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, Continuation<? super ForegroundInfo> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(Continuation<? super ListenableWorker.Result> continuation);

    public v getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(Continuation<? super ForegroundInfo> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.work.ListenableWorker
    public final h2.a<ForegroundInfo> getForegroundInfoAsync() {
        l b5 = c.b();
        y a5 = c.a(getCoroutineContext().plus(b5));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b5, null, 2, 0 == true ? 1 : 0);
        g.v(a5, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, null));
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final l getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, Continuation<? super Unit> continuation) {
        h2.a<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        } else {
            f fVar = new f(IntrinsicsKt.intercepted(continuation));
            fVar.o();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(fVar, foregroundAsync), DirectExecutor.INSTANCE);
            fVar.q(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object n4 = fVar.n();
            if (n4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (n4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return n4;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object setProgress(Data data, Continuation<? super Unit> continuation) {
        h2.a<Void> progressAsync = setProgressAsync(data);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (cause == null) {
                    throw e5;
                }
                throw cause;
            }
        } else {
            f fVar = new f(IntrinsicsKt.intercepted(continuation));
            fVar.o();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(fVar, progressAsync), DirectExecutor.INSTANCE);
            fVar.q(new ListenableFutureKt$await$2$2(progressAsync));
            Object n4 = fVar.n();
            if (n4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (n4 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return n4;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.work.ListenableWorker
    public final h2.a<ListenableWorker.Result> startWork() {
        g.v(c.a(getCoroutineContext().plus(this.job)), new CoroutineWorker$startWork$1(this, null));
        return this.future;
    }
}
