.class public final Lz3/q$a;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final b:Lf4/f;

.field public c:Z

.field public d:Z

.field public final synthetic e:Lz3/q;


# direct methods
.method public constructor <init>(Lz3/q;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    iput-object p1, p0, Lz3/q$a;->e:Lz3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lz3/q$a;->d:Z

    new-instance p1, Lf4/f;

    invoke-direct {p1}, Lf4/f;-><init>()V

    iput-object p1, p0, Lz3/q$a;->b:Lf4/f;

    return-void
.end method


# virtual methods
.method public final T(Lf4/f;J)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt3/c;->a:[B

    iget-object v0, p0, Lz3/q$a;->b:Lf4/f;

    invoke-virtual {v0, p1, p2, p3}, Lf4/f;->T(Lf4/f;J)V

    :goto_0
    iget-object p1, p0, Lz3/q$a;->b:Lf4/f;

    iget-wide p1, p1, Lf4/f;->c:J

    const-wide/16 v0, 0x4000

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lz3/q$a;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 12

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v1, v1, Lz3/q;->j:Lz3/q$c;

    invoke-virtual {v1}, Lf4/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    :try_start_1
    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    iget-wide v2, v1, Lz3/q;->c:J

    iget-wide v4, v1, Lz3/q;->d:J

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    iget-boolean v2, p0, Lz3/q$a;->d:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lz3/q$a;->c:Z

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lz3/q;->f()Lz3/b;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    invoke-virtual {v1}, Lz3/q;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v1, v1, Lz3/q;->j:Lz3/q$c;

    invoke-virtual {v1}, Lz3/q$c;->m()V

    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    invoke-virtual {v1}, Lz3/q;->b()V

    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    iget-wide v2, v1, Lz3/q;->d:J

    iget-wide v4, v1, Lz3/q;->c:J

    sub-long/2addr v2, v4

    iget-object v1, p0, Lz3/q$a;->b:Lf4/f;

    iget-wide v4, v1, Lf4/f;->c:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    iget-wide v2, v1, Lz3/q;->c:J

    add-long/2addr v2, v10

    iput-wide v2, v1, Lz3/q;->c:J

    if-eqz p1, :cond_1

    iget-object p1, p0, Lz3/q$a;->b:Lf4/f;

    iget-wide v2, p1, Lf4/f;->c:J

    cmp-long p1, v10, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    const/4 v8, 0x0

    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v0

    iget-object p1, v1, Lz3/q;->j:Lz3/q$c;

    invoke-virtual {p1}, Lf4/c;->i()V

    :try_start_3
    iget-object p1, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v6, p1, Lz3/q;->n:Lz3/f;

    iget v7, p1, Lz3/q;->m:I

    iget-object v9, p0, Lz3/q$a;->b:Lf4/f;

    invoke-virtual/range {v6 .. v11}, Lz3/f;->p(IZLf4/f;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object p1, p0, Lz3/q$a;->e:Lz3/q;

    iget-object p1, p1, Lz3/q;->j:Lz3/q$c;

    invoke-virtual {p1}, Lz3/q$c;->m()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v0, v0, Lz3/q;->j:Lz3/q$c;

    invoke-virtual {v0}, Lz3/q$c;->m()V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_4
    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v1, v1, Lz3/q;->j:Lz3/q$c;

    invoke-virtual {v1}, Lz3/q$c;->m()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final close()V
    .locals 14

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    sget-object v1, Lt3/c;->a:[B

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lz3/q$a;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    invoke-virtual {v1}, Lz3/q;->f()Lz3/b;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v4, v0, Lz3/q;->h:Lz3/q$a;

    iget-boolean v4, v4, Lz3/q$a;->d:Z

    if-nez v4, :cond_4

    iget-object v4, p0, Lz3/q$a;->b:Lf4/f;

    iget-wide v4, v4, Lf4/f;->c:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_2

    const/4 v2, 0x1

    :cond_2
    if-eqz v2, :cond_3

    :goto_1
    iget-object v0, p0, Lz3/q$a;->b:Lf4/f;

    iget-wide v0, v0, Lf4/f;->c:J

    cmp-long v2, v0, v6

    if-lez v2, :cond_4

    invoke-virtual {p0, v3}, Lz3/q$a;->a(Z)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    iget-object v8, v0, Lz3/q;->n:Lz3/f;

    iget v9, v0, Lz3/q;->m:I

    const/4 v10, 0x1

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    invoke-virtual/range {v8 .. v13}, Lz3/f;->p(IZLf4/f;J)V

    :cond_4
    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    monitor-enter v0

    :try_start_2
    iput-boolean v3, p0, Lz3/q$a;->c:Z

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v0, v0, Lz3/q;->n:Lz3/f;

    invoke-virtual {v0}, Lz3/f;->flush()V

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    invoke-virtual {v0}, Lz3/q;->a()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final flush()V
    .locals 5

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    sget-object v1, Lt3/c;->a:[B

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz3/q$a;->e:Lz3/q;

    invoke-virtual {v1}, Lz3/q;->b()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_0
    iget-object v0, p0, Lz3/q$a;->b:Lf4/f;

    iget-wide v0, v0, Lf4/f;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz3/q$a;->a(Z)V

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v0, v0, Lz3/q;->n:Lz3/f;

    invoke-virtual {v0}, Lz3/f;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lz3/q$a;->e:Lz3/q;

    iget-object v0, v0, Lz3/q;->j:Lz3/q$c;

    return-object v0
.end method
