.class public final Lm3/f;
.super Lm3/g0;

# interfaces
.implements Lm3/e;
.implements Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lm3/g0<",
        "TT;>;",
        "Lm3/e<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;"
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# static fields
.field public static final synthetic h:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I

.field private volatile synthetic _state:Ljava/lang/Object;

.field public final e:Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/coroutines/Continuation<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final f:Lkotlin/coroutines/CoroutineContext;

.field public g:Lm3/i0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lm3/f;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lm3/f;->h:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Lm3/f;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;I)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lm3/g0;-><init>(I)V

    iput-object p1, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    invoke-interface {p1}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    iput-object p1, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    const/4 p1, 0x0

    iput p1, p0, Lm3/f;->_decision:I

    sget-object p1, Lm3/b;->b:Lm3/b;

    iput-object p1, p0, Lm3/f;->_state:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 10

    :cond_0
    iget-object p1, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v0, p1, Lm3/d1;

    if-nez v0, :cond_b

    instance-of v0, p1, Lm3/n;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p1, Lm3/m;

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Lm3/m;

    iget-object v1, v0, Lm3/m;->e:Ljava/lang/Throwable;

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v1, v7

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    const/16 v2, 0xf

    invoke-static {v0, v1, p2, v2}, Lm3/m;->a(Lm3/m;Lm3/d;Ljava/lang/Throwable;I)Lm3/m;

    move-result-object v1

    sget-object v2, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_3
    invoke-virtual {v2, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p1, :cond_3

    :goto_1
    if-eqz v6, :cond_0

    iget-object p1, v0, Lm3/m;->b:Lm3/d;

    if-eqz p1, :cond_5

    invoke-virtual {p0, p1, p2}, Lm3/f;->i(Lm3/d;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p1, v0, Lm3/m;->c:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_6

    invoke-virtual {p0, p1, p2}, Lm3/f;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    :cond_6
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    sget-object v8, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v9, Lm3/m;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0xe

    move-object v0, v9

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lm3/m;-><init>(Ljava/lang/Object;Lm3/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;I)V

    :cond_9
    invoke-virtual {v8, p0, p1, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v6, 0x1

    goto :goto_2

    :cond_a
    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_9

    :goto_2
    if-eqz v6, :cond_0

    return-void

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lkotlin/coroutines/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/Continuation<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final c(Ljava/lang/Throwable;)Z
    .locals 7

    :cond_0
    iget-object v0, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lm3/d1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    new-instance v1, Lm3/g;

    instance-of v3, v0, Lm3/d;

    invoke-direct {v1, p0, p1, v3}, Lm3/g;-><init>(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V

    sget-object v4, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v4, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v0, :cond_2

    :goto_0
    if-eqz v2, :cond_0

    if-eqz v3, :cond_4

    check-cast v0, Lm3/d;

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {p0, v0, p1}, Lm3/f;->i(Lm3/d;Ljava/lang/Throwable;)V

    :cond_5
    invoke-virtual {p0}, Lm3/f;->l()V

    iget p1, p0, Lm3/g0;->d:I

    invoke-virtual {p0, p1}, Lm3/f;->m(I)V

    return v6
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, Lm3/g0;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lm3/m;

    if-eqz v0, :cond_0

    check-cast p1, Lm3/m;

    iget-object p1, p1, Lm3/m;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm3/f;->_state:Ljava/lang/Object;

    return-object v0
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;
    .locals 2

    iget-object v0, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1

    iget-object v0, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lm3/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lm3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Ld1/d;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final i(Lm3/d;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1, p2}, Lm3/d;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lm3/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lm3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Ld1/d;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lm3/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in resume onCancellation handler for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lm3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Ld1/d;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lm3/f;->g:Lm3/i0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lm3/i0;->c()V

    sget-object v0, Lm3/c1;->b:Lm3/c1;

    iput-object v0, p0, Lm3/f;->g:Lm3/i0;

    return-void
.end method

.method public final l()V
    .locals 1

    invoke-virtual {p0}, Lm3/f;->r()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm3/f;->k()V

    :cond_0
    return-void
.end method

.method public final m(I)V
    .locals 4

    :cond_0
    iget v0, p0, Lm3/f;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v0, Lm3/f;->h:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    const/4 v3, 0x4

    if-ne p1, v3, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-nez v1, :cond_8

    instance-of v3, v0, Lq3/e;

    if-eqz v3, :cond_8

    invoke-static {p1}, Ld1/d;->i(I)Z

    move-result p1

    iget v3, p0, Lm3/g0;->d:I

    invoke-static {v3}, Ld1/d;->i(I)Z

    move-result v3

    if-ne p1, v3, :cond_8

    move-object p1, v0

    check-cast p1, Lq3/e;

    iget-object p1, p1, Lq3/e;->e:Lm3/v;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-virtual {p1}, Lm3/v;->x()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v0, p0}, Lm3/v;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_5
    sget-object p1, Lm3/h1;->a:Lm3/h1;

    invoke-static {}, Lm3/h1;->a()Lm3/k0;

    move-result-object p1

    invoke-virtual {p1}, Lm3/k0;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, p0}, Lm3/k0;->A(Lm3/g0;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v2}, Lm3/k0;->E(Z)V

    :try_start_0
    iget-object v0, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    invoke-static {p0, v0, v2}, Ld1/d;->l(Lm3/g0;Lkotlin/coroutines/Continuation;Z)V

    :cond_7
    invoke-virtual {p1}, Lm3/k0;->I()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_7

    goto :goto_1

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p0, v0, v1}, Lm3/g0;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    invoke-virtual {p1}, Lm3/k0;->y()V

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1}, Lm3/k0;->y()V

    throw v0

    :cond_8
    invoke-static {p0, v0, v1}, Ld1/d;->l(Lm3/g0;Lkotlin/coroutines/Continuation;Z)V

    :goto_2
    return-void
