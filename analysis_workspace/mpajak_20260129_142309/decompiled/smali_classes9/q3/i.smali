.class public Lq3/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq3/i$a;
    }
.end annotation


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _next:Ljava/lang/Object;

.field public volatile synthetic _prev:Ljava/lang/Object;

.field private volatile synthetic _removedRef:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lq3/i;

    const-string v2, "_next"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lq3/i;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_prev"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lq3/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_removedRef"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lq3/i;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lq3/i;->_next:Ljava/lang/Object;

    iput-object p0, p0, Lq3/i;->_prev:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lq3/i;->_removedRef:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Lq3/i;
    .locals 10

    :goto_0
    iget-object v0, p0, Lq3/i;->_prev:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    const/4 v1, 0x0

    move-object v2, v0

    :goto_1
    move-object v3, v1

    :goto_2
    iget-object v4, v2, Lq3/i;->_next:Ljava/lang/Object;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, p0, :cond_4

    if-ne v0, v2, :cond_0

    return-object v2

    :cond_0
    sget-object v7, Lq3/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_1
    invoke-virtual {v7, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v5, 0x1

    goto :goto_3

    :cond_2
    invoke-virtual {v7, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_1

    :goto_3
    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    return-object v2

    :cond_4
    invoke-virtual {p0}, Lq3/i;->i()Z

    move-result v7

    if-eqz v7, :cond_5

    return-object v1

    :cond_5
    if-nez v4, :cond_6

    return-object v2

    :cond_6
    instance-of v7, v4, Lq3/n;

    if-eqz v7, :cond_7

    check-cast v4, Lq3/n;

    invoke-virtual {v4, v2}, Lq3/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_7
    instance-of v7, v4, Lq3/o;

    if-eqz v7, :cond_c

    if-eqz v3, :cond_b

    sget-object v7, Lq3/i;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    check-cast v4, Lq3/o;

    iget-object v4, v4, Lq3/o;->a:Lq3/i;

    :cond_8
    invoke-virtual {v7, v3, v2, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/4 v5, 0x1

    goto :goto_4

    :cond_9
    invoke-virtual {v7, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eq v8, v2, :cond_8

    :goto_4
    if-nez v5, :cond_a

    goto :goto_0

    :cond_a
    move-object v2, v3

    goto :goto_1

    :cond_b
    iget-object v2, v2, Lq3/i;->_prev:Ljava/lang/Object;

    check-cast v2, Lq3/i;

    goto :goto_2

    :cond_c
    move-object v3, v4

    check-cast v3, Lq3/i;

    move-object v9, v3

    move-object v3, v2

    move-object v2, v9

    goto :goto_2
.end method

.method public final e(Lq3/i;)V
    .locals 3

    :cond_0
    iget-object v0, p1, Lq3/i;->_prev:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    invoke-virtual {p0}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lq3/i;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v1, p1, v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lq3/i;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lq3/i;->b()Lq3/i;

    :cond_4
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lq3/i;->_next:Ljava/lang/Object;

    instance-of v1, v0, Lq3/n;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lq3/n;

    invoke-virtual {v0, p0}, Lq3/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final g()Lq3/i;
    .locals 2

    invoke-virtual {p0}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lq3/o;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lq3/o;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, v1, Lq3/o;->a:Lq3/i;

    if-nez v1, :cond_2

    :cond_1
    move-object v1, v0

    check-cast v1, Lq3/i;

    :cond_2
    return-object v1
.end method

.method public final h()Lq3/i;
    .locals 2

    invoke-virtual {p0}, Lq3/i;->b()Lq3/i;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lq3/i;->_prev:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    :goto_0
    invoke-virtual {v0}, Lq3/i;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lq3/i;->_prev:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public i()Z
    .locals 1

    invoke-virtual {p0}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lq3/o;

    return v0
.end method

.method public final j()Z
    .locals 7

    :cond_0
    invoke-virtual {p0}, Lq3/i;->f()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lq3/o;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lq3/o;

    iget-object v0, v0, Lq3/o;->a:Lq3/i;

    goto :goto_1

    :cond_1
    if-ne v0, p0, :cond_2

    check-cast v0, Lq3/i;

    goto :goto_1

    :cond_2
    move-object v1, v0

    check-cast v1, Lq3/i;

    iget-object v4, v1, Lq3/i;->_removedRef:Ljava/lang/Object;

    check-cast v4, Lq3/o;

    if-nez v4, :cond_3

    new-instance v4, Lq3/o;

    invoke-direct {v4, v1}, Lq3/o;-><init>(Lq3/i;)V

    sget-object v5, Lq3/i;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v5, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    sget-object v5, Lq3/i;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_4
    invoke-virtual {v5, p0, v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v0, :cond_4

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1}, Lq3/i;->b()Lq3/i;

    :goto_1
    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Lq3/i$b;

    invoke-direct {v1, p0}, Lq3/i$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lm3/a0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
