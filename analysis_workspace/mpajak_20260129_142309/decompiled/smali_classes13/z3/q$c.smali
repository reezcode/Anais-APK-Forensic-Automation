.class public final Lz3/q$c;
.super Lf4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic l:Lz3/q;


# direct methods
.method public constructor <init>(Lz3/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lz3/q$c;->l:Lz3/q;

    invoke-direct {p0}, Lf4/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final k(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final l()V
    .locals 6

    iget-object v0, p0, Lz3/q$c;->l:Lz3/q;

    sget-object v1, Lz3/b;->h:Lz3/b;

    invoke-virtual {v0, v1}, Lz3/q;->e(Lz3/b;)V

    iget-object v0, p0, Lz3/q$c;->l:Lz3/q;

    iget-object v0, v0, Lz3/q;->n:Lz3/f;

    monitor-enter v0

    :try_start_0
    iget-wide v1, v0, Lz3/f;->q:J

    iget-wide v3, v0, Lz3/f;->p:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    monitor-exit v0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x1

    add-long/2addr v3, v1

    :try_start_1
    iput-wide v3, v0, Lz3/f;->p:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const v3, 0x3b9aca00

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v0, Lz3/f;->r:J

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v1, v0, Lz3/f;->j:Lv3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lz3/f;->e:Ljava/lang/String;

    const-string v4, " ping"

    invoke-static {v2, v3, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    new-instance v5, Lz3/n;

    invoke-direct {v5, v2, v0}, Lz3/n;-><init>(Ljava/lang/String;Lz3/f;)V

    invoke-virtual {v1, v5, v3, v4}, Lv3/c;->c(Lv3/a;J)V

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final m()V
    .locals 2

    invoke-virtual {p0}, Lf4/c;->j()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
