.class public abstract Lh0/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lh0/a<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:Z

.field public b:I

.field public c:F

.field public d:Lr/l;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public e:Lcom/bumptech/glide/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public f:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public g:I

.field public h:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:Lp/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public n:Z

.field public o:Z

.field public p:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public q:I

.field public r:Lp/h;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public s:Ll0/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lp/l<",
            "*>;>;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Class;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public u:Z

.field public v:Landroid/content/res/Resources$Theme;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lh0/a;->c:F

    sget-object v0, Lr/l;->d:Lr/l$d;

    iput-object v0, p0, Lh0/a;->d:Lr/l;

    sget-object v0, Lcom/bumptech/glide/f;->d:Lcom/bumptech/glide/f;

    iput-object v0, p0, Lh0/a;->e:Lcom/bumptech/glide/f;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/a;->j:Z

    const/4 v1, -0x1

    iput v1, p0, Lh0/a;->k:I

    iput v1, p0, Lh0/a;->l:I

    sget-object v1, Lk0/c;->b:Lk0/c;

    iput-object v1, p0, Lh0/a;->m:Lp/f;

    iput-boolean v0, p0, Lh0/a;->o:Z

    new-instance v1, Lp/h;

    invoke-direct {v1}, Lp/h;-><init>()V

    iput-object v1, p0, Lh0/a;->r:Lp/h;

    new-instance v1, Ll0/b;

    invoke-direct {v1}, Ll0/b;-><init>()V

    iput-object v1, p0, Lh0/a;->s:Ll0/b;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, Lh0/a;->t:Ljava/lang/Class;

    iput-boolean v0, p0, Lh0/a;->z:Z

    return-void
.end method

