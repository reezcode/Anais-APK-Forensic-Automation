.class public final Lh0/h;
.super Ljava/lang/Object;

# interfaces
.implements Lh0/c;
.implements Li0/g;
.implements Lh0/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lh0/c;",
        "Li0/g;",
        "Lh0/g;"
    }
.end annotation


# static fields
.field public static final D:Z


# instance fields
.field public A:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation
.end field

.field public B:Z
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation
.end field

.field public C:Ljava/lang/RuntimeException;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final a:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final b:Lm0/d$a;

.field public final c:Ljava/lang/Object;

.field public final d:Lh0/e;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/e<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final e:Lh0/d;

.field public final f:Landroid/content/Context;

.field public final g:Lcom/bumptech/glide/d;

.field public final h:Ljava/lang/Object;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final j:Lh0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/a<",
            "*>;"
        }
    .end annotation
.end field

.field public final k:I

.field public final l:I

.field public final m:Lcom/bumptech/glide/f;

.field public final n:Li0/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li0/h<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final o:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh0/e<",
            "TR;>;>;"
        }
    .end annotation
.end field

.field public final p:Lj0/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj0/b<",
            "-TR;>;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/concurrent/Executor;

.field public r:Lr/w;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/w<",
            "TR;>;"
        }
    .end annotation
.end field

.field public s:Lr/m$d;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation
.end field

.field public t:J
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation
.end field

.field public volatile u:Lr/m;

.field public v:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation
.end field

