.class public final Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/multiprocess/RemoteCoroutineWorker;->setProgress(Landroidx/work/Data;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic $cancellableContinuation:Lm3/e;

.field public final synthetic $this_await:Lh2/a;


# direct methods
.method public constructor <init>(Lm3/e;Lh2/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;->$cancellableContinuation:Lm3/e;

    iput-object p2, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;->$this_await:Lh2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;->$cancellableContinuation:Lm3/e;

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;->$this_await:Lh2/a;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, v0

    :cond_0
    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;->$cancellableContinuation:Lm3/e;

    invoke-interface {v0, v1}, Lm3/e;->c(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCoroutineWorker$setProgress$$inlined$await$1;->$cancellableContinuation:Lm3/e;

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
