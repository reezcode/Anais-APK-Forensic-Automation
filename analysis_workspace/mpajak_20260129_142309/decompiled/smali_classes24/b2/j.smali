.class public final Lb2/j;
.super Lb2/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb2/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb2/m;FF)V
    .locals 7
    .param p1    # Lb2/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    mul-float v0, p3, p2

    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {p1, v0, v1, v2}, Lb2/m;->f(FFF)V

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p3, p3, v0

    mul-float v4, p3, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v5, 0x43340000    # 180.0f

    const/high16 v6, 0x42b40000    # 90.0f

    move-object v0, p1

    move v3, v4

    invoke-virtual/range {v0 .. v6}, Lb2/m;->a(FFFFFF)V

    return-void
.end method
