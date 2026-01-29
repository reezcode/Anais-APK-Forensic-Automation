.class public final Lr/n$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final b:Lh0/g;

.field public final synthetic c:Lr/n;


# direct methods
.method public constructor <init>(Lr/n;Lh0/g;)V
    .locals 0

    iput-object p1, p0, Lr/n$b;->c:Lr/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/n$b;->b:Lh0/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lr/n$b;->b:Lh0/g;

    check-cast v0, Lh0/h;

    iget-object v1, v0, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {v1}, Lm0/d$a;->a()V

    iget-object v0, v0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lr/n$b;->c:Lr/n;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v2, p0, Lr/n$b;->c:Lr/n;

    iget-object v2, v2, Lr/n;->b:Lr/n$e;

    iget-object v3, p0, Lr/n$b;->b:Lh0/g;

    iget-object v2, v2, Lr/n$e;->b:Ljava/util/List;

    new-instance v4, Lr/n$d;

    sget-object v5, Ll0/e;->b:Ll0/e$b;

    invoke-direct {v4, v3, v5}, Lr/n$d;-><init>(Lh0/g;Ljava/util/concurrent/Executor;)V

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lr/n$b;->c:Lr/n;

    iget-object v2, v2, Lr/n;->w:Lr/q;

    invoke-virtual {v2}, Lr/q;->a()V

    iget-object v2, p0, Lr/n$b;->c:Lr/n;

    iget-object v3, p0, Lr/n$b;->b:Lh0/g;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v4, v2, Lr/n;->w:Lr/q;

    iget-object v5, v2, Lr/n;->s:Lp/a;

    iget-boolean v2, v2, Lr/n;->z:Z

    check-cast v3, Lh0/h;

    invoke-virtual {v3, v4, v5, v2}, Lh0/h;->p(Lr/w;Lp/a;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v2, p0, Lr/n$b;->c:Lr/n;

    iget-object v3, p0, Lr/n$b;->b:Lh0/g;

    invoke-virtual {v2, v3}, Lr/n;->h(Lh0/g;)V

    goto :goto_0

    :catchall_0
    move-exception v2

    new-instance v3, Lr/d;

    invoke-direct {v3, v2}, Lr/d;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :cond_0
    :goto_0
    iget-object v2, p0, Lr/n$b;->c:Lr/n;

    invoke-virtual {v2}, Lr/n;->d()V

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    :catchall_1
    move-exception v2

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v2

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method
