.class public final Lq3/g;
.super Lm3/v;

# interfaces
.implements Ljava/lang/Runnable;
.implements Lm3/d0;


# instance fields
.field public final c:Lm3/v;

.field public final d:I

.field public final synthetic e:Lm3/d0;

.field public final f:Lq3/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/j<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method public constructor <init>(Lm3/v;I)V
    .locals 0

    invoke-direct {p0}, Lm3/v;-><init>()V

    iput-object p1, p0, Lq3/g;->c:Lm3/v;

    iput p2, p0, Lq3/g;->d:I

    instance-of p2, p1, Lm3/d0;

    if-eqz p2, :cond_0

    check-cast p1, Lm3/d0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lm3/c0;->a:Lm3/d0;

    :cond_1
    iput-object p1, p0, Lq3/g;->e:Lm3/d0;

    new-instance p1, Lq3/j;

    invoke-direct {p1}, Lq3/j;-><init>()V

    iput-object p1, p0, Lq3/g;->f:Lq3/j;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/g;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 3

    iget-object p1, p0, Lq3/g;->f:Lq3/j;

    invoke-virtual {p1, p2}, Lq3/j;->a(Ljava/lang/Object;)Z

    iget p1, p0, Lq3/g;->runningWorkers:I

    iget p2, p0, Lq3/g;->d:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lq3/g;->g:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget p2, p0, Lq3/g;->runningWorkers:I

    iget v2, p0, Lq3/g;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt p2, v2, :cond_1

    monitor-exit p1

    goto :goto_1

    :cond_1
    :try_start_1
    iget p2, p0, Lq3/g;->runningWorkers:I

    add-int/2addr p2, v1

    iput p2, p0, Lq3/g;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    iget-object p1, p0, Lq3/g;->c:Lm3/v;

    invoke-virtual {p1, p0, p0}, Lm3/v;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    goto :goto_2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_2
    :goto_2
    return-void
.end method

.method public final run()V
    .locals 3

    :goto_0
    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lq3/g;->f:Lq3/j;

    invoke-virtual {v1}, Lq3/j;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v2, v1}, Ld1/d;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lq3/g;->c:Lm3/v;

    invoke-virtual {v1}, Lm3/v;->x()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lq3/g;->c:Lm3/v;

    invoke-virtual {v0, p0, p0}, Lm3/v;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    iget-object v0, p0, Lq3/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget v1, p0, Lq3/g;->runningWorkers:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lq3/g;->runningWorkers:I

    iget-object v1, p0, Lq3/g;->f:Lq3/j;

    invoke-virtual {v1}, Lq3/j;->c()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    :try_start_2
    iget v1, p0, Lq3/g;->runningWorkers:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq3/g;->runningWorkers:I

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method
