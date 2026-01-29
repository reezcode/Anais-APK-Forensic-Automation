package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Data;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import d1.c;
import i.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.e;
import m3.f;
import m3.h0;
import m3.l;

/* loaded from: classes16.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {
    private final SettableFuture<ListenableWorker.Result> future;
    private final l job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.job = c.b();
        SettableFuture<ListenableWorker.Result> create = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.future = create;
        create.addListener(new androidx.activity.c(this, 4), getTaskExecutor().getSerialTaskExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RemoteCoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            this$0.job.r(null);
        }
    }

    public abstract Object doRemoteWork(Continuation<? super ListenableWorker.Result> continuation);

    @Override // androidx.work.multiprocess.RemoteListenableWorker, androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(true);
    }

    public final Object setProgress(Data data, Continuation<? super Unit> continuation) {
        final h2.a<Void> progressAsync = setProgressAsync(data);
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
            final f fVar = new f(IntrinsicsKt.intercepted(continuation));
            fVar.o();
            progressAsync.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        e eVar = e.this;
                        Result.Companion companion = Result.Companion;
                        eVar.resumeWith(Result.m16constructorimpl(progressAsync.get()));
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            cause2 = th;
                        }
                        if (th instanceof CancellationException) {
                            e.this.c(cause2);
                            return;
                        }
                        e eVar2 = e.this;
                        Result.Companion companion2 = Result.Companion;
                        eVar2.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(cause2)));
                    }
                }
            }, DirectExecutor.INSTANCE);
            fVar.q(new Function1<Throwable, Unit>() { // from class: androidx.work.multiprocess.RemoteCoroutineWorker$setProgress$$inlined$await$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    h2.a.this.cancel(false);
                }
            });
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

    @Override // androidx.work.multiprocess.RemoteListenableWorker
    public h2.a<ListenableWorker.Result> startRemoteWork() {
        g.v(c.a(h0.f4179a.plus(this.job)), new RemoteCoroutineWorker$startRemoteWork$1(this, null));
        return this.future;
    }
}
