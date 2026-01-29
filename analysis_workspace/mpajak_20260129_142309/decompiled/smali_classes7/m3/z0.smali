.class public Lm3/z0;
.super Ljava/lang/Object;

# interfaces
.implements Lm3/u0;
.implements Lm3/k;
.implements Lm3/e1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm3/z0$b;,
        Lm3/z0$a;
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    level = .enum Lkotlin/DeprecationLevel;->ERROR:Lkotlin/DeprecationLevel;
    message = "This is internal API and may be removed in the future releases"
.end annotation


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;

.field private volatile synthetic _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lm3/z0;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    sget-object p1, Lm3/a0;->g:Lm3/j0;

    goto :goto_0

    :cond_0
    sget-object p1, Lm3/a0;->f:Lm3/j0;

    :goto_0
    iput-object p1, p0, Lm3/z0;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final A(Lm3/u0;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lm3/c1;->b:Lm3/c1;

    iput-object p1, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    return-void

    :cond_0
    invoke-interface {p1}, Lm3/u0;->start()Z

    invoke-interface {p1, p0}, Lm3/u0;->e(Lm3/k;)Lm3/i;

    move-result-object p1

    iput-object p1, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lm3/p0;

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lm3/i0;->c()V

    sget-object p1, Lm3/c1;->b:Lm3/c1;

    iput-object p1, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public B()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final D(Lq3/i;)Lm3/j;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lq3/i;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lq3/i;->h()Lq3/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lq3/i;->g()Lq3/i;

    move-result-object p1

    invoke-virtual {p1}, Lq3/i;->i()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lm3/j;

    if-eqz v0, :cond_1

    check-cast p1, Lm3/j;

    return-object p1

    :cond_1
    instance-of v0, p1, Lm3/b1;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final E(Lm3/b1;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/i;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Lm3/w0;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm3/y0;

    :try_start_0
    invoke-virtual {v2, p2}, Lm3/p;->k(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, Lm3/q;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception in completion handler "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Lm3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lq3/i;->g()Lq3/i;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Lm3/z0;->z(Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p0, p2}, Lm3/z0;->i(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public F(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public G()V
    .locals 0

    return-void
.end method

.method public final H(Lm3/y0;)V
    .locals 4

    new-instance v0, Lm3/b1;

    invoke-direct {v0}, Lm3/b1;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lq3/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lq3/i;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v1, p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lq3/i;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v1, p1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p1, :cond_2

    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lq3/i;->e(Lq3/i;)V

    :goto_1
    invoke-virtual {p1}, Lq3/i;->g()Lq3/i;

    move-result-object v1

    sget-object v2, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_4
    invoke-virtual {v2, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_4

    :goto_2
    return-void
.end method

.method public final I(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p1, Lm3/z0$b;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p1, Lm3/z0$b;

    invoke-virtual {p1}, Lm3/z0$b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm3/z0$b;->f()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lm3/p0;

    if-eqz v0, :cond_3

    check-cast p1, Lm3/p0;

    invoke-interface {p1}, Lm3/p0;->isActive()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lm3/n;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public final J(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    new-instance v0, Lm3/v0;

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lm3/z0;->j()Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lm3/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm3/u0;)V

    :cond_2
    return-object v0
.end method

.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lm3/p0;

    if-nez v0, :cond_0

    sget-object p1, Lm3/a0;->a:Lq3/r;

    return-object p1

    :cond_0
    instance-of v0, p1, Lm3/j0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    instance-of v0, p1, Lm3/y0;

    if-eqz v0, :cond_7

    :cond_1
    instance-of v0, p1, Lm3/j;

    if-nez v0, :cond_7

    instance-of v0, p2, Lm3/n;

    if-nez v0, :cond_7

    move-object v0, p1

    check-cast v0, Lm3/p0;

    sget-object v3, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of p1, p2, Lm3/p0;

    if-eqz p1, :cond_2

    new-instance p1, Lm3/q0;

    move-object v4, p2

    check-cast v4, Lm3/p0;

    invoke-direct {p1, v4}, Lm3/q0;-><init>(Lm3/p0;)V

    goto :goto_0

    :cond_2
    move-object p1, p2

    :cond_3
    :goto_0
    invoke-virtual {v3, p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v0, :cond_3

    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p2}, Lm3/z0;->F(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Lm3/z0;->k(Lm3/p0;Ljava/lang/Object;)V

    const/4 v1, 0x1

    :goto_2
    if-eqz v1, :cond_6

    return-object p2

    :cond_6
    sget-object p1, Lm3/a0;->c:Lq3/r;

    return-object p1

    :cond_7
    check-cast p1, Lm3/p0;

    invoke-virtual {p0, p1}, Lm3/z0;->u(Lm3/p0;)Lm3/b1;

    move-result-object v0

    if-nez v0, :cond_8

    sget-object p1, Lm3/a0;->c:Lq3/r;

    goto/16 :goto_a

    :cond_8
    instance-of v3, p1, Lm3/z0$b;

    const/4 v4, 0x0

    if-eqz v3, :cond_9

    move-object v3, p1

    check-cast v3, Lm3/z0$b;

    goto :goto_3

    :cond_9
    move-object v3, v4

    :goto_3
    if-nez v3, :cond_a

    new-instance v3, Lm3/z0$b;

    invoke-direct {v3, v0, v4}, Lm3/z0$b;-><init>(Lm3/b1;Ljava/lang/Throwable;)V

    :cond_a
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    monitor-enter v3

    :try_start_0
    invoke-virtual {v3}, Lm3/z0$b;->f()Z

    move-result v6

    if-eqz v6, :cond_b

    sget-object p1, Lm3/a0;->a:Lq3/r;

    goto :goto_5

    :cond_b
    invoke-virtual {v3}, Lm3/z0$b;->i()V

    if-eq v3, p1, :cond_e

    sget-object v6, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_c
    invoke-virtual {v6, p0, p1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    const/4 v1, 0x1

    goto :goto_4

    :cond_d
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eq v7, p1, :cond_c

    :goto_4
    if-nez v1, :cond_e

    sget-object p1, Lm3/a0;->c:Lq3/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_5
    monitor-exit v3

    goto :goto_a

    :cond_e
    :try_start_1
    invoke-virtual {v3}, Lm3/z0$b;->e()Z

    move-result v1

    instance-of v6, p2, Lm3/n;

    if-eqz v6, :cond_f

    move-object v6, p2

    check-cast v6, Lm3/n;

    goto :goto_6

    :cond_f
    move-object v6, v4

    :goto_6
    if-eqz v6, :cond_10

    iget-object v6, v6, Lm3/n;->a:Ljava/lang/Throwable;

    invoke-virtual {v3, v6}, Lm3/z0$b;->b(Ljava/lang/Throwable;)V

    :cond_10
    invoke-virtual {v3}, Lm3/z0$b;->d()Ljava/lang/Throwable;

    move-result-object v6

    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_7

    :cond_11
    move-object v6, v4

    :goto_7
    iput-object v6, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    if-eqz v6, :cond_12

    invoke-virtual {p0, v0, v6}, Lm3/z0;->E(Lm3/b1;Ljava/lang/Throwable;)V

    :cond_12
    instance-of v0, p1, Lm3/j;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, Lm3/j;

    goto :goto_8

    :cond_13
    move-object v0, v4

    :goto_8
    if-nez v0, :cond_14

    invoke-interface {p1}, Lm3/p0;->a()Lm3/b1;

    move-result-object p1

    if-eqz p1, :cond_15

    invoke-virtual {p0, p1}, Lm3/z0;->D(Lq3/i;)Lm3/j;

    move-result-object v4

    goto :goto_9

    :cond_14
    move-object v4, v0

    :cond_15
    :goto_9
    if-eqz v4, :cond_16

    invoke-virtual {p0, v3, v4, p2}, Lm3/z0;->L(Lm3/z0$b;Lm3/j;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    sget-object p1, Lm3/a0;->b:Lq3/r;

    goto :goto_a

    :cond_16
    invoke-virtual {p0, v3, p2}, Lm3/z0;->o(Lm3/z0$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_a
    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1
.end method

.method public final L(Lm3/z0$b;Lm3/j;Ljava/lang/Object;)Z
    .locals 6

    :cond_0
    iget-object v0, p2, Lm3/j;->f:Lm3/k;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lm3/z0$a;

    invoke-direct {v3, p0, p1, p2, p3}, Lm3/z0$a;-><init>(Lm3/z0;Lm3/z0$b;Lm3/j;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lm3/u0$a;->a(Lm3/u0;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm3/i0;

    move-result-object v0

    sget-object v1, Lm3/c1;->b:Lm3/c1;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p0, p2}, Lm3/z0;->D(Lq3/i;)Lm3/j;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final a(Lkotlin/jvm/functions/Function1;)Lm3/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lm3/i0;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lm3/z0;->n(ZZLkotlin/jvm/functions/Function1;)Lm3/i0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;Lm3/b1;Lm3/y0;)Z
    .locals 5

    new-instance v0, Lm3/z0$c;

    invoke-direct {v0, p3, p0, p1}, Lm3/z0$c;-><init>(Lq3/i;Lm3/z0;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Lq3/i;->h()Lq3/i;

    move-result-object p1

    sget-object v1, Lq3/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lq3/i;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, v0, Lq3/i$a;->c:Lq3/i;

    :cond_0
    invoke-virtual {v1, p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p2, :cond_0

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x2

    if-nez v1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p1}, Lq3/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x2

    :goto_2
    if-eq p1, v4, :cond_4

    if-eq p1, v2, :cond_5

    goto :goto_0

    :cond_4
    const/4 v3, 0x1

    :cond_5
    return v3
.end method

.method public final e(Lm3/k;)Lm3/i;
    .locals 6

    new-instance v3, Lm3/j;

    invoke-direct {v3, p1}, Lm3/j;-><init>(Lm3/k;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lm3/u0$a;->a(Lm3/u0;ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lm3/i0;

    move-result-object p1

    check-cast p1, Lm3/i;

    return-object p1
.end method

.method public final fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lkotlin/coroutines/CoroutineContext$Element$DefaultImpls;->fold(Lkotlin/coroutines/CoroutineContext$Element;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            ">(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lkotlin/coroutines/CoroutineContext$Element$DefaultImpls;->get(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lkotlin/coroutines/CoroutineContext$Key;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lm3/u0$b;->b:Lm3/u0$b;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 9

    sget-object v0, Lm3/a0;->a:Lq3/r;

    instance-of v1, p0, Lm3/x0;

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    :cond_0
    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm3/p0;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lm3/z0$b;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lm3/z0$b;

    invoke-virtual {v1}, Lm3/z0$b;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lm3/n;

    invoke-virtual {p0, p1}, Lm3/z0;->m(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v1, v3}, Lm3/n;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0, v1}, Lm3/z0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm3/a0;->c:Lq3/r;

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lm3/a0;->a:Lq3/r;

    :goto_1
    sget-object v1, Lm3/a0;->b:Lq3/r;

    if-ne v0, v1, :cond_3

    return v2

    :cond_3
    sget-object v1, Lm3/a0;->a:Lq3/r;

    const/4 v3, 0x0

    if-ne v0, v1, :cond_14

    const/4 v0, 0x0

    move-object v1, v0

    :cond_4
    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lm3/z0$b;

    if-eqz v5, :cond_a

    monitor-enter v4

    :try_start_0
    move-object v5, v4

    check-cast v5, Lm3/z0$b;

    invoke-virtual {v5}, Lm3/z0$b;->g()Z

    move-result v5

    if-eqz v5, :cond_5

    sget-object p1, Lm3/a0;->d:Lq3/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    goto/16 :goto_6

    :cond_5
    :try_start_1
    move-object v5, v4

    check-cast v5, Lm3/z0$b;

    invoke-virtual {v5}, Lm3/z0$b;->e()Z

    move-result v5

    if-nez p1, :cond_6

    if-nez v5, :cond_8

    :cond_6
    if-nez v1, :cond_7

    invoke-virtual {p0, p1}, Lm3/z0;->m(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_7
    move-object p1, v4

    check-cast p1, Lm3/z0$b;

    invoke-virtual {p1, v1}, Lm3/z0$b;->b(Ljava/lang/Throwable;)V

    :cond_8
    move-object p1, v4

    check-cast p1, Lm3/z0$b;

    invoke-virtual {p1}, Lm3/z0$b;->d()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v5, 0x1

    if-eqz v1, :cond_9

    move-object v0, p1

    :cond_9
    monitor-exit v4

    if-eqz v0, :cond_10

    check-cast v4, Lm3/z0$b;

    iget-object p1, v4, Lm3/z0$b;->b:Lm3/b1;

    invoke-virtual {p0, p1, v0}, Lm3/z0;->E(Lm3/b1;Ljava/lang/Throwable;)V

    goto :goto_5

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_a
    instance-of v5, v4, Lm3/p0;

    if-eqz v5, :cond_13

    if-nez v1, :cond_b

    invoke-virtual {p0, p1}, Lm3/z0;->m(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_b
    move-object v5, v4

    check-cast v5, Lm3/p0;

    invoke-interface {v5}, Lm3/p0;->isActive()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {p0, v5}, Lm3/z0;->u(Lm3/p0;)Lm3/b1;

    move-result-object v6

    if-nez v6, :cond_c

    goto :goto_3

    :cond_c
    new-instance v7, Lm3/z0$b;

    invoke-direct {v7, v6, v1}, Lm3/z0$b;-><init>(Lm3/b1;Ljava/lang/Throwable;)V

    sget-object v8, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_d
    invoke-virtual {v8, p0, v5, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/4 v4, 0x1

    goto :goto_2

    :cond_e
    invoke-virtual {v8, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v5, :cond_d

    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_f

    :goto_3
    const/4 v4, 0x0

    goto :goto_4

    :cond_f
    invoke-virtual {p0, v6, v1}, Lm3/z0;->E(Lm3/b1;Ljava/lang/Throwable;)V

    const/4 v4, 0x1

    :goto_4
    if-eqz v4, :cond_4

    :cond_10
    :goto_5
    sget-object p1, Lm3/a0;->a:Lq3/r;

    goto :goto_6

    :cond_11
    new-instance v5, Lm3/n;

    invoke-direct {v5, v1}, Lm3/n;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v4, v5}, Lm3/z0;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lm3/a0;->a:Lq3/r;

    if-eq v5, v6, :cond_12

    sget-object v4, Lm3/a0;->c:Lq3/r;

    if-eq v5, v4, :cond_4

    move-object v0, v5

    goto :goto_7

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot happen in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    sget-object p1, Lm3/a0;->d:Lq3/r;

    :goto_6
    move-object v0, p1

    :cond_14
    :goto_7
    sget-object p1, Lm3/a0;->a:Lq3/r;

    if-ne v0, p1, :cond_15

    goto :goto_8

    :cond_15
    sget-object p1, Lm3/a0;->b:Lq3/r;

    if-ne v0, p1, :cond_16

    goto :goto_8

    :cond_16
    sget-object p1, Lm3/a0;->d:Lq3/r;

    if-ne v0, p1, :cond_17

    const/4 v2, 0x0

    goto :goto_8

    :cond_17
    invoke-virtual {p0, v0}, Lm3/z0;->g(Ljava/lang/Object;)V

    :goto_8
    return v2
.end method

.method public final i(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Lm3/z0;->B()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    iget-object v2, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    check-cast v2, Lm3/i;

    if-eqz v2, :cond_4

    sget-object v3, Lm3/c1;->b:Lm3/c1;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Lm3/i;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public isActive()Z
    .locals 2

    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm3/p0;

    if-eqz v1, :cond_0

    check-cast v0, Lm3/p0;

    invoke-interface {v0}, Lm3/p0;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public final k(Lm3/p0;Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lm3/i;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm3/i0;->c()V

    sget-object v0, Lm3/c1;->b:Lm3/c1;

    iput-object v0, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    :cond_0
    instance-of v0, p2, Lm3/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lm3/n;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Lm3/n;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    instance-of v0, p1, Lm3/y0;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Lm3/y0;

    invoke-virtual {v0, p2}, Lm3/p;->k(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    new-instance v0, Lm3/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lm3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lm3/z0;->z(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Lm3/p0;->a()Lm3/b1;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/i;

    :goto_2
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v0, Lm3/y0;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Lm3/y0;

    :try_start_1
    invoke-virtual {v4, p2}, Lm3/p;->k(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    if-eqz v1, :cond_4

    invoke-static {v1, v5}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    new-instance v1, Lm3/q;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v5}, Lm3/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lq3/i;->g()Lq3/i;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1}, Lm3/z0;->z(Ljava/lang/Throwable;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final l()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm3/z0$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lm3/z0$b;

    invoke-virtual {v1}, Lm3/z0$b;->d()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lm3/n;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lm3/n;

    iget-object v1, v1, Lm3/n;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lm3/p0;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lm3/v0;

    const-string v3, "Parent job is "

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0, v0}, Lm3/z0;->I(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lm3/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm3/u0;)V

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot be cancelling child in this state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    new-instance v0, Lm3/v0;

    invoke-virtual {p0}, Lm3/z0;->j()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lm3/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm3/u0;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lm3/e1;

    invoke-interface {p1}, Lm3/e1;->l()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method public final minusKey(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/CoroutineContext$Key<",
            "*>;)",
            "Lkotlin/coroutines/CoroutineContext;"
        }
    .end annotation

    invoke-static {p0, p1}, Lkotlin/coroutines/CoroutineContext$Element$DefaultImpls;->minusKey(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public final n(ZZLkotlin/jvm/functions/Function1;)Lm3/i0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lm3/i0;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p3, Lm3/w0;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lm3/w0;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    new-instance v1, Lm3/s0;

    invoke-direct {v1, p3}, Lm3/s0;-><init>(Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    :cond_1
    instance-of v1, p3, Lm3/y0;

    if-eqz v1, :cond_2

    move-object v1, p3

    check-cast v1, Lm3/y0;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lm3/t0;

    invoke-direct {v1, p3}, Lm3/t0;-><init>(Lkotlin/jvm/functions/Function1;)V

    :cond_4
    :goto_2
    iput-object p0, v1, Lm3/y0;->e:Lm3/z0;

    :cond_5
    :goto_3
    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lm3/j0;

    if-eqz v3, :cond_c

    move-object v3, v2

    check-cast v3, Lm3/j0;

    iget-boolean v4, v3, Lm3/j0;->b:Z

    if-eqz v4, :cond_8

    sget-object v4, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v4, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v2, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v2, :cond_6

    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_5

    return-object v1

    :cond_8
    new-instance v2, Lm3/b1;

    invoke-direct {v2}, Lm3/b1;-><init>()V

    iget-boolean v4, v3, Lm3/j0;->b:Z

    if-eqz v4, :cond_9

    move-object v4, v2

    goto :goto_5

    :cond_9
    new-instance v4, Lm3/o0;

    invoke-direct {v4, v2}, Lm3/o0;-><init>(Lm3/b1;)V

    :goto_5
    sget-object v5, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_a
    invoke-virtual {v5, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v3, :cond_a

    goto :goto_3

    :cond_c
    instance-of v3, v2, Lm3/p0;

    if-eqz v3, :cond_15

    move-object v3, v2

    check-cast v3, Lm3/p0;

    invoke-interface {v3}, Lm3/p0;->a()Lm3/b1;

    move-result-object v3

    if-nez v3, :cond_d

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, Lm3/y0;

    invoke-virtual {p0, v2}, Lm3/z0;->H(Lm3/y0;)V

    goto :goto_3

    :cond_d
    sget-object v4, Lm3/c1;->b:Lm3/c1;

    if-eqz p1, :cond_12

    instance-of v5, v2, Lm3/z0$b;

    if-eqz v5, :cond_12

    monitor-enter v2

    :try_start_0
    move-object v5, v2

    check-cast v5, Lm3/z0$b;

    invoke-virtual {v5}, Lm3/z0$b;->d()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_e

    instance-of v6, p3, Lm3/j;

    if-eqz v6, :cond_11

    move-object v6, v2

    check-cast v6, Lm3/z0$b;

    invoke-virtual {v6}, Lm3/z0$b;->f()Z

    move-result v6

    if-nez v6, :cond_11

    :cond_e
    invoke-virtual {p0, v2, v3, v1}, Lm3/z0;->d(Ljava/lang/Object;Lm3/b1;Lm3/y0;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_f

    monitor-exit v2

    goto/16 :goto_3

    :cond_f
    if-nez v5, :cond_10

    monitor-exit v2

    return-object v1

    :cond_10
    move-object v4, v1

    :cond_11
    :try_start_1
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    goto :goto_6

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_12
    move-object v5, v0

    :goto_6
    if-eqz v5, :cond_14

    if-eqz p2, :cond_13

    invoke-interface {p3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    return-object v4

    :cond_14
    invoke-virtual {p0, v2, v3, v1}, Lm3/z0;->d(Ljava/lang/Object;Lm3/b1;Lm3/y0;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v1

    :cond_15
    if-eqz p2, :cond_18

    instance-of p1, v2, Lm3/n;

    if-eqz p1, :cond_16

    check-cast v2, Lm3/n;

    goto :goto_7

    :cond_16
    move-object v2, v0

    :goto_7
    if-eqz v2, :cond_17

    iget-object v0, v2, Lm3/n;->a:Ljava/lang/Throwable;

    :cond_17
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    sget-object p1, Lm3/c1;->b:Lm3/c1;

    return-object p1
.end method

.method public final o(Lm3/z0$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lm3/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm3/n;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lm3/n;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Lm3/z0$b;->e()Z

    invoke-virtual {p1, v0}, Lm3/z0$b;->h(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lm3/z0$b;->e()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Lm3/v0;

    invoke-virtual {p0}, Lm3/z0;->j()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v1, p0}, Lm3/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm3/u0;)V

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Throwable;

    instance-of v7, v7, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v7, v4

    if-eqz v7, :cond_3

    move-object v1, v6

    :cond_4
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz v1, :cond_9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-gt v3, v4, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-instance v6, Ljava/util/IdentityHashMap;

    invoke-direct {v6, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eq v6, v1, :cond_8

    if-eq v6, v1, :cond_8

    instance-of v7, v6, Ljava/util/concurrent/CancellationException;

    if-nez v7, :cond_8

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {v1, v6}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_9
    :goto_4
    monitor-exit p1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    if-ne v1, v0, :cond_b

    goto :goto_5

    :cond_b
    new-instance p2, Lm3/n;

    invoke-direct {p2, v1}, Lm3/n;-><init>(Ljava/lang/Throwable;)V

    :goto_5
    if-eqz v1, :cond_e

    invoke-virtual {p0, v1}, Lm3/z0;->i(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p0, v1}, Lm3/z0;->y(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    const/4 v0, 0x0

    goto :goto_7

    :cond_d
    :goto_6
    const/4 v0, 0x1

    :goto_7
    if-eqz v0, :cond_e

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lm3/n;

    sget-object v1, Lm3/n;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, v0, v5, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    :cond_e
    invoke-virtual {p0, p2}, Lm3/z0;->F(Ljava/lang/Object;)V

    sget-object v0, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Lm3/p0;

    if-eqz v1, :cond_f

    new-instance v1, Lm3/q0;

    move-object v2, p2

    check-cast v2, Lm3/p0;

    invoke-direct {v1, v2}, Lm3/q0;-><init>(Lm3/p0;)V

    goto :goto_8

    :cond_f
    move-object v1, p2

    :cond_10
    :goto_8
    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_10

    :goto_9
    invoke-virtual {p0, p1, p2}, Lm3/z0;->k(Lm3/p0;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final p(Lm3/e1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm3/z0;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public final plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/coroutines/CoroutineContext$Element$DefaultImpls;->plus(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    return-object p1
.end method

.method public final q()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm3/z0$b;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lm3/z0$b;

    invoke-virtual {v0}, Lm3/z0$b;->d()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is cancelling"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lm3/z0;->J(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v1, v0, Lm3/p0;

    if-nez v1, :cond_3

    instance-of v1, v0, Lm3/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lm3/n;

    iget-object v0, v0, Lm3/n;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, v0, v2}, Lm3/z0;->J(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Lm3/v0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lm3/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm3/u0;)V

    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final r(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-instance v0, Lm3/v0;

    invoke-virtual {p0}, Lm3/z0;->j()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lm3/v0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lm3/u0;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p0, p1}, Lm3/z0;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public final start()Z
    .locals 7

    :goto_0
    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm3/j0;

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lm3/j0;

    iget-boolean v1, v1, Lm3/j0;->b:Z

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    sget-object v1, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    sget-object v5, Lm3/a0;->g:Lm3/j0;

    :cond_1
    invoke-virtual {v1, p0, v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_6

    goto :goto_4

    :cond_3
    instance-of v1, v0, Lm3/o0;

    if-eqz v1, :cond_7

    sget-object v1, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v5, v0

    check-cast v5, Lm3/o0;

    iget-object v5, v5, Lm3/o0;->b:Lm3/b1;

    :cond_4
    invoke-virtual {v1, p0, v0, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v0, :cond_4

    const/4 v0, 0x0

    :goto_2
    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Lm3/z0;->G()V

    const/4 v2, 0x1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_9

    if-eq v2, v4, :cond_8

    goto :goto_0

    :cond_8
    return v4

    :cond_9
    return v3
.end method

.method public t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lm3/z0;->C()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lm3/z0;->I(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lm3/a0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lm3/p0;)Lm3/b1;
    .locals 3

    invoke-interface {p1}, Lm3/p0;->a()Lm3/b1;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lm3/j0;

    if-eqz v0, :cond_0

    new-instance v0, Lm3/b1;

    invoke-direct {v0}, Lm3/b1;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lm3/y0;

    if-eqz v0, :cond_1

    check-cast p1, Lm3/y0;

    invoke-virtual {p0, p1}, Lm3/z0;->H(Lm3/y0;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State should have list: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final v()Lm3/i;
    .locals 1

    iget-object v0, p0, Lm3/z0;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lm3/i;

    return-object v0
.end method

.method public final x()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lm3/z0;->_state:Ljava/lang/Object;

    instance-of v1, v0, Lq3/n;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lq3/n;

    invoke-virtual {v0, p0}, Lq3/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public y(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public z(Ljava/lang/Throwable;)V
    .locals 0

    throw p1
.end method
