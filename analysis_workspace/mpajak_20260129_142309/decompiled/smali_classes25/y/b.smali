.class public final Ly/b;
.super Ljava/lang/Object;

# interfaces
.implements Lp/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp/k<",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ls/d;

.field public final b:Lp/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/k<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls/d;Lp/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/d;",
            "Lp/k<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/b;->a:Ls/d;

    iput-object p2, p0, Ly/b;->b:Lp/k;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/io/File;Lp/h;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lr/w;

    iget-object v0, p0, Ly/b;->b:Lp/k;

    new-instance v1, Ly/e;

    invoke-interface {p1}, Lr/w;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, Ly/b;->a:Ls/d;

    invoke-direct {v1, p1, v2}, Ly/e;-><init>(Landroid/graphics/Bitmap;Ls/d;)V

    invoke-interface {v0, v1, p2, p3}, Lp/d;->a(Ljava/lang/Object;Ljava/io/File;Lp/h;)Z

    move-result p1

    return p1
.end method

.method public final b(Lp/h;)Lp/c;
    .locals 1
    .param p1    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ly/b;->b:Lp/k;

    invoke-interface {v0, p1}, Lp/k;->b(Lp/h;)Lp/c;

    move-result-object p1

    return-object p1
.end method
