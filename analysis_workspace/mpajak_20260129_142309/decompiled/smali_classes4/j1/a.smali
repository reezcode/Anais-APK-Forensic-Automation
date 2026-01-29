.class public final Lj1/a;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final t:Z
    .annotation build Landroidx/annotation/ChecksSdkIntAtLeast;
        api = 0x15
    .end annotation
.end field

.field public static final u:Z


# instance fields
.field public final a:Lcom/google/android/material/button/MaterialButton;

.field public b:Lb2/k;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/PorterDuff$Mode;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public j:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public k:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public l:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public m:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Landroid/graphics/drawable/LayerDrawable;

.field public s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    sput-boolean v1, Lj1/a;->t:Z

    const/16 v2, 0x16

    if-gt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sput-boolean v1, Lj1/a;->u:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/button/MaterialButton;Lb2/k;)V
    .locals 1
    .param p2    # Lb2/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj1/a;->n:Z

    iput-boolean v0, p0, Lj1/a;->o:Z

    iput-boolean v0, p0, Lj1/a;->p:Z

    iput-object p1, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    iput-object p2, p0, Lj1/a;->b:Lb2/k;

    return-void
.end method


# virtual methods
.method public final a()Lb2/n;
    .locals 3
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    const/4 v2, 0x2

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    check-cast v0, Lb2/n;

    return-object v0

    :cond_0
    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Z)Lb2/g;
    .locals 2
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    if-lez v0, :cond_1

    sget-boolean v0, Lj1/a;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/InsetDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lb2/g;

    return-object p1

    :cond_0
    iget-object v0, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Lb2/k;)V
    .locals 4
    .param p1    # Lb2/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lj1/a;->b:Lb2/k;

    sget-boolean v0, Lj1/a;->u:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lj1/a;->o:Z

    if-nez v0, :cond_0

    iget-object p1, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {p1}, Landroidx/core/view/ViewCompat;->getPaddingStart(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iget-object v1, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v1}, Landroidx/core/view/ViewCompat;->getPaddingEnd(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0}, Lj1/a;->e()V

    iget-object v3, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v3, p1, v0, v1, v2}, Landroidx/core/view/ViewCompat;->setPaddingRelative(Landroid/view/View;IIII)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb2/g;->setShapeAppearanceModel(Lb2/k;)V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb2/g;->setShapeAppearanceModel(Lb2/k;)V

    :cond_2
    invoke-virtual {p0}, Lj1/a;->a()Lb2/n;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lj1/a;->a()Lb2/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lb2/n;->setShapeAppearanceModel(Lb2/k;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final d(II)V
    .locals 7
    .param p1    # I
        .annotation build Landroidx/annotation/Dimension;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/Dimension;
        .end annotation
    .end param

    iget-object v0, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v0}, Landroidx/core/view/ViewCompat;->getPaddingStart(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v2}, Landroidx/core/view/ViewCompat;->getPaddingEnd(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    iget v4, p0, Lj1/a;->e:I

    iget v5, p0, Lj1/a;->f:I

    iput p2, p0, Lj1/a;->f:I

    iput p1, p0, Lj1/a;->e:I

    iget-boolean v6, p0, Lj1/a;->o:Z

    if-nez v6, :cond_0

    invoke-virtual {p0}, Lj1/a;->e()V

    :cond_0
    iget-object v6, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    add-int/2addr v1, p1

    sub-int/2addr v1, v4

    add-int/2addr v3, p2

    sub-int/2addr v3, v5

    invoke-static {v6, v0, v1, v2, v3}, Landroidx/core/view/ViewCompat;->setPaddingRelative(Landroid/view/View;IIII)V

    return-void
.end method

.method public final e()V
    .locals 14

    iget-object v0, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    new-instance v1, Lb2/g;

    iget-object v2, p0, Lj1/a;->b:Lb2/k;

    invoke-direct {v1, v2}, Lb2/g;-><init>(Lb2/k;)V

    iget-object v2, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb2/g;->m(Landroid/content/Context;)V

    iget-object v2, p0, Lj1/a;->j:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2}, Landroidx/core/graphics/drawable/DrawableCompat;->setTintList(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v2, p0, Lj1/a;->i:Landroid/graphics/PorterDuff$Mode;

    if-eqz v2, :cond_0

    invoke-static {v1, v2}, Landroidx/core/graphics/drawable/DrawableCompat;->setTintMode(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    iget v2, p0, Lj1/a;->h:I

    int-to-float v2, v2

    iget-object v3, p0, Lj1/a;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2, v3}, Lb2/g;->r(FLandroid/content/res/ColorStateList;)V

    new-instance v2, Lb2/g;

    iget-object v3, p0, Lj1/a;->b:Lb2/k;

    invoke-direct {v2, v3}, Lb2/g;-><init>(Lb2/k;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lb2/g;->setTint(I)V

    iget v4, p0, Lj1/a;->h:I

    int-to-float v4, v4

    iget-boolean v5, p0, Lj1/a;->n:Z

    if-eqz v5, :cond_1

    iget-object v5, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    const v6, 0x7f030101

    invoke-static {v5, v6}, Lp1/a;->b(Landroid/view/View;I)I

    move-result v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v2, v4, v5}, Lb2/g;->q(FI)V

    sget-boolean v4, Lj1/a;->t:Z

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    new-instance v4, Lb2/g;

    iget-object v7, p0, Lj1/a;->b:Lb2/k;

    invoke-direct {v4, v7}, Lb2/g;-><init>(Lb2/k;)V

    iput-object v4, p0, Lj1/a;->m:Landroid/graphics/drawable/Drawable;

    const/4 v7, -0x1

    invoke-static {v4, v7}, Landroidx/core/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    new-instance v4, Landroid/graphics/drawable/RippleDrawable;

    iget-object v7, p0, Lj1/a;->l:Landroid/content/res/ColorStateList;

    invoke-static {v7}, Lz1/b;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v7

    new-instance v9, Landroid/graphics/drawable/LayerDrawable;

    new-array v5, v5, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v5, v3

    aput-object v1, v5, v6

    invoke-direct {v9, v5}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    new-instance v1, Landroid/graphics/drawable/InsetDrawable;

    iget v10, p0, Lj1/a;->c:I

    iget v11, p0, Lj1/a;->e:I

    iget v12, p0, Lj1/a;->d:I

    iget v13, p0, Lj1/a;->f:I

    move-object v8, v1

    invoke-direct/range {v8 .. v13}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    iget-object v2, p0, Lj1/a;->m:Landroid/graphics/drawable/Drawable;

    invoke-direct {v4, v7, v1, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v4, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    goto :goto_1

    :cond_2
    new-instance v4, Lz1/a;

    iget-object v7, p0, Lj1/a;->b:Lb2/k;

    invoke-direct {v4, v7}, Lz1/a;-><init>(Lb2/k;)V

    iput-object v4, p0, Lj1/a;->m:Landroid/graphics/drawable/Drawable;

    iget-object v7, p0, Lj1/a;->l:Landroid/content/res/ColorStateList;

    invoke-static {v7}, Lz1/b;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-static {v4, v7}, Landroidx/core/graphics/drawable/DrawableCompat;->setTintList(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    new-instance v9, Landroid/graphics/drawable/LayerDrawable;

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    aput-object v2, v4, v3

    aput-object v1, v4, v6

    iget-object v1, p0, Lj1/a;->m:Landroid/graphics/drawable/Drawable;

    aput-object v1, v4, v5

    invoke-direct {v9, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v9, p0, Lj1/a;->r:Landroid/graphics/drawable/LayerDrawable;

    new-instance v4, Landroid/graphics/drawable/InsetDrawable;

    iget v10, p0, Lj1/a;->c:I

    iget v11, p0, Lj1/a;->e:I

    iget v12, p0, Lj1/a;->d:I

    iget v13, p0, Lj1/a;->f:I

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    :goto_1
    invoke-virtual {v0, v4}, Lcom/google/android/material/button/MaterialButton;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v3}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v1, p0, Lj1/a;->s:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lb2/g;->n(F)V

    :cond_3
    return-void
.end method

.method public final f()V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lj1/a;->b(Z)Lb2/g;

    move-result-object v2

    if-eqz v1, :cond_1

    iget v3, p0, Lj1/a;->h:I

    int-to-float v3, v3

    iget-object v4, p0, Lj1/a;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v3, v4}, Lb2/g;->r(FLandroid/content/res/ColorStateList;)V

    if-eqz v2, :cond_1

    iget v1, p0, Lj1/a;->h:I

    int-to-float v1, v1

    iget-boolean v3, p0, Lj1/a;->n:Z

    if-eqz v3, :cond_0

    iget-object v0, p0, Lj1/a;->a:Lcom/google/android/material/button/MaterialButton;

    const v3, 0x7f030101

    invoke-static {v0, v3}, Lp1/a;->b(Landroid/view/View;I)I

    move-result v0

    :cond_0
    invoke-virtual {v2, v1, v0}, Lb2/g;->q(FI)V

    :cond_1
    return-void
.end method
