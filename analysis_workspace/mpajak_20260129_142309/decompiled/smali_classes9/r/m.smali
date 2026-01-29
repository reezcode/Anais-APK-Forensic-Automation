.class public final Lr/m;
.super Ljava/lang/Object;

# interfaces
.implements Lr/o;
.implements Lt/i$a;
.implements Lr/q$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/m$b;,
        Lr/m$a;,
        Lr/m$c;,
        Lr/m$d;
    }
.end annotation


# static fields
.field public static final h:Z


# instance fields
.field public final a:Lr/t;

.field public final b:Ld1/d;

.field public final c:Lt/i;

.field public final d:Lr/m$b;

.field public final e:Lr/z;

.field public final f:Lr/m$a;

.field public final g:Lr/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "Engine"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lr/m;->h:Z

    return-void
.end method

.method public constructor <init>(Lt/i;Lt/a$a;Lu/a;Lu/a;Lu/a;Lu/a;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/m;->c:Lt/i;

    new-instance v0, Lr/m$c;

    invoke-direct {v0, p2}, Lr/m$c;-><init>(Lt/a$a;)V

    new-instance p2, Lr/c;

    invoke-direct {p2}, Lr/c;-><init>()V

    iput-object p2, p0, Lr/m;->g:Lr/c;

    monitor-enter p0

    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object p0, p2, Lr/c;->d:Lr/q$a;

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    new-instance p2, Ld1/d;

    invoke-direct {p2}, Ld1/d;-><init>()V

    iput-object p2, p0, Lr/m;->b:Ld1/d;

    new-instance p2, Lr/t;

    invoke-direct {p2}, Lr/t;-><init>()V

    iput-object p2, p0, Lr/m;->a:Lr/t;

    new-instance p2, Lr/m$b;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p0

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lr/m$b;-><init>(Lu/a;Lu/a;Lu/a;Lu/a;Lr/o;Lr/q$a;)V

    iput-object p2, p0, Lr/m;->d:Lr/m$b;

    new-instance p2, Lr/m$a;

    invoke-direct {p2, v0}, Lr/m$a;-><init>(Lr/j$d;)V

    iput-object p2, p0, Lr/m;->f:Lr/m$a;

    new-instance p2, Lr/z;

    invoke-direct {p2}, Lr/z;-><init>()V

    iput-object p2, p0, Lr/m;->e:Lr/z;

    check-cast p1, Lt/h;

    iput-object p0, p1, Lt/h;->d:Lt/i$a;

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public static d(Ljava/lang/String;JLp/f;)V
    .locals 1

    const-string v0, " in "

    invoke-static {p0, v0}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {p1, p2}, Ll0/f;->a(J)D

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, "ms, key: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Engine"

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final a(Lp/f;Lr/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            "Lr/q<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lr/m;->g:Lr/c;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lr/c;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/c$a;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    iput-object v2, v1, Lr/c$a;->c:Lr/w;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    iget-boolean v0, p2, Lr/q;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/m;->c:Lt/i;

    check-cast v0, Lt/h;

    invoke-virtual {v0, p1, p2}, Ll0/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr/w;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lr/m;->e:Lr/z;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lr/z;->a(Lr/w;Z)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b(Lcom/bumptech/glide/d;Ljava/lang/Object;Lp/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;Lr/l;Ljava/util/Map;ZZLp/h;ZZZZLh0/g;Ljava/util/concurrent/Executor;)Lr/m$d;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/d;",
            "Ljava/lang/Object;",
            "Lp/f;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/f;",
            "Lr/l;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lp/l<",
            "*>;>;ZZ",
            "Lp/h;",
            "ZZZZ",
            "Lh0/g;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lr/m$d;"
        }
    .end annotation

    move-object/from16 v15, p0

    sget-boolean v0, Lr/m;->h:Z

    if-eqz v0, :cond_0

    sget v0, Ll0/f;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    move-wide v13, v0

    iget-object v0, v15, Lr/m;->b:Ld1/d;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lr/p;

    move-object v1, v0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p10

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p13

    invoke-direct/range {v1 .. v9}, Lr/p;-><init>(Ljava/lang/Object;Lp/f;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Lp/h;)V

    monitor-enter p0

    move/from16 v12, p14

    :try_start_0
    invoke-virtual {v15, v0, v12, v13, v14}, Lr/m;->c(Lr/p;ZJ)Lr/q;

    move-result-object v1

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v22, v13

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, v0

    invoke-virtual/range {v1 .. v23}, Lr/m;->g(Lcom/bumptech/glide/d;Ljava/lang/Object;Lp/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;Lr/l;Ljava/util/Map;ZZLp/h;ZZZZLh0/g;Ljava/util/concurrent/Executor;Lr/p;J)Lr/m$d;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lp/a;->f:Lp/a;

    const/4 v2, 0x0

    move-object/from16 v3, p18

    check-cast v3, Lh0/h;

    invoke-virtual {v3, v1, v0, v2}, Lh0/h;->p(Lr/w;Lp/a;Z)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final c(Lr/p;ZJ)Lr/q;
    .locals 8
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/p;",
            "ZJ)",
            "Lr/q<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    iget-object p2, p0, Lr/m;->g:Lr/c;

    monitor-enter p2

    :try_start_0
    iget-object v1, p2, Lr/c;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/c$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_1

    monitor-exit p2

    move-object v2, v0

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/q;

    if-nez v2, :cond_2

    invoke-virtual {p2, v1}, Lr/c;->b(Lr/c$a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    monitor-exit p2

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lr/q;->a()V

    :cond_3
    if-eqz v2, :cond_5

    sget-boolean p2, Lr/m;->h:Z

    if-eqz p2, :cond_4

    const-string p2, "Loaded resource from active resources"

    invoke-static {p2, p3, p4, p1}, Lr/m;->d(Ljava/lang/String;JLp/f;)V

    :cond_4
    return-object v2

    :cond_5
    iget-object p2, p0, Lr/m;->c:Lt/i;

    check-cast p2, Lt/h;

    monitor-enter p2

    :try_start_2
    iget-object v1, p2, Ll0/g;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/g$a;

    if-nez v1, :cond_6

    move-object v1, v0

    goto :goto_1

    :cond_6
    iget-wide v2, p2, Ll0/g;->c:J

    iget v4, v1, Ll0/g$a;->b:I

    int-to-long v4, v4

    sub-long/2addr v2, v4

    iput-wide v2, p2, Ll0/g;->c:J

    iget-object v1, v1, Ll0/g$a;->a:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit p2

    move-object v3, v1

    check-cast v3, Lr/w;

    if-nez v3, :cond_7

    move-object v3, v0

    goto :goto_2

    :cond_7
    instance-of p2, v3, Lr/q;

    if-eqz p2, :cond_8

    check-cast v3, Lr/q;

    goto :goto_2

    :cond_8
    new-instance p2, Lr/q;

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v2, p2

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v2 .. v7}, Lr/q;-><init>(Lr/w;ZZLp/f;Lr/q$a;)V

    move-object v3, p2

    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lr/q;->a()V

    iget-object p2, p0, Lr/m;->g:Lr/c;

    invoke-virtual {p2, p1, v3}, Lr/c;->a(Lp/f;Lr/q;)V

    :cond_9
    if-eqz v3, :cond_b

    sget-boolean p2, Lr/m;->h:Z

    if-eqz p2, :cond_a

    const-string p2, "Loaded resource from cache"

    invoke-static {p2, p3, p4, p1}, Lr/m;->d(Ljava/lang/String;JLp/f;)V

    :cond_a
    return-object v3

    :cond_b
    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit p2

    throw p1
.end method

.method public final declared-synchronized e(Lr/n;Lp/f;Lr/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/n<",
            "*>;",
            "Lp/f;",
            "Lr/q<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    iget-boolean v0, p3, Lr/q;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr/m;->g:Lr/c;

    invoke-virtual {v0, p2, p3}, Lr/c;->a(Lp/f;Lr/q;)V

    :cond_0
    iget-object p3, p0, Lr/m;->a:Lr/t;

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p1, Lr/n;->q:Z

    invoke-virtual {p3, v0}, Lr/t;->c(Z)Ljava/util/Map;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p3, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f(Lr/w;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/w<",
            "*>;)V"
        }
    .end annotation

    instance-of v0, p1, Lr/q;

    if-eqz v0, :cond_0

    check-cast p1, Lr/q;

    invoke-virtual {p1}, Lr/q;->c()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lcom/bumptech/glide/d;Ljava/lang/Object;Lp/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;Lr/l;Ljava/util/Map;ZZLp/h;ZZZZLh0/g;Ljava/util/concurrent/Executor;Lr/p;J)Lr/m$d;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/d;",
            "Ljava/lang/Object;",
            "Lp/f;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/f;",
            "Lr/l;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lp/l<",
            "*>;>;ZZ",
            "Lp/h;",
            "ZZZZ",
            "Lh0/g;",
            "Ljava/util/concurrent/Executor;",
            "Lr/p;",
            "J)",
            "Lr/m$d;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p13

    move/from16 v9, p17

    move-object/from16 v10, p18

    move-object/from16 v11, p19

    move-object/from16 v12, p20

    move-wide/from16 v13, p21

    iget-object v15, v1, Lr/m;->a:Lr/t;

    invoke-virtual {v15, v9}, Lr/t;->c(Z)Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr/n;

    if-eqz v15, :cond_1

    invoke-virtual {v15, v10, v11}, Lr/n;->a(Lh0/g;Ljava/util/concurrent/Executor;)V

    sget-boolean v0, Lr/m;->h:Z

    if-eqz v0, :cond_0

    const-string v0, "Added to existing load"

    invoke-static {v0, v13, v14, v12}, Lr/m;->d(Ljava/lang/String;JLp/f;)V

    :cond_0
    new-instance v0, Lr/m$d;

    invoke-direct {v0, v1, v10, v15}, Lr/m$d;-><init>(Lr/m;Lh0/g;Lr/n;)V

    return-object v0

    :cond_1
    iget-object v15, v1, Lr/m;->d:Lr/m$b;

    iget-object v15, v15, Lr/m$b;->g:Lm0/a$c;

    invoke-virtual {v15}, Lm0/a$c;->acquire()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr/n;

    const-string v13, "Argument must not be null"

    invoke-static {v15, v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    monitor-enter v15

    :try_start_0
    iput-object v12, v15, Lr/n;->m:Lp/f;

    move/from16 v13, p14

    iput-boolean v13, v15, Lr/n;->n:Z

    move/from16 v13, p15

    iput-boolean v13, v15, Lr/n;->o:Z

    move/from16 v13, p16

    iput-boolean v13, v15, Lr/n;->p:Z

    iput-boolean v9, v15, Lr/n;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v15

    iget-object v13, v1, Lr/m;->f:Lr/m$a;

    iget-object v14, v13, Lr/m$a;->b:Lm0/a$c;

    invoke-virtual {v14}, Lm0/a$c;->acquire()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/j;

    const-string v10, "Argument must not be null"

    invoke-static {v14, v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget v10, v13, Lr/m$a;->c:I

    add-int/lit8 v11, v10, 0x1

    iput v11, v13, Lr/m$a;->c:I

    iget-object v11, v14, Lr/j;->b:Lr/i;

    iget-object v13, v14, Lr/j;->e:Lr/j$d;

    iput-object v0, v11, Lr/i;->c:Lcom/bumptech/glide/d;

    iput-object v2, v11, Lr/i;->d:Ljava/lang/Object;

    iput-object v3, v11, Lr/i;->n:Lp/f;

    iput v4, v11, Lr/i;->e:I

    iput v5, v11, Lr/i;->f:I

    iput-object v7, v11, Lr/i;->p:Lr/l;

    move-object/from16 v1, p6

    iput-object v1, v11, Lr/i;->g:Ljava/lang/Class;

    iput-object v13, v11, Lr/i;->h:Lr/j$d;

    move-object/from16 v1, p7

    iput-object v1, v11, Lr/i;->k:Ljava/lang/Class;

    iput-object v6, v11, Lr/i;->o:Lcom/bumptech/glide/f;

    iput-object v8, v11, Lr/i;->i:Lp/h;

    move-object/from16 v1, p10

    iput-object v1, v11, Lr/i;->j:Ljava/util/Map;

    move/from16 v1, p11

    iput-boolean v1, v11, Lr/i;->q:Z

    move/from16 v1, p12

    iput-boolean v1, v11, Lr/i;->r:Z

    iput-object v0, v14, Lr/j;->i:Lcom/bumptech/glide/d;

    iput-object v3, v14, Lr/j;->j:Lp/f;

    iput-object v6, v14, Lr/j;->k:Lcom/bumptech/glide/f;

    iput-object v12, v14, Lr/j;->l:Lr/p;

    iput v4, v14, Lr/j;->m:I

    iput v5, v14, Lr/j;->n:I

    iput-object v7, v14, Lr/j;->o:Lr/l;

    iput-boolean v9, v14, Lr/j;->v:Z

    iput-object v8, v14, Lr/j;->p:Lp/h;

    iput-object v15, v14, Lr/j;->q:Lr/j$a;

    iput v10, v14, Lr/j;->r:I

    const/4 v0, 0x1

    iput v0, v14, Lr/j;->t:I

    iput-object v2, v14, Lr/j;->w:Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v2, v1, Lr/m;->a:Lr/t;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v3, v15, Lr/n;->q:Z

    invoke-virtual {v2, v3}, Lr/t;->c(Z)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, p18

    move-object/from16 v3, p19

    invoke-virtual {v15, v2, v3}, Lr/n;->a(Lh0/g;Ljava/util/concurrent/Executor;)V

    monitor-enter v15

    :try_start_1
    iput-object v14, v15, Lr/n;->x:Lr/j;

    invoke-virtual {v14, v0}, Lr/j;->i(I)I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    iget-object v0, v15, Lr/n;->h:Lu/a;

    goto :goto_1

    :cond_4
    iget-boolean v0, v15, Lr/n;->o:Z

    if-eqz v0, :cond_5

    iget-object v0, v15, Lr/n;->j:Lu/a;

    goto :goto_1

    :cond_5
    iget-boolean v0, v15, Lr/n;->p:Z

    if-eqz v0, :cond_6

    iget-object v0, v15, Lr/n;->k:Lu/a;

    goto :goto_1

    :cond_6
    iget-object v0, v15, Lr/n;->i:Lu/a;

    :goto_1
    invoke-virtual {v0, v14}, Lu/a;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v15

    sget-boolean v0, Lr/m;->h:Z

    if-eqz v0, :cond_7

    const-string v0, "Started new load"

    move-wide/from16 v3, p21

    invoke-static {v0, v3, v4, v12}, Lr/m;->d(Ljava/lang/String;JLp/f;)V

    :cond_7
    new-instance v0, Lr/m$d;

    invoke-direct {v0, v1, v2, v15}, Lr/m$d;-><init>(Lr/m;Lh0/g;Lr/n;)V

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v15

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v15

    throw v0
.end method
