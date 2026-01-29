.class public final Lz1/a;
.super Landroid/graphics/drawable/Drawable;

# interfaces
.implements Lb2/n;
.implements Landroidx/core/graphics/drawable/TintAwareDrawable;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/a$b;
    }
.end annotation


# instance fields
.field public b:Lz1/a$b;


# direct methods
.method public constructor <init>(Lb2/k;)V
    .locals 2

    new-instance v0, Lz1/a$b;

    new-instance v1, Lb2/g;

    invoke-direct {v1, p1}, Lb2/g;-><init>(Lb2/k;)V

    invoke-direct {v0, v1}, Lz1/a$b;-><init>(Lb2/g;)V

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput-object v0, p0, Lz1/a;->b:Lz1/a$b;

    return-void
.end method

.method public constructor <init>(Lz1/a$b;Lz1/a$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    iput-object p1, p0, Lz1/a;->b:Lz1/a$b;

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-boolean v1, v0, Lz1/a$b;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    return-object v0
.end method

.method public final getOpacity()I
    .locals 1

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0}, Lb2/g;->getOpacity()I

    move-result v0

    return v0
.end method

.method public final isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lz1/a$b;

    iget-object v1, p0, Lz1/a;->b:Lz1/a$b;

    invoke-direct {v0, v1}, Lz1/a$b;-><init>(Lz1/a$b;)V

    iput-object v0, p0, Lz1/a;->b:Lz1/a$b;

    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onStateChange([I)Z
    .locals 4
    .param p1    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    move-result v0

    iget-object v1, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v1, v1, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {p1}, Lz1/b;->b([I)Z

    move-result p1

    iget-object v1, p0, Lz1/a;->b:Lz1/a$b;

    iget-boolean v3, v1, Lz1/a$b;->b:Z

    if-eq v3, p1, :cond_1

    iput-boolean p1, v1, Lz1/a$b;->b:Z

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    return v2
.end method

.method public final setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->setAlpha(I)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1
    .param p1    # Landroid/graphics/ColorFilter;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final setShapeAppearanceModel(Lb2/k;)V
    .locals 1
    .param p1    # Lb2/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->setShapeAppearanceModel(Lb2/k;)V

    return-void
.end method

.method public final setTint(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->setTint(I)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lz1/a;->b:Lz1/a$b;

    iget-object v0, v0, Lz1/a$b;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
