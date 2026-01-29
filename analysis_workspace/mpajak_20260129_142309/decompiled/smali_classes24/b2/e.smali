.class public final Lb2/e;
.super Lb2/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb2/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb2/m;FF)V
    .locals 6
    .param p1    # Lb2/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    mul-float v0, p3, p2

    const/high16 v1, 0x43340000    # 180.0f

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {p1, v0, v1, v2}, Lb2/m;->f(FFF)V

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    float-to-double v2, p3

    mul-double v0, v0, v2

    float-to-double p2, p2

    mul-double v0, v0, p2

    double-to-float v0, v0

    const/4 v1, 0x0

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double v4, v4, v2

    mul-double v4, v4, p2

    double-to-float p2, v4

    invoke-virtual {p1, v0, p2}, Lb2/m;->e(FF)V

    return-void
.end method
