.class public final Lr3/a$a;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# static fields
.field public static final synthetic i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final b:Lr3/m;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public c:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public d:J

.field public e:J

.field public f:I

.field public g:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final synthetic h:Lr3/a;

.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;

.field public volatile synthetic workerCtl:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lr3/a$a;

    const-string v1, "workerCtl"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lr3/a$a;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lr3/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    iput-object p1, p0, Lr3/a$a;->h:Lr3/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    new-instance p1, Lr3/m;

    invoke-direct {p1}, Lr3/m;-><init>()V

    iput-object p1, p0, Lr3/a$a;->b:Lr3/m;

    const/4 p1, 0x4

    iput p1, p0, Lr3/a$a;->c:I

    const/4 p1, 0x0

    iput p1, p0, Lr3/a$a;->workerCtl:I

    sget-object p1, Lr3/a;->l:Lq3/r;

    iput-object p1, p0, Lr3/a$a;->nextParkedWorker:Ljava/lang/Object;

    sget-object p1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    invoke-virtual {p1}, Lkotlin/random/Random$Default;->nextInt()I

    move-result p1

    iput p1, p0, Lr3/a$a;->f:I

    invoke-virtual {p0, p2}, Lr3/a$a;->f(I)V

    return-void
.end method


# virtual methods
.method public final a(Z)Lr3/g;
    .locals 9

    iget v0, p0, Lr3/a$a;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lr3/a$a;->h:Lr3/a;

    :cond_1
    iget-wide v5, v0, Lr3/a;->controlState:J

    const-wide v3, 0x7ffffc0000000000L

    and-long/2addr v3, v5

    const/16 v7, 0x2a

    shr-long/2addr v3, v7

    long-to-int v4, v3

    if-nez v4, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const-wide v3, 0x40000000000L

    sub-long v7, v5, v3

    sget-object v3, Lr3/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-object v4, v0

    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_3

    iput v2, p0, Lr3/a$a;->c:I

    :goto_1
    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_9

    if-eqz p1, :cond_7

    iget-object p1, p0, Lr3/a$a;->h:Lr3/a;

    iget p1, p1, Lr3/a;->b:I

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Lr3/a$a;->d(I)I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lr3/a$a;->e()Lr3/g;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lr3/a$a;->b:Lr3/m;

    invoke-virtual {p1}, Lr3/m;->d()Lr3/g;

    move-result-object p1

    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    if-nez v2, :cond_8

    invoke-virtual {p0}, Lr3/a$a;->e()Lr3/g;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Lr3/a$a;->e()Lr3/g;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0, v1}, Lr3/a$a;->i(Z)Lr3/g;

    move-result-object p1

    :goto_4
    return-object p1

    :cond_9
    if-eqz p1, :cond_a

    iget-object p1, p0, Lr3/a$a;->b:Lr3/m;

    invoke-virtual {p1}, Lr3/m;->d()Lr3/g;

    move-result-object p1

    if-nez p1, :cond_b

    :cond_a
    iget-object p1, p0, Lr3/a$a;->h:Lr3/a;

    iget-object p1, p1, Lr3/a;->g:Lr3/d;

    invoke-virtual {p1}, Lq3/j;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr3/g;

    :cond_b
    if-nez p1, :cond_c

    invoke-virtual {p0, v2}, Lr3/a$a;->i(Z)Lr3/g;

    move-result-object p1

    :cond_c
    return-object p1
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lr3/a$a;->indexInArray:I

    return v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr3/a$a;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final d(I)I
    .locals 3

    iget v0, p0, Lr3/a$a;->f:I

    shl-int/lit8 v1, v0, 0xd

    xor-int/2addr v0, v1

    shr-int/lit8 v1, v0, 0x11

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    xor-int/2addr v0, v1

    iput v0, p0, Lr3/a$a;->f:I

    add-int/lit8 v1, p1, -0x1

    and-int v2, v1, p1

    if-nez v2, :cond_0

    and-int p1, v0, v1

    return p1

    :cond_0
    const v1, 0x7fffffff

    and-int/2addr v0, v1

    rem-int/2addr v0, p1

    return v0
