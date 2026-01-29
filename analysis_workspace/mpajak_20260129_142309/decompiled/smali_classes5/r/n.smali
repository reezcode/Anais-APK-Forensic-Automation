.class public final Lr/n;
.super Ljava/lang/Object;

# interfaces
.implements Lr/j$a;
.implements Lm0/a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/n$c;,
        Lr/n$d;,
        Lr/n$e;,
        Lr/n$b;,
        Lr/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr/j$a<",
        "TR;>;",
        "Lm0/a$d;"
    }
.end annotation


# static fields
.field public static final A:Lr/n$c;


# instance fields
.field public final b:Lr/n$e;

.field public final c:Lm0/d$a;

.field public final d:Lr/q$a;

.field public final e:Landroidx/core/util/Pools$Pool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Lr/n<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final f:Lr/n$c;

.field public final g:Lr/o;

.field public final h:Lu/a;

.field public final i:Lu/a;

.field public final j:Lu/a;

.field public final k:Lu/a;

.field public final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field public m:Lp/f;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Lr/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/w<",
            "*>;"
        }
    .end annotation
.end field

.field public s:Lp/a;

.field public t:Z

.field public u:Lr/r;

.field public v:Z

.field public w:Lr/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/q<",
            "*>;"
        }
    .end annotation
.end field

.field public x:Lr/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/j<",
            "TR;>;"
        }
    .end annotation
.end field

.field public volatile y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/n$c;

    invoke-direct {v0}, Lr/n$c;-><init>()V

    sput-object v0, Lr/n;->A:Lr/n$c;

    return-void
.end method

.method public constructor <init>(Lu/a;Lu/a;Lu/a;Lu/a;Lr/o;Lr/q$a;Landroidx/core/util/Pools$Pool;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu/a;",
            "Lu/a;",
            "Lu/a;",
            "Lu/a;",
            "Lr/o;",
            "Lr/q$a;",
            "Landroidx/core/util/Pools$Pool<",
            "Lr/n<",
            "*>;>;)V"
        }
    .end annotation

    sget-object v0, Lr/n;->A:Lr/n$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lr/n$e;

    invoke-direct {v1}, Lr/n$e;-><init>()V

    iput-object v1, p0, Lr/n;->b:Lr/n$e;

    new-instance v1, Lm0/d$a;

    invoke-direct {v1}, Lm0/d$a;-><init>()V

    iput-object v1, p0, Lr/n;->c:Lm0/d$a;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Lr/n;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lr/n;->h:Lu/a;

    iput-object p2, p0, Lr/n;->i:Lu/a;

    iput-object p3, p0, Lr/n;->j:Lu/a;

    iput-object p4, p0, Lr/n;->k:Lu/a;

    iput-object p5, p0, Lr/n;->g:Lr/o;

    iput-object p6, p0, Lr/n;->d:Lr/q$a;

    iput-object p7, p0, Lr/n;->e:Landroidx/core/util/Pools$Pool;

    iput-object v0, p0, Lr/n;->f:Lr/n$c;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lh0/g;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/n;->c:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-object v0, p0, Lr/n;->b:Lr/n$e;

    iget-object v0, v0, Lr/n$e;->b:Ljava/util/List;

    new-instance v1, Lr/n$d;

    invoke-direct {v1, p1, p2}, Lr/n$d;-><init>(Lh0/g;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lr/n;->t:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lr/n;->e(I)V

    new-instance v0, Lr/n$b;

    invoke-direct {v0, p0, p1}, Lr/n$b;-><init>(Lr/n;Lh0/g;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lr/n;->v:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lr/n;->e(I)V

    new-instance v0, Lr/n$a;

    invoke-direct {v0, p0, p1}, Lr/n$a;-><init>(Lr/n;Lh0/g;)V

    :goto_0
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_1
    iget-boolean p1, p0, Lr/n;->y:Z

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const-string p1, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {v1, p1}, Ll0/j;->a(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b()V
    .locals 4

    invoke-virtual {p0}, Lr/n;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lr/n;->y:Z

    iget-object v1, p0, Lr/n;->x:Lr/j;

    iput-boolean v0, v1, Lr/j;->F:Z

    iget-object v0, v1, Lr/j;->D:Lr/h;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lr/h;->cancel()V

    :cond_1
    iget-object v0, p0, Lr/n;->g:Lr/o;

    iget-object v1, p0, Lr/n;->m:Lp/f;

    check-cast v0, Lr/m;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lr/m;->a:Lr/t;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v3, p0, Lr/n;->q:Z

    invoke-virtual {v2, v3}, Lr/t;->c(Z)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final c()Lm0/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lr/n;->c:Lm0/d$a;

    return-object v0
.end method

.method public final d()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/n;->c:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    invoke-virtual {p0}, Lr/n;->f()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Ll0/j;->a(ZLjava/lang/String;)V

    iget-object v0, p0, Lr/n;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    invoke-static {v1, v2}, Ll0/j;->a(ZLjava/lang/String;)V

    if-nez v0, :cond_1

    iget-object v0, p0, Lr/n;->w:Lr/q;

    invoke-virtual {p0}, Lr/n;->g()V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lr/q;->c()V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized e(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lr/n;->f()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Ll0/j;->a(ZLjava/lang/String;)V

    iget-object v0, p0, Lr/n;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lr/n;->w:Lr/q;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lr/q;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lr/n;->v:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lr/n;->t:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lr/n;->y:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final declared-synchronized g()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/n;->m:Lp/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/n;->b:Lr/n$e;

    iget-object v0, v0, Lr/n$e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lr/n;->m:Lp/f;

    iput-object v0, p0, Lr/n;->w:Lr/q;

    iput-object v0, p0, Lr/n;->r:Lr/w;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lr/n;->v:Z

    iput-boolean v1, p0, Lr/n;->y:Z

    iput-boolean v1, p0, Lr/n;->t:Z

    iput-boolean v1, p0, Lr/n;->z:Z

    iget-object v1, p0, Lr/n;->x:Lr/j;

    iget-object v2, v1, Lr/j;->h:Lr/j$e;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x1

    :try_start_1
    iput-boolean v3, v2, Lr/j$e;->a:Z

    invoke-virtual {v2}, Lr/j$e;->a()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v2

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lr/j;->l()V

    :cond_0
    iput-object v0, p0, Lr/n;->x:Lr/j;

    iput-object v0, p0, Lr/n;->u:Lr/r;

    iput-object v0, p0, Lr/n;->s:Lp/a;

    iget-object v0, p0, Lr/n;->e:Landroidx/core/util/Pools$Pool;

    invoke-interface {v0, p0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized h(Lh0/g;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/n;->c:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-object v0, p0, Lr/n;->b:Lr/n$e;

    iget-object v0, v0, Lr/n$e;->b:Ljava/util/List;

    new-instance v1, Lr/n$d;

    sget-object v2, Ll0/e;->b:Ll0/e$b;

    invoke-direct {v1, p1, v2}, Lr/n$d;-><init>(Lh0/g;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lr/n;->b:Lr/n$e;

    invoke-virtual {p1}, Lr/n$e;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lr/n;->b()V

    iget-boolean p1, p0, Lr/n;->t:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lr/n;->v:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    iget-object p1, p0, Lr/n;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lr/n;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final i(Lr/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/j<",
            "*>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lr/n;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr/n;->j:Lu/a;

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lr/n;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/n;->k:Lu/a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lr/n;->i:Lu/a;

    :goto_0
    invoke-virtual {v0, p1}, Lu/a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
