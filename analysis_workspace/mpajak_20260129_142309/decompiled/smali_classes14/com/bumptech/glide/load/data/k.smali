.class public final Lcom/bumptech/glide/load/data/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bumptech/glide/load/data/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/data/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/data/e<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ly/w;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ls/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly/w;

    invoke-direct {v0, p1, p2}, Ly/w;-><init>(Ljava/io/InputStream;Ls/b;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/data/k;->a:Ly/w;

    const/high16 p1, 0x500000

    invoke-virtual {v0, p1}, Ly/w;->mark(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/load/data/k;->c()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/data/k;->a:Ly/w;

    invoke-virtual {v0}, Ly/w;->b()V

    return-void
.end method

.method public final c()Ljava/io/InputStream;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/load/data/k;->a:Ly/w;

    invoke-virtual {v0}, Ly/w;->reset()V

    iget-object v0, p0, Lcom/bumptech/glide/load/data/k;->a:Ly/w;

    return-object v0
.end method