.end method

.method public final e()Lr3/g;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lr3/a$a;->d(I)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lr3/a$a;->h:Lr3/a;

    iget-object v0, v0, Lr3/a;->f:Lr3/d;

    invoke-virtual {v0}, Lq3/j;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr3/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lr3/a$a;->h:Lr3/a;

    iget-object v0, v0, Lr3/a;->g:Lr3/d;

    :goto_0
    invoke-virtual {v0}, Lq3/j;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr3/g;

    return-object v0

    :cond_1
    iget-object v0, p0, Lr3/a$a;->h:Lr3/a;

    iget-object v0, v0, Lr3/a;->g:Lr3/d;

    invoke-virtual {v0}, Lq3/j;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr3/g;

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    iget-object v0, p0, Lr3/a$a;->h:Lr3/a;

    iget-object v0, v0, Lr3/a;->f:Lr3/d;

    goto :goto_0
.end method

.method public final f(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lr3/a$a;->h:Lr3/a;

    iget-object v1, v1, Lr3/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-worker-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const-string v1, "TERMINATED"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iput p1, p0, Lr3/a$a;->indexInArray:I

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lr3/a$a;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final h(I)Z
    .locals 6

    iget v0, p0, Lr3/a$a;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Lr3/a$a;->h:Lr3/a;

    sget-object v3, Lr3/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v4, 0x40000000000L

    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    :cond_1
    if-eq v0, p1, :cond_2

    iput p1, p0, Lr3/a$a;->c:I

    :cond_2
    return v1
.end method

.method public final i(Z)Lr3/g;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lr3/a$a;->h:Lr3/a;

    iget-wide v1, v1, Lr3/a;->controlState:J

    const-wide/32 v3, 0x1fffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ge v2, v1, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {v0, v2}, Lr3/a$a;->d(I)I

    move-result v1

    iget-object v4, v0, Lr3/a$a;->h:Lr3/a;

    const/4 v5, 0x0

    const/4 v8, 0x0

    const-wide v9, 0x7fffffffffffffffL

    :goto_0
    const-wide/16 v11, 0x0

    if-ge v8, v2, :cond_6

    const/4 v13, 0x1

    add-int/2addr v1, v13

    if-le v1, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    iget-object v13, v4, Lr3/a;->h:Lq3/p;

    invoke-virtual {v13, v1}, Lq3/p;->b(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr3/a$a;

    if-eqz v13, :cond_5

    if-eq v13, v0, :cond_5

    const-wide/16 v14, -0x1

    iget-object v3, v0, Lr3/a$a;->b:Lr3/m;

    iget-object v13, v13, Lr3/a$a;->b:Lr3/m;

    if-eqz p1, :cond_2

    invoke-virtual {v3, v13}, Lr3/m;->f(Lr3/m;)J

    move-result-wide v16

    move-wide/from16 v6, v16

    goto :goto_1

    :cond_2
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13}, Lr3/m;->e()Lr3/g;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v3, v6, v5}, Lr3/m;->a(Lr3/g;Z)Lr3/g;

    move-wide v6, v14

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v13, v5}, Lr3/m;->g(Lr3/m;Z)J

    move-result-wide v6

    :goto_1
    cmp-long v3, v6, v14

    if-nez v3, :cond_4

    iget-object v1, v0, Lr3/a$a;->b:Lr3/m;

    invoke-virtual {v1}, Lr3/m;->d()Lr3/g;

    move-result-object v1

    return-object v1

    :cond_4
    cmp-long v3, v6, v11

    if-lez v3, :cond_5

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    :cond_5
    add-int/lit8 v8, v8, 0x1

    const/4 v3, 0x0

    goto :goto_0

    :cond_6
    const-wide v6, 0x7fffffffffffffffL

    cmp-long v1, v9, v6

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    move-wide v9, v11

    :goto_2
    iput-wide v9, v0, Lr3/a$a;->e:J

    const/4 v1, 0x0

    return-object v1