.end method

.method public final n()Ljava/lang/Object;
    .locals 4
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    invoke-virtual {p0}, Lm3/f;->r()Z

    move-result v0

    :cond_0
    iget v1, p0, Lm3/f;->_decision:I

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v1, Lm3/f;->h:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x1

    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_5

    iget-object v1, p0, Lm3/f;->g:Lm3/i0;

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lm3/f;->p()Lm3/i0;

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lm3/f;->t()V

    :cond_4
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lm3/f;->t()V

    :cond_6
    iget-object v0, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lm3/n;

    if-nez v1, :cond_9

    iget v1, p0, Lm3/g0;->d:I

    invoke-static {v1}, Ld1/d;->i(I)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    sget v2, Lm3/u0;->a:I

    sget-object v2, Lm3/u0$b;->b:Lm3/u0$b;

    invoke-interface {v1, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v1

    check-cast v1, Lm3/u0;

    if-eqz v1, :cond_8

    invoke-interface {v1}, Lm3/u0;->isActive()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    invoke-interface {v1}, Lm3/u0;->q()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lm3/f;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    throw v1

    :cond_8
    :goto_1
    invoke-virtual {p0, v0}, Lm3/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_9
    check-cast v0, Lm3/n;

    iget-object v0, v0, Lm3/n;->a:Ljava/lang/Throwable;

    throw v0
.end method

.method public final o()V
    .locals 2

    invoke-virtual {p0}, Lm3/f;->p()Lm3/i0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v1, v1, Lm3/d1;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lm3/i0;->c()V

    sget-object v0, Lm3/c1;->b:Lm3/c1;

    iput-object v0, p0, Lm3/f;->g:Lm3/i0;

    :cond_1
    return-void
.end method

.method public final p()Lm3/i0;
    .locals 7

    iget-object v0, p0, Lm3/f;->f:Lkotlin/coroutines/CoroutineContext;

    sget v1, Lm3/u0;->a:I

    sget-object v1, Lm3/u0$b;->b:Lm3/u0$b;

    invoke-interface {v0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lm3/u0;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    new-instance v4, Lm3/h;

    invoke-direct {v4, p0}, Lm3/h;-><init>(Lm3/f;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lm3/u0$a;->a(Lm3/u0;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm3/i0;

    move-result-object v0

    iput-object v0, p0, Lm3/f;->g:Lm3/i0;

    return-object v0
.end method

.method public final q(Lkotlin/jvm/functions/Function1;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lm3/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm3/d;

    goto :goto_0

    :cond_0
    new-instance v0, Lm3/r0;

    invoke-direct {v0, p1}, Lm3/r0;-><init>(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_0
    iget-object v7, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v1, v7, Lm3/b;

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v1, :cond_4

    sget-object v1, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v1, p0, v7, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v7, :cond_2

    :goto_1
    if-eqz v8, :cond_1

    return-void

    :cond_4
    instance-of v1, v7, Lm3/d;

    const/4 v2, 0x0

    if-nez v1, :cond_12

    instance-of v1, v7, Lm3/n;

    if-eqz v1, :cond_9

    move-object v0, v7

    check-cast v0, Lm3/n;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lm3/n;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v3, v0, v8, v9}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_8

    instance-of v3, v7, Lm3/g;

    if-eqz v3, :cond_7

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_6

    iget-object v2, v0, Lm3/n;->a:Ljava/lang/Throwable;

    :cond_6
    invoke-virtual {p0, p1, v2}, Lm3/f;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    :cond_7
    return-void

    :cond_8
    invoke-virtual {p0, p1, v7}, Lm3/f;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    throw v2

    :cond_9
    instance-of v1, v7, Lm3/m;

    if-eqz v1, :cond_f

    move-object v1, v7

    check-cast v1, Lm3/m;

    iget-object v3, v1, Lm3/m;->b:Lm3/d;

    if-nez v3, :cond_e

    iget-object v3, v1, Lm3/m;->e:Ljava/lang/Throwable;

    if-eqz v3, :cond_a

    const/4 v4, 0x1

    goto :goto_3

    :cond_a
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_b

    invoke-virtual {p0, p1, v3}, Lm3/f;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    return-void

    :cond_b
    const/16 v3, 0x1d

    invoke-static {v1, v0, v2, v3}, Lm3/m;->a(Lm3/m;Lm3/d;Ljava/lang/Throwable;I)Lm3/m;

    move-result-object v1

    sget-object v3, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_c
    invoke-virtual {v3, p0, v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v8, 0x1

    goto :goto_4

    :cond_d
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v7, :cond_c

    :goto_4
    if-eqz v8, :cond_1

    return-void

    :cond_e
    invoke-virtual {p0, p1, v7}, Lm3/f;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    throw v2

    :cond_f
    new-instance v10, Lm3/m;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    move-object v1, v10

    move-object v2, v7

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lm3/m;-><init>(Ljava/lang/Object;Lm3/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;I)V

    sget-object v1, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_10
    invoke-virtual {v1, p0, v7, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    const/4 v8, 0x1

    goto :goto_5

    :cond_11
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v7, :cond_10

    :goto_5
    if-eqz v8, :cond_1

    return-void

    :cond_12
    invoke-virtual {p0, p1, v7}, Lm3/f;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    throw v2
.end method

.method public final r()Z
    .locals 4

    iget v0, p0, Lm3/g0;->d:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    check-cast v0, Lq3/e;

    invoke-virtual {v0}, Lq3/e;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 11

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lm3/n;

    invoke-direct {p1, v0}, Lm3/n;-><init>(Ljava/lang/Throwable;)V

    :goto_0
    iget v0, p0, Lm3/g0;->d:I

    :cond_1
    const/4 v4, 0x0

    iget-object v7, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v1, v7, Lm3/d1;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_8

    move-object v1, v7

    check-cast v1, Lm3/d1;

    instance-of v2, p1, Lm3/n;

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v0}, Ld1/d;->i(I)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    instance-of v2, v1, Lm3/d;

    if-eqz v2, :cond_5

    new-instance v10, Lm3/m;

    if-eqz v2, :cond_4

    check-cast v1, Lm3/d;

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    move-object v3, v1

    const/4 v5, 0x0

    const/16 v6, 0x10

    move-object v1, v10

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lm3/m;-><init>(Ljava/lang/Object;Lm3/d;Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;I)V

    goto :goto_3

    :cond_5
    :goto_2
    move-object v10, p1

    :goto_3
    sget-object v1, Lm3/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v1, p0, v7, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v7, :cond_6

    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_1

    invoke-virtual {p0}, Lm3/f;->l()V

    invoke-virtual {p0, v0}, Lm3/f;->m(I)V

    goto :goto_5

    :cond_8
    instance-of v0, v7, Lm3/g;

    if-eqz v0, :cond_9

    check-cast v7, Lm3/g;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lm3/g;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, v7, v9, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_5
    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already resumed, but proposed with update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    instance-of v1, v0, Lq3/e;

    if-eqz v1, :cond_0

    check-cast v0, Lq3/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lq3/e;->k(Lm3/e;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lm3/f;->k()V

    invoke-virtual {p0, v0}, Lm3/f;->c(Ljava/lang/Throwable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CancellableContinuation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lm3/a0;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm3/f;->_state:Ljava/lang/Object;

    instance-of v2, v1, Lm3/d1;

    if-eqz v2, :cond_0

    const-string v1, "Active"

    goto :goto_0

    :cond_0
    instance-of v1, v1, Lm3/g;

    if-eqz v1, :cond_1

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v1, "Completed"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lm3/a0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
