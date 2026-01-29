.class public final Ls1/a;
.super Ljava/lang/Object;


# static fields
.field public static final f:I


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4014666666666667L    # 5.1000000000000005

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v1, v0

    sput v1, Ls1/a;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f030170

    invoke-static {p1, v0}, Ly1/b;->a(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v2, v0, Landroid/util/TypedValue;->type:I

    const/16 v3, 0x12

    if-ne v2, v3, :cond_0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v2, 0x7f03016f

    invoke-static {p1, v2, v1}, Lp1/a;->a(Landroid/content/Context;II)I

    move-result v2

    const v3, 0x7f03016e

    invoke-static {p1, v3, v1}, Lp1/a;->a(Landroid/content/Context;II)I

    move-result v3

    const v4, 0x7f030101

    invoke-static {p1, v4, v1}, Lp1/a;->a(Landroid/content/Context;II)I

    move-result v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Ls1/a;->a:Z

    iput v2, p0, Ls1/a;->b:I

    iput v3, p0, Ls1/a;->c:I

    iput v1, p0, Ls1/a;->d:I

    iput p1, p0, Ls1/a;->e:F

    return-void
.end method
