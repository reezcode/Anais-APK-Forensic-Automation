.class public final Ld0/c;
.super Ljava/lang/Object;

# interfaces
.implements Ld0/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld0/e<",
        "Landroid/graphics/drawable/Drawable;",
        "[B>;"
    }
.end annotation


# instance fields
.field public final a:Ls/d;

.field public final b:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e<",
            "Landroid/graphics/Bitmap;",
            "[B>;"
        }
    .end annotation
.end field

.field public final c:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e<",
            "Lc0/c;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls/d;Ld0/e;Ld0/e;)V
    .locals 0
    .param p1    # Ls/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ld0/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ld0/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/d;",
            "Ld0/e<",
            "Landroid/graphics/Bitmap;",
            "[B>;",
            "Ld0/e<",
            "Lc0/c;",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/c;->a:Ls/d;

    iput-object p2, p0, Ld0/c;->b:Ld0/e;

    iput-object p3, p0, Ld0/c;->c:Ld0/e;

    return-void
.end method


# virtual methods
.method public final a(Lr/w;Lp/h;)Lr/w;
    .locals 2
    .param p1    # Lr/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/w<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Lp/h;",
            ")",
            "Lr/w<",
            "[B>;"
        }
    .end annotation

    invoke-interface {p1}, Lr/w;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, Ld0/c;->b:Ld0/e;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Ld0/c;->a:Ls/d;

    invoke-static {v0, v1}, Ly/e;->c(Landroid/graphics/Bitmap;Ls/d;)Ly/e;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Ld0/e;->a(Lr/w;Lp/h;)Lr/w;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lc0/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld0/c;->c:Ld0/e;

    invoke-interface {v0, p1, p2}, Ld0/e;->a(Lr/w;Lp/h;)Lr/w;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
