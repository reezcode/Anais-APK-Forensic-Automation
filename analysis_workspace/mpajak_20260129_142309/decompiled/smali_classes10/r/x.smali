.class public final Lr/x;
.super Ljava/lang/Object;

# interfaces
.implements Lr/h;
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr/h;",
        "Lcom/bumptech/glide/load/data/d$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lr/h$a;

.field public final c:Lr/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/i<",
            "*>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:Lp/f;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv/o<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation
.end field

.field public h:I

.field public volatile i:Lv/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/o$a<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Ljava/io/File;

.field public k:Lr/y;


# direct methods
.method public constructor <init>(Lr/i;Lr/h$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/i<",
            "*>;",
            "Lr/h$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lr/x;->e:I

    iput-object p1, p0, Lr/x;->c:Lr/i;

    iput-object p2, p0, Lr/x;->b:Lr/h$a;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lr/x;->b:Lr/h$a;

    iget-object v1, p0, Lr/x;->k:Lr/y;

    iget-object v2, p0, Lr/x;->i:Lv/o$a;

    iget-object v2, v2, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v3, Lp/a;->e:Lp/a;

    invoke-interface {v0, v1, p1, v2, v3}, Lr/h$a;->b(Lp/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lp/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lr/x;->i:Lv/o$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lr/x;->b:Lr/h$a;

    iget-object v1, p0, Lr/x;->f:Lp/f;

    iget-object v2, p0, Lr/x;->i:Lv/o$a;

    iget-object v3, v2, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v4, Lp/a;->e:Lp/a;

    iget-object v5, p0, Lr/x;->k:Lr/y;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lr/h$a;->d(Lp/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lp/a;Lp/f;)V

    return-void
.end method

.method public final e()Z
    .locals 21

    move-object/from16 v1, p0

    iget-object v0, v1, Lr/x;->c:Lr/i;

    invoke-virtual {v0}, Lr/i;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    iget-object v2, v1, Lr/x;->c:Lr/i;

    iget-object v4, v2, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object v4, v4, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/g;

    iget-object v5, v2, Lr/i;->d:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    iget-object v6, v2, Lr/i;->g:Ljava/lang/Class;

    iget-object v2, v2, Lr/i;->k:Ljava/lang/Class;

    iget-object v7, v4, Lcom/bumptech/glide/g;->h:Lg0/d;

    iget-object v8, v7, Lg0/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll0/i;

    if-nez v8, :cond_1

    new-instance v8, Ll0/i;

    invoke-direct {v8, v5, v6, v2}, Ll0/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v8, v5, v6, v2}, Ll0/i;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    :goto_0
    iget-object v10, v7, Lg0/d;->b:Landroidx/collection/ArrayMap;

    monitor-enter v10

    :try_start_0
    iget-object v11, v7, Lg0/d;->b:Landroidx/collection/ArrayMap;

    invoke-virtual {v11, v8}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v7, v7, Lg0/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    if-nez v11, :cond_5

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iget-object v7, v4, Lcom/bumptech/glide/g;->a:Lv/q;

    monitor-enter v7

    :try_start_1
    iget-object v8, v7, Lv/q;->a:Lv/s;

    invoke-virtual {v8, v5}, Lv/s;->d(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v7

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    iget-object v10, v4, Lcom/bumptech/glide/g;->c:Lg0/e;

    invoke-virtual {v10, v8, v6}, Lg0/e;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Class;

    iget-object v12, v4, Lcom/bumptech/glide/g;->f:Ld0/f;

    invoke-virtual {v12, v10, v2}, Ld0/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v4, v4, Lcom/bumptech/glide/g;->h:Lg0/d;

    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    iget-object v8, v4, Lg0/d;->b:Landroidx/collection/ArrayMap;

    monitor-enter v8

    :try_start_2
    iget-object v4, v4, Lg0/d;->b:Landroidx/collection/ArrayMap;

    new-instance v10, Ll0/i;

    invoke-direct {v10, v5, v6, v2}, Ll0/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v4, v10, v7}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v8

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v7

    throw v0

    :cond_5
    :goto_2
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    const-class v0, Ljava/io/File;

    iget-object v2, v1, Lr/x;->c:Lr/i;

    iget-object v2, v2, Lr/i;->k:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    return v3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Failed to find any load path from "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v1, Lr/x;->c:Lr/i;

    iget-object v3, v3, Lr/i;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lr/x;->c:Lr/i;

    iget-object v3, v3, Lr/i;->k:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    iget-object v2, v1, Lr/x;->g:Ljava/util/List;

    if-eqz v2, :cond_d

    iget v4, v1, Lr/x;->h:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v4, v2, :cond_8

    const/4 v2, 0x1

    goto :goto_4

    :cond_8
    const/4 v2, 0x0

    :goto_4
    if-nez v2, :cond_9

    goto :goto_7

    :cond_9
    iput-object v9, v1, Lr/x;->i:Lv/o$a;

    const/4 v0, 0x0

    :cond_a
    :goto_5
    if-nez v0, :cond_c

    iget v2, v1, Lr/x;->h:I

    iget-object v3, v1, Lr/x;->g:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    const/4 v2, 0x1

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    if-eqz v2, :cond_c

    iget-object v2, v1, Lr/x;->g:Ljava/util/List;

    iget v3, v1, Lr/x;->h:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v1, Lr/x;->h:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv/o;

    iget-object v3, v1, Lr/x;->j:Ljava/io/File;

    iget-object v4, v1, Lr/x;->c:Lr/i;

    iget v5, v4, Lr/i;->e:I

    iget v6, v4, Lr/i;->f:I

    iget-object v4, v4, Lr/i;->i:Lp/h;

    invoke-interface {v2, v3, v5, v6, v4}, Lv/o;->a(Ljava/lang/Object;IILp/h;)Lv/o$a;

    move-result-object v2

    iput-object v2, v1, Lr/x;->i:Lv/o$a;

    iget-object v2, v1, Lr/x;->i:Lv/o$a;

    if-eqz v2, :cond_a

    iget-object v2, v1, Lr/x;->c:Lr/i;

    iget-object v3, v1, Lr/x;->i:Lv/o$a;

    iget-object v3, v3, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lr/i;->g(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v0, v1, Lr/x;->i:Lv/o$a;

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v2, v1, Lr/x;->c:Lr/i;

    iget-object v2, v2, Lr/i;->o:Lcom/bumptech/glide/f;

    invoke-interface {v0, v2, v1}, Lcom/bumptech/glide/load/data/d;->f(Lcom/bumptech/glide/f;Lcom/bumptech/glide/load/data/d$a;)V

    const/4 v0, 0x1

    goto :goto_5

    :cond_c
    return v0

    :cond_d
    :goto_7
    iget v2, v1, Lr/x;->e:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lr/x;->e:I

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v4

    if-lt v2, v4, :cond_f

    iget v2, v1, Lr/x;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lr/x;->d:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-lt v2, v4, :cond_e

    return v3

    :cond_e
    iput v3, v1, Lr/x;->e:I

    :cond_f
    iget v2, v1, Lr/x;->d:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/f;

    iget v4, v1, Lr/x;->e:I

    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    iget-object v5, v1, Lr/x;->c:Lr/i;

    invoke-virtual {v5, v4}, Lr/i;->f(Ljava/lang/Class;)Lp/l;

    move-result-object v18

    new-instance v5, Lr/y;

    iget-object v6, v1, Lr/x;->c:Lr/i;

    iget-object v7, v6, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object v13, v7, Lcom/bumptech/glide/d;->a:Ls/b;

    iget-object v15, v6, Lr/i;->n:Lp/f;

    iget v7, v6, Lr/i;->e:I

    iget v8, v6, Lr/i;->f:I

    iget-object v10, v6, Lr/i;->i:Lp/h;

    move-object v12, v5

    move-object v14, v2

    move/from16 v16, v7

    move/from16 v17, v8

    move-object/from16 v19, v4

    move-object/from16 v20, v10

    invoke-direct/range {v12 .. v20}, Lr/y;-><init>(Ls/b;Lp/f;Lp/f;IILp/l;Ljava/lang/Class;Lp/h;)V

    iput-object v5, v1, Lr/x;->k:Lr/y;

    invoke-virtual {v6}, Lr/i;->b()Lt/a;

    move-result-object v4

    iget-object v5, v1, Lr/x;->k:Lr/y;

    invoke-interface {v4, v5}, Lt/a;->a(Lp/f;)Ljava/io/File;

    move-result-object v4

    iput-object v4, v1, Lr/x;->j:Ljava/io/File;

    if-eqz v4, :cond_7

    iput-object v2, v1, Lr/x;->f:Lp/f;

    iget-object v2, v1, Lr/x;->c:Lr/i;

    iget-object v2, v2, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object v2, v2, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/g;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/g;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lr/x;->g:Ljava/util/List;

    iput v3, v1, Lr/x;->h:I

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method