.field public w:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public x:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public y:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public z:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "Request"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lh0/h;->D:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/d;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lh0/a;IILcom/bumptech/glide/f;Li0/h;Ljava/util/List;Lh0/d;Lr/m;)V
    .locals 6
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/d;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lh0/a<",
            "*>;II",
            "Lcom/bumptech/glide/f;",
            "Li0/h<",
            "TR;>;",
            "Lh0/e<",
            "TR;>;",
            "Ljava/util/List<",
            "Lh0/e<",
            "TR;>;>;",
            "Lh0/d;",
            "Lr/m;",
            "Lj0/b<",
            "-TR;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p2

    sget-object v2, Lj0/a;->b:Lj0/a$a;

    sget-object v3, Ll0/e;->a:Ll0/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v4, Lh0/h;->D:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    iput-object v4, v0, Lh0/h;->a:Ljava/lang/String;

    new-instance v4, Lm0/d$a;

    invoke-direct {v4}, Lm0/d$a;-><init>()V

    iput-object v4, v0, Lh0/h;->b:Lm0/d$a;

    move-object v4, p3

    iput-object v4, v0, Lh0/h;->c:Ljava/lang/Object;

    move-object v4, p1

    iput-object v4, v0, Lh0/h;->f:Landroid/content/Context;

    iput-object v1, v0, Lh0/h;->g:Lcom/bumptech/glide/d;

    move-object v4, p4

    iput-object v4, v0, Lh0/h;->h:Ljava/lang/Object;

    move-object v4, p5

    iput-object v4, v0, Lh0/h;->i:Ljava/lang/Class;

    move-object v4, p6

    iput-object v4, v0, Lh0/h;->j:Lh0/a;

    move v4, p7

    iput v4, v0, Lh0/h;->k:I

    move v4, p8

    iput v4, v0, Lh0/h;->l:I

    move-object v4, p9

    iput-object v4, v0, Lh0/h;->m:Lcom/bumptech/glide/f;

    move-object/from16 v4, p10

    iput-object v4, v0, Lh0/h;->n:Li0/h;

    iput-object v5, v0, Lh0/h;->d:Lh0/e;

    move-object/from16 v4, p11

    iput-object v4, v0, Lh0/h;->o:Ljava/util/List;

    move-object/from16 v4, p12

    iput-object v4, v0, Lh0/h;->e:Lh0/d;

    move-object/from16 v4, p13

    iput-object v4, v0, Lh0/h;->u:Lr/m;

    iput-object v2, v0, Lh0/h;->p:Lj0/b;

    iput-object v3, v0, Lh0/h;->q:Ljava/util/concurrent/Executor;

    const/4 v2, 0x1

    iput v2, v0, Lh0/h;->v:I

    iget-object v2, v0, Lh0/h;->C:Ljava/lang/RuntimeException;

    if-nez v2, :cond_1

    iget-object v1, v1, Lcom/bumptech/glide/d;->h:Lcom/bumptech/glide/e;

    const-class v2, Lcom/bumptech/glide/c$c;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Glide request origin trace"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lh0/h;->C:Ljava/lang/RuntimeException;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lh0/h;->v:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(II)V
    .locals 23

    move-object/from16 v15, p0

    move/from16 v0, p1

    move/from16 v1, p2

    iget-object v2, v15, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {v2}, Lm0/d$a;->a()V

    iget-object v14, v15, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    sget-boolean v21, Lh0/h;->D:Z

    if-eqz v21, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got onSizeReady in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v15, Lh0/h;->t:J

    invoke-static {v3, v4}, Ll0/f;->a(J)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Lh0/h;->m(Ljava/lang/String;)V

    :cond_0
    iget v2, v15, Lh0/h;->v:I

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    monitor-exit v14

    return-void

    :cond_1
    const/4 v13, 0x2

    iput v13, v15, Lh0/h;->v:I

    iget-object v2, v15, Lh0/h;->j:Lh0/a;

    iget v2, v2, Lh0/a;->c:F

    const/high16 v3, -0x80000000

    if-ne v0, v3, :cond_2

    goto :goto_0

    :cond_2
    int-to-float v0, v0

    mul-float v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_0
    iput v0, v15, Lh0/h;->z:I

    if-ne v1, v3, :cond_3

    move v0, v1

    goto :goto_1

    :cond_3
    int-to-float v0, v1

    mul-float v2, v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_1
    iput v0, v15, Lh0/h;->A:I

    if-eqz v21, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finished setup for calling load in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, v15, Lh0/h;->t:J

    invoke-static {v1, v2}, Ll0/f;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Lh0/h;->m(Ljava/lang/String;)V

    :cond_4
    iget-object v1, v15, Lh0/h;->u:Lr/m;

    iget-object v2, v15, Lh0/h;->g:Lcom/bumptech/glide/d;

    iget-object v3, v15, Lh0/h;->h:Ljava/lang/Object;

    iget-object v0, v15, Lh0/h;->j:Lh0/a;

    iget-object v4, v0, Lh0/a;->m:Lp/f;

    iget v5, v15, Lh0/h;->z:I

    iget v6, v15, Lh0/h;->A:I

    iget-object v7, v0, Lh0/a;->t:Ljava/lang/Class;

    iget-object v8, v15, Lh0/h;->i:Ljava/lang/Class;

    iget-object v9, v15, Lh0/h;->m:Lcom/bumptech/glide/f;

    iget-object v10, v0, Lh0/a;->d:Lr/l;

    iget-object v11, v0, Lh0/a;->s:Ll0/b;

    iget-boolean v12, v0, Lh0/a;->n:Z

    iget-boolean v13, v0, Lh0/a;->z:Z

    move/from16 v17, v13

    iget-object v13, v0, Lh0/a;->r:Lp/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v18, v14

    :try_start_1
    iget-boolean v14, v0, Lh0/a;->j:Z

    move/from16 v19, v14

    iget-boolean v14, v0, Lh0/a;->x:Z

    move/from16 v20, v14

    iget-boolean v14, v0, Lh0/a;->A:Z

    iget-boolean v0, v0, Lh0/a;->y:Z

    move/from16 p1, v0

    iget-object v0, v15, Lh0/h;->q:Ljava/util/concurrent/Executor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v16, v13

    move/from16 v13, v17

    move-object/from16 v22, v18

    move/from16 v17, v19

    move/from16 v18, v20

    move/from16 v19, v14

    move-object/from16 v14, v16

    move/from16 v15, v17

    move/from16 v16, v18

    move/from16 v17, v19

    move/from16 v18, p1

    move-object/from16 v19, p0

    move-object/from16 v20, v0

    :try_start_2
    invoke-virtual/range {v1 .. v20}, Lr/m;->b(Lcom/bumptech/glide/d;Ljava/lang/Object;Lp/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/f;Lr/l;Ljava/util/Map;ZZLp/h;ZZZZLh0/g;Ljava/util/concurrent/Executor;)Lr/m$d;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v1, p0

    :try_start_3
    iput-object v0, v1, Lh0/h;->s:Lr/m$d;

    iget v0, v1, Lh0/h;->v:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v0, 0x0

    iput-object v0, v1, Lh0/h;->s:Lr/m$d;

    :cond_5
    if-eqz v21, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished onSizeReady in "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v1, Lh0/h;->t:J

    invoke-static {v2, v3}, Ll0/f;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh0/h;->m(Ljava/lang/String;)V

    :cond_6
    monitor-exit v22
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v1, v15

    move-object/from16 v22, v18

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object/from16 v22, v14

    move-object v1, v15

    :goto_2
    move-object/from16 v14, v22

    :goto_3
    :try_start_4
    monitor-exit v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    throw v0

    :catchall_4
    move-exception v0

    goto :goto_3
