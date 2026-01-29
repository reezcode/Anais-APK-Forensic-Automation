.class public abstract Landroidx/work/multiprocess/RemoteCoroutineWorker;
.super Landroidx/work/multiprocess/RemoteListenableWorker;


# instance fields
.field private final future:Landroidx/work/impl/utils/futures/SettableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/SettableFuture<",
            "Landroidx/work/ListenableWorker$Result;",
            ">;"
        }
    .end annotation
.end field

.field private final job:Lm3/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/multiprocess/RemoteListenableWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Ld1/c;->b()Lm3/l;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->job:Lm3/l;

    invoke-static {}, Landroidx/work/impl/utils/futures/SettableFuture;->create()Landroidx/work/impl/utils/futures/SettableFuture;

    move-result-object p1

    const-string p2, "create()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->future:Landroidx/work/impl/utils/futures/SettableFuture;

    new-instance p2, Landroidx/activity/c;

    const/4 v0, 0x4

    invoke-direct {p2, p0, v0}, Landroidx/activity/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getTaskExecutor()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    move-result-object v0

    invoke-interface {v0}, Landroidx/work/impl/utils/taskexecutor/TaskExecutor;->getSerialTaskExecutor()Landroidx/work/impl/utils/taskexecutor/SerialExecutor;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/work/impl/utils/futures/AbstractFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/work/multiprocess/RemoteCoroutineWorker;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->future:Landroidx/work/impl/utils/futures/SettableFuture;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/AbstractFuture;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->job:Lm3/l;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lm3/u0;->r(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Landroidx/work/multiprocess/RemoteCoroutineWorker;)V
    .locals 0

    invoke-static {p0}, Landroidx/work/multiprocess/RemoteCoroutineWorker;->_init_$lambda$0(Landroidx/work/multiprocess/RemoteCoroutineWorker;)V

    return-void
.end method

.method public static final synthetic access$getFuture$p(Landroidx/work/multiprocess/RemoteCoroutineWorker;)Landroidx/work/impl/utils/futures/SettableFuture;
    .locals 0

    iget-object p0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->future:Landroidx/work/impl/utils/futures/SettableFuture;

    return-object p0
.end method


# virtual methods
.method public abstract doRemoteWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final onStopped()V
    .locals 2

    invoke-super {p0}, Landroidx/work/multiprocess/RemoteListenableWorker;->onStopped()V

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->future:Landroidx/work/impl/utils/futures/SettableFuture;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/AbstractFuture;->cancel(Z)Z

    return-void
.end method

.method public final setProgress(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/Data;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/work/ListenableWorker;->setProgressAsync(Landroidx/work/Data;)Lh2/a;

    move-result-object p1

    const-string v0, "setProgressAsync(data)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    throw p1

    :cond_1
    new-instance v0, Lm3/f;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lm3/f;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-virtual {v0}, Lm3/f;->o()V

    new-instance v1, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;

    invoke-direct {v1, v0, p1}, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;-><init>(Lm3/e;Lh2/a;)V

    sget-object v2, Landroidx/work/DirectExecutor;->INSTANCE:Landroidx/work/DirectExecutor;

    invoke-interface {p1, v1, v2}, Lh2/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$2;

    invoke-direct {v1, p1}, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$2;-><init>(Lh2/a;)V

    invoke-virtual {v0, v1}, Lm3/f;->q(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lm3/f;->n()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_2
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public startRemoteWork()Lh2/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh2/a<",
            "Landroidx/work/ListenableWorker$Result;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm3/h0;->a:Lr3/c;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->job:Lm3/l;

    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Ld1/c;->a(Lkotlin/coroutines/CoroutineContext;)Lm3/y;

    move-result-object v0

    new-instance v1, Landroidx/work/multiprocess/RemoteCoroutineWorker$startRemoteWork$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/work/multiprocess/RemoteCoroutineWorker$startRemoteWork$1;-><init>(Landroidx/work/multiprocess/RemoteCoroutineWorker;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1}, Li/g;->v(Lm3/y;Lkotlin/jvm/functions/Function2;)Lm3/u0;

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker;->future:Landroidx/work/impl/utils/futures/SettableFuture;

    return-object v0
.end method
