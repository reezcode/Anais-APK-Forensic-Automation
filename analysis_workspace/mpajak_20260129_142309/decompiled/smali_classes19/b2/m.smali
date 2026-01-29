.class public final Lb2/m;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/m$d;,
        Lb2/m$e;,
        Lb2/m$f;,
        Lb2/m$b;,
        Lb2/m$c;,
        Lb2/m$g;
    }
.end annotation


# instance fields
.field public a:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public b:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public c:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public d:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public e:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public f:F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb2/m$f;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb2/m$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb2/m;->g:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb2/m;->h:Ljava/util/ArrayList;

    const/high16 v0, 0x43870000    # 270.0f

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lb2/m;->f(FFF)V

    return-void
.end method


# virtual methods
.method public final a(FFFFFF)V
    .locals 4

    new-instance v0, Lb2/m$d;

    invoke-direct {v0, p1, p2, p3, p4}, Lb2/m$d;-><init>(FFFF)V

    iput p5, v0, Lb2/m$d;->f:F

    iput p6, v0, Lb2/m$d;->g:F

    iget-object v1, p0, Lb2/m;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lb2/m$b;

    invoke-direct {v1, v0}, Lb2/m$b;-><init>(Lb2/m$d;)V

    add-float v0, p5, p6

    const/4 v2, 0x0

    cmpg-float p6, p6, v2

    if-gez p6, :cond_0

    const/4 p6, 0x1

    goto :goto_0

    :cond_0
    const/4 p6, 0x0

    :goto_0
    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x43340000    # 180.0f

    if-eqz p6, :cond_1

    add-float/2addr p5, v3

    rem-float/2addr p5, v2

    :cond_1
    if-eqz p6, :cond_2

    add-float/2addr v3, v0

    rem-float/2addr v3, v2

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    invoke-virtual {p0, p5}, Lb2/m;->b(F)V

    iget-object p5, p0, Lb2/m;->h:Ljava/util/ArrayList;

    invoke-virtual {p5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v3, p0, Lb2/m;->e:F

    add-float p5, p1, p3

    const/high16 p6, 0x3f000000    # 0.5f

    mul-float p5, p5, p6

    sub-float/2addr p3, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p3, p1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float p3, p3, v2

    add-float/2addr p3, p5

    iput p3, p0, Lb2/m;->c:F

    add-float p3, p2, p4

    mul-float p3, p3, p6

    sub-float/2addr p4, p2

    div-float/2addr p4, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p1

    double-to-float p1, p1

    mul-float p4, p4, p1

    add-float/2addr p4, p3

    iput p4, p0, Lb2/m;->d:F

    return-void
.end method

.method public final b(F)V
    .locals 4

    iget v0, p0, Lb2/m;->e:F

    cmpl-float v1, v0, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    sub-float v0, p1, v0

    const/high16 v1, 0x43b40000    # 360.0f

    add-float/2addr v0, v1

    rem-float/2addr v0, v1

    const/high16 v1, 0x43340000    # 180.0f

    cmpl-float v1, v0, v1

    if-lez v1, :cond_1

    return-void

    :cond_1
    new-instance v1, Lb2/m$d;

    iget v2, p0, Lb2/m;->c:F

    iget v3, p0, Lb2/m;->d:F

    invoke-direct {v1, v2, v3, v2, v3}, Lb2/m$d;-><init>(FFFF)V

    iget v2, p0, Lb2/m;->e:F

    iput v2, v1, Lb2/m$d;->f:F

    iput v0, v1, Lb2/m$d;->g:F

    iget-object v0, p0, Lb2/m;->h:Ljava/util/ArrayList;

    new-instance v2, Lb2/m$b;

    invoke-direct {v2, v1}, Lb2/m$b;-><init>(Lb2/m$d;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput p1, p0, Lb2/m;->e:F

    return-void
.end method

.method public final c(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
    .locals 3

    iget-object v0, p0, Lb2/m;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb2/m;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb2/m$f;

    invoke-virtual {v2, p1, p2}, Lb2/m$f;->a(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Landroid/graphics/Matrix;)Lb2/m$g;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget v0, p0, Lb2/m;->f:F

    invoke-virtual {p0, v0}, Lb2/m;->b(F)V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    new-instance p1, Ljava/util/ArrayList;

    iget-object v1, p0, Lb2/m;->h:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Lb2/m$a;

    invoke-direct {v1, p1, v0}, Lb2/m$a;-><init>(Ljava/util/List;Landroid/graphics/Matrix;)V

    return-object v1
.end method

.method public final e(FF)V
    .locals 4

    new-instance v0, Lb2/m$e;

    invoke-direct {v0}, Lb2/m$e;-><init>()V

    iput p1, v0, Lb2/m$e;->b:F

    iput p2, v0, Lb2/m$e;->c:F

    iget-object v1, p0, Lb2/m;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lb2/m$c;

    iget v2, p0, Lb2/m;->c:F

    iget v3, p0, Lb2/m;->d:F

    invoke-direct {v1, v0, v2, v3}, Lb2/m$c;-><init>(Lb2/m$e;FF)V

    invoke-virtual {v1}, Lb2/m$c;->b()F

    move-result v0

    const/high16 v2, 0x43870000    # 270.0f

    add-float/2addr v0, v2

    invoke-virtual {v1}, Lb2/m$c;->b()F

    move-result v3

    add-float/2addr v3, v2

    invoke-virtual {p0, v0}, Lb2/m;->b(F)V

    iget-object v0, p0, Lb2/m;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v3, p0, Lb2/m;->e:F

    iput p1, p0, Lb2/m;->c:F

    iput p2, p0, Lb2/m;->d:F

    return-void
.end method

.method public final f(FFF)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb2/m;->a:F

    iput p1, p0, Lb2/m;->b:F

    iput v0, p0, Lb2/m;->c:F

    iput p1, p0, Lb2/m;->d:F

    iput p2, p0, Lb2/m;->e:F

    add-float/2addr p2, p3

    const/high16 p1, 0x43b40000    # 360.0f

    rem-float/2addr p2, p1

    iput p2, p0, Lb2/m;->f:F

    iget-object p1, p0, Lb2/m;->g:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lb2/m;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
