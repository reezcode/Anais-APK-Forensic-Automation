.class public final Lc0/f;
.super Ljava/lang/Object;

# interfaces
.implements Lp/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp/l<",
        "Lc0/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lp/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lc0/f;->b:Lp/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 1
    .param p1    # Ljava/security/MessageDigest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lc0/f;->b:Lp/l;

    invoke-interface {v0, p1}, Lp/f;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public final b(Landroid/content/Context;Lr/w;II)Lr/w;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lr/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lr/w<",
            "Lc0/c;",
            ">;II)",
            "Lr/w<",
            "Lc0/c;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Lr/w;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/c;

    invoke-static {p1}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v1

    iget-object v1, v1, Lcom/bumptech/glide/b;->b:Ls/d;

    invoke-virtual {v0}, Lc0/c;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Ly/e;

    invoke-direct {v3, v2, v1}, Ly/e;-><init>(Landroid/graphics/Bitmap;Ls/d;)V

    iget-object v1, p0, Lc0/f;->b:Lp/l;

    invoke-interface {v1, p1, v3, p3, p4}, Lp/l;->b(Landroid/content/Context;Lr/w;II)Lr/w;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {v3}, Ly/e;->recycle()V

    :cond_0
    invoke-interface {p1}, Lr/w;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, p0, Lc0/f;->b:Lp/l;

    iget-object p4, v0, Lc0/c;->b:Lc0/c$a;

    iget-object p4, p4, Lc0/c$a;->a:Lc0/g;

    invoke-virtual {p4, p3, p1}, Lc0/g;->c(Lp/l;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lc0/f;

    if-eqz v0, :cond_0

    check-cast p1, Lc0/f;

    iget-object v0, p0, Lc0/f;->b:Lp/l;

    iget-object p1, p1, Lc0/f;->b:Lp/l;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lc0/f;->b:Lp/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
