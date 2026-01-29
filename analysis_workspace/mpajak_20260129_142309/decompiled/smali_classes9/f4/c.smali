.class public Lf4/c;
.super Lf4/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/c$b;,
        Lf4/c$a;
    }
.end annotation


# static fields
.field public static final h:J

.field public static final i:J

.field public static j:Lf4/c;

.field public static final k:Lf4/c$a;


# instance fields
.field public e:Z

.field public f:Lf4/c;

.field public g:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf4/c$a;

    invoke-direct {v0}, Lf4/c$a;-><init>()V

    sput-object v0, Lf4/c;->k:Lf4/c$a;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lf4/c;->h:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lf4/c;->i:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf4/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public final i()V
    .locals 9

    iget-boolean v0, p0, Lf4/c;->e:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_8

    iget-wide v2, p0, Lf4/b0;->c:J

    iget-boolean v0, p0, Lf4/b0;->a:Z

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean v1, p0, Lf4/c;->e:Z

    const-class v1, Lf4/c;

    monitor-enter v1

    :try_start_0
    sget-object v4, Lf4/c;->j:Lf4/c;

    if-nez v4, :cond_1

    new-instance v4, Lf4/c;

    invoke-direct {v4}, Lf4/c;-><init>()V

    sput-object v4, Lf4/c;->j:Lf4/c;

    new-instance v4, Lf4/c$b;

    invoke-direct {v4}, Lf4/c$b;-><init>()V

    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    if-eqz v6, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lf4/b0;->c()J

    move-result-wide v6

    sub-long/2addr v6, v4

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_0

    :cond_2
    if-eqz v6, :cond_3

    :goto_0
    add-long/2addr v2, v4

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lf4/b0;->c()J

    move-result-wide v2

    :goto_1
    iput-wide v2, p0, Lf4/c;->g:J

    sub-long/2addr v2, v4

    sget-object v0, Lf4/c;->j:Lf4/c;

    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v6, v0, Lf4/c;->f:Lf4/c;

    if-eqz v6, :cond_5

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-wide v6, v6, Lf4/c;->g:J

    sub-long/2addr v6, v4

    cmp-long v8, v2, v6

    if-gez v8, :cond_4

    goto :goto_3

    :cond_4
    iget-object v0, v0, Lf4/c;->f:Lf4/c;

    goto :goto_2

    :cond_5
    :goto_3
    iget-object v2, v0, Lf4/c;->f:Lf4/c;

    iput-object v2, p0, Lf4/c;->f:Lf4/c;

    iput-object p0, v0, Lf4/c;->f:Lf4/c;

    sget-object v2, Lf4/c;->j:Lf4/c;

    if-ne v0, v2, :cond_6

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    :cond_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :cond_7
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_8
    const-string v0, "Unbalanced enter/exit"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final j()Z
    .locals 4

    iget-boolean v0, p0, Lf4/c;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iput-boolean v1, p0, Lf4/c;->e:Z

    const-class v0, Lf4/c;

    monitor-enter v0

    :try_start_0
    sget-object v2, Lf4/c;->j:Lf4/c;

    :goto_0
    if-eqz v2, :cond_2

    iget-object v3, v2, Lf4/c;->f:Lf4/c;

    if-ne v3, p0, :cond_1

    iget-object v3, p0, Lf4/c;->f:Lf4/c;

    iput-object v3, v2, Lf4/c;->f:Lf4/c;

    const/4 v2, 0x0

    iput-object v2, p0, Lf4/c;->f:Lf4/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    move-object v2, v3

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public k(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public l()V
    .locals 0

    return-void
.end method
