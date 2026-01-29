.class public final Lv1/d;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field public A:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public B:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public C:Z

.field public D:Landroid/graphics/Bitmap;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:F

.field public J:[I

.field public K:Z

.field public final L:Landroid/text/TextPaint;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final M:Landroid/text/TextPaint;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public N:Landroid/animation/TimeInterpolator;

.field public O:Landroid/animation/TimeInterpolator;

.field public P:F

.field public Q:F

.field public R:F

.field public S:Landroid/content/res/ColorStateList;

.field public T:F

.field public U:F

.field public V:F

.field public W:Landroid/text/StaticLayout;

.field public X:F

.field public Y:Ljava/lang/CharSequence;

.field public Z:I

.field public final a:Landroid/view/View;

.field public b:Z

.field public c:F

.field public final d:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final f:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:Landroid/graphics/Typeface;

.field public t:Landroid/graphics/Typeface;

.field public u:Landroid/graphics/Typeface;

.field public v:Landroid/graphics/Typeface;

.field public w:Landroid/graphics/Typeface;

.field public x:Landroid/graphics/Typeface;

.field public y:Landroid/graphics/Typeface;

.field public z:Ly1/a;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    iput v0, p0, Lv1/d;->g:I

    iput v0, p0, Lv1/d;->h:I

    const/high16 v0, 0x41700000    # 15.0f

    iput v0, p0, Lv1/d;->i:F

    iput v0, p0, Lv1/d;->j:F

    sget v0, Lv1/j;->m:I

    iput v0, p0, Lv1/d;->Z:I

    iput-object p1, p0, Lv1/d;->a:Landroid/view/View;

    new-instance v0, Landroid/text/TextPaint;

    const/16 v1, 0x81

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lv1/d;->L:Landroid/text/TextPaint;

    new-instance v1, Landroid/text/TextPaint;

    invoke-direct {v1, v0}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    iput-object v1, p0, Lv1/d;->M:Landroid/text/TextPaint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lv1/d;->d:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lv1/d;->f:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p0, p1}, Lv1/d;->i(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public static a(IIF)I
    .locals 5
    .param p0    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, p2

    add-float/2addr v2, v1

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, p2

    add-float/2addr v3, v1

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, p2

    add-float/2addr v4, v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-float p0, p0

    mul-float p0, p0, v0

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, p2

    add-float/2addr p1, p0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result p0

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p0, p2, v0, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method public static h(FFFLandroid/animation/TimeInterpolator;)F
    .locals 0
    .param p3    # Landroid/animation/TimeInterpolator;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p3, :cond_0

    invoke-interface {p3, p2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p2

    :cond_0
    sget-object p3, Lf1/a;->a:Landroid/view/animation/LinearInterpolator;

    invoke-static {p1, p0, p2, p0}, Landroidx/appcompat/graphics/drawable/a;->a(FFFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/CharSequence;)Z
    .locals 3
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lv1/d;->a:Landroid/view/View;

    invoke-static {v0}, Landroidx/core/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    sget-object v0, Landroidx/core/text/TextDirectionHeuristicsCompat;->FIRSTSTRONG_RTL:Landroidx/core/text/TextDirectionHeuristicCompat;

    goto :goto_1

    :cond_1
    sget-object v0, Landroidx/core/text/TextDirectionHeuristicsCompat;->FIRSTSTRONG_LTR:Landroidx/core/text/TextDirectionHeuristicCompat;

    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v0, p1, v1, v2}, Landroidx/core/text/TextDirectionHeuristicCompat;->isRtl(Ljava/lang/CharSequence;II)Z

    move-result p1

    return p1
.end method

.method public final c(F)V
    .locals 5

    iget-object v0, p0, Lv1/d;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget-object v2, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iget-object v3, p0, Lv1/d;->N:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lv1/d;->f:Landroid/graphics/RectF;

    iget v1, p0, Lv1/d;->m:F

    iget v2, p0, Lv1/d;->n:F

    iget-object v3, p0, Lv1/d;->N:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->top:F

    iget-object v0, p0, Lv1/d;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    iget-object v2, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    iget-object v3, p0, Lv1/d;->N:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->right:F

    iget-object v0, p0, Lv1/d;->f:Landroid/graphics/RectF;

    iget-object v1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    iget-object v2, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    iget-object v3, p0, Lv1/d;->N:Landroid/animation/TimeInterpolator;

    invoke-static {v1, v2, p1, v3}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v1

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    iget v0, p0, Lv1/d;->o:F

    iget v1, p0, Lv1/d;->p:F

    iget-object v2, p0, Lv1/d;->N:Landroid/animation/TimeInterpolator;

    invoke-static {v0, v1, p1, v2}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lv1/d;->q:F

    iget v0, p0, Lv1/d;->m:F

    iget v1, p0, Lv1/d;->n:F

    iget-object v2, p0, Lv1/d;->N:Landroid/animation/TimeInterpolator;

    invoke-static {v0, v1, p1, v2}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lv1/d;->r:F

    invoke-virtual {p0, p1}, Lv1/d;->p(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v1, v0, p1

    sget-object v2, Lf1/a;->b:Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    iget-object v1, p0, Lv1/d;->a:Landroid/view/View;

    invoke-static {v1}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    invoke-static {v0, v3, p1, v2}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    iget-object v0, p0, Lv1/d;->a:Landroid/view/View;

    invoke-static {v0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    iget-object v0, p0, Lv1/d;->l:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lv1/d;->k:Landroid/content/res/ColorStateList;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {p0, v1}, Lv1/d;->g(Landroid/content/res/ColorStateList;)I

    move-result v1

    invoke-virtual {p0}, Lv1/d;->f()I

    move-result v4

    invoke-static {v1, v4, p1}, Lv1/d;->a(IIF)I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lv1/d;->f()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lv1/d;->T:F

    iget v1, p0, Lv1/d;->U:F

    cmpl-float v4, v0, v1

    if-eqz v4, :cond_1

    iget-object v4, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-static {v1, v0, p1, v2}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    :goto_1
    iget v0, p0, Lv1/d;->P:F

    const/4 v1, 0x0

    invoke-static {v3, v0, p1, v1}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lv1/d;->G:F

    iget v0, p0, Lv1/d;->Q:F

    invoke-static {v3, v0, p1, v1}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lv1/d;->H:F

    iget v0, p0, Lv1/d;->R:F

    invoke-static {v3, v0, p1, v1}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result v0

    iput v0, p0, Lv1/d;->I:F

    invoke-virtual {p0, v1}, Lv1/d;->g(Landroid/content/res/ColorStateList;)I

    move-result v0

    iget-object v1, p0, Lv1/d;->S:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v1}, Lv1/d;->g(Landroid/content/res/ColorStateList;)I

    move-result v1

    invoke-static {v0, v1, p1}, Lv1/d;->a(IIF)I

    move-result p1

    iget-object v0, p0, Lv1/d;->L:Landroid/text/TextPaint;

    iget v1, p0, Lv1/d;->G:F

    iget v2, p0, Lv1/d;->H:F

    iget v3, p0, Lv1/d;->I:F

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    iget-object p1, p0, Lv1/d;->a:Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    return-void
.end method

.method public final d(FZ)V
    .locals 12

    iget-object v0, p0, Lv1/d;->A:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v3, p1, v2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const v4, 0x3727c5ac    # 1.0E-5f

    const/4 v5, 0x1

    const/4 v6, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    const/4 v7, 0x0

    if-eqz v3, :cond_3

    iget p1, p0, Lv1/d;->j:F

    iget p2, p0, Lv1/d;->T:F

    iput v2, p0, Lv1/d;->E:F

    iget-object v1, p0, Lv1/d;->y:Landroid/graphics/Typeface;

    iget-object v3, p0, Lv1/d;->s:Landroid/graphics/Typeface;

    if-eq v1, v3, :cond_2

    iput-object v3, p0, Lv1/d;->y:Landroid/graphics/Typeface;

    const/4 v9, 0x1

    goto :goto_6

    :cond_2
    const/4 v9, 0x0

    goto :goto_6

    :cond_3
    iget v3, p0, Lv1/d;->i:F

    iget v8, p0, Lv1/d;->U:F

    iget-object v9, p0, Lv1/d;->y:Landroid/graphics/Typeface;

    iget-object v10, p0, Lv1/d;->v:Landroid/graphics/Typeface;

    if-eq v9, v10, :cond_4

    iput-object v10, p0, Lv1/d;->y:Landroid/graphics/Typeface;

    const/4 v9, 0x1

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    sub-float v10, p1, v7

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    cmpg-float v4, v10, v4

    if-gez v4, :cond_5

    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_6

    iput v2, p0, Lv1/d;->E:F

    goto :goto_3

    :cond_6
    iget v4, p0, Lv1/d;->i:F

    iget v10, p0, Lv1/d;->j:F

    iget-object v11, p0, Lv1/d;->O:Landroid/animation/TimeInterpolator;

    invoke-static {v4, v10, p1, v11}, Lv1/d;->h(FFFLandroid/animation/TimeInterpolator;)F

    move-result p1

    iget v4, p0, Lv1/d;->i:F

    div-float/2addr p1, v4

    iput p1, p0, Lv1/d;->E:F

    :goto_3
    iget p1, p0, Lv1/d;->j:F

    iget v4, p0, Lv1/d;->i:F

    div-float/2addr p1, v4

    mul-float v4, v1, p1

    if-eqz p2, :cond_7

    goto :goto_4

    :cond_7
    cmpl-float p2, v4, v0

    if-lez p2, :cond_8

    div-float/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    move v0, p1

    goto :goto_5

    :cond_8
    :goto_4
    move v0, v1

    :goto_5
    move p1, v3

    move p2, v8

    :goto_6
    cmpl-float v1, v0, v7

    if-lez v1, :cond_d

    iget v1, p0, Lv1/d;->F:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    :goto_7
    iget v3, p0, Lv1/d;->V:F

    cmpl-float v3, v3, p2

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    :goto_8
    if-nez v1, :cond_c

    if-nez v3, :cond_c

    iget-boolean v1, p0, Lv1/d;->K:Z

    if-nez v1, :cond_c

    if-eqz v9, :cond_b

    goto :goto_9

    :cond_b
    const/4 v9, 0x0

    goto :goto_a

    :cond_c
    :goto_9
    const/4 v9, 0x1

    :goto_a
    iput p1, p0, Lv1/d;->F:F

    iput p2, p0, Lv1/d;->V:F

    iput-boolean v6, p0, Lv1/d;->K:Z

    :cond_d
    iget-object p1, p0, Lv1/d;->B:Ljava/lang/CharSequence;

    if-eqz p1, :cond_e

    if-eqz v9, :cond_10

    :cond_e
    iget-object p1, p0, Lv1/d;->L:Landroid/text/TextPaint;

    iget p2, p0, Lv1/d;->F:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lv1/d;->L:Landroid/text/TextPaint;

    iget-object p2, p0, Lv1/d;->y:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lv1/d;->L:Landroid/text/TextPaint;

    iget p2, p0, Lv1/d;->V:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    iget-object p1, p0, Lv1/d;->L:Landroid/text/TextPaint;

    iget p2, p0, Lv1/d;->E:F

    cmpl-float p2, p2, v2

    if-eqz p2, :cond_f

    const/4 p2, 0x1

    goto :goto_b

    :cond_f
    const/4 p2, 0x0

    :goto_b
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLinearText(Z)V

    iget-object p1, p0, Lv1/d;->A:Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lv1/d;->b(Ljava/lang/CharSequence;)Z

    move-result p1

    iput-boolean p1, p0, Lv1/d;->C:Z

    :try_start_0
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    iget-object v1, p0, Lv1/d;->A:Ljava/lang/CharSequence;

    iget-object v3, p0, Lv1/d;->L:Landroid/text/TextPaint;

    float-to-int v0, v0

    new-instance v4, Lv1/j;

    invoke-direct {v4, v1, v3, v0}, Lv1/j;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    iput-object v0, v4, Lv1/j;->l:Landroid/text/TextUtils$TruncateAt;

    iput-boolean p1, v4, Lv1/j;->k:Z

    iput-object p2, v4, Lv1/j;->e:Landroid/text/Layout$Alignment;

    iput-boolean v6, v4, Lv1/j;->j:Z

    iput v5, v4, Lv1/j;->f:I

    iput v7, v4, Lv1/j;->g:F

    iput v2, v4, Lv1/j;->h:F

    iget p1, p0, Lv1/d;->Z:I

    iput p1, v4, Lv1/j;->i:I

    invoke-virtual {v4}, Lv1/j;->a()Landroid/text/StaticLayout;

    move-result-object p1
    :try_end_0
    .catch Lv1/j$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_c

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "CollapsingTextHelper"

    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    :goto_c
    invoke-static {p1}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/StaticLayout;

    iput-object p1, p0, Lv1/d;->W:Landroid/text/StaticLayout;

    invoke-virtual {p1}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lv1/d;->B:Ljava/lang/CharSequence;

    :cond_10
    return-void
.end method

.method public final e()F
    .locals 2

    iget-object v0, p0, Lv1/d;->M:Landroid/text/TextPaint;

    iget v1, p0, Lv1/d;->j:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, Lv1/d;->s:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v1, p0, Lv1/d;->T:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    iget-object v0, p0, Lv1/d;->M:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    move-result v0

    neg-float v0, v0

    return v0
.end method

.method public final f()I
    .locals 1
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    iget-object v0, p0, Lv1/d;->l:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0}, Lv1/d;->g(Landroid/content/res/ColorStateList;)I

    move-result v0

    return v0
.end method

.method public final g(Landroid/content/res/ColorStateList;)I
    .locals 2
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/ColorInt;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lv1/d;->J:[I

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    return p1
.end method

.method public final i(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1    # Landroid/content/res/Configuration;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Lv1/d;->u:Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ly1/g;->a(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lv1/d;->t:Landroid/graphics/Typeface;

    :cond_0
    iget-object v0, p0, Lv1/d;->x:Landroid/graphics/Typeface;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Ly1/g;->a(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lv1/d;->w:Landroid/graphics/Typeface;

    :cond_1
    iget-object p1, p0, Lv1/d;->t:Landroid/graphics/Typeface;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lv1/d;->u:Landroid/graphics/Typeface;

    :goto_0
    iput-object p1, p0, Lv1/d;->s:Landroid/graphics/Typeface;

    iget-object p1, p0, Lv1/d;->w:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lv1/d;->x:Landroid/graphics/Typeface;

    :goto_1
    iput-object p1, p0, Lv1/d;->v:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lv1/d;->k(Z)V

    :cond_4
    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lv1/d;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lv1/d;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lv1/d;->b:Z

    return-void
.end method

.method public final k(Z)V
    .locals 10

    iget-object v0, p0, Lv1/d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lv1/d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    if-eqz p1, :cond_10

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, p1}, Lv1/d;->d(FZ)V

    iget-object v0, p0, Lv1/d;->B:Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lv1/d;->W:Landroid/text/StaticLayout;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v0, v2, v1, v3}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lv1/d;->Y:Ljava/lang/CharSequence;

    :cond_2
    iget-object v0, p0, Lv1/d;->Y:Ljava/lang/CharSequence;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v3, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-virtual {v3, v0, v1, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v0

    iput v0, p0, Lv1/d;->X:F

    goto :goto_0

    :cond_3
    iput v2, p0, Lv1/d;->X:F

    :goto_0
    iget v0, p0, Lv1/d;->h:I

    iget-boolean v3, p0, Lv1/d;->C:Z

    invoke-static {v0, v3}, Landroidx/core/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v0

    and-int/lit8 v3, v0, 0x70

    const/16 v4, 0x50

    const/16 v5, 0x30

    const/high16 v6, 0x40000000    # 2.0f

    if-eq v3, v5, :cond_5

    if-eq v3, v4, :cond_4

    iget-object v3, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->descent()F

    move-result v3

    iget-object v7, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->ascent()F

    move-result v7

    sub-float/2addr v3, v7

    div-float/2addr v3, v6

    iget-object v7, p0, Lv1/d;->e:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->centerY()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v7, v3

    goto :goto_1

    :cond_4
    iget-object v3, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    iget-object v7, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->ascent()F

    move-result v7

    add-float/2addr v7, v3

    :goto_1
    iput v7, p0, Lv1/d;->n:F

    goto :goto_2

    :cond_5
    iget-object v3, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    iput v3, p0, Lv1/d;->n:F

    :goto_2
    const v3, 0x800007

    and-int/2addr v0, v3

    const/4 v7, 0x5

    const/4 v8, 0x1

    if-eq v0, v8, :cond_7

    if-eq v0, v7, :cond_6

    iget-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    iget v9, p0, Lv1/d;->X:F

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lv1/d;->e:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    iget v9, p0, Lv1/d;->X:F

    div-float/2addr v9, v6

    :goto_3
    sub-float/2addr v0, v9

    :goto_4
    iput v0, p0, Lv1/d;->p:F

    invoke-virtual {p0, v2, p1}, Lv1/d;->d(FZ)V

    iget-object p1, p0, Lv1/d;->W:Landroid/text/StaticLayout;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/text/Layout;->getHeight()I

    move-result p1

    int-to-float p1, p1

    goto :goto_5

    :cond_8
    const/4 p1, 0x0

    :goto_5
    iget-object v0, p0, Lv1/d;->W:Landroid/text/StaticLayout;

    iget-object v0, p0, Lv1/d;->B:Ljava/lang/CharSequence;

    if-eqz v0, :cond_9

    iget-object v2, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v9

    invoke-virtual {v2, v0, v1, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v2

    :cond_9
    iget-object v0, p0, Lv1/d;->W:Landroid/text/StaticLayout;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    :cond_a
    iget v0, p0, Lv1/d;->g:I

    iget-boolean v1, p0, Lv1/d;->C:Z

    invoke-static {v0, v1}, Landroidx/core/view/GravityCompat;->getAbsoluteGravity(II)I

    move-result v0

    and-int/lit8 v1, v0, 0x70

    if-eq v1, v5, :cond_c

    if-eq v1, v4, :cond_b

    div-float/2addr p1, v6

    iget-object v1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, p1

    iput v1, p0, Lv1/d;->m:F

    goto :goto_7

    :cond_b
    iget-object v1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    sub-float/2addr v1, p1

    iget-object p1, p0, Lv1/d;->L:Landroid/text/TextPaint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->descent()F

    move-result p1

    add-float/2addr p1, v1

    goto :goto_6

    :cond_c
    iget-object p1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    int-to-float p1, p1

    :goto_6
    iput p1, p0, Lv1/d;->m:F

    :goto_7
    and-int p1, v0, v3

    if-eq p1, v8, :cond_e

    if-eq p1, v7, :cond_d

    iget-object p1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    int-to-float p1, p1

    goto :goto_9

    :cond_d
    iget-object p1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    int-to-float p1, p1

    goto :goto_8

    :cond_e
    iget-object p1, p0, Lv1/d;->d:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v2, v6

    :goto_8
    sub-float/2addr p1, v2

    :goto_9
    iput p1, p0, Lv1/d;->o:F

    iget-object p1, p0, Lv1/d;->D:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    const/4 p1, 0x0

    iput-object p1, p0, Lv1/d;->D:Landroid/graphics/Bitmap;

    :cond_f
    iget p1, p0, Lv1/d;->c:F

    invoke-virtual {p0, p1}, Lv1/d;->p(F)V

    iget p1, p0, Lv1/d;->c:F

    invoke-virtual {p0, p1}, Lv1/d;->c(F)V

    :cond_10
    return-void
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lv1/d;->l:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lv1/d;->l:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lv1/d;->k(Z)V

    :cond_0
    return-void
.end method

.method public final m(I)V
    .locals 1

    iget v0, p0, Lv1/d;->h:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lv1/d;->h:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lv1/d;->k(Z)V

    :cond_0
    return-void
.end method

.method public final n(Landroid/graphics/Typeface;)Z
    .locals 2

    iget-object v0, p0, Lv1/d;->z:Ly1/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, v0, Ly1/a;->c:Z

    :cond_0
    iget-object v0, p0, Lv1/d;->u:Landroid/graphics/Typeface;

    if-eq v0, p1, :cond_2

    iput-object p1, p0, Lv1/d;->u:Landroid/graphics/Typeface;

    iget-object v0, p0, Lv1/d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {v0, p1}, Ly1/g;->a(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lv1/d;->t:Landroid/graphics/Typeface;

    if-nez p1, :cond_1

    iget-object p1, p0, Lv1/d;->u:Landroid/graphics/Typeface;

    :cond_1
    iput-object p1, p0, Lv1/d;->s:Landroid/graphics/Typeface;

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final o(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Landroidx/core/math/MathUtils;->clamp(FFF)F

    move-result p1

    iget v0, p0, Lv1/d;->c:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lv1/d;->c:F

    invoke-virtual {p0, p1}, Lv1/d;->c(F)V

    :cond_0
    return-void
.end method

.method public final p(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lv1/d;->d(FZ)V

    iget-object p1, p0, Lv1/d;->a:Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    return-void
.end method

.method public final q(Landroid/graphics/Typeface;)V
    .locals 3

    invoke-virtual {p0, p1}, Lv1/d;->n(Landroid/graphics/Typeface;)Z

    move-result v0

    iget-object v1, p0, Lv1/d;->x:Landroid/graphics/Typeface;

    const/4 v2, 0x0

    if-eq v1, p1, :cond_1

    iput-object p1, p0, Lv1/d;->x:Landroid/graphics/Typeface;

    iget-object v1, p0, Lv1/d;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1, p1}, Ly1/g;->a(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lv1/d;->w:Landroid/graphics/Typeface;

    if-nez p1, :cond_0

    iget-object p1, p0, Lv1/d;->x:Landroid/graphics/Typeface;

    :cond_0
    iput-object p1, p0, Lv1/d;->v:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0, v2}, Lv1/d;->k(Z)V

    :cond_3
    return-void
.end method
