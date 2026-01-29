.class public final Lr/e;
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
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp/f;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lr/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/i<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lr/h$a;

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


# direct methods
.method public constructor <init>(Ljava/util/List;Lr/i;Lr/h$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp/f;",
            ">;",
            "Lr/i<",
            "*>;",
            "Lr/h$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lr/e;->e:I

    iput-object p1, p0, Lr/e;->b:Ljava/util/List;

    iput-object p2, p0, Lr/e;->c:Lr/i;

    iput-object p3, p0, Lr/e;->d:Lr/h$a;

    return-void
.end method

.method public constructor <init>(Lr/i;Lr/h$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/i<",
            "*>;",
            "Lr/h$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lr/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, -0x1

    iput v1, p0, Lr/e;->e:I

    iput-object v0, p0, Lr/e;->b:Ljava/util/List;

    iput-object p1, p0, Lr/e;->c:Lr/i;

    iput-object p2, p0, Lr/e;->d:Lr/h$a;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lr/e;->d:Lr/h$a;

    iget-object v1, p0, Lr/e;->f:Lp/f;

    iget-object v2, p0, Lr/e;->i:Lv/o$a;

    iget-object v2, v2, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v3, Lp/a;->d:Lp/a;

    invoke-interface {v0, v1, p1, v2, v3}, Lr/h$a;->b(Lp/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lp/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lr/e;->i:Lv/o$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lr/e;->d:Lr/h$a;

    iget-object v1, p0, Lr/e;->f:Lp/f;

    iget-object v2, p0, Lr/e;->i:Lv/o$a;

    iget-object v3, v2, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v4, Lp/a;->d:Lp/a;

    iget-object v5, p0, Lr/e;->f:Lp/f;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lr/h$a;->d(Lp/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lp/a;Lp/f;)V

    return-void
.end method

.method public final e()Z
    .locals 8

    :cond_0
    :goto_0
    iget-object v0, p0, Lr/e;->g:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    iget v3, p0, Lr/e;->h:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lr/e;->i:Lv/o$a;

    const/4 v0, 0x0

    :cond_3
    :goto_2
    if-nez v0, :cond_5

    iget v3, p0, Lr/e;->h:I

    iget-object v4, p0, Lr/e;->g:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_5

    iget-object v3, p0, Lr/e;->g:Ljava/util/List;

    iget v4, p0, Lr/e;->h:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lr/e;->h:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv/o;

    iget-object v4, p0, Lr/e;->j:Ljava/io/File;

    iget-object v5, p0, Lr/e;->c:Lr/i;

    iget v6, v5, Lr/i;->e:I

    iget v7, v5, Lr/i;->f:I

    iget-object v5, v5, Lr/i;->i:Lp/h;

    invoke-interface {v3, v4, v6, v7, v5}, Lv/o;->a(Ljava/lang/Object;IILp/h;)Lv/o$a;

    move-result-object v3

    iput-object v3, p0, Lr/e;->i:Lv/o$a;

    iget-object v3, p0, Lr/e;->i:Lv/o$a;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lr/e;->c:Lr/i;

    iget-object v4, p0, Lr/e;->i:Lv/o$a;

    iget-object v4, v4, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Lr/i;->g(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v0, p0, Lr/e;->i:Lv/o$a;

    iget-object v0, v0, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    iget-object v3, p0, Lr/e;->c:Lr/i;

    iget-object v3, v3, Lr/i;->o:Lcom/bumptech/glide/f;

    invoke-interface {v0, v3, p0}, Lcom/bumptech/glide/load/data/d;->f(Lcom/bumptech/glide/f;Lcom/bumptech/glide/load/data/d$a;)V

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    return v0

    :cond_6
    :goto_4
    iget v0, p0, Lr/e;->e:I

    add-int/2addr v0, v2

    iput v0, p0, Lr/e;->e:I

    iget-object v2, p0, Lr/e;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_7

    return v1

    :cond_7
    iget-object v0, p0, Lr/e;->b:Ljava/util/List;

    iget v2, p0, Lr/e;->e:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/f;

    new-instance v2, Lr/f;

    iget-object v3, p0, Lr/e;->c:Lr/i;

    iget-object v4, v3, Lr/i;->n:Lp/f;

    invoke-direct {v2, v0, v4}, Lr/f;-><init>(Lp/f;Lp/f;)V

    invoke-virtual {v3}, Lr/i;->b()Lt/a;

    move-result-object v3

    invoke-interface {v3, v2}, Lt/a;->a(Lp/f;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lr/e;->j:Ljava/io/File;

    if-eqz v2, :cond_0

    iput-object v0, p0, Lr/e;->f:Lp/f;

    iget-object v0, p0, Lr/e;->c:Lr/i;

    iget-object v0, v0, Lr/i;->c:Lcom/bumptech/glide/d;

    iget-object v0, v0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/g;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/g;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lr/e;->g:Ljava/util/List;

    iput v1, p0, Lr/e;->h:I

    goto/16 :goto_0
.end method