.end method

.method public final c(Lh0/c;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lh0/h;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    iget-object v2, v1, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v4, v1, Lh0/h;->k:I

    iget v5, v1, Lh0/h;->l:I

    iget-object v6, v1, Lh0/h;->h:Ljava/lang/Object;

    iget-object v7, v1, Lh0/h;->i:Ljava/lang/Class;

    iget-object v8, v1, Lh0/h;->j:Lh0/a;

    iget-object v9, v1, Lh0/h;->m:Lcom/bumptech/glide/f;

    iget-object v10, v1, Lh0/h;->o:Ljava/util/List;

    if-eqz v10, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    check-cast v0, Lh0/h;

    iget-object v11, v0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v11

    :try_start_1
    iget v2, v0, Lh0/h;->k:I

    iget v12, v0, Lh0/h;->l:I

    iget-object v13, v0, Lh0/h;->h:Ljava/lang/Object;

    iget-object v14, v0, Lh0/h;->i:Ljava/lang/Class;

    iget-object v15, v0, Lh0/h;->j:Lh0/a;

    iget-object v3, v0, Lh0/h;->m:Lcom/bumptech/glide/f;

    iget-object v0, v0, Lh0/h;->o:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v11, 0x1

    if-ne v4, v2, :cond_6

    if-ne v5, v12, :cond_6

    sget-object v2, Ll0/k;->a:[C

    if-nez v6, :cond_4

    if-nez v13, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    instance-of v2, v6, Lv/l;

    if-eqz v2, :cond_5

    check-cast v6, Lv/l;

    invoke-interface {v6}, Lv/l;->a()Z

    move-result v2

    goto :goto_2

    :cond_5
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_6

    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v8, v15}, Lh0/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-ne v9, v3, :cond_6

    if-ne v10, v0, :cond_6

    const/4 v3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    return v3

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lh0/h;->d()V

    iget-object v1, p0, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {v1}, Lm0/d$a;->a()V

    iget v1, p0, Lh0/h;->v:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {p0}, Lh0/h;->f()V

    iget-object v1, p0, Lh0/h;->r:Lr/w;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iput-object v3, p0, Lh0/h;->r:Lr/w;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    iget-object v3, p0, Lh0/h;->e:Lh0/d;

    if-eqz v3, :cond_3

    invoke-interface {v3, p0}, Lh0/d;->d(Lh0/c;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-eqz v3, :cond_4

    iget-object v3, p0, Lh0/h;->n:Li0/h;

    invoke-virtual {p0}, Lh0/h;->h()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-interface {v3, v4}, Li0/h;->h(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    iput v2, p0, Lh0/h;->v:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    iget-object v0, p0, Lh0/h;->u:Lr/m;

    invoke-virtual {v0, v1}, Lr/m;->f(Lr/w;)V

    :cond_5
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 2
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    iget-boolean v0, p0, Lh0/h;->B:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Z
    .locals 3

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lh0/h;->v:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()V
    .locals 3
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    invoke-virtual {p0}, Lh0/h;->d()V

    iget-object v0, p0, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-object v0, p0, Lh0/h;->n:Li0/h;

    invoke-interface {v0, p0}, Li0/h;->b(Li0/g;)V

    iget-object v0, p0, Lh0/h;->s:Lr/m$d;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lr/m$d;->c:Lr/m;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lr/m$d;->a:Lr/n;

    iget-object v0, v0, Lr/m$d;->b:Lh0/g;

    invoke-virtual {v2, v0}, Lr/n;->h(Lh0/g;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-object v0, p0, Lh0/h;->s:Lr/m$d;

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public final g()Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    iget-object v0, p0, Lh0/h;->y:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh0/h;->j:Lh0/a;

    iget-object v1, v0, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, Lh0/h;->y:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    iget v0, v0, Lh0/a;->q:I

    if-lez v0, :cond_0

    invoke-virtual {p0, v0}, Lh0/h;->l(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lh0/h;->y:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lh0/h;->y:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final h()Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    iget-object v0, p0, Lh0/h;->x:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh0/h;->j:Lh0/a;

    iget-object v1, v0, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, Lh0/h;->x:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    iget v0, v0, Lh0/a;->i:I

    if-lez v0, :cond_0

    invoke-virtual {p0, v0}, Lh0/h;->l(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lh0/h;->x:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lh0/h;->x:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final i()V
    .locals 6

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lh0/h;->d()V

    iget-object v1, p0, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {v1}, Lm0/d$a;->a()V

    sget v1, Ll0/f;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v1

    iput-wide v1, p0, Lh0/h;->t:J

    iget-object v1, p0, Lh0/h;->h:Ljava/lang/Object;

    const/4 v2, 0x3

    if-nez v1, :cond_2

    iget v1, p0, Lh0/h;->k:I

    iget v3, p0, Lh0/h;->l:I

    invoke-static {v1, v3}, Ll0/k;->j(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lh0/h;->k:I

    iput v1, p0, Lh0/h;->z:I

    iget v1, p0, Lh0/h;->l:I

    iput v1, p0, Lh0/h;->A:I

    :cond_0
    invoke-virtual {p0}, Lh0/h;->g()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v2, 0x5

    :cond_1
    new-instance v1, Lr/r;

    const-string v3, "Received null model"

    invoke-direct {v1, v3}, Lr/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Lh0/h;->n(Lr/r;I)V

    monitor-exit v0

    return-void

    :cond_2
    iget v1, p0, Lh0/h;->v:I

    const/4 v3, 0x2

    if-eq v1, v3, :cond_a

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-ne v1, v4, :cond_3

    iget-object v1, p0, Lh0/h;->r:Lr/w;

    sget-object v2, Lp/a;->f:Lp/a;

    invoke-virtual {p0, v1, v2, v5}, Lh0/h;->p(Lr/w;Lp/a;Z)V

    monitor-exit v0

    return-void

    :cond_3
    iput v2, p0, Lh0/h;->v:I

    iget v1, p0, Lh0/h;->k:I

    iget v4, p0, Lh0/h;->l:I

    invoke-static {v1, v4}, Ll0/k;->j(II)Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p0, Lh0/h;->k:I

    iget v4, p0, Lh0/h;->l:I

    invoke-virtual {p0, v1, v4}, Lh0/h;->b(II)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lh0/h;->n:Li0/h;

    invoke-interface {v1, p0}, Li0/h;->a(Li0/g;)V

    :goto_0
    iget v1, p0, Lh0/h;->v:I

    if-eq v1, v3, :cond_5

    if-ne v1, v2, :cond_8

    :cond_5
    iget-object v1, p0, Lh0/h;->e:Lh0/d;

    if-eqz v1, :cond_6

    invoke-interface {v1, p0}, Lh0/d;->k(Lh0/c;)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    const/4 v5, 0x1

    :cond_7
    if-eqz v5, :cond_8

    iget-object v1, p0, Lh0/h;->n:Li0/h;

    invoke-virtual {p0}, Lh0/h;->h()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v1, v2}, Li0/h;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_8
    sget-boolean v1, Lh0/h;->D:Z

    if-eqz v1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished run method in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lh0/h;->t:J

    invoke-static {v2, v3}, Ll0/f;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lh0/h;->m(Ljava/lang/String;)V

    :cond_9
    monitor-exit v0

    return-void

    :cond_a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot restart a running request"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final isRunning()Z
    .locals 3

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lh0/h;->v:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 3

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lh0/h;->v:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k()Z
    .locals 1
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    iget-object v0, p0, Lh0/h;->e:Lh0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lh0/d;->g()Lh0/d;

    move-result-object v0

    invoke-interface {v0}, Lh0/d;->a()Z

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

.method public final l(I)Landroid/graphics/drawable/Drawable;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    iget-object v0, p0, Lh0/h;->j:Lh0/a;

    iget-object v0, v0, Lh0/a;->v:Landroid/content/res/Resources$Theme;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh0/h;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lh0/h;->g:Lcom/bumptech/glide/d;

    invoke-static {v1, v1, p1, v0}, La0/a;->a(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    const-string v0, " this: "

    invoke-static {p1, v0}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lh0/h;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Request"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final n(Lr/r;I)V
    .locals 4

    iget-object v0, p0, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lh0/h;->g:Lcom/bumptech/glide/d;

    iget v1, v1, Lcom/bumptech/glide/d;->i:I

    if-gt v1, p2, :cond_0

    const-string p2, "Glide"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Load failed for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lh0/h;->h:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " with size ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lh0/h;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lh0/h;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    if-gt v1, p2, :cond_0

    invoke-virtual {p1}, Lr/r;->e()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lh0/h;->s:Lr/m$d;

    const/4 p1, 0x5

    iput p1, p0, Lh0/h;->v:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh0/h;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 p2, 0x0

    :try_start_1
    iget-object v1, p0, Lh0/h;->o:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh0/e;

    invoke-virtual {p0}, Lh0/h;->k()Z

    invoke-interface {v3}, Lh0/e;->b()Z

    move-result v3

    or-int/2addr v2, v3

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    iget-object v1, p0, Lh0/h;->d:Lh0/e;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lh0/h;->k()Z

    invoke-interface {v1}, Lh0/e;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    or-int/2addr p1, v2

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lh0/h;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :try_start_2
    iput-boolean p2, p0, Lh0/h;->B:Z

    iget-object p1, p0, Lh0/h;->e:Lh0/d;

    if-eqz p1, :cond_5

    invoke-interface {p1, p0}, Lh0/d;->h(Lh0/c;)V

    :cond_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    iput-boolean p2, p0, Lh0/h;->B:Z

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final o(Lr/w;Ljava/lang/Object;Lp/a;)V
    .locals 3
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/w<",
            "TR;>;TR;",
            "Lp/a;",
            "Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lh0/h;->k()Z

    const/4 v0, 0x4

    iput v0, p0, Lh0/h;->v:I

    iput-object p1, p0, Lh0/h;->r:Lr/w;

    iget-object p1, p0, Lh0/h;->g:Lcom/bumptech/glide/d;

    iget p1, p1, Lcom/bumptech/glide/d;->i:I

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    const-string p1, "Finished loading "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " from "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " for "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lh0/h;->h:Ljava/lang/Object;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " with size ["

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Lh0/h;->z:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "x"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Lh0/h;->A:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] in "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lh0/h;->t:J

    invoke-static {v0, v1}, Ll0/f;->a(J)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p3, " ms"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Glide"

    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lh0/h;->B:Z

    const/4 p3, 0x0

    :try_start_0
    iget-object v0, p0, Lh0/h;->o:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh0/e;

    invoke-interface {v2}, Lh0/e;->a()Z

    move-result v2

    or-int/2addr v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    iget-object v0, p0, Lh0/h;->d:Lh0/e;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lh0/e;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    or-int/2addr p1, v1

    if-nez p1, :cond_4

    iget-object p1, p0, Lh0/h;->p:Lj0/b;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lh0/h;->n:Li0/h;

    invoke-interface {p1, p2}, Li0/h;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    iput-boolean p3, p0, Lh0/h;->B:Z

    iget-object p1, p0, Lh0/h;->e:Lh0/d;

    if-eqz p1, :cond_5

    invoke-interface {p1, p0}, Lh0/d;->b(Lh0/c;)V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    iput-boolean p3, p0, Lh0/h;->B:Z

    throw p1
.end method

.method public final p(Lr/w;Lp/a;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/w<",
            "*>;",
            "Lp/a;",
            "Z)V"
        }
    .end annotation

    iget-object p3, p0, Lh0/h;->b:Lm0/d$a;

    invoke-virtual {p3}, Lm0/d$a;->a()V

    const/4 p3, 0x0

    :try_start_0
    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    iput-object p3, p0, Lh0/h;->s:Lr/m$d;

    const/4 v1, 0x5

    if-nez p1, :cond_0

    new-instance p1, Lr/r;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected to receive a Resource<R> with an object of "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lh0/h;->i:Ljava/lang/Class;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " inside, but instead got null."

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lr/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v1}, Lh0/h;->n(Lr/r;I)V

    monitor-exit v0

    return-void

    :cond_0
    invoke-interface {p1}, Lr/w;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v3, p0, Lh0/h;->i:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    iget-object v1, p0, Lh0/h;->e:Lh0/d;

    if-eqz v1, :cond_3

    invoke-interface {v1, p0}, Lh0/d;->f(Lh0/c;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_4

    :try_start_2
    iput-object p3, p0, Lh0/h;->r:Lr/w;

    const/4 p2, 0x4

    iput p2, p0, Lh0/h;->v:I

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p0, Lh0/h;->u:Lr/m;

    invoke-virtual {p2, p1}, Lr/m;->f(Lr/w;)V

    return-void

    :cond_4
    :try_start_3
    invoke-virtual {p0, p1, v2, p2}, Lh0/h;->o(Lr/w;Ljava/lang/Object;Lp/a;)V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :cond_5
    :goto_3
    :try_start_4
    iput-object p3, p0, Lh0/h;->r:Lr/w;

    new-instance p2, Lr/r;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected to receive an object of "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lh0/h;->i:Ljava/lang/Class;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " but instead got "

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    goto :goto_4

    :cond_6
    const-string v3, ""

    :goto_4
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "{"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "} inside Resource{"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "}."

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_7

    const-string v2, ""

    goto :goto_5

    :cond_7
    const-string v2, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    :goto_5
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lr/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v1}, Lh0/h;->n(Lr/r;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    move-object p3, p1

    move-object p1, p0

    goto :goto_7

    :catchall_1
    move-exception p1

    move-object p2, p0

    :goto_6
    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    :goto_7
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p2

    goto :goto_8

    :catchall_3
    move-exception p2

    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    goto :goto_6

    :catchall_4
    move-exception p2

    move-object p1, p0

    :goto_8
    if-eqz p3, :cond_8

    iget-object p1, p1, Lh0/h;->u:Lr/m;

    invoke-virtual {p1, p3}, Lr/m;->f(Lr/w;)V

    :cond_8
    throw p2
.end method

.method public final pause()V
    .locals 2

    iget-object v0, p0, Lh0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lh0/h;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lh0/h;->clear()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final q()V
    .locals 2
    .annotation build Landroidx/annotation/GuardedBy;
        value = "requestLock"
    .end annotation

    iget-object v0, p0, Lh0/h;->e:Lh0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lh0/d;->k(Lh0/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x0

    iget-object v1, p0, Lh0/h;->h:Ljava/lang/Object;

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lh0/h;->g()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_3
    if-nez v0, :cond_5

    iget-object v0, p0, Lh0/h;->w:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_4

    iget-object v0, p0, Lh0/h;->j:Lh0/a;

    iget-object v1, v0, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, Lh0/h;->w:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_4

    iget v0, v0, Lh0/a;->g:I

    if-lez v0, :cond_4

    invoke-virtual {p0, v0}, Lh0/h;->l(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lh0/h;->w:Landroid/graphics/drawable/Drawable;

    :cond_4
    iget-object v0, p0, Lh0/h;->w:Landroid/graphics/drawable/Drawable;

    :cond_5
    if-nez v0, :cond_6

    invoke-virtual {p0}, Lh0/h;->h()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_6
    iget-object v1, p0, Lh0/h;->n:Li0/h;

    invoke-interface {v1, v0}, Li0/h;->c(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
