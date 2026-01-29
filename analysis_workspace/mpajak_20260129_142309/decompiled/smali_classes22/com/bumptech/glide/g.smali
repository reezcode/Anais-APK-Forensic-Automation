.class public final Lcom/bumptech/glide/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/g$b;,
        Lcom/bumptech/glide/g$a;,
        Lcom/bumptech/glide/g$e;,
        Lcom/bumptech/glide/g$d;,
        Lcom/bumptech/glide/g$c;
    }
.end annotation


# instance fields
.field public final a:Lv/q;

.field public final b:Lg0/a;

.field public final c:Lg0/e;

.field public final d:Lg0/f;

.field public final e:Lcom/bumptech/glide/load/data/f;

.field public final f:Ld0/f;

.field public final g:Lg0/b;

.field public final h:Lg0/d;

.field public final i:Lg0/c;

.field public final j:Lm0/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg0/d;

    invoke-direct {v0}, Lg0/d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->h:Lg0/d;

    new-instance v0, Lg0/c;

    invoke-direct {v0}, Lg0/c;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->i:Lg0/c;

    new-instance v0, Landroidx/core/util/Pools$SynchronizedPool;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    new-instance v1, Lm0/b;

    invoke-direct {v1}, Lm0/b;-><init>()V

    new-instance v2, Lm0/c;

    invoke-direct {v2}, Lm0/c;-><init>()V

    new-instance v3, Lm0/a$c;

    invoke-direct {v3, v0, v1, v2}, Lm0/a$c;-><init>(Landroidx/core/util/Pools$Pool;Lm0/a$b;Lm0/a$e;)V

    iput-object v3, p0, Lcom/bumptech/glide/g;->j:Lm0/a$c;

    new-instance v0, Lv/q;

    invoke-direct {v0, v3}, Lv/q;-><init>(Landroidx/core/util/Pools$Pool;)V

    iput-object v0, p0, Lcom/bumptech/glide/g;->a:Lv/q;

    new-instance v0, Lg0/a;

    invoke-direct {v0}, Lg0/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->b:Lg0/a;

    new-instance v0, Lg0/e;

    invoke-direct {v0}, Lg0/e;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->c:Lg0/e;

    new-instance v0, Lg0/f;

    invoke-direct {v0}, Lg0/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->d:Lg0/f;

    new-instance v0, Lcom/bumptech/glide/load/data/f;

    invoke-direct {v0}, Lcom/bumptech/glide/load/data/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->e:Lcom/bumptech/glide/load/data/f;

    new-instance v0, Ld0/f;

    invoke-direct {v0}, Ld0/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->f:Ld0/f;

    new-instance v0, Lg0/b;

    invoke-direct {v0}, Lg0/b;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/g;->g:Lg0/b;

    const-string v0, "Gif"

    const-string v1, "Bitmap"

    const-string v2, "BitmapDrawable"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const-string v2, "legacy_prepend_all"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v0, "legacy_append"

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/bumptech/glide/g;->c:Lg0/e;

    monitor-enter v0

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lg0/e;->a:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, v0, Lg0/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lg0/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lg0/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lp/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Lp/j<",
            "TData;TTResource;>;)",
            "Lcom/bumptech/glide/g;"
        }
    .end annotation

    const-string v0, "legacy_append"

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    return-object p0
.end method

.method public final b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lv/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;",
            "Ljava/lang/Class<",
            "TData;>;",
            "Lv/p<",
            "TModel;TData;>;)",
            "Lcom/bumptech/glide/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->a:Lv/q;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lv/q;->a:Lv/s;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Lv/s$b;

    invoke-direct {v2, p1, p2, p3}, Lv/s$b;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)V

    iget-object p1, v1, Lv/s;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    invoke-virtual {p1, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v1

    iget-object p1, v0, Lv/q;->b:Lv/q$a;

    iget-object p1, p1, Lv/q$a;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final c(Ljava/lang/Class;Lp/k;)Lcom/bumptech/glide/g;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResource:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Lp/k<",
            "TTResource;>;)",
            "Lcom/bumptech/glide/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->d:Lg0/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lg0/f;->a:Ljava/util/ArrayList;

    new-instance v2, Lg0/f$a;

    invoke-direct {v2, p1, p2}, Lg0/f$a;-><init>(Ljava/lang/Class;Lp/k;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TData;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Lp/j<",
            "TData;TTResource;>;)",
            "Lcom/bumptech/glide/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->c:Lg0/e;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, Lg0/e;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lg0/e$a;

    invoke-direct {v1, p2, p3, p4}, Lg0/e$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lp/j;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final e()Ljava/util/List;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->g:Lg0/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lg0/b;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Lcom/bumptech/glide/g$b;

    invoke-direct {v0}, Lcom/bumptech/glide/g$b;-><init>()V

    throw v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final f(Ljava/lang/Object;)Ljava/util/List;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            ">(TModel;)",
            "Ljava/util/List<",
            "Lv/o<",
            "TModel;*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->a:Lv/q;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lv/q;->b:Lv/q$a;

    iget-object v2, v2, Lv/q$a;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv/q$a$a;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Lv/q$a$a;->a:Ljava/util/List;

    :goto_0
    if-nez v2, :cond_1

    iget-object v2, v0, Lv/q;->a:Lv/s;

    invoke-virtual {v2, v1}, Lv/s;->a(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, Lv/q;->b:Lv/q$a;

    invoke-virtual {v3, v1, v2}, Lv/q$a;->a(Ljava/lang/Class;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v0, :cond_4

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv/o;

    invoke-interface {v6, p1}, Lv/o;->b(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    if-eqz v4, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    sub-int v4, v0, v5

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :cond_2
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    return-object v1

    :cond_5
    new-instance v0, Lcom/bumptech/glide/g$c;

    invoke-direct {v0, p1, v2}, Lcom/bumptech/glide/g$c;-><init>(Ljava/lang/Object;Ljava/util/List;)V

    throw v0

    :cond_6
    new-instance v0, Lcom/bumptech/glide/g$c;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/g$c;-><init>(Ljava/lang/Object;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final g(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/g;
    .locals 3
    .param p1    # Lcom/bumptech/glide/load/data/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/data/e$a<",
            "*>;)",
            "Lcom/bumptech/glide/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->e:Lcom/bumptech/glide/load/data/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lcom/bumptech/glide/load/data/f;->a:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e$a;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final h(Ljava/lang/Class;Ljava/lang/Class;Ld0/e;)Lcom/bumptech/glide/g;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ld0/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResource:",
            "Ljava/lang/Object;",
            "Transcode:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Ljava/lang/Class<",
            "TTranscode;>;",
            "Ld0/e<",
            "TTResource;TTranscode;>;)",
            "Lcom/bumptech/glide/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/g;->f:Ld0/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Ld0/f;->a:Ljava/util/ArrayList;

    new-instance v2, Ld0/f$a;

    invoke-direct {v2, p1, p2, p3}, Ld0/f$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ld0/e;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
