.class public final Lq3/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lq3/r;

.field public static final b:Lq3/r;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/r;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lq3/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq3/f;->a:Lq3/r;

    new-instance v0, Lq3/r;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lq3/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq3/f;->b:Lq3/r;

    return-void
.end method

.method public static final a(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Lq3/e;

    if-eqz v0, :cond_8

    check-cast p0, Lq3/e;

    invoke-static {p1, p2}, Li/g;->H(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lq3/e;->e:Lm3/v;

    invoke-virtual {p0}, Lq3/e;->getContext()Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {v0}, Lm3/v;->x()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lq3/e;->g:Ljava/lang/Object;

    iput v1, p0, Lm3/g0;->d:I

    iget-object p1, p0, Lq3/e;->e:Lm3/v;

    invoke-virtual {p0}, Lq3/e;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lm3/v;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v0, Lm3/h1;->a:Lm3/h1;

    invoke-static {}, Lm3/h1;->a()Lm3/k0;

    move-result-object v0

    invoke-virtual {v0}, Lm3/k0;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lq3/e;->g:Ljava/lang/Object;

    iput v1, p0, Lm3/g0;->d:I

    invoke-virtual {v0, p0}, Lm3/k0;->A(Lm3/g0;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lm3/k0;->E(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lq3/e;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    sget-object v4, Lm3/u0$b;->b:Lm3/u0$b;

    invoke-interface {v3, v4}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v3

    check-cast v3, Lm3/u0;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lm3/u0;->isActive()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {v3}, Lm3/u0;->q()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    instance-of v4, p2, Lm3/o;

    if-eqz v4, :cond_2

    check-cast p2, Lm3/o;

    iget-object p2, p2, Lm3/o;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v3}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p2}, Lq3/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_7

    iget-object p2, p0, Lq3/e;->f:Lkotlin/coroutines/Continuation;

    iget-object v1, p0, Lq3/e;->h:Ljava/lang/Object;

    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v3

    invoke-static {v3, v1}, Lq3/t;->b(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Lq3/t;->a:Lq3/r;

    if-eq v1, v4, :cond_4

    invoke-static {p2, v3, v1}, Ld1/d;->o(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lm3/j1;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_4
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v4, p0, Lq3/e;->f:Lkotlin/coroutines/Continuation;

    invoke-interface {v4, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p2, :cond_5

    :try_start_2
    invoke-static {v3, v1}, Lq3/t;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    throw v2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_6

    throw v2

    :cond_6
    invoke-static {v3, v1}, Lq3/t;->a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V

    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lm3/k0;->I()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lm3/g0;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0}, Lm3/k0;->y()V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0}, Lm3/k0;->y()V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method
