.class public final Lr/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/c$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Ljava/util/HashMap;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lp/f;",
            "Lr/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Lr/q<",
            "*>;>;"
        }
    .end annotation
.end field

.field public d:Lr/q$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lr/a;

    invoke-direct {v0}, Lr/a;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lr/c;->b:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v1, p0, Lr/c;->c:Ljava/lang/ref/ReferenceQueue;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lr/c;->a:Z

    new-instance v1, Lr/b;

    invoke-direct {v1, p0}, Lr/b;-><init>(Lr/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lp/f;Lr/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            "Lr/q<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lr/c$a;

    iget-object v1, p0, Lr/c;->c:Ljava/lang/ref/ReferenceQueue;

    iget-boolean v2, p0, Lr/c;->a:Z

    invoke-direct {v0, p1, p2, v1, v2}, Lr/c$a;-><init>(Lp/f;Lr/q;Ljava/lang/ref/ReferenceQueue;Z)V

    iget-object p2, p0, Lr/c;->b:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/c$a;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    iput-object p2, p1, Lr/c$a;->c:Lr/w;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V
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

.method public final b(Lr/c$a;)V
    .locals 7
    .param p1    # Lr/c$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/c;->b:Ljava/util/HashMap;

    iget-object v1, p1, Lr/c$a;->a:Lp/f;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p1, Lr/c$a;->b:Z

    if-eqz v0, :cond_1

    iget-object v2, p1, Lr/c$a;->c:Lr/w;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lr/q;

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v5, p1, Lr/c$a;->a:Lp/f;

    iget-object v6, p0, Lr/c;->d:Lr/q$a;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lr/q;-><init>(Lr/w;ZZLp/f;Lr/q$a;)V

    iget-object v1, p0, Lr/c;->d:Lr/q$a;

    iget-object p1, p1, Lr/c$a;->a:Lp/f;

    invoke-interface {v1, p1, v0}, Lr/q$a;->a(Lp/f;Lr/q;)V

    return-void

    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
