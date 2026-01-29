.class public final Ln3/c;
.super Ln3/d;


# instance fields
.field private volatile _immediate:Ln3/c;

.field public final c:Landroid/os/Handler;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ln3/c;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Z)V
    .locals 1

    invoke-direct {p0}, Ln3/d;-><init>()V

    iput-object p1, p0, Ln3/c;->c:Landroid/os/Handler;

    iput-object p2, p0, Ln3/c;->d:Ljava/lang/String;

    iput-boolean p3, p0, Ln3/c;->e:Z

    if-eqz p3, :cond_0

    move-object p3, p0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-object p3, p0, Ln3/c;->_immediate:Ln3/c;

    iget-object p3, p0, Ln3/c;->_immediate:Ln3/c;

    if-nez p3, :cond_1

    new-instance p3, Ln3/c;

    const/4 v0, 0x1

    invoke-direct {p3, p1, p2, v0}, Ln3/c;-><init>(Landroid/os/Handler;Ljava/lang/String;Z)V

    iput-object p3, p0, Ln3/c;->_immediate:Ln3/c;

    :cond_1
    iput-object p3, p0, Ln3/c;->f:Ln3/c;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 3

    iget-object v0, p0, Ln3/c;->c:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lm3/u0$b;->b:Lm3/u0$b;

    invoke-interface {p1, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v1

    check-cast v1, Lm3/u0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lm3/u0;->r(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    sget-object v0, Lm3/h0;->b:Lr3/b;

    invoke-virtual {v0, p1, p2}, Lr3/b;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ln3/c;

    if-eqz v0, :cond_0

    check-cast p1, Ln3/c;

    iget-object p1, p1, Ln3/c;->c:Landroid/os/Handler;

    iget-object v0, p0, Ln3/c;->c:Landroid/os/Handler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ln3/c;->c:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lm3/a1;->z()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln3/c;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ln3/c;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Ln3/c;->e:Z

    if-eqz v1, :cond_1

    const-string v1, ".immediate"

    invoke-static {v0, v1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final x()Z
    .locals 2

    iget-boolean v0, p0, Ln3/c;->e:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ln3/c;->c:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

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

.method public final y()Lm3/a1;
    .locals 1

    iget-object v0, p0, Ln3/c;->f:Ln3/c;

    return-object v0
.end method
