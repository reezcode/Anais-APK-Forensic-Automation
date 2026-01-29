.class public final Lr/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        "ResourceType:",
        "Ljava/lang/Object;",
        "Transcode:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lp/j<",
            "TDataType;TResourceType;>;>;"
        }
    .end annotation
.end field

.field public final c:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e<",
            "TResourceType;TTranscode;>;"
        }
    .end annotation
.end field

.field public final d:Landroidx/core/util/Pools$Pool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ld0/e;Landroidx/core/util/Pools$Pool;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TDataType;>;",
            "Ljava/lang/Class<",
            "TResourceType;>;",
            "Ljava/lang/Class<",
            "TTranscode;>;",
            "Ljava/util/List<",
            "+",
            "Lp/j<",
            "TDataType;TResourceType;>;>;",
            "Ld0/e<",
            "TResourceType;TTranscode;>;",
            "Landroidx/core/util/Pools$Pool<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/k;->a:Ljava/lang/Class;

    iput-object p4, p0, Lr/k;->b:Ljava/util/List;

    iput-object p5, p0, Lr/k;->c:Ld0/e;

    iput-object p6, p0, Lr/k;->d:Landroidx/core/util/Pools$Pool;

    const-string p4, "Failed DecodePath{"

    invoke-static {p4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "->"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lr/k;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/data/e;IILp/h;Lr/k$a;)Lr/w;
    .locals 10
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/data/e<",
            "TDataType;>;II",
            "Lp/h;",
            "Lr/k$a<",
            "TResourceType;>;)",
            "Lr/w<",
            "TTranscode;>;"
        }
    .end annotation

    iget-object v0, p0, Lr/k;->d:Landroidx/core/util/Pools$Pool;

    invoke-interface {v0}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Argument must not be null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    move-object v7, v0

    :try_start_0
    invoke-virtual/range {v2 .. v7}, Lr/k;->b(Lcom/bumptech/glide/load/data/e;IILp/h;Ljava/util/List;)Lr/w;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lr/k;->d:Landroidx/core/util/Pools$Pool;

    invoke-interface {p2, v0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    check-cast p5, Lr/j$b;

    iget-object p2, p5, Lr/j$b;->b:Lr/j;

    iget-object p3, p5, Lr/j$b;->a:Lp/a;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lr/w;->get()Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    sget-object p5, Lp/a;->e:Lp/a;

    const/4 v0, 0x0

    if-eq p3, p5, :cond_0

    iget-object p5, p2, Lr/j;->b:Lr/i;

    invoke-virtual {p5, v7}, Lr/i;->f(Ljava/lang/Class;)Lp/l;

    move-result-object p5

    iget-object v1, p2, Lr/j;->i:Lcom/bumptech/glide/d;

    iget v2, p2, Lr/j;->m:I

    iget v3, p2, Lr/j;->n:I

    invoke-interface {p5, v1, p1, v2, v3}, Lp/l;->b(Landroid/content/Context;Lr/w;II)Lr/w;

    move-result-object v1

    move-object v6, p5

    move-object p5, v1

    goto :goto_0

    :cond_0
    move-object p5, p1

    move-object v6, v0

    :goto_0
    invoke-virtual {p1, p5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1}, Lr/w;->recycle()V

    :cond_1
    iget-object p1, p2, Lr/j;->b:Lr/i;

    iget-object p1, p1, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object p1, p1, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/g;

    iget-object p1, p1, Lcom/bumptech/glide/g;->d:Lg0/f;

    invoke-interface {p5}, Lr/w;->b()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg0/f;->a(Ljava/lang/Class;)Lp/k;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    iget-object p1, p2, Lr/j;->b:Lr/i;

    iget-object p1, p1, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object p1, p1, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/g;

    iget-object p1, p1, Lcom/bumptech/glide/g;->d:Lg0/f;

    invoke-interface {p5}, Lr/w;->b()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Lg0/f;->a(Ljava/lang/Class;)Lp/k;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object p1, p2, Lr/j;->p:Lp/h;

    invoke-interface {v0, p1}, Lp/k;->b(Lp/h;)Lp/c;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance p1, Lcom/bumptech/glide/g$d;

    invoke-interface {p5}, Lr/w;->b()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/g$d;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_4
    sget-object p1, Lp/c;->d:Lp/c;

    :goto_2
    move-object v9, v0

    iget-object v0, p2, Lr/j;->b:Lr/i;

    iget-object v3, p2, Lr/j;->y:Lp/f;

    invoke-virtual {v0}, Lr/i;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_6

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lv/o$a;

    iget-object v8, v8, Lv/o$a;->a:Lp/f;

    invoke-interface {v8, v3}, Lp/f;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    xor-int/lit8 v0, v1, 0x1

    iget-object v1, p2, Lr/j;->o:Lr/l;

    invoke-virtual {v1, v0, p3, p1}, Lr/l;->d(ZLp/a;Lp/c;)Z

    move-result p3

    if-eqz p3, :cond_a

    if-eqz v9, :cond_9

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    if-eqz p3, :cond_8

    if-ne p3, v2, :cond_7

    new-instance p1, Lr/y;

    iget-object p3, p2, Lr/j;->b:Lr/i;

    iget-object p3, p3, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object v1, p3, Lcom/bumptech/glide/d;->a:Ls/b;

    iget-object v2, p2, Lr/j;->y:Lp/f;

    iget-object v3, p2, Lr/j;->j:Lp/f;

    iget v4, p2, Lr/j;->m:I

    iget v5, p2, Lr/j;->n:I

    iget-object v8, p2, Lr/j;->p:Lp/h;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lr/y;-><init>(Ls/b;Lp/f;Lp/f;IILp/l;Ljava/lang/Class;Lp/h;)V

    goto :goto_5

    :cond_7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unknown strategy: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    new-instance p1, Lr/f;

    iget-object p3, p2, Lr/j;->y:Lp/f;

    iget-object v0, p2, Lr/j;->j:Lp/f;

    invoke-direct {p1, p3, v0}, Lr/f;-><init>(Lp/f;Lp/f;)V

    :goto_5
    invoke-static {p5}, Lr/v;->a(Lr/w;)Lr/v;

    move-result-object p5

    iget-object p2, p2, Lr/j;->g:Lr/j$c;

    iput-object p1, p2, Lr/j$c;->a:Lp/f;

    iput-object v9, p2, Lr/j$c;->b:Lp/k;

    iput-object p5, p2, Lr/j$c;->c:Lr/v;

    goto :goto_6

    :cond_9
    new-instance p1, Lcom/bumptech/glide/g$d;

    invoke-interface {p5}, Lr/w;->get()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/g$d;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_a
    :goto_6
    iget-object p1, p0, Lr/k;->c:Ld0/e;

    invoke-interface {p1, p5, p4}, Ld0/e;->a(Lr/w;Lp/h;)Lr/w;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lr/k;->d:Landroidx/core/util/Pools$Pool;

    invoke-interface {p2, v0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    throw p1
.end method

.method public final b(Lcom/bumptech/glide/load/data/e;IILp/h;Ljava/util/List;)Lr/w;
    .locals 8
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/data/e<",
            "TDataType;>;II",
            "Lp/h;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lr/w<",
            "TResourceType;>;"
        }
    .end annotation

    iget-object v0, p0, Lr/k;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Lr/k;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp/j;

    :try_start_0
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4, p4}, Lp/j;->a(Ljava/lang/Object;Lp/h;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4, p2, p3, p4}, Lp/j;->b(Ljava/lang/Object;IILp/h;)Lr/w;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v4

    goto :goto_1

    :catch_1
    move-exception v4

    goto :goto_1

    :catch_2
    move-exception v4

    :goto_1
    const/4 v5, 0x2

    const-string v6, "DecodePath"

    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to decode data for "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-interface {p5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_3
    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    new-instance p1, Lr/r;

    iget-object p2, p0, Lr/k;->e:Ljava/lang/String;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p1, p2, p3}, Lr/r;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "DecodePath{ dataClass="

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lr/k;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decoders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr/k;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr/k;->c:Ld0/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
