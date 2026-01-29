.class public abstract Li0/c;
.super Ljava/lang/Object;

# interfaces
.implements Li0/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Li0/h<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public d:Lh0/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    invoke-static {v0, v0}, Ll0/k;->j(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iput v0, p0, Li0/c;->b:I

    iput v0, p0, Li0/c;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Li0/g;)V
    .locals 2
    .param p1    # Li0/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Li0/c;->b:I

    iget v1, p0, Li0/c;->c:I

    invoke-interface {p1, v0, v1}, Li0/g;->b(II)V

    return-void
.end method

.method public final b(Li0/g;)V
    .locals 0
    .param p1    # Li0/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e(Lh0/c;)V
    .locals 0
    .param p1    # Lh0/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Li0/c;->d:Lh0/c;

    return-void
.end method

.method public final f(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final g()Lh0/c;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Li0/c;->d:Lh0/c;

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method

.method public final onStart()V
    .locals 0

    return-void
.end method