.end method

.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :cond_1
    :goto_1
    iget-object v4, v1, Lr3/a$a;->h:Lr3/a;

    invoke-virtual {v4}, Lr3/a;->isTerminated()Z

    move-result v4

    const/4 v5, 0x5

    if-nez v4, :cond_15

    iget v4, v1, Lr3/a$a;->c:I

    if-eq v4, v5, :cond_15

    iget-boolean v4, v1, Lr3/a$a;->g:Z

    invoke-virtual {v1, v4}, Lr3/a$a;->a(Z)Lr3/g;

    move-result-object v4

    const-wide/16 v6, 0x0

    const/4 v8, 0x3

    if-eqz v4, :cond_8

    iput-wide v6, v1, Lr3/a$a;->e:J

    const/4 v0, 0x2

    iget-object v2, v4, Lr3/g;->c:Lr3/h;

    invoke-interface {v2}, Lr3/h;->b()I

    move-result v2

    iput-wide v6, v1, Lr3/a$a;->d:J

    iget v3, v1, Lr3/a$a;->c:I

    if-ne v3, v8, :cond_2

    iput v0, v1, Lr3/a$a;->c:I

    :cond_2
    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v0}, Lr3/a$a;->h(I)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Lr3/a$a;->h:Lr3/a;

    invoke-virtual {v0}, Lr3/a;->p()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v6, v0, Lr3/a;->controlState:J

    invoke-virtual {v0, v6, v7}, Lr3/a;->n(J)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lr3/a;->p()Z

    :cond_6
    :goto_2
    iget-object v0, v1, Lr3/a$a;->h:Lr3/a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v3, v0

    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v4

    invoke-interface {v4, v0, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_3
    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, v1, Lr3/a$a;->h:Lr3/a;

    sget-object v2, Lr3/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide/32 v3, -0x200000

    invoke-virtual {v2, v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    iget v0, v1, Lr3/a$a;->c:I

    if-eq v0, v5, :cond_0

    const/4 v0, 0x4

    iput v0, v1, Lr3/a$a;->c:I

    goto :goto_0

    :catchall_1
    move-exception v0

    throw v0

    :cond_8
    iput-boolean v0, v1, Lr3/a$a;->g:Z

    iget-wide v9, v1, Lr3/a$a;->e:J

    cmp-long v4, v9, v6

    if-eqz v4, :cond_a

    if-nez v3, :cond_9

    const/4 v3, 0x1

    goto :goto_1

    :cond_9
    invoke-virtual {v1, v8}, Lr3/a$a;->h(I)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    iget-wide v2, v1, Lr3/a$a;->e:J

    invoke-static {v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    iput-wide v6, v1, Lr3/a$a;->e:J

    goto/16 :goto_0

    :cond_a
    iget-object v4, v1, Lr3/a$a;->nextParkedWorker:Ljava/lang/Object;

    sget-object v9, Lr3/a;->l:Lq3/r;

    if-eq v4, v9, :cond_b

    const/4 v4, 0x1

    goto :goto_4

    :cond_b
    const/4 v4, 0x0

    :goto_4
    if-nez v4, :cond_c

    iget-object v4, v1, Lr3/a$a;->h:Lr3/a;

    invoke-virtual {v4, v1}, Lr3/a;->f(Lr3/a$a;)Z

    goto/16 :goto_1

    :cond_c
    const/4 v4, -0x1

    iput v4, v1, Lr3/a$a;->workerCtl:I

    :cond_d
    :goto_5
    iget-object v9, v1, Lr3/a$a;->nextParkedWorker:Ljava/lang/Object;

    sget-object v10, Lr3/a;->l:Lq3/r;

    if-eq v9, v10, :cond_e

    const/4 v9, 0x1

    goto :goto_6

    :cond_e
    const/4 v9, 0x0

    :goto_6
    if-eqz v9, :cond_1

    iget v9, v1, Lr3/a$a;->workerCtl:I

    if-ne v9, v4, :cond_1

    iget-object v9, v1, Lr3/a$a;->h:Lr3/a;

    invoke-virtual {v9}, Lr3/a;->isTerminated()Z

    move-result v9

    if-nez v9, :cond_1

    iget v9, v1, Lr3/a$a;->c:I

    if-ne v9, v5, :cond_f

    goto/16 :goto_1

    :cond_f
    invoke-virtual {v1, v8}, Lr3/a$a;->h(I)Z

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    iget-wide v9, v1, Lr3/a$a;->d:J

    cmp-long v11, v9, v6

    if-nez v11, :cond_10

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    iget-object v11, v1, Lr3/a$a;->h:Lr3/a;

    iget-wide v11, v11, Lr3/a;->d:J

    add-long/2addr v9, v11

    iput-wide v9, v1, Lr3/a$a;->d:J

    :cond_10
    iget-object v9, v1, Lr3/a$a;->h:Lr3/a;

    iget-wide v9, v9, Lr3/a;->d:J

    invoke-static {v9, v10}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    iget-wide v11, v1, Lr3/a$a;->d:J

    sub-long/2addr v9, v11

    cmp-long v11, v9, v6

    if-ltz v11, :cond_d

    iput-wide v6, v1, Lr3/a$a;->d:J

    iget-object v9, v1, Lr3/a$a;->h:Lr3/a;

    iget-object v10, v9, Lr3/a;->h:Lq3/p;

    monitor-enter v10

    :try_start_2
    invoke-virtual {v9}, Lr3/a;->isTerminated()Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_7

    :cond_11
    iget-wide v11, v9, Lr3/a;->controlState:J

    const-wide/32 v13, 0x1fffff

    and-long/2addr v11, v13

    long-to-int v12, v11

    iget v11, v9, Lr3/a;->b:I

    if-gt v12, v11, :cond_12

    goto :goto_7

    :cond_12
    sget-object v11, Lr3/a$a;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v11, v1, v4, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez v11, :cond_13

    :goto_7
    monitor-exit v10

    goto :goto_5

    :cond_13
    :try_start_3
    iget v11, v1, Lr3/a$a;->indexInArray:I

    invoke-virtual {v1, v0}, Lr3/a$a;->f(I)V

    invoke-virtual {v9, v1, v11, v0}, Lr3/a;->l(Lr3/a$a;II)V

    sget-object v12, Lr3/a;->j:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v12, v9}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    move-result-wide v15

    and-long v12, v15, v13

    long-to-int v13, v12

    if-eq v13, v11, :cond_14

    iget-object v12, v9, Lr3/a;->h:Lq3/p;

    invoke-virtual {v12, v13}, Lq3/p;->b(I)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v12, Lr3/a$a;

    iget-object v14, v9, Lr3/a;->h:Lq3/p;

    invoke-virtual {v14, v11, v12}, Lq3/p;->c(ILjava/lang/Object;)V

    invoke-virtual {v12, v11}, Lr3/a$a;->f(I)V

    invoke-virtual {v9, v12, v13, v11}, Lr3/a;->l(Lr3/a$a;II)V

    :cond_14
    iget-object v9, v9, Lr3/a;->h:Lq3/p;

    const/4 v11, 0x0

    invoke-virtual {v9, v13, v11}, Lq3/p;->c(ILjava/lang/Object;)V

    sget-object v9, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v10

    iput v5, v1, Lr3/a$a;->c:I

    goto/16 :goto_5

    :catchall_2
    move-exception v0

    monitor-exit v10

    throw v0

    :cond_15
    invoke-virtual {v1, v5}, Lr3/a$a;->h(I)Z

    return-void
.end method
