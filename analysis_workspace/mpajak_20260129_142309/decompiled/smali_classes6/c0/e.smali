.class public final Lc0/e;
.super La0/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La0/b<",
        "Lc0/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lc0/c;)V
    .locals 0

    invoke-direct {p0, p1}, La0/b;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, La0/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lc0/c;

    invoke-virtual {v0}, Lc0/c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public final b()Ljava/lang/Class;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lc0/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lc0/c;

    return-object v0
.end method

.method public final getSize()I
    .locals 2

    iget-object v0, p0, La0/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lc0/c;

    iget-object v0, v0, Lc0/c;->b:Lc0/c$a;

    iget-object v0, v0, Lc0/c$a;->a:Lc0/g;

    iget-object v1, v0, Lc0/g;->a:Lo/a;

    invoke-interface {v1}, Lo/a;->f()I

    move-result v1

    iget v0, v0, Lc0/g;->o:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final recycle()V
    .locals 5

    iget-object v0, p0, La0/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lc0/c;

    invoke-virtual {v0}, Lc0/c;->stop()V

    iget-object v0, p0, La0/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lc0/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lc0/c;->e:Z

    iget-object v0, v0, Lc0/c;->b:Lc0/c$a;

    iget-object v0, v0, Lc0/c$a;->a:Lc0/g;

    iget-object v2, v0, Lc0/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v0, Lc0/g;->l:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, v0, Lc0/g;->e:Ls/d;

    invoke-interface {v4, v2}, Ls/d;->d(Landroid/graphics/Bitmap;)V

    iput-object v3, v0, Lc0/g;->l:Landroid/graphics/Bitmap;

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, v0, Lc0/g;->f:Z

    iget-object v2, v0, Lc0/g;->i:Lc0/g$a;

    if-eqz v2, :cond_1

    iget-object v4, v0, Lc0/g;->d:Lcom/bumptech/glide/i;

    invoke-virtual {v4, v2}, Lcom/bumptech/glide/i;->k(Li0/h;)V

    iput-object v3, v0, Lc0/g;->i:Lc0/g$a;

    :cond_1
    iget-object v2, v0, Lc0/g;->k:Lc0/g$a;

    if-eqz v2, :cond_2

    iget-object v4, v0, Lc0/g;->d:Lcom/bumptech/glide/i;

    invoke-virtual {v4, v2}, Lcom/bumptech/glide/i;->k(Li0/h;)V

    iput-object v3, v0, Lc0/g;->k:Lc0/g$a;

    :cond_2
    iget-object v2, v0, Lc0/g;->n:Lc0/g$a;

    if-eqz v2, :cond_3

    iget-object v4, v0, Lc0/g;->d:Lcom/bumptech/glide/i;

    invoke-virtual {v4, v2}, Lcom/bumptech/glide/i;->k(Li0/h;)V

    iput-object v3, v0, Lc0/g;->n:Lc0/g$a;

    :cond_3
    iget-object v2, v0, Lc0/g;->a:Lo/a;

    invoke-interface {v2}, Lo/a;->clear()V

    iput-boolean v1, v0, Lc0/g;->j:Z

    return-void
.end method
