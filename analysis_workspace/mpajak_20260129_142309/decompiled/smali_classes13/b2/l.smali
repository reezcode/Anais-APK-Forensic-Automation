.class public final Lb2/l;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/l$b;,
        Lb2/l$a;
    }
.end annotation


# instance fields
.field public final a:[Lb2/m;

.field public final b:[Landroid/graphics/Matrix;

.field public final c:[Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/PointF;

.field public final e:Landroid/graphics/Path;

.field public final f:Landroid/graphics/Path;

.field public final g:Lb2/m;

.field public final h:[F

.field public final i:[F

.field public final j:Landroid/graphics/Path;

.field public final k:Landroid/graphics/Path;

.field public l:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Lb2/m;

    iput-object v1, p0, Lb2/l;->a:[Lb2/m;

    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, Lb2/l;->b:[Landroid/graphics/Matrix;

    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, Lb2/l;->c:[Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lb2/l;->d:Landroid/graphics/PointF;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lb2/l;->e:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lb2/l;->f:Landroid/graphics/Path;

    new-instance v1, Lb2/m;

    invoke-direct {v1}, Lb2/m;-><init>()V

    iput-object v1, p0, Lb2/l;->g:Lb2/m;

    const/4 v1, 0x2

    new-array v2, v1, [F

    iput-object v2, p0, Lb2/l;->h:[F

    new-array v1, v1, [F

    iput-object v1, p0, Lb2/l;->i:[F

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lb2/l;->j:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lb2/l;->k:Landroid/graphics/Path;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lb2/l;->l:Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb2/l;->a:[Lb2/m;

    new-instance v3, Lb2/m;

    invoke-direct {v3}, Lb2/m;-><init>()V

    aput-object v3, v2, v1

    iget-object v2, p0, Lb2/l;->b:[Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    iget-object v2, p0, Lb2/l;->c:[Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lb2/k;FLandroid/graphics/RectF;Lb2/l$b;Landroid/graphics/Path;)V
    .locals 17
    .param p5    # Landroid/graphics/Path;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Path;->rewind()V

    iget-object v5, v0, Lb2/l;->e:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    iget-object v5, v0, Lb2/l;->f:Landroid/graphics/Path;

    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    iget-object v5, v0, Lb2/l;->f:Landroid/graphics/Path;

    sget-object v6, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v5, v3, v6}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x4

    const/4 v10, 0x3

    if-ge v6, v9, :cond_9

    if-eq v6, v8, :cond_2

    if-eq v6, v7, :cond_1

    if-eq v6, v10, :cond_0

    iget-object v9, v1, Lb2/k;->f:Lb2/c;

    goto :goto_1

    :cond_0
    iget-object v9, v1, Lb2/k;->e:Lb2/c;

    goto :goto_1

    :cond_1
    iget-object v9, v1, Lb2/k;->h:Lb2/c;

    goto :goto_1

    :cond_2
    iget-object v9, v1, Lb2/k;->g:Lb2/c;

    :goto_1
    if-eq v6, v8, :cond_5

    if-eq v6, v7, :cond_4

    if-eq v6, v10, :cond_3

    iget-object v11, v1, Lb2/k;->b:Lb2/d;

    goto :goto_2

    :cond_3
    iget-object v11, v1, Lb2/k;->a:Lb2/d;

    goto :goto_2

    :cond_4
    iget-object v11, v1, Lb2/k;->d:Lb2/d;

    goto :goto_2

    :cond_5
    iget-object v11, v1, Lb2/k;->c:Lb2/d;

    :goto_2
    iget-object v12, v0, Lb2/l;->a:[Lb2/m;

    aget-object v12, v12, v6

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v9, v3}, Lb2/c;->a(Landroid/graphics/RectF;)F

    move-result v9

    invoke-virtual {v11, v12, v2, v9}, Lb2/d;->a(Lb2/m;FF)V

    add-int/lit8 v9, v6, 0x1

    mul-int/lit8 v11, v9, 0x5a

    int-to-float v11, v11

    iget-object v12, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    invoke-virtual {v12}, Landroid/graphics/Matrix;->reset()V

    iget-object v12, v0, Lb2/l;->d:Landroid/graphics/PointF;

    if-eq v6, v8, :cond_8

    if-eq v6, v7, :cond_7

    if-eq v6, v10, :cond_6

    iget v7, v3, Landroid/graphics/RectF;->right:F

    goto :goto_3

    :cond_6
    iget v7, v3, Landroid/graphics/RectF;->left:F

    :goto_3
    iget v10, v3, Landroid/graphics/RectF;->top:F

    goto :goto_5

    :cond_7
    iget v7, v3, Landroid/graphics/RectF;->left:F

    goto :goto_4

    :cond_8
    iget v7, v3, Landroid/graphics/RectF;->right:F

    :goto_4
    iget v10, v3, Landroid/graphics/RectF;->bottom:F

    :goto_5
    invoke-virtual {v12, v7, v10}, Landroid/graphics/PointF;->set(FF)V

    iget-object v7, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v7, v7, v6

    iget-object v10, v0, Lb2/l;->d:Landroid/graphics/PointF;

    iget v12, v10, Landroid/graphics/PointF;->x:F

    iget v10, v10, Landroid/graphics/PointF;->y:F

    invoke-virtual {v7, v12, v10}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object v7, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v7, v7, v6

    invoke-virtual {v7, v11}, Landroid/graphics/Matrix;->preRotate(F)Z

    iget-object v7, v0, Lb2/l;->h:[F

    iget-object v10, v0, Lb2/l;->a:[Lb2/m;

    aget-object v12, v10, v6

    iget v12, v12, Lb2/m;->c:F

    aput v12, v7, v5

    aget-object v10, v10, v6

    iget v10, v10, Lb2/m;->d:F

    aput v10, v7, v8

    iget-object v10, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v10, v10, v6

    invoke-virtual {v10, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v7, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v7, v7, v6

    invoke-virtual {v7}, Landroid/graphics/Matrix;->reset()V

    iget-object v7, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v7, v7, v6

    iget-object v10, v0, Lb2/l;->h:[F

    aget v12, v10, v5

    aget v8, v10, v8

    invoke-virtual {v7, v12, v8}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object v7, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v6, v7, v6

    invoke-virtual {v6, v11}, Landroid/graphics/Matrix;->preRotate(F)Z

    move v6, v9

    goto/16 :goto_0

    :cond_9
    const/4 v6, 0x0

    :goto_6
    if-ge v6, v9, :cond_13

    iget-object v11, v0, Lb2/l;->h:[F

    iget-object v12, v0, Lb2/l;->a:[Lb2/m;

    aget-object v13, v12, v6

    iget v13, v13, Lb2/m;->a:F

    aput v13, v11, v5

    aget-object v12, v12, v6

    iget v12, v12, Lb2/m;->b:F

    aput v12, v11, v8

    iget-object v12, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    invoke-virtual {v12, v11}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v11, v0, Lb2/l;->h:[F

    if-nez v6, :cond_a

    aget v12, v11, v5

    aget v11, v11, v8

    invoke-virtual {v4, v12, v11}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_7

    :cond_a
    aget v12, v11, v5

    aget v11, v11, v8

    invoke-virtual {v4, v12, v11}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_7
    iget-object v11, v0, Lb2/l;->a:[Lb2/m;

    aget-object v11, v11, v6

    iget-object v12, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    invoke-virtual {v11, v12, v4}, Lb2/m;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    if-eqz p4, :cond_b

    iget-object v11, v0, Lb2/l;->a:[Lb2/m;

    aget-object v11, v11, v6

    iget-object v12, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    move-object/from16 v13, p4

    check-cast v13, Lb2/g$a;

    iget-object v14, v13, Lb2/g$a;->a:Lb2/g;

    iget-object v14, v14, Lb2/g;->e:Ljava/util/BitSet;

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14, v6, v5}, Ljava/util/BitSet;->set(IZ)V

    iget-object v13, v13, Lb2/g$a;->a:Lb2/g;

    iget-object v13, v13, Lb2/g;->c:[Lb2/m$g;

    invoke-virtual {v11, v12}, Lb2/m;->d(Landroid/graphics/Matrix;)Lb2/m$g;

    move-result-object v11

    aput-object v11, v13, v6

    :cond_b
    add-int/lit8 v11, v6, 0x1

    rem-int/lit8 v12, v11, 0x4

    iget-object v13, v0, Lb2/l;->h:[F

    iget-object v14, v0, Lb2/l;->a:[Lb2/m;

    aget-object v15, v14, v6

    iget v15, v15, Lb2/m;->c:F

    aput v15, v13, v5

    aget-object v14, v14, v6

    iget v14, v14, Lb2/m;->d:F

    aput v14, v13, v8

    iget-object v14, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v14, v14, v6

    invoke-virtual {v14, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v13, v0, Lb2/l;->i:[F

    iget-object v14, v0, Lb2/l;->a:[Lb2/m;

    aget-object v15, v14, v12

    iget v15, v15, Lb2/m;->a:F

    aput v15, v13, v5

    aget-object v14, v14, v12

    iget v14, v14, Lb2/m;->b:F

    aput v14, v13, v8

    iget-object v14, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v14, v14, v12

    invoke-virtual {v14, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v13, v0, Lb2/l;->h:[F

    aget v14, v13, v5

    iget-object v15, v0, Lb2/l;->i:[F

    aget v16, v15, v5

    sub-float v14, v14, v16

    float-to-double v9, v14

    aget v13, v13, v8

    aget v14, v15, v8

    sub-float/2addr v13, v14

    float-to-double v13, v13

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v9

    double-to-float v9, v9

    const v10, 0x3a83126f    # 0.001f

    sub-float/2addr v9, v10

    const/4 v10, 0x0

    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v9

    iget-object v13, v0, Lb2/l;->h:[F

    iget-object v14, v0, Lb2/l;->a:[Lb2/m;

    aget-object v15, v14, v6

    iget v15, v15, Lb2/m;->c:F

    aput v15, v13, v5

    aget-object v14, v14, v6

    iget v14, v14, Lb2/m;->d:F

    aput v14, v13, v8

    iget-object v14, v0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object v14, v14, v6

    invoke-virtual {v14, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    if-eq v6, v8, :cond_c

    const/4 v13, 0x3

    if-eq v6, v13, :cond_c

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerY()F

    move-result v13

    iget-object v14, v0, Lb2/l;->h:[F

    aget v14, v14, v8

    goto :goto_8

    :cond_c
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/RectF;->centerX()F

    move-result v13

    iget-object v14, v0, Lb2/l;->h:[F

    aget v14, v14, v5

    :goto_8
    sub-float/2addr v13, v14

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    iget-object v14, v0, Lb2/l;->g:Lb2/m;

    const/high16 v15, 0x43870000    # 270.0f

    invoke-virtual {v14, v10, v15, v10}, Lb2/m;->f(FFF)V

    if-eq v6, v8, :cond_f

    if-eq v6, v7, :cond_e

    const/4 v10, 0x3

    if-eq v6, v10, :cond_d

    iget-object v14, v1, Lb2/k;->j:Lb2/f;

    goto :goto_9

    :cond_d
    iget-object v14, v1, Lb2/k;->i:Lb2/f;

    goto :goto_9

    :cond_e
    const/4 v10, 0x3

    iget-object v14, v1, Lb2/k;->l:Lb2/f;

    goto :goto_9

    :cond_f
    const/4 v10, 0x3

    iget-object v14, v1, Lb2/k;->k:Lb2/f;

    :goto_9
    iget-object v15, v0, Lb2/l;->g:Lb2/m;

    invoke-virtual {v14, v9, v13, v2, v15}, Lb2/f;->a(FFFLb2/m;)V

    iget-object v9, v0, Lb2/l;->j:Landroid/graphics/Path;

    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    iget-object v9, v0, Lb2/l;->g:Lb2/m;

    iget-object v13, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v13, v13, v6

    iget-object v14, v0, Lb2/l;->j:Landroid/graphics/Path;

    invoke-virtual {v9, v13, v14}, Lb2/m;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    iget-boolean v9, v0, Lb2/l;->l:Z

    if-eqz v9, :cond_11

    iget-object v9, v0, Lb2/l;->j:Landroid/graphics/Path;

    invoke-virtual {v0, v9, v6}, Lb2/l;->b(Landroid/graphics/Path;I)Z

    move-result v9

    if-nez v9, :cond_10

    iget-object v9, v0, Lb2/l;->j:Landroid/graphics/Path;

    invoke-virtual {v0, v9, v12}, Lb2/l;->b(Landroid/graphics/Path;I)Z

    move-result v9

    if-eqz v9, :cond_11

    :cond_10
    iget-object v9, v0, Lb2/l;->j:Landroid/graphics/Path;

    iget-object v12, v0, Lb2/l;->f:Landroid/graphics/Path;

    sget-object v13, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    invoke-virtual {v9, v9, v12, v13}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    iget-object v9, v0, Lb2/l;->h:[F

    iget-object v12, v0, Lb2/l;->g:Lb2/m;

    iget v13, v12, Lb2/m;->a:F

    aput v13, v9, v5

    iget v12, v12, Lb2/m;->b:F

    aput v12, v9, v8

    iget-object v12, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    invoke-virtual {v12, v9}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v9, v0, Lb2/l;->e:Landroid/graphics/Path;

    iget-object v12, v0, Lb2/l;->h:[F

    aget v13, v12, v5

    aget v12, v12, v8

    invoke-virtual {v9, v13, v12}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v9, v0, Lb2/l;->g:Lb2/m;

    iget-object v12, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    iget-object v13, v0, Lb2/l;->e:Landroid/graphics/Path;

    goto :goto_a

    :cond_11
    iget-object v9, v0, Lb2/l;->g:Lb2/m;

    iget-object v12, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    move-object v13, v4

    :goto_a
    invoke-virtual {v9, v12, v13}, Lb2/m;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    if-eqz p4, :cond_12

    iget-object v9, v0, Lb2/l;->g:Lb2/m;

    iget-object v12, v0, Lb2/l;->c:[Landroid/graphics/Matrix;

    aget-object v12, v12, v6

    move-object/from16 v13, p4

    check-cast v13, Lb2/g$a;

    iget-object v14, v13, Lb2/g$a;->a:Lb2/g;

    iget-object v14, v14, Lb2/g;->e:Ljava/util/BitSet;

    add-int/lit8 v15, v6, 0x4

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14, v15, v5}, Ljava/util/BitSet;->set(IZ)V

    iget-object v13, v13, Lb2/g$a;->a:Lb2/g;

    iget-object v13, v13, Lb2/g;->d:[Lb2/m$g;

    invoke-virtual {v9, v12}, Lb2/m;->d(Landroid/graphics/Matrix;)Lb2/m$g;

    move-result-object v9

    aput-object v9, v13, v6

    :cond_12
    move v6, v11

    const/4 v9, 0x4

    goto/16 :goto_6

    :cond_13
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Path;->close()V

    iget-object v1, v0, Lb2/l;->e:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, v0, Lb2/l;->e:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_14

    iget-object v1, v0, Lb2/l;->e:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    invoke-virtual {v4, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    :cond_14
    return-void
.end method

.method public final b(Landroid/graphics/Path;I)Z
    .locals 3
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x13
    .end annotation

    iget-object v0, p0, Lb2/l;->k:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lb2/l;->a:[Lb2/m;

    aget-object v0, v0, p2

    iget-object v1, p0, Lb2/l;->b:[Landroid/graphics/Matrix;

    aget-object p2, v1, p2

    iget-object v1, p0, Lb2/l;->k:Landroid/graphics/Path;

    invoke-virtual {v0, p2, v1}, Lb2/m;->c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-object v1, p0, Lb2/l;->k:Landroid/graphics/Path;

    invoke-virtual {v1, p2, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget-object v1, p0, Lb2/l;->k:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method
