.class public final Ly/e;
.super Ljava/lang/Object;

# interfaces
.implements Lr/w;
.implements Lr/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr/w<",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lr/s;"
    }
.end annotation


# instance fields
.field public final b:Landroid/graphics/Bitmap;

.field public final c:Ls/d;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ls/d;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ls/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Bitmap must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ly/e;->b:Landroid/graphics/Bitmap;

    const-string p1, "BitmapPool must not be null"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Ly/e;->c:Ls/d;

    return-void
.end method

.method public static c(Landroid/graphics/Bitmap;Ls/d;)Ly/e;
    .locals 1
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ls/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ly/e;

    invoke-direct {v0, p0, p1}, Ly/e;-><init>(Landroid/graphics/Bitmap;Ls/d;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ly/e;->b:Landroid/graphics/Bitmap;

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
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ly/e;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Ly/e;->b:Landroid/graphics/Bitmap;

    invoke-static {v0}, Ll0/k;->d(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public final recycle()V
    .locals 2

    iget-object v0, p0, Ly/e;->c:Ls/d;

    iget-object v1, p0, Ly/e;->b:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Ls/d;->d(Landroid/graphics/Bitmap;)V

    return-void
.end method
