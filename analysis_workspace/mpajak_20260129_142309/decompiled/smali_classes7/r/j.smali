.class public final Lr/j;
.super Ljava/lang/Object;

# interfaces
.implements Lr/h$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lm0/a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/j$d;,
        Lr/j$a;,
        Lr/j$c;,
        Lr/j$e;,
        Lr/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr/h$a;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lr/j<",
        "*>;>;",
        "Lm0/a$d;"
    }
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:Lp/a;

.field public C:Lcom/bumptech/glide/load/data/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/data/d<",
            "*>;"
        }
    .end annotation
.end field

.field public volatile D:Lr/h;

.field public volatile E:Z

.field public volatile F:Z

.field public G:Z

.field public final b:Lr/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/i<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lm0/d$a;

.field public final e:Lr/j$d;

.field public final f:Landroidx/core/util/Pools$Pool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Lr/j<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final g:Lr/j$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/j$c<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:Lr/j$e;

.field public i:Lcom/bumptech/glide/d;

.field public j:Lp/f;

.field public k:Lcom/bumptech/glide/f;

.field public l:Lr/p;

.field public m:I

.field public n:I

.field public o:Lr/l;

.field public p:Lp/h;

.field public q:Lr/j$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/j$a<",
            "TR;>;"
        }
    .end annotation
.end field

.field public r:I

.field public s:I

.field public t:I

.field public u:J

.field public v:Z

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Thread;

.field public y:Lp/f;

.field public z:Lp/f;


