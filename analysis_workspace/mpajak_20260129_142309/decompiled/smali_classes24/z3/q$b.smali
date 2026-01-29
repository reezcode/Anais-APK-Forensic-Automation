.class public final Lz3/q$b;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final b:Lf4/f;

.field public final c:Lf4/f;

.field public d:Z

.field public final e:J

.field public f:Z

.field public final synthetic g:Lz3/q;


# direct methods
.method public constructor <init>(Lz3/q;JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ)V"
        }
    .end annotation

    iput-object p1, p0, Lz3/q$b;->g:Lz3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lz3/q$b;->e:J

    iput-boolean p4, p0, Lz3/q$b;->f:Z

    new-instance p1, Lf4/f;

    invoke-direct {p1}, Lf4/f;-><init>()V

    iput-object p1, p0, Lz3/q$b;->b:Lf4/f;

    new-instance p1, Lf4/f;

    invoke-direct {p1}, Lf4/f;-><init>()V

    iput-object p1, p0, Lz3/q$b;->c:Lf4/f;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    iget-object v0, p0, Lz3/q$b;->g:Lz3/q;

    sget-object v1, Lt3/c;->a:[B

    iget-object v0, v0, Lz3/q;->n:Lz3/f;

    invoke-virtual {v0, p1, p2}, Lz3/f;->n(J)V

    return-void
.end method

.method public final close()V
    .locals 5

    iget-object v0, p0, Lz3/q$b;->g:Lz3/q;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lz3/q$b;->d:Z

    iget-object v1, p0, Lz3/q$b;->c:Lf4/f;

    iget-wide v2, v1, Lf4/f;->c:J

    invoke-virtual {v1}, Lf4/f;->a()V

    iget-object v1, p0, Lz3/q$b;->g:Lz3/q;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, 0x0

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    invoke-virtual {p0, v2, v3}, Lz3/q$b;->a(J)V

    :cond_0
    iget-object v0, p0, Lz3/q$b;->g:Lz3/q;

    invoke-virtual {v0}, Lz3/q;->a()V

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lz3/q$b;->g:Lz3/q;

    iget-object v0, v0, Lz3/q;->i:Lz3/q$c;

    return-object v0
.end method

.method public final u(Lf4/f;J)J
    .locals 11

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_a

    :goto_1
    const/4 v2, 0x0

    iget-object v3, p0, Lz3/q$b;->g:Lz3/q;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Lz3/q$b;->g:Lz3/q;

    iget-object v4, v4, Lz3/q;->i:Lz3/q$c;

    invoke-virtual {v4}, Lf4/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Lz3/q$b;->g:Lz3/q;

    invoke-virtual {v4}, Lz3/q;->f()Lz3/b;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v2, p0, Lz3/q$b;->g:Lz3/q;

    iget-object v2, v2, Lz3/q;->l:Ljava/io/IOException;

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    new-instance v2, Lz3/v;

    iget-object v4, p0, Lz3/q$b;->g:Lz3/q;

    invoke-virtual {v4}, Lz3/q;->f()Lz3/b;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v2, v4}, Lz3/v;-><init>(Lz3/b;)V

    :cond_2
    :goto_2
    iget-boolean v4, p0, Lz3/q$b;->d:Z

    if-nez v4, :cond_9

    iget-object v4, p0, Lz3/q$b;->c:Lf4/f;

    iget-wide v5, v4, Lf4/f;->c:J

    const-wide/16 v7, -0x1

    cmp-long v9, v5, v0

    if-lez v9, :cond_3

    invoke-static {p2, p3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {v4, p1, v0, v1}, Lf4/f;->u(Lf4/f;J)J

    move-result-wide v0

    iget-object v4, p0, Lz3/q$b;->g:Lz3/q;

    iget-wide v5, v4, Lz3/q;->a:J

    add-long/2addr v5, v0

    iput-wide v5, v4, Lz3/q;->a:J

    iget-wide v9, v4, Lz3/q;->b:J

    sub-long/2addr v5, v9

    if-nez v2, :cond_5

    iget-object v4, v4, Lz3/q;->n:Lz3/f;

    iget-object v4, v4, Lz3/f;->s:Lz3/u;

    invoke-virtual {v4}, Lz3/u;->a()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-long v9, v4

    cmp-long v4, v5, v9

    if-ltz v4, :cond_5

    iget-object v4, p0, Lz3/q$b;->g:Lz3/q;

    iget-object v9, v4, Lz3/q;->n:Lz3/f;

    iget v4, v4, Lz3/q;->m:I

    invoke-virtual {v9, v4, v5, v6}, Lz3/f;->s(IJ)V

    iget-object v4, p0, Lz3/q$b;->g:Lz3/q;

    iget-wide v5, v4, Lz3/q;->a:J

    iput-wide v5, v4, Lz3/q;->b:J

    goto :goto_3

    :cond_3
    iget-boolean v0, p0, Lz3/q$b;->f:Z

    if-nez v0, :cond_4

    if-nez v2, :cond_4

    iget-object v0, p0, Lz3/q$b;->g:Lz3/q;

    invoke-virtual {v0}, Lz3/q;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    move-wide v4, v7

    goto :goto_4

    :cond_4
    move-wide v0, v7

    :cond_5
    :goto_3
    const/4 v4, 0x0

    move-wide v4, v0

    const/4 v0, 0x0

    :goto_4
    :try_start_2
    iget-object v1, p0, Lz3/q$b;->g:Lz3/q;

    iget-object v1, v1, Lz3/q;->i:Lz3/q$c;

    invoke-virtual {v1}, Lz3/q$c;->m()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    if-eqz v0, :cond_6

    const-wide/16 v0, 0x0

    goto/16 :goto_1

    :cond_6
    cmp-long p1, v4, v7

    if-eqz p1, :cond_7

    invoke-virtual {p0, v4, v5}, Lz3/q$b;->a(J)V

    return-wide v4

    :cond_7
    if-nez v2, :cond_8

    return-wide v7

    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw v2

    :cond_9
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    :try_start_4
    iget-object p2, p0, Lz3/q$b;->g:Lz3/q;

    iget-object p2, p2, Lz3/q;->i:Lz3/q$c;

    invoke-virtual {p2}, Lz3/q$c;->m()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_a
    const-string p1, "byteCount < 0: "

    invoke-static {p1, p2, p3}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
