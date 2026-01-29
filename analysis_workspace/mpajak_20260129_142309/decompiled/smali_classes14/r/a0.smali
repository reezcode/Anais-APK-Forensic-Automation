.class public final Lr/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/data/d$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lv/o$a;

.field public final synthetic c:Lr/b0;


# direct methods
.method public constructor <init>(Lr/b0;Lv/o$a;)V
    .locals 0

    iput-object p1, p0, Lr/a0;->c:Lr/b0;

    iput-object p2, p0, Lr/a0;->b:Lv/o$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lr/a0;->c:Lr/b0;

    iget-object v1, p0, Lr/a0;->b:Lv/o$a;

    iget-object v0, v0, Lr/b0;->g:Lv/o$a;

    if-eqz v0, :cond_0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lr/a0;->c:Lr/b0;

    iget-object v1, p0, Lr/a0;->b:Lv/o$a;

    iget-object v2, v0, Lr/b0;->c:Lr/h$a;

    iget-object v0, v0, Lr/b0;->h:Lr/f;

    iget-object v1, v1, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->e()Lp/a;

    move-result-object v3

    invoke-interface {v2, v0, p1, v1, v3}, Lr/h$a;->b(Lp/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lp/a;)V

    :cond_1
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lr/a0;->c:Lr/b0;

    iget-object v1, p0, Lr/a0;->b:Lv/o$a;

    iget-object v0, v0, Lr/b0;->g:Lv/o$a;

    if-eqz v0, :cond_0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lr/a0;->c:Lr/b0;

    iget-object v1, p0, Lr/a0;->b:Lv/o$a;

    iget-object v2, v0, Lr/b0;->b:Lr/i;

    iget-object v2, v2, Lr/i;->p:Lr/l;

    if-eqz p1, :cond_1

    iget-object v3, v1, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->e()Lp/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lr/l;->c(Lp/a;)Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p1, v0, Lr/b0;->f:Ljava/lang/Object;

    iget-object p1, v0, Lr/b0;->c:Lr/h$a;

    invoke-interface {p1}, Lr/h$a;->a()V

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lr/b0;->c:Lr/h$a;

    iget-object v3, v1, Lv/o$a;->a:Lp/f;

    iget-object v4, v1, Lv/o$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v4}, Lcom/bumptech/glide/load/data/d;->e()Lp/a;

    move-result-object v5

    iget-object v6, v0, Lr/b0;->h:Lr/f;

    move-object v0, v2

    move-object v1, v3

    move-object v2, p1

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    invoke-interface/range {v0 .. v5}, Lr/h$a;->d(Lp/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lp/a;Lp/f;)V

    :cond_2
    :goto_1
    return-void
.end method