# direct methods
.method public constructor <init>(Lr/j$d;Landroidx/core/util/Pools$Pool;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/j$d;",
            "Landroidx/core/util/Pools$Pool<",
            "Lr/j<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/i;

    invoke-direct {v0}, Lr/i;-><init>()V

    iput-object v0, p0, Lr/j;->b:Lr/i;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lr/j;->c:Ljava/util/ArrayList;

    new-instance v0, Lm0/d$a;

    invoke-direct {v0}, Lm0/d$a;-><init>()V

    iput-object v0, p0, Lr/j;->d:Lm0/d$a;

    new-instance v0, Lr/j$c;

    invoke-direct {v0}, Lr/j$c;-><init>()V

    iput-object v0, p0, Lr/j;->g:Lr/j$c;

    new-instance v0, Lr/j$e;

    invoke-direct {v0}, Lr/j$e;-><init>()V

    iput-object v0, p0, Lr/j;->h:Lr/j$e;

    iput-object p1, p0, Lr/j;->e:Lr/j$d;

    iput-object p2, p0, Lr/j;->f:Landroidx/core/util/Pools$Pool;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lr/j;->t:I

    iget-object v0, p0, Lr/j;->q:Lr/j$a;

    check-cast v0, Lr/n;

    invoke-virtual {v0, p0}, Lr/n;->i(Lr/j;)V

    return-void
.end method

.method public final b(Lp/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lp/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            "Ljava/lang/Exception;",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;",
            "Lp/a;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->b()V

    new-instance v0, Lr/r;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, Lr/r;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object p2

    iput-object p1, v0, Lr/r;->c:Lp/f;

    iput-object p4, v0, Lr/r;->d:Lp/a;

    iput-object p2, v0, Lr/r;->e:Ljava/lang/Class;

    iget-object p1, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lr/j;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    const/4 p1, 0x2

    iput p1, p0, Lr/j;->t:I

    iget-object p1, p0, Lr/j;->q:Lr/j$a;

    check-cast p1, Lr/n;

    invoke-virtual {p1, p0}, Lr/n;->i(Lr/j;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr/j;->m()V

    :goto_0
    return-void
.end method

.method public final c()Lm0/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lr/j;->d:Lm0/d$a;

    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lr/j;

    iget-object v0, p0, Lr/j;->k:Lcom/bumptech/glide/f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p1, Lr/j;->k:Lcom/bumptech/glide/f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lr/j;->r:I

    iget p1, p1, Lr/j;->r:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Lp/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lp/a;Lp/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;",
            "Lp/a;",
            "Lp/f;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lr/j;->y:Lp/f;

    iput-object p2, p0, Lr/j;->A:Ljava/lang/Object;

    iput-object p3, p0, Lr/j;->C:Lcom/bumptech/glide/load/data/d;

    iput-object p4, p0, Lr/j;->B:Lp/a;

    iput-object p5, p0, Lr/j;->z:Lp/f;

    iget-object p2, p0, Lr/j;->b:Lr/i;

    invoke-virtual {p2}, Lr/i;->a()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, Lr/j;->G:Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lr/j;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    const/4 p1, 0x3

    iput p1, p0, Lr/j;->t:I

    iget-object p1, p0, Lr/j;->q:Lr/j$a;

    check-cast p1, Lr/n;

    invoke-virtual {p1, p0}, Lr/n;->i(Lr/j;)V

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lr/j;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    throw p1
.end method

.method public final e(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;Lp/a;)Lr/w;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;TData;",
            "Lp/a;",
            ")",
            "Lr/w<",
            "TR;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    return-object v0

    :cond_0
    :try_start_0
    sget v1, Ll0/f;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v1

    invoke-virtual {p0, p2, p3}, Lr/j;->f(Ljava/lang/Object;Lp/a;)Lr/w;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v3, 0x2

    invoke-static {p3, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Decoded result "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, v1, v2, v0}, Lr/j;->j(Ljava/lang/String;JLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    throw p2
.end method

.method public final f(Ljava/lang/Object;Lp/a;)Lr/w;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lp/a;",
            ")",
            "Lr/w<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lr/j;->b:Lr/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lr/i;->d(Ljava/lang/Class;)Lr/u;

    move-result-object v2

    iget-object v0, p0, Lr/j;->p:Lp/h;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-ge v1, v3, :cond_0

    goto :goto_2

    :cond_0
    sget-object v1, Lp/a;->e:Lp/a;

    if-eq p2, v1, :cond_2

    iget-object v1, p0, Lr/j;->b:Lr/i;

    iget-boolean v1, v1, Lr/i;->r:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    sget-object v3, Ly/m;->i:Lp/g;

    invoke-virtual {v0, v3}, Lp/h;->c(Lp/g;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz v1, :cond_4

    :cond_3
    :goto_2
    move-object v4, v0

    goto :goto_3

    :cond_4
    new-instance v0, Lp/h;

    invoke-direct {v0}, Lp/h;-><init>()V

    iget-object v4, p0, Lr/j;->p:Lp/h;

    invoke-virtual {v0, v4}, Lp/h;->d(Lp/h;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v4, v0, Lp/h;->b:Ll0/b;

    invoke-virtual {v4, v3, v1}, Ll0/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lr/j;->i:Lcom/bumptech/glide/d;

    iget-object v0, v0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/g;

    iget-object v0, v0, Lcom/bumptech/glide/g;->e:Lcom/bumptech/glide/load/data/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lcom/bumptech/glide/load/data/f;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/load/data/e$a;

    if-nez v1, :cond_6

    iget-object v3, v0, Lcom/bumptech/glide/load/data/f;->a:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/bumptech/glide/load/data/e$a;

    invoke-interface {v5}, Lcom/bumptech/glide/load/data/e$a;->a()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object v1, v5

    :cond_6
    if-nez v1, :cond_7

    sget-object v1, Lcom/bumptech/glide/load/data/f;->b:Lcom/bumptech/glide/load/data/f$a;

    :cond_7
    invoke-interface {v1, p1}, Lcom/bumptech/glide/load/data/e$a;->b(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    :try_start_1
    iget v5, p0, Lr/j;->m:I

    iget v6, p0, Lr/j;->n:I

    new-instance v7, Lr/j$b;

    invoke-direct {v7, p0, p2}, Lr/j$b;-><init>(Lr/j;Lp/a;)V

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lr/u;->a(Lcom/bumptech/glide/load/data/e;Lp/h;IILr/k$a;)Lr/w;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->b()V

    throw p2

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final g()V
    .locals 13

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Retrieved data"

    iget-wide v1, p0, Lr/j;->u:J

    const-string v3, "data: "

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lr/j;->A:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", cache key: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lr/j;->y:Lp/f;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", fetcher: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lr/j;->C:Lcom/bumptech/glide/load/data/d;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lr/j;->j(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lr/j;->C:Lcom/bumptech/glide/load/data/d;

    iget-object v2, p0, Lr/j;->A:Ljava/lang/Object;

    iget-object v3, p0, Lr/j;->B:Lp/a;

    invoke-virtual {p0, v1, v2, v3}, Lr/j;->e(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;Lp/a;)Lr/w;

    move-result-object v1
    :try_end_0
    .catch Lr/r; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lr/j;->z:Lp/f;

    iget-object v3, p0, Lr/j;->B:Lp/a;

    iput-object v2, v1, Lr/r;->c:Lp/f;

    iput-object v3, v1, Lr/r;->d:Lp/a;

    iput-object v0, v1, Lr/r;->e:Ljava/lang/Class;

    iget-object v2, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_c

    iget-object v2, p0, Lr/j;->B:Lp/a;

    iget-boolean v3, p0, Lr/j;->G:Z

    instance-of v4, v1, Lr/s;

    if-eqz v4, :cond_1

    move-object v4, v1

    check-cast v4, Lr/s;

    invoke-interface {v4}, Lr/s;->a()V

    :cond_1
    iget-object v4, p0, Lr/j;->g:Lr/j$c;

    iget-object v4, v4, Lr/j$c;->c:Lr/v;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    invoke-static {v1}, Lr/v;->a(Lr/w;)Lr/v;

    move-result-object v0

    move-object v1, v0

    :cond_3
    invoke-virtual {p0}, Lr/j;->o()V

    iget-object v4, p0, Lr/j;->q:Lr/j$a;

    check-cast v4, Lr/n;

    monitor-enter v4

    :try_start_1
    iput-object v1, v4, Lr/n;->r:Lr/w;

    iput-object v2, v4, Lr/n;->s:Lp/a;

    iput-boolean v3, v4, Lr/n;->z:Z

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    monitor-enter v4

    :try_start_2
    iget-object v1, v4, Lr/n;->c:Lm0/d$a;

    invoke-virtual {v1}, Lm0/d$a;->a()V

    iget-boolean v1, v4, Lr/n;->y:Z

    if-eqz v1, :cond_4

    iget-object v1, v4, Lr/n;->r:Lr/w;

    invoke-interface {v1}, Lr/w;->recycle()V

    invoke-virtual {v4}, Lr/n;->g()V

    monitor-exit v4

    goto :goto_3

    :cond_4
    iget-object v1, v4, Lr/n;->b:Lr/n$e;

    invoke-virtual {v1}, Lr/n$e;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    iget-boolean v1, v4, Lr/n;->t:Z

    if-nez v1, :cond_a

    iget-object v1, v4, Lr/n;->f:Lr/n$c;

    iget-object v8, v4, Lr/n;->r:Lr/w;

    iget-boolean v9, v4, Lr/n;->n:Z

    iget-object v11, v4, Lr/n;->m:Lp/f;

    iget-object v12, v4, Lr/n;->d:Lr/q$a;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lr/q;

    const/4 v10, 0x1

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Lr/q;-><init>(Lr/w;ZZLp/f;Lr/q$a;)V

    iput-object v1, v4, Lr/n;->w:Lr/q;

    iput-boolean v6, v4, Lr/n;->t:Z

    iget-object v1, v4, Lr/n;->b:Lr/n$e;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v1, v1, Lr/n$e;->b:Ljava/util/List;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v6

    invoke-virtual {v4, v1}, Lr/n;->e(I)V

    iget-object v1, v4, Lr/n;->m:Lp/f;

    iget-object v3, v4, Lr/n;->w:Lr/q;

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    iget-object v7, v4, Lr/n;->g:Lr/o;

    check-cast v7, Lr/m;

    invoke-virtual {v7, v4, v1, v3}, Lr/m;->e(Lr/n;Lp/f;Lr/q;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/n$d;

    iget-object v3, v2, Lr/n$d;->b:Ljava/util/concurrent/Executor;

    new-instance v7, Lr/n$b;

    iget-object v2, v2, Lr/n$d;->a:Lh0/g;

    invoke-direct {v7, v4, v2}, Lr/n$b;-><init>(Lr/n;Lh0/g;)V

    invoke-interface {v3, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Lr/n;->d()V

    :goto_3
    const/4 v1, 0x5

    iput v1, p0, Lr/j;->s:I

    :try_start_3
    iget-object v1, p0, Lr/j;->g:Lr/j$c;

    iget-object v2, v1, Lr/j$c;->c:Lr/v;

    if-eqz v2, :cond_6

    const/4 v5, 0x1

    :cond_6
    if-eqz v5, :cond_7

    iget-object v2, p0, Lr/j;->e:Lr/j$d;

    iget-object v3, p0, Lr/j;->p:Lp/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    check-cast v2, Lr/m$c;

    invoke-virtual {v2}, Lr/m$c;->a()Lt/a;

    move-result-object v2

    iget-object v4, v1, Lr/j$c;->a:Lp/f;

    new-instance v5, Lr/g;

    iget-object v7, v1, Lr/j$c;->b:Lp/k;

    iget-object v8, v1, Lr/j$c;->c:Lr/v;

    invoke-direct {v5, v7, v8, v3}, Lr/g;-><init>(Lp/d;Ljava/lang/Object;Lp/h;)V

    invoke-interface {v2, v4, v5}, Lt/a;->b(Lp/f;Lt/a$b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, v1, Lr/j$c;->c:Lr/v;

    invoke-virtual {v1}, Lr/v;->d()V

    goto :goto_4

    :catchall_0
    move-exception v2

    iget-object v1, v1, Lr/j$c;->c:Lr/v;

    invoke-virtual {v1}, Lr/v;->d()V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_7
    :goto_4
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lr/v;->d()V

    :cond_8
    iget-object v0, p0, Lr/j;->h:Lr/j$e;

    monitor-enter v0

    :try_start_6
    iput-boolean v6, v0, Lr/j$e;->b:Z

    invoke-virtual {v0}, Lr/j$e;->a()Z

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit v0

    if-eqz v1, :cond_d

    invoke-virtual {p0}, Lr/j;->l()V

    goto :goto_5

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lr/v;->d()V

    :cond_9
    throw v1

    :cond_a
    :try_start_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already have resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_3
    move-exception v0

    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :catchall_4
    move-exception v0

    :try_start_8
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    throw v0

    :cond_c
    invoke-virtual {p0}, Lr/j;->m()V

    :cond_d
    :goto_5
    return-void
.end method

.method public final h()Lr/h;
    .locals 3

    iget v0, p0, Lr/j;->s:I

    invoke-static {v0}, Lf/h;->a(I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unrecognized stage: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lr/j;->s:I

    invoke-static {v2}, Landroidx/appcompat/view/a;->i(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lr/b0;

    iget-object v1, p0, Lr/j;->b:Lr/i;

    invoke-direct {v0, v1, p0}, Lr/b0;-><init>(Lr/i;Lr/h$a;)V

    return-object v0

    :cond_2
    new-instance v0, Lr/e;

    iget-object v1, p0, Lr/j;->b:Lr/i;

    invoke-direct {v0, v1, p0}, Lr/e;-><init>(Lr/i;Lr/h$a;)V

    return-object v0

    :cond_3
    new-instance v0, Lr/x;

    iget-object v1, p0, Lr/j;->b:Lr/i;

    invoke-direct {v0, v1, p0}, Lr/x;-><init>(Lr/i;Lr/h$a;)V

    return-object v0
.end method

.method public final i(I)I
    .locals 4

    if-eqz p1, :cond_8

    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v0, v2, :cond_4

    const/4 v2, 0x6

    if-eq v0, v1, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unrecognized stage: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Landroidx/appcompat/view/a;->i(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v2

    :cond_2
    iget-boolean p1, p0, Lr/j;->v:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    :goto_1
    return v2

    :cond_4
    iget-object p1, p0, Lr/j;->o:Lr/l;

    invoke-virtual {p1}, Lr/l;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v3}, Lr/j;->i(I)I

    move-result v3

    :goto_2
    return v3

    :cond_6
    iget-object p1, p0, Lr/j;->o:Lr/l;

    invoke-virtual {p1}, Lr/l;->b()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p0, v1}, Lr/j;->i(I)I

    move-result v1

    :goto_3
    return v1

    :cond_8
    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    const-string v0, " in "

    invoke-static {p1, v0}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {p2, p3}, Ll0/f;->a(J)D

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p2, ", load key: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lr/j;->l:Lr/p;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    const-string p2, ", "

    invoke-static {p2, p4}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", thread: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final k()V
    .locals 6

    invoke-virtual {p0}, Lr/j;->o()V

    new-instance v0, Lr/r;

    const-string v1, "Failed to load resource"

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1, v2}, Lr/r;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lr/j;->q:Lr/j$a;

    check-cast v1, Lr/n;

    monitor-enter v1

    :try_start_0
    iput-object v0, v1, Lr/n;->u:Lr/r;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-enter v1

    :try_start_1
    iget-object v0, v1, Lr/n;->c:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-boolean v0, v1, Lr/n;->y:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lr/n;->g()V

    monitor-exit v1

    goto :goto_1

    :cond_0
    iget-object v0, v1, Lr/n;->b:Lr/n$e;

    invoke-virtual {v0}, Lr/n$e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, v1, Lr/n;->v:Z

    if-nez v0, :cond_3

    iput-boolean v2, v1, Lr/n;->v:Z

    iget-object v0, v1, Lr/n;->m:Lp/f;

    iget-object v3, v1, Lr/n;->b:Lr/n$e;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Lr/n$e;->b:Ljava/util/List;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Lr/n;->e(I)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, v1, Lr/n;->g:Lr/o;

    const/4 v5, 0x0

    check-cast v3, Lr/m;

    invoke-virtual {v3, v1, v0, v5}, Lr/m;->e(Lr/n;Lp/f;Lr/q;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr/n$d;

    iget-object v4, v3, Lr/n$d;->b:Ljava/util/concurrent/Executor;

    new-instance v5, Lr/n$a;

    iget-object v3, v3, Lr/n$d;->a:Lh0/g;

    invoke-direct {v5, v1, v3}, Lr/n$a;-><init>(Lr/n;Lh0/g;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lr/n;->d()V

    :goto_1
    iget-object v0, p0, Lr/j;->h:Lr/j$e;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, Lr/j$e;->c:Z

    invoke-virtual {v0}, Lr/j$e;->a()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lr/j;->l()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Already failed once"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, Lr/j;->h:Lr/j$e;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, v0, Lr/j$e;->b:Z

    iput-boolean v1, v0, Lr/j$e;->a:Z

    iput-boolean v1, v0, Lr/j$e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lr/j;->g:Lr/j$c;

    const/4 v2, 0x0

    iput-object v2, v0, Lr/j$c;->a:Lp/f;

    iput-object v2, v0, Lr/j$c;->b:Lp/k;

    iput-object v2, v0, Lr/j$c;->c:Lr/v;

    iget-object v0, p0, Lr/j;->b:Lr/i;

    iput-object v2, v0, Lr/i;->c:Lcom/bumptech/glide/d;

    iput-object v2, v0, Lr/i;->d:Ljava/lang/Object;

    iput-object v2, v0, Lr/i;->n:Lp/f;

    iput-object v2, v0, Lr/i;->g:Ljava/lang/Class;

    iput-object v2, v0, Lr/i;->k:Ljava/lang/Class;

    iput-object v2, v0, Lr/i;->i:Lp/h;

    iput-object v2, v0, Lr/i;->o:Lcom/bumptech/glide/f;

    iput-object v2, v0, Lr/i;->j:Ljava/util/Map;

    iput-object v2, v0, Lr/i;->p:Lr/l;

    iget-object v3, v0, Lr/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, Lr/i;->l:Z

    iget-object v3, v0, Lr/i;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, Lr/i;->m:Z

    iput-boolean v1, p0, Lr/j;->E:Z

    iput-object v2, p0, Lr/j;->i:Lcom/bumptech/glide/d;

    iput-object v2, p0, Lr/j;->j:Lp/f;

    iput-object v2, p0, Lr/j;->p:Lp/h;

    iput-object v2, p0, Lr/j;->k:Lcom/bumptech/glide/f;

    iput-object v2, p0, Lr/j;->l:Lr/p;

    iput-object v2, p0, Lr/j;->q:Lr/j$a;

    iput v1, p0, Lr/j;->s:I

    iput-object v2, p0, Lr/j;->D:Lr/h;

    iput-object v2, p0, Lr/j;->x:Ljava/lang/Thread;

    iput-object v2, p0, Lr/j;->y:Lp/f;

    iput-object v2, p0, Lr/j;->A:Ljava/lang/Object;

    iput-object v2, p0, Lr/j;->B:Lp/a;

    iput-object v2, p0, Lr/j;->C:Lcom/bumptech/glide/load/data/d;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lr/j;->u:J

    iput-boolean v1, p0, Lr/j;->F:Z

    iput-object v2, p0, Lr/j;->w:Ljava/lang/Object;

    iget-object v0, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lr/j;->f:Landroidx/core/util/Pools$Pool;

    invoke-interface {v0, p0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final m()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lr/j;->x:Ljava/lang/Thread;

    sget v0, Ll0/f;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    iput-wide v0, p0, Lr/j;->u:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, Lr/j;->F:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lr/j;->D:Lr/h;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lr/j;->D:Lr/h;

    invoke-interface {v0}, Lr/h;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget v1, p0, Lr/j;->s:I

    invoke-virtual {p0, v1}, Lr/j;->i(I)I

    move-result v1

    iput v1, p0, Lr/j;->s:I

    invoke-virtual {p0}, Lr/j;->h()Lr/h;

    move-result-object v1

    iput-object v1, p0, Lr/j;->D:Lr/h;

    iget v1, p0, Lr/j;->s:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lr/j;->t:I

    iget-object v0, p0, Lr/j;->q:Lr/j$a;

    check-cast v0, Lr/n;

    invoke-virtual {v0, p0}, Lr/n;->i(Lr/j;)V

    return-void

    :cond_1
    iget v1, p0, Lr/j;->s:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Lr/j;->F:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lr/j;->k()V

    :cond_3
    return-void
.end method

.method public final n()V
    .locals 3

    iget v0, p0, Lr/j;->t:I

    invoke-static {v0}, Lf/h;->a(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lr/j;->g()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unrecognized run reason: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lr/j;->t:I

    invoke-static {v2}, Landroidx/activity/d;->k(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0, v1}, Lr/j;->i(I)I

    move-result v0

    iput v0, p0, Lr/j;->s:I

    invoke-virtual {p0}, Lr/j;->h()Lr/h;

    move-result-object v0

    iput-object v0, p0, Lr/j;->D:Lr/h;

    :cond_2
    invoke-virtual {p0}, Lr/j;->m()V

    :goto_0
    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lr/j;->d:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-boolean v0, p0, Lr/j;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, Lr/j;->E:Z

    return-void
.end method

.method public final run()V
    .locals 5

    const-string v0, "DecodeJob"

    iget-object v1, p0, Lr/j;->C:Lcom/bumptech/glide/load/data/d;

    :try_start_0
    iget-boolean v2, p0, Lr/j;->F:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lr/j;->k()V
    :try_end_0
    .catch Lr/d; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_0
    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lr/j;->n()V
    :try_end_1
    .catch Lr/d; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_2
    return-void

    :goto_0
    const/4 v3, 0x3

    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lr/j;->F:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", stage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lr/j;->s:I

    invoke-static {v4}, Landroidx/appcompat/view/a;->i(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_3
    :goto_1
    iget v0, p0, Lr/j;->s:I

    const/4 v3, 0x5

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lr/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lr/j;->k()V

    :cond_4
    iget-boolean v0, p0, Lr/j;->F:Z

    if-nez v0, :cond_5

    throw v2

    :cond_5
    throw v2

    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    if-eqz v1, :cond_6

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_6
    throw v0
.end method