.method public static e(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a(Lh0/a;)Lh0/a;
    .locals 4
    .param p1    # Lh0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/a<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh0/a;->a(Lh0/a;)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, Lh0/a;->b:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lh0/a;->c:F

    iput v0, p0, Lh0/a;->c:F

    :cond_1
    iget v0, p1, Lh0/a;->b:I

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lh0/a;->x:Z

    iput-boolean v0, p0, Lh0/a;->x:Z

    :cond_2
    iget v0, p1, Lh0/a;->b:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Lh0/a;->A:Z

    iput-boolean v0, p0, Lh0/a;->A:Z

    :cond_3
    iget v0, p1, Lh0/a;->b:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lh0/a;->d:Lr/l;

    iput-object v0, p0, Lh0/a;->d:Lr/l;

    :cond_4
    iget v0, p1, Lh0/a;->b:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lh0/a;->e:Lcom/bumptech/glide/f;

    iput-object v0, p0, Lh0/a;->e:Lcom/bumptech/glide/f;

    :cond_5
    iget v0, p1, Lh0/a;->b:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lh0/a;->g:I

    iget v0, p0, Lh0/a;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lh0/a;->b:I

    :cond_6
    iget v0, p1, Lh0/a;->b:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, Lh0/a;->e(II)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget v0, p1, Lh0/a;->g:I

    iput v0, p0, Lh0/a;->g:I

    iput-object v2, p0, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lh0/a;->b:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lh0/a;->b:I

    :cond_7
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x40

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lh0/a;->i:I

    iget v0, p0, Lh0/a;->b:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lh0/a;->b:I

    :cond_8
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x80

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, Lh0/a;->i:I

    iput v0, p0, Lh0/a;->i:I

    iput-object v2, p0, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lh0/a;->b:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lh0/a;->b:I

    :cond_9
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x100

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p1, Lh0/a;->j:Z

    iput-boolean v0, p0, Lh0/a;->j:Z

    :cond_a
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x200

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, p1, Lh0/a;->l:I

    iput v0, p0, Lh0/a;->l:I

    iget v0, p1, Lh0/a;->k:I

    iput v0, p0, Lh0/a;->k:I

    :cond_b
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x400

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p1, Lh0/a;->m:Lp/f;

    iput-object v0, p0, Lh0/a;->m:Lp/f;

    :cond_c
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x1000

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, Lh0/a;->t:Ljava/lang/Class;

    iput-object v0, p0, Lh0/a;->t:Ljava/lang/Class;

    :cond_d
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x2000

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p1, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lh0/a;->q:I

    iget v0, p0, Lh0/a;->b:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lh0/a;->b:I

    :cond_e
    iget v0, p1, Lh0/a;->b:I

    const/16 v3, 0x4000

    invoke-static {v0, v3}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, p1, Lh0/a;->q:I

    iput v0, p0, Lh0/a;->q:I

    iput-object v2, p0, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lh0/a;->b:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lh0/a;->b:I

    :cond_f
    iget v0, p1, Lh0/a;->b:I

    const v2, 0x8000

    invoke-static {v0, v2}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lh0/a;->v:Landroid/content/res/Resources$Theme;

    iput-object v0, p0, Lh0/a;->v:Landroid/content/res/Resources$Theme;

    :cond_10
    iget v0, p1, Lh0/a;->b:I

    const/high16 v2, 0x10000

    invoke-static {v0, v2}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-boolean v0, p1, Lh0/a;->o:Z

    iput-boolean v0, p0, Lh0/a;->o:Z

    :cond_11
    iget v0, p1, Lh0/a;->b:I

    const/high16 v2, 0x20000

    invoke-static {v0, v2}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-boolean v0, p1, Lh0/a;->n:Z

    iput-boolean v0, p0, Lh0/a;->n:Z

    :cond_12
    iget v0, p1, Lh0/a;->b:I

    const/16 v2, 0x800

    invoke-static {v0, v2}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lh0/a;->s:Ll0/b;

    iget-object v2, p1, Lh0/a;->s:Ll0/b;

    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, Lh0/a;->z:Z

    iput-boolean v0, p0, Lh0/a;->z:Z

    :cond_13
    iget v0, p1, Lh0/a;->b:I

    const/high16 v2, 0x80000

    invoke-static {v0, v2}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean v0, p1, Lh0/a;->y:Z

    iput-boolean v0, p0, Lh0/a;->y:Z

    :cond_14
    iget-boolean v0, p0, Lh0/a;->o:Z

    if-nez v0, :cond_15

    iget-object v0, p0, Lh0/a;->s:Ll0/b;

    invoke-virtual {v0}, Ll0/b;->clear()V

    iget v0, p0, Lh0/a;->b:I

    and-int/lit16 v0, v0, -0x801

    iput-boolean v1, p0, Lh0/a;->n:Z

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Lh0/a;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/a;->z:Z

    :cond_15
    iget v0, p0, Lh0/a;->b:I

    iget v1, p1, Lh0/a;->b:I

    or-int/2addr v0, v1

    iput v0, p0, Lh0/a;->b:I

    iget-object v0, p0, Lh0/a;->r:Lp/h;

    iget-object p1, p1, Lh0/a;->r:Lp/h;

    invoke-virtual {v0, p1}, Lp/h;->d(Lp/h;)V

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public b()Lh0/a;
    .locals 3
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh0/a;

    new-instance v1, Lp/h;

    invoke-direct {v1}, Lp/h;-><init>()V

    iput-object v1, v0, Lh0/a;->r:Lp/h;

    iget-object v2, p0, Lh0/a;->r:Lp/h;

    invoke-virtual {v1, v2}, Lp/h;->d(Lp/h;)V

    new-instance v1, Ll0/b;

    invoke-direct {v1}, Ll0/b;-><init>()V

    iput-object v1, v0, Lh0/a;->s:Ll0/b;

    iget-object v2, p0, Lh0/a;->s:Ll0/b;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lh0/a;->u:Z

    iput-boolean v1, v0, Lh0/a;->w:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Ljava/lang/Class;)Lh0/a;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh0/a;->c(Ljava/lang/Class;)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lh0/a;->t:Ljava/lang/Class;

    iget p1, p0, Lh0/a;->b:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lr/l;)Lh0/a;
    .locals 1
    .param p1    # Lr/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/l;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lh0/a;->d:Lr/l;

    iget p1, p0, Lh0/a;->b:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lh0/a;

    if-eqz v0, :cond_0

    check-cast p1, Lh0/a;

    iget v0, p1, Lh0/a;->c:F

    iget v1, p0, Lh0/a;->c:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lh0/a;->g:I

    iget v1, p1, Lh0/a;->g:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Ll0/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lh0/a;->i:I

    iget v1, p1, Lh0/a;->i:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Ll0/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lh0/a;->q:I

    iget v1, p1, Lh0/a;->q:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Ll0/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lh0/a;->j:Z

    iget-boolean v1, p1, Lh0/a;->j:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lh0/a;->k:I

    iget v1, p1, Lh0/a;->k:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lh0/a;->l:I

    iget v1, p1, Lh0/a;->l:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lh0/a;->n:Z

    iget-boolean v1, p1, Lh0/a;->n:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lh0/a;->o:Z

    iget-boolean v1, p1, Lh0/a;->o:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lh0/a;->x:Z

    iget-boolean v1, p1, Lh0/a;->x:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lh0/a;->y:Z

    iget-boolean v1, p1, Lh0/a;->y:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh0/a;->d:Lr/l;

    iget-object v1, p1, Lh0/a;->d:Lr/l;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/a;->e:Lcom/bumptech/glide/f;

    iget-object v1, p1, Lh0/a;->e:Lcom/bumptech/glide/f;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh0/a;->r:Lp/h;

    iget-object v1, p1, Lh0/a;->r:Lp/h;

    invoke-virtual {v0, v1}, Lp/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/a;->s:Ll0/b;

    iget-object v1, p1, Lh0/a;->s:Ll0/b;

    invoke-interface {v0, v1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/a;->t:Ljava/lang/Class;

    iget-object v1, p1, Lh0/a;->t:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/a;->m:Lp/f;

    iget-object v1, p1, Lh0/a;->m:Lp/f;

    invoke-static {v0, v1}, Ll0/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/a;->v:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, Lh0/a;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v0, p1}, Ll0/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f(Ly/l;Lp/l;)Lh0/a;
    .locals 1
    .param p1    # Ly/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly/l;",
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh0/a;->f(Ly/l;Lp/l;)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Ly/l;->f:Lp/g;

    invoke-virtual {p0, v0, p1}, Lh0/a;->j(Lp/g;Ljava/lang/Object;)Lh0/a;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lh0/a;->n(Lp/l;Z)Lh0/a;

    move-result-object p1

    return-object p1
