.class public abstract Lm3/l0;
.super Lm3/m0;

# interfaces
.implements Lm3/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm3/l0$a;,
        Lm3/l0$b;
    }
.end annotation


# static fields
.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _delayed:Ljava/lang/Object;

.field private volatile synthetic _isCompleted:I

.field private volatile synthetic _queue:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lm3/l0;

    const-string v2, "_queue"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_delayed"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm3/l0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm3/m0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    iput-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lm3/l0;->_isCompleted:I

    return-void
.end method

.method public static final M(Lm3/l0;)Z
    .locals 0

    iget p0, p0, Lm3/l0;->_isCompleted:I

    return p0
.end method


# virtual methods
.method public N(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0, p1}, Lm3/l0;->P(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm3/m0;->J()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq v0, p1, :cond_1

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lm3/b0;->h:Lm3/b0;

    invoke-virtual {v0, p1}, Lm3/b0;->N(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final P(Ljava/lang/Runnable;)Z
    .locals 6

    :cond_0
    :goto_0
    iget-object v0, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    iget v1, p0, Lm3/l0;->_isCompleted:I

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x1

    if-nez v0, :cond_4

    sget-object v3, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v4, 0x0

    :cond_2
    invoke-virtual {v3, p0, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_1
    if-eqz v2, :cond_0

    return v1

    :cond_4
    instance-of v3, v0, Lq3/k;

    if-eqz v3, :cond_a

    move-object v3, v0

    check-cast v3, Lq3/k;

    invoke-virtual {v3, p1}, Lq3/k;->a(Ljava/lang/Object;)I

    move-result v4

    if-eqz v4, :cond_9

    if-eq v4, v1, :cond_6

    const/4 v0, 0x2

    if-eq v4, v0, :cond_5

    goto :goto_0

    :cond_5
    return v2

    :cond_6
    sget-object v2, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3}, Lq3/k;->e()Lq3/k;

    move-result-object v3

    :cond_7
    invoke-virtual {v2, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_7

    goto :goto_0

    :cond_9
    return v1

    :cond_a
    sget-object v3, Ld1/d;->g:Lq3/r;

    if-ne v0, v3, :cond_b

    return v2

    :cond_b
    new-instance v3, Lq3/k;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1}, Lq3/k;-><init>(IZ)V

    move-object v4, v0

    check-cast v4, Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Lq3/k;->a(Ljava/lang/Object;)I

    invoke-virtual {v3, p1}, Lq3/k;->a(Ljava/lang/Object;)I

    sget-object v4, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_c
    invoke-virtual {v4, p0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v2, 0x1

    goto :goto_2

    :cond_d
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v0, :cond_c

    :goto_2
    if-eqz v2, :cond_0

    return v1
.end method

.method public final Q()Z
    .locals 4

    iget-object v0, p0, Lm3/k0;->e:Lq3/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget v3, v0, Lq3/a;->b:I

    iget v0, v0, Lq3/a;->c:I

    if-ne v3, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    check-cast v0, Lm3/l0$b;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lq3/u;->c()Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    instance-of v3, v0, Lq3/k;

    if-eqz v3, :cond_5

    check-cast v0, Lq3/k;

    invoke-virtual {v0}, Lq3/k;->d()Z

    move-result v1

    goto :goto_2

    :cond_5
    sget-object v3, Ld1/d;->g:Lq3/r;

    if-ne v0, v3, :cond_6

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    :goto_2
    return v1
.end method

.method public final R()J
    .locals 12

    invoke-virtual {p0}, Lm3/k0;->I()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    check-cast v0, Lm3/l0$b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lq3/u;->c()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    :cond_1
    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Lq3/u;->b()Lq3/v;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v8, :cond_2

    monitor-exit v0

    move-object v8, v4

    goto :goto_3

    :cond_2
    :try_start_1
    check-cast v8, Lm3/l0$a;

    iget-wide v9, v8, Lm3/l0$a;->b:J

    sub-long v9, v6, v9

    cmp-long v11, v9, v1

    if-ltz v11, :cond_3

    const/4 v9, 0x1

    goto :goto_0

    :cond_3
    const/4 v9, 0x0

    :goto_0
    if-eqz v9, :cond_4

    invoke-virtual {p0, v8}, Lm3/l0;->P(Ljava/lang/Runnable;)Z

    move-result v8

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_5

    invoke-virtual {v0, v5}, Lq3/u;->d(I)Lq3/v;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_5
    move-object v8, v4

    :goto_2
    monitor-exit v0

    :goto_3
    check-cast v8, Lm3/l0$a;

    if-nez v8, :cond_1

    goto :goto_4

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_6
    :goto_4
    iget-object v0, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    if-nez v0, :cond_7

    goto :goto_6

    :cond_7
    instance-of v6, v0, Lq3/k;

    if-eqz v6, :cond_b

    move-object v6, v0

    check-cast v6, Lq3/k;

    invoke-virtual {v6}, Lq3/k;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lq3/k;->g:Lq3/r;

    if-eq v7, v8, :cond_8

    move-object v4, v7

    check-cast v4, Ljava/lang/Runnable;

    goto :goto_6

    :cond_8
    sget-object v7, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v6}, Lq3/k;->e()Lq3/k;

    move-result-object v6

    :cond_9
    invoke-virtual {v7, p0, v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v7, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eq v8, v0, :cond_9

    goto :goto_4

    :cond_b
    sget-object v6, Ld1/d;->g:Lq3/r;

    if-ne v0, v6, :cond_c

    goto :goto_6

    :cond_c
    sget-object v6, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_d
    invoke-virtual {v6, p0, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    const/4 v6, 0x1

    goto :goto_5

    :cond_e
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v0, :cond_d

    const/4 v6, 0x0

    :goto_5
    if-eqz v6, :cond_6

    move-object v4, v0

    check-cast v4, Ljava/lang/Runnable;

    :goto_6
    if-eqz v4, :cond_f

    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    return-wide v1

    :cond_f
    iget-object v0, p0, Lm3/k0;->e:Lq3/a;

    const-wide v6, 0x7fffffffffffffffL

    if-nez v0, :cond_10

    goto :goto_8

    :cond_10
    iget v4, v0, Lq3/a;->b:I

    iget v0, v0, Lq3/a;->c:I

    if-ne v4, v0, :cond_11

    goto :goto_7

    :cond_11
    const/4 v3, 0x0

    :goto_7
    if-eqz v3, :cond_12

    :goto_8
    move-wide v3, v6

    goto :goto_9

    :cond_12
    move-wide v3, v1

    :goto_9
    cmp-long v0, v3, v1

    if-nez v0, :cond_13

    goto :goto_b

    :cond_13
    iget-object v0, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    if-eqz v0, :cond_15

    instance-of v3, v0, Lq3/k;

    if-eqz v3, :cond_14

    check-cast v0, Lq3/k;

    invoke-virtual {v0}, Lq3/k;->d()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_b

    :cond_14
    sget-object v3, Ld1/d;->g:Lq3/r;

    if-ne v0, v3, :cond_18

    goto :goto_a

    :cond_15
    iget-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    check-cast v0, Lm3/l0$b;

    if-eqz v0, :cond_17

    monitor-enter v0

    :try_start_2
    invoke-virtual {v0}, Lq3/u;->b()Lq3/v;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    check-cast v3, Lm3/l0$a;

    if-nez v3, :cond_16

    goto :goto_a

    :cond_16
    iget-wide v3, v3, Lm3/l0$a;->b:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4, v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v1

    goto :goto_b

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_17
    :goto_a
    move-wide v1, v6

    :cond_18
    :goto_b
    return-wide v1
.end method

.method public final S()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    iput-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    return-void
.end method

.method public final U(JLm3/l0$a;)V
    .locals 5

    iget v0, p0, Lm3/l0;->_isCompleted:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    check-cast v0, Lm3/l0$b;

    if-nez v0, :cond_3

    sget-object v3, Lm3/l0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v4, Lm3/l0$b;

    invoke-direct {v4, p1, p2}, Lm3/l0$b;-><init>(J)V

    :cond_1
    invoke-virtual {v3, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Lm3/l0$b;

    :cond_3
    invoke-virtual {p3, p1, p2, v0, p0}, Lm3/l0$a;->f(JLm3/l0$b;Lm3/l0;)I

    move-result v0

    :goto_1
    if-eqz v0, :cond_6

    if-eq v0, v1, :cond_5

    const/4 p1, 0x2

    if-ne v0, p1, :cond_4

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected result"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Lm3/m0;->K(JLm3/l0$a;)V

    goto :goto_4

    :cond_6
    iget-object p1, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    check-cast p1, Lm3/l0$b;

    if-eqz p1, :cond_7

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lq3/u;->b()Lq3/v;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    move-object v2, p2

    check-cast v2, Lm3/l0$a;

    goto :goto_2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_7
    :goto_2
    if-ne v2, p3, :cond_8

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lm3/m0;->J()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    if-eq p2, p1, :cond_9

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_9
    :goto_4
    return-void
.end method

.method public final c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p2}, Lm3/l0;->N(Ljava/lang/Runnable;)V

    return-void
.end method

.method public shutdown()V
    .locals 7

    sget-object v0, Lm3/h1;->a:Lm3/h1;

    sget-object v0, Lm3/h1;->b:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput v0, p0, Lm3/l0;->_isCompleted:I

    :cond_0
    iget-object v2, p0, Lm3/l0;->_queue:Ljava/lang/Object;

    const/4 v3, 0x0

    if-nez v2, :cond_3

    sget-object v4, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v5, Ld1/d;->g:Lq3/r;

    :cond_1
    invoke-virtual {v4, p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    if-eqz v3, :cond_0

    goto :goto_2

    :cond_3
    instance-of v4, v2, Lq3/k;

    if-eqz v4, :cond_4

    check-cast v2, Lq3/k;

    invoke-virtual {v2}, Lq3/k;->b()Z

    goto :goto_2

    :cond_4
    sget-object v4, Ld1/d;->g:Lq3/r;

    if-ne v2, v4, :cond_5

    goto :goto_2

    :cond_5
    new-instance v4, Lq3/k;

    const/16 v5, 0x8

    invoke-direct {v4, v5, v0}, Lq3/k;-><init>(IZ)V

    move-object v5, v2

    check-cast v5, Ljava/lang/Runnable;

    invoke-virtual {v4, v5}, Lq3/k;->a(Ljava/lang/Object;)I

    sget-object v5, Lm3/l0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v5, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/4 v3, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v2, :cond_6

    :goto_1
    if-eqz v3, :cond_0

    :cond_8
    :goto_2
    invoke-virtual {p0}, Lm3/l0;->R()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_8

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    :goto_3
    iget-object v2, p0, Lm3/l0;->_delayed:Ljava/lang/Object;

    check-cast v2, Lm3/l0$b;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lq3/u;->e()Lq3/v;

    move-result-object v2

    check-cast v2, Lm3/l0$a;

    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {p0, v0, v1, v2}, Lm3/m0;->K(JLm3/l0$a;)V

    goto :goto_3

    :cond_a
    :goto_4
    return-void
.end method
