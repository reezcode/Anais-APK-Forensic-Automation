.class public abstract Lm3/a;
.super Lm3/z0;

# interfaces
.implements Lkotlin/coroutines/Continuation;
.implements Lm3/y;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lm3/z0;",
        "Lkotlin/coroutines/Continuation<",
        "TT;>;",
        "Lm3/y;"
    }
.end annotation


# instance fields
.field public final c:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lm3/z0;-><init>(Z)V

    sget-object p2, Lm3/u0$b;->b:Lm3/u0$b;

    invoke-interface {p1, p2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p2

    check-cast p2, Lm3/u0;

    invoke-virtual {p0, p2}, Lm3/z0;->A(Lm3/u0;)V

    invoke-interface {p1, p0}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    iput-object p1, p0, Lm3/a;->c:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public final C()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lm3/z0;->C()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final F(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lm3/n;

    if-eqz v0, :cond_0

    check-cast p1, Lm3/n;

    iget-object v0, p1, Lm3/n;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lm3/n;->a()Z

    :cond_0
    return-void
.end method

.method public M(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm3/z0;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    iget-object v0, p0, Lm3/a;->c:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    invoke-super {p0}, Lm3/z0;->isActive()Z

    move-result v0

    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li/g;->H(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lm3/z0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lm3/a0;->a:Lq3/r;

    if-ne v1, v2, :cond_3

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Job "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is already complete or completing, but is being completed with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    instance-of v3, p1, Lm3/n;

    if-eqz v3, :cond_1

    check-cast p1, Lm3/n;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p1, Lm3/n;->a:Ljava/lang/Throwable;

    :cond_2
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    sget-object v2, Lm3/a0;->c:Lq3/r;

    if-eq v1, v2, :cond_0

    sget-object p1, Lm3/a0;->b:Lq3/r;

    if-ne v1, p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0, v1}, Lm3/a;->M(Ljava/lang/Object;)V

    return-void
.end method

.method public final z(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lm3/a;->c:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, p1}, Ld1/d;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    return-void
.end method