.end method

.method public final g(II)Lh0/a;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh0/a;->g(II)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Lh0/a;->l:I

    iput p2, p0, Lh0/a;->k:I

    iget p1, p0, Lh0/a;->b:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final h()Lh0/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/f;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/bumptech/glide/f;->e:Lcom/bumptech/glide/f;

    iget-boolean v1, p0, Lh0/a;->w:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0}, Lh0/a;->h()Lh0/a;

    move-result-object v0

    return-object v0

    :cond_0
    iput-object v0, p0, Lh0/a;->e:Lcom/bumptech/glide/f;

    iget v0, p0, Lh0/a;->b:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lh0/a;->c:F

    sget-object v1, Ll0/k;->a:[C

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    iget v1, p0, Lh0/a;->g:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lh0/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, Lh0/a;->i:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lh0/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, Lh0/a;->q:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lh0/a;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, Lh0/a;->j:Z

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget v1, p0, Lh0/a;->k:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget v1, p0, Lh0/a;->l:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lh0/a;->n:Z

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lh0/a;->o:Z

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lh0/a;->x:Z

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lh0/a;->y:Z

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lh0/a;->d:Lr/l;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lh0/a;->e:Lcom/bumptech/glide/f;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lh0/a;->r:Lp/h;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lh0/a;->s:Ll0/b;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lh0/a;->t:Ljava/lang/Class;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lh0/a;->m:Lp/f;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lh0/a;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v1, v0}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final i()Lh0/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->u:Z

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(Lp/g;Ljava/lang/Object;)Lh0/a;
    .locals 1
    .param p1    # Lp/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Lp/g<",
            "TY;>;TY;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh0/a;->j(Lp/g;Ljava/lang/Object;)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lh0/a;->r:Lp/h;

    iget-object v0, v0, Lp/h;->b:Ll0/b;

    invoke-virtual {v0, p1, p2}, Ll0/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final k(Lp/f;)Lh0/a;
    .locals 1
    .param p1    # Lp/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/f;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh0/a;->k(Lp/f;)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lh0/a;->m:Lp/f;

    iget p1, p0, Lh0/a;->b:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final l()Lh0/a;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0}, Lh0/a;->l()Lh0/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lh0/a;->j:Z

    iget v0, p0, Lh0/a;->b:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final m(Ljava/lang/Class;Lp/l;Z)Lh0/a;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TY;>;",
            "Lp/l<",
            "TY;>;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lh0/a;->m(Ljava/lang/Class;Lp/l;Z)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Argument must not be null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lh0/a;->s:Ll0/b;

    invoke-virtual {v0, p1, p2}, Ll0/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lh0/a;->b:I

    or-int/lit16 p1, p1, 0x800

    const/4 p2, 0x1

    iput-boolean p2, p0, Lh0/a;->o:Z

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh0/a;->z:Z

    if-eqz p3, :cond_1

    const/high16 p3, 0x20000

    or-int/2addr p1, p3

    iput p1, p0, Lh0/a;->b:I

    iput-boolean p2, p0, Lh0/a;->n:Z

    :cond_1
    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final n(Lp/l;Z)Lh0/a;
    .locals 2
    .param p1    # Lp/l;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh0/a;->n(Lp/l;Z)Lh0/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ly/o;

    invoke-direct {v0, p1, p2}, Ly/o;-><init>(Lp/l;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, Lh0/a;->m(Ljava/lang/Class;Lp/l;Z)Lh0/a;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, Lh0/a;->m(Ljava/lang/Class;Lp/l;Z)Lh0/a;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0, v1, v0, p2}, Lh0/a;->m(Ljava/lang/Class;Lp/l;Z)Lh0/a;

    const-class v0, Lc0/c;

    new-instance v1, Lc0/f;

    invoke-direct {v1, p1}, Lc0/f;-><init>(Lp/l;)V

    invoke-virtual {p0, v0, v1, p2}, Lh0/a;->m(Ljava/lang/Class;Lp/l;Z)Lh0/a;

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final o()Lh0/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    invoke-virtual {v0}, Lh0/a;->o()Lh0/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/a;->A:Z

    iget v0, p0, Lh0/a;->b:I

    const/high16 v1, 0x100000

    or-int/2addr v0, v1

    iput v0, p0, Lh0/a;->b:I

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method
