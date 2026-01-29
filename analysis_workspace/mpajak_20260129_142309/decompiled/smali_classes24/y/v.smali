.class public final Ly/v;
.super Ljava/lang/Object;

# interfaces
.implements Lp/j;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp/j<",
        "Landroid/os/ParcelFileDescriptor;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ly/m;


# direct methods
.method public constructor <init>(Ly/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/v;->a:Ly/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp/h;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    iget-object p1, p0, Ly/v;->a:Ly/m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/lang/Object;IILp/h;)Lr/w;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    iget-object v0, p0, Ly/v;->a:Ly/m;

    new-instance v1, Ly/s$b;

    iget-object v2, v0, Ly/m;->d:Ljava/util/List;

    iget-object v3, v0, Ly/m;->c:Ls/b;

    invoke-direct {v1, p1, v2, v3}, Ly/s$b;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/List;Ls/b;)V

    sget-object v5, Ly/m;->k:Ly/m$a;

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ly/m;->a(Ly/s;IILp/h;Ly/m$b;)Lr/w;

    move-result-object p1

    return-object p1
.end method
