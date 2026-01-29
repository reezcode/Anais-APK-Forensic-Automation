.class public final Lr0/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lr0/f;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr0/b$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lp0/a;

.field public final synthetic e:Lr0/b;


# virtual methods
.method public final a()V
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {v0}, Ls0/e;->b(Landroid/os/Handler;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()V
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {v0}, Ls0/e;->b(Landroid/os/Handler;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lr0/b$a;->d:Lp0/a;

    return-void
.end method

.method public final c()V
    .locals 3
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget-boolean v0, p0, Lr0/b$a;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr0/b$a;->b:Z

    :cond_0
    return-void
.end method

.method public final d(Lcom/google/android/gms/common/api/Status;)V
    .locals 2
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {v0}, Ls0/e;->b(Landroid/os/Handler;)V

    iget-object v0, p0, Lr0/b$a;->a:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/f;

    invoke-virtual {v1, p1}, Lr0/f;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr0/b$a;->a:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    return-void
.end method
