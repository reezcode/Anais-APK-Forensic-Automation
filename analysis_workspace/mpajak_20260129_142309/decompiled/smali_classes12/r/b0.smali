.class public final Lr/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lr/h;
.implements Lr/h$a;


# instance fields
.field public final b:Lr/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/i<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Lr/h$a;

.field public d:I

.field public e:Lr/e;

.field public f:Ljava/lang/Object;

.field public volatile g:Lv/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/o$a<",
            "*>;"
        }
    .end annotation
.end field

.field public h:Lr/f;


# direct methods
.method public constructor <init>(Lr/i;Lr/h$a;)V
    .locals 0
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

    iput-object p1, p0, Lr/b0;->b:Lr/i;

    iput-object p2, p0, Lr/b0;->c:Lr/h$a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final b(Lp/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lp/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            "Ljava/lang/Exception;",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;",
            "Lp/a;",
            ")V"
        }
    .end annotation

    iget-object p4, p0, Lr/b0;->c:Lr/h$a;

    iget-object v0, p0, Lr/b0;->g:Lv/o$a;

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->e()Lp/a;

    move-result-object v0

    invoke-interface {p4, p1, p2, p3, v0}, Lr/h$a;->b(Lp/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lp/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lr/b0;->g:Lv/o$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method public final d(Lp/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lp/a;Lp/f;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/load/data/d<",
            "*>;",
            "Lp/a;",
            "Lp/f;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lr/b0;->c:Lr/h$a;

    iget-object p4, p0, Lr/b0;->g:Lv/o$a;

    iget-object p4, p4, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {p4}, Lcom/bumptech/glide/load/data/d;->e()Lp/a;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lr/h$a;->d(Lp/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lp/a;Lp/f;)V

    return-void
.end method

.method public final e()Z
    .locals 11

    iget-object v0, p0, Lr/b0;->f:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-object v1, p0, Lr/b0;->f:Ljava/lang/Object;

    const-string v2, "SourceGenerator"

    sget v3, Ll0/f;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v3

    :try_start_0
    iget-object v5, p0, Lr/b0;->b:Lr/i;

    invoke-virtual {v5, v0}, Lr/i;->e(Ljava/lang/Object;)Lp/d;

    move-result-object v5

    new-instance v6, Lr/g;

    iget-object v7, p0, Lr/b0;->b:Lr/i;

    iget-object v7, v7, Lr/i;->i:Lp/h;

    invoke-direct {v6, v5, v0, v7}, Lr/g;-><init>(Lp/d;Ljava/lang/Object;Lp/h;)V

    new-instance v7, Lr/f;

    iget-object v8, p0, Lr/b0;->g:Lv/o$a;

    iget-object v8, v8, Lv/o$a;->a:Lp/f;

    iget-object v9, p0, Lr/b0;->b:Lr/i;

    iget-object v10, v9, Lr/i;->n:Lp/f;

    invoke-direct {v7, v8, v10}, Lr/f;-><init>(Lp/f;Lp/f;)V

    iput-object v7, p0, Lr/b0;->h:Lr/f;

    invoke-virtual {v9}, Lr/i;->b()Lt/a;

    move-result-object v7

    iget-object v8, p0, Lr/b0;->h:Lr/f;

    invoke-interface {v7, v8, v6}, Lt/a;->b(Lp/f;Lt/a$b;)V

    const/4 v6, 0x2

    invoke-static {v2, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Finished encoding source to cache, key: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lr/b0;->h:Lr/f;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", data: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", encoder: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", duration: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Ll0/f;->a(J)D

    move-result-wide v3

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lr/b0;->g:Lv/o$a;

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->b()V

    new-instance v0, Lr/e;

    iget-object v2, p0, Lr/b0;->g:Lv/o$a;

    iget-object v2, v2, Lv/o$a;->a:Lp/f;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lr/b0;->b:Lr/i;

    invoke-direct {v0, v2, v3, p0}, Lr/e;-><init>(Ljava/util/List;Lr/i;Lr/h$a;)V

    iput-object v0, p0, Lr/b0;->e:Lr/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lr/b0;->g:Lv/o$a;

    iget-object v1, v1, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lr/b0;->e:Lr/e;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lr/e;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    iput-object v1, p0, Lr/b0;->e:Lr/e;

    iput-object v1, p0, Lr/b0;->g:Lv/o$a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_3
    :goto_1
    if-nez v1, :cond_6

    iget v3, p0, Lr/b0;->d:I

    iget-object v4, p0, Lr/b0;->b:Lr/i;

    invoke-virtual {v4}, Lr/i;->c()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_6

    iget-object v3, p0, Lr/b0;->b:Lr/i;

    invoke-virtual {v3}, Lr/i;->c()Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lr/b0;->d:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lr/b0;->d:I

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv/o$a;

    iput-object v3, p0, Lr/b0;->g:Lv/o$a;

    iget-object v3, p0, Lr/b0;->g:Lv/o$a;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lr/b0;->b:Lr/i;

    iget-object v3, v3, Lr/i;->p:Lr/l;

    iget-object v4, p0, Lr/b0;->g:Lv/o$a;

    iget-object v4, v4, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/d;->e()Lp/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lr/l;->c(Lp/a;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lr/b0;->b:Lr/i;

    iget-object v4, p0, Lr/b0;->g:Lv/o$a;

    iget-object v4, v4, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Lr/i;->g(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_5
    iget-object v1, p0, Lr/b0;->g:Lv/o$a;

    iget-object v3, p0, Lr/b0;->g:Lv/o$a;

    iget-object v3, v3, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v4, p0, Lr/b0;->b:Lr/i;

    iget-object v4, v4, Lr/i;->o:Lcom/bumptech/glide/f;

    new-instance v5, Lr/a0;

    invoke-direct {v5, p0, v1}, Lr/a0;-><init>(Lr/b0;Lv/o$a;)V

    invoke-interface {v3, v4, v5}, Lcom/bumptech/glide/load/data/d;->f(Lcom/bumptech/glide/f;Lcom/bumptech/glide/load/data/d$a;)V

    const/4 v1, 0x1

    goto :goto_1

    :cond_6
    return v1
.end method
